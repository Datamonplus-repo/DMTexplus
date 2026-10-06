package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class particiondehdrs_2_wp_impl extends GXDataArea
{
   public particiondehdrs_2_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public particiondehdrs_2_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( particiondehdrs_2_wp_impl.class ));
   }

   public particiondehdrs_2_wp_impl( int remoteHandle ,
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
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Conos), "ZZZ9")));
               AV33Kilos = CommonUtil.decimalVal( httpContext.GetPar( "Kilos"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKILOS", getSecureSignedToken( "", localUtil.format( AV33Kilos, "ZZZZZ9.99")));
               AV36Metros = CommonUtil.decimalVal( httpContext.GetPar( "Metros"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV36Metros, "ZZZZZ9.99")));
               AV44Rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "Rectotkgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Rectotkgm", GXutil.ltrimstr( AV44Rectotkgm, 10, 2));
               AV17Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Barpes), 4, 0));
               AV27CosAnyOri = CommonUtil.decimalVal( httpContext.GetPar( "CosAnyOri"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSANYORI", getSecureSignedToken( "", localUtil.format( AV27CosAnyOri, "ZZZZZZ9.99")));
               AV28CosPrdOri = CommonUtil.decimalVal( httpContext.GetPar( "CosPrdOri"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSPRDORI", getSecureSignedToken( "", localUtil.format( AV28CosPrdOri, "ZZZZZZ9.99")));
               AV62Barunimed = httpContext.GetPar( "Barunimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62Barunimed", AV62Barunimed);
               AV41OK = httpContext.GetPar( "OK") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
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
      pa1LV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1LV2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.particiondehdrs_2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV21Barser)),GXutil.URLEncode(GXutil.rtrim(AV22Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV8Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV10BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Conos,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV33Kilos)),GXutil.URLEncode(DecimalUtil.decToString(AV36Metros)),GXutil.URLEncode(DecimalUtil.decToString(AV44Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV17Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27CosAnyOri)),GXutil.URLEncode(DecimalUtil.decToString(AV28CosPrdOri)),GXutil.URLEncode(GXutil.rtrim(AV62Barunimed)),GXutil.URLEncode(GXutil.rtrim(AV41OK))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","Barunimed","OK"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSPRDORI", getSecureSignedToken( "", localUtil.format( AV28CosPrdOri, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSANYORI", getSecureSignedToken( "", localUtil.format( AV27CosAnyOri, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV36Metros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKILOS", getSecureSignedToken( "", localUtil.format( AV33Kilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Conos), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORICOD", GXutil.ltrim( localUtil.ntoc( AV12BarOriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORIREO", GXutil.ltrim( localUtil.ntoc( AV14BarOriReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORIPAR", GXutil.rtrim( AV13BarOriPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV52EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV21Barser));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV22Barserdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV8Barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV9Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV10BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV11BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEPIE", GXutil.ltrim( localUtil.ntoc( AV18BarPiepie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV44Rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV17Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV57BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSPRO", GXutil.ltrim( localUtil.ntoc( AV58BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV41OK));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV62Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRDORI", GXutil.ltrim( localUtil.ntoc( AV28CosPrdOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSPRDORI", getSecureSignedToken( "", localUtil.format( AV28CosPrdOri, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANYORI", GXutil.ltrim( localUtil.ntoc( AV27CosAnyOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSANYORI", getSecureSignedToken( "", localUtil.format( AV27CosAnyOri, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV36Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV36Metros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV33Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKILOS", getSecureSignedToken( "", localUtil.format( AV33Kilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONOS", GXutil.ltrim( localUtil.ntoc( AV25Conos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Conos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPARDES", GXutil.rtrim( AV15BarParDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARREODES", GXutil.ltrim( localUtil.ntoc( AV19BarReoDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODDES", GXutil.ltrim( localUtil.ntoc( AV6BarCodDes, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Title", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Result", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Result", GXutil.rtrim( Dvelop_confirmpanel_btncrearparticion_Result));
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
         we1LV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1LV2( ) ;
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
      return formatLink("app.formulaciontinte.particiondehdrs_2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV21Barser)),GXutil.URLEncode(GXutil.rtrim(AV22Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV8Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV10BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Conos,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV33Kilos)),GXutil.URLEncode(DecimalUtil.decToString(AV36Metros)),GXutil.URLEncode(DecimalUtil.decToString(AV44Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV17Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27CosAnyOri)),GXutil.URLEncode(DecimalUtil.decToString(AV28CosPrdOri)),GXutil.URLEncode(GXutil.rtrim(AV62Barunimed)),GXutil.URLEncode(GXutil.rtrim(AV41OK))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","Barunimed","OK"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ParticiondeHDRs_2_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Particion de HDRs", "") ;
   }

   public void wb1LV0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpan_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpan_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarCodPan, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodpan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7BarCodPan), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7BarCodPan), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpan_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarreopan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarreopan_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarreopan_Internalname, GXutil.ltrim( localUtil.ntoc( AV20BarReoPan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarreopan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20BarReoPan), "9") : localUtil.format( DecimalUtil.doubleToDec(AV20BarReoPan), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarreopan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarreopan_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarparpan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarparpan_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarparpan_Internalname, GXutil.rtrim( AV16BarParPan), GXutil.rtrim( localUtil.format( AV16BarParPan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarparpan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarparpan_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobtenerletra_Internalname, "", httpContext.getMessage( "Crear Particion", ""), bttBtnobtenerletra_Jsonclick, 5, httpContext.getMessage( "Crear Particion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOOBTENERLETRA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearparticion_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtncrearparticion_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111lv1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, divUnnamedtable1_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPartic_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPartic_Internalname, httpContext.getMessage( "Pulsado Crear Particion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPartic_Internalname, GXutil.ltrim( localUtil.ntoc( AV42Partic, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPartic_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42Partic), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPartic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPartic_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavValorwebsession_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavValorwebsession_Internalname, httpContext.getMessage( "valorwebsession", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValorwebsession_Internalname, GXutil.rtrim( AV61valorwebsession), GXutil.rtrim( localUtil.format( AV61valorwebsession, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValorwebsession_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavValorwebsession_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ParticiondeHDRs_2_WP.htm");
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
         wb_table1_62_1LV2( true) ;
      }
      else
      {
         wb_table1_62_1LV2( false) ;
      }
      return  ;
   }

   public void wb_table1_62_1LV2e( boolean wbgen )
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

   public void start1LV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Particion de HDRs", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1LV0( ) ;
   }

   public void ws1LV2( )
   {
      start1LV2( ) ;
      evt1LV2( ) ;
   }

   public void evt1LV2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCREARPARTICION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121LV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131LV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141LV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOOBTENERLETRA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoObtenerLetra' */
                           e151LV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e161LV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171LV2 ();
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

   public void we1LV2( )
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

   public void pa1LV2( )
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
            GX_FocusControl = edtavBarcodpan_Internalname ;
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
      rf1LV2( ) ;
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
      edtavPartic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPartic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPartic_Enabled), 5, 0), true);
      edtavValorwebsession_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValorwebsession_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorwebsession_Enabled), 5, 0), true);
   }

   public void rf1LV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e161LV2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171LV2 ();
         wb1LV0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1LV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRDORI", GXutil.ltrim( localUtil.ntoc( AV28CosPrdOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSPRDORI", getSecureSignedToken( "", localUtil.format( AV28CosPrdOri, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANYORI", GXutil.ltrim( localUtil.ntoc( AV27CosAnyOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSANYORI", getSecureSignedToken( "", localUtil.format( AV27CosAnyOri, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV36Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV36Metros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV33Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKILOS", getSecureSignedToken( "", localUtil.format( AV33Kilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONOS", GXutil.ltrim( localUtil.ntoc( AV25Conos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Conos), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavPartic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPartic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPartic_Enabled), 5, 0), true);
      edtavValorwebsession_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValorwebsession_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorwebsession_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1LV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131LV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV13BarOriPar = httpContext.cgiGet( "vBARORIPAR") ;
         AV14BarOriReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARORIREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12BarOriCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARORICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15BarParDes = httpContext.cgiGet( "vBARPARDES") ;
         AV19BarReoDes = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARREODES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV6BarCodDes = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCODDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_btncrearparticion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Title") ;
         Dvelop_confirmpanel_btncrearparticion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Confirmationtext") ;
         Dvelop_confirmpanel_btncrearparticion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btncrearparticion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Nobuttoncaption") ;
         Dvelop_confirmpanel_btncrearparticion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btncrearparticion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Yesbuttonposition") ;
         Dvelop_confirmpanel_btncrearparticion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Confirmtype") ;
         Dvelop_confirmpanel_btncrearparticion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCREARPARTICION_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodpan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodpan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODPAN");
            GX_FocusControl = edtavBarcodpan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7BarCodPan = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCodPan), 8, 0));
         }
         else
         {
            AV7BarCodPan = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodpan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCodPan), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarreopan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarreopan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARREOPAN");
            GX_FocusControl = edtavBarreopan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarReoPan = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarReoPan", GXutil.str( AV20BarReoPan, 1, 0));
         }
         else
         {
            AV20BarReoPan = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarreopan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarReoPan", GXutil.str( AV20BarReoPan, 1, 0));
         }
         AV16BarParPan = httpContext.cgiGet( edtavBarparpan_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarParPan", AV16BarParPan);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPartic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPartic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPARTIC");
            GX_FocusControl = edtavPartic_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42Partic = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
         }
         else
         {
            AV42Partic = (short)(localUtil.ctol( httpContext.cgiGet( edtavPartic_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
         }
         AV61valorwebsession = httpContext.cgiGet( edtavValorwebsession_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61valorwebsession", AV61valorwebsession);
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
      e131LV2 ();
      if (returnInSub) return;
   }

   public void e131LV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV46station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      particiondehdrs_2_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46station = GXt_char1 ;
      GXv_char2[0] = AV52EmprCod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46station, GXv_char2, GXv_char3, GXv_char4) ;
      particiondehdrs_2_wp_impl.this.AV52EmprCod = GXv_char2[0] ;
      particiondehdrs_2_wp_impl.this.AV53EmprNom = GXv_char3[0] ;
      particiondehdrs_2_wp_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      AV42Partic = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
      GXv_int5[0] = (byte)(AV47TinEst) ;
      new app.pexicon(remoteHandle, context).execute( AV52EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int5) ;
      particiondehdrs_2_wp_impl.this.AV47TinEst = GXv_int5[0] ;
      AV41OK = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
      GXt_char1 = AV39msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG219_", ""), (byte)(99), GXv_char4) ;
      particiondehdrs_2_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39msg0 = GXt_char1 ;
      GXt_char1 = AV40msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG220_", ""), (byte)(99), GXv_char4) ;
      particiondehdrs_2_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV40msg1 = GXt_char1 ;
      AV60WebSession.remove("ValidarParticion");
      AV60WebSession.setValue("ValidarParticion", "NO");
      GXt_char1 = AV46station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      particiondehdrs_2_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46station = GXt_char1 ;
      GXv_char4[0] = AV52EmprCod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char2[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46station, GXv_char4, GXv_char3, GXv_char2) ;
      particiondehdrs_2_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
      particiondehdrs_2_wp_impl.this.AV53EmprNom = GXv_char3[0] ;
      particiondehdrs_2_wp_impl.this.AV51UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
   }

   public void e121LV2( )
   {
      /* Dvelop_confirmpanel_btncrearparticion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btncrearparticion_Result, "Yes") == 0 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.particiondehdrs_3_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarOriPar)),GXutil.URLEncode(GXutil.rtrim(AV21Barser)),GXutil.URLEncode(GXutil.rtrim(AV22Barserdsc)),GXutil.URLEncode(GXutil.rtrim(AV8Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcolnum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV10BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV11BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV18BarPiepie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(DecimalUtil.decToString(AV44Rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV17Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV57BarCosAny)),GXutil.URLEncode(DecimalUtil.decToString(AV58BarCosPro)),GXutil.URLEncode(GXutil.rtrim(AV41OK)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodPan,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarReoPan,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarParPan)),GXutil.URLEncode(GXutil.ltrimstr(AV42Partic,4,0)),GXutil.URLEncode(GXutil.rtrim(AV62Barunimed))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","Barser","Barserdsc","Barcolnom","Barcolnum","BarKgm","BarMtr","BarPiepie","Conos","Kilos","Metros","Rectotkgm","Barpes","CosAnyOri","CosPrdOri","OK","BarCodPan","BarReoPan","BarParPan","Partic","BarUnimed"}) , new Object[] {"AV52EmprCod","AV12BarOriCod","AV14BarOriReo","AV13BarOriPar","AV21Barser","AV22Barserdsc","AV8Barcolnom","AV9Barcolnum","AV10BarKgm","AV11BarMtr","AV18BarPiepie","","","","AV44Rectotkgm","AV17Barpes","AV57BarCosAny","AV58BarCosPro","AV41OK","AV7BarCodPan","AV20BarReoPan","AV16BarParPan","AV42Partic","AV62Barunimed"});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e141LV2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV52EmprCod,Integer.valueOf(AV12BarOriCod),Byte.valueOf(AV14BarOriReo),AV13BarOriPar,AV21Barser,AV22Barserdsc,AV8Barcolnom,Integer.valueOf(AV9Barcolnum),AV10BarKgm,AV11BarMtr,Integer.valueOf(AV18BarPiepie),Short.valueOf(AV25Conos),AV33Kilos,AV36Metros,AV44Rectotkgm,Short.valueOf(AV17Barpes),AV27CosAnyOri,AV28CosPrdOri,AV62Barunimed,AV41OK});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV52EmprCod","AV12BarOriCod","AV14BarOriReo","AV13BarOriPar","AV21Barser","AV22Barserdsc","AV8Barcolnom","AV9Barcolnum","AV10BarKgm","AV11BarMtr","AV18BarPiepie","AV25Conos","AV33Kilos","AV36Metros","AV44Rectotkgm","AV17Barpes","AV27CosAnyOri","AV28CosPrdOri","AV62Barunimed","AV41OK"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e151LV2( )
   {
      /* 'DoObtenerLetra' Routine */
      returnInSub = false ;
      if ( (0==AV42Partic) )
      {
         GXv_char4[0] = AV52EmprCod ;
         GXv_int6[0] = AV12BarOriCod ;
         GXv_int5[0] = AV14BarOriReo ;
         GXv_char3[0] = AV16BarParPan ;
         new app.pnumpar(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3) ;
         particiondehdrs_2_wp_impl.this.AV52EmprCod = GXv_char4[0] ;
         particiondehdrs_2_wp_impl.this.AV12BarOriCod = GXv_int6[0] ;
         particiondehdrs_2_wp_impl.this.AV14BarOriReo = GXv_int5[0] ;
         particiondehdrs_2_wp_impl.this.AV16BarParPan = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOriCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarOriReo", GXutil.str( AV14BarOriReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarParPan", AV16BarParPan);
         AV42Partic = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Partic", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Partic), 4, 0));
         AV29Destino = (short)(0) ;
         AV7BarCodPan = AV12BarOriCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCodPan), 8, 0));
         AV20BarReoPan = AV14BarOriReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20BarReoPan", GXutil.str( AV20BarReoPan, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ya fue pulsado el boton Crear Particion", ""));
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divUnnamedtable1_Visible = (((1==2)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Visible), 5, 0), true);
   }

   public void e161LV2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV60WebSession.getValue("ValidarParticion"))), "SI") == 0 )
      {
         AV60WebSession.remove("ValidarParticion");
         httpContext.setWebReturnParms(new Object[] {AV52EmprCod,Integer.valueOf(AV12BarOriCod),Byte.valueOf(AV14BarOriReo),AV13BarOriPar,AV21Barser,AV22Barserdsc,AV8Barcolnom,Integer.valueOf(AV9Barcolnum),AV10BarKgm,AV11BarMtr,Integer.valueOf(AV18BarPiepie),Short.valueOf(AV25Conos),AV33Kilos,AV36Metros,AV44Rectotkgm,Short.valueOf(AV17Barpes),AV27CosAnyOri,AV28CosPrdOri,AV62Barunimed,AV41OK});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV52EmprCod","AV12BarOriCod","AV14BarOriReo","AV13BarOriPar","AV21Barser","AV22Barserdsc","AV8Barcolnom","AV9Barcolnum","AV10BarKgm","AV11BarMtr","AV18BarPiepie","AV25Conos","AV33Kilos","AV36Metros","AV44Rectotkgm","AV17Barpes","AV27CosAnyOri","AV28CosPrdOri","AV62Barunimed","AV41OK"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e171LV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_62_1LV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btncrearparticion_Internalname, tblTabledvelop_confirmpanel_btncrearparticion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btncrearparticion.setProperty("Title", Dvelop_confirmpanel_btncrearparticion_Title);
         ucDvelop_confirmpanel_btncrearparticion.setProperty("ConfirmationText", Dvelop_confirmpanel_btncrearparticion_Confirmationtext);
         ucDvelop_confirmpanel_btncrearparticion.setProperty("YesButtonCaption", Dvelop_confirmpanel_btncrearparticion_Yesbuttoncaption);
         ucDvelop_confirmpanel_btncrearparticion.setProperty("NoButtonCaption", Dvelop_confirmpanel_btncrearparticion_Nobuttoncaption);
         ucDvelop_confirmpanel_btncrearparticion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btncrearparticion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btncrearparticion.setProperty("YesButtonPosition", Dvelop_confirmpanel_btncrearparticion_Yesbuttonposition);
         ucDvelop_confirmpanel_btncrearparticion.setProperty("ConfirmType", Dvelop_confirmpanel_btncrearparticion_Confirmtype);
         ucDvelop_confirmpanel_btncrearparticion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btncrearparticion_Internalname, "DVELOP_CONFIRMPANEL_BTNCREARPARTICIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCREARPARTICIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_62_1LV2e( true) ;
      }
      else
      {
         wb_table1_62_1LV2e( false) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Conos), "ZZZ9")));
      AV33Kilos = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Kilos", GXutil.ltrimstr( AV33Kilos, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKILOS", getSecureSignedToken( "", localUtil.format( AV33Kilos, "ZZZZZ9.99")));
      AV36Metros = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Metros", GXutil.ltrimstr( AV36Metros, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV36Metros, "ZZZZZ9.99")));
      AV44Rectotkgm = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Rectotkgm", GXutil.ltrimstr( AV44Rectotkgm, 10, 2));
      AV17Barpes = ((Number) GXutil.testNumericType( getParm(obj,15), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Barpes), 4, 0));
      AV27CosAnyOri = (java.math.BigDecimal)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CosAnyOri", GXutil.ltrimstr( AV27CosAnyOri, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSANYORI", getSecureSignedToken( "", localUtil.format( AV27CosAnyOri, "ZZZZZZ9.99")));
      AV28CosPrdOri = (java.math.BigDecimal)getParm(obj,17) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CosPrdOri", GXutil.ltrimstr( AV28CosPrdOri, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSPRDORI", getSecureSignedToken( "", localUtil.format( AV28CosPrdOri, "ZZZZZZ9.99")));
      AV62Barunimed = (String)getParm(obj,18) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Barunimed", AV62Barunimed);
      AV41OK = (String)getParm(obj,19) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41OK", AV41OK);
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
      pa1LV2( ) ;
      ws1LV2( ) ;
      we1LV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613484091", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/particiondehdrs_2_wp.js", "?20267613484092", false, true);
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
      edtavBarcodpan_Internalname = "vBARCODPAN" ;
      edtavBarreopan_Internalname = "vBARREOPAN" ;
      edtavBarparpan_Internalname = "vBARPARPAN" ;
      bttBtnobtenerletra_Internalname = "BTNOBTENERLETRA" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtncrearparticion_Internalname = "BTNCREARPARTICION" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPartic_Internalname = "vPARTIC" ;
      edtavValorwebsession_Internalname = "vVALORWEBSESSION" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btncrearparticion_Internalname = "DVELOP_CONFIRMPANEL_BTNCREARPARTICION" ;
      tblTabledvelop_confirmpanel_btncrearparticion_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCREARPARTICION" ;
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
      edtavValorwebsession_Jsonclick = "" ;
      edtavValorwebsession_Enabled = 1 ;
      edtavPartic_Jsonclick = "" ;
      edtavPartic_Enabled = 1 ;
      divUnnamedtable1_Visible = 1 ;
      edtavBarparpan_Jsonclick = "" ;
      edtavBarparpan_Enabled = 1 ;
      edtavBarreopan_Jsonclick = "" ;
      edtavBarreopan_Enabled = 1 ;
      edtavBarcodpan_Jsonclick = "" ;
      edtavBarcodpan_Enabled = 1 ;
      Dvelop_confirmpanel_btncrearparticion_Confirmtype = "1" ;
      Dvelop_confirmpanel_btncrearparticion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btncrearparticion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btncrearparticion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btncrearparticion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btncrearparticion_Confirmationtext = "¿Confirma la creacion?" ;
      Dvelop_confirmpanel_btncrearparticion_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Crear Particion", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Particion de HDRs", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV41OK',fld:'vOK',pic:''},{av:'AV62Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV17Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV44Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV9Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV8Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV22Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV21Barser',fld:'vBARSER',pic:''},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV27CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV36Metros',fld:'vMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV33Kilos',fld:'vKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV25Conos',fld:'vCONOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCREARPARTICION'","{handler:'e111LV1',iparms:[{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''}]");
      setEventMetadata("'DOCREARPARTICION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCREARPARTICION.CLOSE","{handler:'e121LV2',iparms:[{av:'Dvelop_confirmpanel_btncrearparticion_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCREARPARTICION',prop:'Result'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV21Barser',fld:'vBARSER',pic:''},{av:'AV22Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV8Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV9Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV44Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV17Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV57BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV58BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV41OK',fld:'vOK',pic:''},{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'AV62Barunimed',fld:'vBARUNIMED',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCREARPARTICION.CLOSE",",oparms:[{av:'AV62Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'},{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV41OK',fld:'vOK',pic:''},{av:'AV58BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV57BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV17Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV44Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV9Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV8Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV22Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV21Barser',fld:'vBARSER',pic:''},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141LV2',iparms:[{av:'AV41OK',fld:'vOK',pic:''},{av:'AV62Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV28CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV27CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV44Rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV36Metros',fld:'vMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV33Kilos',fld:'vKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV25Conos',fld:'vCONOS',pic:'ZZZ9',hsh:true},{av:'AV18BarPiepie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV11BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV10BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV9Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV8Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV22Barserdsc',fld:'vBARSERDSC',pic:''},{av:'AV21Barser',fld:'vBARSER',pic:''},{av:'AV13BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOOBTENERLETRA'","{handler:'e151LV2',iparms:[{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''}]");
      setEventMetadata("'DOOBTENERLETRA'",",oparms:[{av:'AV16BarParPan',fld:'vBARPARPAN',pic:''},{av:'AV14BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV12BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Partic',fld:'vPARTIC',pic:'ZZZ9'},{av:'AV7BarCodPan',fld:'vBARCODPAN',pic:'ZZZZZZZ9'},{av:'AV20BarReoPan',fld:'vBARREOPAN',pic:'9'}]}");
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
      wcpOAV62Barunimed = "" ;
      wcpOAV41OK = "" ;
      Dvelop_confirmpanel_btncrearparticion_Result = "" ;
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
      AV62Barunimed = "" ;
      AV41OK = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV57BarCosAny = DecimalUtil.ZERO ;
      AV58BarCosPro = DecimalUtil.ZERO ;
      AV15BarParDes = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV16BarParPan = "" ;
      bttBtnobtenerletra_Jsonclick = "" ;
      bttBtncrearparticion_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV61valorwebsession = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV46station = "" ;
      AV53EmprNom = "" ;
      AV51UsurCod = "" ;
      AV39msg0 = "" ;
      AV40msg1 = "" ;
      AV60WebSession = httpContext.getWebSession();
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btncrearparticion = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPartic_Enabled = 0 ;
      edtavValorwebsession_Enabled = 0 ;
   }

   private byte wcpOAV14BarOriReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV14BarOriReo ;
   private byte gxajaxcallmode ;
   private byte AV19BarReoDes ;
   private byte AV20BarReoPan ;
   private byte nDonePA ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short wcpOAV25Conos ;
   private short wcpOAV17Barpes ;
   private short AV25Conos ;
   private short AV17Barpes ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42Partic ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV47TinEst ;
   private short AV29Destino ;
   private int wcpOAV12BarOriCod ;
   private int wcpOAV9Barcolnum ;
   private int wcpOAV18BarPiepie ;
   private int AV12BarOriCod ;
   private int AV9Barcolnum ;
   private int AV18BarPiepie ;
   private int AV6BarCodDes ;
   private int AV7BarCodPan ;
   private int edtavBarcodpan_Enabled ;
   private int edtavBarreopan_Enabled ;
   private int edtavBarparpan_Enabled ;
   private int divUnnamedtable1_Visible ;
   private int edtavPartic_Enabled ;
   private int edtavValorwebsession_Enabled ;
   private int GXv_int6[] ;
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
   private java.math.BigDecimal AV57BarCosAny ;
   private java.math.BigDecimal AV58BarCosPro ;
   private String wcpOAV52EmprCod ;
   private String wcpOAV13BarOriPar ;
   private String wcpOAV21Barser ;
   private String wcpOAV22Barserdsc ;
   private String wcpOAV8Barcolnom ;
   private String wcpOAV62Barunimed ;
   private String wcpOAV41OK ;
   private String Dvelop_confirmpanel_btncrearparticion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV52EmprCod ;
   private String AV13BarOriPar ;
   private String AV21Barser ;
   private String AV22Barserdsc ;
   private String AV8Barcolnom ;
   private String AV62Barunimed ;
   private String AV41OK ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV15BarParDes ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_btncrearparticion_Title ;
   private String Dvelop_confirmpanel_btncrearparticion_Confirmationtext ;
   private String Dvelop_confirmpanel_btncrearparticion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btncrearparticion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btncrearparticion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btncrearparticion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btncrearparticion_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcodpan_Internalname ;
   private String TempTags ;
   private String edtavBarcodpan_Jsonclick ;
   private String edtavBarreopan_Internalname ;
   private String edtavBarreopan_Jsonclick ;
   private String edtavBarparpan_Internalname ;
   private String AV16BarParPan ;
   private String edtavBarparpan_Jsonclick ;
   private String bttBtnobtenerletra_Internalname ;
   private String bttBtnobtenerletra_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtncrearparticion_Internalname ;
   private String bttBtncrearparticion_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPartic_Internalname ;
   private String edtavPartic_Jsonclick ;
   private String edtavValorwebsession_Internalname ;
   private String AV61valorwebsession ;
   private String edtavValorwebsession_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV46station ;
   private String AV53EmprNom ;
   private String AV51UsurCod ;
   private String AV39msg0 ;
   private String AV40msg1 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btncrearparticion_Internalname ;
   private String Dvelop_confirmpanel_btncrearparticion_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btncrearparticion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV60WebSession ;
}

