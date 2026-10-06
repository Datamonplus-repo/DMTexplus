package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_wp_impl extends GXDataArea
{
   public controlcalidad_ccdef1_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_ccdef1_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_wp_impl.class ));
   }

   public controlcalidad_ccdef1_wp_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCcttpoctr = new HTMLChoice();
      cmbavCctlintpoing = new HTMLChoice();
      cmbavCctlintpodat = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbCCTLinTpoI = new HTMLChoice();
      cmbCCTLinTpoD = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            AV35emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35emprcod", AV35emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV33CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33CCTCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33CCTCod), "ZZZZZ9")));
               AV34CCTDsc = httpContext.GetPar( "CCTDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34CCTDsc", AV34CCTDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34CCTDsc, ""))));
               AV49CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49CCTTpoCtr", AV49CCTTpoCtr);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49CCTTpoCtr, ""))));
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
      nRC_GXsfl_124 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_124"))) ;
      nGXsfl_124_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_124_idx"))) ;
      sGXsfl_124_idx = httpContext.GetPar( "sGXsfl_124_idx") ;
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
      AV35emprcod = httpContext.GetPar( "emprcod") ;
      AV33CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV15TFCCTLin = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin"))) ;
      AV16TFCCTLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV54TFCCTLinTpoIng_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV56TFCCTLinTpoDat_Sels);
      AV17TFCCTLinDsc = httpContext.GetPar( "TFCCTLinDsc") ;
      AV18TFCCTLinDsc_Sel = httpContext.GetPar( "TFCCTLinDsc_Sel") ;
      AV19TFCCTLinDc2 = httpContext.GetPar( "TFCCTLinDc2") ;
      AV20TFCCTLinDc2_Sel = httpContext.GetPar( "TFCCTLinDc2_Sel") ;
      AV21TFCCVNorma = httpContext.GetPar( "TFCCVNorma") ;
      AV22TFCCVNorma_Sel = httpContext.GetPar( "TFCCVNorma_Sel") ;
      AV23TFCCVEspe2 = httpContext.GetPar( "TFCCVEspe2") ;
      AV24TFCCVEspe2_Sel = httpContext.GetPar( "TFCCVEspe2_Sel") ;
      AV25TFCCTLinLgoDat = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLinLgoDat"))) ;
      AV26TFCCTLinLgoDat_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLinLgoDat_To"))) ;
      AV27TFCCTLinPict = httpContext.GetPar( "TFCCTLinPict") ;
      AV28TFCCTLinPict_Sel = httpContext.GetPar( "TFCCTLinPict_Sel") ;
      AV63Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV34CCTDsc = httpContext.GetPar( "CCTDsc") ;
      cmbavCcttpoctr.fromJSonString( httpContext.GetNextPar( ));
      AV49CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV35emprcod, AV33CCTCod, AV15TFCCTLin, AV16TFCCTLin_To, AV54TFCCTLinTpoIng_Sels, AV56TFCCTLinTpoDat_Sels, AV17TFCCTLinDsc, AV18TFCCTLinDsc_Sel, AV19TFCCTLinDc2, AV20TFCCTLinDc2_Sel, AV21TFCCVNorma, AV22TFCCVNorma_Sel, AV23TFCCVEspe2, AV24TFCCVEspe2_Sel, AV25TFCCTLinLgoDat, AV26TFCCTLinLgoDat_To, AV27TFCCTLinPict, AV28TFCCTLinPict_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A4031CCTCod, AV34CCTDsc, AV49CCTTpoCtr) ;
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
      pa2C22( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2C22( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_ccdef1_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV33CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34CCTDsc)),GXutil.URLEncode(GXutil.rtrim(AV49CCTTpoCtr))}, new String[] {"emprcod","CCTCod","CCTDsc","CCTTpoCtr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34CCTDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49CCTTpoCtr, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCDEF1_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccdef1_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_124", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_124, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV31GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV32GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLIN", GXutil.ltrim( localUtil.ntoc( AV15TFCCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLIN_TO", GXutil.ltrim( localUtil.ntoc( AV16TFCCTLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFCCTLINTPOING_SELS", AV54TFCCTLinTpoIng_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFCCTLINTPOING_SELS", AV54TFCCTLinTpoIng_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFCCTLINTPODAT_SELS", AV56TFCCTLinTpoDat_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFCCTLINTPODAT_SELS", AV56TFCCTLinTpoDat_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDSC", GXutil.rtrim( AV17TFCCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDSC_SEL", GXutil.rtrim( AV18TFCCTLinDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDC2", GXutil.rtrim( AV19TFCCTLinDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDC2_SEL", GXutil.rtrim( AV20TFCCTLinDc2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCVNORMA", GXutil.rtrim( AV21TFCCVNorma));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCVNORMA_SEL", GXutil.rtrim( AV22TFCCVNorma_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCVESPE2", AV23TFCCVEspe2);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCVESPE2_SEL", AV24TFCCVEspe2_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINLGODAT", GXutil.ltrim( localUtil.ntoc( AV25TFCCTLinLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINLGODAT_TO", GXutil.ltrim( localUtil.ntoc( AV26TFCCTLinLgoDat_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINPICT", GXutil.rtrim( AV27TFCCTLinPict));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINPICT_SEL", GXutil.rtrim( AV28TFCCTLinPict_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_CCTLINPICT_Iteminternalname", GXutil.rtrim( Popover_cctlinpict_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_CCTLINPICT_Trigger", GXutil.rtrim( Popover_cctlinpict_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_CCTLINPICT_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_cctlinpict_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_CCTLINPICT_Position", GXutil.rtrim( Popover_cctlinpict_Position));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
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
         we2C22( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2C22( ) ;
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
      return formatLink("app.controlcalidadhtd.controlcalidad_ccdef1_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV33CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34CCTDsc)),GXutil.URLEncode(GXutil.rtrim(AV49CCTTpoCtr))}, new String[] {"emprcod","CCTCod","CCTDsc","CCTTpoCtr"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CCDEF1_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Control Calidad_CCDEF1 (lineas)", "") ;
   }

   public void wb2C20( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctcod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV33CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctcod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctdsc_Internalname, GXutil.rtrim( AV34CCTDsc), GXutil.rtrim( localUtil.format( AV34CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCcttpoctr.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCcttpoctr.getInternalname(), httpContext.getMessage( "Tipo de Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCcttpoctr, cmbavCcttpoctr.getInternalname(), GXutil.rtrim( AV49CCTTpoCtr), 1, cmbavCcttpoctr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavCcttpoctr.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         cmbavCcttpoctr.setValue( GXutil.rtrim( AV49CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Values", cmbavCcttpoctr.ToJavascriptSource(), true);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV42CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42CCTLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlindsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlindsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlindsc_Internalname, GXutil.rtrim( AV43CCTLinDsc), GXutil.rtrim( localUtil.format( AV43CCTLinDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlindsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlindsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlindc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlindc2_Internalname, httpContext.getMessage( "Descripcion (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlindc2_Internalname, GXutil.rtrim( AV44CCTLinDc2), GXutil.rtrim( localUtil.format( AV44CCTLinDc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlindc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctlindc2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcvnorma_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcvnorma_Internalname, httpContext.getMessage( "Norma", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcvnorma_Internalname, GXutil.rtrim( AV39CCVNorma), GXutil.rtrim( localUtil.format( AV39CCVNorma, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcvnorma_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcvnorma_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavCctlinvarwrd_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlinvarwrd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlinvarwrd_Internalname, httpContext.getMessage( "Variable(Word)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlinvarwrd_Internalname, GXutil.rtrim( AV40CCTLinVarWrd), GXutil.rtrim( localUtil.format( AV40CCTLinVarWrd, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlinvarwrd_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavCctlinvarwrd_Visible, edtavCctlinvarwrd_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcvespe2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcvespe2_Internalname, httpContext.getMessage( "Especificacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavCcvespe2_Internalname, AV41CCVEspe2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", (short)(0), 1, edtavCcvespe2_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCctlintpoing.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCctlintpoing.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCctlintpoing, cmbavCctlintpoing.getInternalname(), GXutil.rtrim( AV51CCTLinTpoIng), 1, cmbavCctlintpoing.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavCctlintpoing.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         cmbavCctlintpoing.setValue( GXutil.rtrim( AV51CCTLinTpoIng) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpoing.getInternalname(), "Values", cmbavCctlintpoing.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCctlintpodat.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCctlintpodat.getInternalname(), httpContext.getMessage( "Dato", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCctlintpodat, cmbavCctlintpodat.getInternalname(), GXutil.rtrim( AV52CCTLinTpoDat), 1, cmbavCctlintpodat.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavCctlintpodat.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         cmbavCctlintpodat.setValue( GXutil.rtrim( AV52CCTLinTpoDat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpodat.getInternalname(), "Values", cmbavCctlintpodat.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavCctlinlgodat_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctlinlgodat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlinlgodat_Internalname, httpContext.getMessage( "Largo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlinlgodat_Internalname, GXutil.ltrim( localUtil.ntoc( AV36CCTLinLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlinlgodat_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavCctlinlgodat_Visible, edtavCctlinlgodat_Enabled, 1, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcctlinpict_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcctlinpict_Internalname, httpContext.getMessage( "Picture", ""), "", "", lblTextblockcctlinpict_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_87_2C22( true) ;
      }
      else
      {
         wb_table1_87_2C22( false) ;
      }
      return  ;
   }

   public void wb_table1_87_2C22e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavCctsta_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctsta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctsta_Internalname, httpContext.getMessage( "Standar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctsta_Internalname, GXutil.rtrim( AV38CCTSta), GXutil.rtrim( localUtil.format( AV38CCTSta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctsta_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavCctsta_Visible, edtavCctsta_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTxtmensaje_Internalname, lblTxtmensaje_Caption, "", "", lblTxtmensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
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
         startgridcontrol124( ) ;
      }
      if ( wbEnd == 124 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_124 = (int)(nGXsfl_124_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV31GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV32GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV63Pgmname), GXutil.rtrim( localUtil.format( AV63Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
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
         ucPopover_cctlinpict.setProperty("Trigger", Popover_cctlinpict_Trigger);
         ucPopover_cctlinpict.setProperty("PopoverWidth", Popover_cctlinpict_Popoverwidth);
         ucPopover_cctlinpict.setProperty("Position", Popover_cctlinpict_Position);
         ucPopover_cctlinpict.render(context, "dvelop.wwppopover", Popover_cctlinpict_Internalname, "POPOVER_CCTLINPICTContainer");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_151_2C22( true) ;
      }
      else
      {
         wb_table2_151_2C22( false) ;
      }
      return  ;
   }

   public void wb_table2_151_2C22e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_156_2C22( true) ;
      }
      else
      {
         wb_table3_156_2C22( false) ;
      }
      return  ;
   }

   public void wb_table3_156_2C22e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0164"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0164"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_124_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0164"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 124 )
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

   public void start2C22( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Control Calidad_CCDEF1 (lineas)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2C20( ) ;
   }

   public void ws2C22( )
   {
      start2C22( ) ;
      evt2C22( ) ;
   }

   public void evt2C22( )
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
                           e112C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152C22 ();
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
                                 e162C22 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarVariables' */
                           e172C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e182C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCTLIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCTLINPICT.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202C22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCTLINLGODAT.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212C22 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CCTLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CCTLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_124_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1242( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV48GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbCCTLinTpoI.setName( cmbCCTLinTpoI.getInternalname() );
                           cmbCCTLinTpoI.setValue( httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) );
                           A4048CCTLinTpoI = httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) ;
                           cmbCCTLinTpoD.setName( cmbCCTLinTpoD.getInternalname() );
                           cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
                           A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
                           A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
                           A14344CCTLinDc2 = httpContext.cgiGet( edtCCTLinDc2_Internalname) ;
                           A13249CCVNorma = httpContext.cgiGet( edtCCVNorma_Internalname) ;
                           A14345CCVEspe2 = httpContext.cgiGet( edtCCVEspe2_Internalname) ;
                           A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e222C22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e232C22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242C22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252C22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "CCTLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e262C22 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 164 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0164") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0164", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2C22( )
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

   public void pa2C22( )
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
            GX_FocusControl = edtavCctlin_Internalname ;
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
      subsflControlProps_1242( ) ;
      while ( nGXsfl_124_idx <= nRC_GXsfl_124 )
      {
         sendrow_1242( ) ;
         nGXsfl_124_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV35emprcod ,
                                 int AV33CCTCod ,
                                 short AV15TFCCTLin ,
                                 short AV16TFCCTLin_To ,
                                 GXSimpleCollection<String> AV54TFCCTLinTpoIng_Sels ,
                                 GXSimpleCollection<String> AV56TFCCTLinTpoDat_Sels ,
                                 String AV17TFCCTLinDsc ,
                                 String AV18TFCCTLinDsc_Sel ,
                                 String AV19TFCCTLinDc2 ,
                                 String AV20TFCCTLinDc2_Sel ,
                                 String AV21TFCCVNorma ,
                                 String AV22TFCCVNorma_Sel ,
                                 String AV23TFCCVEspe2 ,
                                 String AV24TFCCVEspe2_Sel ,
                                 short AV25TFCCTLinLgoDat ,
                                 short AV26TFCCTLinLgoDat_To ,
                                 String AV27TFCCTLinPict ,
                                 String AV28TFCCTLinPict_Sel ,
                                 String AV63Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int A4031CCTCod ,
                                 String AV34CCTDsc ,
                                 String AV49CCTTpoCtr )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232C22 ();
      GRID_nCurrentRecord = 0 ;
      rf2C22( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCDEF1_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccdef1_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4043CCTLinDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC", GXutil.rtrim( A4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINTPOI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4048CCTLinTpoI, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOI", GXutil.rtrim( A4048CCTLinTpoI));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINTPOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4044CCTLinTpoD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOD", GXutil.rtrim( A4044CCTLinTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINLGOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINLGOD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINPICT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4046CCTLinPict, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINPICT", GXutil.rtrim( A4046CCTLinPict));
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
         AV49CCTTpoCtr = cmbavCcttpoctr.getValidValue(AV49CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49CCTTpoCtr", AV49CCTTpoCtr);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49CCTTpoCtr, ""))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCcttpoctr.setValue( GXutil.rtrim( AV49CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Values", cmbavCcttpoctr.ToJavascriptSource(), true);
      }
      if ( cmbavCctlintpoing.getItemCount() > 0 )
      {
         AV51CCTLinTpoIng = cmbavCctlintpoing.getValidValue(AV51CCTLinTpoIng) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCctlintpoing.setValue( GXutil.rtrim( AV51CCTLinTpoIng) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpoing.getInternalname(), "Values", cmbavCctlintpoing.ToJavascriptSource(), true);
      }
      if ( cmbavCctlintpodat.getItemCount() > 0 )
      {
         AV52CCTLinTpoDat = cmbavCctlintpodat.getValidValue(AV52CCTLinTpoDat) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCctlintpodat.setValue( GXutil.rtrim( AV52CCTLinTpoDat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpodat.getInternalname(), "Values", cmbavCctlintpodat.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2C22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV63Pgmname = "ControlCalidadHTD.ControlCalidad_CCDEF1_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      cmbavCcttpoctr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCcttpoctr.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2C22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(124) ;
      /* Execute user event: Refresh */
      e232C22 ();
      nGXsfl_124_idx = 1 ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1242( ) ;
      bGXsfl_124_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1242( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A4048CCTLinTpoI ,
                                              AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                              A4044CCTLinTpoD ,
                                              AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                              Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                              Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                              Integer.valueOf(AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                              Integer.valueOf(AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                              AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                              AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                              AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                              AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                              AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                              AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                              AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                              AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                              Short.valueOf(AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                              Short.valueOf(AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                              AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                              AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                              Short.valueOf(A4034CCTLin) ,
                                              A4043CCTLinDsc ,
                                              A14344CCTLinDc2 ,
                                              A13249CCVNorma ,
                                              A14345CCVEspe2 ,
                                              Short.valueOf(A4045CCTLinLgoD) ,
                                              A4046CCTLinPict ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV35emprcod ,
                                              Integer.valueOf(AV33CCTCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4031CCTCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT
                                              }
         });
         lV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
         lV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
         lV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
         lV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
         lV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
         /* Using cursor H02C22 */
         pr_default.execute(0, new Object[] {AV35emprcod, Integer.valueOf(AV33CCTCod), Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_124_idx = 1 ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4031CCTCod = H02C22_A4031CCTCod[0] ;
            A4046CCTLinPict = H02C22_A4046CCTLinPict[0] ;
            A4045CCTLinLgoD = H02C22_A4045CCTLinLgoD[0] ;
            A14345CCVEspe2 = H02C22_A14345CCVEspe2[0] ;
            A13249CCVNorma = H02C22_A13249CCVNorma[0] ;
            A14344CCTLinDc2 = H02C22_A14344CCTLinDc2[0] ;
            A4043CCTLinDsc = H02C22_A4043CCTLinDsc[0] ;
            A4044CCTLinTpoD = H02C22_A4044CCTLinTpoD[0] ;
            A4048CCTLinTpoI = H02C22_A4048CCTLinTpoI[0] ;
            A4034CCTLin = H02C22_A4034CCTLin[0] ;
            A396EmprCod = H02C22_A396EmprCod[0] ;
            e242C22 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(124) ;
         wb2C20( ) ;
      }
      bGXsfl_124_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2C22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLIN"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINDSC"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4043CCTLinDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINTPOI"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4048CCTLinTpoI, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINTPOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4044CCTLinTpoD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINLGOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCTLINPICT"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4046CCTLinPict, ""))));
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
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A4048CCTLinTpoI ,
                                           AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                           A4044CCTLinTpoD ,
                                           AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                           Integer.valueOf(AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                           Integer.valueOf(AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                           AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                           AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                           AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                           AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                           AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                           AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                           Short.valueOf(AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                           Short.valueOf(AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                           AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13249CCVNorma ,
                                           A14345CCVEspe2 ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV35emprcod ,
                                           Integer.valueOf(AV33CCTCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4031CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
      lV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
      lV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
      lV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
      /* Using cursor H02C23 */
      pr_default.execute(1, new Object[] {AV35emprcod, Integer.valueOf(AV33CCTCod), Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel});
      GRID_nRecordCount = H02C23_AGRID_nRecordCount[0] ;
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
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV35emprcod, AV33CCTCod, AV15TFCCTLin, AV16TFCCTLin_To, AV54TFCCTLinTpoIng_Sels, AV56TFCCTLinTpoDat_Sels, AV17TFCCTLinDsc, AV18TFCCTLinDsc_Sel, AV19TFCCTLinDc2, AV20TFCCTLinDc2_Sel, AV21TFCCVNorma, AV22TFCCVNorma_Sel, AV23TFCCVEspe2, AV24TFCCVEspe2_Sel, AV25TFCCTLinLgoDat, AV26TFCCTLinLgoDat_To, AV27TFCCTLinPict, AV28TFCCTLinPict_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A4031CCTCod, AV34CCTDsc, AV49CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35emprcod, AV33CCTCod, AV15TFCCTLin, AV16TFCCTLin_To, AV54TFCCTLinTpoIng_Sels, AV56TFCCTLinTpoDat_Sels, AV17TFCCTLinDsc, AV18TFCCTLinDsc_Sel, AV19TFCCTLinDc2, AV20TFCCTLinDc2_Sel, AV21TFCCVNorma, AV22TFCCVNorma_Sel, AV23TFCCVEspe2, AV24TFCCVEspe2_Sel, AV25TFCCTLinLgoDat, AV26TFCCTLinLgoDat_To, AV27TFCCTLinPict, AV28TFCCTLinPict_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A4031CCTCod, AV34CCTDsc, AV49CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35emprcod, AV33CCTCod, AV15TFCCTLin, AV16TFCCTLin_To, AV54TFCCTLinTpoIng_Sels, AV56TFCCTLinTpoDat_Sels, AV17TFCCTLinDsc, AV18TFCCTLinDsc_Sel, AV19TFCCTLinDc2, AV20TFCCTLinDc2_Sel, AV21TFCCVNorma, AV22TFCCVNorma_Sel, AV23TFCCVEspe2, AV24TFCCVEspe2_Sel, AV25TFCCTLinLgoDat, AV26TFCCTLinLgoDat_To, AV27TFCCTLinPict, AV28TFCCTLinPict_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A4031CCTCod, AV34CCTDsc, AV49CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35emprcod, AV33CCTCod, AV15TFCCTLin, AV16TFCCTLin_To, AV54TFCCTLinTpoIng_Sels, AV56TFCCTLinTpoDat_Sels, AV17TFCCTLinDsc, AV18TFCCTLinDsc_Sel, AV19TFCCTLinDc2, AV20TFCCTLinDc2_Sel, AV21TFCCVNorma, AV22TFCCVNorma_Sel, AV23TFCCVEspe2, AV24TFCCVEspe2_Sel, AV25TFCCTLinLgoDat, AV26TFCCTLinLgoDat_To, AV27TFCCTLinPict, AV28TFCCTLinPict_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A4031CCTCod, AV34CCTDsc, AV49CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35emprcod, AV33CCTCod, AV15TFCCTLin, AV16TFCCTLin_To, AV54TFCCTLinTpoIng_Sels, AV56TFCCTLinTpoDat_Sels, AV17TFCCTLinDsc, AV18TFCCTLinDsc_Sel, AV19TFCCTLinDc2, AV20TFCCTLinDc2_Sel, AV21TFCCVNorma, AV22TFCCVNorma_Sel, AV23TFCCVEspe2, AV24TFCCVEspe2_Sel, AV25TFCCTLinLgoDat, AV26TFCCTLinLgoDat_To, AV27TFCCTLinPict, AV28TFCCTLinPict_Sel, AV63Pgmname, AV12OrderedBy, AV13OrderedDsc, A4031CCTCod, AV34CCTDsc, AV49CCTTpoCtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV63Pgmname = "ControlCalidadHTD.ControlCalidad_CCDEF1_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_err = (short)(0) ;
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      cmbavCcttpoctr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCcttpoctr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCcttpoctr.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2C20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222C22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV29DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV32GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Popover_cctlinpict_Iteminternalname = httpContext.cgiGet( "POPOVER_CCTLINPICT_Iteminternalname") ;
         Popover_cctlinpict_Trigger = httpContext.cgiGet( "POPOVER_CCTLINPICT_Trigger") ;
         Popover_cctlinpict_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_CCTLINPICT_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_cctlinpict_Position = httpContext.cgiGet( "POPOVER_CCTLINPICT_Position") ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTLIN");
            GX_FocusControl = edtavCctlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42CCTLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
         }
         else
         {
            AV42CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
         }
         AV43CCTLinDsc = httpContext.cgiGet( edtavCctlindsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43CCTLinDsc", AV43CCTLinDsc);
         AV44CCTLinDc2 = httpContext.cgiGet( edtavCctlindc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44CCTLinDc2", AV44CCTLinDc2);
         AV39CCVNorma = httpContext.cgiGet( edtavCcvnorma_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39CCVNorma", AV39CCVNorma);
         AV40CCTLinVarWrd = GXutil.upper( httpContext.cgiGet( edtavCctlinvarwrd_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40CCTLinVarWrd", AV40CCTLinVarWrd);
         AV41CCVEspe2 = httpContext.cgiGet( edtavCcvespe2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41CCVEspe2", AV41CCVEspe2);
         cmbavCctlintpoing.setName( cmbavCctlintpoing.getInternalname() );
         cmbavCctlintpoing.setValue( httpContext.cgiGet( cmbavCctlintpoing.getInternalname()) );
         AV51CCTLinTpoIng = httpContext.cgiGet( cmbavCctlintpoing.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
         cmbavCctlintpodat.setName( cmbavCctlintpodat.getInternalname() );
         cmbavCctlintpodat.setValue( httpContext.cgiGet( cmbavCctlintpodat.getInternalname()) );
         AV52CCTLinTpoDat = httpContext.cgiGet( cmbavCctlintpodat.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlinlgodat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlinlgodat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTLINLGODAT");
            GX_FocusControl = edtavCctlinlgodat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36CCTLinLgoDat = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         }
         else
         {
            AV36CCTLinLgoDat = (short)(localUtil.ctol( httpContext.cgiGet( edtavCctlinlgodat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         }
         AV37CCTLinPict = httpContext.cgiGet( edtavCctlinpict_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
         AV38CCTSta = httpContext.cgiGet( edtavCctsta_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38CCTSta", AV38CCTSta);
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCDEF1_WP");
         AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV63Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\controlcalidad_ccdef1_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e222C22 ();
      if (returnInSub) return;
   }

   public void e222C22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV47Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47Station = GXt_char1 ;
      GXv_char2[0] = AV35emprcod ;
      GXv_char3[0] = AV45EmprNom ;
      GXv_char4[0] = AV46UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_ccdef1_wp_impl.this.AV35emprcod = GXv_char2[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV45EmprNom = GXv_char3[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV46UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35emprcod", AV35emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35emprcod, "@!"))));
      Popover_cctlinpict_Iteminternalname = edtavCctlinpict_Internalname ;
      ucPopover_cctlinpict.sendProperty(context, "", false, Popover_cctlinpict_Internalname, "ItemInternalName", Popover_cctlinpict_Iteminternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Control Calidad_CCDEF1 (lineas)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV29DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV29DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV42CCTLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_next(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, GXv_int8) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42CCTLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
      edtavCctlinvarwrd_Visible = ((GXutil.strcmp(AV49CCTTpoCtr, "I")==0)||(GXutil.strcmp(AV49CCTTpoCtr, "D")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlinvarwrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinvarwrd_Visible), 5, 0), true);
      edtavCctlinpict_Visible = ((GXutil.strcmp(AV49CCTTpoCtr, "I")==0)||(GXutil.strcmp(AV49CCTTpoCtr, "D")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlinpict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinpict_Visible), 5, 0), true);
      edtavCctlinlgodat_Visible = ((GXutil.strcmp(AV49CCTTpoCtr, "I")==0)||(GXutil.strcmp(AV49CCTTpoCtr, "D")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlinlgodat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinlgodat_Visible), 5, 0), true);
      edtavCctsta_Visible = ((GXutil.strcmp(AV49CCTTpoCtr, "D")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctsta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctsta_Visible), 5, 0), true);
   }

   public void e232C22( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV31GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridCurrentPage), 10, 0));
      AV32GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridPageCount), 10, 0));
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV15TFCCTLin ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV16TFCCTLin_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV54TFCCTLinTpoIng_Sels ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV56TFCCTLinTpoDat_Sels ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV17TFCCTLinDsc ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV18TFCCTLinDsc_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV19TFCCTLinDc2 ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV20TFCCTLinDc2_Sel ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV21TFCCVNorma ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV22TFCCVNorma_Sel ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV23TFCCVEspe2 ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV24TFCCVEspe2_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV25TFCCTLinLgoDat ;
      AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV26TFCCTLinLgoDat_To ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV27TFCCTLinPict ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV28TFCCTLinPict_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112C22( )
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
         AV30PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV30PageToGo) ;
      }
   }

   public void e122C22( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132C22( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLin") == 0 )
         {
            AV15TFCCTLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFCCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFCCTLin), 4, 0));
            AV16TFCCTLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFCCTLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFCCTLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinTpoIng") == 0 )
         {
            AV53TFCCTLinTpoIng_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCTLinTpoIng_SelsJson", AV53TFCCTLinTpoIng_SelsJson);
            AV54TFCCTLinTpoIng_Sels.fromJSonString(AV53TFCCTLinTpoIng_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinTpoDat") == 0 )
         {
            AV55TFCCTLinTpoDat_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCTLinTpoDat_SelsJson", AV55TFCCTLinTpoDat_SelsJson);
            AV56TFCCTLinTpoDat_Sels.fromJSonString(AV55TFCCTLinTpoDat_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinDsc") == 0 )
         {
            AV17TFCCTLinDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFCCTLinDsc", AV17TFCCTLinDsc);
            AV18TFCCTLinDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFCCTLinDsc_Sel", AV18TFCCTLinDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinDc2") == 0 )
         {
            AV19TFCCTLinDc2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFCCTLinDc2", AV19TFCCTLinDc2);
            AV20TFCCTLinDc2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFCCTLinDc2_Sel", AV20TFCCTLinDc2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCVNorma") == 0 )
         {
            AV21TFCCVNorma = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFCCVNorma", AV21TFCCVNorma);
            AV22TFCCVNorma_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFCCVNorma_Sel", AV22TFCCVNorma_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCVEspe2") == 0 )
         {
            AV23TFCCVEspe2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFCCVEspe2", AV23TFCCVEspe2);
            AV24TFCCVEspe2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFCCVEspe2_Sel", AV24TFCCVEspe2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinLgoDat") == 0 )
         {
            AV25TFCCTLinLgoDat = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFCCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFCCTLinLgoDat), 3, 0));
            AV26TFCCTLinLgoDat_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFCCTLinLgoDat_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCCTLinLgoDat_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinPict") == 0 )
         {
            AV27TFCCTLinPict = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFCCTLinPict", AV27TFCCTLinPict);
            AV28TFCCTLinPict_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCCTLinPict_Sel", AV28TFCCTLinPict_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFCCTLinTpoDat_Sels", AV56TFCCTLinTpoDat_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54TFCCTLinTpoIng_Sels", AV54TFCCTLinTpoIng_Sels);
   }

   private void e242C22( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Mas datos", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(124) ;
      }
      sendrow_1242( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_124_Refreshing )
      {
         httpContext.doAjaxLoad(124, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
   }

   public void e252C22( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV48GridActions == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 2 )
      {
         /* Execute user subroutine: 'DO MASDATOS' */
         S162 ();
         if (returnInSub) return;
      }
      AV48GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142C22( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e162C22 ();
      if (returnInSub) return;
   }

   public void e162C22( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      AV57pasocontrol = (short)(0) ;
      AV60mensaje = "" ;
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "D") == 0 ) || ( GXutil.strcmp(AV49CCTTpoCtr, "I") == 0 ) )
      {
         AV57pasocontrol = (short)(1) ;
      }
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "E") == 0 ) && (0==AV36CCTLinLgoDat) )
      {
         AV60mensaje = httpContext.getMessage( "NO ha introducido valor en Largo¡", "") ;
      }
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "E") == 0 ) && (GXutil.strcmp("", AV37CCTLinPict)==0) )
      {
         AV60mensaje = httpContext.getMessage( "NO ha introducido valor en Picture¡", "") ;
      }
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "E") == 0 ) && ! (0==AV36CCTLinLgoDat) )
      {
         GXt_char1 = AV50Mask ;
         GXv_char4[0] = AV37CCTLinPict ;
         GXv_int10[0] = AV36CCTLinLgoDat ;
         GXv_char3[0] = GXt_char1 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         controlcalidad_ccdef1_wp_impl.this.AV37CCTLinPict = GXv_char4[0] ;
         controlcalidad_ccdef1_wp_impl.this.AV36CCTLinLgoDat = (short)((short)(GXv_int10[0])) ;
         controlcalidad_ccdef1_wp_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
         httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         AV50Mask = GXt_char1 ;
         if ( GXutil.strcmp(AV50Mask, httpContext.getMessage( "ERROR", "")) != 0 )
         {
            AV57pasocontrol = (short)(1) ;
         }
         else
         {
            AV60mensaje = httpContext.getMessage( "Error,la longitud del valor introducido en Picture ", "") + GXutil.rtrim( localUtil.format( AV37CCTLinPict, "")) + httpContext.getMessage( ", es diferente, a la longitud del campo Largo", "") + localUtil.format( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), "ZZ9") ;
         }
      }
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "E") == 0 ) && ! (GXutil.strcmp("", AV37CCTLinPict)==0) )
      {
         GXt_char1 = AV50Mask ;
         GXv_char4[0] = AV37CCTLinPict ;
         GXv_int10[0] = AV36CCTLinLgoDat ;
         GXv_char3[0] = GXt_char1 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         controlcalidad_ccdef1_wp_impl.this.AV37CCTLinPict = GXv_char4[0] ;
         controlcalidad_ccdef1_wp_impl.this.AV36CCTLinLgoDat = (short)((short)(GXv_int10[0])) ;
         controlcalidad_ccdef1_wp_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
         httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         AV50Mask = GXt_char1 ;
         if ( GXutil.strcmp(AV50Mask, httpContext.getMessage( "ERROR", "")) != 0 )
         {
            AV57pasocontrol = (short)(1) ;
         }
         else
         {
            AV60mensaje = httpContext.getMessage( "Error,la longitud del valor introducido en Picture ", "") + GXutil.rtrim( localUtil.format( AV37CCTLinPict, "")) + httpContext.getMessage( ", es diferente, a la longitud del campo Largo", "") + localUtil.format( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), "ZZ9") ;
         }
      }
      if ( AV57pasocontrol == 1 )
      {
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
      }
      else
      {
         if ( (0==AV36CCTLinLgoDat) )
         {
            GX_FocusControl = edtavCctlinlgodat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (GXutil.strcmp("", AV37CCTLinPict)==0) )
            {
               GX_FocusControl = edtavCctlinpict_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
         }
         lblTxtmensaje_Caption = AV60mensaje ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      }
      /*  Sending Event outputs  */
   }

   public void e152C22( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e172C22( )
   {
      /* 'DoLimpiarVariables' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LIMPIAR' */
      S192 ();
      if (returnInSub) return;
      GXt_int7 = AV42CCTLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_next(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, GXv_int8) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42CCTLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e182C22( )
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
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      GXv_objcol_SdtMessages_Message11[0] = AV58messages ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_control(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, A4034CCTLin, GXv_objcol_SdtMessages_Message11) ;
      AV58messages = GXv_objcol_SdtMessages_Message11[0] ;
      if ( AV58messages.size() > 0 )
      {
         AV80GXV1 = 1 ;
         while ( AV80GXV1 <= AV58messages.size() )
         {
            AV59Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV58messages.elementAt(-1+AV80GXV1));
            lblTxtmensaje_Caption = AV59Message.getgxTv_SdtMessages_Message_Description() ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
            AV80GXV1 = (int)(AV80GXV1+1) ;
         }
      }
      else
      {
         AV81Emprcod_selected = A396EmprCod ;
         AV82Cctcod_selected = A4031CCTCod ;
         AV83Cctlin_selected = A4034CCTLin ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_del(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, A4034CCTLin) ;
      GXt_int7 = AV42CCTLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_next(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, GXv_int8) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42CCTLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'DO MASDATOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_ccdef2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV33CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34CCTDsc)),GXutil.URLEncode(GXutil.rtrim(AV49CCTTpoCtr)),GXutil.URLEncode(GXutil.ltrimstr(A4034CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A4043CCTLinDsc)),GXutil.URLEncode(GXutil.rtrim(A4048CCTLinTpoI)),GXutil.URLEncode(GXutil.rtrim(A4044CCTLinTpoD)),GXutil.URLEncode(GXutil.ltrimstr(A4045CCTLinLgoD,3,0)),GXutil.URLEncode(GXutil.rtrim(A4046CCTLinPict))}, new String[] {"emprcod","CCTCod","CCTDsc","CCTTpoCtr","CCTLin","CCTLinDsc","CCTLinTpoIng","CCTLinTpoDat","CCTLinLgoDat","CCTLinPict"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_insupd(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, AV42CCTLin, AV43CCTLinDsc, AV44CCTLinDc2, AV39CCVNorma, AV40CCTLinVarWrd, AV41CCVEspe2, AV36CCTLinLgoDat, AV37CCTLinPict, AV38CCTSta, AV51CCTLinTpoIng, AV52CCTLinTpoDat) ;
      if ( GXutil.strcmp(AV49CCTTpoCtr, "D") != 0 )
      {
         if ( GXutil.strcmp(AV49CCTTpoCtr, "I") == 0 )
         {
            new app.controlcalidadhtd.pccintval(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, AV42CCTLin) ;
         }
         httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_ccdef2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV33CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV34CCTDsc)),GXutil.URLEncode(GXutil.rtrim(AV49CCTTpoCtr)),GXutil.URLEncode(GXutil.ltrimstr(AV42CCTLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV43CCTLinDsc)),GXutil.URLEncode(GXutil.rtrim(AV51CCTLinTpoIng)),GXutil.URLEncode(GXutil.rtrim(AV52CCTLinTpoDat)),GXutil.URLEncode(GXutil.ltrimstr(AV36CCTLinLgoDat,3,0)),GXutil.URLEncode(GXutil.rtrim(AV37CCTLinPict))}, new String[] {"emprcod","CCTCod","CCTDsc","CCTTpoCtr","CCTLin","CCTLinDsc","CCTLinTpoIng","CCTLinTpoDat","CCTLinLgoDat","CCTLinPict"}) , new Object[] {});
      }
      if ( GXutil.strcmp(AV51CCTLinTpoIng, "R") == 0 )
      {
         new app.controlcalidadhtd.controlcalidad_ccdef1_rango(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, AV42CCTLin) ;
      }
      /* Execute user subroutine: 'LIMPIAR' */
      S192 ();
      if (returnInSub) return;
      GXt_int7 = AV42CCTLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_next(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, GXv_int8) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42CCTLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
      GX_FocusControl = edtavCctlin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV63Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV63Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV63Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV15TFCCTLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFCCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFCCTLin), 4, 0));
            AV16TFCCTLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFCCTLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFCCTLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINTPOING_SEL") == 0 )
         {
            AV53TFCCTLinTpoIng_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCTLinTpoIng_SelsJson", AV53TFCCTLinTpoIng_SelsJson);
            AV54TFCCTLinTpoIng_Sels.fromJSonString(AV53TFCCTLinTpoIng_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINTPODAT_SEL") == 0 )
         {
            AV55TFCCTLinTpoDat_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCTLinTpoDat_SelsJson", AV55TFCCTLinTpoDat_SelsJson);
            AV56TFCCTLinTpoDat_Sels.fromJSonString(AV55TFCCTLinTpoDat_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV17TFCCTLinDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFCCTLinDsc", AV17TFCCTLinDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV18TFCCTLinDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFCCTLinDsc_Sel", AV18TFCCTLinDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDC2") == 0 )
         {
            AV19TFCCTLinDc2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFCCTLinDc2", AV19TFCCTLinDc2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDC2_SEL") == 0 )
         {
            AV20TFCCTLinDc2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFCCTLinDc2_Sel", AV20TFCCTLinDc2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVNORMA") == 0 )
         {
            AV21TFCCVNorma = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFCCVNorma", AV21TFCCVNorma);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVNORMA_SEL") == 0 )
         {
            AV22TFCCVNorma_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFCCVNorma_Sel", AV22TFCCVNorma_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVESPE2") == 0 )
         {
            AV23TFCCVEspe2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFCCVEspe2", AV23TFCCVEspe2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVESPE2_SEL") == 0 )
         {
            AV24TFCCVEspe2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFCCVEspe2_Sel", AV24TFCCVEspe2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINLGODAT") == 0 )
         {
            AV25TFCCTLinLgoDat = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFCCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFCCTLinLgoDat), 3, 0));
            AV26TFCCTLinLgoDat_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFCCTLinLgoDat_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFCCTLinLgoDat_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINPICT") == 0 )
         {
            AV27TFCCTLinPict = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFCCTLinPict", AV27TFCCTLinPict);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINPICT_SEL") == 0 )
         {
            AV28TFCCTLinPict_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCCTLinPict_Sel", AV28TFCCTLinPict_Sel);
         }
         AV84GXV2 = (int)(AV84GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV54TFCCTLinTpoIng_Sels.size()==0), AV53TFCCTLinTpoIng_SelsJson, GXv_char4) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV56TFCCTLinTpoDat_Sels.size()==0), AV55TFCCTLinTpoDat_SelsJson, GXv_char3) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFCCTLinDsc_Sel)==0), AV18TFCCTLinDsc_Sel, GXv_char2) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFCCTLinDc2_Sel)==0), AV20TFCCTLinDc2_Sel, GXv_char15) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFCCVNorma_Sel)==0), AV22TFCCVNorma_Sel, GXv_char17) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFCCVEspe2_Sel)==0), AV24TFCCVEspe2_Sel, GXv_char19) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFCCTLinPict_Sel)==0), AV28TFCCTLinPict_Sel, GXv_char21) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFCCTLinDsc)==0), AV17TFCCTLinDsc, GXv_char21) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFCCTLinDc2)==0), AV19TFCCTLinDc2, GXv_char19) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFCCVNorma)==0), AV21TFCCVNorma, GXv_char17) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFCCVEspe2)==0), AV23TFCCVEspe2, GXv_char15) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFCCTLinPict)==0), AV27TFCCTLinPict, GXv_char4) ;
      controlcalidad_ccdef1_wp_impl.this.GXt_char13 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFCCTLin) ? "" : GXutil.str( AV15TFCCTLin, 4, 0))+"|||"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV25TFCCTLinLgoDat) ? "" : GXutil.str( AV25TFCCTLinLgoDat, 3, 0))+"|"+GXt_char13 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFCCTLin_To) ? "" : GXutil.str( AV16TFCCTLin_To, 4, 0))+"|||||||"+((0==AV26TFCCTLinLgoDat_To) ? "" : GXutil.str( AV26TFCCTLinLgoDat_To, 3, 0))+"|" ;
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
      AV10GridState.fromxml(AV14Session.getValue(AV63Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLIN", "", !((0==AV15TFCCTLin)&&(0==AV16TFCCTLin_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFCCTLin, 4, 0)), GXutil.trim( GXutil.str( AV16TFCCTLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLINTPOING_SEL", "", !(AV54TFCCTLinTpoIng_Sels.size()==0), (short)(0), AV54TFCCTLinTpoIng_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLINTPODAT_SEL", "", !(AV56TFCCTLinTpoDat_Sels.size()==0), (short)(0), AV56TFCCTLinTpoDat_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLINDSC", "", !(GXutil.strcmp("", AV17TFCCTLinDsc)==0), (short)(0), AV17TFCCTLinDsc, "", !(GXutil.strcmp("", AV18TFCCTLinDsc_Sel)==0), AV18TFCCTLinDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLINDC2", "", !(GXutil.strcmp("", AV19TFCCTLinDc2)==0), (short)(0), AV19TFCCTLinDc2, "", !(GXutil.strcmp("", AV20TFCCTLinDc2_Sel)==0), AV20TFCCTLinDc2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCVNORMA", "", !(GXutil.strcmp("", AV21TFCCVNorma)==0), (short)(0), AV21TFCCVNorma, "", !(GXutil.strcmp("", AV22TFCCVNorma_Sel)==0), AV22TFCCVNorma_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCVESPE2", "", !(GXutil.strcmp("", AV23TFCCVEspe2)==0), (short)(0), AV23TFCCVEspe2, "", !(GXutil.strcmp("", AV24TFCCVEspe2_Sel)==0), AV24TFCCVEspe2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLINLGODAT", "", !((0==AV25TFCCTLinLgoDat)&&(0==AV26TFCCTLinLgoDat_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFCCTLinLgoDat, 3, 0)), GXutil.trim( GXutil.str( AV26TFCCTLinLgoDat_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCCTLINPICT", "", !(GXutil.strcmp("", AV27TFCCTLinPict)==0), (short)(0), AV27TFCCTLinPict, "", !(GXutil.strcmp("", AV28TFCCTLinPict_Sel)==0), AV28TFCCTLinPict_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV63Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV63Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ControlCalidadHTD.ControlCalidad_CCDEF1" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e262C22( )
   {
      /* CCTLin_Click Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      GXv_char21[0] = AV43CCTLinDsc ;
      GXv_char19[0] = AV44CCTLinDc2 ;
      GXv_char17[0] = AV39CCVNorma ;
      GXv_char15[0] = AV40CCTLinVarWrd ;
      GXv_char4[0] = AV41CCVEspe2 ;
      GXv_int8[0] = AV36CCTLinLgoDat ;
      GXv_char3[0] = AV37CCTLinPict ;
      GXv_char2[0] = AV38CCTSta ;
      GXv_char23[0] = AV51CCTLinTpoIng ;
      GXv_char24[0] = AV52CCTLinTpoDat ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_datos(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, A4034CCTLin, GXv_char21, GXv_char19, GXv_char17, GXv_char15, GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char23, GXv_char24) ;
      controlcalidad_ccdef1_wp_impl.this.AV43CCTLinDsc = GXv_char21[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV44CCTLinDc2 = GXv_char19[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV39CCVNorma = GXv_char17[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV40CCTLinVarWrd = GXv_char15[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV41CCVEspe2 = GXv_char4[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV36CCTLinLgoDat = GXv_int8[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV37CCTLinPict = GXv_char3[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV38CCTSta = GXv_char2[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV51CCTLinTpoIng = GXv_char23[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV52CCTLinTpoDat = GXv_char24[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43CCTLinDsc", AV43CCTLinDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV44CCTLinDc2", AV44CCTLinDc2);
      httpContext.ajax_rsp_assign_attri("", false, "AV39CCVNorma", AV39CCVNorma);
      httpContext.ajax_rsp_assign_attri("", false, "AV40CCTLinVarWrd", AV40CCTLinVarWrd);
      httpContext.ajax_rsp_assign_attri("", false, "AV41CCVEspe2", AV41CCVEspe2);
      httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
      httpContext.ajax_rsp_assign_attri("", false, "AV38CCTSta", AV38CCTSta);
      httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
      httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
      AV42CCTLin = A4034CCTLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "I") == 0 ) || ( GXutil.strcmp(AV49CCTTpoCtr, "D") == 0 ) )
      {
         cmbavCctlintpoing.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpoing.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCctlintpoing.getEnabled(), 5, 0), true);
         cmbavCctlintpodat.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpodat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCctlintpodat.getEnabled(), 5, 0), true);
         edtavCctlinlgodat_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctlinlgodat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinlgodat_Enabled), 5, 0), true);
         edtavCctlinpict_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctlinpict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinpict_Enabled), 5, 0), true);
         AV51CCTLinTpoIng = "L" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
         AV52CCTLinTpoDat = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
         AV36CCTLinLgoDat = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         AV37CCTLinPict = "9" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavCctlintpodat.setValue( GXutil.rtrim( AV52CCTLinTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpodat.getInternalname(), "Values", cmbavCctlintpodat.ToJavascriptSource(), true);
      cmbavCctlintpoing.setValue( GXutil.rtrim( AV51CCTLinTpoIng) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpoing.getInternalname(), "Values", cmbavCctlintpoing.ToJavascriptSource(), true);
   }

   public void e192C22( )
   {
      /* Cctlin_Isvalid Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      GXv_char24[0] = AV43CCTLinDsc ;
      GXv_char23[0] = AV44CCTLinDc2 ;
      GXv_char21[0] = AV39CCVNorma ;
      GXv_char19[0] = AV40CCTLinVarWrd ;
      GXv_char17[0] = AV41CCVEspe2 ;
      GXv_int8[0] = AV36CCTLinLgoDat ;
      GXv_char15[0] = AV37CCTLinPict ;
      GXv_char4[0] = AV38CCTSta ;
      GXv_char3[0] = AV51CCTLinTpoIng ;
      GXv_char2[0] = AV52CCTLinTpoDat ;
      new app.controlcalidadhtd.controlcalidad_ccdef1_datos(remoteHandle, context).execute( AV35emprcod, AV33CCTCod, AV42CCTLin, GXv_char24, GXv_char23, GXv_char21, GXv_char19, GXv_char17, GXv_int8, GXv_char15, GXv_char4, GXv_char3, GXv_char2) ;
      controlcalidad_ccdef1_wp_impl.this.AV43CCTLinDsc = GXv_char24[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV44CCTLinDc2 = GXv_char23[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV39CCVNorma = GXv_char21[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV40CCTLinVarWrd = GXv_char19[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV41CCVEspe2 = GXv_char17[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV36CCTLinLgoDat = GXv_int8[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV37CCTLinPict = GXv_char15[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV38CCTSta = GXv_char4[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV51CCTLinTpoIng = GXv_char3[0] ;
      controlcalidad_ccdef1_wp_impl.this.AV52CCTLinTpoDat = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43CCTLinDsc", AV43CCTLinDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV44CCTLinDc2", AV44CCTLinDc2);
      httpContext.ajax_rsp_assign_attri("", false, "AV39CCVNorma", AV39CCVNorma);
      httpContext.ajax_rsp_assign_attri("", false, "AV40CCTLinVarWrd", AV40CCTLinVarWrd);
      httpContext.ajax_rsp_assign_attri("", false, "AV41CCVEspe2", AV41CCVEspe2);
      httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
      httpContext.ajax_rsp_assign_attri("", false, "AV38CCTSta", AV38CCTSta);
      httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
      httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
      if ( ( GXutil.strcmp(AV49CCTTpoCtr, "I") == 0 ) || ( GXutil.strcmp(AV49CCTTpoCtr, "D") == 0 ) )
      {
         cmbavCctlintpoing.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpoing.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCctlintpoing.getEnabled(), 5, 0), true);
         cmbavCctlintpodat.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpodat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCctlintpodat.getEnabled(), 5, 0), true);
         edtavCctlinlgodat_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctlinlgodat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinlgodat_Enabled), 5, 0), true);
         edtavCctlinpict_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCctlinpict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlinpict_Enabled), 5, 0), true);
         AV51CCTLinTpoIng = "L" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
         AV52CCTLinTpoDat = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
         AV36CCTLinLgoDat = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         AV37CCTLinPict = "9" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
      }
      /*  Sending Event outputs  */
      cmbavCctlintpodat.setValue( GXutil.rtrim( AV52CCTLinTpoDat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpodat.getInternalname(), "Values", cmbavCctlintpodat.ToJavascriptSource(), true);
      cmbavCctlintpoing.setValue( GXutil.rtrim( AV51CCTLinTpoIng) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCctlintpoing.getInternalname(), "Values", cmbavCctlintpoing.ToJavascriptSource(), true);
   }

   public void e202C22( )
   {
      /* Cctlinpict_Isvalid Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( ! (GXutil.strcmp("", AV37CCTLinPict)==0) )
      {
         GXt_char20 = AV50Mask ;
         GXv_char24[0] = AV37CCTLinPict ;
         GXv_int10[0] = AV36CCTLinLgoDat ;
         GXv_char23[0] = GXt_char20 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char24, GXv_int10, GXv_char23) ;
         controlcalidad_ccdef1_wp_impl.this.AV37CCTLinPict = GXv_char24[0] ;
         controlcalidad_ccdef1_wp_impl.this.AV36CCTLinLgoDat = (short)((short)(GXv_int10[0])) ;
         controlcalidad_ccdef1_wp_impl.this.GXt_char20 = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
         httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         AV50Mask = GXt_char20 ;
         if ( GXutil.strcmp(AV50Mask, httpContext.getMessage( "ERROR", "")) == 0 )
         {
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavCctlinpict_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV60mensaje = httpContext.getMessage( "Error,la longitud del valor introducido en Picture ", "") + GXutil.rtrim( localUtil.format( AV37CCTLinPict, "")) + httpContext.getMessage( ", es diferente, a la longitud del campo Largo", "") + localUtil.format( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), "ZZ9") ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e212C22( )
   {
      /* Cctlinlgodat_Isvalid Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( ! (0==AV36CCTLinLgoDat) && ! (GXutil.strcmp("", AV37CCTLinPict)==0) )
      {
         GXt_char20 = AV50Mask ;
         GXv_char24[0] = AV37CCTLinPict ;
         GXv_int10[0] = AV36CCTLinLgoDat ;
         GXv_char23[0] = GXt_char20 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char24, GXv_int10, GXv_char23) ;
         controlcalidad_ccdef1_wp_impl.this.AV37CCTLinPict = GXv_char24[0] ;
         controlcalidad_ccdef1_wp_impl.this.AV36CCTLinLgoDat = (short)((short)(GXv_int10[0])) ;
         controlcalidad_ccdef1_wp_impl.this.GXt_char20 = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
         httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
         AV50Mask = GXt_char20 ;
         if ( GXutil.strcmp(AV50Mask, httpContext.getMessage( "ERROR", "")) == 0 )
         {
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavCctlinlgodat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV60mensaje = httpContext.getMessage( "Error,la longitud del valor introducido en Picture ", "") + GXutil.rtrim( localUtil.format( AV37CCTLinPict, "")) + httpContext.getMessage( ", es diferente, a la longitud del campo Largo", "") + localUtil.format( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), "ZZ9") ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void S192( )
   {
      /* 'LIMPIAR' Routine */
      returnInSub = false ;
      AV42CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CCTLin), 4, 0));
      AV43CCTLinDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43CCTLinDsc", AV43CCTLinDsc);
      AV44CCTLinDc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CCTLinDc2", AV44CCTLinDc2);
      AV39CCVNorma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39CCVNorma", AV39CCVNorma);
      AV40CCTLinVarWrd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40CCTLinVarWrd", AV40CCTLinVarWrd);
      AV41CCVEspe2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41CCVEspe2", AV41CCVEspe2);
      AV36CCTLinLgoDat = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36CCTLinLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CCTLinLgoDat), 3, 0));
      AV37CCTLinPict = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37CCTLinPict", AV37CCTLinPict);
      AV38CCTSta = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38CCTSta", AV38CCTSta);
   }

   public void wb_table3_156_2C22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_156_2C22e( true) ;
      }
      else
      {
         wb_table3_156_2C22e( false) ;
      }
   }

   public void wb_table2_151_2C22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_151_2C22e( true) ;
      }
      else
      {
         wb_table2_151_2C22e( false) ;
      }
   }

   public void wb_table1_87_2C22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcctlinpict_Internalname, tblTablemergedcctlinpict_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctlinpict_Internalname, httpContext.getMessage( "CCTLin Pict", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlinpict_Internalname, GXutil.rtrim( AV37CCTLinPict), GXutil.rtrim( localUtil.format( AV37CCTLinPict, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlinpict_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavCctlinpict_Visible, edtavCctlinpict_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCctlinpict_popoverimage_Internalname, httpContext.getMessage( "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down fas fa-info'></i>", ""), "", "", lblCctlinpict_popoverimage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF1_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_87_2C22e( true) ;
      }
      else
      {
         wb_table1_87_2C22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV35emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35emprcod", AV35emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35emprcod, "@!"))));
      AV33CCTCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33CCTCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33CCTCod), "ZZZZZ9")));
      AV34CCTDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34CCTDsc", AV34CCTDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34CCTDsc, ""))));
      AV49CCTTpoCtr = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49CCTTpoCtr", AV49CCTTpoCtr);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49CCTTpoCtr, ""))));
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
      pa2C22( ) ;
      ws2C22( ) ;
      we2C22( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615335", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_ccdef1_wp.js", "?20268211615336", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1242( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_124_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_124_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_124_idx ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI_"+sGXsfl_124_idx );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_124_idx );
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_124_idx ;
      edtCCTLinDc2_Internalname = "CCTLINDC2_"+sGXsfl_124_idx ;
      edtCCVNorma_Internalname = "CCVNORMA_"+sGXsfl_124_idx ;
      edtCCVEspe2_Internalname = "CCVESPE2_"+sGXsfl_124_idx ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_124_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_124_idx ;
   }

   public void subsflControlProps_fel_1242( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_124_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_124_fel_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_124_fel_idx ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI_"+sGXsfl_124_fel_idx );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_124_fel_idx );
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_124_fel_idx ;
      edtCCTLinDc2_Internalname = "CCTLINDC2_"+sGXsfl_124_fel_idx ;
      edtCCVNorma_Internalname = "CCVNORMA_"+sGXsfl_124_fel_idx ;
      edtCCVEspe2_Internalname = "CCVESPE2_"+sGXsfl_124_fel_idx ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_124_fel_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_124_fel_idx ;
   }

   public void sendrow_1242( )
   {
      subsflControlProps_1242( ) ;
      wb2C20( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_124_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_124_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_124_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 125,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_124_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV48GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_124_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,125);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_124_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ECCTLIN.CLICK."+sGXsfl_124_idx+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbCCTLinTpoI.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CCTLINTPOI_" + sGXsfl_124_idx ;
            cmbCCTLinTpoI.setName( GXCCtl );
            cmbCCTLinTpoI.setWebtags( "" );
            cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
            cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
            if ( cmbCCTLinTpoI.getItemCount() > 0 )
            {
               A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoI,cmbCCTLinTpoI.getInternalname(),GXutil.rtrim( A4048CCTLinTpoI),Integer.valueOf(1),cmbCCTLinTpoI.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), !bGXsfl_124_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbCCTLinTpoD.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CCTLINTPOD_" + sGXsfl_124_idx ;
            cmbCCTLinTpoD.setName( GXCCtl );
            cmbCCTLinTpoD.setWebtags( "" );
            cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
            cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
            cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
            cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
            cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
            if ( cmbCCTLinTpoD.getItemCount() > 0 )
            {
               A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoD,cmbCCTLinTpoD.getInternalname(),GXutil.rtrim( A4044CCTLinTpoD),Integer.valueOf(1),cmbCCTLinTpoD.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), !bGXsfl_124_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDc2_Internalname,GXutil.rtrim( A14344CCTLinDc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVNorma_Internalname,GXutil.rtrim( A13249CCVNorma),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVNorma_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVEspe2_Internalname,A14345CCVEspe2,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVEspe2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinLgoD_Internalname,GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinLgoD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinPict_Internalname,GXutil.rtrim( A4046CCTLinPict),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinPict_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2C22( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_124_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      /* End function sendrow_1242 */
   }

   public void startgridcontrol124( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"124\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ingreso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Datos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion (cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Norma", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Especificacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Largo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Picture", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4048CCTLinTpoI));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4044CCTLinTpoD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14344CCTLinDc2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13249CCVNorma));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14345CCVEspe2);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4046CCTLinPict));
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
      cmbavCcttpoctr.setInternalname( "vCCTTPOCTR" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavCctlin_Internalname = "vCCTLIN" ;
      edtavCctlindsc_Internalname = "vCCTLINDSC" ;
      edtavCctlindc2_Internalname = "vCCTLINDC2" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavCcvnorma_Internalname = "vCCVNORMA" ;
      edtavCctlinvarwrd_Internalname = "vCCTLINVARWRD" ;
      edtavCcvespe2_Internalname = "vCCVESPE2" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      cmbavCctlintpoing.setInternalname( "vCCTLINTPOING" );
      cmbavCctlintpodat.setInternalname( "vCCTLINTPODAT" );
      edtavCctlinlgodat_Internalname = "vCCTLINLGODAT" ;
      lblTextblockcctlinpict_Internalname = "TEXTBLOCKCCTLINPICT" ;
      edtavCctlinpict_Internalname = "vCCTLINPICT" ;
      lblCctlinpict_popoverimage_Internalname = "CCTLINPICT_POPOVERIMAGE" ;
      tblTablemergedcctlinpict_Internalname = "TABLEMERGEDCCTLINPICT" ;
      divTablesplittedcctlinpict_Internalname = "TABLESPLITTEDCCTLINPICT" ;
      edtavCctsta_Internalname = "vCCTSTA" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTxtmensaje_Internalname = "TXTMENSAJE" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI" );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCTLinDc2_Internalname = "CCTLINDC2" ;
      edtCCVNorma_Internalname = "CCVNORMA" ;
      edtCCVEspe2_Internalname = "CCVESPE2" ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Popover_cctlinpict_Internalname = "POPOVER_CCTLINPICT" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
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
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinLgoD_Jsonclick = "" ;
      edtCCVEspe2_Jsonclick = "" ;
      edtCCVNorma_Jsonclick = "" ;
      edtCCTLinDc2_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      cmbCCTLinTpoD.setJsonclick( "" );
      cmbCCTLinTpoI.setJsonclick( "" );
      edtCCTLin_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavCctlinpict_Jsonclick = "" ;
      edtavCctlinpict_Enabled = 1 ;
      edtavCctlinpict_Visible = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTxtmensaje_Caption = "" ;
      edtavCctsta_Jsonclick = "" ;
      edtavCctsta_Enabled = 1 ;
      edtavCctsta_Visible = 1 ;
      edtavCctlinlgodat_Jsonclick = "" ;
      edtavCctlinlgodat_Enabled = 1 ;
      edtavCctlinlgodat_Visible = 1 ;
      cmbavCctlintpodat.setJsonclick( "" );
      cmbavCctlintpodat.setEnabled( 1 );
      cmbavCctlintpoing.setJsonclick( "" );
      cmbavCctlintpoing.setEnabled( 1 );
      edtavCcvespe2_Enabled = 1 ;
      edtavCctlinvarwrd_Jsonclick = "" ;
      edtavCctlinvarwrd_Enabled = 1 ;
      edtavCctlinvarwrd_Visible = 1 ;
      edtavCcvnorma_Jsonclick = "" ;
      edtavCcvnorma_Enabled = 1 ;
      edtavCctlindc2_Jsonclick = "" ;
      edtavCctlindc2_Enabled = 1 ;
      edtavCctlindsc_Jsonclick = "" ;
      edtavCctlindsc_Enabled = 1 ;
      edtavCctlin_Jsonclick = "" ;
      edtavCctlin_Enabled = 1 ;
      cmbavCcttpoctr.setJsonclick( "" );
      cmbavCcttpoctr.setEnabled( 0 );
      edtavCctdsc_Jsonclick = "" ;
      edtavCctdsc_Enabled = 0 ;
      edtavCctcod_Jsonclick = "" ;
      edtavCctcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Tipo;Tipo;;;;;;" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Deseas eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "ControlCalidadHTD.ControlCalidad_CCDEF1_WPGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|L:Lista,R:Rango|F:Fecha,N:Numérico,H:Hora,C:Caracteres,T:Título||||||" ;
      Ddo_grid_Allowmultipleselection = "|T|T||||||" ;
      Ddo_grid_Datalisttype = "|FixedValues|FixedValues|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "T|||||||T|" ;
      Ddo_grid_Filtertype = "Numeric|||Character|Character|Character|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T|||T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "2:CCTLin|3:CCTLinTpoIng|4:CCTLinTpoDat|5:CCTLinDsc|6:CCTLinDc2|7:CCVNorma|8:CCVEspe2|9:CCTLinLgoDat|10:CCTLinPict" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_cctlinpict_Position = "Bottom" ;
      Popover_cctlinpict_Popoverwidth = 400 ;
      Popover_cctlinpict_Trigger = "Click" ;
      Popover_cctlinpict_Iteminternalname = "" ;
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
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Control Calidad_CCDEF1 (lineas)", "") );
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
         AV49CCTTpoCtr = cmbavCcttpoctr.getValidValue(AV49CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49CCTTpoCtr", AV49CCTTpoCtr);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTTPOCTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49CCTTpoCtr, ""))));
      }
      cmbavCctlintpoing.setName( "vCCTLINTPOING" );
      cmbavCctlintpoing.setWebtags( "" );
      cmbavCctlintpoing.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbavCctlintpoing.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbavCctlintpoing.getItemCount() > 0 )
      {
         AV51CCTLinTpoIng = cmbavCctlintpoing.getValidValue(AV51CCTLinTpoIng) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51CCTLinTpoIng", AV51CCTLinTpoIng);
      }
      cmbavCctlintpodat.setName( "vCCTLINTPODAT" );
      cmbavCctlintpodat.setWebtags( "" );
      cmbavCctlintpodat.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbavCctlintpodat.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbavCctlintpodat.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbavCctlintpodat.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbavCctlintpodat.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbavCctlintpodat.getItemCount() > 0 )
      {
         AV52CCTLinTpoDat = cmbavCctlintpodat.getValidValue(AV52CCTLinTpoDat) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52CCTLinTpoDat", AV52CCTLinTpoDat);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_124_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      }
      GXCCtl = "CCTLINTPOI_" + sGXsfl_124_idx ;
      cmbCCTLinTpoI.setName( GXCCtl );
      cmbCCTLinTpoI.setWebtags( "" );
      cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
      }
      GXCCtl = "CCTLINTPOD_" + sGXsfl_124_idx ;
      cmbCCTLinTpoD.setName( GXCCtl );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112C22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122C22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132C22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV55TFCCTLinTpoDat_SelsJson',fld:'vTFCCTLINTPODAT_SELSJSON',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV53TFCCTLinTpoIng_SelsJson',fld:'vTFCCTLINTPOING_SELSJSON',pic:''},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242C22',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e252C22',iparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:'',hsh:true},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:'',hsh:true},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:'',hsh:true},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9',hsh:true},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142C22',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV42CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e162C22',iparms:[{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e152C22',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'AV42CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV43CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV44CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV39CCVNorma',fld:'vCCVNORMA',pic:''},{av:'AV40CCTLinVarWrd',fld:'vCCTLINVARWRD',pic:'@!'},{av:'AV41CCVEspe2',fld:'vCCVESPE2',pic:''},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''},{av:'AV38CCTSta',fld:'vCCTSTA',pic:''},{av:'cmbavCctlintpoing'},{av:'AV51CCTLinTpoIng',fld:'vCCTLINTPOING',pic:''},{av:'cmbavCctlintpodat'},{av:'AV52CCTLinTpoDat',fld:'vCCTLINTPODAT',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV42CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV43CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV44CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV39CCVNorma',fld:'vCCVNORMA',pic:''},{av:'AV40CCTLinVarWrd',fld:'vCCTLINVARWRD',pic:'@!'},{av:'AV41CCVEspe2',fld:'vCCVESPE2',pic:''},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''},{av:'AV38CCTSta',fld:'vCCTSTA',pic:''},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e172C22',iparms:[{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'AV42CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV43CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV44CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV39CCVNorma',fld:'vCCVNORMA',pic:''},{av:'AV40CCTLinVarWrd',fld:'vCCTLINVARWRD',pic:'@!'},{av:'AV41CCVEspe2',fld:'vCCVESPE2',pic:''},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''},{av:'AV38CCTSta',fld:'vCCTSTA',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e182C22',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("CCTLIN.CLICK","{handler:'e262C22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("CCTLIN.CLICK",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'cmbavCctlintpodat'},{av:'AV52CCTLinTpoDat',fld:'vCCTLINTPODAT',pic:''},{av:'cmbavCctlintpoing'},{av:'AV51CCTLinTpoIng',fld:'vCCTLINTPOING',pic:''},{av:'AV38CCTSta',fld:'vCCTSTA',pic:''},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV41CCVEspe2',fld:'vCCVESPE2',pic:''},{av:'AV40CCTLinVarWrd',fld:'vCCTLINVARWRD',pic:'@!'},{av:'AV39CCVNorma',fld:'vCCVNORMA',pic:''},{av:'AV44CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV43CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'AV42CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'edtavCctlinlgodat_Enabled',ctrl:'vCCTLINLGODAT',prop:'Enabled'},{av:'edtavCctlinpict_Enabled',ctrl:'vCCTLINPICT',prop:'Enabled'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VCCTLIN.ISVALID","{handler:'e192C22',iparms:[{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV42CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true}]");
      setEventMetadata("VCCTLIN.ISVALID",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'cmbavCctlintpodat'},{av:'AV52CCTLinTpoDat',fld:'vCCTLINTPODAT',pic:''},{av:'cmbavCctlintpoing'},{av:'AV51CCTLinTpoIng',fld:'vCCTLINTPOING',pic:''},{av:'AV38CCTSta',fld:'vCCTSTA',pic:''},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV41CCVEspe2',fld:'vCCVESPE2',pic:''},{av:'AV40CCTLinVarWrd',fld:'vCCTLINVARWRD',pic:'@!'},{av:'AV39CCVNorma',fld:'vCCVNORMA',pic:''},{av:'AV44CCTLinDc2',fld:'vCCTLINDC2',pic:''},{av:'AV43CCTLinDsc',fld:'vCCTLINDSC',pic:''},{av:'edtavCctlinlgodat_Enabled',ctrl:'vCCTLINLGODAT',prop:'Enabled'},{av:'edtavCctlinpict_Enabled',ctrl:'vCCTLINPICT',prop:'Enabled'}]}");
      setEventMetadata("VCCTLINPICT.ISVALID","{handler:'e202C22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'}]");
      setEventMetadata("VCCTLINPICT.ISVALID",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VCCTLINLGODAT.ISVALID","{handler:'e212C22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV16TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV54TFCCTLinTpoIng_Sels',fld:'vTFCCTLINTPOING_SELS',pic:''},{av:'AV56TFCCTLinTpoDat_Sels',fld:'vTFCCTLINTPODAT_SELS',pic:''},{av:'AV17TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV18TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV19TFCCTLinDc2',fld:'vTFCCTLINDC2',pic:''},{av:'AV20TFCCTLinDc2_Sel',fld:'vTFCCTLINDC2_SEL',pic:''},{av:'AV21TFCCVNorma',fld:'vTFCCVNORMA',pic:''},{av:'AV22TFCCVNorma_Sel',fld:'vTFCCVNORMA_SEL',pic:''},{av:'AV23TFCCVEspe2',fld:'vTFCCVESPE2',pic:''},{av:'AV24TFCCVEspe2_Sel',fld:'vTFCCVESPE2_SEL',pic:''},{av:'AV25TFCCTLinLgoDat',fld:'vTFCCTLINLGODAT',pic:'ZZ9'},{av:'AV26TFCCTLinLgoDat_To',fld:'vTFCCTLINLGODAT_TO',pic:'ZZ9'},{av:'AV27TFCCTLinPict',fld:'vTFCCTLINPICT',pic:''},{av:'AV28TFCCTLinPict_Sel',fld:'vTFCCTLINPICT_SEL',pic:''},{av:'AV63Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV34CCTDsc',fld:'vCCTDSC',pic:'',hsh:true},{av:'cmbavCcttpoctr'},{av:'AV49CCTTpoCtr',fld:'vCCTTPOCTR',pic:'',hsh:true},{av:'AV36CCTLinLgoDat',fld:'vCCTLINLGODAT',pic:'ZZ9'},{av:'AV37CCTLinPict',fld:'vCCTLINPICT',pic:''}]");
      setEventMetadata("VCCTLINLGODAT.ISVALID",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV31GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV32GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_CCTCOD","{handler:'validv_Cctcod',iparms:[]");
      setEventMetadata("VALIDV_CCTCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cctlinpict',iparms:[]");
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
      wcpOAV35emprcod = "" ;
      wcpOAV34CCTDsc = "" ;
      wcpOAV49CCTTpoCtr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV35emprcod = "" ;
      AV34CCTDsc = "" ;
      AV49CCTTpoCtr = "" ;
      AV54TFCCTLinTpoIng_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56TFCCTLinTpoDat_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17TFCCTLinDsc = "" ;
      AV18TFCCTLinDsc_Sel = "" ;
      AV19TFCCTLinDc2 = "" ;
      AV20TFCCTLinDc2_Sel = "" ;
      AV21TFCCVNorma = "" ;
      AV22TFCCVNorma_Sel = "" ;
      AV23TFCCVEspe2 = "" ;
      AV24TFCCVEspe2_Sel = "" ;
      AV27TFCCTLinPict = "" ;
      AV28TFCCTLinPict_Sel = "" ;
      AV63Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV29DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV43CCTLinDsc = "" ;
      AV44CCTLinDc2 = "" ;
      AV39CCVNorma = "" ;
      AV40CCTLinVarWrd = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV41CCVEspe2 = "" ;
      AV51CCTLinTpoIng = "" ;
      AV52CCTLinTpoDat = "" ;
      lblTextblockcctlinpict_Jsonclick = "" ;
      AV38CCTSta = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTxtmensaje_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucPopover_cctlinpict = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A4048CCTLinTpoI = "" ;
      A4044CCTLinTpoD = "" ;
      A4043CCTLinDsc = "" ;
      A14344CCTLinDc2 = "" ;
      A13249CCVNorma = "" ;
      A14345CCVEspe2 = "" ;
      A4046CCTLinPict = "" ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = "" ;
      lV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = "" ;
      lV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = "" ;
      lV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = "" ;
      lV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = "" ;
      AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = "" ;
      AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = "" ;
      AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = "" ;
      AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = "" ;
      AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = "" ;
      AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = "" ;
      AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = "" ;
      AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = "" ;
      AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = "" ;
      AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = "" ;
      H02C22_A4031CCTCod = new int[1] ;
      H02C22_A4046CCTLinPict = new String[] {""} ;
      H02C22_A4045CCTLinLgoD = new short[1] ;
      H02C22_A14345CCVEspe2 = new String[] {""} ;
      H02C22_A13249CCVNorma = new String[] {""} ;
      H02C22_A14344CCTLinDc2 = new String[] {""} ;
      H02C22_A4043CCTLinDsc = new String[] {""} ;
      H02C22_A4044CCTLinTpoD = new String[] {""} ;
      H02C22_A4048CCTLinTpoI = new String[] {""} ;
      H02C22_A4034CCTLin = new short[1] ;
      H02C22_A396EmprCod = new String[] {""} ;
      H02C23_AGRID_nRecordCount = new long[1] ;
      AV37CCTLinPict = "" ;
      hsh = "" ;
      AV47Station = "" ;
      AV45EmprNom = "" ;
      AV46UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53TFCCTLinTpoIng_SelsJson = "" ;
      AV55TFCCTLinTpoDat_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV60mensaje = "" ;
      AV50Mask = "" ;
      AV58messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      AV59Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV81Emprcod_selected = "" ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char12 = "" ;
      GXt_char18 = "" ;
      GXt_char16 = "" ;
      GXt_char14 = "" ;
      GXt_char13 = "" ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_char21 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char15 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char24 = new String[1] ;
      GXv_int10 = new long[1] ;
      GXv_char23 = new String[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      lblCctlinpict_popoverimage_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_wp__default(),
         new Object[] {
             new Object[] {
            H02C22_A4031CCTCod, H02C22_A4046CCTLinPict, H02C22_A4045CCTLinLgoD, H02C22_A14345CCVEspe2, H02C22_A13249CCVNorma, H02C22_A14344CCTLinDc2, H02C22_A4043CCTLinDsc, H02C22_A4044CCTLinTpoD, H02C22_A4048CCTLinTpoI, H02C22_A4034CCTLin,
            H02C22_A396EmprCod
            }
            , new Object[] {
            H02C23_AGRID_nRecordCount
            }
         }
      );
      AV63Pgmname = "ControlCalidadHTD.ControlCalidad_CCDEF1_WP" ;
      /* GeneXus formulas. */
      AV63Pgmname = "ControlCalidadHTD.ControlCalidad_CCDEF1_WP" ;
      Gx_err = (short)(0) ;
      edtavCctcod_Enabled = 0 ;
      edtavCctdsc_Enabled = 0 ;
      cmbavCcttpoctr.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV15TFCCTLin ;
   private short AV16TFCCTLin_To ;
   private short AV25TFCCTLinLgoDat ;
   private short AV26TFCCTLinLgoDat_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42CCTLin ;
   private short AV36CCTLinLgoDat ;
   private short AV48GridActions ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ;
   private short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ;
   private short AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ;
   private short AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ;
   private short AV57pasocontrol ;
   private short AV83Cctlin_selected ;
   private short GXt_int7 ;
   private short GXv_int8[] ;
   private int wcpOAV33CCTCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_124 ;
   private int AV33CCTCod ;
   private int nGXsfl_124_idx=1 ;
   private int A4031CCTCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Popover_cctlinpict_Popoverwidth ;
   private int edtavCctcod_Enabled ;
   private int edtavCctdsc_Enabled ;
   private int edtavCctlin_Enabled ;
   private int edtavCctlindsc_Enabled ;
   private int edtavCctlindc2_Enabled ;
   private int edtavCcvnorma_Enabled ;
   private int edtavCctlinvarwrd_Visible ;
   private int edtavCctlinvarwrd_Enabled ;
   private int edtavCcvespe2_Enabled ;
   private int edtavCctlinlgodat_Visible ;
   private int edtavCctlinlgodat_Enabled ;
   private int edtavCctsta_Visible ;
   private int edtavCctsta_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ;
   private int AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ;
   private int edtavCctlinpict_Visible ;
   private int AV30PageToGo ;
   private int AV80GXV1 ;
   private int AV82Cctcod_selected ;
   private int AV84GXV2 ;
   private int edtavCctlinpict_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV31GridCurrentPage ;
   private long AV32GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int10[] ;
   private String wcpOAV35emprcod ;
   private String wcpOAV34CCTDsc ;
   private String wcpOAV49CCTTpoCtr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV35emprcod ;
   private String AV34CCTDsc ;
   private String AV49CCTTpoCtr ;
   private String sGXsfl_124_idx="0001" ;
   private String AV17TFCCTLinDsc ;
   private String AV18TFCCTLinDsc_Sel ;
   private String AV19TFCCTLinDc2 ;
   private String AV20TFCCTLinDc2_Sel ;
   private String AV21TFCCVNorma ;
   private String AV22TFCCVNorma_Sel ;
   private String AV27TFCCTLinPict ;
   private String AV28TFCCTLinPict_Sel ;
   private String AV63Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Popover_cctlinpict_Iteminternalname ;
   private String Popover_cctlinpict_Trigger ;
   private String Popover_cctlinpict_Position ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavCctcod_Internalname ;
   private String edtavCctcod_Jsonclick ;
   private String edtavCctdsc_Internalname ;
   private String edtavCctdsc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavCctlin_Internalname ;
   private String TempTags ;
   private String edtavCctlin_Jsonclick ;
   private String edtavCctlindsc_Internalname ;
   private String AV43CCTLinDsc ;
   private String edtavCctlindsc_Jsonclick ;
   private String edtavCctlindc2_Internalname ;
   private String AV44CCTLinDc2 ;
   private String edtavCctlindc2_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCcvnorma_Internalname ;
   private String AV39CCVNorma ;
   private String edtavCcvnorma_Jsonclick ;
   private String edtavCctlinvarwrd_Internalname ;
   private String AV40CCTLinVarWrd ;
   private String edtavCctlinvarwrd_Jsonclick ;
   private String edtavCcvespe2_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable5_Internalname ;
   private String AV51CCTLinTpoIng ;
   private String AV52CCTLinTpoDat ;
   private String edtavCctlinlgodat_Internalname ;
   private String edtavCctlinlgodat_Jsonclick ;
   private String divTablesplittedcctlinpict_Internalname ;
   private String lblTextblockcctlinpict_Internalname ;
   private String lblTextblockcctlinpict_Jsonclick ;
   private String edtavCctsta_Internalname ;
   private String AV38CCTSta ;
   private String edtavCctsta_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTxtmensaje_Internalname ;
   private String lblTxtmensaje_Caption ;
   private String lblTxtmensaje_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_cctlinpict_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtCCTLin_Internalname ;
   private String A4048CCTLinTpoI ;
   private String A4044CCTLinTpoD ;
   private String A4043CCTLinDsc ;
   private String edtCCTLinDsc_Internalname ;
   private String A14344CCTLinDc2 ;
   private String edtCCTLinDc2_Internalname ;
   private String A13249CCVNorma ;
   private String edtCCVNorma_Internalname ;
   private String edtCCVEspe2_Internalname ;
   private String edtCCTLinLgoD_Internalname ;
   private String A4046CCTLinPict ;
   private String edtCCTLinPict_Internalname ;
   private String scmdbuf ;
   private String lV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ;
   private String lV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ;
   private String lV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ;
   private String lV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ;
   private String AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ;
   private String AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ;
   private String AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ;
   private String AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ;
   private String AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ;
   private String AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ;
   private String AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ;
   private String AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ;
   private String AV37CCTLinPict ;
   private String edtavCctlinpict_Internalname ;
   private String hsh ;
   private String AV47Station ;
   private String AV45EmprNom ;
   private String AV46UsurCod ;
   private String AV50Mask ;
   private String AV81Emprcod_selected ;
   private String GXt_char1 ;
   private String GXt_char12 ;
   private String GXt_char18 ;
   private String GXt_char16 ;
   private String GXt_char14 ;
   private String GXt_char13 ;
   private String GXv_char21[] ;
   private String GXv_char19[] ;
   private String GXv_char17[] ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char20 ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablemergedcctlinpict_Internalname ;
   private String edtavCctlinpict_Jsonclick ;
   private String lblCctlinpict_popoverimage_Internalname ;
   private String lblCctlinpict_popoverimage_Jsonclick ;
   private String sGXsfl_124_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCTLinDc2_Jsonclick ;
   private String edtCCVNorma_Jsonclick ;
   private String edtCCVEspe2_Jsonclick ;
   private String edtCCTLinLgoD_Jsonclick ;
   private String edtCCTLinPict_Jsonclick ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean bGXsfl_124_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV53TFCCTLinTpoIng_SelsJson ;
   private String AV55TFCCTLinTpoDat_SelsJson ;
   private String AV23TFCCVEspe2 ;
   private String AV24TFCCVEspe2_Sel ;
   private String AV41CCVEspe2 ;
   private String A14345CCVEspe2 ;
   private String lV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ;
   private String AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ;
   private String AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ;
   private String AV60mensaje ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucPopover_cctlinpict ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ;
   private GXSimpleCollection<String> AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ;
   private HTMLChoice cmbavCcttpoctr ;
   private HTMLChoice cmbavCctlintpoing ;
   private HTMLChoice cmbavCctlintpodat ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbCCTLinTpoI ;
   private HTMLChoice cmbCCTLinTpoD ;
   private IDataStoreProvider pr_default ;
   private int[] H02C22_A4031CCTCod ;
   private String[] H02C22_A4046CCTLinPict ;
   private short[] H02C22_A4045CCTLinLgoD ;
   private String[] H02C22_A14345CCVEspe2 ;
   private String[] H02C22_A13249CCVNorma ;
   private String[] H02C22_A14344CCTLinDc2 ;
   private String[] H02C22_A4043CCTLinDsc ;
   private String[] H02C22_A4044CCTLinTpoD ;
   private String[] H02C22_A4048CCTLinTpoI ;
   private short[] H02C22_A4034CCTLin ;
   private String[] H02C22_A396EmprCod ;
   private long[] H02C23_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV54TFCCTLinTpoIng_Sels ;
   private GXSimpleCollection<String> AV56TFCCTLinTpoDat_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV58messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private com.genexus.SdtMessages_Message AV59Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV29DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class controlcalidad_ccdef1_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02C22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV35emprcod ,
                                          int AV33CCTCod ,
                                          String A396EmprCod ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[21];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " CCTCod, CCTLinPict, CCTLinLgoD, CCVEspe2, CCVNorma, CCTLinDc2, CCTLinDsc, CCTLinTpoD, CCTLinTpoI, CCTLin, EmprCod" ;
      sFromString = " FROM TXPCCDef1" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and CCTCod = ?)");
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, CCTCod, CCTLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLinTpoI" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLinTpoI DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLinTpoD" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLinTpoD DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLinDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLinDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLinDc2" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLinDc2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCVNorma" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCVNorma DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCVEspe2" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCVEspe2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLinLgoD" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLinLgoD DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CCTLinPict" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CCTLinPict DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, CCTCod, CCTLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H02C23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV35emprcod ,
                                          int AV33CCTCod ,
                                          String A396EmprCod ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[16];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ? and CCTCod = ?)");
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV72Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H02C22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() );
            case 1 :
                  return conditional_H02C23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02C22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02C23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 40);
               }
               return;
      }
   }

}

