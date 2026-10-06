package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cambiodecolorenhojaderuta_2_impl extends GXDataArea
{
   public cambiodecolorenhojaderuta_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cambiodecolorenhojaderuta_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiodecolorenhojaderuta_2_impl.class ));
   }

   public cambiodecolorenhojaderuta_2_impl( int remoteHandle ,
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
            AV20EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
               AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
               AV19CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CliCod), "ZZZZZ9")));
               AV33CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33CliNom", AV33CliNom);
               AV16BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarSer", AV16BarSer);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarSer, ""))));
               AV12BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BarColNom, ""))));
               AV13BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9")));
               AV18BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipCol), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarTipCol), "Z9")));
               AV14BarNomCli = httpContext.GetPar( "BarNomCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarNomCli", AV14BarNomCli);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarNomCli, ""))));
               AV15BarNumCli = (int)(GXutil.lval( httpContext.GetPar( "BarNumCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarNumCli), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")));
               AV5BarAgrest = httpContext.GetPar( "BarAgrest") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarAgrest", AV5BarAgrest);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarAgrest, "@!"))));
               AV32SituacionHdr = httpContext.GetPar( "SituacionHdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32SituacionHdr", AV32SituacionHdr);
               AV36resultado = (short)(GXutil.lval( httpContext.GetPar( "resultado"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36resultado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36resultado), 4, 0));
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
      pa1LD2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LD2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cambiodecolorenhojaderuta_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV33CliNom)),GXutil.URLEncode(GXutil.rtrim(AV16BarSer)),GXutil.URLEncode(GXutil.rtrim(AV12BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarAgrest)),GXutil.URLEncode(GXutil.rtrim(AV32SituacionHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV36resultado,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli","BarAgrest","SituacionHdr","resultado"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Wckgcol), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarAgrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarNomCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarTipCol), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CliCod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CambiodeColorenHojadeRuta_2");
      forbiddenHiddens.add("CliCodto", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cambiodecolorenhojaderuta_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV30Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV31Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vWCKGCOL", GXutil.ltrim( localUtil.ntoc( AV37Wckgcol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Wckgcol), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV5BarAgrest));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarAgrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV15BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNOMCLI", GXutil.rtrim( AV14BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarNomCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV18BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarTipCol), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV13BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV12BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV16BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV19CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLEXI", GXutil.rtrim( AV28ColExi));
      app.GxWebStd.gx_hidden_field( httpContext, "vRESULTADO", GXutil.ltrim( localUtil.ntoc( AV36resultado, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER2", GXutil.rtrim( AV35Barser2));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD2", GXutil.ltrim( localUtil.ntoc( AV34Clicod2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Title", GXutil.rtrim( Dvelop_confirmpanel_resultados_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_resultados_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultados_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultados_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultados_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_resultados_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_resultados_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Title", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Result", GXutil.rtrim( Dvelop_confirmpanel_resultados_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Result", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADOS_Result", GXutil.rtrim( Dvelop_confirmpanel_resultados_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Result", GXutil.rtrim( Dvelop_confirmpanel_enviarlaboratorio_Result));
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
         we1LD2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LD2( ) ;
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
      return formatLink("app.formulaciontinte.cambiodecolorenhojaderuta_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV19CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV33CliNom)),GXutil.URLEncode(GXutil.rtrim(AV16BarSer)),GXutil.URLEncode(GXutil.rtrim(AV12BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarAgrest)),GXutil.URLEncode(GXutil.rtrim(AV32SituacionHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV36resultado,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli","BarAgrest","SituacionHdr","resultado"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.CambiodeColorenHojadeRuta_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Cambiode Color en Hoja de Ruta", "") ;
   }

   public void wb1LD0( )
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
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodto_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV21CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV33CliNom), GXutil.rtrim( localUtil.format( AV33CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserto_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV22BarSerto), GXutil.rtrim( localUtil.format( AV22BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomto_Internalname, httpContext.getMessage( "Color", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomto_Internalname, GXutil.rtrim( AV23BarColNomto), GXutil.rtrim( localUtil.format( AV23BarColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptcolor_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptcolor_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptcolor_gximage+"_Class") ;
         StyleString = "" ;
         AV39promptcolor_IsBlob = (boolean)(((GXutil.strcmp("", AV39promptcolor)==0)&&(GXutil.strcmp("", AV43Promptcolor_GXI)==0))||!(GXutil.strcmp("", AV39promptcolor)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV39promptcolor)==0) ? AV43Promptcolor_GXI : httpContext.getResourceRelative(AV39promptcolor)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPromptcolor_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPromptcolor_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111ld1_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV39promptcolor_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumto_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV24BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24BarColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24BarColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcolto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcolto_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcolto_Internalname, GXutil.ltrim( localUtil.ntoc( AV25BarTipColto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcolto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25BarTipColto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV25BarTipColto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcolto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcolto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclito_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclito_Internalname, GXutil.rtrim( AV26BarNomClito), GXutil.rtrim( localUtil.format( AV26BarNomClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclito_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclito_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclito_Internalname, GXutil.ltrim( localUtil.ntoc( AV27BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclito_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27BarNumClito), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27BarNumClito), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclito_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviarlaboratorio_Internalname, "", httpContext.getMessage( "Enviar a Laboratorio", ""), bttBtnenviarlaboratorio_Jsonclick, 7, httpContext.getMessage( "Enviar a Laboratorio", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121ld1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSituacionhdr_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSituacionhdr_Internalname, GXutil.rtrim( AV32SituacionHdr), GXutil.rtrim( localUtil.format( AV32SituacionHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSituacionhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSituacionhdr_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeColorenHojadeRuta_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         wb_table1_97_1LD2( true) ;
      }
      else
      {
         wb_table1_97_1LD2( false) ;
      }
      return  ;
   }

   public void wb_table1_97_1LD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_102_1LD2( true) ;
      }
      else
      {
         wb_table2_102_1LD2( false) ;
      }
      return  ;
   }

   public void wb_table2_102_1LD2e( boolean wbgen )
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

   public void start1LD2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Cambiode Color en Hoja de Ruta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LD0( ) ;
   }

   public void ws1LD2( )
   {
      start1LD2( ) ;
      evt1LD2( ) ;
   }

   public void evt1LD2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131LD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141LD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e151LD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e161LD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e171LD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e181LD2 ();
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

   public void we1LD2( )
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

   public void pa1LD2( )
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
            GX_FocusControl = edtavClicodto_Internalname ;
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
      rf1LD2( ) ;
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
      edtavClicodto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Enabled), 5, 0), true);
      edtavBarserto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserto_Enabled), 5, 0), true);
      edtavSituacionhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSituacionhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSituacionhdr_Enabled), 5, 0), true);
   }

   public void rf1LD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e181LD2 ();
         wb1LD0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1LD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vWCKGCOL", GXutil.ltrim( localUtil.ntoc( AV37Wckgcol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Wckgcol), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV5BarAgrest));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarAgrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV15BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNOMCLI", GXutil.rtrim( AV14BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarNomCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV18BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarTipCol), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV13BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV12BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV16BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV19CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CliCod), "ZZZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavClicodto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Enabled), 5, 0), true);
      edtavBarserto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserto_Enabled), 5, 0), true);
      edtavSituacionhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSituacionhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSituacionhdr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1LD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151LD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV35Barser2 = httpContext.cgiGet( "vBARSER2") ;
         AV34Clicod2 = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28ColExi = httpContext.cgiGet( "vCOLEXI") ;
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Dvelop_confirmpanel_resultados_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Title") ;
         Dvelop_confirmpanel_resultados_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmationtext") ;
         Dvelop_confirmpanel_resultados_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_resultados_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_resultados_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_resultados_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_resultados_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Confirmtype") ;
         Dvelop_confirmpanel_enviarlaboratorio_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Title") ;
         Dvelop_confirmpanel_enviarlaboratorio_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Confirmationtext") ;
         Dvelop_confirmpanel_enviarlaboratorio_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enviarlaboratorio_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Nobuttoncaption") ;
         Dvelop_confirmpanel_enviarlaboratorio_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enviarlaboratorio_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Yesbuttonposition") ;
         Dvelop_confirmpanel_enviarlaboratorio_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Confirmtype") ;
         Dvelop_confirmpanel_resultados_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADOS_Result") ;
         Dvelop_confirmpanel_enviarlaboratorio_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCodto), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9")));
         }
         else
         {
            AV21CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCodto), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9")));
         }
         AV22BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarSerto", AV22BarSerto);
         AV23BarColNomto = httpContext.cgiGet( edtavBarcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarColNomto", AV23BarColNomto);
         AV39promptcolor = httpContext.cgiGet( imgavPromptcolor_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMTO");
            GX_FocusControl = edtavBarcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24BarColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarColNumto), 6, 0));
         }
         else
         {
            AV24BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarColNumto), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcolto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcolto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOLTO");
            GX_FocusControl = edtavBartipcolto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25BarTipColto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipColto), 2, 0));
         }
         else
         {
            AV25BarTipColto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcolto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipColto), 2, 0));
         }
         AV26BarNomClito = httpContext.cgiGet( edtavBarnomclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarNomClito", AV26BarNomClito);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLITO");
            GX_FocusControl = edtavBarnumclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27BarNumClito = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClito), 6, 0));
         }
         else
         {
            AV27BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClito), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CambiodeColorenHojadeRuta_2");
         AV21CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCodto), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9")));
         forbiddenHiddens.add("CliCodto", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\cambiodecolorenhojaderuta_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e151LD2 ();
      if (returnInSub) return;
   }

   public void e151LD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV37Wckgcol) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "WCHGCO", ""), GXv_int2) ;
      cambiodecolorenhojaderuta_2_impl.this.GXt_int1 = GXv_int2[0] ;
      AV37Wckgcol = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Wckgcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Wckgcol), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37Wckgcol), "ZZZ9")));
      GXt_char3 = AV31Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      cambiodecolorenhojaderuta_2_impl.this.GXt_char3 = GXv_char4[0] ;
      AV31Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char4[0] = AV20EmprCod ;
      GXv_char5[0] = AV38EmprNom ;
      GXv_char6[0] = AV30Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char4, GXv_char5, GXv_char6) ;
      cambiodecolorenhojaderuta_2_impl.this.AV20EmprCod = GXv_char4[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV38EmprNom = GXv_char5[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV30Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Usurcod", AV30Usurcod);
      AV21CliCodto = AV19CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CliCodto), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21CliCodto), "ZZZZZ9")));
      AV22BarSerto = AV16BarSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarSerto", AV22BarSerto);
      AV23BarColNomto = AV12BarColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarColNomto", AV23BarColNomto);
      AV24BarColNumto = AV13BarColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarColNumto), 6, 0));
      AV25BarTipColto = AV18BarTipCol ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipColto), 2, 0));
      AV26BarNomClito = AV14BarNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarNomClito", AV26BarNomClito);
      AV27BarNumClito = AV15BarNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClito), 6, 0));
      AV34Clicod2 = AV19CliCod ;
      imgavPromptcolor_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptcolor_Internalname, "gximage", imgavPromptcolor_gximage, true);
      AV39promptcolor = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptcolor_Internalname, "Bitmap", ((GXutil.strcmp("", AV39promptcolor)==0) ? AV43Promptcolor_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV39promptcolor))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptcolor_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV39promptcolor), true);
      AV43Promptcolor_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptcolor_Internalname, "Bitmap", ((GXutil.strcmp("", AV39promptcolor)==0) ? AV43Promptcolor_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV39promptcolor))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptcolor_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV39promptcolor), true);
      GXt_char3 = AV31Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      cambiodecolorenhojaderuta_2_impl.this.GXt_char3 = GXv_char6[0] ;
      AV31Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char6[0] = AV20EmprCod ;
      GXv_char5[0] = AV38EmprNom ;
      GXv_char4[0] = AV30Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char6, GXv_char5, GXv_char4) ;
      cambiodecolorenhojaderuta_2_impl.this.AV20EmprCod = GXv_char6[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV38EmprNom = GXv_char5[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV30Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Usurcod", AV30Usurcod);
   }

   public void e161LD2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV28ColExi = httpContext.getMessage( "Y", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ColExi", AV28ColExi);
      GXv_int2[0] = AV29Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV20EmprCod, AV21CliCodto, AV22BarSerto, AV23BarColNomto, AV24BarColNumto, AV25BarTipColto, GXv_int2) ;
      cambiodecolorenhojaderuta_2_impl.this.AV29Flag = GXv_int2[0] ;
      if ( (0==AV29Flag) )
      {
         Gx_msg = httpContext.getMessage( "El color introducido, NO existe ¡", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Puede pasarlo a Laboratorio, pulsando el boton¡", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         GX_FocusControl = edtavBarserto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV28ColExi = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ColExi", AV28ColExi);
      }
      else
      {
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_RESULTADOSContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e131LD2( )
   {
      /* Dvelop_confirmpanel_resultados_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_resultados_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RESULTADOS' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141LD2( )
   {
      /* Dvelop_confirmpanel_enviarlaboratorio_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enviarlaboratorio_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENVIARLABORATORIO' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e171LD2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV20EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV10BarCodReo),AV8BarCodPar,Integer.valueOf(AV19CliCod),AV33CliNom,AV16BarSer,AV12BarColNom,Integer.valueOf(AV13BarColNum),Byte.valueOf(AV18BarTipCol),AV14BarNomCli,Integer.valueOf(AV15BarNumCli),AV5BarAgrest,AV32SituacionHdr,Short.valueOf(AV36resultado)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV20EmprCod","AV6BarCod","AV10BarCodReo","AV8BarCodPar","AV19CliCod","AV33CliNom","AV16BarSer","AV12BarColNom","AV13BarColNum","AV18BarTipCol","AV14BarNomCli","AV15BarNumCli","AV5BarAgrest","AV32SituacionHdr","AV36resultado"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION RESULTADOS' Routine */
      returnInSub = false ;
      AV36resultado = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36resultado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36resultado), 4, 0));
      GXv_char6[0] = AV20EmprCod ;
      GXv_int7[0] = AV6BarCod ;
      GXv_int2[0] = AV10BarCodReo ;
      GXv_char5[0] = AV8BarCodPar ;
      GXv_char4[0] = AV22BarSerto ;
      GXv_char8[0] = AV23BarColNomto ;
      GXv_int9[0] = AV24BarColNumto ;
      GXv_int10[0] = AV25BarTipColto ;
      GXv_char11[0] = AV26BarNomClito ;
      GXv_int12[0] = AV27BarNumClito ;
      GXv_char13[0] = AV30Usurcod ;
      GXv_char14[0] = AV31Station ;
      new app.pnuecol2(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int2, GXv_char5, GXv_char4, GXv_char8, GXv_int9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
      cambiodecolorenhojaderuta_2_impl.this.AV20EmprCod = GXv_char6[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV6BarCod = GXv_int7[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV10BarCodReo = GXv_int2[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV8BarCodPar = GXv_char5[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV22BarSerto = GXv_char4[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV23BarColNomto = GXv_char8[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV24BarColNumto = GXv_int9[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV25BarTipColto = GXv_int10[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV26BarNomClito = GXv_char11[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV27BarNumClito = GXv_int12[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV30Usurcod = GXv_char13[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV31Station = GXv_char14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarSerto", AV22BarSerto);
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarColNomto", AV23BarColNomto);
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarColNumto), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarTipColto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarTipColto), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarNomClito", AV26BarNomClito);
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarNumClito), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Usurcod", AV30Usurcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      if ( AV37Wckgcol == 1 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.cambiodecolorhojaruta_4", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21CliCodto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV33CliNom)),GXutil.URLEncode(GXutil.rtrim(AV22BarSerto)),GXutil.URLEncode(GXutil.rtrim(AV23BarColNomto)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarColNumto,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarTipColto,2,0)),GXutil.URLEncode(GXutil.rtrim(AV26BarNomClito)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarNumClito,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5BarAgrest))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli","BarAgrEst"}) , new Object[] {});
      }
      httpContext.setWebReturnParms(new Object[] {AV20EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV10BarCodReo),AV8BarCodPar,Integer.valueOf(AV19CliCod),AV33CliNom,AV16BarSer,AV12BarColNom,Integer.valueOf(AV13BarColNum),Byte.valueOf(AV18BarTipCol),AV14BarNomCli,Integer.valueOf(AV15BarNumCli),AV5BarAgrest,AV32SituacionHdr,Short.valueOf(AV36resultado)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV20EmprCod","AV6BarCod","AV10BarCodReo","AV8BarCodPar","AV19CliCod","AV33CliNom","AV16BarSer","AV12BarColNom","AV13BarColNum","AV18BarTipCol","AV14BarNomCli","AV15BarNumCli","AV5BarAgrest","AV32SituacionHdr","AV36resultado"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'DO ACTION ENVIARLABORATORIO' Routine */
      returnInSub = false ;
      GXv_char14[0] = AV20EmprCod ;
      GXv_int12[0] = AV6BarCod ;
      GXv_int10[0] = AV10BarCodReo ;
      GXv_char13[0] = AV8BarCodPar ;
      GXv_int2[0] = (byte)(3) ;
      new app.pmodsit(remoteHandle, context).execute( GXv_char14, GXv_int12, GXv_int10, GXv_char13, GXv_int2) ;
      cambiodecolorenhojaderuta_2_impl.this.AV20EmprCod = GXv_char14[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV6BarCod = GXv_int12[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV10BarCodReo = GXv_int10[0] ;
      cambiodecolorenhojaderuta_2_impl.this.AV8BarCodPar = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      httpContext.setWebReturnParms(new Object[] {AV20EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV10BarCodReo),AV8BarCodPar,Integer.valueOf(AV19CliCod),AV33CliNom,AV16BarSer,AV12BarColNom,Integer.valueOf(AV13BarColNum),Byte.valueOf(AV18BarTipCol),AV14BarNomCli,Integer.valueOf(AV15BarNumCli),AV5BarAgrest,AV32SituacionHdr,Short.valueOf(AV36resultado)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV20EmprCod","AV6BarCod","AV10BarCodReo","AV8BarCodPar","AV19CliCod","AV33CliNom","AV16BarSer","AV12BarColNom","AV13BarColNum","AV18BarTipCol","AV14BarNomCli","AV15BarNumCli","AV5BarAgrest","AV32SituacionHdr","AV36resultado"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e181LD2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_102_1LD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enviarlaboratorio_Internalname, tblTabledvelop_confirmpanel_enviarlaboratorio_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("Title", Dvelop_confirmpanel_enviarlaboratorio_Title);
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("ConfirmationText", Dvelop_confirmpanel_enviarlaboratorio_Confirmationtext);
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("YesButtonCaption", Dvelop_confirmpanel_enviarlaboratorio_Yesbuttoncaption);
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("NoButtonCaption", Dvelop_confirmpanel_enviarlaboratorio_Nobuttoncaption);
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enviarlaboratorio_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("YesButtonPosition", Dvelop_confirmpanel_enviarlaboratorio_Yesbuttonposition);
         ucDvelop_confirmpanel_enviarlaboratorio.setProperty("ConfirmType", Dvelop_confirmpanel_enviarlaboratorio_Confirmtype);
         ucDvelop_confirmpanel_enviarlaboratorio.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enviarlaboratorio_Internalname, "DVELOP_CONFIRMPANEL_ENVIARLABORATORIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENVIARLABORATORIOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_102_1LD2e( true) ;
      }
      else
      {
         wb_table2_102_1LD2e( false) ;
      }
   }

   public void wb_table1_97_1LD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_resultados_Internalname, tblTabledvelop_confirmpanel_resultados_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_resultados.setProperty("Title", Dvelop_confirmpanel_resultados_Title);
         ucDvelop_confirmpanel_resultados.setProperty("ConfirmationText", Dvelop_confirmpanel_resultados_Confirmationtext);
         ucDvelop_confirmpanel_resultados.setProperty("YesButtonCaption", Dvelop_confirmpanel_resultados_Yesbuttoncaption);
         ucDvelop_confirmpanel_resultados.setProperty("NoButtonCaption", Dvelop_confirmpanel_resultados_Nobuttoncaption);
         ucDvelop_confirmpanel_resultados.setProperty("CancelButtonCaption", Dvelop_confirmpanel_resultados_Cancelbuttoncaption);
         ucDvelop_confirmpanel_resultados.setProperty("YesButtonPosition", Dvelop_confirmpanel_resultados_Yesbuttonposition);
         ucDvelop_confirmpanel_resultados.setProperty("ConfirmType", Dvelop_confirmpanel_resultados_Confirmtype);
         ucDvelop_confirmpanel_resultados.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_resultados_Internalname, "DVELOP_CONFIRMPANEL_RESULTADOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RESULTADOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_97_1LD2e( true) ;
      }
      else
      {
         wb_table1_97_1LD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV20EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      AV8BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      AV19CliCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19CliCod), "ZZZZZ9")));
      AV33CliNom = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33CliNom", AV33CliNom);
      AV16BarSer = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarSer", AV16BarSer);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarSer, ""))));
      AV12BarColNom = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BarColNom, ""))));
      AV13BarColNum = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9")));
      AV18BarTipCol = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarTipCol), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18BarTipCol), "Z9")));
      AV14BarNomCli = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarNomCli", AV14BarNomCli);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarNomCli, ""))));
      AV15BarNumCli = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarNumCli), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarNumCli), "ZZZZZ9")));
      AV5BarAgrest = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarAgrest", AV5BarAgrest);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarAgrest, "@!"))));
      AV32SituacionHdr = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32SituacionHdr", AV32SituacionHdr);
      AV36resultado = ((Number) GXutil.testNumericType( getParm(obj,14), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36resultado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36resultado), 4, 0));
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
      pa1LD2( ) ;
      ws1LD2( ) ;
      we1LD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016433473", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cambiodecolorenhojaderuta_2.js", "?202661016433474", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarserto_Internalname = "vBARSERTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavBarcolnomto_Internalname = "vBARCOLNOMTO" ;
      imgavPromptcolor_Internalname = "vPROMPTCOLOR" ;
      edtavBarcolnumto_Internalname = "vBARCOLNUMTO" ;
      edtavBartipcolto_Internalname = "vBARTIPCOLTO" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      edtavBarnomclito_Internalname = "vBARNOMCLITO" ;
      edtavBarnumclito_Internalname = "vBARNUMCLITO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnenviarlaboratorio_Internalname = "BTNENVIARLABORATORIO" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavSituacionhdr_Internalname = "vSITUACIONHDR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_resultados_Internalname = "DVELOP_CONFIRMPANEL_RESULTADOS" ;
      tblTabledvelop_confirmpanel_resultados_Internalname = "TABLEDVELOP_CONFIRMPANEL_RESULTADOS" ;
      Dvelop_confirmpanel_enviarlaboratorio_Internalname = "DVELOP_CONFIRMPANEL_ENVIARLABORATORIO" ;
      tblTabledvelop_confirmpanel_enviarlaboratorio_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENVIARLABORATORIO" ;
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
      edtavSituacionhdr_Jsonclick = "" ;
      edtavSituacionhdr_Enabled = 0 ;
      edtavBarnumclito_Jsonclick = "" ;
      edtavBarnumclito_Enabled = 1 ;
      edtavBarnomclito_Jsonclick = "" ;
      edtavBarnomclito_Enabled = 1 ;
      edtavBartipcolto_Jsonclick = "" ;
      edtavBartipcolto_Enabled = 1 ;
      edtavBarcolnumto_Jsonclick = "" ;
      edtavBarcolnumto_Enabled = 1 ;
      imgavPromptcolor_Jsonclick = "" ;
      imgavPromptcolor_gximage = "" ;
      edtavBarcolnomto_Jsonclick = "" ;
      edtavBarcolnomto_Enabled = 1 ;
      edtavBarserto_Jsonclick = "" ;
      edtavBarserto_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Enabled = 1 ;
      Dvelop_confirmpanel_enviarlaboratorio_Confirmtype = "1" ;
      Dvelop_confirmpanel_enviarlaboratorio_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enviarlaboratorio_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enviarlaboratorio_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enviarlaboratorio_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enviarlaboratorio_Confirmationtext = "¿Desea Enviar a Laboratorio?" ;
      Dvelop_confirmpanel_enviarlaboratorio_Title = "" ;
      Dvelop_confirmpanel_resultados_Confirmtype = "1" ;
      Dvelop_confirmpanel_resultados_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_resultados_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_resultados_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_resultados_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_resultados_Confirmationtext = "¿Desea aplicar el cambio?" ;
      Dvelop_confirmpanel_resultados_Title = "" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Cambiode Color en Hoja de Ruta", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV37Wckgcol',fld:'vWCKGCOL',pic:'ZZZ9',hsh:true},{av:'AV21CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9',hsh:true},{av:'AV5BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV15BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV14BarNomCli',fld:'vBARNOMCLI',pic:'',hsh:true},{av:'AV18BarTipCol',fld:'vBARTIPCOL',pic:'Z9',hsh:true},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV16BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e161LD2',iparms:[{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9',hsh:true},{av:'AV22BarSerto',fld:'vBARSERTO',pic:''},{av:'AV23BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV24BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarTipColto',fld:'vBARTIPCOLTO',pic:'Z9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV28ColExi',fld:'vCOLEXI',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE","{handler:'e131LD2',iparms:[{av:'Dvelop_confirmpanel_resultados_Result',ctrl:'DVELOP_CONFIRMPANEL_RESULTADOS',prop:'Result'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22BarSerto',fld:'vBARSERTO',pic:''},{av:'AV23BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV24BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV25BarTipColto',fld:'vBARTIPCOLTO',pic:'Z9'},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV27BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV30Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV31Station',fld:'vSTATION',pic:''},{av:'AV37Wckgcol',fld:'vWCKGCOL',pic:'ZZZ9',hsh:true},{av:'AV21CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9',hsh:true},{av:'AV33CliNom',fld:'vCLINOM',pic:''},{av:'AV5BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV32SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV15BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV14BarNomCli',fld:'vBARNOMCLI',pic:'',hsh:true},{av:'AV18BarTipCol',fld:'vBARTIPCOL',pic:'Z9',hsh:true},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV16BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADOS.CLOSE",",oparms:[{av:'AV36resultado',fld:'vRESULTADO',pic:'ZZZ9'},{av:'AV31Station',fld:'vSTATION',pic:''},{av:'AV30Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV27BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV25BarTipColto',fld:'vBARTIPCOLTO',pic:'Z9'},{av:'AV24BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV23BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV22BarSerto',fld:'vBARSERTO',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOENVIARLABORATORIO'","{handler:'e121LD1',iparms:[{av:'AV28ColExi',fld:'vCOLEXI',pic:''}]");
      setEventMetadata("'DOENVIARLABORATORIO'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIARLABORATORIO.CLOSE","{handler:'e141LD2',iparms:[{av:'Dvelop_confirmpanel_enviarlaboratorio_Result',ctrl:'DVELOP_CONFIRMPANEL_ENVIARLABORATORIO',prop:'Result'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV36resultado',fld:'vRESULTADO',pic:'ZZZ9'},{av:'AV32SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV5BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV15BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV14BarNomCli',fld:'vBARNOMCLI',pic:'',hsh:true},{av:'AV18BarTipCol',fld:'vBARTIPCOL',pic:'Z9',hsh:true},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV16BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV33CliNom',fld:'vCLINOM',pic:''},{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIARLABORATORIO.CLOSE",",oparms:[{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e171LD2',iparms:[{av:'AV36resultado',fld:'vRESULTADO',pic:'ZZZ9'},{av:'AV32SituacionHdr',fld:'vSITUACIONHDR',pic:''},{av:'AV5BarAgrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV15BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV14BarNomCli',fld:'vBARNOMCLI',pic:'',hsh:true},{av:'AV18BarTipCol',fld:'vBARTIPCOL',pic:'Z9',hsh:true},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV16BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV33CliNom',fld:'vCLINOM',pic:''},{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPROMPTCOLOR.CLICK","{handler:'e111LD1',iparms:[{av:'AV21CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9',hsh:true},{av:'AV22BarSerto',fld:'vBARSERTO',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VPROMPTCOLOR.CLICK",",oparms:[{av:'AV25BarTipColto',fld:'vBARTIPCOLTO',pic:'Z9'},{av:'AV27BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV26BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV24BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV23BarColNomto',fld:'vBARCOLNOMTO',pic:''}]}");
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
      wcpOAV20EmprCod = "" ;
      wcpOAV8BarCodPar = "" ;
      wcpOAV33CliNom = "" ;
      wcpOAV16BarSer = "" ;
      wcpOAV12BarColNom = "" ;
      wcpOAV14BarNomCli = "" ;
      wcpOAV5BarAgrest = "" ;
      wcpOAV32SituacionHdr = "" ;
      Dvelop_confirmpanel_resultados_Result = "" ;
      Dvelop_confirmpanel_enviarlaboratorio_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV20EmprCod = "" ;
      AV8BarCodPar = "" ;
      AV33CliNom = "" ;
      AV16BarSer = "" ;
      AV12BarColNom = "" ;
      AV14BarNomCli = "" ;
      AV5BarAgrest = "" ;
      AV32SituacionHdr = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV30Usurcod = "" ;
      AV31Station = "" ;
      AV28ColExi = "" ;
      AV35Barser2 = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV22BarSerto = "" ;
      AV23BarColNomto = "" ;
      AV39promptcolor = "" ;
      AV43Promptcolor_GXI = "" ;
      sImgUrl = "" ;
      AV26BarNomClito = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnenviarlaboratorio_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV38EmprNom = "" ;
      GXt_char3 = "" ;
      Gx_msg = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int2 = new byte[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enviarlaboratorio = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_resultados = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavClicodto_Enabled = 0 ;
      edtavBarserto_Enabled = 0 ;
      edtavSituacionhdr_Enabled = 0 ;
   }

   private byte wcpOAV10BarCodReo ;
   private byte wcpOAV18BarTipCol ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10BarCodReo ;
   private byte AV18BarTipCol ;
   private byte gxajaxcallmode ;
   private byte AV25BarTipColto ;
   private byte nDonePA ;
   private byte GXt_int1 ;
   private byte AV29Flag ;
   private byte GXv_int10[] ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private short wcpOAV36resultado ;
   private short AV36resultado ;
   private short AV37Wckgcol ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV6BarCod ;
   private int wcpOAV19CliCod ;
   private int wcpOAV13BarColNum ;
   private int wcpOAV15BarNumCli ;
   private int AV6BarCod ;
   private int AV19CliCod ;
   private int AV13BarColNum ;
   private int AV15BarNumCli ;
   private int AV21CliCodto ;
   private int AV34Clicod2 ;
   private int edtavClicodto_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarserto_Enabled ;
   private int edtavBarcolnomto_Enabled ;
   private int AV24BarColNumto ;
   private int edtavBarcolnumto_Enabled ;
   private int edtavBartipcolto_Enabled ;
   private int edtavBarnomclito_Enabled ;
   private int AV27BarNumClito ;
   private int edtavBarnumclito_Enabled ;
   private int edtavSituacionhdr_Enabled ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private int GXv_int12[] ;
   private int idxLst ;
   private String wcpOAV20EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String wcpOAV33CliNom ;
   private String wcpOAV16BarSer ;
   private String wcpOAV12BarColNom ;
   private String wcpOAV14BarNomCli ;
   private String wcpOAV5BarAgrest ;
   private String wcpOAV32SituacionHdr ;
   private String Dvelop_confirmpanel_resultados_Result ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV20EmprCod ;
   private String AV8BarCodPar ;
   private String AV33CliNom ;
   private String AV16BarSer ;
   private String AV12BarColNom ;
   private String AV14BarNomCli ;
   private String AV5BarAgrest ;
   private String AV32SituacionHdr ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV30Usurcod ;
   private String AV31Station ;
   private String AV28ColExi ;
   private String AV35Barser2 ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvelop_confirmpanel_resultados_Title ;
   private String Dvelop_confirmpanel_resultados_Confirmationtext ;
   private String Dvelop_confirmpanel_resultados_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_resultados_Nobuttoncaption ;
   private String Dvelop_confirmpanel_resultados_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_resultados_Yesbuttonposition ;
   private String Dvelop_confirmpanel_resultados_Confirmtype ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Title ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Confirmationtext ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicodto_Internalname ;
   private String TempTags ;
   private String edtavClicodto_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarserto_Internalname ;
   private String AV22BarSerto ;
   private String edtavBarserto_Jsonclick ;
   private String divTable_filtrosgenerales_Internalname ;
   private String edtavBarcolnomto_Internalname ;
   private String AV23BarColNomto ;
   private String edtavBarcolnomto_Jsonclick ;
   private String imgavPromptcolor_Internalname ;
   private String imgavPromptcolor_gximage ;
   private String sImgUrl ;
   private String imgavPromptcolor_Jsonclick ;
   private String edtavBarcolnumto_Internalname ;
   private String edtavBarcolnumto_Jsonclick ;
   private String edtavBartipcolto_Internalname ;
   private String edtavBartipcolto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarnomclito_Internalname ;
   private String AV26BarNomClito ;
   private String edtavBarnomclito_Jsonclick ;
   private String edtavBarnumclito_Internalname ;
   private String edtavBarnumclito_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnenviarlaboratorio_Internalname ;
   private String bttBtnenviarlaboratorio_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavSituacionhdr_Internalname ;
   private String edtavSituacionhdr_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV38EmprNom ;
   private String GXt_char3 ;
   private String Gx_msg ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char8[] ;
   private String GXv_char11[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enviarlaboratorio_Internalname ;
   private String Dvelop_confirmpanel_enviarlaboratorio_Internalname ;
   private String tblTabledvelop_confirmpanel_resultados_Internalname ;
   private String Dvelop_confirmpanel_resultados_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV39promptcolor_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV43Promptcolor_GXI ;
   private String AV39promptcolor ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enviarlaboratorio ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_resultados ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.GXWebForm Form ;
}

