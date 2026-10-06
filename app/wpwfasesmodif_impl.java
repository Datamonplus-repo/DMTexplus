package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpwfasesmodif_impl extends GXDataArea
{
   public wpwfasesmodif_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpwfasesmodif_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpwfasesmodif_impl.class ));
   }

   public wpwfasesmodif_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavBarfasest = new HTMLChoice();
      cmbavBarfascon = new HTMLChoice();
      cmbavBarfactin = new HTMLChoice();
      cmbavBarfasacab = new HTMLChoice();
      cmbavBarfasfor = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFASCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfascodFL0( A396EmprCod, A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODBIS") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodbisFL0( A396EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFASCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfascodFL0( A396EmprCod, A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vFASCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV16Fascod = httpContext.GetPar( "hV16Fascod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvfascodFL2( A396EmprCod, hV16Fascod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODBIS") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodbisFL0( A396EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCODBIS") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV19MaqCodBis = httpContext.GetPar( "hV19MaqCodBis") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodbisFL2( A396EmprCod, hV19MaqCodBis) ;
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A759ProDsc = httpContext.GetPar( "ProDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
      paFL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startFL2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpwfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFACTIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A150BarFacTin, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASCON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A152BarFasCon, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECREA", getSecureSignedToken( "", A160BarFecRea));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECRINI", getSecureSignedToken( "", A3298BarFecRIni));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHORFIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHORINI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARTIETEO", getSecureSignedToken( "", localUtil.format( A216BarTieTeo, "Z9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNI", getSecureSignedToken( "", localUtil.format( A227BarUni, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCODBIS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A603MaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vTMAQUIN", GXutil.ltrim( localUtil.ntoc( AV21Tmaquin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFASPRO", GXutil.ltrim( localUtil.ntoc( AV20Tfaspro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECRINI", localUtil.dtoc( AV11Barfecrini, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNI", GXutil.ltrim( localUtil.ntoc( AV15Baruni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFACTIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A150BarFacTin, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON", GXutil.rtrim( A152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASCON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A152BarFasCon, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECREA", localUtil.dtoc( A160BarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECREA", getSecureSignedToken( "", A160BarFecRea));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECRINI", localUtil.dtoc( A3298BarFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECRINI", getSecureSignedToken( "", A3298BarFecRIni));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHORFIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHORINI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARTIETEO", getSecureSignedToken( "", localUtil.format( A216BarTieTeo, "Z9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNI", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNI", getSecureSignedToken( "", localUtil.format( A227BarUni, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCODBIS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A603MaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV22UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV18Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvFASCOD", GXutil.rtrim( AV16Fascod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCODBIS", GXutil.rtrim( AV19MaqCodBis));
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
         weFL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtFL2( ) ;
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
      return formatLink("app.wpwfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "WPWFasesModif" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modificacion datos Fases", "") ;
   }

   public void wbFL0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPWFasesModif.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarOrdLin_Internalname, httpContext.getMessage( "Orden", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, hV16Fascod, GXutil.rtrim( localUtil.format( hV16Fascod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcodbis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodbis_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodbis_Internalname, hV19MaqCodBis, GXutil.rtrim( localUtil.format( hV19MaqCodBis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodbis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodbis_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasest.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasest, cmbavBarfasest.getInternalname(), GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)), 1, cmbavBarfasest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarfasest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "", true, (byte)(0), "HLP_WPWFasesModif.htm");
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfascon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfascon.getInternalname(), httpContext.getMessage( "Control?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfascon, cmbavBarfascon.getInternalname(), GXutil.rtrim( AV7BarFascon), 1, cmbavBarfascon.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfascon.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "", true, (byte)(0), "HLP_WPWFasesModif.htm");
         cmbavBarfascon.setValue( GXutil.rtrim( AV7BarFascon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfactin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfactin.getInternalname(), httpContext.getMessage( "Tinte?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfactin, cmbavBarfactin.getInternalname(), GXutil.rtrim( AV5Barfactin), 1, cmbavBarfactin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfactin.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "", true, (byte)(0), "HLP_WPWFasesModif.htm");
         cmbavBarfactin.setValue( GXutil.rtrim( AV5Barfactin) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasacab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasacab.getInternalname(), httpContext.getMessage( "Acabado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasacab, cmbavBarfasacab.getInternalname(), GXutil.rtrim( AV6Barfasacab), 1, cmbavBarfasacab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfasacab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "", true, (byte)(0), "HLP_WPWFasesModif.htm");
         cmbavBarfasacab.setValue( GXutil.rtrim( AV6Barfasacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasfor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasfor.getInternalname(), httpContext.getMessage( "Formula ?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasfor, cmbavBarfasfor.getInternalname(), GXutil.rtrim( AV9BarFasfor), 1, cmbavBarfasfor.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfasfor.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "", true, (byte)(0), "HLP_WPWFasesModif.htm");
         cmbavBarfasfor.setValue( GXutil.rtrim( AV9BarFasfor) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartieteo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartieteo_Internalname, httpContext.getMessage( "T Teorico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartieteo_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarTieteo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartieteo_Enabled!=0) ? localUtil.format( AV14BarTieteo, "Z9.99") : localUtil.format( AV14BarTieteo, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartieteo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartieteo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecini_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecini_Internalname, localUtil.format(AV23BarFecIni, "99/99/99"), localUtil.format( AV23BarFecIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPWFasesModif.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhorini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhorini_Internalname, httpContext.getMessage( "Hora ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhorini_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarhorini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarHorIni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarHorIni), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhorini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhorini_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecrea_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecrea_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecrea_Internalname, localUtil.format(AV10Barfecrea, "99/99/99"), localUtil.format( AV10Barfecrea, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecrea_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecrea_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPWFasesModif.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhorfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhorfin_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhorfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV12Barhorfin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarhorfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12Barhorfin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12Barhorfin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhorfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhorfin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPWFasesModif.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPWFasesModif.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startFL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Modificacion datos Fases", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupFL0( ) ;
   }

   public void wsFL2( )
   {
      startFL2( ) ;
      evtFL2( ) ;
   }

   public void evtFL2( )
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
                           e11FL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e12FL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e13FL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e14FL2 ();
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

   public void weFL2( )
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

   public void paFL2( )
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
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvfascodFL0( String A396EmprCod ,
                                String A13781FasCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvfascod_dataFL0( A396EmprCod, A13781FasCDsc) ;
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

   protected void gxsgvvfascod_dataFL0( String A396EmprCod ,
                                        String A13781FasCDsc )
   {
      l13781FasCDsc = GXutil.concat( GXutil.rtrim( A13781FasCDsc), "%", "") ;
      /* Using cursor H00FL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13781FasCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00FL2_A13781FasCDsc[0]);
         gxdynajaxctrldescr.add(H00FL2_A13781FasCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmaqcodbisFL0( String A396EmprCod ,
                                   String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodbis_dataFL0( A396EmprCod, A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcodbis_dataFL0( String A396EmprCod ,
                                           String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H00FL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00FL3_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H00FL3_A13734MaqCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvfascodFL2( String A396EmprCod ,
                                String A13781FasCDsc )
   {
      /* Using cursor H00FL4 */
      pr_default.execute(2, new Object[] {A13781FasCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13781FasCDsc = H00FL4_A13781FasCDsc[0] ;
         A396EmprCod = H00FL4_A396EmprCod[0] ;
         A457FasCod = H00FL4_A457FasCod[0] ;
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\"") ;
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
      pr_default.close(2);
   }

   public void gxhcvvmaqcodbisFL2( String A396EmprCod ,
                                   String A13734MaqCDsc )
   {
      /* Using cursor H00FL5 */
      pr_default.execute(3, new Object[] {A13734MaqCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H00FL5_A13734MaqCDsc[0] ;
         A396EmprCod = H00FL5_A396EmprCod[0] ;
         A602MaqCod = H00FL5_A602MaqCod[0] ;
         pr_default.readNext(3);
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
      pr_default.close(3);
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
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
         AV8BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarFasEst", GXutil.str( AV8BarFasEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      }
      if ( cmbavBarfascon.getItemCount() > 0 )
      {
         AV7BarFascon = cmbavBarfascon.getValidValue(AV7BarFascon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarFascon", AV7BarFascon);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfascon.setValue( GXutil.rtrim( AV7BarFascon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
      }
      if ( cmbavBarfactin.getItemCount() > 0 )
      {
         AV5Barfactin = cmbavBarfactin.getValidValue(AV5Barfactin) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Barfactin", AV5Barfactin);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfactin.setValue( GXutil.rtrim( AV5Barfactin) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
      }
      if ( cmbavBarfasacab.getItemCount() > 0 )
      {
         AV6Barfasacab = cmbavBarfasacab.getValidValue(AV6Barfasacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Barfasacab", AV6Barfasacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasacab.setValue( GXutil.rtrim( AV6Barfasacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
      }
      if ( cmbavBarfasfor.getItemCount() > 0 )
      {
         AV9BarFasfor = cmbavBarfasfor.getValidValue(AV9BarFasfor) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasfor", AV9BarFasfor);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasfor.setValue( GXutil.rtrim( AV9BarFasfor) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfFL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV34Pgmname = "WPWFasesModif" ;
      Gx_err = (short)(0) ;
   }

   public void rfFL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00FL6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A759ProDsc});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A3298BarFecRIni = H00FL6_A3298BarFecRIni[0] ;
            A160BarFecRea = H00FL6_A160BarFecRea[0] ;
            A4287BarFasFor = H00FL6_A4287BarFasFor[0] ;
            A153BarFasEst = H00FL6_A153BarFasEst[0] ;
            A152BarFasCon = H00FL6_A152BarFasCon[0] ;
            A4905BarFasAcab = H00FL6_A4905BarFasAcab[0] ;
            A150BarFacTin = H00FL6_A150BarFacTin[0] ;
            A457FasCod = H00FL6_A457FasCod[0] ;
            A603MaqCodBis = H00FL6_A603MaqCodBis[0] ;
            A227BarUni = H00FL6_A227BarUni[0] ;
            A216BarTieTeo = H00FL6_A216BarTieTeo[0] ;
            A165BarHorIni = H00FL6_A165BarHorIni[0] ;
            A164BarHorFin = H00FL6_A164BarHorFin[0] ;
            /* Execute user event: Load */
            e14FL2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         wbFL0( ) ;
      }
   }

   public void send_integrity_lvl_hashesFL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFACTIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A150BarFacTin, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON", GXutil.rtrim( A152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASCON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A152BarFasCon, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECREA", localUtil.dtoc( A160BarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECREA", getSecureSignedToken( "", A160BarFecRea));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECRINI", localUtil.dtoc( A3298BarFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECRINI", getSecureSignedToken( "", A3298BarFecRIni));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHORFIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARHORINI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARTIETEO", getSecureSignedToken( "", localUtil.format( A216BarTieTeo, "Z9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNI", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNI", getSecureSignedToken( "", localUtil.format( A227BarUni, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCODBIS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A603MaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV22UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
   }

   public void before_start_formulas( )
   {
      AV34Pgmname = "WPWFasesModif" ;
      Gx_err = (short)(0) ;
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      fix_multi_value_controls( ) ;
   }

   public void strupFL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11FL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      /* Using cursor H00FL7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      pr_default.close(5);
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
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         hV16Fascod = httpContext.cgiGet( edtavFascod_Internalname) ;
         if ( (GXutil.strcmp("", hV16Fascod)==0) )
         {
            AV16Fascod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", AV16Fascod);
         }
         else
         {
            A13781FasCDsc = hV16Fascod ;
            /* Using cursor H00FL8 */
            pr_default.execute(6, new Object[] {A13781FasCDsc, A396EmprCod});
            AV16Fascod = H00FL8_A457FasCod[0] ;
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               pr_default.readNext(6);
               if ( ! ( (pr_default.getStatus(6) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "vFASCOD");
                  GX_FocusControl = edtavFascod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(6);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV16Fascod", hV16Fascod);
         hV19MaqCodBis = httpContext.cgiGet( edtavMaqcodbis_Internalname) ;
         if ( (GXutil.strcmp("", hV19MaqCodBis)==0) )
         {
            AV19MaqCodBis = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19MaqCodBis", AV19MaqCodBis);
         }
         else
         {
            A13734MaqCDsc = hV19MaqCodBis ;
            /* Using cursor H00FL9 */
            pr_default.execute(7, new Object[] {A13734MaqCDsc, A396EmprCod});
            AV19MaqCodBis = H00FL9_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               pr_default.readNext(7);
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODBIS");
                  GX_FocusControl = edtavMaqcodbis_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(7);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV19MaqCodBis", hV19MaqCodBis);
         cmbavBarfasest.setValue( httpContext.cgiGet( cmbavBarfasest.getInternalname()) );
         AV8BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarfasest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarFasEst", GXutil.str( AV8BarFasEst, 1, 0));
         cmbavBarfascon.setValue( httpContext.cgiGet( cmbavBarfascon.getInternalname()) );
         AV7BarFascon = httpContext.cgiGet( cmbavBarfascon.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarFascon", AV7BarFascon);
         cmbavBarfactin.setValue( httpContext.cgiGet( cmbavBarfactin.getInternalname()) );
         AV5Barfactin = httpContext.cgiGet( cmbavBarfactin.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Barfactin", AV5Barfactin);
         cmbavBarfasacab.setValue( httpContext.cgiGet( cmbavBarfasacab.getInternalname()) );
         AV6Barfasacab = httpContext.cgiGet( cmbavBarfasacab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Barfasacab", AV6Barfasacab);
         cmbavBarfasfor.setValue( httpContext.cgiGet( cmbavBarfasfor.getInternalname()) );
         AV9BarFasfor = httpContext.cgiGet( cmbavBarfasfor.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasfor", AV9BarFasfor);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBartieteo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBartieteo_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIETEO");
            GX_FocusControl = edtavBartieteo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarTieteo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarTieteo", GXutil.ltrimstr( AV14BarTieteo, 5, 2));
         }
         else
         {
            AV14BarTieteo = localUtil.ctond( httpContext.cgiGet( edtavBartieteo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarTieteo", GXutil.ltrimstr( AV14BarTieteo, 5, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECINI");
            GX_FocusControl = edtavBarfecini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23BarFecIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecIni", localUtil.format(AV23BarFecIni, "99/99/99"));
         }
         else
         {
            AV23BarFecIni = localUtil.ctod( httpContext.cgiGet( edtavBarfecini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecIni", localUtil.format(AV23BarFecIni, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARHORINI");
            GX_FocusControl = edtavBarhorini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarHorIni = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarHorIni), 4, 0));
         }
         else
         {
            AV13BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarhorini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarHorIni), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecrea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECREA");
            GX_FocusControl = edtavBarfecrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10Barfecrea = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barfecrea", localUtil.format(AV10Barfecrea, "99/99/99"));
         }
         else
         {
            AV10Barfecrea = localUtil.ctod( httpContext.cgiGet( edtavBarfecrea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barfecrea", localUtil.format(AV10Barfecrea, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarhorfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARHORFIN");
            GX_FocusControl = edtavBarhorfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Barhorfin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barhorfin), 4, 0));
         }
         else
         {
            AV12Barhorfin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarhorfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barhorfin), 4, 0));
         }
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
      e11FL2 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e11FL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpwfasesmodif_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpwfasesmodif_impl.this.A396EmprCod = GXv_char2[0] ;
      wpwfasesmodif_impl.this.AV29EmprNom = GXv_char3[0] ;
      wpwfasesmodif_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, ""))));
      GXt_char1 = AV28Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wpwfasesmodif_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      GXv_char4[0] = AV32Emprcod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char2[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char3, GXv_char2) ;
      wpwfasesmodif_impl.this.AV32Emprcod = GXv_char4[0] ;
      wpwfasesmodif_impl.this.AV29EmprNom = GXv_char3[0] ;
      wpwfasesmodif_impl.this.AV22UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, ""))));
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
   }

   public void e12FL2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV18Maqcod = AV19MaqCodBis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Maqcod", AV18Maqcod);
      /* Execute user subroutine: 'MAQUIN' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'FASPRO' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         returnInSub = true;
         if (true) return;
      }
      if ( AV21Tmaquin == 0 )
      {
         Gx_msg = httpContext.getMessage( "Codigo Maquina Inexistente", "") + httpContext.getMessage( " en linea ", "") + GXutil.str( A194BarOrdLin, 4, 0) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( AV20Tfaspro == 0 )
         {
            Gx_msg = httpContext.getMessage( "Codigo Fase Inexistente", "") + httpContext.getMessage( " en linea ", "") + GXutil.str( A194BarOrdLin, 4, 0) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_char2[0] = A758ProCod ;
            GXv_int7[0] = A194BarOrdLin ;
            GXv_char8[0] = AV5Barfactin ;
            GXv_char9[0] = AV6Barfasacab ;
            GXv_char10[0] = AV7BarFascon ;
            GXv_int11[0] = AV8BarFasEst ;
            GXv_char12[0] = AV9BarFasfor ;
            GXv_date13[0] = AV10Barfecrea ;
            GXv_date14[0] = AV11Barfecrini ;
            GXv_int15[0] = AV12Barhorfin ;
            GXv_int16[0] = AV13BarHorIni ;
            GXv_decimal17[0] = AV14BarTieteo ;
            GXv_decimal18[0] = AV15Baruni ;
            GXv_char19[0] = AV19MaqCodBis ;
            GXv_char20[0] = AV16Fascod ;
            new app.pfasesmodif(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_date13, GXv_date14, GXv_int15, GXv_int16, GXv_decimal17, GXv_decimal18, GXv_char19, GXv_char20) ;
            wpwfasesmodif_impl.this.A396EmprCod = GXv_char4[0] ;
            wpwfasesmodif_impl.this.A129BarCod = GXv_int5[0] ;
            wpwfasesmodif_impl.this.A132BarCodReo = GXv_int6[0] ;
            wpwfasesmodif_impl.this.A130BarCodPar = GXv_char3[0] ;
            wpwfasesmodif_impl.this.A758ProCod = GXv_char2[0] ;
            wpwfasesmodif_impl.this.A194BarOrdLin = GXv_int7[0] ;
            wpwfasesmodif_impl.this.AV5Barfactin = GXv_char8[0] ;
            wpwfasesmodif_impl.this.AV6Barfasacab = GXv_char9[0] ;
            wpwfasesmodif_impl.this.AV7BarFascon = GXv_char10[0] ;
            wpwfasesmodif_impl.this.AV8BarFasEst = GXv_int11[0] ;
            wpwfasesmodif_impl.this.AV9BarFasfor = GXv_char12[0] ;
            wpwfasesmodif_impl.this.AV10Barfecrea = GXv_date13[0] ;
            wpwfasesmodif_impl.this.AV11Barfecrini = GXv_date14[0] ;
            wpwfasesmodif_impl.this.AV12Barhorfin = GXv_int15[0] ;
            wpwfasesmodif_impl.this.AV13BarHorIni = GXv_int16[0] ;
            wpwfasesmodif_impl.this.AV14BarTieteo = GXv_decimal17[0] ;
            wpwfasesmodif_impl.this.AV15Baruni = GXv_decimal18[0] ;
            wpwfasesmodif_impl.this.AV19MaqCodBis = GXv_char19[0] ;
            wpwfasesmodif_impl.this.AV16Fascod = GXv_char20[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV5Barfactin", AV5Barfactin);
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barfasacab", AV6Barfasacab);
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarFascon", AV7BarFascon);
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarFasEst", GXutil.str( AV8BarFasEst, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasfor", AV9BarFasfor);
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barfecrea", localUtil.format(AV10Barfecrea, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barfecrini", localUtil.format(AV11Barfecrini, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barhorfin), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarHorIni), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarTieteo", GXutil.ltrimstr( AV14BarTieteo, 5, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV15Baruni", GXutil.ltrimstr( AV15Baruni, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV19MaqCodBis", AV19MaqCodBis);
            httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", AV16Fascod);
            new app.pcommit(remoteHandle, context).execute( ) ;
            AV17Inc_obs = "#=" + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " >- Old=,T=", "") + A150BarFacTin + httpContext.getMessage( " FA=", "") + A4905BarFasAcab + httpContext.getMessage( " C=", "") + A152BarFasCon + httpContext.getMessage( " E=", "") + GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) + httpContext.getMessage( " F=", "") + A4287BarFasFor + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( A160BarFecRea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( A3298BarFecRIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " Hin=", "") + GXutil.trim( GXutil.str( A164BarHorFin, 4, 0)) + httpContext.getMessage( "Hfi=", "") + GXutil.trim( GXutil.str( A165BarHorIni, 4, 0)) + httpContext.getMessage( " Tteo=", "") + GXutil.trim( GXutil.str( A216BarTieTeo, 5, 2)) + httpContext.getMessage( " Und=", "") + GXutil.trim( GXutil.str( A227BarUni, 9, 2)) + httpContext.getMessage( " Mq=", "") + A603MaqCodBis + httpContext.getMessage( " Fase=", "") + A457FasCod + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " >- New=,T=", "") + AV5Barfactin + httpContext.getMessage( " FA=", "") + AV6Barfasacab + httpContext.getMessage( " C=", "") + AV7BarFascon + httpContext.getMessage( " E=", "") + GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)) + httpContext.getMessage( " F=", "") + AV9BarFasfor + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( AV10Barfecrea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( AV11Barfecrini, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " Hin=", "") + GXutil.trim( GXutil.str( AV12Barhorfin, 4, 0)) + httpContext.getMessage( "Hfi=", "") + GXutil.trim( GXutil.str( AV13BarHorIni, 4, 0)) + httpContext.getMessage( " Tteo=", "") + GXutil.trim( GXutil.str( AV14BarTieteo, 5, 2)) + httpContext.getMessage( " Und=", "") + GXutil.trim( GXutil.str( AV15Baruni, 9, 2)) + httpContext.getMessage( " Mq=", "") + AV19MaqCodBis + httpContext.getMessage( " Fase=", "") + AV16Fascod + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV34Pgmname, 1, 10), AV22UsurCod, AV28Station, AV17Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A758ProCod,A759ProDsc,Short.valueOf(A194BarOrdLin)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A759ProDsc","A194BarOrdLin"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
      cmbavBarfasfor.setValue( GXutil.rtrim( AV9BarFasfor) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Values", cmbavBarfasfor.ToJavascriptSource(), true);
      cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      cmbavBarfascon.setValue( GXutil.rtrim( AV7BarFascon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
      cmbavBarfasacab.setValue( GXutil.rtrim( AV6Barfasacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
      cmbavBarfactin.setValue( GXutil.rtrim( AV5Barfactin) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
   }

   public void e13FL2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A758ProCod,A759ProDsc,Short.valueOf(A194BarOrdLin)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A759ProDsc","A194BarOrdLin"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14FL2( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV5Barfactin = A150BarFacTin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Barfactin", AV5Barfactin);
      AV6Barfasacab = A4905BarFasAcab ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barfasacab", AV6Barfasacab);
      AV7BarFascon = A152BarFasCon ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarFascon", AV7BarFascon);
      AV8BarFasEst = A153BarFasEst ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarFasEst", GXutil.str( AV8BarFasEst, 1, 0));
      AV9BarFasfor = A4287BarFasFor ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasfor", AV9BarFasfor);
      AV10Barfecrea = A160BarFecRea ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barfecrea", localUtil.format(AV10Barfecrea, "99/99/99"));
      AV11Barfecrini = A3298BarFecRIni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barfecrini", localUtil.format(AV11Barfecrini, "99/99/99"));
      AV12Barhorfin = A164BarHorFin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Barhorfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barhorfin), 4, 0));
      AV13BarHorIni = A165BarHorIni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarHorIni), 4, 0));
      AV14BarTieteo = A216BarTieTeo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarTieteo", GXutil.ltrimstr( AV14BarTieteo, 5, 2));
      AV15Baruni = A227BarUni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Baruni", GXutil.ltrimstr( AV15Baruni, 9, 2));
      AV19MaqCodBis = A603MaqCodBis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19MaqCodBis", AV19MaqCodBis);
      /* Using cursor H00FL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV19MaqCodBis});
      hV19MaqCodBis = "" ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         hV19MaqCodBis = H00FL10_A13734MaqCDsc[0] ;
         if (true) break;
      }
      pr_default.close(8);
      httpContext.ajax_rsp_assign_attri("", false, "hV19MaqCodBis", hV19MaqCodBis);
      AV16Fascod = A457FasCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", AV16Fascod);
      /* Using cursor H00FL11 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV16Fascod});
      hV16Fascod = "" ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         hV16Fascod = H00FL11_A13781FasCDsc[0] ;
         if (true) break;
      }
      pr_default.close(9);
      httpContext.ajax_rsp_assign_attri("", false, "hV16Fascod", hV16Fascod);
   }

   public void S112( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV21Tmaquin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Tmaquin", GXutil.str( AV21Tmaquin, 1, 0));
      /* Using cursor H00FL12 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV18Maqcod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A602MaqCod = H00FL12_A602MaqCod[0] ;
         AV21Tmaquin = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Tmaquin", GXutil.str( AV21Tmaquin, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S122( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV20Tfaspro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tfaspro", GXutil.str( AV20Tfaspro, 1, 0));
      /* Using cursor H00FL13 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV16Fascod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A457FasCod = H00FL13_A457FasCod[0] ;
         AV20Tfaspro = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Tfaspro", GXutil.str( AV20Tfaspro, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A759ProDsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A194BarOrdLin = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
      paFL2( ) ;
      wsFL2( ) ;
      weFL2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016412059", true, true);
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
      httpContext.AddJavascriptSource("wpwfasesmodif.js", "?202661016412059", false, true);
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
      edtBarNHdr_Internalname = "BARNHDR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavMaqcodbis_Internalname = "vMAQCODBIS" ;
      cmbavBarfasest.setInternalname( "vBARFASEST" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      cmbavBarfascon.setInternalname( "vBARFASCON" );
      cmbavBarfactin.setInternalname( "vBARFACTIN" );
      cmbavBarfasacab.setInternalname( "vBARFASACAB" );
      cmbavBarfasfor.setInternalname( "vBARFASFOR" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBartieteo_Internalname = "vBARTIETEO" ;
      edtavBarfecini_Internalname = "vBARFECINI" ;
      edtavBarhorini_Internalname = "vBARHORINI" ;
      edtavBarfecrea_Internalname = "vBARFECREA" ;
      edtavBarhorfin_Internalname = "vBARHORFIN" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
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
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtavBarhorfin_Jsonclick = "" ;
      edtavBarhorfin_Enabled = 1 ;
      edtavBarfecrea_Jsonclick = "" ;
      edtavBarfecrea_Enabled = 1 ;
      edtavBarhorini_Jsonclick = "" ;
      edtavBarhorini_Enabled = 1 ;
      edtavBarfecini_Jsonclick = "" ;
      edtavBarfecini_Enabled = 1 ;
      edtavBartieteo_Jsonclick = "" ;
      edtavBartieteo_Enabled = 1 ;
      cmbavBarfasfor.setJsonclick( "" );
      cmbavBarfasfor.setEnabled( 1 );
      cmbavBarfasacab.setJsonclick( "" );
      cmbavBarfasacab.setEnabled( 1 );
      cmbavBarfactin.setJsonclick( "" );
      cmbavBarfactin.setEnabled( 1 );
      cmbavBarfascon.setJsonclick( "" );
      cmbavBarfascon.setEnabled( 1 );
      cmbavBarfasest.setJsonclick( "" );
      cmbavBarfasest.setEnabled( 1 );
      edtavMaqcodbis_Jsonclick = "" ;
      edtavMaqcodbis_Enabled = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos a modificar", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Datos Linea", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Modificacion datos Fases", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavBarfasest.setName( "vBARFASEST" );
      cmbavBarfasest.setWebtags( "" );
      cmbavBarfasest.addItem("Pendiente", "0", (short)(0));
      cmbavBarfasest.addItem("En proceso", "1", (short)(0));
      cmbavBarfasest.addItem("Finalizada", "2", (short)(0));
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
         AV8BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarFasEst", GXutil.str( AV8BarFasEst, 1, 0));
      }
      cmbavBarfascon.setName( "vBARFASCON" );
      cmbavBarfascon.setWebtags( "" );
      cmbavBarfascon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavBarfascon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavBarfascon.getItemCount() > 0 )
      {
         AV7BarFascon = cmbavBarfascon.getValidValue(AV7BarFascon) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarFascon", AV7BarFascon);
      }
      cmbavBarfactin.setName( "vBARFACTIN" );
      cmbavBarfactin.setWebtags( "" );
      cmbavBarfactin.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavBarfactin.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavBarfactin.getItemCount() > 0 )
      {
         AV5Barfactin = cmbavBarfactin.getValidValue(AV5Barfactin) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Barfactin", AV5Barfactin);
      }
      cmbavBarfasacab.setName( "vBARFASACAB" );
      cmbavBarfasacab.setWebtags( "" );
      cmbavBarfasacab.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavBarfasacab.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavBarfasacab.getItemCount() > 0 )
      {
         AV6Barfasacab = cmbavBarfasacab.getValidValue(AV6Barfasacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Barfasacab", AV6Barfasacab);
      }
      cmbavBarfasfor.setName( "vBARFASFOR" );
      cmbavBarfasfor.setWebtags( "" );
      cmbavBarfasfor.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavBarfasfor.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavBarfasfor.getItemCount() > 0 )
      {
         AV9BarFasfor = cmbavBarfasfor.getValidValue(AV9BarFasfor) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasfor", AV9BarFasfor);
      }
      /* End function init_web_controls */
   }

   public void validv_Fascod( )
   {
      if ( (GXutil.strcmp("", hV16Fascod)==0) )
      {
         AV16Fascod = "" ;
      }
      else
      {
         A13781FasCDsc = hV16Fascod ;
         /* Using cursor H00FL14 */
         pr_default.execute(12, new Object[] {A13781FasCDsc, A396EmprCod});
         AV16Fascod = H00FL14_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "vFASCOD");
               GX_FocusControl = edtavFascod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV16Fascod", hV16Fascod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", GXutil.rtrim( AV16Fascod));
      httpContext.ajax_rsp_assign_attri("", false, "hV16Fascod", hV16Fascod);
   }

   public void validv_Maqcodbis( )
   {
      if ( (GXutil.strcmp("", hV19MaqCodBis)==0) )
      {
         AV19MaqCodBis = "" ;
      }
      else
      {
         A13734MaqCDsc = hV19MaqCodBis ;
         /* Using cursor H00FL15 */
         pr_default.execute(13, new Object[] {A13734MaqCDsc, A396EmprCod});
         AV19MaqCodBis = H00FL15_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(13) == 101) ) )
         {
            pr_default.readNext(13);
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODBIS");
               GX_FocusControl = edtavMaqcodbis_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(13);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV19MaqCodBis", hV19MaqCodBis);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19MaqCodBis", GXutil.rtrim( AV19MaqCodBis));
      httpContext.ajax_rsp_assign_attri("", false, "hV19MaqCodBis", hV19MaqCodBis);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV34Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV28Station',fld:'vSTATION',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!',hsh:true},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A160BarFecRea',fld:'BARFECREA',pic:'',hsh:true},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:'',hsh:true},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9',hsh:true},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99',hsh:true},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99',hsh:true},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e12FL2',iparms:[{av:'AV19MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV21Tmaquin',fld:'vTMAQUIN',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV20Tfaspro',fld:'vTFASPRO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'cmbavBarfactin'},{av:'AV5Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'cmbavBarfasacab'},{av:'AV6Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfascon'},{av:'AV7BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'cmbavBarfasest'},{av:'AV8BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'cmbavBarfasfor'},{av:'AV9BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'AV10Barfecrea',fld:'vBARFECREA',pic:''},{av:'AV11Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV12Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV13BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV14BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'AV15Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!',hsh:true},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A160BarFecRea',fld:'BARFECREA',pic:'',hsh:true},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:'',hsh:true},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9',hsh:true},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99',hsh:true},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99',hsh:true},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV34Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV28Station',fld:'vSTATION',pic:'',hsh:true},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV18Maqcod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV18Maqcod',fld:'vMAQCOD',pic:''},{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV19MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV15Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV14BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'AV13BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV12Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV11Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV10Barfecrea',fld:'vBARFECREA',pic:''},{av:'cmbavBarfasfor'},{av:'AV9BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'cmbavBarfasest'},{av:'AV8BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'cmbavBarfascon'},{av:'AV7BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'cmbavBarfasacab'},{av:'AV6Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfactin'},{av:'AV5Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV21Tmaquin',fld:'vTMAQUIN',pic:'9'},{av:'AV20Tfaspro',fld:'vTFASPRO',pic:'9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e13FL2',iparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALIDV_FASCOD","{handler:'validv_Fascod',iparms:[{av:'hV16Fascod'},{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_FASCOD",",oparms:[{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'},{av:'hV16Fascod'}]}");
      setEventMetadata("VALIDV_MAQCODBIS","{handler:'validv_Maqcodbis',iparms:[{av:'hV19MaqCodBis'},{av:'AV19MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_MAQCODBIS",",oparms:[{av:'AV19MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'hV19MaqCodBis'}]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASCON","{handler:'validv_Barfascon',iparms:[]");
      setEventMetadata("VALIDV_BARFASCON",",oparms:[]}");
      setEventMetadata("VALIDV_BARFACTIN","{handler:'validv_Barfactin',iparms:[]");
      setEventMetadata("VALIDV_BARFACTIN",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASACAB","{handler:'validv_Barfasacab',iparms:[]");
      setEventMetadata("VALIDV_BARFASACAB",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASFOR","{handler:'validv_Barfasfor',iparms:[]");
      setEventMetadata("VALIDV_BARFASFOR",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
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
      pr_default.close(5);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      wcpOA759ProDsc = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13781FasCDsc = "" ;
      A13734MaqCDsc = "" ;
      hV16Fascod = "" ;
      hV19MaqCodBis = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      AV34Pgmname = "" ;
      AV22UsurCod = "" ;
      AV28Station = "" ;
      GXKey = "" ;
      AV11Barfecrini = GXutil.nullDate() ;
      AV15Baruni = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      AV18Maqcod = "" ;
      AV16Fascod = "" ;
      AV19MaqCodBis = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A13696BarNHdr = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7BarFascon = "" ;
      AV5Barfactin = "" ;
      AV6Barfasacab = "" ;
      AV9BarFasfor = "" ;
      AV14BarTieteo = DecimalUtil.ZERO ;
      AV23BarFecIni = GXutil.nullDate() ;
      AV10Barfecrea = GXutil.nullDate() ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13781FasCDsc = "" ;
      H00FL2_A13781FasCDsc = new String[] {""} ;
      l13734MaqCDsc = "" ;
      H00FL3_A13734MaqCDsc = new String[] {""} ;
      H00FL4_A13781FasCDsc = new String[] {""} ;
      H00FL4_A396EmprCod = new String[] {""} ;
      H00FL4_A457FasCod = new String[] {""} ;
      H00FL5_A13734MaqCDsc = new String[] {""} ;
      H00FL5_A396EmprCod = new String[] {""} ;
      H00FL5_A602MaqCod = new String[] {""} ;
      H00FL6_A396EmprCod = new String[] {""} ;
      H00FL6_A758ProCod = new String[] {""} ;
      H00FL6_A194BarOrdLin = new short[1] ;
      H00FL6_A759ProDsc = new String[] {""} ;
      H00FL6_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      H00FL6_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      H00FL6_A4287BarFasFor = new String[] {""} ;
      H00FL6_A153BarFasEst = new byte[1] ;
      H00FL6_A152BarFasCon = new String[] {""} ;
      H00FL6_A4905BarFasAcab = new String[] {""} ;
      H00FL6_A150BarFacTin = new String[] {""} ;
      H00FL6_A457FasCod = new String[] {""} ;
      H00FL6_A603MaqCodBis = new String[] {""} ;
      H00FL6_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00FL6_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00FL6_A165BarHorIni = new short[1] ;
      H00FL6_A164BarHorFin = new short[1] ;
      H00FL6_A129BarCod = new int[1] ;
      H00FL6_A132BarCodReo = new byte[1] ;
      H00FL6_A130BarCodPar = new String[] {""} ;
      H00FL7_A759ProDsc = new String[] {""} ;
      H00FL8_A13781FasCDsc = new String[] {""} ;
      H00FL8_A396EmprCod = new String[] {""} ;
      H00FL8_A457FasCod = new String[] {""} ;
      H00FL9_A13734MaqCDsc = new String[] {""} ;
      H00FL9_A396EmprCod = new String[] {""} ;
      H00FL9_A602MaqCod = new String[] {""} ;
      AV29EmprNom = "" ;
      GXt_char1 = "" ;
      AV32Emprcod = "" ;
      Gx_msg = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_int15 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      AV17Inc_obs = "" ;
      H00FL10_A13734MaqCDsc = new String[] {""} ;
      H00FL10_A396EmprCod = new String[] {""} ;
      H00FL10_A602MaqCod = new String[] {""} ;
      H00FL11_A13781FasCDsc = new String[] {""} ;
      H00FL11_A396EmprCod = new String[] {""} ;
      H00FL11_A457FasCod = new String[] {""} ;
      H00FL12_A396EmprCod = new String[] {""} ;
      H00FL12_A602MaqCod = new String[] {""} ;
      H00FL13_A396EmprCod = new String[] {""} ;
      H00FL13_A457FasCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00FL14_A13781FasCDsc = new String[] {""} ;
      H00FL14_A396EmprCod = new String[] {""} ;
      H00FL14_A457FasCod = new String[] {""} ;
      ZV16Fascod = "" ;
      ZhV16Fascod = "" ;
      H00FL15_A13734MaqCDsc = new String[] {""} ;
      H00FL15_A396EmprCod = new String[] {""} ;
      H00FL15_A602MaqCod = new String[] {""} ;
      ZV19MaqCodBis = "" ;
      ZhV19MaqCodBis = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpwfasesmodif__default(),
         new Object[] {
             new Object[] {
            H00FL2_A13781FasCDsc
            }
            , new Object[] {
            H00FL3_A13734MaqCDsc
            }
            , new Object[] {
            H00FL4_A13781FasCDsc, H00FL4_A396EmprCod, H00FL4_A457FasCod
            }
            , new Object[] {
            H00FL5_A13734MaqCDsc, H00FL5_A396EmprCod, H00FL5_A602MaqCod
            }
            , new Object[] {
            H00FL6_A396EmprCod, H00FL6_A758ProCod, H00FL6_A194BarOrdLin, H00FL6_A759ProDsc, H00FL6_A3298BarFecRIni, H00FL6_A160BarFecRea, H00FL6_A4287BarFasFor, H00FL6_A153BarFasEst, H00FL6_A152BarFasCon, H00FL6_A4905BarFasAcab,
            H00FL6_A150BarFacTin, H00FL6_A457FasCod, H00FL6_A603MaqCodBis, H00FL6_A227BarUni, H00FL6_A216BarTieTeo, H00FL6_A165BarHorIni, H00FL6_A164BarHorFin, H00FL6_A129BarCod, H00FL6_A132BarCodReo, H00FL6_A130BarCodPar
            }
            , new Object[] {
            H00FL7_A759ProDsc
            }
            , new Object[] {
            H00FL8_A13781FasCDsc, H00FL8_A396EmprCod, H00FL8_A457FasCod
            }
            , new Object[] {
            H00FL9_A13734MaqCDsc, H00FL9_A396EmprCod, H00FL9_A602MaqCod
            }
            , new Object[] {
            H00FL10_A13734MaqCDsc, H00FL10_A396EmprCod, H00FL10_A602MaqCod
            }
            , new Object[] {
            H00FL11_A13781FasCDsc, H00FL11_A396EmprCod, H00FL11_A457FasCod
            }
            , new Object[] {
            H00FL12_A396EmprCod, H00FL12_A602MaqCod
            }
            , new Object[] {
            H00FL13_A396EmprCod, H00FL13_A457FasCod
            }
            , new Object[] {
            H00FL14_A13781FasCDsc, H00FL14_A396EmprCod, H00FL14_A457FasCod
            }
            , new Object[] {
            H00FL15_A13734MaqCDsc, H00FL15_A396EmprCod, H00FL15_A602MaqCod
            }
         }
      );
      AV34Pgmname = "WPWFasesModif" ;
      /* GeneXus formulas. */
      AV34Pgmname = "WPWFasesModif" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOA132BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte A153BarFasEst ;
   private byte AV21Tmaquin ;
   private byte AV20Tfaspro ;
   private byte AV8BarFasEst ;
   private byte nDonePA ;
   private byte GXv_int6[] ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private short wcpOA194BarOrdLin ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A194BarOrdLin ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13BarHorIni ;
   private short AV12Barhorfin ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private int wcpOA129BarCod ;
   private int A129BarCod ;
   private int edtBarNHdr_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavMaqcodbis_Enabled ;
   private int edtavBartieteo_Enabled ;
   private int edtavBarfecini_Enabled ;
   private int edtavBarhorini_Enabled ;
   private int edtavBarfecrea_Enabled ;
   private int edtavBarhorfin_Enabled ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int gxdynajaxindex ;
   private int GXv_int5[] ;
   private int idxLst ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal AV15Baruni ;
   private java.math.BigDecimal AV14BarTieteo ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String wcpOA759ProDsc ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A150BarFacTin ;
   private String A4905BarFasAcab ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A603MaqCodBis ;
   private String AV34Pgmname ;
   private String AV22UsurCod ;
   private String AV28Station ;
   private String GXKey ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String AV18Maqcod ;
   private String AV16Fascod ;
   private String AV19MaqCodBis ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String edtProDsc_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavFascod_Internalname ;
   private String TempTags ;
   private String edtavFascod_Jsonclick ;
   private String edtavMaqcodbis_Internalname ;
   private String edtavMaqcodbis_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String AV7BarFascon ;
   private String AV5Barfactin ;
   private String AV6Barfasacab ;
   private String AV9BarFasfor ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBartieteo_Internalname ;
   private String edtavBartieteo_Jsonclick ;
   private String edtavBarfecini_Internalname ;
   private String edtavBarfecini_Jsonclick ;
   private String edtavBarhorini_Internalname ;
   private String edtavBarhorini_Jsonclick ;
   private String edtavBarfecrea_Internalname ;
   private String edtavBarfecrea_Jsonclick ;
   private String edtavBarhorfin_Internalname ;
   private String edtavBarhorfin_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV29EmprNom ;
   private String GXt_char1 ;
   private String AV32Emprcod ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String ZV16Fascod ;
   private String ZV19MaqCodBis ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date AV11Barfecrini ;
   private java.util.Date AV23BarFecIni ;
   private java.util.Date AV10Barfecrea ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date GXv_date14[] ;
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
   private String A13781FasCDsc ;
   private String A13734MaqCDsc ;
   private String hV16Fascod ;
   private String hV19MaqCodBis ;
   private String l13781FasCDsc ;
   private String l13734MaqCDsc ;
   private String AV17Inc_obs ;
   private String ZhV16Fascod ;
   private String ZhV19MaqCodBis ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private HTMLChoice cmbavBarfasest ;
   private HTMLChoice cmbavBarfascon ;
   private HTMLChoice cmbavBarfactin ;
   private HTMLChoice cmbavBarfasacab ;
   private HTMLChoice cmbavBarfasfor ;
   private IDataStoreProvider pr_default ;
   private String[] H00FL2_A13781FasCDsc ;
   private String[] H00FL3_A13734MaqCDsc ;
   private String[] H00FL4_A13781FasCDsc ;
   private String[] H00FL4_A396EmprCod ;
   private String[] H00FL4_A457FasCod ;
   private String[] H00FL5_A13734MaqCDsc ;
   private String[] H00FL5_A396EmprCod ;
   private String[] H00FL5_A602MaqCod ;
   private String[] H00FL6_A396EmprCod ;
   private String[] H00FL6_A758ProCod ;
   private short[] H00FL6_A194BarOrdLin ;
   private String[] H00FL6_A759ProDsc ;
   private java.util.Date[] H00FL6_A3298BarFecRIni ;
   private java.util.Date[] H00FL6_A160BarFecRea ;
   private String[] H00FL6_A4287BarFasFor ;
   private byte[] H00FL6_A153BarFasEst ;
   private String[] H00FL6_A152BarFasCon ;
   private String[] H00FL6_A4905BarFasAcab ;
   private String[] H00FL6_A150BarFacTin ;
   private String[] H00FL6_A457FasCod ;
   private String[] H00FL6_A603MaqCodBis ;
   private java.math.BigDecimal[] H00FL6_A227BarUni ;
   private java.math.BigDecimal[] H00FL6_A216BarTieTeo ;
   private short[] H00FL6_A165BarHorIni ;
   private short[] H00FL6_A164BarHorFin ;
   private int[] H00FL6_A129BarCod ;
   private byte[] H00FL6_A132BarCodReo ;
   private String[] H00FL6_A130BarCodPar ;
   private String[] H00FL7_A759ProDsc ;
   private String[] H00FL8_A13781FasCDsc ;
   private String[] H00FL8_A396EmprCod ;
   private String[] H00FL8_A457FasCod ;
   private String[] H00FL9_A13734MaqCDsc ;
   private String[] H00FL9_A396EmprCod ;
   private String[] H00FL9_A602MaqCod ;
   private String[] H00FL10_A13734MaqCDsc ;
   private String[] H00FL10_A396EmprCod ;
   private String[] H00FL10_A602MaqCod ;
   private String[] H00FL11_A13781FasCDsc ;
   private String[] H00FL11_A396EmprCod ;
   private String[] H00FL11_A457FasCod ;
   private String[] H00FL12_A396EmprCod ;
   private String[] H00FL12_A602MaqCod ;
   private String[] H00FL13_A396EmprCod ;
   private String[] H00FL13_A457FasCod ;
   private String[] H00FL14_A13781FasCDsc ;
   private String[] H00FL14_A396EmprCod ;
   private String[] H00FL14_A457FasCod ;
   private String[] H00FL15_A13734MaqCDsc ;
   private String[] H00FL15_A396EmprCod ;
   private String[] H00FL15_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpwfasesmodif__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00FL2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc FROM TXPFASPRO WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc))) like '%' || UPPER(?)) ORDER BY FasCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FL3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) ORDER BY MaqCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FL4", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FL5", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FL6", "SELECT T1.EmprCod, T1.ProCod, T1.BarOrdLin, T2.ProDsc, T1.BarFecRIni, T1.BarFecRea, T1.BarFasFor, T1.BarFasEst, T1.BarFasCon, T1.BarFasAcab, T1.BarFacTin, T1.FasCod, T1.MaqCodBis, T1.BarUni, T1.BarTieTeo, T1.BarHorIni, T1.BarHorFin, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARFAS T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ?) AND (T2.ProDsc = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL7", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL8", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL9", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL10", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FL11", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (EmprCod = ?) AND (FasCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FL12", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL13", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL14", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00FL15", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 13 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 100);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 40);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

