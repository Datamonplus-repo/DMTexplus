package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail__wp_impl extends GXDataArea
{
   public trabajoexterno_detail__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_detail__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail__wp_impl.class ));
   }

   public trabajoexterno_detail__wp_impl( int remoteHandle ,
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
            AV13Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV35SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35SalExtAlb), 8, 0));
               AV36SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36SalExtFec", localUtil.format(AV36SalExtFec, "99/99/99"));
               AV37SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37SalFhh", localUtil.ttoc( AV37SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALFHH", getSecureSignedToken( "", localUtil.format( AV37SalFhh, "99/99/99 99:99")));
               AV19ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ManCod), 4, 0));
               AV20ManNom = httpContext.GetPar( "ManNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20ManNom", AV20ManNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20ManNom, ""))));
               AV28SalCodeID = httpContext.GetPar( "SalCodeID") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28SalCodeID", AV28SalCodeID);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28SalCodeID, ""))));
               AV29SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29SalEnvAT", GXutil.str( AV29SalEnvAT, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29SalEnvAT), "9")));
               AV18HashIN = httpContext.GetPar( "HashIN") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18HashIN", AV18HashIN);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASHIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18HashIN, ""))));
               AV25okIN = GXutil.strtobool( httpContext.GetPar( "okIN")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25okIN", AV25okIN);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOKIN", getSecureSignedToken( "", AV25okIN));
               AV23Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Messages_jsonIN", AV23Messages_jsonIN);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSONIN", getSecureSignedToken( "", AV23Messages_jsonIN));
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
      pa29K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29K2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajoexterno_detail__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV35SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV36SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV37SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(AV19ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV20ManNom)),GXutil.URLEncode(GXutil.rtrim(AV28SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(AV29SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18HashIN)),GXutil.URLEncode(GXutil.booltostr(AV25okIN)),GXutil.URLEncode(GXutil.rtrim(AV23Messages_jsonIN))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","okIN","Messages_jsonIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALFHH", getSecureSignedToken( "", localUtil.format( AV37SalFhh, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASHIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18HashIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOKIN", getSecureSignedToken( "", AV25okIN));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSONIN", getSecureSignedToken( "", AV23Messages_jsonIN));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Hash, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20ManNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28SalCodeID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29SalEnvAT), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", AV46msgerr);
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHDR", GXutil.ltrim( localUtil.ntoc( AV43flaghdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXKGEOLD", GXutil.ltrim( localUtil.ntoc( AV41SalExKgEold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXCOEOLD", GXutil.ltrim( localUtil.ntoc( AV40SalExCoEold, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXMTEOLD", GXutil.ltrim( localUtil.ntoc( AV42SalExMtEold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTFEC", localUtil.dtoc( AV36SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALFHH", localUtil.ttoc( AV37SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALFHH", getSecureSignedToken( "", localUtil.format( AV37SalFhh, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASHIN", AV18HashIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASHIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18HashIN, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOKIN", AV25okIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOKIN", getSecureSignedToken( "", AV25okIN));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSONIN", AV23Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSONIN", getSecureSignedToken( "", AV23Messages_jsonIN));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV11Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV17Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Hash, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV44BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
      if ( ! ( WebComp_Wctrabajoexterno_detail__wc == null ) )
      {
         WebComp_Wctrabajoexterno_detail__wc.componentjscripts();
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
         we29K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29K2( ) ;
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
      return formatLink("app.trabajoexterno_detail__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV35SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV36SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV37SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(AV19ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV20ManNom)),GXutil.URLEncode(GXutil.rtrim(AV28SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(AV29SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18HashIN)),GXutil.URLEncode(GXutil.booltostr(AV25okIN)),GXutil.URLEncode(GXutil.rtrim(AV23Messages_jsonIN))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","okIN","Messages_jsonIN"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajoExterno_Detail__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Trabajo Externo ( Detail )", "") ;
   }

   public void wb29K0( )
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajoExterno_Detail__WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextalb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextalb_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextalb_Internalname, GXutil.ltrim( localUtil.ntoc( AV35SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalextalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextalb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextalb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMancod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMancod_Internalname, httpContext.getMessage( "Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMannom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMannom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMannom_Internalname, GXutil.rtrim( AV20ManNom), GXutil.rtrim( localUtil.format( AV20ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMannom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMannom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalcodeid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalcodeid_Internalname, httpContext.getMessage( "ATDocCodeID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalcodeid_Internalname, GXutil.rtrim( AV28SalCodeID), GXutil.rtrim( localUtil.format( AV28SalCodeID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalcodeid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalcodeid_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalenvat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalenvat_Internalname, httpContext.getMessage( "Envio AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalenvat_Internalname, GXutil.ltrim( localUtil.ntoc( AV29SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalenvat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29SalEnvAT), "9") : localUtil.format( DecimalUtil.doubleToDec(AV29SalEnvAT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalenvat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalenvat_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tableheader_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tableheader_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexnln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexnln_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexnln_Internalname, GXutil.ltrim( localUtil.ntoc( AV33SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexnln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33SalExNln), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33SalExNln), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+"EVSALEXNLN.CLICK."+"'", "", "", "", "", edtavSalexnln_Jsonclick, 5, "AttributeFL", "", "", "", "", 1, edtavSalexnln_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV27Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV27Prompt)==0)&&(GXutil.strcmp("", AV53Prompt_GXI)==0))||!(GXutil.strcmp("", AV27Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV27Prompt)==0) ? AV53Prompt_GXI : httpContext.getResourceRelative(AV27Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, imgavPrompt_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV27Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_TrabajoExterno_Detail__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV6BarCodPar), GXutil.rtrim( localUtil.format( AV6BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascodn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascodn_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascodn_Internalname, GXutil.rtrim( AV15FasCodn), GXutil.rtrim( localUtil.format( AV15FasCodn, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascodn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascodn_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOrdlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOrdlin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOrdlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV26OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26OrdLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOrdlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOrdlin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexcoe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexcoe_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexcoe_Internalname, GXutil.ltrim( localUtil.ntoc( AV30SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexcoe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30SalExCoE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30SalExCoE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexcoe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexcoe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexkge_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexkge_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexkge_Internalname, GXutil.ltrim( localUtil.ntoc( AV31SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexkge_Enabled!=0) ? localUtil.format( AV31SalExKgE, "ZZZZZ9.99") : localUtil.format( AV31SalExKgE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexkge_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexkge_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexmte_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexmte_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexmte_Internalname, GXutil.ltrim( localUtil.ntoc( AV32SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexmte_Enabled!=0) ? localUtil.format( AV32SalExMtE, "ZZZZZ9.99") : localUtil.format( AV32SalExMtE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexmte_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexmte_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexobs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexobs_Internalname, GXutil.rtrim( AV34SalExObs), GXutil.rtrim( localUtil.format( AV34SalExObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexobs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdscmn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdscmn_Internalname, httpContext.getMessage( "Descripcion Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdscmn_Internalname, GXutil.rtrim( AV49FasDscMn), GXutil.rtrim( localUtil.format( AV49FasDscMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdscmn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdscmn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnfase1_Internalname, "", httpContext.getMessage( "1 Fase", ""), bttBtnfase1_Jsonclick, 5, httpContext.getMessage( "1 Fase", ""), "", StyleString, ClassString, 1, bttBtnfase1_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOFASE1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "n Fases", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "n Fases", ""), "", StyleString, ClassString, 1, bttBtnuseraction1_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiar_Internalname, "", httpContext.getMessage( "Limpiar variables", ""), bttBtnlimpiar_Jsonclick, 5, httpContext.getMessage( "Limpiar variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajoExterno_Detail__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV12CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV10BarSer), GXutil.rtrim( localUtil.format( AV10BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV8BarColNom), GXutil.rtrim( localUtil.format( AV8BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV9BarNomCli), GXutil.rtrim( localUtil.format( AV9BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarunimed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarunimed_Internalname, httpContext.getMessage( "U", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarunimed_Internalname, GXutil.rtrim( AV48barunimed), GXutil.rtrim( localUtil.format( AV48barunimed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarunimed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarunimed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExhdpz_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExhdpz_Internalname, httpContext.getMessage( "EXHDPZ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExhdpz_Internalname, GXutil.ltrim( localUtil.ntoc( AV45EXHDPZ, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExhdpz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45EXHDPZ), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45EXHDPZ), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExhdpz_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExhdpz_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         wb_table1_145_29K2( true) ;
      }
      else
      {
         wb_table1_145_29K2( false) ;
      }
      return  ;
   }

   public void wb_table1_145_29K2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV52Pgmname), GXutil.rtrim( localUtil.format( AV52Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashycomunicarat_Internalname, "", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashycomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashycomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHYCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajoExterno_Detail__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajoExterno_Detail__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0172"+"", GXutil.rtrim( WebComp_Wctrabajoexterno_detail__wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0172"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWctrabajoexterno_detail__wc), GXutil.lower( WebComp_Wctrabajoexterno_detail__wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0172"+"");
               }
               WebComp_Wctrabajoexterno_detail__wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWctrabajoexterno_detail__wc), GXutil.lower( WebComp_Wctrabajoexterno_detail__wc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVarpanel_Internalname, GXutil.ltrim( localUtil.ntoc( AV47varpanel, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47varpanel), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVarpanel_Jsonclick, 0, "Attribute", "", "", "", "", edtavVarpanel_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajoExterno_Detail__WP.htm");
         wb_table2_177_29K2( true) ;
      }
      else
      {
         wb_table2_177_29K2( false) ;
      }
      return  ;
   }

   public void wb_table2_177_29K2e( boolean wbgen )
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

   public void start29K2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Trabajo Externo ( Detail )", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29K0( ) ;
   }

   public void ws29K2( )
   {
      start29K2( ) ;
      evt29K2( ) ;
   }

   public void evt29K2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1129K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1229K2 ();
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
                                 e1329K2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHYCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoHashyComunicarAT' */
                           e1429K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1529K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOFASE1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoFase1' */
                           e1629K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e1729K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiar' */
                           e1829K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e1929K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2029K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSALEXNLN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2129K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSALEXNLN.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2229K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2329K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFASCODN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2429K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VORDLIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2529K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e2629K2 ();
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
                     if ( nCmpId == 172 )
                     {
                        OldWctrabajoexterno_detail__wc = httpContext.cgiGet( "W0172") ;
                        if ( ( GXutil.len( OldWctrabajoexterno_detail__wc) == 0 ) || ( GXutil.strcmp(OldWctrabajoexterno_detail__wc, WebComp_Wctrabajoexterno_detail__wc_Component) != 0 ) )
                        {
                           WebComp_Wctrabajoexterno_detail__wc = WebUtils.getWebComponent(getClass(), "app." + OldWctrabajoexterno_detail__wc + "_impl", remoteHandle, context);
                           WebComp_Wctrabajoexterno_detail__wc_Component = OldWctrabajoexterno_detail__wc ;
                        }
                        if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
                        {
                           WebComp_Wctrabajoexterno_detail__wc.componentprocess("W0172", "", sEvt);
                        }
                        WebComp_Wctrabajoexterno_detail__wc_Component = OldWctrabajoexterno_detail__wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29K2( )
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

   public void pa29K2( )
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
            GX_FocusControl = edtavSalexnln_Internalname ;
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
      rf29K2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV52Pgmname = "TrabajoExterno_Detail__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_err = (short)(0) ;
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavSalcodeid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalcodeid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalcodeid_Enabled), 5, 0), true);
      edtavSalenvat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalenvat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalenvat_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavExhdpz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExhdpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExhdpz_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29K2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1929K2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
            {
               WebComp_Wctrabajoexterno_detail__wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e2629K2 ();
         wb29K0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29K2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSALFHH", localUtil.ttoc( AV37SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALFHH", getSecureSignedToken( "", localUtil.format( AV37SalFhh, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASHIN", AV18HashIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASHIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18HashIN, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOKIN", AV25okIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOKIN", getSecureSignedToken( "", AV25okIN));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSONIN", AV23Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSONIN", getSecureSignedToken( "", AV23Messages_jsonIN));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV11Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV17Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Hash, ""))));
   }

   public void before_start_formulas( )
   {
      AV52Pgmname = "TrabajoExterno_Detail__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_err = (short)(0) ;
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavSalcodeid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalcodeid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalcodeid_Enabled), 5, 0), true);
      edtavSalenvat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalenvat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalenvat_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavExhdpz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExhdpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExhdpz_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29K0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1229K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexnln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexnln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXNLN");
            GX_FocusControl = edtavSalexnln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33SalExNln = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
         }
         else
         {
            AV33SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtavSalexnln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         }
         else
         {
            AV5BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         }
         AV27Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         }
         else
         {
            AV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         }
         AV6BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
         AV15FasCodn = GXutil.upper( httpContext.cgiGet( edtavFascodn_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vORDLIN");
            GX_FocusControl = edtavOrdlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26OrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
         }
         else
         {
            AV26OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavOrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXCOE");
            GX_FocusControl = edtavSalexcoe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30SalExCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
         }
         else
         {
            AV30SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXKGE");
            GX_FocusControl = edtavSalexkge_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31SalExKgE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
         }
         else
         {
            AV31SalExKgE = localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXMTE");
            GX_FocusControl = edtavSalexmte_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32SalExMtE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
         }
         else
         {
            AV32SalExMtE = localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
         }
         AV34SalExObs = httpContext.cgiGet( edtavSalexobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
         AV49FasDscMn = httpContext.cgiGet( edtavFasdscmn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
         }
         else
         {
            AV12CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
         }
         AV10BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
         AV8BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
         AV9BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
         AV48barunimed = GXutil.upper( httpContext.cgiGet( edtavBarunimed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48barunimed", AV48barunimed);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavExhdpz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavExhdpz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXHDPZ");
            GX_FocusControl = edtavExhdpz_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45EXHDPZ = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45EXHDPZ", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45EXHDPZ), 4, 0));
         }
         else
         {
            AV45EXHDPZ = (short)(localUtil.ctol( httpContext.cgiGet( edtavExhdpz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45EXHDPZ", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45EXHDPZ), 4, 0));
         }
         AV52Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVarpanel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVarpanel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVARPANEL");
            GX_FocusControl = edtavVarpanel_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47varpanel = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47varpanel", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47varpanel), 4, 0));
         }
         else
         {
            AV47varpanel = (short)(localUtil.ctol( httpContext.cgiGet( edtavVarpanel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47varpanel", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47varpanel), 4, 0));
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
      e1229K2 ();
      if (returnInSub) return;
   }

   public void e1229K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV47varpanel = (short)(((GXutil.strcmp("", AV28SalCodeID)==0)&&(0==AV29SalEnvAT) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47varpanel", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47varpanel), 4, 0));
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_detail__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = AV13Emprcod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char2[0] ;
      trabajoexterno_detail__wp_impl.this.AV14EmprNom = GXv_char3[0] ;
      trabajoexterno_detail__wp_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtavVarpanel_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarpanel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarpanel_Visible), 5, 0), true);
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV27Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV27Prompt)==0) ? AV53Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV27Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV27Prompt), true);
      AV53Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV27Prompt)==0) ? AV53Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV27Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV27Prompt), true);
      bttBtnenter_Enabled = ((!(GXutil.strcmp("", AV28SalCodeID)==0)||(AV29SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      bttBtnhashycomunicarat_Enabled = ((!(GXutil.strcmp("", AV28SalCodeID)==0)||(AV29SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashycomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashycomunicarat_Enabled), 5, 0), true);
      bttBtnfase1_Enabled = ((!(GXutil.strcmp("", AV28SalCodeID)==0)||(AV29SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnfase1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnfase1_Enabled), 5, 0), true);
      bttBtnuseraction1_Enabled = ((!(GXutil.strcmp("", AV28SalCodeID)==0)||(AV29SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnuseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnuseraction1_Enabled), 5, 0), true);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wctrabajoexterno_detail__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wctrabajoexterno_detail__wc_Component), GXutil.lower( "TrabajoExterno_Detail___WC")) != 0 )
      {
         WebComp_Wctrabajoexterno_detail__wc = WebUtils.getWebComponent(getClass(), "app.trabajoexterno_detail___wc_impl", remoteHandle, context);
         WebComp_Wctrabajoexterno_detail__wc_Component = "TrabajoExterno_Detail___WC" ;
      }
      if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
      {
         WebComp_Wctrabajoexterno_detail__wc.setjustcreated();
         WebComp_Wctrabajoexterno_detail__wc.componentprepare(new Object[] {"W0172","",AV13Emprcod,Integer.valueOf(AV35SalExtAlb),AV36SalExtFec,AV37SalFhh,Short.valueOf(AV19ManCod),AV20ManNom,AV28SalCodeID,Byte.valueOf(AV29SalEnvAT),AV18HashIN,Boolean.valueOf(AV25okIN),AV23Messages_jsonIN});
         WebComp_Wctrabajoexterno_detail__wc.componentbind(new Object[] {"","vSALEXTALB","","","vMANCOD","vMANNOM","vSALCODEID","vSALENVAT","","",""});
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1329K2 ();
      if (returnInSub) return;
   }

   public void e1329K2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV28SalCodeID)==0) || ( AV29SalEnvAT == 3 ) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Linea invalida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavSalexnln_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV33SalExNln) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Linea invalida", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavSalexnln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (0==AV5BarCod) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Falta Nº Hdr", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (0==AV26OrdLin) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Falta Orden", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  httpContext.doAjaxRefresh();
                  GX_FocusControl = edtavOrdlin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( (GXutil.strcmp("", AV15FasCodn)==0) )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Falta Fase", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     httpContext.doAjaxRefresh();
                     GX_FocusControl = edtavFascodn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( AV31SalExKgE.doubleValue() == 0 ) && ( AV32SalExMtE.doubleValue() == 0 ) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "Faltan Kilos y/o Metros", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        httpContext.doAjaxRefresh();
                        GX_FocusControl = edtavSalexkge_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV48barunimed, "K") == 0 ) && ( AV31SalExKgE.doubleValue() == 0 ) )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "La unidad de la HDR es K,Faltan Kilos", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           httpContext.doAjaxRefresh();
                           GX_FocusControl = edtavSalexkge_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           if ( ( GXutil.strcmp(AV48barunimed, "M") == 0 ) && ( AV32SalExMtE.doubleValue() == 0 ) )
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "La unidad de la HDR es M,Faltan Metros", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              httpContext.doAjaxRefresh();
                              GX_FocusControl = edtavSalexmte_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              GXv_char4[0] = AV13Emprcod ;
                              GXv_int5[0] = AV5BarCod ;
                              GXv_int6[0] = AV7BarCodReo ;
                              GXv_char3[0] = AV6BarCodPar ;
                              GXv_char2[0] = AV15FasCodn ;
                              GXv_char7[0] = AV46msgerr ;
                              new app.pfasanx(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char7) ;
                              trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char4[0] ;
                              trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int5[0] ;
                              trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int6[0] ;
                              trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char3[0] ;
                              trabajoexterno_detail__wp_impl.this.AV15FasCodn = GXv_char2[0] ;
                              trabajoexterno_detail__wp_impl.this.AV46msgerr = GXv_char7[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
                              httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
                              httpContext.ajax_rsp_assign_attri("", false, "AV46msgerr", AV46msgerr);
                              if ( ! (GXutil.strcmp("", AV46msgerr)==0) )
                              {
                                 lblTbmessage_Caption = AV46msgerr ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                 httpContext.doAjaxRefresh();
                                 GX_FocusControl = edtavFascodn_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 httpContext.doAjaxSetFocus(GX_FocusControl);
                              }
                              else
                              {
                                 GXv_char7[0] = AV13Emprcod ;
                                 GXv_int5[0] = AV5BarCod ;
                                 GXv_int6[0] = AV7BarCodReo ;
                                 GXv_char4[0] = AV6BarCodPar ;
                                 GXv_int8[0] = (byte)(AV43flaghdr) ;
                                 new app.pexihdr(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int6, GXv_char4, GXv_int8) ;
                                 trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char7[0] ;
                                 trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int5[0] ;
                                 trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int6[0] ;
                                 trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char4[0] ;
                                 trabajoexterno_detail__wp_impl.this.AV43flaghdr = GXv_int8[0] ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV43flaghdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43flaghdr), 4, 0));
                                 if ( (0==AV43flaghdr) )
                                 {
                                    lblTbmessage_Caption = httpContext.getMessage( "NO existe Nº Hdr", "") ;
                                    httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                    httpContext.doAjaxRefresh();
                                    GX_FocusControl = edtavBarcod_Internalname ;
                                    httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                    httpContext.doAjaxSetFocus(GX_FocusControl);
                                 }
                                 else
                                 {
                                    GXv_char7[0] = AV13Emprcod ;
                                    GXv_int5[0] = AV5BarCod ;
                                    GXv_int8[0] = AV7BarCodReo ;
                                    GXv_char4[0] = AV6BarCodPar ;
                                    GXv_int9[0] = AV26OrdLin ;
                                    GXv_char3[0] = AV46msgerr ;
                                    new app.trabajosexternos.pexorden(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int8, GXv_char4, GXv_int9, GXv_char3) ;
                                    trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char7[0] ;
                                    trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int5[0] ;
                                    trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int8[0] ;
                                    trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char4[0] ;
                                    trabajoexterno_detail__wp_impl.this.AV26OrdLin = GXv_int9[0] ;
                                    trabajoexterno_detail__wp_impl.this.AV46msgerr = GXv_char3[0] ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
                                    httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
                                    httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
                                    httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
                                    httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
                                    httpContext.ajax_rsp_assign_attri("", false, "AV46msgerr", AV46msgerr);
                                    if ( ! (GXutil.strcmp("", AV46msgerr)==0) )
                                    {
                                       lblTbmessage_Caption = AV46msgerr ;
                                       httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                       httpContext.doAjaxRefresh();
                                       GX_FocusControl = edtavBarcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                       httpContext.doAjaxSetFocus(GX_FocusControl);
                                    }
                                    else
                                    {
                                       GXv_int8[0] = AV44BarSit ;
                                       new app.phdrsituacion(remoteHandle, context).execute( AV13Emprcod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, GXv_int8) ;
                                       trabajoexterno_detail__wp_impl.this.AV44BarSit = GXv_int8[0] ;
                                       httpContext.ajax_rsp_assign_attri("", false, "AV44BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarSit), 2, 0));
                                       if ( AV44BarSit >= 9 )
                                       {
                                          lblTbmessage_Caption = httpContext.getMessage( "Nº Hdr CERRADA", "") ;
                                          httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                          httpContext.doAjaxRefresh();
                                          GX_FocusControl = edtavBarcod_Internalname ;
                                          httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                          httpContext.doAjaxSetFocus(GX_FocusControl);
                                       }
                                       else
                                       {
                                          this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                                       }
                                    }
                                 }
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

   public void e1129K2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1429K2( )
   {
      /* 'DoHashyComunicarAT' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_diahorasalida_hash_xml", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV35SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV36SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV37SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV11Cadena)),GXutil.URLEncode(GXutil.rtrim(AV17Hash))}, new String[] {"EmprCod","SalExtAlb","SalExtFec","SalFhh","Cadena","Hash"}) , new Object[] {});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e1529K2( )
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

   public void e1629K2( )
   {
      /* 'DoFase1' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV5BarCod == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hay HDR", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_fase_una", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV26OrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV15FasCodn))}, new String[] {"InOutEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InOutBarOrdLin","InOutFascod"}) , new Object[] {"AV13Emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar","AV26OrdLin","AV15FasCodn"});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e1729K2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV5BarCod == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hay Hdr", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV31SalExKgE.doubleValue() == 0 ) && ( AV32SalExMtE.doubleValue() == 0 ) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Faltan Kilos y/o Metros", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavSalexkge_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_fase_n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV35SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19ManCod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV36SalExtFec)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV30SalExCoE,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV31SalExKgE)),GXutil.URLEncode(DecimalUtil.decToString(AV32SalExMtE)),GXutil.URLEncode(GXutil.rtrim(AV48barunimed))}, new String[] {"Emprcod","SalExtAlb","Mancod","SalExtFec","Barcod","Barcodreo","Barcodpar","SalExCoEIN","SalExKgEIN","SalExMtEIN","barunimed"}) , new Object[] {});
            lblTbmessage_Caption = " " ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            /* Object Property */
            if ( true )
            {
               bDynCreated_Wctrabajoexterno_detail__wc = true ;
            }
            if ( GXutil.strcmp(GXutil.lower( WebComp_Wctrabajoexterno_detail__wc_Component), GXutil.lower( "TrabajoExterno_Detail___WC")) != 0 )
            {
               WebComp_Wctrabajoexterno_detail__wc = WebUtils.getWebComponent(getClass(), "app.trabajoexterno_detail___wc_impl", remoteHandle, context);
               WebComp_Wctrabajoexterno_detail__wc_Component = "TrabajoExterno_Detail___WC" ;
            }
            if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
            {
               WebComp_Wctrabajoexterno_detail__wc.setjustcreated();
               WebComp_Wctrabajoexterno_detail__wc.componentprepare(new Object[] {"W0172","",AV13Emprcod,Integer.valueOf(AV35SalExtAlb),AV36SalExtFec,AV37SalFhh,Short.valueOf(AV19ManCod),AV20ManNom,AV28SalCodeID,Byte.valueOf(AV29SalEnvAT),AV18HashIN,Boolean.valueOf(AV25okIN),AV23Messages_jsonIN});
               WebComp_Wctrabajoexterno_detail__wc.componentbind(new Object[] {"","vSALEXTALB","","","vMANCOD","vMANNOM","vSALCODEID","vSALENVAT","","",""});
            }
            if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wctrabajoexterno_detail__wc )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0172"+"");
               WebComp_Wctrabajoexterno_detail__wc.componentdraw();
               httpContext.ajax_rspEndCmp();
            }
            httpContext.doAjaxRefreshCmp("W0172"+"");
            AV33SalExNln = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
            AV5BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
            AV7BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
            AV6BarCodPar = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
            AV34SalExObs = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
            AV31SalExKgE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
            AV30SalExCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
            AV32SalExMtE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
            AV15FasCodn = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
            AV26OrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
            AV34SalExObs = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
            AV12CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
            AV10BarSer = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
            AV8BarColNom = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
            AV9BarNomCli = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
            GX_FocusControl = edtavSalexnln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV49FasDscMn = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1829K2( )
   {
      /* 'DoLimpiar' Routine */
      returnInSub = false ;
      AV33SalExNln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
      AV5BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV7BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV6BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      AV34SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
      AV31SalExKgE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
      AV30SalExCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
      AV32SalExMtE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
      AV15FasCodn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
      AV26OrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
      AV34SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
      AV12CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
      AV10BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
      AV8BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
      AV9BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
      AV41SalExKgEold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41SalExKgEold", GXutil.ltrimstr( AV41SalExKgEold, 9, 2));
      AV42SalExMtEold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42SalExMtEold", GXutil.ltrimstr( AV42SalExMtEold, 9, 2));
      AV40SalExCoEold = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40SalExCoEold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40SalExCoEold), 6, 0));
      AV49FasDscMn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wctrabajoexterno_detail__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wctrabajoexterno_detail__wc_Component), GXutil.lower( "TrabajoExterno_Detail___WC")) != 0 )
      {
         WebComp_Wctrabajoexterno_detail__wc = WebUtils.getWebComponent(getClass(), "app.trabajoexterno_detail___wc_impl", remoteHandle, context);
         WebComp_Wctrabajoexterno_detail__wc_Component = "TrabajoExterno_Detail___WC" ;
      }
      if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
      {
         WebComp_Wctrabajoexterno_detail__wc.setjustcreated();
         WebComp_Wctrabajoexterno_detail__wc.componentprepare(new Object[] {"W0172","",AV13Emprcod,Integer.valueOf(AV35SalExtAlb),AV36SalExtFec,AV37SalFhh,Short.valueOf(AV19ManCod),AV20ManNom,AV28SalCodeID,Byte.valueOf(AV29SalEnvAT),AV18HashIN,Boolean.valueOf(AV25okIN),AV23Messages_jsonIN});
         WebComp_Wctrabajoexterno_detail__wc.componentbind(new Object[] {"","vSALEXTALB","","","vMANCOD","vMANNOM","vSALCODEID","vSALENVAT","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wctrabajoexterno_detail__wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0172"+"");
         WebComp_Wctrabajoexterno_detail__wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      GX_FocusControl = edtavSalexnln_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      if ( AV45EXHDPZ == 0 )
      {
         new app.trabajosexternos.trabajoexterno_detail_ins(remoteHandle, context).execute( AV13Emprcod, AV35SalExtAlb, AV33SalExNln, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV34SalExObs, GXutil.today( ), AV31SalExKgE, AV30SalExCoE, AV32SalExMtE, AV15FasCodn, AV26OrdLin, AV49FasDscMn) ;
         GXv_char7[0] = AV13Emprcod ;
         GXv_int9[0] = AV19ManCod ;
         GXv_int5[0] = AV35SalExtAlb ;
         GXv_int10[0] = AV33SalExNln ;
         GXv_date11[0] = GXutil.today( ) ;
         GXv_int12[0] = AV5BarCod ;
         GXv_int8[0] = AV7BarCodReo ;
         GXv_char4[0] = AV6BarCodPar ;
         GXv_int13[0] = AV26OrdLin ;
         GXv_char3[0] = AV15FasCodn ;
         GXv_decimal14[0] = AV31SalExKgE ;
         GXv_decimal15[0] = AV32SalExMtE ;
         GXv_int16[0] = AV30SalExCoE ;
         new app.trabajosexternos.pwork01(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int5, GXv_int10, GXv_date11, GXv_int12, GXv_int8, GXv_char4, GXv_int13, GXv_char3, GXv_decimal14, GXv_decimal15, GXv_int16) ;
         trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char7[0] ;
         trabajoexterno_detail__wp_impl.this.AV19ManCod = GXv_int9[0] ;
         trabajoexterno_detail__wp_impl.this.AV35SalExtAlb = GXv_int5[0] ;
         trabajoexterno_detail__wp_impl.this.AV33SalExNln = GXv_int10[0] ;
         trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int12[0] ;
         trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int8[0] ;
         trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char4[0] ;
         trabajoexterno_detail__wp_impl.this.AV26OrdLin = GXv_int13[0] ;
         trabajoexterno_detail__wp_impl.this.AV15FasCodn = GXv_char3[0] ;
         trabajoexterno_detail__wp_impl.this.AV31SalExKgE = GXv_decimal14[0] ;
         trabajoexterno_detail__wp_impl.this.AV32SalExMtE = GXv_decimal15[0] ;
         trabajoexterno_detail__wp_impl.this.AV30SalExCoE = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
      }
      else
      {
         new app.upd_exhdpz(remoteHandle, context).execute( AV13Emprcod, AV35SalExtAlb, AV33SalExNln, AV31SalExKgE, AV30SalExCoE, AV32SalExMtE, AV41SalExKgEold, AV40SalExCoEold, AV42SalExMtEold, AV34SalExObs, AV49FasDscMn) ;
         GXv_char7[0] = AV13Emprcod ;
         GXv_int13[0] = AV19ManCod ;
         GXv_char4[0] = AV15FasCodn ;
         GXv_char3[0] = httpContext.getMessage( "E", "") ;
         GXv_int16[0] = AV35SalExtAlb ;
         GXv_int12[0] = AV5BarCod ;
         GXv_int8[0] = AV7BarCodReo ;
         GXv_char2[0] = AV6BarCodPar ;
         GXv_decimal15[0] = AV31SalExKgE ;
         GXv_decimal14[0] = AV41SalExKgEold ;
         GXv_decimal17[0] = AV32SalExMtE ;
         GXv_decimal18[0] = AV42SalExMtEold ;
         GXv_int10[0] = (short)(AV30SalExCoE) ;
         GXv_int9[0] = (short)(AV40SalExCoEold) ;
         GXv_date11[0] = AV36SalExtFec ;
         GXv_int19[0] = AV33SalExNln ;
         new app.pmmvexhd(remoteHandle, context).execute( GXv_char7, GXv_int13, GXv_char4, GXv_char3, GXv_int16, GXv_int12, GXv_int8, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal17, GXv_decimal18, GXv_int10, GXv_int9, GXv_date11, GXv_int19) ;
         trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char7[0] ;
         trabajoexterno_detail__wp_impl.this.AV19ManCod = GXv_int13[0] ;
         trabajoexterno_detail__wp_impl.this.AV15FasCodn = GXv_char4[0] ;
         trabajoexterno_detail__wp_impl.this.AV35SalExtAlb = GXv_int16[0] ;
         trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int12[0] ;
         trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int8[0] ;
         trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char2[0] ;
         trabajoexterno_detail__wp_impl.this.AV31SalExKgE = GXv_decimal15[0] ;
         trabajoexterno_detail__wp_impl.this.AV41SalExKgEold = GXv_decimal14[0] ;
         trabajoexterno_detail__wp_impl.this.AV32SalExMtE = GXv_decimal17[0] ;
         trabajoexterno_detail__wp_impl.this.AV42SalExMtEold = GXv_decimal18[0] ;
         trabajoexterno_detail__wp_impl.this.AV30SalExCoE = GXv_int10[0] ;
         trabajoexterno_detail__wp_impl.this.AV40SalExCoEold = GXv_int9[0] ;
         trabajoexterno_detail__wp_impl.this.AV36SalExtFec = GXv_date11[0] ;
         trabajoexterno_detail__wp_impl.this.AV33SalExNln = GXv_int19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "AV35SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV41SalExKgEold", GXutil.ltrimstr( AV41SalExKgEold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV42SalExMtEold", GXutil.ltrimstr( AV42SalExMtEold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40SalExCoEold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40SalExCoEold), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36SalExtFec", localUtil.format(AV36SalExtFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
         GXv_char7[0] = AV13Emprcod ;
         GXv_int19[0] = AV19ManCod ;
         GXv_int16[0] = AV35SalExtAlb ;
         GXv_int13[0] = AV33SalExNln ;
         GXv_date11[0] = AV36SalExtFec ;
         GXv_int12[0] = AV5BarCod ;
         GXv_int8[0] = AV7BarCodReo ;
         GXv_char4[0] = AV6BarCodPar ;
         GXv_int10[0] = AV26OrdLin ;
         GXv_char3[0] = AV15FasCodn ;
         GXv_decimal18[0] = AV31SalExKgE ;
         GXv_decimal17[0] = AV32SalExMtE ;
         GXv_int5[0] = AV30SalExCoE ;
         new app.pwork11(remoteHandle, context).execute( GXv_char7, GXv_int19, GXv_int16, GXv_int13, GXv_date11, GXv_int12, GXv_int8, GXv_char4, GXv_int10, GXv_char3, GXv_decimal18, GXv_decimal17, GXv_int5) ;
         trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char7[0] ;
         trabajoexterno_detail__wp_impl.this.AV19ManCod = GXv_int19[0] ;
         trabajoexterno_detail__wp_impl.this.AV35SalExtAlb = GXv_int16[0] ;
         trabajoexterno_detail__wp_impl.this.AV33SalExNln = GXv_int13[0] ;
         trabajoexterno_detail__wp_impl.this.AV36SalExtFec = GXv_date11[0] ;
         trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int12[0] ;
         trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int8[0] ;
         trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char4[0] ;
         trabajoexterno_detail__wp_impl.this.AV26OrdLin = GXv_int10[0] ;
         trabajoexterno_detail__wp_impl.this.AV15FasCodn = GXv_char3[0] ;
         trabajoexterno_detail__wp_impl.this.AV31SalExKgE = GXv_decimal18[0] ;
         trabajoexterno_detail__wp_impl.this.AV32SalExMtE = GXv_decimal17[0] ;
         trabajoexterno_detail__wp_impl.this.AV30SalExCoE = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36SalExtFec", localUtil.format(AV36SalExtFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
      }
      AV33SalExNln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
      AV5BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV7BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV6BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
      AV34SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
      AV31SalExKgE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
      AV30SalExCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
      AV32SalExMtE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
      AV15FasCodn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
      AV26OrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
      AV34SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
      AV12CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
      AV10BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
      AV8BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
      AV9BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
      AV41SalExKgEold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41SalExKgEold", GXutil.ltrimstr( AV41SalExKgEold, 9, 2));
      AV42SalExMtEold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42SalExMtEold", GXutil.ltrimstr( AV42SalExMtEold, 9, 2));
      AV40SalExCoEold = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40SalExCoEold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40SalExCoEold), 6, 0));
      AV49FasDscMn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wctrabajoexterno_detail__wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wctrabajoexterno_detail__wc_Component), GXutil.lower( "TrabajoExterno_Detail___WC")) != 0 )
      {
         WebComp_Wctrabajoexterno_detail__wc = WebUtils.getWebComponent(getClass(), "app.trabajoexterno_detail___wc_impl", remoteHandle, context);
         WebComp_Wctrabajoexterno_detail__wc_Component = "TrabajoExterno_Detail___WC" ;
      }
      if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
      {
         WebComp_Wctrabajoexterno_detail__wc.setjustcreated();
         WebComp_Wctrabajoexterno_detail__wc.componentprepare(new Object[] {"W0172","",AV13Emprcod,Integer.valueOf(AV35SalExtAlb),AV36SalExtFec,AV37SalFhh,Short.valueOf(AV19ManCod),AV20ManNom,AV28SalCodeID,Byte.valueOf(AV29SalEnvAT),AV18HashIN,Boolean.valueOf(AV25okIN),AV23Messages_jsonIN});
         WebComp_Wctrabajoexterno_detail__wc.componentbind(new Object[] {"","vSALEXTALB","","","vMANCOD","vMANNOM","vSALCODEID","vSALENVAT","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wctrabajoexterno_detail__wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0172"+"");
         WebComp_Wctrabajoexterno_detail__wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      GX_FocusControl = edtavSalexnln_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( AV47varpanel == 1 ) ) )
      {
         divDvpanel_tableheader_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableheader_cell_Internalname, "Class", divDvpanel_tableheader_cell_Class, true);
      }
      else
      {
         divDvpanel_tableheader_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableheader_cell_Internalname, "Class", divDvpanel_tableheader_cell_Class, true);
      }
   }

   public void e1929K2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int20 = AV33SalExNln ;
      GXv_int19[0] = GXt_int20 ;
      new app.trabajosexternos.trabajoexterno_prxid(remoteHandle, context).execute( AV13Emprcod, AV35SalExtAlb, GXv_int19) ;
      trabajoexterno_detail__wp_impl.this.GXt_int20 = GXv_int19[0] ;
      AV33SalExNln = GXt_int20 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "InvertGridMenu", "", new Object[] {httpContext.getMessage( ".dropdown-menu", "")});
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      /*  Sending Event outputs  */
   }

   public void e2029K2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(6,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV13Emprcod","AV5BarCod","AV7BarCodReo","AV6BarCodPar","",""});
      GXv_char7[0] = AV8BarColNom ;
      GXv_char4[0] = AV9BarNomCli ;
      GXv_int16[0] = AV12CliCod ;
      GXv_char3[0] = AV10BarSer ;
      GXv_int12[0] = AV30SalExCoE ;
      GXv_decimal18[0] = AV31SalExKgE ;
      GXv_decimal17[0] = AV32SalExMtE ;
      GXv_char2[0] = AV48barunimed ;
      new app.trabajosexternos.trabajoexterno_pzs_kgs_mts_masdatos(remoteHandle, context).execute( AV13Emprcod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, GXv_char7, GXv_char4, GXv_int16, GXv_char3, GXv_int12, GXv_decimal18, GXv_decimal17, GXv_char2) ;
      trabajoexterno_detail__wp_impl.this.AV8BarColNom = GXv_char7[0] ;
      trabajoexterno_detail__wp_impl.this.AV9BarNomCli = GXv_char4[0] ;
      trabajoexterno_detail__wp_impl.this.AV12CliCod = GXv_int16[0] ;
      trabajoexterno_detail__wp_impl.this.AV10BarSer = GXv_char3[0] ;
      trabajoexterno_detail__wp_impl.this.AV30SalExCoE = GXv_int12[0] ;
      trabajoexterno_detail__wp_impl.this.AV31SalExKgE = GXv_decimal18[0] ;
      trabajoexterno_detail__wp_impl.this.AV32SalExMtE = GXv_decimal17[0] ;
      trabajoexterno_detail__wp_impl.this.AV48barunimed = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV48barunimed", AV48barunimed);
      /*  Sending Event outputs  */
   }

   public void e2129K2( )
   {
      /* Salexnln_Isvalid Routine */
      returnInSub = false ;
      edtavBarcod_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavFascodn_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascodn_Enabled), 5, 0), true);
      edtavOrdlin_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOrdlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOrdlin_Enabled), 5, 0), true);
      imgavPrompt_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgavPrompt_Enabled), 5, 0), true);
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV33SalExNln) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Linea invalida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavSalexnln_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_int16[0] = AV5BarCod ;
         GXv_int8[0] = AV7BarCodReo ;
         GXv_char7[0] = AV6BarCodPar ;
         GXv_char4[0] = AV15FasCodn ;
         GXv_int19[0] = AV26OrdLin ;
         GXv_int12[0] = AV30SalExCoE ;
         GXv_decimal18[0] = AV31SalExKgE ;
         GXv_decimal17[0] = AV32SalExMtE ;
         GXv_char3[0] = AV34SalExObs ;
         GXv_int5[0] = AV12CliCod ;
         GXv_char2[0] = AV10BarSer ;
         GXv_char21[0] = AV8BarColNom ;
         GXv_char22[0] = AV9BarNomCli ;
         GXv_int23[0] = AV40SalExCoEold ;
         GXv_decimal15[0] = AV41SalExKgEold ;
         GXv_decimal14[0] = AV42SalExMtEold ;
         GXv_int6[0] = AV44BarSit ;
         GXv_char24[0] = AV48barunimed ;
         GXv_int13[0] = AV45EXHDPZ ;
         GXv_char25[0] = AV49FasDscMn ;
         new app.trabajoexterno_detail__obtengodatolinea(remoteHandle, context).execute( AV13Emprcod, AV35SalExtAlb, AV33SalExNln, GXv_int16, GXv_int8, GXv_char7, GXv_char4, GXv_int19, GXv_int12, GXv_decimal18, GXv_decimal17, GXv_char3, GXv_int5, GXv_char2, GXv_char21, GXv_char22, GXv_int23, GXv_decimal15, GXv_decimal14, GXv_int6, GXv_char24, GXv_int13, GXv_char25) ;
         trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int16[0] ;
         trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int8[0] ;
         trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char7[0] ;
         trabajoexterno_detail__wp_impl.this.AV15FasCodn = GXv_char4[0] ;
         trabajoexterno_detail__wp_impl.this.AV26OrdLin = GXv_int19[0] ;
         trabajoexterno_detail__wp_impl.this.AV30SalExCoE = GXv_int12[0] ;
         trabajoexterno_detail__wp_impl.this.AV31SalExKgE = GXv_decimal18[0] ;
         trabajoexterno_detail__wp_impl.this.AV32SalExMtE = GXv_decimal17[0] ;
         trabajoexterno_detail__wp_impl.this.AV34SalExObs = GXv_char3[0] ;
         trabajoexterno_detail__wp_impl.this.AV12CliCod = GXv_int5[0] ;
         trabajoexterno_detail__wp_impl.this.AV10BarSer = GXv_char2[0] ;
         trabajoexterno_detail__wp_impl.this.AV8BarColNom = GXv_char21[0] ;
         trabajoexterno_detail__wp_impl.this.AV9BarNomCli = GXv_char22[0] ;
         trabajoexterno_detail__wp_impl.this.AV40SalExCoEold = GXv_int23[0] ;
         trabajoexterno_detail__wp_impl.this.AV41SalExKgEold = GXv_decimal15[0] ;
         trabajoexterno_detail__wp_impl.this.AV42SalExMtEold = GXv_decimal14[0] ;
         trabajoexterno_detail__wp_impl.this.AV44BarSit = GXv_int6[0] ;
         trabajoexterno_detail__wp_impl.this.AV48barunimed = GXv_char24[0] ;
         trabajoexterno_detail__wp_impl.this.AV45EXHDPZ = GXv_int13[0] ;
         trabajoexterno_detail__wp_impl.this.AV49FasDscMn = GXv_char25[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
         httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
         httpContext.ajax_rsp_assign_attri("", false, "AV40SalExCoEold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40SalExCoEold), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41SalExKgEold", GXutil.ltrimstr( AV41SalExKgEold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV42SalExMtEold", GXutil.ltrimstr( AV42SalExMtEold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV44BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarSit), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48barunimed", AV48barunimed);
         httpContext.ajax_rsp_assign_attri("", false, "AV45EXHDPZ", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45EXHDPZ), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
         if ( AV44BarSit >= 9 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Nº Hdr Cerrada", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            AV33SalExNln = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
            AV5BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
            AV7BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
            AV6BarCodPar = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
            AV34SalExObs = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
            AV31SalExKgE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
            AV30SalExCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
            AV32SalExMtE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
            AV15FasCodn = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FasCodn", AV15FasCodn);
            AV26OrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrdLin), 4, 0));
            AV34SalExObs = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34SalExObs", AV34SalExObs);
            AV12CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
            AV10BarSer = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
            AV8BarColNom = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
            AV9BarNomCli = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
            AV41SalExKgEold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41SalExKgEold", GXutil.ltrimstr( AV41SalExKgEold, 9, 2));
            AV42SalExMtEold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42SalExMtEold", GXutil.ltrimstr( AV42SalExMtEold, 9, 2));
            AV40SalExCoEold = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40SalExCoEold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40SalExCoEold), 6, 0));
            AV49FasDscMn = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavSalexnln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV45EXHDPZ == 1 )
            {
               edtavBarcod_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
               edtavBarcodreo_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
               edtavBarcodpar_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
               edtavFascodn_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFascodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascodn_Enabled), 5, 0), true);
               edtavOrdlin_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavOrdlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOrdlin_Enabled), 5, 0), true);
               imgavPrompt_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgavPrompt_Enabled), 5, 0), true);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e2229K2( )
   {
      /* Salexnln_Click Routine */
      returnInSub = false ;
      GXt_int20 = AV33SalExNln ;
      GXv_int19[0] = GXt_int20 ;
      new app.trabajosexternos.trabajoexterno_prxid(remoteHandle, context).execute( AV13Emprcod, AV35SalExtAlb, GXv_int19) ;
      trabajoexterno_detail__wp_impl.this.GXt_int20 = GXv_int19[0] ;
      AV33SalExNln = GXt_int20 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33SalExNln), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e2329K2( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV5BarCod > 0 )
      {
         GXv_char25[0] = AV13Emprcod ;
         GXv_int23[0] = AV5BarCod ;
         GXv_int8[0] = AV7BarCodReo ;
         GXv_char24[0] = AV6BarCodPar ;
         GXv_int6[0] = (byte)(AV43flaghdr) ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char25, GXv_int23, GXv_int8, GXv_char24, GXv_int6) ;
         trabajoexterno_detail__wp_impl.this.AV13Emprcod = GXv_char25[0] ;
         trabajoexterno_detail__wp_impl.this.AV5BarCod = GXv_int23[0] ;
         trabajoexterno_detail__wp_impl.this.AV7BarCodReo = GXv_int8[0] ;
         trabajoexterno_detail__wp_impl.this.AV6BarCodPar = GXv_char24[0] ;
         trabajoexterno_detail__wp_impl.this.AV43flaghdr = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodPar", AV6BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV43flaghdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43flaghdr), 4, 0));
         if ( (0==AV43flaghdr) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "NO existe Nº Hdr", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV44BarSit >= 9 )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Nº Hdr Cerrada", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXv_char25[0] = AV8BarColNom ;
               GXv_char24[0] = AV9BarNomCli ;
               GXv_int23[0] = AV12CliCod ;
               GXv_char22[0] = AV10BarSer ;
               GXv_int16[0] = AV30SalExCoE ;
               GXv_decimal18[0] = AV31SalExKgE ;
               GXv_decimal17[0] = AV32SalExMtE ;
               GXv_char21[0] = AV48barunimed ;
               new app.trabajosexternos.trabajoexterno_pzs_kgs_mts_masdatos(remoteHandle, context).execute( AV13Emprcod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, GXv_char25, GXv_char24, GXv_int23, GXv_char22, GXv_int16, GXv_decimal18, GXv_decimal17, GXv_char21) ;
               trabajoexterno_detail__wp_impl.this.AV8BarColNom = GXv_char25[0] ;
               trabajoexterno_detail__wp_impl.this.AV9BarNomCli = GXv_char24[0] ;
               trabajoexterno_detail__wp_impl.this.AV12CliCod = GXv_int23[0] ;
               trabajoexterno_detail__wp_impl.this.AV10BarSer = GXv_char22[0] ;
               trabajoexterno_detail__wp_impl.this.AV30SalExCoE = GXv_int16[0] ;
               trabajoexterno_detail__wp_impl.this.AV31SalExKgE = GXv_decimal18[0] ;
               trabajoexterno_detail__wp_impl.this.AV32SalExMtE = GXv_decimal17[0] ;
               trabajoexterno_detail__wp_impl.this.AV48barunimed = GXv_char21[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarColNom", AV8BarColNom);
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarNomCli", AV9BarNomCli);
               httpContext.ajax_rsp_assign_attri("", false, "AV12CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
               httpContext.ajax_rsp_assign_attri("", false, "AV30SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30SalExCoE), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV31SalExKgE", GXutil.ltrimstr( AV31SalExKgE, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV32SalExMtE", GXutil.ltrimstr( AV32SalExMtE, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV48barunimed", AV48barunimed);
            }
         }
      }
      else
      {
         lblTbmessage_Caption = httpContext.getMessage( "Valor no Valido", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTbmessage_Caption = " " ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      /*  Sending Event outputs  */
   }

   public void e2429K2( )
   {
      /* Fascodn_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (GXutil.strcmp("", AV15FasCodn)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta Fase", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavFascodn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXt_char1 = AV49FasDscMn ;
         GXv_char25[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( AV13Emprcod, AV15FasCodn, GXv_char25) ;
         trabajoexterno_detail__wp_impl.this.GXt_char1 = GXv_char25[0] ;
         AV49FasDscMn = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49FasDscMn", AV49FasDscMn);
      }
      /*  Sending Event outputs  */
   }

   public void e2529K2( )
   {
      /* Ordlin_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV26OrdLin == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta Orden", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavOrdlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e2629K2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_177_29K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_177_29K2e( true) ;
      }
      else
      {
         wb_table2_177_29K2e( false) ;
      }
   }

   public void wb_table1_145_29K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_145_29K2e( true) ;
      }
      else
      {
         wb_table1_145_29K2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
      AV35SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35SalExtAlb), 8, 0));
      AV36SalExtFec = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36SalExtFec", localUtil.format(AV36SalExtFec, "99/99/99"));
      AV37SalFhh = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37SalFhh", localUtil.ttoc( AV37SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALFHH", getSecureSignedToken( "", localUtil.format( AV37SalFhh, "99/99/99 99:99")));
      AV19ManCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ManCod), 4, 0));
      AV20ManNom = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ManNom", AV20ManNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20ManNom, ""))));
      AV28SalCodeID = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28SalCodeID", AV28SalCodeID);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28SalCodeID, ""))));
      AV29SalEnvAT = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29SalEnvAT", GXutil.str( AV29SalEnvAT, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29SalEnvAT), "9")));
      AV18HashIN = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18HashIN", AV18HashIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASHIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18HashIN, ""))));
      AV25okIN = ((Boolean) getParm(obj,9)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25okIN", AV25okIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOKIN", getSecureSignedToken( "", AV25okIN));
      AV23Messages_jsonIN = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Messages_jsonIN", AV23Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSONIN", getSecureSignedToken( "", AV23Messages_jsonIN));
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
      pa29K2( ) ;
      ws29K2( ) ;
      we29K2( ) ;
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
      if ( ! ( WebComp_Wctrabajoexterno_detail__wc == null ) )
      {
         if ( GXutil.len( WebComp_Wctrabajoexterno_detail__wc_Component) != 0 )
         {
            WebComp_Wctrabajoexterno_detail__wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016453867", true, true);
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
      httpContext.AddJavascriptSource("trabajoexterno_detail__wp.js", "?202661016453867", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtavSalextalb_Internalname = "vSALEXTALB" ;
      edtavMancod_Internalname = "vMANCOD" ;
      edtavMannom_Internalname = "vMANNOM" ;
      edtavSalcodeid_Internalname = "vSALCODEID" ;
      edtavSalenvat_Internalname = "vSALENVAT" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtavSalexnln_Internalname = "vSALEXNLN" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavFascodn_Internalname = "vFASCODN" ;
      edtavOrdlin_Internalname = "vORDLIN" ;
      edtavSalexcoe_Internalname = "vSALEXCOE" ;
      edtavSalexkge_Internalname = "vSALEXKGE" ;
      edtavSalexmte_Internalname = "vSALEXMTE" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavSalexobs_Internalname = "vSALEXOBS" ;
      edtavFasdscmn_Internalname = "vFASDSCMN" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      bttBtnfase1_Internalname = "BTNFASE1" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      bttBtnlimpiar_Internalname = "BTNLIMPIAR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      edtavExhdpz_Internalname = "vEXHDPZ" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      divDvpanel_tableheader_cell_Internalname = "DVPANEL_TABLEHEADER_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnhashycomunicarat_Internalname = "BTNHASHYCOMUNICARAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavVarpanel_Internalname = "vVARPANEL" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavVarpanel_Jsonclick = "" ;
      edtavVarpanel_Visible = 1 ;
      bttBtnhashycomunicarat_Enabled = 1 ;
      bttBtnenter_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavExhdpz_Jsonclick = "" ;
      edtavExhdpz_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      bttBtnuseraction1_Enabled = 1 ;
      bttBtnfase1_Enabled = 1 ;
      edtavFasdscmn_Jsonclick = "" ;
      edtavFasdscmn_Enabled = 1 ;
      edtavSalexobs_Jsonclick = "" ;
      edtavSalexobs_Enabled = 1 ;
      edtavSalexmte_Jsonclick = "" ;
      edtavSalexmte_Enabled = 1 ;
      edtavSalexkge_Jsonclick = "" ;
      edtavSalexkge_Enabled = 1 ;
      edtavSalexcoe_Jsonclick = "" ;
      edtavSalexcoe_Enabled = 1 ;
      edtavOrdlin_Jsonclick = "" ;
      edtavOrdlin_Enabled = 1 ;
      edtavFascodn_Jsonclick = "" ;
      edtavFascodn_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      imgavPrompt_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      edtavSalexnln_Jsonclick = "" ;
      edtavSalexnln_Enabled = 1 ;
      divDvpanel_tableheader_cell_Class = "col-xs-12" ;
      edtavSalenvat_Jsonclick = "" ;
      edtavSalenvat_Enabled = 0 ;
      edtavSalcodeid_Jsonclick = "" ;
      edtavSalcodeid_Enabled = 0 ;
      edtavMannom_Jsonclick = "" ;
      edtavMannom_Enabled = 0 ;
      edtavMancod_Jsonclick = "" ;
      edtavMancod_Enabled = 0 ;
      edtavSalextalb_Jsonclick = "" ;
      edtavSalextalb_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma la linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = "" ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Trabajo Externo ( Detail )", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV37SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99',hsh:true},{av:'AV18HashIN',fld:'vHASHIN',pic:'',hsh:true},{av:'AV25okIN',fld:'vOKIN',pic:'',hsh:true},{av:'AV23Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:'',hsh:true},{av:'AV11Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV17Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV20ManNom',fld:'vMANNOM',pic:'',hsh:true},{av:'AV28SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV29SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e1329K2',iparms:[{av:'AV28SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV29SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV48barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV46msgerr',fld:'vMSGERR',pic:''},{av:'AV43flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV46msgerr',fld:'vMSGERR',pic:''},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV44BarSit',fld:'vBARSIT',pic:'Z9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1129K2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV45EXHDPZ',fld:'vEXHDPZ',pic:'ZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV49FasDscMn',fld:'vFASDSCMN',pic:''},{av:'AV19ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV41SalExKgEold',fld:'vSALEXKGEOLD',pic:'ZZZZZ9.99'},{av:'AV40SalExCoEold',fld:'vSALEXCOEOLD',pic:'ZZZZZ9'},{av:'AV42SalExMtEold',fld:'vSALEXMTEOLD',pic:'ZZZZZ9.99'},{av:'AV36SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV37SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99',hsh:true},{av:'AV20ManNom',fld:'vMANNOM',pic:'',hsh:true},{av:'AV28SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV29SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV18HashIN',fld:'vHASHIN',pic:'',hsh:true},{av:'AV25okIN',fld:'vOKIN',pic:'',hsh:true},{av:'AV23Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV36SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV40SalExCoEold',fld:'vSALEXCOEOLD',pic:'ZZZZZ9'},{av:'AV42SalExMtEold',fld:'vSALEXMTEOLD',pic:'ZZZZZ9.99'},{av:'AV41SalExKgEold',fld:'vSALEXKGEOLD',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV19ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV12CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV49FasDscMn',fld:'vFASDSCMN',pic:''},{ctrl:'WCTRABAJOEXTERNO_DETAIL__WC'}]}");
      setEventMetadata("'DOHASHYCOMUNICARAT'","{handler:'e1429K2',iparms:[{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV36SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV37SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99',hsh:true},{av:'AV11Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV17Hash',fld:'vHASH',pic:'',hsh:true}]");
      setEventMetadata("'DOHASHYCOMUNICARAT'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1529K2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOFASE1'","{handler:'e1629K2',iparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'}]");
      setEventMetadata("'DOFASE1'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1729K2',iparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV19ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV36SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV48barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV37SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99',hsh:true},{av:'AV20ManNom',fld:'vMANNOM',pic:'',hsh:true},{av:'AV28SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV29SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV18HashIN',fld:'vHASHIN',pic:'',hsh:true},{av:'AV25okIN',fld:'vOKIN',pic:'',hsh:true},{av:'AV23Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:'',hsh:true}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{ctrl:'WCTRABAJOEXTERNO_DETAIL__WC'},{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV12CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV49FasDscMn',fld:'vFASDSCMN',pic:''}]}");
      setEventMetadata("'DOLIMPIAR'","{handler:'e1829K2',iparms:[{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV36SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV37SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99',hsh:true},{av:'AV19ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV20ManNom',fld:'vMANNOM',pic:'',hsh:true},{av:'AV28SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV29SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV18HashIN',fld:'vHASHIN',pic:'',hsh:true},{av:'AV25okIN',fld:'vOKIN',pic:'',hsh:true},{av:'AV23Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:'',hsh:true}]");
      setEventMetadata("'DOLIMPIAR'",",oparms:[{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV12CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV41SalExKgEold',fld:'vSALEXKGEOLD',pic:'ZZZZZ9.99'},{av:'AV42SalExMtEold',fld:'vSALEXMTEOLD',pic:'ZZZZZ9.99'},{av:'AV40SalExCoEold',fld:'vSALEXCOEOLD',pic:'ZZZZZ9'},{av:'AV49FasDscMn',fld:'vFASDSCMN',pic:''},{ctrl:'WCTRABAJOEXTERNO_DETAIL__WC'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e2029K2',iparms:[{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV12CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''}]}");
      setEventMetadata("VSALEXNLN.ISVALID","{handler:'e2129K2',iparms:[{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VSALEXNLN.ISVALID",",oparms:[{av:'edtavBarcod_Enabled',ctrl:'vBARCOD',prop:'Enabled'},{av:'edtavBarcodreo_Enabled',ctrl:'vBARCODREO',prop:'Enabled'},{av:'edtavBarcodpar_Enabled',ctrl:'vBARCODPAR',prop:'Enabled'},{av:'edtavFascodn_Enabled',ctrl:'vFASCODN',prop:'Enabled'},{av:'edtavOrdlin_Enabled',ctrl:'vORDLIN',prop:'Enabled'},{av:'imgavPrompt_Enabled',ctrl:'vPROMPT',prop:'Enabled'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV49FasDscMn',fld:'vFASDSCMN',pic:''},{av:'AV45EXHDPZ',fld:'vEXHDPZ',pic:'ZZZ9'},{av:'AV48barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV44BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV42SalExMtEold',fld:'vSALEXMTEOLD',pic:'ZZZZZ9.99'},{av:'AV41SalExKgEold',fld:'vSALEXKGEOLD',pic:'ZZZZZ9.99'},{av:'AV40SalExCoEold',fld:'vSALEXCOEOLD',pic:'ZZZZZ9'},{av:'AV9BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV12CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV34SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("VSALEXNLN.CLICK","{handler:'e2229K2',iparms:[{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VSALEXNLN.CLICK",",oparms:[{av:'AV33SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e2329K2',iparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV43flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV44BarSit',fld:'vBARSIT',pic:'Z9'}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV43flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV32SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV31SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV30SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV12CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''}]}");
      setEventMetadata("VFASCODN.ISVALID","{handler:'e2429K2',iparms:[{av:'AV15FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VFASCODN.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV49FasDscMn',fld:'vFASDSCMN',pic:''}]}");
      setEventMetadata("VORDLIN.ISVALID","{handler:'e2529K2',iparms:[{av:'AV26OrdLin',fld:'vORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("VORDLIN.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("VALIDV_BARUNIMED","{handler:'validv_Barunimed',iparms:[]");
      setEventMetadata("VALIDV_BARUNIMED",",oparms:[]}");
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
      wcpOAV13Emprcod = "" ;
      wcpOAV36SalExtFec = GXutil.nullDate() ;
      wcpOAV37SalFhh = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV20ManNom = "" ;
      wcpOAV28SalCodeID = "" ;
      wcpOAV18HashIN = "" ;
      wcpOAV23Messages_jsonIN = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV13Emprcod = "" ;
      AV36SalExtFec = GXutil.nullDate() ;
      AV37SalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV20ManNom = "" ;
      AV28SalCodeID = "" ;
      AV18HashIN = "" ;
      AV23Messages_jsonIN = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11Cadena = "" ;
      AV17Hash = "" ;
      GXKey = "" ;
      AV46msgerr = "" ;
      AV41SalExKgEold = DecimalUtil.ZERO ;
      AV42SalExMtEold = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTbmessage_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV27Prompt = "" ;
      AV53Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV6BarCodPar = "" ;
      AV15FasCodn = "" ;
      AV31SalExKgE = DecimalUtil.ZERO ;
      AV32SalExMtE = DecimalUtil.ZERO ;
      AV34SalExObs = "" ;
      AV49FasDscMn = "" ;
      bttBtnfase1_Jsonclick = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      bttBtnlimpiar_Jsonclick = "" ;
      AV10BarSer = "" ;
      AV8BarColNom = "" ;
      AV9BarNomCli = "" ;
      AV48barunimed = "" ;
      AV52Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtnhashycomunicarat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      WebComp_Wctrabajoexterno_detail__wc_Component = "" ;
      OldWctrabajoexterno_detail__wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV38Station = "" ;
      AV14EmprNom = "" ;
      AV39UsurCod = "" ;
      GXv_int9 = new short[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int10 = new short[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char24 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_char22 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_char21 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char25 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV52Pgmname = "TrabajoExterno_Detail__WP" ;
      /* GeneXus formulas. */
      AV52Pgmname = "TrabajoExterno_Detail__WP" ;
      Gx_err = (short)(0) ;
      edtavSalextalb_Enabled = 0 ;
      edtavMancod_Enabled = 0 ;
      edtavMannom_Enabled = 0 ;
      edtavSalcodeid_Enabled = 0 ;
      edtavSalenvat_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavExhdpz_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wctrabajoexterno_detail__wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV29SalEnvAT ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV29SalEnvAT ;
   private byte gxajaxcallmode ;
   private byte AV44BarSit ;
   private byte AV7BarCodReo ;
   private byte nDonePA ;
   private byte GXv_int8[] ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short wcpOAV19ManCod ;
   private short AV19ManCod ;
   private short AV43flaghdr ;
   private short wbEnd ;
   private short wbStart ;
   private short AV33SalExNln ;
   private short AV26OrdLin ;
   private short AV45EXHDPZ ;
   private short AV47varpanel ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int9[] ;
   private short GXv_int10[] ;
   private short GXv_int13[] ;
   private short GXt_int20 ;
   private short GXv_int19[] ;
   private int wcpOAV35SalExtAlb ;
   private int AV35SalExtAlb ;
   private int AV40SalExCoEold ;
   private int edtavSalextalb_Enabled ;
   private int edtavMancod_Enabled ;
   private int edtavMannom_Enabled ;
   private int edtavSalcodeid_Enabled ;
   private int edtavSalenvat_Enabled ;
   private int edtavSalexnln_Enabled ;
   private int AV5BarCod ;
   private int edtavBarcod_Enabled ;
   private int imgavPrompt_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavFascodn_Enabled ;
   private int edtavOrdlin_Enabled ;
   private int AV30SalExCoE ;
   private int edtavSalexcoe_Enabled ;
   private int edtavSalexkge_Enabled ;
   private int edtavSalexmte_Enabled ;
   private int edtavSalexobs_Enabled ;
   private int edtavFasdscmn_Enabled ;
   private int bttBtnfase1_Enabled ;
   private int bttBtnuseraction1_Enabled ;
   private int AV12CliCod ;
   private int edtavClicod_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int edtavExhdpz_Enabled ;
   private int edtavPgmname_Enabled ;
   private int bttBtnenter_Enabled ;
   private int bttBtnhashycomunicarat_Enabled ;
   private int edtavVarpanel_Visible ;
   private int GXv_int12[] ;
   private int GXv_int5[] ;
   private int GXv_int23[] ;
   private int GXv_int16[] ;
   private int idxLst ;
   private java.math.BigDecimal AV41SalExKgEold ;
   private java.math.BigDecimal AV42SalExMtEold ;
   private java.math.BigDecimal AV31SalExKgE ;
   private java.math.BigDecimal AV32SalExMtE ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV13Emprcod ;
   private String wcpOAV20ManNom ;
   private String wcpOAV28SalCodeID ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV13Emprcod ;
   private String AV20ManNom ;
   private String AV28SalCodeID ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavSalextalb_Internalname ;
   private String edtavSalextalb_Jsonclick ;
   private String edtavMancod_Internalname ;
   private String edtavMancod_Jsonclick ;
   private String edtavMannom_Internalname ;
   private String edtavMannom_Jsonclick ;
   private String edtavSalcodeid_Internalname ;
   private String edtavSalcodeid_Jsonclick ;
   private String edtavSalenvat_Internalname ;
   private String edtavSalenvat_Jsonclick ;
   private String divDvpanel_tableheader_cell_Internalname ;
   private String divDvpanel_tableheader_cell_Class ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavSalexnln_Internalname ;
   private String TempTags ;
   private String edtavSalexnln_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV6BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavFascodn_Internalname ;
   private String AV15FasCodn ;
   private String edtavFascodn_Jsonclick ;
   private String edtavOrdlin_Internalname ;
   private String edtavOrdlin_Jsonclick ;
   private String edtavSalexcoe_Internalname ;
   private String edtavSalexcoe_Jsonclick ;
   private String edtavSalexkge_Internalname ;
   private String edtavSalexkge_Jsonclick ;
   private String edtavSalexmte_Internalname ;
   private String edtavSalexmte_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavSalexobs_Internalname ;
   private String AV34SalExObs ;
   private String edtavSalexobs_Jsonclick ;
   private String edtavFasdscmn_Internalname ;
   private String AV49FasDscMn ;
   private String edtavFasdscmn_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtnfase1_Internalname ;
   private String bttBtnfase1_Jsonclick ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String bttBtnlimpiar_Internalname ;
   private String bttBtnlimpiar_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV10BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV8BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV9BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarunimed_Internalname ;
   private String AV48barunimed ;
   private String edtavBarunimed_Jsonclick ;
   private String edtavExhdpz_Internalname ;
   private String edtavExhdpz_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV52Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnhashycomunicarat_Internalname ;
   private String bttBtnhashycomunicarat_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wctrabajoexterno_detail__wc_Component ;
   private String OldWctrabajoexterno_detail__wc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavVarpanel_Internalname ;
   private String edtavVarpanel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV38Station ;
   private String AV14EmprNom ;
   private String AV39UsurCod ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char24[] ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXt_char1 ;
   private String GXv_char25[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTablerightheader_Internalname ;
   private java.util.Date wcpOAV37SalFhh ;
   private java.util.Date AV37SalFhh ;
   private java.util.Date wcpOAV36SalExtFec ;
   private java.util.Date AV36SalExtFec ;
   private java.util.Date GXv_date11[] ;
   private boolean wcpOAV25okIN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV25okIN ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV27Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wctrabajoexterno_detail__wc ;
   private String wcpOAV23Messages_jsonIN ;
   private String AV23Messages_jsonIN ;
   private String wcpOAV18HashIN ;
   private String AV18HashIN ;
   private String AV11Cadena ;
   private String AV17Hash ;
   private String AV46msgerr ;
   private String AV53Prompt_GXI ;
   private String AV27Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wctrabajoexterno_detail__wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXWebForm Form ;
}

