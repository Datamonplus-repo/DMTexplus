package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpenmd_wp_impl extends GXDataArea
{
   public tpenmd_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpenmd_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_wp_impl.class ));
   }

   public tpenmd_wp_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
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
            AV41emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41emprcod", AV41emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
               AV15CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15CliNom", AV15CliNom);
               AV45PMDPreLimIN = CommonUtil.decimalVal( httpContext.GetPar( "PMDPreLimIN"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45PMDPreLimIN", GXutil.ltrimstr( AV45PMDPreLimIN, 7, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPRELIMIN", getSecureSignedToken( "", localUtil.format( AV45PMDPreLimIN, "Z,ZZ9.99 €")));
               AV46PMDPreMinIN = CommonUtil.decimalVal( httpContext.GetPar( "PMDPreMinIN"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46PMDPreMinIN", GXutil.ltrimstr( AV46PMDPreMinIN, 7, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPREMININ", getSecureSignedToken( "", localUtil.format( AV46PMDPreMinIN, "Z,ZZ9.99 €")));
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
      nRC_GXsfl_99 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_99"))) ;
      nGXsfl_99_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_99_idx"))) ;
      sGXsfl_99_idx = httpContext.GetPar( "sGXsfl_99_idx") ;
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
      AV41emprcod = httpContext.GetPar( "emprcod") ;
      AV14CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV19TFPMDLin = (short)(GXutil.lval( httpContext.GetPar( "TFPMDLin"))) ;
      AV20TFPMDLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFPMDLin_To"))) ;
      AV21TFPMDKgmMin = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDKgmMin"), ".") ;
      AV22TFPMDKgmMin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDKgmMin_To"), ".") ;
      AV23TFPMDKgmMax = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDKgmMax"), ".") ;
      AV24TFPMDKgmMax_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDKgmMax_To"), ".") ;
      AV25TFPMDTinPrc = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDTinPrc"), ".") ;
      AV26TFPMDTinPrc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDTinPrc_To"), ".") ;
      AV27TFPMDAcaPrc = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDAcaPrc"), ".") ;
      AV28TFPMDAcaPrc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDAcaPrc_To"), ".") ;
      AV29TFPMDKgmMinS = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDKgmMinS"), ".") ;
      AV30TFPMDKgmMinS_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDKgmMinS_To"), ".") ;
      AV50Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV45PMDPreLimIN = CommonUtil.decimalVal( httpContext.GetPar( "PMDPreLimIN"), ".") ;
      AV46PMDPreMinIN = CommonUtil.decimalVal( httpContext.GetPar( "PMDPreMinIN"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41emprcod, AV14CliCod, AV19TFPMDLin, AV20TFPMDLin_To, AV21TFPMDKgmMin, AV22TFPMDKgmMin_To, AV23TFPMDKgmMax, AV24TFPMDKgmMax_To, AV25TFPMDTinPrc, AV26TFPMDTinPrc_To, AV27TFPMDAcaPrc, AV28TFPMDAcaPrc_To, AV29TFPMDKgmMinS, AV30TFPMDKgmMinS_To, AV50Pgmname, AV12OrderedBy, AV13OrderedDsc, AV45PMDPreLimIN, AV46PMDPreMinIN, A396EmprCod, A252CliCod) ;
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
      pa2BC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tpenmd_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV41emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15CliNom)),GXutil.URLEncode(DecimalUtil.decToString(AV45PMDPreLimIN)),GXutil.URLEncode(DecimalUtil.decToString(AV46PMDPreMinIN))}, new String[] {"emprcod","CliCod","CliNom","PMDPreLimIN","PMDPreMinIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPRELIMIN", getSecureSignedToken( "", localUtil.format( AV45PMDPreLimIN, "Z,ZZ9.99 €")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPREMININ", getSecureSignedToken( "", localUtil.format( AV46PMDPreMinIN, "Z,ZZ9.99 €")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPenMD_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV50Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tpenmd_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_99", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_99, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV33GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV34GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDLIN", GXutil.ltrim( localUtil.ntoc( AV19TFPMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV20TFPMDLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDKGMMIN", GXutil.ltrim( localUtil.ntoc( AV21TFPMDKgmMin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDKGMMIN_TO", GXutil.ltrim( localUtil.ntoc( AV22TFPMDKgmMin_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDKGMMAX", GXutil.ltrim( localUtil.ntoc( AV23TFPMDKgmMax, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDKGMMAX_TO", GXutil.ltrim( localUtil.ntoc( AV24TFPMDKgmMax_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDTINPRC", GXutil.ltrim( localUtil.ntoc( AV25TFPMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDTINPRC_TO", GXutil.ltrim( localUtil.ntoc( AV26TFPMDTinPrc_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDACAPRC", GXutil.ltrim( localUtil.ntoc( AV27TFPMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDACAPRC_TO", GXutil.ltrim( localUtil.ntoc( AV28TFPMDAcaPrc_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDKGMMINS", GXutil.ltrim( localUtil.ntoc( AV29TFPMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDKGMMINS_TO", GXutil.ltrim( localUtil.ntoc( AV30TFPMDKgmMinS_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDPRELIMIN", GXutil.ltrim( localUtil.ntoc( AV45PMDPreLimIN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPRELIMIN", getSecureSignedToken( "", localUtil.format( AV45PMDPreLimIN, "Z,ZZ9.99 €")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDPREMININ", GXutil.ltrim( localUtil.ntoc( AV46PMDPreMinIN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPREMININ", getSecureSignedToken( "", localUtil.format( AV46PMDPreMinIN, "Z,ZZ9.99 €")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV63Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV64Clicod_selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDLIN_SELECTED", GXutil.ltrim( localUtil.ntoc( AV65Pmdlin_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we2BC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BC2( ) ;
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
      return formatLink("app.facturacion.tpenmd_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV41emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15CliNom)),GXutil.URLEncode(DecimalUtil.decToString(AV45PMDPreLimIN)),GXutil.URLEncode(DecimalUtil.decToString(AV46PMDPreMinIN))}, new String[] {"emprcod","CliCod","CliNom","PMDPreLimIN","PMDPreMinIN"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TPenMD_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Penalizaciones", "") ;
   }

   public void wb2BC0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV15CliNom), GXutil.rtrim( localUtil.format( AV15CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdprelim_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdprelim_Internalname, httpContext.getMessage( "Preço Total : <", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdprelim_Internalname, GXutil.ltrim( localUtil.ntoc( AV16PMDPreLim, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdprelim_Enabled!=0) ? localUtil.format( AV16PMDPreLim, "Z,ZZ9.99 €") : localUtil.format( AV16PMDPreLim, "Z,ZZ9.99 €"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdprelim_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdprelim_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdpremin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdpremin_Internalname, httpContext.getMessage( "Aplicar o valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdpremin_Internalname, GXutil.ltrim( localUtil.ntoc( AV17PMDPreMin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdpremin_Enabled!=0) ? localUtil.format( AV17PMDPreMin, "Z,ZZ9.99 €") : localUtil.format( AV17PMDPreMin, "Z,ZZ9.99 €"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdpremin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdpremin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdlin_Internalname, "#", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV35PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35PMDLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35PMDLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdkgmmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdkgmmin_Internalname, httpContext.getMessage( "de (kg)", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdkgmmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV36PMDKgmMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdkgmmin_Enabled!=0) ? localUtil.format( AV36PMDKgmMin, "Z,ZZ9.99 KG") : localUtil.format( AV36PMDKgmMin, "Z,ZZ9.99 KG"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdkgmmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdkgmmin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdkgmmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdkgmmax_Internalname, httpContext.getMessage( "a (kg)", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdkgmmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV37PMDKgmMax, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdkgmmax_Enabled!=0) ? localUtil.format( AV37PMDKgmMax, "Z,ZZ9.99 KG") : localUtil.format( AV37PMDKgmMax, "Z,ZZ9.99 KG"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdkgmmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdkgmmax_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdtinprc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdtinprc_Internalname, httpContext.getMessage( "Penalização T.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdtinprc_Internalname, GXutil.ltrim( localUtil.ntoc( AV38PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdtinprc_Enabled!=0) ? localUtil.format( AV38PMDTinPrc, "ZZ9.99") : localUtil.format( AV38PMDTinPrc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdtinprc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdtinprc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdacaprc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdacaprc_Internalname, httpContext.getMessage( "Penalizaçao A.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdacaprc_Internalname, GXutil.ltrim( localUtil.ntoc( AV39PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdacaprc_Enabled!=0) ? localUtil.format( AV39PMDAcaPrc, "ZZ9.99") : localUtil.format( AV39PMDAcaPrc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdacaprc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdacaprc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdkgmmins_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdkgmmins_Internalname, httpContext.getMessage( "Kgs.Min.Saída", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdkgmmins_Internalname, GXutil.ltrim( localUtil.ntoc( AV40PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdkgmmins_Enabled!=0) ? localUtil.format( AV40PMDKgmMinS, "ZZZ9.99") : localUtil.format( AV40PMDKgmMinS, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdkgmmins_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdkgmmins_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar Linea", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiearvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiearvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIEARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD_WP.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TPenMD_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol99( ) ;
      }
      if ( wbEnd == 99 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_99 = (int)(nGXsfl_99_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV33GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV34GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV50Pgmname), GXutil.rtrim( localUtil.format( AV50Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_121_2BC2( true) ;
      }
      else
      {
         wb_table1_121_2BC2( false) ;
      }
      return  ;
   }

   public void wb_table1_121_2BC2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 99 )
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

   public void start2BC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Penalizaciones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BC0( ) ;
   }

   public void ws2BC2( )
   {
      start2BC2( ) ;
      evt2BC2( ) ;
   }

   public void evt2BC2( )
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
                           e112BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIEARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiearvariables' */
                           e152BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e162BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e172BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPMDLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182BC2 ();
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
                                 e192BC2 ();
                              }
                              dynload_actions( ) ;
                           }
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_99_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_992( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV47GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
                           A8403PMDLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A8404PMDKgmMin = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)) ;
                           A8405PMDKgmMax = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)) ;
                           A8406PMDTinPrc = localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)) ;
                           A8407PMDAcaPrc = localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)) ;
                           A8408PMDKgmMinS = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222BC2 ();
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

   public void we2BC2( )
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

   public void pa2BC2( )
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
            GX_FocusControl = edtavPmdprelim_Internalname ;
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
      subsflControlProps_992( ) ;
      while ( nGXsfl_99_idx <= nRC_GXsfl_99 )
      {
         sendrow_992( ) ;
         nGXsfl_99_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV41emprcod ,
                                 int AV14CliCod ,
                                 short AV19TFPMDLin ,
                                 short AV20TFPMDLin_To ,
                                 java.math.BigDecimal AV21TFPMDKgmMin ,
                                 java.math.BigDecimal AV22TFPMDKgmMin_To ,
                                 java.math.BigDecimal AV23TFPMDKgmMax ,
                                 java.math.BigDecimal AV24TFPMDKgmMax_To ,
                                 java.math.BigDecimal AV25TFPMDTinPrc ,
                                 java.math.BigDecimal AV26TFPMDTinPrc_To ,
                                 java.math.BigDecimal AV27TFPMDAcaPrc ,
                                 java.math.BigDecimal AV28TFPMDAcaPrc_To ,
                                 java.math.BigDecimal AV29TFPMDKgmMinS ,
                                 java.math.BigDecimal AV30TFPMDKgmMinS_To ,
                                 String AV50Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV45PMDPreLimIN ,
                                 java.math.BigDecimal AV46PMDPreMinIN ,
                                 String A396EmprCod ,
                                 int A252CliCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212BC2 ();
      GRID_nCurrentRecord = 0 ;
      rf2BC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPenMD_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV50Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tpenmd_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A8403PMDLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDLIN", GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), ".", "")));
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
      rf2BC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV50Pgmname = "Facturacion.TPenMD_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(99) ;
      /* Execute user event: Refresh */
      e212BC2 ();
      nGXsfl_99_idx = 1 ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_992( ) ;
      bGXsfl_99_Refreshing = true ;
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
         subsflControlProps_992( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV51Facturacion_tpenmd_wpds_1_tfpmdlin) ,
                                              Short.valueOf(AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to) ,
                                              AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin ,
                                              AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to ,
                                              AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax ,
                                              AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to ,
                                              AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc ,
                                              AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to ,
                                              AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc ,
                                              AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to ,
                                              AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins ,
                                              AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to ,
                                              Short.valueOf(A8403PMDLin) ,
                                              A8404PMDKgmMin ,
                                              A8405PMDKgmMax ,
                                              A8406PMDTinPrc ,
                                              A8407PMDAcaPrc ,
                                              A8408PMDKgmMinS ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV41emprcod ,
                                              Integer.valueOf(AV14CliCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor H02BC2 */
         pr_default.execute(0, new Object[] {AV41emprcod, Integer.valueOf(AV14CliCod), Short.valueOf(AV51Facturacion_tpenmd_wpds_1_tfpmdlin), Short.valueOf(AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to), AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin, AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to, AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax, AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to, AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc, AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to, AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc, AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to, AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins, AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_99_idx = 1 ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02BC2_A396EmprCod[0] ;
            A252CliCod = H02BC2_A252CliCod[0] ;
            A8408PMDKgmMinS = H02BC2_A8408PMDKgmMinS[0] ;
            A8407PMDAcaPrc = H02BC2_A8407PMDAcaPrc[0] ;
            A8406PMDTinPrc = H02BC2_A8406PMDTinPrc[0] ;
            A8405PMDKgmMax = H02BC2_A8405PMDKgmMax[0] ;
            A8404PMDKgmMin = H02BC2_A8404PMDKgmMin[0] ;
            A8403PMDLin = H02BC2_A8403PMDLin[0] ;
            e222BC2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(99) ;
         wb2BC0( ) ;
      }
      bGXsfl_99_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDLIN"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A8403PMDLin), "ZZZ9")));
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
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV51Facturacion_tpenmd_wpds_1_tfpmdlin) ,
                                           Short.valueOf(AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to) ,
                                           AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin ,
                                           AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to ,
                                           AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax ,
                                           AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to ,
                                           AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc ,
                                           AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to ,
                                           AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc ,
                                           AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to ,
                                           AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins ,
                                           AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to ,
                                           Short.valueOf(A8403PMDLin) ,
                                           A8404PMDKgmMin ,
                                           A8405PMDKgmMax ,
                                           A8406PMDTinPrc ,
                                           A8407PMDAcaPrc ,
                                           A8408PMDKgmMinS ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV41emprcod ,
                                           Integer.valueOf(AV14CliCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor H02BC3 */
      pr_default.execute(1, new Object[] {AV41emprcod, Integer.valueOf(AV14CliCod), Short.valueOf(AV51Facturacion_tpenmd_wpds_1_tfpmdlin), Short.valueOf(AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to), AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin, AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to, AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax, AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to, AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc, AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to, AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc, AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to, AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins, AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to});
      GRID_nRecordCount = H02BC3_AGRID_nRecordCount[0] ;
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
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41emprcod, AV14CliCod, AV19TFPMDLin, AV20TFPMDLin_To, AV21TFPMDKgmMin, AV22TFPMDKgmMin_To, AV23TFPMDKgmMax, AV24TFPMDKgmMax_To, AV25TFPMDTinPrc, AV26TFPMDTinPrc_To, AV27TFPMDAcaPrc, AV28TFPMDAcaPrc_To, AV29TFPMDKgmMinS, AV30TFPMDKgmMinS_To, AV50Pgmname, AV12OrderedBy, AV13OrderedDsc, AV45PMDPreLimIN, AV46PMDPreMinIN, A396EmprCod, A252CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41emprcod, AV14CliCod, AV19TFPMDLin, AV20TFPMDLin_To, AV21TFPMDKgmMin, AV22TFPMDKgmMin_To, AV23TFPMDKgmMax, AV24TFPMDKgmMax_To, AV25TFPMDTinPrc, AV26TFPMDTinPrc_To, AV27TFPMDAcaPrc, AV28TFPMDAcaPrc_To, AV29TFPMDKgmMinS, AV30TFPMDKgmMinS_To, AV50Pgmname, AV12OrderedBy, AV13OrderedDsc, AV45PMDPreLimIN, AV46PMDPreMinIN, A396EmprCod, A252CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41emprcod, AV14CliCod, AV19TFPMDLin, AV20TFPMDLin_To, AV21TFPMDKgmMin, AV22TFPMDKgmMin_To, AV23TFPMDKgmMax, AV24TFPMDKgmMax_To, AV25TFPMDTinPrc, AV26TFPMDTinPrc_To, AV27TFPMDAcaPrc, AV28TFPMDAcaPrc_To, AV29TFPMDKgmMinS, AV30TFPMDKgmMinS_To, AV50Pgmname, AV12OrderedBy, AV13OrderedDsc, AV45PMDPreLimIN, AV46PMDPreMinIN, A396EmprCod, A252CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41emprcod, AV14CliCod, AV19TFPMDLin, AV20TFPMDLin_To, AV21TFPMDKgmMin, AV22TFPMDKgmMin_To, AV23TFPMDKgmMax, AV24TFPMDKgmMax_To, AV25TFPMDTinPrc, AV26TFPMDTinPrc_To, AV27TFPMDAcaPrc, AV28TFPMDAcaPrc_To, AV29TFPMDKgmMinS, AV30TFPMDKgmMinS_To, AV50Pgmname, AV12OrderedBy, AV13OrderedDsc, AV45PMDPreLimIN, AV46PMDPreMinIN, A396EmprCod, A252CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41emprcod, AV14CliCod, AV19TFPMDLin, AV20TFPMDLin_To, AV21TFPMDKgmMin, AV22TFPMDKgmMin_To, AV23TFPMDKgmMax, AV24TFPMDKgmMax_To, AV25TFPMDTinPrc, AV26TFPMDTinPrc_To, AV27TFPMDAcaPrc, AV28TFPMDAcaPrc_To, AV29TFPMDKgmMinS, AV30TFPMDKgmMinS_To, AV50Pgmname, AV12OrderedBy, AV13OrderedDsc, AV45PMDPreLimIN, AV46PMDPreMinIN, A396EmprCod, A252CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV50Pgmname = "Facturacion.TPenMD_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202BC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV31DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_99 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_99"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV34GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV63Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV64Clicod_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV65Pmdlin_selected = (short)(localUtil.ctol( httpContext.cgiGet( "vPMDLIN_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
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
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdprelim_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdprelim_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDPRELIM");
            GX_FocusControl = edtavPmdprelim_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16PMDPreLim = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16PMDPreLim", GXutil.ltrimstr( AV16PMDPreLim, 7, 2));
         }
         else
         {
            AV16PMDPreLim = localUtil.ctond( httpContext.cgiGet( edtavPmdprelim_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16PMDPreLim", GXutil.ltrimstr( AV16PMDPreLim, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdpremin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdpremin_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDPREMIN");
            GX_FocusControl = edtavPmdpremin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17PMDPreMin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17PMDPreMin", GXutil.ltrimstr( AV17PMDPreMin, 7, 2));
         }
         else
         {
            AV17PMDPreMin = localUtil.ctond( httpContext.cgiGet( edtavPmdpremin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17PMDPreMin", GXutil.ltrimstr( AV17PMDPreMin, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPmdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPmdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDLIN");
            GX_FocusControl = edtavPmdlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35PMDLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PMDLin), 4, 0));
         }
         else
         {
            AV35PMDLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavPmdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PMDLin), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmin_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDKGMMIN");
            GX_FocusControl = edtavPmdkgmmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36PMDKgmMin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36PMDKgmMin", GXutil.ltrimstr( AV36PMDKgmMin, 7, 2));
         }
         else
         {
            AV36PMDKgmMin = localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36PMDKgmMin", GXutil.ltrimstr( AV36PMDKgmMin, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmax_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDKGMMAX");
            GX_FocusControl = edtavPmdkgmmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37PMDKgmMax = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37PMDKgmMax", GXutil.ltrimstr( AV37PMDKgmMax, 7, 2));
         }
         else
         {
            AV37PMDKgmMax = localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmax_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37PMDKgmMax", GXutil.ltrimstr( AV37PMDKgmMax, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdtinprc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdtinprc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDTINPRC");
            GX_FocusControl = edtavPmdtinprc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38PMDTinPrc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38PMDTinPrc", GXutil.ltrimstr( AV38PMDTinPrc, 6, 2));
         }
         else
         {
            AV38PMDTinPrc = localUtil.ctond( httpContext.cgiGet( edtavPmdtinprc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38PMDTinPrc", GXutil.ltrimstr( AV38PMDTinPrc, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdacaprc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdacaprc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDACAPRC");
            GX_FocusControl = edtavPmdacaprc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39PMDAcaPrc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PMDAcaPrc", GXutil.ltrimstr( AV39PMDAcaPrc, 6, 2));
         }
         else
         {
            AV39PMDAcaPrc = localUtil.ctond( httpContext.cgiGet( edtavPmdacaprc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PMDAcaPrc", GXutil.ltrimstr( AV39PMDAcaPrc, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmins_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmins_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDKGMMINS");
            GX_FocusControl = edtavPmdkgmmins_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40PMDKgmMinS = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40PMDKgmMinS", GXutil.ltrimstr( AV40PMDKgmMinS, 7, 2));
         }
         else
         {
            AV40PMDKgmMinS = localUtil.ctond( httpContext.cgiGet( edtavPmdkgmmins_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40PMDKgmMinS", GXutil.ltrimstr( AV40PMDKgmMinS, 7, 2));
         }
         AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TPenMD_WP");
         AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV50Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\tpenmd_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e202BC2 ();
      if (returnInSub) return;
   }

   public void e202BC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV42Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tpenmd_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Station = GXt_char1 ;
      GXv_char2[0] = AV41emprcod ;
      GXv_char3[0] = AV43EmprNom ;
      GXv_char4[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpenmd_wp_impl.this.AV41emprcod = GXv_char2[0] ;
      tpenmd_wp_impl.this.AV43EmprNom = GXv_char3[0] ;
      tpenmd_wp_impl.this.AV44UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41emprcod", AV41emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Penalizaciones", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV31DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV31DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV36PMDKgmMin = AV46PMDPreMinIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36PMDKgmMin", GXutil.ltrimstr( AV36PMDKgmMin, 7, 2));
      AV16PMDPreLim = AV45PMDPreLimIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PMDPreLim", GXutil.ltrimstr( AV16PMDPreLim, 7, 2));
   }

   public void e212BC2( )
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
      AV33GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridCurrentPage), 10, 0));
      AV34GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridPageCount), 10, 0));
      GXt_int8 = AV35PMDLin ;
      GXv_int9[0] = GXt_int8 ;
      new app.facturacion.tpenmd_next(remoteHandle, context).execute( AV41emprcod, AV14CliCod, GXv_int9) ;
      tpenmd_wp_impl.this.GXt_int8 = GXv_int9[0] ;
      AV35PMDLin = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PMDLin), 4, 0));
      AV51Facturacion_tpenmd_wpds_1_tfpmdlin = AV19TFPMDLin ;
      AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to = AV20TFPMDLin_To ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = AV21TFPMDKgmMin ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = AV22TFPMDKgmMin_To ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = AV23TFPMDKgmMax ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = AV24TFPMDKgmMax_To ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = AV25TFPMDTinPrc ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = AV26TFPMDTinPrc_To ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = AV27TFPMDAcaPrc ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = AV28TFPMDAcaPrc_To ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = AV29TFPMDKgmMinS ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = AV30TFPMDKgmMinS_To ;
      /*  Sending Event outputs  */
   }

   public void e112BC2( )
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
         AV32PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV32PageToGo) ;
      }
   }

   public void e122BC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132BC2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDLin") == 0 )
         {
            AV19TFPMDLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFPMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFPMDLin), 4, 0));
            AV20TFPMDLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFPMDLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFPMDLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDKgmMin") == 0 )
         {
            AV21TFPMDKgmMin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFPMDKgmMin", GXutil.ltrimstr( AV21TFPMDKgmMin, 7, 2));
            AV22TFPMDKgmMin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFPMDKgmMin_To", GXutil.ltrimstr( AV22TFPMDKgmMin_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDKgmMax") == 0 )
         {
            AV23TFPMDKgmMax = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPMDKgmMax", GXutil.ltrimstr( AV23TFPMDKgmMax, 7, 2));
            AV24TFPMDKgmMax_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFPMDKgmMax_To", GXutil.ltrimstr( AV24TFPMDKgmMax_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDTinPrc") == 0 )
         {
            AV25TFPMDTinPrc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDTinPrc", GXutil.ltrimstr( AV25TFPMDTinPrc, 6, 2));
            AV26TFPMDTinPrc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDTinPrc_To", GXutil.ltrimstr( AV26TFPMDTinPrc_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDAcaPrc") == 0 )
         {
            AV27TFPMDAcaPrc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDAcaPrc", GXutil.ltrimstr( AV27TFPMDAcaPrc, 6, 2));
            AV28TFPMDAcaPrc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDAcaPrc_To", GXutil.ltrimstr( AV28TFPMDAcaPrc_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDKgmMinS") == 0 )
         {
            AV29TFPMDKgmMinS = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDKgmMinS", GXutil.ltrimstr( AV29TFPMDKgmMinS, 7, 2));
            AV30TFPMDKgmMinS_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDKgmMinS_To", GXutil.ltrimstr( AV30TFPMDKgmMinS_To, 7, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e222BC2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(99) ;
      }
      sendrow_992( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_99_Refreshing )
      {
         httpContext.doAjaxLoad(99, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV47GridActions, 4, 0)) );
   }

   public void e142BC2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e152BC2( )
   {
      /* 'DoLimpiearvariables' Routine */
      returnInSub = false ;
      AV35PMDLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PMDLin), 4, 0));
      AV37PMDKgmMax = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37PMDKgmMax", GXutil.ltrimstr( AV37PMDKgmMax, 7, 2));
      AV36PMDKgmMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36PMDKgmMin", GXutil.ltrimstr( AV36PMDKgmMin, 7, 2));
      AV38PMDTinPrc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38PMDTinPrc", GXutil.ltrimstr( AV38PMDTinPrc, 6, 2));
      AV39PMDAcaPrc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39PMDAcaPrc", GXutil.ltrimstr( AV39PMDAcaPrc, 6, 2));
      AV40PMDKgmMinS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40PMDKgmMinS", GXutil.ltrimstr( AV40PMDKgmMinS, 7, 2));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e162BC2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      new app.facturacion.tpenmd_upd(remoteHandle, context).execute( AV41emprcod, AV14CliCod, AV16PMDPreLim, AV17PMDPreMin) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e172BC2( )
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
      AV63Emprcod_selected = A396EmprCod ;
      AV64Clicod_selected = A252CliCod ;
      AV65Pmdlin_selected = A8403PMDLin ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.facturacion.tpenmd_del(remoteHandle, context).execute( AV41emprcod, AV14CliCod, A8403PMDLin) ;
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV50Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV50Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV50Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDLIN") == 0 )
         {
            AV19TFPMDLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFPMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFPMDLin), 4, 0));
            AV20TFPMDLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFPMDLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFPMDLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDKGMMIN") == 0 )
         {
            AV21TFPMDKgmMin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFPMDKgmMin", GXutil.ltrimstr( AV21TFPMDKgmMin, 7, 2));
            AV22TFPMDKgmMin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFPMDKgmMin_To", GXutil.ltrimstr( AV22TFPMDKgmMin_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDKGMMAX") == 0 )
         {
            AV23TFPMDKgmMax = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPMDKgmMax", GXutil.ltrimstr( AV23TFPMDKgmMax, 7, 2));
            AV24TFPMDKgmMax_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFPMDKgmMax_To", GXutil.ltrimstr( AV24TFPMDKgmMax_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDTINPRC") == 0 )
         {
            AV25TFPMDTinPrc = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDTinPrc", GXutil.ltrimstr( AV25TFPMDTinPrc, 6, 2));
            AV26TFPMDTinPrc_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDTinPrc_To", GXutil.ltrimstr( AV26TFPMDTinPrc_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDACAPRC") == 0 )
         {
            AV27TFPMDAcaPrc = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDAcaPrc", GXutil.ltrimstr( AV27TFPMDAcaPrc, 6, 2));
            AV28TFPMDAcaPrc_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDAcaPrc_To", GXutil.ltrimstr( AV28TFPMDAcaPrc_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDKGMMINS") == 0 )
         {
            AV29TFPMDKgmMinS = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDKgmMinS", GXutil.ltrimstr( AV29TFPMDKgmMinS, 7, 2));
            AV30TFPMDKgmMinS_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDKgmMinS_To", GXutil.ltrimstr( AV30TFPMDKgmMinS_To, 7, 2));
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
      Ddo_grid_Filteredtext_set = ((0==AV19TFPMDLin) ? "" : GXutil.str( AV19TFPMDLin, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV21TFPMDKgmMin)==0) ? "" : GXutil.str( AV21TFPMDKgmMin, 7, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFPMDKgmMax)==0) ? "" : GXutil.str( AV23TFPMDKgmMax, 7, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPMDTinPrc)==0) ? "" : GXutil.str( AV25TFPMDTinPrc, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPMDAcaPrc)==0) ? "" : GXutil.str( AV27TFPMDAcaPrc, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPMDKgmMinS)==0) ? "" : GXutil.str( AV29TFPMDKgmMinS, 7, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV20TFPMDLin_To) ? "" : GXutil.str( AV20TFPMDLin_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFPMDKgmMin_To)==0) ? "" : GXutil.str( AV22TFPMDKgmMin_To, 7, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFPMDKgmMax_To)==0) ? "" : GXutil.str( AV24TFPMDKgmMax_To, 7, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPMDTinPrc_To)==0) ? "" : GXutil.str( AV26TFPMDTinPrc_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPMDAcaPrc_To)==0) ? "" : GXutil.str( AV28TFPMDAcaPrc_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPMDKgmMinS_To)==0) ? "" : GXutil.str( AV30TFPMDKgmMinS_To, 7, 2)) ;
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
      AV10GridState.fromxml(AV18Session.getValue(AV50Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPMDLIN", "", !((0==AV19TFPMDLin)&&(0==AV20TFPMDLin_To)), (short)(0), GXutil.trim( GXutil.str( AV19TFPMDLin, 4, 0)), GXutil.trim( GXutil.str( AV20TFPMDLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPMDKGMMIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV21TFPMDKgmMin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFPMDKgmMin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV21TFPMDKgmMin, 7, 2)), GXutil.trim( GXutil.str( AV22TFPMDKgmMin_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPMDKGMMAX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFPMDKgmMax)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFPMDKgmMax_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFPMDKgmMax, 7, 2)), GXutil.trim( GXutil.str( AV24TFPMDKgmMax_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPMDTINPRC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPMDTinPrc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPMDTinPrc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV25TFPMDTinPrc, 6, 2)), GXutil.trim( GXutil.str( AV26TFPMDTinPrc_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPMDACAPRC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPMDAcaPrc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPMDAcaPrc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV27TFPMDAcaPrc, 6, 2)), GXutil.trim( GXutil.str( AV28TFPMDAcaPrc_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPMDKGMMINS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPMDKgmMinS)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPMDKgmMinS_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV29TFPMDKgmMinS, 7, 2)), GXutil.trim( GXutil.str( AV30TFPMDKgmMinS_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV50Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV50Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.TPenMD_TRN" );
      AV18Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e182BC2( )
   {
      /* Pmdlin_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_decimal11[0] = AV37PMDKgmMax ;
      GXv_decimal12[0] = AV36PMDKgmMin ;
      GXv_decimal13[0] = AV38PMDTinPrc ;
      GXv_decimal14[0] = AV39PMDAcaPrc ;
      GXv_decimal15[0] = AV40PMDKgmMinS ;
      new app.facturacion.tpenmd_get(remoteHandle, context).execute( AV41emprcod, AV14CliCod, AV35PMDLin, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15) ;
      tpenmd_wp_impl.this.AV37PMDKgmMax = GXv_decimal11[0] ;
      tpenmd_wp_impl.this.AV36PMDKgmMin = GXv_decimal12[0] ;
      tpenmd_wp_impl.this.AV38PMDTinPrc = GXv_decimal13[0] ;
      tpenmd_wp_impl.this.AV39PMDAcaPrc = GXv_decimal14[0] ;
      tpenmd_wp_impl.this.AV40PMDKgmMinS = GXv_decimal15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37PMDKgmMax", GXutil.ltrimstr( AV37PMDKgmMax, 7, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV36PMDKgmMin", GXutil.ltrimstr( AV36PMDKgmMin, 7, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV38PMDTinPrc", GXutil.ltrimstr( AV38PMDTinPrc, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV39PMDAcaPrc", GXutil.ltrimstr( AV39PMDAcaPrc, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV40PMDKgmMinS", GXutil.ltrimstr( AV40PMDKgmMinS, 7, 2));
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e192BC2 ();
      if (returnInSub) return;
   }

   public void e192BC2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV35PMDLin) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hay valor en #", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavPmdlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         new app.facturacion.tpenmd_insupd(remoteHandle, context).execute( AV41emprcod, AV14CliCod, AV35PMDLin, AV37PMDKgmMax, AV36PMDKgmMin, AV38PMDTinPrc, AV39PMDAcaPrc, AV40PMDKgmMinS) ;
         AV35PMDLin = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PMDLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PMDLin), 4, 0));
         AV37PMDKgmMax = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37PMDKgmMax", GXutil.ltrimstr( AV37PMDKgmMax, 7, 2));
         AV36PMDKgmMin = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36PMDKgmMin", GXutil.ltrimstr( AV36PMDKgmMin, 7, 2));
         AV38PMDTinPrc = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38PMDTinPrc", GXutil.ltrimstr( AV38PMDTinPrc, 6, 2));
         AV39PMDAcaPrc = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39PMDAcaPrc", GXutil.ltrimstr( AV39PMDAcaPrc, 6, 2));
         AV40PMDKgmMinS = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40PMDKgmMinS", GXutil.ltrimstr( AV40PMDKgmMinS, 7, 2));
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_121_2BC2( boolean wbgen )
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
         wb_table1_121_2BC2e( true) ;
      }
      else
      {
         wb_table1_121_2BC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV41emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41emprcod", AV41emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41emprcod, "@!"))));
      AV14CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
      AV15CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CliNom", AV15CliNom);
      AV45PMDPreLimIN = (java.math.BigDecimal)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45PMDPreLimIN", GXutil.ltrimstr( AV45PMDPreLimIN, 7, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPRELIMIN", getSecureSignedToken( "", localUtil.format( AV45PMDPreLimIN, "Z,ZZ9.99 €")));
      AV46PMDPreMinIN = (java.math.BigDecimal)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46PMDPreMinIN", GXutil.ltrimstr( AV46PMDPreMinIN, 7, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDPREMININ", getSecureSignedToken( "", localUtil.format( AV46PMDPreMinIN, "Z,ZZ9.99 €")));
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
      pa2BC2( ) ;
      ws2BC2( ) ;
      we2BC2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116152637", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tpenmd_wp.js", "?202682116152638", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_992( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_99_idx );
      edtPMDLin_Internalname = "PMDLIN_"+sGXsfl_99_idx ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN_"+sGXsfl_99_idx ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX_"+sGXsfl_99_idx ;
      edtPMDTinPrc_Internalname = "PMDTINPRC_"+sGXsfl_99_idx ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC_"+sGXsfl_99_idx ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS_"+sGXsfl_99_idx ;
   }

   public void subsflControlProps_fel_992( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_99_fel_idx );
      edtPMDLin_Internalname = "PMDLIN_"+sGXsfl_99_fel_idx ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN_"+sGXsfl_99_fel_idx ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX_"+sGXsfl_99_fel_idx ;
      edtPMDTinPrc_Internalname = "PMDTINPRC_"+sGXsfl_99_fel_idx ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC_"+sGXsfl_99_fel_idx ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS_"+sGXsfl_99_fel_idx ;
   }

   public void sendrow_992( )
   {
      subsflControlProps_992( ) ;
      wb2BC0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_99_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_99_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_99_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_99_idx+"',99)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_99_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV47GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV47GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV47GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e232bc2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV47GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_99_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDLin_Internalname,GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8403PMDLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDKgmMin_Internalname,GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8404PMDKgmMin, "Z,ZZ9.99 kg")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDKgmMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDKgmMax_Internalname,GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8405PMDKgmMax, "Z,ZZ9.99 kg")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDKgmMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDTinPrc_Internalname,GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8406PMDTinPrc, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDTinPrc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDAcaPrc_Internalname,GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8407PMDAcaPrc, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDAcaPrc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDKgmMinS_Internalname,GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8408PMDKgmMinS, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDKgmMinS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2BC2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_99_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      /* End function sendrow_992 */
   }

   public void startgridcontrol99( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"99\">") ;
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
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "de (kg)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "a (kg)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Penalização T.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Penalizaçao A.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs.Min.Saída", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV47GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), ".", "")));
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
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPmdprelim_Internalname = "vPMDPRELIM" ;
      edtavPmdpremin_Internalname = "vPMDPREMIN" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavPmdlin_Internalname = "vPMDLIN" ;
      edtavPmdkgmmin_Internalname = "vPMDKGMMIN" ;
      edtavPmdkgmmax_Internalname = "vPMDKGMMAX" ;
      edtavPmdtinprc_Internalname = "vPMDTINPRC" ;
      edtavPmdacaprc_Internalname = "vPMDACAPRC" ;
      edtavPmdkgmmins_Internalname = "vPMDKGMMINS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiearvariables_Internalname = "BTNLIMPIEARVARIABLES" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtPMDLin_Internalname = "PMDLIN" ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN" ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX" ;
      edtPMDTinPrc_Internalname = "PMDTINPRC" ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC" ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtPMDKgmMinS_Jsonclick = "" ;
      edtPMDAcaPrc_Jsonclick = "" ;
      edtPMDTinPrc_Jsonclick = "" ;
      edtPMDKgmMax_Jsonclick = "" ;
      edtPMDKgmMin_Jsonclick = "" ;
      edtPMDLin_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "" ;
      edtavPmdkgmmins_Jsonclick = "" ;
      edtavPmdkgmmins_Enabled = 1 ;
      edtavPmdacaprc_Jsonclick = "" ;
      edtavPmdacaprc_Enabled = 1 ;
      edtavPmdtinprc_Jsonclick = "" ;
      edtavPmdtinprc_Enabled = 1 ;
      edtavPmdkgmmax_Jsonclick = "" ;
      edtavPmdkgmmax_Enabled = 1 ;
      edtavPmdkgmmin_Jsonclick = "" ;
      edtavPmdkgmmin_Enabled = 1 ;
      edtavPmdlin_Jsonclick = "" ;
      edtavPmdlin_Enabled = 1 ;
      edtavPmdpremin_Jsonclick = "" ;
      edtavPmdpremin_Enabled = 1 ;
      edtavPmdprelim_Jsonclick = "" ;
      edtavPmdprelim_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Confirma la eliminacion?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Filterisrange = "T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "1:PMDLin|2:PMDKgmMin|3:PMDKgmMax|4:PMDTinPrc|5:PMDAcaPrc|6:PMDKgmMinS" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Penalizaciones", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_99_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV47GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV47GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222BC2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV47GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e232BC2',iparms:[{av:'cmbavGridactions'},{av:'AV47GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8403PMDLin',fld:'PMDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV47GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'A8403PMDLin',fld:'PMDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("'DOLIMPIEARVARIABLES'","{handler:'e152BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOLIMPIEARVARIABLES'",",oparms:[{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'},{av:'AV37PMDKgmMax',fld:'vPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV36PMDKgmMin',fld:'vPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV38PMDTinPrc',fld:'vPMDTINPRC',pic:'ZZ9.99'},{av:'AV39PMDAcaPrc',fld:'vPMDACAPRC',pic:'ZZ9.99'},{av:'AV40PMDKgmMinS',fld:'vPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e162BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV16PMDPreLim',fld:'vPMDPRELIM',pic:'Z,ZZ9.99 €'},{av:'AV17PMDPreMin',fld:'vPMDPREMIN',pic:'Z,ZZ9.99 €'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e172BC2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPMDLIN.CONTROLVALUECHANGED","{handler:'e182BC2',iparms:[{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'}]");
      setEventMetadata("VPMDLIN.CONTROLVALUECHANGED",",oparms:[{av:'AV40PMDKgmMinS',fld:'vPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV39PMDAcaPrc',fld:'vPMDACAPRC',pic:'ZZ9.99'},{av:'AV38PMDTinPrc',fld:'vPMDTINPRC',pic:'ZZ9.99'},{av:'AV36PMDKgmMin',fld:'vPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV37PMDKgmMax',fld:'vPMDKGMMAX',pic:'Z,ZZ9.99 KG'}]}");
      setEventMetadata("ENTER","{handler:'e192BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV19TFPMDLin',fld:'vTFPMDLIN',pic:'ZZZ9'},{av:'AV20TFPMDLin_To',fld:'vTFPMDLIN_TO',pic:'ZZZ9'},{av:'AV21TFPMDKgmMin',fld:'vTFPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV22TFPMDKgmMin_To',fld:'vTFPMDKGMMIN_TO',pic:'Z,ZZ9.99 KG'},{av:'AV23TFPMDKgmMax',fld:'vTFPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV24TFPMDKgmMax_To',fld:'vTFPMDKGMMAX_TO',pic:'Z,ZZ9.99 KG'},{av:'AV25TFPMDTinPrc',fld:'vTFPMDTINPRC',pic:'ZZ9.99'},{av:'AV26TFPMDTinPrc_To',fld:'vTFPMDTINPRC_TO',pic:'ZZ9.99'},{av:'AV27TFPMDAcaPrc',fld:'vTFPMDACAPRC',pic:'ZZ9.99'},{av:'AV28TFPMDAcaPrc_To',fld:'vTFPMDACAPRC_TO',pic:'ZZ9.99'},{av:'AV29TFPMDKgmMinS',fld:'vTFPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV30TFPMDKgmMinS_To',fld:'vTFPMDKGMMINS_TO',pic:'ZZZ9.99'},{av:'AV50Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45PMDPreLimIN',fld:'vPMDPRELIMIN',pic:'Z,ZZ9.99 €',hsh:true},{av:'AV46PMDPreMinIN',fld:'vPMDPREMININ',pic:'Z,ZZ9.99 €',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'},{av:'AV37PMDKgmMax',fld:'vPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV36PMDKgmMin',fld:'vPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV38PMDTinPrc',fld:'vPMDTINPRC',pic:'ZZ9.99'},{av:'AV39PMDAcaPrc',fld:'vPMDACAPRC',pic:'ZZ9.99'},{av:'AV40PMDKgmMinS',fld:'vPMDKGMMINS',pic:'ZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV35PMDLin',fld:'vPMDLIN',pic:'ZZZ9'},{av:'AV37PMDKgmMax',fld:'vPMDKGMMAX',pic:'Z,ZZ9.99 KG'},{av:'AV36PMDKgmMin',fld:'vPMDKGMMIN',pic:'Z,ZZ9.99 KG'},{av:'AV38PMDTinPrc',fld:'vPMDTINPRC',pic:'ZZ9.99'},{av:'AV39PMDAcaPrc',fld:'vPMDACAPRC',pic:'ZZ9.99'},{av:'AV40PMDKgmMinS',fld:'vPMDKGMMINS',pic:'ZZZ9.99'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pmdkgmmins',iparms:[]");
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
      wcpOAV41emprcod = "" ;
      wcpOAV15CliNom = "" ;
      wcpOAV45PMDPreLimIN = DecimalUtil.ZERO ;
      wcpOAV46PMDPreMinIN = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV41emprcod = "" ;
      AV15CliNom = "" ;
      AV45PMDPreLimIN = DecimalUtil.ZERO ;
      AV46PMDPreMinIN = DecimalUtil.ZERO ;
      AV21TFPMDKgmMin = DecimalUtil.ZERO ;
      AV22TFPMDKgmMin_To = DecimalUtil.ZERO ;
      AV23TFPMDKgmMax = DecimalUtil.ZERO ;
      AV24TFPMDKgmMax_To = DecimalUtil.ZERO ;
      AV25TFPMDTinPrc = DecimalUtil.ZERO ;
      AV26TFPMDTinPrc_To = DecimalUtil.ZERO ;
      AV27TFPMDAcaPrc = DecimalUtil.ZERO ;
      AV28TFPMDAcaPrc_To = DecimalUtil.ZERO ;
      AV29TFPMDKgmMinS = DecimalUtil.ZERO ;
      AV30TFPMDKgmMinS_To = DecimalUtil.ZERO ;
      AV50Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV63Emprcod_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV16PMDPreLim = DecimalUtil.ZERO ;
      AV17PMDPreMin = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV36PMDKgmMin = DecimalUtil.ZERO ;
      AV37PMDKgmMax = DecimalUtil.ZERO ;
      AV38PMDTinPrc = DecimalUtil.ZERO ;
      AV39PMDAcaPrc = DecimalUtil.ZERO ;
      AV40PMDKgmMinS = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiearvariables_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
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
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin = DecimalUtil.ZERO ;
      AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to = DecimalUtil.ZERO ;
      AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax = DecimalUtil.ZERO ;
      AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to = DecimalUtil.ZERO ;
      AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc = DecimalUtil.ZERO ;
      AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to = DecimalUtil.ZERO ;
      AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc = DecimalUtil.ZERO ;
      AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to = DecimalUtil.ZERO ;
      AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins = DecimalUtil.ZERO ;
      AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to = DecimalUtil.ZERO ;
      H02BC2_A396EmprCod = new String[] {""} ;
      H02BC2_A252CliCod = new int[1] ;
      H02BC2_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BC2_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BC2_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BC2_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BC2_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BC2_A8403PMDLin = new short[1] ;
      H02BC3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV42Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV43EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV44UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int9 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV18Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_wp__default(),
         new Object[] {
             new Object[] {
            H02BC2_A396EmprCod, H02BC2_A252CliCod, H02BC2_A8408PMDKgmMinS, H02BC2_A8407PMDAcaPrc, H02BC2_A8406PMDTinPrc, H02BC2_A8405PMDKgmMax, H02BC2_A8404PMDKgmMin, H02BC2_A8403PMDLin
            }
            , new Object[] {
            H02BC3_AGRID_nRecordCount
            }
         }
      );
      AV50Pgmname = "Facturacion.TPenMD_WP" ;
      /* GeneXus formulas. */
      AV50Pgmname = "Facturacion.TPenMD_WP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
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
   private short AV19TFPMDLin ;
   private short AV20TFPMDLin_To ;
   private short AV12OrderedBy ;
   private short AV65Pmdlin_selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV35PMDLin ;
   private short AV47GridActions ;
   private short A8403PMDLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV51Facturacion_tpenmd_wpds_1_tfpmdlin ;
   private short AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int wcpOAV14CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_99 ;
   private int AV14CliCod ;
   private int nGXsfl_99_idx=1 ;
   private int A252CliCod ;
   private int AV64Clicod_selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPmdprelim_Enabled ;
   private int edtavPmdpremin_Enabled ;
   private int edtavPmdlin_Enabled ;
   private int edtavPmdkgmmin_Enabled ;
   private int edtavPmdkgmmax_Enabled ;
   private int edtavPmdtinprc_Enabled ;
   private int edtavPmdacaprc_Enabled ;
   private int edtavPmdkgmmins_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV32PageToGo ;
   private int AV66GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV33GridCurrentPage ;
   private long AV34GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV45PMDPreLimIN ;
   private java.math.BigDecimal wcpOAV46PMDPreMinIN ;
   private java.math.BigDecimal AV45PMDPreLimIN ;
   private java.math.BigDecimal AV46PMDPreMinIN ;
   private java.math.BigDecimal AV21TFPMDKgmMin ;
   private java.math.BigDecimal AV22TFPMDKgmMin_To ;
   private java.math.BigDecimal AV23TFPMDKgmMax ;
   private java.math.BigDecimal AV24TFPMDKgmMax_To ;
   private java.math.BigDecimal AV25TFPMDTinPrc ;
   private java.math.BigDecimal AV26TFPMDTinPrc_To ;
   private java.math.BigDecimal AV27TFPMDAcaPrc ;
   private java.math.BigDecimal AV28TFPMDAcaPrc_To ;
   private java.math.BigDecimal AV29TFPMDKgmMinS ;
   private java.math.BigDecimal AV30TFPMDKgmMinS_To ;
   private java.math.BigDecimal AV16PMDPreLim ;
   private java.math.BigDecimal AV17PMDPreMin ;
   private java.math.BigDecimal AV36PMDKgmMin ;
   private java.math.BigDecimal AV37PMDKgmMax ;
   private java.math.BigDecimal AV38PMDTinPrc ;
   private java.math.BigDecimal AV39PMDAcaPrc ;
   private java.math.BigDecimal AV40PMDKgmMinS ;
   private java.math.BigDecimal A8404PMDKgmMin ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A8406PMDTinPrc ;
   private java.math.BigDecimal A8407PMDAcaPrc ;
   private java.math.BigDecimal A8408PMDKgmMinS ;
   private java.math.BigDecimal AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin ;
   private java.math.BigDecimal AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to ;
   private java.math.BigDecimal AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax ;
   private java.math.BigDecimal AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to ;
   private java.math.BigDecimal AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc ;
   private java.math.BigDecimal AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to ;
   private java.math.BigDecimal AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc ;
   private java.math.BigDecimal AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to ;
   private java.math.BigDecimal AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins ;
   private java.math.BigDecimal AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOAV41emprcod ;
   private String wcpOAV15CliNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV41emprcod ;
   private String AV15CliNom ;
   private String sGXsfl_99_idx="0001" ;
   private String AV50Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV63Emprcod_selected ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPmdprelim_Internalname ;
   private String TempTags ;
   private String edtavPmdprelim_Jsonclick ;
   private String edtavPmdpremin_Internalname ;
   private String edtavPmdpremin_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPmdlin_Internalname ;
   private String edtavPmdlin_Jsonclick ;
   private String edtavPmdkgmmin_Internalname ;
   private String edtavPmdkgmmin_Jsonclick ;
   private String edtavPmdkgmmax_Internalname ;
   private String edtavPmdkgmmax_Jsonclick ;
   private String edtavPmdtinprc_Internalname ;
   private String edtavPmdtinprc_Jsonclick ;
   private String edtavPmdacaprc_Internalname ;
   private String edtavPmdacaprc_Jsonclick ;
   private String edtavPmdkgmmins_Internalname ;
   private String edtavPmdkgmmins_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiearvariables_Internalname ;
   private String bttBtnlimpiearvariables_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
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
   private String edtPMDLin_Internalname ;
   private String edtPMDKgmMin_Internalname ;
   private String edtPMDKgmMax_Internalname ;
   private String edtPMDTinPrc_Internalname ;
   private String edtPMDAcaPrc_Internalname ;
   private String edtPMDKgmMinS_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV42Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV43EmprNom ;
   private String GXv_char3[] ;
   private String AV44UsurCod ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sGXsfl_99_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPMDLin_Jsonclick ;
   private String edtPMDKgmMin_Jsonclick ;
   private String edtPMDKgmMax_Jsonclick ;
   private String edtPMDTinPrc_Jsonclick ;
   private String edtPMDAcaPrc_Jsonclick ;
   private String edtPMDKgmMinS_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_99_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02BC2_A396EmprCod ;
   private int[] H02BC2_A252CliCod ;
   private java.math.BigDecimal[] H02BC2_A8408PMDKgmMinS ;
   private java.math.BigDecimal[] H02BC2_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] H02BC2_A8406PMDTinPrc ;
   private java.math.BigDecimal[] H02BC2_A8405PMDKgmMax ;
   private java.math.BigDecimal[] H02BC2_A8404PMDKgmMin ;
   private short[] H02BC2_A8403PMDLin ;
   private long[] H02BC3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV31DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tpenmd_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02BC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV51Facturacion_tpenmd_wpds_1_tfpmdlin ,
                                          short AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to ,
                                          java.math.BigDecimal AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin ,
                                          java.math.BigDecimal AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to ,
                                          java.math.BigDecimal AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax ,
                                          java.math.BigDecimal AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to ,
                                          java.math.BigDecimal AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc ,
                                          java.math.BigDecimal AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to ,
                                          java.math.BigDecimal AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc ,
                                          java.math.BigDecimal AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to ,
                                          java.math.BigDecimal AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins ,
                                          java.math.BigDecimal AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to ,
                                          short A8403PMDLin ,
                                          java.math.BigDecimal A8404PMDKgmMin ,
                                          java.math.BigDecimal A8405PMDKgmMax ,
                                          java.math.BigDecimal A8406PMDTinPrc ,
                                          java.math.BigDecimal A8407PMDAcaPrc ,
                                          java.math.BigDecimal A8408PMDKgmMinS ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV41emprcod ,
                                          int AV14CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[19];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, CliCod, PMDKgmMinS, PMDAcaPrc, PMDTinPrc, PMDKgmMax, PMDKgmMin, PMDLin" ;
      sFromString = " FROM TXPPenMD" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! (0==AV51Facturacion_tpenmd_wpds_1_tfpmdlin) )
      {
         addWhere(sWhereString, "(PMDLin >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to) )
      {
         addWhere(sWhereString, "(PMDLin <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMin >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMin <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMax >= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMax <= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc)==0) )
      {
         addWhere(sWhereString, "(PMDTinPrc >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to)==0) )
      {
         addWhere(sWhereString, "(PMDTinPrc <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc)==0) )
      {
         addWhere(sWhereString, "(PMDAcaPrc >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to)==0) )
      {
         addWhere(sWhereString, "(PMDAcaPrc <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMinS >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMinS <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, CliCod, PMDLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PMDLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PMDLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PMDKgmMin" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PMDKgmMin DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PMDKgmMax" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PMDKgmMax DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PMDTinPrc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PMDTinPrc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PMDAcaPrc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PMDAcaPrc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PMDKgmMinS" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PMDKgmMinS DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, CliCod, PMDLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H02BC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV51Facturacion_tpenmd_wpds_1_tfpmdlin ,
                                          short AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to ,
                                          java.math.BigDecimal AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin ,
                                          java.math.BigDecimal AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to ,
                                          java.math.BigDecimal AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax ,
                                          java.math.BigDecimal AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to ,
                                          java.math.BigDecimal AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc ,
                                          java.math.BigDecimal AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to ,
                                          java.math.BigDecimal AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc ,
                                          java.math.BigDecimal AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to ,
                                          java.math.BigDecimal AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins ,
                                          java.math.BigDecimal AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to ,
                                          short A8403PMDLin ,
                                          java.math.BigDecimal A8404PMDKgmMin ,
                                          java.math.BigDecimal A8405PMDKgmMax ,
                                          java.math.BigDecimal A8406PMDTinPrc ,
                                          java.math.BigDecimal A8407PMDAcaPrc ,
                                          java.math.BigDecimal A8408PMDKgmMinS ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV41emprcod ,
                                          int AV14CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[14];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPPenMD" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! (0==AV51Facturacion_tpenmd_wpds_1_tfpmdlin) )
      {
         addWhere(sWhereString, "(PMDLin >= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_tpenmd_wpds_2_tfpmdlin_to) )
      {
         addWhere(sWhereString, "(PMDLin <= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Facturacion_tpenmd_wpds_3_tfpmdkgmmin)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMin >= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Facturacion_tpenmd_wpds_4_tfpmdkgmmin_to)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMin <= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Facturacion_tpenmd_wpds_5_tfpmdkgmmax)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMax >= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Facturacion_tpenmd_wpds_6_tfpmdkgmmax_to)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMax <= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Facturacion_tpenmd_wpds_7_tfpmdtinprc)==0) )
      {
         addWhere(sWhereString, "(PMDTinPrc >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Facturacion_tpenmd_wpds_8_tfpmdtinprc_to)==0) )
      {
         addWhere(sWhereString, "(PMDTinPrc <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Facturacion_tpenmd_wpds_9_tfpmdacaprc)==0) )
      {
         addWhere(sWhereString, "(PMDAcaPrc >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Facturacion_tpenmd_wpds_10_tfpmdacaprc_to)==0) )
      {
         addWhere(sWhereString, "(PMDAcaPrc <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Facturacion_tpenmd_wpds_11_tfpmdkgmmins)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMinS >= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Facturacion_tpenmd_wpds_12_tfpmdkgmmins_to)==0) )
      {
         addWhere(sWhereString, "(PMDKgmMinS <= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_H02BC2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
            case 1 :
                  return conditional_H02BC3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               return;
      }
   }

}

