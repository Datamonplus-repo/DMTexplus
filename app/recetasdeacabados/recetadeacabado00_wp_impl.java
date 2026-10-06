package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadeacabado00_wp_impl extends GXDataArea
{
   public recetadeacabado00_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadeacabado00_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabado00_wp_impl.class ));
   }

   public recetadeacabado00_wp_impl( int remoteHandle ,
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
      pa24P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24P2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabados.recetadeacabado00_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77Sit9), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81RecLtssr), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSSOB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80LtsSob), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREFACABS", getSecureSignedToken( "", localUtil.format( AV82Hrefacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78Var1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_TOSA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79Msg_tosa, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRMENSAJE1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91ErrMensaje1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13HumSec, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Ltsrc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Torient), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10FabsMq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV19MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV19MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vSIT9", GXutil.ltrim( localUtil.ntoc( AV77Sit9, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77Sit9), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_P", GXutil.ltrim( localUtil.ntoc( AV64BarCod_p, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODREO_P", GXutil.ltrim( localUtil.ntoc( AV65CodReo_p, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODPAR", GXutil.rtrim( AV66CodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV34BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV35BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV37CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV38BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV50BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV52Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODSC", GXutil.rtrim( AV53ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC", GXutil.rtrim( AV23MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQVOLTOP", GXutil.ltrim( localUtil.ntoc( AV25MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCCRU1", GXutil.ltrim( localUtil.ntoc( AV40Baranccru1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDIDOCLIENTE", GXutil.rtrim( AV42PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPLE", GXutil.rtrim( AV41BarPle));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTEXTURA", GXutil.rtrim( AV45Contextura));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV43BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV44BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAT", GXutil.rtrim( AV46BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLTSSR", GXutil.ltrim( localUtil.ntoc( AV81RecLtssr, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81RecLtssr), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSSOB", GXutil.ltrim( localUtil.ntoc( AV80LtsSob, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSSOB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80LtsSob), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREFACABS", GXutil.ltrim( localUtil.ntoc( AV82Hrefacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREFACABS", getSecureSignedToken( "", localUtil.format( AV82Hrefacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR1", GXutil.rtrim( AV78Var1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78Var1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_TOSA", GXutil.rtrim( AV79Msg_tosa));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_TOSA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79Msg_tosa, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASECOD", GXutil.rtrim( AV60BarFasecod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASEORD", GXutil.ltrim( localUtil.ntoc( AV59BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQTIN", GXutil.rtrim( AV61barMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE1", AV91ErrMensaje1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRMENSAJE1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91ErrMensaje1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, "BARANCCRU1", GXutil.ltrim( localUtil.ntoc( A127BarAncCru1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPLE", GXutil.rtrim( A206BarPle));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPLE2", GXutil.rtrim( A2836BarPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAT", GXutil.rtrim( A182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAQUI", GXutil.rtrim( A118BarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPES", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC", GXutil.rtrim( A759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACAB", GXutil.rtrim( A6039RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODTIN", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARREOTIN", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARTIN", GXutil.rtrim( A1935BarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRECACB", GXutil.rtrim( A6634BarRecAcb));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTFECCIER", localUtil.dtoc( A13759EstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRLOT", GXutil.rtrim( A2316BarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEORD", GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASECOD", GXutil.rtrim( A4925BarFaseCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQTIN", GXutil.rtrim( A1945BarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, "HREBARCOD", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREBARREO", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREBARPAR", GXutil.rtrim( A4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACAB", GXutil.rtrim( A9804HreAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFECTIN", localUtil.dtoc( A4529HreFecTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "HREORDLIN", GXutil.ltrim( localUtil.ntoc( A4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFASCOD", GXutil.rtrim( A4963HreFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQCOD", GXutil.rtrim( A4546HreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARCOD", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARREO", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARPAR", GXutil.rtrim( A6033Ac_BarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_KILOS", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_METROS", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTSH", GXutil.rtrim( A10041ArtSH));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTMQFA", GXutil.rtrim( A10042ArtMqFa));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUMSEC", GXutil.rtrim( AV13HumSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13HumSec, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFAMQ", GXutil.ltrim( localUtil.ntoc( A10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFACABS", GXutil.ltrim( localUtil.ntoc( A2791ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFABSH", GXutil.ltrim( localUtil.ntoc( A9730ArtFabsH, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSRC", GXutil.ltrim( localUtil.ntoc( AV12Ltsrc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Ltsrc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTORIENT", GXutil.ltrim( localUtil.ntoc( AV49Torient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Torient), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTFAMQ", GXutil.ltrim( localUtil.ntoc( AV32ArtFamq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQFACABS", GXutil.ltrim( localUtil.ntoc( AV21MaqfacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQFABSH", GXutil.ltrim( localUtil.ntoc( AV22MaqFabsh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFABSMQ", GXutil.ltrim( localUtil.ntoc( AV10FabsMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10FabsMq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV9VolMul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLRES", GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLTOP", GXutil.ltrim( localUtil.ntoc( A2802MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFACABS", GXutil.ltrim( localUtil.ntoc( A6284MaqFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFABSHM", GXutil.ltrim( localUtil.ntoc( A9982MaqFabsHm, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMIN", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFECALT", localUtil.ttoc( A4866RecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vLCONTI", GXutil.ltrim( localUtil.ntoc( AV56Lconti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGRLOT", GXutil.rtrim( AV58BarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, "vDDMMAAAA", GXutil.rtrim( AV57DdmmAAAA));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUILIN", GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV14Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
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
         we24P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24P2( ) ;
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
      return formatLink("app.recetasdeacabados.recetadeacabado00_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "RecetasDeAcabados.RecetadeAcabado00_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Receta de Acabado", "") ;
   }

   public void wb24P0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV7BarCodPar), GXutil.rtrim( localUtil.format( AV7BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV8Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV8Prompt)==0)&&(GXutil.strcmp("", AV95Prompt_GXI)==0))||!(GXutil.strcmp("", AV8Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV8Prompt)==0) ? AV95Prompt_GXI : httpContext.getResourceRelative(AV8Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV8Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV19MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_kgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_kgs_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Tot_kgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_kgs_Enabled!=0) ? localUtil.format( AV27Tot_kgs, "ZZZZZZ9.99") : localUtil.format( AV27Tot_kgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_kgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_kgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtfacabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtfacabs_Internalname, httpContext.getMessage( "Fact. Abs.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtfacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV28ArtFacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavArtfacabs_Enabled!=0) ? localUtil.format( AV28ArtFacabs, "ZZ9.99") : localUtil.format( AV28ArtFacabs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtfacabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtfacabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolres_Internalname, httpContext.getMessage( "Residual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolres_Internalname, GXutil.ltrim( localUtil.ntoc( AV26MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolres_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolres_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLtsini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLtsini_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLtsini_Internalname, GXutil.ltrim( localUtil.ntoc( AV29LtsIni, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLtsini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29LtsIni), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29LtsIni), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLtsini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLtsini_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1124p1_client"+"'", TempTags, "", 2, "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHdraca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHdraca_Internalname, httpContext.getMessage( "Hdraca", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHdraca_Internalname, GXutil.ltrim( localUtil.ntoc( AV63Hdraca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHdraca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63Hdraca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV63Hdraca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHdraca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHdraca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaseaca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaseaca_Internalname, httpContext.getMessage( "Fase Aca", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaseaca_Internalname, GXutil.ltrim( localUtil.ntoc( AV67FaseAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaseaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV67FaseAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV67FaseAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaseaca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaseaca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfasfor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfasfor_Internalname, httpContext.getMessage( "Formula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfasfor_Internalname, GXutil.rtrim( AV68BarFasFor), GXutil.rtrim( localUtil.format( AV68BarFasFor, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfasfor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfasfor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecmaqa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecmaqa_Internalname, httpContext.getMessage( "Recmaq A", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecmaqa_Internalname, GXutil.ltrim( localUtil.ntoc( AV30RecmaqA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecmaqa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30RecmaqA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30RecmaqA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecmaqa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecmaqa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcad_Internalname, httpContext.getMessage( "Barcad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcad_Internalname, GXutil.ltrim( localUtil.ntoc( AV33Barcad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33Barcad), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33Barcad), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcad_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsit_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_Internalname, httpContext.getMessage( "BarSit", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV47Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV47Barsit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV47Barsit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavErrmensaje_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavErrmensaje_Internalname, httpContext.getMessage( "Err Mensaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavErrmensaje_Internalname, AV90ErrMensaje, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", (short)(0), 1, edtavErrmensaje_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHdrscreadastojson_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHdrscreadastojson_Internalname, httpContext.getMessage( "hdrscreadastojson", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHdrscreadastojson_Internalname, AV85hdrscreadastojson, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", (short)(0), 1, edtavHdrscreadastojson_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV94Pgmname), GXutil.rtrim( localUtil.format( AV94Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV18MaqCod), GXutil.rtrim( localUtil.format( AV18MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start24P2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Receta de Acabado", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24P0( ) ;
   }

   public void ws24P2( )
   {
      start24P2( ) ;
      evt24P2( ) ;
   }

   public void evt24P2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1224P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1324P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e1424P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1524P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e1624P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1724P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1824P2 ();
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

   public void we24P2( )
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

   public void pa24P2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      rf24P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV94Pgmname = "RecetasDeAcabados.RecetadeAcabado00_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavArtfacabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtfacabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtfacabs_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavLtsini_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLtsini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLtsini_Enabled), 5, 0), true);
      edtavHdraca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdraca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdraca_Enabled), 5, 0), true);
      edtavFaseaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaseaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaseaca_Enabled), 5, 0), true);
      edtavBarfasfor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasfor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasfor_Enabled), 5, 0), true);
      edtavRecmaqa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecmaqa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmaqa_Enabled), 5, 0), true);
      edtavBarcad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcad_Enabled), 5, 0), true);
      edtavBarsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarsit_Enabled), 5, 0), true);
      edtavErrmensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje_Enabled), 5, 0), true);
      edtavHdrscreadastojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdrscreadastojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrscreadastojson_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1624P2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1724P2 ();
         wb24P0( ) ;
      }
   }

   public void send_integrity_lvl_hashes24P2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSIT9", GXutil.ltrim( localUtil.ntoc( AV77Sit9, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77Sit9), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLTSSR", GXutil.ltrim( localUtil.ntoc( AV81RecLtssr, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLTSSR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81RecLtssr), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSSOB", GXutil.ltrim( localUtil.ntoc( AV80LtsSob, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSSOB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80LtsSob), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREFACABS", GXutil.ltrim( localUtil.ntoc( AV82Hrefacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREFACABS", getSecureSignedToken( "", localUtil.format( AV82Hrefacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR1", GXutil.rtrim( AV78Var1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78Var1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_TOSA", GXutil.rtrim( AV79Msg_tosa));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG_TOSA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79Msg_tosa, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE1", AV91ErrMensaje1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRMENSAJE1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91ErrMensaje1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUMSEC", GXutil.rtrim( AV13HumSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13HumSec, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSRC", GXutil.ltrim( localUtil.ntoc( AV12Ltsrc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Ltsrc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTORIENT", GXutil.ltrim( localUtil.ntoc( AV49Torient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Torient), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFABSMQ", GXutil.ltrim( localUtil.ntoc( AV10FabsMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10FabsMq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV14Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Station, ""))));
   }

   public void before_start_formulas( )
   {
      AV94Pgmname = "RecetasDeAcabados.RecetadeAcabado00_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavArtfacabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtfacabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtfacabs_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavLtsini_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLtsini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLtsini_Enabled), 5, 0), true);
      edtavHdraca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdraca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdraca_Enabled), 5, 0), true);
      edtavFaseaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaseaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFaseaca_Enabled), 5, 0), true);
      edtavBarfasfor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasfor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasfor_Enabled), 5, 0), true);
      edtavRecmaqa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecmaqa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmaqa_Enabled), 5, 0), true);
      edtavBarcad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcad_Enabled), 5, 0), true);
      edtavBarsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarsit_Enabled), 5, 0), true);
      edtavErrmensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje_Enabled), 5, 0), true);
      edtavHdrscreadastojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdrscreadastojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrscreadastojson_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1324P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV19MaqCod_Data);
         /* Read saved values. */
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Emptyitem")) ;
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
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         /* Read variables values. */
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
         }
         else
         {
            AV6BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
         }
         AV7BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
         AV8Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOT_KGS");
            GX_FocusControl = edtavTot_kgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Tot_kgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
         }
         else
         {
            AV27Tot_kgs = localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavArtfacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavArtfacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vARTFACABS");
            GX_FocusControl = edtavArtfacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28ArtFacabs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
         }
         else
         {
            AV28ArtFacabs = localUtil.ctond( httpContext.cgiGet( edtavArtfacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLRES");
            GX_FocusControl = edtavMaqvolres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26MaqVolRes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
         }
         else
         {
            AV26MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLtsini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLtsini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLTSINI");
            GX_FocusControl = edtavLtsini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29LtsIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29LtsIni), 5, 0));
         }
         else
         {
            AV29LtsIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavLtsini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29LtsIni), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHdraca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHdraca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHDRACA");
            GX_FocusControl = edtavHdraca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63Hdraca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Hdraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Hdraca), 4, 0));
         }
         else
         {
            AV63Hdraca = (short)(localUtil.ctol( httpContext.cgiGet( edtavHdraca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Hdraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Hdraca), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaseaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaseaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASEACA");
            GX_FocusControl = edtavFaseaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV67FaseAca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67FaseAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67FaseAca), 4, 0));
         }
         else
         {
            AV67FaseAca = (short)(localUtil.ctol( httpContext.cgiGet( edtavFaseaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67FaseAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67FaseAca), 4, 0));
         }
         AV68BarFasFor = GXutil.upper( httpContext.cgiGet( edtavBarfasfor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68BarFasFor", AV68BarFasFor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecmaqa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecmaqa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECMAQA");
            GX_FocusControl = edtavRecmaqa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30RecmaqA = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30RecmaqA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecmaqA), 4, 0));
         }
         else
         {
            AV30RecmaqA = (short)(localUtil.ctol( httpContext.cgiGet( edtavRecmaqa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30RecmaqA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecmaqA), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCAD");
            GX_FocusControl = edtavBarcad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33Barcad = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcad), 4, 0));
         }
         else
         {
            AV33Barcad = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcad), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47Barsit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Barsit), 2, 0));
         }
         else
         {
            AV47Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Barsit), 2, 0));
         }
         AV90ErrMensaje = httpContext.cgiGet( edtavErrmensaje_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90ErrMensaje", AV90ErrMensaje);
         AV85hdrscreadastojson = httpContext.cgiGet( edtavHdrscreadastojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85hdrscreadastojson", AV85hdrscreadastojson);
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         AV18MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCod", AV18MaqCod);
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
      e1324P2 ();
      if (returnInSub) return;
   }

   public void e1324P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadeacabado00_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Station, ""))));
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadeacabado00_wp_impl.this.AV15EmprCod = GXv_char2[0] ;
      recetadeacabado00_wp_impl.this.AV16EmprNom = GXv_char3[0] ;
      recetadeacabado00_wp_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17UsurCod, "@!"))));
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if (returnInSub) return;
      GXt_int5 = AV9VolMul ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VOLMUL", ""), GXv_int6) ;
      recetadeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV9VolMul = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9VolMul), 4, 0));
      GXt_int7 = (byte)(AV10FabsMq) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FABSMQ", ""), GXv_int8) ;
      recetadeacabado00_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV10FabsMq = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10FabsMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10FabsMq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10FabsMq), "ZZZ9")));
      GXt_int5 = AV11LtsMn ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LTSMNA", ""), GXv_int6) ;
      recetadeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV11LtsMn = (short)(GXt_int5) ;
      GXt_int7 = (byte)(AV12Ltsrc) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LTSREC", ""), GXv_int8) ;
      recetadeacabado00_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV12Ltsrc = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Ltsrc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Ltsrc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Ltsrc), "ZZZ9")));
      GXt_int7 = (byte)(AV77Sit9) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ST9RAC", ""), GXv_int8) ;
      recetadeacabado00_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV77Sit9 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Sit9", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Sit9), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77Sit9), "ZZZ9")));
      AV13HumSec = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13HumSec", AV13HumSec);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13HumSec, ""))));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV8Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV8Prompt)==0) ? AV95Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8Prompt), true);
      AV95Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV8Prompt)==0) ? AV95Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV8Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV8Prompt), true);
   }

   public void e1424P2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'BARCAD' */
      S122 ();
      if (returnInSub) return;
      if ( AV33Barcad == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta Hdr no existe ¡¡¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV18MaqCod)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Codigo Maquina", ""));
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV47Barsit >= 9 ) && ( AV77Sit9 == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta cerrada esta OF", ""));
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( AV67FaseAca == 0 )
               {
                  Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr no tiene ninguna Fase como Acabado ¡¡¡", "") + GXutil.newLine( ) ;
                  httpContext.GX_msglist.addItem(Gx_msg);
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( ( AV67FaseAca == 1 ) && ( GXutil.strcmp(AV68BarFasFor, httpContext.getMessage( "N", "")) == 0 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr tiene fase de Acabado pero no tiene Formula ¡¡¡", "") + GXutil.newLine( ) ;
                     httpContext.GX_msglist.addItem(Gx_msg);
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( AV63Hdraca == 1 )
                     {
                        Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr esta agrupada con la Hdr ", "") + GXutil.str( AV64BarCod_p, 8, 0) + "-" + GXutil.str( AV65CodReo_p, 1, 0) + AV66CodPar + GXutil.newLine( ) + httpContext.getMessage( "No se puede crear Receta de acabado", "") + GXutil.newLine( ) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        httpContext.popup(formatLink("app.recetasdeacabados.recetadeacabado01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV34BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV35BarMtr)),GXutil.URLEncode(DecimalUtil.decToString(AV28ArtFacabs)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV37CliNom)),GXutil.URLEncode(GXutil.rtrim(AV38BarSer)),GXutil.URLEncode(GXutil.rtrim(AV50BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV52Procod)),GXutil.URLEncode(GXutil.rtrim(AV53ProDsc)),GXutil.URLEncode(GXutil.rtrim(AV18MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV23MaqDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV26MaqVolRes,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25MaqVolTop,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40Baranccru1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV42PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV41BarPle)),GXutil.URLEncode(GXutil.rtrim(AV45Contextura)),GXutil.URLEncode(GXutil.rtrim(AV43BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV46BarMat)),GXutil.URLEncode(GXutil.ltrimstr(AV81RecLtssr,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80LtsSob,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV82Hrefacabs)),GXutil.URLEncode(GXutil.rtrim(AV78Var1)),GXutil.URLEncode(GXutil.rtrim(AV79Msg_tosa)),GXutil.URLEncode(GXutil.rtrim(AV60BarFasecod)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarFaseOrd,4,0)),GXutil.URLEncode(GXutil.rtrim(AV61barMaqTin)),GXutil.URLEncode(GXutil.rtrim(AV91ErrMensaje1)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarKgm","BarMtr","ArtFacabs","CliCod","CliNom","BarSer","BarSerDsc","Procod","ProDsc","MaqCod","MaqDsc","MaqVolRes","MaqVolTop","BarAncCru1","PedidoCliente","BarPle","Contextura","BarColNom","BarColNum","BarMat","RecLtssr","LtsSob","Hrefacabs","Var1","Msg_tosa","BarFasecod","BarFaseOrd","barMaqTin","ErrMensaje1","ErrMensaje","HdrscreadasToJson"}) , new Object[] {"AV90ErrMensaje","AV85hdrscreadastojson"});
                        httpContext.GX_msglist.addItem(AV90ErrMensaje);
                        httpContext.doAjaxRefresh();
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1224P2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV18MaqCod = Combo_maqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCod", AV18MaqCod);
      /* Execute user subroutine: 'MAQUIN' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RECMAQ' */
      S142 ();
      if (returnInSub) return;
      if ( AV32ArtFamq.doubleValue() > 0 )
      {
         AV28ArtFacabs = AV32ArtFamq ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28ArtFacabs)==0) )
         {
            if ( ( AV21MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, "S") == 0 ) )
            {
               AV28ArtFacabs = AV21MaqfacAbs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
            }
            if ( ( AV22MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, "H") == 0 ) )
            {
               AV28ArtFacabs = AV22MaqFabsh ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
            }
         }
      }
      if ( AV10FabsMq == 1 )
      {
         AV28ArtFacabs = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
         if ( ( AV21MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV28ArtFacabs = AV21MaqfacAbs ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
         }
         if ( ( AV22MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, httpContext.getMessage( "H", "")) == 0 ) )
         {
            AV28ArtFacabs = AV22MaqFabsh ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
         }
      }
      GXt_int5 = AV29LtsIni ;
      GXv_decimal9[0] = AV28ArtFacabs ;
      GXv_int6[0] = AV26MaqVolRes ;
      GXv_int8[0] = (byte)(AV9VolMul) ;
      GXv_decimal10[0] = AV27Tot_kgs ;
      GXv_int11[0] = GXt_int5 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal9, GXv_int6, GXv_int8, GXv_decimal10, GXv_int11) ;
      recetadeacabado00_wp_impl.this.AV28ArtFacabs = GXv_decimal9[0] ;
      recetadeacabado00_wp_impl.this.AV26MaqVolRes = GXv_int6[0] ;
      recetadeacabado00_wp_impl.this.AV9VolMul = GXv_int8[0] ;
      recetadeacabado00_wp_impl.this.AV27Tot_kgs = GXv_decimal10[0] ;
      recetadeacabado00_wp_impl.this.GXt_int5 = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9VolMul), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
      AV29LtsIni = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29LtsIni), 5, 0));
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H024P2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A607MaqEst = H024P2_A607MaqEst[0] ;
         n607MaqEst = H024P2_n607MaqEst[0] ;
         A619MaqTinTip = H024P2_A619MaqTinTip[0] ;
         n619MaqTinTip = H024P2_n619MaqTinTip[0] ;
         A13734MaqCDsc = H024P2_A13734MaqCDsc[0] ;
         A602MaqCod = H024P2_A602MaqCod[0] ;
         A606MaqDsc = H024P2_A606MaqDsc[0] ;
         n606MaqDsc = H024P2_n606MaqDsc[0] ;
         AV20Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV19MaqCod_Data.add(AV20Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_maqcod_Selectedvalue_set = AV18MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e1824P2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV15EmprCod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","",""});
      /*  Sending Event outputs  */
   }

   public void e1524P2( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      if ( AV5BarCod > 0 )
      {
         /* Execute user subroutine: 'BARCAD' */
         S122 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'BARFAS' */
         S152 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'HDRACA' */
         S162 ();
         if (returnInSub) return;
         if ( AV33Barcad == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. NO existe HDR¡¡¡", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV63Hdraca == 1 )
            {
               Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr esta agrupada con la Hdr ", "") + GXutil.str( AV64BarCod_p, 8, 0) + "-" + GXutil.str( AV65CodReo_p, 1, 0) + AV66CodPar + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( "No se puede crear Receta de acabado", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( AV32ArtFamq.doubleValue() > 0 )
               {
                  AV28ArtFacabs = AV32ArtFamq ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
               }
               else
               {
                  if ( AV28ArtFacabs.doubleValue() == 0 )
                  {
                     if ( ( AV21MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, httpContext.getMessage( "S", "")) == 0 ) )
                     {
                        AV28ArtFacabs = AV21MaqfacAbs ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
                     }
                     if ( ( AV22MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, httpContext.getMessage( "H", "")) == 0 ) )
                     {
                        AV28ArtFacabs = AV22MaqFabsh ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
                     }
                  }
               }
               if ( AV10FabsMq == 1 )
               {
                  AV28ArtFacabs = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
                  if ( ( AV21MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, httpContext.getMessage( "S", "")) == 0 ) )
                  {
                     AV28ArtFacabs = AV21MaqfacAbs ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
                  }
                  if ( ( AV22MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV13HumSec, httpContext.getMessage( "H", "")) == 0 ) )
                  {
                     AV28ArtFacabs = AV22MaqFabsh ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
                  }
               }
               AV76hdr = GXutil.str( AV5BarCod, 8, 0) + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar ;
               if ( AV56Lconti == 1 )
               {
                  if ( GXutil.strcmp(AV76hdr, AV58BarAgrLot) == 0 )
                  {
                     GXt_char1 = AV75FasDsc ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.pfasdsc(remoteHandle, context).execute( AV15EmprCod, AV60BarFasecod, GXv_char4) ;
                     recetadeacabado00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
                     AV75FasDsc = GXt_char1 ;
                     Gx_msg = httpContext.getMessage( "Atencion esta HDR esta en el Historico ", "") + AV57DdmmAAAA + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( "Fase Ejecutada ", "") + AV60BarFasecod + " " + AV75FasDsc + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( "Maquina ", "") + AV61barMaqTin ;
                  }
                  else
                  {
                     Gx_msg = httpContext.getMessage( "Atencion esta HDR esta en el Historico ", "") + AV57DdmmAAAA + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( "Y la HDR principal es ", "") + GXutil.substring( AV58BarAgrLot, 1, 8) + "-" + GXutil.substring( AV58BarAgrLot, 9, 1) + GXutil.substring( AV58BarAgrLot, 1, 1) + GXutil.newLine( ) ;
                  }
                  if ( ! (GXutil.strcmp("", Gx_msg)==0) )
                  {
                     httpContext.GX_msglist.addItem(Gx_msg);
                  }
               }
               GXt_int5 = AV29LtsIni ;
               GXv_decimal10[0] = AV28ArtFacabs ;
               GXv_int11[0] = AV26MaqVolRes ;
               GXv_int8[0] = (byte)(AV9VolMul) ;
               GXv_decimal9[0] = AV27Tot_kgs ;
               GXv_int6[0] = GXt_int5 ;
               new app.pcalvol(remoteHandle, context).execute( GXv_decimal10, GXv_int11, GXv_int8, GXv_decimal9, GXv_int6) ;
               recetadeacabado00_wp_impl.this.AV28ArtFacabs = GXv_decimal10[0] ;
               recetadeacabado00_wp_impl.this.AV26MaqVolRes = GXv_int11[0] ;
               recetadeacabado00_wp_impl.this.AV9VolMul = GXv_int8[0] ;
               recetadeacabado00_wp_impl.this.AV27Tot_kgs = GXv_decimal9[0] ;
               recetadeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV9VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9VolMul), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
               AV29LtsIni = GXt_int5 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29LtsIni), 5, 0));
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1624P2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV90ErrMensaje, httpContext.getMessage( "Proceso finalizado con exito!", "")) == 0 )
      {
         AV84Hdrscreadas_SDTs.fromJSonString(AV85hdrscreadastojson, null);
         if ( AV84Hdrscreadas_SDTs.size() == 1 )
         {
            AV98GXV1 = 1 ;
            while ( AV98GXV1 <= AV84Hdrscreadas_SDTs.size() )
            {
               AV83Hdrscreadas_SDT = (app.SdtHdrscreadas_SDT)((app.SdtHdrscreadas_SDT)AV84Hdrscreadas_SDTs.elementAt(-1+AV98GXV1));
               AV88BarcodSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcod() ;
               AV87BarcodreoSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodreo() ;
               AV86BarcodparSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodpar() ;
               AV89ReclinmaqSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Reclinmaq() ;
               AV98GXV1 = (int)(AV98GXV1+1) ;
            }
            callWebObject(formatLink("app.formulaciontinte.recetadeacabados02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV88BarcodSDT,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV87BarcodreoSDT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV86BarcodparSDT)),GXutil.URLEncode(GXutil.ltrimstr(AV89ReclinmaqSDT,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", "")))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Mode"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            AV5BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
            AV6BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
            AV7BarCodPar = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
            AV18MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCod", AV18MaqCod);
            AV21MaqfacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21MaqfacAbs", GXutil.ltrimstr( AV21MaqfacAbs, 6, 2));
            AV25MaqVolTop = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolTop), 5, 0));
            AV26MaqVolRes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
            AV27Tot_kgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
            AV28ArtFacabs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
            AV29LtsIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29LtsIni), 5, 0));
            AV99GXV2 = 1 ;
            while ( AV99GXV2 <= AV84Hdrscreadas_SDTs.size() )
            {
               AV83Hdrscreadas_SDT = (app.SdtHdrscreadas_SDT)((app.SdtHdrscreadas_SDT)AV84Hdrscreadas_SDTs.elementAt(-1+AV99GXV2));
               AV88BarcodSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcod() ;
               AV87BarcodreoSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodreo() ;
               AV86BarcodparSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodpar() ;
               AV89ReclinmaqSDT = AV83Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Reclinmaq() ;
               AV99GXV2 = (int)(AV99GXV2+1) ;
            }
            httpContext.popup(formatLink("app.recetasdeacabado04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV88BarcodSDT,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV87BarcodreoSDT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV86BarcodparSDT)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", ""))),GXutil.URLEncode(GXutil.rtrim(AV17UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV14Station))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Mode","Usurcod","Station"}) , new Object[] {"AV15EmprCod","AV88BarcodSDT","AV87BarcodreoSDT","AV86BarcodparSDT","","AV17UsurCod","AV14Station"});
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV21MaqfacAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21MaqfacAbs", GXutil.ltrimstr( AV21MaqfacAbs, 6, 2));
      AV22MaqFabsh = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22MaqFabsh", GXutil.ltrimstr( AV22MaqFabsh, 6, 2));
      AV23MaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23MaqDsc", AV23MaqDsc);
      AV24MaqVolMin = 0 ;
      AV25MaqVolTop = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolTop), 5, 0));
      AV26MaqVolRes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
      AV100GXLvl261 = (byte)(0) ;
      /* Using cursor H024P3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV18MaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = H024P3_A602MaqCod[0] ;
         A396EmprCod = H024P3_A396EmprCod[0] ;
         A606MaqDsc = H024P3_A606MaqDsc[0] ;
         n606MaqDsc = H024P3_n606MaqDsc[0] ;
         A2801MaqVolRes = H024P3_A2801MaqVolRes[0] ;
         n2801MaqVolRes = H024P3_n2801MaqVolRes[0] ;
         A2802MaqVolTop = H024P3_A2802MaqVolTop[0] ;
         n2802MaqVolTop = H024P3_n2802MaqVolTop[0] ;
         A6284MaqFacAbs = H024P3_A6284MaqFacAbs[0] ;
         n6284MaqFacAbs = H024P3_n6284MaqFacAbs[0] ;
         A9982MaqFabsHm = H024P3_A9982MaqFabsHm[0] ;
         n9982MaqFabsHm = H024P3_n9982MaqFabsHm[0] ;
         A625MaqVolMin = H024P3_A625MaqVolMin[0] ;
         n625MaqVolMin = H024P3_n625MaqVolMin[0] ;
         AV100GXLvl261 = (byte)(1) ;
         AV23MaqDsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23MaqDsc", AV23MaqDsc);
         AV26MaqVolRes = A2801MaqVolRes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26MaqVolRes), 5, 0));
         AV25MaqVolTop = A2802MaqVolTop ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MaqVolTop), 5, 0));
         AV21MaqfacAbs = A6284MaqFacAbs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21MaqfacAbs", GXutil.ltrimstr( AV21MaqfacAbs, 6, 2));
         AV22MaqFabsh = A9982MaqFabsHm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22MaqFabsh", GXutil.ltrimstr( AV22MaqFabsh, 6, 2));
         AV24MaqVolMin = A625MaqVolMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV100GXLvl261 == 0 )
      {
         AV23MaqDsc = httpContext.getMessage( "Inexistente", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23MaqDsc", AV23MaqDsc);
      }
   }

   public void S142( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV30RecmaqA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30RecmaqA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecmaqA), 4, 0));
      AV31RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor H024P4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6039RecAcab = H024P4_A6039RecAcab[0] ;
         n6039RecAcab = H024P4_n6039RecAcab[0] ;
         A130BarCodPar = H024P4_A130BarCodPar[0] ;
         A132BarCodReo = H024P4_A132BarCodReo[0] ;
         A129BarCod = H024P4_A129BarCod[0] ;
         A396EmprCod = H024P4_A396EmprCod[0] ;
         A602MaqCod = H024P4_A602MaqCod[0] ;
         A4866RecFecAlt = H024P4_A4866RecFecAlt[0] ;
         n4866RecFecAlt = H024P4_n4866RecFecAlt[0] ;
         if ( GXutil.strcmp(GXutil.substring( A602MaqCod, 1, 6), GXutil.substring( AV18MaqCod, 1, 6)) == 0 )
         {
            AV31RecFecAlt = A4866RecFecAlt ;
            AV30RecmaqA = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30RecmaqA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecmaqA), 4, 0));
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S122( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV33Barcad = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcad), 4, 0));
      AV34BarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarKgm", GXutil.ltrimstr( AV34BarKgm, 9, 2));
      AV35BarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarMtr", GXutil.ltrimstr( AV35BarMtr, 9, 2));
      /* Using cursor H024P6 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = H024P6_A130BarCodPar[0] ;
         A132BarCodReo = H024P6_A132BarCodReo[0] ;
         A129BarCod = H024P6_A129BarCod[0] ;
         A252CliCod = H024P6_A252CliCod[0] ;
         n252CliCod = H024P6_n252CliCod[0] ;
         A279CliNom = H024P6_A279CliNom[0] ;
         A212BarSer = H024P6_A212BarSer[0] ;
         A127BarAncCru1 = H024P6_A127BarAncCru1[0] ;
         A206BarPle = H024P6_A206BarPle[0] ;
         A135BarColNom = H024P6_A135BarColNom[0] ;
         A136BarColNum = H024P6_A136BarColNum[0] ;
         A2836BarPle2 = H024P6_A2836BarPle2[0] ;
         A182BarMat = H024P6_A182BarMat[0] ;
         A213BarSit = H024P6_A213BarSit[0] ;
         A118BarAcaQui = H024P6_A118BarAcaQui[0] ;
         A1652BarSerDsc = H024P6_A1652BarSerDsc[0] ;
         A864BarPes = H024P6_A864BarPes[0] ;
         A166BarKgm = H024P6_A166BarKgm[0] ;
         A184BarMtr = H024P6_A184BarMtr[0] ;
         A143BarDisNum = H024P6_A143BarDisNum[0] ;
         A4812BarEncCli = H024P6_A4812BarEncCli[0] ;
         A396EmprCod = H024P6_A396EmprCod[0] ;
         A279CliNom = H024P6_A279CliNom[0] ;
         A166BarKgm = H024P6_A166BarKgm[0] ;
         A184BarMtr = H024P6_A184BarMtr[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char2[0] = A143BarDisNum ;
         GXv_char12[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char12) ;
         recetadeacabado00_wp_impl.this.A396EmprCod = GXv_char4[0] ;
         recetadeacabado00_wp_impl.this.A4812BarEncCli = GXv_char3[0] ;
         recetadeacabado00_wp_impl.this.A143BarDisNum = GXv_char2[0] ;
         recetadeacabado00_wp_impl.this.GXt_char1 = GXv_char12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
         AV33Barcad = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcad), 4, 0));
         AV36CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCod), 6, 0));
         AV37CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CliNom", AV37CliNom);
         AV38BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarSer", AV38BarSer);
         AV42PedidoCliente = A13878PedidoClie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PedidoCliente", AV42PedidoCliente);
         AV40Baranccru1 = A127BarAncCru1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Baranccru1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Baranccru1), 3, 0));
         AV41BarPle = A206BarPle ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41BarPle", AV41BarPle);
         AV43BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarColNom", AV43BarColNom);
         AV44BarColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarColNum), 6, 0));
         AV45Contextura = A2836BarPle2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Contextura", AV45Contextura);
         AV46BarMat = A182BarMat ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarMat", AV46BarMat);
         AV47Barsit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Barsit), 2, 0));
         AV48BarAcaqui = A118BarAcaQui ;
         /* Execute user subroutine: 'ARTICU' */
         S176 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         AV50BarSerDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50BarSerDsc", AV50BarSerDsc);
         AV34BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarKgm", GXutil.ltrimstr( AV34BarKgm, 9, 2));
         AV35BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarMtr", GXutil.ltrimstr( AV35BarMtr, 9, 2));
         AV51BarPes = A864BarPes ;
         /* Using cursor H024P7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A758ProCod = H024P7_A758ProCod[0] ;
            A759ProDsc = H024P7_A759ProDsc[0] ;
            A759ProDsc = H024P7_A759ProDsc[0] ;
            AV52Procod = A758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Procod", AV52Procod);
            AV53ProDsc = A759ProDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53ProDsc", AV53ProDsc);
            AV54Tinte = (short)(0) ;
            /* Using cursor H024P8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A150BarFacTin = H024P8_A150BarFacTin[0] ;
               A194BarOrdLin = H024P8_A194BarOrdLin[0] ;
               AV54Tinte = (short)(1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV55recmaq = (short)(0) ;
      /* Using cursor H024P9 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A6039RecAcab = H024P9_A6039RecAcab[0] ;
         n6039RecAcab = H024P9_n6039RecAcab[0] ;
         A130BarCodPar = H024P9_A130BarCodPar[0] ;
         A132BarCodReo = H024P9_A132BarCodReo[0] ;
         A129BarCod = H024P9_A129BarCod[0] ;
         A396EmprCod = H024P9_A396EmprCod[0] ;
         A602MaqCod = H024P9_A602MaqCod[0] ;
         A2804RecLinMaq = H024P9_A2804RecLinMaq[0] ;
         AV55recmaq = (short)(1) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV56Lconti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Lconti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Lconti), 4, 0));
      AV57DdmmAAAA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57DdmmAAAA", AV57DdmmAAAA);
      AV58BarAgrLot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58BarAgrLot", AV58BarAgrLot);
      AV59BarFaseOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarFaseOrd), 4, 0));
      AV60BarFasecod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarFasecod", AV60BarFasecod);
      AV61barMaqTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61barMaqTin", AV61barMaqTin);
      /* Using cursor H024P10 */
      pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A6634BarRecAcb = H024P10_A6634BarRecAcb[0] ;
         n6634BarRecAcb = H024P10_n6634BarRecAcb[0] ;
         A1935BarParTin = H024P10_A1935BarParTin[0] ;
         n1935BarParTin = H024P10_n1935BarParTin[0] ;
         A1934BarReoTin = H024P10_A1934BarReoTin[0] ;
         n1934BarReoTin = H024P10_n1934BarReoTin[0] ;
         A1933BarCodTin = H024P10_A1933BarCodTin[0] ;
         n1933BarCodTin = H024P10_n1933BarCodTin[0] ;
         A396EmprCod = H024P10_A396EmprCod[0] ;
         A13759EstFecCier = H024P10_A13759EstFecCier[0] ;
         A2316BarAgrLot = H024P10_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H024P10_n2316BarAgrLot[0] ;
         A4926BarFaseOrd = H024P10_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = H024P10_n4926BarFaseOrd[0] ;
         A4925BarFaseCod = H024P10_A4925BarFaseCod[0] ;
         n4925BarFaseCod = H024P10_n4925BarFaseCod[0] ;
         A1945BarMaqTin = H024P10_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H024P10_n1945BarMaqTin[0] ;
         AV57DdmmAAAA = localUtil.dtoc( A13759EstFecCier, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57DdmmAAAA", AV57DdmmAAAA);
         AV58BarAgrLot = A2316BarAgrLot ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58BarAgrLot", AV58BarAgrLot);
         AV59BarFaseOrd = A4926BarFaseOrd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarFaseOrd), 4, 0));
         AV60BarFasecod = A4925BarFaseCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60BarFasecod", AV60BarFasecod);
         AV61barMaqTin = A1945BarMaqTin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61barMaqTin", AV61barMaqTin);
         AV56Lconti = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Lconti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Lconti), 4, 0));
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( (0==AV56Lconti) )
      {
         /* Using cursor H024P11 */
         pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A4495HreNumCie = H024P11_A4495HreNumCie[0] ;
            A9804HreAcab = H024P11_A9804HreAcab[0] ;
            n9804HreAcab = H024P11_n9804HreAcab[0] ;
            A4494HreBarPar = H024P11_A4494HreBarPar[0] ;
            A4493HreBarReo = H024P11_A4493HreBarReo[0] ;
            A4492HreBarCod = H024P11_A4492HreBarCod[0] ;
            A396EmprCod = H024P11_A396EmprCod[0] ;
            A4529HreFecTin = H024P11_A4529HreFecTin[0] ;
            n4529HreFecTin = H024P11_n4529HreFecTin[0] ;
            A4964HreOrdLin = H024P11_A4964HreOrdLin[0] ;
            n4964HreOrdLin = H024P11_n4964HreOrdLin[0] ;
            A4963HreFasCod = H024P11_A4963HreFasCod[0] ;
            n4963HreFasCod = H024P11_n4963HreFasCod[0] ;
            A4546HreMaqCod = H024P11_A4546HreMaqCod[0] ;
            n4546HreMaqCod = H024P11_n4546HreMaqCod[0] ;
            A4529HreFecTin = H024P11_A4529HreFecTin[0] ;
            n4529HreFecTin = H024P11_n4529HreFecTin[0] ;
            AV57DdmmAAAA = localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DdmmAAAA", AV57DdmmAAAA);
            AV58BarAgrLot = GXutil.str( A4492HreBarCod, 8, 0) + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58BarAgrLot", AV58BarAgrLot);
            AV59BarFaseOrd = A4964HreOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarFaseOrd), 4, 0));
            AV60BarFasecod = A4963HreFasCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarFasecod", AV60BarFasecod);
            AV61barMaqTin = A4546HreMaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61barMaqTin", AV61barMaqTin);
            AV56Lconti = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56Lconti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Lconti), 4, 0));
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
      AV27Tot_kgs = AV34BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
      AV62Tot_mts = AV35BarMtr ;
      /* Optimized group. */
      /* Using cursor H024P12 */
      pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      c6035Ac_Kilos = H024P12_A6035Ac_Kilos[0] ;
      n6035Ac_Kilos = H024P12_n6035Ac_Kilos[0] ;
      c6034Ac_Metros = H024P12_A6034Ac_Metros[0] ;
      n6034Ac_Metros = H024P12_n6034Ac_Metros[0] ;
      pr_default.close(9);
      AV27Tot_kgs = AV27Tot_kgs.add(c6035Ac_Kilos) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tot_kgs", GXutil.ltrimstr( AV27Tot_kgs, 10, 2));
      AV62Tot_mts = AV62Tot_mts.add(c6034Ac_Metros) ;
      /* End optimized group. */
      AV32ArtFamq = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32ArtFamq", GXutil.ltrimstr( AV32ArtFamq, 6, 2));
      /* Using cursor H024P13 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV36CliCod), AV38BarSer, AV13HumSec, AV18MaqCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A10042ArtMqFa = H024P13_A10042ArtMqFa[0] ;
         A10041ArtSH = H024P13_A10041ArtSH[0] ;
         A65ArtCod = H024P13_A65ArtCod[0] ;
         A252CliCod = H024P13_A252CliCod[0] ;
         n252CliCod = H024P13_n252CliCod[0] ;
         A396EmprCod = H024P13_A396EmprCod[0] ;
         A10044ArtFaMq = H024P13_A10044ArtFaMq[0] ;
         n10044ArtFaMq = H024P13_n10044ArtFaMq[0] ;
         AV32ArtFamq = A10044ArtFaMq ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ArtFamq", GXutil.ltrimstr( AV32ArtFamq, 6, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S176( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV28ArtFacabs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
      /* Using cursor H024P14 */
      pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV36CliCod), AV38BarSer});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A65ArtCod = H024P14_A65ArtCod[0] ;
         A252CliCod = H024P14_A252CliCod[0] ;
         n252CliCod = H024P14_n252CliCod[0] ;
         A396EmprCod = H024P14_A396EmprCod[0] ;
         A9730ArtFabsH = H024P14_A9730ArtFabsH[0] ;
         n9730ArtFabsH = H024P14_n9730ArtFabsH[0] ;
         A2791ArtFacAbs = H024P14_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = H024P14_n2791ArtFacAbs[0] ;
         AV28ArtFacabs = ((GXutil.strcmp(AV13HumSec, "S")==0) ? A2791ArtFacAbs : A9730ArtFabsH) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      if ( (0==AV12Ltsrc) && (0==AV49Torient) )
      {
         AV28ArtFacabs = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28ArtFacabs)==0) ? DecimalUtil.doubleToDec(100) : AV28ArtFacabs) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ArtFacabs", GXutil.ltrimstr( AV28ArtFacabs, 6, 2));
      }
   }

   public void S152( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV67FaseAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67FaseAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67FaseAca), 4, 0));
      AV68BarFasFor = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68BarFasFor", AV68BarFasFor);
      AV69Fasqui = (short)(0) ;
      AV70BarOrdLin = (short)(0) ;
      AV71fasquilin = (short)(0) ;
      /* Using cursor H024P15 */
      pr_default.execute(12, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A603MaqCodBis = H024P15_A603MaqCodBis[0] ;
         A194BarOrdLin = H024P15_A194BarOrdLin[0] ;
         A758ProCod = H024P15_A758ProCod[0] ;
         A130BarCodPar = H024P15_A130BarCodPar[0] ;
         A132BarCodReo = H024P15_A132BarCodReo[0] ;
         A129BarCod = H024P15_A129BarCod[0] ;
         A396EmprCod = H024P15_A396EmprCod[0] ;
         A4287BarFasFor = H024P15_A4287BarFasFor[0] ;
         A4905BarFasAcab = H024P15_A4905BarFasAcab[0] ;
         A457FasCod = H024P15_A457FasCod[0] ;
         AV67FaseAca = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67FaseAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67FaseAca), 4, 0));
         AV68BarFasFor = A4287BarFasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68BarFasFor", AV68BarFasFor);
         AV72FasCod = A457FasCod ;
         AV74Num_p = (short)(0) ;
         AV73Proforcod = "" ;
         /* Using cursor H024P16 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A764ProForCod = H024P16_A764ProForCod[0] ;
            A5371FasQuiLin = H024P16_A5371FasQuiLin[0] ;
            AV69Fasqui = (short)(1) ;
            AV70BarOrdLin = A194BarOrdLin ;
            AV71fasquilin = A5371FasQuiLin ;
            if ( GXutil.strcmp(GXutil.substring( A603MaqCodBis, 1, 4), GXutil.substring( AV18MaqCod, 1, 4)) == 0 )
            {
               AV73Proforcod = A764ProForCod ;
               AV74Num_p = (short)(AV74Num_p+1) ;
            }
            pr_default.readNext(13);
         }
         pr_default.close(13);
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S162( )
   {
      /* 'HDRACA' Routine */
      returnInSub = false ;
      AV63Hdraca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Hdraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Hdraca), 4, 0));
      AV64BarCod_p = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64BarCod_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarCod_p), 8, 0));
      AV65CodReo_p = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65CodReo_p", GXutil.str( AV65CodReo_p, 1, 0));
      AV66CodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66CodPar", AV66CodPar);
      /* Using cursor H024P17 */
      pr_default.execute(14, new Object[] {AV15EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A396EmprCod = H024P17_A396EmprCod[0] ;
         A6031Ac_Barcod = H024P17_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = H024P17_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = H024P17_A6033Ac_BarPar[0] ;
         A129BarCod = H024P17_A129BarCod[0] ;
         A132BarCodReo = H024P17_A132BarCodReo[0] ;
         A130BarCodPar = H024P17_A130BarCodPar[0] ;
         AV63Hdraca = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Hdraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Hdraca), 4, 0));
         AV64BarCod_p = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64BarCod_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarCod_p), 8, 0));
         AV65CodReo_p = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65CodReo_p", GXutil.str( AV65CodReo_p, 1, 0));
         AV66CodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66CodPar", AV66CodPar);
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   protected void nextLoad( )
   {
   }

   protected void e1724P2( )
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
      pa24P2( ) ;
      ws24P2( ) ;
      we24P2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714341679", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabados/recetadeacabado00_wp.js", "?202681714341679", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavTot_kgs_Internalname = "vTOT_KGS" ;
      edtavArtfacabs_Internalname = "vARTFACABS" ;
      edtavMaqvolres_Internalname = "vMAQVOLRES" ;
      edtavLtsini_Internalname = "vLTSINI" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      edtavHdraca_Internalname = "vHDRACA" ;
      edtavFaseaca_Internalname = "vFASEACA" ;
      edtavBarfasfor_Internalname = "vBARFASFOR" ;
      edtavRecmaqa_Internalname = "vRECMAQA" ;
      edtavBarcad_Internalname = "vBARCAD" ;
      edtavBarsit_Internalname = "vBARSIT" ;
      edtavErrmensaje_Internalname = "vERRMENSAJE" ;
      edtavHdrscreadastojson_Internalname = "vHDRSCREADASTOJSON" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
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
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavHdrscreadastojson_Enabled = 1 ;
      edtavErrmensaje_Enabled = 1 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Enabled = 1 ;
      edtavBarcad_Jsonclick = "" ;
      edtavBarcad_Enabled = 1 ;
      edtavRecmaqa_Jsonclick = "" ;
      edtavRecmaqa_Enabled = 1 ;
      edtavBarfasfor_Jsonclick = "" ;
      edtavBarfasfor_Enabled = 1 ;
      edtavFaseaca_Jsonclick = "" ;
      edtavFaseaca_Enabled = 1 ;
      edtavHdraca_Jsonclick = "" ;
      edtavHdraca_Enabled = 1 ;
      edtavLtsini_Jsonclick = "" ;
      edtavLtsini_Enabled = 1 ;
      edtavMaqvolres_Jsonclick = "" ;
      edtavMaqvolres_Enabled = 1 ;
      edtavArtfacabs_Jsonclick = "" ;
      edtavArtfacabs_Enabled = 1 ;
      edtavTot_kgs_Jsonclick = "" ;
      edtavTot_kgs_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Control Variables", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Receta de Acabado", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV90ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV85hdrscreadastojson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77Sit9',fld:'vSIT9',pic:'ZZZ9',hsh:true},{av:'AV81RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV80LtsSob',fld:'vLTSSOB',pic:'ZZZZ9',hsh:true},{av:'AV82Hrefacabs',fld:'vHREFACABS',pic:'ZZ9.99',hsh:true},{av:'AV78Var1',fld:'vVAR1',pic:'',hsh:true},{av:'AV79Msg_tosa',fld:'vMSG_TOSA',pic:'',hsh:true},{av:'AV91ErrMensaje1',fld:'vERRMENSAJE1',pic:'',hsh:true},{av:'AV13HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV12Ltsrc',fld:'vLTSRC',pic:'ZZZ9',hsh:true},{av:'AV49Torient',fld:'vTORIENT',pic:'ZZZ9',hsh:true},{av:'AV10FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV14Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV18MaqCod',fld:'vMAQCOD',pic:''},{av:'AV21MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV25MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV26MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV27Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV29LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'AV14Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1424P2',iparms:[{av:'AV33Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV18MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV77Sit9',fld:'vSIT9',pic:'ZZZ9',hsh:true},{av:'AV67FaseAca',fld:'vFASEACA',pic:'ZZZ9'},{av:'AV68BarFasFor',fld:'vBARFASFOR',pic:'@!'},{av:'AV63Hdraca',fld:'vHDRACA',pic:'ZZZ9'},{av:'AV64BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV65CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV66CodPar',fld:'vCODPAR',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV35BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV37CliNom',fld:'vCLINOM',pic:''},{av:'AV38BarSer',fld:'vBARSER',pic:''},{av:'AV50BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV52Procod',fld:'vPROCOD',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:''},{av:'AV23MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV26MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV25MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV40Baranccru1',fld:'vBARANCCRU1',pic:'ZZ9'},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV41BarPle',fld:'vBARPLE',pic:''},{av:'AV45Contextura',fld:'vCONTEXTURA',pic:''},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV46BarMat',fld:'vBARMAT',pic:''},{av:'AV81RecLtssr',fld:'vRECLTSSR',pic:'ZZZZ9',hsh:true},{av:'AV80LtsSob',fld:'vLTSSOB',pic:'ZZZZ9',hsh:true},{av:'AV82Hrefacabs',fld:'vHREFACABS',pic:'ZZ9.99',hsh:true},{av:'AV78Var1',fld:'vVAR1',pic:'',hsh:true},{av:'AV79Msg_tosa',fld:'vMSG_TOSA',pic:'',hsh:true},{av:'AV60BarFasecod',fld:'vBARFASECOD',pic:''},{av:'AV59BarFaseOrd',fld:'vBARFASEORD',pic:'ZZZ9'},{av:'AV61barMaqTin',fld:'vBARMAQTIN',pic:''},{av:'AV91ErrMensaje1',fld:'vERRMENSAJE1',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A127BarAncCru1',fld:'BARANCCRU1',pic:'ZZ9'},{av:'A206BarPle',fld:'BARPLE',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A2836BarPle2',fld:'BARPLE2',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A4926BarFaseOrd',fld:'BARFASEORD',pic:'ZZZ9'},{av:'A4925BarFaseCod',fld:'BARFASECOD',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4964HreOrdLin',fld:'HREORDLIN',pic:'ZZZ9'},{av:'A4963HreFasCod',fld:'HREFASCOD',pic:''},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10041ArtSH',fld:'ARTSH',pic:''},{av:'A10042ArtMqFa',fld:'ARTMQFA',pic:''},{av:'AV13HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'A10044ArtFaMq',fld:'ARTFAMQ',pic:'ZZ9.99'},{av:'A2791ArtFacAbs',fld:'ARTFACABS',pic:'ZZ9.99'},{av:'A9730ArtFabsH',fld:'ARTFABSH',pic:'ZZ9.99'},{av:'AV12Ltsrc',fld:'vLTSRC',pic:'ZZZ9',hsh:true},{av:'AV49Torient',fld:'vTORIENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV85hdrscreadastojson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV90ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV33Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV34BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV35BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV37CliNom',fld:'vCLINOM',pic:''},{av:'AV38BarSer',fld:'vBARSER',pic:''},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV40Baranccru1',fld:'vBARANCCRU1',pic:'ZZ9'},{av:'AV41BarPle',fld:'vBARPLE',pic:''},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV45Contextura',fld:'vCONTEXTURA',pic:''},{av:'AV46BarMat',fld:'vBARMAT',pic:''},{av:'AV47Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV50BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV52Procod',fld:'vPROCOD',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:''},{av:'AV56Lconti',fld:'vLCONTI',pic:'ZZZ9'},{av:'AV57DdmmAAAA',fld:'vDDMMAAAA',pic:''},{av:'AV58BarAgrLot',fld:'vBARAGRLOT',pic:''},{av:'AV59BarFaseOrd',fld:'vBARFASEORD',pic:'ZZZ9'},{av:'AV60BarFasecod',fld:'vBARFASECOD',pic:''},{av:'AV61barMaqTin',fld:'vBARMAQTIN',pic:''},{av:'AV27Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'AV32ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1124P1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e1224P2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV32ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV21MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV13HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV22MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV10FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV26MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV9VolMul',fld:'vVOLMUL',pic:'ZZZ9'},{av:'AV27Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18MaqCod',fld:'vMAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A2801MaqVolRes',fld:'MAQVOLRES',pic:'ZZZZ9'},{av:'A2802MaqVolTop',fld:'MAQVOLTOP',pic:'ZZZZ9'},{av:'A6284MaqFacAbs',fld:'MAQFACABS',pic:'ZZ9.99'},{av:'A9982MaqFabsHm',fld:'MAQFABSHM',pic:'ZZ9.99'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4866RecFecAlt',fld:'RECFECALT',pic:'99/99/99 99:99'}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV18MaqCod',fld:'vMAQCOD',pic:''},{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV29LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'AV21MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV22MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV23MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV25MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV26MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV30RecmaqA',fld:'vRECMAQA',pic:'ZZZ9'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e1824P2',iparms:[{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e1524P2',iparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV63Hdraca',fld:'vHDRACA',pic:'ZZZ9'},{av:'AV64BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV65CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV66CodPar',fld:'vCODPAR',pic:''},{av:'AV32ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV21MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV13HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV22MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV10FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV56Lconti',fld:'vLCONTI',pic:'ZZZ9'},{av:'AV58BarAgrLot',fld:'vBARAGRLOT',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60BarFasecod',fld:'vBARFASECOD',pic:''},{av:'AV57DdmmAAAA',fld:'vDDMMAAAA',pic:''},{av:'AV61barMaqTin',fld:'vBARMAQTIN',pic:''},{av:'AV26MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV9VolMul',fld:'vVOLMUL',pic:'ZZZ9'},{av:'AV27Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A127BarAncCru1',fld:'BARANCCRU1',pic:'ZZ9'},{av:'A206BarPle',fld:'BARPLE',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A2836BarPle2',fld:'BARPLE2',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A4926BarFaseOrd',fld:'BARFASEORD',pic:'ZZZ9'},{av:'A4925BarFaseCod',fld:'BARFASECOD',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4964HreOrdLin',fld:'HREORDLIN',pic:'ZZZ9'},{av:'A4963HreFasCod',fld:'HREFASCOD',pic:''},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10041ArtSH',fld:'ARTSH',pic:''},{av:'A10042ArtMqFa',fld:'ARTMQFA',pic:''},{av:'AV18MaqCod',fld:'vMAQCOD',pic:''},{av:'A10044ArtFaMq',fld:'ARTFAMQ',pic:'ZZ9.99'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A5371FasQuiLin',fld:'FASQUILIN',pic:'ZZZ9'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV38BarSer',fld:'vBARSER',pic:''},{av:'A2791ArtFacAbs',fld:'ARTFACABS',pic:'ZZ9.99'},{av:'A9730ArtFabsH',fld:'ARTFABSH',pic:'ZZ9.99'},{av:'AV12Ltsrc',fld:'vLTSRC',pic:'ZZZ9',hsh:true},{av:'AV49Torient',fld:'vTORIENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'AV28ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV29LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'AV27Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'AV9VolMul',fld:'vVOLMUL',pic:'ZZZ9'},{av:'AV26MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV33Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV34BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV35BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV37CliNom',fld:'vCLINOM',pic:''},{av:'AV38BarSer',fld:'vBARSER',pic:''},{av:'AV42PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV40Baranccru1',fld:'vBARANCCRU1',pic:'ZZ9'},{av:'AV41BarPle',fld:'vBARPLE',pic:''},{av:'AV43BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV44BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV45Contextura',fld:'vCONTEXTURA',pic:''},{av:'AV46BarMat',fld:'vBARMAT',pic:''},{av:'AV47Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV50BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV52Procod',fld:'vPROCOD',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:''},{av:'AV56Lconti',fld:'vLCONTI',pic:'ZZZ9'},{av:'AV57DdmmAAAA',fld:'vDDMMAAAA',pic:''},{av:'AV58BarAgrLot',fld:'vBARAGRLOT',pic:''},{av:'AV59BarFaseOrd',fld:'vBARFASEORD',pic:'ZZZ9'},{av:'AV60BarFasecod',fld:'vBARFASECOD',pic:''},{av:'AV61barMaqTin',fld:'vBARMAQTIN',pic:''},{av:'AV32ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV67FaseAca',fld:'vFASEACA',pic:'ZZZ9'},{av:'AV68BarFasFor',fld:'vBARFASFOR',pic:'@!'},{av:'AV63Hdraca',fld:'vHDRACA',pic:'ZZZ9'},{av:'AV64BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV65CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV66CodPar',fld:'vCODPAR',pic:''}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASFOR","{handler:'validv_Barfasfor',iparms:[]");
      setEventMetadata("VALIDV_BARFASFOR",",oparms:[]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[]}");
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
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV82Hrefacabs = DecimalUtil.ZERO ;
      AV78Var1 = "" ;
      AV79Msg_tosa = "" ;
      AV91ErrMensaje1 = "" ;
      AV13HumSec = "" ;
      AV17UsurCod = "" ;
      AV14Station = "" ;
      GXKey = "" ;
      AV19MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV66CodPar = "" ;
      AV15EmprCod = "" ;
      AV34BarKgm = DecimalUtil.ZERO ;
      AV35BarMtr = DecimalUtil.ZERO ;
      AV37CliNom = "" ;
      AV38BarSer = "" ;
      AV50BarSerDsc = "" ;
      AV52Procod = "" ;
      AV53ProDsc = "" ;
      AV23MaqDsc = "" ;
      AV42PedidoCliente = "" ;
      AV41BarPle = "" ;
      AV45Contextura = "" ;
      AV43BarColNom = "" ;
      AV46BarMat = "" ;
      AV60BarFasecod = "" ;
      AV61barMaqTin = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A13878PedidoClie = "" ;
      A206BarPle = "" ;
      A135BarColNom = "" ;
      A2836BarPle2 = "" ;
      A182BarMat = "" ;
      A118BarAcaQui = "" ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A150BarFacTin = "" ;
      A6039RecAcab = "" ;
      A602MaqCod = "" ;
      A1935BarParTin = "" ;
      A6634BarRecAcb = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      A2316BarAgrLot = "" ;
      A4925BarFaseCod = "" ;
      A1945BarMaqTin = "" ;
      A4494HreBarPar = "" ;
      A9804HreAcab = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A4963HreFasCod = "" ;
      A4546HreMaqCod = "" ;
      A6033Ac_BarPar = "" ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A65ArtCod = "" ;
      A10041ArtSH = "" ;
      A10042ArtMqFa = "" ;
      A10044ArtFaMq = DecimalUtil.ZERO ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      AV32ArtFamq = DecimalUtil.ZERO ;
      AV21MaqfacAbs = DecimalUtil.ZERO ;
      AV22MaqFabsh = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A6284MaqFacAbs = DecimalUtil.ZERO ;
      A9982MaqFabsHm = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV58BarAgrLot = "" ;
      AV57DdmmAAAA = "" ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A764ProForCod = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7BarCodPar = "" ;
      AV8Prompt = "" ;
      AV95Prompt_GXI = "" ;
      sImgUrl = "" ;
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      Combo_maqcod_Caption = "" ;
      AV27Tot_kgs = DecimalUtil.ZERO ;
      AV28ArtFacabs = DecimalUtil.ZERO ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV68BarFasFor = "" ;
      AV90ErrMensaje = "" ;
      AV85hdrscreadastojson = "" ;
      AV94Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV18MaqCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16EmprNom = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      H024P2_A396EmprCod = new String[] {""} ;
      H024P2_A607MaqEst = new String[] {""} ;
      H024P2_n607MaqEst = new boolean[] {false} ;
      H024P2_A619MaqTinTip = new String[] {""} ;
      H024P2_n619MaqTinTip = new boolean[] {false} ;
      H024P2_A13734MaqCDsc = new String[] {""} ;
      H024P2_A602MaqCod = new String[] {""} ;
      H024P2_A606MaqDsc = new String[] {""} ;
      H024P2_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      A619MaqTinTip = "" ;
      A13734MaqCDsc = "" ;
      AV20Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV76hdr = "" ;
      AV75FasDsc = "" ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      AV84Hdrscreadas_SDTs = new GXBaseCollection<app.SdtHdrscreadas_SDT>(app.SdtHdrscreadas_SDT.class, "Hdrscreadas_SDT", "TexplusNET", remoteHandle);
      AV83Hdrscreadas_SDT = new app.SdtHdrscreadas_SDT(remoteHandle, context);
      AV86BarcodparSDT = "" ;
      H024P3_A602MaqCod = new String[] {""} ;
      H024P3_A396EmprCod = new String[] {""} ;
      H024P3_A606MaqDsc = new String[] {""} ;
      H024P3_n606MaqDsc = new boolean[] {false} ;
      H024P3_A2801MaqVolRes = new int[1] ;
      H024P3_n2801MaqVolRes = new boolean[] {false} ;
      H024P3_A2802MaqVolTop = new int[1] ;
      H024P3_n2802MaqVolTop = new boolean[] {false} ;
      H024P3_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P3_n6284MaqFacAbs = new boolean[] {false} ;
      H024P3_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P3_n9982MaqFabsHm = new boolean[] {false} ;
      H024P3_A625MaqVolMin = new int[1] ;
      H024P3_n625MaqVolMin = new boolean[] {false} ;
      AV31RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      H024P4_A2804RecLinMaq = new short[1] ;
      H024P4_A6039RecAcab = new String[] {""} ;
      H024P4_n6039RecAcab = new boolean[] {false} ;
      H024P4_A130BarCodPar = new String[] {""} ;
      H024P4_A132BarCodReo = new byte[1] ;
      H024P4_A129BarCod = new int[1] ;
      H024P4_A396EmprCod = new String[] {""} ;
      H024P4_A602MaqCod = new String[] {""} ;
      H024P4_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H024P4_n4866RecFecAlt = new boolean[] {false} ;
      H024P6_A130BarCodPar = new String[] {""} ;
      H024P6_A132BarCodReo = new byte[1] ;
      H024P6_A129BarCod = new int[1] ;
      H024P6_A252CliCod = new int[1] ;
      H024P6_n252CliCod = new boolean[] {false} ;
      H024P6_A279CliNom = new String[] {""} ;
      H024P6_A212BarSer = new String[] {""} ;
      H024P6_A127BarAncCru1 = new short[1] ;
      H024P6_A206BarPle = new String[] {""} ;
      H024P6_A135BarColNom = new String[] {""} ;
      H024P6_A136BarColNum = new int[1] ;
      H024P6_A2836BarPle2 = new String[] {""} ;
      H024P6_A182BarMat = new String[] {""} ;
      H024P6_A213BarSit = new byte[1] ;
      H024P6_A118BarAcaQui = new String[] {""} ;
      H024P6_A1652BarSerDsc = new String[] {""} ;
      H024P6_A864BarPes = new short[1] ;
      H024P6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P6_A143BarDisNum = new String[] {""} ;
      H024P6_A4812BarEncCli = new String[] {""} ;
      H024P6_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char12 = new String[1] ;
      AV48BarAcaqui = "" ;
      H024P7_A396EmprCod = new String[] {""} ;
      H024P7_A129BarCod = new int[1] ;
      H024P7_A132BarCodReo = new byte[1] ;
      H024P7_A130BarCodPar = new String[] {""} ;
      H024P7_A758ProCod = new String[] {""} ;
      H024P7_A759ProDsc = new String[] {""} ;
      H024P8_A396EmprCod = new String[] {""} ;
      H024P8_A129BarCod = new int[1] ;
      H024P8_A132BarCodReo = new byte[1] ;
      H024P8_A130BarCodPar = new String[] {""} ;
      H024P8_A758ProCod = new String[] {""} ;
      H024P8_A150BarFacTin = new String[] {""} ;
      H024P8_A194BarOrdLin = new short[1] ;
      H024P9_A6039RecAcab = new String[] {""} ;
      H024P9_n6039RecAcab = new boolean[] {false} ;
      H024P9_A130BarCodPar = new String[] {""} ;
      H024P9_A132BarCodReo = new byte[1] ;
      H024P9_A129BarCod = new int[1] ;
      H024P9_A396EmprCod = new String[] {""} ;
      H024P9_A602MaqCod = new String[] {""} ;
      H024P9_A2804RecLinMaq = new short[1] ;
      H024P10_A3646EstTinAny = new short[1] ;
      H024P10_A3647EstTinMes = new byte[1] ;
      H024P10_A3648EstTinDia = new byte[1] ;
      H024P10_A1929EstTinNr = new short[1] ;
      H024P10_A6634BarRecAcb = new String[] {""} ;
      H024P10_n6634BarRecAcb = new boolean[] {false} ;
      H024P10_A1935BarParTin = new String[] {""} ;
      H024P10_n1935BarParTin = new boolean[] {false} ;
      H024P10_A1934BarReoTin = new byte[1] ;
      H024P10_n1934BarReoTin = new boolean[] {false} ;
      H024P10_A1933BarCodTin = new int[1] ;
      H024P10_n1933BarCodTin = new boolean[] {false} ;
      H024P10_A396EmprCod = new String[] {""} ;
      H024P10_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      H024P10_A2316BarAgrLot = new String[] {""} ;
      H024P10_n2316BarAgrLot = new boolean[] {false} ;
      H024P10_A4926BarFaseOrd = new short[1] ;
      H024P10_n4926BarFaseOrd = new boolean[] {false} ;
      H024P10_A4925BarFaseCod = new String[] {""} ;
      H024P10_n4925BarFaseCod = new boolean[] {false} ;
      H024P10_A1945BarMaqTin = new String[] {""} ;
      H024P10_n1945BarMaqTin = new boolean[] {false} ;
      H024P11_A4545HreLinMaq = new short[1] ;
      H024P11_A4495HreNumCie = new byte[1] ;
      H024P11_A9804HreAcab = new String[] {""} ;
      H024P11_n9804HreAcab = new boolean[] {false} ;
      H024P11_A4494HreBarPar = new String[] {""} ;
      H024P11_A4493HreBarReo = new byte[1] ;
      H024P11_A4492HreBarCod = new int[1] ;
      H024P11_A396EmprCod = new String[] {""} ;
      H024P11_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      H024P11_n4529HreFecTin = new boolean[] {false} ;
      H024P11_A4964HreOrdLin = new short[1] ;
      H024P11_n4964HreOrdLin = new boolean[] {false} ;
      H024P11_A4963HreFasCod = new String[] {""} ;
      H024P11_n4963HreFasCod = new boolean[] {false} ;
      H024P11_A4546HreMaqCod = new String[] {""} ;
      H024P11_n4546HreMaqCod = new boolean[] {false} ;
      AV62Tot_mts = DecimalUtil.ZERO ;
      c6035Ac_Kilos = DecimalUtil.ZERO ;
      c6034Ac_Metros = DecimalUtil.ZERO ;
      H024P12_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P12_n6035Ac_Kilos = new boolean[] {false} ;
      H024P12_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P12_n6034Ac_Metros = new boolean[] {false} ;
      H024P13_A10042ArtMqFa = new String[] {""} ;
      H024P13_A10041ArtSH = new String[] {""} ;
      H024P13_A65ArtCod = new String[] {""} ;
      H024P13_A252CliCod = new int[1] ;
      H024P13_n252CliCod = new boolean[] {false} ;
      H024P13_A396EmprCod = new String[] {""} ;
      H024P13_A10044ArtFaMq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P13_n10044ArtFaMq = new boolean[] {false} ;
      H024P14_A65ArtCod = new String[] {""} ;
      H024P14_A252CliCod = new int[1] ;
      H024P14_n252CliCod = new boolean[] {false} ;
      H024P14_A396EmprCod = new String[] {""} ;
      H024P14_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P14_n9730ArtFabsH = new boolean[] {false} ;
      H024P14_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024P14_n2791ArtFacAbs = new boolean[] {false} ;
      H024P15_A603MaqCodBis = new String[] {""} ;
      H024P15_A194BarOrdLin = new short[1] ;
      H024P15_A758ProCod = new String[] {""} ;
      H024P15_A130BarCodPar = new String[] {""} ;
      H024P15_A132BarCodReo = new byte[1] ;
      H024P15_A129BarCod = new int[1] ;
      H024P15_A396EmprCod = new String[] {""} ;
      H024P15_A4287BarFasFor = new String[] {""} ;
      H024P15_A4905BarFasAcab = new String[] {""} ;
      H024P15_A457FasCod = new String[] {""} ;
      AV72FasCod = "" ;
      AV73Proforcod = "" ;
      H024P16_A396EmprCod = new String[] {""} ;
      H024P16_A129BarCod = new int[1] ;
      H024P16_A132BarCodReo = new byte[1] ;
      H024P16_A130BarCodPar = new String[] {""} ;
      H024P16_A758ProCod = new String[] {""} ;
      H024P16_A194BarOrdLin = new short[1] ;
      H024P16_A764ProForCod = new String[] {""} ;
      H024P16_A5371FasQuiLin = new short[1] ;
      H024P17_A396EmprCod = new String[] {""} ;
      H024P17_A6031Ac_Barcod = new int[1] ;
      H024P17_A6032Ac_BarReo = new byte[1] ;
      H024P17_A6033Ac_BarPar = new String[] {""} ;
      H024P17_A129BarCod = new int[1] ;
      H024P17_A132BarCodReo = new byte[1] ;
      H024P17_A130BarCodPar = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado00_wp__default(),
         new Object[] {
             new Object[] {
            H024P2_A396EmprCod, H024P2_A607MaqEst, H024P2_n607MaqEst, H024P2_A619MaqTinTip, H024P2_n619MaqTinTip, H024P2_A13734MaqCDsc, H024P2_A602MaqCod, H024P2_A606MaqDsc, H024P2_n606MaqDsc
            }
            , new Object[] {
            H024P3_A602MaqCod, H024P3_A396EmprCod, H024P3_A606MaqDsc, H024P3_n606MaqDsc, H024P3_A2801MaqVolRes, H024P3_n2801MaqVolRes, H024P3_A2802MaqVolTop, H024P3_n2802MaqVolTop, H024P3_A6284MaqFacAbs, H024P3_n6284MaqFacAbs,
            H024P3_A9982MaqFabsHm, H024P3_n9982MaqFabsHm, H024P3_A625MaqVolMin, H024P3_n625MaqVolMin
            }
            , new Object[] {
            H024P4_A2804RecLinMaq, H024P4_A6039RecAcab, H024P4_n6039RecAcab, H024P4_A130BarCodPar, H024P4_A132BarCodReo, H024P4_A129BarCod, H024P4_A396EmprCod, H024P4_A602MaqCod, H024P4_A4866RecFecAlt, H024P4_n4866RecFecAlt
            }
            , new Object[] {
            H024P6_A130BarCodPar, H024P6_A132BarCodReo, H024P6_A129BarCod, H024P6_A252CliCod, H024P6_n252CliCod, H024P6_A279CliNom, H024P6_A212BarSer, H024P6_A127BarAncCru1, H024P6_A206BarPle, H024P6_A135BarColNom,
            H024P6_A136BarColNum, H024P6_A2836BarPle2, H024P6_A182BarMat, H024P6_A213BarSit, H024P6_A118BarAcaQui, H024P6_A1652BarSerDsc, H024P6_A864BarPes, H024P6_A166BarKgm, H024P6_A184BarMtr, H024P6_A143BarDisNum,
            H024P6_A4812BarEncCli, H024P6_A396EmprCod
            }
            , new Object[] {
            H024P7_A396EmprCod, H024P7_A129BarCod, H024P7_A132BarCodReo, H024P7_A130BarCodPar, H024P7_A758ProCod, H024P7_A759ProDsc
            }
            , new Object[] {
            H024P8_A396EmprCod, H024P8_A129BarCod, H024P8_A132BarCodReo, H024P8_A130BarCodPar, H024P8_A758ProCod, H024P8_A150BarFacTin, H024P8_A194BarOrdLin
            }
            , new Object[] {
            H024P9_A6039RecAcab, H024P9_n6039RecAcab, H024P9_A130BarCodPar, H024P9_A132BarCodReo, H024P9_A129BarCod, H024P9_A396EmprCod, H024P9_A602MaqCod, H024P9_A2804RecLinMaq
            }
            , new Object[] {
            H024P10_A3646EstTinAny, H024P10_A3647EstTinMes, H024P10_A3648EstTinDia, H024P10_A1929EstTinNr, H024P10_A6634BarRecAcb, H024P10_n6634BarRecAcb, H024P10_A1935BarParTin, H024P10_n1935BarParTin, H024P10_A1934BarReoTin, H024P10_n1934BarReoTin,
            H024P10_A1933BarCodTin, H024P10_n1933BarCodTin, H024P10_A396EmprCod, H024P10_A13759EstFecCier, H024P10_A2316BarAgrLot, H024P10_n2316BarAgrLot, H024P10_A4926BarFaseOrd, H024P10_n4926BarFaseOrd, H024P10_A4925BarFaseCod, H024P10_n4925BarFaseCod,
            H024P10_A1945BarMaqTin, H024P10_n1945BarMaqTin
            }
            , new Object[] {
            H024P11_A4545HreLinMaq, H024P11_A4495HreNumCie, H024P11_A9804HreAcab, H024P11_n9804HreAcab, H024P11_A4494HreBarPar, H024P11_A4493HreBarReo, H024P11_A4492HreBarCod, H024P11_A396EmprCod, H024P11_A4529HreFecTin, H024P11_n4529HreFecTin,
            H024P11_A4964HreOrdLin, H024P11_n4964HreOrdLin, H024P11_A4963HreFasCod, H024P11_n4963HreFasCod, H024P11_A4546HreMaqCod, H024P11_n4546HreMaqCod
            }
            , new Object[] {
            H024P12_A6035Ac_Kilos, H024P12_n6035Ac_Kilos, H024P12_A6034Ac_Metros, H024P12_n6034Ac_Metros
            }
            , new Object[] {
            H024P13_A10042ArtMqFa, H024P13_A10041ArtSH, H024P13_A65ArtCod, H024P13_A252CliCod, H024P13_A396EmprCod, H024P13_A10044ArtFaMq, H024P13_n10044ArtFaMq
            }
            , new Object[] {
            H024P14_A65ArtCod, H024P14_A252CliCod, H024P14_A396EmprCod, H024P14_A9730ArtFabsH, H024P14_n9730ArtFabsH, H024P14_A2791ArtFacAbs, H024P14_n2791ArtFacAbs
            }
            , new Object[] {
            H024P15_A603MaqCodBis, H024P15_A194BarOrdLin, H024P15_A758ProCod, H024P15_A130BarCodPar, H024P15_A132BarCodReo, H024P15_A129BarCod, H024P15_A396EmprCod, H024P15_A4287BarFasFor, H024P15_A4905BarFasAcab, H024P15_A457FasCod
            }
            , new Object[] {
            H024P16_A396EmprCod, H024P16_A129BarCod, H024P16_A132BarCodReo, H024P16_A130BarCodPar, H024P16_A758ProCod, H024P16_A194BarOrdLin, H024P16_A764ProForCod, H024P16_A5371FasQuiLin
            }
            , new Object[] {
            H024P17_A396EmprCod, H024P17_A6031Ac_Barcod, H024P17_A6032Ac_BarReo, H024P17_A6033Ac_BarPar, H024P17_A129BarCod, H024P17_A132BarCodReo, H024P17_A130BarCodPar
            }
         }
      );
      AV94Pgmname = "RecetasDeAcabados.RecetadeAcabado00_WP" ;
      /* GeneXus formulas. */
      AV94Pgmname = "RecetasDeAcabados.RecetadeAcabado00_WP" ;
      Gx_err = (short)(0) ;
      edtavTot_kgs_Enabled = 0 ;
      edtavArtfacabs_Enabled = 0 ;
      edtavMaqvolres_Enabled = 0 ;
      edtavLtsini_Enabled = 0 ;
      edtavHdraca_Enabled = 0 ;
      edtavFaseaca_Enabled = 0 ;
      edtavBarfasfor_Enabled = 0 ;
      edtavRecmaqa_Enabled = 0 ;
      edtavBarcad_Enabled = 0 ;
      edtavBarsit_Enabled = 0 ;
      edtavErrmensaje_Enabled = 0 ;
      edtavHdrscreadastojson_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV65CodReo_p ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A1934BarReoTin ;
   private byte A4493HreBarReo ;
   private byte A6032Ac_BarReo ;
   private byte AV6BarCodReo ;
   private byte AV47Barsit ;
   private byte nDonePA ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV87BarcodreoSDT ;
   private byte AV100GXLvl261 ;
   private byte A4495HreNumCie ;
   private byte nGXWrapped ;
   private short nRcdExists_17 ;
   private short nIsMod_17 ;
   private short nRcdExists_15 ;
   private short nIsMod_15 ;
   private short nRcdExists_16 ;
   private short nIsMod_16 ;
   private short nRcdExists_14 ;
   private short nIsMod_14 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV77Sit9 ;
   private short AV12Ltsrc ;
   private short AV49Torient ;
   private short AV10FabsMq ;
   private short AV40Baranccru1 ;
   private short AV59BarFaseOrd ;
   private short A127BarAncCru1 ;
   private short A864BarPes ;
   private short A194BarOrdLin ;
   private short A2804RecLinMaq ;
   private short A4926BarFaseOrd ;
   private short A4964HreOrdLin ;
   private short AV9VolMul ;
   private short AV56Lconti ;
   private short A5371FasQuiLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV63Hdraca ;
   private short AV67FaseAca ;
   private short AV30RecmaqA ;
   private short AV33Barcad ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV11LtsMn ;
   private short AV89ReclinmaqSDT ;
   private short AV51BarPes ;
   private short AV54Tinte ;
   private short AV55recmaq ;
   private short AV69Fasqui ;
   private short AV70BarOrdLin ;
   private short AV71fasquilin ;
   private short AV74Num_p ;
   private int AV81RecLtssr ;
   private int AV80LtsSob ;
   private int AV64BarCod_p ;
   private int AV36CliCod ;
   private int AV25MaqVolTop ;
   private int AV44BarColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1933BarCodTin ;
   private int A4492HreBarCod ;
   private int A6031Ac_Barcod ;
   private int A2801MaqVolRes ;
   private int A2802MaqVolTop ;
   private int A625MaqVolMin ;
   private int AV5BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavTot_kgs_Enabled ;
   private int edtavArtfacabs_Enabled ;
   private int AV26MaqVolRes ;
   private int edtavMaqvolres_Enabled ;
   private int AV29LtsIni ;
   private int edtavLtsini_Enabled ;
   private int edtavHdraca_Enabled ;
   private int edtavFaseaca_Enabled ;
   private int edtavBarfasfor_Enabled ;
   private int edtavRecmaqa_Enabled ;
   private int edtavBarcad_Enabled ;
   private int edtavBarsit_Enabled ;
   private int edtavErrmensaje_Enabled ;
   private int edtavHdrscreadastojson_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcod_Visible ;
   private int GXt_int5 ;
   private int GXv_int11[] ;
   private int GXv_int6[] ;
   private int AV98GXV1 ;
   private int AV88BarcodSDT ;
   private int AV99GXV2 ;
   private int AV24MaqVolMin ;
   private int idxLst ;
   private java.math.BigDecimal AV82Hrefacabs ;
   private java.math.BigDecimal AV34BarKgm ;
   private java.math.BigDecimal AV35BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A10044ArtFaMq ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9730ArtFabsH ;
   private java.math.BigDecimal AV32ArtFamq ;
   private java.math.BigDecimal AV21MaqfacAbs ;
   private java.math.BigDecimal AV22MaqFabsh ;
   private java.math.BigDecimal A6284MaqFacAbs ;
   private java.math.BigDecimal A9982MaqFabsHm ;
   private java.math.BigDecimal AV27Tot_kgs ;
   private java.math.BigDecimal AV28ArtFacabs ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV62Tot_mts ;
   private java.math.BigDecimal c6035Ac_Kilos ;
   private java.math.BigDecimal c6034Ac_Metros ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV78Var1 ;
   private String AV79Msg_tosa ;
   private String AV13HumSec ;
   private String AV17UsurCod ;
   private String AV14Station ;
   private String GXKey ;
   private String AV66CodPar ;
   private String AV15EmprCod ;
   private String AV37CliNom ;
   private String AV38BarSer ;
   private String AV50BarSerDsc ;
   private String AV52Procod ;
   private String AV53ProDsc ;
   private String AV23MaqDsc ;
   private String AV42PedidoCliente ;
   private String AV41BarPle ;
   private String AV45Contextura ;
   private String AV43BarColNom ;
   private String AV46BarMat ;
   private String AV60BarFasecod ;
   private String AV61barMaqTin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A13878PedidoClie ;
   private String A206BarPle ;
   private String A135BarColNom ;
   private String A2836BarPle2 ;
   private String A182BarMat ;
   private String A118BarAcaQui ;
   private String A1652BarSerDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A150BarFacTin ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String A1935BarParTin ;
   private String A6634BarRecAcb ;
   private String A2316BarAgrLot ;
   private String A4925BarFaseCod ;
   private String A1945BarMaqTin ;
   private String A4494HreBarPar ;
   private String A9804HreAcab ;
   private String A4963HreFasCod ;
   private String A4546HreMaqCod ;
   private String A6033Ac_BarPar ;
   private String A65ArtCod ;
   private String A10041ArtSH ;
   private String A10042ArtMqFa ;
   private String A606MaqDsc ;
   private String AV58BarAgrLot ;
   private String AV57DdmmAAAA ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A764ProForCod ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV7BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavTot_kgs_Internalname ;
   private String edtavTot_kgs_Jsonclick ;
   private String edtavArtfacabs_Internalname ;
   private String edtavArtfacabs_Jsonclick ;
   private String edtavMaqvolres_Internalname ;
   private String edtavMaqvolres_Jsonclick ;
   private String edtavLtsini_Internalname ;
   private String edtavLtsini_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavHdraca_Internalname ;
   private String edtavHdraca_Jsonclick ;
   private String edtavFaseaca_Internalname ;
   private String edtavFaseaca_Jsonclick ;
   private String edtavBarfasfor_Internalname ;
   private String AV68BarFasFor ;
   private String edtavBarfasfor_Jsonclick ;
   private String edtavRecmaqa_Internalname ;
   private String edtavRecmaqa_Jsonclick ;
   private String edtavBarcad_Internalname ;
   private String edtavBarcad_Jsonclick ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String edtavErrmensaje_Internalname ;
   private String edtavHdrscreadastojson_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV94Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV18MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV16EmprNom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A607MaqEst ;
   private String A619MaqTinTip ;
   private String AV76hdr ;
   private String AV75FasDsc ;
   private String AV86BarcodparSDT ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String AV48BarAcaqui ;
   private String AV72FasCod ;
   private String AV73Proforcod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV31RecFecAlt ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date A4529HreFecTin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_maqcod_Emptyitem ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV8Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n607MaqEst ;
   private boolean n619MaqTinTip ;
   private boolean n606MaqDsc ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n6284MaqFacAbs ;
   private boolean n9982MaqFabsHm ;
   private boolean n625MaqVolMin ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean n252CliCod ;
   private boolean n6634BarRecAcb ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n2316BarAgrLot ;
   private boolean n4926BarFaseOrd ;
   private boolean n4925BarFaseCod ;
   private boolean n1945BarMaqTin ;
   private boolean n9804HreAcab ;
   private boolean n4529HreFecTin ;
   private boolean n4964HreOrdLin ;
   private boolean n4963HreFasCod ;
   private boolean n4546HreMaqCod ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private boolean n10044ArtFaMq ;
   private boolean n9730ArtFabsH ;
   private boolean n2791ArtFacAbs ;
   private String AV91ErrMensaje1 ;
   private String AV95Prompt_GXI ;
   private String AV90ErrMensaje ;
   private String AV85hdrscreadastojson ;
   private String A13734MaqCDsc ;
   private String AV8Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private IDataStoreProvider pr_default ;
   private String[] H024P2_A396EmprCod ;
   private String[] H024P2_A607MaqEst ;
   private boolean[] H024P2_n607MaqEst ;
   private String[] H024P2_A619MaqTinTip ;
   private boolean[] H024P2_n619MaqTinTip ;
   private String[] H024P2_A13734MaqCDsc ;
   private String[] H024P2_A602MaqCod ;
   private String[] H024P2_A606MaqDsc ;
   private boolean[] H024P2_n606MaqDsc ;
   private String[] H024P3_A602MaqCod ;
   private String[] H024P3_A396EmprCod ;
   private String[] H024P3_A606MaqDsc ;
   private boolean[] H024P3_n606MaqDsc ;
   private int[] H024P3_A2801MaqVolRes ;
   private boolean[] H024P3_n2801MaqVolRes ;
   private int[] H024P3_A2802MaqVolTop ;
   private boolean[] H024P3_n2802MaqVolTop ;
   private java.math.BigDecimal[] H024P3_A6284MaqFacAbs ;
   private boolean[] H024P3_n6284MaqFacAbs ;
   private java.math.BigDecimal[] H024P3_A9982MaqFabsHm ;
   private boolean[] H024P3_n9982MaqFabsHm ;
   private int[] H024P3_A625MaqVolMin ;
   private boolean[] H024P3_n625MaqVolMin ;
   private short[] H024P4_A2804RecLinMaq ;
   private String[] H024P4_A6039RecAcab ;
   private boolean[] H024P4_n6039RecAcab ;
   private String[] H024P4_A130BarCodPar ;
   private byte[] H024P4_A132BarCodReo ;
   private int[] H024P4_A129BarCod ;
   private String[] H024P4_A396EmprCod ;
   private String[] H024P4_A602MaqCod ;
   private java.util.Date[] H024P4_A4866RecFecAlt ;
   private boolean[] H024P4_n4866RecFecAlt ;
   private String[] H024P6_A130BarCodPar ;
   private byte[] H024P6_A132BarCodReo ;
   private int[] H024P6_A129BarCod ;
   private int[] H024P6_A252CliCod ;
   private boolean[] H024P6_n252CliCod ;
   private String[] H024P6_A279CliNom ;
   private String[] H024P6_A212BarSer ;
   private short[] H024P6_A127BarAncCru1 ;
   private String[] H024P6_A206BarPle ;
   private String[] H024P6_A135BarColNom ;
   private int[] H024P6_A136BarColNum ;
   private String[] H024P6_A2836BarPle2 ;
   private String[] H024P6_A182BarMat ;
   private byte[] H024P6_A213BarSit ;
   private String[] H024P6_A118BarAcaQui ;
   private String[] H024P6_A1652BarSerDsc ;
   private short[] H024P6_A864BarPes ;
   private java.math.BigDecimal[] H024P6_A166BarKgm ;
   private java.math.BigDecimal[] H024P6_A184BarMtr ;
   private String[] H024P6_A143BarDisNum ;
   private String[] H024P6_A4812BarEncCli ;
   private String[] H024P6_A396EmprCod ;
   private String[] H024P7_A396EmprCod ;
   private int[] H024P7_A129BarCod ;
   private byte[] H024P7_A132BarCodReo ;
   private String[] H024P7_A130BarCodPar ;
   private String[] H024P7_A758ProCod ;
   private String[] H024P7_A759ProDsc ;
   private String[] H024P8_A396EmprCod ;
   private int[] H024P8_A129BarCod ;
   private byte[] H024P8_A132BarCodReo ;
   private String[] H024P8_A130BarCodPar ;
   private String[] H024P8_A758ProCod ;
   private String[] H024P8_A150BarFacTin ;
   private short[] H024P8_A194BarOrdLin ;
   private String[] H024P9_A6039RecAcab ;
   private boolean[] H024P9_n6039RecAcab ;
   private String[] H024P9_A130BarCodPar ;
   private byte[] H024P9_A132BarCodReo ;
   private int[] H024P9_A129BarCod ;
   private String[] H024P9_A396EmprCod ;
   private String[] H024P9_A602MaqCod ;
   private short[] H024P9_A2804RecLinMaq ;
   private short[] H024P10_A3646EstTinAny ;
   private byte[] H024P10_A3647EstTinMes ;
   private byte[] H024P10_A3648EstTinDia ;
   private short[] H024P10_A1929EstTinNr ;
   private String[] H024P10_A6634BarRecAcb ;
   private boolean[] H024P10_n6634BarRecAcb ;
   private String[] H024P10_A1935BarParTin ;
   private boolean[] H024P10_n1935BarParTin ;
   private byte[] H024P10_A1934BarReoTin ;
   private boolean[] H024P10_n1934BarReoTin ;
   private int[] H024P10_A1933BarCodTin ;
   private boolean[] H024P10_n1933BarCodTin ;
   private String[] H024P10_A396EmprCod ;
   private java.util.Date[] H024P10_A13759EstFecCier ;
   private String[] H024P10_A2316BarAgrLot ;
   private boolean[] H024P10_n2316BarAgrLot ;
   private short[] H024P10_A4926BarFaseOrd ;
   private boolean[] H024P10_n4926BarFaseOrd ;
   private String[] H024P10_A4925BarFaseCod ;
   private boolean[] H024P10_n4925BarFaseCod ;
   private String[] H024P10_A1945BarMaqTin ;
   private boolean[] H024P10_n1945BarMaqTin ;
   private short[] H024P11_A4545HreLinMaq ;
   private byte[] H024P11_A4495HreNumCie ;
   private String[] H024P11_A9804HreAcab ;
   private boolean[] H024P11_n9804HreAcab ;
   private String[] H024P11_A4494HreBarPar ;
   private byte[] H024P11_A4493HreBarReo ;
   private int[] H024P11_A4492HreBarCod ;
   private String[] H024P11_A396EmprCod ;
   private java.util.Date[] H024P11_A4529HreFecTin ;
   private boolean[] H024P11_n4529HreFecTin ;
   private short[] H024P11_A4964HreOrdLin ;
   private boolean[] H024P11_n4964HreOrdLin ;
   private String[] H024P11_A4963HreFasCod ;
   private boolean[] H024P11_n4963HreFasCod ;
   private String[] H024P11_A4546HreMaqCod ;
   private boolean[] H024P11_n4546HreMaqCod ;
   private java.math.BigDecimal[] H024P12_A6035Ac_Kilos ;
   private boolean[] H024P12_n6035Ac_Kilos ;
   private java.math.BigDecimal[] H024P12_A6034Ac_Metros ;
   private boolean[] H024P12_n6034Ac_Metros ;
   private String[] H024P13_A10042ArtMqFa ;
   private String[] H024P13_A10041ArtSH ;
   private String[] H024P13_A65ArtCod ;
   private int[] H024P13_A252CliCod ;
   private boolean[] H024P13_n252CliCod ;
   private String[] H024P13_A396EmprCod ;
   private java.math.BigDecimal[] H024P13_A10044ArtFaMq ;
   private boolean[] H024P13_n10044ArtFaMq ;
   private String[] H024P14_A65ArtCod ;
   private int[] H024P14_A252CliCod ;
   private boolean[] H024P14_n252CliCod ;
   private String[] H024P14_A396EmprCod ;
   private java.math.BigDecimal[] H024P14_A9730ArtFabsH ;
   private boolean[] H024P14_n9730ArtFabsH ;
   private java.math.BigDecimal[] H024P14_A2791ArtFacAbs ;
   private boolean[] H024P14_n2791ArtFacAbs ;
   private String[] H024P15_A603MaqCodBis ;
   private short[] H024P15_A194BarOrdLin ;
   private String[] H024P15_A758ProCod ;
   private String[] H024P15_A130BarCodPar ;
   private byte[] H024P15_A132BarCodReo ;
   private int[] H024P15_A129BarCod ;
   private String[] H024P15_A396EmprCod ;
   private String[] H024P15_A4287BarFasFor ;
   private String[] H024P15_A4905BarFasAcab ;
   private String[] H024P15_A457FasCod ;
   private String[] H024P16_A396EmprCod ;
   private int[] H024P16_A129BarCod ;
   private byte[] H024P16_A132BarCodReo ;
   private String[] H024P16_A130BarCodPar ;
   private String[] H024P16_A758ProCod ;
   private short[] H024P16_A194BarOrdLin ;
   private String[] H024P16_A764ProForCod ;
   private short[] H024P16_A5371FasQuiLin ;
   private String[] H024P17_A396EmprCod ;
   private int[] H024P17_A6031Ac_Barcod ;
   private byte[] H024P17_A6032Ac_BarReo ;
   private String[] H024P17_A6033Ac_BarPar ;
   private int[] H024P17_A129BarCod ;
   private byte[] H024P17_A132BarCodReo ;
   private String[] H024P17_A130BarCodPar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19MaqCod_Data ;
   private GXBaseCollection<app.SdtHdrscreadas_SDT> AV84Hdrscreadas_SDTs ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV20Combo_DataItem ;
   private app.SdtHdrscreadas_SDT AV83Hdrscreadas_SDT ;
}

final  class recetadeacabado00_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H024P2", "SELECT EmprCod, MaqEst, MaqTinTip, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (MaqEst = 'A') AND (MaqTinTip = 'CO') ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P3", "SELECT MaqCod, EmprCod, MaqDsc, MaqVolRes, MaqVolTop, MaqFacAbs, MaqFabsHm, MaqVolMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H024P4", "SELECT RecLinMaq, RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, MaqCod, RecFecAlt FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P6", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarAncCru1, T1.BarPle, T1.BarColNom, T1.BarColNum, T1.BarPle2, T1.BarMat, T1.BarSit, T1.BarAcaQui, T1.BarSerDsc, T1.BarPes, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H024P7", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarFacTin, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?) AND (BarFacTin = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P9", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, MaqCod, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab <> 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P10", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarRecAcb, BarParTin, BarReoTin, BarCodTin, EmprCod, EstFecCier, BarAgrLot, BarFaseOrd, BarFaseCod, BarMaqTin FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarRecAcb = 'S') ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P11", "SELECT T1.HreLinMaq, T1.HreNumCie, T1.HreAcab, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.HreFecTin, T1.HreOrdLin, T1.HreFasCod, T1.HreMaqCod FROM (TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) WHERE (T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ?) AND (T1.HreAcab = 'S') ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P12", "SELECT SUM(Ac_Kilos), SUM(Ac_Metros) FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P13", "SELECT ArtMqFa, ArtSH, ArtCod, CliCod, EmprCod, ArtFaMq FROM TXPCLATF1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtSH = ? and ArtMqFa = ? ORDER BY EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H024P14", "SELECT ArtCod, CliCod, EmprCod, ArtFabsH, ArtFacAbs FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H024P15", "SELECT MaqCodBis, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasFor, BarFasAcab, FasCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasAcab = 'S') AND (BarFasFor = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024P17", "SELECT EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((String[]) buf[21])[0] = rslt.getString(21, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

