package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado00_wp_impl extends GXDataArea
{
   public recetasdeacabado00_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdeacabado00_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado00_wp_impl.class ));
   }

   public recetasdeacabado00_wp_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod1HG0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod1HG0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            hV12MaqCod = httpContext.GetPar( "hV12MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcod1HG2( hV12MaqCod) ;
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
      pa1HG2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1HG2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabado00_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11HumSec, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46FabsMq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54Sit9), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Ltsrc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Torient), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vARTFAMQ", GXutil.ltrim( localUtil.ntoc( AV13ArtFamq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUMSEC", GXutil.rtrim( AV11HumSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11HumSec, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFABSMQ", GXutil.ltrim( localUtil.ntoc( AV46FabsMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46FabsMq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCAD", GXutil.ltrim( localUtil.ntoc( AV38Barcad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC", GXutil.rtrim( AV50MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV29Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIT9", GXutil.ltrim( localUtil.ntoc( AV54Sit9, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54Sit9), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASEACA", GXutil.ltrim( localUtil.ntoc( AV55FaseAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASFOR", GXutil.rtrim( AV56BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRACA", GXutil.ltrim( localUtil.ntoc( AV64Hdraca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_P", GXutil.ltrim( localUtil.ntoc( AV65BarCod_p, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODREO_P", GXutil.ltrim( localUtil.ntoc( AV66CodReo_p, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODPAR", GXutil.rtrim( AV67CodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV16BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV17BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV42Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE1", AV79ErrMensaje1);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
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
      app.GxWebStd.gx_hidden_field( httpContext, "ESTTINDIA", GXutil.ltrim( localUtil.ntoc( A3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTTINMES", GXutil.ltrim( localUtil.ntoc( A3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTTINANY", GXutil.ltrim( localUtil.ntoc( A3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFAMQ", GXutil.ltrim( localUtil.ntoc( A10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLRES", GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLTOP", GXutil.ltrim( localUtil.ntoc( A2802MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFACABS", GXutil.ltrim( localUtil.ntoc( A6284MaqFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFABSHM", GXutil.ltrim( localUtil.ntoc( A9982MaqFabsHm, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMIN", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUILIN", GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV9CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV10BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFACABS", GXutil.ltrim( localUtil.ntoc( A2791ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFABSH", GXutil.ltrim( localUtil.ntoc( A9730ArtFabsH, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSRC", GXutil.ltrim( localUtil.ntoc( AV40Ltsrc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Ltsrc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTORIENT", GXutil.ltrim( localUtil.ntoc( AV41Torient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Torient), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECMAQA", GXutil.ltrim( localUtil.ntoc( AV68RecmaqA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV72ErrMensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFECALT", localUtil.ttoc( AV69RecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV70VolMul, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFECALT", localUtil.ttoc( A4866RecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRSCREADASTOJSON", AV80hdrscreadastojson);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV49UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV47Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV12MaqCod));
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
         we1HG2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1HG2( ) ;
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
      return formatLink("app.recetasdeacabado00_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeAcabado00_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de Acabado", "") ;
   }

   public void wb1HG0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV7BarCodPar), GXutil.rtrim( localUtil.format( AV7BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado00_WP.htm");
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
         AV88Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV88Prompt)==0)&&(GXutil.strcmp("", AV91Prompt_GXI)==0))||!(GXutil.strcmp("", AV88Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV88Prompt)==0) ? AV91Prompt_GXI : httpContext.getResourceRelative(AV88Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV88Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetasdeAcabado00_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV12MaqCod, GXutil.rtrim( localUtil.format( hV12MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvoltop_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvoltop_Internalname, httpContext.getMessage( "Volumen Tope Baño", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvoltop_Internalname, GXutil.ltrim( localUtil.ntoc( AV53MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvoltop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV53MaqVolTop), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV53MaqVolTop), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvoltop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvoltop_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolres_Internalname, httpContext.getMessage( "Volumen Residual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolres_Internalname, GXutil.ltrim( localUtil.ntoc( AV52MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolres_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV52MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolres_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_kgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_kgs_Internalname, httpContext.getMessage( "Total Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Tot_kgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_kgs_Enabled!=0) ? localUtil.format( AV14Tot_kgs, "ZZZZZZ9.99") : localUtil.format( AV14Tot_kgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_kgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_kgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtfacabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtfacabs_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtfacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV39ArtFacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavArtfacabs_Enabled!=0) ? localUtil.format( AV39ArtFacabs, "ZZ9.99") : localUtil.format( AV39ArtFacabs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtfacabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtfacabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLtsini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLtsini_Internalname, httpContext.getMessage( "Volumen Calculado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLtsini_Internalname, GXutil.ltrim( localUtil.ntoc( AV71LtsIni, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLtsini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71LtsIni), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV71LtsIni), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLtsini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLtsini_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, lblTextblock1_Caption, "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-size:"+GXutil.str( lblTextblock1_Fontsize, 3, 0)+"pt;", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_RecetasdeAcabado00_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqfacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV44MaqfacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV44MaqfacAbs, "ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqfacabs_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqfacabs_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqfabsh_Internalname, GXutil.ltrim( localUtil.ntoc( AV45MaqFabsh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV45MaqFabsh, "ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqfabsh_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqfabsh_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1HG2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de Acabado", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1HG0( ) ;
   }

   public void ws1HG2( )
   {
      start1HG2( ) ;
      evt1HG2( ) ;
   }

   public void evt1HG2( )
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
                           e111HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e121HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e131HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e171HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e181HG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191HG2 ();
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

   public void we1HG2( )
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

   public void pa1HG2( )
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

   public void gxsgvvmaqcod1HG0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_data1HG0( A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcod_data1HG0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01HG2 */
      pr_default.execute(0, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01HG2_A13734MaqCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13734MaqCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01HG2_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H01HG2_A13734MaqCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvmaqcod1HG2( String A13734MaqCDsc )
   {
      /* Using cursor H01HG3 */
      pr_default.execute(1, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.strcmp(H01HG3_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H01HG3_A13734MaqCDsc[0] ;
            A396EmprCod = H01HG3_A396EmprCod[0] ;
            A602MaqCod = H01HG3_A602MaqCod[0] ;
         }
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      pr_default.close(1);
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
      rf1HG2( ) ;
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
      edtavMaqvoltop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvoltop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvoltop_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavArtfacabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtfacabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtfacabs_Enabled), 5, 0), true);
      edtavLtsini_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLtsini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLtsini_Enabled), 5, 0), true);
   }

   public void rf1HG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e171HG2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e181HG2 ();
         wb1HG0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1HG2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vHUMSEC", GXutil.rtrim( AV11HumSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11HumSec, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFABSMQ", GXutil.ltrim( localUtil.ntoc( AV46FabsMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46FabsMq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIT9", GXutil.ltrim( localUtil.ntoc( AV54Sit9, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIT9", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54Sit9), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSRC", GXutil.ltrim( localUtil.ntoc( AV40Ltsrc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Ltsrc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTORIENT", GXutil.ltrim( localUtil.ntoc( AV41Torient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Torient), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV70VolMul, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV49UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV47Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Station, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavMaqvoltop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvoltop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvoltop_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavArtfacabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtfacabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtfacabs_Enabled), 5, 0), true);
      edtavLtsini_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLtsini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLtsini_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1HG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111HG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         AV88Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         hV12MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV12MaqCod)==0) )
         {
            AV12MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCod", AV12MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV12MaqCod ;
            /* Using cursor H01HG4 */
            pr_default.execute(2, new Object[] {A13734MaqCDsc});
            AV12MaqCod = H01HG4_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCod", hV12MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvoltop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvoltop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLTOP");
            GX_FocusControl = edtavMaqvoltop_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53MaqVolTop = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqVolTop), 5, 0));
         }
         else
         {
            AV53MaqVolTop = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvoltop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqVolTop), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLRES");
            GX_FocusControl = edtavMaqvolres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52MaqVolRes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
         }
         else
         {
            AV52MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOT_KGS");
            GX_FocusControl = edtavTot_kgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Tot_kgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
         }
         else
         {
            AV14Tot_kgs = localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavArtfacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavArtfacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vARTFACABS");
            GX_FocusControl = edtavArtfacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39ArtFacabs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
         else
         {
            AV39ArtFacabs = localUtil.ctond( httpContext.cgiGet( edtavArtfacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLtsini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLtsini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLTSINI");
            GX_FocusControl = edtavLtsini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71LtsIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71LtsIni), 5, 0));
         }
         else
         {
            AV71LtsIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavLtsini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71LtsIni), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMaqfacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMaqfacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQFACABS");
            GX_FocusControl = edtavMaqfacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44MaqfacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44MaqfacAbs", GXutil.ltrimstr( AV44MaqfacAbs, 6, 2));
         }
         else
         {
            AV44MaqfacAbs = localUtil.ctond( httpContext.cgiGet( edtavMaqfacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44MaqfacAbs", GXutil.ltrimstr( AV44MaqfacAbs, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMaqfabsh_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMaqfabsh_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQFABSH");
            GX_FocusControl = edtavMaqfabsh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45MaqFabsh = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45MaqFabsh", GXutil.ltrimstr( AV45MaqFabsh, 6, 2));
         }
         else
         {
            AV45MaqFabsh = localUtil.ctond( httpContext.cgiGet( edtavMaqfabsh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45MaqFabsh", GXutil.ltrimstr( AV45MaqFabsh, 6, 2));
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
      e111HG2 ();
      if (returnInSub) return;
   }

   public void e111HG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV47Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdeacabado00_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Station", AV47Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Station, ""))));
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV48EmprNom ;
      GXv_char4[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdeacabado00_wp_impl.this.AV8EmprCod = GXv_char2[0] ;
      recetasdeacabado00_wp_impl.this.AV48EmprNom = GXv_char3[0] ;
      recetasdeacabado00_wp_impl.this.AV49UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      GXt_int5 = AV70VolMul ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "VOLMUL", ""), GXv_int6) ;
      recetasdeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV70VolMul = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      GXt_int7 = (byte)(AV46FabsMq) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "FABSMQ", ""), GXv_int8) ;
      recetasdeacabado00_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV46FabsMq = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46FabsMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46FabsMq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFABSMQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46FabsMq), "ZZZ9")));
      GXt_int5 = AV73LtsMn ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "LTSMNA", ""), GXv_int6) ;
      recetasdeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73LtsMn = (short)(GXt_int5) ;
      GXt_int7 = (byte)(AV40Ltsrc) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "LTSREC", ""), GXv_int8) ;
      recetasdeacabado00_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV40Ltsrc = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Ltsrc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Ltsrc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLTSRC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Ltsrc), "ZZZ9")));
      AV41Torient = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Torient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Torient), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTORIENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Torient), "ZZZ9")));
      AV11HumSec = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HumSec", AV11HumSec);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHUMSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11HumSec, ""))));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV88Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV88Prompt)==0) ? AV91Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV88Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV88Prompt), true);
      AV91Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV88Prompt)==0) ? AV91Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV88Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV88Prompt), true);
      GXt_char1 = AV47Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdeacabado00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV47Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Station", AV47Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Station, ""))));
      GXv_char4[0] = AV8EmprCod ;
      GXv_char3[0] = AV48EmprNom ;
      GXv_char2[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetasdeacabado00_wp_impl.this.AV8EmprCod = GXv_char4[0] ;
      recetasdeacabado00_wp_impl.this.AV48EmprNom = GXv_char3[0] ;
      recetasdeacabado00_wp_impl.this.AV49UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49UsurCod, "@!"))));
      edtavMaqfacabs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqfacabs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqfacabs_Visible), 5, 0), true);
      edtavMaqfabsh_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqfabsh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqfabsh_Visible), 5, 0), true);
   }

   public void e121HG2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'BARCAD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'MAQUIN' */
      S122 ();
      if (returnInSub) return;
      if ( AV13ArtFamq.doubleValue() > 0 )
      {
         AV39ArtFacabs = AV13ArtFamq ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) )
         {
            if ( ( AV44MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, "S") == 0 ) )
            {
               AV39ArtFacabs = AV44MaqfacAbs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
            }
            if ( ( AV45MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, "H") == 0 ) )
            {
               AV39ArtFacabs = AV45MaqFabsh ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
            }
         }
      }
      if ( AV46FabsMq == 1 )
      {
         AV39ArtFacabs = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         if ( ( AV44MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, "S") == 0 ) )
         {
            AV39ArtFacabs = AV44MaqfacAbs ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
         if ( ( AV45MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, "H") == 0 ) )
         {
            AV39ArtFacabs = AV45MaqFabsh ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
      }
      if ( (0==AV38Barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta Hdr no existe ¡¡¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.strcmp(AV50MaqDsc, httpContext.getMessage( "Inexistente", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error en Maquina ¡¡¡", ""));
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV11HumSec, "H") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion NO hay Fact Abs Humedo ¡¡¡", ""));
               GX_FocusControl = edtavMaqcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( GXutil.strcmp(AV11HumSec, "S") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion NO hay Fact Abs Seco ¡¡¡", ""));
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( ( AV29Barsit >= 9 ) && (0==AV54Sit9) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta cerrada esta HDR", ""));
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     AV62F_ok = httpContext.getMessage( "S", "") ;
                     /* Execute user subroutine: 'BARFAS' */
                     S132 ();
                     if (returnInSub) return;
                     if ( (0==AV55FaseAca) )
                     {
                        Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr no tiene ninguna Fase como Acabado ¡¡¡", "") + GXutil.newLine( ) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                        AV62F_ok = httpContext.getMessage( "N", "") ;
                     }
                     if ( ( AV55FaseAca == 1 ) && ( GXutil.strcmp(AV56BarFasFor, "N") == 0 ) )
                     {
                        Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr tiene fase de Acabado pero no tiene Formula ¡¡¡", "") + GXutil.newLine( ) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                        AV62F_ok = httpContext.getMessage( "N", "") ;
                     }
                     /* Execute user subroutine: 'HDRACA' */
                     S142 ();
                     if (returnInSub) return;
                     if ( AV64Hdraca == 1 )
                     {
                        Gx_msg = httpContext.getMessage( "Atencion. Esta Hdr esta agrupada con la Hdr ", "") + GXutil.str( AV65BarCod_p, 8, 0) + "-" + GXutil.str( AV66CodReo_p, 1, 0) + AV67CodPar + GXutil.newLine( ) ;
                        Gx_msg += httpContext.getMessage( "No se puede crear Receta de acabado", "") + GXutil.newLine( ) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                        AV62F_ok = httpContext.getMessage( "N", "") ;
                     }
                     if ( GXutil.strcmp(AV62F_ok, httpContext.getMessage( "S", "")) == 0 )
                     {
                        httpContext.popup(formatLink("app.recetasdeacabado01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV17BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV12MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV50MaqDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV52MaqVolRes,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53MaqVolTop,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV39ArtFacabs)),GXutil.URLEncode(GXutil.rtrim(AV42Procod)),GXutil.URLEncode(GXutil.rtrim(AV79ErrMensaje1)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","Maqcod","MaqDsc","MaqVolRes","MaqVolTop","ArtFacAbs","Procod","ErrMensaje1","ErrMensaje","HdrscreadasToJson"}) , new Object[] {"AV8EmprCod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","AV16BarKgm","AV17BarMtr","AV12MaqCod","AV50MaqDsc","AV52MaqVolRes","AV53MaqVolTop","AV39ArtFacabs","AV42Procod","AV79ErrMensaje1","AV72ErrMensaje","AV80hdrscreadastojson"});
                        httpContext.doAjaxRefresh();
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e131HG2( )
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

   public void e141HG2( )
   {
      /* Maqcod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RECMAQ' */
      S152 ();
      if (returnInSub) return;
      if ( AV13ArtFamq.doubleValue() > 0 )
      {
         AV39ArtFacabs = AV13ArtFamq ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) )
         {
            if ( ( AV44MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, "S") == 0 ) )
            {
               AV39ArtFacabs = AV44MaqfacAbs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
            }
            if ( ( AV45MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, "H") == 0 ) )
            {
               AV39ArtFacabs = AV45MaqFabsh ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
            }
         }
      }
      if ( AV46FabsMq == 1 )
      {
         AV39ArtFacabs = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         if ( ( AV44MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV39ArtFacabs = AV44MaqfacAbs ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
         if ( ( AV45MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, httpContext.getMessage( "H", "")) == 0 ) )
         {
            AV39ArtFacabs = AV45MaqFabsh ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
      }
      AV79ErrMensaje1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79ErrMensaje1", AV79ErrMensaje1);
      if ( ( AV68RecmaqA == 1 ) && ( GXutil.strcmp(AV72ErrMensaje, httpContext.getMessage( "Proceso finalizado con exito!", "")) != 0 ) )
      {
         AV79ErrMensaje1 = httpContext.getMessage( "Atencion. Ya existe Receta de Acabado, de esta HDR ", "") + GXutil.trim( GXutil.str( AV5BarCod, 8, 0)) + "-" + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar + httpContext.getMessage( " en la maquina ", "") + GXutil.trim( AV12MaqCod) + httpContext.getMessage( " creada ", "") + GXutil.trim( localUtil.ttoc( AV69RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) + httpContext.getMessage( ".Si continua, se creara otra Receta de Acabado.", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79ErrMensaje1", AV79ErrMensaje1);
         httpContext.GX_msglist.addItem(AV79ErrMensaje1);
      }
      GXt_int5 = AV71LtsIni ;
      GXv_decimal9[0] = AV39ArtFacabs ;
      GXv_int6[0] = AV52MaqVolRes ;
      GXv_int8[0] = (byte)(AV70VolMul) ;
      GXv_decimal10[0] = AV14Tot_kgs ;
      GXv_int11[0] = GXt_int5 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal9, GXv_int6, GXv_int8, GXv_decimal10, GXv_int11) ;
      recetasdeacabado00_wp_impl.this.AV39ArtFacabs = GXv_decimal9[0] ;
      recetasdeacabado00_wp_impl.this.AV52MaqVolRes = GXv_int6[0] ;
      recetasdeacabado00_wp_impl.this.AV70VolMul = GXv_int8[0] ;
      recetasdeacabado00_wp_impl.this.AV14Tot_kgs = GXv_decimal10[0] ;
      recetasdeacabado00_wp_impl.this.GXt_int5 = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV70VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
      AV71LtsIni = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71LtsIni), 5, 0));
      lblTextblock1_Fontsize = 10 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblock1_Fontsize), 9, 0), true);
      lblTextblock1_Caption = AV79ErrMensaje1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
      /*  Sending Event outputs  */
   }

   public void e151HG2( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RECMAQ' */
      S152 ();
      if (returnInSub) return;
      AV79ErrMensaje1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79ErrMensaje1", AV79ErrMensaje1);
      if ( ( AV68RecmaqA == 1 ) && ( GXutil.strcmp(AV72ErrMensaje, httpContext.getMessage( "Proceso finalizado con exito!", "")) != 0 ) )
      {
         AV79ErrMensaje1 = httpContext.getMessage( "Atencion. Ya existe Receta de Acabado, de esta HDR ", "") + GXutil.trim( GXutil.str( AV5BarCod, 8, 0)) + "-" + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar + httpContext.getMessage( " en la maquina ", "") + GXutil.trim( AV12MaqCod) + httpContext.getMessage( " creada ", "") + GXutil.trim( localUtil.ttoc( AV69RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) + httpContext.getMessage( ".Si continua, se creara otra Receta de Acabado.", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79ErrMensaje1", AV79ErrMensaje1);
         httpContext.GX_msglist.addItem(AV79ErrMensaje1);
      }
      GXt_int5 = AV71LtsIni ;
      GXv_decimal10[0] = AV39ArtFacabs ;
      GXv_int11[0] = AV52MaqVolRes ;
      GXv_int8[0] = (byte)(AV70VolMul) ;
      GXv_decimal9[0] = AV14Tot_kgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal10, GXv_int11, GXv_int8, GXv_decimal9, GXv_int6) ;
      recetasdeacabado00_wp_impl.this.AV39ArtFacabs = GXv_decimal10[0] ;
      recetasdeacabado00_wp_impl.this.AV52MaqVolRes = GXv_int11[0] ;
      recetasdeacabado00_wp_impl.this.AV70VolMul = GXv_int8[0] ;
      recetasdeacabado00_wp_impl.this.AV14Tot_kgs = GXv_decimal9[0] ;
      recetasdeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV70VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
      AV71LtsIni = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71LtsIni), 5, 0));
      lblTextblock1_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
      lblTextblock1_Caption = AV79ErrMensaje1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
      /*  Sending Event outputs  */
   }

   public void e161HG2( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'BARCAD' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV38Barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe el N HDR¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV13ArtFamq.doubleValue() > 0 )
         {
            AV39ArtFacabs = AV13ArtFamq ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) )
            {
               if ( ( AV44MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, httpContext.getMessage( "S", "")) == 0 ) )
               {
                  AV39ArtFacabs = AV44MaqfacAbs ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
               }
               if ( ( AV45MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, httpContext.getMessage( "H", "")) == 0 ) )
               {
                  AV39ArtFacabs = AV45MaqFabsh ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
               }
            }
         }
      }
      if ( AV46FabsMq == 1 )
      {
         AV39ArtFacabs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         if ( ( AV44MaqfacAbs.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV39ArtFacabs = AV44MaqfacAbs ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
         if ( ( AV45MaqFabsh.doubleValue() > 0 ) && ( GXutil.strcmp(AV11HumSec, httpContext.getMessage( "H", "")) == 0 ) )
         {
            AV39ArtFacabs = AV45MaqFabsh ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         }
      }
      AV39ArtFacabs = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) ? DecimalUtil.doubleToDec(100) : AV39ArtFacabs) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      GXt_int5 = AV71LtsIni ;
      GXv_decimal10[0] = AV39ArtFacabs ;
      GXv_int11[0] = AV52MaqVolRes ;
      GXv_int8[0] = (byte)(AV70VolMul) ;
      GXv_decimal9[0] = AV14Tot_kgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal10, GXv_int11, GXv_int8, GXv_decimal9, GXv_int6) ;
      recetasdeacabado00_wp_impl.this.AV39ArtFacabs = GXv_decimal10[0] ;
      recetasdeacabado00_wp_impl.this.AV52MaqVolRes = GXv_int11[0] ;
      recetasdeacabado00_wp_impl.this.AV70VolMul = GXv_int8[0] ;
      recetasdeacabado00_wp_impl.this.AV14Tot_kgs = GXv_decimal9[0] ;
      recetasdeacabado00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV70VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70VolMul), "ZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
      AV71LtsIni = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71LtsIni), 5, 0));
      /*  Sending Event outputs  */
   }

   public void e171HG2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV72ErrMensaje, httpContext.getMessage( "Proceso finalizado con exito!", "")) == 0 )
      {
         AV81Hdrscreadas_SDTs.fromJSonString(AV80hdrscreadastojson, null);
         if ( AV81Hdrscreadas_SDTs.size() == 1 )
         {
            AV93GXV1 = 1 ;
            while ( AV93GXV1 <= AV81Hdrscreadas_SDTs.size() )
            {
               AV82Hdrscreadas_SDT = (app.SdtHdrscreadas_SDT)((app.SdtHdrscreadas_SDT)AV81Hdrscreadas_SDTs.elementAt(-1+AV93GXV1));
               AV83BarcodSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcod() ;
               AV84BarcodreoSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodreo() ;
               AV85BarcodparSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodpar() ;
               AV86ReclinmaqSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Reclinmaq() ;
               AV93GXV1 = (int)(AV93GXV1+1) ;
            }
            callWebObject(formatLink("app.formulaciontinte.recetadeacabados02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV83BarcodSDT,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV84BarcodreoSDT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV85BarcodparSDT)),GXutil.URLEncode(GXutil.ltrimstr(AV86ReclinmaqSDT,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", "")))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Mode"}) );
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
            AV12MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCod", AV12MaqCod);
            /* Using cursor H01HG5 */
            pr_default.execute(3, new Object[] {AV12MaqCod});
            hV12MaqCod = "" ;
            while ( (pr_default.getStatus(3) != 101) )
            {
               hV12MaqCod = H01HG5_A13734MaqCDsc[0] ;
               if (true) break;
            }
            pr_default.close(3);
            httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCod", hV12MaqCod);
            AV44MaqfacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44MaqfacAbs", GXutil.ltrimstr( AV44MaqfacAbs, 6, 2));
            AV53MaqVolTop = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqVolTop), 5, 0));
            AV52MaqVolRes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
            AV14Tot_kgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
            AV39ArtFacabs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
            AV71LtsIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71LtsIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71LtsIni), 5, 0));
            AV94GXV2 = 1 ;
            while ( AV94GXV2 <= AV81Hdrscreadas_SDTs.size() )
            {
               AV82Hdrscreadas_SDT = (app.SdtHdrscreadas_SDT)((app.SdtHdrscreadas_SDT)AV81Hdrscreadas_SDTs.elementAt(-1+AV94GXV2));
               AV83BarcodSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcod() ;
               AV84BarcodreoSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodreo() ;
               AV85BarcodparSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Barcodpar() ;
               AV86ReclinmaqSDT = AV82Hdrscreadas_SDT.getgxTv_SdtHdrscreadas_SDT_Reclinmaq() ;
               AV94GXV2 = (int)(AV94GXV2+1) ;
            }
            httpContext.popup(formatLink("app.recetasdeacabado04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV83BarcodSDT,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV84BarcodreoSDT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV85BarcodparSDT)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", ""))),GXutil.URLEncode(GXutil.rtrim(AV49UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV47Station))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Mode","Usurcod","Station"}) , new Object[] {"AV8EmprCod","AV83BarcodSDT","AV84BarcodreoSDT","AV85BarcodparSDT","","AV49UsurCod","AV47Station"});
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e191HG2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV8EmprCod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","",""});
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV38Barcad = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Barcad), 4, 0));
      AV16BarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm", GXutil.ltrimstr( AV16BarKgm, 9, 2));
      AV17BarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr", GXutil.ltrimstr( AV17BarMtr, 9, 2));
      AV38Barcad = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Barcad), 4, 0));
      /* Using cursor H01HG7 */
      pr_default.execute(4, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = H01HG7_A130BarCodPar[0] ;
         A132BarCodReo = H01HG7_A132BarCodReo[0] ;
         A129BarCod = H01HG7_A129BarCod[0] ;
         A396EmprCod = H01HG7_A396EmprCod[0] ;
         A252CliCod = H01HG7_A252CliCod[0] ;
         n252CliCod = H01HG7_n252CliCod[0] ;
         A279CliNom = H01HG7_A279CliNom[0] ;
         A212BarSer = H01HG7_A212BarSer[0] ;
         A143BarDisNum = H01HG7_A143BarDisNum[0] ;
         A127BarAncCru1 = H01HG7_A127BarAncCru1[0] ;
         A206BarPle = H01HG7_A206BarPle[0] ;
         A135BarColNom = H01HG7_A135BarColNom[0] ;
         A136BarColNum = H01HG7_A136BarColNum[0] ;
         A2836BarPle2 = H01HG7_A2836BarPle2[0] ;
         A182BarMat = H01HG7_A182BarMat[0] ;
         A213BarSit = H01HG7_A213BarSit[0] ;
         A118BarAcaQui = H01HG7_A118BarAcaQui[0] ;
         A1652BarSerDsc = H01HG7_A1652BarSerDsc[0] ;
         A864BarPes = H01HG7_A864BarPes[0] ;
         A166BarKgm = H01HG7_A166BarKgm[0] ;
         A184BarMtr = H01HG7_A184BarMtr[0] ;
         A166BarKgm = H01HG7_A166BarKgm[0] ;
         A184BarMtr = H01HG7_A184BarMtr[0] ;
         A279CliNom = H01HG7_A279CliNom[0] ;
         AV38Barcad = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Barcad), 4, 0));
         AV9CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliCod), 6, 0));
         AV37CliNom = A279CliNom ;
         AV10BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarSer", AV10BarSer);
         AV36bardisnum = A143BarDisNum ;
         AV35Baranccru1 = A127BarAncCru1 ;
         AV34BarPle = A206BarPle ;
         AV33BarColNom = A135BarColNom ;
         AV32BarColNum = A136BarColNum ;
         AV31Contextura = A2836BarPle2 ;
         AV30BarMat = A182BarMat ;
         AV29Barsit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Barsit), 2, 0));
         AV28BarAcaqui = A118BarAcaQui ;
         /* Execute user subroutine: 'ARTICU' */
         S163 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(4);
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         AV27BarSerDsc = A1652BarSerDsc ;
         AV16BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm", GXutil.ltrimstr( AV16BarKgm, 9, 2));
         AV17BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr", GXutil.ltrimstr( AV17BarMtr, 9, 2));
         AV26BarPes = A864BarPes ;
         /* Using cursor H01HG8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A758ProCod = H01HG8_A758ProCod[0] ;
            A759ProDsc = H01HG8_A759ProDsc[0] ;
            A759ProDsc = H01HG8_A759ProDsc[0] ;
            AV42Procod = A758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Procod", AV42Procod);
            AV43ProDsc = A759ProDsc ;
            AV25Tinte = (short)(0) ;
            /* Using cursor H01HG9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A150BarFacTin = H01HG9_A150BarFacTin[0] ;
               A194BarOrdLin = H01HG9_A194BarOrdLin[0] ;
               AV25Tinte = (short)(1) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      AV24recmaq = (short)(0) ;
      /* Using cursor H01HG10 */
      pr_default.execute(7, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A6039RecAcab = H01HG10_A6039RecAcab[0] ;
         n6039RecAcab = H01HG10_n6039RecAcab[0] ;
         A130BarCodPar = H01HG10_A130BarCodPar[0] ;
         A132BarCodReo = H01HG10_A132BarCodReo[0] ;
         A129BarCod = H01HG10_A129BarCod[0] ;
         A396EmprCod = H01HG10_A396EmprCod[0] ;
         A602MaqCod = H01HG10_A602MaqCod[0] ;
         A2804RecLinMaq = H01HG10_A2804RecLinMaq[0] ;
         AV24recmaq = (short)(1) ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV18Lconti = (short)(0) ;
      AV23DdmmAAAA = "" ;
      AV22BarAgrLot = "" ;
      AV21BarFaseOrd = (short)(0) ;
      AV20BarFasecod = "" ;
      AV19BarMaqTin = "" ;
      /* Using cursor H01HG11 */
      pr_default.execute(8, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A6634BarRecAcb = H01HG11_A6634BarRecAcb[0] ;
         n6634BarRecAcb = H01HG11_n6634BarRecAcb[0] ;
         A1935BarParTin = H01HG11_A1935BarParTin[0] ;
         n1935BarParTin = H01HG11_n1935BarParTin[0] ;
         A1934BarReoTin = H01HG11_A1934BarReoTin[0] ;
         n1934BarReoTin = H01HG11_n1934BarReoTin[0] ;
         A1933BarCodTin = H01HG11_A1933BarCodTin[0] ;
         n1933BarCodTin = H01HG11_n1933BarCodTin[0] ;
         A396EmprCod = H01HG11_A396EmprCod[0] ;
         A3646EstTinAny = H01HG11_A3646EstTinAny[0] ;
         A3647EstTinMes = H01HG11_A3647EstTinMes[0] ;
         A3648EstTinDia = H01HG11_A3648EstTinDia[0] ;
         A2316BarAgrLot = H01HG11_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H01HG11_n2316BarAgrLot[0] ;
         A4926BarFaseOrd = H01HG11_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = H01HG11_n4926BarFaseOrd[0] ;
         A4925BarFaseCod = H01HG11_A4925BarFaseCod[0] ;
         n4925BarFaseCod = H01HG11_n4925BarFaseCod[0] ;
         A1945BarMaqTin = H01HG11_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H01HG11_n1945BarMaqTin[0] ;
         AV23DdmmAAAA = GXutil.str( A3648EstTinDia, 2, 0) + "/" + GXutil.str( A3647EstTinMes, 2, 0) + "/" + GXutil.str( A3646EstTinAny, 4, 0) ;
         AV22BarAgrLot = A2316BarAgrLot ;
         AV21BarFaseOrd = A4926BarFaseOrd ;
         AV20BarFasecod = A4925BarFaseCod ;
         AV19BarMaqTin = A1945BarMaqTin ;
         AV18Lconti = (short)(1) ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( (0==AV18Lconti) )
      {
         /* Using cursor H01HG12 */
         pr_default.execute(9, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A4495HreNumCie = H01HG12_A4495HreNumCie[0] ;
            A9804HreAcab = H01HG12_A9804HreAcab[0] ;
            n9804HreAcab = H01HG12_n9804HreAcab[0] ;
            A4494HreBarPar = H01HG12_A4494HreBarPar[0] ;
            A4493HreBarReo = H01HG12_A4493HreBarReo[0] ;
            A4492HreBarCod = H01HG12_A4492HreBarCod[0] ;
            A396EmprCod = H01HG12_A396EmprCod[0] ;
            A4529HreFecTin = H01HG12_A4529HreFecTin[0] ;
            n4529HreFecTin = H01HG12_n4529HreFecTin[0] ;
            A4964HreOrdLin = H01HG12_A4964HreOrdLin[0] ;
            n4964HreOrdLin = H01HG12_n4964HreOrdLin[0] ;
            A4963HreFasCod = H01HG12_A4963HreFasCod[0] ;
            n4963HreFasCod = H01HG12_n4963HreFasCod[0] ;
            A4546HreMaqCod = H01HG12_A4546HreMaqCod[0] ;
            n4546HreMaqCod = H01HG12_n4546HreMaqCod[0] ;
            A4529HreFecTin = H01HG12_A4529HreFecTin[0] ;
            n4529HreFecTin = H01HG12_n4529HreFecTin[0] ;
            AV23DdmmAAAA = localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            AV22BarAgrLot = GXutil.str( A4492HreBarCod, 8, 0) + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
            AV21BarFaseOrd = A4964HreOrdLin ;
            AV20BarFasecod = A4963HreFasCod ;
            AV19BarMaqTin = A4546HreMaqCod ;
            AV18Lconti = (short)(1) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
      }
      AV14Tot_kgs = AV16BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
      AV15Tot_mts = AV17BarMtr ;
      /* Optimized group. */
      /* Using cursor H01HG13 */
      pr_default.execute(10, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      c6035Ac_Kilos = H01HG13_A6035Ac_Kilos[0] ;
      n6035Ac_Kilos = H01HG13_n6035Ac_Kilos[0] ;
      c6034Ac_Metros = H01HG13_A6034Ac_Metros[0] ;
      n6034Ac_Metros = H01HG13_n6034Ac_Metros[0] ;
      pr_default.close(10);
      AV14Tot_kgs = AV14Tot_kgs.add(c6035Ac_Kilos) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tot_kgs", GXutil.ltrimstr( AV14Tot_kgs, 10, 2));
      AV15Tot_mts = AV15Tot_mts.add(c6034Ac_Metros) ;
      /* End optimized group. */
      AV13ArtFamq = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ArtFamq", GXutil.ltrimstr( AV13ArtFamq, 6, 2));
      /* Using cursor H01HG14 */
      pr_default.execute(11, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10BarSer, AV11HumSec, AV12MaqCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A10042ArtMqFa = H01HG14_A10042ArtMqFa[0] ;
         A10041ArtSH = H01HG14_A10041ArtSH[0] ;
         A65ArtCod = H01HG14_A65ArtCod[0] ;
         A252CliCod = H01HG14_A252CliCod[0] ;
         n252CliCod = H01HG14_n252CliCod[0] ;
         A396EmprCod = H01HG14_A396EmprCod[0] ;
         A10044ArtFaMq = H01HG14_A10044ArtFaMq[0] ;
         n10044ArtFaMq = H01HG14_n10044ArtFaMq[0] ;
         AV13ArtFamq = A10044ArtFaMq ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ArtFamq", GXutil.ltrimstr( AV13ArtFamq, 6, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S163( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV39ArtFacabs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      /* Using cursor H01HG15 */
      pr_default.execute(12, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10BarSer});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A65ArtCod = H01HG15_A65ArtCod[0] ;
         A252CliCod = H01HG15_A252CliCod[0] ;
         n252CliCod = H01HG15_n252CliCod[0] ;
         A396EmprCod = H01HG15_A396EmprCod[0] ;
         A9730ArtFabsH = H01HG15_A9730ArtFabsH[0] ;
         n9730ArtFabsH = H01HG15_n9730ArtFabsH[0] ;
         A2791ArtFacAbs = H01HG15_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = H01HG15_n2791ArtFacAbs[0] ;
         AV39ArtFacabs = ((GXutil.strcmp(AV11HumSec, "S")==0) ? A2791ArtFacAbs : A9730ArtFabsH) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      if ( (0==AV40Ltsrc) && (0==AV41Torient) )
      {
         AV39ArtFacabs = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39ArtFacabs)==0) ? DecimalUtil.doubleToDec(100) : AV39ArtFacabs) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39ArtFacabs", GXutil.ltrimstr( AV39ArtFacabs, 6, 2));
      }
   }

   public void S122( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV44MaqfacAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44MaqfacAbs", GXutil.ltrimstr( AV44MaqfacAbs, 6, 2));
      AV45MaqFabsh = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45MaqFabsh", GXutil.ltrimstr( AV45MaqFabsh, 6, 2));
      AV50MaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50MaqDsc", AV50MaqDsc);
      AV51MaqVolMin = 0 ;
      AV53MaqVolTop = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqVolTop), 5, 0));
      AV104GXLvl405 = (byte)(0) ;
      /* Using cursor H01HG16 */
      pr_default.execute(13, new Object[] {AV8EmprCod, AV12MaqCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A602MaqCod = H01HG16_A602MaqCod[0] ;
         A396EmprCod = H01HG16_A396EmprCod[0] ;
         A606MaqDsc = H01HG16_A606MaqDsc[0] ;
         n606MaqDsc = H01HG16_n606MaqDsc[0] ;
         A2801MaqVolRes = H01HG16_A2801MaqVolRes[0] ;
         n2801MaqVolRes = H01HG16_n2801MaqVolRes[0] ;
         A2802MaqVolTop = H01HG16_A2802MaqVolTop[0] ;
         n2802MaqVolTop = H01HG16_n2802MaqVolTop[0] ;
         A6284MaqFacAbs = H01HG16_A6284MaqFacAbs[0] ;
         n6284MaqFacAbs = H01HG16_n6284MaqFacAbs[0] ;
         A9982MaqFabsHm = H01HG16_A9982MaqFabsHm[0] ;
         n9982MaqFabsHm = H01HG16_n9982MaqFabsHm[0] ;
         A625MaqVolMin = H01HG16_A625MaqVolMin[0] ;
         n625MaqVolMin = H01HG16_n625MaqVolMin[0] ;
         AV104GXLvl405 = (byte)(1) ;
         AV50MaqDsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MaqDsc", AV50MaqDsc);
         AV52MaqVolRes = A2801MaqVolRes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52MaqVolRes), 5, 0));
         AV53MaqVolTop = A2802MaqVolTop ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaqVolTop), 5, 0));
         AV44MaqfacAbs = A6284MaqFacAbs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44MaqfacAbs", GXutil.ltrimstr( AV44MaqfacAbs, 6, 2));
         AV45MaqFabsh = A9982MaqFabsHm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45MaqFabsh", GXutil.ltrimstr( AV45MaqFabsh, 6, 2));
         AV51MaqVolMin = A625MaqVolMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
      if ( AV104GXLvl405 == 0 )
      {
         AV50MaqDsc = httpContext.getMessage( "Inexistente", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MaqDsc", AV50MaqDsc);
      }
   }

   public void S132( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV55FaseAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FaseAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55FaseAca), 4, 0));
      AV56BarFasFor = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56BarFasFor", AV56BarFasFor);
      AV57Fasqui = (short)(0) ;
      AV58BarOrdLin = (short)(0) ;
      AV59fasquilin = (short)(0) ;
      /* Using cursor H01HG17 */
      pr_default.execute(14, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A603MaqCodBis = H01HG17_A603MaqCodBis[0] ;
         A194BarOrdLin = H01HG17_A194BarOrdLin[0] ;
         A758ProCod = H01HG17_A758ProCod[0] ;
         A130BarCodPar = H01HG17_A130BarCodPar[0] ;
         A132BarCodReo = H01HG17_A132BarCodReo[0] ;
         A129BarCod = H01HG17_A129BarCod[0] ;
         A396EmprCod = H01HG17_A396EmprCod[0] ;
         A4287BarFasFor = H01HG17_A4287BarFasFor[0] ;
         A4905BarFasAcab = H01HG17_A4905BarFasAcab[0] ;
         A457FasCod = H01HG17_A457FasCod[0] ;
         AV55FaseAca = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55FaseAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55FaseAca), 4, 0));
         AV56BarFasFor = A4287BarFasFor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56BarFasFor", AV56BarFasFor);
         AV63FasCod = A457FasCod ;
         AV60Num_p = (short)(0) ;
         AV61Proforcod = "" ;
         /* Using cursor H01HG18 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A764ProForCod = H01HG18_A764ProForCod[0] ;
            A5371FasQuiLin = H01HG18_A5371FasQuiLin[0] ;
            AV57Fasqui = (short)(1) ;
            AV58BarOrdLin = A194BarOrdLin ;
            AV59fasquilin = A5371FasQuiLin ;
            if ( GXutil.strcmp(GXutil.substring( A603MaqCodBis, 1, 4), GXutil.substring( AV12MaqCod, 1, 4)) == 0 )
            {
               AV61Proforcod = A764ProForCod ;
               AV60Num_p = (short)(AV60Num_p+1) ;
            }
            pr_default.readNext(15);
         }
         pr_default.close(15);
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S142( )
   {
      /* 'HDRACA' Routine */
      returnInSub = false ;
      AV64Hdraca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Hdraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Hdraca), 4, 0));
      AV65BarCod_p = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod_p), 8, 0));
      AV66CodReo_p = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66CodReo_p", GXutil.str( AV66CodReo_p, 1, 0));
      AV67CodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67CodPar", AV67CodPar);
      /* Using cursor H01HG19 */
      pr_default.execute(16, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A396EmprCod = H01HG19_A396EmprCod[0] ;
         A6031Ac_Barcod = H01HG19_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = H01HG19_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = H01HG19_A6033Ac_BarPar[0] ;
         A129BarCod = H01HG19_A129BarCod[0] ;
         A132BarCodReo = H01HG19_A132BarCodReo[0] ;
         A130BarCodPar = H01HG19_A130BarCodPar[0] ;
         AV64Hdraca = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Hdraca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Hdraca), 4, 0));
         AV65BarCod_p = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod_p), 8, 0));
         AV66CodReo_p = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66CodReo_p", GXutil.str( AV66CodReo_p, 1, 0));
         AV67CodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67CodPar", AV67CodPar);
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void S152( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV68RecmaqA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68RecmaqA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68RecmaqA), 4, 0));
      AV69RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV69RecFecAlt", localUtil.ttoc( AV69RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Using cursor H01HG20 */
      pr_default.execute(17, new Object[] {AV8EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A6039RecAcab = H01HG20_A6039RecAcab[0] ;
         n6039RecAcab = H01HG20_n6039RecAcab[0] ;
         A130BarCodPar = H01HG20_A130BarCodPar[0] ;
         A132BarCodReo = H01HG20_A132BarCodReo[0] ;
         A129BarCod = H01HG20_A129BarCod[0] ;
         A396EmprCod = H01HG20_A396EmprCod[0] ;
         A602MaqCod = H01HG20_A602MaqCod[0] ;
         A4866RecFecAlt = H01HG20_A4866RecFecAlt[0] ;
         n4866RecFecAlt = H01HG20_n4866RecFecAlt[0] ;
         if ( GXutil.strcmp(GXutil.substring( A602MaqCod, 1, 6), GXutil.substring( AV12MaqCod, 1, 6)) == 0 )
         {
            AV69RecFecAlt = A4866RecFecAlt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69RecFecAlt", localUtil.ttoc( AV69RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV68RecmaqA = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68RecmaqA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68RecmaqA), 4, 0));
         }
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   protected void nextLoad( )
   {
   }

   protected void e181HG2( )
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
      pa1HG2( ) ;
      ws1HG2( ) ;
      we1HG2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011125627", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabado00_wp.js", "?202671011125627", false, true);
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqvoltop_Internalname = "vMAQVOLTOP" ;
      edtavMaqvolres_Internalname = "vMAQVOLRES" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavTot_kgs_Internalname = "vTOT_KGS" ;
      edtavArtfacabs_Internalname = "vARTFACABS" ;
      edtavLtsini_Internalname = "vLTSINI" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqfacabs_Internalname = "vMAQFACABS" ;
      edtavMaqfabsh_Internalname = "vMAQFABSH" ;
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
      edtavMaqfabsh_Jsonclick = "" ;
      edtavMaqfabsh_Visible = 1 ;
      edtavMaqfacabs_Jsonclick = "" ;
      edtavMaqfacabs_Visible = 1 ;
      lblTextblock1_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      lblTextblock1_Caption = " " ;
      edtavLtsini_Jsonclick = "" ;
      edtavLtsini_Enabled = 1 ;
      edtavArtfacabs_Jsonclick = "" ;
      edtavArtfacabs_Enabled = 1 ;
      edtavTot_kgs_Jsonclick = "" ;
      edtavTot_kgs_Enabled = 1 ;
      edtavMaqvolres_Jsonclick = "" ;
      edtavMaqvolres_Enabled = 1 ;
      edtavMaqvoltop_Jsonclick = "" ;
      edtavMaqvoltop_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado", "") );
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

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV12MaqCod)==0) )
      {
         AV12MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV12MaqCod ;
         /* Using cursor H01HG21 */
         pr_default.execute(18, new Object[] {A13734MaqCDsc});
         AV12MaqCod = H01HG21_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCod", hV12MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCod", GXutil.rtrim( AV12MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCod", hV12MaqCod);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV72ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV80hdrscreadastojson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV46FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV54Sit9',fld:'vSIT9',pic:'ZZZ9',hsh:true},{av:'AV40Ltsrc',fld:'vLTSRC',pic:'ZZZ9',hsh:true},{av:'AV41Torient',fld:'vTORIENT',pic:'ZZZ9',hsh:true},{av:'AV70VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV47Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV53MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV14Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV71LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'AV47Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121HG2',iparms:[{av:'AV13ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV11HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV45MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV46FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV38Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'AV29Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV54Sit9',fld:'vSIT9',pic:'ZZZ9',hsh:true},{av:'AV55FaseAca',fld:'vFASEACA',pic:'ZZZ9'},{av:'AV56BarFasFor',fld:'vBARFASFOR',pic:'@!'},{av:'AV64Hdraca',fld:'vHDRACA',pic:'ZZZ9'},{av:'AV65BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV66CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV67CodPar',fld:'vCODPAR',pic:''},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV53MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV42Procod',fld:'vPROCOD',pic:''},{av:'AV79ErrMensaje1',fld:'vERRMENSAJE1',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A127BarAncCru1',fld:'BARANCCRU1',pic:'ZZ9'},{av:'A206BarPle',fld:'BARPLE',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A2836BarPle2',fld:'BARPLE2',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A4926BarFaseOrd',fld:'BARFASEORD',pic:'ZZZ9'},{av:'A4925BarFaseCod',fld:'BARFASECOD',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4964HreOrdLin',fld:'HREORDLIN',pic:'ZZZ9'},{av:'A4963HreFasCod',fld:'HREFASCOD',pic:''},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10041ArtSH',fld:'ARTSH',pic:''},{av:'A10042ArtMqFa',fld:'ARTMQFA',pic:''},{av:'A10044ArtFaMq',fld:'ARTFAMQ',pic:'ZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A2801MaqVolRes',fld:'MAQVOLRES',pic:'ZZZZ9'},{av:'A2802MaqVolTop',fld:'MAQVOLTOP',pic:'ZZZZ9'},{av:'A6284MaqFacAbs',fld:'MAQFACABS',pic:'ZZ9.99'},{av:'A9982MaqFabsHm',fld:'MAQFABSHM',pic:'ZZ9.99'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A5371FasQuiLin',fld:'FASQUILIN',pic:'ZZZ9'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'A2791ArtFacAbs',fld:'ARTFACABS',pic:'ZZ9.99'},{av:'A9730ArtFabsH',fld:'ARTFABSH',pic:'ZZ9.99'},{av:'AV40Ltsrc',fld:'vLTSRC',pic:'ZZZ9',hsh:true},{av:'AV41Torient',fld:'vTORIENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV80hdrscreadastojson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV72ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV79ErrMensaje1',fld:'vERRMENSAJE1',pic:''},{av:'AV42Procod',fld:'vPROCOD',pic:''},{av:'AV53MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV50MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV29Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV14Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'AV13ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV45MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV55FaseAca',fld:'vFASEACA',pic:'ZZZ9'},{av:'AV56BarFasFor',fld:'vBARFASFOR',pic:'@!'},{av:'AV64Hdraca',fld:'vHDRACA',pic:'ZZZ9'},{av:'AV65BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV66CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV67CodPar',fld:'vCODPAR',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131HG2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED","{handler:'e141HG2',iparms:[{av:'AV13ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV11HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV45MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV46FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV68RecmaqA',fld:'vRECMAQA',pic:'ZZZ9'},{av:'AV72ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'AV69RecFecAlt',fld:'vRECFECALT',pic:'99/99/99 99:99'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV70VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV14Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A2801MaqVolRes',fld:'MAQVOLRES',pic:'ZZZZ9'},{av:'A2802MaqVolTop',fld:'MAQVOLTOP',pic:'ZZZZ9'},{av:'A6284MaqFacAbs',fld:'MAQFACABS',pic:'ZZ9.99'},{av:'A9982MaqFabsHm',fld:'MAQFABSHM',pic:'ZZ9.99'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4866RecFecAlt',fld:'RECFECALT',pic:'99/99/99 99:99'}]");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV79ErrMensaje1',fld:'vERRMENSAJE1',pic:''},{av:'AV71LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'lblTextblock1_Fontsize',ctrl:'TEXTBLOCK1',prop:'Fontsize'},{av:'lblTextblock1_Caption',ctrl:'TEXTBLOCK1',prop:'Caption'},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV45MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV50MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV53MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV68RecmaqA',fld:'vRECMAQA',pic:'ZZZ9'},{av:'AV69RecFecAlt',fld:'vRECFECALT',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e151HG2',iparms:[{av:'AV68RecmaqA',fld:'vRECMAQA',pic:'ZZZ9'},{av:'AV72ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'AV69RecFecAlt',fld:'vRECFECALT',pic:'99/99/99 99:99'},{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV70VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV14Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A2801MaqVolRes',fld:'MAQVOLRES',pic:'ZZZZ9'},{av:'A2802MaqVolTop',fld:'MAQVOLTOP',pic:'ZZZZ9'},{av:'A6284MaqFacAbs',fld:'MAQFACABS',pic:'ZZ9.99'},{av:'A9982MaqFabsHm',fld:'MAQFABSHM',pic:'ZZ9.99'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4866RecFecAlt',fld:'RECFECALT',pic:'99/99/99 99:99'}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV79ErrMensaje1',fld:'vERRMENSAJE1',pic:''},{av:'AV71LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'lblTextblock1_Caption',ctrl:'TEXTBLOCK1',prop:'Caption'},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV45MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV50MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV53MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV68RecmaqA',fld:'vRECMAQA',pic:'ZZZ9'},{av:'AV69RecFecAlt',fld:'vRECFECALT',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e161HG2',iparms:[{av:'AV38Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV13ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'},{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV44MaqfacAbs',fld:'vMAQFACABS',pic:'ZZ9.99'},{av:'AV11HumSec',fld:'vHUMSEC',pic:'',hsh:true},{av:'AV45MaqFabsh',fld:'vMAQFABSH',pic:'ZZ9.99'},{av:'AV46FabsMq',fld:'vFABSMQ',pic:'ZZZ9',hsh:true},{av:'AV52MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV70VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV14Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A127BarAncCru1',fld:'BARANCCRU1',pic:'ZZ9'},{av:'A206BarPle',fld:'BARPLE',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A2836BarPle2',fld:'BARPLE2',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A4926BarFaseOrd',fld:'BARFASEORD',pic:'ZZZ9'},{av:'A4925BarFaseCod',fld:'BARFASECOD',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4964HreOrdLin',fld:'HREORDLIN',pic:'ZZZ9'},{av:'A4963HreFasCod',fld:'HREFASCOD',pic:''},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10041ArtSH',fld:'ARTSH',pic:''},{av:'A10042ArtMqFa',fld:'ARTMQFA',pic:''},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'A10044ArtFaMq',fld:'ARTFAMQ',pic:'ZZ9.99'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'A2791ArtFacAbs',fld:'ARTFACABS',pic:'ZZ9.99'},{av:'A9730ArtFabsH',fld:'ARTFABSH',pic:'ZZ9.99'},{av:'AV40Ltsrc',fld:'vLTSRC',pic:'ZZZ9',hsh:true},{av:'AV41Torient',fld:'vTORIENT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'AV39ArtFacabs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV71LtsIni',fld:'vLTSINI',pic:'ZZZZ9'},{av:'AV38Barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV16BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV17BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV9CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10BarSer',fld:'vBARSER',pic:''},{av:'AV29Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV42Procod',fld:'vPROCOD',pic:''},{av:'AV14Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZZ9.99'},{av:'AV13ArtFamq',fld:'vARTFAMQ',pic:'ZZ9.99'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e191HG2',iparms:[{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV12MaqCod'},{av:'AV12MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV12MaqCod',fld:'vMAQCOD',pic:''},{av:'hV12MaqCod'}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13734MaqCDsc = "" ;
      hV12MaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11HumSec = "" ;
      AV49UsurCod = "" ;
      AV47Station = "" ;
      GXKey = "" ;
      AV13ArtFamq = DecimalUtil.ZERO ;
      AV50MaqDsc = "" ;
      AV56BarFasFor = "" ;
      AV67CodPar = "" ;
      AV8EmprCod = "" ;
      AV16BarKgm = DecimalUtil.ZERO ;
      AV17BarMtr = DecimalUtil.ZERO ;
      AV42Procod = "" ;
      AV79ErrMensaje1 = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A143BarDisNum = "" ;
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
      A606MaqDsc = "" ;
      A6284MaqFacAbs = DecimalUtil.ZERO ;
      A9982MaqFabsHm = DecimalUtil.ZERO ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A764ProForCod = "" ;
      AV10BarSer = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      AV72ErrMensaje = "" ;
      AV69RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV80hdrscreadastojson = "" ;
      AV12MaqCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7BarCodPar = "" ;
      AV88Prompt = "" ;
      AV91Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV14Tot_kgs = DecimalUtil.ZERO ;
      AV39ArtFacabs = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      AV44MaqfacAbs = DecimalUtil.ZERO ;
      AV45MaqFabsh = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H01HG2_A13734MaqCDsc = new String[] {""} ;
      H01HG3_A13734MaqCDsc = new String[] {""} ;
      H01HG3_A396EmprCod = new String[] {""} ;
      H01HG3_A602MaqCod = new String[] {""} ;
      H01HG4_A13734MaqCDsc = new String[] {""} ;
      H01HG4_A396EmprCod = new String[] {""} ;
      H01HG4_A602MaqCod = new String[] {""} ;
      AV48EmprNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV62F_ok = "" ;
      Gx_msg = "" ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      AV81Hdrscreadas_SDTs = new GXBaseCollection<app.SdtHdrscreadas_SDT>(app.SdtHdrscreadas_SDT.class, "Hdrscreadas_SDT", "TexplusNET", remoteHandle);
      AV82Hdrscreadas_SDT = new app.SdtHdrscreadas_SDT(remoteHandle, context);
      AV85BarcodparSDT = "" ;
      H01HG5_A13734MaqCDsc = new String[] {""} ;
      H01HG5_A396EmprCod = new String[] {""} ;
      H01HG5_A602MaqCod = new String[] {""} ;
      H01HG7_A130BarCodPar = new String[] {""} ;
      H01HG7_A132BarCodReo = new byte[1] ;
      H01HG7_A129BarCod = new int[1] ;
      H01HG7_A396EmprCod = new String[] {""} ;
      H01HG7_A252CliCod = new int[1] ;
      H01HG7_n252CliCod = new boolean[] {false} ;
      H01HG7_A279CliNom = new String[] {""} ;
      H01HG7_A212BarSer = new String[] {""} ;
      H01HG7_A143BarDisNum = new String[] {""} ;
      H01HG7_A127BarAncCru1 = new short[1] ;
      H01HG7_A206BarPle = new String[] {""} ;
      H01HG7_A135BarColNom = new String[] {""} ;
      H01HG7_A136BarColNum = new int[1] ;
      H01HG7_A2836BarPle2 = new String[] {""} ;
      H01HG7_A182BarMat = new String[] {""} ;
      H01HG7_A213BarSit = new byte[1] ;
      H01HG7_A118BarAcaQui = new String[] {""} ;
      H01HG7_A1652BarSerDsc = new String[] {""} ;
      H01HG7_A864BarPes = new short[1] ;
      H01HG7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV37CliNom = "" ;
      AV36bardisnum = "" ;
      AV34BarPle = "" ;
      AV33BarColNom = "" ;
      AV31Contextura = "" ;
      AV30BarMat = "" ;
      AV28BarAcaqui = "" ;
      AV27BarSerDsc = "" ;
      H01HG8_A396EmprCod = new String[] {""} ;
      H01HG8_A129BarCod = new int[1] ;
      H01HG8_A132BarCodReo = new byte[1] ;
      H01HG8_A130BarCodPar = new String[] {""} ;
      H01HG8_A758ProCod = new String[] {""} ;
      H01HG8_A759ProDsc = new String[] {""} ;
      AV43ProDsc = "" ;
      H01HG9_A396EmprCod = new String[] {""} ;
      H01HG9_A129BarCod = new int[1] ;
      H01HG9_A132BarCodReo = new byte[1] ;
      H01HG9_A130BarCodPar = new String[] {""} ;
      H01HG9_A758ProCod = new String[] {""} ;
      H01HG9_A150BarFacTin = new String[] {""} ;
      H01HG9_A194BarOrdLin = new short[1] ;
      H01HG10_A6039RecAcab = new String[] {""} ;
      H01HG10_n6039RecAcab = new boolean[] {false} ;
      H01HG10_A130BarCodPar = new String[] {""} ;
      H01HG10_A132BarCodReo = new byte[1] ;
      H01HG10_A129BarCod = new int[1] ;
      H01HG10_A396EmprCod = new String[] {""} ;
      H01HG10_A602MaqCod = new String[] {""} ;
      H01HG10_A2804RecLinMaq = new short[1] ;
      AV23DdmmAAAA = "" ;
      AV22BarAgrLot = "" ;
      AV20BarFasecod = "" ;
      AV19BarMaqTin = "" ;
      H01HG11_A1929EstTinNr = new short[1] ;
      H01HG11_A6634BarRecAcb = new String[] {""} ;
      H01HG11_n6634BarRecAcb = new boolean[] {false} ;
      H01HG11_A1935BarParTin = new String[] {""} ;
      H01HG11_n1935BarParTin = new boolean[] {false} ;
      H01HG11_A1934BarReoTin = new byte[1] ;
      H01HG11_n1934BarReoTin = new boolean[] {false} ;
      H01HG11_A1933BarCodTin = new int[1] ;
      H01HG11_n1933BarCodTin = new boolean[] {false} ;
      H01HG11_A396EmprCod = new String[] {""} ;
      H01HG11_A3646EstTinAny = new short[1] ;
      H01HG11_A3647EstTinMes = new byte[1] ;
      H01HG11_A3648EstTinDia = new byte[1] ;
      H01HG11_A2316BarAgrLot = new String[] {""} ;
      H01HG11_n2316BarAgrLot = new boolean[] {false} ;
      H01HG11_A4926BarFaseOrd = new short[1] ;
      H01HG11_n4926BarFaseOrd = new boolean[] {false} ;
      H01HG11_A4925BarFaseCod = new String[] {""} ;
      H01HG11_n4925BarFaseCod = new boolean[] {false} ;
      H01HG11_A1945BarMaqTin = new String[] {""} ;
      H01HG11_n1945BarMaqTin = new boolean[] {false} ;
      H01HG12_A4545HreLinMaq = new short[1] ;
      H01HG12_A4495HreNumCie = new byte[1] ;
      H01HG12_A9804HreAcab = new String[] {""} ;
      H01HG12_n9804HreAcab = new boolean[] {false} ;
      H01HG12_A4494HreBarPar = new String[] {""} ;
      H01HG12_A4493HreBarReo = new byte[1] ;
      H01HG12_A4492HreBarCod = new int[1] ;
      H01HG12_A396EmprCod = new String[] {""} ;
      H01HG12_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      H01HG12_n4529HreFecTin = new boolean[] {false} ;
      H01HG12_A4964HreOrdLin = new short[1] ;
      H01HG12_n4964HreOrdLin = new boolean[] {false} ;
      H01HG12_A4963HreFasCod = new String[] {""} ;
      H01HG12_n4963HreFasCod = new boolean[] {false} ;
      H01HG12_A4546HreMaqCod = new String[] {""} ;
      H01HG12_n4546HreMaqCod = new boolean[] {false} ;
      AV15Tot_mts = DecimalUtil.ZERO ;
      c6035Ac_Kilos = DecimalUtil.ZERO ;
      c6034Ac_Metros = DecimalUtil.ZERO ;
      H01HG13_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG13_n6035Ac_Kilos = new boolean[] {false} ;
      H01HG13_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG13_n6034Ac_Metros = new boolean[] {false} ;
      H01HG14_A10042ArtMqFa = new String[] {""} ;
      H01HG14_A10041ArtSH = new String[] {""} ;
      H01HG14_A65ArtCod = new String[] {""} ;
      H01HG14_A252CliCod = new int[1] ;
      H01HG14_n252CliCod = new boolean[] {false} ;
      H01HG14_A396EmprCod = new String[] {""} ;
      H01HG14_A10044ArtFaMq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG14_n10044ArtFaMq = new boolean[] {false} ;
      H01HG15_A65ArtCod = new String[] {""} ;
      H01HG15_A252CliCod = new int[1] ;
      H01HG15_n252CliCod = new boolean[] {false} ;
      H01HG15_A396EmprCod = new String[] {""} ;
      H01HG15_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG15_n9730ArtFabsH = new boolean[] {false} ;
      H01HG15_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG15_n2791ArtFacAbs = new boolean[] {false} ;
      H01HG16_A602MaqCod = new String[] {""} ;
      H01HG16_A396EmprCod = new String[] {""} ;
      H01HG16_A606MaqDsc = new String[] {""} ;
      H01HG16_n606MaqDsc = new boolean[] {false} ;
      H01HG16_A2801MaqVolRes = new int[1] ;
      H01HG16_n2801MaqVolRes = new boolean[] {false} ;
      H01HG16_A2802MaqVolTop = new int[1] ;
      H01HG16_n2802MaqVolTop = new boolean[] {false} ;
      H01HG16_A6284MaqFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG16_n6284MaqFacAbs = new boolean[] {false} ;
      H01HG16_A9982MaqFabsHm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HG16_n9982MaqFabsHm = new boolean[] {false} ;
      H01HG16_A625MaqVolMin = new int[1] ;
      H01HG16_n625MaqVolMin = new boolean[] {false} ;
      H01HG17_A603MaqCodBis = new String[] {""} ;
      H01HG17_A194BarOrdLin = new short[1] ;
      H01HG17_A758ProCod = new String[] {""} ;
      H01HG17_A130BarCodPar = new String[] {""} ;
      H01HG17_A132BarCodReo = new byte[1] ;
      H01HG17_A129BarCod = new int[1] ;
      H01HG17_A396EmprCod = new String[] {""} ;
      H01HG17_A4287BarFasFor = new String[] {""} ;
      H01HG17_A4905BarFasAcab = new String[] {""} ;
      H01HG17_A457FasCod = new String[] {""} ;
      AV63FasCod = "" ;
      AV61Proforcod = "" ;
      H01HG18_A396EmprCod = new String[] {""} ;
      H01HG18_A129BarCod = new int[1] ;
      H01HG18_A132BarCodReo = new byte[1] ;
      H01HG18_A130BarCodPar = new String[] {""} ;
      H01HG18_A758ProCod = new String[] {""} ;
      H01HG18_A194BarOrdLin = new short[1] ;
      H01HG18_A764ProForCod = new String[] {""} ;
      H01HG18_A5371FasQuiLin = new short[1] ;
      H01HG19_A396EmprCod = new String[] {""} ;
      H01HG19_A6031Ac_Barcod = new int[1] ;
      H01HG19_A6032Ac_BarReo = new byte[1] ;
      H01HG19_A6033Ac_BarPar = new String[] {""} ;
      H01HG19_A129BarCod = new int[1] ;
      H01HG19_A132BarCodReo = new byte[1] ;
      H01HG19_A130BarCodPar = new String[] {""} ;
      H01HG20_A2804RecLinMaq = new short[1] ;
      H01HG20_A6039RecAcab = new String[] {""} ;
      H01HG20_n6039RecAcab = new boolean[] {false} ;
      H01HG20_A130BarCodPar = new String[] {""} ;
      H01HG20_A132BarCodReo = new byte[1] ;
      H01HG20_A129BarCod = new int[1] ;
      H01HG20_A396EmprCod = new String[] {""} ;
      H01HG20_A602MaqCod = new String[] {""} ;
      H01HG20_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01HG20_n4866RecFecAlt = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01HG21_A13734MaqCDsc = new String[] {""} ;
      H01HG21_A396EmprCod = new String[] {""} ;
      H01HG21_A602MaqCod = new String[] {""} ;
      ZV12MaqCod = "" ;
      ZhV12MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado00_wp__default(),
         new Object[] {
             new Object[] {
            H01HG2_A13734MaqCDsc
            }
            , new Object[] {
            H01HG3_A13734MaqCDsc, H01HG3_A396EmprCod, H01HG3_A602MaqCod
            }
            , new Object[] {
            H01HG4_A13734MaqCDsc, H01HG4_A396EmprCod, H01HG4_A602MaqCod
            }
            , new Object[] {
            H01HG5_A13734MaqCDsc, H01HG5_A396EmprCod, H01HG5_A602MaqCod
            }
            , new Object[] {
            H01HG7_A130BarCodPar, H01HG7_A132BarCodReo, H01HG7_A129BarCod, H01HG7_A396EmprCod, H01HG7_A252CliCod, H01HG7_n252CliCod, H01HG7_A279CliNom, H01HG7_A212BarSer, H01HG7_A143BarDisNum, H01HG7_A127BarAncCru1,
            H01HG7_A206BarPle, H01HG7_A135BarColNom, H01HG7_A136BarColNum, H01HG7_A2836BarPle2, H01HG7_A182BarMat, H01HG7_A213BarSit, H01HG7_A118BarAcaQui, H01HG7_A1652BarSerDsc, H01HG7_A864BarPes, H01HG7_A166BarKgm,
            H01HG7_A184BarMtr
            }
            , new Object[] {
            H01HG8_A396EmprCod, H01HG8_A129BarCod, H01HG8_A132BarCodReo, H01HG8_A130BarCodPar, H01HG8_A758ProCod, H01HG8_A759ProDsc
            }
            , new Object[] {
            H01HG9_A396EmprCod, H01HG9_A129BarCod, H01HG9_A132BarCodReo, H01HG9_A130BarCodPar, H01HG9_A758ProCod, H01HG9_A150BarFacTin, H01HG9_A194BarOrdLin
            }
            , new Object[] {
            H01HG10_A6039RecAcab, H01HG10_n6039RecAcab, H01HG10_A130BarCodPar, H01HG10_A132BarCodReo, H01HG10_A129BarCod, H01HG10_A396EmprCod, H01HG10_A602MaqCod, H01HG10_A2804RecLinMaq
            }
            , new Object[] {
            H01HG11_A1929EstTinNr, H01HG11_A6634BarRecAcb, H01HG11_n6634BarRecAcb, H01HG11_A1935BarParTin, H01HG11_n1935BarParTin, H01HG11_A1934BarReoTin, H01HG11_n1934BarReoTin, H01HG11_A1933BarCodTin, H01HG11_n1933BarCodTin, H01HG11_A396EmprCod,
            H01HG11_A3646EstTinAny, H01HG11_A3647EstTinMes, H01HG11_A3648EstTinDia, H01HG11_A2316BarAgrLot, H01HG11_n2316BarAgrLot, H01HG11_A4926BarFaseOrd, H01HG11_n4926BarFaseOrd, H01HG11_A4925BarFaseCod, H01HG11_n4925BarFaseCod, H01HG11_A1945BarMaqTin,
            H01HG11_n1945BarMaqTin
            }
            , new Object[] {
            H01HG12_A4545HreLinMaq, H01HG12_A4495HreNumCie, H01HG12_A9804HreAcab, H01HG12_n9804HreAcab, H01HG12_A4494HreBarPar, H01HG12_A4493HreBarReo, H01HG12_A4492HreBarCod, H01HG12_A396EmprCod, H01HG12_A4529HreFecTin, H01HG12_n4529HreFecTin,
            H01HG12_A4964HreOrdLin, H01HG12_n4964HreOrdLin, H01HG12_A4963HreFasCod, H01HG12_n4963HreFasCod, H01HG12_A4546HreMaqCod, H01HG12_n4546HreMaqCod
            }
            , new Object[] {
            H01HG13_A6035Ac_Kilos, H01HG13_n6035Ac_Kilos, H01HG13_A6034Ac_Metros, H01HG13_n6034Ac_Metros
            }
            , new Object[] {
            H01HG14_A10042ArtMqFa, H01HG14_A10041ArtSH, H01HG14_A65ArtCod, H01HG14_A252CliCod, H01HG14_A396EmprCod, H01HG14_A10044ArtFaMq, H01HG14_n10044ArtFaMq
            }
            , new Object[] {
            H01HG15_A65ArtCod, H01HG15_A252CliCod, H01HG15_A396EmprCod, H01HG15_A9730ArtFabsH, H01HG15_n9730ArtFabsH, H01HG15_A2791ArtFacAbs, H01HG15_n2791ArtFacAbs
            }
            , new Object[] {
            H01HG16_A602MaqCod, H01HG16_A396EmprCod, H01HG16_A606MaqDsc, H01HG16_n606MaqDsc, H01HG16_A2801MaqVolRes, H01HG16_n2801MaqVolRes, H01HG16_A2802MaqVolTop, H01HG16_n2802MaqVolTop, H01HG16_A6284MaqFacAbs, H01HG16_n6284MaqFacAbs,
            H01HG16_A9982MaqFabsHm, H01HG16_n9982MaqFabsHm, H01HG16_A625MaqVolMin, H01HG16_n625MaqVolMin
            }
            , new Object[] {
            H01HG17_A603MaqCodBis, H01HG17_A194BarOrdLin, H01HG17_A758ProCod, H01HG17_A130BarCodPar, H01HG17_A132BarCodReo, H01HG17_A129BarCod, H01HG17_A396EmprCod, H01HG17_A4287BarFasFor, H01HG17_A4905BarFasAcab, H01HG17_A457FasCod
            }
            , new Object[] {
            H01HG18_A396EmprCod, H01HG18_A129BarCod, H01HG18_A132BarCodReo, H01HG18_A130BarCodPar, H01HG18_A758ProCod, H01HG18_A194BarOrdLin, H01HG18_A764ProForCod, H01HG18_A5371FasQuiLin
            }
            , new Object[] {
            H01HG19_A396EmprCod, H01HG19_A6031Ac_Barcod, H01HG19_A6032Ac_BarReo, H01HG19_A6033Ac_BarPar, H01HG19_A129BarCod, H01HG19_A132BarCodReo, H01HG19_A130BarCodPar
            }
            , new Object[] {
            H01HG20_A2804RecLinMaq, H01HG20_A6039RecAcab, H01HG20_n6039RecAcab, H01HG20_A130BarCodPar, H01HG20_A132BarCodReo, H01HG20_A129BarCod, H01HG20_A396EmprCod, H01HG20_A602MaqCod, H01HG20_A4866RecFecAlt, H01HG20_n4866RecFecAlt
            }
            , new Object[] {
            H01HG21_A13734MaqCDsc, H01HG21_A396EmprCod, H01HG21_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMaqvoltop_Enabled = 0 ;
      edtavMaqvolres_Enabled = 0 ;
      edtavTot_kgs_Enabled = 0 ;
      edtavArtfacabs_Enabled = 0 ;
      edtavLtsini_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV29Barsit ;
   private byte AV66CodReo_p ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A1934BarReoTin ;
   private byte A3648EstTinDia ;
   private byte A3647EstTinMes ;
   private byte A4493HreBarReo ;
   private byte A6032Ac_BarReo ;
   private byte AV6BarCodReo ;
   private byte nDonePA ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV84BarcodreoSDT ;
   private byte A4495HreNumCie ;
   private byte AV104GXLvl405 ;
   private byte nGXWrapped ;
   private short nRcdExists_16 ;
   private short nIsMod_16 ;
   private short nRcdExists_15 ;
   private short nIsMod_15 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short nRcdExists_14 ;
   private short nIsMod_14 ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short AV46FabsMq ;
   private short AV54Sit9 ;
   private short AV40Ltsrc ;
   private short AV41Torient ;
   private short AV38Barcad ;
   private short AV55FaseAca ;
   private short AV64Hdraca ;
   private short A127BarAncCru1 ;
   private short A864BarPes ;
   private short A194BarOrdLin ;
   private short A2804RecLinMaq ;
   private short A3646EstTinAny ;
   private short A4926BarFaseOrd ;
   private short A4964HreOrdLin ;
   private short A5371FasQuiLin ;
   private short AV68RecmaqA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV73LtsMn ;
   private short AV86ReclinmaqSDT ;
   private short AV35Baranccru1 ;
   private short AV26BarPes ;
   private short AV25Tinte ;
   private short AV24recmaq ;
   private short AV18Lconti ;
   private short AV21BarFaseOrd ;
   private short AV57Fasqui ;
   private short AV58BarOrdLin ;
   private short AV59fasquilin ;
   private short AV60Num_p ;
   private int AV70VolMul ;
   private int AV65BarCod_p ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1933BarCodTin ;
   private int A4492HreBarCod ;
   private int A6031Ac_Barcod ;
   private int A2801MaqVolRes ;
   private int A2802MaqVolTop ;
   private int A625MaqVolMin ;
   private int AV9CliCod ;
   private int AV5BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int AV53MaqVolTop ;
   private int edtavMaqvoltop_Enabled ;
   private int AV52MaqVolRes ;
   private int edtavMaqvolres_Enabled ;
   private int edtavTot_kgs_Enabled ;
   private int edtavArtfacabs_Enabled ;
   private int AV71LtsIni ;
   private int edtavLtsini_Enabled ;
   private int lblTextblock1_Fontsize ;
   private int edtavMaqfacabs_Visible ;
   private int edtavMaqfabsh_Visible ;
   private int gxdynajaxindex ;
   private int GXt_int5 ;
   private int GXv_int11[] ;
   private int GXv_int6[] ;
   private int AV93GXV1 ;
   private int AV83BarcodSDT ;
   private int AV94GXV2 ;
   private int AV32BarColNum ;
   private int AV51MaqVolMin ;
   private int idxLst ;
   private java.math.BigDecimal AV13ArtFamq ;
   private java.math.BigDecimal AV16BarKgm ;
   private java.math.BigDecimal AV17BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A10044ArtFaMq ;
   private java.math.BigDecimal A6284MaqFacAbs ;
   private java.math.BigDecimal A9982MaqFabsHm ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9730ArtFabsH ;
   private java.math.BigDecimal AV14Tot_kgs ;
   private java.math.BigDecimal AV39ArtFacabs ;
   private java.math.BigDecimal AV44MaqfacAbs ;
   private java.math.BigDecimal AV45MaqFabsh ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV15Tot_mts ;
   private java.math.BigDecimal c6035Ac_Kilos ;
   private java.math.BigDecimal c6034Ac_Metros ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV11HumSec ;
   private String AV49UsurCod ;
   private String AV47Station ;
   private String GXKey ;
   private String AV50MaqDsc ;
   private String AV56BarFasFor ;
   private String AV67CodPar ;
   private String AV8EmprCod ;
   private String AV42Procod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A143BarDisNum ;
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
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A764ProForCod ;
   private String AV10BarSer ;
   private String AV12MaqCod ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String divUnnamedtable3_Internalname ;
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
   private String divUnnamedtable4_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqvoltop_Internalname ;
   private String edtavMaqvoltop_Jsonclick ;
   private String edtavMaqvolres_Internalname ;
   private String edtavMaqvolres_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavTot_kgs_Internalname ;
   private String edtavTot_kgs_Jsonclick ;
   private String edtavArtfacabs_Internalname ;
   private String edtavArtfacabs_Jsonclick ;
   private String edtavLtsini_Internalname ;
   private String edtavLtsini_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Caption ;
   private String lblTextblock1_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqfacabs_Internalname ;
   private String edtavMaqfacabs_Jsonclick ;
   private String edtavMaqfabsh_Internalname ;
   private String edtavMaqfabsh_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV48EmprNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV62F_ok ;
   private String Gx_msg ;
   private String AV85BarcodparSDT ;
   private String AV37CliNom ;
   private String AV36bardisnum ;
   private String AV34BarPle ;
   private String AV33BarColNom ;
   private String AV31Contextura ;
   private String AV30BarMat ;
   private String AV28BarAcaqui ;
   private String AV27BarSerDsc ;
   private String AV43ProDsc ;
   private String AV23DdmmAAAA ;
   private String AV22BarAgrLot ;
   private String AV20BarFasecod ;
   private String AV19BarMaqTin ;
   private String AV63FasCod ;
   private String AV61Proforcod ;
   private String ZV12MaqCod ;
   private java.util.Date AV69RecFecAlt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4529HreFecTin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV88Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n6039RecAcab ;
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
   private boolean n606MaqDsc ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n6284MaqFacAbs ;
   private boolean n9982MaqFabsHm ;
   private boolean n625MaqVolMin ;
   private boolean n4866RecFecAlt ;
   private String A13734MaqCDsc ;
   private String hV12MaqCod ;
   private String AV79ErrMensaje1 ;
   private String AV72ErrMensaje ;
   private String AV80hdrscreadastojson ;
   private String AV91Prompt_GXI ;
   private String l13734MaqCDsc ;
   private String ZhV12MaqCod ;
   private String AV88Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private IDataStoreProvider pr_default ;
   private String[] H01HG2_A13734MaqCDsc ;
   private String[] H01HG3_A13734MaqCDsc ;
   private String[] H01HG3_A396EmprCod ;
   private String[] H01HG3_A602MaqCod ;
   private String[] H01HG4_A13734MaqCDsc ;
   private String[] H01HG4_A396EmprCod ;
   private String[] H01HG4_A602MaqCod ;
   private String[] H01HG5_A13734MaqCDsc ;
   private String[] H01HG5_A396EmprCod ;
   private String[] H01HG5_A602MaqCod ;
   private String[] H01HG7_A130BarCodPar ;
   private byte[] H01HG7_A132BarCodReo ;
   private int[] H01HG7_A129BarCod ;
   private String[] H01HG7_A396EmprCod ;
   private int[] H01HG7_A252CliCod ;
   private boolean[] H01HG7_n252CliCod ;
   private String[] H01HG7_A279CliNom ;
   private String[] H01HG7_A212BarSer ;
   private String[] H01HG7_A143BarDisNum ;
   private short[] H01HG7_A127BarAncCru1 ;
   private String[] H01HG7_A206BarPle ;
   private String[] H01HG7_A135BarColNom ;
   private int[] H01HG7_A136BarColNum ;
   private String[] H01HG7_A2836BarPle2 ;
   private String[] H01HG7_A182BarMat ;
   private byte[] H01HG7_A213BarSit ;
   private String[] H01HG7_A118BarAcaQui ;
   private String[] H01HG7_A1652BarSerDsc ;
   private short[] H01HG7_A864BarPes ;
   private java.math.BigDecimal[] H01HG7_A166BarKgm ;
   private java.math.BigDecimal[] H01HG7_A184BarMtr ;
   private String[] H01HG8_A396EmprCod ;
   private int[] H01HG8_A129BarCod ;
   private byte[] H01HG8_A132BarCodReo ;
   private String[] H01HG8_A130BarCodPar ;
   private String[] H01HG8_A758ProCod ;
   private String[] H01HG8_A759ProDsc ;
   private String[] H01HG9_A396EmprCod ;
   private int[] H01HG9_A129BarCod ;
   private byte[] H01HG9_A132BarCodReo ;
   private String[] H01HG9_A130BarCodPar ;
   private String[] H01HG9_A758ProCod ;
   private String[] H01HG9_A150BarFacTin ;
   private short[] H01HG9_A194BarOrdLin ;
   private String[] H01HG10_A6039RecAcab ;
   private boolean[] H01HG10_n6039RecAcab ;
   private String[] H01HG10_A130BarCodPar ;
   private byte[] H01HG10_A132BarCodReo ;
   private int[] H01HG10_A129BarCod ;
   private String[] H01HG10_A396EmprCod ;
   private String[] H01HG10_A602MaqCod ;
   private short[] H01HG10_A2804RecLinMaq ;
   private short[] H01HG11_A1929EstTinNr ;
   private String[] H01HG11_A6634BarRecAcb ;
   private boolean[] H01HG11_n6634BarRecAcb ;
   private String[] H01HG11_A1935BarParTin ;
   private boolean[] H01HG11_n1935BarParTin ;
   private byte[] H01HG11_A1934BarReoTin ;
   private boolean[] H01HG11_n1934BarReoTin ;
   private int[] H01HG11_A1933BarCodTin ;
   private boolean[] H01HG11_n1933BarCodTin ;
   private String[] H01HG11_A396EmprCod ;
   private short[] H01HG11_A3646EstTinAny ;
   private byte[] H01HG11_A3647EstTinMes ;
   private byte[] H01HG11_A3648EstTinDia ;
   private String[] H01HG11_A2316BarAgrLot ;
   private boolean[] H01HG11_n2316BarAgrLot ;
   private short[] H01HG11_A4926BarFaseOrd ;
   private boolean[] H01HG11_n4926BarFaseOrd ;
   private String[] H01HG11_A4925BarFaseCod ;
   private boolean[] H01HG11_n4925BarFaseCod ;
   private String[] H01HG11_A1945BarMaqTin ;
   private boolean[] H01HG11_n1945BarMaqTin ;
   private short[] H01HG12_A4545HreLinMaq ;
   private byte[] H01HG12_A4495HreNumCie ;
   private String[] H01HG12_A9804HreAcab ;
   private boolean[] H01HG12_n9804HreAcab ;
   private String[] H01HG12_A4494HreBarPar ;
   private byte[] H01HG12_A4493HreBarReo ;
   private int[] H01HG12_A4492HreBarCod ;
   private String[] H01HG12_A396EmprCod ;
   private java.util.Date[] H01HG12_A4529HreFecTin ;
   private boolean[] H01HG12_n4529HreFecTin ;
   private short[] H01HG12_A4964HreOrdLin ;
   private boolean[] H01HG12_n4964HreOrdLin ;
   private String[] H01HG12_A4963HreFasCod ;
   private boolean[] H01HG12_n4963HreFasCod ;
   private String[] H01HG12_A4546HreMaqCod ;
   private boolean[] H01HG12_n4546HreMaqCod ;
   private java.math.BigDecimal[] H01HG13_A6035Ac_Kilos ;
   private boolean[] H01HG13_n6035Ac_Kilos ;
   private java.math.BigDecimal[] H01HG13_A6034Ac_Metros ;
   private boolean[] H01HG13_n6034Ac_Metros ;
   private String[] H01HG14_A10042ArtMqFa ;
   private String[] H01HG14_A10041ArtSH ;
   private String[] H01HG14_A65ArtCod ;
   private int[] H01HG14_A252CliCod ;
   private boolean[] H01HG14_n252CliCod ;
   private String[] H01HG14_A396EmprCod ;
   private java.math.BigDecimal[] H01HG14_A10044ArtFaMq ;
   private boolean[] H01HG14_n10044ArtFaMq ;
   private String[] H01HG15_A65ArtCod ;
   private int[] H01HG15_A252CliCod ;
   private boolean[] H01HG15_n252CliCod ;
   private String[] H01HG15_A396EmprCod ;
   private java.math.BigDecimal[] H01HG15_A9730ArtFabsH ;
   private boolean[] H01HG15_n9730ArtFabsH ;
   private java.math.BigDecimal[] H01HG15_A2791ArtFacAbs ;
   private boolean[] H01HG15_n2791ArtFacAbs ;
   private String[] H01HG16_A602MaqCod ;
   private String[] H01HG16_A396EmprCod ;
   private String[] H01HG16_A606MaqDsc ;
   private boolean[] H01HG16_n606MaqDsc ;
   private int[] H01HG16_A2801MaqVolRes ;
   private boolean[] H01HG16_n2801MaqVolRes ;
   private int[] H01HG16_A2802MaqVolTop ;
   private boolean[] H01HG16_n2802MaqVolTop ;
   private java.math.BigDecimal[] H01HG16_A6284MaqFacAbs ;
   private boolean[] H01HG16_n6284MaqFacAbs ;
   private java.math.BigDecimal[] H01HG16_A9982MaqFabsHm ;
   private boolean[] H01HG16_n9982MaqFabsHm ;
   private int[] H01HG16_A625MaqVolMin ;
   private boolean[] H01HG16_n625MaqVolMin ;
   private String[] H01HG17_A603MaqCodBis ;
   private short[] H01HG17_A194BarOrdLin ;
   private String[] H01HG17_A758ProCod ;
   private String[] H01HG17_A130BarCodPar ;
   private byte[] H01HG17_A132BarCodReo ;
   private int[] H01HG17_A129BarCod ;
   private String[] H01HG17_A396EmprCod ;
   private String[] H01HG17_A4287BarFasFor ;
   private String[] H01HG17_A4905BarFasAcab ;
   private String[] H01HG17_A457FasCod ;
   private String[] H01HG18_A396EmprCod ;
   private int[] H01HG18_A129BarCod ;
   private byte[] H01HG18_A132BarCodReo ;
   private String[] H01HG18_A130BarCodPar ;
   private String[] H01HG18_A758ProCod ;
   private short[] H01HG18_A194BarOrdLin ;
   private String[] H01HG18_A764ProForCod ;
   private short[] H01HG18_A5371FasQuiLin ;
   private String[] H01HG19_A396EmprCod ;
   private int[] H01HG19_A6031Ac_Barcod ;
   private byte[] H01HG19_A6032Ac_BarReo ;
   private String[] H01HG19_A6033Ac_BarPar ;
   private int[] H01HG19_A129BarCod ;
   private byte[] H01HG19_A132BarCodReo ;
   private String[] H01HG19_A130BarCodPar ;
   private short[] H01HG20_A2804RecLinMaq ;
   private String[] H01HG20_A6039RecAcab ;
   private boolean[] H01HG20_n6039RecAcab ;
   private String[] H01HG20_A130BarCodPar ;
   private byte[] H01HG20_A132BarCodReo ;
   private int[] H01HG20_A129BarCod ;
   private String[] H01HG20_A396EmprCod ;
   private String[] H01HG20_A602MaqCod ;
   private java.util.Date[] H01HG20_A4866RecFecAlt ;
   private boolean[] H01HG20_n4866RecFecAlt ;
   private String[] H01HG21_A13734MaqCDsc ;
   private String[] H01HG21_A396EmprCod ;
   private String[] H01HG21_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtHdrscreadas_SDT> AV81Hdrscreadas_SDTs ;
   private app.SdtHdrscreadas_SDT AV82Hdrscreadas_SDT ;
}

final  class recetasdeacabado00_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01HG2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?) ORDER BY MaqCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG3", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG4", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG5", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE MaqCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG7", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T3.CliNom, T1.BarSer, T1.BarDisNum, T1.BarAncCru1, T1.BarPle, T1.BarColNom, T1.BarColNum, T1.BarPle2, T1.BarMat, T1.BarSit, T1.BarAcaQui, T1.BarSerDsc, T1.BarPes, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01HG8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarFacTin, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?) AND (BarFacTin = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG10", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, MaqCod, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab <> 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG11", "SELECT EstTinNr, BarRecAcb, BarParTin, BarReoTin, BarCodTin, EmprCod, EstTinAny, EstTinMes, EstTinDia, BarAgrLot, BarFaseOrd, BarFaseCod, BarMaqTin FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarRecAcb = 'S') ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG12", "SELECT T1.HreLinMaq, T1.HreNumCie, T1.HreAcab, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.HreFecTin, T1.HreOrdLin, T1.HreFasCod, T1.HreMaqCod FROM (TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) WHERE (T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ?) AND (T1.HreAcab = 'S') ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG13", "SELECT SUM(Ac_Kilos), SUM(Ac_Metros) FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG14", "SELECT ArtMqFa, ArtSH, ArtCod, CliCod, EmprCod, ArtFaMq FROM TXPCLATF1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtSH = ? and ArtMqFa = ? ORDER BY EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01HG15", "SELECT ArtCod, CliCod, EmprCod, ArtFabsH, ArtFacAbs FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01HG16", "SELECT MaqCod, EmprCod, MaqDsc, MaqVolRes, MaqVolTop, MaqFacAbs, MaqFabsHm, MaqVolMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01HG17", "SELECT MaqCodBis, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasFor, BarFasAcab, FasCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasAcab = 'S') AND (BarFasFor = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG18", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG19", "SELECT EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG20", "SELECT RecLinMaq, RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, MaqCod, RecFecAlt FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HG21", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 9 :
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
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 13 :
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
            case 14 :
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
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 17 :
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
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
      }
   }

}

