package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mensajeconfirmarmodificarmetanc_impl extends GXDataArea
{
   public mensajeconfirmarmodificarmetanc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mensajeconfirmarmodificarmetanc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mensajeconfirmarmodificarmetanc_impl.class ));
   }

   public mensajeconfirmarmodificarmetanc_impl( int remoteHandle ,
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
               AV5Confirmado = GXutil.strtobool( httpContext.GetPar( "Confirmado")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
               AV28EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
               AV25BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
               AV26BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
               AV27BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
               AV9BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarPieCod", AV9BarPieCod);
               AV16BarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "BarPieMet"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieMet", GXutil.ltrimstr( AV16BarPieMet, 9, 2));
               AV19BarTroCal = (byte)(GXutil.lval( httpContext.GetPar( "BarTroCal"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarTroCal), 2, 0));
               AV17Ancho_f = (short)(GXutil.lval( httpContext.GetPar( "Ancho_f"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Ancho_f), 4, 0));
               AV18BarPiekil = CommonUtil.decimalVal( httpContext.GetPar( "BarPiekil"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiekil", GXutil.ltrimstr( AV18BarPiekil, 9, 2));
               AV34bapieobse = httpContext.GetPar( "bapieobse") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34bapieobse", AV34bapieobse);
               AV35Bartrokil = CommonUtil.decimalVal( httpContext.GetPar( "Bartrokil"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35Bartrokil", GXutil.ltrimstr( AV35Bartrokil, 9, 2));
               AV37bartromet = CommonUtil.decimalVal( httpContext.GetPar( "bartromet"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37bartromet", GXutil.ltrimstr( AV37bartromet, 9, 2));
               AV42Ordpie = CommonUtil.decimalVal( httpContext.GetPar( "Ordpie"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Ordpie", GXutil.ltrimstr( AV42Ordpie, 10, 2));
               AV38BarPieloc = httpContext.GetPar( "BarPieloc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38BarPieloc", AV38BarPieloc);
               AV14BarPieTono1 = httpContext.GetPar( "BarPieTono1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieTono1", AV14BarPieTono1);
               AV15BarPieSecu1 = httpContext.GetPar( "BarPieSecu1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarPieSecu1", AV15BarPieSecu1);
               AV39BarPieST = httpContext.GetPar( "BarPieST") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39BarPieST", AV39BarPieST);
               AV40BarPieLote = httpContext.GetPar( "BarPieLote") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40BarPieLote", AV40BarPieLote);
               AV41BarPieDest = (byte)(GXutil.lval( httpContext.GetPar( "BarPieDest"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarPieDest), 2, 0));
               AV43Tiraskgs = CommonUtil.decimalVal( httpContext.GetPar( "Tiraskgs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43Tiraskgs", GXutil.ltrimstr( AV43Tiraskgs, 10, 2));
               AV44Retazoskgs = CommonUtil.decimalVal( httpContext.GetPar( "Retazoskgs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Retazoskgs", GXutil.ltrimstr( AV44Retazoskgs, 10, 2));
               AV29BarPieCliID = (int)(GXutil.lval( httpContext.GetPar( "BarPieCliID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieCliID), 6, 0));
               AV30Vertex = (short)(GXutil.lval( httpContext.GetPar( "Vertex"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30Vertex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Vertex), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Vertex), "ZZZ9")));
               AV31Vtxter = (short)(GXutil.lval( httpContext.GetPar( "Vtxter"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Vtxter", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Vtxter), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Vtxter), "ZZZ9")));
               AV13BarTroCal1 = (short)(GXutil.lval( httpContext.GetPar( "BarTroCal1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarTroCal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarTroCal1), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
               AV33balalaika = (short)(GXutil.lval( httpContext.GetPar( "balalaika"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33balalaika", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33balalaika), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33balalaika), "ZZZ9")));
               AV45Pgmname = httpContext.GetPar( "Pgmname") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
               AV23Usurcod = httpContext.GetPar( "Usurcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Usurcod", AV23Usurcod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Usurcod, "@!"))));
               AV24Station = httpContext.GetPar( "Station") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
               AV20BarPieTono = httpContext.GetPar( "BarPieTono") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieTono", AV20BarPieTono);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarPieTono, ""))));
               AV21BarPieSecu = httpContext.GetPar( "BarPieSecu") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21BarPieSecu", AV21BarPieSecu);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieSecu, ""))));
               AV13BarTroCal1 = (short)(GXutil.lval( httpContext.GetPar( "BarTroCal1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarTroCal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarTroCal1), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
               AV12BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarAncAca1), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAncAca1), "ZZ9")));
               AV11BarPiekil1 = (short)(GXutil.lval( httpContext.GetPar( "BarPiekil1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarPiekil1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarPiekil1), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEKIL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarPiekil1), "ZZZ9")));
               AV10BarPieMet1 = (short)(GXutil.lval( httpContext.GetPar( "BarPieMet1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarPieMet1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarPieMet1), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEMET1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPieMet1), "ZZZ9")));
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
      pa1IQ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1IQ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.mensajeconfirmarmodificarmetanc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Mensaje)),GXutil.URLEncode(GXutil.booltostr(AV5Confirmado)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV27BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarPieMet)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarTroCal,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Ancho_f,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV18BarPiekil)),GXutil.URLEncode(GXutil.rtrim(AV34bapieobse)),GXutil.URLEncode(DecimalUtil.decToString(AV35Bartrokil)),GXutil.URLEncode(DecimalUtil.decToString(AV37bartromet)),GXutil.URLEncode(DecimalUtil.decToString(AV42Ordpie)),GXutil.URLEncode(GXutil.rtrim(AV38BarPieloc)),GXutil.URLEncode(GXutil.rtrim(AV14BarPieTono1)),GXutil.URLEncode(GXutil.rtrim(AV15BarPieSecu1)),GXutil.URLEncode(GXutil.rtrim(AV39BarPieST)),GXutil.URLEncode(GXutil.rtrim(AV40BarPieLote)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarPieDest,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV43Tiraskgs)),GXutil.URLEncode(DecimalUtil.decToString(AV44Retazoskgs)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarPieCliID,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Vertex,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Vtxter,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarTroCal1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33balalaika,4,0)),GXutil.URLEncode(GXutil.rtrim(AV45Pgmname)),GXutil.URLEncode(GXutil.rtrim(AV23Usurcod)),GXutil.URLEncode(GXutil.rtrim(AV24Station)),GXutil.URLEncode(GXutil.rtrim(AV20BarPieTono)),GXutil.URLEncode(GXutil.rtrim(AV21BarPieSecu)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarTroCal1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarAncAca1,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarPiekil1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarPieMet1,4,0))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarPieMet","BarTroCal","Ancho_f","BarPiekil","bapieobse","Bartrokil","bartromet","Ordpie","BarPieloc","BarPieTono1","BarPieSecu1","BarPieST","BarPieLote","BarPieDest","Tiraskgs","Retazoskgs","BarPieCliID","Vertex","Vtxter","BarTroCal1","balalaika","Pgmname","Usurcod","Station","BarPieTono","BarPieSecu","BarTroCal1","BarAncAca1","BarPiekil1","BarPieMet1"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEMET1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPieMet1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEKIL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarPiekil1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAncAca1), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vANAHUAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22anahuac), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarPieTono, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieSecu, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLDEFECTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlDefectos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Vertex), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Vtxter), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33balalaika), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIECOD", GXutil.rtrim( AV9BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEMET1", GXutil.ltrim( localUtil.ntoc( AV10BarPieMet1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEMET1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPieMet1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEKIL1", GXutil.ltrim( localUtil.ntoc( AV11BarPiekil1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEKIL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarPiekil1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV12BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAncAca1), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL1", GXutil.ltrim( localUtil.ntoc( AV13BarTroCal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANAHUAC", GXutil.ltrim( localUtil.ntoc( AV22anahuac, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vANAHUAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22anahuac), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIETONO1", GXutil.rtrim( AV14BarPieTono1));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIESECU1", GXutil.rtrim( AV15BarPieSecu1));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV16BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV18BarPiekil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANCHO_F", GXutil.ltrim( localUtil.ntoc( AV17Ancho_f, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL", GXutil.ltrim( localUtil.ntoc( AV19BarTroCal, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIETONO", GXutil.rtrim( AV20BarPieTono));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarPieTono, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIESECU", GXutil.rtrim( AV21BarPieSecu));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieSecu, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV45Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV23Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV24Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV25BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV26BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV27BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAPIEOBSE", GXutil.rtrim( AV34bapieobse));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROKIL", GXutil.ltrim( localUtil.ntoc( AV35Bartrokil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROMET", GXutil.ltrim( localUtil.ntoc( AV37bartromet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDPIE", GXutil.ltrim( localUtil.ntoc( AV42Ordpie, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIELOC", GXutil.rtrim( AV38BarPieloc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEST", GXutil.rtrim( AV39BarPieST));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIELOTE", GXutil.rtrim( AV40BarPieLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEDEST", GXutil.ltrim( localUtil.ntoc( AV41BarPieDest, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIRASKGS", GXutil.ltrim( localUtil.ntoc( AV43Tiraskgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRETAZOSKGS", GXutil.ltrim( localUtil.ntoc( AV44Retazoskgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIECLIID", GXutil.ltrim( localUtil.ntoc( AV29BarPieCliID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLDEFECTOS", GXutil.ltrim( localUtil.ntoc( AV32CtrlDefectos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLDEFECTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlDefectos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV30Vertex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Vertex), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVTXTER", GXutil.ltrim( localUtil.ntoc( AV31Vtxter, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Vtxter), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBALALAIKA", GXutil.ltrim( localUtil.ntoc( AV33balalaika, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33balalaika), "ZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCONFIRMADO", AV5Confirmado);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
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
         we1IQ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1IQ2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.mensajeconfirmarmodificarmetanc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Mensaje)),GXutil.URLEncode(GXutil.booltostr(AV5Confirmado)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV27BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarPieMet)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarTroCal,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Ancho_f,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV18BarPiekil)),GXutil.URLEncode(GXutil.rtrim(AV34bapieobse)),GXutil.URLEncode(DecimalUtil.decToString(AV35Bartrokil)),GXutil.URLEncode(DecimalUtil.decToString(AV37bartromet)),GXutil.URLEncode(DecimalUtil.decToString(AV42Ordpie)),GXutil.URLEncode(GXutil.rtrim(AV38BarPieloc)),GXutil.URLEncode(GXutil.rtrim(AV14BarPieTono1)),GXutil.URLEncode(GXutil.rtrim(AV15BarPieSecu1)),GXutil.URLEncode(GXutil.rtrim(AV39BarPieST)),GXutil.URLEncode(GXutil.rtrim(AV40BarPieLote)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarPieDest,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV43Tiraskgs)),GXutil.URLEncode(DecimalUtil.decToString(AV44Retazoskgs)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarPieCliID,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Vertex,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Vtxter,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarTroCal1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33balalaika,4,0)),GXutil.URLEncode(GXutil.rtrim(AV45Pgmname)),GXutil.URLEncode(GXutil.rtrim(AV23Usurcod)),GXutil.URLEncode(GXutil.rtrim(AV24Station)),GXutil.URLEncode(GXutil.rtrim(AV20BarPieTono)),GXutil.URLEncode(GXutil.rtrim(AV21BarPieSecu)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarTroCal1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarAncAca1,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarPiekil1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarPieMet1,4,0))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarPieMet","BarTroCal","Ancho_f","BarPiekil","bapieobse","Bartrokil","bartromet","Ordpie","BarPieloc","BarPieTono1","BarPieSecu1","BarPieST","BarPieLote","BarPieDest","Tiraskgs","Retazoskgs","BarPieCliID","Vertex","Vtxter","BarTroCal1","balalaika","Pgmname","Usurcod","Station","BarPieTono","BarPieSecu","BarTroCal1","BarAncAca1","BarPiekil1","BarPieMet1"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.MensajeConfirmarModificarMetAnc" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mensaje Confirmar", "") ;
   }

   public void wb1IQ0( )
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
         app.GxWebStd.gx_html_textarea( httpContext, edtavMensaje_Internalname, AV6Mensaje, "", "", (short)(1), 1, edtavMensaje_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarModificarMetAnc.htm");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarModificarMetAnc.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\MensajeConfirmarModificarMetAnc.htm");
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

   public void start1IQ2( )
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
      strup1IQ0( ) ;
   }

   public void ws1IQ2( )
   {
      start1IQ2( ) ;
      evt1IQ2( ) ;
   }

   public void evt1IQ2( )
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
                           e111IQ2 ();
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
                                 e121IQ2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131IQ2 ();
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

   public void we1IQ2( )
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

   public void pa1IQ2( )
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
      rf1IQ2( ) ;
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
      AV45Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarModificarMetAnc" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
   }

   public void rf1IQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01IQ2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = H01IQ2_A396EmprCod[0] ;
            /* Execute user event: Load */
            e131IQ2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb1IQ0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1IQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEMET1", GXutil.ltrim( localUtil.ntoc( AV10BarPieMet1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEMET1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPieMet1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEKIL1", GXutil.ltrim( localUtil.ntoc( AV11BarPiekil1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEKIL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarPiekil1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV12BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAncAca1), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL1", GXutil.ltrim( localUtil.ntoc( AV13BarTroCal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANAHUAC", GXutil.ltrim( localUtil.ntoc( AV22anahuac, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vANAHUAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22anahuac), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIETONO", GXutil.rtrim( AV20BarPieTono));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarPieTono, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIESECU", GXutil.rtrim( AV21BarPieSecu));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieSecu, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV45Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV23Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV24Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLDEFECTOS", GXutil.ltrim( localUtil.ntoc( AV32CtrlDefectos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCTRLDEFECTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CtrlDefectos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERTEX", GXutil.ltrim( localUtil.ntoc( AV30Vertex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Vertex), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVTXTER", GXutil.ltrim( localUtil.ntoc( AV31Vtxter, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Vtxter), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBALALAIKA", GXutil.ltrim( localUtil.ntoc( AV33balalaika, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33balalaika), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      AV45Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarModificarMetAnc" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
      edtavMensaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMensaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMensaje_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1IQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111IQ2 ();
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
      e111IQ2 ();
      if (returnInSub) return;
   }

   public void e111IQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5Confirmado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mensajeconfirmarmodificarmetanc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      GXv_char2[0] = AV28EmprCod ;
      GXv_char3[0] = AV48Emprnom ;
      GXv_char4[0] = AV23Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      mensajeconfirmarmodificarmetanc_impl.this.AV28EmprCod = GXv_char2[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV48Emprnom = GXv_char3[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV23Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV23Usurcod", AV23Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Usurcod, "@!"))));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121IQ2 ();
      if (returnInSub) return;
   }

   public void e121IQ2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV5Confirmado = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
      AV7Act_vtx = (short)(1) ;
      AV8Texto_i = httpContext.getMessage( "Modificacion Rollo= ", "") + AV9BarPieCod + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Datos Iniciales     ", "") + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Metros = ", "") + GXutil.str( AV10BarPieMet1, 9, 2) + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Kilos  = ", "") + GXutil.str( AV11BarPiekil1, 9, 2) + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Ancho  = ", "") + GXutil.str( AV12BarAncAca1, 3, 0) + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Calidad= ", "") + GXutil.str( AV13BarTroCal1, 2, 0) + GXutil.newLine( ) ;
      if ( AV22anahuac == 1 )
      {
         AV8Texto_i += httpContext.getMessage( "Tono     = ", "") + AV14BarPieTono1 + GXutil.newLine( ) ;
         AV8Texto_i += httpContext.getMessage( "Secuencia= ", "") + AV15BarPieSecu1 + GXutil.newLine( ) ;
      }
      AV8Texto_i += httpContext.getMessage( "Datos Finales       ", "") + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Metros = ", "") + GXutil.str( AV16BarPieMet, 9, 2) + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Kilos  = ", "") + GXutil.str( AV18BarPiekil, 9, 2) + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Ancho  = ", "") + GXutil.str( AV17Ancho_f, 3, 0) + GXutil.newLine( ) ;
      AV8Texto_i += httpContext.getMessage( "Calidad= ", "") + GXutil.str( AV19BarTroCal, 1, 0) + GXutil.newLine( ) ;
      if ( AV22anahuac == 1 )
      {
         AV8Texto_i += httpContext.getMessage( "Tono     = ", "") + AV20BarPieTono + GXutil.newLine( ) ;
         AV8Texto_i += httpContext.getMessage( "Secuencia= ", "") + AV21BarPieSecu + GXutil.newLine( ) ;
      }
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV45Pgmname, AV23Usurcod, AV24Station, AV8Texto_i, AV25BarCod, AV26BarCodReo, AV27BarCodPar) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = AV25BarCod ;
      GXv_int6[0] = AV26BarCodReo ;
      GXv_char3[0] = AV27BarCodPar ;
      GXv_char2[0] = AV9BarPieCod ;
      new app.ptroz9999(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2) ;
      mensajeconfirmarmodificarmetanc_impl.this.A396EmprCod = GXv_char4[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV25BarCod = GXv_int5[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV26BarCodReo = GXv_int6[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV27BarCodPar = GXv_char3[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV9BarPieCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarPieCod", AV9BarPieCod);
      if ( ( AV13BarTroCal1 == 1 ) || ( ( AV13BarTroCal1 == 2 ) && ( AV19BarTroCal == 1 ) ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV25BarCod ;
         GXv_int6[0] = AV26BarCodReo ;
         GXv_char3[0] = AV27BarCodPar ;
         GXv_char2[0] = AV9BarPieCod ;
         GXv_int7[0] = (short)(9999) ;
         new app.pdbartrd(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_int7) ;
         mensajeconfirmarmodificarmetanc_impl.this.A396EmprCod = GXv_char4[0] ;
         mensajeconfirmarmodificarmetanc_impl.this.AV25BarCod = GXv_int5[0] ;
         mensajeconfirmarmodificarmetanc_impl.this.AV26BarCodReo = GXv_int6[0] ;
         mensajeconfirmarmodificarmetanc_impl.this.AV27BarCodPar = GXv_char3[0] ;
         mensajeconfirmarmodificarmetanc_impl.this.AV9BarPieCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarPieCod", AV9BarPieCod);
      }
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = AV25BarCod ;
      GXv_int6[0] = AV26BarCodReo ;
      GXv_char3[0] = AV27BarCodPar ;
      GXv_char2[0] = AV9BarPieCod ;
      GXv_decimal8[0] = AV16BarPieMet ;
      GXv_int7[0] = (short)(9999) ;
      GXv_int9[0] = AV19BarTroCal ;
      GXv_int10[0] = AV17Ancho_f ;
      GXv_decimal11[0] = AV18BarPiekil ;
      GXv_char12[0] = AV34bapieobse ;
      GXv_decimal13[0] = AV35Bartrokil ;
      GXv_decimal14[0] = AV37bartromet ;
      GXv_int15[0] = (int)(DecimalUtil.decToDouble(AV42Ordpie)) ;
      GXv_char16[0] = AV38BarPieloc ;
      GXv_char17[0] = AV14BarPieTono1 ;
      GXv_char18[0] = AV15BarPieSecu1 ;
      GXv_char19[0] = AV39BarPieST ;
      GXv_char20[0] = AV40BarPieLote ;
      GXv_int21[0] = AV41BarPieDest ;
      GXv_decimal22[0] = AV43Tiraskgs ;
      GXv_decimal23[0] = AV44Retazoskgs ;
      GXv_int24[0] = AV29BarPieCliID ;
      new app.phdrpzi(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_decimal8, GXv_int7, GXv_int9, GXv_int10, GXv_decimal11, GXv_char12, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_char16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_int21, GXv_decimal22, GXv_decimal23, GXv_int24) ;
      mensajeconfirmarmodificarmetanc_impl.this.A396EmprCod = GXv_char4[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV25BarCod = GXv_int5[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV26BarCodReo = GXv_int6[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV27BarCodPar = GXv_char3[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV9BarPieCod = GXv_char2[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV16BarPieMet = GXv_decimal8[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV19BarTroCal = GXv_int9[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV17Ancho_f = GXv_int10[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV18BarPiekil = GXv_decimal11[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV34bapieobse = GXv_char12[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV35Bartrokil = GXv_decimal13[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV37bartromet = GXv_decimal14[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV42Ordpie = DecimalUtil.doubleToDec(GXv_int15[0]) ;
      mensajeconfirmarmodificarmetanc_impl.this.AV38BarPieloc = GXv_char16[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV14BarPieTono1 = GXv_char17[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV15BarPieSecu1 = GXv_char18[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV39BarPieST = GXv_char19[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV40BarPieLote = GXv_char20[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV41BarPieDest = GXv_int21[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV43Tiraskgs = GXv_decimal22[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV44Retazoskgs = GXv_decimal23[0] ;
      mensajeconfirmarmodificarmetanc_impl.this.AV29BarPieCliID = GXv_int24[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarPieCod", AV9BarPieCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieMet", GXutil.ltrimstr( AV16BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarTroCal), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Ancho_f), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiekil", GXutil.ltrimstr( AV18BarPiekil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV34bapieobse", AV34bapieobse);
      httpContext.ajax_rsp_assign_attri("", false, "AV35Bartrokil", GXutil.ltrimstr( AV35Bartrokil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV37bartromet", GXutil.ltrimstr( AV37bartromet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV42Ordpie", GXutil.ltrimstr( AV42Ordpie, 10, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarPieloc", AV38BarPieloc);
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieTono1", AV14BarPieTono1);
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarPieSecu1", AV15BarPieSecu1);
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarPieST", AV39BarPieST);
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarPieLote", AV40BarPieLote);
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarPieDest), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV43Tiraskgs", GXutil.ltrimstr( AV43Tiraskgs, 10, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV44Retazoskgs", GXutil.ltrimstr( AV44Retazoskgs, 10, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieCliID), 6, 0));
      if ( ( AV19BarTroCal == 2 ) && ( AV32CtrlDefectos == 1 ) )
      {
         callWebObject(formatLink("app.trevpz3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV27BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(9999,9,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarTroCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( ( AV30Vertex == 1 ) || ( AV31Vtxter == 1 ) )
      {
         if ( AV33balalaika == 0 )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_int24[0] = AV25BarCod ;
            GXv_int21[0] = AV26BarCodReo ;
            GXv_char19[0] = AV27BarCodPar ;
            GXv_char18[0] = AV9BarPieCod ;
            GXv_char17[0] = "" ;
            GXv_char16[0] = httpContext.getMessage( "EXA", "") ;
            new app.pvxgrain(remoteHandle, context).execute( GXv_char20, GXv_int24, GXv_int21, GXv_char19, GXv_char18, GXv_char17, GXv_char16) ;
            mensajeconfirmarmodificarmetanc_impl.this.A396EmprCod = GXv_char20[0] ;
            mensajeconfirmarmodificarmetanc_impl.this.AV25BarCod = GXv_int24[0] ;
            mensajeconfirmarmodificarmetanc_impl.this.AV26BarCodReo = GXv_int21[0] ;
            mensajeconfirmarmodificarmetanc_impl.this.AV27BarCodPar = GXv_char19[0] ;
            mensajeconfirmarmodificarmetanc_impl.this.AV9BarPieCod = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarPieCod", AV9BarPieCod);
         }
      }
      httpContext.setWebReturnParms(new Object[] {Boolean.valueOf(AV5Confirmado)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Confirmado"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131IQ2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6Mensaje = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
      AV5Confirmado = ((Boolean) getParm(obj,1)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Confirmado", AV5Confirmado);
      AV28EmprCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      AV25BarCod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarCod), 8, 0));
      AV26BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarCodReo", GXutil.str( AV26BarCodReo, 1, 0));
      AV27BarCodPar = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarCodPar", AV27BarCodPar);
      AV9BarPieCod = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarPieCod", AV9BarPieCod);
      AV16BarPieMet = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarPieMet", GXutil.ltrimstr( AV16BarPieMet, 9, 2));
      AV19BarTroCal = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarTroCal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarTroCal), 2, 0));
      AV17Ancho_f = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Ancho_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Ancho_f), 4, 0));
      AV18BarPiekil = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiekil", GXutil.ltrimstr( AV18BarPiekil, 9, 2));
      AV34bapieobse = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34bapieobse", AV34bapieobse);
      AV35Bartrokil = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Bartrokil", GXutil.ltrimstr( AV35Bartrokil, 9, 2));
      AV37bartromet = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37bartromet", GXutil.ltrimstr( AV37bartromet, 9, 2));
      AV42Ordpie = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Ordpie", GXutil.ltrimstr( AV42Ordpie, 10, 2));
      AV38BarPieloc = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarPieloc", AV38BarPieloc);
      AV14BarPieTono1 = (String)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieTono1", AV14BarPieTono1);
      AV15BarPieSecu1 = (String)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarPieSecu1", AV15BarPieSecu1);
      AV39BarPieST = (String)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarPieST", AV39BarPieST);
      AV40BarPieLote = (String)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarPieLote", AV40BarPieLote);
      AV41BarPieDest = ((Number) GXutil.testNumericType( getParm(obj,20), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarPieDest", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarPieDest), 2, 0));
      AV43Tiraskgs = (java.math.BigDecimal)getParm(obj,21) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Tiraskgs", GXutil.ltrimstr( AV43Tiraskgs, 10, 2));
      AV44Retazoskgs = (java.math.BigDecimal)getParm(obj,22) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Retazoskgs", GXutil.ltrimstr( AV44Retazoskgs, 10, 2));
      AV29BarPieCliID = ((Number) GXutil.testNumericType( getParm(obj,23), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarPieCliID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarPieCliID), 6, 0));
      AV30Vertex = ((Number) GXutil.testNumericType( getParm(obj,24), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Vertex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Vertex), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Vertex), "ZZZ9")));
      AV31Vtxter = ((Number) GXutil.testNumericType( getParm(obj,25), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Vtxter", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Vtxter), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVTXTER", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Vtxter), "ZZZ9")));
      AV13BarTroCal1 = ((Number) GXutil.testNumericType( getParm(obj,26), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarTroCal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarTroCal1), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
      AV33balalaika = ((Number) GXutil.testNumericType( getParm(obj,27), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33balalaika", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33balalaika), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBALALAIKA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33balalaika), "ZZZ9")));
      AV45Pgmname = (String)getParm(obj,28) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45Pgmname, ""))));
      AV23Usurcod = (String)getParm(obj,29) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Usurcod", AV23Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Usurcod, "@!"))));
      AV24Station = (String)getParm(obj,30) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Station, ""))));
      AV20BarPieTono = (String)getParm(obj,31) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieTono", AV20BarPieTono);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIETONO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarPieTono, ""))));
      AV21BarPieSecu = (String)getParm(obj,32) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarPieSecu", AV21BarPieSecu);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIESECU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21BarPieSecu, ""))));
      AV13BarTroCal1 = ((Number) GXutil.testNumericType( getParm(obj,26), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarTroCal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarTroCal1), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTROCAL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarTroCal1), "ZZZ9")));
      AV12BarAncAca1 = ((Number) GXutil.testNumericType( getParm(obj,34), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarAncAca1), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAncAca1), "ZZ9")));
      AV11BarPiekil1 = ((Number) GXutil.testNumericType( getParm(obj,35), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarPiekil1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarPiekil1), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEKIL1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarPiekil1), "ZZZ9")));
      AV10BarPieMet1 = ((Number) GXutil.testNumericType( getParm(obj,36), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarPieMet1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarPieMet1), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPIEMET1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPieMet1), "ZZZ9")));
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
      pa1IQ2( ) ;
      ws1IQ2( ) ;
      we1IQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131141", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/mensajeconfirmarmodificarmetanc.js", "?202682415131141", false, true);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV10BarPieMet1',fld:'vBARPIEMET1',pic:'ZZZ9',hsh:true},{av:'AV11BarPiekil1',fld:'vBARPIEKIL1',pic:'ZZZ9',hsh:true},{av:'AV12BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV13BarTroCal1',fld:'vBARTROCAL1',pic:'ZZZ9',hsh:true},{av:'AV22anahuac',fld:'vANAHUAC',pic:'ZZZ9',hsh:true},{av:'AV20BarPieTono',fld:'vBARPIETONO',pic:'',hsh:true},{av:'AV21BarPieSecu',fld:'vBARPIESECU',pic:'',hsh:true},{av:'AV45Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV32CtrlDefectos',fld:'vCTRLDEFECTOS',pic:'ZZZ9',hsh:true},{av:'AV30Vertex',fld:'vVERTEX',pic:'ZZZ9',hsh:true},{av:'AV31Vtxter',fld:'vVTXTER',pic:'ZZZ9',hsh:true},{av:'AV33balalaika',fld:'vBALALAIKA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121IQ2',iparms:[{av:'AV9BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV10BarPieMet1',fld:'vBARPIEMET1',pic:'ZZZ9',hsh:true},{av:'AV11BarPiekil1',fld:'vBARPIEKIL1',pic:'ZZZ9',hsh:true},{av:'AV12BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV13BarTroCal1',fld:'vBARTROCAL1',pic:'ZZZ9',hsh:true},{av:'AV22anahuac',fld:'vANAHUAC',pic:'ZZZ9',hsh:true},{av:'AV14BarPieTono1',fld:'vBARPIETONO1',pic:''},{av:'AV15BarPieSecu1',fld:'vBARPIESECU1',pic:''},{av:'AV16BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV18BarPiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV17Ancho_f',fld:'vANCHO_F',pic:'ZZZ9'},{av:'AV19BarTroCal',fld:'vBARTROCAL',pic:'9'},{av:'AV20BarPieTono',fld:'vBARPIETONO',pic:'',hsh:true},{av:'AV21BarPieSecu',fld:'vBARPIESECU',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV45Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV24Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV25BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV26BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV27BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34bapieobse',fld:'vBAPIEOBSE',pic:''},{av:'AV35Bartrokil',fld:'vBARTROKIL',pic:'ZZZZZ9.99'},{av:'AV37bartromet',fld:'vBARTROMET',pic:'ZZZZZ9.99'},{av:'AV42Ordpie',fld:'vORDPIE',pic:'9999999.99'},{av:'AV38BarPieloc',fld:'vBARPIELOC',pic:''},{av:'AV39BarPieST',fld:'vBARPIEST',pic:''},{av:'AV40BarPieLote',fld:'vBARPIELOTE',pic:''},{av:'AV41BarPieDest',fld:'vBARPIEDEST',pic:'Z9'},{av:'AV43Tiraskgs',fld:'vTIRASKGS',pic:'9999999.99'},{av:'AV44Retazoskgs',fld:'vRETAZOSKGS',pic:'9999999.99'},{av:'AV29BarPieCliID',fld:'vBARPIECLIID',pic:'ZZZZZ9'},{av:'AV32CtrlDefectos',fld:'vCTRLDEFECTOS',pic:'ZZZ9',hsh:true},{av:'AV30Vertex',fld:'vVERTEX',pic:'ZZZ9',hsh:true},{av:'AV31Vtxter',fld:'vVTXTER',pic:'ZZZ9',hsh:true},{av:'AV33balalaika',fld:'vBALALAIKA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV5Confirmado',fld:'vCONFIRMADO',pic:''},{av:'AV9BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV27BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV25BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29BarPieCliID',fld:'vBARPIECLIID',pic:'ZZZZZ9'},{av:'AV44Retazoskgs',fld:'vRETAZOSKGS',pic:'9999999.99'},{av:'AV43Tiraskgs',fld:'vTIRASKGS',pic:'9999999.99'},{av:'AV41BarPieDest',fld:'vBARPIEDEST',pic:'Z9'},{av:'AV40BarPieLote',fld:'vBARPIELOTE',pic:''},{av:'AV39BarPieST',fld:'vBARPIEST',pic:''},{av:'AV15BarPieSecu1',fld:'vBARPIESECU1',pic:''},{av:'AV14BarPieTono1',fld:'vBARPIETONO1',pic:''},{av:'AV38BarPieloc',fld:'vBARPIELOC',pic:''},{av:'AV42Ordpie',fld:'vORDPIE',pic:'9999999.99'},{av:'AV37bartromet',fld:'vBARTROMET',pic:'ZZZZZ9.99'},{av:'AV35Bartrokil',fld:'vBARTROKIL',pic:'ZZZZZ9.99'},{av:'AV34bapieobse',fld:'vBAPIEOBSE',pic:''},{av:'AV18BarPiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV17Ancho_f',fld:'vANCHO_F',pic:'ZZZ9'},{av:'AV19BarTroCal',fld:'vBARTROCAL',pic:'9'},{av:'AV16BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'}]}");
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
      wcpOAV28EmprCod = "" ;
      wcpOAV27BarCodPar = "" ;
      wcpOAV9BarPieCod = "" ;
      wcpOAV16BarPieMet = DecimalUtil.ZERO ;
      wcpOAV18BarPiekil = DecimalUtil.ZERO ;
      wcpOAV34bapieobse = "" ;
      wcpOAV35Bartrokil = DecimalUtil.ZERO ;
      wcpOAV37bartromet = DecimalUtil.ZERO ;
      wcpOAV42Ordpie = DecimalUtil.ZERO ;
      wcpOAV38BarPieloc = "" ;
      wcpOAV14BarPieTono1 = "" ;
      wcpOAV15BarPieSecu1 = "" ;
      wcpOAV39BarPieST = "" ;
      wcpOAV40BarPieLote = "" ;
      wcpOAV43Tiraskgs = DecimalUtil.ZERO ;
      wcpOAV44Retazoskgs = DecimalUtil.ZERO ;
      wcpOAV45Pgmname = "" ;
      wcpOAV23Usurcod = "" ;
      wcpOAV24Station = "" ;
      wcpOAV20BarPieTono = "" ;
      wcpOAV21BarPieSecu = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6Mensaje = "" ;
      AV28EmprCod = "" ;
      AV27BarCodPar = "" ;
      AV9BarPieCod = "" ;
      AV16BarPieMet = DecimalUtil.ZERO ;
      AV18BarPiekil = DecimalUtil.ZERO ;
      AV34bapieobse = "" ;
      AV35Bartrokil = DecimalUtil.ZERO ;
      AV37bartromet = DecimalUtil.ZERO ;
      AV42Ordpie = DecimalUtil.ZERO ;
      AV38BarPieloc = "" ;
      AV14BarPieTono1 = "" ;
      AV15BarPieSecu1 = "" ;
      AV39BarPieST = "" ;
      AV40BarPieLote = "" ;
      AV43Tiraskgs = DecimalUtil.ZERO ;
      AV44Retazoskgs = DecimalUtil.ZERO ;
      AV23Usurcod = "" ;
      AV24Station = "" ;
      AV20BarPieTono = "" ;
      AV21BarPieSecu = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
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
      H01IQ2_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      AV48Emprnom = "" ;
      AV8Texto_i = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int7 = new short[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new short[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      GXv_char20 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.mensajeconfirmarmodificarmetanc__default(),
         new Object[] {
             new Object[] {
            H01IQ2_A396EmprCod
            }
         }
      );
      AV45Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarModificarMetAnc" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      AV45Pgmname = "ExpedicionesAutomatizadas.MensajeConfirmarModificarMetAnc" ;
      edtavMensaje_Enabled = 0 ;
   }

   private byte wcpOAV26BarCodReo ;
   private byte wcpOAV19BarTroCal ;
   private byte wcpOAV41BarPieDest ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV26BarCodReo ;
   private byte AV19BarTroCal ;
   private byte AV41BarPieDest ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXv_int6[] ;
   private byte GXv_int9[] ;
   private byte GXv_int21[] ;
   private byte nGXWrapped ;
   private short wcpOAV17Ancho_f ;
   private short wcpOAV30Vertex ;
   private short wcpOAV31Vtxter ;
   private short wcpOAV13BarTroCal1 ;
   private short wcpOAV33balalaika ;
   private short wcpOAV12BarAncAca1 ;
   private short wcpOAV11BarPiekil1 ;
   private short wcpOAV10BarPieMet1 ;
   private short AV17Ancho_f ;
   private short AV30Vertex ;
   private short AV31Vtxter ;
   private short AV13BarTroCal1 ;
   private short AV33balalaika ;
   private short AV12BarAncAca1 ;
   private short AV11BarPiekil1 ;
   private short AV10BarPieMet1 ;
   private short AV22anahuac ;
   private short AV32CtrlDefectos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV7Act_vtx ;
   private short GXv_int7[] ;
   private short GXv_int10[] ;
   private int wcpOAV25BarCod ;
   private int wcpOAV29BarPieCliID ;
   private int AV25BarCod ;
   private int AV29BarPieCliID ;
   private int edtavMensaje_Enabled ;
   private int GXv_int5[] ;
   private int GXv_int15[] ;
   private int GXv_int24[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV16BarPieMet ;
   private java.math.BigDecimal wcpOAV18BarPiekil ;
   private java.math.BigDecimal wcpOAV35Bartrokil ;
   private java.math.BigDecimal wcpOAV37bartromet ;
   private java.math.BigDecimal wcpOAV42Ordpie ;
   private java.math.BigDecimal wcpOAV43Tiraskgs ;
   private java.math.BigDecimal wcpOAV44Retazoskgs ;
   private java.math.BigDecimal AV16BarPieMet ;
   private java.math.BigDecimal AV18BarPiekil ;
   private java.math.BigDecimal AV35Bartrokil ;
   private java.math.BigDecimal AV37bartromet ;
   private java.math.BigDecimal AV42Ordpie ;
   private java.math.BigDecimal AV43Tiraskgs ;
   private java.math.BigDecimal AV44Retazoskgs ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private String wcpOAV28EmprCod ;
   private String wcpOAV27BarCodPar ;
   private String wcpOAV9BarPieCod ;
   private String wcpOAV34bapieobse ;
   private String wcpOAV38BarPieloc ;
   private String wcpOAV14BarPieTono1 ;
   private String wcpOAV15BarPieSecu1 ;
   private String wcpOAV39BarPieST ;
   private String wcpOAV40BarPieLote ;
   private String wcpOAV45Pgmname ;
   private String wcpOAV23Usurcod ;
   private String wcpOAV24Station ;
   private String wcpOAV20BarPieTono ;
   private String wcpOAV21BarPieSecu ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV28EmprCod ;
   private String AV27BarCodPar ;
   private String AV9BarPieCod ;
   private String AV34bapieobse ;
   private String AV38BarPieloc ;
   private String AV14BarPieTono1 ;
   private String AV15BarPieSecu1 ;
   private String AV39BarPieST ;
   private String AV40BarPieLote ;
   private String AV45Pgmname ;
   private String AV23Usurcod ;
   private String AV24Station ;
   private String AV20BarPieTono ;
   private String AV21BarPieSecu ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String GXt_char1 ;
   private String AV48Emprnom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV5Confirmado ;
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
   private String AV8Texto_i ;
   private String wcpOAV6Mensaje ;
   private String AV6Mensaje ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private IDataStoreProvider pr_default ;
   private String[] H01IQ2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mensajeconfirmarmodificarmetanc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01IQ2", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

