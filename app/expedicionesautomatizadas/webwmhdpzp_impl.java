package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwmhdpzp_impl extends GXDataArea
{
   public webwmhdpzp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwmhdpzp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwmhdpzp_impl.class ));
   }

   public webwmhdpzp_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavBartrocal = new HTMLChoice();
      cmbavBarpiedest = new HTMLChoice();
      dynavBarpiecliid = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vBARPIECLIID") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvbarpiecliid1IM2( A396EmprCod) ;
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
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
               AV12BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarCodreo", GXutil.str( AV12BarCodreo, 1, 0));
               AV11BarCodpar = httpContext.GetPar( "BarCodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodpar", AV11BarCodpar);
               AV15BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarPieCod", AV15BarPieCod);
               AV24BarPieMet1 = CommonUtil.decimalVal( httpContext.GetPar( "BarPieMet1"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24BarPieMet1", GXutil.ltrimstr( AV24BarPieMet1, 9, 2));
               AV9BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarAncAca1), 3, 0));
               AV33BarTrocal1 = (byte)(GXutil.lval( httpContext.GetPar( "BarTrocal1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33BarTrocal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarTrocal1), 2, 0));
               AV19BarPieKil1 = CommonUtil.decimalVal( httpContext.GetPar( "BarPieKil1"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieKil1", GXutil.ltrimstr( AV19BarPieKil1, 9, 2));
               AV8BapieObs = httpContext.GetPar( "BapieObs") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BapieObs", AV8BapieObs);
               AV38dtokg = CommonUtil.decimalVal( httpContext.GetPar( "dtokg"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38dtokg", GXutil.ltrimstr( AV38dtokg, 9, 2));
               AV39dtomt = CommonUtil.decimalVal( httpContext.GetPar( "dtomt"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39dtomt", GXutil.ltrimstr( AV39dtomt, 9, 2));
               AV25BarPieOrd = (int)(GXutil.lval( httpContext.GetPar( "BarPieOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPieOrd), 8, 0));
               AV20BarPieLoc = httpContext.GetPar( "BarPieLoc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieLoc", AV20BarPieLoc);
               AV30BarPieTono = httpContext.GetPar( "BarPieTono") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30BarPieTono", AV30BarPieTono);
               AV26BarPieSecu = httpContext.GetPar( "BarPieSecu") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26BarPieSecu", AV26BarPieSecu);
               AV29BarPieST1 = httpContext.GetPar( "BarPieST1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieST1", AV29BarPieST1);
               AV22BarPieLote1 = httpContext.GetPar( "BarPieLote1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22BarPieLote1", AV22BarPieLote1);
               AV17BarPieDestIN = (byte)(GXutil.lval( httpContext.GetPar( "BarPieDestIN"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarPieDestIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarPieDestIN), 2, 0));
               AV59tiraskgs1 = CommonUtil.decimalVal( httpContext.GetPar( "tiraskgs1"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59tiraskgs1", GXutil.ltrimstr( AV59tiraskgs1, 6, 2));
               AV56Retazoskgs1 = CommonUtil.decimalVal( httpContext.GetPar( "Retazoskgs1"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56Retazoskgs1", GXutil.ltrimstr( AV56Retazoskgs1, 6, 2));
               AV14BarPieCliIDout = (int)(GXutil.lval( httpContext.GetPar( "BarPieCliIDout"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieCliIDout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarPieCliIDout), 6, 0));
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
      pa1IM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1IM2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webwmhdpzp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV15BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV24BarPieMet1)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarAncAca1,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarTrocal1,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV19BarPieKil1)),GXutil.URLEncode(GXutil.rtrim(AV8BapieObs)),GXutil.URLEncode(DecimalUtil.decToString(AV38dtokg)),GXutil.URLEncode(DecimalUtil.decToString(AV39dtomt)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarPieOrd,8,0)),GXutil.URLEncode(GXutil.rtrim(AV20BarPieLoc)),GXutil.URLEncode(GXutil.rtrim(AV30BarPieTono)),GXutil.URLEncode(GXutil.rtrim(AV26BarPieSecu)),GXutil.URLEncode(GXutil.rtrim(AV29BarPieST1)),GXutil.URLEncode(GXutil.rtrim(AV22BarPieLote1)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarPieDestIN,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV59tiraskgs1)),GXutil.URLEncode(DecimalUtil.decToString(AV56Retazoskgs1)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarPieCliIDout,6,0))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodpar","BarPieCod","BarPieMet1","BarAncAca1","BarTrocal1","BarPieKil1","BapieObs","dtokg","dtomt","BarPieOrd","BarPieLoc","BarPieTono","BarPieSecu","BarPieST1","BarPieLote1","BarPieDestIN","tiraskgs1","Retazoskgs1","BarPieCliIDout"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Indutexma), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAPIEOBSE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78bapieobse, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarPieTono1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27BarPieSecu1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV62Vertex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Vtxter), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74balalaika), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV82Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEFECTOSCOMOBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DefectoscomoBalalaika), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vINDUTEXMA", GXutil.ltrim( localUtil.ntoc( AV63Indutexma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Indutexma), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV12BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAPIEOBSE", GXutil.rtrim( AV78bapieobse));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAPIEOBSE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78bapieobse, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIETONO1", GXutil.rtrim( AV31BarPieTono1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarPieTono1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIESECU1", GXutil.rtrim( AV27BarPieSecu1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27BarPieSecu1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV62Vertex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV62Vertex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVTXTER", GXutil.ltrim( localUtil.ntoc( AV70Vtxter, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Vtxter), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBALALAIKA", GXutil.ltrim( localUtil.ntoc( AV74balalaika, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74balalaika), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV82Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV82Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV60UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV57Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIETONO", GXutil.rtrim( AV30BarPieTono));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIESECU", GXutil.rtrim( AV26BarPieSecu));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL1", GXutil.ltrim( localUtil.ntoc( AV33BarTrocal1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV9BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEKIL1", GXutil.ltrim( localUtil.ntoc( AV19BarPieKil1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEMET1", GXutil.ltrim( localUtil.ntoc( AV24BarPieMet1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIECLIIDOUT", GXutil.ltrim( localUtil.ntoc( AV14BarPieCliIDout, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRETAZOSKGS1", GXutil.ltrim( localUtil.ntoc( AV56Retazoskgs1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIRASKGS1", GXutil.ltrim( localUtil.ntoc( AV59tiraskgs1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEDESTIN", GXutil.ltrim( localUtil.ntoc( AV17BarPieDestIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIELOTE1", GXutil.rtrim( AV22BarPieLote1));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEST1", GXutil.rtrim( AV29BarPieST1));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEORD", GXutil.ltrim( localUtil.ntoc( AV25BarPieOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDTOMT", GXutil.ltrim( localUtil.ntoc( AV39dtomt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDTOKG", GXutil.ltrim( localUtil.ntoc( AV38dtokg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEFECTOSCOMOBALALAIKA", GXutil.ltrim( localUtil.ntoc( AV75DefectoscomoBalalaika, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEFECTOSCOMOBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DefectoscomoBalalaika), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
         we1IM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1IM2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.webwmhdpzp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV15BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV24BarPieMet1)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarAncAca1,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarTrocal1,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV19BarPieKil1)),GXutil.URLEncode(GXutil.rtrim(AV8BapieObs)),GXutil.URLEncode(DecimalUtil.decToString(AV38dtokg)),GXutil.URLEncode(DecimalUtil.decToString(AV39dtomt)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarPieOrd,8,0)),GXutil.URLEncode(GXutil.rtrim(AV20BarPieLoc)),GXutil.URLEncode(GXutil.rtrim(AV30BarPieTono)),GXutil.URLEncode(GXutil.rtrim(AV26BarPieSecu)),GXutil.URLEncode(GXutil.rtrim(AV29BarPieST1)),GXutil.URLEncode(GXutil.rtrim(AV22BarPieLote1)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarPieDestIN,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV59tiraskgs1)),GXutil.URLEncode(DecimalUtil.decToString(AV56Retazoskgs1)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarPieCliIDout,6,0))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodpar","BarPieCod","BarPieMet1","BarAncAca1","BarTrocal1","BarPieKil1","BapieObs","dtokg","dtomt","BarPieOrd","BarPieLoc","BarPieTono","BarPieSecu","BarPieST1","BarPieLote1","BarPieDestIN","tiraskgs1","Retazoskgs1","BarPieCliIDout"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebWMHDPZP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web WMHDPZP", "") ;
   }

   public void wb1IM0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_15_1IM2( true) ;
      }
      else
      {
         wb_table1_15_1IM2( false) ;
      }
      return  ;
   }

   public void wb_table1_15_1IM2e( boolean wbgen )
   {
      if ( wbgen )
      {
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

   public void start1IM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web WMHDPZP", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1IM0( ) ;
   }

   public void ws1IM2( )
   {
      start1IM2( ) ;
      evt1IM2( ) ;
   }

   public void evt1IM2( )
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
                           e111IM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e121IM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131IM2 ();
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

   public void we1IM2( )
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

   public void pa1IM2( )
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
            GX_FocusControl = edtavLit8_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvbarpiecliid1IM2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlvvbarpiecliid_data1IM2( A396EmprCod) ;
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

   public void gxvvbarpiecliid_html1IM2( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlvvbarpiecliid_data1IM2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavBarpiecliid.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavBarpiecliid.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 6, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBarpiecliid.getItemCount() > 0 )
      {
         AV13BarPieCliID = (int)(GXutil.lval( dynavBarpiecliid.getValidValue(GXutil.trim( GXutil.str( AV13BarPieCliID, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarPieCliID), 6, 0));
      }
   }

   protected void gxdlvvbarpiecliid_data1IM2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H01IM2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H01IM2_A252CliCod[0], (byte)(6), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01IM2_A279CliNom[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
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
      if ( cmbavBartrocal.getItemCount() > 0 )
      {
         AV32BarTroCal = (byte)(GXutil.lval( cmbavBartrocal.getValidValue(GXutil.trim( GXutil.str( AV32BarTroCal, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarTroCal), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBartrocal.setValue( GXutil.trim( GXutil.str( AV32BarTroCal, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBartrocal.getInternalname(), "Values", cmbavBartrocal.ToJavascriptSource(), true);
      }
      if ( cmbavBarpiedest.getItemCount() > 0 )
      {
         AV16BarPieDest = (byte)(GXutil.lval( cmbavBarpiedest.getValidValue(GXutil.trim( GXutil.str( AV16BarPieDest, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarPieDest), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarpiedest.setValue( GXutil.trim( GXutil.str( AV16BarPieDest, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarpiedest.getInternalname(), "Values", cmbavBarpiedest.ToJavascriptSource(), true);
      }
      if ( dynavBarpiecliid.getItemCount() > 0 )
      {
         AV13BarPieCliID = (int)(GXutil.lval( dynavBarpiecliid.getValidValue(GXutil.trim( GXutil.str( AV13BarPieCliID, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarPieCliID), 6, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavBarpiecliid.setValue( GXutil.trim( GXutil.str( AV13BarPieCliID, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarpiecliid.getInternalname(), "Values", dynavBarpiecliid.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1IM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV82Pgmname = "ExpedicionesAutomatizadas.WebWMHDPZP" ;
      Gx_err = (short)(0) ;
      edtavLit8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Enabled), 5, 0), true);
   }

   public void rf1IM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01IM3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            gxvvbarpiecliid_html1IM2( A396EmprCod) ;
            /* Execute user event: Load */
            e131IM2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         wb1IM0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1IM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vINDUTEXMA", GXutil.ltrim( localUtil.ntoc( AV63Indutexma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Indutexma), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAPIEOBSE", GXutil.rtrim( AV78bapieobse));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAPIEOBSE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78bapieobse, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIETONO1", GXutil.rtrim( AV31BarPieTono1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarPieTono1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIESECU1", GXutil.rtrim( AV27BarPieSecu1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27BarPieSecu1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV62Vertex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV62Vertex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVTXTER", GXutil.ltrim( localUtil.ntoc( AV70Vtxter, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Vtxter), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBALALAIKA", GXutil.ltrim( localUtil.ntoc( AV74balalaika, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74balalaika), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV82Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV82Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV60UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV57Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEFECTOSCOMOBALALAIKA", GXutil.ltrim( localUtil.ntoc( AV75DefectoscomoBalalaika, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEFECTOSCOMOBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DefectoscomoBalalaika), "9")));
   }

   public void before_start_formulas( )
   {
      AV82Pgmname = "ExpedicionesAutomatizadas.WebWMHDPZP" ;
      Gx_err = (short)(0) ;
      edtavLit8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1IM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111IM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      gxvvbarpiecliid_html1IM2( A396EmprCod) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV75DefectoscomoBalalaika = (byte)(localUtil.ctol( httpContext.cgiGet( "vDEFECTOSCOMOBALALAIKA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV74balalaika = (byte)(localUtil.ctol( httpContext.cgiGet( "vBALALAIKA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         /* Read variables values. */
         AV52lit8 = httpContext.cgiGet( edtavLit8_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52lit8", AV52lit8);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarPieMet", GXutil.ltrimstr( AV23BarPieMet, 9, 2));
         }
         else
         {
            AV23BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarPieMet", GXutil.ltrimstr( AV23BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBartromet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBartromet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTROMET");
            GX_FocusControl = edtavBartromet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36BarTroMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarTroMet", GXutil.ltrimstr( AV36BarTroMet, 9, 2));
         }
         else
         {
            AV36BarTroMet = localUtil.ctond( httpContext.cgiGet( edtavBartromet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarTroMet", GXutil.ltrimstr( AV36BarTroMet, 9, 2));
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
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBartrokil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBartrokil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTROKIL");
            GX_FocusControl = edtavBartrokil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34BarTroKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarTroKil", GXutil.ltrimstr( AV34BarTroKil, 9, 2));
         }
         else
         {
            AV34BarTroKil = localUtil.ctond( httpContext.cgiGet( edtavBartrokil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarTroKil", GXutil.ltrimstr( AV34BarTroKil, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAncho_f_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAncho_f_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vANCHO_F");
            GX_FocusControl = edtavAncho_f_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Ancho_f = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Ancho_f), 4, 0));
         }
         else
         {
            AV7Ancho_f = (short)(localUtil.ctol( httpContext.cgiGet( edtavAncho_f_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Ancho_f), 4, 0));
         }
         cmbavBartrocal.setValue( httpContext.cgiGet( cmbavBartrocal.getInternalname()) );
         AV32BarTroCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBartrocal.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarTroCal), 2, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOrdpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOrdpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vORDPIE");
            GX_FocusControl = edtavOrdpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54OrdPie = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54OrdPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrdPie), 2, 0));
         }
         else
         {
            AV54OrdPie = (byte)(localUtil.ctol( httpContext.cgiGet( edtavOrdpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54OrdPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrdPie), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTiraskgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTiraskgs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIRASKGS");
            GX_FocusControl = edtavTiraskgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58tiraskgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58tiraskgs", GXutil.ltrimstr( AV58tiraskgs, 6, 2));
         }
         else
         {
            AV58tiraskgs = localUtil.ctond( httpContext.cgiGet( edtavTiraskgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58tiraskgs", GXutil.ltrimstr( AV58tiraskgs, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRetazoskgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRetazoskgs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRETAZOSKGS");
            GX_FocusControl = edtavRetazoskgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55Retazoskgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Retazoskgs", GXutil.ltrimstr( AV55Retazoskgs, 6, 2));
         }
         else
         {
            AV55Retazoskgs = localUtil.ctond( httpContext.cgiGet( edtavRetazoskgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Retazoskgs", GXutil.ltrimstr( AV55Retazoskgs, 6, 2));
         }
         AV21BarPieLote = httpContext.cgiGet( edtavBarpielote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarPieLote", AV21BarPieLote);
         AV28BarPieST = httpContext.cgiGet( edtavBarpiest_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarPieST", AV28BarPieST);
         cmbavBarpiedest.setValue( httpContext.cgiGet( cmbavBarpiedest.getInternalname()) );
         AV16BarPieDest = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarpiedest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarPieDest), 2, 0));
         dynavBarpiecliid.setValue( httpContext.cgiGet( dynavBarpiecliid.getInternalname()) );
         AV13BarPieCliID = (int)(GXutil.lval( httpContext.cgiGet( dynavBarpiecliid.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarPieCliID), 6, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         gxvvbarpiecliid_html1IM2( A396EmprCod) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e111IM2 ();
      if (returnInSub) return;
   }

   public void e111IM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Datos de entrada 2: EmprCod=%1, BarCod=%2,BarCodReo=%3,&BarCodPar=%4,&BarPieCod=%5,&BarPieMet=%6,BarPieAnc=%7,&BarTroCal=%8,BarKgsAut=%9,&Bapieobs=%10,dtokg=%11,dtomt=%12,&BarPieOrd=%13,&BarPieloc=%14,&BarPieTono=%15,&BarPieSecu=%16,&BarPieST1=%17,&BarPieLote1=%18,&BarPieDestIN=%19,&tiraskgs1=%20,&Retazoskgs1=%21,BarPieCliIDout=22", A396EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0), GXutil.str( AV12BarCodreo, 1, 0), AV11BarCodpar, AV15BarPieCod, GXutil.ltrimstr( AV24BarPieMet1, 9, 2), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarAncAca1), 3, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarTrocal1), 2, 0), GXutil.ltrimstr( AV19BarPieKil1, 9, 2)), AV82Pgmname) ;
      AV52lit8 = httpContext.getMessage( "Dtos.", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52lit8", AV52lit8);
      AV60UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60UsurCod", AV60UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60UsurCod, "@!"))));
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwmhdpzp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV60UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwmhdpzp_impl.this.A396EmprCod = GXv_char2[0] ;
      webwmhdpzp_impl.this.AV6EmprNom = GXv_char3[0] ;
      webwmhdpzp_impl.this.AV60UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV60UsurCod", AV60UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60UsurCod, "@!"))));
      AV40EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40EmprCod", AV40EmprCod);
      AV7Ancho_f = AV9BarAncAca1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Ancho_f), 4, 0));
      AV23BarPieMet = AV24BarPieMet1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarPieMet", GXutil.ltrimstr( AV23BarPieMet, 9, 2));
      AV18BarPieKil = AV19BarPieKil1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarPieKil", GXutil.ltrimstr( AV18BarPieKil, 9, 2));
      AV32BarTroCal = AV33BarTrocal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarTroCal), 2, 0));
      AV31BarPieTono1 = AV30BarPieTono ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31BarPieTono1", AV31BarPieTono1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarPieTono1, ""))));
      AV27BarPieSecu1 = AV26BarPieSecu ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarPieSecu1", AV27BarPieSecu1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27BarPieSecu1, ""))));
      AV21BarPieLote = AV22BarPieLote1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarPieLote", AV21BarPieLote);
      AV28BarPieST = AV29BarPieST1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28BarPieST", AV28BarPieST);
      GXv_int5[0] = (byte)(DecimalUtil.decToDouble(AV83Ricoltex)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int5) ;
      webwmhdpzp_impl.this.AV83Ricoltex = DecimalUtil.doubleToDec(GXv_int5[0]) ;
      GXt_int6 = AV62Vertex ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV62Vertex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Vertex", GXutil.str( AV62Vertex, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV62Vertex), "9")));
      GXt_int6 = AV63Indutexma ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV63Indutexma = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Indutexma", GXutil.str( AV63Indutexma, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Indutexma), "9")));
      GXt_int6 = AV64Fatelca ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "FATELC", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV64Fatelca = GXt_int6 ;
      GXt_int6 = AV65Piolera ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV65Piolera = GXt_int6 ;
      GXt_int6 = AV67DivRollo ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "ROLDIV", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV67DivRollo = GXt_int6 ;
      GXt_int6 = AV68Stamperia ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV68Stamperia = GXt_int6 ;
      GXt_int6 = AV69Retazos ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "RETZ00", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV69Retazos = GXt_int6 ;
      GXt_int6 = AV70Vtxter ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "VTXTER", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV70Vtxter = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Vtxter", GXutil.str( AV70Vtxter, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Vtxter), "9")));
      GXt_int6 = AV71TablaCalidad ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "TABCAL", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV71TablaCalidad = GXt_int6 ;
      GXt_int6 = AV72CtrlDefectos ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "SIDEFE", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV72CtrlDefectos = GXt_int6 ;
      GXt_int6 = AV73anahuac ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV73anahuac = GXt_int6 ;
      GXt_int6 = AV74balalaika ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "BALALA", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV74balalaika = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74balalaika", GXutil.str( AV74balalaika, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74balalaika), "9")));
      GXt_int6 = AV75DefectoscomoBalalaika ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "DEFBAL", ""), GXv_int5) ;
      webwmhdpzp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV75DefectoscomoBalalaika = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75DefectoscomoBalalaika", GXutil.str( AV75DefectoscomoBalalaika, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEFECTOSCOMOBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DefectoscomoBalalaika), "9")));
      edtavBartrokil_Visible = AV64Fatelca ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartrokil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrokil_Visible), 5, 0), true);
      edtavBartromet_Visible = AV64Fatelca ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartromet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartromet_Visible), 5, 0), true);
      AV78bapieobse = AV8BapieObs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78bapieobse", AV78bapieobse);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAPIEOBSE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78bapieobse, ""))));
      AV34BarTroKil = AV38dtokg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarTroKil", GXutil.ltrimstr( AV34BarTroKil, 9, 2));
      AV36BarTroMet = AV39dtomt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36BarTroMet", GXutil.ltrimstr( AV36BarTroMet, 9, 2));
      AV54OrdPie = (byte)(AV25BarPieOrd) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54OrdPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54OrdPie), 2, 0));
      edtavOrdpie_Visible = AV63Indutexma ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOrdpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOrdpie_Visible), 5, 0), true);
      cmbavBartrocal.removeAllItems();
      if ( ( AV65Piolera == 1 ) || ( AV68Stamperia == 1 ) || ( AV69Retazos == 1 ) )
      {
         cmbavBartrocal.addItem("1", httpContext.getMessage( "Primera", ""), (short)(0));
         cmbavBartrocal.addItem("2", httpContext.getMessage( "Segunda", ""), (short)(0));
         cmbavBartrocal.addItem("3", httpContext.getMessage( "Retazos/Franjas", ""), (short)(0));
      }
      else
      {
         if ( AV71TablaCalidad == 1 )
         {
            /* Using cursor H01IM4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A12777CalidadNm = H01IM4_A12777CalidadNm[0] ;
               n12777CalidadNm = H01IM4_n12777CalidadNm[0] ;
               A12776CalidadId = H01IM4_A12776CalidadId[0] ;
               cmbavBartrocal.addItem(GXutil.trim( GXutil.str( A12776CalidadId, 2, 0)), GXutil.trim( A12777CalidadNm), (short)(0));
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV32BarTroCal = (byte)(((AV33BarTrocal1==0) ? 1 : AV32BarTroCal)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarTroCal), 2, 0));
            /* Method refresh( not supported for combo controls. */
         }
         else
         {
            cmbavBartrocal.addItem("1", httpContext.getMessage( "Primera", ""), (short)(0));
            cmbavBartrocal.addItem("2", httpContext.getMessage( "Segunda", ""), (short)(0));
            cmbavBartrocal.addItem("3", httpContext.getMessage( "Pendiente", ""), (short)(0));
         }
      }
      edtavBarpieloc_Visible = AV68Stamperia ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpieloc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpieloc_Visible), 5, 0), true);
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Anahuac',23) ]
         Target    : [ t('Barpiesecu1',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /* * Property Visible not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('Anahuac',23) ]
         Target    : [ t('Barpietono1',23),t('Visible',3) ]
         ForType   : 29
         Type      : []
      */
      edtavBarpielote_Visible = AV73anahuac ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpielote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpielote_Visible), 5, 0), true);
      edtavBarpiest_Visible = AV73anahuac ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiest_Visible), 5, 0), true);
      cmbavBarpiedest.setVisible( AV73anahuac );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarpiedest.getInternalname(), "Visible", GXutil.ltrimstr( cmbavBarpiedest.getVisible(), 5, 0), true);
      if ( ( AV74balalaika == 1 ) || ( AV75DefectoscomoBalalaika == 1 ) )
      {
         /* Using cursor H01IM5 */
         pr_default.execute(3, new Object[] {AV40EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV12BarCodreo), AV11BarCodpar, AV15BarPieCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A200BarPieCod = H01IM5_A200BarPieCod[0] ;
            A130BarCodPar = H01IM5_A130BarCodPar[0] ;
            A132BarCodReo = H01IM5_A132BarCodReo[0] ;
            A129BarCod = H01IM5_A129BarCod[0] ;
            A44AlbRecCod = H01IM5_A44AlbRecCod[0] ;
            AV5AlbRecCod = A44AlbRecCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      AV16BarPieDest = AV17BarPieDestIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarPieDest), 2, 0));
      cmbavBarpiedest.removeAllItems();
      cmbavBarpiedest.addItem("0", httpContext.getMessage( "sin definir", ""), (short)(0));
      /* Using cursor H01IM6 */
      pr_default.execute(4, new Object[] {AV40EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13209SubClaDsc = H01IM6_A13209SubClaDsc[0] ;
         n13209SubClaDsc = H01IM6_n13209SubClaDsc[0] ;
         A13208SubClaID = H01IM6_A13208SubClaID[0] ;
         cmbavBarpiedest.addItem(GXutil.trim( GXutil.str( A13208SubClaID, 2, 0)), A13209SubClaDsc, (short)(0));
         pr_default.readNext(4);
      }
      pr_default.close(4);
      edtavLit8_Visible = ((AV65Piolera==1)||(AV64Fatelca==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Visible), 5, 0), true);
      edtavBartrokil_Visible = ((AV65Piolera==1)||(AV64Fatelca==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartrokil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrokil_Visible), 5, 0), true);
      edtavBartrokil_Visible = ((AV65Piolera==1)||(AV64Fatelca==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartrokil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrokil_Visible), 5, 0), true);
      AV58tiraskgs = AV59tiraskgs1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58tiraskgs", GXutil.ltrimstr( AV58tiraskgs, 6, 2));
      AV55Retazoskgs = AV56Retazoskgs1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Retazoskgs", GXutil.ltrimstr( AV55Retazoskgs, 6, 2));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "valores: &tiraskgs= %1,&tiraskgs1= %2,&Retazoskgs=%3,&Retazoskgs1= %4", GXutil.ltrimstr( AV58tiraskgs, 6, 2), GXutil.ltrimstr( AV59tiraskgs1, 6, 2), GXutil.ltrimstr( AV55Retazoskgs, 6, 2), GXutil.ltrimstr( AV56Retazoskgs1, 6, 2), "", "", "", "", ""), AV82Pgmname) ;
      edtavTiraskgs_Visible = AV74balalaika ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTiraskgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiraskgs_Visible), 5, 0), true);
      edtavRetazoskgs_Visible = AV74balalaika ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRetazoskgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRetazoskgs_Visible), 5, 0), true);
      dynavBarpiecliid.setVisible( AV73anahuac );
      httpContext.ajax_rsp_assign_prop("", false, dynavBarpiecliid.getInternalname(), "Visible", GXutil.ltrimstr( dynavBarpiecliid.getVisible(), 5, 0), true);
      AV13BarPieCliID = AV14BarPieCliIDout ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarPieCliID), 6, 0));
      dynavBarpiecliid.removeAllItems();
      dynavBarpiecliid.addItem("0", httpContext.getMessage( "sin definir", ""), (short)(0));
      /* Using cursor H01IM7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A279CliNom = H01IM7_A279CliNom[0] ;
         A10045CliAct = H01IM7_A10045CliAct[0] ;
         A252CliCod = H01IM7_A252CliCod[0] ;
         if ( GXutil.strcmp(A10045CliAct, httpContext.getMessage( "S", "")) == 0 )
         {
            dynavBarpiecliid.addItem(GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, (short)(0));
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      GXt_char1 = AV57Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwmhdpzp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV57Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Station, ""))));
      GXv_char3[0] = AV40EmprCod ;
      GXv_char2[0] = AV6EmprNom ;
      GXv_char7[0] = AV60UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char3, GXv_char2, GXv_char7) ;
      webwmhdpzp_impl.this.AV40EmprCod = GXv_char3[0] ;
      webwmhdpzp_impl.this.AV6EmprNom = GXv_char2[0] ;
      webwmhdpzp_impl.this.AV60UsurCod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40EmprCod", AV40EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV60UsurCod", AV60UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60UsurCod, "@!"))));
   }

   public void e121IM2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( AV23BarPieMet.doubleValue() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Metros con valor cero ¡¡¡", ""));
         GX_FocusControl = edtavBarpiemet_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV18BarPieKil.doubleValue() == 0 ) && ( AV63Indutexma == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Kilos con valor cero ¡¡¡", ""));
            GX_FocusControl = edtavBarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV63Indutexma == 1 )
            {
               Gx_msg = httpContext.getMessage( "Metros = ", "") + GXutil.str( AV23BarPieMet, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "Kilos  = ", "") + GXutil.str( AV18BarPieKil, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "Ancho  =", "") + GXutil.str( AV7Ancho_f, 3, 0) + GXutil.newLine( ) + httpContext.getMessage( "Calidad=", "") + GXutil.str( AV32BarTroCal, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "Confirma Datos?", "") + GXutil.newLine( ) ;
            }
            else
            {
               Gx_msg = httpContext.getMessage( "Metros = ", "") + GXutil.str( AV23BarPieMet, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "Kilos  = ", "") + GXutil.str( AV18BarPieKil, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "Ancho  =", "") + GXutil.str( AV7Ancho_f, 3, 0) + GXutil.newLine( ) + httpContext.getMessage( "Calidad=", "") + GXutil.str( AV32BarTroCal, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "Confirma Datos?", "") + GXutil.newLine( ) ;
            }
            AV77Confirmar = false ;
            /* Window Datatype Object Property */
            AV79Window.setUrl( formatLink("app.expedicionesautomatizadas.mensajeconfirmarmodificarmetanc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.booltostr(AV77Confirmar)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV15BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV23BarPieMet)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarTroCal,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Ancho_f,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV18BarPieKil)),GXutil.URLEncode(GXutil.rtrim(AV78bapieobse)),GXutil.URLEncode(DecimalUtil.decToString(AV34BarTroKil)),GXutil.URLEncode(DecimalUtil.decToString(AV36BarTroMet)),GXutil.URLEncode(GXutil.ltrimstr(AV54OrdPie,2,0)),GXutil.URLEncode(GXutil.rtrim(AV20BarPieLoc)),GXutil.URLEncode(GXutil.rtrim(AV31BarPieTono1)),GXutil.URLEncode(GXutil.rtrim(AV27BarPieSecu1)),GXutil.URLEncode(GXutil.rtrim(AV28BarPieST)),GXutil.URLEncode(GXutil.rtrim(AV21BarPieLote)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarPieDest,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV58tiraskgs)),GXutil.URLEncode(DecimalUtil.decToString(AV55Retazoskgs)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarPieCliID,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV62Vertex,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70Vtxter,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarTrocal1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74balalaika,1,0)),GXutil.URLEncode(GXutil.rtrim(AV82Pgmname)),GXutil.URLEncode(GXutil.rtrim(AV60UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV57Station)),GXutil.URLEncode(GXutil.rtrim(AV30BarPieTono)),GXutil.URLEncode(GXutil.rtrim(AV26BarPieSecu)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarTrocal1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarAncAca1,3,0)),GXutil.URLEncode(DecimalUtil.decToString(AV19BarPieKil1)),GXutil.URLEncode(DecimalUtil.decToString(AV24BarPieMet1))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarPieMet","BarTroCal","Ancho_f","BarPiekil","bapieobse","Bartrokil","bartromet","OrdPie","BarPieloc","BarPieTono1","BarPieSecu1","BarPieST","BarPieLote","BarPieDest","tiraskgs","Retazoskgs","BarPieCliID","Vertex","Vtxter","BarTroCal1","balalaika","Pgmname","Usurcod","Station","BarPieTono","BarPieSecu","BarTroCal1","BarAncAca1","BarPiekil1","BarPieMet1"})  );
            AV79Window.setReturnParms(new Object[] {"AV77Confirmar",});
            httpContext.newWindow(AV79Window);
            httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(AV10BarCod),Byte.valueOf(AV12BarCodreo),AV11BarCodpar,AV15BarPieCod,AV24BarPieMet1,Short.valueOf(AV9BarAncAca1),Byte.valueOf(AV33BarTrocal1),AV19BarPieKil1,AV8BapieObs,AV38dtokg,AV39dtomt,Integer.valueOf(AV25BarPieOrd),AV20BarPieLoc,AV30BarPieTono,AV26BarPieSecu,AV29BarPieST1,AV22BarPieLote1,Byte.valueOf(AV17BarPieDestIN),AV59tiraskgs1,AV56Retazoskgs1,Integer.valueOf(AV14BarPieCliIDout)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV10BarCod","AV12BarCodreo","AV11BarCodpar","AV15BarPieCod","AV24BarPieMet1","AV9BarAncAca1","AV33BarTrocal1","AV19BarPieKil1","AV8BapieObs","AV38dtokg","AV39dtomt","AV25BarPieOrd","AV20BarPieLoc","AV30BarPieTono","AV26BarPieSecu","AV29BarPieST1","AV22BarPieLote1","AV17BarPieDestIN","AV59tiraskgs1","AV56Retazoskgs1","AV14BarPieCliIDout"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131IM2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_15_1IM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndefectos_Internalname, "", httpContext.getMessage( "Defectos", ""), bttBtndefectos_Jsonclick, 7, httpContext.getMessage( "Defectos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e141im1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiecod_Internalname, httpContext.getMessage( "Pieza", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiecod_Internalname, GXutil.rtrim( AV15BarPieCod), GXutil.rtrim( localUtil.format( AV15BarPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiecod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavLit8_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLit8_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit8_Internalname, GXutil.rtrim( AV52lit8), GXutil.rtrim( localUtil.format( AV52lit8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit8_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavLit8_Visible, edtavLit8_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV23BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiemet_Enabled!=0) ? localUtil.format( AV23BarPieMet, "ZZZZZ9.99") : localUtil.format( AV23BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBartromet_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartromet_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartromet_Internalname, GXutil.ltrim( localUtil.ntoc( AV36BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartromet_Enabled!=0) ? localUtil.format( AV36BarTroMet, "ZZZZZ9.99") : localUtil.format( AV36BarTroMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartromet_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBartromet_Visible, edtavBartromet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiekil_Internalname, httpContext.getMessage( "Kilos", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiekil_Enabled!=0) ? localUtil.format( AV18BarPieKil, "ZZZZZ9.99") : localUtil.format( AV18BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBartrokil_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartrokil_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartrokil_Internalname, GXutil.ltrim( localUtil.ntoc( AV34BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartrokil_Enabled!=0) ? localUtil.format( AV34BarTroKil, "ZZZZZ9.99") : localUtil.format( AV34BarTroKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartrokil_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBartrokil_Visible, edtavBartrokil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAncho_f_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAncho_f_Internalname, httpContext.getMessage( "Ancho Final(cm)", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAncho_f_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Ancho_f, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAncho_f_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7Ancho_f), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7Ancho_f), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAncho_f_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAncho_f_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBartrocal.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBartrocal.getInternalname(), httpContext.getMessage( "Calidad Pieza", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBartrocal, cmbavBartrocal.getInternalname(), GXutil.trim( GXutil.str( AV32BarTroCal, 2, 0)), 1, cmbavBartrocal.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBartrocal.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         cmbavBartrocal.setValue( GXutil.trim( GXutil.str( AV32BarTroCal, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBartrocal.getInternalname(), "Values", cmbavBartrocal.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavOrdpie_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavOrdpie_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOrdpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV54OrdPie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOrdpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54OrdPie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV54OrdPie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOrdpie_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavOrdpie_Visible, edtavOrdpie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarpieloc_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpieloc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpieloc_Internalname, httpContext.getMessage( "Ubicacion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpieloc_Internalname, GXutil.rtrim( AV20BarPieLoc), GXutil.rtrim( localUtil.format( AV20BarPieLoc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpieloc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarpieloc_Visible, edtavBarpieloc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavTiraskgs_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTiraskgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTiraskgs_Internalname, httpContext.getMessage( "Cant. Tiras", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTiraskgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV58tiraskgs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTiraskgs_Enabled!=0) ? localUtil.format( AV58tiraskgs, "ZZ9.99") : localUtil.format( AV58tiraskgs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTiraskgs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavTiraskgs_Visible, edtavTiraskgs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavRetazoskgs_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRetazoskgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRetazoskgs_Internalname, httpContext.getMessage( "Cant. Retazos", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRetazoskgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV55Retazoskgs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRetazoskgs_Enabled!=0) ? localUtil.format( AV55Retazoskgs, "ZZ9.99") : localUtil.format( AV55Retazoskgs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRetazoskgs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavRetazoskgs_Visible, edtavRetazoskgs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarpielote_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpielote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpielote_Internalname, httpContext.getMessage( "Lote", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpielote_Internalname, GXutil.rtrim( AV21BarPieLote), GXutil.rtrim( localUtil.format( AV21BarPieLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpielote_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarpielote_Visible, edtavBarpielote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarpiest_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiest_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiest_Internalname, httpContext.getMessage( "%ST", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiest_Internalname, GXutil.rtrim( AV28BarPieST), GXutil.rtrim( localUtil.format( AV28BarPieST, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiest_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarpiest_Visible, edtavBarpiest_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavBarpiedest.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarpiedest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarpiedest.getInternalname(), httpContext.getMessage( "Subclasificacion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarpiedest, cmbavBarpiedest.getInternalname(), GXutil.trim( GXutil.str( AV16BarPieDest, 2, 0)), 1, cmbavBarpiedest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavBarpiedest.getVisible(), cmbavBarpiedest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         cmbavBarpiedest.setValue( GXutil.trim( GXutil.str( AV16BarPieDest, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarpiedest.getInternalname(), "Values", cmbavBarpiedest.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", dynavBarpiecliid.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+dynavBarpiecliid.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynavBarpiecliid.getInternalname(), httpContext.getMessage( "Asignacion de Cliente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBarpiecliid, dynavBarpiecliid.getInternalname(), GXutil.trim( GXutil.str( AV13BarPieCliID, 6, 0)), 1, dynavBarpiecliid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavBarpiecliid.getVisible(), dynavBarpiecliid.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "", true, (byte)(0), "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         dynavBarpiecliid.setValue( GXutil.trim( GXutil.str( AV13BarPieCliID, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBarpiecliid.getInternalname(), "Values", dynavBarpiecliid.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBapieobs_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBapieobs_Internalname, GXutil.rtrim( AV8BapieObs), GXutil.rtrim( localUtil.format( AV8BapieObs, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBapieobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBapieobs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWMHDPZP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_15_1IM2e( true) ;
      }
      else
      {
         wb_table1_15_1IM2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV10BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
      AV12BarCodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarCodreo", GXutil.str( AV12BarCodreo, 1, 0));
      AV11BarCodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodpar", AV11BarCodpar);
      AV15BarPieCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarPieCod", AV15BarPieCod);
      AV24BarPieMet1 = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarPieMet1", GXutil.ltrimstr( AV24BarPieMet1, 9, 2));
      AV9BarAncAca1 = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarAncAca1), 3, 0));
      AV33BarTrocal1 = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarTrocal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarTrocal1), 2, 0));
      AV19BarPieKil1 = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieKil1", GXutil.ltrimstr( AV19BarPieKil1, 9, 2));
      AV8BapieObs = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BapieObs", AV8BapieObs);
      AV38dtokg = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38dtokg", GXutil.ltrimstr( AV38dtokg, 9, 2));
      AV39dtomt = (java.math.BigDecimal)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39dtomt", GXutil.ltrimstr( AV39dtomt, 9, 2));
      AV25BarPieOrd = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPieOrd), 8, 0));
      AV20BarPieLoc = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieLoc", AV20BarPieLoc);
      AV30BarPieTono = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarPieTono", AV30BarPieTono);
      AV26BarPieSecu = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarPieSecu", AV26BarPieSecu);
      AV29BarPieST1 = (String)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieST1", AV29BarPieST1);
      AV22BarPieLote1 = (String)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarPieLote1", AV22BarPieLote1);
      AV17BarPieDestIN = ((Number) GXutil.testNumericType( getParm(obj,18), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarPieDestIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17BarPieDestIN), 2, 0));
      AV59tiraskgs1 = (java.math.BigDecimal)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59tiraskgs1", GXutil.ltrimstr( AV59tiraskgs1, 6, 2));
      AV56Retazoskgs1 = (java.math.BigDecimal)getParm(obj,20) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Retazoskgs1", GXutil.ltrimstr( AV56Retazoskgs1, 6, 2));
      AV14BarPieCliIDout = ((Number) GXutil.testNumericType( getParm(obj,21), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieCliIDout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarPieCliIDout), 6, 0));
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
      pa1IM2( ) ;
      ws1IM2( ) ;
      we1IM2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131067", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webwmhdpzp.js", "?202682415131067", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtndefectos_Internalname = "BTNDEFECTOS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavBarpiecod_Internalname = "vBARPIECOD" ;
      edtavLit8_Internalname = "vLIT8" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      edtavBartromet_Internalname = "vBARTROMET" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarpiekil_Internalname = "vBARPIEKIL" ;
      edtavBartrokil_Internalname = "vBARTROKIL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavAncho_f_Internalname = "vANCHO_F" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      cmbavBartrocal.setInternalname( "vBARTROCAL" );
      edtavOrdpie_Internalname = "vORDPIE" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavBarpieloc_Internalname = "vBARPIELOC" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavTiraskgs_Internalname = "vTIRASKGS" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtavRetazoskgs_Internalname = "vRETAZOSKGS" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavBarpielote_Internalname = "vBARPIELOTE" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      edtavBarpiest_Internalname = "vBARPIEST" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      cmbavBarpiedest.setInternalname( "vBARPIEDEST" );
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      dynavBarpiecliid.setInternalname( "vBARPIECLIID" );
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      edtavBapieobs_Internalname = "vBAPIEOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
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
      edtavBapieobs_Jsonclick = "" ;
      edtavBapieobs_Enabled = 0 ;
      dynavBarpiecliid.setJsonclick( "" );
      dynavBarpiecliid.setEnabled( 1 );
      cmbavBarpiedest.setJsonclick( "" );
      cmbavBarpiedest.setEnabled( 1 );
      edtavBarpiest_Jsonclick = "" ;
      edtavBarpiest_Enabled = 1 ;
      edtavBarpielote_Jsonclick = "" ;
      edtavBarpielote_Enabled = 1 ;
      edtavRetazoskgs_Jsonclick = "" ;
      edtavRetazoskgs_Enabled = 1 ;
      edtavTiraskgs_Jsonclick = "" ;
      edtavTiraskgs_Enabled = 1 ;
      edtavBarpieloc_Jsonclick = "" ;
      edtavBarpieloc_Enabled = 0 ;
      edtavOrdpie_Jsonclick = "" ;
      edtavOrdpie_Enabled = 1 ;
      cmbavBartrocal.setJsonclick( "" );
      cmbavBartrocal.setEnabled( 1 );
      edtavAncho_f_Jsonclick = "" ;
      edtavAncho_f_Enabled = 1 ;
      edtavBartrokil_Jsonclick = "" ;
      edtavBartrokil_Enabled = 1 ;
      edtavBarpiekil_Jsonclick = "" ;
      edtavBarpiekil_Enabled = 1 ;
      edtavBartromet_Jsonclick = "" ;
      edtavBartromet_Enabled = 1 ;
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Enabled = 1 ;
      edtavLit8_Jsonclick = "" ;
      edtavLit8_Enabled = 1 ;
      edtavBarpiecod_Jsonclick = "" ;
      edtavBarpiecod_Enabled = 0 ;
      dynavBarpiecliid.setVisible( 1 );
      edtavRetazoskgs_Visible = 1 ;
      edtavTiraskgs_Visible = 1 ;
      edtavLit8_Visible = 1 ;
      cmbavBarpiedest.setVisible( 1 );
      edtavBarpiest_Visible = 1 ;
      edtavBarpielote_Visible = 1 ;
      edtavBarpieloc_Visible = 1 ;
      edtavOrdpie_Visible = 1 ;
      edtavBartromet_Visible = 1 ;
      edtavBartrokil_Visible = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = "" ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Web WMHDPZP", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavBartrocal.setName( "vBARTROCAL" );
      cmbavBartrocal.setWebtags( "" );
      cmbavBartrocal.addItem("1", httpContext.getMessage( "Primera", ""), (short)(0));
      cmbavBartrocal.addItem("2", httpContext.getMessage( "Segunda", ""), (short)(0));
      cmbavBartrocal.addItem("3", httpContext.getMessage( "Pendiente", ""), (short)(0));
      if ( cmbavBartrocal.getItemCount() > 0 )
      {
         AV32BarTroCal = (byte)(GXutil.lval( cmbavBartrocal.getValidValue(GXutil.trim( GXutil.str( AV32BarTroCal, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarTroCal), 2, 0));
      }
      cmbavBarpiedest.setName( "vBARPIEDEST" );
      cmbavBarpiedest.setWebtags( "" );
      if ( cmbavBarpiedest.getItemCount() > 0 )
      {
         AV16BarPieDest = (byte)(GXutil.lval( cmbavBarpiedest.getValidValue(GXutil.trim( GXutil.str( AV16BarPieDest, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarPieDest), 2, 0));
      }
      dynavBarpiecliid.setName( "vBARPIECLIID" );
      dynavBarpiecliid.setWebtags( "" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV63Indutexma',fld:'vINDUTEXMA',pic:'9',hsh:true},{av:'AV78bapieobse',fld:'vBAPIEOBSE',pic:'',hsh:true},{av:'AV31BarPieTono1',fld:'vBARPIETONO1',pic:'',hsh:true},{av:'AV27BarPieSecu1',fld:'vBARPIESECU1',pic:'',hsh:true},{av:'AV62Vertex',fld:'vVERTEX',pic:'9',hsh:true},{av:'AV70Vtxter',fld:'vVTXTER',pic:'9',hsh:true},{av:'AV74balalaika',fld:'vBALALAIKA',pic:'9',hsh:true},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV57Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV75DefectoscomoBalalaika',fld:'vDEFECTOSCOMOBALALAIKA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121IM2',iparms:[{av:'AV23BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV18BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV63Indutexma',fld:'vINDUTEXMA',pic:'9',hsh:true},{av:'AV7Ancho_f',fld:'vANCHO_F',pic:'ZZZ9'},{av:'cmbavBartrocal'},{av:'AV32BarTroCal',fld:'vBARTROCAL',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV15BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV78bapieobse',fld:'vBAPIEOBSE',pic:'',hsh:true},{av:'AV34BarTroKil',fld:'vBARTROKIL',pic:'ZZZZZ9.99'},{av:'AV36BarTroMet',fld:'vBARTROMET',pic:'ZZZZZ9.99'},{av:'AV54OrdPie',fld:'vORDPIE',pic:'Z9'},{av:'AV20BarPieLoc',fld:'vBARPIELOC',pic:''},{av:'AV31BarPieTono1',fld:'vBARPIETONO1',pic:'',hsh:true},{av:'AV27BarPieSecu1',fld:'vBARPIESECU1',pic:'',hsh:true},{av:'AV28BarPieST',fld:'vBARPIEST',pic:''},{av:'AV21BarPieLote',fld:'vBARPIELOTE',pic:''},{av:'cmbavBarpiedest'},{av:'AV16BarPieDest',fld:'vBARPIEDEST',pic:'Z9'},{av:'AV58tiraskgs',fld:'vTIRASKGS',pic:'ZZ9.99'},{av:'AV55Retazoskgs',fld:'vRETAZOSKGS',pic:'ZZ9.99'},{av:'dynavBarpiecliid'},{av:'AV13BarPieCliID',fld:'vBARPIECLIID',pic:'ZZZZZ9'},{av:'AV62Vertex',fld:'vVERTEX',pic:'9',hsh:true},{av:'AV70Vtxter',fld:'vVTXTER',pic:'9',hsh:true},{av:'AV74balalaika',fld:'vBALALAIKA',pic:'9',hsh:true},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV60UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV57Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30BarPieTono',fld:'vBARPIETONO',pic:''},{av:'AV26BarPieSecu',fld:'vBARPIESECU',pic:''},{av:'AV33BarTrocal1',fld:'vBARTROCAL1',pic:'9'},{av:'AV9BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV19BarPieKil1',fld:'vBARPIEKIL1',pic:'ZZZZZ9.99'},{av:'AV24BarPieMet1',fld:'vBARPIEMET1',pic:'ZZZZZ9.99'},{av:'AV14BarPieCliIDout',fld:'vBARPIECLIIDOUT',pic:'ZZZZZ9'},{av:'AV56Retazoskgs1',fld:'vRETAZOSKGS1',pic:'ZZ9.99'},{av:'AV59tiraskgs1',fld:'vTIRASKGS1',pic:'ZZ9.99'},{av:'AV17BarPieDestIN',fld:'vBARPIEDESTIN',pic:'Z9'},{av:'AV22BarPieLote1',fld:'vBARPIELOTE1',pic:''},{av:'AV29BarPieST1',fld:'vBARPIEST1',pic:''},{av:'AV25BarPieOrd',fld:'vBARPIEORD',pic:'ZZZZZZZ9'},{av:'AV39dtomt',fld:'vDTOMT',pic:'ZZZZZ9.99'},{av:'AV38dtokg',fld:'vDTOKG',pic:'ZZZZZ9.99'},{av:'AV8BapieObs',fld:'vBAPIEOBS',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("'DODEFECTOS'","{handler:'e141IM1',iparms:[{av:'AV74balalaika',fld:'vBALALAIKA',pic:'9',hsh:true},{av:'AV75DefectoscomoBalalaika',fld:'vDEFECTOSCOMOBALALAIKA',pic:'9',hsh:true}]");
      setEventMetadata("'DODEFECTOS'",",oparms:[]}");
      setEventMetadata("VALIDV_BARPIECOD","{handler:'validv_Barpiecod',iparms:[]");
      setEventMetadata("VALIDV_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARTROCAL","{handler:'validv_Bartrocal',iparms:[]");
      setEventMetadata("VALIDV_BARTROCAL",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOAV11BarCodpar = "" ;
      wcpOAV15BarPieCod = "" ;
      wcpOAV24BarPieMet1 = DecimalUtil.ZERO ;
      wcpOAV19BarPieKil1 = DecimalUtil.ZERO ;
      wcpOAV8BapieObs = "" ;
      wcpOAV38dtokg = DecimalUtil.ZERO ;
      wcpOAV39dtomt = DecimalUtil.ZERO ;
      wcpOAV20BarPieLoc = "" ;
      wcpOAV30BarPieTono = "" ;
      wcpOAV26BarPieSecu = "" ;
      wcpOAV29BarPieST1 = "" ;
      wcpOAV22BarPieLote1 = "" ;
      wcpOAV59tiraskgs1 = DecimalUtil.ZERO ;
      wcpOAV56Retazoskgs1 = DecimalUtil.ZERO ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV11BarCodpar = "" ;
      AV15BarPieCod = "" ;
      AV24BarPieMet1 = DecimalUtil.ZERO ;
      AV19BarPieKil1 = DecimalUtil.ZERO ;
      AV8BapieObs = "" ;
      AV38dtokg = DecimalUtil.ZERO ;
      AV39dtomt = DecimalUtil.ZERO ;
      AV20BarPieLoc = "" ;
      AV30BarPieTono = "" ;
      AV26BarPieSecu = "" ;
      AV29BarPieST1 = "" ;
      AV22BarPieLote1 = "" ;
      AV59tiraskgs1 = DecimalUtil.ZERO ;
      AV56Retazoskgs1 = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV78bapieobse = "" ;
      AV31BarPieTono1 = "" ;
      AV27BarPieSecu1 = "" ;
      AV82Pgmname = "" ;
      AV60UsurCod = "" ;
      AV57Station = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H01IM2_A396EmprCod = new String[] {""} ;
      H01IM2_A252CliCod = new int[1] ;
      H01IM2_A279CliNom = new String[] {""} ;
      H01IM3_A396EmprCod = new String[] {""} ;
      AV52lit8 = "" ;
      AV23BarPieMet = DecimalUtil.ZERO ;
      AV36BarTroMet = DecimalUtil.ZERO ;
      AV18BarPieKil = DecimalUtil.ZERO ;
      AV34BarTroKil = DecimalUtil.ZERO ;
      AV58tiraskgs = DecimalUtil.ZERO ;
      AV55Retazoskgs = DecimalUtil.ZERO ;
      AV21BarPieLote = "" ;
      AV28BarPieST = "" ;
      AV6EmprNom = "" ;
      AV40EmprCod = "" ;
      AV83Ricoltex = DecimalUtil.ZERO ;
      GXv_int5 = new byte[1] ;
      H01IM4_A396EmprCod = new String[] {""} ;
      H01IM4_A12777CalidadNm = new String[] {""} ;
      H01IM4_n12777CalidadNm = new boolean[] {false} ;
      H01IM4_A12776CalidadId = new byte[1] ;
      A12777CalidadNm = "" ;
      H01IM5_A200BarPieCod = new String[] {""} ;
      H01IM5_A130BarCodPar = new String[] {""} ;
      H01IM5_A132BarCodReo = new byte[1] ;
      H01IM5_A129BarCod = new int[1] ;
      H01IM5_A396EmprCod = new String[] {""} ;
      H01IM5_A44AlbRecCod = new int[1] ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      H01IM6_A396EmprCod = new String[] {""} ;
      H01IM6_A13209SubClaDsc = new String[] {""} ;
      H01IM6_n13209SubClaDsc = new boolean[] {false} ;
      H01IM6_A13208SubClaID = new byte[1] ;
      A13209SubClaDsc = "" ;
      H01IM7_A396EmprCod = new String[] {""} ;
      H01IM7_A279CliNom = new String[] {""} ;
      H01IM7_A10045CliAct = new String[] {""} ;
      H01IM7_A252CliCod = new int[1] ;
      A279CliNom = "" ;
      A10045CliAct = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      Gx_msg = "" ;
      AV79Window = new com.genexus.webpanels.GXWindow();
      sStyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtndefectos_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwmhdpzp__default(),
         new Object[] {
             new Object[] {
            H01IM2_A396EmprCod, H01IM2_A252CliCod, H01IM2_A279CliNom
            }
            , new Object[] {
            H01IM3_A396EmprCod
            }
            , new Object[] {
            H01IM4_A396EmprCod, H01IM4_A12777CalidadNm, H01IM4_n12777CalidadNm, H01IM4_A12776CalidadId
            }
            , new Object[] {
            H01IM5_A200BarPieCod, H01IM5_A130BarCodPar, H01IM5_A132BarCodReo, H01IM5_A129BarCod, H01IM5_A396EmprCod, H01IM5_A44AlbRecCod
            }
            , new Object[] {
            H01IM6_A396EmprCod, H01IM6_A13209SubClaDsc, H01IM6_n13209SubClaDsc, H01IM6_A13208SubClaID
            }
            , new Object[] {
            H01IM7_A396EmprCod, H01IM7_A279CliNom, H01IM7_A10045CliAct, H01IM7_A252CliCod
            }
         }
      );
      AV82Pgmname = "ExpedicionesAutomatizadas.WebWMHDPZP" ;
      /* GeneXus formulas. */
      AV82Pgmname = "ExpedicionesAutomatizadas.WebWMHDPZP" ;
      Gx_err = (short)(0) ;
      edtavLit8_Enabled = 0 ;
   }

   private byte wcpOAV12BarCodreo ;
   private byte wcpOAV33BarTrocal1 ;
   private byte wcpOAV17BarPieDestIN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV12BarCodreo ;
   private byte AV33BarTrocal1 ;
   private byte AV17BarPieDestIN ;
   private byte gxajaxcallmode ;
   private byte AV63Indutexma ;
   private byte AV62Vertex ;
   private byte AV70Vtxter ;
   private byte AV74balalaika ;
   private byte AV75DefectoscomoBalalaika ;
   private byte nDonePA ;
   private byte AV32BarTroCal ;
   private byte AV16BarPieDest ;
   private byte AV54OrdPie ;
   private byte AV64Fatelca ;
   private byte AV65Piolera ;
   private byte AV67DivRollo ;
   private byte AV68Stamperia ;
   private byte AV69Retazos ;
   private byte AV71TablaCalidad ;
   private byte AV72CtrlDefectos ;
   private byte AV73anahuac ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte A12776CalidadId ;
   private byte A132BarCodReo ;
   private byte A13208SubClaID ;
   private byte nGXWrapped ;
   private short wcpOAV9BarAncAca1 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV9BarAncAca1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV7Ancho_f ;
   private int wcpOAV10BarCod ;
   private int wcpOAV25BarPieOrd ;
   private int wcpOAV14BarPieCliIDout ;
   private int AV10BarCod ;
   private int AV25BarPieOrd ;
   private int AV14BarPieCliIDout ;
   private int gxdynajaxindex ;
   private int AV13BarPieCliID ;
   private int edtavLit8_Enabled ;
   private int edtavBartrokil_Visible ;
   private int edtavBartromet_Visible ;
   private int edtavOrdpie_Visible ;
   private int edtavBarpieloc_Visible ;
   private int edtavBarpielote_Visible ;
   private int edtavBarpiest_Visible ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int AV5AlbRecCod ;
   private int edtavLit8_Visible ;
   private int edtavTiraskgs_Visible ;
   private int edtavRetazoskgs_Visible ;
   private int A252CliCod ;
   private int edtavBarpiecod_Enabled ;
   private int edtavBarpiemet_Enabled ;
   private int edtavBartromet_Enabled ;
   private int edtavBarpiekil_Enabled ;
   private int edtavBartrokil_Enabled ;
   private int edtavAncho_f_Enabled ;
   private int edtavOrdpie_Enabled ;
   private int edtavBarpieloc_Enabled ;
   private int edtavTiraskgs_Enabled ;
   private int edtavRetazoskgs_Enabled ;
   private int edtavBarpielote_Enabled ;
   private int edtavBarpiest_Enabled ;
   private int edtavBapieobs_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV24BarPieMet1 ;
   private java.math.BigDecimal wcpOAV19BarPieKil1 ;
   private java.math.BigDecimal wcpOAV38dtokg ;
   private java.math.BigDecimal wcpOAV39dtomt ;
   private java.math.BigDecimal wcpOAV59tiraskgs1 ;
   private java.math.BigDecimal wcpOAV56Retazoskgs1 ;
   private java.math.BigDecimal AV24BarPieMet1 ;
   private java.math.BigDecimal AV19BarPieKil1 ;
   private java.math.BigDecimal AV38dtokg ;
   private java.math.BigDecimal AV39dtomt ;
   private java.math.BigDecimal AV59tiraskgs1 ;
   private java.math.BigDecimal AV56Retazoskgs1 ;
   private java.math.BigDecimal AV23BarPieMet ;
   private java.math.BigDecimal AV36BarTroMet ;
   private java.math.BigDecimal AV18BarPieKil ;
   private java.math.BigDecimal AV34BarTroKil ;
   private java.math.BigDecimal AV58tiraskgs ;
   private java.math.BigDecimal AV55Retazoskgs ;
   private java.math.BigDecimal AV83Ricoltex ;
   private String wcpOA396EmprCod ;
   private String wcpOAV11BarCodpar ;
   private String wcpOAV15BarPieCod ;
   private String wcpOAV8BapieObs ;
   private String wcpOAV20BarPieLoc ;
   private String wcpOAV30BarPieTono ;
   private String wcpOAV26BarPieSecu ;
   private String wcpOAV29BarPieST1 ;
   private String wcpOAV22BarPieLote1 ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV11BarCodpar ;
   private String AV15BarPieCod ;
   private String AV8BapieObs ;
   private String AV20BarPieLoc ;
   private String AV30BarPieTono ;
   private String AV26BarPieSecu ;
   private String AV29BarPieST1 ;
   private String AV22BarPieLote1 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV78bapieobse ;
   private String AV31BarPieTono1 ;
   private String AV27BarPieSecu1 ;
   private String AV82Pgmname ;
   private String AV60UsurCod ;
   private String AV57Station ;
   private String GXKey ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLit8_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV52lit8 ;
   private String edtavBarpiemet_Internalname ;
   private String edtavBartromet_Internalname ;
   private String edtavBarpiekil_Internalname ;
   private String edtavBartrokil_Internalname ;
   private String edtavAncho_f_Internalname ;
   private String edtavOrdpie_Internalname ;
   private String edtavTiraskgs_Internalname ;
   private String edtavRetazoskgs_Internalname ;
   private String AV21BarPieLote ;
   private String edtavBarpielote_Internalname ;
   private String AV28BarPieST ;
   private String edtavBarpiest_Internalname ;
   private String AV6EmprNom ;
   private String AV40EmprCod ;
   private String A12777CalidadNm ;
   private String edtavBarpieloc_Internalname ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String A13209SubClaDsc ;
   private String A279CliNom ;
   private String A10045CliAct ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String Gx_msg ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtndefectos_Internalname ;
   private String bttBtndefectos_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarpiecod_Internalname ;
   private String edtavBarpiecod_Jsonclick ;
   private String edtavLit8_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarpiemet_Jsonclick ;
   private String edtavBartromet_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarpiekil_Jsonclick ;
   private String edtavBartrokil_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavAncho_f_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavOrdpie_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavBarpieloc_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavTiraskgs_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String edtavRetazoskgs_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavBarpielote_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String edtavBarpiest_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtavBapieobs_Internalname ;
   private String edtavBapieobs_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n12777CalidadNm ;
   private boolean n13209SubClaDsc ;
   private boolean AV77Confirmar ;
   private com.genexus.webpanels.GXWindow AV79Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private HTMLChoice cmbavBartrocal ;
   private HTMLChoice cmbavBarpiedest ;
   private HTMLChoice dynavBarpiecliid ;
   private IDataStoreProvider pr_default ;
   private String[] H01IM2_A396EmprCod ;
   private int[] H01IM2_A252CliCod ;
   private String[] H01IM2_A279CliNom ;
   private String[] H01IM3_A396EmprCod ;
   private String[] H01IM4_A396EmprCod ;
   private String[] H01IM4_A12777CalidadNm ;
   private boolean[] H01IM4_n12777CalidadNm ;
   private byte[] H01IM4_A12776CalidadId ;
   private String[] H01IM5_A200BarPieCod ;
   private String[] H01IM5_A130BarCodPar ;
   private byte[] H01IM5_A132BarCodReo ;
   private int[] H01IM5_A129BarCod ;
   private String[] H01IM5_A396EmprCod ;
   private int[] H01IM5_A44AlbRecCod ;
   private String[] H01IM6_A396EmprCod ;
   private String[] H01IM6_A13209SubClaDsc ;
   private boolean[] H01IM6_n13209SubClaDsc ;
   private byte[] H01IM6_A13208SubClaID ;
   private String[] H01IM7_A396EmprCod ;
   private String[] H01IM7_A279CliNom ;
   private String[] H01IM7_A10045CliAct ;
   private int[] H01IM7_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwmhdpzp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01IM2", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IM3", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01IM4", "SELECT EmprCod, CalidadNm, CalidadId FROM TXPCALIDA WHERE EmprCod = ? ORDER BY EmprCod, CalidadId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IM5", "SELECT BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01IM6", "SELECT EmprCod, SubClaDsc, SubClaID FROM TXPSUBCLA WHERE EmprCod = ? ORDER BY EmprCod, SubClaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01IM7", "SELECT EmprCod, CliNom, CliAct, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliNom <> ' ') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

