package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_lineas_wp_impl extends GXDataArea
{
   public controlcalidadvariable_lineas_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidadvariable_lineas_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariable_lineas_wp_impl.class ));
   }

   public controlcalidadvariable_lineas_wp_impl( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCcttpoctr = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            gxnrgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            gxgrgrid_refresh_invoke( ) ;
            return  ;
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
            AV28EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV26CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCTCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CCTCod), "ZZZZZ9")));
               AV35CCTDsc = httpContext.GetPar( "CCTDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35CCTDsc", AV35CCTDsc);
               AV27CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CCTLin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27CCTLin), "ZZZ9")));
               AV36CCTLinDsc = httpContext.GetPar( "CCTLinDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinDsc", AV36CCTLinDsc);
               AV37CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37CCTTpoCtr", AV37CCTTpoCtr);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37CCTTpoCtr, ""))));
               AV38CCTLinTpoIng = httpContext.GetPar( "CCTLinTpoIng") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38CCTLinTpoIng", AV38CCTLinTpoIng);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINTPOING", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CCTLinTpoIng, ""))));
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV28EmprCod = httpContext.GetPar( "EmprCod") ;
      AV26CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV27CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
      AV15TFCCTValLin = (byte)(GXutil.lval( httpContext.GetPar( "TFCCTValLin"))) ;
      AV16TFCCTValLin_To = (byte)(GXutil.lval( httpContext.GetPar( "TFCCTValLin_To"))) ;
      AV17TFCCTValDsc = httpContext.GetPar( "TFCCTValDsc") ;
      AV18TFCCTValDsc_Sel = httpContext.GetPar( "TFCCTValDsc_Sel") ;
      AV19TFCCTVal = httpContext.GetPar( "TFCCTVal") ;
      AV20TFCCTVal_Sel = httpContext.GetPar( "TFCCTVal_Sel") ;
      AV51Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV38CCTLinTpoIng = httpContext.GetPar( "CCTLinTpoIng") ;
      AV39CCTMsgVal = httpContext.GetPar( "CCTMsgVal") ;
      AV47CCTMsgCod = httpContext.GetPar( "CCTMsgCod") ;
      AV48CCTMsgDsc = httpContext.GetPar( "CCTMsgDsc") ;
      AV44CCTMsgLin = httpContext.GetPar( "CCTMsgLin") ;
      AV45CCTMsgMin = httpContext.GetPar( "CCTMsgMin") ;
      AV46CCTMsgMax = httpContext.GetPar( "CCTMsgMax") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
      cmbavCcttpoctr.fromJSonString( httpContext.GetNextPar( ));
      AV37CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV26CCTCod, AV27CCTLin, AV15TFCCTValLin, AV16TFCCTValLin_To, AV17TFCCTValDsc, AV18TFCCTValDsc_Sel, AV19TFCCTVal, AV20TFCCTVal_Sel, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38CCTLinTpoIng, AV39CCTMsgVal, AV47CCTMsgCod, AV48CCTMsgDsc, AV44CCTMsgLin, AV45CCTMsgMin, AV46CCTMsgMax, A396EmprCod, A4031CCTCod, A4034CCTLin, AV37CCTTpoCtr) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      pa26T2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start26T2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35CCTDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV27CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36CCTLinDsc)),GXutil.URLEncode(GXutil.rtrim(AV37CCTTpoCtr)),GXutil.URLEncode(GXutil.rtrim(AV38CCTLinTpoIng))}, new String[] {"EmprCod","CCTCod","CCTDsc","CCTLin","CCTLinDsc","CCTTpoCtr","CCTLinTpoIng"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINTPOING", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CCTLinTpoIng, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39CCTMsgVal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47CCTMsgCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CCTMsgDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGLIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CCTMsgLin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45CCTMsgMin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMAX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46CCTMsgMax, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37CCTTpoCtr, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable_Lineas_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidadvariable_lineas_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_80, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV23GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV24GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTVALLIN", GXutil.ltrim( localUtil.ntoc( AV15TFCCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTVALLIN_TO", GXutil.ltrim( localUtil.ntoc( AV16TFCCTValLin_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTVALDSC", GXutil.rtrim( AV17TFCCTValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTVALDSC_SEL", GXutil.rtrim( AV18TFCCTValDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTVAL", GXutil.rtrim( AV19TFCCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTVAL_SEL", GXutil.rtrim( AV20TFCCTVal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTLINTPOING", GXutil.rtrim( AV38CCTLinTpoIng));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINTPOING", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CCTLinTpoIng, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGVAL", AV39CCTMsgVal);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39CCTMsgVal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGCOD", AV47CCTMsgCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47CCTMsgCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGDSC", AV48CCTMsgDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CCTMsgDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTTPOCTR", GXutil.rtrim( A4037CCTTpoCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGLIN", AV44CCTMsgLin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGLIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CCTMsgLin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGMIN", AV45CCTMsgMin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45CCTMsgMin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGMAX", AV46CCTMsgMax);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMAX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46CCTMsgMax, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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
         we26T2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt26T2( ) ;
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
      return formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35CCTDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV27CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV36CCTLinDsc)),GXutil.URLEncode(GXutil.rtrim(AV37CCTTpoCtr)),GXutil.URLEncode(GXutil.rtrim(AV38CCTLinTpoIng))}, new String[] {"EmprCod","CCTCod","CCTDsc","CCTLin","CCTLinDsc","CCTTpoCtr","CCTLinTpoIng"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidadVariable_Lineas_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Control Calidad Variable (lineas)", "") ;
   }

   public void wb26T0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctcod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV26CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctcod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctdsc_Internalname, GXutil.rtrim( AV35CCTDsc), GXutil.rtrim( localUtil.format( AV35CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV27CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27CCTLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlindsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlindsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlindsc_Internalname, GXutil.rtrim( AV36CCTLinDsc), GXutil.rtrim( localUtil.format( AV36CCTLinDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlindsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlindsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCcttpoctr.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCcttpoctr.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCcttpoctr, cmbavCcttpoctr.getInternalname(), GXutil.rtrim( AV37CCTTpoCtr), 1, cmbavCcttpoctr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavCcttpoctr.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         cmbavCcttpoctr.setValue( GXutil.rtrim( AV37CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Values", cmbavCcttpoctr.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctvallin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctvallin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctvallin_Internalname, GXutil.ltrim( localUtil.ntoc( AV29CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29CCTValLin), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctvallin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctvallin_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctvaldsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctvaldsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctvaldsc_Internalname, GXutil.rtrim( AV30CCTValDsc), GXutil.rtrim( localUtil.format( AV30CCTValDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctvaldsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctvaldsc_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctval_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctval_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctval_Internalname, GXutil.rtrim( AV31CCTVal), GXutil.rtrim( localUtil.format( AV31CCTVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctval_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctval_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_69_26T2( true) ;
      }
      else
      {
         wb_table1_69_26T2( false) ;
      }
      return  ;
   }

   public void wb_table1_69_26T2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol80( ) ;
      }
      if ( wbEnd == 80 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_80 = (int)(nGXsfl_80_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV23GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV24GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadVariable_Lineas_WP.htm");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV21DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 80 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start26T2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Control Calidad Variable (lineas)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup26T0( ) ;
   }

   public void ws26T2( )
   {
      start26T2( ) ;
      evt26T2( ) ;
   }

   public void evt26T2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1126T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1226T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1326T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e1426T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1526T2 ();
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_80_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_802( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV25GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
                           A4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4050CCTValDsc = httpContext.cgiGet( edtCCTValDsc_Internalname) ;
                           A4051CCTVal = httpContext.cgiGet( edtCCTVal_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1626T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1726T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1826T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1926T2 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we26T2( )
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

   public void pa26T2( )
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
            GX_FocusControl = edtavCctvallin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_802( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         sendrow_802( ) ;
         nGXsfl_80_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV28EmprCod ,
                                 int AV26CCTCod ,
                                 short AV27CCTLin ,
                                 byte AV15TFCCTValLin ,
                                 byte AV16TFCCTValLin_To ,
                                 String AV17TFCCTValDsc ,
                                 String AV18TFCCTValDsc_Sel ,
                                 String AV19TFCCTVal ,
                                 String AV20TFCCTVal_Sel ,
                                 String AV51Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV38CCTLinTpoIng ,
                                 String AV39CCTMsgVal ,
                                 String AV47CCTMsgCod ,
                                 String AV48CCTMsgDsc ,
                                 String AV44CCTMsgLin ,
                                 String AV45CCTMsgMin ,
                                 String AV46CCTMsgMax ,
                                 String A396EmprCod ,
                                 int A4031CCTCod ,
                                 short A4034CCTLin ,
                                 String AV37CCTTpoCtr )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1726T2 ();
      GRID_nCurrentRecord = 0 ;
      rf26T2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable_Lineas_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidadvariable_lineas_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTVALLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALLIN", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), ".", "")));
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
      if ( cmbavCcttpoctr.getItemCount() > 0 )
      {
         AV37CCTTpoCtr = cmbavCcttpoctr.getValidValue(AV37CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTTpoCtr", AV37CCTTpoCtr);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37CCTTpoCtr, ""))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCcttpoctr.setValue( GXutil.rtrim( AV37CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Values", cmbavCcttpoctr.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf26T2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV51Pgmname = "ControlCalidadHTD.ControlCalidadVariable_Lineas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      edtavCctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlin_Enabled), 5, 0), true);
      edtavCctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindsc_Enabled), 5, 0), true);
      cmbavCcttpoctr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCcttpoctr.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26T2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(80) ;
      /* Execute user event: Refresh */
      e1726T2 ();
      nGXsfl_80_idx = 1 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_802( ) ;
      bGXsfl_80_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_802( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin) ,
                                              Byte.valueOf(AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to) ,
                                              AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel ,
                                              AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc ,
                                              AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel ,
                                              AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval ,
                                              Byte.valueOf(A4049CCTValLin) ,
                                              A4050CCTValDsc ,
                                              A4051CCTVal ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV28EmprCod ,
                                              Integer.valueOf(AV26CCTCod) ,
                                              Short.valueOf(AV27CCTLin) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4031CCTCod) ,
                                              Short.valueOf(A4034CCTLin) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT
                                              }
         });
         lV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc), 30, "%") ;
         lV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval), 40, "%") ;
         /* Using cursor H026T2 */
         pr_default.execute(0, new Object[] {AV28EmprCod, Integer.valueOf(AV26CCTCod), Short.valueOf(AV27CCTLin), Byte.valueOf(AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin), Byte.valueOf(AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to), lV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc, AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel, lV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval, AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_80_idx = 1 ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4037CCTTpoCtr = H026T2_A4037CCTTpoCtr[0] ;
            A396EmprCod = H026T2_A396EmprCod[0] ;
            A4031CCTCod = H026T2_A4031CCTCod[0] ;
            A4034CCTLin = H026T2_A4034CCTLin[0] ;
            A4051CCTVal = H026T2_A4051CCTVal[0] ;
            A4050CCTValDsc = H026T2_A4050CCTValDsc[0] ;
            A4049CCTValLin = H026T2_A4049CCTValLin[0] ;
            A4037CCTTpoCtr = H026T2_A4037CCTTpoCtr[0] ;
            e1826T2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(80) ;
         wb26T0( ) ;
      }
      bGXsfl_80_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26T2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTVALLIN"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTLINTPOING", GXutil.rtrim( AV38CCTLinTpoIng));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINTPOING", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CCTLinTpoIng, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGVAL", AV39CCTMsgVal);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39CCTMsgVal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGCOD", AV47CCTMsgCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47CCTMsgCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGDSC", AV48CCTMsgDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CCTMsgDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGLIN", AV44CCTMsgLin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGLIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CCTMsgLin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGMIN", AV45CCTMsgMin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45CCTMsgMin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTMSGMAX", AV46CCTMsgMax);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMAX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46CCTMsgMax, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin) ,
                                           Byte.valueOf(AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to) ,
                                           AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel ,
                                           AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV28EmprCod ,
                                           Integer.valueOf(AV26CCTCod) ,
                                           Short.valueOf(AV27CCTLin) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Short.valueOf(A4034CCTLin) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT
                                           }
      });
      lV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc), 30, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval), 40, "%") ;
      /* Using cursor H026T3 */
      pr_default.execute(1, new Object[] {AV28EmprCod, Integer.valueOf(AV26CCTCod), Short.valueOf(AV27CCTLin), Byte.valueOf(AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin), Byte.valueOf(AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to), lV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc, AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel, lV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval, AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel});
      GRID_nRecordCount = H026T3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV26CCTCod, AV27CCTLin, AV15TFCCTValLin, AV16TFCCTValLin_To, AV17TFCCTValDsc, AV18TFCCTValDsc_Sel, AV19TFCCTVal, AV20TFCCTVal_Sel, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38CCTLinTpoIng, AV39CCTMsgVal, AV47CCTMsgCod, AV48CCTMsgDsc, AV44CCTMsgLin, AV45CCTMsgMin, AV46CCTMsgMax, A396EmprCod, A4031CCTCod, A4034CCTLin, AV37CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV26CCTCod, AV27CCTLin, AV15TFCCTValLin, AV16TFCCTValLin_To, AV17TFCCTValDsc, AV18TFCCTValDsc_Sel, AV19TFCCTVal, AV20TFCCTVal_Sel, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38CCTLinTpoIng, AV39CCTMsgVal, AV47CCTMsgCod, AV48CCTMsgDsc, AV44CCTMsgLin, AV45CCTMsgMin, AV46CCTMsgMax, A396EmprCod, A4031CCTCod, A4034CCTLin, AV37CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV26CCTCod, AV27CCTLin, AV15TFCCTValLin, AV16TFCCTValLin_To, AV17TFCCTValDsc, AV18TFCCTValDsc_Sel, AV19TFCCTVal, AV20TFCCTVal_Sel, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38CCTLinTpoIng, AV39CCTMsgVal, AV47CCTMsgCod, AV48CCTMsgDsc, AV44CCTMsgLin, AV45CCTMsgMin, AV46CCTMsgMax, A396EmprCod, A4031CCTCod, A4034CCTLin, AV37CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV26CCTCod, AV27CCTLin, AV15TFCCTValLin, AV16TFCCTValLin_To, AV17TFCCTValDsc, AV18TFCCTValDsc_Sel, AV19TFCCTVal, AV20TFCCTVal_Sel, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38CCTLinTpoIng, AV39CCTMsgVal, AV47CCTMsgCod, AV48CCTMsgDsc, AV44CCTMsgLin, AV45CCTMsgMin, AV46CCTMsgMax, A396EmprCod, A4031CCTCod, A4034CCTLin, AV37CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV26CCTCod, AV27CCTLin, AV15TFCCTValLin, AV16TFCCTValLin_To, AV17TFCCTValDsc, AV18TFCCTValDsc_Sel, AV19TFCCTVal, AV20TFCCTVal_Sel, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38CCTLinTpoIng, AV39CCTMsgVal, AV47CCTMsgCod, AV48CCTMsgDsc, AV44CCTMsgLin, AV45CCTMsgMin, AV46CCTMsgMax, A396EmprCod, A4031CCTCod, A4034CCTLin, AV37CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV51Pgmname = "ControlCalidadHTD.ControlCalidadVariable_Lineas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      edtavCctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlin_Enabled), 5, 0), true);
      edtavCctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlindsc_Enabled), 5, 0), true);
      cmbavCcttpoctr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCcttpoctr.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26T0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1626T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV21DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV23GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV24GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV46CCTMsgMax = httpContext.cgiGet( "vCCTMSGMAX") ;
         AV45CCTMsgMin = httpContext.cgiGet( "vCCTMSGMIN") ;
         AV38CCTLinTpoIng = httpContext.cgiGet( "vCCTLINTPOING") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctvallin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctvallin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTVALLIN");
            GX_FocusControl = edtavCctvallin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29CCTValLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTValLin), 2, 0));
         }
         else
         {
            AV29CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCctvallin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTValLin), 2, 0));
         }
         AV30CCTValDsc = httpContext.cgiGet( edtavCctvaldsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30CCTValDsc", AV30CCTValDsc);
         AV31CCTVal = httpContext.cgiGet( edtavCctval_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CCTVal", AV31CCTVal);
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadVariable_Lineas_WP");
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\controlcalidadvariable_lineas_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1626T2 ();
      if (returnInSub) return;
   }

   public void e1626T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV28EmprCod ;
      GXv_char3[0] = AV33EmprNom ;
      GXv_char4[0] = AV34UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.AV28EmprCod = GXv_char2[0] ;
      controlcalidadvariable_lineas_wp_impl.this.AV33EmprNom = GXv_char3[0] ;
      controlcalidadvariable_lineas_wp_impl.this.AV34UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Control Calidad Variable (lineas)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV21DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV21DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      if ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         AV29CCTValLin = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTValLin), 2, 0));
      }
      if ( ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtavCctvallin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctvallin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctvallin_Enabled), 5, 0), true);
         edtavCctval_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctval_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(AV38CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) || ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtavCctvaldsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctvaldsc_Enabled), 5, 0), true);
      }
      GXt_char1 = AV40CCLPicInf ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICINF", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV40CCLPicInf = GXt_char1 ;
      GXt_char1 = AV41CCLPicSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41CCLPicSup = GXt_char1 ;
      GXt_char1 = AV42CCLArrInf ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICINF", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV42CCLArrInf = GXt_char1 ;
      GXt_char1 = AV43CCLArrSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43CCLArrSup = GXt_char1 ;
      GXt_char1 = AV44CCTMsgLin ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGLIN", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV44CCTMsgLin = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CCTMsgLin", AV44CCTMsgLin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGLIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CCTMsgLin, ""))));
      GXt_char1 = AV39CCTMsgVal ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGVAL", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39CCTMsgVal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39CCTMsgVal", AV39CCTMsgVal);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGVAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39CCTMsgVal, ""))));
      GXt_char1 = AV45CCTMsgMin ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV45CCTMsgMin = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45CCTMsgMin", AV45CCTMsgMin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45CCTMsgMin, ""))));
      GXt_char1 = AV46CCTMsgMax ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT397_", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46CCTMsgMax = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46CCTMsgMax", AV46CCTMsgMax);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGMAX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46CCTMsgMax, ""))));
      GXt_char1 = AV47CCTMsgCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGCOD", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV47CCTMsgCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47CCTMsgCod", AV47CCTMsgCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47CCTMsgCod, ""))));
      GXt_char1 = AV48CCTMsgDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCTMSGDSC", ""), (byte)(99), GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48CCTMsgDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48CCTMsgDsc", AV48CCTMsgDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTMSGDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV48CCTMsgDsc, ""))));
   }

   public void e1726T2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV23GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridCurrentPage), 10, 0));
      AV24GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridPageCount), 10, 0));
      AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin = AV15TFCCTValLin ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to = AV16TFCCTValLin_To ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = AV17TFCCTValDsc ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = AV18TFCCTValDsc_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = AV19TFCCTVal ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = AV20TFCCTVal_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1126T2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV22PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV22PageToGo) ;
      }
   }

   public void e1226T2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1326T2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTValLin") == 0 )
         {
            AV15TFCCTValLin = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFCCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFCCTValLin), 2, 0));
            AV16TFCCTValLin_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFCCTValLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFCCTValLin_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTValDsc") == 0 )
         {
            AV17TFCCTValDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFCCTValDsc", AV17TFCCTValDsc);
            AV18TFCCTValDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFCCTValDsc_Sel", AV18TFCCTValDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTVal") == 0 )
         {
            AV19TFCCTVal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFCCTVal", AV19TFCCTVal);
            AV20TFCCTVal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFCCTVal_Sel", AV20TFCCTVal_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1826T2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(80) ;
      }
      sendrow_802( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_80_Refreshing )
      {
         httpContext.doAjaxLoad(80, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV25GridActions, 4, 0)) );
   }

   public void e1926T2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV25GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV25GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S162 ();
         if (returnInSub) return;
      }
      AV25GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV25GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e1426T2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV38CCTLinTpoIng, httpContext.getMessage( "R", "")) == 0 ) && ( ( AV29CCTValLin < 1 ) || ( AV29CCTValLin > 2 ) ) )
      {
         httpContext.GX_msglist.addItem(AV39CCTMsgVal);
      }
      else
      {
         if ( (0==AV29CCTValLin) && ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) )
         {
            httpContext.GX_msglist.addItem(AV47CCTMsgCod);
         }
         else
         {
            if ( (GXutil.strcmp("", AV30CCTValDsc)==0) && ( GXutil.strcmp(AV37CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) && ( GXutil.strcmp(AV38CCTLinTpoIng, httpContext.getMessage( "L", "")) == 0 ) && ( AV29CCTValLin > 0 ) )
            {
               httpContext.GX_msglist.addItem(AV48CCTMsgDsc);
            }
            else
            {
               if ( (0==AV29CCTValLin) && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) )
               {
                  httpContext.GX_msglist.addItem(AV44CCTMsgLin);
               }
               else
               {
                  new app.controlcalidadhtd.controlcalidadvariables_lineas_prc(remoteHandle, context).execute( AV28EmprCod, AV26CCTCod, AV27CCTLin, AV29CCTValLin, AV30CCTValDsc, AV31CCTVal) ;
                  AV29CCTValLin = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29CCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTValLin), 2, 0));
                  AV30CCTValDsc = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV30CCTValDsc", AV30CCTValDsc);
                  AV31CCTVal = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31CCTVal", AV31CCTVal);
                  httpContext.doAjaxRefresh();
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1526T2( )
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

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A4034CCTLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4049CCTValLin,2,0))}, new String[] {"Mode","EmprCod","CCTCod","CCTLin","CCTValLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidadvariable_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A4034CCTLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4049CCTValLin,2,0))}, new String[] {"Mode","EmprCod","CCTCod","CCTLin","CCTValLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV51Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV51Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV51Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALLIN") == 0 )
         {
            AV15TFCCTValLin = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFCCTValLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFCCTValLin), 2, 0));
            AV16TFCCTValLin_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFCCTValLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFCCTValLin_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC") == 0 )
         {
            AV17TFCCTValDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFCCTValDsc", AV17TFCCTValDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC_SEL") == 0 )
         {
            AV18TFCCTValDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFCCTValDsc_Sel", AV18TFCCTValDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL") == 0 )
         {
            AV19TFCCTVal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFCCTVal", AV19TFCCTVal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL_SEL") == 0 )
         {
            AV20TFCCTVal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFCCTVal_Sel", AV20TFCCTVal_Sel);
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFCCTValDsc_Sel)==0), AV18TFCCTValDsc_Sel, GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFCCTVal_Sel)==0), AV20TFCCTVal_Sel, GXv_char3) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char8 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char8 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char8 = "" ;
      GXv_char4[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFCCTValDsc)==0), AV17TFCCTValDsc, GXv_char4) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char8 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFCCTVal)==0), AV19TFCCTVal, GXv_char3) ;
      controlcalidadvariable_lineas_wp_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFCCTValLin) ? "" : GXutil.str( AV15TFCCTValLin, 2, 0))+"|"+GXt_char8+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFCCTValLin_To) ? "" : GXutil.str( AV16TFCCTValLin_To, 2, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV51Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState9[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFCCTVALLIN", "", !((0==AV15TFCCTValLin)&&(0==AV16TFCCTValLin_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFCCTValLin, 2, 0)), GXutil.trim( GXutil.str( AV16TFCCTValLin_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFCCTVALDSC", "", !(GXutil.strcmp("", AV17TFCCTValDsc)==0), (short)(0), AV17TFCCTValDsc, "", !(GXutil.strcmp("", AV18TFCCTValDsc_Sel)==0), AV18TFCCTValDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFCCTVAL", "", !(GXutil.strcmp("", AV19TFCCTVal)==0), (short)(0), AV19TFCCTVal, "", !(GXutil.strcmp("", AV20TFCCTVal_Sel)==0), AV20TFCCTVal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState9[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV51Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV51Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ControlCalidadHTD.ControlCalidadVariable_lineas" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_69_26T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_69_26T2e( true) ;
      }
      else
      {
         wb_table1_69_26T2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      AV26CCTCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CCTCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26CCTCod), "ZZZZZ9")));
      AV35CCTDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35CCTDsc", AV35CCTDsc);
      AV27CCTLin = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CCTLin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27CCTLin), "ZZZ9")));
      AV36CCTLinDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinDsc", AV36CCTLinDsc);
      AV37CCTTpoCtr = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37CCTTpoCtr", AV37CCTTpoCtr);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37CCTTpoCtr, ""))));
      AV38CCTLinTpoIng = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38CCTLinTpoIng", AV38CCTLinTpoIng);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTLINTPOING", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38CCTLinTpoIng, ""))));
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
      pa26T2( ) ;
      ws26T2( ) ;
      we26T2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145376", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidadvariable_lineas_wp.js", "?202682116145376", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_802( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_80_idx );
      edtCCTValLin_Internalname = "CCTVALLIN_"+sGXsfl_80_idx ;
      edtCCTValDsc_Internalname = "CCTVALDSC_"+sGXsfl_80_idx ;
      edtCCTVal_Internalname = "CCTVAL_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_802( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_80_fel_idx );
      edtCCTValLin_Internalname = "CCTVALLIN_"+sGXsfl_80_fel_idx ;
      edtCCTValDsc_Internalname = "CCTVALDSC_"+sGXsfl_80_fel_idx ;
      edtCCTVal_Internalname = "CCTVAL_"+sGXsfl_80_fel_idx ;
   }

   public void sendrow_802( )
   {
      subsflControlProps_802( ) ;
      wb26T0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_80_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_80_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_80_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV25GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV25GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV25GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_80_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV25GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_80_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValDsc_Internalname,GXutil.rtrim( A4050CCTValDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTVal_Internalname,GXutil.rtrim( A4051CCTVal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26T2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_80_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      /* End function sendrow_802 */
   }

   public void startgridcontrol80( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"80\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4050CCTValDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4051CCTVal));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavCctcod_Internalname = "vCCTCOD" ;
      edtavCctdsc_Internalname = "vCCTDSC" ;
      edtavCctlin_Internalname = "vCCTLIN" ;
      edtavCctlindsc_Internalname = "vCCTLINDSC" ;
      cmbavCcttpoctr.setInternalname( "vCCTTPOCTR" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavCctvallin_Internalname = "vCCTVALLIN" ;
      edtavCctvaldsc_Internalname = "vCCTVALDSC" ;
      edtavCctval_Internalname = "vCCTVAL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtCCTValLin_Internalname = "CCTVALLIN" ;
      edtCCTValDsc_Internalname = "CCTVALDSC" ;
      edtCCTVal_Internalname = "CCTVAL" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtCCTVal_Jsonclick = "" ;
      edtCCTValDsc_Jsonclick = "" ;
      edtCCTValLin_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavCctval_Jsonclick = "" ;
      edtavCctval_Enabled = 1 ;
      edtavCctvaldsc_Jsonclick = "" ;
      edtavCctvaldsc_Enabled = 1 ;
      edtavCctvallin_Jsonclick = "" ;
      edtavCctvallin_Enabled = 1 ;
      cmbavCcttpoctr.setJsonclick( "" );
      cmbavCcttpoctr.setEnabled( 0 );
      edtavCctlindsc_Jsonclick = "" ;
      edtavCctlindsc_Enabled = 0 ;
      edtavCctlin_Jsonclick = "" ;
      edtavCctlin_Enabled = 0 ;
      edtavCctdsc_Jsonclick = "" ;
      edtavCctdsc_Enabled = 0 ;
      edtavCctcod_Jsonclick = "" ;
      edtavCctcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "ControlCalidadHTD.ControlCalidadVariable_Lineas_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T" ;
      Ddo_grid_Filterisrange = "T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4" ;
      Ddo_grid_Columnids = "1:CCTValLin|2:CCTValDsc|3:CCTVal" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( " Control Calidad Variable (lineas)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavCcttpoctr.setName( "vCCTTPOCTR" );
      cmbavCcttpoctr.setWebtags( "" );
      cmbavCcttpoctr.addItem("E", httpContext.getMessage( "ISO (Externo)", ""), (short)(0));
      cmbavCcttpoctr.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbavCcttpoctr.addItem("D", httpContext.getMessage( "Defectos", ""), (short)(0));
      if ( cmbavCcttpoctr.getItemCount() > 0 )
      {
         AV37CCTTpoCtr = cmbavCcttpoctr.getValidValue(AV37CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTTpoCtr", AV37CCTTpoCtr);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37CCTTpoCtr, ""))));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_80_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV25GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV25GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38CCTLinTpoIng',fld:'vCCTLINTPOING',pic:'',hsh:true},{av:'AV39CCTMsgVal',fld:'vCCTMSGVAL',pic:'',hsh:true},{av:'AV47CCTMsgCod',fld:'vCCTMSGCOD',pic:'',hsh:true},{av:'AV48CCTMsgDsc',fld:'vCCTMSGDSC',pic:'',hsh:true},{av:'AV44CCTMsgLin',fld:'vCCTMSGLIN',pic:'',hsh:true},{av:'AV45CCTMsgMin',fld:'vCCTMSGMIN',pic:'',hsh:true},{av:'AV46CCTMsgMax',fld:'vCCTMSGMAX',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV37CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV24GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1126T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38CCTLinTpoIng',fld:'vCCTLINTPOING',pic:'',hsh:true},{av:'AV39CCTMsgVal',fld:'vCCTMSGVAL',pic:'',hsh:true},{av:'AV47CCTMsgCod',fld:'vCCTMSGCOD',pic:'',hsh:true},{av:'AV48CCTMsgDsc',fld:'vCCTMSGDSC',pic:'',hsh:true},{av:'AV44CCTMsgLin',fld:'vCCTMSGLIN',pic:'',hsh:true},{av:'AV45CCTMsgMin',fld:'vCCTMSGMIN',pic:'',hsh:true},{av:'AV46CCTMsgMax',fld:'vCCTMSGMAX',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV37CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1226T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38CCTLinTpoIng',fld:'vCCTLINTPOING',pic:'',hsh:true},{av:'AV39CCTMsgVal',fld:'vCCTMSGVAL',pic:'',hsh:true},{av:'AV47CCTMsgCod',fld:'vCCTMSGCOD',pic:'',hsh:true},{av:'AV48CCTMsgDsc',fld:'vCCTMSGDSC',pic:'',hsh:true},{av:'AV44CCTMsgLin',fld:'vCCTMSGLIN',pic:'',hsh:true},{av:'AV45CCTMsgMin',fld:'vCCTMSGMIN',pic:'',hsh:true},{av:'AV46CCTMsgMax',fld:'vCCTMSGMAX',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV37CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1326T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38CCTLinTpoIng',fld:'vCCTLINTPOING',pic:'',hsh:true},{av:'AV39CCTMsgVal',fld:'vCCTMSGVAL',pic:'',hsh:true},{av:'AV47CCTMsgCod',fld:'vCCTMSGCOD',pic:'',hsh:true},{av:'AV48CCTMsgDsc',fld:'vCCTMSGDSC',pic:'',hsh:true},{av:'AV44CCTMsgLin',fld:'vCCTMSGLIN',pic:'',hsh:true},{av:'AV45CCTMsgMin',fld:'vCCTMSGMIN',pic:'',hsh:true},{av:'AV46CCTMsgMax',fld:'vCCTMSGMAX',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV37CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1826T2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV25GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e1926T2',iparms:[{av:'cmbavGridactions'},{av:'AV25GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38CCTLinTpoIng',fld:'vCCTLINTPOING',pic:'',hsh:true},{av:'AV39CCTMsgVal',fld:'vCCTMSGVAL',pic:'',hsh:true},{av:'AV47CCTMsgCod',fld:'vCCTMSGCOD',pic:'',hsh:true},{av:'AV48CCTMsgDsc',fld:'vCCTMSGDSC',pic:'',hsh:true},{av:'AV44CCTMsgLin',fld:'vCCTMSGLIN',pic:'',hsh:true},{av:'AV45CCTMsgMin',fld:'vCCTMSGMIN',pic:'',hsh:true},{av:'AV46CCTMsgMax',fld:'vCCTMSGMAX',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV37CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV25GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV23GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV24GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1426T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV27CCTLin',fld:'vCCTLIN',pic:'ZZZ9',hsh:true},{av:'AV15TFCCTValLin',fld:'vTFCCTVALLIN',pic:'Z9'},{av:'AV16TFCCTValLin_To',fld:'vTFCCTVALLIN_TO',pic:'Z9'},{av:'AV17TFCCTValDsc',fld:'vTFCCTVALDSC',pic:''},{av:'AV18TFCCTValDsc_Sel',fld:'vTFCCTVALDSC_SEL',pic:''},{av:'AV19TFCCTVal',fld:'vTFCCTVAL',pic:''},{av:'AV20TFCCTVal_Sel',fld:'vTFCCTVAL_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38CCTLinTpoIng',fld:'vCCTLINTPOING',pic:'',hsh:true},{av:'AV39CCTMsgVal',fld:'vCCTMSGVAL',pic:'',hsh:true},{av:'AV47CCTMsgCod',fld:'vCCTMSGCOD',pic:'',hsh:true},{av:'AV48CCTMsgDsc',fld:'vCCTMSGDSC',pic:'',hsh:true},{av:'AV44CCTMsgLin',fld:'vCCTMSGLIN',pic:'',hsh:true},{av:'AV45CCTMsgMin',fld:'vCCTMSGMIN',pic:'',hsh:true},{av:'AV46CCTMsgMax',fld:'vCCTMSGMAX',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV37CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'AV29CCTValLin',fld:'vCCTVALLIN',pic:'Z9'},{av:'AV30CCTValDsc',fld:'vCCTVALDSC',pic:''},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'AV31CCTVal',fld:'vCCTVAL',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV29CCTValLin',fld:'vCCTVALLIN',pic:'Z9'},{av:'AV30CCTValDsc',fld:'vCCTVALDSC',pic:''},{av:'AV31CCTVal',fld:'vCCTVAL',pic:''},{av:'AV23GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV24GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1526T2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_CCTCOD","{handler:'validv_Cctcod',iparms:[]");
      setEventMetadata("VALIDV_CCTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_CCTLIN","{handler:'validv_Cctlin',iparms:[]");
      setEventMetadata("VALIDV_CCTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cctval',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      wcpOAV28EmprCod = "" ;
      wcpOAV35CCTDsc = "" ;
      wcpOAV36CCTLinDsc = "" ;
      wcpOAV37CCTTpoCtr = "" ;
      wcpOAV38CCTLinTpoIng = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV28EmprCod = "" ;
      AV35CCTDsc = "" ;
      AV36CCTLinDsc = "" ;
      AV37CCTTpoCtr = "" ;
      AV38CCTLinTpoIng = "" ;
      AV17TFCCTValDsc = "" ;
      AV18TFCCTValDsc_Sel = "" ;
      AV19TFCCTVal = "" ;
      AV20TFCCTVal_Sel = "" ;
      AV51Pgmname = "" ;
      AV39CCTMsgVal = "" ;
      AV47CCTMsgCod = "" ;
      AV48CCTMsgDsc = "" ;
      AV44CCTMsgLin = "" ;
      AV45CCTMsgMin = "" ;
      AV46CCTMsgMax = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4037CCTTpoCtr = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV30CCTValDsc = "" ;
      AV31CCTVal = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      scmdbuf = "" ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = "" ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = "" ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel = "" ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc = "" ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel = "" ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval = "" ;
      H026T2_A4037CCTTpoCtr = new String[] {""} ;
      H026T2_A396EmprCod = new String[] {""} ;
      H026T2_A4031CCTCod = new int[1] ;
      H026T2_A4034CCTLin = new short[1] ;
      H026T2_A4051CCTVal = new String[] {""} ;
      H026T2_A4050CCTValDsc = new String[] {""} ;
      H026T2_A4049CCTValLin = new byte[1] ;
      H026T3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV32Station = "" ;
      GXv_char2 = new String[1] ;
      AV33EmprNom = "" ;
      AV34UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV40CCLPicInf = "" ;
      AV41CCLPicSup = "" ;
      AV42CCLArrInf = "" ;
      AV43CCLArrSup = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char8 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState9 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineas_wp__default(),
         new Object[] {
             new Object[] {
            H026T2_A4037CCTTpoCtr, H026T2_A396EmprCod, H026T2_A4031CCTCod, H026T2_A4034CCTLin, H026T2_A4051CCTVal, H026T2_A4050CCTValDsc, H026T2_A4049CCTValLin
            }
            , new Object[] {
            H026T3_AGRID_nRecordCount
            }
         }
      );
      AV51Pgmname = "ControlCalidadHTD.ControlCalidadVariable_Lineas_WP" ;
      /* GeneXus formulas. */
      AV51Pgmname = "ControlCalidadHTD.ControlCalidadVariable_Lineas_WP" ;
      Gx_err = (short)(0) ;
      edtavCctcod_Enabled = 0 ;
      edtavCctdsc_Enabled = 0 ;
      edtavCctlin_Enabled = 0 ;
      edtavCctlindsc_Enabled = 0 ;
      cmbavCcttpoctr.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV15TFCCTValLin ;
   private byte AV16TFCCTValLin_To ;
   private byte gxajaxcallmode ;
   private byte AV29CCTValLin ;
   private byte A4049CCTValLin ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin ;
   private byte AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV27CCTLin ;
   private short AV27CCTLin ;
   private short AV12OrderedBy ;
   private short A4034CCTLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV25GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV26CCTCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_80 ;
   private int AV26CCTCod ;
   private int nGXsfl_80_idx=1 ;
   private int A4031CCTCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavCctcod_Enabled ;
   private int edtavCctdsc_Enabled ;
   private int edtavCctlin_Enabled ;
   private int edtavCctlindsc_Enabled ;
   private int edtavCctvallin_Enabled ;
   private int edtavCctvaldsc_Enabled ;
   private int edtavCctval_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV22PageToGo ;
   private int AV58GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV23GridCurrentPage ;
   private long AV24GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV28EmprCod ;
   private String wcpOAV35CCTDsc ;
   private String wcpOAV36CCTLinDsc ;
   private String wcpOAV37CCTTpoCtr ;
   private String wcpOAV38CCTLinTpoIng ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV28EmprCod ;
   private String AV35CCTDsc ;
   private String AV36CCTLinDsc ;
   private String AV37CCTTpoCtr ;
   private String AV38CCTLinTpoIng ;
   private String sGXsfl_80_idx="0001" ;
   private String AV17TFCCTValDsc ;
   private String AV18TFCCTValDsc_Sel ;
   private String AV19TFCCTVal ;
   private String AV20TFCCTVal_Sel ;
   private String AV51Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A4037CCTTpoCtr ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCctcod_Internalname ;
   private String edtavCctcod_Jsonclick ;
   private String edtavCctdsc_Internalname ;
   private String edtavCctdsc_Jsonclick ;
   private String edtavCctlin_Internalname ;
   private String edtavCctlin_Jsonclick ;
   private String edtavCctlindsc_Internalname ;
   private String edtavCctlindsc_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavCctvallin_Internalname ;
   private String TempTags ;
   private String edtavCctvallin_Jsonclick ;
   private String edtavCctvaldsc_Internalname ;
   private String AV30CCTValDsc ;
   private String edtavCctvaldsc_Jsonclick ;
   private String edtavCctval_Internalname ;
   private String AV31CCTVal ;
   private String edtavCctval_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCCTValLin_Internalname ;
   private String A4050CCTValDsc ;
   private String edtCCTValDsc_Internalname ;
   private String A4051CCTVal ;
   private String edtCCTVal_Internalname ;
   private String scmdbuf ;
   private String lV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc ;
   private String lV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval ;
   private String AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel ;
   private String AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc ;
   private String AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel ;
   private String AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval ;
   private String hsh ;
   private String AV32Station ;
   private String GXv_char2[] ;
   private String AV33EmprNom ;
   private String AV34UsurCod ;
   private String GXt_char8 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCCTValLin_Jsonclick ;
   private String edtCCTValDsc_Jsonclick ;
   private String edtCCTVal_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV39CCTMsgVal ;
   private String AV47CCTMsgCod ;
   private String AV48CCTMsgDsc ;
   private String AV44CCTMsgLin ;
   private String AV45CCTMsgMin ;
   private String AV46CCTMsgMax ;
   private String AV40CCLPicInf ;
   private String AV41CCLPicSup ;
   private String AV42CCLArrInf ;
   private String AV43CCLArrSup ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavCcttpoctr ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H026T2_A4037CCTTpoCtr ;
   private String[] H026T2_A396EmprCod ;
   private int[] H026T2_A4031CCTCod ;
   private short[] H026T2_A4034CCTLin ;
   private String[] H026T2_A4051CCTVal ;
   private String[] H026T2_A4050CCTValDsc ;
   private byte[] H026T2_A4049CCTValLin ;
   private long[] H026T3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState9[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV21DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class controlcalidadvariable_lineas_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin ,
                                          byte AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to ,
                                          String AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel ,
                                          String AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV28EmprCod ,
                                          int AV26CCTCod ,
                                          short AV27CCTLin ,
                                          String A396EmprCod ,
                                          int A4031CCTCod ,
                                          short A4034CCTLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[14];
      Object[] GXv_Object11 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.CCTTpoCtr, T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.CCTVal, T1.CCTValDsc, T1.CCTValLin" ;
      sFromString = " FROM (TXPCCDef2 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.CCTValLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCTValLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCTValLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCTValDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCTValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCTVal" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCTVal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.CCTValLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H026T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin ,
                                          byte AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to ,
                                          String AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel ,
                                          String AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV28EmprCod ,
                                          int AV26CCTCod ,
                                          short AV27CCTLin ,
                                          String A396EmprCod ,
                                          int A4031CCTCod ,
                                          short A4034CCTLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[9];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCCDef2 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidadvariable_lineas_wpds_1_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidadvariable_lineas_wpds_2_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidadvariable_lineas_wpds_3_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineas_wpds_4_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineas_wpds_5_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineas_wpds_6_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H026T2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() );
            case 1 :
                  return conditional_H026T3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 40);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 40);
               }
               return;
      }
   }

}

