package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwconfor3_impl extends GXDataArea
{
   public webwconfor3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwconfor3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwconfor3_impl.class ));
   }

   public webwconfor3_impl( int remoteHandle ,
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
            AV25EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
               AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
               AV9BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
               AV21ColNom = httpContext.GetPar( "ColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21ColNom", AV21ColNom);
               AV22ColNum = (int)(GXutil.lval( httpContext.GetPar( "ColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ColNum), 6, 0));
               AV42TipCol = (byte)(GXutil.lval( httpContext.GetPar( "TipCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42TipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TipCol), 2, 0));
               AV6BarCliCod = (int)(GXutil.lval( httpContext.GetPar( "BarCliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCliCod), 6, 0));
               AV15BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarSer", AV15BarSer);
               AV29FlagExi = (byte)(GXutil.lval( httpContext.GetPar( "FlagExi"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29FlagExi", GXutil.str( AV29FlagExi, 1, 0));
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
      pa10A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start10A2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwconfor3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV21ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV22ColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42TipCol,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarSer)),GXutil.URLEncode(GXutil.ltrimstr(AV29FlagExi,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ColNom","ColNum","TipCol","BarCliCod","BarSer","FlagExi"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31Msg_1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FlagCorE), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36NoCliente), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23colorcliente), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLNOM", GXutil.rtrim( AV21ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLNUM", GXutil.ltrim( localUtil.ntoc( AV22ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOL", GXutil.ltrim( localUtil.ntoc( AV42TipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV5BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_1", GXutil.rtrim( AV31Msg_1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31Msg_1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV27Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", GXutil.rtrim( AV35msg2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV9BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV47Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV43UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR", GXutil.rtrim( A122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCORE", GXutil.ltrim( localUtil.ntoc( AV28FlagCorE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FlagCorE), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV15BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCLICOD", GXutil.ltrim( localUtil.ntoc( AV6BarCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCLIENTE", GXutil.ltrim( localUtil.ntoc( AV36NoCliente, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36NoCliente), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV19carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLORCLIENTE", GXutil.ltrim( localUtil.ntoc( AV23colorcliente, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23colorcliente), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI", GXutil.rtrim( A1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLI", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGEXI", GXutil.ltrim( localUtil.ntoc( AV29FlagExi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         we10A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt10A2( ) ;
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
      return formatLink("app.webwconfor3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV21ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV22ColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42TipCol,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarSer)),GXutil.URLEncode(GXutil.ltrimstr(AV29FlagExi,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ColNom","ColNum","TipCol","BarCliCod","BarSer","FlagExi"})  ;
   }

   public String getPgmname( )
   {
      return "WebWconfor3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Confirmar Color", "") ;
   }

   public void wb10A0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarclicodp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarclicodp_Internalname, httpContext.getMessage( "Cliente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarclicodp_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarCliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarclicodp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7BarCliCodP), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7BarCliCodP), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarclicodp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarclicodp_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWconfor3.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserp_Internalname, httpContext.getMessage( "Articulo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserp_Internalname, GXutil.rtrim( AV17BarSerP), GXutil.rtrim( localUtil.format( AV17BarSerP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserp_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWconfor3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV16BarSerDsc), GXutil.rtrim( localUtil.format( AV16BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWconfor3.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomp_Internalname, httpContext.getMessage( "Color", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomp_Internalname, GXutil.rtrim( AV11BarColNomP), GXutil.rtrim( localUtil.format( AV11BarColNomP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomp_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWconfor3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncolores_Internalname, "", httpContext.getMessage( "Colores", ""), bttBtncolores_Jsonclick, 5, httpContext.getMessage( "Colores", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOLORES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWconfor3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV13BarNomCli), GXutil.rtrim( localUtil.format( AV13BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWconfor3.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnump_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnump_Internalname, httpContext.getMessage( "Numero", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnump_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnump_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarColNumP), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarColNumP), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnump_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnump_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWconfor3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumcli_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWconfor3.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcolp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcolp_Internalname, httpContext.getMessage( "Tc", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcolp_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarTipColP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcolp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18BarTipColP), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV18BarTipColP), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcolp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcolp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWconfor3.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWconfor3.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table1_78_10A2( true) ;
      }
      else
      {
         wb_table1_78_10A2( false) ;
      }
      return  ;
   }

   public void wb_table1_78_10A2e( boolean wbgen )
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

   public void start10A2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Confirmar Color", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup10A0( ) ;
   }

   public void ws10A2( )
   {
      start10A2( ) ;
      evt10A2( ) ;
   }

   public void evt10A2( )
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
                           e1110A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1210A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e1310A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCOLORES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoColores' */
                           e1410A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1510A2 ();
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

   public void we10A2( )
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

   public void pa10A2( )
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
            GX_FocusControl = edtavBarclicodp_Internalname ;
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
      rf10A2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV47Pgmname = "WebWconfor3" ;
      Gx_err = (short)(0) ;
      edtavBarclicodp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarclicodp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarclicodp_Enabled), 5, 0), true);
      edtavBarserp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserp_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
   }

   public void rf10A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1510A2 ();
         wb10A0( ) ;
      }
   }

   public void send_integrity_lvl_hashes10A2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_1", GXutil.rtrim( AV31Msg_1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31Msg_1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", GXutil.rtrim( AV35msg2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV47Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV43UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCORE", GXutil.ltrim( localUtil.ntoc( AV28FlagCorE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FlagCorE), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCLIENTE", GXutil.ltrim( localUtil.ntoc( AV36NoCliente, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36NoCliente), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV19carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLORCLIENTE", GXutil.ltrim( localUtil.ntoc( AV23colorcliente, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23colorcliente), "9")));
   }

   public void before_start_formulas( )
   {
      AV47Pgmname = "WebWconfor3" ;
      Gx_err = (short)(0) ;
      edtavBarclicodp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarclicodp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarclicodp_Enabled), 5, 0), true);
      edtavBarserp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserp_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup10A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1210A2 ();
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarclicodp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarclicodp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCLICODP");
            GX_FocusControl = edtavBarclicodp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7BarCliCodP = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCliCodP), 6, 0));
         }
         else
         {
            AV7BarCliCodP = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarclicodp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCliCodP), 6, 0));
         }
         AV17BarSerP = httpContext.cgiGet( edtavBarserp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarSerP", AV17BarSerP);
         AV16BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarSerDsc", AV16BarSerDsc);
         AV11BarColNomP = httpContext.cgiGet( edtavBarcolnomp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomP", AV11BarColNomP);
         AV13BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarNomCli", AV13BarNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnump_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnump_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMP");
            GX_FocusControl = edtavBarcolnump_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarColNumP = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumP), 6, 0));
         }
         else
         {
            AV12BarColNumP = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnump_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumP), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLI");
            GX_FocusControl = edtavBarnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarNumCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarNumCli), 6, 0));
         }
         else
         {
            AV14BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarNumCli), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcolp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcolp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOLP");
            GX_FocusControl = edtavBartipcolp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18BarTipColP = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipColP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipColP), 2, 0));
         }
         else
         {
            AV18BarTipColP = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcolp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipColP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipColP), 2, 0));
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
      e1210A2 ();
      if (returnInSub) return;
   }

   public void e1210A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwconfor3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      AV43UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43UsurCod", AV43UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, ""))));
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwconfor3_impl.this.AV25EmprCod = GXv_char2[0] ;
      webwconfor3_impl.this.AV26EmprNom = GXv_char3[0] ;
      webwconfor3_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV43UsurCod", AV43UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, ""))));
      GXt_char1 = AV33msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG177_", ""), (byte)(99), GXv_char4) ;
      webwconfor3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33msg0 = GXt_char1 ;
      GXt_char1 = AV34msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG014_", ""), (byte)(99), GXv_char4) ;
      webwconfor3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34msg1 = GXt_char1 ;
      GXt_char1 = AV35msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG082_", ""), (byte)(99), GXv_char4) ;
      webwconfor3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35msg2", AV35msg2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35msg2, ""))));
      GXt_char1 = AV31Msg_1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN318", ""), (byte)(99), GXv_char4) ;
      webwconfor3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Msg_1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_1", AV31Msg_1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31Msg_1, ""))));
      AV11BarColNomP = AV21ColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomP", AV11BarColNomP);
      AV12BarColNumP = AV22ColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumP), 6, 0));
      AV18BarTipColP = AV42TipCol ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipColP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipColP), 2, 0));
      AV7BarCliCodP = AV6BarCliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCliCodP), 6, 0));
      AV17BarSerP = AV15BarSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarSerP", AV17BarSerP);
      AV29FlagExi = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagExi", GXutil.str( AV29FlagExi, 1, 0));
      AV28FlagCorE = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCorE", GXutil.str( AV28FlagCorE, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FlagCorE), "9")));
      GXv_int5[0] = AV28FlagCorE ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "NEWCOR", ""), GXv_int5) ;
      webwconfor3_impl.this.AV28FlagCorE = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FlagCorE", GXutil.str( AV28FlagCorE, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FlagCorE), "9")));
      GXt_int6 = AV38Scforeq ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "CFOREQ", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV38Scforeq = GXt_int6 ;
      GXt_int6 = AV24Eliot ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV24Eliot = GXt_int6 ;
      GXt_int6 = AV44Wckgcol ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "WCHGCO", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV44Wckgcol = GXt_int6 ;
      GXt_int6 = AV30Lindalana ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV30Lindalana = GXt_int6 ;
      GXt_int6 = AV36NoCliente ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "COLCUS", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV36NoCliente = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36NoCliente", GXutil.str( AV36NoCliente, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36NoCliente), "9")));
      GXt_int6 = AV19carvitin ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV19carvitin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19carvitin", GXutil.str( AV19carvitin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19carvitin), "9")));
      GXt_int6 = AV23colorcliente ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "NOMCLI", ""), GXv_int5) ;
      webwconfor3_impl.this.GXt_int6 = GXv_int5[0] ;
      AV23colorcliente = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23colorcliente", GXutil.str( AV23colorcliente, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORCLIENTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23colorcliente), "9")));
      /* Execute user subroutine: 'BARCAD' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV39Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwconfor3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwconfor3_impl.this.AV25EmprCod = GXv_char4[0] ;
      webwconfor3_impl.this.AV26EmprNom = GXv_char3[0] ;
      webwconfor3_impl.this.AV43UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV43UsurCod", AV43UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, ""))));
   }

   public void e1310A2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_int5[0] = AV27Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV25EmprCod, AV7BarCliCodP, AV17BarSerP, AV11BarColNomP, AV12BarColNumP, AV18BarTipColP, GXv_int5) ;
      webwconfor3_impl.this.AV27Flag = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Flag", GXutil.str( AV27Flag, 1, 0));
      AV32Msg_cc = httpContext.getMessage( "Desea cambiar el Color?", "") ;
      if ( AV27Flag == 1 )
      {
         AV32Msg_cc = httpContext.getMessage( "Atencion. El COLOR-NUMERO-TC ANTIGUO ===> ", "") + AV21ColNom + "-" + GXutil.str( AV22ColNum, 6, 0) + "-" + GXutil.str( AV42TipCol, 2, 0) + GXutil.newLine( ) ;
         AV32Msg_cc += httpContext.getMessage( "sera cambiado COLOR-NUMERO-TC NUEVO ===> ", "") + AV11BarColNomP + "-" + GXutil.str( AV12BarColNumP, 6, 0) + "-" + GXutil.str( AV18BarTipColP, 2, 0) + GXutil.newLine( ) ;
      }
      if ( GXutil.strcmp(AV5BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         AV32Msg_cc += AV31Msg_1 + GXutil.newLine( ) ;
      }
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = AV32Msg_cc ;
      ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer", "Confirm", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e1110A2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         if ( AV27Flag == 0 )
         {
            httpContext.GX_msglist.addItem(AV35msg2);
            AV29FlagExi = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29FlagExi", GXutil.str( AV29FlagExi, 1, 0));
         }
         else
         {
            /* Execute user subroutine: 'BARCAD' */
            S112 ();
            if (returnInSub) return;
            GXv_char4[0] = AV25EmprCod ;
            GXv_int7[0] = AV8BarCod ;
            GXv_int5[0] = AV10BarCodReo ;
            GXv_char3[0] = AV9BarCodPar ;
            GXv_char2[0] = AV17BarSerP ;
            GXv_char8[0] = AV11BarColNomP ;
            GXv_int9[0] = AV12BarColNumP ;
            GXv_int10[0] = AV18BarTipColP ;
            GXv_char11[0] = AV13BarNomCli ;
            GXv_int12[0] = AV14BarNumCli ;
            new app.pcolnewl(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int5, GXv_char3, GXv_char2, GXv_char8, GXv_int9, GXv_int10, GXv_char11, GXv_int12) ;
            webwconfor3_impl.this.AV25EmprCod = GXv_char4[0] ;
            webwconfor3_impl.this.AV8BarCod = GXv_int7[0] ;
            webwconfor3_impl.this.AV10BarCodReo = GXv_int5[0] ;
            webwconfor3_impl.this.AV9BarCodPar = GXv_char3[0] ;
            webwconfor3_impl.this.AV17BarSerP = GXv_char2[0] ;
            webwconfor3_impl.this.AV11BarColNomP = GXv_char8[0] ;
            webwconfor3_impl.this.AV12BarColNumP = GXv_int9[0] ;
            webwconfor3_impl.this.AV18BarTipColP = GXv_int10[0] ;
            webwconfor3_impl.this.AV13BarNomCli = GXv_char11[0] ;
            webwconfor3_impl.this.AV14BarNumCli = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarSerP", AV17BarSerP);
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomP", AV11BarColNomP);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumP), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipColP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipColP), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarNomCli", AV13BarNomCli);
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarNumCli), 6, 0));
            AV41Texto_i = httpContext.getMessage( "CAMBIO COLOR EN HDR = ", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV10BarCodReo, 1, 0) + AV9BarCodPar + GXutil.chr( (short)(13)) ;
            AV41Texto_i += httpContext.getMessage( "Color CREADO en HDR, COLOR-NUMERO-TC ", "") + AV11BarColNomP + "-" + GXutil.str( AV12BarColNumP, 6, 0) + "-" + GXutil.str( AV18BarTipColP, 2, 0) + GXutil.chr( (short)(13)) ;
            AV41Texto_i += httpContext.getMessage( "Color ANTIGUO en HDR, COLOR-NUMERO-TC", "") + AV21ColNom + "-" + GXutil.str( AV22ColNum, 6, 0) + "-" + GXutil.str( AV42TipCol, 2, 0) + GXutil.chr( (short)(13)) ;
            AV41Texto_i += httpContext.getMessage( "CLIENTE - ARTICULO ", "") + GXutil.str( AV7BarCliCodP, 6, 0) + "-" + AV17BarSerP + GXutil.chr( (short)(13)) ;
            new app.pctrinc(remoteHandle, context).execute( AV25EmprCod, GXutil.substring( AV47Pgmname, 1, 10), AV43UsurCod, AV39Station, AV41Texto_i, AV8BarCod, AV10BarCodReo, AV9BarCodPar) ;
            AV21ColNom = AV11BarColNomP ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ColNom", AV21ColNom);
            AV22ColNum = AV12BarColNumP ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ColNum), 6, 0));
            AV42TipCol = AV18BarTipColP ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TipCol), 2, 0));
            AV29FlagExi = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29FlagExi", GXutil.str( AV29FlagExi, 1, 0));
            if ( GXutil.strcmp(AV5BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Using cursor H010A2 */
               pr_default.execute(0, new Object[] {AV25EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar});
               while ( (pr_default.getStatus(0) != 101) )
               {
                  A130BarCodPar = H010A2_A130BarCodPar[0] ;
                  A132BarCodReo = H010A2_A132BarCodReo[0] ;
                  A129BarCod = H010A2_A129BarCod[0] ;
                  A396EmprCod = H010A2_A396EmprCod[0] ;
                  A119BarAgrCod = H010A2_A119BarAgrCod[0] ;
                  A124BarAgrReo = H010A2_A124BarAgrReo[0] ;
                  A122BarAgrPar = H010A2_A122BarAgrPar[0] ;
                  GXv_char11[0] = AV25EmprCod ;
                  GXv_int12[0] = A119BarAgrCod ;
                  GXv_int10[0] = A124BarAgrReo ;
                  GXv_char8[0] = A122BarAgrPar ;
                  GXv_char4[0] = AV17BarSerP ;
                  GXv_char3[0] = AV11BarColNomP ;
                  GXv_int9[0] = AV12BarColNumP ;
                  GXv_int5[0] = AV18BarTipColP ;
                  GXv_char2[0] = AV13BarNomCli ;
                  GXv_int7[0] = AV14BarNumCli ;
                  new app.pnueco9(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int10, GXv_char8, GXv_char4, GXv_char3, GXv_int9, GXv_int5, GXv_char2, GXv_int7) ;
                  webwconfor3_impl.this.AV25EmprCod = GXv_char11[0] ;
                  webwconfor3_impl.this.A119BarAgrCod = GXv_int12[0] ;
                  webwconfor3_impl.this.A124BarAgrReo = GXv_int10[0] ;
                  webwconfor3_impl.this.A122BarAgrPar = GXv_char8[0] ;
                  webwconfor3_impl.this.AV17BarSerP = GXv_char4[0] ;
                  webwconfor3_impl.this.AV11BarColNomP = GXv_char3[0] ;
                  webwconfor3_impl.this.AV12BarColNumP = GXv_int9[0] ;
                  webwconfor3_impl.this.AV18BarTipColP = GXv_int5[0] ;
                  webwconfor3_impl.this.AV13BarNomCli = GXv_char2[0] ;
                  webwconfor3_impl.this.AV14BarNumCli = GXv_int7[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV17BarSerP", AV17BarSerP);
                  httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomP", AV11BarColNomP);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumP), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipColP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipColP), 2, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV13BarNomCli", AV13BarNomCli);
                  httpContext.ajax_rsp_assign_attri("", false, "AV14BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarNumCli), 6, 0));
                  if ( AV28FlagCorE == 1 )
                  {
                     AV41Texto_i = httpContext.getMessage( "Contador NEWCOR activado. Hdr Origen                = ", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV10BarCodReo, 1, 0) + AV9BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "Vamos a crear color Equivalente para la HDR agrupada= ", "") + GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar + GXutil.newLine( ) + httpContext.getMessage( "Color a crear en la HDR agrupada es Color-Numero-Tc   ", "") + AV11BarColNomP + "-" + GXutil.str( AV12BarColNumP, 6, 0) + "-" + GXutil.str( AV18BarTipColP, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "Cliente y Serie                                     = ", "") + GXutil.str( AV7BarCliCodP, 6, 0) + "-" + AV17BarSerP + GXutil.newLine( ) ;
                     new app.pctrinc(remoteHandle, context).execute( AV25EmprCod, GXutil.substring( AV47Pgmname, 1, 10), AV43UsurCod, AV39Station, AV41Texto_i, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
                     GXv_char11[0] = AV25EmprCod ;
                     GXv_int12[0] = A119BarAgrCod ;
                     GXv_int10[0] = A124BarAgrReo ;
                     GXv_char8[0] = A122BarAgrPar ;
                     GXv_int9[0] = AV7BarCliCodP ;
                     GXv_char4[0] = AV17BarSerP ;
                     GXv_char3[0] = AV11BarColNomP ;
                     GXv_int7[0] = AV12BarColNumP ;
                     GXv_int5[0] = AV18BarTipColP ;
                     new app.pnewcor(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int10, GXv_char8, GXv_int9, GXv_char4, GXv_char3, GXv_int7, GXv_int5) ;
                     webwconfor3_impl.this.AV25EmprCod = GXv_char11[0] ;
                     webwconfor3_impl.this.A119BarAgrCod = GXv_int12[0] ;
                     webwconfor3_impl.this.A124BarAgrReo = GXv_int10[0] ;
                     webwconfor3_impl.this.A122BarAgrPar = GXv_char8[0] ;
                     webwconfor3_impl.this.AV7BarCliCodP = GXv_int9[0] ;
                     webwconfor3_impl.this.AV17BarSerP = GXv_char4[0] ;
                     webwconfor3_impl.this.AV11BarColNomP = GXv_char3[0] ;
                     webwconfor3_impl.this.AV12BarColNumP = GXv_int7[0] ;
                     webwconfor3_impl.this.AV18BarTipColP = GXv_int5[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
                     httpContext.ajax_rsp_assign_attri("", false, "AV7BarCliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCliCodP), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV17BarSerP", AV17BarSerP);
                     httpContext.ajax_rsp_assign_attri("", false, "AV11BarColNomP", AV11BarColNomP);
                     httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarColNumP), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipColP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipColP), 2, 0));
                  }
                  pr_default.readNext(0);
               }
               pr_default.close(0);
            }
            httpContext.setWebReturnParms(new Object[] {AV25EmprCod,Integer.valueOf(AV8BarCod),Byte.valueOf(AV10BarCodReo),AV9BarCodPar,AV21ColNom,Integer.valueOf(AV22ColNum),Byte.valueOf(AV42TipCol),Integer.valueOf(AV6BarCliCod),AV15BarSer,Byte.valueOf(AV29FlagExi)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV25EmprCod","AV8BarCod","AV10BarCodReo","AV9BarCodPar","AV21ColNom","AV22ColNum","AV42TipCol","AV6BarCliCod","AV15BarSer","AV29FlagExi"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1410A2( )
   {
      /* 'DoColores' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.wpcncolores", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCliCodP,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarSerP)),GXutil.URLEncode(GXutil.rtrim(AV11BarColNomP)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarColNumP,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarTipColP,2,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutCliCod","InOutForSer","InOutForColNom","InOutForColNum","InOutTipColCod","InoutForNomcli","InoutFornumcli","InoutFortonal"}) , new Object[] {"AV25EmprCod","AV7BarCliCodP","AV17BarSerP","AV11BarColNomP","AV12BarColNumP","AV18BarTipColP","AV13BarNomCli","AV14BarNumCli",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor H010A3 */
      pr_default.execute(1, new Object[] {AV25EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = H010A3_A130BarCodPar[0] ;
         A132BarCodReo = H010A3_A132BarCodReo[0] ;
         A129BarCod = H010A3_A129BarCod[0] ;
         A396EmprCod = H010A3_A396EmprCod[0] ;
         A120BarAgrEst = H010A3_A120BarAgrEst[0] ;
         A1652BarSerDsc = H010A3_A1652BarSerDsc[0] ;
         A135BarColNom = H010A3_A135BarColNom[0] ;
         A136BarColNum = H010A3_A136BarColNum[0] ;
         A1234BarNomCli = H010A3_A1234BarNomCli[0] ;
         A1235BarNumCli = H010A3_A1235BarNumCli[0] ;
         AV5BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarAgrEst", AV5BarAgrEst);
         AV16BarSerDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarSerDsc", AV16BarSerDsc);
         if ( AV36NoCliente == 1 )
         {
            AV13BarNomCli = A135BarColNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarNomCli", AV13BarNomCli);
            AV14BarNumCli = A136BarColNum ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarNumCli), 6, 0));
         }
         if ( ( AV19carvitin == 1 ) || ( AV23colorcliente == 1 ) )
         {
            AV13BarNomCli = A1234BarNomCli ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarNomCli", AV13BarNomCli);
            AV14BarNumCli = A1235BarNumCli ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarNumCli), 6, 0));
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void nextLoad( )
   {
   }

   protected void e1510A2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_78_10A2( boolean wbgen )
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
         wb_table1_78_10A2e( true) ;
      }
      else
      {
         wb_table1_78_10A2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV25EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      AV8BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      AV9BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
      AV21ColNom = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ColNom", AV21ColNom);
      AV22ColNum = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ColNum), 6, 0));
      AV42TipCol = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TipCol), 2, 0));
      AV6BarCliCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCliCod), 6, 0));
      AV15BarSer = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarSer", AV15BarSer);
      AV29FlagExi = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagExi", GXutil.str( AV29FlagExi, 1, 0));
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
      pa10A2( ) ;
      ws10A2( ) ;
      we10A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016423989", true, true);
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
      httpContext.AddJavascriptSource("webwconfor3.js", "?202661016423989", false, true);
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
      edtavBarclicodp_Internalname = "vBARCLICODP" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavBarserp_Internalname = "vBARSERP" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarcolnomp_Internalname = "vBARCOLNOMP" ;
      bttBtncolores_Internalname = "BTNCOLORES" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarcolnump_Internalname = "vBARCOLNUMP" ;
      edtavBarnumcli_Internalname = "vBARNUMCLI" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBartipcolp_Internalname = "vBARTIPCOLP" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtavBartipcolp_Jsonclick = "" ;
      edtavBartipcolp_Enabled = 1 ;
      edtavBarnumcli_Jsonclick = "" ;
      edtavBarnumcli_Enabled = 1 ;
      edtavBarcolnump_Jsonclick = "" ;
      edtavBarcolnump_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnomp_Jsonclick = "" ;
      edtavBarcolnomp_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarserp_Jsonclick = "" ;
      edtavBarserp_Enabled = 1 ;
      edtavBarclicodp_Jsonclick = "" ;
      edtavBarclicodp_Enabled = 1 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Desea aplicar el Cambio?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Confirmar Color", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV31Msg_1',fld:'vMSG_1',pic:'',hsh:true},{av:'AV35msg2',fld:'vMSG2',pic:'',hsh:true},{av:'AV47Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV28FlagCorE',fld:'vFLAGCORE',pic:'9',hsh:true},{av:'AV36NoCliente',fld:'vNOCLIENTE',pic:'9',hsh:true},{av:'AV19carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV23colorcliente',fld:'vCOLORCLIENTE',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1310A2',iparms:[{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCliCodP',fld:'vBARCLICODP',pic:'ZZZZZ9'},{av:'AV17BarSerP',fld:'vBARSERP',pic:''},{av:'AV11BarColNomP',fld:'vBARCOLNOMP',pic:''},{av:'AV12BarColNumP',fld:'vBARCOLNUMP',pic:'ZZZZZ9'},{av:'AV18BarTipColP',fld:'vBARTIPCOLP',pic:'Z9'},{av:'AV21ColNom',fld:'vCOLNOM',pic:''},{av:'AV22ColNum',fld:'vCOLNUM',pic:'ZZZZZ9'},{av:'AV42TipCol',fld:'vTIPCOL',pic:'Z9'},{av:'AV5BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV31Msg_1',fld:'vMSG_1',pic:'',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV27Flag',fld:'vFLAG',pic:'9'},{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e1110A2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV27Flag',fld:'vFLAG',pic:'9'},{av:'AV35msg2',fld:'vMSG2',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV17BarSerP',fld:'vBARSERP',pic:''},{av:'AV11BarColNomP',fld:'vBARCOLNOMP',pic:''},{av:'AV12BarColNumP',fld:'vBARCOLNUMP',pic:'ZZZZZ9'},{av:'AV18BarTipColP',fld:'vBARTIPCOLP',pic:'Z9'},{av:'AV13BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV14BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV21ColNom',fld:'vCOLNOM',pic:''},{av:'AV22ColNum',fld:'vCOLNUM',pic:'ZZZZZ9'},{av:'AV42TipCol',fld:'vTIPCOL',pic:'Z9'},{av:'AV7BarCliCodP',fld:'vBARCLICODP',pic:'ZZZZZ9'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV5BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV28FlagCorE',fld:'vFLAGCORE',pic:'9',hsh:true},{av:'AV15BarSer',fld:'vBARSER',pic:''},{av:'AV6BarCliCod',fld:'vBARCLICOD',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'AV36NoCliente',fld:'vNOCLIENTE',pic:'9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV19carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV23colorcliente',fld:'vCOLORCLIENTE',pic:'9',hsh:true},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV14BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV13BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV18BarTipColP',fld:'vBARTIPCOLP',pic:'Z9'},{av:'AV12BarColNumP',fld:'vBARCOLNUMP',pic:'ZZZZZ9'},{av:'AV11BarColNomP',fld:'vBARCOLNOMP',pic:''},{av:'AV17BarSerP',fld:'vBARSERP',pic:''},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21ColNom',fld:'vCOLNOM',pic:''},{av:'AV22ColNum',fld:'vCOLNUM',pic:'ZZZZZ9'},{av:'AV42TipCol',fld:'vTIPCOL',pic:'Z9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCliCodP',fld:'vBARCLICODP',pic:'ZZZZZ9'},{av:'AV29FlagExi',fld:'vFLAGEXI',pic:'9'},{av:'AV5BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV16BarSerDsc',fld:'vBARSERDSC',pic:''}]}");
      setEventMetadata("'DOCOLORES'","{handler:'e1410A2',iparms:[{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCliCodP',fld:'vBARCLICODP',pic:'ZZZZZ9'},{av:'AV17BarSerP',fld:'vBARSERP',pic:''},{av:'AV11BarColNomP',fld:'vBARCOLNOMP',pic:''},{av:'AV12BarColNumP',fld:'vBARCOLNUMP',pic:'ZZZZZ9'},{av:'AV18BarTipColP',fld:'vBARTIPCOLP',pic:'Z9'}]");
      setEventMetadata("'DOCOLORES'",",oparms:[{av:'AV14BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV13BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV18BarTipColP',fld:'vBARTIPCOLP',pic:'Z9'},{av:'AV12BarColNumP',fld:'vBARCOLNUMP',pic:'ZZZZZ9'},{av:'AV11BarColNomP',fld:'vBARCOLNOMP',pic:''},{av:'AV17BarSerP',fld:'vBARSERP',pic:''},{av:'AV7BarCliCodP',fld:'vBARCLICODP',pic:'ZZZZZ9'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOAV25EmprCod = "" ;
      wcpOAV9BarCodPar = "" ;
      wcpOAV21ColNom = "" ;
      wcpOAV15BarSer = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV25EmprCod = "" ;
      AV9BarCodPar = "" ;
      AV21ColNom = "" ;
      AV15BarSer = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV31Msg_1 = "" ;
      AV35msg2 = "" ;
      AV47Pgmname = "" ;
      AV43UsurCod = "" ;
      AV39Station = "" ;
      GXKey = "" ;
      AV5BarAgrEst = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      A120BarAgrEst = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV17BarSerP = "" ;
      AV16BarSerDsc = "" ;
      AV11BarColNomP = "" ;
      bttBtncolores_Jsonclick = "" ;
      AV13BarNomCli = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV26EmprNom = "" ;
      AV33msg0 = "" ;
      AV34msg1 = "" ;
      GXt_char1 = "" ;
      AV32Msg_cc = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      AV41Texto_i = "" ;
      scmdbuf = "" ;
      H010A2_A130BarCodPar = new String[] {""} ;
      H010A2_A132BarCodReo = new byte[1] ;
      H010A2_A129BarCod = new int[1] ;
      H010A2_A396EmprCod = new String[] {""} ;
      H010A2_A119BarAgrCod = new int[1] ;
      H010A2_A124BarAgrReo = new byte[1] ;
      H010A2_A122BarAgrPar = new String[] {""} ;
      GXv_char2 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      H010A3_A130BarCodPar = new String[] {""} ;
      H010A3_A132BarCodReo = new byte[1] ;
      H010A3_A129BarCod = new int[1] ;
      H010A3_A396EmprCod = new String[] {""} ;
      H010A3_A120BarAgrEst = new String[] {""} ;
      H010A3_A1652BarSerDsc = new String[] {""} ;
      H010A3_A135BarColNom = new String[] {""} ;
      H010A3_A136BarColNum = new int[1] ;
      H010A3_A1234BarNomCli = new String[] {""} ;
      H010A3_A1235BarNumCli = new int[1] ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwconfor3__default(),
         new Object[] {
             new Object[] {
            H010A2_A130BarCodPar, H010A2_A132BarCodReo, H010A2_A129BarCod, H010A2_A396EmprCod, H010A2_A119BarAgrCod, H010A2_A124BarAgrReo, H010A2_A122BarAgrPar
            }
            , new Object[] {
            H010A3_A130BarCodPar, H010A3_A132BarCodReo, H010A3_A129BarCod, H010A3_A396EmprCod, H010A3_A120BarAgrEst, H010A3_A1652BarSerDsc, H010A3_A135BarColNom, H010A3_A136BarColNum, H010A3_A1234BarNomCli, H010A3_A1235BarNumCli
            }
         }
      );
      AV47Pgmname = "WebWconfor3" ;
      /* GeneXus formulas. */
      AV47Pgmname = "WebWconfor3" ;
      Gx_err = (short)(0) ;
      edtavBarclicodp_Enabled = 0 ;
      edtavBarserp_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarnumcli_Enabled = 0 ;
   }

   private byte wcpOAV10BarCodReo ;
   private byte wcpOAV42TipCol ;
   private byte wcpOAV29FlagExi ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10BarCodReo ;
   private byte AV42TipCol ;
   private byte AV29FlagExi ;
   private byte gxajaxcallmode ;
   private byte AV28FlagCorE ;
   private byte AV36NoCliente ;
   private byte AV19carvitin ;
   private byte AV23colorcliente ;
   private byte AV27Flag ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV18BarTipColP ;
   private byte nDonePA ;
   private byte AV38Scforeq ;
   private byte AV24Eliot ;
   private byte AV44Wckgcol ;
   private byte AV30Lindalana ;
   private byte GXt_int6 ;
   private byte GXv_int10[] ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8BarCod ;
   private int wcpOAV22ColNum ;
   private int wcpOAV6BarCliCod ;
   private int AV8BarCod ;
   private int AV22ColNum ;
   private int AV6BarCliCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV7BarCliCodP ;
   private int edtavBarclicodp_Enabled ;
   private int edtavBarserp_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnomp_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int AV12BarColNumP ;
   private int edtavBarcolnump_Enabled ;
   private int AV14BarNumCli ;
   private int edtavBarnumcli_Enabled ;
   private int edtavBartipcolp_Enabled ;
   private int GXv_int12[] ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private int idxLst ;
   private String wcpOAV25EmprCod ;
   private String wcpOAV9BarCodPar ;
   private String wcpOAV21ColNom ;
   private String wcpOAV15BarSer ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV25EmprCod ;
   private String AV9BarCodPar ;
   private String AV21ColNom ;
   private String AV15BarSer ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV31Msg_1 ;
   private String AV35msg2 ;
   private String AV47Pgmname ;
   private String AV43UsurCod ;
   private String AV39Station ;
   private String GXKey ;
   private String AV5BarAgrEst ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String A120BarAgrEst ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String divUnnamedtable3_Internalname ;
   private String edtavBarclicodp_Internalname ;
   private String TempTags ;
   private String edtavBarclicodp_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarserp_Internalname ;
   private String AV17BarSerP ;
   private String edtavBarserp_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String AV16BarSerDsc ;
   private String edtavBarserdsc_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcolnomp_Internalname ;
   private String AV11BarColNomP ;
   private String edtavBarcolnomp_Jsonclick ;
   private String bttBtncolores_Internalname ;
   private String bttBtncolores_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV13BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarcolnump_Internalname ;
   private String edtavBarcolnump_Jsonclick ;
   private String edtavBarnumcli_Internalname ;
   private String edtavBarnumcli_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBartipcolp_Internalname ;
   private String edtavBartipcolp_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV26EmprNom ;
   private String AV33msg0 ;
   private String AV34msg1 ;
   private String GXt_char1 ;
   private String AV32Msg_cc ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV41Texto_i ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private IDataStoreProvider pr_default ;
   private String[] H010A2_A130BarCodPar ;
   private byte[] H010A2_A132BarCodReo ;
   private int[] H010A2_A129BarCod ;
   private String[] H010A2_A396EmprCod ;
   private int[] H010A2_A119BarAgrCod ;
   private byte[] H010A2_A124BarAgrReo ;
   private String[] H010A2_A122BarAgrPar ;
   private String[] H010A3_A130BarCodPar ;
   private byte[] H010A3_A132BarCodReo ;
   private int[] H010A3_A129BarCod ;
   private String[] H010A3_A396EmprCod ;
   private String[] H010A3_A120BarAgrEst ;
   private String[] H010A3_A1652BarSerDsc ;
   private String[] H010A3_A135BarColNom ;
   private int[] H010A3_A136BarColNum ;
   private String[] H010A3_A1234BarNomCli ;
   private int[] H010A3_A1235BarNumCli ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwconfor3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H010A2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H010A3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst, BarSerDsc, BarColNom, BarColNum, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

