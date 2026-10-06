package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mensajeconfirmarimprimir_impl extends GXDataArea
{
   public mensajeconfirmarimprimir_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mensajeconfirmarimprimir_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mensajeconfirmarimprimir_impl.class ));
   }

   public mensajeconfirmarimprimir_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mensaje") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Mensaje") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mensaje") ;
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
            AV6Mensaje = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV24Confirmadom = CommonUtil.decimalVal( httpContext.GetPar( "Confirmadom"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Confirmadom", GXutil.ltrimstr( AV24Confirmadom, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONFIRMADOM", getSecureSignedToken( "", localUtil.format( AV24Confirmadom, "9999999.99")));
               AV9EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
               AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
               AV10BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
               AV11BarCodpar = httpContext.GetPar( "BarCodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodpar", AV11BarCodpar);
               AV12BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarPieCod", AV12BarPieCod);
               AV13BarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "BarPieMet"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieMet", GXutil.ltrimstr( AV13BarPieMet, 9, 2));
               AV7barPieKil = CommonUtil.decimalVal( httpContext.GetPar( "barPieKil"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7barPieKil", GXutil.ltrimstr( AV7barPieKil, 9, 2));
               AV16BarTrocal = (byte)(GXutil.lval( httpContext.GetPar( "BarTrocal"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarTrocal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarTrocal), 2, 0));
               AV19Ancho_f = (short)(GXutil.lval( httpContext.GetPar( "Ancho_f"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Ancho_f), 4, 0));
               AV7barPieKil = CommonUtil.decimalVal( httpContext.GetPar( "barPieKil"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7barPieKil", GXutil.ltrimstr( AV7barPieKil, 9, 2));
               AV15Bapieobse = httpContext.GetPar( "Bapieobse") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Bapieobse", AV15Bapieobse);
               AV14BarPieOrd = (int)(GXutil.lval( httpContext.GetPar( "BarPieOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarPieOrd), 8, 0));
               AV22Imprimir = httpContext.GetPar( "Imprimir") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Imprimir", AV22Imprimir);
               AV23Vertex = (byte)(GXutil.lval( httpContext.GetPar( "Vertex"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Vertex", GXutil.str( AV23Vertex, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Vertex), "9")));
               AV17Ricoltex = (byte)(GXutil.lval( httpContext.GetPar( "Ricoltex"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Ricoltex", GXutil.str( AV17Ricoltex, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRICOLTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Ricoltex), "9")));
               AV20Indutexma = (byte)(GXutil.lval( httpContext.GetPar( "Indutexma"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Indutexma", GXutil.str( AV20Indutexma, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Indutexma), "9")));
               AV21Fatelca = (byte)(GXutil.lval( httpContext.GetPar( "Fatelca"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Fatelca", GXutil.str( AV21Fatelca, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFATELCA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Fatelca), "9")));
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
      pa1IU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1IU2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.mensajeconfirmarimprimir", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Mensaje)),GXutil.URLEncode(DecimalUtil.decToString(AV24Confirmadom)),GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV12BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV13BarPieMet)),GXutil.URLEncode(DecimalUtil.decToString(AV7barPieKil)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarTrocal,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19Ancho_f,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV7barPieKil)),GXutil.URLEncode(GXutil.rtrim(AV15Bapieobse)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarPieOrd,8,0)),GXutil.URLEncode(GXutil.rtrim(AV22Imprimir)),GXutil.URLEncode(GXutil.ltrimstr(AV23Vertex,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Ricoltex,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Indutexma,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21Fatelca,1,0))}, new String[] {"Mensaje","Confirmadom","EmprCod","BarCod","BarCodreo","BarCodpar","BarPieCod","BarPieMet","barPieKil","BarTrocal","Ancho_f","barPieKil","Bapieobse","BarPieOrd","Imprimir","Vertex","Ricoltex","Indutexma","Fatelca"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRICOLTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Ricoltex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Indutexma), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFATELCA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Fatelca), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Vertex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONFIRMADOM", getSecureSignedToken( "", localUtil.format( AV24Confirmadom, "9999999.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV30Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIECOD", GXutil.rtrim( AV12BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV13BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV7barPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL", GXutil.ltrim( localUtil.ntoc( AV16BarTrocal, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRICOLTEX", GXutil.ltrim( localUtil.ntoc( AV17Ricoltex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRICOLTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Ricoltex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINDUTEXMA", GXutil.ltrim( localUtil.ntoc( AV20Indutexma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Indutexma), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFATELCA", GXutil.ltrim( localUtil.ntoc( AV21Fatelca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFATELCA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Fatelca), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPRIMIR", GXutil.rtrim( AV22Imprimir));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV23Vertex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Vertex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONFIRMADOM", GXutil.ltrim( localUtil.ntoc( AV24Confirmadom, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONFIRMADOM", getSecureSignedToken( "", localUtil.format( AV24Confirmadom, "9999999.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vANCHO_F", GXutil.ltrim( localUtil.ntoc( AV19Ancho_f, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAPIEOBSE", GXutil.rtrim( AV15Bapieobse));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEORD", GXutil.ltrim( localUtil.ntoc( AV14BarPieOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we1IU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1IU2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.mensajeconfirmarimprimir", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Mensaje)),GXutil.URLEncode(DecimalUtil.decToString(AV24Confirmadom)),GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV12BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV13BarPieMet)),GXutil.URLEncode(DecimalUtil.decToString(AV7barPieKil)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarTrocal,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19Ancho_f,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV7barPieKil)),GXutil.URLEncode(GXutil.rtrim(AV15Bapieobse)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarPieOrd,8,0)),GXutil.URLEncode(GXutil.rtrim(AV22Imprimir)),GXutil.URLEncode(GXutil.ltrimstr(AV23Vertex,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Ricoltex,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Indutexma,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21Fatelca,1,0))}, new String[] {"Mensaje","Confirmadom","EmprCod","BarCod","BarCodreo","BarCodpar","BarPieCod","BarPieMet","barPieKil","BarTrocal","Ancho_f","barPieKil","Bapieobse","BarPieOrd","Imprimir","Vertex","Ricoltex","Indutexma","Fatelca"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.MensajeConfirmarImprimir" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mensaje Confirmar", "") ;
   }

   public void wb1IU0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMensaje_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMensaje_Internalname, AV6Mensaje, "", "", (short)(1), 1, edtavMensaje_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarImprimir.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarImprimir.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarImprimir.htm");
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

   public void start1IU2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mensaje Confirmar", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1IU0( ) ;
   }

   public void ws1IU2( )
   {
      start1IU2( ) ;
      evt1IU2( ) ;
   }

   public void evt1IU2( )
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
                           e111IU2 ();
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
                                 e121IU2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131IU2 ();
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

   public void we1IU2( )
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

   public void pa1IU2( )
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
      rf1IU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV30Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarImprimir" ;
      Gx_err = (short)(0) ;
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
   }

   public void rf1IU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01IU2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = H01IU2_A396EmprCod[0] ;
            /* Execute user event: Load */
            e131IU2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb1IU0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1IU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV30Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRICOLTEX", GXutil.ltrim( localUtil.ntoc( AV17Ricoltex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRICOLTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Ricoltex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINDUTEXMA", GXutil.ltrim( localUtil.ntoc( AV20Indutexma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Indutexma), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFATELCA", GXutil.ltrim( localUtil.ntoc( AV21Fatelca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFATELCA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Fatelca), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV23Vertex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Vertex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONFIRMADOM", GXutil.ltrim( localUtil.ntoc( AV24Confirmadom, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONFIRMADOM", getSecureSignedToken( "", localUtil.format( AV24Confirmadom, "9999999.99")));
   }

   public void before_start_formulas( )
   {
      AV30Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarImprimir" ;
      Gx_err = (short)(0) ;
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1IU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111IU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
      e111IU2 ();
      if (returnInSub) return;
   }

   public void e111IU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5Confirmado = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mensajeconfirmarimprimir_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV28Emprnom ;
      GXv_char4[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      mensajeconfirmarimprimir_impl.this.AV9EmprCod = GXv_char2[0] ;
      mensajeconfirmarimprimir_impl.this.AV28Emprnom = GXv_char3[0] ;
      mensajeconfirmarimprimir_impl.this.AV29Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121IU2 ();
      if (returnInSub) return;
   }

   public void e121IU2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV5Confirmado = true ;
      AV18Act_vtx = (byte)(1) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Llamada PCREOTRZ", "", "", "", "", "", "", "", "", ""), AV30Pgmname) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = AV8BarCod ;
      GXv_int6[0] = AV10BarCodreo ;
      GXv_char3[0] = AV11BarCodpar ;
      GXv_char2[0] = AV12BarPieCod ;
      GXv_decimal7[0] = AV13BarPieMet ;
      GXv_decimal8[0] = AV7barPieKil ;
      new app.pcreotrz(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_decimal7, GXv_decimal8) ;
      mensajeconfirmarimprimir_impl.this.A396EmprCod = GXv_char4[0] ;
      mensajeconfirmarimprimir_impl.this.AV8BarCod = GXv_int5[0] ;
      mensajeconfirmarimprimir_impl.this.AV10BarCodreo = GXv_int6[0] ;
      mensajeconfirmarimprimir_impl.this.AV11BarCodpar = GXv_char3[0] ;
      mensajeconfirmarimprimir_impl.this.AV12BarPieCod = GXv_char2[0] ;
      mensajeconfirmarimprimir_impl.this.AV13BarPieMet = GXv_decimal7[0] ;
      mensajeconfirmarimprimir_impl.this.AV7barPieKil = GXv_decimal8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodpar", AV11BarCodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarPieCod", AV12BarPieCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieMet", GXutil.ltrimstr( AV13BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV7barPieKil", GXutil.ltrimstr( AV7barPieKil, 9, 2));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "If &BarTroCal =2 AND &Ricoltex = 0", "", "", "", "", "", "", "", "", ""), AV30Pgmname) ;
      if ( ( AV16BarTrocal == 2 ) && ( AV17Ricoltex == 0 ) )
      {
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "If &Indutexma =0", "", "", "", "", "", "", "", "", ""), AV30Pgmname) ;
      if ( AV20Indutexma == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "if &Fatelca=1", "", "", "", "", "", "", "", "", ""), AV30Pgmname) ;
         if ( AV21Fatelca == 1 )
         {
         }
         else
         {
            GXv_char4[0] = AV12BarPieCod ;
            GXv_char3[0] = AV22Imprimir ;
            new app.rhdrpzr(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
            mensajeconfirmarimprimir_impl.this.AV12BarPieCod = GXv_char4[0] ;
            mensajeconfirmarimprimir_impl.this.AV22Imprimir = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarPieCod", AV12BarPieCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV22Imprimir", AV22Imprimir);
         }
      }
      else
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV8BarCod ;
         GXv_int6[0] = AV10BarCodreo ;
         GXv_char3[0] = AV11BarCodpar ;
         GXv_char2[0] = AV12BarPieCod ;
         GXv_char9[0] = AV22Imprimir ;
         GXv_int10[0] = AV16BarTrocal ;
         new app.rindetiqueta(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char9, GXv_int10) ;
         mensajeconfirmarimprimir_impl.this.A396EmprCod = GXv_char4[0] ;
         mensajeconfirmarimprimir_impl.this.AV8BarCod = GXv_int5[0] ;
         mensajeconfirmarimprimir_impl.this.AV10BarCodreo = GXv_int6[0] ;
         mensajeconfirmarimprimir_impl.this.AV11BarCodpar = GXv_char3[0] ;
         mensajeconfirmarimprimir_impl.this.AV12BarPieCod = GXv_char2[0] ;
         mensajeconfirmarimprimir_impl.this.AV22Imprimir = GXv_char9[0] ;
         mensajeconfirmarimprimir_impl.this.AV16BarTrocal = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodpar", AV11BarCodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarPieCod", AV12BarPieCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Imprimir", AV22Imprimir);
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarTrocal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarTrocal), 2, 0));
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "if &Vertex  = 1", "", "", "", "", "", "", "", "", ""), AV30Pgmname) ;
      if ( AV23Vertex == 1 )
      {
      }
      httpContext.setWebReturnParms(new Object[] {AV24Confirmadom,Byte.valueOf(AV23Vertex),Byte.valueOf(AV17Ricoltex),Byte.valueOf(AV20Indutexma),Byte.valueOf(AV21Fatelca)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV24Confirmadom","AV23Vertex","AV17Ricoltex","AV20Indutexma","AV21Fatelca"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131IU2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6Mensaje = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
      AV24Confirmadom = (java.math.BigDecimal)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Confirmadom", GXutil.ltrimstr( AV24Confirmadom, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONFIRMADOM", getSecureSignedToken( "", localUtil.format( AV24Confirmadom, "9999999.99")));
      AV9EmprCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      AV8BarCod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      AV10BarCodreo = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
      AV11BarCodpar = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodpar", AV11BarCodpar);
      AV12BarPieCod = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarPieCod", AV12BarPieCod);
      AV13BarPieMet = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieMet", GXutil.ltrimstr( AV13BarPieMet, 9, 2));
      AV7barPieKil = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7barPieKil", GXutil.ltrimstr( AV7barPieKil, 9, 2));
      AV16BarTrocal = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarTrocal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarTrocal), 2, 0));
      AV19Ancho_f = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Ancho_f), 4, 0));
      AV7barPieKil = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7barPieKil", GXutil.ltrimstr( AV7barPieKil, 9, 2));
      AV15Bapieobse = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Bapieobse", AV15Bapieobse);
      AV14BarPieOrd = ((Number) GXutil.testNumericType( getParm(obj,13), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarPieOrd), 8, 0));
      AV22Imprimir = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Imprimir", AV22Imprimir);
      AV23Vertex = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Vertex", GXutil.str( AV23Vertex, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Vertex), "9")));
      AV17Ricoltex = ((Number) GXutil.testNumericType( getParm(obj,16), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Ricoltex", GXutil.str( AV17Ricoltex, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRICOLTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Ricoltex), "9")));
      AV20Indutexma = ((Number) GXutil.testNumericType( getParm(obj,17), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Indutexma", GXutil.str( AV20Indutexma, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDUTEXMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Indutexma), "9")));
      AV21Fatelca = ((Number) GXutil.testNumericType( getParm(obj,18), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Fatelca", GXutil.str( AV21Fatelca, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFATELCA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Fatelca), "9")));
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
      pa1IU2( ) ;
      ws1IU2( ) ;
      we1IU2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513820", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/mensajeconfirmarimprimir.js", "?20268241513820", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavMensaje_Internalname = "vMENSAJE" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
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
      edtavMensaje_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Confirmar", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mensaje Confirmar", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV30Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17Ricoltex',fld:'vRICOLTEX',pic:'9',hsh:true},{av:'AV20Indutexma',fld:'vINDUTEXMA',pic:'9',hsh:true},{av:'AV21Fatelca',fld:'vFATELCA',pic:'9',hsh:true},{av:'AV23Vertex',fld:'vVERTEX',pic:'9',hsh:true},{av:'AV24Confirmadom',fld:'vCONFIRMADOM',pic:'9999999.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121IU2',iparms:[{av:'AV30Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV12BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV13BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV7barPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV16BarTrocal',fld:'vBARTROCAL',pic:'9'},{av:'AV17Ricoltex',fld:'vRICOLTEX',pic:'9',hsh:true},{av:'AV20Indutexma',fld:'vINDUTEXMA',pic:'9',hsh:true},{av:'AV21Fatelca',fld:'vFATELCA',pic:'9',hsh:true},{av:'AV22Imprimir',fld:'vIMPRIMIR',pic:''},{av:'AV23Vertex',fld:'vVERTEX',pic:'9',hsh:true},{av:'AV24Confirmadom',fld:'vCONFIRMADOM',pic:'9999999.99',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV7barPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV13BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV12BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV11BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV22Imprimir',fld:'vIMPRIMIR',pic:''},{av:'AV16BarTrocal',fld:'vBARTROCAL',pic:'9'}]}");
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
      wcpOAV6Mensaje = "" ;
      wcpOAV9EmprCod = "" ;
      wcpOAV11BarCodpar = "" ;
      wcpOAV12BarPieCod = "" ;
      wcpOAV13BarPieMet = DecimalUtil.ZERO ;
      wcpOAV7barPieKil = DecimalUtil.ZERO ;
      wcpOAV15Bapieobse = "" ;
      wcpOAV22Imprimir = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6Mensaje = "" ;
      AV24Confirmadom = DecimalUtil.ZERO ;
      AV9EmprCod = "" ;
      AV11BarCodpar = "" ;
      AV12BarPieCod = "" ;
      AV13BarPieMet = DecimalUtil.ZERO ;
      AV7barPieKil = DecimalUtil.ZERO ;
      AV15Bapieobse = "" ;
      AV22Imprimir = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV30Pgmname = "" ;
      GXKey = "" ;
      A396EmprCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01IU2_A396EmprCod = new String[] {""} ;
      AV27Station = "" ;
      GXt_char1 = "" ;
      AV28Emprnom = "" ;
      AV29Usurcod = "" ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.mensajeconfirmarimprimir__default(),
         new Object[] {
             new Object[] {
            H01IU2_A396EmprCod
            }
         }
      );
      AV30Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarImprimir" ;
      /* GeneXus formulas. */
      AV30Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarImprimir" ;
      Gx_err = (short)(0) ;
      edtavMensaje_Enabled = 0 ;
   }

   private byte wcpOAV10BarCodreo ;
   private byte wcpOAV16BarTrocal ;
   private byte wcpOAV23Vertex ;
   private byte wcpOAV17Ricoltex ;
   private byte wcpOAV20Indutexma ;
   private byte wcpOAV21Fatelca ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10BarCodreo ;
   private byte AV16BarTrocal ;
   private byte AV23Vertex ;
   private byte AV17Ricoltex ;
   private byte AV20Indutexma ;
   private byte AV21Fatelca ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV18Act_vtx ;
   private byte GXv_int6[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short wcpOAV19Ancho_f ;
   private short AV19Ancho_f ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8BarCod ;
   private int wcpOAV14BarPieOrd ;
   private int AV8BarCod ;
   private int AV14BarPieOrd ;
   private int edtavMensaje_Enabled ;
   private int GXv_int5[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV13BarPieMet ;
   private java.math.BigDecimal wcpOAV7barPieKil ;
   private java.math.BigDecimal AV24Confirmadom ;
   private java.math.BigDecimal AV13BarPieMet ;
   private java.math.BigDecimal AV7barPieKil ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV11BarCodpar ;
   private String wcpOAV12BarPieCod ;
   private String wcpOAV15Bapieobse ;
   private String wcpOAV22Imprimir ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV9EmprCod ;
   private String AV11BarCodpar ;
   private String AV12BarPieCod ;
   private String AV15Bapieobse ;
   private String AV22Imprimir ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV30Pgmname ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String edtavMensaje_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String AV28Emprnom ;
   private String AV29Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
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
   private boolean AV5Confirmado ;
   private String wcpOAV6Mensaje ;
   private String AV6Mensaje ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private IDataStoreProvider pr_default ;
   private String[] H01IU2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mensajeconfirmarimprimir__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01IU2", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

