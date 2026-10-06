package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webcontador_capturamanual_impl extends GXDataArea
{
   public webcontador_capturamanual_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webcontador_capturamanual_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_capturamanual_impl.class ));
   }

   public webcontador_capturamanual_impl( int remoteHandle ,
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
            AV22EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10OpeCod), 6, 0));
               AV36OpeNom = httpContext.GetPar( "OpeNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36OpeNom", AV36OpeNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36OpeNom, ""))));
               AV27MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27MaqCod", AV27MaqCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27MaqCod, ""))));
               AV28MaqDsc = httpContext.GetPar( "MaqDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28MaqDsc", AV28MaqDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28MaqDsc, ""))));
               AV6FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
               AV7FasDsc = httpContext.GetPar( "FasDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
               AV13BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
               AV15BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodReo", GXutil.str( AV15BarCodReo, 1, 0));
               AV14BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
               AV37Procod = httpContext.GetPar( "Procod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Procod", AV37Procod);
               AV16BarOrdlin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdlin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarOrdlin), 4, 0));
               AV11TermCod = httpContext.GetPar( "TermCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11TermCod", AV11TermCod);
               AV25KMS = httpContext.GetPar( "KMS") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25KMS", AV25KMS);
               AV39WebSessionKey = httpContext.GetPar( "WebSessionKey") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39WebSessionKey", AV39WebSessionKey);
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
      pa1H02( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1H02( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webcontador_capturamanual", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV36OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV27MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV28MaqDsc)),GXutil.URLEncode(GXutil.rtrim(AV6FasCod)),GXutil.URLEncode(GXutil.rtrim(AV7FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV37Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarOrdlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11TermCod)),GXutil.URLEncode(GXutil.rtrim(AV25KMS)),GXutil.URLEncode(GXutil.rtrim(AV39WebSessionKey))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqDsc","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","Procod","BarOrdlin","TermCod","KMS","WebSessionKey"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34NumPzsFs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35NumPzsFs2), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOETIQUET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43NoEtiquet), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28MaqDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36OpeNom, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS", GXutil.ltrim( localUtil.ntoc( AV34NumPzsFs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34NumPzsFs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS2", GXutil.ltrim( localUtil.ntoc( AV35NumPzsFs2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35NumPzsFs2), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV13BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV15BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV14BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV37Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV16BarOrdlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV27MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECFEC", localUtil.dtoc( AV26Lecfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV51Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEANC", GXutil.ltrim( localUtil.ntoc( AV29Metpieanc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMCOD", GXutil.rtrim( AV11TermCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV12Albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEOBS", GXutil.rtrim( AV5BarPieobs));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEID", GXutil.rtrim( AV9MetPieId));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCAMP", GXutil.ltrim( localUtil.ntoc( AV32Nocamp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_RR", GXutil.rtrim( AV31Msg_rr));
      app.GxWebStd.gx_hidden_field( httpContext, "vKMS", GXutil.rtrim( AV25KMS));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRM2", GXutil.ltrim( localUtil.ntoc( AV23Grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV6FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASDSC", GXutil.rtrim( AV7FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV10OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV24hisprotur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEDEF", GXutil.ltrim( localUtil.ntoc( AV8MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEIA", GXutil.rtrim( AV38Teia));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALIDAD", GXutil.ltrim( localUtil.ntoc( AV20Calidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY", GXutil.rtrim( AV39WebSessionKey));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vERROR", AV42Error);
      app.GxWebStd.gx_hidden_field( httpContext, "vNOETIQUET", GXutil.ltrim( localUtil.ntoc( AV43NoEtiquet, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOETIQUET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43NoEtiquet), "9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOS", AV45Objetos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOS", AV45Objetos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC", GXutil.rtrim( AV28MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28MaqDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV36OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36OpeNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Width", GXutil.rtrim( Dvpanel_table_panel_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Autowidth", GXutil.booltostr( Dvpanel_table_panel_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Autoheight", GXutil.booltostr( Dvpanel_table_panel_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Cls", GXutil.rtrim( Dvpanel_table_panel_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Title", GXutil.rtrim( Dvpanel_table_panel_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Collapsible", GXutil.booltostr( Dvpanel_table_panel_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Collapsed", GXutil.booltostr( Dvpanel_table_panel_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Showcollapseicon", GXutil.booltostr( Dvpanel_table_panel_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Iconposition", GXutil.rtrim( Dvpanel_table_panel_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_PANEL_Autoscroll", GXutil.booltostr( Dvpanel_table_panel_Autoscroll));
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
         we1H02( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1H02( ) ;
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
      return formatLink("app.expedicionesautomatizadas.webcontador_capturamanual", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV36OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV27MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV28MaqDsc)),GXutil.URLEncode(GXutil.rtrim(AV6FasCod)),GXutil.URLEncode(GXutil.rtrim(AV7FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV37Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarOrdlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11TermCod)),GXutil.URLEncode(GXutil.rtrim(AV25KMS)),GXutil.URLEncode(GXutil.rtrim(AV39WebSessionKey))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqDsc","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","Procod","BarOrdlin","TermCod","KMS","WebSessionKey"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebContador_CapturaManual" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Captura Manual", "") ;
   }

   public void wb1H00( )
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
         ucDvpanel_table_panel.setProperty("Width", Dvpanel_table_panel_Width);
         ucDvpanel_table_panel.setProperty("AutoWidth", Dvpanel_table_panel_Autowidth);
         ucDvpanel_table_panel.setProperty("AutoHeight", Dvpanel_table_panel_Autoheight);
         ucDvpanel_table_panel.setProperty("Cls", Dvpanel_table_panel_Cls);
         ucDvpanel_table_panel.setProperty("Title", Dvpanel_table_panel_Title);
         ucDvpanel_table_panel.setProperty("Collapsible", Dvpanel_table_panel_Collapsible);
         ucDvpanel_table_panel.setProperty("Collapsed", Dvpanel_table_panel_Collapsed);
         ucDvpanel_table_panel.setProperty("ShowCollapseIcon", Dvpanel_table_panel_Showcollapseicon);
         ucDvpanel_table_panel.setProperty("IconPosition", Dvpanel_table_panel_Iconposition);
         ucDvpanel_table_panel.setProperty("AutoScroll", Dvpanel_table_panel_Autoscroll);
         ucDvpanel_table_panel.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_table_panel_Internalname, "DVPANEL_TABLE_PANELContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLE_PANELContainer"+"Table_panel"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_panel_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 tagcolumm", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemetros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel BootstrapTooltipRightLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiemet_Enabled!=0) ? localUtil.format( AV19BarPieMet, "ZZZZZ9.99") : localUtil.format( AV19BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", edtavBarpiemet_Tooltiptext, "", edtavBarpiemet_Jsonclick, 0, "AttributeFL BootstrapTooltipRight", "", "", "", "", 1, edtavBarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador_CapturaManual.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablepeso_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiekil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiekil_Enabled!=0) ? localUtil.format( AV18BarPieKil, "ZZZZZ9.99") : localUtil.format( AV18BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebContador_CapturaManual.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablebotones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador_CapturaManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "Retornar", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador_CapturaManual.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1H02( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Captura Manual", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1H00( ) ;
   }

   public void ws1H02( )
   {
      start1H02( ) ;
      evt1H02( ) ;
   }

   public void evt1H02( )
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
                           e111H02 ();
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
                                 e121H02 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131H02 ();
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

   public void we1H02( )
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

   public void pa1H02( )
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
      rf1H02( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV51Pgmname = "ExpedicionesAutomatizadas.WebContador_CapturaManual" ;
      Gx_err = (short)(0) ;
   }

   public void rf1H02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131H02 ();
         wb1H00( ) ;
      }
   }

   public void send_integrity_lvl_hashes1H02( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS", GXutil.ltrim( localUtil.ntoc( AV34NumPzsFs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34NumPzsFs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS2", GXutil.ltrim( localUtil.ntoc( AV35NumPzsFs2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35NumPzsFs2), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV27MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV51Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOETIQUET", GXutil.ltrim( localUtil.ntoc( AV43NoEtiquet, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOETIQUET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43NoEtiquet), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC", GXutil.rtrim( AV28MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28MaqDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV36OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36OpeNom, ""))));
   }

   public void before_start_formulas( )
   {
      AV51Pgmname = "ExpedicionesAutomatizadas.WebContador_CapturaManual" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1H00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111H02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_table_panel_Width = httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Width") ;
         Dvpanel_table_panel_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Autowidth")) ;
         Dvpanel_table_panel_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Autoheight")) ;
         Dvpanel_table_panel_Cls = httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Cls") ;
         Dvpanel_table_panel_Title = httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Title") ;
         Dvpanel_table_panel_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Collapsible")) ;
         Dvpanel_table_panel_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Collapsed")) ;
         Dvpanel_table_panel_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Showcollapseicon")) ;
         Dvpanel_table_panel_Iconposition = httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Iconposition") ;
         Dvpanel_table_panel_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_PANEL_Autoscroll")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieMet", GXutil.ltrimstr( AV19BarPieMet, 9, 2));
         }
         else
         {
            AV19BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieMet", GXutil.ltrimstr( AV19BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEKIL");
            GX_FocusControl = edtavBarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18BarPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPieKil", GXutil.ltrimstr( AV18BarPieKil, 9, 2));
         }
         else
         {
            AV18BarPieKil = localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPieKil", GXutil.ltrimstr( AV18BarPieKil, 9, 2));
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
      e111H02 ();
      if (returnInSub) return;
   }

   public void e111H02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV48Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webcontador_capturamanual_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Station = GXt_char1 ;
      GXv_char2[0] = AV22EmprCod ;
      GXv_char3[0] = AV49Emprnom ;
      GXv_char4[0] = AV50Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char2, GXv_char3, GXv_char4) ;
      webcontador_capturamanual_impl.this.AV22EmprCod = GXv_char2[0] ;
      webcontador_capturamanual_impl.this.AV49Emprnom = GXv_char3[0] ;
      webcontador_capturamanual_impl.this.AV50Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      edtavBarpiemet_Tooltiptext = httpContext.getMessage( "Digitar los metros", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiemet_Internalname, "Tooltiptext", edtavBarpiemet_Tooltiptext, true);
      GXt_int5 = AV34NumPzsFs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "NPFF", ""), GXv_int6) ;
      webcontador_capturamanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34NumPzsFs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34NumPzsFs", GXutil.str( AV34NumPzsFs, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34NumPzsFs), "9")));
      GXt_int5 = AV35NumPzsFs2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "NPFF2", ""), GXv_int6) ;
      webcontador_capturamanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35NumPzsFs2 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35NumPzsFs2", GXutil.str( AV35NumPzsFs2, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35NumPzsFs2), "9")));
      GXt_int5 = AV43NoEtiquet ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "NOETIQ", ""), GXv_int6) ;
      webcontador_capturamanual_impl.this.GXt_int5 = GXv_int6[0] ;
      AV43NoEtiquet = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43NoEtiquet", GXutil.str( AV43NoEtiquet, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOETIQUET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43NoEtiquet), "9")));
      AV40SDT_PiezaDefectos.fromJSonString(AV41WebSession.getValue(AV39WebSessionKey), null);
      if ( AV40SDT_PiezaDefectos.size() > 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Los Defectos son %1", ""), AV40SDT_PiezaDefectos.toJSonString(false), "", "", "", "", "", "", "", ""));
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Sin Defectos para %1", ""), AV39WebSessionKey, "", "", "", "", "", "", "", ""));
      }
   }

   public void S112( )
   {
      /* 'CHECKREQUIREDFIELDS' Routine */
      returnInSub = false ;
      AV21CheckRequiredFieldsResult = true ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19BarPieMet)==0) )
      {
         httpContext.GX_msglist.addItem(new app.wwpbaseobjects.dvmessagegetbasicnotificationmsg(remoteHandle, context).executeUdp( "", httpContext.getMessage( "Metros es requerido", ""), "error", edtavBarpiemet_Internalname, "true", ""));
         AV21CheckRequiredFieldsResult = false ;
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121H02 ();
      if (returnInSub) return;
   }

   public void e121H02( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19BarPieMet)==0) )
      {
         /* Execute user subroutine: 'CHECKREQUIREDFIELDS' */
         S112 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: 'ACTUALIZAR' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45Objetos", AV45Objetos);
   }

   public void S122( )
   {
      /* 'ACTUALIZAR' Routine */
      returnInSub = false ;
      AV33Num_pz = (short)(0) ;
      if ( ( ( AV34NumPzsFs == 1 ) ) || ( ( AV35NumPzsFs2 == 1 ) ) )
      {
         GXv_char4[0] = AV22EmprCod ;
         GXv_int7[0] = AV13BarCod ;
         GXv_int6[0] = AV15BarCodReo ;
         GXv_char3[0] = AV14BarCodPar ;
         GXv_char2[0] = AV37Procod ;
         GXv_int8[0] = AV16BarOrdlin ;
         GXv_int9[0] = AV33Num_pz ;
         new app.pnumpzsfs(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_int8, GXv_int9) ;
         webcontador_capturamanual_impl.this.AV22EmprCod = GXv_char4[0] ;
         webcontador_capturamanual_impl.this.AV13BarCod = GXv_int7[0] ;
         webcontador_capturamanual_impl.this.AV15BarCodReo = GXv_int6[0] ;
         webcontador_capturamanual_impl.this.AV14BarCodPar = GXv_char3[0] ;
         webcontador_capturamanual_impl.this.AV37Procod = GXv_char2[0] ;
         webcontador_capturamanual_impl.this.AV16BarOrdlin = GXv_int8[0] ;
         webcontador_capturamanual_impl.this.AV33Num_pz = (short)((short)(GXv_int9[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodReo", GXutil.str( AV15BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV37Procod", AV37Procod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarOrdlin), 4, 0));
         AV17BarPiecod = GXutil.padl( GXutil.trim( GXutil.str( AV16BarOrdlin, 4, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV33Num_pz, 5, 0)), (short)(5), "0") ;
      }
      else
      {
         GXv_char4[0] = AV22EmprCod ;
         GXv_int9[0] = AV13BarCod ;
         GXv_int6[0] = AV15BarCodReo ;
         GXv_char3[0] = AV14BarCodPar ;
         GXv_int7[0] = AV33Num_pz ;
         new app.pnumrol(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int6, GXv_char3, GXv_int7) ;
         webcontador_capturamanual_impl.this.AV22EmprCod = GXv_char4[0] ;
         webcontador_capturamanual_impl.this.AV13BarCod = GXv_int9[0] ;
         webcontador_capturamanual_impl.this.AV15BarCodReo = GXv_int6[0] ;
         webcontador_capturamanual_impl.this.AV14BarCodPar = GXv_char3[0] ;
         webcontador_capturamanual_impl.this.AV33Num_pz = (short)((short)(GXv_int7[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodReo", GXutil.str( AV15BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
         AV17BarPiecod = GXutil.padl( GXutil.trim( GXutil.str( AV33Num_pz, 8, 0)), (short)(5), "0") ;
      }
      AV30MetPieobs = AV22EmprCod + AV27MaqCod + localUtil.dtoc( AV26Lecfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.str( AV16BarOrdlin, 8, 0) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "&BarPiecod=%1, &Num_pz=%2, &Lecfec=%3, &MetPieobs=%4,", AV17BarPiecod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Num_pz), 3, 0), localUtil.dtoc( AV26Lecfec, 0, "-"), AV30MetPieobs, "", "", "", "", ""), AV51Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Llamando a PCOSI00 parte 1: &EmprCod=%1, &BarCod=%2, &BarCodreo=%3, &BarCodpar=%4, &BarPieCod=%5, &BarPieMet=%6, &BarPieKil=%7, &Metpieanc=%8, &TermCod=%9, ", AV22EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0), GXutil.str( AV15BarCodReo, 1, 0), AV14BarCodPar, AV17BarPiecod, GXutil.ltrimstr( AV19BarPieMet, 9, 2), GXutil.ltrimstr( AV18BarPieKil, 9, 2), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Metpieanc), 3, 0), AV11TermCod), AV51Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Llamando a PCOSI00 parte 2: &MetPieobs=%1, &Albreccod=%2, &BarPieobs=%3, &MetPieId=%4, &Nocamp=%5, &Msg_rr=%6, &KMS=%7, &Grm2=%8, &FasCod=%9, ", AV30MetPieobs, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Albreccod), 8, 0), AV5BarPieobs, AV9MetPieId, GXutil.str( AV32Nocamp, 1, 0), AV31Msg_rr, AV25KMS, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Grm2), 4, 0), AV6FasCod), AV51Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Llamando a PCOSI00 parte 3: &FasDsc=%1, &Lecfec=%2, &OpeCod=%3, &hisprotur=%4, &MetPieDef=%5, &Teia=%6, &Calidad=%7, ", AV7FasDsc, localUtil.dtoc( AV26Lecfec, 0, "-"), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10OpeCod), 6, 0), GXutil.str( AV24hisprotur, 1, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8MetPieDef), 3, 0), AV38Teia, GXutil.str( AV20Calidad, 1, 0), "", ""), AV51Pgmname) ;
      GXv_int9[0] = AV13BarCod ;
      GXv_int6[0] = AV15BarCodReo ;
      GXv_char4[0] = AV14BarCodPar ;
      GXv_char3[0] = AV17BarPiecod ;
      GXv_decimal10[0] = AV19BarPieMet ;
      GXv_decimal11[0] = AV18BarPieKil ;
      GXv_int8[0] = AV29Metpieanc ;
      GXv_char2[0] = AV11TermCod ;
      GXv_char12[0] = AV30MetPieobs ;
      GXv_int7[0] = AV12Albreccod ;
      GXv_char13[0] = AV5BarPieobs ;
      GXv_char14[0] = AV9MetPieId ;
      GXv_int15[0] = AV32Nocamp ;
      GXv_char16[0] = AV31Msg_rr ;
      GXv_char17[0] = AV25KMS ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(AV23Grm2) ;
      GXv_char19[0] = AV6FasCod ;
      GXv_char20[0] = AV7FasDsc ;
      GXv_date21[0] = AV26Lecfec ;
      GXv_int22[0] = AV10OpeCod ;
      GXv_int23[0] = AV24hisprotur ;
      GXv_int24[0] = AV8MetPieDef ;
      GXv_char25[0] = AV38Teia ;
      GXv_int26[0] = AV20Calidad ;
      new app.pcosi00(remoteHandle, context).execute( AV22EmprCod, GXv_int9, GXv_int6, GXv_char4, GXv_char3, GXv_decimal10, GXv_decimal11, GXv_int8, GXv_char2, GXv_char12, GXv_int7, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_char17, GXv_decimal18, GXv_char19, GXv_char20, GXv_date21, GXv_int22, GXv_int23, GXv_int24, GXv_char25, GXv_int26) ;
      webcontador_capturamanual_impl.this.AV13BarCod = GXv_int9[0] ;
      webcontador_capturamanual_impl.this.AV15BarCodReo = GXv_int6[0] ;
      webcontador_capturamanual_impl.this.AV14BarCodPar = GXv_char4[0] ;
      webcontador_capturamanual_impl.this.AV17BarPiecod = GXv_char3[0] ;
      webcontador_capturamanual_impl.this.AV19BarPieMet = GXv_decimal10[0] ;
      webcontador_capturamanual_impl.this.AV18BarPieKil = GXv_decimal11[0] ;
      webcontador_capturamanual_impl.this.AV29Metpieanc = GXv_int8[0] ;
      webcontador_capturamanual_impl.this.AV11TermCod = GXv_char2[0] ;
      webcontador_capturamanual_impl.this.AV30MetPieobs = GXv_char12[0] ;
      webcontador_capturamanual_impl.this.AV12Albreccod = GXv_int7[0] ;
      webcontador_capturamanual_impl.this.AV5BarPieobs = GXv_char13[0] ;
      webcontador_capturamanual_impl.this.AV9MetPieId = GXv_char14[0] ;
      webcontador_capturamanual_impl.this.AV32Nocamp = GXv_int15[0] ;
      webcontador_capturamanual_impl.this.AV31Msg_rr = GXv_char16[0] ;
      webcontador_capturamanual_impl.this.AV25KMS = GXv_char17[0] ;
      webcontador_capturamanual_impl.this.AV23Grm2 = (short)(DecimalUtil.decToDouble(GXv_decimal18[0])) ;
      webcontador_capturamanual_impl.this.AV6FasCod = GXv_char19[0] ;
      webcontador_capturamanual_impl.this.AV7FasDsc = GXv_char20[0] ;
      webcontador_capturamanual_impl.this.AV26Lecfec = GXv_date21[0] ;
      webcontador_capturamanual_impl.this.AV10OpeCod = GXv_int22[0] ;
      webcontador_capturamanual_impl.this.AV24hisprotur = GXv_int23[0] ;
      webcontador_capturamanual_impl.this.AV8MetPieDef = GXv_int24[0] ;
      webcontador_capturamanual_impl.this.AV38Teia = GXv_char25[0] ;
      webcontador_capturamanual_impl.this.AV20Calidad = GXv_int26[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodReo", GXutil.str( AV15BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieMet", GXutil.ltrimstr( AV19BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarPieKil", GXutil.ltrimstr( AV18BarPieKil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Metpieanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Metpieanc), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TermCod", AV11TermCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12Albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Albreccod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarPieobs", AV5BarPieobs);
      httpContext.ajax_rsp_assign_attri("", false, "AV9MetPieId", AV9MetPieId);
      httpContext.ajax_rsp_assign_attri("", false, "AV32Nocamp", GXutil.str( AV32Nocamp, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_rr", AV31Msg_rr);
      httpContext.ajax_rsp_assign_attri("", false, "AV25KMS", AV25KMS);
      httpContext.ajax_rsp_assign_attri("", false, "AV23Grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Grm2), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lecfec", localUtil.format(AV26Lecfec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV10OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10OpeCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV24hisprotur", GXutil.str( AV24hisprotur, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8MetPieDef), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38Teia", AV38Teia);
      httpContext.ajax_rsp_assign_attri("", false, "AV20Calidad", GXutil.str( AV20Calidad, 1, 0));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Ingresando a Guardar_PMetpid", "", "", "", "", "", "", "", "", ""), AV51Pgmname) ;
      new app.expedicionesautomatizadas.guardar_pmetpid(remoteHandle, context).execute( ) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Saliendo de Guardar_PMetpid", "", "", "", "", "", "", "", "", ""), AV51Pgmname) ;
      if ( AV43NoEtiquet == 1 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Llamando a imprimir con PETCTRam  &EmprCod=%1, &BarCod=%2, &BarCodReo=%3, &BarCodPar=%4, &Barpiecod=%5, &BarPiekil=%6, &BarPiemet=%7, &OpeCod=%8", AV22EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0), GXutil.str( AV15BarCodReo, 1, 0), AV14BarCodPar, AV17BarPiecod, GXutil.ltrimstr( AV18BarPieKil, 9, 2), GXutil.ltrimstr( AV19BarPieMet, 9, 2), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10OpeCod), 6, 0), ""), AV51Pgmname) ;
         AV44window.setPosition( 1 );
         AV44window.setWidth( 600 );
         AV44window.setHeight( 400 );
         AV44window.setLeft( 400 );
         AV44window.setTop( 200 );
         AV44window.setAutoresize( 0 );
         AV44window.setUrl( formatLink("app.petctram", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV17BarPiecod)),GXutil.URLEncode(DecimalUtil.decToString(AV18BarPieKil)),GXutil.URLEncode(DecimalUtil.decToString(AV19BarPieMet)),GXutil.URLEncode(GXutil.ltrimstr(AV10OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","MetPiecod","MetPieKil","MetPieMet","Opecod","Output"})  );
         AV44window.setReturnParms(new Object[] {"AV22EmprCod","AV13BarCod","AV15BarCodReo","AV14BarCodPar","AV17BarPiecod","AV18BarPieKil","AV19BarPieMet","AV10OpeCod",""});
         httpContext.newWindow(AV44window);
      }
      AV45Objetos.add("WCtContador", 0);
      this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV45Objetos,Boolean.valueOf(true)}, true);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Saliendo de captura manual", "", "", "", "", "", "", "", "", ""), AV51Pgmname) ;
      httpContext.setWebReturnParms(new Object[] {AV22EmprCod,Integer.valueOf(AV10OpeCod),AV36OpeNom,AV27MaqCod,AV28MaqDsc,AV6FasCod,AV7FasDsc,Integer.valueOf(AV13BarCod),Byte.valueOf(AV15BarCodReo),AV14BarCodPar,AV37Procod,Short.valueOf(AV16BarOrdlin),AV11TermCod,AV25KMS,AV39WebSessionKey});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV22EmprCod","AV10OpeCod","AV36OpeNom","AV27MaqCod","AV28MaqDsc","AV6FasCod","AV7FasDsc","AV13BarCod","AV15BarCodReo","AV14BarCodPar","AV37Procod","AV16BarOrdlin","AV11TermCod","AV25KMS","AV39WebSessionKey"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e131H02( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV22EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      AV10OpeCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10OpeCod), 6, 0));
      AV36OpeNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OpeNom", AV36OpeNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36OpeNom, ""))));
      AV27MaqCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27MaqCod", AV27MaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27MaqCod, ""))));
      AV28MaqDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28MaqDsc", AV28MaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28MaqDsc, ""))));
      AV6FasCod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
      AV7FasDsc = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
      AV13BarCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarCod), 8, 0));
      AV15BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodReo", GXutil.str( AV15BarCodReo, 1, 0));
      AV14BarCodPar = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
      AV37Procod = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Procod", AV37Procod);
      AV16BarOrdlin = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarOrdlin), 4, 0));
      AV11TermCod = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11TermCod", AV11TermCod);
      AV25KMS = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25KMS", AV25KMS);
      AV39WebSessionKey = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39WebSessionKey", AV39WebSessionKey);
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
      pa1H02( ) ;
      ws1H02( ) ;
      we1H02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681822123843", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webcontador_capturamanual.js", "?202681822123843", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      divTablemetros_Internalname = "TABLEMETROS" ;
      edtavBarpiekil_Internalname = "vBARPIEKIL" ;
      divTablepeso_Internalname = "TABLEPESO" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTablebotones_Internalname = "TABLEBOTONES" ;
      divTable_panel_Internalname = "TABLE_PANEL" ;
      Dvpanel_table_panel_Internalname = "DVPANEL_TABLE_PANEL" ;
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
      edtavBarpiekil_Jsonclick = "" ;
      edtavBarpiekil_Enabled = 1 ;
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Tooltiptext = "" ;
      edtavBarpiemet_Enabled = 1 ;
      Dvpanel_table_panel_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_table_panel_Iconposition = "Right" ;
      Dvpanel_table_panel_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_table_panel_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_table_panel_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_table_panel_Title = "" ;
      Dvpanel_table_panel_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_table_panel_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_table_panel_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_table_panel_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Captura Manual", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV34NumPzsFs',fld:'vNUMPZSFS',pic:'9',hsh:true},{av:'AV35NumPzsFs2',fld:'vNUMPZSFS2',pic:'9',hsh:true},{av:'AV51Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV43NoEtiquet',fld:'vNOETIQUET',pic:'9',hsh:true},{av:'AV27MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV28MaqDsc',fld:'vMAQDSC',pic:'',hsh:true},{av:'AV36OpeNom',fld:'vOPENOM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121H02',iparms:[{av:'AV19BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV34NumPzsFs',fld:'vNUMPZSFS',pic:'9',hsh:true},{av:'AV35NumPzsFs2',fld:'vNUMPZSFS2',pic:'9',hsh:true},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV15BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV14BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37Procod',fld:'vPROCOD',pic:''},{av:'AV16BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV27MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV26Lecfec',fld:'vLECFEC',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV29Metpieanc',fld:'vMETPIEANC',pic:'ZZ9'},{av:'AV11TermCod',fld:'vTERMCOD',pic:''},{av:'AV12Albreccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV5BarPieobs',fld:'vBARPIEOBS',pic:''},{av:'AV9MetPieId',fld:'vMETPIEID',pic:''},{av:'AV32Nocamp',fld:'vNOCAMP',pic:'9'},{av:'AV31Msg_rr',fld:'vMSG_RR',pic:''},{av:'AV25KMS',fld:'vKMS',pic:''},{av:'AV23Grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV7FasDsc',fld:'vFASDSC',pic:''},{av:'AV10OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV24hisprotur',fld:'vHISPROTUR',pic:'9'},{av:'AV8MetPieDef',fld:'vMETPIEDEF',pic:'ZZZ'},{av:'AV38Teia',fld:'vTEIA',pic:''},{av:'AV20Calidad',fld:'vCALIDAD',pic:'9'},{av:'AV39WebSessionKey',fld:'vWEBSESSIONKEY',pic:''},{av:'AV42Error',fld:'vERROR',pic:''},{av:'AV43NoEtiquet',fld:'vNOETIQUET',pic:'9',hsh:true},{av:'AV45Objetos',fld:'vOBJETOS',pic:''},{av:'AV28MaqDsc',fld:'vMAQDSC',pic:'',hsh:true},{av:'AV36OpeNom',fld:'vOPENOM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV16BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV37Procod',fld:'vPROCOD',pic:''},{av:'AV14BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV13BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV20Calidad',fld:'vCALIDAD',pic:'9'},{av:'AV38Teia',fld:'vTEIA',pic:''},{av:'AV8MetPieDef',fld:'vMETPIEDEF',pic:'ZZZ'},{av:'AV24hisprotur',fld:'vHISPROTUR',pic:'9'},{av:'AV10OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV26Lecfec',fld:'vLECFEC',pic:''},{av:'AV7FasDsc',fld:'vFASDSC',pic:''},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV23Grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV25KMS',fld:'vKMS',pic:''},{av:'AV31Msg_rr',fld:'vMSG_RR',pic:''},{av:'AV32Nocamp',fld:'vNOCAMP',pic:'9'},{av:'AV9MetPieId',fld:'vMETPIEID',pic:''},{av:'AV5BarPieobs',fld:'vBARPIEOBS',pic:''},{av:'AV12Albreccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV11TermCod',fld:'vTERMCOD',pic:''},{av:'AV29Metpieanc',fld:'vMETPIEANC',pic:'ZZ9'},{av:'AV18BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV19BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV42Error',fld:'vERROR',pic:''},{av:'AV39WebSessionKey',fld:'vWEBSESSIONKEY',pic:''},{av:'AV45Objetos',fld:'vOBJETOS',pic:''}]}");
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
      wcpOAV22EmprCod = "" ;
      wcpOAV36OpeNom = "" ;
      wcpOAV27MaqCod = "" ;
      wcpOAV28MaqDsc = "" ;
      wcpOAV6FasCod = "" ;
      wcpOAV7FasDsc = "" ;
      wcpOAV14BarCodPar = "" ;
      wcpOAV37Procod = "" ;
      wcpOAV11TermCod = "" ;
      wcpOAV25KMS = "" ;
      wcpOAV39WebSessionKey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22EmprCod = "" ;
      AV36OpeNom = "" ;
      AV27MaqCod = "" ;
      AV28MaqDsc = "" ;
      AV6FasCod = "" ;
      AV7FasDsc = "" ;
      AV14BarCodPar = "" ;
      AV37Procod = "" ;
      AV11TermCod = "" ;
      AV25KMS = "" ;
      AV39WebSessionKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV51Pgmname = "" ;
      GXKey = "" ;
      AV26Lecfec = GXutil.nullDate() ;
      AV5BarPieobs = "" ;
      AV9MetPieId = "" ;
      AV31Msg_rr = "" ;
      AV38Teia = "" ;
      AV45Objetos = new GXSimpleCollection<String>(String.class, "internal", "");
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_table_panel = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV19BarPieMet = DecimalUtil.ZERO ;
      AV18BarPieKil = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV48Station = "" ;
      GXt_char1 = "" ;
      AV49Emprnom = "" ;
      AV50Usurcod = "" ;
      AV40SDT_PiezaDefectos = new GXBaseCollection<app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto>(app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto.class, "SDT_PiezaDefecto", "TexplusNET", remoteHandle);
      AV41WebSession = httpContext.getWebSession();
      AV17BarPiecod = "" ;
      AV30MetPieobs = "" ;
      GXv_int9 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_date21 = new java.util.Date[1] ;
      GXv_int22 = new int[1] ;
      GXv_int23 = new byte[1] ;
      GXv_int24 = new short[1] ;
      GXv_char25 = new String[1] ;
      GXv_int26 = new byte[1] ;
      AV44window = new com.genexus.webpanels.GXWindow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV51Pgmname = "ExpedicionesAutomatizadas.WebContador_CapturaManual" ;
      /* GeneXus formulas. */
      AV51Pgmname = "ExpedicionesAutomatizadas.WebContador_CapturaManual" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV15BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV15BarCodReo ;
   private byte gxajaxcallmode ;
   private byte AV34NumPzsFs ;
   private byte AV35NumPzsFs2 ;
   private byte AV43NoEtiquet ;
   private byte AV32Nocamp ;
   private byte AV24hisprotur ;
   private byte AV20Calidad ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int15[] ;
   private byte GXv_int23[] ;
   private byte GXv_int26[] ;
   private byte nGXWrapped ;
   private short wcpOAV16BarOrdlin ;
   private short AV16BarOrdlin ;
   private short AV29Metpieanc ;
   private short AV23Grm2 ;
   private short AV8MetPieDef ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV33Num_pz ;
   private short GXv_int8[] ;
   private short GXv_int24[] ;
   private int wcpOAV10OpeCod ;
   private int wcpOAV13BarCod ;
   private int AV10OpeCod ;
   private int AV13BarCod ;
   private int AV12Albreccod ;
   private int edtavBarpiemet_Enabled ;
   private int edtavBarpiekil_Enabled ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private int GXv_int22[] ;
   private int idxLst ;
   private java.math.BigDecimal AV19BarPieMet ;
   private java.math.BigDecimal AV18BarPieKil ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private String wcpOAV22EmprCod ;
   private String wcpOAV36OpeNom ;
   private String wcpOAV27MaqCod ;
   private String wcpOAV28MaqDsc ;
   private String wcpOAV6FasCod ;
   private String wcpOAV7FasDsc ;
   private String wcpOAV14BarCodPar ;
   private String wcpOAV37Procod ;
   private String wcpOAV11TermCod ;
   private String wcpOAV25KMS ;
   private String wcpOAV39WebSessionKey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV22EmprCod ;
   private String AV36OpeNom ;
   private String AV27MaqCod ;
   private String AV28MaqDsc ;
   private String AV6FasCod ;
   private String AV7FasDsc ;
   private String AV14BarCodPar ;
   private String AV37Procod ;
   private String AV11TermCod ;
   private String AV25KMS ;
   private String AV39WebSessionKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV51Pgmname ;
   private String GXKey ;
   private String AV5BarPieobs ;
   private String AV9MetPieId ;
   private String AV31Msg_rr ;
   private String AV38Teia ;
   private String Dvpanel_table_panel_Width ;
   private String Dvpanel_table_panel_Cls ;
   private String Dvpanel_table_panel_Title ;
   private String Dvpanel_table_panel_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_table_panel_Internalname ;
   private String divTable_panel_Internalname ;
   private String divTablemetros_Internalname ;
   private String edtavBarpiemet_Internalname ;
   private String TempTags ;
   private String edtavBarpiemet_Tooltiptext ;
   private String edtavBarpiemet_Jsonclick ;
   private String divTablepeso_Internalname ;
   private String edtavBarpiekil_Internalname ;
   private String edtavBarpiekil_Jsonclick ;
   private String divTablebotones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV48Station ;
   private String GXt_char1 ;
   private String AV49Emprnom ;
   private String AV50Usurcod ;
   private String AV17BarPiecod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char25[] ;
   private java.util.Date AV26Lecfec ;
   private java.util.Date GXv_date21[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV42Error ;
   private boolean Dvpanel_table_panel_Autowidth ;
   private boolean Dvpanel_table_panel_Autoheight ;
   private boolean Dvpanel_table_panel_Collapsible ;
   private boolean Dvpanel_table_panel_Collapsed ;
   private boolean Dvpanel_table_panel_Showcollapseicon ;
   private boolean Dvpanel_table_panel_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV21CheckRequiredFieldsResult ;
   private String AV30MetPieobs ;
   private com.genexus.webpanels.GXWindow AV44window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV41WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_table_panel ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV45Objetos ;
   private GXBaseCollection<app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto> AV40SDT_PiezaDefectos ;
}

