package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultahisrag_wp_impl extends GXDataArea
{
   public consultahisrag_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultahisrag_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultahisrag_wp_impl.class ));
   }

   public consultahisrag_wp_impl( int remoteHandle ,
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
            AV42EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV45HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45HreBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45HreBarCod), "ZZZZZZZ9")));
               AV46HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46HreBarReo", GXutil.str( AV46HreBarReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46HreBarReo), "9")));
               AV47HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47HreBarPar", AV47HreBarPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47HreBarPar, ""))));
               AV48HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48HreNumCie), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48HreNumCie), "Z9")));
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
      nRC_GXsfl_15 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_15"))) ;
      nGXsfl_15_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_15_idx"))) ;
      sGXsfl_15_idx = httpContext.GetPar( "sGXsfl_15_idx") ;
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
      AV42EmprCod = httpContext.GetPar( "EmprCod") ;
      AV45HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV46HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV47HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV48HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      AV15TFHreAgrCod = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrCod"))) ;
      AV16TFHreAgrCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrCod_To"))) ;
      AV17TFHreAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "TFHreAgrReo"))) ;
      AV18TFHreAgrReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreAgrReo_To"))) ;
      AV19TFHreAgrPar = httpContext.GetPar( "TFHreAgrPar") ;
      AV20TFHreAgrPar_Sel = httpContext.GetPar( "TFHreAgrPar_Sel") ;
      AV21TFHreAgrKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrKgm"), ".") ;
      AV22TFHreAgrKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrKgm_To"), ".") ;
      AV23TFHreAgrMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrMtr"), ".") ;
      AV24TFHreAgrMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrMtr_To"), ".") ;
      AV25TFHreAgrPie = (short)(GXutil.lval( httpContext.GetPar( "TFHreAgrPie"))) ;
      AV26TFHreAgrPie_To = (short)(GXutil.lval( httpContext.GetPar( "TFHreAgrPie_To"))) ;
      AV27TFHreAgrCli = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrCli"))) ;
      AV28TFHreAgrCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrCli_To"))) ;
      AV29TFHreAgrSer = httpContext.GetPar( "TFHreAgrSer") ;
      AV30TFHreAgrSer_Sel = httpContext.GetPar( "TFHreAgrSer_Sel") ;
      AV31TFHreAgrDsc = httpContext.GetPar( "TFHreAgrDsc") ;
      AV32TFHreAgrDsc_Sel = httpContext.GetPar( "TFHreAgrDsc_Sel") ;
      AV33TFHreAgrCol = httpContext.GetPar( "TFHreAgrCol") ;
      AV34TFHreAgrCol_Sel = httpContext.GetPar( "TFHreAgrCol_Sel") ;
      AV35TFHreAgrNumC = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrNumC"))) ;
      AV36TFHreAgrNumC_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrNumC_To"))) ;
      AV51Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV52Consultahisrag_wpds_1_emprcod = httpContext.GetPar( "Consultahisrag_wpds_1_emprcod") ;
      AV53Consultahisrag_wpds_2_hrebarcod = (int)(GXutil.lval( httpContext.GetPar( "Consultahisrag_wpds_2_hrebarcod"))) ;
      AV54Consultahisrag_wpds_3_hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Consultahisrag_wpds_3_hrebarreo"))) ;
      AV55Consultahisrag_wpds_4_hrebarpar = httpContext.GetPar( "Consultahisrag_wpds_4_hrebarpar") ;
      AV56Consultahisrag_wpds_5_hrenumcie = (byte)(GXutil.lval( httpContext.GetPar( "Consultahisrag_wpds_5_hrenumcie"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV42EmprCod, AV45HreBarCod, AV46HreBarReo, AV47HreBarPar, AV48HreNumCie, AV15TFHreAgrCod, AV16TFHreAgrCod_To, AV17TFHreAgrReo, AV18TFHreAgrReo_To, AV19TFHreAgrPar, AV20TFHreAgrPar_Sel, AV21TFHreAgrKgm, AV22TFHreAgrKgm_To, AV23TFHreAgrMtr, AV24TFHreAgrMtr_To, AV25TFHreAgrPie, AV26TFHreAgrPie_To, AV27TFHreAgrCli, AV28TFHreAgrCli_To, AV29TFHreAgrSer, AV30TFHreAgrSer_Sel, AV31TFHreAgrDsc, AV32TFHreAgrDsc_Sel, AV33TFHreAgrCol, AV34TFHreAgrCol_Sel, AV35TFHreAgrNumC, AV36TFHreAgrNumC_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52Consultahisrag_wpds_1_emprcod, AV53Consultahisrag_wpds_2_hrebarcod, AV54Consultahisrag_wpds_3_hrebarreo, AV55Consultahisrag_wpds_4_hrebarpar, AV56Consultahisrag_wpds_5_hrenumcie) ;
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
      pa2BH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BH2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultahisrag_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV45HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV47HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV48HreNumCie,2,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47HreBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48HreNumCie), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaHisRag_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultahisrag_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_15", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_15, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV39GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV40GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV42EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV45HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV46HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARPAR", GXutil.rtrim( AV47HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47HreBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV48HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48HreNumCie), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCOD", GXutil.ltrim( localUtil.ntoc( AV15TFHreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCOD_TO", GXutil.ltrim( localUtil.ntoc( AV16TFHreAgrCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRREO", GXutil.ltrim( localUtil.ntoc( AV17TFHreAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRREO_TO", GXutil.ltrim( localUtil.ntoc( AV18TFHreAgrReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRPAR", GXutil.rtrim( AV19TFHreAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRPAR_SEL", GXutil.rtrim( AV20TFHreAgrPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRKGM", GXutil.ltrim( localUtil.ntoc( AV21TFHreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRKGM_TO", GXutil.ltrim( localUtil.ntoc( AV22TFHreAgrKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRMTR", GXutil.ltrim( localUtil.ntoc( AV23TFHreAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRMTR_TO", GXutil.ltrim( localUtil.ntoc( AV24TFHreAgrMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRPIE", GXutil.ltrim( localUtil.ntoc( AV25TFHreAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRPIE_TO", GXutil.ltrim( localUtil.ntoc( AV26TFHreAgrPie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCLI", GXutil.ltrim( localUtil.ntoc( AV27TFHreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCLI_TO", GXutil.ltrim( localUtil.ntoc( AV28TFHreAgrCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRSER", GXutil.rtrim( AV29TFHreAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRSER_SEL", GXutil.rtrim( AV30TFHreAgrSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRDSC", GXutil.rtrim( AV31TFHreAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRDSC_SEL", GXutil.rtrim( AV32TFHreAgrDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCOL", GXutil.rtrim( AV33TFHreAgrCol));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCOL_SEL", GXutil.rtrim( AV34TFHreAgrCol_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRNUMC", GXutil.ltrim( localUtil.ntoc( AV35TFHreAgrNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRNUMC_TO", GXutil.ltrim( localUtil.ntoc( AV36TFHreAgrNumC_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSULTAHISRAG_WPDS_1_EMPRCOD", GXutil.rtrim( AV52Consultahisrag_wpds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSULTAHISRAG_WPDS_2_HREBARCOD", GXutil.ltrim( localUtil.ntoc( AV53Consultahisrag_wpds_2_hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSULTAHISRAG_WPDS_3_HREBARREO", GXutil.ltrim( localUtil.ntoc( AV54Consultahisrag_wpds_3_hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSULTAHISRAG_WPDS_4_HREBARPAR", GXutil.rtrim( AV55Consultahisrag_wpds_4_hrebarpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSULTAHISRAG_WPDS_5_HRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV56Consultahisrag_wpds_5_hrenumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we2BH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BH2( ) ;
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
      return formatLink("app.consultahisrag_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV45HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV47HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV48HreNumCie,2,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie"})  ;
   }

   public String getPgmname( )
   {
      return "ConsultaHisRag_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Hdrs Agrupadas", "") ;
   }

   public void wb2BH0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol15( ) ;
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_15 = (int)(nGXsfl_15_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV39GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV40GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaHisRag_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV37DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 15 )
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

   public void start2BH2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Hdrs Agrupadas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BH0( ) ;
   }

   public void ws2BH2( )
   {
      start2BH2( ) ;
      evt2BH2( ) ;
   }

   public void evt2BH2( )
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
                           e112BH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122BH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132BH2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_15_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_152( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4497HreAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4498HreAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4499HreAgrPar = httpContext.cgiGet( edtHreAgrPar_Internalname) ;
                           A4500HreAgrKgm = localUtil.ctond( httpContext.cgiGet( edtHreAgrKgm_Internalname)) ;
                           A4501HreAgrMtr = localUtil.ctond( httpContext.cgiGet( edtHreAgrMtr_Internalname)) ;
                           A4502HreAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4503HreAgrCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4504HreAgrSer = httpContext.cgiGet( edtHreAgrSer_Internalname) ;
                           A4505HreAgrDsc = httpContext.cgiGet( edtHreAgrDsc_Internalname) ;
                           A4506HreAgrCol = httpContext.cgiGet( edtHreAgrCol_Internalname) ;
                           A4507HreAgrNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e142BH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e152BH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e162BH2 ();
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

   public void we2BH2( )
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

   public void pa2BH2( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_152( ) ;
      while ( nGXsfl_15_idx <= nRC_GXsfl_15 )
      {
         sendrow_152( ) ;
         nGXsfl_15_idx = ((subGrid_Islastpage==1)&&(nGXsfl_15_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV42EmprCod ,
                                 int AV45HreBarCod ,
                                 byte AV46HreBarReo ,
                                 String AV47HreBarPar ,
                                 byte AV48HreNumCie ,
                                 int AV15TFHreAgrCod ,
                                 int AV16TFHreAgrCod_To ,
                                 byte AV17TFHreAgrReo ,
                                 byte AV18TFHreAgrReo_To ,
                                 String AV19TFHreAgrPar ,
                                 String AV20TFHreAgrPar_Sel ,
                                 java.math.BigDecimal AV21TFHreAgrKgm ,
                                 java.math.BigDecimal AV22TFHreAgrKgm_To ,
                                 java.math.BigDecimal AV23TFHreAgrMtr ,
                                 java.math.BigDecimal AV24TFHreAgrMtr_To ,
                                 short AV25TFHreAgrPie ,
                                 short AV26TFHreAgrPie_To ,
                                 int AV27TFHreAgrCli ,
                                 int AV28TFHreAgrCli_To ,
                                 String AV29TFHreAgrSer ,
                                 String AV30TFHreAgrSer_Sel ,
                                 String AV31TFHreAgrDsc ,
                                 String AV32TFHreAgrDsc_Sel ,
                                 String AV33TFHreAgrCol ,
                                 String AV34TFHreAgrCol_Sel ,
                                 int AV35TFHreAgrNumC ,
                                 int AV36TFHreAgrNumC_To ,
                                 String AV51Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV52Consultahisrag_wpds_1_emprcod ,
                                 int AV53Consultahisrag_wpds_2_hrebarcod ,
                                 byte AV54Consultahisrag_wpds_3_hrebarreo ,
                                 String AV55Consultahisrag_wpds_4_hrebarpar ,
                                 byte AV56Consultahisrag_wpds_5_hrenumcie )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e152BH2 ();
      GRID_nCurrentRecord = 0 ;
      rf2BH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaHisRag_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultahisrag_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
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
      rf2BH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV51Pgmname = "ConsultaHisRag_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(15) ;
      /* Execute user event: Refresh */
      e152BH2 ();
      nGXsfl_15_idx = 1 ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      bGXsfl_15_Refreshing = true ;
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
         subsflControlProps_152( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV57Consultahisrag_wpds_6_tfhreagrcod) ,
                                              Integer.valueOf(AV58Consultahisrag_wpds_7_tfhreagrcod_to) ,
                                              Byte.valueOf(AV59Consultahisrag_wpds_8_tfhreagrreo) ,
                                              Byte.valueOf(AV60Consultahisrag_wpds_9_tfhreagrreo_to) ,
                                              AV62Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                              AV61Consultahisrag_wpds_10_tfhreagrpar ,
                                              AV63Consultahisrag_wpds_12_tfhreagrkgm ,
                                              AV64Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                              AV65Consultahisrag_wpds_14_tfhreagrmtr ,
                                              AV66Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                              Short.valueOf(AV67Consultahisrag_wpds_16_tfhreagrpie) ,
                                              Short.valueOf(AV68Consultahisrag_wpds_17_tfhreagrpie_to) ,
                                              Integer.valueOf(AV69Consultahisrag_wpds_18_tfhreagrcli) ,
                                              Integer.valueOf(AV70Consultahisrag_wpds_19_tfhreagrcli_to) ,
                                              AV72Consultahisrag_wpds_21_tfhreagrser_sel ,
                                              AV71Consultahisrag_wpds_20_tfhreagrser ,
                                              AV74Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                              AV73Consultahisrag_wpds_22_tfhreagrdsc ,
                                              AV76Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                              AV75Consultahisrag_wpds_24_tfhreagrcol ,
                                              Integer.valueOf(AV77Consultahisrag_wpds_26_tfhreagrnumc) ,
                                              Integer.valueOf(AV78Consultahisrag_wpds_27_tfhreagrnumc_to) ,
                                              Integer.valueOf(A4497HreAgrCod) ,
                                              Byte.valueOf(A4498HreAgrReo) ,
                                              A4499HreAgrPar ,
                                              A4500HreAgrKgm ,
                                              A4501HreAgrMtr ,
                                              Short.valueOf(A4502HreAgrPie) ,
                                              Integer.valueOf(A4503HreAgrCli) ,
                                              A4504HreAgrSer ,
                                              A4505HreAgrDsc ,
                                              A4506HreAgrCol ,
                                              Integer.valueOf(A4507HreAgrNumC) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              AV42EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Integer.valueOf(AV45HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              Byte.valueOf(AV46HreBarReo) ,
                                              A4494HreBarPar ,
                                              AV47HreBarPar ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Byte.valueOf(AV48HreNumCie) ,
                                              AV52Consultahisrag_wpds_1_emprcod ,
                                              Integer.valueOf(AV53Consultahisrag_wpds_2_hrebarcod) ,
                                              Byte.valueOf(AV54Consultahisrag_wpds_3_hrebarreo) ,
                                              AV55Consultahisrag_wpds_4_hrebarpar ,
                                              Byte.valueOf(AV56Consultahisrag_wpds_5_hrenumcie) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV61Consultahisrag_wpds_10_tfhreagrpar = GXutil.padr( GXutil.rtrim( AV61Consultahisrag_wpds_10_tfhreagrpar), 1, "%") ;
         lV71Consultahisrag_wpds_20_tfhreagrser = GXutil.padr( GXutil.rtrim( AV71Consultahisrag_wpds_20_tfhreagrser), 16, "%") ;
         lV73Consultahisrag_wpds_22_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV73Consultahisrag_wpds_22_tfhreagrdsc), 26, "%") ;
         lV75Consultahisrag_wpds_24_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV75Consultahisrag_wpds_24_tfhreagrcol), 13, "%") ;
         /* Using cursor H02BH2 */
         pr_default.execute(0, new Object[] {AV52Consultahisrag_wpds_1_emprcod, Integer.valueOf(AV53Consultahisrag_wpds_2_hrebarcod), Byte.valueOf(AV54Consultahisrag_wpds_3_hrebarreo), AV55Consultahisrag_wpds_4_hrebarpar, Byte.valueOf(AV56Consultahisrag_wpds_5_hrenumcie), AV42EmprCod, Integer.valueOf(AV45HreBarCod), Byte.valueOf(AV46HreBarReo), AV47HreBarPar, Byte.valueOf(AV48HreNumCie), Integer.valueOf(AV57Consultahisrag_wpds_6_tfhreagrcod), Integer.valueOf(AV58Consultahisrag_wpds_7_tfhreagrcod_to), Byte.valueOf(AV59Consultahisrag_wpds_8_tfhreagrreo), Byte.valueOf(AV60Consultahisrag_wpds_9_tfhreagrreo_to), lV61Consultahisrag_wpds_10_tfhreagrpar, AV62Consultahisrag_wpds_11_tfhreagrpar_sel, AV63Consultahisrag_wpds_12_tfhreagrkgm, AV64Consultahisrag_wpds_13_tfhreagrkgm_to, AV65Consultahisrag_wpds_14_tfhreagrmtr, AV66Consultahisrag_wpds_15_tfhreagrmtr_to, Short.valueOf(AV67Consultahisrag_wpds_16_tfhreagrpie), Short.valueOf(AV68Consultahisrag_wpds_17_tfhreagrpie_to), Integer.valueOf(AV69Consultahisrag_wpds_18_tfhreagrcli), Integer.valueOf(AV70Consultahisrag_wpds_19_tfhreagrcli_to), lV71Consultahisrag_wpds_20_tfhreagrser, AV72Consultahisrag_wpds_21_tfhreagrser_sel, lV73Consultahisrag_wpds_22_tfhreagrdsc, AV74Consultahisrag_wpds_23_tfhreagrdsc_sel, lV75Consultahisrag_wpds_24_tfhreagrcol, AV76Consultahisrag_wpds_25_tfhreagrcol_sel, Integer.valueOf(AV77Consultahisrag_wpds_26_tfhreagrnumc), Integer.valueOf(AV78Consultahisrag_wpds_27_tfhreagrnumc_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_15_idx = 1 ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4507HreAgrNumC = H02BH2_A4507HreAgrNumC[0] ;
            A4506HreAgrCol = H02BH2_A4506HreAgrCol[0] ;
            A4505HreAgrDsc = H02BH2_A4505HreAgrDsc[0] ;
            A4504HreAgrSer = H02BH2_A4504HreAgrSer[0] ;
            A4503HreAgrCli = H02BH2_A4503HreAgrCli[0] ;
            A4502HreAgrPie = H02BH2_A4502HreAgrPie[0] ;
            A4501HreAgrMtr = H02BH2_A4501HreAgrMtr[0] ;
            A4500HreAgrKgm = H02BH2_A4500HreAgrKgm[0] ;
            A4499HreAgrPar = H02BH2_A4499HreAgrPar[0] ;
            A4498HreAgrReo = H02BH2_A4498HreAgrReo[0] ;
            A4497HreAgrCod = H02BH2_A4497HreAgrCod[0] ;
            A4495HreNumCie = H02BH2_A4495HreNumCie[0] ;
            A4494HreBarPar = H02BH2_A4494HreBarPar[0] ;
            A4493HreBarReo = H02BH2_A4493HreBarReo[0] ;
            A4492HreBarCod = H02BH2_A4492HreBarCod[0] ;
            A396EmprCod = H02BH2_A396EmprCod[0] ;
            e162BH2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(15) ;
         wb2BH0( ) ;
      }
      bGXsfl_15_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV42EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV45HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV46HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARPAR", GXutil.rtrim( AV47HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47HreBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV48HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48HreNumCie), "Z9")));
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
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV57Consultahisrag_wpds_6_tfhreagrcod) ,
                                           Integer.valueOf(AV58Consultahisrag_wpds_7_tfhreagrcod_to) ,
                                           Byte.valueOf(AV59Consultahisrag_wpds_8_tfhreagrreo) ,
                                           Byte.valueOf(AV60Consultahisrag_wpds_9_tfhreagrreo_to) ,
                                           AV62Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                           AV61Consultahisrag_wpds_10_tfhreagrpar ,
                                           AV63Consultahisrag_wpds_12_tfhreagrkgm ,
                                           AV64Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                           AV65Consultahisrag_wpds_14_tfhreagrmtr ,
                                           AV66Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                           Short.valueOf(AV67Consultahisrag_wpds_16_tfhreagrpie) ,
                                           Short.valueOf(AV68Consultahisrag_wpds_17_tfhreagrpie_to) ,
                                           Integer.valueOf(AV69Consultahisrag_wpds_18_tfhreagrcli) ,
                                           Integer.valueOf(AV70Consultahisrag_wpds_19_tfhreagrcli_to) ,
                                           AV72Consultahisrag_wpds_21_tfhreagrser_sel ,
                                           AV71Consultahisrag_wpds_20_tfhreagrser ,
                                           AV74Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                           AV73Consultahisrag_wpds_22_tfhreagrdsc ,
                                           AV76Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                           AV75Consultahisrag_wpds_24_tfhreagrcol ,
                                           Integer.valueOf(AV77Consultahisrag_wpds_26_tfhreagrnumc) ,
                                           Integer.valueOf(AV78Consultahisrag_wpds_27_tfhreagrnumc_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           AV42EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV45HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV46HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV47HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV48HreNumCie) ,
                                           AV52Consultahisrag_wpds_1_emprcod ,
                                           Integer.valueOf(AV53Consultahisrag_wpds_2_hrebarcod) ,
                                           Byte.valueOf(AV54Consultahisrag_wpds_3_hrebarreo) ,
                                           AV55Consultahisrag_wpds_4_hrebarpar ,
                                           Byte.valueOf(AV56Consultahisrag_wpds_5_hrenumcie) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV61Consultahisrag_wpds_10_tfhreagrpar = GXutil.padr( GXutil.rtrim( AV61Consultahisrag_wpds_10_tfhreagrpar), 1, "%") ;
      lV71Consultahisrag_wpds_20_tfhreagrser = GXutil.padr( GXutil.rtrim( AV71Consultahisrag_wpds_20_tfhreagrser), 16, "%") ;
      lV73Consultahisrag_wpds_22_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV73Consultahisrag_wpds_22_tfhreagrdsc), 26, "%") ;
      lV75Consultahisrag_wpds_24_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV75Consultahisrag_wpds_24_tfhreagrcol), 13, "%") ;
      /* Using cursor H02BH3 */
      pr_default.execute(1, new Object[] {AV52Consultahisrag_wpds_1_emprcod, Integer.valueOf(AV53Consultahisrag_wpds_2_hrebarcod), Byte.valueOf(AV54Consultahisrag_wpds_3_hrebarreo), AV55Consultahisrag_wpds_4_hrebarpar, Byte.valueOf(AV56Consultahisrag_wpds_5_hrenumcie), AV42EmprCod, Integer.valueOf(AV45HreBarCod), Byte.valueOf(AV46HreBarReo), AV47HreBarPar, Byte.valueOf(AV48HreNumCie), Integer.valueOf(AV57Consultahisrag_wpds_6_tfhreagrcod), Integer.valueOf(AV58Consultahisrag_wpds_7_tfhreagrcod_to), Byte.valueOf(AV59Consultahisrag_wpds_8_tfhreagrreo), Byte.valueOf(AV60Consultahisrag_wpds_9_tfhreagrreo_to), lV61Consultahisrag_wpds_10_tfhreagrpar, AV62Consultahisrag_wpds_11_tfhreagrpar_sel, AV63Consultahisrag_wpds_12_tfhreagrkgm, AV64Consultahisrag_wpds_13_tfhreagrkgm_to, AV65Consultahisrag_wpds_14_tfhreagrmtr, AV66Consultahisrag_wpds_15_tfhreagrmtr_to, Short.valueOf(AV67Consultahisrag_wpds_16_tfhreagrpie), Short.valueOf(AV68Consultahisrag_wpds_17_tfhreagrpie_to), Integer.valueOf(AV69Consultahisrag_wpds_18_tfhreagrcli), Integer.valueOf(AV70Consultahisrag_wpds_19_tfhreagrcli_to), lV71Consultahisrag_wpds_20_tfhreagrser, AV72Consultahisrag_wpds_21_tfhreagrser_sel, lV73Consultahisrag_wpds_22_tfhreagrdsc, AV74Consultahisrag_wpds_23_tfhreagrdsc_sel, lV75Consultahisrag_wpds_24_tfhreagrcol, AV76Consultahisrag_wpds_25_tfhreagrcol_sel, Integer.valueOf(AV77Consultahisrag_wpds_26_tfhreagrnumc), Integer.valueOf(AV78Consultahisrag_wpds_27_tfhreagrnumc_to)});
      GRID_nRecordCount = H02BH3_AGRID_nRecordCount[0] ;
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
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV42EmprCod, AV45HreBarCod, AV46HreBarReo, AV47HreBarPar, AV48HreNumCie, AV15TFHreAgrCod, AV16TFHreAgrCod_To, AV17TFHreAgrReo, AV18TFHreAgrReo_To, AV19TFHreAgrPar, AV20TFHreAgrPar_Sel, AV21TFHreAgrKgm, AV22TFHreAgrKgm_To, AV23TFHreAgrMtr, AV24TFHreAgrMtr_To, AV25TFHreAgrPie, AV26TFHreAgrPie_To, AV27TFHreAgrCli, AV28TFHreAgrCli_To, AV29TFHreAgrSer, AV30TFHreAgrSer_Sel, AV31TFHreAgrDsc, AV32TFHreAgrDsc_Sel, AV33TFHreAgrCol, AV34TFHreAgrCol_Sel, AV35TFHreAgrNumC, AV36TFHreAgrNumC_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52Consultahisrag_wpds_1_emprcod, AV53Consultahisrag_wpds_2_hrebarcod, AV54Consultahisrag_wpds_3_hrebarreo, AV55Consultahisrag_wpds_4_hrebarpar, AV56Consultahisrag_wpds_5_hrenumcie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV42EmprCod, AV45HreBarCod, AV46HreBarReo, AV47HreBarPar, AV48HreNumCie, AV15TFHreAgrCod, AV16TFHreAgrCod_To, AV17TFHreAgrReo, AV18TFHreAgrReo_To, AV19TFHreAgrPar, AV20TFHreAgrPar_Sel, AV21TFHreAgrKgm, AV22TFHreAgrKgm_To, AV23TFHreAgrMtr, AV24TFHreAgrMtr_To, AV25TFHreAgrPie, AV26TFHreAgrPie_To, AV27TFHreAgrCli, AV28TFHreAgrCli_To, AV29TFHreAgrSer, AV30TFHreAgrSer_Sel, AV31TFHreAgrDsc, AV32TFHreAgrDsc_Sel, AV33TFHreAgrCol, AV34TFHreAgrCol_Sel, AV35TFHreAgrNumC, AV36TFHreAgrNumC_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52Consultahisrag_wpds_1_emprcod, AV53Consultahisrag_wpds_2_hrebarcod, AV54Consultahisrag_wpds_3_hrebarreo, AV55Consultahisrag_wpds_4_hrebarpar, AV56Consultahisrag_wpds_5_hrenumcie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV42EmprCod, AV45HreBarCod, AV46HreBarReo, AV47HreBarPar, AV48HreNumCie, AV15TFHreAgrCod, AV16TFHreAgrCod_To, AV17TFHreAgrReo, AV18TFHreAgrReo_To, AV19TFHreAgrPar, AV20TFHreAgrPar_Sel, AV21TFHreAgrKgm, AV22TFHreAgrKgm_To, AV23TFHreAgrMtr, AV24TFHreAgrMtr_To, AV25TFHreAgrPie, AV26TFHreAgrPie_To, AV27TFHreAgrCli, AV28TFHreAgrCli_To, AV29TFHreAgrSer, AV30TFHreAgrSer_Sel, AV31TFHreAgrDsc, AV32TFHreAgrDsc_Sel, AV33TFHreAgrCol, AV34TFHreAgrCol_Sel, AV35TFHreAgrNumC, AV36TFHreAgrNumC_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52Consultahisrag_wpds_1_emprcod, AV53Consultahisrag_wpds_2_hrebarcod, AV54Consultahisrag_wpds_3_hrebarreo, AV55Consultahisrag_wpds_4_hrebarpar, AV56Consultahisrag_wpds_5_hrenumcie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV42EmprCod, AV45HreBarCod, AV46HreBarReo, AV47HreBarPar, AV48HreNumCie, AV15TFHreAgrCod, AV16TFHreAgrCod_To, AV17TFHreAgrReo, AV18TFHreAgrReo_To, AV19TFHreAgrPar, AV20TFHreAgrPar_Sel, AV21TFHreAgrKgm, AV22TFHreAgrKgm_To, AV23TFHreAgrMtr, AV24TFHreAgrMtr_To, AV25TFHreAgrPie, AV26TFHreAgrPie_To, AV27TFHreAgrCli, AV28TFHreAgrCli_To, AV29TFHreAgrSer, AV30TFHreAgrSer_Sel, AV31TFHreAgrDsc, AV32TFHreAgrDsc_Sel, AV33TFHreAgrCol, AV34TFHreAgrCol_Sel, AV35TFHreAgrNumC, AV36TFHreAgrNumC_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52Consultahisrag_wpds_1_emprcod, AV53Consultahisrag_wpds_2_hrebarcod, AV54Consultahisrag_wpds_3_hrebarreo, AV55Consultahisrag_wpds_4_hrebarpar, AV56Consultahisrag_wpds_5_hrenumcie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV42EmprCod, AV45HreBarCod, AV46HreBarReo, AV47HreBarPar, AV48HreNumCie, AV15TFHreAgrCod, AV16TFHreAgrCod_To, AV17TFHreAgrReo, AV18TFHreAgrReo_To, AV19TFHreAgrPar, AV20TFHreAgrPar_Sel, AV21TFHreAgrKgm, AV22TFHreAgrKgm_To, AV23TFHreAgrMtr, AV24TFHreAgrMtr_To, AV25TFHreAgrPie, AV26TFHreAgrPie_To, AV27TFHreAgrCli, AV28TFHreAgrCli_To, AV29TFHreAgrSer, AV30TFHreAgrSer_Sel, AV31TFHreAgrDsc, AV32TFHreAgrDsc_Sel, AV33TFHreAgrCol, AV34TFHreAgrCol_Sel, AV35TFHreAgrNumC, AV36TFHreAgrNumC_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52Consultahisrag_wpds_1_emprcod, AV53Consultahisrag_wpds_2_hrebarcod, AV54Consultahisrag_wpds_3_hrebarreo, AV55Consultahisrag_wpds_4_hrebarpar, AV56Consultahisrag_wpds_5_hrenumcie) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV51Pgmname = "ConsultaHisRag_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e142BH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV37DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV40GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaHisRag_WP");
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("consultahisrag_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e142BH2 ();
      if (returnInSub) return;
   }

   public void e142BH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultahisrag_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      GXv_char2[0] = AV42EmprCod ;
      GXv_char3[0] = AV43EmprNom ;
      GXv_char4[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultahisrag_wp_impl.this.AV42EmprCod = GXv_char2[0] ;
      consultahisrag_wp_impl.this.AV43EmprNom = GXv_char3[0] ;
      consultahisrag_wp_impl.this.AV44UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Hdrs Agrupadas", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV37DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV37DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e152BH2( )
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
      AV39GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridCurrentPage), 10, 0));
      AV40GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridPageCount), 10, 0));
      AV52Consultahisrag_wpds_1_emprcod = AV42EmprCod ;
      AV53Consultahisrag_wpds_2_hrebarcod = AV45HreBarCod ;
      AV54Consultahisrag_wpds_3_hrebarreo = AV46HreBarReo ;
      AV55Consultahisrag_wpds_4_hrebarpar = AV47HreBarPar ;
      AV56Consultahisrag_wpds_5_hrenumcie = AV48HreNumCie ;
      AV57Consultahisrag_wpds_6_tfhreagrcod = AV15TFHreAgrCod ;
      AV58Consultahisrag_wpds_7_tfhreagrcod_to = AV16TFHreAgrCod_To ;
      AV59Consultahisrag_wpds_8_tfhreagrreo = AV17TFHreAgrReo ;
      AV60Consultahisrag_wpds_9_tfhreagrreo_to = AV18TFHreAgrReo_To ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = AV19TFHreAgrPar ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = AV20TFHreAgrPar_Sel ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = AV21TFHreAgrKgm ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = AV22TFHreAgrKgm_To ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = AV23TFHreAgrMtr ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = AV24TFHreAgrMtr_To ;
      AV67Consultahisrag_wpds_16_tfhreagrpie = AV25TFHreAgrPie ;
      AV68Consultahisrag_wpds_17_tfhreagrpie_to = AV26TFHreAgrPie_To ;
      AV69Consultahisrag_wpds_18_tfhreagrcli = AV27TFHreAgrCli ;
      AV70Consultahisrag_wpds_19_tfhreagrcli_to = AV28TFHreAgrCli_To ;
      AV71Consultahisrag_wpds_20_tfhreagrser = AV29TFHreAgrSer ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = AV30TFHreAgrSer_Sel ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = AV31TFHreAgrDsc ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = AV32TFHreAgrDsc_Sel ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = AV33TFHreAgrCol ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = AV34TFHreAgrCol_Sel ;
      AV77Consultahisrag_wpds_26_tfhreagrnumc = AV35TFHreAgrNumC ;
      AV78Consultahisrag_wpds_27_tfhreagrnumc_to = AV36TFHreAgrNumC_To ;
      /*  Sending Event outputs  */
   }

   public void e112BH2( )
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
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e122BH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132BH2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrCod") == 0 )
         {
            AV15TFHreAgrCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFHreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFHreAgrCod), 8, 0));
            AV16TFHreAgrCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFHreAgrCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFHreAgrCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrReo") == 0 )
         {
            AV17TFHreAgrReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFHreAgrReo", GXutil.str( AV17TFHreAgrReo, 1, 0));
            AV18TFHreAgrReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFHreAgrReo_To", GXutil.str( AV18TFHreAgrReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrPar") == 0 )
         {
            AV19TFHreAgrPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFHreAgrPar", AV19TFHreAgrPar);
            AV20TFHreAgrPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFHreAgrPar_Sel", AV20TFHreAgrPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrKgm") == 0 )
         {
            AV21TFHreAgrKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFHreAgrKgm", GXutil.ltrimstr( AV21TFHreAgrKgm, 9, 2));
            AV22TFHreAgrKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFHreAgrKgm_To", GXutil.ltrimstr( AV22TFHreAgrKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrMtr") == 0 )
         {
            AV23TFHreAgrMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFHreAgrMtr", GXutil.ltrimstr( AV23TFHreAgrMtr, 9, 2));
            AV24TFHreAgrMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFHreAgrMtr_To", GXutil.ltrimstr( AV24TFHreAgrMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrPie") == 0 )
         {
            AV25TFHreAgrPie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFHreAgrPie), 4, 0));
            AV26TFHreAgrPie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFHreAgrPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFHreAgrPie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrCli") == 0 )
         {
            AV27TFHreAgrCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFHreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFHreAgrCli), 6, 0));
            AV28TFHreAgrCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFHreAgrCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFHreAgrCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrSer") == 0 )
         {
            AV29TFHreAgrSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFHreAgrSer", AV29TFHreAgrSer);
            AV30TFHreAgrSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAgrSer_Sel", AV30TFHreAgrSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrDsc") == 0 )
         {
            AV31TFHreAgrDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAgrDsc", AV31TFHreAgrDsc);
            AV32TFHreAgrDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAgrDsc_Sel", AV32TFHreAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrCol") == 0 )
         {
            AV33TFHreAgrCol = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAgrCol", AV33TFHreAgrCol);
            AV34TFHreAgrCol_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAgrCol_Sel", AV34TFHreAgrCol_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrNumC") == 0 )
         {
            AV35TFHreAgrNumC = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAgrNumC), 6, 0));
            AV36TFHreAgrNumC_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAgrNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreAgrNumC_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e162BH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(15) ;
      }
      sendrow_152( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_15_Refreshing )
      {
         httpContext.doAjaxLoad(15, GridRow);
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
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
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOD") == 0 )
         {
            AV15TFHreAgrCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFHreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFHreAgrCod), 8, 0));
            AV16TFHreAgrCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFHreAgrCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFHreAgrCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRREO") == 0 )
         {
            AV17TFHreAgrReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFHreAgrReo", GXutil.str( AV17TFHreAgrReo, 1, 0));
            AV18TFHreAgrReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFHreAgrReo_To", GXutil.str( AV18TFHreAgrReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPAR") == 0 )
         {
            AV19TFHreAgrPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFHreAgrPar", AV19TFHreAgrPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPAR_SEL") == 0 )
         {
            AV20TFHreAgrPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFHreAgrPar_Sel", AV20TFHreAgrPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRKGM") == 0 )
         {
            AV21TFHreAgrKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFHreAgrKgm", GXutil.ltrimstr( AV21TFHreAgrKgm, 9, 2));
            AV22TFHreAgrKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFHreAgrKgm_To", GXutil.ltrimstr( AV22TFHreAgrKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRMTR") == 0 )
         {
            AV23TFHreAgrMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFHreAgrMtr", GXutil.ltrimstr( AV23TFHreAgrMtr, 9, 2));
            AV24TFHreAgrMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFHreAgrMtr_To", GXutil.ltrimstr( AV24TFHreAgrMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPIE") == 0 )
         {
            AV25TFHreAgrPie = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFHreAgrPie), 4, 0));
            AV26TFHreAgrPie_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFHreAgrPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFHreAgrPie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCLI") == 0 )
         {
            AV27TFHreAgrCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFHreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFHreAgrCli), 6, 0));
            AV28TFHreAgrCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFHreAgrCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFHreAgrCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER") == 0 )
         {
            AV29TFHreAgrSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFHreAgrSer", AV29TFHreAgrSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER_SEL") == 0 )
         {
            AV30TFHreAgrSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAgrSer_Sel", AV30TFHreAgrSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC") == 0 )
         {
            AV31TFHreAgrDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAgrDsc", AV31TFHreAgrDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC_SEL") == 0 )
         {
            AV32TFHreAgrDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAgrDsc_Sel", AV32TFHreAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL") == 0 )
         {
            AV33TFHreAgrCol = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAgrCol", AV33TFHreAgrCol);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL_SEL") == 0 )
         {
            AV34TFHreAgrCol_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAgrCol_Sel", AV34TFHreAgrCol_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNUMC") == 0 )
         {
            AV35TFHreAgrNumC = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAgrNumC), 6, 0));
            AV36TFHreAgrNumC_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAgrNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreAgrNumC_To), 6, 0));
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFHreAgrPar_Sel)==0), AV20TFHreAgrPar_Sel, GXv_char4) ;
      consultahisrag_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFHreAgrSer_Sel)==0), AV30TFHreAgrSer_Sel, GXv_char3) ;
      consultahisrag_wp_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFHreAgrDsc_Sel)==0), AV32TFHreAgrDsc_Sel, GXv_char2) ;
      consultahisrag_wp_impl.this.GXt_char9 = GXv_char2[0] ;
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFHreAgrCol_Sel)==0), AV34TFHreAgrCol_Sel, GXv_char11) ;
      consultahisrag_wp_impl.this.GXt_char10 = GXv_char11[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||||"+GXt_char8+"|"+GXt_char9+"|"+GXt_char10+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFHreAgrPar)==0), AV19TFHreAgrPar, GXv_char11) ;
      consultahisrag_wp_impl.this.GXt_char10 = GXv_char11[0] ;
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFHreAgrSer)==0), AV29TFHreAgrSer, GXv_char4) ;
      consultahisrag_wp_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFHreAgrDsc)==0), AV31TFHreAgrDsc, GXv_char3) ;
      consultahisrag_wp_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFHreAgrCol)==0), AV33TFHreAgrCol, GXv_char2) ;
      consultahisrag_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFHreAgrCod) ? "" : GXutil.str( AV15TFHreAgrCod, 8, 0))+"|"+((0==AV17TFHreAgrReo) ? "" : GXutil.str( AV17TFHreAgrReo, 1, 0))+"|"+GXt_char10+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV21TFHreAgrKgm)==0) ? "" : GXutil.str( AV21TFHreAgrKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFHreAgrMtr)==0) ? "" : GXutil.str( AV23TFHreAgrMtr, 9, 2))+"|"+((0==AV25TFHreAgrPie) ? "" : GXutil.str( AV25TFHreAgrPie, 4, 0))+"|"+((0==AV27TFHreAgrCli) ? "" : GXutil.str( AV27TFHreAgrCli, 6, 0))+"|"+GXt_char9+"|"+GXt_char8+"|"+GXt_char1+"|"+((0==AV35TFHreAgrNumC) ? "" : GXutil.str( AV35TFHreAgrNumC, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFHreAgrCod_To) ? "" : GXutil.str( AV16TFHreAgrCod_To, 8, 0))+"|"+((0==AV18TFHreAgrReo_To) ? "" : GXutil.str( AV18TFHreAgrReo_To, 1, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFHreAgrKgm_To)==0) ? "" : GXutil.str( AV22TFHreAgrKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFHreAgrMtr_To)==0) ? "" : GXutil.str( AV24TFHreAgrMtr_To, 9, 2))+"|"+((0==AV26TFHreAgrPie_To) ? "" : GXutil.str( AV26TFHreAgrPie_To, 4, 0))+"|"+((0==AV28TFHreAgrCli_To) ? "" : GXutil.str( AV28TFHreAgrCli_To, 6, 0))+"||||"+((0==AV36TFHreAgrNumC_To) ? "" : GXutil.str( AV36TFHreAgrNumC_To, 6, 0)) ;
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
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRCOD", "", !((0==AV15TFHreAgrCod)&&(0==AV16TFHreAgrCod_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFHreAgrCod, 8, 0)), GXutil.trim( GXutil.str( AV16TFHreAgrCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRREO", "", !((0==AV17TFHreAgrReo)&&(0==AV18TFHreAgrReo_To)), (short)(0), GXutil.trim( GXutil.str( AV17TFHreAgrReo, 1, 0)), GXutil.trim( GXutil.str( AV18TFHreAgrReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRPAR", "", !(GXutil.strcmp("", AV19TFHreAgrPar)==0), (short)(0), AV19TFHreAgrPar, "", !(GXutil.strcmp("", AV20TFHreAgrPar_Sel)==0), AV20TFHreAgrPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV21TFHreAgrKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFHreAgrKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV21TFHreAgrKgm, 9, 2)), GXutil.trim( GXutil.str( AV22TFHreAgrKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFHreAgrMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFHreAgrMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFHreAgrMtr, 9, 2)), GXutil.trim( GXutil.str( AV24TFHreAgrMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRPIE", "", !((0==AV25TFHreAgrPie)&&(0==AV26TFHreAgrPie_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFHreAgrPie, 4, 0)), GXutil.trim( GXutil.str( AV26TFHreAgrPie_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRCLI", "", !((0==AV27TFHreAgrCli)&&(0==AV28TFHreAgrCli_To)), (short)(0), GXutil.trim( GXutil.str( AV27TFHreAgrCli, 6, 0)), GXutil.trim( GXutil.str( AV28TFHreAgrCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRSER", "", !(GXutil.strcmp("", AV29TFHreAgrSer)==0), (short)(0), AV29TFHreAgrSer, "", !(GXutil.strcmp("", AV30TFHreAgrSer_Sel)==0), AV30TFHreAgrSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRDSC", "", !(GXutil.strcmp("", AV31TFHreAgrDsc)==0), (short)(0), AV31TFHreAgrDsc, "", !(GXutil.strcmp("", AV32TFHreAgrDsc_Sel)==0), AV32TFHreAgrDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRCOL", "", !(GXutil.strcmp("", AV33TFHreAgrCol)==0), (short)(0), AV33TFHreAgrCol, "", !(GXutil.strcmp("", AV34TFHreAgrCol_Sel)==0), AV34TFHreAgrCol_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFHREAGRNUMC", "", !((0==AV35TFHreAgrNumC)&&(0==AV36TFHreAgrNumC_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFHreAgrNumC, 6, 0)), GXutil.trim( GXutil.str( AV36TFHreAgrNumC_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV45HreBarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV45HreBarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV46HreBarReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46HreBarReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47HreBarPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47HreBarPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV48HreNumCie) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRENUMCIE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV48HreNumCie, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
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
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HISRAG" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV42EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "HreBarCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV45HreBarCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "HreBarReo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV46HreBarReo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "HreBarPar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV47HreBarPar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Hrenumcie" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV48HreNumCie, 2, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV42EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      AV45HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45HreBarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45HreBarCod), "ZZZZZZZ9")));
      AV46HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46HreBarReo", GXutil.str( AV46HreBarReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46HreBarReo), "9")));
      AV47HreBarPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47HreBarPar", AV47HreBarPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47HreBarPar, ""))));
      AV48HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48HreNumCie), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48HreNumCie), "Z9")));
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
      pa2BH2( ) ;
      ws2BH2( ) ;
      we2BH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116152730", true, true);
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
      httpContext.AddJavascriptSource("consultahisrag_wp.js", "?202682116152730", false, true);
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

   public void subsflControlProps_152( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_15_idx ;
      edtHreBarCod_Internalname = "HREBARCOD_"+sGXsfl_15_idx ;
      edtHreBarReo_Internalname = "HREBARREO_"+sGXsfl_15_idx ;
      edtHreBarPar_Internalname = "HREBARPAR_"+sGXsfl_15_idx ;
      edtHreNumCie_Internalname = "HRENUMCIE_"+sGXsfl_15_idx ;
      edtHreAgrCod_Internalname = "HREAGRCOD_"+sGXsfl_15_idx ;
      edtHreAgrReo_Internalname = "HREAGRREO_"+sGXsfl_15_idx ;
      edtHreAgrPar_Internalname = "HREAGRPAR_"+sGXsfl_15_idx ;
      edtHreAgrKgm_Internalname = "HREAGRKGM_"+sGXsfl_15_idx ;
      edtHreAgrMtr_Internalname = "HREAGRMTR_"+sGXsfl_15_idx ;
      edtHreAgrPie_Internalname = "HREAGRPIE_"+sGXsfl_15_idx ;
      edtHreAgrCli_Internalname = "HREAGRCLI_"+sGXsfl_15_idx ;
      edtHreAgrSer_Internalname = "HREAGRSER_"+sGXsfl_15_idx ;
      edtHreAgrDsc_Internalname = "HREAGRDSC_"+sGXsfl_15_idx ;
      edtHreAgrCol_Internalname = "HREAGRCOL_"+sGXsfl_15_idx ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC_"+sGXsfl_15_idx ;
   }

   public void subsflControlProps_fel_152( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_15_fel_idx ;
      edtHreBarCod_Internalname = "HREBARCOD_"+sGXsfl_15_fel_idx ;
      edtHreBarReo_Internalname = "HREBARREO_"+sGXsfl_15_fel_idx ;
      edtHreBarPar_Internalname = "HREBARPAR_"+sGXsfl_15_fel_idx ;
      edtHreNumCie_Internalname = "HRENUMCIE_"+sGXsfl_15_fel_idx ;
      edtHreAgrCod_Internalname = "HREAGRCOD_"+sGXsfl_15_fel_idx ;
      edtHreAgrReo_Internalname = "HREAGRREO_"+sGXsfl_15_fel_idx ;
      edtHreAgrPar_Internalname = "HREAGRPAR_"+sGXsfl_15_fel_idx ;
      edtHreAgrKgm_Internalname = "HREAGRKGM_"+sGXsfl_15_fel_idx ;
      edtHreAgrMtr_Internalname = "HREAGRMTR_"+sGXsfl_15_fel_idx ;
      edtHreAgrPie_Internalname = "HREAGRPIE_"+sGXsfl_15_fel_idx ;
      edtHreAgrCli_Internalname = "HREAGRCLI_"+sGXsfl_15_fel_idx ;
      edtHreAgrSer_Internalname = "HREAGRSER_"+sGXsfl_15_fel_idx ;
      edtHreAgrDsc_Internalname = "HREAGRDSC_"+sGXsfl_15_fel_idx ;
      edtHreAgrCol_Internalname = "HREAGRCOL_"+sGXsfl_15_fel_idx ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC_"+sGXsfl_15_fel_idx ;
   }

   public void sendrow_152( )
   {
      subsflControlProps_152( ) ;
      wb2BH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_15_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_15_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_15_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarPar_Internalname,GXutil.rtrim( A4494HreBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumCie_Internalname,GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumCie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4498HreAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrPar_Internalname,GXutil.rtrim( A4499HreAgrPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A4501HreAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrPie_Internalname,GXutil.ltrim( localUtil.ntoc( A4502HreAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrCli_Internalname,GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4503HreAgrCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrSer_Internalname,GXutil.rtrim( A4504HreAgrSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrDsc_Internalname,GXutil.rtrim( A4505HreAgrDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrCol_Internalname,GXutil.rtrim( A4506HreAgrCol),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrNumC_Internalname,GXutil.ltrim( localUtil.ntoc( A4507HreAgrNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4507HreAgrNumC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrNumC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2BH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_15_idx = ((subGrid_Islastpage==1)&&(nGXsfl_15_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      /* End function sendrow_152 */
   }

   public void startgridcontrol15( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"15\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Cierre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4494HreBarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4498HreAgrReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4499HreAgrPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4501HreAgrMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4502HreAgrPie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4504HreAgrSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4505HreAgrDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4506HreAgrCol));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4507HreAgrNumC, (byte)(6), (byte)(0), ".", "")));
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtHreBarCod_Internalname = "HREBARCOD" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      edtHreAgrCod_Internalname = "HREAGRCOD" ;
      edtHreAgrReo_Internalname = "HREAGRREO" ;
      edtHreAgrPar_Internalname = "HREAGRPAR" ;
      edtHreAgrKgm_Internalname = "HREAGRKGM" ;
      edtHreAgrMtr_Internalname = "HREAGRMTR" ;
      edtHreAgrPie_Internalname = "HREAGRPIE" ;
      edtHreAgrCli_Internalname = "HREAGRCLI" ;
      edtHreAgrSer_Internalname = "HREAGRSER" ;
      edtHreAgrDsc_Internalname = "HREAGRDSC" ;
      edtHreAgrCol_Internalname = "HREAGRCOL" ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC" ;
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
      edtHreAgrNumC_Jsonclick = "" ;
      edtHreAgrCol_Jsonclick = "" ;
      edtHreAgrDsc_Jsonclick = "" ;
      edtHreAgrSer_Jsonclick = "" ;
      edtHreAgrCli_Jsonclick = "" ;
      edtHreAgrPie_Jsonclick = "" ;
      edtHreAgrMtr_Jsonclick = "" ;
      edtHreAgrKgm_Jsonclick = "" ;
      edtHreAgrPar_Jsonclick = "" ;
      edtHreAgrReo_Jsonclick = "" ;
      edtHreAgrCod_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "ConsultaHisRag_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|||||Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "||T|||||T|T|T|" ;
      Ddo_grid_Filterisrange = "T|T||T|T|T|T||||T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "5:HreAgrCod|6:HreAgrReo|7:HreAgrPar|8:HreAgrKgm|9:HreAgrMtr|10:HreAgrPie|11:HreAgrCli|12:HreAgrSer|13:HreAgrDsc|14:HreAgrCol|15:HreAgrNumC" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Hdrs Agrupadas", "") );
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV52Consultahisrag_wpds_1_emprcod',fld:'vCONSULTAHISRAG_WPDS_1_EMPRCOD',pic:'@!'},{av:'AV53Consultahisrag_wpds_2_hrebarcod',fld:'vCONSULTAHISRAG_WPDS_2_HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV54Consultahisrag_wpds_3_hrebarreo',fld:'vCONSULTAHISRAG_WPDS_3_HREBARREO',pic:'9'},{av:'AV55Consultahisrag_wpds_4_hrebarpar',fld:'vCONSULTAHISRAG_WPDS_4_HREBARPAR',pic:''},{av:'AV56Consultahisrag_wpds_5_hrenumcie',fld:'vCONSULTAHISRAG_WPDS_5_HRENUMCIE',pic:'Z9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV46HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV47HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV48HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV15TFHreAgrCod',fld:'vTFHREAGRCOD',pic:'ZZZZZZZ9'},{av:'AV16TFHreAgrCod_To',fld:'vTFHREAGRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFHreAgrReo',fld:'vTFHREAGRREO',pic:'9'},{av:'AV18TFHreAgrReo_To',fld:'vTFHREAGRREO_TO',pic:'9'},{av:'AV19TFHreAgrPar',fld:'vTFHREAGRPAR',pic:''},{av:'AV20TFHreAgrPar_Sel',fld:'vTFHREAGRPAR_SEL',pic:''},{av:'AV21TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV22TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV23TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV24TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV25TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV26TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV27TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV28TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV29TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV30TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV31TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV32TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV33TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV34TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV35TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV36TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112BH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV46HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV47HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV48HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV15TFHreAgrCod',fld:'vTFHREAGRCOD',pic:'ZZZZZZZ9'},{av:'AV16TFHreAgrCod_To',fld:'vTFHREAGRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFHreAgrReo',fld:'vTFHREAGRREO',pic:'9'},{av:'AV18TFHreAgrReo_To',fld:'vTFHREAGRREO_TO',pic:'9'},{av:'AV19TFHreAgrPar',fld:'vTFHREAGRPAR',pic:''},{av:'AV20TFHreAgrPar_Sel',fld:'vTFHREAGRPAR_SEL',pic:''},{av:'AV21TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV22TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV23TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV24TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV25TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV26TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV27TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV28TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV29TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV30TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV31TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV32TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV33TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV34TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV35TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV36TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52Consultahisrag_wpds_1_emprcod',fld:'vCONSULTAHISRAG_WPDS_1_EMPRCOD',pic:'@!'},{av:'AV53Consultahisrag_wpds_2_hrebarcod',fld:'vCONSULTAHISRAG_WPDS_2_HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV54Consultahisrag_wpds_3_hrebarreo',fld:'vCONSULTAHISRAG_WPDS_3_HREBARREO',pic:'9'},{av:'AV55Consultahisrag_wpds_4_hrebarpar',fld:'vCONSULTAHISRAG_WPDS_4_HREBARPAR',pic:''},{av:'AV56Consultahisrag_wpds_5_hrenumcie',fld:'vCONSULTAHISRAG_WPDS_5_HRENUMCIE',pic:'Z9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122BH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV46HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV47HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV48HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV15TFHreAgrCod',fld:'vTFHREAGRCOD',pic:'ZZZZZZZ9'},{av:'AV16TFHreAgrCod_To',fld:'vTFHREAGRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFHreAgrReo',fld:'vTFHREAGRREO',pic:'9'},{av:'AV18TFHreAgrReo_To',fld:'vTFHREAGRREO_TO',pic:'9'},{av:'AV19TFHreAgrPar',fld:'vTFHREAGRPAR',pic:''},{av:'AV20TFHreAgrPar_Sel',fld:'vTFHREAGRPAR_SEL',pic:''},{av:'AV21TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV22TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV23TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV24TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV25TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV26TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV27TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV28TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV29TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV30TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV31TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV32TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV33TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV34TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV35TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV36TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52Consultahisrag_wpds_1_emprcod',fld:'vCONSULTAHISRAG_WPDS_1_EMPRCOD',pic:'@!'},{av:'AV53Consultahisrag_wpds_2_hrebarcod',fld:'vCONSULTAHISRAG_WPDS_2_HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV54Consultahisrag_wpds_3_hrebarreo',fld:'vCONSULTAHISRAG_WPDS_3_HREBARREO',pic:'9'},{av:'AV55Consultahisrag_wpds_4_hrebarpar',fld:'vCONSULTAHISRAG_WPDS_4_HREBARPAR',pic:''},{av:'AV56Consultahisrag_wpds_5_hrenumcie',fld:'vCONSULTAHISRAG_WPDS_5_HRENUMCIE',pic:'Z9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132BH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV46HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV47HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV48HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV15TFHreAgrCod',fld:'vTFHREAGRCOD',pic:'ZZZZZZZ9'},{av:'AV16TFHreAgrCod_To',fld:'vTFHREAGRCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFHreAgrReo',fld:'vTFHREAGRREO',pic:'9'},{av:'AV18TFHreAgrReo_To',fld:'vTFHREAGRREO_TO',pic:'9'},{av:'AV19TFHreAgrPar',fld:'vTFHREAGRPAR',pic:''},{av:'AV20TFHreAgrPar_Sel',fld:'vTFHREAGRPAR_SEL',pic:''},{av:'AV21TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV22TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV23TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV24TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV25TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV26TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV27TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV28TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV29TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV30TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV31TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV32TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV33TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV34TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV35TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV36TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52Consultahisrag_wpds_1_emprcod',fld:'vCONSULTAHISRAG_WPDS_1_EMPRCOD',pic:'@!'},{av:'AV53Consultahisrag_wpds_2_hrebarcod',fld:'vCONSULTAHISRAG_WPDS_2_HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV54Consultahisrag_wpds_3_hrebarreo',fld:'vCONSULTAHISRAG_WPDS_3_HREBARREO',pic:'9'},{av:'AV55Consultahisrag_wpds_4_hrebarpar',fld:'vCONSULTAHISRAG_WPDS_4_HREBARPAR',pic:''},{av:'AV56Consultahisrag_wpds_5_hrenumcie',fld:'vCONSULTAHISRAG_WPDS_5_HRENUMCIE',pic:'Z9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV35TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV36TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV33TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV34TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV31TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV32TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV29TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV30TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV27TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV28TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV26TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV23TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV24TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV21TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV22TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV19TFHreAgrPar',fld:'vTFHREAGRPAR',pic:''},{av:'AV20TFHreAgrPar_Sel',fld:'vTFHREAGRPAR_SEL',pic:''},{av:'AV17TFHreAgrReo',fld:'vTFHREAGRREO',pic:'9'},{av:'AV18TFHreAgrReo_To',fld:'vTFHREAGRREO_TO',pic:'9'},{av:'AV15TFHreAgrCod',fld:'vTFHREAGRCOD',pic:'ZZZZZZZ9'},{av:'AV16TFHreAgrCod_To',fld:'vTFHREAGRCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e162BH2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hreagrnumc',iparms:[]");
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
      wcpOAV42EmprCod = "" ;
      wcpOAV47HreBarPar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV42EmprCod = "" ;
      AV47HreBarPar = "" ;
      AV19TFHreAgrPar = "" ;
      AV20TFHreAgrPar_Sel = "" ;
      AV21TFHreAgrKgm = DecimalUtil.ZERO ;
      AV22TFHreAgrKgm_To = DecimalUtil.ZERO ;
      AV23TFHreAgrMtr = DecimalUtil.ZERO ;
      AV24TFHreAgrMtr_To = DecimalUtil.ZERO ;
      AV29TFHreAgrSer = "" ;
      AV30TFHreAgrSer_Sel = "" ;
      AV31TFHreAgrDsc = "" ;
      AV32TFHreAgrDsc_Sel = "" ;
      AV33TFHreAgrCol = "" ;
      AV34TFHreAgrCol_Sel = "" ;
      AV51Pgmname = "" ;
      AV52Consultahisrag_wpds_1_emprcod = "" ;
      AV55Consultahisrag_wpds_4_hrebarpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV37DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
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
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A4499HreAgrPar = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      scmdbuf = "" ;
      lV61Consultahisrag_wpds_10_tfhreagrpar = "" ;
      lV71Consultahisrag_wpds_20_tfhreagrser = "" ;
      lV73Consultahisrag_wpds_22_tfhreagrdsc = "" ;
      lV75Consultahisrag_wpds_24_tfhreagrcol = "" ;
      AV62Consultahisrag_wpds_11_tfhreagrpar_sel = "" ;
      AV61Consultahisrag_wpds_10_tfhreagrpar = "" ;
      AV63Consultahisrag_wpds_12_tfhreagrkgm = DecimalUtil.ZERO ;
      AV64Consultahisrag_wpds_13_tfhreagrkgm_to = DecimalUtil.ZERO ;
      AV65Consultahisrag_wpds_14_tfhreagrmtr = DecimalUtil.ZERO ;
      AV66Consultahisrag_wpds_15_tfhreagrmtr_to = DecimalUtil.ZERO ;
      AV72Consultahisrag_wpds_21_tfhreagrser_sel = "" ;
      AV71Consultahisrag_wpds_20_tfhreagrser = "" ;
      AV74Consultahisrag_wpds_23_tfhreagrdsc_sel = "" ;
      AV73Consultahisrag_wpds_22_tfhreagrdsc = "" ;
      AV76Consultahisrag_wpds_25_tfhreagrcol_sel = "" ;
      AV75Consultahisrag_wpds_24_tfhreagrcol = "" ;
      H02BH2_A4507HreAgrNumC = new int[1] ;
      H02BH2_A4506HreAgrCol = new String[] {""} ;
      H02BH2_A4505HreAgrDsc = new String[] {""} ;
      H02BH2_A4504HreAgrSer = new String[] {""} ;
      H02BH2_A4503HreAgrCli = new int[1] ;
      H02BH2_A4502HreAgrPie = new short[1] ;
      H02BH2_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BH2_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BH2_A4499HreAgrPar = new String[] {""} ;
      H02BH2_A4498HreAgrReo = new byte[1] ;
      H02BH2_A4497HreAgrCod = new int[1] ;
      H02BH2_A4495HreNumCie = new byte[1] ;
      H02BH2_A4494HreBarPar = new String[] {""} ;
      H02BH2_A4493HreBarReo = new byte[1] ;
      H02BH2_A4492HreBarCod = new int[1] ;
      H02BH2_A396EmprCod = new String[] {""} ;
      H02BH3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV41Station = "" ;
      AV43EmprNom = "" ;
      AV44UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char10 = "" ;
      GXv_char11 = new String[1] ;
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultahisrag_wp__default(),
         new Object[] {
             new Object[] {
            H02BH2_A4507HreAgrNumC, H02BH2_A4506HreAgrCol, H02BH2_A4505HreAgrDsc, H02BH2_A4504HreAgrSer, H02BH2_A4503HreAgrCli, H02BH2_A4502HreAgrPie, H02BH2_A4501HreAgrMtr, H02BH2_A4500HreAgrKgm, H02BH2_A4499HreAgrPar, H02BH2_A4498HreAgrReo,
            H02BH2_A4497HreAgrCod, H02BH2_A4495HreNumCie, H02BH2_A4494HreBarPar, H02BH2_A4493HreBarReo, H02BH2_A4492HreBarCod, H02BH2_A396EmprCod
            }
            , new Object[] {
            H02BH3_AGRID_nRecordCount
            }
         }
      );
      AV51Pgmname = "ConsultaHisRag_WP" ;
      /* GeneXus formulas. */
      AV51Pgmname = "ConsultaHisRag_WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV46HreBarReo ;
   private byte wcpOAV48HreNumCie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV46HreBarReo ;
   private byte AV48HreNumCie ;
   private byte AV17TFHreAgrReo ;
   private byte AV18TFHreAgrReo_To ;
   private byte AV54Consultahisrag_wpds_3_hrebarreo ;
   private byte AV56Consultahisrag_wpds_5_hrenumcie ;
   private byte gxajaxcallmode ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4498HreAgrReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV59Consultahisrag_wpds_8_tfhreagrreo ;
   private byte AV60Consultahisrag_wpds_9_tfhreagrreo_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV25TFHreAgrPie ;
   private short AV26TFHreAgrPie_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A4502HreAgrPie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV67Consultahisrag_wpds_16_tfhreagrpie ;
   private short AV68Consultahisrag_wpds_17_tfhreagrpie_to ;
   private int wcpOAV45HreBarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_15 ;
   private int AV45HreBarCod ;
   private int nGXsfl_15_idx=1 ;
   private int AV15TFHreAgrCod ;
   private int AV16TFHreAgrCod_To ;
   private int AV27TFHreAgrCli ;
   private int AV28TFHreAgrCli_To ;
   private int AV35TFHreAgrNumC ;
   private int AV36TFHreAgrNumC_To ;
   private int AV53Consultahisrag_wpds_2_hrebarcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A4492HreBarCod ;
   private int A4497HreAgrCod ;
   private int A4503HreAgrCli ;
   private int A4507HreAgrNumC ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV57Consultahisrag_wpds_6_tfhreagrcod ;
   private int AV58Consultahisrag_wpds_7_tfhreagrcod_to ;
   private int AV69Consultahisrag_wpds_18_tfhreagrcli ;
   private int AV70Consultahisrag_wpds_19_tfhreagrcli_to ;
   private int AV77Consultahisrag_wpds_26_tfhreagrnumc ;
   private int AV78Consultahisrag_wpds_27_tfhreagrnumc_to ;
   private int AV38PageToGo ;
   private int AV79GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV39GridCurrentPage ;
   private long AV40GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV21TFHreAgrKgm ;
   private java.math.BigDecimal AV22TFHreAgrKgm_To ;
   private java.math.BigDecimal AV23TFHreAgrMtr ;
   private java.math.BigDecimal AV24TFHreAgrMtr_To ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private java.math.BigDecimal AV63Consultahisrag_wpds_12_tfhreagrkgm ;
   private java.math.BigDecimal AV64Consultahisrag_wpds_13_tfhreagrkgm_to ;
   private java.math.BigDecimal AV65Consultahisrag_wpds_14_tfhreagrmtr ;
   private java.math.BigDecimal AV66Consultahisrag_wpds_15_tfhreagrmtr_to ;
   private String wcpOAV42EmprCod ;
   private String wcpOAV47HreBarPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV42EmprCod ;
   private String AV47HreBarPar ;
   private String sGXsfl_15_idx="0001" ;
   private String AV19TFHreAgrPar ;
   private String AV20TFHreAgrPar_Sel ;
   private String AV29TFHreAgrSer ;
   private String AV30TFHreAgrSer_Sel ;
   private String AV31TFHreAgrDsc ;
   private String AV32TFHreAgrDsc_Sel ;
   private String AV33TFHreAgrCol ;
   private String AV34TFHreAgrCol_Sel ;
   private String AV51Pgmname ;
   private String AV52Consultahisrag_wpds_1_emprcod ;
   private String AV55Consultahisrag_wpds_4_hrebarpar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtHreBarCod_Internalname ;
   private String edtHreBarReo_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Internalname ;
   private String edtHreNumCie_Internalname ;
   private String edtHreAgrCod_Internalname ;
   private String edtHreAgrReo_Internalname ;
   private String A4499HreAgrPar ;
   private String edtHreAgrPar_Internalname ;
   private String edtHreAgrKgm_Internalname ;
   private String edtHreAgrMtr_Internalname ;
   private String edtHreAgrPie_Internalname ;
   private String edtHreAgrCli_Internalname ;
   private String A4504HreAgrSer ;
   private String edtHreAgrSer_Internalname ;
   private String A4505HreAgrDsc ;
   private String edtHreAgrDsc_Internalname ;
   private String A4506HreAgrCol ;
   private String edtHreAgrCol_Internalname ;
   private String edtHreAgrNumC_Internalname ;
   private String scmdbuf ;
   private String lV61Consultahisrag_wpds_10_tfhreagrpar ;
   private String lV71Consultahisrag_wpds_20_tfhreagrser ;
   private String lV73Consultahisrag_wpds_22_tfhreagrdsc ;
   private String lV75Consultahisrag_wpds_24_tfhreagrcol ;
   private String AV62Consultahisrag_wpds_11_tfhreagrpar_sel ;
   private String AV61Consultahisrag_wpds_10_tfhreagrpar ;
   private String AV72Consultahisrag_wpds_21_tfhreagrser_sel ;
   private String AV71Consultahisrag_wpds_20_tfhreagrser ;
   private String AV74Consultahisrag_wpds_23_tfhreagrdsc_sel ;
   private String AV73Consultahisrag_wpds_22_tfhreagrdsc ;
   private String AV76Consultahisrag_wpds_25_tfhreagrcol_sel ;
   private String AV75Consultahisrag_wpds_24_tfhreagrcol ;
   private String hsh ;
   private String AV41Station ;
   private String AV43EmprNom ;
   private String AV44UsurCod ;
   private String GXt_char10 ;
   private String GXv_char11[] ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sGXsfl_15_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Jsonclick ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreAgrCod_Jsonclick ;
   private String edtHreAgrReo_Jsonclick ;
   private String edtHreAgrPar_Jsonclick ;
   private String edtHreAgrKgm_Jsonclick ;
   private String edtHreAgrMtr_Jsonclick ;
   private String edtHreAgrPie_Jsonclick ;
   private String edtHreAgrCli_Jsonclick ;
   private String edtHreAgrSer_Jsonclick ;
   private String edtHreAgrDsc_Jsonclick ;
   private String edtHreAgrCol_Jsonclick ;
   private String edtHreAgrNumC_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_15_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] H02BH2_A4507HreAgrNumC ;
   private String[] H02BH2_A4506HreAgrCol ;
   private String[] H02BH2_A4505HreAgrDsc ;
   private String[] H02BH2_A4504HreAgrSer ;
   private int[] H02BH2_A4503HreAgrCli ;
   private short[] H02BH2_A4502HreAgrPie ;
   private java.math.BigDecimal[] H02BH2_A4501HreAgrMtr ;
   private java.math.BigDecimal[] H02BH2_A4500HreAgrKgm ;
   private String[] H02BH2_A4499HreAgrPar ;
   private byte[] H02BH2_A4498HreAgrReo ;
   private int[] H02BH2_A4497HreAgrCod ;
   private byte[] H02BH2_A4495HreNumCie ;
   private String[] H02BH2_A4494HreBarPar ;
   private byte[] H02BH2_A4493HreBarReo ;
   private int[] H02BH2_A4492HreBarCod ;
   private String[] H02BH2_A396EmprCod ;
   private long[] H02BH3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV37DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultahisrag_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02BH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV57Consultahisrag_wpds_6_tfhreagrcod ,
                                          int AV58Consultahisrag_wpds_7_tfhreagrcod_to ,
                                          byte AV59Consultahisrag_wpds_8_tfhreagrreo ,
                                          byte AV60Consultahisrag_wpds_9_tfhreagrreo_to ,
                                          String AV62Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                          String AV61Consultahisrag_wpds_10_tfhreagrpar ,
                                          java.math.BigDecimal AV63Consultahisrag_wpds_12_tfhreagrkgm ,
                                          java.math.BigDecimal AV64Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV65Consultahisrag_wpds_14_tfhreagrmtr ,
                                          java.math.BigDecimal AV66Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                          short AV67Consultahisrag_wpds_16_tfhreagrpie ,
                                          short AV68Consultahisrag_wpds_17_tfhreagrpie_to ,
                                          int AV69Consultahisrag_wpds_18_tfhreagrcli ,
                                          int AV70Consultahisrag_wpds_19_tfhreagrcli_to ,
                                          String AV72Consultahisrag_wpds_21_tfhreagrser_sel ,
                                          String AV71Consultahisrag_wpds_20_tfhreagrser ,
                                          String AV74Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                          String AV73Consultahisrag_wpds_22_tfhreagrdsc ,
                                          String AV76Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                          String AV75Consultahisrag_wpds_24_tfhreagrcol ,
                                          int AV77Consultahisrag_wpds_26_tfhreagrnumc ,
                                          int AV78Consultahisrag_wpds_27_tfhreagrnumc_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          int A4503HreAgrCli ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV45HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV46HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV47HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV48HreNumCie ,
                                          String AV52Consultahisrag_wpds_1_emprcod ,
                                          int AV53Consultahisrag_wpds_2_hrebarcod ,
                                          byte AV54Consultahisrag_wpds_3_hrebarreo ,
                                          String AV55Consultahisrag_wpds_4_hrebarpar ,
                                          byte AV56Consultahisrag_wpds_5_hrenumcie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[37];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrSer, HreAgrCli, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrPar, HreAgrReo, HreAgrCod, HreNumCie, HreBarPar, HreBarReo, HreBarCod," ;
      sSelectString += " EmprCod" ;
      sFromString = " FROM TXPHISRAG" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (0==AV57Consultahisrag_wpds_6_tfhreagrcod) )
      {
         addWhere(sWhereString, "(HreAgrCod >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Consultahisrag_wpds_7_tfhreagrcod_to) )
      {
         addWhere(sWhereString, "(HreAgrCod <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Consultahisrag_wpds_8_tfhreagrreo) )
      {
         addWhere(sWhereString, "(HreAgrReo >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Consultahisrag_wpds_9_tfhreagrreo_to) )
      {
         addWhere(sWhereString, "(HreAgrReo <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Consultahisrag_wpds_11_tfhreagrpar_sel)==0) && ( ! (GXutil.strcmp("", AV61Consultahisrag_wpds_10_tfhreagrpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Consultahisrag_wpds_11_tfhreagrpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrPar = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Consultahisrag_wpds_12_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Consultahisrag_wpds_13_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Consultahisrag_wpds_14_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Consultahisrag_wpds_15_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Consultahisrag_wpds_16_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Consultahisrag_wpds_17_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Consultahisrag_wpds_18_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Consultahisrag_wpds_19_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Consultahisrag_wpds_21_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV71Consultahisrag_wpds_20_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Consultahisrag_wpds_21_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahisrag_wpds_22_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Consultahisrag_wpds_25_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV75Consultahisrag_wpds_24_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Consultahisrag_wpds_25_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultahisrag_wpds_26_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV78Consultahisrag_wpds_27_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrReo" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrPar" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrKgm" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrMtr" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrPie" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrPie DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCli" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrSer" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCol" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrNumC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreAgrNumC DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H02BH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV57Consultahisrag_wpds_6_tfhreagrcod ,
                                          int AV58Consultahisrag_wpds_7_tfhreagrcod_to ,
                                          byte AV59Consultahisrag_wpds_8_tfhreagrreo ,
                                          byte AV60Consultahisrag_wpds_9_tfhreagrreo_to ,
                                          String AV62Consultahisrag_wpds_11_tfhreagrpar_sel ,
                                          String AV61Consultahisrag_wpds_10_tfhreagrpar ,
                                          java.math.BigDecimal AV63Consultahisrag_wpds_12_tfhreagrkgm ,
                                          java.math.BigDecimal AV64Consultahisrag_wpds_13_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV65Consultahisrag_wpds_14_tfhreagrmtr ,
                                          java.math.BigDecimal AV66Consultahisrag_wpds_15_tfhreagrmtr_to ,
                                          short AV67Consultahisrag_wpds_16_tfhreagrpie ,
                                          short AV68Consultahisrag_wpds_17_tfhreagrpie_to ,
                                          int AV69Consultahisrag_wpds_18_tfhreagrcli ,
                                          int AV70Consultahisrag_wpds_19_tfhreagrcli_to ,
                                          String AV72Consultahisrag_wpds_21_tfhreagrser_sel ,
                                          String AV71Consultahisrag_wpds_20_tfhreagrser ,
                                          String AV74Consultahisrag_wpds_23_tfhreagrdsc_sel ,
                                          String AV73Consultahisrag_wpds_22_tfhreagrdsc ,
                                          String AV76Consultahisrag_wpds_25_tfhreagrcol_sel ,
                                          String AV75Consultahisrag_wpds_24_tfhreagrcol ,
                                          int AV77Consultahisrag_wpds_26_tfhreagrnumc ,
                                          int AV78Consultahisrag_wpds_27_tfhreagrnumc_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          int A4503HreAgrCli ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV45HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV46HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV47HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV48HreNumCie ,
                                          String AV52Consultahisrag_wpds_1_emprcod ,
                                          int AV53Consultahisrag_wpds_2_hrebarcod ,
                                          byte AV54Consultahisrag_wpds_3_hrebarreo ,
                                          String AV55Consultahisrag_wpds_4_hrebarpar ,
                                          byte AV56Consultahisrag_wpds_5_hrenumcie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[32];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      if ( ! (0==AV57Consultahisrag_wpds_6_tfhreagrcod) )
      {
         addWhere(sWhereString, "(HreAgrCod >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Consultahisrag_wpds_7_tfhreagrcod_to) )
      {
         addWhere(sWhereString, "(HreAgrCod <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Consultahisrag_wpds_8_tfhreagrreo) )
      {
         addWhere(sWhereString, "(HreAgrReo >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Consultahisrag_wpds_9_tfhreagrreo_to) )
      {
         addWhere(sWhereString, "(HreAgrReo <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Consultahisrag_wpds_11_tfhreagrpar_sel)==0) && ( ! (GXutil.strcmp("", AV61Consultahisrag_wpds_10_tfhreagrpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Consultahisrag_wpds_11_tfhreagrpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrPar = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Consultahisrag_wpds_12_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Consultahisrag_wpds_13_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Consultahisrag_wpds_14_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Consultahisrag_wpds_15_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Consultahisrag_wpds_16_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Consultahisrag_wpds_17_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Consultahisrag_wpds_18_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Consultahisrag_wpds_19_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Consultahisrag_wpds_21_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV71Consultahisrag_wpds_20_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Consultahisrag_wpds_21_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahisrag_wpds_22_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahisrag_wpds_23_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Consultahisrag_wpds_25_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV75Consultahisrag_wpds_24_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Consultahisrag_wpds_25_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultahisrag_wpds_26_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV78Consultahisrag_wpds_27_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
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
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_H02BH2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() );
            case 1 :
                  return conditional_H02BH3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
      }
   }

}

