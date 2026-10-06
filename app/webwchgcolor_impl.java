package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwchgcolor_impl extends GXDataArea
{
   public webwchgcolor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwchgcolor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwchgcolor_impl.class ));
   }

   public webwchgcolor_impl( int remoteHandle ,
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
            AV32EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               AV10barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
               AV8barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8barcodpar", AV8barcodpar);
               AV26clicod = (int)(GXutil.lval( httpContext.GetPar( "clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26clicod), 6, 0));
               AV27CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CliNom", AV27CliNom);
               AV20Barser = httpContext.GetPar( "Barser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Barser", AV20Barser);
               AV21BarSerdsc = httpContext.GetPar( "BarSerdsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21BarSerdsc", AV21BarSerdsc);
               AV13Barcolnomout = httpContext.GetPar( "Barcolnomout") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnomout", AV13Barcolnomout);
               AV15Barcolnumout = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumout"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnumout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barcolnumout), 6, 0));
               AV17barnomcliout = httpContext.GetPar( "barnomcliout") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17barnomcliout", AV17barnomcliout);
               AV19Barnumcliout = (int)(GXutil.lval( httpContext.GetPar( "Barnumcliout"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barnumcliout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barnumcliout), 6, 0));
               AV25BarTipcolOut = (byte)(GXutil.lval( httpContext.GetPar( "BarTipcolOut"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipcolOut", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipcolOut), 2, 0));
               AV5BarAGrEst = httpContext.GetPar( "BarAGrEst") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarAGrEst", AV5BarAGrEst);
               AV29FlagCambios = (byte)(GXutil.lval( httpContext.GetPar( "FlagCambios"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCambios", GXutil.str( AV29FlagCambios, 1, 0));
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
      pa1062( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1062( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwchgcolor", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV26clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV27CliNom)),GXutil.URLEncode(GXutil.rtrim(AV20Barser)),GXutil.URLEncode(GXutil.rtrim(AV21BarSerdsc)),GXutil.URLEncode(GXutil.rtrim(AV13Barcolnomout)),GXutil.URLEncode(GXutil.ltrimstr(AV15Barcolnumout,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17barnomcliout)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barnumcliout,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarTipcolOut,2,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarAGrEst)),GXutil.URLEncode(GXutil.ltrimstr(AV29FlagCambios,1,0))}, new String[] {"EmprCod","Barcod","barcodreo","barcodpar","clicod","CliNom","Barser","BarSerdsc","Barcolnomout","Barcolnumout","barnomcliout","Barnumcliout","BarTipcolOut","BarAGrEst","FlagCambios"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Carvitin), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOMOUT", GXutil.rtrim( AV13Barcolnomout));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNOMCLIOUT", GXutil.rtrim( AV17barnomcliout));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUMOUT", GXutil.ltrim( localUtil.ntoc( AV15Barcolnumout, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNUMCLIOUT", GXutil.ltrim( localUtil.ntoc( AV19Barnumcliout, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTIPCOLOUT", GXutil.ltrim( localUtil.ntoc( AV25BarTipcolOut, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCAMBIOS", GXutil.ltrim( localUtil.ntoc( AV29FlagCambios, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV5BarAGrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV36UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV34Station));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR", GXutil.rtrim( A122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICODAGR", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRSER", GXutil.rtrim( A1245BarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV37Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Carvitin), "ZZZ9")));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1062( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1062( ) ;
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
      return formatLink("app.webwchgcolor", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV26clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV27CliNom)),GXutil.URLEncode(GXutil.rtrim(AV20Barser)),GXutil.URLEncode(GXutil.rtrim(AV21BarSerdsc)),GXutil.URLEncode(GXutil.rtrim(AV13Barcolnomout)),GXutil.URLEncode(GXutil.ltrimstr(AV15Barcolnumout,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17barnomcliout)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barnumcliout,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarTipcolOut,2,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarAGrEst)),GXutil.URLEncode(GXutil.ltrimstr(AV29FlagCambios,1,0))}, new String[] {"EmprCod","Barcod","barcodreo","barcodpar","clicod","CliNom","Barser","BarSerdsc","Barcolnomout","Barcolnumout","barnomcliout","Barnumcliout","BarTipcolOut","BarAGrEst","FlagCambios"})  ;
   }

   public String getPgmname( )
   {
      return "WebWchgcolor" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Cambio de color", "") ;
   }

   public void wb1060( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarnhdr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "", "", lblTextblockbarnhdr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV33Barnhdr), GXutil.rtrim( localUtil.format( AV33Barnhdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV26clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclinom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, "", "", "", lblTextblockclinom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV27CliNom), GXutil.rtrim( localUtil.format( AV27CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWchgcolor.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarser_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarser_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblockbarser_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV20Barser), GXutil.rtrim( localUtil.format( AV20Barser, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarserdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarserdsc_Internalname, httpContext.getMessage( "Descripción ", ""), "", "", lblTextblockbarserdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripción ", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV21BarSerdsc), GXutil.rtrim( localUtil.format( AV21BarSerdsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWchgcolor.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcolnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcolnom_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblockbarcolnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV12Barcolnom), GXutil.rtrim( localUtil.format( AV12Barcolnom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpromptcolores_Internalname, "", httpContext.getMessage( "colores", ""), bttBtnpromptcolores_Jsonclick, 5, httpContext.getMessage( "colores", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPTCOLORES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcolnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblockbarcolnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14Barcolnum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14Barcolnum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebartipcol_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbartipcol_Internalname, httpContext.getMessage( "Tc", ""), "", "", lblTextblockbartipcol_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "Tc", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV24BarTipcol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24BarTipcol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV24BarTipcol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWchgcolor.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarnomcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblockbarnomcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV16barnomcli), GXutil.rtrim( localUtil.format( AV16barnomcli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarnumcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnumcli_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblockbarnumcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumcli_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Barnumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18Barnumcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18Barnumcli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWchgcolor.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWchgcolor.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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

   public void start1062( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Cambio de color", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1060( ) ;
   }

   public void ws1062( )
   {
      start1062( ) ;
      evt1062( ) ;
   }

   public void evt1062( )
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
                           e111062 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e121062 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPTCOLORES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPromptcolores' */
                           e131062 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e141062 ();
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

   public void we1062( )
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

   public void pa1062( )
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
            GX_FocusControl = edtavBarnhdr_Internalname ;
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
      rf1062( ) ;
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
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
   }

   public void rf1062( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e141062 ();
         wb1060( ) ;
      }
   }

   public void send_integrity_lvl_hashes1062( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV37Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Carvitin), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1060( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111062 ();
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
         /* Read variables values. */
         AV33Barnhdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Barnhdr", AV33Barnhdr);
         AV26clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26clicod), 6, 0));
         AV20Barser = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Barser", AV20Barser);
         AV12Barcolnom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Barcolnum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
         }
         else
         {
            AV14Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24BarTipcol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
         }
         else
         {
            AV24BarTipcol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
         }
         AV16barnomcli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16barnomcli", AV16barnomcli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLI");
            GX_FocusControl = edtavBarnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18Barnumcli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
         }
         else
         {
            AV18Barnumcli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
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
      e111062 ();
      if (returnInSub) return;
   }

   public void e111062( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV34Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwchgcolor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Station", AV34Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV35EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwchgcolor_impl.this.AV32EmprCod = GXv_char2[0] ;
      webwchgcolor_impl.this.AV35EmprNom = GXv_char3[0] ;
      webwchgcolor_impl.this.AV36UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
      GXt_int5 = (byte)(AV37Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      webwchgcolor_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Carvitin), "ZZZ9")));
      AV12Barcolnom = AV13Barcolnomout ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
      AV14Barcolnum = AV15Barcolnumout ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
      AV16barnomcli = AV17barnomcliout ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16barnomcli", AV16barnomcli);
      AV18Barnumcli = AV19Barnumcliout ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
      AV24BarTipcol = AV25BarTipcolOut ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
      AV29FlagCambios = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCambios", GXutil.str( AV29FlagCambios, 1, 0));
      AV33Barnhdr = GXutil.str( AV6Barcod, 8, 0) + "-" + GXutil.str( AV10barcodreo, 1, 0) + AV8barcodpar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Barnhdr", AV33Barnhdr);
      GXt_char1 = AV34Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwchgcolor_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Station", AV34Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV35EmprNom ;
      GXv_char2[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwchgcolor_impl.this.AV32EmprCod = GXv_char4[0] ;
      webwchgcolor_impl.this.AV35EmprNom = GXv_char3[0] ;
      webwchgcolor_impl.this.AV36UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
   }

   public void e121062( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_int6[0] = AV28Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV32EmprCod, AV26clicod, AV20Barser, AV12Barcolnom, AV14Barcolnum, AV24BarTipcol, GXv_int6) ;
      webwchgcolor_impl.this.AV28Flag = GXv_int6[0] ;
      if ( AV28Flag == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe COLOR con los datos confirmados ¡¡¡", ""));
         GX_FocusControl = edtavBarcolnom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( GXutil.strcmp(AV12Barcolnom, AV13Barcolnomout) == 0 ) && ( GXutil.strcmp(AV16barnomcli, AV17barnomcliout) == 0 ) && ( AV14Barcolnum == AV15Barcolnumout ) && ( AV18Barnumcli == AV19Barnumcliout ) && ( AV24BarTipcol == AV25BarTipcolOut ) )
         {
            httpContext.setWebReturnParms(new Object[] {AV32EmprCod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV10barcodreo),AV8barcodpar,Integer.valueOf(AV26clicod),AV27CliNom,AV20Barser,AV21BarSerdsc,AV13Barcolnomout,Integer.valueOf(AV15Barcolnumout),AV17barnomcliout,Integer.valueOf(AV19Barnumcliout),Byte.valueOf(AV25BarTipcolOut),AV5BarAGrEst,Byte.valueOf(AV29FlagCambios)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV32EmprCod","AV6Barcod","AV10barcodreo","AV8barcodpar","AV26clicod","AV27CliNom","AV20Barser","AV21BarSerdsc","AV13Barcolnomout","AV15Barcolnumout","AV17barnomcliout","AV19Barnumcliout","AV25BarTipcolOut","AV5BarAGrEst","AV29FlagCambios"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
         else
         {
            AV29FlagCambios = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCambios", GXutil.str( AV29FlagCambios, 1, 0));
            GXv_char4[0] = AV32EmprCod ;
            GXv_int7[0] = AV6Barcod ;
            GXv_int6[0] = AV10barcodreo ;
            GXv_char3[0] = AV8barcodpar ;
            GXv_char2[0] = AV20Barser ;
            GXv_char8[0] = AV12Barcolnom ;
            GXv_int9[0] = AV14Barcolnum ;
            GXv_int10[0] = AV24BarTipcol ;
            GXv_char11[0] = AV16barnomcli ;
            GXv_int12[0] = AV18Barnumcli ;
            GXv_char13[0] = AV36UsurCod ;
            GXv_char14[0] = AV34Station ;
            new app.pchgco1(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_char8, GXv_int9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
            webwchgcolor_impl.this.AV32EmprCod = GXv_char4[0] ;
            webwchgcolor_impl.this.AV6Barcod = GXv_int7[0] ;
            webwchgcolor_impl.this.AV10barcodreo = GXv_int6[0] ;
            webwchgcolor_impl.this.AV8barcodpar = GXv_char3[0] ;
            webwchgcolor_impl.this.AV20Barser = GXv_char2[0] ;
            webwchgcolor_impl.this.AV12Barcolnom = GXv_char8[0] ;
            webwchgcolor_impl.this.AV14Barcolnum = GXv_int9[0] ;
            webwchgcolor_impl.this.AV24BarTipcol = GXv_int10[0] ;
            webwchgcolor_impl.this.AV16barnomcli = GXv_char11[0] ;
            webwchgcolor_impl.this.AV18Barnumcli = GXv_int12[0] ;
            webwchgcolor_impl.this.AV36UsurCod = GXv_char13[0] ;
            webwchgcolor_impl.this.AV34Station = GXv_char14[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcodpar", AV8barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV20Barser", AV20Barser);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV16barnomcli", AV16barnomcli);
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV34Station", AV34Station);
            if ( GXutil.strcmp(AV5BarAGrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               AV30i = (short)(1) ;
               GX_I = 1 ;
               while ( GX_I <= 100 )
               {
                  AV31Tab_hdragr[GX_I-1] = " " ;
                  GX_I = (int)(GX_I+1) ;
               }
               /* Using cursor H01062 */
               pr_default.execute(0, new Object[] {AV32EmprCod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV10barcodreo), AV8barcodpar});
               while ( (pr_default.getStatus(0) != 101) )
               {
                  A130BarCodPar = H01062_A130BarCodPar[0] ;
                  A132BarCodReo = H01062_A132BarCodReo[0] ;
                  A129BarCod = H01062_A129BarCod[0] ;
                  A396EmprCod = H01062_A396EmprCod[0] ;
                  A119BarAgrCod = H01062_A119BarAgrCod[0] ;
                  A124BarAgrReo = H01062_A124BarAgrReo[0] ;
                  A122BarAgrPar = H01062_A122BarAgrPar[0] ;
                  A1508CliCodAgr = H01062_A1508CliCodAgr[0] ;
                  A1245BarAgrSer = H01062_A1245BarAgrSer[0] ;
                  GXv_char14[0] = AV32EmprCod ;
                  GXv_int12[0] = A119BarAgrCod ;
                  GXv_int10[0] = A124BarAgrReo ;
                  GXv_char13[0] = A122BarAgrPar ;
                  GXv_char11[0] = AV20Barser ;
                  GXv_char8[0] = AV12Barcolnom ;
                  GXv_int9[0] = AV14Barcolnum ;
                  GXv_int6[0] = AV24BarTipcol ;
                  GXv_char4[0] = AV16barnomcli ;
                  GXv_int7[0] = AV18Barnumcli ;
                  GXv_char3[0] = AV36UsurCod ;
                  GXv_char2[0] = AV34Station ;
                  new app.pchgco2(remoteHandle, context).execute( GXv_char14, GXv_int12, GXv_int10, GXv_char13, GXv_char11, GXv_char8, GXv_int9, GXv_int6, GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
                  webwchgcolor_impl.this.AV32EmprCod = GXv_char14[0] ;
                  webwchgcolor_impl.this.A119BarAgrCod = GXv_int12[0] ;
                  webwchgcolor_impl.this.A124BarAgrReo = GXv_int10[0] ;
                  webwchgcolor_impl.this.A122BarAgrPar = GXv_char13[0] ;
                  webwchgcolor_impl.this.AV20Barser = GXv_char11[0] ;
                  webwchgcolor_impl.this.AV12Barcolnom = GXv_char8[0] ;
                  webwchgcolor_impl.this.AV14Barcolnum = GXv_int9[0] ;
                  webwchgcolor_impl.this.AV24BarTipcol = GXv_int6[0] ;
                  webwchgcolor_impl.this.AV16barnomcli = GXv_char4[0] ;
                  webwchgcolor_impl.this.AV18Barnumcli = GXv_int7[0] ;
                  webwchgcolor_impl.this.AV36UsurCod = GXv_char3[0] ;
                  webwchgcolor_impl.this.AV34Station = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV20Barser", AV20Barser);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV16barnomcli", AV16barnomcli);
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV34Station", AV34Station);
                  GXv_int10[0] = AV28Flag ;
                  new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV32EmprCod, A1508CliCodAgr, A1245BarAgrSer, AV12Barcolnom, AV14Barcolnum, AV24BarTipcol, GXv_int10) ;
                  webwchgcolor_impl.this.AV28Flag = GXv_int10[0] ;
                  if ( AV28Flag == 0 )
                  {
                     GXv_char14[0] = AV32EmprCod ;
                     GXv_int12[0] = AV26clicod ;
                     GXv_char13[0] = AV20Barser ;
                     GXv_char11[0] = AV12Barcolnom ;
                     GXv_int9[0] = AV14Barcolnum ;
                     GXv_int10[0] = AV24BarTipcol ;
                     GXv_int7[0] = A1508CliCodAgr ;
                     GXv_char8[0] = A1245BarAgrSer ;
                     GXv_char4[0] = AV12Barcolnom ;
                     GXv_int15[0] = AV14Barcolnum ;
                     GXv_int6[0] = AV24BarTipcol ;
                     GXv_char3[0] = AV16barnomcli ;
                     GXv_int16[0] = AV18Barnumcli ;
                     GXv_int17[0] = (byte)(0) ;
                     new app.pdupfork(remoteHandle, context).execute( GXv_char14, GXv_int12, GXv_char13, GXv_char11, GXv_int9, GXv_int10, GXv_int7, GXv_char8, GXv_char4, GXv_int15, GXv_int6, GXv_char3, GXv_int16, GXv_int17) ;
                     webwchgcolor_impl.this.AV32EmprCod = GXv_char14[0] ;
                     webwchgcolor_impl.this.AV26clicod = GXv_int12[0] ;
                     webwchgcolor_impl.this.AV20Barser = GXv_char13[0] ;
                     webwchgcolor_impl.this.AV12Barcolnom = GXv_char11[0] ;
                     webwchgcolor_impl.this.AV14Barcolnum = GXv_int9[0] ;
                     webwchgcolor_impl.this.AV24BarTipcol = GXv_int10[0] ;
                     webwchgcolor_impl.this.A1508CliCodAgr = GXv_int7[0] ;
                     webwchgcolor_impl.this.A1245BarAgrSer = GXv_char8[0] ;
                     webwchgcolor_impl.this.AV12Barcolnom = GXv_char4[0] ;
                     webwchgcolor_impl.this.AV14Barcolnum = GXv_int15[0] ;
                     webwchgcolor_impl.this.AV24BarTipcol = GXv_int6[0] ;
                     webwchgcolor_impl.this.AV16barnomcli = GXv_char3[0] ;
                     webwchgcolor_impl.this.AV18Barnumcli = GXv_int16[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV26clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26clicod), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV20Barser", AV20Barser);
                     httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
                     httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV16barnomcli", AV16barnomcli);
                     httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
                  }
                  AV31Tab_hdragr[AV30i-1] = GXutil.str( A119BarAgrCod, 8, 0) + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                  AV30i = (short)(AV30i+1) ;
                  pr_default.readNext(0);
               }
               pr_default.close(0);
               AV30i = (short)(1) ;
               while ( AV30i <= 100 )
               {
                  if ( GXutil.strcmp(AV31Tab_hdragr[AV30i-1], " ") == 0 )
                  {
                     if (true) break;
                  }
                  AV7Barcodagr = (int)(GXutil.lval( GXutil.substring( AV31Tab_hdragr[AV30i-1], 1, 8))) ;
                  AV11barcodreoagr = (byte)(GXutil.lval( GXutil.substring( AV31Tab_hdragr[AV30i-1], 9, 1))) ;
                  AV9barcodparagr = GXutil.substring( AV31Tab_hdragr[AV30i-1], 10, 1) ;
                  GXv_char14[0] = AV32EmprCod ;
                  GXv_int16[0] = AV7Barcodagr ;
                  GXv_int17[0] = AV11barcodreoagr ;
                  GXv_char13[0] = AV9barcodparagr ;
                  GXv_char11[0] = AV12Barcolnom ;
                  GXv_int15[0] = AV14Barcolnum ;
                  GXv_int10[0] = AV24BarTipcol ;
                  GXv_char8[0] = AV16barnomcli ;
                  GXv_int12[0] = AV18Barnumcli ;
                  GXv_char4[0] = AV36UsurCod ;
                  GXv_char3[0] = AV34Station ;
                  new app.pprc230(remoteHandle, context).execute( GXv_char14, GXv_int16, GXv_int17, GXv_char13, GXv_char11, GXv_int15, GXv_int10, GXv_char8, GXv_int12, GXv_char4, GXv_char3) ;
                  webwchgcolor_impl.this.AV32EmprCod = GXv_char14[0] ;
                  webwchgcolor_impl.this.AV7Barcodagr = GXv_int16[0] ;
                  webwchgcolor_impl.this.AV11barcodreoagr = GXv_int17[0] ;
                  webwchgcolor_impl.this.AV9barcodparagr = GXv_char13[0] ;
                  webwchgcolor_impl.this.AV12Barcolnom = GXv_char11[0] ;
                  webwchgcolor_impl.this.AV14Barcolnum = GXv_int15[0] ;
                  webwchgcolor_impl.this.AV24BarTipcol = GXv_int10[0] ;
                  webwchgcolor_impl.this.AV16barnomcli = GXv_char8[0] ;
                  webwchgcolor_impl.this.AV18Barnumcli = GXv_int12[0] ;
                  webwchgcolor_impl.this.AV36UsurCod = GXv_char4[0] ;
                  webwchgcolor_impl.this.AV34Station = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom", AV12Barcolnom);
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barcolnum), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV24BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarTipcol), 2, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV16barnomcli", AV16barnomcli);
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Barnumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barnumcli), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV34Station", AV34Station);
                  AV30i = (short)(AV30i+1) ;
               }
            }
            if ( AV37Carvitin == 1 )
            {
               httpContext.popup(formatLink("app.webwchgco2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV20Barser)),GXutil.URLEncode(GXutil.rtrim(AV12Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barcolnum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16barnomcli)),GXutil.URLEncode(GXutil.ltrimstr(AV18Barnumcli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarTipcol,2,0))}, new String[] {"EmprCod","Clicod","Barser","Barcolnom","Barcolnum","BarNomcli","Barnumcli","BarTipcol"}) , new Object[] {"AV32EmprCod","AV26clicod","AV20Barser","AV12Barcolnom","AV14Barcolnum","AV16barnomcli","AV18Barnumcli","AV24BarTipcol"});
            }
            AV13Barcolnomout = AV12Barcolnom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnomout", AV13Barcolnomout);
            AV15Barcolnumout = AV14Barcolnum ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnumout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barcolnumout), 6, 0));
            AV17barnomcliout = AV16barnomcli ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17barnomcliout", AV17barnomcliout);
            AV19Barnumcliout = AV18Barnumcli ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Barnumcliout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barnumcliout), 6, 0));
            AV25BarTipcolOut = AV24BarTipcol ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipcolOut", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipcolOut), 2, 0));
            httpContext.setWebReturnParms(new Object[] {AV32EmprCod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV10barcodreo),AV8barcodpar,Integer.valueOf(AV26clicod),AV27CliNom,AV20Barser,AV21BarSerdsc,AV13Barcolnomout,Integer.valueOf(AV15Barcolnumout),AV17barnomcliout,Integer.valueOf(AV19Barnumcliout),Byte.valueOf(AV25BarTipcolOut),AV5BarAGrEst,Byte.valueOf(AV29FlagCambios)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV32EmprCod","AV6Barcod","AV10barcodreo","AV8barcodpar","AV26clicod","AV27CliNom","AV20Barser","AV21BarSerdsc","AV13Barcolnomout","AV15Barcolnumout","AV17barnomcliout","AV19Barnumcliout","AV25BarTipcolOut","AV5BarAGrEst","AV29FlagCambios"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e131062( )
   {
      /* 'DoPromptcolores' Routine */
      returnInSub = false ;
      AV23BarSerpaso = AV20Barser ;
      AV22BarSerDscpaso = AV21BarSerdsc ;
      httpContext.popup(formatLink("app.wpcncolores", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV23BarSerpaso)),GXutil.URLEncode(GXutil.rtrim(AV12Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarTipcol,2,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutCliCod","InOutForSer","InOutForColNom","InOutForColNum","InOutTipColCod","InoutForNomcli","InoutFornumcli","InoutFortonal"}) , new Object[] {"AV32EmprCod","AV26clicod","AV23BarSerpaso","AV12Barcolnom","AV14Barcolnum","AV24BarTipcol","AV16barnomcli","AV18Barnumcli",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e141062( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV32EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      AV10barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
      AV8barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8barcodpar", AV8barcodpar);
      AV26clicod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26clicod), 6, 0));
      AV27CliNom = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CliNom", AV27CliNom);
      AV20Barser = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Barser", AV20Barser);
      AV21BarSerdsc = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarSerdsc", AV21BarSerdsc);
      AV13Barcolnomout = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnomout", AV13Barcolnomout);
      AV15Barcolnumout = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnumout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barcolnumout), 6, 0));
      AV17barnomcliout = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17barnomcliout", AV17barnomcliout);
      AV19Barnumcliout = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Barnumcliout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barnumcliout), 6, 0));
      AV25BarTipcolOut = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipcolOut", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipcolOut), 2, 0));
      AV5BarAGrEst = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarAGrEst", AV5BarAGrEst);
      AV29FlagCambios = ((Number) GXutil.testNumericType( getParm(obj,14), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCambios", GXutil.str( AV29FlagCambios, 1, 0));
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
      pa1062( ) ;
      ws1062( ) ;
      we1062( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016423990", true, true);
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
      httpContext.AddJavascriptSource("webwchgcolor.js", "?202661016423991", false, true);
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
      lblTextblockbarnhdr_Internalname = "TEXTBLOCKBARNHDR" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtablebarnhdr_Internalname = "UNNAMEDTABLEBARNHDR" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = "TEXTBLOCKCLINOM" ;
      edtavClinom_Internalname = "vCLINOM" ;
      divUnnamedtableclinom_Internalname = "UNNAMEDTABLECLINOM" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockbarser_Internalname = "TEXTBLOCKBARSER" ;
      edtavBarser_Internalname = "vBARSER" ;
      divUnnamedtablebarser_Internalname = "UNNAMEDTABLEBARSER" ;
      lblTextblockbarserdsc_Internalname = "TEXTBLOCKBARSERDSC" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      divUnnamedtablebarserdsc_Internalname = "UNNAMEDTABLEBARSERDSC" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockbarcolnom_Internalname = "TEXTBLOCKBARCOLNOM" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      divUnnamedtablebarcolnom_Internalname = "UNNAMEDTABLEBARCOLNOM" ;
      bttBtnpromptcolores_Internalname = "BTNPROMPTCOLORES" ;
      lblTextblockbarcolnum_Internalname = "TEXTBLOCKBARCOLNUM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtablebarcolnum_Internalname = "UNNAMEDTABLEBARCOLNUM" ;
      lblTextblockbartipcol_Internalname = "TEXTBLOCKBARTIPCOL" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      divUnnamedtablebartipcol_Internalname = "UNNAMEDTABLEBARTIPCOL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockbarnomcli_Internalname = "TEXTBLOCKBARNOMCLI" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      divUnnamedtablebarnomcli_Internalname = "UNNAMEDTABLEBARNOMCLI" ;
      lblTextblockbarnumcli_Internalname = "TEXTBLOCKBARNUMCLI" ;
      edtavBarnumcli_Internalname = "vBARNUMCLI" ;
      divUnnamedtablebarnumcli_Internalname = "UNNAMEDTABLEBARNUMCLI" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
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
      edtavBarnumcli_Jsonclick = "" ;
      edtavBarnumcli_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Cambio de color", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV37Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121062',iparms:[{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV20Barser',fld:'vBARSER',pic:''},{av:'AV12Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV14Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV24BarTipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV13Barcolnomout',fld:'vBARCOLNOMOUT',pic:''},{av:'AV16barnomcli',fld:'vBARNOMCLI',pic:''},{av:'AV17barnomcliout',fld:'vBARNOMCLIOUT',pic:''},{av:'AV15Barcolnumout',fld:'vBARCOLNUMOUT',pic:'ZZZZZ9'},{av:'AV18Barnumcli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV19Barnumcliout',fld:'vBARNUMCLIOUT',pic:'ZZZZZ9'},{av:'AV25BarTipcolOut',fld:'vBARTIPCOLOUT',pic:'Z9'},{av:'AV29FlagCambios',fld:'vFLAGCAMBIOS',pic:'9'},{av:'AV5BarAGrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV21BarSerdsc',fld:'vBARSERDSC',pic:''},{av:'AV27CliNom',fld:'vCLINOM',pic:''},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV34Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A1508CliCodAgr',fld:'CLICODAGR',pic:'ZZZZZ9'},{av:'A1245BarAgrSer',fld:'BARAGRSER',pic:''},{av:'AV37Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV29FlagCambios',fld:'vFLAGCAMBIOS',pic:'9'},{av:'AV34Station',fld:'vSTATION',pic:''},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18Barnumcli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV16barnomcli',fld:'vBARNOMCLI',pic:''},{av:'AV24BarTipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV14Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV20Barser',fld:'vBARSER',pic:''},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A1245BarAgrSer',fld:'BARAGRSER',pic:''},{av:'A1508CliCodAgr',fld:'CLICODAGR',pic:'ZZZZZ9'},{av:'AV26clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV13Barcolnomout',fld:'vBARCOLNOMOUT',pic:''},{av:'AV15Barcolnumout',fld:'vBARCOLNUMOUT',pic:'ZZZZZ9'},{av:'AV17barnomcliout',fld:'vBARNOMCLIOUT',pic:''},{av:'AV19Barnumcliout',fld:'vBARNUMCLIOUT',pic:'ZZZZZ9'},{av:'AV25BarTipcolOut',fld:'vBARTIPCOLOUT',pic:'Z9'}]}");
      setEventMetadata("'DOPROMPTCOLORES'","{handler:'e131062',iparms:[{av:'AV20Barser',fld:'vBARSER',pic:''},{av:'AV21BarSerdsc',fld:'vBARSERDSC',pic:''},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV14Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV24BarTipcol',fld:'vBARTIPCOL',pic:'Z9'}]");
      setEventMetadata("'DOPROMPTCOLORES'",",oparms:[{av:'AV18Barnumcli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV16barnomcli',fld:'vBARNOMCLI',pic:''},{av:'AV24BarTipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV14Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV26clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOAV32EmprCod = "" ;
      wcpOAV8barcodpar = "" ;
      wcpOAV27CliNom = "" ;
      wcpOAV20Barser = "" ;
      wcpOAV21BarSerdsc = "" ;
      wcpOAV13Barcolnomout = "" ;
      wcpOAV17barnomcliout = "" ;
      wcpOAV5BarAGrEst = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV32EmprCod = "" ;
      AV8barcodpar = "" ;
      AV27CliNom = "" ;
      AV20Barser = "" ;
      AV21BarSerdsc = "" ;
      AV13Barcolnomout = "" ;
      AV17barnomcliout = "" ;
      AV5BarAGrEst = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV36UsurCod = "" ;
      AV34Station = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      A1245BarAgrSer = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockbarnhdr_Jsonclick = "" ;
      TempTags = "" ;
      AV33Barnhdr = "" ;
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      lblTextblockbarser_Jsonclick = "" ;
      lblTextblockbarserdsc_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockbarcolnom_Jsonclick = "" ;
      AV12Barcolnom = "" ;
      bttBtnpromptcolores_Jsonclick = "" ;
      lblTextblockbarcolnum_Jsonclick = "" ;
      lblTextblockbartipcol_Jsonclick = "" ;
      lblTextblockbarnomcli_Jsonclick = "" ;
      AV16barnomcli = "" ;
      lblTextblockbarnumcli_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV35EmprNom = "" ;
      GXt_char1 = "" ;
      AV31Tab_hdragr = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV31Tab_hdragr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      H01062_A130BarCodPar = new String[] {""} ;
      H01062_A132BarCodReo = new byte[1] ;
      H01062_A129BarCod = new int[1] ;
      H01062_A396EmprCod = new String[] {""} ;
      H01062_A119BarAgrCod = new int[1] ;
      H01062_A124BarAgrReo = new byte[1] ;
      H01062_A122BarAgrPar = new String[] {""} ;
      H01062_A1508CliCodAgr = new int[1] ;
      H01062_A1245BarAgrSer = new String[] {""} ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      AV9barcodparagr = "" ;
      GXv_char14 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV23BarSerpaso = "" ;
      AV22BarSerDscpaso = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwchgcolor__default(),
         new Object[] {
             new Object[] {
            H01062_A130BarCodPar, H01062_A132BarCodReo, H01062_A129BarCod, H01062_A396EmprCod, H01062_A119BarAgrCod, H01062_A124BarAgrReo, H01062_A122BarAgrPar, H01062_A1508CliCodAgr, H01062_A1245BarAgrSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
   }

   private byte wcpOAV10barcodreo ;
   private byte wcpOAV25BarTipcolOut ;
   private byte wcpOAV29FlagCambios ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10barcodreo ;
   private byte AV25BarTipcolOut ;
   private byte AV29FlagCambios ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV24BarTipcol ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte AV28Flag ;
   private byte GXv_int6[] ;
   private byte AV11barcodreoagr ;
   private byte GXv_int17[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV37Carvitin ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV30i ;
   private int wcpOAV6Barcod ;
   private int wcpOAV26clicod ;
   private int wcpOAV15Barcolnumout ;
   private int wcpOAV19Barnumcliout ;
   private int AV6Barcod ;
   private int AV26clicod ;
   private int AV15Barcolnumout ;
   private int AV19Barnumcliout ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int edtavBarnhdr_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV14Barcolnum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int AV18Barnumcli ;
   private int edtavBarnumcli_Enabled ;
   private int GX_I ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private int AV7Barcodagr ;
   private int GXv_int16[] ;
   private int GXv_int15[] ;
   private int GXv_int12[] ;
   private int idxLst ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV8barcodpar ;
   private String wcpOAV27CliNom ;
   private String wcpOAV20Barser ;
   private String wcpOAV21BarSerdsc ;
   private String wcpOAV13Barcolnomout ;
   private String wcpOAV17barnomcliout ;
   private String wcpOAV5BarAGrEst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV32EmprCod ;
   private String AV8barcodpar ;
   private String AV27CliNom ;
   private String AV20Barser ;
   private String AV21BarSerdsc ;
   private String AV13Barcolnomout ;
   private String AV17barnomcliout ;
   private String AV5BarAGrEst ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV36UsurCod ;
   private String AV34Station ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
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
   private String divUnnamedtablebarnhdr_Internalname ;
   private String lblTextblockbarnhdr_Internalname ;
   private String lblTextblockbarnhdr_Jsonclick ;
   private String edtavBarnhdr_Internalname ;
   private String TempTags ;
   private String AV33Barnhdr ;
   private String edtavBarnhdr_Jsonclick ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String divUnnamedtableclinom_Internalname ;
   private String lblTextblockclinom_Internalname ;
   private String lblTextblockclinom_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtablebarser_Internalname ;
   private String lblTextblockbarser_Internalname ;
   private String lblTextblockbarser_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String divUnnamedtablebarserdsc_Internalname ;
   private String lblTextblockbarserdsc_Internalname ;
   private String lblTextblockbarserdsc_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtablebarcolnom_Internalname ;
   private String lblTextblockbarcolnom_Internalname ;
   private String lblTextblockbarcolnom_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV12Barcolnom ;
   private String edtavBarcolnom_Jsonclick ;
   private String bttBtnpromptcolores_Internalname ;
   private String bttBtnpromptcolores_Jsonclick ;
   private String divUnnamedtablebarcolnum_Internalname ;
   private String lblTextblockbarcolnum_Internalname ;
   private String lblTextblockbarcolnum_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divUnnamedtablebartipcol_Internalname ;
   private String lblTextblockbartipcol_Internalname ;
   private String lblTextblockbartipcol_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtablebarnomcli_Internalname ;
   private String lblTextblockbarnomcli_Internalname ;
   private String lblTextblockbarnomcli_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV16barnomcli ;
   private String edtavBarnomcli_Jsonclick ;
   private String divUnnamedtablebarnumcli_Internalname ;
   private String lblTextblockbarnumcli_Internalname ;
   private String lblTextblockbarnumcli_Jsonclick ;
   private String edtavBarnumcli_Internalname ;
   private String edtavBarnumcli_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV35EmprNom ;
   private String GXt_char1 ;
   private String AV31Tab_hdragr[] ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String AV9barcodparagr ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV23BarSerpaso ;
   private String AV22BarSerDscpaso ;
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
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private IDataStoreProvider pr_default ;
   private String[] H01062_A130BarCodPar ;
   private byte[] H01062_A132BarCodReo ;
   private int[] H01062_A129BarCod ;
   private String[] H01062_A396EmprCod ;
   private int[] H01062_A119BarAgrCod ;
   private byte[] H01062_A124BarAgrReo ;
   private String[] H01062_A122BarAgrPar ;
   private int[] H01062_A1508CliCodAgr ;
   private String[] H01062_A1245BarAgrSer ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwchgcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01062", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, CliCodAgr, BarAgrSer FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

