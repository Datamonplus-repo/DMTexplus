package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta_fases_upd_impl extends GXDataArea
{
   public hojaderuta_fases_upd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta_fases_upd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_fases_upd_impl.class ));
   }

   public hojaderuta_fases_upd_impl( int remoteHandle ,
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
      pa1S52( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1S52( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta_fases_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlUsu), "ZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV34Fascod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV34Fascod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODBIS_DATA", AV36MaqCodBis_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODBIS_DATA", AV36MaqCodBis_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTMAQUIN", GXutil.ltrim( localUtil.ntoc( AV21Tmaquin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFASPRO", GXutil.ltrim( localUtil.ntoc( AV20Tfaspro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECRINI", localUtil.dtoc( AV11Barfecrini, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNI", GXutil.ltrim( localUtil.ntoc( AV15Baruni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV31tinamar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLUSU", GXutil.ltrim( localUtil.ntoc( AV32CtrlUsu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlUsu), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV22UsurCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV18Maqcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Cls", GXutil.rtrim( Combo_maqcodbis_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Selectedvalue_set", GXutil.rtrim( Combo_maqcodbis_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Enabled", GXutil.booltostr( Combo_maqcodbis_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Emptyitem", GXutil.booltostr( Combo_maqcodbis_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODBIS_Selectedvalue_get", GXutil.rtrim( Combo_maqcodbis_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
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
         we1S52( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1S52( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta_fases_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta_Fases_UPD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modificacion", "") ;
   }

   public void wb1S50( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablacontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Proceso", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
         ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
         ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV34Fascod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodbis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodbis_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcodbis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodbis.setProperty("Caption", Combo_maqcodbis_Caption);
         ucCombo_maqcodbis.setProperty("Cls", Combo_maqcodbis_Cls);
         ucCombo_maqcodbis.setProperty("EmptyItem", Combo_maqcodbis_Emptyitem);
         ucCombo_maqcodbis.setProperty("DropDownOptionsData", AV36MaqCodBis_Data);
         ucCombo_maqcodbis.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodbis_Internalname, "COMBO_MAQCODBISContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasest.getInternalname(), httpContext.getMessage( "E", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasest, cmbavBarfasest.getInternalname(), GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)), 1, cmbavBarfasest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarfasest.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfascon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfascon.getInternalname(), httpContext.getMessage( "C?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfascon, cmbavBarfascon.getInternalname(), GXutil.rtrim( AV7BarFascon), 1, cmbavBarfascon.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfascon.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         cmbavBarfascon.setValue( GXutil.rtrim( AV7BarFascon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Values", cmbavBarfascon.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfactin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfactin.getInternalname(), httpContext.getMessage( "T?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfactin, cmbavBarfactin.getInternalname(), GXutil.rtrim( AV5Barfactin), 1, cmbavBarfactin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfactin.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         cmbavBarfactin.setValue( GXutil.rtrim( AV5Barfactin) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Values", cmbavBarfactin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasacab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasacab.getInternalname(), httpContext.getMessage( "A?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasacab, cmbavBarfasacab.getInternalname(), GXutil.rtrim( AV6Barfasacab), 1, cmbavBarfasacab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfasacab.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         cmbavBarfasacab.setValue( GXutil.rtrim( AV6Barfasacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Values", cmbavBarfasacab.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasfor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasfor.getInternalname(), httpContext.getMessage( "F?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasfor, cmbavBarfasfor.getInternalname(), GXutil.rtrim( AV9BarFasfor), 1, cmbavBarfasfor.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavBarfasfor.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, (byte)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecini_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecini_Internalname, localUtil.format(AV23BarFecIni, "99/99/99"), localUtil.format( AV23BarFecIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecini_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecrea_Internalname, localUtil.format(AV10Barfecrea, "99/99/99"), localUtil.format( AV10Barfecrea, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecrea_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecrea_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhorini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhorini_Internalname, httpContext.getMessage( "Hora Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhorini_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13BarHorIni), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhorini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhorini_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhorfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhorfin_Internalname, httpContext.getMessage( "Hora Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhorfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV12Barhorfin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Barhorfin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhorfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhorfin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavErrmensaje_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavErrmensaje_Internalname, httpContext.getMessage( "Observacion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavErrmensaje_Internalname, AV30Errmensaje, GXutil.rtrim( localUtil.format( AV30Errmensaje, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavErrmensaje_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavErrmensaje_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV16Fascod), GXutil.rtrim( localUtil.format( AV16Fascod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavFascod_Visible, edtavFascod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodbis_Internalname, GXutil.rtrim( AV19MaqCodBis), GXutil.rtrim( localUtil.format( AV19MaqCodBis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodbis_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcodbis_Visible, edtavMaqcodbis_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartieteo_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarTieteo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV14BarTieteo, "Z9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartieteo_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartieteo_Visible, edtavBartieteo_Enabled, 1, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Fases_UPD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1S52( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Modificacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1S50( ) ;
   }

   public void ws1S52( )
   {
      start1S52( ) ;
      evt1S52( ) ;
   }

   public void evt1S52( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_FASCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111S52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e121S52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e131S52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e141S52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151S52 ();
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

   public void we1S52( )
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

   public void pa1S52( )
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
            GX_FocusControl = cmbavBarfasest.getInternalname() ;
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
      rf1S52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV41Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases_UPD" ;
      Gx_err = (short)(0) ;
      edtavErrmensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje_Enabled), 5, 0), true);
   }

   public void rf1S52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01S52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A759ProDsc});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A3298BarFecRIni = H01S52_A3298BarFecRIni[0] ;
            A160BarFecRea = H01S52_A160BarFecRea[0] ;
            A4287BarFasFor = H01S52_A4287BarFasFor[0] ;
            A153BarFasEst = H01S52_A153BarFasEst[0] ;
            A152BarFasCon = H01S52_A152BarFasCon[0] ;
            A4905BarFasAcab = H01S52_A4905BarFasAcab[0] ;
            A150BarFacTin = H01S52_A150BarFacTin[0] ;
            A457FasCod = H01S52_A457FasCod[0] ;
            A603MaqCodBis = H01S52_A603MaqCodBis[0] ;
            A227BarUni = H01S52_A227BarUni[0] ;
            A216BarTieTeo = H01S52_A216BarTieTeo[0] ;
            A165BarHorIni = H01S52_A165BarHorIni[0] ;
            A164BarHorFin = H01S52_A164BarHorFin[0] ;
            /* Execute user event: Load */
            e151S52 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1S50( ) ;
      }
   }

   public void send_integrity_lvl_hashes1S52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV31tinamar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31tinamar), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLUSU", GXutil.ltrim( localUtil.ntoc( AV32CtrlUsu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlUsu), "ZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
   }

   public void before_start_formulas( )
   {
      AV41Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases_UPD" ;
      Gx_err = (short)(0) ;
      edtavErrmensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1S50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121S52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      /* Using cursor H01S53 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
      pr_default.close(1);
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV34Fascod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODBIS_DATA"), AV36MaqCodBis_Data);
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
         Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
         Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
         Combo_fascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Enabled")) ;
         Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
         Combo_maqcodbis_Cls = httpContext.cgiGet( "COMBO_MAQCODBIS_Cls") ;
         Combo_maqcodbis_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODBIS_Selectedvalue_set") ;
         Combo_maqcodbis_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODBIS_Enabled")) ;
         Combo_maqcodbis_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODBIS_Emptyitem")) ;
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
         Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
         /* Read variables values. */
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
         AV30Errmensaje = httpContext.cgiGet( edtavErrmensaje_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Errmensaje", AV30Errmensaje);
         AV16Fascod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", AV16Fascod);
         AV19MaqCodBis = httpContext.cgiGet( edtavMaqcodbis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19MaqCodBis", AV19MaqCodBis);
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
      e121S52 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e121S52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      hojaderuta_fases_upd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      hojaderuta_fases_upd_impl.this.A396EmprCod = GXv_char2[0] ;
      hojaderuta_fases_upd_impl.this.AV29EmprNom = GXv_char3[0] ;
      hojaderuta_fases_upd_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int7[0] = A194BarOrdLin ;
      GXv_char2[0] = AV30Errmensaje ;
      new app.pedidosclientesindetalle.pprc275(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_char2) ;
      hojaderuta_fases_upd_impl.this.A396EmprCod = GXv_char4[0] ;
      hojaderuta_fases_upd_impl.this.A129BarCod = GXv_int5[0] ;
      hojaderuta_fases_upd_impl.this.A132BarCodReo = GXv_int6[0] ;
      hojaderuta_fases_upd_impl.this.A130BarCodPar = GXv_char3[0] ;
      hojaderuta_fases_upd_impl.this.A194BarOrdLin = GXv_int7[0] ;
      hojaderuta_fases_upd_impl.this.AV30Errmensaje = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Errmensaje", AV30Errmensaje);
      GXt_int8 = (byte)(AV31tinamar) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      hojaderuta_fases_upd_impl.this.GXt_int8 = GXv_int6[0] ;
      AV31tinamar = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31tinamar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31tinamar), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31tinamar), "ZZZ9")));
      GXt_int8 = (byte)(AV32CtrlUsu) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRLOS", ""), GXv_int6) ;
      hojaderuta_fases_upd_impl.this.GXt_int8 = GXv_int6[0] ;
      AV32CtrlUsu = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32CtrlUsu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CtrlUsu), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLUSU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlUsu), "ZZZ9")));
      cmbavBarfasest.setEnabled( (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavFascod_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), true);
      cmbavBarfascon.setEnabled( (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfascon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfascon.getEnabled(), 5, 0), true);
      cmbavBarfasacab.setEnabled( (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasacab.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasacab.getEnabled(), 5, 0), true);
      cmbavBarfasfor.setEnabled( (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasfor.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasfor.getEnabled(), 5, 0), true);
      edtavBarfecrea_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecrea_Enabled), 5, 0), true);
      edtavBarhorini_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarhorini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorini_Enabled), 5, 0), true);
      cmbavBarfactin.setEnabled( (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfactin.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfactin.getEnabled(), 5, 0), true);
      edtavMaqcodbis_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), true);
      edtavBarhorfin_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarhorfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarhorfin_Enabled), 5, 0), true);
      edtavBartieteo_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartieteo_Enabled), 5, 0), true);
      edtavBarfecini_Enabled = (((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecini_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecini_Enabled), 5, 0), true);
      Combo_fascod_Enabled = ((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      Combo_maqcodbis_Enabled = ((GXutil.strcmp("", AV30Errmensaje)==0) ? true : false) ;
      ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "Enabled", GXutil.booltostr( Combo_maqcodbis_Enabled));
      GXt_char1 = AV28Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta_fases_upd_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Station, ""))));
      GXv_char4[0] = AV39Emprcod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char2[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char3, GXv_char2) ;
      hojaderuta_fases_upd_impl.this.AV39Emprcod = GXv_char4[0] ;
      hojaderuta_fases_upd_impl.this.AV29EmprNom = GXv_char3[0] ;
      hojaderuta_fases_upd_impl.this.AV22UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      edtavMaqcodbis_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Visible), 5, 0), true);
      edtavFascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOMAQCODBIS' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      edtavBartieteo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartieteo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartieteo_Visible), 5, 0), true);
   }

   public void e131S52( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV18Maqcod = AV19MaqCodBis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Maqcod", AV18Maqcod);
      /* Execute user subroutine: 'MAQUIN' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'FASPRO' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(1);
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
            GXv_char9[0] = AV5Barfactin ;
            GXv_char10[0] = AV6Barfasacab ;
            GXv_char11[0] = AV7BarFascon ;
            GXv_int12[0] = AV8BarFasEst ;
            GXv_char13[0] = AV9BarFasfor ;
            GXv_date14[0] = AV10Barfecrea ;
            GXv_date15[0] = AV11Barfecrini ;
            GXv_int16[0] = AV12Barhorfin ;
            GXv_int17[0] = AV13BarHorIni ;
            GXv_decimal18[0] = AV14BarTieteo ;
            GXv_decimal19[0] = AV15Baruni ;
            GXv_char20[0] = AV19MaqCodBis ;
            GXv_char21[0] = AV16Fascod ;
            new app.pfasesmodif(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_char9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_date14, GXv_date15, GXv_int16, GXv_int17, GXv_decimal18, GXv_decimal19, GXv_char20, GXv_char21) ;
            hojaderuta_fases_upd_impl.this.A396EmprCod = GXv_char4[0] ;
            hojaderuta_fases_upd_impl.this.A129BarCod = GXv_int5[0] ;
            hojaderuta_fases_upd_impl.this.A132BarCodReo = GXv_int6[0] ;
            hojaderuta_fases_upd_impl.this.A130BarCodPar = GXv_char3[0] ;
            hojaderuta_fases_upd_impl.this.A758ProCod = GXv_char2[0] ;
            hojaderuta_fases_upd_impl.this.A194BarOrdLin = GXv_int7[0] ;
            hojaderuta_fases_upd_impl.this.AV5Barfactin = GXv_char9[0] ;
            hojaderuta_fases_upd_impl.this.AV6Barfasacab = GXv_char10[0] ;
            hojaderuta_fases_upd_impl.this.AV7BarFascon = GXv_char11[0] ;
            hojaderuta_fases_upd_impl.this.AV8BarFasEst = GXv_int12[0] ;
            hojaderuta_fases_upd_impl.this.AV9BarFasfor = GXv_char13[0] ;
            hojaderuta_fases_upd_impl.this.AV10Barfecrea = GXv_date14[0] ;
            hojaderuta_fases_upd_impl.this.AV11Barfecrini = GXv_date15[0] ;
            hojaderuta_fases_upd_impl.this.AV12Barhorfin = GXv_int16[0] ;
            hojaderuta_fases_upd_impl.this.AV13BarHorIni = GXv_int17[0] ;
            hojaderuta_fases_upd_impl.this.AV14BarTieteo = GXv_decimal18[0] ;
            hojaderuta_fases_upd_impl.this.AV15Baruni = GXv_decimal19[0] ;
            hojaderuta_fases_upd_impl.this.AV19MaqCodBis = GXv_char20[0] ;
            hojaderuta_fases_upd_impl.this.AV16Fascod = GXv_char21[0] ;
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
            if ( ( AV31tinamar == 1 ) || ( AV32CtrlUsu == 1 ) )
            {
               GXv_char21[0] = A396EmprCod ;
               GXv_int5[0] = A129BarCod ;
               GXv_int12[0] = A132BarCodReo ;
               GXv_char20[0] = A130BarCodPar ;
               GXv_char13[0] = AV22UsurCod ;
               new app.pctrusu(remoteHandle, context).execute( GXv_char21, GXv_int5, GXv_int12, GXv_char20, GXv_char13) ;
               hojaderuta_fases_upd_impl.this.A396EmprCod = GXv_char21[0] ;
               hojaderuta_fases_upd_impl.this.A129BarCod = GXv_int5[0] ;
               hojaderuta_fases_upd_impl.this.A132BarCodReo = GXv_int12[0] ;
               hojaderuta_fases_upd_impl.this.A130BarCodPar = GXv_char20[0] ;
               hojaderuta_fases_upd_impl.this.AV22UsurCod = GXv_char13[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
            }
            AV17Inc_obs = "#=" + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " >- Old=,T=", "") + A150BarFacTin + httpContext.getMessage( " FA=", "") + A4905BarFasAcab + httpContext.getMessage( " C=", "") + A152BarFasCon + httpContext.getMessage( " E=", "") + GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) + httpContext.getMessage( " F=", "") + A4287BarFasFor + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( A160BarFecRea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( A3298BarFecRIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " Hin=", "") + GXutil.trim( GXutil.str( A164BarHorFin, 4, 0)) + httpContext.getMessage( "Hfi=", "") + GXutil.trim( GXutil.str( A165BarHorIni, 4, 0)) + httpContext.getMessage( " Tteo=", "") + GXutil.trim( GXutil.str( A216BarTieTeo, 5, 2)) + httpContext.getMessage( " Und=", "") + GXutil.trim( GXutil.str( A227BarUni, 9, 2)) + httpContext.getMessage( " Mq=", "") + A603MaqCodBis + httpContext.getMessage( " Fase=", "") + A457FasCod + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " >- New=,T=", "") + AV5Barfactin + httpContext.getMessage( " FA=", "") + AV6Barfasacab + httpContext.getMessage( " C=", "") + AV7BarFascon + httpContext.getMessage( " E=", "") + GXutil.trim( GXutil.str( AV8BarFasEst, 1, 0)) + httpContext.getMessage( " F=", "") + AV9BarFasfor + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( AV10Barfecrea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " FIn=", "") + GXutil.trim( localUtil.dtoc( AV11Barfecrini, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.newLine( ) ;
            AV17Inc_obs += httpContext.getMessage( " Hin=", "") + GXutil.trim( GXutil.str( AV12Barhorfin, 4, 0)) + httpContext.getMessage( "Hfi=", "") + GXutil.trim( GXutil.str( AV13BarHorIni, 4, 0)) + httpContext.getMessage( " Tteo=", "") + GXutil.trim( GXutil.str( AV14BarTieteo, 5, 2)) + httpContext.getMessage( " Und=", "") + GXutil.trim( GXutil.str( AV15Baruni, 9, 2)) + httpContext.getMessage( " Mq=", "") + AV19MaqCodBis + httpContext.getMessage( " Fase=", "") + AV16Fascod + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV41Pgmname, 1, 10), AV22UsurCod, AV28Station, AV17Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A758ProCod,A759ProDsc,Short.valueOf(A194BarOrdLin)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A759ProDsc","A194BarOrdLin"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            pr_default.close(1);
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

   public void e141S52( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A758ProCod,A759ProDsc,Short.valueOf(A194BarOrdLin)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A759ProDsc","A194BarOrdLin"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e111S52( )
   {
      /* Combo_fascod_Onoptionclicked Routine */
      returnInSub = false ;
      AV16Fascod = Combo_fascod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", AV16Fascod);
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQCODBIS' Routine */
      returnInSub = false ;
      /* Using cursor H01S54 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13734MaqCDsc = H01S54_A13734MaqCDsc[0] ;
         A602MaqCod = H01S54_A602MaqCod[0] ;
         A606MaqDsc = H01S54_A606MaqDsc[0] ;
         n606MaqDsc = H01S54_n606MaqDsc[0] ;
         AV35Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV36MaqCodBis_Data.add(AV35Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_maqcodbis_Selectedvalue_set = AV19MaqCodBis ;
      ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "SelectedValue_set", Combo_maqcodbis_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01S55 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13781FasCDsc = H01S55_A13781FasCDsc[0] ;
         A457FasCod = H01S55_A457FasCod[0] ;
         A460FasDsc = H01S55_A460FasDsc[0] ;
         AV35Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV35Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV34Fascod_Data.add(AV35Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_fascod_Selectedvalue_set = AV16Fascod ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e151S52( )
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
      AV16Fascod = A457FasCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Fascod", AV16Fascod);
      Combo_fascod_Selectedvalue_set = GXutil.trim( A457FasCod) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      Combo_maqcodbis_Selectedvalue_set = GXutil.trim( A603MaqCodBis) ;
      ucCombo_maqcodbis.sendProperty(context, "", false, Combo_maqcodbis_Internalname, "SelectedValue_set", Combo_maqcodbis_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV21Tmaquin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Tmaquin", GXutil.str( AV21Tmaquin, 1, 0));
      /* Using cursor H01S56 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV18Maqcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = H01S56_A602MaqCod[0] ;
         AV21Tmaquin = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Tmaquin", GXutil.str( AV21Tmaquin, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S142( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV20Tfaspro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tfaspro", GXutil.str( AV20Tfaspro, 1, 0));
      /* Using cursor H01S57 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV16Fascod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A457FasCod = H01S57_A457FasCod[0] ;
         AV20Tfaspro = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Tfaspro", GXutil.str( AV20Tfaspro, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
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
      pa1S52( ) ;
      ws1S52( ) ;
      we1S52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714193840", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta_fases_upd.js", "?202681714193840", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      lblTextblockcombo_maqcodbis_Internalname = "TEXTBLOCKCOMBO_MAQCODBIS" ;
      Combo_maqcodbis_Internalname = "COMBO_MAQCODBIS" ;
      divTablesplittedmaqcodbis_Internalname = "TABLESPLITTEDMAQCODBIS" ;
      cmbavBarfasest.setInternalname( "vBARFASEST" );
      cmbavBarfascon.setInternalname( "vBARFASCON" );
      cmbavBarfactin.setInternalname( "vBARFACTIN" );
      cmbavBarfasacab.setInternalname( "vBARFASACAB" );
      cmbavBarfasfor.setInternalname( "vBARFASFOR" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarfecini_Internalname = "vBARFECINI" ;
      edtavBarfecrea_Internalname = "vBARFECREA" ;
      edtavBarhorini_Internalname = "vBARHORINI" ;
      edtavBarhorfin_Internalname = "vBARHORFIN" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavErrmensaje_Internalname = "vERRMENSAJE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablacontent_Internalname = "TABLACONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavMaqcodbis_Internalname = "vMAQCODBIS" ;
      edtavBartieteo_Internalname = "vBARTIETEO" ;
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
      edtavBartieteo_Jsonclick = "" ;
      edtavBartieteo_Enabled = 1 ;
      edtavBartieteo_Visible = 1 ;
      edtavMaqcodbis_Jsonclick = "" ;
      edtavMaqcodbis_Enabled = 1 ;
      edtavMaqcodbis_Visible = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 1 ;
      edtavFascod_Visible = 1 ;
      edtavErrmensaje_Jsonclick = "" ;
      edtavErrmensaje_Enabled = 1 ;
      edtavBarhorfin_Jsonclick = "" ;
      edtavBarhorfin_Enabled = 1 ;
      edtavBarhorini_Jsonclick = "" ;
      edtavBarhorini_Enabled = 1 ;
      edtavBarfecrea_Jsonclick = "" ;
      edtavBarfecrea_Enabled = 1 ;
      edtavBarfecini_Jsonclick = "" ;
      edtavBarfecini_Enabled = 1 ;
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
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
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
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_maqcodbis_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcodbis_Enabled = GXutil.toBoolean( -1) ;
      Combo_maqcodbis_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Enabled = GXutil.toBoolean( -1) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
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
      Form.setCaption( httpContext.getMessage( "Modificacion", "") );
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
      cmbavBarfasest.addItem("0", httpContext.getMessage( "Pdte.", ""), (short)(0));
      cmbavBarfasest.addItem("1", httpContext.getMessage( "Proc.", ""), (short)(0));
      cmbavBarfasest.addItem("2", httpContext.getMessage( "Fin.", ""), (short)(0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'AV31tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV32CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV28Station',fld:'vSTATION',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!',hsh:true},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A160BarFecRea',fld:'BARFECREA',pic:'',hsh:true},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:'',hsh:true},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9',hsh:true},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99',hsh:true},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99',hsh:true},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131S52',iparms:[{av:'AV19MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV21Tmaquin',fld:'vTMAQUIN',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV20Tfaspro',fld:'vTFASPRO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'cmbavBarfactin'},{av:'AV5Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'cmbavBarfasacab'},{av:'AV6Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfascon'},{av:'AV7BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'cmbavBarfasest'},{av:'AV8BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'cmbavBarfasfor'},{av:'AV9BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'AV10Barfecrea',fld:'vBARFECREA',pic:''},{av:'AV11Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV12Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV13BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV14BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'AV15Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV31tinamar',fld:'vTINAMAR',pic:'ZZZ9',hsh:true},{av:'AV32CtrlUsu',fld:'vCTRLUSU',pic:'ZZZ9',hsh:true},{av:'AV22UsurCod',fld:'vUSURCOD',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!',hsh:true},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A160BarFecRea',fld:'BARFECREA',pic:'',hsh:true},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:'',hsh:true},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9',hsh:true},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99',hsh:true},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99',hsh:true},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV28Station',fld:'vSTATION',pic:'',hsh:true},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV18Maqcod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV18Maqcod',fld:'vMAQCOD',pic:''},{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV19MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV15Baruni',fld:'vBARUNI',pic:'ZZZZZ9.99'},{av:'AV14BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'AV13BarHorIni',fld:'vBARHORINI',pic:'ZZZ9'},{av:'AV12Barhorfin',fld:'vBARHORFIN',pic:'ZZZ9'},{av:'AV11Barfecrini',fld:'vBARFECRINI',pic:''},{av:'AV10Barfecrea',fld:'vBARFECREA',pic:''},{av:'cmbavBarfasfor'},{av:'AV9BarFasfor',fld:'vBARFASFOR',pic:'@!'},{av:'cmbavBarfasest'},{av:'AV8BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'cmbavBarfascon'},{av:'AV7BarFascon',fld:'vBARFASCON',pic:'@!'},{av:'cmbavBarfasacab'},{av:'AV6Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'cmbavBarfactin'},{av:'AV5Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV22UsurCod',fld:'vUSURCOD',pic:''},{av:'AV21Tmaquin',fld:'vTMAQUIN',pic:'9'},{av:'AV20Tfaspro',fld:'vTFASPRO',pic:'9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e141S52',iparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED","{handler:'e111S52',iparms:[{av:'Combo_fascod_Selectedvalue_get',ctrl:'COMBO_FASCOD',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED",",oparms:[{av:'AV16Fascod',fld:'vFASCOD',pic:'@!'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
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
      setEventMetadata("VALIDV_FASCOD","{handler:'validv_Fascod',iparms:[]");
      setEventMetadata("VALIDV_FASCOD",",oparms:[]}");
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
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      wcpOA759ProDsc = "" ;
      Combo_maqcodbis_Selectedvalue_get = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      AV41Pgmname = "" ;
      AV28Station = "" ;
      GXKey = "" ;
      AV34Fascod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV36MaqCodBis_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV11Barfecrini = GXutil.nullDate() ;
      AV15Baruni = DecimalUtil.ZERO ;
      AV22UsurCod = "" ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      AV18Maqcod = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_maqcodbis_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      Combo_fascod_Caption = "" ;
      lblTextblockcombo_maqcodbis_Jsonclick = "" ;
      ucCombo_maqcodbis = new com.genexus.webpanels.GXUserControl();
      Combo_maqcodbis_Caption = "" ;
      TempTags = "" ;
      AV7BarFascon = "" ;
      AV5Barfactin = "" ;
      AV6Barfasacab = "" ;
      AV9BarFasfor = "" ;
      AV23BarFecIni = GXutil.nullDate() ;
      AV10Barfecrea = GXutil.nullDate() ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      AV30Errmensaje = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      AV16Fascod = "" ;
      AV19MaqCodBis = "" ;
      AV14BarTieteo = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01S52_A396EmprCod = new String[] {""} ;
      H01S52_A129BarCod = new int[1] ;
      H01S52_A132BarCodReo = new byte[1] ;
      H01S52_A130BarCodPar = new String[] {""} ;
      H01S52_A758ProCod = new String[] {""} ;
      H01S52_A194BarOrdLin = new short[1] ;
      H01S52_A759ProDsc = new String[] {""} ;
      H01S52_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      H01S52_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      H01S52_A4287BarFasFor = new String[] {""} ;
      H01S52_A153BarFasEst = new byte[1] ;
      H01S52_A152BarFasCon = new String[] {""} ;
      H01S52_A4905BarFasAcab = new String[] {""} ;
      H01S52_A150BarFacTin = new String[] {""} ;
      H01S52_A457FasCod = new String[] {""} ;
      H01S52_A603MaqCodBis = new String[] {""} ;
      H01S52_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S52_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S52_A165BarHorIni = new short[1] ;
      H01S52_A164BarHorFin = new short[1] ;
      H01S53_A759ProDsc = new String[] {""} ;
      AV29EmprNom = "" ;
      GXt_char1 = "" ;
      AV39Emprcod = "" ;
      Gx_msg = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_char21 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_char13 = new String[1] ;
      AV17Inc_obs = "" ;
      H01S54_A396EmprCod = new String[] {""} ;
      H01S54_A13734MaqCDsc = new String[] {""} ;
      H01S54_A602MaqCod = new String[] {""} ;
      H01S54_A606MaqDsc = new String[] {""} ;
      H01S54_n606MaqDsc = new boolean[] {false} ;
      A13734MaqCDsc = "" ;
      A606MaqDsc = "" ;
      AV35Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01S55_A396EmprCod = new String[] {""} ;
      H01S55_A13781FasCDsc = new String[] {""} ;
      H01S55_A457FasCod = new String[] {""} ;
      H01S55_A460FasDsc = new String[] {""} ;
      A13781FasCDsc = "" ;
      A460FasDsc = "" ;
      H01S56_A396EmprCod = new String[] {""} ;
      H01S56_A602MaqCod = new String[] {""} ;
      H01S57_A396EmprCod = new String[] {""} ;
      H01S57_A457FasCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_fases_upd__default(),
         new Object[] {
             new Object[] {
            H01S52_A396EmprCod, H01S52_A129BarCod, H01S52_A132BarCodReo, H01S52_A130BarCodPar, H01S52_A758ProCod, H01S52_A194BarOrdLin, H01S52_A759ProDsc, H01S52_A3298BarFecRIni, H01S52_A160BarFecRea, H01S52_A4287BarFasFor,
            H01S52_A153BarFasEst, H01S52_A152BarFasCon, H01S52_A4905BarFasAcab, H01S52_A150BarFacTin, H01S52_A457FasCod, H01S52_A603MaqCodBis, H01S52_A227BarUni, H01S52_A216BarTieTeo, H01S52_A165BarHorIni, H01S52_A164BarHorFin
            }
            , new Object[] {
            H01S53_A759ProDsc
            }
            , new Object[] {
            H01S54_A396EmprCod, H01S54_A13734MaqCDsc, H01S54_A602MaqCod, H01S54_A606MaqDsc, H01S54_n606MaqDsc
            }
            , new Object[] {
            H01S55_A396EmprCod, H01S55_A13781FasCDsc, H01S55_A457FasCod, H01S55_A460FasDsc
            }
            , new Object[] {
            H01S56_A396EmprCod, H01S56_A602MaqCod
            }
            , new Object[] {
            H01S57_A396EmprCod, H01S57_A457FasCod
            }
         }
      );
      AV41Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases_UPD" ;
      /* GeneXus formulas. */
      AV41Pgmname = "PedidosClienteSinDetalle.HojadeRuta_Fases_UPD" ;
      Gx_err = (short)(0) ;
      edtavErrmensaje_Enabled = 0 ;
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
   private byte GXt_int8 ;
   private byte GXv_int6[] ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private short wcpOA194BarOrdLin ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A194BarOrdLin ;
   private short AV31tinamar ;
   private short AV32CtrlUsu ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13BarHorIni ;
   private short AV12Barhorfin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private short GXv_int16[] ;
   private short GXv_int17[] ;
   private int wcpOA129BarCod ;
   private int A129BarCod ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtavBarfecini_Enabled ;
   private int edtavBarfecrea_Enabled ;
   private int edtavBarhorini_Enabled ;
   private int edtavBarhorfin_Enabled ;
   private int edtavErrmensaje_Enabled ;
   private int edtavFascod_Visible ;
   private int edtavFascod_Enabled ;
   private int edtavMaqcodbis_Visible ;
   private int edtavMaqcodbis_Enabled ;
   private int edtavBartieteo_Visible ;
   private int edtavBartieteo_Enabled ;
   private int GXv_int5[] ;
   private int idxLst ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal AV15Baruni ;
   private java.math.BigDecimal AV14BarTieteo ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String wcpOA759ProDsc ;
   private String Combo_maqcodbis_Selectedvalue_get ;
   private String Combo_fascod_Selectedvalue_get ;
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
   private String AV41Pgmname ;
   private String AV28Station ;
   private String GXKey ;
   private String AV22UsurCod ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String AV18Maqcod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_maqcodbis_Cls ;
   private String Combo_maqcodbis_Selectedvalue_set ;
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
   private String divTablacontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String edtProDsc_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockcombo_fascod_Internalname ;
   private String lblTextblockcombo_fascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Internalname ;
   private String divTablesplittedmaqcodbis_Internalname ;
   private String lblTextblockcombo_maqcodbis_Internalname ;
   private String lblTextblockcombo_maqcodbis_Jsonclick ;
   private String Combo_maqcodbis_Caption ;
   private String Combo_maqcodbis_Internalname ;
   private String TempTags ;
   private String AV7BarFascon ;
   private String AV5Barfactin ;
   private String AV6Barfasacab ;
   private String AV9BarFasfor ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarfecini_Internalname ;
   private String edtavBarfecini_Jsonclick ;
   private String edtavBarfecrea_Internalname ;
   private String edtavBarfecrea_Jsonclick ;
   private String edtavBarhorini_Internalname ;
   private String edtavBarhorini_Jsonclick ;
   private String edtavBarhorfin_Internalname ;
   private String edtavBarhorfin_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavErrmensaje_Internalname ;
   private String edtavErrmensaje_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavFascod_Internalname ;
   private String AV16Fascod ;
   private String edtavFascod_Jsonclick ;
   private String edtavMaqcodbis_Internalname ;
   private String AV19MaqCodBis ;
   private String edtavMaqcodbis_Jsonclick ;
   private String edtavBartieteo_Internalname ;
   private String edtavBartieteo_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV29EmprNom ;
   private String GXt_char1 ;
   private String AV39Emprcod ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXv_char13[] ;
   private String A606MaqDsc ;
   private String A460FasDsc ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date AV11Barfecrini ;
   private java.util.Date AV23BarFecIni ;
   private java.util.Date AV10Barfecrea ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date GXv_date15[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_fascod_Enabled ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean Combo_maqcodbis_Enabled ;
   private boolean Combo_maqcodbis_Emptyitem ;
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
   private boolean n606MaqDsc ;
   private String AV30Errmensaje ;
   private String AV17Inc_obs ;
   private String A13734MaqCDsc ;
   private String A13781FasCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodbis ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private HTMLChoice cmbavBarfasest ;
   private HTMLChoice cmbavBarfascon ;
   private HTMLChoice cmbavBarfactin ;
   private HTMLChoice cmbavBarfasacab ;
   private HTMLChoice cmbavBarfasfor ;
   private IDataStoreProvider pr_default ;
   private String[] H01S52_A396EmprCod ;
   private int[] H01S52_A129BarCod ;
   private byte[] H01S52_A132BarCodReo ;
   private String[] H01S52_A130BarCodPar ;
   private String[] H01S52_A758ProCod ;
   private short[] H01S52_A194BarOrdLin ;
   private String[] H01S52_A759ProDsc ;
   private java.util.Date[] H01S52_A3298BarFecRIni ;
   private java.util.Date[] H01S52_A160BarFecRea ;
   private String[] H01S52_A4287BarFasFor ;
   private byte[] H01S52_A153BarFasEst ;
   private String[] H01S52_A152BarFasCon ;
   private String[] H01S52_A4905BarFasAcab ;
   private String[] H01S52_A150BarFacTin ;
   private String[] H01S52_A457FasCod ;
   private String[] H01S52_A603MaqCodBis ;
   private java.math.BigDecimal[] H01S52_A227BarUni ;
   private java.math.BigDecimal[] H01S52_A216BarTieTeo ;
   private short[] H01S52_A165BarHorIni ;
   private short[] H01S52_A164BarHorFin ;
   private String[] H01S53_A759ProDsc ;
   private String[] H01S54_A396EmprCod ;
   private String[] H01S54_A13734MaqCDsc ;
   private String[] H01S54_A602MaqCod ;
   private String[] H01S54_A606MaqDsc ;
   private boolean[] H01S54_n606MaqDsc ;
   private String[] H01S55_A396EmprCod ;
   private String[] H01S55_A13781FasCDsc ;
   private String[] H01S55_A457FasCod ;
   private String[] H01S55_A460FasDsc ;
   private String[] H01S56_A396EmprCod ;
   private String[] H01S56_A602MaqCod ;
   private String[] H01S57_A396EmprCod ;
   private String[] H01S57_A457FasCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV34Fascod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36MaqCodBis_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV35Combo_DataItem ;
}

final  class hojaderuta_fases_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01S52", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.ProDsc, T1.BarFecRIni, T1.BarFecRea, T1.BarFasFor, T1.BarFasEst, T1.BarFasCon, T1.BarFasAcab, T1.BarFacTin, T1.FasCod, T1.MaqCodBis, T1.BarUni, T1.BarTieTeo, T1.BarHorIni, T1.BarHorFin FROM (TXPBARFAS T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ?) AND (T2.ProDsc = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01S53", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01S54", "SELECT EmprCod, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S55", "SELECT EmprCod, RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S56", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01S57", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 6);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 40);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

