package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpartesproduccionins_impl extends GXDataArea
{
   public webpartesproduccionins_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webpartesproduccionins_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpartesproduccionins_impl.class ));
   }

   public webpartesproduccionins_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisprof = new HTMLChoice();
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
               AV6Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
               AV5HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
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
      paHQ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startHQ2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webpartesproduccionins", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6Maqcod)),GXutil.URLEncode(GXutil.formatDateParm(AV5HisProFec))}, new String[] {"EmprCod","Maqcod","HisProFec"}) +"\">") ;
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRUOPECOD_DATA", AV33GruOpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRUOPECOD_DATA", AV33GruOpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARCOD_DATA", AV31ParCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARCOD_DATA", AV31ParCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFAS", GXutil.ltrim( localUtil.ntoc( AV29Barfas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASEST", GXutil.ltrim( localUtil.ntoc( AV30BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV37errmensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR_HISPROLIN", GXutil.ltrim( localUtil.ntoc( AV38Var_Hisprolin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISHHMAQ", GXutil.ltrim( localUtil.ntoc( AV22HisHhmaq, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISHHINI", GXutil.ltrim( localUtil.ntoc( AV23HisHhIni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV27Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV24Usurcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Cls", GXutil.rtrim( Combo_gruopecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Selectedvalue_set", GXutil.rtrim( Combo_gruopecod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Emptyitem", GXutil.booltostr( Combo_gruopecod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Cls", GXutil.rtrim( Combo_parcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Selectedvalue_set", GXutil.rtrim( Combo_parcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Emptyitemtext", GXutil.rtrim( Combo_parcod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARCOD_Selectedvalue_get", GXutil.rtrim( Combo_parcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRUOPECOD_Selectedvalue_get", GXutil.rtrim( Combo_gruopecod_Selectedvalue_get));
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
         weHQ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtHQ2( ) ;
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
      return formatLink("app.webpartesproduccionins", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6Maqcod)),GXutil.URLEncode(GXutil.formatDateParm(AV5HisProFec))}, new String[] {"EmprCod","Maqcod","HisProFec"})  ;
   }

   public String getPgmname( )
   {
      return "WebPartesProduccionINS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Agregar Registro Parte Produccion", "") ;
   }

   public void wbHQ0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV6Maqcod), GXutil.rtrim( localUtil.format( AV6Maqcod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprofec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprofec_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavHisprofec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprofec_Internalname, localUtil.format(AV5HisProFec, "99/99/99"), localUtil.format( AV5HisProFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprofec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprofec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprofec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprofec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccionINS.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprolin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprolin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprolin_Internalname, GXutil.ltrim( localUtil.ntoc( AV7HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisprolin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7HisProLin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7HisProLin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprolin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprolin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV10BarCodPar), GXutil.rtrim( localUtil.format( AV10BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompthdr_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompthdr_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompthdr_gximage+"_Class") ;
         StyleString = "" ;
         AV34PromptHDR_IsBlob = (boolean)(((GXutil.strcmp("", AV34PromptHDR)==0)&&(GXutil.strcmp("", AV45Prompthdr_GXI)==0))||!(GXutil.strcmp("", AV34PromptHDR)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV34PromptHDR)==0) ? AV45Prompthdr_GXI : httpContext.getResourceRelative(AV34PromptHDR)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompthdr_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompthdr_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPTHDR.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV34PromptHDR_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPartesProduccionINS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedgruopecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_gruopecod_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblockcombo_gruopecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_gruopecod.setProperty("Caption", Combo_gruopecod_Caption);
         ucCombo_gruopecod.setProperty("Cls", Combo_gruopecod_Cls);
         ucCombo_gruopecod.setProperty("EmptyItem", Combo_gruopecod_Emptyitem);
         ucCombo_gruopecod.setProperty("DropDownOptionsData", AV33GruOpeCod_Data);
         ucCombo_gruopecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_gruopecod_Internalname, "COMBO_GRUOPECODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarordlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarordlin_Internalname, httpContext.getMessage( "Orden", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarordlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarordlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarordlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptorden_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptorden_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptorden_gximage+"_Class") ;
         StyleString = "" ;
         AV35PromptOrden_IsBlob = (boolean)(((GXutil.strcmp("", AV35PromptOrden)==0)&&(GXutil.strcmp("", AV46Promptorden_GXI)==0))||!(GXutil.strcmp("", AV35PromptOrden)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV35PromptOrden)==0) ? AV46Promptorden_GXI : httpContext.getResourceRelative(AV35PromptOrden)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPromptorden_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPromptorden_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPTORDEN.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV35PromptOrden_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFase_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFase_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFase_Internalname, GXutil.rtrim( AV13Fase), GXutil.rtrim( localUtil.format( AV13Fase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFase_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFase_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPartesProduccionINS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV14HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV14HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccionINS.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV15HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV15HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccionINS.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHisprof.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisprof.getInternalname(), httpContext.getMessage( "Fin?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisprof, cmbavHisprof.getInternalname(), GXutil.rtrim( AV16HisProF), 1, cmbavHisprof.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavHisprof.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "", true, (byte)(0), "HLP_WebPartesProduccionINS.htm");
         cmbavHisprof.setValue( GXutil.rtrim( AV16HisProF) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisprof.getInternalname(), "Values", cmbavHisprof.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprotur_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprotur_Internalname, httpContext.getMessage( "T", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprotur_Internalname, GXutil.ltrim( localUtil.ntoc( AV17HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisprotur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17HisProTur), "9") : localUtil.format( DecimalUtil.doubleToDec(AV17HisProTur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprotur_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprotur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprokgr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprokgr_Internalname, httpContext.getMessage( "Kgs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprokgr_Internalname, GXutil.ltrim( localUtil.ntoc( AV18HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisprokgr_Enabled!=0) ? localUtil.format( AV18HisProKgr, "ZZZZZ9.99") : localUtil.format( AV18HisProKgr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprokgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprokgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHispromtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHispromtr_Internalname, httpContext.getMessage( "Mts", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHispromtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV19HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHispromtr_Enabled!=0) ? localUtil.format( AV19HisProMtr, "ZZZZZ9.99") : localUtil.format( AV19HisProMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHispromtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHispromtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHispronpzs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHispronpzs_Internalname, httpContext.getMessage( "Pcs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHispronpzs_Internalname, GXutil.ltrim( localUtil.ntoc( AV20HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHispronpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20HisProNpzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20HisProNpzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHispronpzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHispronpzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parcod_Internalname, httpContext.getMessage( "Paro", ""), "", "", lblTextblockcombo_parcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_parcod.setProperty("Caption", Combo_parcod_Caption);
         ucCombo_parcod.setProperty("Cls", Combo_parcod_Cls);
         ucCombo_parcod.setProperty("EmptyItemText", Combo_parcod_Emptyitemtext);
         ucCombo_parcod.setProperty("DropDownOptionsData", AV31ParCod_Data);
         ucCombo_parcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parcod_Internalname, "COMBO_PARCODContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPartesProduccionINS.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPartesProduccionINS.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGruopecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV11GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11GruOpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGruopecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavGruopecod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV21ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21ParCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavParcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavParcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccionINS.htm");
         wb_table1_135_HQ2( true) ;
      }
      else
      {
         wb_table1_135_HQ2( false) ;
      }
      return  ;
   }

   public void wb_table1_135_HQ2e( boolean wbgen )
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

   public void startHQ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Agregar Registro Parte Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupHQ0( ) ;
   }

   public void wsHQ2( )
   {
      startHQ2( ) ;
      evtHQ2( ) ;
   }

   public void evtHQ2( )
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
                           e11HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e13HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e14HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARORDLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e17HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPTHDR.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18HQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPTORDEN.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19HQ2 ();
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

   public void weHQ2( )
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

   public void paHQ2( )
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
            GX_FocusControl = edtavHisprolin_Internalname ;
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
      if ( cmbavHisprof.getItemCount() > 0 )
      {
         AV16HisProF = cmbavHisprof.getValidValue(AV16HisProF) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16HisProF", AV16HisProF);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisprof.setValue( GXutil.rtrim( AV16HisProF) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisprof.getInternalname(), "Values", cmbavHisprof.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfHQ2( ) ;
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
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavHisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Enabled), 5, 0), true);
      edtavFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFase_Enabled), 5, 0), true);
   }

   public void rfHQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00HQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e17HQ2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbHQ0( ) ;
      }
   }

   public void send_integrity_lvl_hashesHQ2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavHisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Enabled), 5, 0), true);
      edtavFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFase_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupHQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12HQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGRUOPECOD_DATA"), AV33GruOpeCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARCOD_DATA"), AV31ParCod_Data);
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
         Combo_gruopecod_Cls = httpContext.cgiGet( "COMBO_GRUOPECOD_Cls") ;
         Combo_gruopecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_GRUOPECOD_Selectedvalue_set") ;
         Combo_gruopecod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRUOPECOD_Emptyitem")) ;
         Combo_parcod_Cls = httpContext.cgiGet( "COMBO_PARCOD_Cls") ;
         Combo_parcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARCOD_Selectedvalue_set") ;
         Combo_parcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PARCOD_Emptyitemtext") ;
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
         AV6Maqcod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
         AV5HisProFec = localUtil.ctod( httpContext.cgiGet( edtavHisprofec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisprolin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisprolin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROLIN");
            GX_FocusControl = edtavHisprolin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7HisProLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HisProLin), 8, 0));
         }
         else
         {
            AV7HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtavHisprolin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HisProLin), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         }
         else
         {
            AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         }
         else
         {
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         }
         AV10BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         AV34PromptHDR = httpContext.cgiGet( imgavPrompthdr_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARORDLIN");
            GX_FocusControl = edtavBarordlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarOrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOrdLin), 4, 0));
         }
         else
         {
            AV12BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOrdLin), 4, 0));
         }
         AV35PromptOrden = httpContext.cgiGet( imgavPromptorden_Internalname) ;
         AV13Fase = httpContext.cgiGet( edtavFase_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Fase", AV13Fase);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV14HisProDTI", localUtil.ttoc( AV14HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV14HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14HisProDTI", localUtil.ttoc( AV14HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV15HisProDTF", localUtil.ttoc( AV15HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV15HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15HisProDTF", localUtil.ttoc( AV15HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbavHisprof.setValue( httpContext.cgiGet( cmbavHisprof.getInternalname()) );
         AV16HisProF = httpContext.cgiGet( cmbavHisprof.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16HisProF", AV16HisProF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisprotur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisprotur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROTUR");
            GX_FocusControl = edtavHisprotur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17HisProTur = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HisProTur", GXutil.str( AV17HisProTur, 1, 0));
         }
         else
         {
            AV17HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHisprotur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HisProTur", GXutil.str( AV17HisProTur, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROKGR");
            GX_FocusControl = edtavHisprokgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18HisProKgr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18HisProKgr", GXutil.ltrimstr( AV18HisProKgr, 9, 2));
         }
         else
         {
            AV18HisProKgr = localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18HisProKgr", GXutil.ltrimstr( AV18HisProKgr, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPROMTR");
            GX_FocusControl = edtavHispromtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19HisProMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19HisProMtr", GXutil.ltrimstr( AV19HisProMtr, 9, 2));
         }
         else
         {
            AV19HisProMtr = localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19HisProMtr", GXutil.ltrimstr( AV19HisProMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPRONPZS");
            GX_FocusControl = edtavHispronpzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20HisProNpzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20HisProNpzs), 4, 0));
         }
         else
         {
            AV20HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtavHispronpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20HisProNpzs), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGruopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGruopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRUOPECOD");
            GX_FocusControl = edtavGruopecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11GruOpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11GruOpeCod), 6, 0));
         }
         else
         {
            AV11GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGruopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11GruOpeCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavParcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavParcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPARCOD");
            GX_FocusControl = edtavParcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21ParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ParCod), 4, 0));
         }
         else
         {
            AV21ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavParcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ParCod), 4, 0));
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
      e12HQ2 ();
      if (returnInSub) return;
   }

   public void e12HQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webpartesproduccionins_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      webpartesproduccionins_impl.this.A396EmprCod = GXv_char2[0] ;
      webpartesproduccionins_impl.this.AV28EmprNom = GXv_char3[0] ;
      webpartesproduccionins_impl.this.AV24Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      GXv_int5[0] = AV38Var_Hisprolin ;
      new app.lectoroptico.tbolpro_prxid(remoteHandle, context).execute( A396EmprCod, AV6Maqcod, AV5HisProFec, GXv_int5) ;
      webpartesproduccionins_impl.this.AV38Var_Hisprolin = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Var_Hisprolin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Var_Hisprolin), 8, 0));
      AV7HisProLin = AV38Var_Hisprolin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HisProLin), 8, 0));
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webpartesproduccionins_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char4[0] = AV42EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char2[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      webpartesproduccionins_impl.this.AV42EmprCod = GXv_char4[0] ;
      webpartesproduccionins_impl.this.AV28EmprNom = GXv_char3[0] ;
      webpartesproduccionins_impl.this.AV24Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      edtavParcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavParcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavParcod_Visible), 5, 0), true);
      edtavGruopecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGruopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGruopecod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOGRUOPECOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPARCOD' */
      S122 ();
      if (returnInSub) return;
      imgavPrompthdr_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "gximage", imgavPrompthdr_gximage, true);
      AV34PromptHDR = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "Bitmap", ((GXutil.strcmp("", AV34PromptHDR)==0) ? AV45Prompthdr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV34PromptHDR))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV34PromptHDR), true);
      AV45Prompthdr_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "Bitmap", ((GXutil.strcmp("", AV34PromptHDR)==0) ? AV45Prompthdr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV34PromptHDR))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV34PromptHDR), true);
      imgavPromptorden_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "gximage", imgavPromptorden_gximage, true);
      AV35PromptOrden = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "Bitmap", ((GXutil.strcmp("", AV35PromptOrden)==0) ? AV46Promptorden_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV35PromptOrden))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV35PromptOrden), true);
      AV46Promptorden_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "Bitmap", ((GXutil.strcmp("", AV35PromptOrden)==0) ? AV46Promptorden_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV35PromptOrden))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV35PromptOrden), true);
   }

   public void e13HQ2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV41DiaActual = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Execute user subroutine: 'BARFAS' */
      S132 ();
      if (returnInSub) return;
      if ( AV29Barfas == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion No existe Orden-Fase de esta HDR¡¡¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV30BarFasEst == 2 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "El orden ", "")+GXutil.trim( GXutil.str( AV12BarOrdLin, 4, 0))+httpContext.getMessage( " esta finalizado.", ""));
            GX_FocusControl = edtavBarordlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( GXutil.dateCompare(GXutil.nullDate(), AV15HisProDTF) && GXutil.dateCompare(GXutil.nullDate(), AV14HisProDTI) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Ha introducido Inicio y Fin con valor NULO¡¡¡", ""));
               GX_FocusControl = edtavHisprodti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( GXutil.dateCompare(GXutil.nullDate(), AV14HisProDTI) && ! GXutil.dateCompare(GXutil.nullDate(), AV15HisProDTF) && AV14HisProDTI.after( AV15HisProDTF ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "La fecha de Inicio es superior a la fecha de Fin ¡¡¡", ""));
                  GX_FocusControl = edtavHisprodti_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( ! GXutil.dateCompare(GXutil.nullDate(), AV15HisProDTF) && AV15HisProDTF.before( AV14HisProDTI ) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "La fecha de Fin es menor a la fecha de Inicio ¡¡¡", ""));
                     GX_FocusControl = edtavHisprodti_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( AV14HisProDTI.after( AV41DiaActual ) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Dia Inicio ", "")+GXutil.trim( localUtil.ttoc( AV14HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+httpContext.getMessage( " superior a dia actual ", "")+GXutil.trim( localUtil.ttoc( AV41DiaActual, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")));
                        GX_FocusControl = edtavHisprodti_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( AV15HisProDTF.after( AV41DiaActual ) )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Dia Fin ", "")+GXutil.trim( localUtil.ttoc( AV15HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+httpContext.getMessage( " superior a dia actual ", "")+GXutil.trim( localUtil.ttoc( AV41DiaActual, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")));
                           GX_FocusControl = edtavHisprodtf_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           if ( ( GXutil.strcmp(AV16HisProF, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(AV16HisProF, httpContext.getMessage( "N", "")) != 0 ) )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Item F debe de ser S o N ¡¡¡", ""));
                              GX_FocusControl = edtavHisprodtf_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              if ( AV7HisProLin > 0 )
                              {
                                 GXv_char4[0] = AV37errmensaje ;
                                 new app.existelinealhipro(remoteHandle, context).execute( A396EmprCod, AV6Maqcod, AV5HisProFec, AV7HisProLin, GXv_char4) ;
                                 webpartesproduccionins_impl.this.AV37errmensaje = GXv_char4[0] ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV37errmensaje", AV37errmensaje);
                              }
                              if ( ( AV7HisProLin > 0 ) && ! (GXutil.strcmp("", AV37errmensaje)==0) )
                              {
                                 httpContext.GX_msglist.addItem(AV37errmensaje);
                              }
                              else
                              {
                                 if ( (0==AV7HisProLin) )
                                 {
                                    GXv_int5[0] = AV38Var_Hisprolin ;
                                    new app.lectoroptico.tbolpro_prxid(remoteHandle, context).execute( A396EmprCod, AV6Maqcod, AV5HisProFec, GXv_int5) ;
                                    webpartesproduccionins_impl.this.AV38Var_Hisprolin = GXv_int5[0] ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV38Var_Hisprolin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Var_Hisprolin), 8, 0));
                                    Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.getMessage( "El programa AGREGARA la linea ", "")+GXutil.trim( GXutil.str( AV38Var_Hisprolin, 8, 0))+GXutil.newLine( ) ;
                                    ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                                    Dvelop_confirmpanel_btnconfirmar_Confirmationtext = Dvelop_confirmpanel_btnconfirmar_Confirmationtext+httpContext.getMessage( "Confirma el proceso? ", "") ;
                                    ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                                 }
                                 else
                                 {
                                    Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.getMessage( "El programa INSERTARA la linea ", "")+GXutil.trim( GXutil.str( AV7HisProLin, 8, 0))+GXutil.newLine( ) ;
                                    ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                                    Dvelop_confirmpanel_btnconfirmar_Confirmationtext = Dvelop_confirmpanel_btnconfirmar_Confirmationtext+httpContext.getMessage( "Confirma el proceso? ", "") ;
                                    ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                                 }
                                 this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer", "Confirm", "", new Object[] {});
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

   public void e11HQ2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV39HisprolinIN = ((0==AV7HisProLin) ? AV38Var_Hisprolin : AV7HisProLin) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV6Maqcod ;
         GXv_date6[0] = AV5HisProFec ;
         new app.pinschipro(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date6) ;
         webpartesproduccionins_impl.this.A396EmprCod = GXv_char4[0] ;
         webpartesproduccionins_impl.this.AV6Maqcod = GXv_char3[0] ;
         webpartesproduccionins_impl.this.AV5HisProFec = GXv_date6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV6Maqcod ;
         GXv_date6[0] = AV5HisProFec ;
         GXv_int5[0] = AV39HisprolinIN ;
         new app.pparlin(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date6, GXv_int5) ;
         webpartesproduccionins_impl.this.A396EmprCod = GXv_char4[0] ;
         webpartesproduccionins_impl.this.AV6Maqcod = GXv_char3[0] ;
         webpartesproduccionins_impl.this.AV5HisProFec = GXv_date6[0] ;
         webpartesproduccionins_impl.this.AV39HisprolinIN = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV6Maqcod ;
         GXv_date6[0] = AV5HisProFec ;
         GXv_int5[0] = AV39HisprolinIN ;
         GXv_int7[0] = AV11GruOpeCod ;
         GXv_dtime8[0] = AV14HisProDTI ;
         GXv_dtime9[0] = AV15HisProDTF ;
         GXv_decimal10[0] = AV18HisProKgr ;
         GXv_decimal11[0] = AV19HisProMtr ;
         GXv_int12[0] = AV17HisProTur ;
         GXv_int13[0] = AV21ParCod ;
         GXv_char2[0] = AV16HisProF ;
         GXv_decimal14[0] = AV22HisHhmaq ;
         GXv_decimal15[0] = AV23HisHhIni ;
         GXv_char16[0] = AV27Station ;
         GXv_char17[0] = AV24Usurcod ;
         GXv_int18[0] = AV8BarCod ;
         GXv_int19[0] = AV9BarCodReo ;
         GXv_char20[0] = AV10BarCodPar ;
         GXv_int21[0] = AV12BarOrdLin ;
         GXv_char22[0] = AV13Fase ;
         new app.lectoroptico.pwbolla(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date6, GXv_int5, GXv_int7, GXv_dtime8, GXv_dtime9, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_int13, GXv_char2, GXv_decimal14, GXv_decimal15, GXv_char16, GXv_char17, GXv_int18, GXv_int19, GXv_char20, GXv_int21, GXv_char22) ;
         webpartesproduccionins_impl.this.A396EmprCod = GXv_char4[0] ;
         webpartesproduccionins_impl.this.AV6Maqcod = GXv_char3[0] ;
         webpartesproduccionins_impl.this.AV5HisProFec = GXv_date6[0] ;
         webpartesproduccionins_impl.this.AV39HisprolinIN = GXv_int5[0] ;
         webpartesproduccionins_impl.this.AV11GruOpeCod = GXv_int7[0] ;
         webpartesproduccionins_impl.this.AV14HisProDTI = GXv_dtime8[0] ;
         webpartesproduccionins_impl.this.AV15HisProDTF = GXv_dtime9[0] ;
         webpartesproduccionins_impl.this.AV18HisProKgr = GXv_decimal10[0] ;
         webpartesproduccionins_impl.this.AV19HisProMtr = GXv_decimal11[0] ;
         webpartesproduccionins_impl.this.AV17HisProTur = GXv_int12[0] ;
         webpartesproduccionins_impl.this.AV21ParCod = GXv_int13[0] ;
         webpartesproduccionins_impl.this.AV16HisProF = GXv_char2[0] ;
         webpartesproduccionins_impl.this.AV22HisHhmaq = GXv_decimal14[0] ;
         webpartesproduccionins_impl.this.AV23HisHhIni = GXv_decimal15[0] ;
         webpartesproduccionins_impl.this.AV27Station = GXv_char16[0] ;
         webpartesproduccionins_impl.this.AV24Usurcod = GXv_char17[0] ;
         webpartesproduccionins_impl.this.AV8BarCod = GXv_int18[0] ;
         webpartesproduccionins_impl.this.AV9BarCodReo = GXv_int19[0] ;
         webpartesproduccionins_impl.this.AV10BarCodPar = GXv_char20[0] ;
         webpartesproduccionins_impl.this.AV12BarOrdLin = GXv_int21[0] ;
         webpartesproduccionins_impl.this.AV13Fase = GXv_char22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV11GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11GruOpeCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14HisProDTI", localUtil.ttoc( AV14HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "AV15HisProDTF", localUtil.ttoc( AV15HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "AV18HisProKgr", GXutil.ltrimstr( AV18HisProKgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV19HisProMtr", GXutil.ltrimstr( AV19HisProMtr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV17HisProTur", GXutil.str( AV17HisProTur, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ParCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16HisProF", AV16HisProF);
         httpContext.ajax_rsp_assign_attri("", false, "AV22HisHhmaq", GXutil.ltrimstr( AV22HisHhmaq, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV23HisHhIni", GXutil.ltrimstr( AV23HisHhIni, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV13Fase", AV13Fase);
         if ( GXutil.strcmp(AV16HisProF, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char22[0] = A396EmprCod ;
            GXv_char20[0] = AV6Maqcod ;
            GXv_date6[0] = AV5HisProFec ;
            GXv_int18[0] = AV8BarCod ;
            GXv_int19[0] = AV9BarCodReo ;
            GXv_char17[0] = AV10BarCodPar ;
            GXv_int21[0] = AV12BarOrdLin ;
            new app.psilpar(remoteHandle, context).execute( GXv_char22, GXv_char20, GXv_date6, GXv_int18, GXv_int19, GXv_char17, GXv_int21) ;
            webpartesproduccionins_impl.this.A396EmprCod = GXv_char22[0] ;
            webpartesproduccionins_impl.this.AV6Maqcod = GXv_char20[0] ;
            webpartesproduccionins_impl.this.AV5HisProFec = GXv_date6[0] ;
            webpartesproduccionins_impl.this.AV8BarCod = GXv_int18[0] ;
            webpartesproduccionins_impl.this.AV9BarCodReo = GXv_int19[0] ;
            webpartesproduccionins_impl.this.AV10BarCodPar = GXv_char17[0] ;
            webpartesproduccionins_impl.this.AV12BarOrdLin = GXv_int21[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOrdLin), 4, 0));
         }
         GXv_char22[0] = A396EmprCod ;
         GXv_int18[0] = AV8BarCod ;
         GXv_int19[0] = AV9BarCodReo ;
         GXv_char20[0] = AV10BarCodPar ;
         GXv_int21[0] = AV12BarOrdLin ;
         new app.lectoroptico.pacfbar3(remoteHandle, context).execute( GXv_char22, GXv_int18, GXv_int19, GXv_char20, GXv_int21) ;
         webpartesproduccionins_impl.this.A396EmprCod = GXv_char22[0] ;
         webpartesproduccionins_impl.this.AV8BarCod = GXv_int18[0] ;
         webpartesproduccionins_impl.this.AV9BarCodReo = GXv_int19[0] ;
         webpartesproduccionins_impl.this.AV10BarCodPar = GXv_char20[0] ;
         webpartesproduccionins_impl.this.AV12BarOrdLin = GXv_int21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOrdLin), 4, 0));
         GXv_char22[0] = A396EmprCod ;
         GXv_char20[0] = AV6Maqcod ;
         GXv_date6[0] = AV5HisProFec ;
         GXv_int18[0] = AV39HisprolinIN ;
         new app.pactbar(remoteHandle, context).execute( GXv_char22, GXv_char20, GXv_date6, GXv_int18) ;
         webpartesproduccionins_impl.this.A396EmprCod = GXv_char22[0] ;
         webpartesproduccionins_impl.this.AV6Maqcod = GXv_char20[0] ;
         webpartesproduccionins_impl.this.AV5HisProFec = GXv_date6[0] ;
         webpartesproduccionins_impl.this.AV39HisprolinIN = GXv_int18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,AV6Maqcod,localUtil.format( AV5HisProFec, "99/99/99")});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV6Maqcod","AV5HisProFec"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      cmbavHisprof.setValue( GXutil.rtrim( AV16HisProF) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavHisprof.getInternalname(), "Values", cmbavHisprof.ToJavascriptSource(), true);
   }

   public void e14HQ2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,AV6Maqcod,localUtil.format( AV5HisProFec, "99/99/99")});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV6Maqcod","AV5HisProFec"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADCOMBOPARCOD' Routine */
      returnInSub = false ;
      /* Using cursor H00HQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13824ParCodNomI = H00HQ3_A13824ParCodNomI[0] ;
         A656ParCod = H00HQ3_A656ParCod[0] ;
         A867ParCodNom = H00HQ3_A867ParCodNom[0] ;
         n867ParCodNom = H00HQ3_n867ParCodNom[0] ;
         AV32Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV32Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A656ParCod, 4, 0)) );
         AV32Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13824ParCodNomI );
         AV31ParCod_Data.add(AV32Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_parcod_Selectedvalue_set = ((0==AV21ParCod) ? "" : GXutil.trim( GXutil.str( AV21ParCod, 4, 0))) ;
      ucCombo_parcod.sendProperty(context, "", false, Combo_parcod_Internalname, "SelectedValue_set", Combo_parcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOGRUOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor H00HQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8482OpeAct = H00HQ4_A8482OpeAct[0] ;
         n8482OpeAct = H00HQ4_n8482OpeAct[0] ;
         A13748OpeCNom = H00HQ4_A13748OpeCNom[0] ;
         A652OpeCod = H00HQ4_A652OpeCod[0] ;
         A653OpeNom = H00HQ4_A653OpeNom[0] ;
         n653OpeNom = H00HQ4_n653OpeNom[0] ;
         AV32Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV32Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV32Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV33GruOpeCod_Data.add(AV32Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_gruopecod_Selectedvalue_set = ((0==AV11GruOpeCod) ? "" : GXutil.trim( GXutil.str( AV11GruOpeCod, 6, 0))) ;
      ucCombo_gruopecod.sendProperty(context, "", false, Combo_gruopecod_Internalname, "SelectedValue_set", Combo_gruopecod_Selectedvalue_set);
   }

   public void e18HQ2( )
   {
      /* Prompthdr_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"A396EmprCod","AV8BarCod","AV9BarCodReo","AV10BarCodPar","",""});
      /*  Sending Event outputs  */
   }

   public void e19HQ2( )
   {
      /* Promptorden_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.partedeproduccion_seleccion_hdr_orden_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InEmprCod","InBarCod","InBarCodReo","InBarCodPar","InOutBarOrdLin","OutFascod"}) , new Object[] {"AV12BarOrdLin","AV13Fase"});
      /*  Sending Event outputs  */
   }

   public void e15HQ2( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      GXv_char22[0] = A396EmprCod ;
      GXv_int18[0] = AV8BarCod ;
      GXv_int19[0] = AV9BarCodReo ;
      GXv_char20[0] = AV10BarCodPar ;
      GXv_decimal15[0] = AV18HisProKgr ;
      GXv_decimal14[0] = AV19HisProMtr ;
      new app.pkgmtpd(remoteHandle, context).execute( GXv_char22, GXv_int18, GXv_int19, GXv_char20, GXv_decimal15, GXv_decimal14) ;
      webpartesproduccionins_impl.this.A396EmprCod = GXv_char22[0] ;
      webpartesproduccionins_impl.this.AV8BarCod = GXv_int18[0] ;
      webpartesproduccionins_impl.this.AV9BarCodReo = GXv_int19[0] ;
      webpartesproduccionins_impl.this.AV10BarCodPar = GXv_char20[0] ;
      webpartesproduccionins_impl.this.AV18HisProKgr = GXv_decimal15[0] ;
      webpartesproduccionins_impl.this.AV19HisProMtr = GXv_decimal14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV18HisProKgr", GXutil.ltrimstr( AV18HisProKgr, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV19HisProMtr", GXutil.ltrimstr( AV19HisProMtr, 9, 2));
      /*  Sending Event outputs  */
   }

   public void e16HQ2( )
   {
      /* Barordlin_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char22[0] = AV13Fase ;
      GXv_int19[0] = AV40BarFasEstout ;
      new app.obtengolafasefuncionorden(remoteHandle, context).execute( A396EmprCod, AV8BarCod, AV9BarCodReo, AV10BarCodPar, AV12BarOrdLin, GXv_char22, GXv_int19) ;
      webpartesproduccionins_impl.this.AV13Fase = GXv_char22[0] ;
      webpartesproduccionins_impl.this.AV40BarFasEstout = GXv_int19[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Fase", AV13Fase);
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV29Barfas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Barfas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Barfas), 4, 0));
      /* Using cursor H00HQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV12BarOrdLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A194BarOrdLin = H00HQ5_A194BarOrdLin[0] ;
         A130BarCodPar = H00HQ5_A130BarCodPar[0] ;
         A132BarCodReo = H00HQ5_A132BarCodReo[0] ;
         A129BarCod = H00HQ5_A129BarCod[0] ;
         A153BarFasEst = H00HQ5_A153BarFasEst[0] ;
         AV30BarFasEst = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarFasEst", GXutil.str( AV30BarFasEst, 1, 0));
         AV29Barfas = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Barfas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Barfas), 4, 0));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void nextLoad( )
   {
   }

   protected void e17HQ2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_135_HQ2( boolean wbgen )
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
         wb_table1_135_HQ2e( true) ;
      }
      else
      {
         wb_table1_135_HQ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV6Maqcod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Maqcod", AV6Maqcod);
      AV5HisProFec = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec", localUtil.format(AV5HisProFec, "99/99/99"));
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
      paHQ2( ) ;
      wsHQ2( ) ;
      weHQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513266", true, true);
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
      httpContext.AddJavascriptSource("webpartesproduccionins.js", "?20268241513266", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavHisprofec_Internalname = "vHISPROFEC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavHisprolin_Internalname = "vHISPROLIN" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      imgavPrompthdr_Internalname = "vPROMPTHDR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockcombo_gruopecod_Internalname = "TEXTBLOCKCOMBO_GRUOPECOD" ;
      Combo_gruopecod_Internalname = "COMBO_GRUOPECOD" ;
      divTablesplittedgruopecod_Internalname = "TABLESPLITTEDGRUOPECOD" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      imgavPromptorden_Internalname = "vPROMPTORDEN" ;
      edtavFase_Internalname = "vFASE" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      cmbavHisprof.setInternalname( "vHISPROF" );
      edtavHisprotur_Internalname = "vHISPROTUR" ;
      edtavHisprokgr_Internalname = "vHISPROKGR" ;
      edtavHispromtr_Internalname = "vHISPROMTR" ;
      edtavHispronpzs_Internalname = "vHISPRONPZS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockcombo_parcod_Internalname = "TEXTBLOCKCOMBO_PARCOD" ;
      Combo_parcod_Internalname = "COMBO_PARCOD" ;
      divTablesplittedparcod_Internalname = "TABLESPLITTEDPARCOD" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGruopecod_Internalname = "vGRUOPECOD" ;
      edtavParcod_Internalname = "vPARCOD" ;
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
      edtavParcod_Jsonclick = "" ;
      edtavParcod_Visible = 1 ;
      edtavGruopecod_Jsonclick = "" ;
      edtavGruopecod_Visible = 1 ;
      edtavHispronpzs_Jsonclick = "" ;
      edtavHispronpzs_Enabled = 1 ;
      edtavHispromtr_Jsonclick = "" ;
      edtavHispromtr_Enabled = 1 ;
      edtavHisprokgr_Jsonclick = "" ;
      edtavHisprokgr_Enabled = 1 ;
      edtavHisprotur_Jsonclick = "" ;
      edtavHisprotur_Enabled = 1 ;
      cmbavHisprof.setJsonclick( "" );
      cmbavHisprof.setEnabled( 1 );
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      edtavFase_Jsonclick = "" ;
      edtavFase_Enabled = 1 ;
      imgavPromptorden_Jsonclick = "" ;
      imgavPromptorden_gximage = "" ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 1 ;
      imgavPrompthdr_Jsonclick = "" ;
      imgavPrompthdr_gximage = "" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      edtavHisprolin_Jsonclick = "" ;
      edtavHisprolin_Enabled = 1 ;
      edtavHisprofec_Jsonclick = "" ;
      edtavHisprofec_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma los Datos?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Insertar datos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_parcod_Emptyitemtext = "" ;
      Combo_parcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_gruopecod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_gruopecod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Agregar Registro Parte Produccion", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisprof.setName( "vHISPROF" );
      cmbavHisprof.setWebtags( "" );
      cmbavHisprof.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavHisprof.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavHisprof.getItemCount() > 0 )
      {
         AV16HisProF = cmbavHisprof.getValidValue(AV16HisProF) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16HisProF", AV16HisProF);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e13HQ2',iparms:[{av:'AV29Barfas',fld:'vBARFAS',pic:'ZZZ9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV30BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV15HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV14HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'cmbavHisprof'},{av:'AV16HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV7HisProLin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV6Maqcod',fld:'vMAQCOD',pic:''},{av:'AV5HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV37errmensaje',fld:'vERRMENSAJE',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV37errmensaje',fld:'vERRMENSAJE',pic:''},{av:'AV38Var_Hisprolin',fld:'vVAR_HISPROLIN',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'},{av:'AV29Barfas',fld:'vBARFAS',pic:'ZZZ9'},{av:'AV30BarFasEst',fld:'vBARFASEST',pic:'9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e11HQ2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV38Var_Hisprolin',fld:'vVAR_HISPROLIN',pic:'ZZZZZZZ9'},{av:'AV7HisProLin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV6Maqcod',fld:'vMAQCOD',pic:''},{av:'AV5HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV11GruOpeCod',fld:'vGRUOPECOD',pic:'ZZZZZ9'},{av:'AV14HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV15HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV18HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV19HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV17HisProTur',fld:'vHISPROTUR',pic:'9'},{av:'AV21ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'cmbavHisprof'},{av:'AV16HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV22HisHhmaq',fld:'vHISHHMAQ',pic:'ZZZZZZ9.99'},{av:'AV23HisHhIni',fld:'vHISHHINI',pic:'ZZZZZZ9.99'},{av:'AV27Station',fld:'vSTATION',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV13Fase',fld:'vFASE',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV5HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV6Maqcod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV13Fase',fld:'vFASE',pic:''},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV27Station',fld:'vSTATION',pic:''},{av:'AV23HisHhIni',fld:'vHISHHINI',pic:'ZZZZZZ9.99'},{av:'AV22HisHhmaq',fld:'vHISHHMAQ',pic:'ZZZZZZ9.99'},{av:'cmbavHisprof'},{av:'AV16HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV21ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV17HisProTur',fld:'vHISPROTUR',pic:'9'},{av:'AV19HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV18HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV15HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV14HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV11GruOpeCod',fld:'vGRUOPECOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e14HQ2',iparms:[{av:'AV5HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV6Maqcod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPROMPTHDR.CLICK","{handler:'e18HQ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPTHDR.CLICK",",oparms:[{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VPROMPTORDEN.CLICK","{handler:'e19HQ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("VPROMPTORDEN.CLICK",",oparms:[{av:'AV13Fase',fld:'vFASE',pic:''},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e15HQ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV18HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV19HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'AV19HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV18HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VBARORDLIN.CONTROLVALUECHANGED","{handler:'e16HQ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("VBARORDLIN.CONTROLVALUECHANGED",",oparms:[{av:'AV13Fase',fld:'vFASE',pic:''}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALIDV_BARORDLIN","{handler:'validv_Barordlin',iparms:[]");
      setEventMetadata("VALIDV_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALIDV_HISPROF","{handler:'validv_Hisprof',iparms:[]");
      setEventMetadata("VALIDV_HISPROF",",oparms:[]}");
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
      wcpOAV6Maqcod = "" ;
      wcpOAV5HisProFec = GXutil.nullDate() ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Combo_parcod_Selectedvalue_get = "" ;
      Combo_gruopecod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV6Maqcod = "" ;
      AV5HisProFec = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV33GruOpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV31ParCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37errmensaje = "" ;
      A130BarCodPar = "" ;
      AV22HisHhmaq = DecimalUtil.ZERO ;
      AV23HisHhIni = DecimalUtil.ZERO ;
      AV27Station = "" ;
      AV24Usurcod = "" ;
      Combo_gruopecod_Selectedvalue_set = "" ;
      Combo_parcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV10BarCodPar = "" ;
      AV34PromptHDR = "" ;
      AV45Prompthdr_GXI = "" ;
      sImgUrl = "" ;
      lblTextblockcombo_gruopecod_Jsonclick = "" ;
      ucCombo_gruopecod = new com.genexus.webpanels.GXUserControl();
      Combo_gruopecod_Caption = "" ;
      AV35PromptOrden = "" ;
      AV46Promptorden_GXI = "" ;
      AV13Fase = "" ;
      AV14HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV15HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV16HisProF = "" ;
      AV18HisProKgr = DecimalUtil.ZERO ;
      AV19HisProMtr = DecimalUtil.ZERO ;
      lblTextblockcombo_parcod_Jsonclick = "" ;
      ucCombo_parcod = new com.genexus.webpanels.GXUserControl();
      Combo_parcod_Caption = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00HQ2_A396EmprCod = new String[] {""} ;
      AV28EmprNom = "" ;
      GXt_char1 = "" ;
      AV42EmprCod = "" ;
      AV41DiaActual = GXutil.resetTime( GXutil.nullDate() );
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_dtime8 = new java.util.Date[1] ;
      GXv_dtime9 = new java.util.Date[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int21 = new short[1] ;
      GXv_date6 = new java.util.Date[1] ;
      H00HQ3_A396EmprCod = new String[] {""} ;
      H00HQ3_A13824ParCodNomI = new String[] {""} ;
      H00HQ3_A656ParCod = new short[1] ;
      H00HQ3_A867ParCodNom = new String[] {""} ;
      H00HQ3_n867ParCodNom = new boolean[] {false} ;
      A13824ParCodNomI = "" ;
      A867ParCodNom = "" ;
      AV32Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00HQ4_A396EmprCod = new String[] {""} ;
      H00HQ4_A8482OpeAct = new String[] {""} ;
      H00HQ4_n8482OpeAct = new boolean[] {false} ;
      H00HQ4_A13748OpeCNom = new String[] {""} ;
      H00HQ4_A652OpeCod = new int[1] ;
      H00HQ4_A653OpeNom = new String[] {""} ;
      H00HQ4_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      A653OpeNom = "" ;
      GXv_int18 = new int[1] ;
      GXv_char20 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char22 = new String[1] ;
      GXv_int19 = new byte[1] ;
      H00HQ5_A758ProCod = new String[] {""} ;
      H00HQ5_A396EmprCod = new String[] {""} ;
      H00HQ5_A194BarOrdLin = new short[1] ;
      H00HQ5_A130BarCodPar = new String[] {""} ;
      H00HQ5_A132BarCodReo = new byte[1] ;
      H00HQ5_A129BarCod = new int[1] ;
      H00HQ5_A153BarFasEst = new byte[1] ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpartesproduccionins__default(),
         new Object[] {
             new Object[] {
            H00HQ2_A396EmprCod
            }
            , new Object[] {
            H00HQ3_A396EmprCod, H00HQ3_A13824ParCodNomI, H00HQ3_A656ParCod, H00HQ3_A867ParCodNom, H00HQ3_n867ParCodNom
            }
            , new Object[] {
            H00HQ4_A396EmprCod, H00HQ4_A8482OpeAct, H00HQ4_n8482OpeAct, H00HQ4_A13748OpeCNom, H00HQ4_A652OpeCod, H00HQ4_A653OpeNom, H00HQ4_n653OpeNom
            }
            , new Object[] {
            H00HQ5_A758ProCod, H00HQ5_A396EmprCod, H00HQ5_A194BarOrdLin, H00HQ5_A130BarCodPar, H00HQ5_A132BarCodReo, H00HQ5_A129BarCod, H00HQ5_A153BarFasEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      edtavHisprofec_Enabled = 0 ;
      edtavFase_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV30BarFasEst ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte AV9BarCodReo ;
   private byte AV17HisProTur ;
   private byte nDonePA ;
   private byte GXv_int12[] ;
   private byte AV40BarFasEstout ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV29Barfas ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV12BarOrdLin ;
   private short AV20HisProNpzs ;
   private short AV21ParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int13[] ;
   private short GXv_int21[] ;
   private short A656ParCod ;
   private int A129BarCod ;
   private int AV38Var_Hisprolin ;
   private int edtavMaqcod_Enabled ;
   private int edtavHisprofec_Enabled ;
   private int AV7HisProLin ;
   private int edtavHisprolin_Enabled ;
   private int AV8BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavFase_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int edtavHisprotur_Enabled ;
   private int edtavHisprokgr_Enabled ;
   private int edtavHispromtr_Enabled ;
   private int edtavHispronpzs_Enabled ;
   private int AV11GruOpeCod ;
   private int edtavGruopecod_Visible ;
   private int edtavParcod_Visible ;
   private int AV39HisprolinIN ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int A652OpeCod ;
   private int GXv_int18[] ;
   private int idxLst ;
   private java.math.BigDecimal AV22HisHhmaq ;
   private java.math.BigDecimal AV23HisHhIni ;
   private java.math.BigDecimal AV18HisProKgr ;
   private java.math.BigDecimal AV19HisProMtr ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String wcpOA396EmprCod ;
   private String wcpOAV6Maqcod ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Combo_parcod_Selectedvalue_get ;
   private String Combo_gruopecod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV6Maqcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A130BarCodPar ;
   private String AV27Station ;
   private String AV24Usurcod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_gruopecod_Cls ;
   private String Combo_gruopecod_Selectedvalue_set ;
   private String Combo_parcod_Cls ;
   private String Combo_parcod_Selectedvalue_set ;
   private String Combo_parcod_Emptyitemtext ;
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
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavHisprofec_Internalname ;
   private String edtavHisprofec_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavHisprolin_Internalname ;
   private String TempTags ;
   private String edtavHisprolin_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV10BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String imgavPrompthdr_Internalname ;
   private String imgavPrompthdr_gximage ;
   private String sImgUrl ;
   private String imgavPrompthdr_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedgruopecod_Internalname ;
   private String lblTextblockcombo_gruopecod_Internalname ;
   private String lblTextblockcombo_gruopecod_Jsonclick ;
   private String Combo_gruopecod_Caption ;
   private String Combo_gruopecod_Internalname ;
   private String edtavBarordlin_Internalname ;
   private String edtavBarordlin_Jsonclick ;
   private String imgavPromptorden_Internalname ;
   private String imgavPromptorden_gximage ;
   private String imgavPromptorden_Jsonclick ;
   private String edtavFase_Internalname ;
   private String AV13Fase ;
   private String edtavFase_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String AV16HisProF ;
   private String edtavHisprotur_Internalname ;
   private String edtavHisprotur_Jsonclick ;
   private String edtavHisprokgr_Internalname ;
   private String edtavHisprokgr_Jsonclick ;
   private String edtavHispromtr_Internalname ;
   private String edtavHispromtr_Jsonclick ;
   private String edtavHispronpzs_Internalname ;
   private String edtavHispronpzs_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divTablesplittedparcod_Internalname ;
   private String lblTextblockcombo_parcod_Internalname ;
   private String lblTextblockcombo_parcod_Jsonclick ;
   private String Combo_parcod_Caption ;
   private String Combo_parcod_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGruopecod_Internalname ;
   private String edtavGruopecod_Jsonclick ;
   private String edtavParcod_Internalname ;
   private String edtavParcod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV28EmprNom ;
   private String GXt_char1 ;
   private String AV42EmprCod ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String A867ParCodNom ;
   private String A8482OpeAct ;
   private String A653OpeNom ;
   private String GXv_char20[] ;
   private String GXv_char22[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private java.util.Date AV14HisProDTI ;
   private java.util.Date AV15HisProDTF ;
   private java.util.Date AV41DiaActual ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date GXv_dtime9[] ;
   private java.util.Date wcpOAV5HisProFec ;
   private java.util.Date AV5HisProFec ;
   private java.util.Date GXv_date6[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_gruopecod_Emptyitem ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV34PromptHDR_IsBlob ;
   private boolean AV35PromptOrden_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n867ParCodNom ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private String AV37errmensaje ;
   private String AV45Prompthdr_GXI ;
   private String AV46Promptorden_GXI ;
   private String A13824ParCodNomI ;
   private String A13748OpeCNom ;
   private String AV34PromptHDR ;
   private String AV35PromptOrden ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_gruopecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_parcod ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private HTMLChoice cmbavHisprof ;
   private IDataStoreProvider pr_default ;
   private String[] H00HQ2_A396EmprCod ;
   private String[] H00HQ3_A396EmprCod ;
   private String[] H00HQ3_A13824ParCodNomI ;
   private short[] H00HQ3_A656ParCod ;
   private String[] H00HQ3_A867ParCodNom ;
   private boolean[] H00HQ3_n867ParCodNom ;
   private String[] H00HQ4_A396EmprCod ;
   private String[] H00HQ4_A8482OpeAct ;
   private boolean[] H00HQ4_n8482OpeAct ;
   private String[] H00HQ4_A13748OpeCNom ;
   private int[] H00HQ4_A652OpeCod ;
   private String[] H00HQ4_A653OpeNom ;
   private boolean[] H00HQ4_n653OpeNom ;
   private String[] H00HQ5_A758ProCod ;
   private String[] H00HQ5_A396EmprCod ;
   private short[] H00HQ5_A194BarOrdLin ;
   private String[] H00HQ5_A130BarCodPar ;
   private byte[] H00HQ5_A132BarCodReo ;
   private int[] H00HQ5_A129BarCod ;
   private byte[] H00HQ5_A153BarFasEst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV33GruOpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31ParCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV32Combo_DataItem ;
}

final  class webpartesproduccionins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00HQ2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00HQ3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ParCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ParCodNom, ''))) AS ParCodNomI, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? ORDER BY ParCodNomI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HQ4", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HQ5", "SELECT ProCod, EmprCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, BarFasEst FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

