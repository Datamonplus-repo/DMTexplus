package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwselpzas_impl extends GXDataArea
{
   public webwselpzas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwselpzas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwselpzas_impl.class ));
   }

   public webwselpzas_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkavSeleccionado = UIFactory.getCheckbox(this);
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
            AV77EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77EmprCod", AV77EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV71ALbRecCod = (int)(GXutil.lval( httpContext.GetPar( "ALbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV71ALbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ALbRecCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71ALbRecCod), "ZZZZZZZ9")));
               AV75DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75DisCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DisCod), "ZZZZZZZ9")));
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
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
      AV77EmprCod = httpContext.GetPar( "EmprCod") ;
      AV71ALbRecCod = (int)(GXutil.lval( httpContext.GetPar( "ALbRecCod"))) ;
      AV56TFAlbRecPie = httpContext.GetPar( "TFAlbRecPie") ;
      AV57TFAlbRecPie_Sel = httpContext.GetPar( "TFAlbRecPie_Sel") ;
      AV48TFAlbRecKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecKgm"), ".") ;
      AV49TFAlbRecKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecKgm_To"), ".") ;
      AV50TFAlbRecKgmU = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecKgmU"), ".") ;
      AV51TFAlbRecKgmU_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecKgmU_To"), ".") ;
      AV52TFAlbRecMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecMtr"), ".") ;
      AV53TFAlbRecMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecMtr_To"), ".") ;
      AV54TFAlbRecMtrU = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecMtrU"), ".") ;
      AV55TFAlbRecMtrU_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRecMtrU_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV58TFAlbRUni_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV120TFAlbRReo_Sels);
      AV146Pgmname = httpContext.GetPar( "Pgmname") ;
      AV42OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV44OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV75DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      AV126Webwselpzasds_1_emprcod = httpContext.GetPar( "Webwselpzasds_1_emprcod") ;
      AV127Webwselpzasds_2_albreccod = (int)(GXutil.lval( httpContext.GetPar( "Webwselpzasds_2_albreccod"))) ;
      AV80Kgsd = CommonUtil.decimalVal( httpContext.GetPar( "Kgsd"), ".") ;
      AV106Mtsd = CommonUtil.decimalVal( httpContext.GetPar( "Mtsd"), ".") ;
      AV5AlbRreo = httpContext.GetPar( "AlbRreo") ;
      AV94Lit20 = httpContext.GetPar( "Lit20") ;
      AV95Lit21 = httpContext.GetPar( "Lit21") ;
      AV110Tintatex = (byte)(GXutil.lval( httpContext.GetPar( "Tintatex"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV77EmprCod, AV71ALbRecCod, AV56TFAlbRecPie, AV57TFAlbRecPie_Sel, AV48TFAlbRecKgm, AV49TFAlbRecKgm_To, AV50TFAlbRecKgmU, AV51TFAlbRecKgmU_To, AV52TFAlbRecMtr, AV53TFAlbRecMtr_To, AV54TFAlbRecMtrU, AV55TFAlbRecMtrU_To, AV58TFAlbRUni_Sels, AV120TFAlbRReo_Sels, AV146Pgmname, AV42OrderedBy, AV44OrderedDsc, AV75DisCod, AV126Webwselpzasds_1_emprcod, AV127Webwselpzasds_2_albreccod, AV80Kgsd, AV106Mtsd, AV5AlbRreo, AV94Lit20, AV95Lit21, AV110Tintatex) ;
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
      paK32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startK32( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwselpzas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV77EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71ALbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV75DisCod,8,0))}, new String[] {"EmprCod","ALbRecCod","DisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71ALbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGSD", getSecureSignedToken( "", localUtil.format( AV80Kgsd, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTSD", getSecureSignedToken( "", localUtil.format( AV106Mtsd, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5AlbRreo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIT20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV94Lit20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIT21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV95Lit21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTATEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Tintatex), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV77EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV71ALbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71ALbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECPIE", GXutil.rtrim( AV56TFAlbRecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECPIE_SEL", GXutil.rtrim( AV57TFAlbRecPie_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECKGM", GXutil.ltrim( localUtil.ntoc( AV48TFAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECKGM_TO", GXutil.ltrim( localUtil.ntoc( AV49TFAlbRecKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECKGMU", GXutil.ltrim( localUtil.ntoc( AV50TFAlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECKGMU_TO", GXutil.ltrim( localUtil.ntoc( AV51TFAlbRecKgmU_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECMTR", GXutil.ltrim( localUtil.ntoc( AV52TFAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECMTR_TO", GXutil.ltrim( localUtil.ntoc( AV53TFAlbRecMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECMTRU", GXutil.ltrim( localUtil.ntoc( AV54TFAlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECMTRU_TO", GXutil.ltrim( localUtil.ntoc( AV55TFAlbRecMtrU_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV58TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV58TFAlbRUni_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRREO_SELS", AV120TFAlbRReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRREO_SELS", AV120TFAlbRReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV146Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV42OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV44OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV75DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKGSD", GXutil.ltrim( localUtil.ntoc( AV80Kgsd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGSD", getSecureSignedToken( "", localUtil.format( AV80Kgsd, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTSD", GXutil.ltrim( localUtil.ntoc( AV106Mtsd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTSD", getSecureSignedToken( "", localUtil.format( AV106Mtsd, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRREO", GXutil.rtrim( AV5AlbRreo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5AlbRreo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT20", GXutil.rtrim( AV94Lit20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIT20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV94Lit20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT21", GXutil.rtrim( AV95Lit21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIT21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV95Lit21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTATEX", GXutil.ltrim( localUtil.ntoc( AV110Tintatex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTATEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Tintatex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBWSELPZASDS_1_EMPRCOD", GXutil.rtrim( AV126Webwselpzasds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBWSELPZASDS_2_ALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV127Webwselpzasds_2_albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALORI", GXutil.ltrim( localUtil.ntoc( AV116Valori, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Width", GXutil.rtrim( Dvpanel_totales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Autowidth", GXutil.booltostr( Dvpanel_totales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Autoheight", GXutil.booltostr( Dvpanel_totales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Cls", GXutil.rtrim( Dvpanel_totales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Title", GXutil.rtrim( Dvpanel_totales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Collapsible", GXutil.booltostr( Dvpanel_totales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Collapsed", GXutil.booltostr( Dvpanel_totales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Showcollapseicon", GXutil.booltostr( Dvpanel_totales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Iconposition", GXutil.rtrim( Dvpanel_totales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Autoscroll", GXutil.booltostr( Dvpanel_totales_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         weK32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtK32( ) ;
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
      return formatLink("app.webwselpzas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV77EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71ALbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV75DisCod,8,0))}, new String[] {"EmprCod","ALbRecCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "WebWSelPzas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", "") ;
   }

   public void wbK30( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainWithShadow", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavValor_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValor_Internalname, GXutil.ltrim( localUtil.ntoc( AV115Valor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV115Valor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV115Valor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavValor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWSelPzas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnseleccionar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Seleccionar", ""), bttBtnseleccionar_Jsonclick, 7, httpContext.getMessage( "Seleccionar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11k31_client"+"'", TempTags, "", 2, "HLP_WebWSelPzas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnactualizar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Actualizar", ""), bttBtnactualizar_Jsonclick, 5, httpContext.getMessage( "Actualizar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOACTUALIZAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWSelPzas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Marcar Todos", ""), bttBtnmarcartodos_Jsonclick, 7, httpContext.getMessage( "Marcar Todos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12k31_client"+"'", TempTags, "", 2, "HLP_WebWSelPzas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Desmarcar Todos", ""), bttBtndesmarcartodos_Jsonclick, 7, httpContext.getMessage( "Desmarcar Todos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e13k31_client"+"'", TempTags, "", 2, "HLP_WebWSelPzas.htm");
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
         /* User Defined Control */
         ucDvpanel_totales.setProperty("Width", Dvpanel_totales_Width);
         ucDvpanel_totales.setProperty("AutoWidth", Dvpanel_totales_Autowidth);
         ucDvpanel_totales.setProperty("AutoHeight", Dvpanel_totales_Autoheight);
         ucDvpanel_totales.setProperty("Cls", Dvpanel_totales_Cls);
         ucDvpanel_totales.setProperty("Title", Dvpanel_totales_Title);
         ucDvpanel_totales.setProperty("Collapsible", Dvpanel_totales_Collapsible);
         ucDvpanel_totales.setProperty("Collapsed", Dvpanel_totales_Collapsed);
         ucDvpanel_totales.setProperty("ShowCollapseIcon", Dvpanel_totales_Showcollapseicon);
         ucDvpanel_totales.setProperty("IconPosition", Dvpanel_totales_Iconposition);
         ucDvpanel_totales.setProperty("AutoScroll", Dvpanel_totales_Autoscroll);
         ucDvpanel_totales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_totales_Internalname, "DVPANEL_TOTALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TOTALESContainer"+"Totales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTotales_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotk_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotk_Internalname, httpContext.getMessage( "Kilos", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotk_Internalname, GXutil.ltrim( localUtil.ntoc( AV111Totk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotk_Enabled!=0) ? localUtil.format( AV111Totk, "ZZZZZZ9.99") : localUtil.format( AV111Totk, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotk_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotk_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWSelPzas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotm_Internalname, httpContext.getMessage( "Metros", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotm_Internalname, GXutil.ltrim( localUtil.ntoc( AV112TotM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotm_Enabled!=0) ? localUtil.format( AV112TotM, "ZZZZZZ9.99") : localUtil.format( AV112TotM, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWSelPzas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotp_Internalname, httpContext.getMessage( "PIezas", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotp_Internalname, GXutil.ltrim( localUtil.ntoc( AV113TotP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV113TotP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV113TotP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotp_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWSelPzas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void startK32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupK30( ) ;
   }

   public void wsK32( )
   {
      startK32( ) ;
      evtK32( ) ;
   }

   public void evtK32( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14K32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoActualizar' */
                           e15K32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
                           AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
                           AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
                           AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
                           AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
                           AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
                           AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
                           AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
                           AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
                           AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
                           AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
                           AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
                           AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
                           AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV123GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123GridActions), 4, 0));
                           AV117Seleccionado = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionado.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionado.getInternalname(), AV117Seleccionado);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGSSALD");
                              GX_FocusControl = edtavKgssald_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV81KgsSald = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV81KgsSald, 9, 2));
                           }
                           else
                           {
                              AV81KgsSald = localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV81KgsSald, 9, 2));
                           }
                           A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
                           A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTSSALD");
                              GX_FocusControl = edtavMtssald_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV107MtsSald = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107MtsSald), 4, 0));
                           }
                           else
                           {
                              AV107MtsSald = (short)(localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107MtsSald), 4, 0));
                           }
                           A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
                           A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
                           cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
                           A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
                           AV108PieUti = httpContext.cgiGet( edtavPieuti_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPieuti_Internalname, AV108PieUti);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPIEUTI"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV108PieUti, ""))));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16K32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e17K32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e18K32 ();
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

   public void weK32( )
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

   public void paK32( )
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
            GX_FocusControl = edtavValor_Internalname ;
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV77EmprCod ,
                                 int AV71ALbRecCod ,
                                 String AV56TFAlbRecPie ,
                                 String AV57TFAlbRecPie_Sel ,
                                 java.math.BigDecimal AV48TFAlbRecKgm ,
                                 java.math.BigDecimal AV49TFAlbRecKgm_To ,
                                 java.math.BigDecimal AV50TFAlbRecKgmU ,
                                 java.math.BigDecimal AV51TFAlbRecKgmU_To ,
                                 java.math.BigDecimal AV52TFAlbRecMtr ,
                                 java.math.BigDecimal AV53TFAlbRecMtr_To ,
                                 java.math.BigDecimal AV54TFAlbRecMtrU ,
                                 java.math.BigDecimal AV55TFAlbRecMtrU_To ,
                                 GXSimpleCollection<String> AV58TFAlbRUni_Sels ,
                                 GXSimpleCollection<String> AV120TFAlbRReo_Sels ,
                                 String AV146Pgmname ,
                                 short AV42OrderedBy ,
                                 boolean AV44OrderedDsc ,
                                 int AV75DisCod ,
                                 String AV126Webwselpzasds_1_emprcod ,
                                 int AV127Webwselpzasds_2_albreccod ,
                                 java.math.BigDecimal AV80Kgsd ,
                                 java.math.BigDecimal AV106Mtsd ,
                                 String AV5AlbRreo ,
                                 String AV94Lit20 ,
                                 String AV95Lit21 ,
                                 byte AV110Tintatex )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e17K32 ();
      GRID_nCurrentRecord = 0 ;
      rfK32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECKGM", getSecureSignedToken( "", localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECKGMU", getSecureSignedToken( "", localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECPIE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A2159AlbRecPie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE", GXutil.rtrim( A2159AlbRecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECMTR", getSecureSignedToken( "", localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECMTRU", getSecureSignedToken( "", localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPIEUTI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108PieUti, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEUTI", AV108PieUti);
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfK32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV146Pgmname = "WebWSelPzas" ;
      Gx_err = (short)(0) ;
      edtavKgssald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgssald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgssald_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMtssald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtssald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtssald_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavPieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPieuti_Enabled), 5, 0), !bGXsfl_52_Refreshing);
   }

   public void rfK32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e17K32 ();
      nGXsfl_52_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_522( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A56AlbRUni ,
                                              AV138Webwselpzasds_13_tfalbruni_sels ,
                                              A55AlbRReo ,
                                              AV139Webwselpzasds_14_tfalbrreo_sels ,
                                              AV129Webwselpzasds_4_tfalbrecpie_sel ,
                                              AV128Webwselpzasds_3_tfalbrecpie ,
                                              AV130Webwselpzasds_5_tfalbreckgm ,
                                              AV131Webwselpzasds_6_tfalbreckgm_to ,
                                              AV132Webwselpzasds_7_tfalbreckgmu ,
                                              AV133Webwselpzasds_8_tfalbreckgmu_to ,
                                              AV134Webwselpzasds_9_tfalbrecmtr ,
                                              AV135Webwselpzasds_10_tfalbrecmtr_to ,
                                              AV136Webwselpzasds_11_tfalbrecmtru ,
                                              AV137Webwselpzasds_12_tfalbrecmtru_to ,
                                              Integer.valueOf(AV138Webwselpzasds_13_tfalbruni_sels.size()) ,
                                              Integer.valueOf(AV139Webwselpzasds_14_tfalbrreo_sels.size()) ,
                                              A2159AlbRecPie ,
                                              A2155AlbRecKgm ,
                                              A2156AlbRecKgmU ,
                                              A2157AlbRecMtr ,
                                              A2158AlbRecMtrU ,
                                              Short.valueOf(AV42OrderedBy) ,
                                              Boolean.valueOf(AV44OrderedDsc) ,
                                              A396EmprCod ,
                                              AV77EmprCod ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              Integer.valueOf(AV71ALbRecCod) ,
                                              AV126Webwselpzasds_1_emprcod ,
                                              Integer.valueOf(AV127Webwselpzasds_2_albreccod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV128Webwselpzasds_3_tfalbrecpie = GXutil.padr( GXutil.rtrim( AV128Webwselpzasds_3_tfalbrecpie), 9, "%") ;
         /* Using cursor H00K32 */
         pr_default.execute(0, new Object[] {AV126Webwselpzasds_1_emprcod, Integer.valueOf(AV127Webwselpzasds_2_albreccod), AV77EmprCod, Integer.valueOf(AV71ALbRecCod), lV128Webwselpzasds_3_tfalbrecpie, AV129Webwselpzasds_4_tfalbrecpie_sel, AV130Webwselpzasds_5_tfalbreckgm, AV131Webwselpzasds_6_tfalbreckgm_to, AV132Webwselpzasds_7_tfalbreckgmu, AV133Webwselpzasds_8_tfalbreckgmu_to, AV134Webwselpzasds_9_tfalbrecmtr, AV135Webwselpzasds_10_tfalbrecmtr_to, AV136Webwselpzasds_11_tfalbrecmtru, AV137Webwselpzasds_12_tfalbrecmtru_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_52_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A55AlbRReo = H00K32_A55AlbRReo[0] ;
            A56AlbRUni = H00K32_A56AlbRUni[0] ;
            A2158AlbRecMtrU = H00K32_A2158AlbRecMtrU[0] ;
            A2157AlbRecMtr = H00K32_A2157AlbRecMtr[0] ;
            A2156AlbRecKgmU = H00K32_A2156AlbRecKgmU[0] ;
            A2155AlbRecKgm = H00K32_A2155AlbRecKgm[0] ;
            A2159AlbRecPie = H00K32_A2159AlbRecPie[0] ;
            A44AlbRecCod = H00K32_A44AlbRecCod[0] ;
            A407EmprNom = H00K32_A407EmprNom[0] ;
            n407EmprNom = H00K32_n407EmprNom[0] ;
            A396EmprCod = H00K32_A396EmprCod[0] ;
            A407EmprNom = H00K32_A407EmprNom[0] ;
            n407EmprNom = H00K32_n407EmprNom[0] ;
            A55AlbRReo = H00K32_A55AlbRReo[0] ;
            A56AlbRUni = H00K32_A56AlbRUni[0] ;
            e18K32 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(52) ;
         wbK30( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesK32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV77EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV71ALbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71ALbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV146Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV75DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECKGM"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECKGMU"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECPIE"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( A2159AlbRecPie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vKGSD", GXutil.ltrim( localUtil.ntoc( AV80Kgsd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGSD", getSecureSignedToken( "", localUtil.format( AV80Kgsd, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECMTR"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECMTRU"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTSD", GXutil.ltrim( localUtil.ntoc( AV106Mtsd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTSD", getSecureSignedToken( "", localUtil.format( AV106Mtsd, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRREO", GXutil.rtrim( AV5AlbRreo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5AlbRreo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT20", GXutil.rtrim( AV94Lit20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIT20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV94Lit20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT21", GXutil.rtrim( AV95Lit21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIT21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV95Lit21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPIEUTI"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV108PieUti, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTATEX", GXutil.ltrim( localUtil.ntoc( AV110Tintatex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTATEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Tintatex), "9")));
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
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV138Webwselpzasds_13_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV139Webwselpzasds_14_tfalbrreo_sels ,
                                           AV129Webwselpzasds_4_tfalbrecpie_sel ,
                                           AV128Webwselpzasds_3_tfalbrecpie ,
                                           AV130Webwselpzasds_5_tfalbreckgm ,
                                           AV131Webwselpzasds_6_tfalbreckgm_to ,
                                           AV132Webwselpzasds_7_tfalbreckgmu ,
                                           AV133Webwselpzasds_8_tfalbreckgmu_to ,
                                           AV134Webwselpzasds_9_tfalbrecmtr ,
                                           AV135Webwselpzasds_10_tfalbrecmtr_to ,
                                           AV136Webwselpzasds_11_tfalbrecmtru ,
                                           AV137Webwselpzasds_12_tfalbrecmtru_to ,
                                           Integer.valueOf(AV138Webwselpzasds_13_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV139Webwselpzasds_14_tfalbrreo_sels.size()) ,
                                           A2159AlbRecPie ,
                                           A2155AlbRecKgm ,
                                           A2156AlbRecKgmU ,
                                           A2157AlbRecMtr ,
                                           A2158AlbRecMtrU ,
                                           Short.valueOf(AV42OrderedBy) ,
                                           Boolean.valueOf(AV44OrderedDsc) ,
                                           A396EmprCod ,
                                           AV77EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV71ALbRecCod) ,
                                           AV126Webwselpzasds_1_emprcod ,
                                           Integer.valueOf(AV127Webwselpzasds_2_albreccod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV128Webwselpzasds_3_tfalbrecpie = GXutil.padr( GXutil.rtrim( AV128Webwselpzasds_3_tfalbrecpie), 9, "%") ;
      /* Using cursor H00K33 */
      pr_default.execute(1, new Object[] {AV126Webwselpzasds_1_emprcod, Integer.valueOf(AV127Webwselpzasds_2_albreccod), AV77EmprCod, Integer.valueOf(AV71ALbRecCod), lV128Webwselpzasds_3_tfalbrecpie, AV129Webwselpzasds_4_tfalbrecpie_sel, AV130Webwselpzasds_5_tfalbreckgm, AV131Webwselpzasds_6_tfalbreckgm_to, AV132Webwselpzasds_7_tfalbreckgmu, AV133Webwselpzasds_8_tfalbreckgmu_to, AV134Webwselpzasds_9_tfalbrecmtr, AV135Webwselpzasds_10_tfalbrecmtr_to, AV136Webwselpzasds_11_tfalbrecmtru, AV137Webwselpzasds_12_tfalbrecmtru_to});
      GRID_nRecordCount = H00K33_AGRID_nRecordCount[0] ;
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
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77EmprCod, AV71ALbRecCod, AV56TFAlbRecPie, AV57TFAlbRecPie_Sel, AV48TFAlbRecKgm, AV49TFAlbRecKgm_To, AV50TFAlbRecKgmU, AV51TFAlbRecKgmU_To, AV52TFAlbRecMtr, AV53TFAlbRecMtr_To, AV54TFAlbRecMtrU, AV55TFAlbRecMtrU_To, AV58TFAlbRUni_Sels, AV120TFAlbRReo_Sels, AV146Pgmname, AV42OrderedBy, AV44OrderedDsc, AV75DisCod, AV126Webwselpzasds_1_emprcod, AV127Webwselpzasds_2_albreccod, AV80Kgsd, AV106Mtsd, AV5AlbRreo, AV94Lit20, AV95Lit21, AV110Tintatex) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77EmprCod, AV71ALbRecCod, AV56TFAlbRecPie, AV57TFAlbRecPie_Sel, AV48TFAlbRecKgm, AV49TFAlbRecKgm_To, AV50TFAlbRecKgmU, AV51TFAlbRecKgmU_To, AV52TFAlbRecMtr, AV53TFAlbRecMtr_To, AV54TFAlbRecMtrU, AV55TFAlbRecMtrU_To, AV58TFAlbRUni_Sels, AV120TFAlbRReo_Sels, AV146Pgmname, AV42OrderedBy, AV44OrderedDsc, AV75DisCod, AV126Webwselpzasds_1_emprcod, AV127Webwselpzasds_2_albreccod, AV80Kgsd, AV106Mtsd, AV5AlbRreo, AV94Lit20, AV95Lit21, AV110Tintatex) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77EmprCod, AV71ALbRecCod, AV56TFAlbRecPie, AV57TFAlbRecPie_Sel, AV48TFAlbRecKgm, AV49TFAlbRecKgm_To, AV50TFAlbRecKgmU, AV51TFAlbRecKgmU_To, AV52TFAlbRecMtr, AV53TFAlbRecMtr_To, AV54TFAlbRecMtrU, AV55TFAlbRecMtrU_To, AV58TFAlbRUni_Sels, AV120TFAlbRReo_Sels, AV146Pgmname, AV42OrderedBy, AV44OrderedDsc, AV75DisCod, AV126Webwselpzasds_1_emprcod, AV127Webwselpzasds_2_albreccod, AV80Kgsd, AV106Mtsd, AV5AlbRreo, AV94Lit20, AV95Lit21, AV110Tintatex) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77EmprCod, AV71ALbRecCod, AV56TFAlbRecPie, AV57TFAlbRecPie_Sel, AV48TFAlbRecKgm, AV49TFAlbRecKgm_To, AV50TFAlbRecKgmU, AV51TFAlbRecKgmU_To, AV52TFAlbRecMtr, AV53TFAlbRecMtr_To, AV54TFAlbRecMtrU, AV55TFAlbRecMtrU_To, AV58TFAlbRUni_Sels, AV120TFAlbRReo_Sels, AV146Pgmname, AV42OrderedBy, AV44OrderedDsc, AV75DisCod, AV126Webwselpzasds_1_emprcod, AV127Webwselpzasds_2_albreccod, AV80Kgsd, AV106Mtsd, AV5AlbRreo, AV94Lit20, AV95Lit21, AV110Tintatex) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77EmprCod, AV71ALbRecCod, AV56TFAlbRecPie, AV57TFAlbRecPie_Sel, AV48TFAlbRecKgm, AV49TFAlbRecKgm_To, AV50TFAlbRecKgmU, AV51TFAlbRecKgmU_To, AV52TFAlbRecMtr, AV53TFAlbRecMtr_To, AV54TFAlbRecMtrU, AV55TFAlbRecMtrU_To, AV58TFAlbRUni_Sels, AV120TFAlbRReo_Sels, AV146Pgmname, AV42OrderedBy, AV44OrderedDsc, AV75DisCod, AV126Webwselpzasds_1_emprcod, AV127Webwselpzasds_2_albreccod, AV80Kgsd, AV106Mtsd, AV5AlbRreo, AV94Lit20, AV95Lit21, AV110Tintatex) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV146Pgmname = "WebWSelPzas" ;
      Gx_err = (short)(0) ;
      edtavKgssald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgssald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgssald_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMtssald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtssald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtssald_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavPieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPieuti_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupK30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16K32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV19DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV110Tintatex = (byte)(localUtil.ctol( httpContext.cgiGet( "vTINTATEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV116Valori = (short)(localUtil.ctol( httpContext.cgiGet( "vVALORI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_totales_Width = httpContext.cgiGet( "DVPANEL_TOTALES_Width") ;
         Dvpanel_totales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Autowidth")) ;
         Dvpanel_totales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Autoheight")) ;
         Dvpanel_totales_Cls = httpContext.cgiGet( "DVPANEL_TOTALES_Cls") ;
         Dvpanel_totales_Title = httpContext.cgiGet( "DVPANEL_TOTALES_Title") ;
         Dvpanel_totales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Collapsible")) ;
         Dvpanel_totales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Collapsed")) ;
         Dvpanel_totales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Showcollapseicon")) ;
         Dvpanel_totales_Iconposition = httpContext.cgiGet( "DVPANEL_TOTALES_Iconposition") ;
         Dvpanel_totales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Autoscroll")) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
            GX_FocusControl = edtavValor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV115Valor = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115Valor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115Valor), 4, 0));
         }
         else
         {
            AV115Valor = (short)(localUtil.ctol( httpContext.cgiGet( edtavValor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115Valor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115Valor), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTK");
            GX_FocusControl = edtavTotk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV111Totk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111Totk", GXutil.ltrimstr( AV111Totk, 10, 2));
         }
         else
         {
            AV111Totk = localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111Totk", GXutil.ltrimstr( AV111Totk, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTM");
            GX_FocusControl = edtavTotm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV112TotM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TotM", GXutil.ltrimstr( AV112TotM, 10, 2));
         }
         else
         {
            AV112TotM = localUtil.ctond( httpContext.cgiGet( edtavTotm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TotM", GXutil.ltrimstr( AV112TotM, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTotp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTotp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTP");
            GX_FocusControl = edtavTotp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV113TotP = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TotP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TotP), 4, 0));
         }
         else
         {
            AV113TotP = (short)(localUtil.ctol( httpContext.cgiGet( edtavTotp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TotP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TotP), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e16K32 ();
      if (returnInSub) return;
   }

   public void e16K32( )
   {
      /* Start Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem("Gestión para "+GXutil.str( AV71ALbRecCod, 8, 0));
      Form.setCaption( Form.getCaption()+" Gestión para "+GXutil.str( AV71ALbRecCod, 8, 0) );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      GXt_char1 = AV109Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwselpzas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV109Station = GXt_char1 ;
      GXv_char2[0] = AV121StationEmprCod ;
      GXv_char3[0] = AV78EmprNom ;
      GXv_char4[0] = AV114UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV109Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwselpzas_impl.this.AV121StationEmprCod = GXv_char2[0] ;
      webwselpzas_impl.this.AV78EmprNom = GXv_char3[0] ;
      webwselpzas_impl.this.AV114UsurCod = GXv_char4[0] ;
      GXt_int5 = AV110Tintatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV77EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int6) ;
      webwselpzas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV110Tintatex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110Tintatex", GXutil.str( AV110Tintatex, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTATEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110Tintatex), "9")));
      GXt_char1 = AV109Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwselpzas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV109Station = GXt_char1 ;
      GXv_char4[0] = AV77EmprCod ;
      GXv_char3[0] = AV78EmprNom ;
      GXv_char2[0] = AV114UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV109Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwselpzas_impl.this.AV77EmprCod = GXv_char4[0] ;
      webwselpzas_impl.this.AV78EmprNom = GXv_char3[0] ;
      webwselpzas_impl.this.AV114UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77EmprCod", AV77EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77EmprCod, "@!"))));
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV42OrderedBy < 1 )
      {
         AV42OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
   }

   public void e17K32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV70WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV70WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV126Webwselpzasds_1_emprcod = AV77EmprCod ;
      AV127Webwselpzasds_2_albreccod = AV71ALbRecCod ;
      AV128Webwselpzasds_3_tfalbrecpie = AV56TFAlbRecPie ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = AV57TFAlbRecPie_Sel ;
      AV130Webwselpzasds_5_tfalbreckgm = AV48TFAlbRecKgm ;
      AV131Webwselpzasds_6_tfalbreckgm_to = AV49TFAlbRecKgm_To ;
      AV132Webwselpzasds_7_tfalbreckgmu = AV50TFAlbRecKgmU ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = AV51TFAlbRecKgmU_To ;
      AV134Webwselpzasds_9_tfalbrecmtr = AV52TFAlbRecMtr ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = AV53TFAlbRecMtr_To ;
      AV136Webwselpzasds_11_tfalbrecmtru = AV54TFAlbRecMtrU ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = AV55TFAlbRecMtrU_To ;
      AV138Webwselpzasds_13_tfalbruni_sels = AV58TFAlbRUni_Sels ;
      AV139Webwselpzasds_14_tfalbrreo_sels = AV120TFAlbRReo_Sels ;
   }

   public void e14K32( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV42OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42OrderedBy), 4, 0));
         AV44OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedDsc", AV44OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecPie") == 0 )
         {
            AV56TFAlbRecPie = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbRecPie", AV56TFAlbRecPie);
            AV57TFAlbRecPie_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRecPie_Sel", AV57TFAlbRecPie_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecKgm") == 0 )
         {
            AV48TFAlbRecKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbRecKgm", GXutil.ltrimstr( AV48TFAlbRecKgm, 9, 2));
            AV49TFAlbRecKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRecKgm_To", GXutil.ltrimstr( AV49TFAlbRecKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecKgmU") == 0 )
         {
            AV50TFAlbRecKgmU = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRecKgmU", GXutil.ltrimstr( AV50TFAlbRecKgmU, 9, 2));
            AV51TFAlbRecKgmU_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbRecKgmU_To", GXutil.ltrimstr( AV51TFAlbRecKgmU_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecMtr") == 0 )
         {
            AV52TFAlbRecMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRecMtr", GXutil.ltrimstr( AV52TFAlbRecMtr, 9, 2));
            AV53TFAlbRecMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRecMtr_To", GXutil.ltrimstr( AV53TFAlbRecMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecMtrU") == 0 )
         {
            AV54TFAlbRecMtrU = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRecMtrU", GXutil.ltrimstr( AV54TFAlbRecMtrU, 9, 2));
            AV55TFAlbRecMtrU_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRecMtrU_To", GXutil.ltrimstr( AV55TFAlbRecMtrU_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV59TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRUni_SelsJson", AV59TFAlbRUni_SelsJson);
            AV58TFAlbRUni_Sels.fromJSonString(AV59TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRReo") == 0 )
         {
            AV119TFAlbRReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFAlbRReo_SelsJson", AV119TFAlbRReo_SelsJson);
            AV120TFAlbRReo_Sels.fromJSonString(AV119TFAlbRReo_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV120TFAlbRReo_Sels", AV120TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFAlbRUni_Sels", AV58TFAlbRUni_Sels);
   }

   private void e18K32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      AV117Seleccionado = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionado.getInternalname(), AV117Seleccionado);
      AV5AlbRreo = A55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRreo", AV5AlbRreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5AlbRreo, "@!"))));
      AV107MtsSald = (short)(DecimalUtil.decToDouble(A2157AlbRecMtr.subtract(A2158AlbRecMtrU))) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107MtsSald), 4, 0));
      AV81KgsSald = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV81KgsSald, 9, 2));
      AV106Mtsd = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Mtsd", GXutil.ltrimstr( AV106Mtsd, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMTSD", getSecureSignedToken( "", localUtil.format( AV106Mtsd, "ZZZZZ9.99")));
      AV80Kgsd = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Kgsd", GXutil.ltrimstr( AV80Kgsd, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKGSD", getSecureSignedToken( "", localUtil.format( AV80Kgsd, "ZZZZZ9.99")));
      GXt_char1 = AV108PieUti ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
      webwselpzas_impl.this.A396EmprCod = GXv_char4[0] ;
      webwselpzas_impl.this.A44AlbRecCod = GXv_int10[0] ;
      webwselpzas_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      webwselpzas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV108PieUti = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPieuti_Internalname, AV108PieUti);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPIEUTI"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV108PieUti, ""))));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(52) ;
      }
      sendrow_522( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV123GridActions, 4, 0)) );
   }

   public void e15K32( )
   {
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      AV79Error_l = (byte)(0) ;
      Gx_msg = "" ;
      /* Start For Each Line */
      nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_52_fel_idx = 0 ;
      while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
      {
         nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
         sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_522( ) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV123GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         AV117Seleccionado = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionado.getInternalname())) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGSSALD");
            GX_FocusControl = edtavKgssald_Internalname ;
            wbErr = true ;
            AV81KgsSald = DecimalUtil.ZERO ;
         }
         else
         {
            AV81KgsSald = localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)) ;
         }
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTSSALD");
            GX_FocusControl = edtavMtssald_Internalname ;
            wbErr = true ;
            AV107MtsSald = (short)(0) ;
         }
         else
         {
            AV107MtsSald = (short)(localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
         cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         AV108PieUti = httpContext.cgiGet( edtavPieuti_Internalname) ;
         if ( AV117Seleccionado )
         {
            if ( ( DecimalUtil.compareTo(AV81KgsSald, (A2155AlbRecKgm.subtract(A2156AlbRecKgmU))) > 0 ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) )
            {
               AV79Error_l = (byte)(1) ;
               Gx_msg = "Pieza = " + A2159AlbRecPie + " <BR>" ;
               Gx_msg += "Kilos= " + GXutil.str( AV81KgsSald, 9, 2) + httpContext.getMessage( " superior  <BR>", "") ;
               Gx_msg += "Kilos Disponibles= " + GXutil.str( AV80Kgsd, 9, 2) + " <BR>" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( ( AV81KgsSald.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) )
            {
               AV79Error_l = (byte)(1) ;
               Gx_msg = "Pieza = " + A2159AlbRecPie + " <BR>" ;
               Gx_msg += "NO tiene Kilos Disponibles <BR>" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( ( AV107MtsSald > (A2157AlbRecMtr.subtract(A2158AlbRecMtrU)).doubleValue() ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) )
            {
               AV79Error_l = (byte)(1) ;
               Gx_msg = "Pieza = " + A2159AlbRecPie + " <BR>" ;
               Gx_msg = "Metros= " + GXutil.str( AV107MtsSald, 4, 0) + httpContext.getMessage( " superior  <BR>", "") ;
               Gx_msg += "Metros Disponibles= " + GXutil.str( AV106Mtsd, 9, 2) + " <BR>" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( ( AV107MtsSald == 0 ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) )
            {
               AV79Error_l = (byte)(1) ;
               Gx_msg = "Pieza = " + A2159AlbRecPie + " <BR>" ;
               Gx_msg += "NO tiene Metros Disponibles <BR>" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* End For Each Line */
      }
      if ( nGXsfl_52_fel_idx == 0 )
      {
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      nGXsfl_52_fel_idx = 1 ;
      if ( ! (GXutil.strcmp("", Gx_msg)==0) )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         AV104Msg_e = "" ;
         AV122Realizado = false ;
         /* Start For Each Line */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_52_fel_idx = 0 ;
         while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
         {
            nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
            sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_522( ) ;
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV123GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            AV117Seleccionado = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionado.getInternalname())) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGSSALD");
               GX_FocusControl = edtavKgssald_Internalname ;
               wbErr = true ;
               AV81KgsSald = DecimalUtil.ZERO ;
            }
            else
            {
               AV81KgsSald = localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)) ;
            }
            A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
            A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTSSALD");
               GX_FocusControl = edtavMtssald_Internalname ;
               wbErr = true ;
               AV107MtsSald = (short)(0) ;
            }
            else
            {
               AV107MtsSald = (short)(localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
            A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            AV108PieUti = httpContext.cgiGet( edtavPieuti_Internalname) ;
            if ( AV117Seleccionado )
            {
               AV72AlbRecCodout = AV71ALbRecCod ;
               AV73AlbRecPie = A2159AlbRecPie ;
               AV76DisCodout = AV75DisCod ;
               GXv_char4[0] = A396EmprCod ;
               GXv_int10[0] = AV76DisCodout ;
               GXv_int11[0] = AV72AlbRecCodout ;
               GXv_char3[0] = AV73AlbRecPie ;
               GXv_decimal12[0] = AV81KgsSald ;
               GXv_decimal13[0] = DecimalUtil.doubleToDec(AV107MtsSald) ;
               new app.pactalb3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_decimal12, GXv_decimal13) ;
               webwselpzas_impl.this.A396EmprCod = GXv_char4[0] ;
               webwselpzas_impl.this.AV76DisCodout = GXv_int10[0] ;
               webwselpzas_impl.this.AV72AlbRecCodout = GXv_int11[0] ;
               webwselpzas_impl.this.AV73AlbRecPie = GXv_char3[0] ;
               webwselpzas_impl.this.AV81KgsSald = GXv_decimal12[0] ;
               webwselpzas_impl.this.AV107MtsSald = (short)(DecimalUtil.decToDouble(GXv_decimal13[0])) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavKgssald_Internalname, GXutil.ltrimstr( AV81KgsSald, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, edtavMtssald_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107MtsSald), 4, 0));
               if ( ! AV122Realizado )
               {
                  AV122Realizado = true ;
               }
               if ( GXutil.strcmp(AV5AlbRreo, "S") == 0 )
               {
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int11[0] = AV72AlbRecCodout ;
                  GXv_int10[0] = AV76DisCodout ;
                  new app.ptdisdef(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int10) ;
                  webwselpzas_impl.this.A396EmprCod = GXv_char4[0] ;
                  webwselpzas_impl.this.AV72AlbRecCodout = GXv_int11[0] ;
                  webwselpzas_impl.this.AV76DisCodout = GXv_int10[0] ;
               }
               AV104Msg_e = GXutil.trim( AV94Lit20) + "= " + GXutil.trim( GXutil.str( AV71ALbRecCod, 8, 0)) + GXutil.newLine( ) ;
               AV104Msg_e += "creado en " + GXutil.trim( AV95Lit21) + "= " + GXutil.trim( GXutil.str( AV75DisCod, 8, 0)) + GXutil.newLine( ) ;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_52_fel_idx == 0 )
         {
            nGXsfl_52_idx = 1 ;
            sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_522( ) ;
         }
         nGXsfl_52_fel_idx = 1 ;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV42OrderedBy, 4, 0))+":"+(AV44OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S172( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue(AV146Pgmname+"GridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV146Pgmname+"GridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV45Session.getValue(AV146Pgmname+"GridState"), null, null);
      }
      AV42OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42OrderedBy), 4, 0));
      AV44OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedDsc", AV44OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV147GXV1 = 1 ;
      while ( AV147GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV147GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE") == 0 )
         {
            AV56TFAlbRecPie = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbRecPie", AV56TFAlbRecPie);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE_SEL") == 0 )
         {
            AV57TFAlbRecPie_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRecPie_Sel", AV57TFAlbRecPie_Sel);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGM") == 0 )
         {
            AV48TFAlbRecKgm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbRecKgm", GXutil.ltrimstr( AV48TFAlbRecKgm, 9, 2));
            AV49TFAlbRecKgm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRecKgm_To", GXutil.ltrimstr( AV49TFAlbRecKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGMU") == 0 )
         {
            AV50TFAlbRecKgmU = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRecKgmU", GXutil.ltrimstr( AV50TFAlbRecKgmU, 9, 2));
            AV51TFAlbRecKgmU_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbRecKgmU_To", GXutil.ltrimstr( AV51TFAlbRecKgmU_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTR") == 0 )
         {
            AV52TFAlbRecMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRecMtr", GXutil.ltrimstr( AV52TFAlbRecMtr, 9, 2));
            AV53TFAlbRecMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRecMtr_To", GXutil.ltrimstr( AV53TFAlbRecMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTRU") == 0 )
         {
            AV54TFAlbRecMtrU = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRecMtrU", GXutil.ltrimstr( AV54TFAlbRecMtrU, 9, 2));
            AV55TFAlbRecMtrU_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRecMtrU_To", GXutil.ltrimstr( AV55TFAlbRecMtrU_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV59TFAlbRUni_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRUni_SelsJson", AV59TFAlbRUni_SelsJson);
            AV58TFAlbRUni_Sels.fromJSonString(AV59TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV119TFAlbRReo_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFAlbRReo_SelsJson", AV119TFAlbRReo_SelsJson);
            AV120TFAlbRReo_Sels.fromJSonString(AV119TFAlbRReo_SelsJson, null);
         }
         AV147GXV1 = (int)(AV147GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFAlbRecPie_Sel)==0), AV57TFAlbRecPie_Sel, GXv_char4) ;
      webwselpzas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV58TFAlbRUni_Sels.size()==0), AV59TFAlbRUni_SelsJson, GXv_char3) ;
      webwselpzas_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV120TFAlbRReo_Sels.size()==0), AV119TFAlbRReo_SelsJson, GXv_char2) ;
      webwselpzas_impl.this.GXt_char15 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||||"+GXt_char14+"|"+GXt_char15 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFAlbRecPie)==0), AV56TFAlbRecPie, GXv_char4) ;
      webwselpzas_impl.this.GXt_char15 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char15+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFAlbRecKgm)==0) ? "" : GXutil.str( AV48TFAlbRecKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFAlbRecKgmU)==0) ? "" : GXutil.str( AV50TFAlbRecKgmU, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbRecMtr)==0) ? "" : GXutil.str( AV52TFAlbRecMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFAlbRecMtrU)==0) ? "" : GXutil.str( AV54TFAlbRecMtrU, 9, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFAlbRecKgm_To)==0) ? "" : GXutil.str( AV49TFAlbRecKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbRecKgmU_To)==0) ? "" : GXutil.str( AV51TFAlbRecKgmU_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFAlbRecMtr_To)==0) ? "" : GXutil.str( AV53TFAlbRecMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFAlbRecMtrU_To)==0) ? "" : GXutil.str( AV55TFAlbRecMtrU_To, 9, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV34GridState.fromxml(AV45Session.getValue(AV146Pgmname+"GridState"), null, null);
      AV34GridState.setgxTv_SdtWWPGridState_Orderedby( AV42OrderedBy );
      AV34GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV44OrderedDsc );
      AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECPIE", "", !(GXutil.strcmp("", AV56TFAlbRecPie)==0), (short)(0), AV56TFAlbRecPie, "", !(GXutil.strcmp("", AV57TFAlbRecPie_Sel)==0), AV57TFAlbRecPie_Sel, "") ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFAlbRecKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFAlbRecKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFAlbRecKgm, 9, 2)), GXutil.trim( GXutil.str( AV49TFAlbRecKgm_To, 9, 2))) ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECKGMU", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFAlbRecKgmU)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbRecKgmU_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFAlbRecKgmU, 9, 2)), GXutil.trim( GXutil.str( AV51TFAlbRecKgmU_To, 9, 2))) ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbRecMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFAlbRecMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFAlbRecMtr, 9, 2)), GXutil.trim( GXutil.str( AV53TFAlbRecMtr_To, 9, 2))) ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRECMTRU", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFAlbRecMtrU)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFAlbRecMtrU_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFAlbRecMtrU, 9, 2)), GXutil.trim( GXutil.str( AV55TFAlbRecMtrU_To, 9, 2))) ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRUNI_SEL", "", !(AV58TFAlbRUni_Sels.size()==0), (short)(0), AV58TFAlbRUni_Sels.toJSonString(false), "") ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBRREO_SEL", "", !(AV120TFAlbRReo_Sels.size()==0), (short)(0), AV120TFAlbRReo_Sels.toJSonString(false), "") ;
      AV34GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV77EmprCod)==0) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV77EmprCod );
         AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (0==AV71ALbRecCod) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRECCOD" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71ALbRecCod, 8, 0) );
         AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      if ( ! (0==AV75DisCod) )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISCOD" );
         AV36GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV75DisCod, 8, 0) );
         AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV36GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV146Pgmname+"GridState", AV34GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV63TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV146Pgmname );
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV37HTTPRequest.getScriptName()+"?"+AV37HTTPRequest.getQuerystring() );
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBDET2" );
      AV64TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV64TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV64TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV77EmprCod );
      AV63TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV64TrnContextAtt, 0);
      AV64TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV64TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "AlbRecCod" );
      AV64TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV71ALbRecCod, 8, 0) );
      AV63TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV64TrnContextAtt, 0);
      AV45Session.setValue("TrnContext", AV63TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S182( )
   {
      /* 'TOTALES SELECCIONADOS' Routine */
      returnInSub = false ;
      AV111Totk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Totk", GXutil.ltrimstr( AV111Totk, 10, 2));
      AV112TotM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TotM", GXutil.ltrimstr( AV112TotM, 10, 2));
      AV113TotP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113TotP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TotP), 4, 0));
      /* Start For Each Line */
      nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_52_fel_idx = 0 ;
      while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
      {
         nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
         sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_522( ) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV123GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         AV117Seleccionado = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionado.getInternalname())) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGSSALD");
            GX_FocusControl = edtavKgssald_Internalname ;
            wbErr = true ;
            AV81KgsSald = DecimalUtil.ZERO ;
         }
         else
         {
            AV81KgsSald = localUtil.ctond( httpContext.cgiGet( edtavKgssald_Internalname)) ;
         }
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTSSALD");
            GX_FocusControl = edtavMtssald_Internalname ;
            wbErr = true ;
            AV107MtsSald = (short)(0) ;
         }
         else
         {
            AV107MtsSald = (short)(localUtil.ctol( httpContext.cgiGet( edtavMtssald_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
         cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         AV108PieUti = httpContext.cgiGet( edtavPieuti_Internalname) ;
         if ( AV117Seleccionado )
         {
            AV111Totk = AV111Totk.add(AV81KgsSald) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111Totk", GXutil.ltrimstr( AV111Totk, 10, 2));
            AV112TotM = AV112TotM.add(DecimalUtil.doubleToDec(AV107MtsSald)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TotM", GXutil.ltrimstr( AV112TotM, 10, 2));
            AV113TotP = (short)(AV113TotP+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TotP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TotP), 4, 0));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_52_fel_idx == 0 )
      {
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      nGXsfl_52_fel_idx = 1 ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV77EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77EmprCod", AV77EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77EmprCod, "@!"))));
      AV71ALbRecCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71ALbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ALbRecCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71ALbRecCod), "ZZZZZZZ9")));
      AV75DisCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75DisCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75DisCod), "ZZZZZZZ9")));
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
      paK32( ) ;
      wsK32( ) ;
      weK32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116121561", true, true);
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
      httpContext.AddJavascriptSource("webwselpzas.js", "?202682116121562", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_idx );
      chkavSeleccionado.setInternalname( "vSELECCIONADO_"+sGXsfl_52_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_52_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_52_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_52_idx ;
      edtavKgssald_Internalname = "vKGSSALD_"+sGXsfl_52_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_52_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_52_idx ;
      edtavMtssald_Internalname = "vMTSSALD_"+sGXsfl_52_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_52_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_52_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_52_idx );
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_52_idx );
      edtavPieuti_Internalname = "vPIEUTI_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_fel_idx );
      chkavSeleccionado.setInternalname( "vSELECCIONADO_"+sGXsfl_52_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_52_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_52_fel_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_52_fel_idx ;
      edtavKgssald_Internalname = "vKGSSALD_"+sGXsfl_52_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_52_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_52_fel_idx ;
      edtavMtssald_Internalname = "vMTSSALD_"+sGXsfl_52_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_52_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_52_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_52_fel_idx );
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_52_fel_idx );
      edtavPieuti_Internalname = "vPIEUTI_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wbK30( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV123GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV123GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV123GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e19k32_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV123GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionado.getEnabled()!=0)&&(chkavSeleccionado.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONADO_" + sGXsfl_52_idx ;
         chkavSeleccionado.setName( GXCCtl );
         chkavSeleccionado.setWebtags( "" );
         chkavSeleccionado.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionado.getInternalname(), "TitleCaption", chkavSeleccionado.getCaption(), !bGXsfl_52_Refreshing);
         chkavSeleccionado.setCheckedValue( "false" );
         AV117Seleccionado = GXutil.strtobool( GXutil.booltostr( AV117Seleccionado)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionado.getInternalname(), AV117Seleccionado);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionado.getInternalname(),GXutil.booltostr( AV117Seleccionado),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(54, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionado.getEnabled()!=0)&&(chkavSeleccionado.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavKgssald_Enabled!=0)&&(edtavKgssald_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgssald_Internalname,GXutil.ltrim( localUtil.ntoc( AV81KgsSald, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKgssald_Enabled!=0) ? localUtil.format( AV81KgsSald, "ZZZZZ9.99") : localUtil.format( AV81KgsSald, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavKgssald_Enabled!=0)&&(edtavKgssald_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKgssald_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavKgssald_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMtssald_Enabled!=0)&&(edtavMtssald_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMtssald_Internalname,GXutil.ltrim( localUtil.ntoc( AV107MtsSald, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMtssald_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV107MtsSald), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV107MtsSald), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavMtssald_Enabled!=0)&&(edtavMtssald_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMtssald_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMtssald_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "ALBRUNI_" + sGXsfl_52_idx ;
         cmbAlbRUni.setName( GXCCtl );
         cmbAlbRUni.setWebtags( "" );
         cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
         cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
         if ( cmbAlbRUni.getItemCount() > 0 )
         {
            A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "ALBRREO_" + sGXsfl_52_idx ;
         cmbAlbRReo.setName( GXCCtl );
         cmbAlbRReo.setWebtags( "" );
         cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
         cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
         if ( cmbAlbRReo.getItemCount() > 0 )
         {
            A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPieuti_Enabled!=0)&&(edtavPieuti_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPieuti_Internalname,AV108PieUti,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPieuti_Enabled!=0)&&(edtavPieuti_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,67);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPieuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPieuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesK32( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Rec", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Uti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Uti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "U Med", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV123GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV117Seleccionado));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV81KgsSald, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKgssald_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV107MtsSald, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMtssald_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV108PieUti);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPieuti_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavValor_Internalname = "vVALOR" ;
      bttBtnseleccionar_Internalname = "BTNSELECCIONAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtnactualizar_Internalname = "BTNACTUALIZAR" ;
      bttBtnmarcartodos_Internalname = "BTNMARCARTODOS" ;
      bttBtndesmarcartodos_Internalname = "BTNDESMARCARTODOS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavTotk_Internalname = "vTOTK" ;
      edtavTotm_Internalname = "vTOTM" ;
      edtavTotp_Internalname = "vTOTP" ;
      divTotales_Internalname = "TOTALES" ;
      Dvpanel_totales_Internalname = "DVPANEL_TOTALES" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      chkavSeleccionado.setInternalname( "vSELECCIONADO" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtavKgssald_Internalname = "vKGSSALD" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtavMtssald_Internalname = "vMTSSALD" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtavPieuti_Internalname = "vPIEUTI" ;
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
      edtavPieuti_Jsonclick = "" ;
      edtavPieuti_Visible = -1 ;
      edtavPieuti_Enabled = 1 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtavMtssald_Jsonclick = "" ;
      edtavMtssald_Visible = -1 ;
      edtavMtssald_Enabled = 1 ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtavKgssald_Jsonclick = "" ;
      edtavKgssald_Visible = -1 ;
      edtavKgssald_Enabled = 1 ;
      edtAlbRecPie_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSeleccionado.setCaption( "" );
      chkavSeleccionado.setVisible( -1 );
      chkavSeleccionado.setEnabled( 1 );
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavTotp_Jsonclick = "" ;
      edtavTotp_Enabled = 1 ;
      edtavTotm_Jsonclick = "" ;
      edtavTotm_Enabled = 1 ;
      edtavTotk_Jsonclick = "" ;
      edtavTotk_Enabled = 1 ;
      edtavValor_Jsonclick = "" ;
      edtavValor_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Datalistproc = "WebWSelPzasGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||K:K,M:M|NO:NO,SI:SI" ;
      Ddo_grid_Allowmultipleselection = "|||||T|T" ;
      Ddo_grid_Datalisttype = "Dynamic|||||FixedValues|FixedValues" ;
      Ddo_grid_Includedatalist = "T|||||T|T" ;
      Ddo_grid_Filterisrange = "|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric|Numeric||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T||" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "5:AlbRecPie|7:AlbRecKgm|8:AlbRecKgmU|10:AlbRecMtr|11:AlbRecMtrU|12:AlbRUni|13:AlbRReo" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_totales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Iconposition = "Right" ;
      Dvpanel_totales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_totales_Title = httpContext.getMessage( "Totales", "") ;
      Dvpanel_totales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_totales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_totales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV123GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV123GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123GridActions), 4, 0));
      }
      GXCCtl = "vSELECCIONADO_" + sGXsfl_52_idx ;
      chkavSeleccionado.setName( GXCCtl );
      chkavSeleccionado.setWebtags( "" );
      chkavSeleccionado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionado.getInternalname(), "TitleCaption", chkavSeleccionado.getCaption(), !bGXsfl_52_Refreshing);
      chkavSeleccionado.setCheckedValue( "false" );
      AV117Seleccionado = GXutil.strtobool( GXutil.booltostr( AV117Seleccionado)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionado.getInternalname(), AV117Seleccionado);
      GXCCtl = "ALBRUNI_" + sGXsfl_52_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBRREO_" + sGXsfl_52_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV126Webwselpzasds_1_emprcod',fld:'vWEBWSELPZASDS_1_EMPRCOD',pic:'@!'},{av:'AV127Webwselpzasds_2_albreccod',fld:'vWEBWSELPZASDS_2_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14K32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV126Webwselpzasds_1_emprcod',fld:'vWEBWSELPZASDS_1_EMPRCOD',pic:'@!'},{av:'AV127Webwselpzasds_2_albreccod',fld:'vWEBWSELPZASDS_2_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV59TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e18K32',iparms:[{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99',hsh:true},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV123GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV117Seleccionado',fld:'vSELECCIONADO',pic:''},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV107MtsSald',fld:'vMTSSALD',pic:'ZZZ9'},{av:'AV81KgsSald',fld:'vKGSSALD',pic:'ZZZZZ9.99'},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV108PieUti',fld:'vPIEUTI',pic:'',hsh:true}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e19K32',iparms:[{av:'cmbavGridactions'},{av:'AV123GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV123GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e15K32',iparms:[{av:'AV117Seleccionado',fld:'vSELECCIONADO',grid:52,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV81KgsSald',fld:'vKGSSALD',grid:52,pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',grid:52,pic:'ZZZZZ9.99',hsh:true},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',grid:52,pic:'ZZZZZ9.99',hsh:true},{av:'A56AlbRUni',fld:'ALBRUNI',grid:52,pic:'@!'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',grid:52,pic:'',hsh:true},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV107MtsSald',fld:'vMTSSALD',grid:52,pic:'ZZZ9'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',grid:52,pic:'ZZZZZ9.99',hsh:true},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',grid:52,pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',grid:52,pic:'@!'},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'AV107MtsSald',fld:'vMTSSALD',pic:'ZZZ9'},{av:'AV81KgsSald',fld:'vKGSSALD',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOMARCARTODOS'","{handler:'e12K31',iparms:[{av:'AV117Seleccionado',fld:'vSELECCIONADO',grid:52,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV81KgsSald',fld:'vKGSSALD',grid:52,pic:'ZZZZZ9.99'},{av:'AV107MtsSald',fld:'vMTSSALD',grid:52,pic:'ZZZ9'}]");
      setEventMetadata("'DOMARCARTODOS'",",oparms:[{av:'AV117Seleccionado',fld:'vSELECCIONADO',pic:''},{av:'AV111Totk',fld:'vTOTK',pic:'ZZZZZZ9.99'},{av:'AV112TotM',fld:'vTOTM',pic:'ZZZZZZ9.99'},{av:'AV113TotP',fld:'vTOTP',pic:'ZZZ9'}]}");
      setEventMetadata("'DODESMARCARTODOS'","{handler:'e13K31',iparms:[{av:'AV117Seleccionado',fld:'vSELECCIONADO',grid:52,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV81KgsSald',fld:'vKGSSALD',grid:52,pic:'ZZZZZ9.99'},{av:'AV107MtsSald',fld:'vMTSSALD',grid:52,pic:'ZZZ9'}]");
      setEventMetadata("'DODESMARCARTODOS'",",oparms:[{av:'AV117Seleccionado',fld:'vSELECCIONADO',pic:''},{av:'AV111Totk',fld:'vTOTK',pic:'ZZZZZZ9.99'},{av:'AV112TotM',fld:'vTOTM',pic:'ZZZZZZ9.99'},{av:'AV113TotP',fld:'vTOTP',pic:'ZZZ9'}]}");
      setEventMetadata("'DOSELECCIONAR'","{handler:'e11K31',iparms:[{av:'AV115Valor',fld:'vVALOR',pic:'ZZZ9'},{av:'AV108PieUti',fld:'vPIEUTI',grid:52,pic:'',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true},{av:'AV117Seleccionado',fld:'vSELECCIONADO',grid:52,pic:''},{av:'AV81KgsSald',fld:'vKGSSALD',grid:52,pic:'ZZZZZ9.99'},{av:'AV107MtsSald',fld:'vMTSSALD',grid:52,pic:'ZZZ9'}]");
      setEventMetadata("'DOSELECCIONAR'",",oparms:[{av:'AV117Seleccionado',fld:'vSELECCIONADO',pic:''},{av:'AV111Totk',fld:'vTOTK',pic:'ZZZZZZ9.99'},{av:'AV112TotM',fld:'vTOTM',pic:'ZZZZZZ9.99'},{av:'AV113TotP',fld:'vTOTP',pic:'ZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV126Webwselpzasds_1_emprcod',fld:'vWEBWSELPZASDS_1_EMPRCOD',pic:'@!'},{av:'AV127Webwselpzasds_2_albreccod',fld:'vWEBWSELPZASDS_2_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true},{av:'AV77EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV126Webwselpzasds_1_emprcod',fld:'vWEBWSELPZASDS_1_EMPRCOD',pic:'@!'},{av:'AV127Webwselpzasds_2_albreccod',fld:'vWEBWSELPZASDS_2_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true},{av:'AV77EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV126Webwselpzasds_1_emprcod',fld:'vWEBWSELPZASDS_1_EMPRCOD',pic:'@!'},{av:'AV127Webwselpzasds_2_albreccod',fld:'vWEBWSELPZASDS_2_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true},{av:'AV77EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV126Webwselpzasds_1_emprcod',fld:'vWEBWSELPZASDS_1_EMPRCOD',pic:'@!'},{av:'AV127Webwselpzasds_2_albreccod',fld:'vWEBWSELPZASDS_2_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV80Kgsd',fld:'vKGSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV106Mtsd',fld:'vMTSD',pic:'ZZZZZ9.99',hsh:true},{av:'AV5AlbRreo',fld:'vALBRREO',pic:'@!',hsh:true},{av:'AV94Lit20',fld:'vLIT20',pic:'',hsh:true},{av:'AV95Lit21',fld:'vLIT21',pic:'',hsh:true},{av:'AV110Tintatex',fld:'vTINTATEX',pic:'9',hsh:true},{av:'AV77EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71ALbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV56TFAlbRecPie',fld:'vTFALBRECPIE',pic:''},{av:'AV57TFAlbRecPie_Sel',fld:'vTFALBRECPIE_SEL',pic:''},{av:'AV48TFAlbRecKgm',fld:'vTFALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49TFAlbRecKgm_To',fld:'vTFALBRECKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFAlbRecKgmU',fld:'vTFALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV51TFAlbRecKgmU_To',fld:'vTFALBRECKGMU_TO',pic:'ZZZZZ9.99'},{av:'AV52TFAlbRecMtr',fld:'vTFALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV53TFAlbRecMtr_To',fld:'vTFALBRECMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbRecMtrU',fld:'vTFALBRECMTRU',pic:'ZZZZZ9.99'},{av:'AV55TFAlbRecMtrU_To',fld:'vTFALBRECMTRU_TO',pic:'ZZZZZ9.99'},{av:'AV58TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV120TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV42OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Pieuti',iparms:[]");
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
      wcpOAV77EmprCod = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV77EmprCod = "" ;
      AV56TFAlbRecPie = "" ;
      AV57TFAlbRecPie_Sel = "" ;
      AV48TFAlbRecKgm = DecimalUtil.ZERO ;
      AV49TFAlbRecKgm_To = DecimalUtil.ZERO ;
      AV50TFAlbRecKgmU = DecimalUtil.ZERO ;
      AV51TFAlbRecKgmU_To = DecimalUtil.ZERO ;
      AV52TFAlbRecMtr = DecimalUtil.ZERO ;
      AV53TFAlbRecMtr_To = DecimalUtil.ZERO ;
      AV54TFAlbRecMtrU = DecimalUtil.ZERO ;
      AV55TFAlbRecMtrU_To = DecimalUtil.ZERO ;
      AV58TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV120TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV146Pgmname = "" ;
      AV126Webwselpzasds_1_emprcod = "" ;
      AV80Kgsd = DecimalUtil.ZERO ;
      AV106Mtsd = DecimalUtil.ZERO ;
      AV5AlbRreo = "" ;
      AV94Lit20 = "" ;
      AV95Lit21 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnseleccionar_Jsonclick = "" ;
      bttBtnactualizar_Jsonclick = "" ;
      bttBtnmarcartodos_Jsonclick = "" ;
      bttBtndesmarcartodos_Jsonclick = "" ;
      ucDvpanel_totales = new com.genexus.webpanels.GXUserControl();
      AV111Totk = DecimalUtil.ZERO ;
      AV112TotM = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV128Webwselpzasds_3_tfalbrecpie = "" ;
      AV129Webwselpzasds_4_tfalbrecpie_sel = "" ;
      AV130Webwselpzasds_5_tfalbreckgm = DecimalUtil.ZERO ;
      AV131Webwselpzasds_6_tfalbreckgm_to = DecimalUtil.ZERO ;
      AV132Webwselpzasds_7_tfalbreckgmu = DecimalUtil.ZERO ;
      AV133Webwselpzasds_8_tfalbreckgmu_to = DecimalUtil.ZERO ;
      AV134Webwselpzasds_9_tfalbrecmtr = DecimalUtil.ZERO ;
      AV135Webwselpzasds_10_tfalbrecmtr_to = DecimalUtil.ZERO ;
      AV136Webwselpzasds_11_tfalbrecmtru = DecimalUtil.ZERO ;
      AV137Webwselpzasds_12_tfalbrecmtru_to = DecimalUtil.ZERO ;
      AV138Webwselpzasds_13_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Webwselpzasds_14_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A2159AlbRecPie = "" ;
      AV81KgsSald = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      AV108PieUti = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV128Webwselpzasds_3_tfalbrecpie = "" ;
      H00K32_A55AlbRReo = new String[] {""} ;
      H00K32_A56AlbRUni = new String[] {""} ;
      H00K32_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K32_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K32_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K32_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00K32_A2159AlbRecPie = new String[] {""} ;
      H00K32_A44AlbRecCod = new int[1] ;
      H00K32_A407EmprNom = new String[] {""} ;
      H00K32_n407EmprNom = new boolean[] {false} ;
      H00K32_A396EmprCod = new String[] {""} ;
      H00K33_AGRID_nRecordCount = new long[1] ;
      AV109Station = "" ;
      AV121StationEmprCod = "" ;
      AV78EmprNom = "" ;
      AV114UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV70WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV59TFAlbRUni_SelsJson = "" ;
      AV119TFAlbRReo_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV104Msg_e = "" ;
      AV73AlbRecPie = "" ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_int10 = new int[1] ;
      AV45Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV63TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37HTTPRequest = httpContext.getHttpRequest();
      AV64TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwselpzas__default(),
         new Object[] {
             new Object[] {
            H00K32_A55AlbRReo, H00K32_A56AlbRUni, H00K32_A2158AlbRecMtrU, H00K32_A2157AlbRecMtr, H00K32_A2156AlbRecKgmU, H00K32_A2155AlbRecKgm, H00K32_A2159AlbRecPie, H00K32_A44AlbRecCod, H00K32_A407EmprNom, H00K32_n407EmprNom,
            H00K32_A396EmprCod
            }
            , new Object[] {
            H00K33_AGRID_nRecordCount
            }
         }
      );
      AV146Pgmname = "WebWSelPzas" ;
      /* GeneXus formulas. */
      AV146Pgmname = "WebWSelPzas" ;
      Gx_err = (short)(0) ;
      edtavKgssald_Enabled = 0 ;
      edtavMtssald_Enabled = 0 ;
      edtavPieuti_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV110Tintatex ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV79Error_l ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV42OrderedBy ;
   private short AV116Valori ;
   private short wbEnd ;
   private short wbStart ;
   private short AV115Valor ;
   private short AV113TotP ;
   private short AV123GridActions ;
   private short AV107MtsSald ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV71ALbRecCod ;
   private int wcpOAV75DisCod ;
   private int nRC_GXsfl_52 ;
   private int subGrid_Rows ;
   private int AV71ALbRecCod ;
   private int AV75DisCod ;
   private int nGXsfl_52_idx=1 ;
   private int AV127Webwselpzasds_2_albreccod ;
   private int edtavValor_Enabled ;
   private int edtavTotk_Enabled ;
   private int edtavTotm_Enabled ;
   private int edtavTotp_Enabled ;
   private int A44AlbRecCod ;
   private int subGrid_Islastpage ;
   private int edtavKgssald_Enabled ;
   private int edtavMtssald_Enabled ;
   private int edtavPieuti_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV138Webwselpzasds_13_tfalbruni_sels_size ;
   private int AV139Webwselpzasds_14_tfalbrreo_sels_size ;
   private int nGXsfl_52_fel_idx=1 ;
   private int AV72AlbRecCodout ;
   private int AV76DisCodout ;
   private int GXv_int11[] ;
   private int GXv_int10[] ;
   private int AV147GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavKgssald_Visible ;
   private int edtavMtssald_Visible ;
   private int edtavPieuti_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48TFAlbRecKgm ;
   private java.math.BigDecimal AV49TFAlbRecKgm_To ;
   private java.math.BigDecimal AV50TFAlbRecKgmU ;
   private java.math.BigDecimal AV51TFAlbRecKgmU_To ;
   private java.math.BigDecimal AV52TFAlbRecMtr ;
   private java.math.BigDecimal AV53TFAlbRecMtr_To ;
   private java.math.BigDecimal AV54TFAlbRecMtrU ;
   private java.math.BigDecimal AV55TFAlbRecMtrU_To ;
   private java.math.BigDecimal AV80Kgsd ;
   private java.math.BigDecimal AV106Mtsd ;
   private java.math.BigDecimal AV111Totk ;
   private java.math.BigDecimal AV112TotM ;
   private java.math.BigDecimal AV130Webwselpzasds_5_tfalbreckgm ;
   private java.math.BigDecimal AV131Webwselpzasds_6_tfalbreckgm_to ;
   private java.math.BigDecimal AV132Webwselpzasds_7_tfalbreckgmu ;
   private java.math.BigDecimal AV133Webwselpzasds_8_tfalbreckgmu_to ;
   private java.math.BigDecimal AV134Webwselpzasds_9_tfalbrecmtr ;
   private java.math.BigDecimal AV135Webwselpzasds_10_tfalbrecmtr_to ;
   private java.math.BigDecimal AV136Webwselpzasds_11_tfalbrecmtru ;
   private java.math.BigDecimal AV137Webwselpzasds_12_tfalbrecmtru_to ;
   private java.math.BigDecimal AV81KgsSald ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV77EmprCod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV77EmprCod ;
   private String sGXsfl_52_idx="0001" ;
   private String AV56TFAlbRecPie ;
   private String AV57TFAlbRecPie_Sel ;
   private String AV146Pgmname ;
   private String AV126Webwselpzasds_1_emprcod ;
   private String AV5AlbRreo ;
   private String AV94Lit20 ;
   private String AV95Lit21 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_totales_Width ;
   private String Dvpanel_totales_Cls ;
   private String Dvpanel_totales_Title ;
   private String Dvpanel_totales_Iconposition ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavValor_Internalname ;
   private String TempTags ;
   private String edtavValor_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnseleccionar_Internalname ;
   private String bttBtnseleccionar_Jsonclick ;
   private String bttBtnactualizar_Internalname ;
   private String bttBtnactualizar_Jsonclick ;
   private String bttBtnmarcartodos_Internalname ;
   private String bttBtnmarcartodos_Jsonclick ;
   private String bttBtndesmarcartodos_Internalname ;
   private String bttBtndesmarcartodos_Jsonclick ;
   private String Dvpanel_totales_Internalname ;
   private String divTotales_Internalname ;
   private String edtavTotk_Internalname ;
   private String edtavTotk_Jsonclick ;
   private String edtavTotm_Internalname ;
   private String edtavTotm_Jsonclick ;
   private String edtavTotp_Internalname ;
   private String edtavTotp_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV128Webwselpzasds_3_tfalbrecpie ;
   private String AV129Webwselpzasds_4_tfalbrecpie_sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String A2159AlbRecPie ;
   private String edtAlbRecPie_Internalname ;
   private String edtavKgssald_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtavMtssald_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String edtavPieuti_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV128Webwselpzasds_3_tfalbrecpie ;
   private String AV109Station ;
   private String AV121StationEmprCod ;
   private String AV78EmprNom ;
   private String AV114UsurCod ;
   private String Gx_msg ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String AV104Msg_e ;
   private String AV73AlbRecPie ;
   private String GXt_char1 ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtavKgssald_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtavMtssald_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtavPieuti_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV44OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_totales_Autowidth ;
   private boolean Dvpanel_totales_Autoheight ;
   private boolean Dvpanel_totales_Collapsible ;
   private boolean Dvpanel_totales_Collapsed ;
   private boolean Dvpanel_totales_Showcollapseicon ;
   private boolean Dvpanel_totales_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV117Seleccionado ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV122Realizado ;
   private String AV59TFAlbRUni_SelsJson ;
   private String AV119TFAlbRReo_SelsJson ;
   private String AV108PieUti ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV37HTTPRequest ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_totales ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkavSeleccionado ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private String[] H00K32_A55AlbRReo ;
   private String[] H00K32_A56AlbRUni ;
   private java.math.BigDecimal[] H00K32_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] H00K32_A2157AlbRecMtr ;
   private java.math.BigDecimal[] H00K32_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] H00K32_A2155AlbRecKgm ;
   private String[] H00K32_A2159AlbRecPie ;
   private int[] H00K32_A44AlbRecCod ;
   private String[] H00K32_A407EmprNom ;
   private boolean[] H00K32_n407EmprNom ;
   private String[] H00K32_A396EmprCod ;
   private long[] H00K33_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV58TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV120TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV138Webwselpzasds_13_tfalbruni_sels ;
   private GXSimpleCollection<String> AV139Webwselpzasds_14_tfalbrreo_sels ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV19DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV63TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV64TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV70WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class webwselpzas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00K32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV138Webwselpzasds_13_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV139Webwselpzasds_14_tfalbrreo_sels ,
                                          String AV129Webwselpzasds_4_tfalbrecpie_sel ,
                                          String AV128Webwselpzasds_3_tfalbrecpie ,
                                          java.math.BigDecimal AV130Webwselpzasds_5_tfalbreckgm ,
                                          java.math.BigDecimal AV131Webwselpzasds_6_tfalbreckgm_to ,
                                          java.math.BigDecimal AV132Webwselpzasds_7_tfalbreckgmu ,
                                          java.math.BigDecimal AV133Webwselpzasds_8_tfalbreckgmu_to ,
                                          java.math.BigDecimal AV134Webwselpzasds_9_tfalbrecmtr ,
                                          java.math.BigDecimal AV135Webwselpzasds_10_tfalbrecmtr_to ,
                                          java.math.BigDecimal AV136Webwselpzasds_11_tfalbrecmtru ,
                                          java.math.BigDecimal AV137Webwselpzasds_12_tfalbrecmtru_to ,
                                          int AV138Webwselpzasds_13_tfalbruni_sels_size ,
                                          int AV139Webwselpzasds_14_tfalbrreo_sels_size ,
                                          String A2159AlbRecPie ,
                                          java.math.BigDecimal A2155AlbRecKgm ,
                                          java.math.BigDecimal A2156AlbRecKgmU ,
                                          java.math.BigDecimal A2157AlbRecMtr ,
                                          java.math.BigDecimal A2158AlbRecMtrU ,
                                          short AV42OrderedBy ,
                                          boolean AV44OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV77EmprCod ,
                                          int A44AlbRecCod ,
                                          int AV71ALbRecCod ,
                                          String AV126Webwselpzasds_1_emprcod ,
                                          int AV127Webwselpzasds_2_albreccod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[19];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T3.AlbRReo, T3.AlbRUni, T1.AlbRecMtrU, T1.AlbRecMtr, T1.AlbRecKgmU, T1.AlbRecKgm, T1.AlbRecPie, T1.AlbRecCod, T2.EmprNom, T1.EmprCod" ;
      sFromString = " FROM ((TXPALBDET T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV129Webwselpzasds_4_tfalbrecpie_sel)==0) && ( ! (GXutil.strcmp("", AV128Webwselpzasds_3_tfalbrecpie)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRecPie) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Webwselpzasds_4_tfalbrecpie_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecPie = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Webwselpzasds_5_tfalbreckgm)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgm >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Webwselpzasds_6_tfalbreckgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgm <= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Webwselpzasds_7_tfalbreckgmu)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgmU >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Webwselpzasds_8_tfalbreckgmu_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgmU <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Webwselpzasds_9_tfalbrecmtr)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtr >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Webwselpzasds_10_tfalbrecmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtr <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Webwselpzasds_11_tfalbrecmtru)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtrU >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Webwselpzasds_12_tfalbrecmtru_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtrU <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( AV138Webwselpzasds_13_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Webwselpzasds_13_tfalbruni_sels, "T3.AlbRUni IN (", ")")+")");
      }
      if ( AV139Webwselpzasds_14_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Webwselpzasds_14_tfalbrreo_sels, "T3.AlbRReo IN (", ")")+")");
      }
      if ( ( AV42OrderedBy == 1 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie" ;
      }
      else if ( ( AV42OrderedBy == 1 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T1.AlbRecPie DESC" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecKgm" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T1.AlbRecKgm DESC" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecKgmU" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T1.AlbRecKgmU DESC" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecMtr" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T1.AlbRecMtr DESC" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecMtrU" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T1.AlbRecMtrU DESC" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T3.AlbRUni" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T3.AlbRUni DESC" ;
      }
      else if ( ( AV42OrderedBy == 7 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T3.AlbRReo" ;
      }
      else if ( ( AV42OrderedBy == 7 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.AlbRecCod DESC, T3.AlbRReo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H00K33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV138Webwselpzasds_13_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV139Webwselpzasds_14_tfalbrreo_sels ,
                                          String AV129Webwselpzasds_4_tfalbrecpie_sel ,
                                          String AV128Webwselpzasds_3_tfalbrecpie ,
                                          java.math.BigDecimal AV130Webwselpzasds_5_tfalbreckgm ,
                                          java.math.BigDecimal AV131Webwselpzasds_6_tfalbreckgm_to ,
                                          java.math.BigDecimal AV132Webwselpzasds_7_tfalbreckgmu ,
                                          java.math.BigDecimal AV133Webwselpzasds_8_tfalbreckgmu_to ,
                                          java.math.BigDecimal AV134Webwselpzasds_9_tfalbrecmtr ,
                                          java.math.BigDecimal AV135Webwselpzasds_10_tfalbrecmtr_to ,
                                          java.math.BigDecimal AV136Webwselpzasds_11_tfalbrecmtru ,
                                          java.math.BigDecimal AV137Webwselpzasds_12_tfalbrecmtru_to ,
                                          int AV138Webwselpzasds_13_tfalbruni_sels_size ,
                                          int AV139Webwselpzasds_14_tfalbrreo_sels_size ,
                                          String A2159AlbRecPie ,
                                          java.math.BigDecimal A2155AlbRecKgm ,
                                          java.math.BigDecimal A2156AlbRecKgmU ,
                                          java.math.BigDecimal A2157AlbRecMtr ,
                                          java.math.BigDecimal A2158AlbRecMtrU ,
                                          short AV42OrderedBy ,
                                          boolean AV44OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV77EmprCod ,
                                          int A44AlbRecCod ,
                                          int AV71ALbRecCod ,
                                          String AV126Webwselpzasds_1_emprcod ,
                                          int AV127Webwselpzasds_2_albreccod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[14];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPALBDET T1 INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV129Webwselpzasds_4_tfalbrecpie_sel)==0) && ( ! (GXutil.strcmp("", AV128Webwselpzasds_3_tfalbrecpie)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRecPie) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Webwselpzasds_4_tfalbrecpie_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecPie = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Webwselpzasds_5_tfalbreckgm)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgm >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Webwselpzasds_6_tfalbreckgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgm <= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Webwselpzasds_7_tfalbreckgmu)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgmU >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Webwselpzasds_8_tfalbreckgmu_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgmU <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Webwselpzasds_9_tfalbrecmtr)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtr >= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Webwselpzasds_10_tfalbrecmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtr <= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Webwselpzasds_11_tfalbrecmtru)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtrU >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Webwselpzasds_12_tfalbrecmtru_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtrU <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( AV138Webwselpzasds_13_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Webwselpzasds_13_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( AV139Webwselpzasds_14_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Webwselpzasds_14_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV42OrderedBy == 1 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 1 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 7 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV42OrderedBy == 7 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_H00K32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 1 :
                  return conditional_H00K33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00K32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 9);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 9);
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

