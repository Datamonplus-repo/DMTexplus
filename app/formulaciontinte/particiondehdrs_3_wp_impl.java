package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class particiondehdrs_3_wp_impl extends GXDataArea
{
   public particiondehdrs_3_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public particiondehdrs_3_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( particiondehdrs_3_wp_impl.class ));
   }

   public particiondehdrs_3_wp_impl( int remoteHandle ,
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
            AV52EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12BarOriCod = (int)(GXutil.lval( httpContext.GetPar( "BarOriCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
               AV14BarOriReo = (byte)(GXutil.lval( httpContext.GetPar( "BarOriReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
               AV13BarOriPar = httpContext.GetPar( "BarOriPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
               AV21Barser = httpContext.GetPar( "Barser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barser", AV21Barser);
               AV22Barserdsc = httpContext.GetPar( "Barserdsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Barserdsc", AV22Barserdsc);
               AV8Barcolnom = httpContext.GetPar( "Barcolnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcolnom", AV8Barcolnom);
               AV9Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcolnum), 6, 0));
               AV10BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarKgm", GXutil.ltrimstr( AV10BarKgm, 9, 2));
               AV11BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarMtr", GXutil.ltrimstr( AV11BarMtr, 9, 2));
               AV18BarPiepie = (int)(GXutil.lval( httpContext.GetPar( "BarPiepie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
               AV25Conos = (short)(GXutil.lval( httpContext.GetPar( "Conos"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Conos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Conos), 4, 0));
               AV33Kilos = CommonUtil.decimalVal( httpContext.GetPar( "Kilos"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
               AV36Metros = CommonUtil.decimalVal( httpContext.GetPar( "Metros"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
               AV44Rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "Rectotkgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Rectotkgm", GXutil.ltrimstr( AV44Rectotkgm, 10, 2));
               AV17Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Barpes), 4, 0));
               AV27CosAnyOri = CommonUtil.decimalVal( httpContext.GetPar( "CosAnyOri"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
               AV28CosPrdOri = CommonUtil.decimalVal( httpContext.GetPar( "CosPrdOri"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
               AV41OK = httpContext.GetPar( "OK") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
               AV7BarCodPan = (int)(GXutil.lval( httpContext.GetPar( "BarCodPan"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCodPan), 8, 0));
               AV20BarReoPan = (byte)(GXutil.lval( httpContext.GetPar( "BarReoPan"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarReoPan", GXutil.str( AV20BarReoPan, 1, 0));
               AV16BarParPan = httpContext.GetPar( "BarParPan") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarParPan", AV16BarParPan);
               AV42Partic = (short)(GXutil.lval( httpContext.GetPar( "Partic"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARTIC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9")));
               AV59BarUnimed = httpContext.GetPar( "BarUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59BarUnimed", AV59BarUnimed);
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
      pa1LW2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LW2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.particiondehdrs_3_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV21Barser)),GXutil.URLEncode(GXutil.rtrim(AV22Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV8Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV10BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Conos,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV33Kilos)),GXutil.URLEncode(DecimalUtil.decToString(AV36Metros)),GXutil.URLEncode(DecimalUtil.decToString(AV44Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV17Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27CosAnyOri)),GXutil.URLEncode(DecimalUtil.decToString(AV28CosPrdOri)),GXutil.URLEncode(GXutil.rtrim(AV41OK)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodPan,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarReoPan,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarParPan)),GXutil.URLEncode(GXutil.ltrimstr(AV42Partic,4,0)),GXutil.URLEncode(GXutil.rtrim(AV59BarUnimed))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","OK","BarCodPan","BarReoPan","BarParPan","Partic","BarUnimed"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARTIC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV5BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV23BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV59BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG2", GXutil.ltrim( localUtil.ntoc( AV31Flag2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAN", GXutil.ltrim( localUtil.ntoc( AV7BarCodPan, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARREOPAN", GXutil.ltrim( localUtil.ntoc( AV20BarReoPan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPARPAN", GXutil.rtrim( AV16BarParPan));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV52EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV17Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV33Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV36Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANYORI", GXutil.ltrim( localUtil.ntoc( AV27CosAnyOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRDORI", GXutil.ltrim( localUtil.ntoc( AV28CosPrdOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV62Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV51UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV46station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV30Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV40msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARTIC", GXutil.ltrim( localUtil.ntoc( AV42Partic, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARTIC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV44Rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONOS", GXutil.ltrim( localUtil.ntoc( AV25Conos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV41OK));
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
         we1LW2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LW2( ) ;
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
      return formatLink("app.formulaciontinte.particiondehdrs_3_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV21Barser)),GXutil.URLEncode(GXutil.rtrim(AV22Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV8Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV10BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Conos,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV33Kilos)),GXutil.URLEncode(DecimalUtil.decToString(AV36Metros)),GXutil.URLEncode(DecimalUtil.decToString(AV44Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV17Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27CosAnyOri)),GXutil.URLEncode(DecimalUtil.decToString(AV28CosPrdOri)),GXutil.URLEncode(GXutil.rtrim(AV41OK)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodPan,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarReoPan,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarParPan)),GXutil.URLEncode(GXutil.ltrimstr(AV42Partic,4,0)),GXutil.URLEncode(GXutil.rtrim(AV59BarUnimed))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","OK","BarCodPan","BarReoPan","BarParPan","Partic","BarUnimed"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ParticiondeHDRs_3_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Particion de HDRs ", "") ;
   }

   public void wb1LW0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaroricod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaroricod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaroricod_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarOriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaroricod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarOriCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarOriCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaroricod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaroricod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarorireo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarorireo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarorireo_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarOriReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarorireo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarOriReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarOriReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarorireo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarorireo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaroripar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaroripar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaroripar_Internalname, GXutil.rtrim( AV13BarOriPar), GXutil.rtrim( localUtil.format( AV13BarOriPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaroripar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaroripar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV21Barser), GXutil.rtrim( localUtil.format( AV21Barser, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripción ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV22Barserdsc), GXutil.rtrim( localUtil.format( AV22Barserdsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV8Barcolnom), GXutil.rtrim( localUtil.format( AV8Barcolnom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV9Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9Barcolnum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9Barcolnum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcoddes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcoddes_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcoddes_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCodDes, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcoddes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCodDes), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCodDes), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcoddes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcoddes_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarreodes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarreodes_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarreodes_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarReoDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarreodes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarReoDes), "9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarReoDes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarreodes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarreodes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpardes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpardes_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpardes_Internalname, GXutil.rtrim( AV15BarParDes), GXutil.rtrim( localUtil.format( AV15BarParDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpardes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpardes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup7_Internalname, httpContext.getMessage( "Origen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV10BarKgm, "ZZZZZ9.99") : localUtil.format( AV10BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV11BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV11BarMtr, "ZZZZZ9.99") : localUtil.format( AV11BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiepie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiepie_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiepie_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarPiepie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18BarPiepie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18BarPiepie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiepie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiepie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup9_Internalname, httpContext.getMessage( "Destino", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilosdestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilosdestino_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilosdestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV35Kilosdestino, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilosdestino_Enabled!=0) ? localUtil.format( AV35Kilosdestino, "ZZZZZ9.99") : localUtil.format( AV35Kilosdestino, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilosdestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilosdestino_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetrosdestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetrosdestino_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetrosdestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV38MetrosDestino, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetrosdestino_Enabled!=0) ? localUtil.format( AV38MetrosDestino, "ZZZZZ9.99") : localUtil.format( AV38MetrosDestino, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetrosdestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetrosdestino_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPiezasdestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPiezasdestino_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPiezasdestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV43PiezasDestino, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPiezasdestino_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43PiezasDestino), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43PiezasDestino), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPiezasdestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPiezasdestino_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_3_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table1_127_1LW2( true) ;
      }
      else
      {
         wb_table1_127_1LW2( false) ;
      }
      return  ;
   }

   public void wb_table1_127_1LW2e( boolean wbgen )
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

   public void start1LW2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Particion de HDRs ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LW0( ) ;
   }

   public void ws1LW2( )
   {
      start1LW2( ) ;
      evt1LW2( ) ;
   }

   public void evt1LW2( )
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
                           e111LW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e121LW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e131LW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141LW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151LW2 ();
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

   public void we1LW2( )
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

   public void pa1LW2( )
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
            GX_FocusControl = edtavBarcoddes_Internalname ;
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
      rf1LW2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV62Pgmname = "FormulacionTinte.ParticiondeHDRs_3_WP" ;
      Gx_err = (short)(0) ;
      edtavBaroricod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaroricod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaroricod_Enabled), 5, 0), true);
      edtavBarorireo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarorireo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarorireo_Enabled), 5, 0), true);
      edtavBaroripar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaroripar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaroripar_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarcoddes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcoddes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcoddes_Enabled), 5, 0), true);
      edtavBarreodes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarreodes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarreodes_Enabled), 5, 0), true);
      edtavBarpardes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpardes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpardes_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiepie_Enabled), 5, 0), true);
   }

   public void rf1LW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151LW2 ();
         wb1LW0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1LW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV62Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV51UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV46station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV40msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARTIC", GXutil.ltrim( localUtil.ntoc( AV42Partic, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARTIC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV62Pgmname = "FormulacionTinte.ParticiondeHDRs_3_WP" ;
      Gx_err = (short)(0) ;
      edtavBaroricod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaroricod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaroricod_Enabled), 5, 0), true);
      edtavBarorireo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarorireo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarorireo_Enabled), 5, 0), true);
      edtavBaroripar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaroripar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaroripar_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarcoddes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcoddes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcoddes_Enabled), 5, 0), true);
      edtavBarreodes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarreodes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarreodes_Enabled), 5, 0), true);
      edtavBarpardes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpardes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpardes_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiepie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1LW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121LW2 ();
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
         AV12BarOriCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaroricod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
         AV14BarOriReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarorireo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
         AV13BarOriPar = httpContext.cgiGet( edtavBaroripar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODDES");
            GX_FocusControl = edtavBarcoddes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarCodDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
         }
         else
         {
            AV6BarCodDes = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarreodes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarreodes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARREODES");
            GX_FocusControl = edtavBarreodes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarReoDes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
         }
         else
         {
            AV19BarReoDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarreodes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
         }
         AV15BarParDes = httpContext.cgiGet( edtavBarpardes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
         AV18BarPiepie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilosdestino_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilosdestino_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOSDESTINO");
            GX_FocusControl = edtavKilosdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35Kilosdestino = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Kilosdestino", GXutil.ltrimstr( AV35Kilosdestino, 9, 2));
         }
         else
         {
            AV35Kilosdestino = localUtil.ctond( httpContext.cgiGet( edtavKilosdestino_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Kilosdestino", GXutil.ltrimstr( AV35Kilosdestino, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetrosdestino_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetrosdestino_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROSDESTINO");
            GX_FocusControl = edtavMetrosdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38MetrosDestino = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38MetrosDestino", GXutil.ltrimstr( AV38MetrosDestino, 9, 2));
         }
         else
         {
            AV38MetrosDestino = localUtil.ctond( httpContext.cgiGet( edtavMetrosdestino_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38MetrosDestino", GXutil.ltrimstr( AV38MetrosDestino, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezasdestino_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezasdestino_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEZASDESTINO");
            GX_FocusControl = edtavPiezasdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43PiezasDestino = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43PiezasDestino", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PiezasDestino), 6, 0));
         }
         else
         {
            AV43PiezasDestino = (int)(localUtil.ctol( httpContext.cgiGet( edtavPiezasdestino_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43PiezasDestino", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43PiezasDestino), 6, 0));
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
      e121LW2 ();
      if (returnInSub) return;
   }

   public void e121LW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV46station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      particiondehdrs_3_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46station", AV46station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46station, ""))));
      GXv_char2[0] = AV52EmprCod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46station, GXv_char2, GXv_char3, GXv_char4) ;
      particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char2[0] ;
      particiondehdrs_3_wp_impl.this.AV53EmprNom = GXv_char3[0] ;
      particiondehdrs_3_wp_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV51UsurCod", AV51UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      AV42Partic = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARTIC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9")));
      GXv_int5[0] = (byte)(AV47TinEst) ;
      new app.pexicon(remoteHandle, context).execute( AV52EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int5) ;
      particiondehdrs_3_wp_impl.this.AV47TinEst = GXv_int5[0] ;
      AV41OK = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
      GXt_char1 = AV39msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG219_", ""), (byte)(99), GXv_char4) ;
      particiondehdrs_3_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39msg0 = GXt_char1 ;
      GXt_char1 = AV40msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG220_", ""), (byte)(99), GXv_char4) ;
      particiondehdrs_3_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV40msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40msg1", AV40msg1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40msg1, ""))));
      AV6BarCodDes = AV7BarCodPan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
      AV19BarReoDes = AV20BarReoPan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
      AV15BarParDes = AV16BarParPan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
      GXt_char1 = AV46station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      particiondehdrs_3_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46station", AV46station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46station, ""))));
      GXv_char4[0] = AV52EmprCod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char2[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46station, GXv_char4, GXv_char3, GXv_char2) ;
      particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
      particiondehdrs_3_wp_impl.this.AV53EmprNom = GXv_char3[0] ;
      particiondehdrs_3_wp_impl.this.AV51UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV51UsurCod", AV51UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
   }

   public void e131LW2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'HDRDESTINO' */
      S112 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV5BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Hdr Destino , esta AGRUPADA.", ""));
         GX_FocusControl = edtavKilosdestino_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV23BarSit > 5 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Situacion N Hdr Destino , superior a ", "")+GXutil.str( AV23BarSit, 2, 0));
            GX_FocusControl = edtavKilosdestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV43PiezasDestino > AV18BarPiepie ) || ( DecimalUtil.compareTo(AV35Kilosdestino, AV10BarKgm) > 0 ) || ( DecimalUtil.compareTo(AV38MetrosDestino, AV11BarMtr) > 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Revisar Piezas o Kilos o Metros, cantidad superior al origen", ""));
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35Kilosdestino)==0) && ( GXutil.strcmp(AV59BarUnimed, "K") == 0 ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valor en KILOS", ""));
                  GX_FocusControl = edtavKilosdestino_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38MetrosDestino)==0) && ( GXutil.strcmp(AV59BarUnimed, "M") == 0 ) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valor en METROS", ""));
                     GX_FocusControl = edtavMetrosdestino_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( (0==AV43PiezasDestino) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35Kilosdestino)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38MetrosDestino)==0) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valores en Piezas, Kilos, Metros", ""));
                     }
                     else
                     {
                        if ( (0==AV31Flag2) )
                        {
                           Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.getMessage( "Desea crear la Hdr Destino ", "")+GXutil.trim( GXutil.str( AV7BarCodPan, 8, 0))+"-"+GXutil.str( AV20BarReoPan, 1, 0)+AV16BarParPan+"?" ;
                           ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                        }
                        else
                        {
                           Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.getMessage( "Desea mover datos de la N Hdr ", "")+GXutil.trim( GXutil.str( AV12BarOriCod, 8, 0))+"-"+GXutil.str( AV14BarOriReo, 1, 0)+AV13BarOriPar+httpContext.getMessage( " a la N Hdr ", "")+GXutil.trim( GXutil.str( AV7BarCodPan, 8, 0))+"-"+GXutil.str( AV20BarReoPan, 1, 0)+AV16BarParPan+"?" ;
                           ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                        }
                        this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer", "Confirm", "", new Object[] {});
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e111LW2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV41OK = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
         AV26Conos2 = (short)(AV43PiezasDestino) ;
         AV34Kilos2 = AV35Kilosdestino ;
         AV34Kilos2 = ((AV35Kilosdestino.doubleValue()==0) ? (AV38MetrosDestino.multiply(DecimalUtil.doubleToDec(AV17Barpes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV34Kilos2) ;
         AV37Metros2 = AV38MetrosDestino ;
         if ( AV31Flag2 == 0 )
         {
            GXv_char4[0] = AV52EmprCod ;
            GXv_int6[0] = AV12BarOriCod ;
            GXv_int5[0] = AV14BarOriReo ;
            GXv_char3[0] = AV13BarOriPar ;
            GXv_int7[0] = AV6BarCodDes ;
            GXv_int8[0] = AV19BarReoDes ;
            GXv_char2[0] = AV15BarParDes ;
            new app.pcrebar(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_int7, GXv_int8, GXv_char2) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV12BarOriCod = GXv_int6[0] ;
            particiondehdrs_3_wp_impl.this.AV14BarOriReo = GXv_int5[0] ;
            particiondehdrs_3_wp_impl.this.AV13BarOriPar = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV6BarCodDes = GXv_int7[0] ;
            particiondehdrs_3_wp_impl.this.AV19BarReoDes = GXv_int8[0] ;
            particiondehdrs_3_wp_impl.this.AV15BarParDes = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
            GXv_char4[0] = AV52EmprCod ;
            GXv_int7[0] = AV12BarOriCod ;
            GXv_int8[0] = AV14BarOriReo ;
            GXv_char3[0] = AV13BarOriPar ;
            GXv_int6[0] = AV6BarCodDes ;
            GXv_int5[0] = AV19BarReoDes ;
            GXv_char2[0] = AV15BarParDes ;
            GXv_int9[0] = AV26Conos2 ;
            GXv_decimal10[0] = AV34Kilos2 ;
            GXv_decimal11[0] = AV37Metros2 ;
            new app.preopeh(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int6, GXv_int5, GXv_char2, GXv_int9, GXv_decimal10, GXv_decimal11) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV12BarOriCod = GXv_int7[0] ;
            particiondehdrs_3_wp_impl.this.AV14BarOriReo = GXv_int8[0] ;
            particiondehdrs_3_wp_impl.this.AV13BarOriPar = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV6BarCodDes = GXv_int6[0] ;
            particiondehdrs_3_wp_impl.this.AV19BarReoDes = GXv_int5[0] ;
            particiondehdrs_3_wp_impl.this.AV15BarParDes = GXv_char2[0] ;
            particiondehdrs_3_wp_impl.this.AV26Conos2 = (short)((short)(GXv_int9[0])) ;
            particiondehdrs_3_wp_impl.this.AV34Kilos2 = GXv_decimal10[0] ;
            particiondehdrs_3_wp_impl.this.AV37Metros2 = GXv_decimal11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
            AV45Signo = (byte)(1) ;
            GXv_char4[0] = AV52EmprCod ;
            GXv_int9[0] = AV6BarCodDes ;
            GXv_int8[0] = AV19BarReoDes ;
            GXv_char3[0] = AV15BarParDes ;
            GXv_int12[0] = AV26Conos2 ;
            GXv_decimal11[0] = AV34Kilos2 ;
            GXv_decimal10[0] = AV37Metros2 ;
            GXv_int13[0] = (short)(AV18BarPiepie) ;
            GXv_decimal14[0] = AV33Kilos ;
            GXv_decimal15[0] = AV36Metros ;
            GXv_decimal16[0] = AV27CosAnyOri ;
            GXv_decimal17[0] = AV28CosPrdOri ;
            GXv_int5[0] = AV45Signo ;
            new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int12, GXv_decimal11, GXv_decimal10, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_int5) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV6BarCodDes = GXv_int9[0] ;
            particiondehdrs_3_wp_impl.this.AV19BarReoDes = GXv_int8[0] ;
            particiondehdrs_3_wp_impl.this.AV15BarParDes = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV26Conos2 = GXv_int12[0] ;
            particiondehdrs_3_wp_impl.this.AV34Kilos2 = GXv_decimal11[0] ;
            particiondehdrs_3_wp_impl.this.AV37Metros2 = GXv_decimal10[0] ;
            particiondehdrs_3_wp_impl.this.AV18BarPiepie = GXv_int13[0] ;
            particiondehdrs_3_wp_impl.this.AV33Kilos = GXv_decimal14[0] ;
            particiondehdrs_3_wp_impl.this.AV36Metros = GXv_decimal15[0] ;
            particiondehdrs_3_wp_impl.this.AV27CosAnyOri = GXv_decimal16[0] ;
            particiondehdrs_3_wp_impl.this.AV28CosPrdOri = GXv_decimal17[0] ;
            particiondehdrs_3_wp_impl.this.AV45Signo = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
            AV45Signo = (byte)(-1) ;
            GXv_char4[0] = AV52EmprCod ;
            GXv_int9[0] = AV12BarOriCod ;
            GXv_int8[0] = AV14BarOriReo ;
            GXv_char3[0] = AV13BarOriPar ;
            GXv_int13[0] = AV26Conos2 ;
            GXv_decimal17[0] = AV34Kilos2 ;
            GXv_decimal16[0] = AV37Metros2 ;
            GXv_int12[0] = (short)(AV18BarPiepie) ;
            GXv_decimal15[0] = AV33Kilos ;
            GXv_decimal14[0] = AV36Metros ;
            GXv_decimal11[0] = AV27CosAnyOri ;
            GXv_decimal10[0] = AV28CosPrdOri ;
            GXv_int5[0] = AV45Signo ;
            new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int13, GXv_decimal17, GXv_decimal16, GXv_int12, GXv_decimal15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_int5) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV12BarOriCod = GXv_int9[0] ;
            particiondehdrs_3_wp_impl.this.AV14BarOriReo = GXv_int8[0] ;
            particiondehdrs_3_wp_impl.this.AV13BarOriPar = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV26Conos2 = GXv_int13[0] ;
            particiondehdrs_3_wp_impl.this.AV34Kilos2 = GXv_decimal17[0] ;
            particiondehdrs_3_wp_impl.this.AV37Metros2 = GXv_decimal16[0] ;
            particiondehdrs_3_wp_impl.this.AV18BarPiepie = GXv_int12[0] ;
            particiondehdrs_3_wp_impl.this.AV33Kilos = GXv_decimal15[0] ;
            particiondehdrs_3_wp_impl.this.AV36Metros = GXv_decimal14[0] ;
            particiondehdrs_3_wp_impl.this.AV27CosAnyOri = GXv_decimal11[0] ;
            particiondehdrs_3_wp_impl.this.AV28CosPrdOri = GXv_decimal10[0] ;
            particiondehdrs_3_wp_impl.this.AV45Signo = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
            AV32Inc_obs = httpContext.getMessage( "Fin Particion Hdrs", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV52EmprCod, GXutil.substring( AV62Pgmname, 1, 10), AV51UsurCod, AV46station, AV32Inc_obs, AV12BarOriCod, AV14BarOriReo, AV13BarOriPar) ;
         }
         else
         {
            GXv_char4[0] = AV52EmprCod ;
            GXv_int9[0] = AV12BarOriCod ;
            GXv_int8[0] = AV14BarOriReo ;
            GXv_char3[0] = AV13BarOriPar ;
            GXv_int7[0] = AV6BarCodDes ;
            GXv_int5[0] = AV19BarReoDes ;
            GXv_char2[0] = AV15BarParDes ;
            GXv_int18[0] = AV30Flag ;
            new app.pcomfor(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_int18) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV12BarOriCod = GXv_int9[0] ;
            particiondehdrs_3_wp_impl.this.AV14BarOriReo = GXv_int8[0] ;
            particiondehdrs_3_wp_impl.this.AV13BarOriPar = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV6BarCodDes = GXv_int7[0] ;
            particiondehdrs_3_wp_impl.this.AV19BarReoDes = GXv_int5[0] ;
            particiondehdrs_3_wp_impl.this.AV15BarParDes = GXv_char2[0] ;
            particiondehdrs_3_wp_impl.this.AV30Flag = GXv_int18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
            httpContext.ajax_rsp_assign_attri("", false, "AV30Flag", GXutil.str( AV30Flag, 1, 0));
            if ( AV30Flag == 1 )
            {
               httpContext.GX_msglist.addItem(AV40msg1);
            }
            GXv_char4[0] = AV52EmprCod ;
            GXv_int9[0] = AV12BarOriCod ;
            GXv_int18[0] = AV14BarOriReo ;
            GXv_char3[0] = AV13BarOriPar ;
            GXv_int7[0] = AV6BarCodDes ;
            GXv_int8[0] = AV19BarReoDes ;
            GXv_char2[0] = AV15BarParDes ;
            GXv_int6[0] = AV26Conos2 ;
            GXv_decimal17[0] = AV34Kilos2 ;
            GXv_decimal16[0] = AV37Metros2 ;
            new app.preopeh(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int18, GXv_char3, GXv_int7, GXv_int8, GXv_char2, GXv_int6, GXv_decimal17, GXv_decimal16) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV12BarOriCod = GXv_int9[0] ;
            particiondehdrs_3_wp_impl.this.AV14BarOriReo = GXv_int18[0] ;
            particiondehdrs_3_wp_impl.this.AV13BarOriPar = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV6BarCodDes = GXv_int7[0] ;
            particiondehdrs_3_wp_impl.this.AV19BarReoDes = GXv_int8[0] ;
            particiondehdrs_3_wp_impl.this.AV15BarParDes = GXv_char2[0] ;
            particiondehdrs_3_wp_impl.this.AV26Conos2 = (short)((short)(GXv_int6[0])) ;
            particiondehdrs_3_wp_impl.this.AV34Kilos2 = GXv_decimal17[0] ;
            particiondehdrs_3_wp_impl.this.AV37Metros2 = GXv_decimal16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
            AV45Signo = (byte)(1) ;
            GXv_char4[0] = AV52EmprCod ;
            GXv_int9[0] = AV6BarCodDes ;
            GXv_int18[0] = AV19BarReoDes ;
            GXv_char3[0] = AV15BarParDes ;
            GXv_int13[0] = AV26Conos2 ;
            GXv_decimal17[0] = AV34Kilos2 ;
            GXv_decimal16[0] = AV37Metros2 ;
            GXv_int12[0] = (short)(AV18BarPiepie) ;
            GXv_decimal15[0] = AV33Kilos ;
            GXv_decimal14[0] = AV36Metros ;
            GXv_decimal11[0] = AV27CosAnyOri ;
            GXv_decimal10[0] = AV28CosPrdOri ;
            GXv_int8[0] = AV45Signo ;
            new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int18, GXv_char3, GXv_int13, GXv_decimal17, GXv_decimal16, GXv_int12, GXv_decimal15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_int8) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV6BarCodDes = GXv_int9[0] ;
            particiondehdrs_3_wp_impl.this.AV19BarReoDes = GXv_int18[0] ;
            particiondehdrs_3_wp_impl.this.AV15BarParDes = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV26Conos2 = GXv_int13[0] ;
            particiondehdrs_3_wp_impl.this.AV34Kilos2 = GXv_decimal17[0] ;
            particiondehdrs_3_wp_impl.this.AV37Metros2 = GXv_decimal16[0] ;
            particiondehdrs_3_wp_impl.this.AV18BarPiepie = GXv_int12[0] ;
            particiondehdrs_3_wp_impl.this.AV33Kilos = GXv_decimal15[0] ;
            particiondehdrs_3_wp_impl.this.AV36Metros = GXv_decimal14[0] ;
            particiondehdrs_3_wp_impl.this.AV27CosAnyOri = GXv_decimal11[0] ;
            particiondehdrs_3_wp_impl.this.AV28CosPrdOri = GXv_decimal10[0] ;
            particiondehdrs_3_wp_impl.this.AV45Signo = GXv_int8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCodDes), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarReoDes", GXutil.str( AV19BarReoDes, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarParDes", AV15BarParDes);
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
            AV45Signo = (byte)(-1) ;
            GXv_char4[0] = AV52EmprCod ;
            GXv_int9[0] = AV12BarOriCod ;
            GXv_int18[0] = AV14BarOriReo ;
            GXv_char3[0] = AV13BarOriPar ;
            GXv_int13[0] = AV26Conos2 ;
            GXv_decimal17[0] = AV34Kilos2 ;
            GXv_decimal16[0] = AV37Metros2 ;
            GXv_int12[0] = (short)(AV18BarPiepie) ;
            GXv_decimal15[0] = AV33Kilos ;
            GXv_decimal14[0] = AV36Metros ;
            GXv_decimal11[0] = AV27CosAnyOri ;
            GXv_decimal10[0] = AV28CosPrdOri ;
            GXv_int8[0] = AV45Signo ;
            new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int18, GXv_char3, GXv_int13, GXv_decimal17, GXv_decimal16, GXv_int12, GXv_decimal15, GXv_decimal14, GXv_decimal11, GXv_decimal10, GXv_int8) ;
            particiondehdrs_3_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
            particiondehdrs_3_wp_impl.this.AV12BarOriCod = GXv_int9[0] ;
            particiondehdrs_3_wp_impl.this.AV14BarOriReo = GXv_int18[0] ;
            particiondehdrs_3_wp_impl.this.AV13BarOriPar = GXv_char3[0] ;
            particiondehdrs_3_wp_impl.this.AV26Conos2 = GXv_int13[0] ;
            particiondehdrs_3_wp_impl.this.AV34Kilos2 = GXv_decimal17[0] ;
            particiondehdrs_3_wp_impl.this.AV37Metros2 = GXv_decimal16[0] ;
            particiondehdrs_3_wp_impl.this.AV18BarPiepie = GXv_int12[0] ;
            particiondehdrs_3_wp_impl.this.AV33Kilos = GXv_decimal15[0] ;
            particiondehdrs_3_wp_impl.this.AV36Metros = GXv_decimal14[0] ;
            particiondehdrs_3_wp_impl.this.AV27CosAnyOri = GXv_decimal11[0] ;
            particiondehdrs_3_wp_impl.this.AV28CosPrdOri = GXv_decimal10[0] ;
            particiondehdrs_3_wp_impl.this.AV45Signo = GXv_int8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
            AV32Inc_obs = httpContext.getMessage( "Fin Particion Hdrs.Opcion pasar de Origen a Destino", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV52EmprCod, GXutil.substring( AV62Pgmname, 1, 10), AV51UsurCod, AV46station, AV32Inc_obs, AV12BarOriCod, AV14BarOriReo, AV13BarOriPar) ;
         }
         AV56WebSession.setValue("ValidarParticion", "SI");
         httpContext.setWebReturnParms(new Object[] {AV52EmprCod,Integer.valueOf(AV12BarOriCod),Byte.valueOf(AV14BarOriReo),AV13BarOriPar,AV21Barser,AV22Barserdsc,AV8Barcolnom,Integer.valueOf(AV9Barcolnum),AV10BarKgm,AV11BarMtr,Integer.valueOf(AV18BarPiepie),Short.valueOf(AV25Conos),AV33Kilos,AV36Metros,AV44Rectotkgm,Short.valueOf(AV17Barpes),AV27CosAnyOri,AV28CosPrdOri,AV41OK,Integer.valueOf(AV7BarCodPan),Byte.valueOf(AV20BarReoPan),AV16BarParPan,Short.valueOf(AV42Partic),AV59BarUnimed});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV52EmprCod","AV12BarOriCod","AV14BarOriReo","AV13BarOriPar","AV21Barser","AV22Barserdsc","AV8Barcolnom","AV9Barcolnum","AV10BarKgm","AV11BarMtr","AV18BarPiepie","AV25Conos","AV33Kilos","AV36Metros","AV44Rectotkgm","AV17Barpes","AV27CosAnyOri","AV28CosPrdOri","AV41OK","AV7BarCodPan","AV20BarReoPan","AV16BarParPan","AV42Partic","AV59BarUnimed"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141LW2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      AV56WebSession.setValue("ValidarParticion", "SI");
      httpContext.setWebReturnParms(new Object[] {AV52EmprCod,Integer.valueOf(AV12BarOriCod),Byte.valueOf(AV14BarOriReo),AV13BarOriPar,AV21Barser,AV22Barserdsc,AV8Barcolnom,Integer.valueOf(AV9Barcolnum),AV10BarKgm,AV11BarMtr,Integer.valueOf(AV18BarPiepie),Short.valueOf(AV25Conos),AV33Kilos,AV36Metros,AV44Rectotkgm,Short.valueOf(AV17Barpes),AV27CosAnyOri,AV28CosPrdOri,AV41OK,Integer.valueOf(AV7BarCodPan),Byte.valueOf(AV20BarReoPan),AV16BarParPan,Short.valueOf(AV42Partic),AV59BarUnimed});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV52EmprCod","AV12BarOriCod","AV14BarOriReo","AV13BarOriPar","AV21Barser","AV22Barserdsc","AV8Barcolnom","AV9Barcolnum","AV10BarKgm","AV11BarMtr","AV18BarPiepie","AV25Conos","AV33Kilos","AV36Metros","AV44Rectotkgm","AV17Barpes","AV27CosAnyOri","AV28CosPrdOri","AV41OK","AV7BarCodPan","AV20BarReoPan","AV16BarParPan","AV42Partic","AV59BarUnimed"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'HDRDESTINO' Routine */
      returnInSub = false ;
      AV29Destino = (short)(1) ;
      AV31Flag2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Flag2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Flag2), 4, 0));
      /* Using cursor H01LW2 */
      pr_default.execute(0, new Object[] {AV52EmprCod, Integer.valueOf(AV6BarCodDes), Byte.valueOf(AV19BarReoDes), AV15BarParDes});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = H01LW2_A130BarCodPar[0] ;
         A132BarCodReo = H01LW2_A132BarCodReo[0] ;
         A129BarCod = H01LW2_A129BarCod[0] ;
         A396EmprCod = H01LW2_A396EmprCod[0] ;
         A120BarAgrEst = H01LW2_A120BarAgrEst[0] ;
         A213BarSit = H01LW2_A213BarSit[0] ;
         AV31Flag2 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Flag2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Flag2), 4, 0));
         AV5BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarAgrEst", AV5BarAgrEst);
         AV23BarSit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarSit), 2, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   protected void nextLoad( )
   {
   }

   protected void e151LW2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_127_1LW2( boolean wbgen )
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
         wb_table1_127_1LW2e( true) ;
      }
      else
      {
         wb_table1_127_1LW2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV52EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      AV12BarOriCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
      AV14BarOriReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
      AV13BarOriPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarOriPar", AV13BarOriPar);
      AV21Barser = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Barser", AV21Barser);
      AV22Barserdsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Barserdsc", AV22Barserdsc);
      AV8Barcolnom = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcolnom", AV8Barcolnom);
      AV9Barcolnum = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcolnum), 6, 0));
      AV10BarKgm = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarKgm", GXutil.ltrimstr( AV10BarKgm, 9, 2));
      AV11BarMtr = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarMtr", GXutil.ltrimstr( AV11BarMtr, 9, 2));
      AV18BarPiepie = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarPiepie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPiepie), 6, 0));
      AV25Conos = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Conos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Conos), 4, 0));
      AV33Kilos = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
      AV36Metros = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
      AV44Rectotkgm = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Rectotkgm", GXutil.ltrimstr( AV44Rectotkgm, 10, 2));
      AV17Barpes = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Barpes), 4, 0));
      AV27CosAnyOri = (java.math.BigDecimal)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
      AV28CosPrdOri = (java.math.BigDecimal)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
      AV41OK = (String)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
      AV7BarCodPan = ((Number) GXutil.testNumericType( getParm(obj,19), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCodPan), 8, 0));
      AV20BarReoPan = ((Number) GXutil.testNumericType( getParm(obj,20), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarReoPan", GXutil.str( AV20BarReoPan, 1, 0));
      AV16BarParPan = (String)getParm(obj,21) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarParPan", AV16BarParPan);
      AV42Partic = ((Number) GXutil.testNumericType( getParm(obj,22), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARTIC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9")));
      AV59BarUnimed = (String)getParm(obj,23) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59BarUnimed", AV59BarUnimed);
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
      pa1LW2( ) ;
      ws1LW2( ) ;
      we1LW2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613484321", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/particiondehdrs_3_wp.js", "?20267613484321", false, true);
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
      edtavBaroricod_Internalname = "vBARORICOD" ;
      edtavBarorireo_Internalname = "vBARORIREO" ;
      edtavBaroripar_Internalname = "vBARORIPAR" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavBarcoddes_Internalname = "vBARCODDES" ;
      edtavBarreodes_Internalname = "vBARREODES" ;
      edtavBarpardes_Internalname = "vBARPARDES" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpiepie_Internalname = "vBARPIEPIE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      grpUnnamedgroup7_Internalname = "UNNAMEDGROUP7" ;
      edtavKilosdestino_Internalname = "vKILOSDESTINO" ;
      edtavMetrosdestino_Internalname = "vMETROSDESTINO" ;
      edtavPiezasdestino_Internalname = "vPIEZASDESTINO" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      grpUnnamedgroup9_Internalname = "UNNAMEDGROUP9" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
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
      edtavPiezasdestino_Jsonclick = "" ;
      edtavPiezasdestino_Enabled = 1 ;
      edtavMetrosdestino_Jsonclick = "" ;
      edtavMetrosdestino_Enabled = 1 ;
      edtavKilosdestino_Jsonclick = "" ;
      edtavKilosdestino_Enabled = 1 ;
      edtavBarpiepie_Jsonclick = "" ;
      edtavBarpiepie_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarpardes_Jsonclick = "" ;
      edtavBarpardes_Enabled = 1 ;
      edtavBarreodes_Jsonclick = "" ;
      edtavBarreodes_Enabled = 1 ;
      edtavBarcoddes_Jsonclick = "" ;
      edtavBarcoddes_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavBaroripar_Jsonclick = "" ;
      edtavBaroripar_Enabled = 0 ;
      edtavBarorireo_Jsonclick = "" ;
      edtavBarorireo_Enabled = 0 ;
      edtavBaroricod_Jsonclick = "" ;
      edtavBaroricod_Enabled = 0 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma la creacion?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "HDR Destino", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "HDR Origen", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Particion de HDRs ", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV62Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV46station',fld:'vSTATION',pic:'',hsh:true},{av:'AV40msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131LW2',iparms:[{av:'AV5BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV35Kilosdestino',fld:'vKILOSDESTINO',pic:'ZZZZZ9.99'},{av:'AV23BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV43PiezasDestino',fld:'vPIEZASDESTINO',pic:'ZZZZZ9'},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV38MetrosDestino',fld:'vMETROSDESTINO',pic:'ZZZZZ9.99'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV59BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV31Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV19BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV15BarParDes',fld:'vBARPARDES',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'},{av:'AV31Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'AV5BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV23BarSit',fld:'vBARSIT',pic:'Z9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e111LW2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV43PiezasDestino',fld:'vPIEZASDESTINO',pic:'ZZZZZ9'},{av:'AV35Kilosdestino',fld:'vKILOSDESTINO',pic:'ZZZZZ9.99'},{av:'AV38MetrosDestino',fld:'vMETROSDESTINO',pic:'ZZZZZ9.99'},{av:'AV17Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV31Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV6BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV19BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV15BarParDes',fld:'vBARPARDES',pic:''},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV33Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV36Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV27CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV28CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV46station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30Flag',fld:'vFLAG',pic:'9'},{av:'AV40msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV59BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9',hsh:true},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV44Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV25Conos',fld:'vCONOS',pic:'ZZZ9'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV9Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV8Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV22Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV21Barser',fld:'vBARSER',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV41OK',fld:'vOK',pic:''},{av:'AV30Flag',fld:'vFLAG',pic:'9'},{av:'AV15BarParDes',fld:'vBARPARDES',pic:''},{av:'AV19BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV6BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV27CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV36Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV33Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141LW2',iparms:[{av:'AV59BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9',hsh:true},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV41OK',fld:'vOK',pic:''},{av:'AV28CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV27CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV17Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV44Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV36Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV33Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV25Conos',fld:'vCONOS',pic:'ZZZ9'},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV9Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV8Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV22Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV21Barser',fld:'vBARSER',pic:''},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODDES","{handler:'validv_Barcoddes',iparms:[]");
      setEventMetadata("VALIDV_BARCODDES",",oparms:[]}");
      setEventMetadata("VALIDV_BARREODES","{handler:'validv_Barreodes',iparms:[]");
      setEventMetadata("VALIDV_BARREODES",",oparms:[]}");
      setEventMetadata("VALIDV_BARPARDES","{handler:'validv_Barpardes',iparms:[]");
      setEventMetadata("VALIDV_BARPARDES",",oparms:[]}");
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
      wcpOAV52EmprCod = "" ;
      wcpOAV13BarOriPar = "" ;
      wcpOAV21Barser = "" ;
      wcpOAV22Barserdsc = "" ;
      wcpOAV8Barcolnom = "" ;
      wcpOAV10BarKgm = DecimalUtil.ZERO ;
      wcpOAV11BarMtr = DecimalUtil.ZERO ;
      wcpOAV33Kilos = DecimalUtil.ZERO ;
      wcpOAV36Metros = DecimalUtil.ZERO ;
      wcpOAV44Rectotkgm = DecimalUtil.ZERO ;
      wcpOAV27CosAnyOri = DecimalUtil.ZERO ;
      wcpOAV28CosPrdOri = DecimalUtil.ZERO ;
      wcpOAV41OK = "" ;
      wcpOAV16BarParPan = "" ;
      wcpOAV59BarUnimed = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV52EmprCod = "" ;
      AV13BarOriPar = "" ;
      AV21Barser = "" ;
      AV22Barserdsc = "" ;
      AV8Barcolnom = "" ;
      AV10BarKgm = DecimalUtil.ZERO ;
      AV11BarMtr = DecimalUtil.ZERO ;
      AV33Kilos = DecimalUtil.ZERO ;
      AV36Metros = DecimalUtil.ZERO ;
      AV44Rectotkgm = DecimalUtil.ZERO ;
      AV27CosAnyOri = DecimalUtil.ZERO ;
      AV28CosPrdOri = DecimalUtil.ZERO ;
      AV41OK = "" ;
      AV16BarParPan = "" ;
      AV59BarUnimed = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV62Pgmname = "" ;
      AV51UsurCod = "" ;
      AV46station = "" ;
      AV40msg1 = "" ;
      GXKey = "" ;
      AV5BarAgrEst = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV15BarParDes = "" ;
      AV35Kilosdestino = DecimalUtil.ZERO ;
      AV38MetrosDestino = DecimalUtil.ZERO ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV53EmprNom = "" ;
      AV39msg0 = "" ;
      GXt_char1 = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      AV34Kilos2 = DecimalUtil.ZERO ;
      AV37Metros2 = DecimalUtil.ZERO ;
      AV32Inc_obs = "" ;
      GXv_int5 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      AV56WebSession = httpContext.getWebSession();
      scmdbuf = "" ;
      H01LW2_A130BarCodPar = new String[] {""} ;
      H01LW2_A132BarCodReo = new byte[1] ;
      H01LW2_A129BarCod = new int[1] ;
      H01LW2_A396EmprCod = new String[] {""} ;
      H01LW2_A120BarAgrEst = new String[] {""} ;
      H01LW2_A213BarSit = new byte[1] ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.particiondehdrs_3_wp__default(),
         new Object[] {
             new Object[] {
            H01LW2_A130BarCodPar, H01LW2_A132BarCodReo, H01LW2_A129BarCod, H01LW2_A396EmprCod, H01LW2_A120BarAgrEst, H01LW2_A213BarSit
            }
         }
      );
      AV62Pgmname = "FormulacionTinte.ParticiondeHDRs_3_WP" ;
      /* GeneXus formulas. */
      AV62Pgmname = "FormulacionTinte.ParticiondeHDRs_3_WP" ;
      Gx_err = (short)(0) ;
      edtavBaroricod_Enabled = 0 ;
      edtavBarorireo_Enabled = 0 ;
      edtavBaroripar_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcoddes_Enabled = 0 ;
      edtavBarreodes_Enabled = 0 ;
      edtavBarpardes_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpiepie_Enabled = 0 ;
   }

   private byte wcpOAV14BarOriReo ;
   private byte wcpOAV20BarReoPan ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV14BarOriReo ;
   private byte AV20BarReoPan ;
   private byte gxajaxcallmode ;
   private byte AV23BarSit ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV30Flag ;
   private byte AV19BarReoDes ;
   private byte nDonePA ;
   private byte AV45Signo ;
   private byte GXv_int5[] ;
   private byte GXv_int18[] ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private short wcpOAV25Conos ;
   private short wcpOAV17Barpes ;
   private short wcpOAV42Partic ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV25Conos ;
   private short AV17Barpes ;
   private short AV42Partic ;
   private short AV31Flag2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV47TinEst ;
   private short AV26Conos2 ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private short AV29Destino ;
   private int wcpOAV12BarOriCod ;
   private int wcpOAV9Barcolnum ;
   private int wcpOAV18BarPiepie ;
   private int wcpOAV7BarCodPan ;
   private int AV12BarOriCod ;
   private int AV9Barcolnum ;
   private int AV18BarPiepie ;
   private int AV7BarCodPan ;
   private int A129BarCod ;
   private int edtavBaroricod_Enabled ;
   private int edtavBarorireo_Enabled ;
   private int edtavBaroripar_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int AV6BarCodDes ;
   private int edtavBarcoddes_Enabled ;
   private int edtavBarreodes_Enabled ;
   private int edtavBarpardes_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpiepie_Enabled ;
   private int edtavKilosdestino_Enabled ;
   private int edtavMetrosdestino_Enabled ;
   private int AV43PiezasDestino ;
   private int edtavPiezasdestino_Enabled ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int GXv_int9[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV10BarKgm ;
   private java.math.BigDecimal wcpOAV11BarMtr ;
   private java.math.BigDecimal wcpOAV33Kilos ;
   private java.math.BigDecimal wcpOAV36Metros ;
   private java.math.BigDecimal wcpOAV44Rectotkgm ;
   private java.math.BigDecimal wcpOAV27CosAnyOri ;
   private java.math.BigDecimal wcpOAV28CosPrdOri ;
   private java.math.BigDecimal AV10BarKgm ;
   private java.math.BigDecimal AV11BarMtr ;
   private java.math.BigDecimal AV33Kilos ;
   private java.math.BigDecimal AV36Metros ;
   private java.math.BigDecimal AV44Rectotkgm ;
   private java.math.BigDecimal AV27CosAnyOri ;
   private java.math.BigDecimal AV28CosPrdOri ;
   private java.math.BigDecimal AV35Kilosdestino ;
   private java.math.BigDecimal AV38MetrosDestino ;
   private java.math.BigDecimal AV34Kilos2 ;
   private java.math.BigDecimal AV37Metros2 ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV52EmprCod ;
   private String wcpOAV13BarOriPar ;
   private String wcpOAV21Barser ;
   private String wcpOAV22Barserdsc ;
   private String wcpOAV8Barcolnom ;
   private String wcpOAV41OK ;
   private String wcpOAV16BarParPan ;
   private String wcpOAV59BarUnimed ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV52EmprCod ;
   private String AV13BarOriPar ;
   private String AV21Barser ;
   private String AV22Barserdsc ;
   private String AV8Barcolnom ;
   private String AV41OK ;
   private String AV16BarParPan ;
   private String AV59BarUnimed ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV62Pgmname ;
   private String AV51UsurCod ;
   private String AV46station ;
   private String AV40msg1 ;
   private String GXKey ;
   private String AV5BarAgrEst ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
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
   private String divUnnamedtable10_Internalname ;
   private String edtavBaroricod_Internalname ;
   private String edtavBaroricod_Jsonclick ;
   private String edtavBarorireo_Internalname ;
   private String edtavBarorireo_Jsonclick ;
   private String edtavBaroripar_Internalname ;
   private String edtavBaroripar_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcoddes_Internalname ;
   private String TempTags ;
   private String edtavBarcoddes_Jsonclick ;
   private String edtavBarreodes_Internalname ;
   private String edtavBarreodes_Jsonclick ;
   private String edtavBarpardes_Internalname ;
   private String AV15BarParDes ;
   private String edtavBarpardes_Jsonclick ;
   private String grpUnnamedgroup7_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpiepie_Internalname ;
   private String edtavBarpiepie_Jsonclick ;
   private String grpUnnamedgroup9_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavKilosdestino_Internalname ;
   private String edtavKilosdestino_Jsonclick ;
   private String edtavMetrosdestino_Internalname ;
   private String edtavMetrosdestino_Jsonclick ;
   private String edtavPiezasdestino_Internalname ;
   private String edtavPiezasdestino_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV53EmprNom ;
   private String AV39msg0 ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
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
   private String AV32Inc_obs ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private IDataStoreProvider pr_default ;
   private String[] H01LW2_A130BarCodPar ;
   private byte[] H01LW2_A132BarCodReo ;
   private int[] H01LW2_A129BarCod ;
   private String[] H01LW2_A396EmprCod ;
   private String[] H01LW2_A120BarAgrEst ;
   private byte[] H01LW2_A213BarSit ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV56WebSession ;
}

final  class particiondehdrs_3_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LW2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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

