package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webcontador_impl extends GXDataArea
{
   public webcontador_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webcontador_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_impl.class ));
   }

   public webcontador_impl( int remoteHandle ,
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
            AV35EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV66OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66OpeCod), 6, 0));
               AV67OpeNom = httpContext.GetPar( "OpeNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67OpeNom", AV67OpeNom);
               AV56MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56MaqCod", AV56MaqCod);
               AV57MaqDsc = httpContext.GetPar( "MaqDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57MaqDsc", AV57MaqDsc);
               AV39FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39FasCod", AV39FasCod);
               AV40FasDsc = httpContext.GetPar( "FasDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40FasDsc", AV40FasDsc);
               AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
               AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
               AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
               AV72Procod = httpContext.GetPar( "Procod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV72Procod", AV72Procod);
               AV19BarOrdlin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdlin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOrdlin), 4, 0));
               AV8BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarAncAca1), 3, 0));
               AV61Msg_l = httpContext.GetPar( "Msg_l") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61Msg_l", AV61Msg_l);
               AV52Lecfec = localUtil.parseDateParm( httpContext.GetPar( "Lecfec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52Lecfec", localUtil.format(AV52Lecfec, "99/99/99"));
               AV47HisProlin = (int)(GXutil.lval( httpContext.GetPar( "HisProlin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47HisProlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47HisProlin), 8, 0));
               AV27Cctcod = (int)(GXutil.lval( httpContext.GetPar( "Cctcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Cctcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Cctcod), 6, 0));
               AV51KMS = httpContext.GetPar( "KMS") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51KMS", AV51KMS);
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
      pa1GY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1GY2( ) ;
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
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webcontador", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV66OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV67OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV56MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57MaqDsc)),GXutil.URLEncode(GXutil.rtrim(AV39FasCod)),GXutil.URLEncode(GXutil.rtrim(AV40FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV72Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV61Msg_l)),GXutil.URLEncode(GXutil.formatDateParm(AV52Lecfec)),GXutil.URLEncode(GXutil.ltrimstr(AV47HisProlin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27Cctcod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV51KMS))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqDsc","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","Procod","BarOrdlin","BarAncAca1","Msg_l","Lecfec","HisProlin","Cctcod","KMS"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMET", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Met, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTMAN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AutMan), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTRANT", getSecureSignedToken( "", localUtil.format( AV62MtrAnt, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vMTSDISPOSITIVOIOT", GXutil.ltrim( localUtil.ntoc( AV63MtsDispositivoIOT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY", GXutil.rtrim( AV115WebSessionKey));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV25BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vMET", GXutil.rtrim( AV58Met));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMET", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Met, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTMAN", GXutil.ltrim( localUtil.ntoc( AV7AutMan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTMAN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AutMan), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV66OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV56MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV39FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV72Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV19BarOrdlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMCOD", GXutil.rtrim( AV78TermCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vKMS", GXutil.rtrim( AV51KMS));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRANT", GXutil.ltrim( localUtil.ntoc( AV62MtrAnt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTRANT", getSecureSignedToken( "", localUtil.format( AV62MtrAnt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTADOR", GXutil.ltrim( localUtil.ntoc( AV32Contador, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTSLEIDOS", GXutil.ltrim( localUtil.ntoc( AV64MtsLeidos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCARBOOLEAN", AV119RefrescarBoolean);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOS", AV117Objetos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOS", AV117Objetos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV8BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_L", GXutil.rtrim( AV61Msg_l));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECFEC", localUtil.dtoc( AV52Lecfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROLIN", GXutil.ltrim( localUtil.ntoc( AV47HisProlin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV27Cctcod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Width", GXutil.rtrim( Dvpanel_tablegeneral_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Autowidth", GXutil.booltostr( Dvpanel_tablegeneral_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Autoheight", GXutil.booltostr( Dvpanel_tablegeneral_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Cls", GXutil.rtrim( Dvpanel_tablegeneral_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Title", GXutil.rtrim( Dvpanel_tablegeneral_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Collapsible", GXutil.booltostr( Dvpanel_tablegeneral_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Collapsed", GXutil.booltostr( Dvpanel_tablegeneral_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Showcollapseicon", GXutil.booltostr( Dvpanel_tablegeneral_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Iconposition", GXutil.rtrim( Dvpanel_tablegeneral_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEGENERAL_Autoscroll", GXutil.booltostr( Dvpanel_tablegeneral_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Width", GXutil.rtrim( Dvpanel_tbldatosentrada_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Autowidth", GXutil.booltostr( Dvpanel_tbldatosentrada_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Autoheight", GXutil.booltostr( Dvpanel_tbldatosentrada_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Cls", GXutil.rtrim( Dvpanel_tbldatosentrada_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Title", GXutil.rtrim( Dvpanel_tbldatosentrada_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Collapsible", GXutil.booltostr( Dvpanel_tbldatosentrada_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Collapsed", GXutil.booltostr( Dvpanel_tbldatosentrada_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Showcollapseicon", GXutil.booltostr( Dvpanel_tbldatosentrada_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Iconposition", GXutil.rtrim( Dvpanel_tbldatosentrada_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TBLDATOSENTRADA_Autoscroll", GXutil.booltostr( Dvpanel_tbldatosentrada_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSDISPOSITIVOIOT_Enabled", GXutil.booltostr( Mtsdispositivoiot_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSDISPOSITIVOIOT_Maxvalue", GXutil.ltrim( localUtil.ntoc( Mtsdispositivoiot_Maxvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSDISPOSITIVOIOT_Visible", GXutil.booltostr( Mtsdispositivoiot_Visible));
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
      if ( ! ( WebComp_Wcwebcontador_dispos_observacio == null ) )
      {
         WebComp_Wcwebcontador_dispos_observacio.componentjscripts();
      }
      if ( ! ( WebComp_Wcwebcontador_metrajepiezas_wc == null ) )
      {
         WebComp_Wcwebcontador_metrajepiezas_wc.componentjscripts();
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
         we1GY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1GY2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.webcontador", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV66OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV67OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV56MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57MaqDsc)),GXutil.URLEncode(GXutil.rtrim(AV39FasCod)),GXutil.URLEncode(GXutil.rtrim(AV40FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV72Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV61Msg_l)),GXutil.URLEncode(GXutil.formatDateParm(AV52Lecfec)),GXutil.URLEncode(GXutil.ltrimstr(AV47HisProlin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27Cctcod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV51KMS))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqDsc","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","Procod","BarOrdlin","BarAncAca1","Msg_l","Lecfec","HisProlin","Cctcod","KMS"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebContador" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Contador", "") ;
   }

   public void wb1GY0( )
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
         ucDvpanel_tbldatosentrada.setProperty("Width", Dvpanel_tbldatosentrada_Width);
         ucDvpanel_tbldatosentrada.setProperty("AutoWidth", Dvpanel_tbldatosentrada_Autowidth);
         ucDvpanel_tbldatosentrada.setProperty("AutoHeight", Dvpanel_tbldatosentrada_Autoheight);
         ucDvpanel_tbldatosentrada.setProperty("Cls", Dvpanel_tbldatosentrada_Cls);
         ucDvpanel_tbldatosentrada.setProperty("Title", Dvpanel_tbldatosentrada_Title);
         ucDvpanel_tbldatosentrada.setProperty("Collapsible", Dvpanel_tbldatosentrada_Collapsible);
         ucDvpanel_tbldatosentrada.setProperty("Collapsed", Dvpanel_tbldatosentrada_Collapsed);
         ucDvpanel_tbldatosentrada.setProperty("ShowCollapseIcon", Dvpanel_tbldatosentrada_Showcollapseicon);
         ucDvpanel_tbldatosentrada.setProperty("IconPosition", Dvpanel_tbldatosentrada_Iconposition);
         ucDvpanel_tbldatosentrada.setProperty("AutoScroll", Dvpanel_tbldatosentrada_Autoscroll);
         ucDvpanel_tbldatosentrada.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tbldatosentrada_Internalname, "DVPANEL_TBLDATOSENTRADAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TBLDATOSENTRADAContainer"+"TblDatosEntrada"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTbldatosentrada_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 tagcolumm", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndefectos_Internalname, "", httpContext.getMessage( "Defectos", ""), bttBtndefectos_Jsonclick, 5, httpContext.getMessage( "Defectos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DODEFECTOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmarpieza_Internalname, "", httpContext.getMessage( "Confirmar Pieza", ""), bttBtnconfirmarpieza_Jsonclick, 5, httpContext.getMessage( "Confirmar Pieza", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMARPIEZA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledatosingreso_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqdsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV57MaqDsc), GXutil.rtrim( localUtil.format( AV57MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdsc_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdsc_Internalname, GXutil.rtrim( AV40FasDsc), GXutil.rtrim( localUtil.format( AV40FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOpenom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpenom_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpenom_Internalname, GXutil.rtrim( AV67OpeNom), GXutil.rtrim( localUtil.format( AV67OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpenom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOpenom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableiot_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         wb_table1_46_1GY2( true) ;
      }
      else
      {
         wb_table1_46_1GY2( false) ;
      }
      return  ;
   }

   public void wb_table1_46_1GY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         wb_table2_53_1GY2( true) ;
      }
      else
      {
         wb_table2_53_1GY2( false) ;
      }
      return  ;
   }

   public void wb_table2_53_1GY2e( boolean wbgen )
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
         /* User Defined Control */
         ucDvpanel_tablegeneral.setProperty("Width", Dvpanel_tablegeneral_Width);
         ucDvpanel_tablegeneral.setProperty("AutoWidth", Dvpanel_tablegeneral_Autowidth);
         ucDvpanel_tablegeneral.setProperty("AutoHeight", Dvpanel_tablegeneral_Autoheight);
         ucDvpanel_tablegeneral.setProperty("Cls", Dvpanel_tablegeneral_Cls);
         ucDvpanel_tablegeneral.setProperty("Title", Dvpanel_tablegeneral_Title);
         ucDvpanel_tablegeneral.setProperty("Collapsible", Dvpanel_tablegeneral_Collapsible);
         ucDvpanel_tablegeneral.setProperty("Collapsed", Dvpanel_tablegeneral_Collapsed);
         ucDvpanel_tablegeneral.setProperty("ShowCollapseIcon", Dvpanel_tablegeneral_Showcollapseicon);
         ucDvpanel_tablegeneral.setProperty("IconPosition", Dvpanel_tablegeneral_Iconposition);
         ucDvpanel_tablegeneral.setProperty("AutoScroll", Dvpanel_tablegeneral_Autoscroll);
         ucDvpanel_tablegeneral.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablegeneral_Internalname, "DVPANEL_TABLEGENERALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEGENERALContainer"+"TableGeneral"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegeneral_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableordenar_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledatosbarcad_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablehdr_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 tagcolumm", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhdr_Internalname, httpContext.getMessage( "HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhdr_Internalname, GXutil.rtrim( AV13BarHDR), GXutil.rtrim( localUtil.format( AV13BarHDR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablebarcadarticulo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV28CliNom), GXutil.rtrim( localUtil.format( AV28CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 tagcolumm", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcdsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcdsc_Internalname, AV6ArtCDsc, GXutil.rtrim( localUtil.format( AV6ArtCDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcdsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclicoln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclicoln_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclicoln_Internalname, AV17BarNomCliColN, GXutil.rtrim( localUtil.format( AV17BarNomCliColN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclicoln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclicoln_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablemetros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Barkgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV14Barkgm, "ZZZZZ9.99") : localUtil.format( AV14Barkgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV15BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV15BarMtr, "ZZZZZ9.99") : localUtil.format( AV15BarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV20BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabladisposobservaciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0115"+"", GXutil.rtrim( WebComp_Wcwebcontador_dispos_observacio_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0115"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwebcontador_dispos_observacio_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwebcontador_dispos_observacio), GXutil.lower( WebComp_Wcwebcontador_dispos_observacio_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0115"+"");
               }
               WebComp_Wcwebcontador_dispos_observacio.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwebcontador_dispos_observacio), GXutil.lower( WebComp_Wcwebcontador_dispos_observacio_Component)) != 0 )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_wc_metrajepiezas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0121"+"", GXutil.rtrim( WebComp_Wcwebcontador_metrajepiezas_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0121"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwebcontador_metrajepiezas_wc), GXutil.lower( WebComp_Wcwebcontador_metrajepiezas_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0121"+"");
               }
               WebComp_Wcwebcontador_metrajepiezas_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwebcontador_metrajepiezas_wc), GXutil.lower( WebComp_Wcwebcontador_metrajepiezas_wc_Component)) != 0 )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV23BarSer), GXutil.rtrim( localUtil.format( AV23BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarser_Visible, 1, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV24BarSerDsc), GXutil.rtrim( localUtil.format( AV24BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarserdsc_Visible, 1, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV16BarNomCli), GXutil.rtrim( localUtil.format( AV16BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarnomcli_Visible, 1, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV12BarColNom), GXutil.rtrim( localUtil.format( AV12BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarcolnom_Visible, 1, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarcod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarcodreo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV10BarCodPar), GXutil.rtrim( localUtil.format( AV10BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarcodpar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         /* User Defined Control */
         ucMtsdispositivoiot.setProperty("Attribute", AV63MtsDispositivoIOT);
         ucMtsdispositivoiot.render(context, "sdchronometer", Mtsdispositivoiot_Internalname, "MTSDISPOSITIVOIOTContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1GY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Contador", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1GY0( ) ;
   }

   public void ws1GY2( )
   {
      start1GY2( ) ;
      evt1GY2( ) ;
   }

   public void evt1GY2( )
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
                           e111GY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODEFECTOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoDefectos' */
                           e121GY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131GY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e141GY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMARPIEZA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmarPieza' */
                           e151GY2 ();
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
                     if ( nCmpId == 115 )
                     {
                        OldWcwebcontador_dispos_observacio = httpContext.cgiGet( "W0115") ;
                        if ( ( GXutil.len( OldWcwebcontador_dispos_observacio) == 0 ) || ( GXutil.strcmp(OldWcwebcontador_dispos_observacio, WebComp_Wcwebcontador_dispos_observacio_Component) != 0 ) )
                        {
                           WebComp_Wcwebcontador_dispos_observacio = WebUtils.getWebComponent(getClass(), "app." + OldWcwebcontador_dispos_observacio + "_impl", remoteHandle, context);
                           WebComp_Wcwebcontador_dispos_observacio_Component = OldWcwebcontador_dispos_observacio ;
                        }
                        if ( GXutil.len( WebComp_Wcwebcontador_dispos_observacio_Component) != 0 )
                        {
                           WebComp_Wcwebcontador_dispos_observacio.componentprocess("W0115", "", sEvt);
                        }
                        WebComp_Wcwebcontador_dispos_observacio_Component = OldWcwebcontador_dispos_observacio ;
                     }
                     else if ( nCmpId == 121 )
                     {
                        OldWcwebcontador_metrajepiezas_wc = httpContext.cgiGet( "W0121") ;
                        if ( ( GXutil.len( OldWcwebcontador_metrajepiezas_wc) == 0 ) || ( GXutil.strcmp(OldWcwebcontador_metrajepiezas_wc, WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 ) )
                        {
                           WebComp_Wcwebcontador_metrajepiezas_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcwebcontador_metrajepiezas_wc + "_impl", remoteHandle, context);
                           WebComp_Wcwebcontador_metrajepiezas_wc_Component = OldWcwebcontador_metrajepiezas_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 )
                        {
                           WebComp_Wcwebcontador_metrajepiezas_wc.componentprocess("W0121", "", sEvt);
                        }
                        WebComp_Wcwebcontador_metrajepiezas_wc_Component = OldWcwebcontador_metrajepiezas_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1GY2( )
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

   public void pa1GY2( )
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
            GX_FocusControl = edtavBarpiemet_Internalname ;
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
      rf1GY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV122Pgmname = "ExpedicionesAutomatizadas.WebContador" ;
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), true);
      edtavBarhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhdr_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcdsc_Enabled), 5, 0), true);
      edtavBarnomclicoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomclicoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomclicoln_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
   }

   public void rf1GY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwebcontador_dispos_observacio_Component) != 0 )
            {
               WebComp_Wcwebcontador_dispos_observacio.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 )
            {
               WebComp_Wcwebcontador_metrajepiezas_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e141GY2 ();
         wb1GY0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1GY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMET", GXutil.rtrim( AV58Met));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMET", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Met, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTMAN", GXutil.ltrim( localUtil.ntoc( AV7AutMan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTMAN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AutMan), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRANT", GXutil.ltrim( localUtil.ntoc( AV62MtrAnt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTRANT", getSecureSignedToken( "", localUtil.format( AV62MtrAnt, "ZZZZZZ9.99")));
   }

   public void before_start_formulas( )
   {
      AV122Pgmname = "ExpedicionesAutomatizadas.WebContador" ;
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), true);
      edtavBarhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhdr_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcdsc_Enabled), 5, 0), true);
      edtavBarnomclicoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomclicoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomclicoln_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1GY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111GY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV63MtsDispositivoIOT = localUtil.ctond( httpContext.cgiGet( "vMTSDISPOSITIVOIOT")) ;
         AV64MtsLeidos = localUtil.ctond( httpContext.cgiGet( "vMTSLEIDOS")) ;
         AV32Contador = localUtil.ctol( httpContext.cgiGet( "vCONTADOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Dvpanel_tablegeneral_Width = httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Width") ;
         Dvpanel_tablegeneral_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Autowidth")) ;
         Dvpanel_tablegeneral_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Autoheight")) ;
         Dvpanel_tablegeneral_Cls = httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Cls") ;
         Dvpanel_tablegeneral_Title = httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Title") ;
         Dvpanel_tablegeneral_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Collapsible")) ;
         Dvpanel_tablegeneral_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Collapsed")) ;
         Dvpanel_tablegeneral_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Showcollapseicon")) ;
         Dvpanel_tablegeneral_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Iconposition") ;
         Dvpanel_tablegeneral_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEGENERAL_Autoscroll")) ;
         Dvpanel_tbldatosentrada_Width = httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Width") ;
         Dvpanel_tbldatosentrada_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Autowidth")) ;
         Dvpanel_tbldatosentrada_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Autoheight")) ;
         Dvpanel_tbldatosentrada_Cls = httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Cls") ;
         Dvpanel_tbldatosentrada_Title = httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Title") ;
         Dvpanel_tbldatosentrada_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Collapsible")) ;
         Dvpanel_tbldatosentrada_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Collapsed")) ;
         Dvpanel_tbldatosentrada_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Showcollapseicon")) ;
         Dvpanel_tbldatosentrada_Iconposition = httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Iconposition") ;
         Dvpanel_tbldatosentrada_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TBLDATOSENTRADA_Autoscroll")) ;
         Mtsdispositivoiot_Enabled = GXutil.strtobool( httpContext.cgiGet( "MTSDISPOSITIVOIOT_Enabled")) ;
         Mtsdispositivoiot_Maxvalue = (int)(localUtil.ctol( httpContext.cgiGet( "MTSDISPOSITIVOIOT_Maxvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Mtsdispositivoiot_Visible = GXutil.strtobool( httpContext.cgiGet( "MTSDISPOSITIVOIOT_Visible")) ;
         /* Read variables values. */
         AV57MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57MaqDsc", AV57MaqDsc);
         AV40FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40FasDsc", AV40FasDsc);
         AV67OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67OpeNom", AV67OpeNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarPieMet", GXutil.ltrimstr( AV22BarPieMet, 9, 2));
         }
         else
         {
            AV22BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22BarPieMet", GXutil.ltrimstr( AV22BarPieMet, 9, 2));
         }
         AV13BarHDR = httpContext.cgiGet( edtavBarhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarHDR", AV13BarHDR);
         AV28CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28CliNom", AV28CliNom);
         AV6ArtCDsc = httpContext.cgiGet( edtavArtcdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCDsc", AV6ArtCDsc);
         AV17BarNomCliColN = httpContext.cgiGet( edtavBarnomclicoln_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarNomCliColN", AV17BarNomCliColN);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Barkgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barkgm", GXutil.ltrimstr( AV14Barkgm, 9, 2));
         }
         else
         {
            AV14Barkgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barkgm", GXutil.ltrimstr( AV14Barkgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
            GX_FocusControl = edtavBarmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15BarMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarMtr", GXutil.ltrimstr( AV15BarMtr, 9, 2));
         }
         else
         {
            AV15BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarMtr", GXutil.ltrimstr( AV15BarMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE");
            GX_FocusControl = edtavBarpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarPie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarPie), 6, 0));
         }
         else
         {
            AV20BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarPie), 6, 0));
         }
         AV23BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarSer", AV23BarSer);
         AV24BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarSerDsc", AV24BarSerDsc);
         AV16BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarNomCli", AV16BarNomCli);
         AV12BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
         AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         AV11BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
         AV10BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
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
      e111GY2 ();
      if (returnInSub) return;
   }

   public void e111GY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Ingresando a WebContador datos : %1, %2", GXutil.format( "Ingresando a WebContador datos : &EmprCod=%1, &OpeCod=%2, &OpeNom=%3, &MaqCod=%4, MaqDsc=%5, &FasCod=%6, &FasDsc=%7,&Barcada=%8, &BarCodReo=%9, ", AV35EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66OpeCod), 6, 0), AV67OpeNom, AV56MaqCod, AV57MaqDsc, AV39FasCod, AV40FasDsc, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0), GXutil.str( AV11BarCodReo, 1, 0)), GXutil.format( "&BarCodPar=%1, &BarOrdLin=%2, &BarAncAca1=%3, &Mensa=%4, &Lecfec=%5, &HisProlin=%6, &Procod=%7, &KgMt=%8,", AV10BarCodPar, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOrdlin), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarAncAca1), 3, 0), AV61Msg_l, localUtil.dtoc( AV52Lecfec, 0, "-"), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47HisProlin), 8, 0), AV72Procod, AV51KMS, ""), "", "", "", "", "", "", ""), AV122Pgmname) ;
      GXt_char1 = AV77Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webcontador_impl.this.GXt_char1 = GXv_char2[0] ;
      AV77Station = GXt_char1 ;
      GXv_char2[0] = AV65ObtenerEmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char4[0] = AV114UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char2, GXv_char3, GXv_char4) ;
      webcontador_impl.this.AV65ObtenerEmprCod = GXv_char2[0] ;
      webcontador_impl.this.AV36EmprNom = GXv_char3[0] ;
      webcontador_impl.this.AV114UsurCod = GXv_char4[0] ;
      GXt_SdtSDT_Hdr5 = AV73SDT_Hdr;
      GXv_SdtSDT_Hdr6[0] = GXt_SdtSDT_Hdr5;
      new app.expedicionesautomatizadas.dp_sdt_hdr(remoteHandle, context).execute( AV35EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, GXv_SdtSDT_Hdr6) ;
      GXt_SdtSDT_Hdr5 = GXv_SdtSDT_Hdr6[0] ;
      AV73SDT_Hdr = GXt_SdtSDT_Hdr5;
      AV13BarHDR = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barhdr() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarHDR", AV13BarHDR);
      AV28CliNom = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Clinom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CliNom", AV28CliNom);
      AV23BarSer = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barser() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarSer", AV23BarSer);
      AV24BarSerDsc = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barserdsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarSerDsc", AV24BarSerDsc);
      AV6ArtCDsc = GXutil.trim( AV23BarSer) + "-" + GXutil.trim( AV24BarSerDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCDsc", AV6ArtCDsc);
      AV16BarNomCli = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barnomcli() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarNomCli", AV16BarNomCli);
      AV12BarColNom = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barcolnom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
      AV17BarNomCliColN = GXutil.trim( AV16BarNomCli) + "-" + GXutil.trim( AV12BarColNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarNomCliColN", AV17BarNomCliColN);
      AV14Barkgm = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barkgm() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Barkgm", GXutil.ltrimstr( AV14Barkgm, 9, 2));
      AV15BarMtr = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barmtr() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarMtr", GXutil.ltrimstr( AV15BarMtr, 9, 2));
      AV20BarPie = AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Barpie() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarPie), 6, 0));
      AV32Contador = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Contador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Contador), 18, 0));
      AV63MtsDispositivoIOT = DecimalUtil.doubleToDec(30) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63MtsDispositivoIOT", GXutil.ltrimstr( AV63MtsDispositivoIOT, 10, 2));
      Mtsdispositivoiot_Maxvalue = 1000 ;
      httpContext.ajax_rsp_assign_prop("", false, Mtsdispositivoiot_Internalname, "MaxValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Mtsdispositivoiot_Maxvalue), 9, 0), true);
      this.executeUsercontrolMethod("", false, "MTSDISPOSITIVOIOTContainer", "Start", "", new Object[] {});
      GXt_char1 = AV77Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webcontador_impl.this.GXt_char1 = GXv_char4[0] ;
      AV77Station = GXt_char1 ;
      GXv_char4[0] = AV35EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char2[0] = AV114UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char4, GXv_char3, GXv_char2) ;
      webcontador_impl.this.AV35EmprCod = GXv_char4[0] ;
      webcontador_impl.this.AV36EmprNom = GXv_char3[0] ;
      webcontador_impl.this.AV114UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      edtavBarser_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Visible), 5, 0), true);
      edtavBarserdsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Visible), 5, 0), true);
      edtavBarnomcli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Visible), 5, 0), true);
      edtavBarcolnom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Visible), 5, 0), true);
      edtavBarcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Visible), 5, 0), true);
      edtavBarcodreo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Visible), 5, 0), true);
      edtavBarcodpar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Visible), 5, 0), true);
      Mtsdispositivoiot_Visible = false ;
      httpContext.ajax_rsp_assign_prop("", false, Mtsdispositivoiot_Internalname, "Visible", GXutil.booltostr( Mtsdispositivoiot_Visible), true);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwebcontador_metrajepiezas_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwebcontador_metrajepiezas_wc_Component), GXutil.lower( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC")) != 0 )
      {
         WebComp_Wcwebcontador_metrajepiezas_wc = WebUtils.getWebComponent(getClass(), "app.expedicionesautomatizadas.webcontador_metrajepiezas_wc_impl", remoteHandle, context);
         WebComp_Wcwebcontador_metrajepiezas_wc_Component = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
      }
      if ( GXutil.len( WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 )
      {
         WebComp_Wcwebcontador_metrajepiezas_wc.setjustcreated();
         WebComp_Wcwebcontador_metrajepiezas_wc.componentprepare(new Object[] {"W0121","",AV35EmprCod,Integer.valueOf(AV9BarCod),Byte.valueOf(AV11BarCodReo),AV10BarCodPar,Integer.valueOf(AV66OpeCod)});
         WebComp_Wcwebcontador_metrajepiezas_wc.componentbind(new Object[] {"","vBARCOD","vBARCODREO","vBARCODPAR",""});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwebcontador_dispos_observacio = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwebcontador_dispos_observacio_Component), GXutil.lower( "ExpedicionesAutomatizadas.WebContador_DisPos_Observacio")) != 0 )
      {
         WebComp_Wcwebcontador_dispos_observacio = WebUtils.getWebComponent(getClass(), "app.expedicionesautomatizadas.webcontador_dispos_observacio_impl", remoteHandle, context);
         WebComp_Wcwebcontador_dispos_observacio_Component = "ExpedicionesAutomatizadas.WebContador_DisPos_Observacio" ;
      }
      if ( GXutil.len( WebComp_Wcwebcontador_dispos_observacio_Component) != 0 )
      {
         WebComp_Wcwebcontador_dispos_observacio.setjustcreated();
         WebComp_Wcwebcontador_dispos_observacio.componentprepare(new Object[] {"W0115","",AV35EmprCod,AV73SDT_Hdr.getgxTv_SdtSDT_Hdr_Discod()});
         WebComp_Wcwebcontador_dispos_observacio.componentbind(new Object[] {"",""});
      }
      GXt_int7 = AV7AutMan ;
      GXv_char4[0] = AV35EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "AUTMAN", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      webcontador_impl.this.AV35EmprCod = GXv_char4[0] ;
      webcontador_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      AV7AutMan = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AutMan", GXutil.str( AV7AutMan, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTMAN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AutMan), "9")));
      if ( AV7AutMan == 2 )
      {
         lblAutman_Caption = httpContext.getMessage( "AUTOMATICO", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblAutman_Internalname, "Caption", lblAutman_Caption, true);
      }
      else
      {
         lblAutman_Caption = httpContext.getMessage( "MANUAL", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblAutman_Internalname, "Caption", lblAutman_Caption, true);
      }
      AV58Met = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Met", AV58Met);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMET", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Met, ""))));
      AV60MetP = "" ;
      AV49Implpt1 = "" ;
      AV78TermCod = AV77Station ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TermCod", AV78TermCod);
      /* Using cursor H01GY2 */
      pr_default.execute(0, new Object[] {AV78TermCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A942TermCod = H01GY2_A942TermCod[0] ;
         A1445ImpCod5 = H01GY2_A1445ImpCod5[0] ;
         n1445ImpCod5 = H01GY2_n1445ImpCod5[0] ;
         A1444ImpCod4 = H01GY2_A1444ImpCod4[0] ;
         n1444ImpCod4 = H01GY2_n1444ImpCod4[0] ;
         A1446ImpLpt1 = H01GY2_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = H01GY2_n1446ImpLpt1[0] ;
         AV58Met = A1445ImpCod5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Met", AV58Met);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMET", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Met, ""))));
         AV60MetP = GXutil.trim( A1444ImpCod4) ;
         AV49Implpt1 = A1446ImpLpt1 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_int9 = AV26Carvema ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int10) ;
      webcontador_impl.this.GXt_int9 = GXv_int10[0] ;
      AV26Carvema = GXt_int9 ;
      AV115WebSessionKey = AV122Pgmname + httpContext.getMessage( "_SDTPiezaDefectos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115WebSessionKey", AV115WebSessionKey);
      /* Execute user subroutine: 'CARGAR INFORMACION DEFECTOS' */
      S112 ();
      if (returnInSub) return;
   }

   public void e121GY2( )
   {
      /* 'DoDefectos' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.expedicionesautomatizadas.webdeflmetpiingdef", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV115WebSessionKey)),GXutil.URLEncode(GXutil.rtrim(AV25BarUnimed))}, new String[] {"EmprCod","WebSessionKey","BarUnimed"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      AV75SDT_PiezaDefectos.fromJSonString(AV5WebSession.getValue(AV115WebSessionKey), null);
      if ( AV75SDT_PiezaDefectos.size() > 0 )
      {
         lblInformaciondefectos_Caption = AV75SDT_PiezaDefectos.toJSonString(false) ;
         httpContext.ajax_rsp_assign_prop("", false, lblInformaciondefectos_Internalname, "Caption", lblInformaciondefectos_Caption, true);
      }
      else
      {
         lblInformaciondefectos_Caption = httpContext.getMessage( "Sin Defectos para &WebSessionKey,", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblInformaciondefectos_Internalname, "Caption", lblInformaciondefectos_Caption, true);
      }
      /*  Sending Event outputs  */
   }

   public void e151GY2( )
   {
      /* 'DoConfirmarPieza' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CONFIRMOPIEZA' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e131GY2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV117Objetos.indexof("WCtContador") > 0 ) && AV119RefrescarBoolean )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcwebcontador_metrajepiezas_wc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwebcontador_metrajepiezas_wc_Component), GXutil.lower( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC")) != 0 )
         {
            WebComp_Wcwebcontador_metrajepiezas_wc = WebUtils.getWebComponent(getClass(), "app.expedicionesautomatizadas.webcontador_metrajepiezas_wc_impl", remoteHandle, context);
            WebComp_Wcwebcontador_metrajepiezas_wc_Component = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
         }
         if ( GXutil.len( WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 )
         {
            WebComp_Wcwebcontador_metrajepiezas_wc.setjustcreated();
            WebComp_Wcwebcontador_metrajepiezas_wc.componentprepare(new Object[] {"W0121","",AV35EmprCod,Integer.valueOf(AV9BarCod),Byte.valueOf(AV11BarCodReo),AV10BarCodPar,Integer.valueOf(AV66OpeCod)});
            WebComp_Wcwebcontador_metrajepiezas_wc.componentbind(new Object[] {"","vBARCOD","vBARCODREO","vBARCODPAR",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwebcontador_metrajepiezas_wc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0121"+"");
            WebComp_Wcwebcontador_metrajepiezas_wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'CONFIRMOPIEZA' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV58Met)==0) || ( AV7AutMan == 1 ) )
      {
         httpContext.popup(formatLink("app.expedicionesautomatizadas.webcontador_capturamanual", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV66OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV67OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV56MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV57MaqDsc)),GXutil.URLEncode(GXutil.rtrim(AV39FasCod)),GXutil.URLEncode(GXutil.rtrim(AV40FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV72Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarOrdlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV78TermCod)),GXutil.URLEncode(GXutil.rtrim(AV51KMS)),GXutil.URLEncode(GXutil.rtrim(AV115WebSessionKey))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqDsc","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","Procod","BarOrdlin","TermCod","KMS","WebSessionKey"}) , new Object[] {"AV35EmprCod","AV66OpeCod","AV67OpeNom","AV56MaqCod","AV57MaqDsc","AV39FasCod","AV40FasDsc","AV9BarCod","AV11BarCodReo","AV10BarCodPar","AV72Procod","AV19BarOrdlin","AV78TermCod","AV51KMS","AV115WebSessionKey"});
      }
      else
      {
         AV22BarPieMet = AV62MtrAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarPieMet", GXutil.ltrimstr( AV22BarPieMet, 9, 2));
      }
   }

   public void S112( )
   {
      /* 'CARGAR INFORMACION DEFECTOS' Routine */
      returnInSub = false ;
      AV75SDT_PiezaDefectos.fromJSonString(AV5WebSession.getValue(AV115WebSessionKey), null);
      if ( AV75SDT_PiezaDefectos.size() > 0 )
      {
         lblInformaciondefectos_Caption = AV75SDT_PiezaDefectos.toJSonString(false) ;
         httpContext.ajax_rsp_assign_prop("", false, lblInformaciondefectos_Internalname, "Caption", lblInformaciondefectos_Caption, true);
      }
      else
      {
         lblInformaciondefectos_Caption = GXutil.format( httpContext.getMessage( "Sin Defectos para %1", ""), AV115WebSessionKey, "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblInformaciondefectos_Internalname, "Caption", lblInformaciondefectos_Caption, true);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e141GY2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_53_1GY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablatextblocks_Internalname, tblTablatextblocks_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='tagcolumm'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblAutman_Internalname, lblAutman_Caption, "", "", lblAutman_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='tagcolumm'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblInformaciondefectos_Internalname, lblInformaciondefectos_Caption, "", "", lblInformaciondefectos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_53_1GY2e( true) ;
      }
      else
      {
         wb_table2_53_1GY2e( false) ;
      }
   }

   public void wb_table1_46_1GY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblManejatimer_Internalname, tblManejatimer_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='tagcolumm'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV22BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiemet_Enabled!=0) ? localUtil.format( AV22BarPieMet, "ZZZZZ9.99") : localUtil.format( AV22BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_46_1GY2e( true) ;
      }
      else
      {
         wb_table1_46_1GY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV35EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      AV66OpeCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66OpeCod), 6, 0));
      AV67OpeNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67OpeNom", AV67OpeNom);
      AV56MaqCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56MaqCod", AV56MaqCod);
      AV57MaqDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57MaqDsc", AV57MaqDsc);
      AV39FasCod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39FasCod", AV39FasCod);
      AV40FasDsc = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40FasDsc", AV40FasDsc);
      AV9BarCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      AV11BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
      AV10BarCodPar = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      AV72Procod = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Procod", AV72Procod);
      AV19BarOrdlin = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOrdlin), 4, 0));
      AV8BarAncAca1 = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarAncAca1), 3, 0));
      AV61Msg_l = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Msg_l", AV61Msg_l);
      AV52Lecfec = (java.util.Date)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Lecfec", localUtil.format(AV52Lecfec, "99/99/99"));
      AV47HisProlin = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47HisProlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47HisProlin), 8, 0));
      AV27Cctcod = ((Number) GXutil.testNumericType( getParm(obj,16), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Cctcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Cctcod), 6, 0));
      AV51KMS = (String)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51KMS", AV51KMS);
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
      pa1GY2( ) ;
      ws1GY2( ) ;
      we1GY2( ) ;
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
      if ( ! ( WebComp_Wcwebcontador_dispos_observacio == null ) )
      {
         if ( GXutil.len( WebComp_Wcwebcontador_dispos_observacio_Component) != 0 )
         {
            WebComp_Wcwebcontador_dispos_observacio.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwebcontador_metrajepiezas_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcwebcontador_metrajepiezas_wc_Component) != 0 )
         {
            WebComp_Wcwebcontador_metrajepiezas_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116133098", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webcontador.js", "?202682116133099", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtndefectos_Internalname = "BTNDEFECTOS" ;
      bttBtnconfirmarpieza_Internalname = "BTNCONFIRMARPIEZA" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtavOpenom_Internalname = "vOPENOM" ;
      divTabledatosingreso_Internalname = "TABLEDATOSINGRESO" ;
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      tblManejatimer_Internalname = "MANEJATIMER" ;
      lblAutman_Internalname = "AUTMAN" ;
      lblInformaciondefectos_Internalname = "INFORMACIONDEFECTOS" ;
      tblTablatextblocks_Internalname = "TABLATEXTBLOCKS" ;
      divTableiot_Internalname = "TABLEIOT" ;
      edtavBarhdr_Internalname = "vBARHDR" ;
      divTablehdr_Internalname = "TABLEHDR" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavArtcdsc_Internalname = "vARTCDSC" ;
      edtavBarnomclicoln_Internalname = "vBARNOMCLICOLN" ;
      divTablebarcadarticulo_Internalname = "TABLEBARCADARTICULO" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      divTablemetros_Internalname = "TABLEMETROS" ;
      divTabledatosbarcad_Internalname = "TABLEDATOSBARCAD" ;
      divTabladisposobservaciones_Internalname = "TABLADISPOSOBSERVACIONES" ;
      divTableordenar_Internalname = "TABLEORDENAR" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      Dvpanel_tablegeneral_Internalname = "DVPANEL_TABLEGENERAL" ;
      divTable_wc_metrajepiezas_Internalname = "TABLE_WC_METRAJEPIEZAS" ;
      divTbldatosentrada_Internalname = "TBLDATOSENTRADA" ;
      Dvpanel_tbldatosentrada_Internalname = "DVPANEL_TBLDATOSENTRADA" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      Mtsdispositivoiot_Internalname = "MTSDISPOSITIVOIOT" ;
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
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Enabled = 1 ;
      lblInformaciondefectos_Caption = httpContext.getMessage( "Sin Defectos", "") ;
      lblAutman_Caption = httpContext.getMessage( "ManejoAutomatico", "") ;
      Mtsdispositivoiot_Enabled = GXutil.toBoolean( 1) ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Visible = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Visible = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Visible = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Visible = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Visible = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Visible = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Visible = 1 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      edtavBarnomclicoln_Jsonclick = "" ;
      edtavBarnomclicoln_Enabled = 1 ;
      edtavArtcdsc_Jsonclick = "" ;
      edtavArtcdsc_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavBarhdr_Jsonclick = "" ;
      edtavBarhdr_Enabled = 1 ;
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Enabled = 0 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 0 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      Mtsdispositivoiot_Visible = GXutil.toBoolean( -1) ;
      Mtsdispositivoiot_Maxvalue = 0 ;
      Dvpanel_tbldatosentrada_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tbldatosentrada_Iconposition = "Right" ;
      Dvpanel_tbldatosentrada_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tbldatosentrada_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tbldatosentrada_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tbldatosentrada_Title = "" ;
      Dvpanel_tbldatosentrada_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tbldatosentrada_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tbldatosentrada_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tbldatosentrada_Width = "100%" ;
      Dvpanel_tablegeneral_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablegeneral_Iconposition = "Right" ;
      Dvpanel_tablegeneral_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablegeneral_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tablegeneral_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablegeneral_Title = httpContext.getMessage( "Información", "") ;
      Dvpanel_tablegeneral_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablegeneral_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablegeneral_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablegeneral_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Contador", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV58Met',fld:'vMET',pic:'',hsh:true},{av:'AV7AutMan',fld:'vAUTMAN',pic:'9',hsh:true},{av:'AV62MtrAnt',fld:'vMTRANT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DODEFECTOS'","{handler:'e121GY2',iparms:[{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV115WebSessionKey',fld:'vWEBSESSIONKEY',pic:''},{av:'AV25BarUnimed',fld:'vBARUNIMED',pic:'@!'}]");
      setEventMetadata("'DODEFECTOS'",",oparms:[{av:'AV25BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV115WebSessionKey',fld:'vWEBSESSIONKEY',pic:''},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'lblInformaciondefectos_Caption',ctrl:'INFORMACIONDEFECTOS',prop:'Caption'}]}");
      setEventMetadata("'DOCONFIRMARPIEZA'","{handler:'e151GY2',iparms:[{av:'AV58Met',fld:'vMET',pic:'',hsh:true},{av:'AV7AutMan',fld:'vAUTMAN',pic:'9',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV67OpeNom',fld:'vOPENOM',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV57MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV39FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV40FasDsc',fld:'vFASDSC',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV72Procod',fld:'vPROCOD',pic:''},{av:'AV19BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV78TermCod',fld:'vTERMCOD',pic:''},{av:'AV51KMS',fld:'vKMS',pic:''},{av:'AV115WebSessionKey',fld:'vWEBSESSIONKEY',pic:''},{av:'AV62MtrAnt',fld:'vMTRANT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("'DOCONFIRMARPIEZA'",",oparms:[{av:'AV115WebSessionKey',fld:'vWEBSESSIONKEY',pic:''},{av:'AV51KMS',fld:'vKMS',pic:''},{av:'AV78TermCod',fld:'vTERMCOD',pic:''},{av:'AV19BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV72Procod',fld:'vPROCOD',pic:''},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV40FasDsc',fld:'vFASDSC',pic:''},{av:'AV39FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV57MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV67OpeNom',fld:'vOPENOM',pic:''},{av:'AV66OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e131GY2',iparms:[{av:'AV119RefrescarBoolean',fld:'vREFRESCARBOOLEAN',pic:''},{av:'AV117Objetos',fld:'vOBJETOS',pic:''},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV66OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{ctrl:'WCWEBCONTADOR_METRAJEPIEZAS_WC'}]}");
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
      wcpOAV35EmprCod = "" ;
      wcpOAV67OpeNom = "" ;
      wcpOAV56MaqCod = "" ;
      wcpOAV57MaqDsc = "" ;
      wcpOAV39FasCod = "" ;
      wcpOAV40FasDsc = "" ;
      wcpOAV10BarCodPar = "" ;
      wcpOAV72Procod = "" ;
      wcpOAV61Msg_l = "" ;
      wcpOAV52Lecfec = GXutil.nullDate() ;
      wcpOAV51KMS = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV35EmprCod = "" ;
      AV67OpeNom = "" ;
      AV56MaqCod = "" ;
      AV57MaqDsc = "" ;
      AV39FasCod = "" ;
      AV40FasDsc = "" ;
      AV10BarCodPar = "" ;
      AV72Procod = "" ;
      AV61Msg_l = "" ;
      AV52Lecfec = GXutil.nullDate() ;
      AV51KMS = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV58Met = "" ;
      AV62MtrAnt = DecimalUtil.ZERO ;
      GXKey = "" ;
      AV63MtsDispositivoIOT = DecimalUtil.ZERO ;
      AV115WebSessionKey = "" ;
      AV25BarUnimed = "" ;
      AV78TermCod = "" ;
      AV64MtsLeidos = DecimalUtil.ZERO ;
      AV117Objetos = new GXSimpleCollection<String>(String.class, "internal", "");
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tbldatosentrada = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtndefectos_Jsonclick = "" ;
      bttBtnconfirmarpieza_Jsonclick = "" ;
      ucDvpanel_tablegeneral = new com.genexus.webpanels.GXUserControl();
      AV13BarHDR = "" ;
      AV28CliNom = "" ;
      AV6ArtCDsc = "" ;
      AV17BarNomCliColN = "" ;
      AV14Barkgm = DecimalUtil.ZERO ;
      AV15BarMtr = DecimalUtil.ZERO ;
      WebComp_Wcwebcontador_dispos_observacio_Component = "" ;
      OldWcwebcontador_dispos_observacio = "" ;
      WebComp_Wcwebcontador_metrajepiezas_wc_Component = "" ;
      OldWcwebcontador_metrajepiezas_wc = "" ;
      AV23BarSer = "" ;
      AV24BarSerDsc = "" ;
      AV16BarNomCli = "" ;
      AV12BarColNom = "" ;
      ucMtsdispositivoiot = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV122Pgmname = "" ;
      AV22BarPieMet = DecimalUtil.ZERO ;
      AV77Station = "" ;
      AV65ObtenerEmprCod = "" ;
      AV36EmprNom = "" ;
      AV114UsurCod = "" ;
      AV73SDT_Hdr = new app.expedicionesautomatizadas.SdtSDT_Hdr(remoteHandle, context);
      GXt_SdtSDT_Hdr5 = new app.expedicionesautomatizadas.SdtSDT_Hdr(remoteHandle, context);
      GXv_SdtSDT_Hdr6 = new app.expedicionesautomatizadas.SdtSDT_Hdr[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      AV60MetP = "" ;
      AV49Implpt1 = "" ;
      scmdbuf = "" ;
      H01GY2_A942TermCod = new String[] {""} ;
      H01GY2_A1445ImpCod5 = new String[] {""} ;
      H01GY2_n1445ImpCod5 = new boolean[] {false} ;
      H01GY2_A1444ImpCod4 = new String[] {""} ;
      H01GY2_n1444ImpCod4 = new boolean[] {false} ;
      H01GY2_A1446ImpLpt1 = new String[] {""} ;
      H01GY2_n1446ImpLpt1 = new boolean[] {false} ;
      A942TermCod = "" ;
      A1445ImpCod5 = "" ;
      A1444ImpCod4 = "" ;
      A1446ImpLpt1 = "" ;
      GXv_int10 = new byte[1] ;
      AV75SDT_PiezaDefectos = new GXBaseCollection<app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto>(app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto.class, "SDT_PiezaDefecto", "TexplusNET", remoteHandle);
      AV5WebSession = httpContext.getWebSession();
      sStyleString = "" ;
      lblAutman_Jsonclick = "" ;
      lblInformaciondefectos_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador__default(),
         new Object[] {
             new Object[] {
            H01GY2_A942TermCod, H01GY2_A1445ImpCod5, H01GY2_n1445ImpCod5, H01GY2_A1444ImpCod4, H01GY2_n1444ImpCod4, H01GY2_A1446ImpLpt1, H01GY2_n1446ImpLpt1
            }
         }
      );
      AV122Pgmname = "ExpedicionesAutomatizadas.WebContador" ;
      /* GeneXus formulas. */
      AV122Pgmname = "ExpedicionesAutomatizadas.WebContador" ;
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavOpenom_Enabled = 0 ;
      edtavBarhdr_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavArtcdsc_Enabled = 0 ;
      edtavBarnomclicoln_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      WebComp_Wcwebcontador_dispos_observacio = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwebcontador_metrajepiezas_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV11BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11BarCodReo ;
   private byte gxajaxcallmode ;
   private byte AV7AutMan ;
   private byte nDonePA ;
   private byte AV26Carvema ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short wcpOAV19BarOrdlin ;
   private short wcpOAV8BarAncAca1 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV19BarOrdlin ;
   private short AV8BarAncAca1 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV66OpeCod ;
   private int wcpOAV9BarCod ;
   private int wcpOAV47HisProlin ;
   private int wcpOAV27Cctcod ;
   private int AV66OpeCod ;
   private int AV9BarCod ;
   private int AV47HisProlin ;
   private int AV27Cctcod ;
   private int Mtsdispositivoiot_Maxvalue ;
   private int edtavMaqdsc_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavOpenom_Enabled ;
   private int edtavBarhdr_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcdsc_Enabled ;
   private int edtavBarnomclicoln_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int AV20BarPie ;
   private int edtavBarpie_Enabled ;
   private int edtavBarser_Visible ;
   private int edtavBarserdsc_Visible ;
   private int edtavBarnomcli_Visible ;
   private int edtavBarcolnom_Visible ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int edtavBarpiemet_Enabled ;
   private int idxLst ;
   private long AV32Contador ;
   private java.math.BigDecimal AV62MtrAnt ;
   private java.math.BigDecimal AV63MtsDispositivoIOT ;
   private java.math.BigDecimal AV64MtsLeidos ;
   private java.math.BigDecimal AV14Barkgm ;
   private java.math.BigDecimal AV15BarMtr ;
   private java.math.BigDecimal AV22BarPieMet ;
   private String wcpOAV35EmprCod ;
   private String wcpOAV67OpeNom ;
   private String wcpOAV56MaqCod ;
   private String wcpOAV57MaqDsc ;
   private String wcpOAV39FasCod ;
   private String wcpOAV40FasDsc ;
   private String wcpOAV10BarCodPar ;
   private String wcpOAV72Procod ;
   private String wcpOAV61Msg_l ;
   private String wcpOAV51KMS ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV35EmprCod ;
   private String AV67OpeNom ;
   private String AV56MaqCod ;
   private String AV57MaqDsc ;
   private String AV39FasCod ;
   private String AV40FasDsc ;
   private String AV10BarCodPar ;
   private String AV72Procod ;
   private String AV61Msg_l ;
   private String AV51KMS ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV58Met ;
   private String GXKey ;
   private String AV115WebSessionKey ;
   private String AV25BarUnimed ;
   private String AV78TermCod ;
   private String Dvpanel_tablegeneral_Width ;
   private String Dvpanel_tablegeneral_Cls ;
   private String Dvpanel_tablegeneral_Title ;
   private String Dvpanel_tablegeneral_Iconposition ;
   private String Dvpanel_tbldatosentrada_Width ;
   private String Dvpanel_tbldatosentrada_Cls ;
   private String Dvpanel_tbldatosentrada_Title ;
   private String Dvpanel_tbldatosentrada_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tbldatosentrada_Internalname ;
   private String divTbldatosentrada_Internalname ;
   private String TempTags ;
   private String bttBtndefectos_Internalname ;
   private String bttBtndefectos_Jsonclick ;
   private String bttBtnconfirmarpieza_Internalname ;
   private String bttBtnconfirmarpieza_Jsonclick ;
   private String divTabledatosingreso_Internalname ;
   private String edtavMaqdsc_Internalname ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtavFasdsc_Internalname ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavOpenom_Internalname ;
   private String edtavOpenom_Jsonclick ;
   private String divTableiot_Internalname ;
   private String Dvpanel_tablegeneral_Internalname ;
   private String divTablegeneral_Internalname ;
   private String divTableordenar_Internalname ;
   private String divTabledatosbarcad_Internalname ;
   private String divTablehdr_Internalname ;
   private String edtavBarhdr_Internalname ;
   private String AV13BarHDR ;
   private String edtavBarhdr_Jsonclick ;
   private String divTablebarcadarticulo_Internalname ;
   private String edtavClinom_Internalname ;
   private String AV28CliNom ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcdsc_Internalname ;
   private String edtavArtcdsc_Jsonclick ;
   private String edtavBarnomclicoln_Internalname ;
   private String edtavBarnomclicoln_Jsonclick ;
   private String divTablemetros_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String divTabladisposobservaciones_Internalname ;
   private String WebComp_Wcwebcontador_dispos_observacio_Component ;
   private String OldWcwebcontador_dispos_observacio ;
   private String divTable_wc_metrajepiezas_Internalname ;
   private String WebComp_Wcwebcontador_metrajepiezas_wc_Component ;
   private String OldWcwebcontador_metrajepiezas_wc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavBarser_Internalname ;
   private String AV23BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String AV24BarSerDsc ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV16BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV12BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String Mtsdispositivoiot_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavBarpiemet_Internalname ;
   private String AV122Pgmname ;
   private String AV77Station ;
   private String AV65ObtenerEmprCod ;
   private String AV36EmprNom ;
   private String AV114UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String lblAutman_Caption ;
   private String lblAutman_Internalname ;
   private String AV60MetP ;
   private String AV49Implpt1 ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1445ImpCod5 ;
   private String A1444ImpCod4 ;
   private String A1446ImpLpt1 ;
   private String lblInformaciondefectos_Caption ;
   private String lblInformaciondefectos_Internalname ;
   private String sStyleString ;
   private String tblTablatextblocks_Internalname ;
   private String lblAutman_Jsonclick ;
   private String lblInformaciondefectos_Jsonclick ;
   private String tblManejatimer_Internalname ;
   private String edtavBarpiemet_Jsonclick ;
   private java.util.Date wcpOAV52Lecfec ;
   private java.util.Date AV52Lecfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV119RefrescarBoolean ;
   private boolean Dvpanel_tablegeneral_Autowidth ;
   private boolean Dvpanel_tablegeneral_Autoheight ;
   private boolean Dvpanel_tablegeneral_Collapsible ;
   private boolean Dvpanel_tablegeneral_Collapsed ;
   private boolean Dvpanel_tablegeneral_Showcollapseicon ;
   private boolean Dvpanel_tablegeneral_Autoscroll ;
   private boolean Dvpanel_tbldatosentrada_Autowidth ;
   private boolean Dvpanel_tbldatosentrada_Autoheight ;
   private boolean Dvpanel_tbldatosentrada_Collapsible ;
   private boolean Dvpanel_tbldatosentrada_Collapsed ;
   private boolean Dvpanel_tbldatosentrada_Showcollapseicon ;
   private boolean Dvpanel_tbldatosentrada_Autoscroll ;
   private boolean Mtsdispositivoiot_Enabled ;
   private boolean Mtsdispositivoiot_Visible ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwebcontador_metrajepiezas_wc ;
   private boolean bDynCreated_Wcwebcontador_dispos_observacio ;
   private boolean n1445ImpCod5 ;
   private boolean n1444ImpCod4 ;
   private boolean n1446ImpLpt1 ;
   private String AV6ArtCDsc ;
   private String AV17BarNomCliColN ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwebcontador_dispos_observacio ;
   private GXWebComponent WebComp_Wcwebcontador_metrajepiezas_wc ;
   private com.genexus.webpanels.WebSession AV5WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tbldatosentrada ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablegeneral ;
   private com.genexus.webpanels.GXUserControl ucMtsdispositivoiot ;
   private IDataStoreProvider pr_default ;
   private String[] H01GY2_A942TermCod ;
   private String[] H01GY2_A1445ImpCod5 ;
   private boolean[] H01GY2_n1445ImpCod5 ;
   private String[] H01GY2_A1444ImpCod4 ;
   private boolean[] H01GY2_n1444ImpCod4 ;
   private String[] H01GY2_A1446ImpLpt1 ;
   private boolean[] H01GY2_n1446ImpLpt1 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV117Objetos ;
   private GXBaseCollection<app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto> AV75SDT_PiezaDefectos ;
   private app.expedicionesautomatizadas.SdtSDT_Hdr AV73SDT_Hdr ;
   private app.expedicionesautomatizadas.SdtSDT_Hdr GXt_SdtSDT_Hdr5 ;
   private app.expedicionesautomatizadas.SdtSDT_Hdr GXv_SdtSDT_Hdr6[] ;
}

final  class webcontador__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01GY2", "SELECT TermCod, ImpCod5, ImpCod4, ImpLpt1 FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
   }

}

