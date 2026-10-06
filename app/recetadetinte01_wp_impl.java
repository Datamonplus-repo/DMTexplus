package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte01_wp_impl extends GXDataArea
{
   public recetadetinte01_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte01_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte01_wp_impl.class ));
   }

   public recetadetinte01_wp_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdt_tratamiento_recetass") == 0 )
         {
            gxnrgridsdt_tratamiento_recetass_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdt_tratamiento_recetass") == 0 )
         {
            gxgrgridsdt_tratamiento_recetass_refresh_invoke( ) ;
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
               AV73RecLinmaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinmaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV73RecLinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73RecLinmaq), 4, 0));
               AV107ErrMensaje = httpContext.GetPar( "ErrMensaje") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV107ErrMensaje", AV107ErrMensaje);
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

   public void gxnrgridsdt_tratamiento_recetass_newrow_invoke( )
   {
      nRC_GXsfl_48 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_48"))) ;
      nGXsfl_48_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_48_idx"))) ;
      sGXsfl_48_idx = httpContext.GetPar( "sGXsfl_48_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdt_tratamiento_recetass_newrow( ) ;
      /* End function gxnrGridsdt_tratamiento_recetass_newrow_invoke */
   }

   public void gxgrgridsdt_tratamiento_recetass_refresh_invoke( )
   {
      subGridsdt_tratamiento_recetass_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdt_tratamiento_recetass_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV124SDT_TRATAMIENTO_RECETAS);
      AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr"), ".") ;
      AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie = GXutil.lval( httpContext.GetPar( "TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie")) ;
      AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr"), ".") ;
      AV120Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV13BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV75RecTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "RecTotKgm"), ".") ;
      AV77RecTotMtr = CommonUtil.decimalVal( httpContext.GetPar( "RecTotMtr"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdt_tratamiento_recetass_refresh( subGridsdt_tratamiento_recetass_Rows, AV124SDT_TRATAMIENTO_RECETAS, AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, AV120Moda21, AV13BarAgrEst, AV75RecTotKgm, AV77RecTotMtr) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdt_tratamiento_recetass_refresh_invoke */
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
      pa1FP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FP2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetadetinte01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV73RecLinmaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV107ErrMensaje))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","RecLinmaq","ErrMensaje"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDT_TRATAMIENTO_RECETAS", getSecureSignedToken( "", AV124SDT_TRATAMIENTO_RECETAS));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", getSecureSignedToken( "", localUtil.format( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", getSecureSignedToken( "", localUtil.format( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV120Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrEst, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte01_WP");
      forbiddenHiddens.add("RecTotKgm", localUtil.format( AV75RecTotKgm, "ZZZZZZZ.ZZ"));
      forbiddenHiddens.add("RecTotMtr", localUtil.format( AV77RecTotMtr, "ZZZZZZZ.ZZ"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte01_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdt_tratamiento_recetas", AV124SDT_TRATAMIENTO_RECETAS);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdt_tratamiento_recetas", AV124SDT_TRATAMIENTO_RECETAS);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Sdt_tratamiento_recetas", getSecureSignedToken( "", AV124SDT_TRATAMIENTO_RECETAS));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_48, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV112DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV112DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARMAQCOD_DATA", AV109BarMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARMAQCOD_DATA", AV109BarMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_TRATAMIENTO_RECETAS", AV124SDT_TRATAMIENTO_RECETAS);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_TRATAMIENTO_RECETAS", AV124SDT_TRATAMIENTO_RECETAS);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDT_TRATAMIENTO_RECETAS", getSecureSignedToken( "", AV124SDT_TRATAMIENTO_RECETAS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", GXutil.ltrim( localUtil.ntoc( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", getSecureSignedToken( "", localUtil.format( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", GXutil.ltrim( localUtil.ntoc( AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", GXutil.ltrim( localUtil.ntoc( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", getSecureSignedToken( "", localUtil.format( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV107ErrMensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV73RecLinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUIN", GXutil.ltrim( localUtil.ntoc( AV55Maquin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQRELBAN", GXutil.ltrim( localUtil.ntoc( AV54MaqRelban, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQVOLMED", GXutil.ltrim( localUtil.ntoc( AV57MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMED", GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMAX", GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMIN", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQRELBAN", GXutil.ltrim( localUtil.ntoc( A3599MaqRelBan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV120Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV120Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV83Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV13BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV89UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARMAQCOD_Cls", GXutil.rtrim( Combo_barmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_barmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARMAQCOD_Emptyitem", GXutil.booltostr( Combo_barmaqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdt_tratamiento_recetass_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARMAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_barmaqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARMAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_barmaqcod_Selectedvalue_get));
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
         we1FP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FP2( ) ;
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
      return formatLink("app.recetadetinte01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV73RecLinmaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV107ErrMensaje))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","RecLinmaq","ErrMensaje"})  ;
   }

   public String getPgmname( )
   {
      return "RecetadeTinte01_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Receta de Tinte", "") ;
   }

   public void wb1FP0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnprocesosquimicos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Procesos Quimicos", ""), bttBtnprocesosquimicos_Jsonclick, 5, httpContext.getMessage( "Procesos Quimicos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPROCESOSQUIMICOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "HDR", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV92BarNHdr), GXutil.rtrim( localUtil.format( AV92BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrid_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdt_tratamiento_recetasstablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridsdt_tratamiento_recetassContainer.SetWrapped(nGXWrapped);
         startgridcontrol48( ) ;
      }
      if ( wbEnd == 48 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_48 = (int)(nGXsfl_48_idx-1) ;
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GRIDSDT_TRATAMIENTO_RECETASS_nEOF", GRIDSDT_TRATAMIENTO_RECETASS_nEOF);
            Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage);
            AV142GXV1 = nGXsfl_48_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridsdt_tratamiento_recetassContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdt_tratamiento_recetass", Gridsdt_tratamiento_recetassContainer, subGridsdt_tratamiento_recetass_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_tratamiento_recetassContainerData", Gridsdt_tratamiento_recetassContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_tratamiento_recetassContainerData"+"V", Gridsdt_tratamiento_recetassContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridsdt_tratamiento_recetassContainerData"+"V"+"\" value='"+Gridsdt_tratamiento_recetassContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_66_1FP2( true) ;
      }
      else
      {
         wb_table1_66_1FP2( false) ;
      }
      return  ;
   }

   public void wb_table1_66_1FP2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablevisibleaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop45", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarnhdr_Internalname, httpContext.getMessage( "<i class=\"fas fa-angle-down fa-2x\"></i>", ""), "", "", lblBarnhdr_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOBARNHDR\\'."+"'", "", "TextBlock", 5, "", 1, 1, 0, (short)(1), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup13_Internalname, httpContext.getMessage( "Kilos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_RecetadeTinte01_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotkgm_Internalname, httpContext.getMessage( "Totales", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV75RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgm_Enabled!=0) ? localUtil.format( AV75RecTotKgm, "ZZZZZZZ.ZZ") : localUtil.format( AV75RecTotKgm, "ZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotkgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotkgs_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV76RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgs_Enabled!=0) ? localUtil.format( AV76RecTotKgs, "ZZZZZZZ.ZZ") : localUtil.format( AV76RecTotKgs, "ZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup15_Internalname, httpContext.getMessage( "Metros", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_RecetadeTinte01_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotmtr_Internalname, httpContext.getMessage( "Totales", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV77RecTotMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotmtr_Enabled!=0) ? localUtil.format( AV77RecTotMtr, "ZZZZZZZ.ZZ") : localUtil.format( AV77RecTotMtr, "ZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotmtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotmts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotmts_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotmts_Internalname, GXutil.ltrim( localUtil.ntoc( AV78RecTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotmts_Enabled!=0) ? localUtil.format( AV78RecTotMts, "ZZZZZZZ.ZZ") : localUtil.format( AV78RecTotMts, "ZZZZZZZ.ZZ"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotmts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotmts_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup17_Internalname, httpContext.getMessage( "Piezas", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_RecetadeTinte01_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotpie_Internalname, httpContext.getMessage( "Totales", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV79RecTotpie, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79RecTotpie), "ZZZZZ") : localUtil.format( DecimalUtil.doubleToDec(AV79RecTotpie), "ZZZZZ"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotpie_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV24BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbarmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_barmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_barmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_barmaqcod.setProperty("Caption", Combo_barmaqcod_Caption);
         ucCombo_barmaqcod.setProperty("Cls", Combo_barmaqcod_Cls);
         ucCombo_barmaqcod.setProperty("EmptyItem", Combo_barmaqcod_Emptyitem);
         ucCombo_barmaqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV112DDO_TitleSettingsIcons);
         ucCombo_barmaqcod.setProperty("DropDownOptionsData", AV109BarMaqCod_Data);
         ucCombo_barmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_barmaqcod_Internalname, "COMBO_BARMAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divVolumen_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolmax_Internalname, httpContext.getMessage( "Vol. Max.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV56MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV56MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV56MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolmin_Internalname, httpContext.getMessage( "Vol. Min.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV58MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV58MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRb_Internalname, httpContext.getMessage( "Rb", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRb_Internalname, GXutil.ltrim( localUtil.ntoc( AV70Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRb_Enabled!=0) ? localUtil.format( AV70Rb, "ZZZ9.99") : localUtil.format( AV70Rb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarvolmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarvolmaq_Internalname, httpContext.getMessage( "Volumen", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarvolmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV30BarVolmaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarvolmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30BarVolmaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30BarVolmaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarvolmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarvolmaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
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
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         wb_table2_170_1FP2( true) ;
      }
      else
      {
         wb_table2_170_1FP2( false) ;
      }
      return  ;
   }

   public void wb_table2_170_1FP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable5_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable5_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbarmacpro_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarmacpro_Internalname, httpContext.getMessage( "Nº Programa", ""), "", "", lblTextblockbarmacpro_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table3_230_1FP2( true) ;
      }
      else
      {
         wb_table3_230_1FP2( false) ;
      }
      return  ;
   }

   public void wb_table3_230_1FP2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfacabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfacabs_Internalname, httpContext.getMessage( "Fact. Abs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV17BarFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarfacabs_Enabled!=0) ? localUtil.format( AV17BarFacAbs, "ZZ9.99") : localUtil.format( AV17BarFacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,240);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfacabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfacabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarbp12_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarbp12_Internalname, httpContext.getMessage( "Vel. Sarilho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarbp12_Internalname, GXutil.ltrim( localUtil.ntoc( AV113BarBp12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarbp12_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV113BarBp12), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV113BarBp12), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarbp12_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarbp12_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarbp13_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarbp13_Internalname, httpContext.getMessage( "Tempo Volta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 248,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarbp13_Internalname, GXutil.ltrim( localUtil.ntoc( AV114BarBp13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarbp13_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV114BarBp13), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV114BarBp13), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,248);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarbp13_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarbp13_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarbp14_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarbp14_Internalname, httpContext.getMessage( "Pressao Jet", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 252,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarbp14_Internalname, GXutil.ltrim( localUtil.ntoc( AV115BarBp14, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarbp14_Enabled!=0) ? localUtil.format( AV115BarBp14, "Z9.999") : localUtil.format( AV115BarBp14, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,252);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarbp14_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarbp14_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarbp15_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarbp15_Internalname, httpContext.getMessage( "Vel. Bombra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarbp15_Internalname, GXutil.ltrim( localUtil.ntoc( AV116BarBp15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarbp15_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV116BarBp15), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV116BarBp15), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarbp15_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarbp15_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", divUnnamedtable6_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV158Pgmname), GXutil.rtrim( localUtil.format( AV158Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmaqcod_Internalname, GXutil.rtrim( AV21BarMaqCod), GXutil.rtrim( localUtil.format( AV21BarMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,270);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarmaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavRecetastinteprocesosquimicostojson_Internalname, AV102RecetasTinteProcesosQuimicosToJson, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", (short)(0), edtavRecetastinteprocesosquimicostojson_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RecetadeTinte01_WP.htm");
         /* User Defined Control */
         ucGridsdt_tratamiento_recetass_empowerer.render(context, "wwp.gridempowerer", Gridsdt_tratamiento_recetass_empowerer_Internalname, "GRIDSDT_TRATAMIENTO_RECETASS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 48 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GRIDSDT_TRATAMIENTO_RECETASS_nEOF", GRIDSDT_TRATAMIENTO_RECETASS_nEOF);
               Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage);
               AV142GXV1 = nGXsfl_48_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridsdt_tratamiento_recetassContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdt_tratamiento_recetass", Gridsdt_tratamiento_recetassContainer, subGridsdt_tratamiento_recetass_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_tratamiento_recetassContainerData", Gridsdt_tratamiento_recetassContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridsdt_tratamiento_recetassContainerData"+"V", Gridsdt_tratamiento_recetassContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridsdt_tratamiento_recetassContainerData"+"V"+"\" value='"+Gridsdt_tratamiento_recetassContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1FP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Receta de Tinte", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FP0( ) ;
   }

   public void ws1FP2( )
   {
      start1FP2( ) ;
      evt1FP2( ) ;
   }

   public void evt1FP2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_BARMAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111FP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBARNHDR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBarNHdr' */
                           e121FP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e131FP2 ();
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
                                 e141FP2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROCESOSQUIMICOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoProcesosQuimicos' */
                           e151FP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDT_TRATAMIENTO_RECETASSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDSDT_TRATAMIENTO_RECETASSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridsdt_tratamiento_recetass_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridsdt_tratamiento_recetass_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridsdt_tratamiento_recetass_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridsdt_tratamiento_recetass_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 33), "GRIDSDT_TRATAMIENTO_RECETASS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'DOCONFIRMAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_48_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_482( ) ;
                           AV142GXV1 = (int)(nGXsfl_48_idx+GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage) ;
                           if ( ( AV124SDT_TRATAMIENTO_RECETAS.size() >= AV142GXV1 ) && ( AV142GXV1 > 0 ) )
                           {
                              AV124SDT_TRATAMIENTO_RECETAS.currentItem( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161FP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171FP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDT_TRATAMIENTO_RECETASS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181FP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e191FP2 ();
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

   public void we1FP2( )
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

   public void pa1FP2( )
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
            GX_FocusControl = edtavBarnhdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsdt_tratamiento_recetass_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_482( ) ;
      while ( nGXsfl_48_idx <= nRC_GXsfl_48 )
      {
         sendrow_482( ) ;
         nGXsfl_48_idx = ((subGridsdt_tratamiento_recetass_Islastpage==1)&&(nGXsfl_48_idx+1>subgridsdt_tratamiento_recetass_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridsdt_tratamiento_recetassContainer)) ;
      /* End function gxnrGridsdt_tratamiento_recetass_newrow */
   }

   public void gxgrgridsdt_tratamiento_recetass_refresh( int subGridsdt_tratamiento_recetass_Rows ,
                                                         GXBaseCollection<app.SdtSDT_TRATAMIENTO_RECETAS_Receta> AV124SDT_TRATAMIENTO_RECETAS ,
                                                         java.math.BigDecimal AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr ,
                                                         long AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie ,
                                                         java.math.BigDecimal AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr ,
                                                         short AV120Moda21 ,
                                                         String AV13BarAgrEst ,
                                                         java.math.BigDecimal AV75RecTotKgm ,
                                                         java.math.BigDecimal AV77RecTotMtr )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171FP2 ();
      GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord = 0 ;
      rf1FP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte01_WP");
      forbiddenHiddens.add("RecTotKgm", localUtil.format( AV75RecTotKgm, "ZZZZZZZ.ZZ"));
      forbiddenHiddens.add("RecTotMtr", localUtil.format( AV77RecTotMtr, "ZZZZZZZ.ZZ"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte01_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridsdt_tratamiento_recetass_refresh */
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
      rf1FP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV158Pgmname = "RecetadeTinte01_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavSdt_tratamiento_recetas__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__emprcod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcodreo_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcodpar_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__emprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__emprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__emprnom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__clicod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__clinom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bartotagr_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bartotpie_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bartotmtr_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barartcod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barartdsc_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bargraaca_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcolnom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcolnum_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled), 5, 0), true);
      edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled), 5, 0), true);
      edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled), 5, 0), true);
      edtavRectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgm_Enabled), 5, 0), true);
      edtavRectotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgs_Enabled), 5, 0), true);
      edtavRectotmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotmtr_Enabled), 5, 0), true);
      edtavRectotmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotmts_Enabled), 5, 0), true);
      edtavRectotpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotpie_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavMaqvolmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmax_Enabled), 5, 0), true);
      edtavMaqvolmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmin_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_barmacpro_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.numerodeprogramaautomataprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vBARMACPRO"+"'), id:'"+"vBARMACPRO"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMACPRODSC"+"'), id:'"+"vMACPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_barmacpro_Internalname, "Link", imgPrompt_barmacpro_Link, true);
   }

   public void rf1FP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridsdt_tratamiento_recetassContainer.ClearRows();
      }
      wbStart = (short)(48) ;
      /* Execute user event: Refresh */
      e171FP2 ();
      nGXsfl_48_idx = 1 ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_482( ) ;
      bGXsfl_48_Refreshing = true ;
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GridName", "Gridsdt_tratamiento_recetass");
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("CmpContext", "");
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("InMasterPage", "false");
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridsdt_tratamiento_recetassContainer.setPageSize( subgridsdt_tratamiento_recetass_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_482( ) ;
         e181FP2 ();
         if ( ( GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord > 0 ) && ( GRIDSDT_TRATAMIENTO_RECETASS_nGridOutOfScope == 0 ) && ( nGXsfl_48_idx == 1 ) )
         {
            GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord = 0 ;
            GRIDSDT_TRATAMIENTO_RECETASS_nGridOutOfScope = 1 ;
            subgridsdt_tratamiento_recetass_firstpage( ) ;
            e181FP2 ();
         }
         wbEnd = (short)(48) ;
         wb1FP0( ) ;
      }
      bGXsfl_48_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FP2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_TRATAMIENTO_RECETAS", AV124SDT_TRATAMIENTO_RECETAS);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_TRATAMIENTO_RECETAS", AV124SDT_TRATAMIENTO_RECETAS);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDT_TRATAMIENTO_RECETAS", getSecureSignedToken( "", AV124SDT_TRATAMIENTO_RECETAS));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", GXutil.ltrim( localUtil.ntoc( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", getSecureSignedToken( "", localUtil.format( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", GXutil.ltrim( localUtil.ntoc( AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", GXutil.ltrim( localUtil.ntoc( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", getSecureSignedToken( "", localUtil.format( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV120Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV120Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV13BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrEst, "@!"))));
   }

   public int subgridsdt_tratamiento_recetass_fnc_pagecount( )
   {
      GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount = subgridsdt_tratamiento_recetass_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount) % (subgridsdt_tratamiento_recetass_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount/ (double) (subgridsdt_tratamiento_recetass_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount/ (double) (subgridsdt_tratamiento_recetass_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdt_tratamiento_recetass_fnc_recordcount( )
   {
      return AV124SDT_TRATAMIENTO_RECETAS.size() ;
   }

   public int subgridsdt_tratamiento_recetass_fnc_recordsperpage( )
   {
      if ( subGridsdt_tratamiento_recetass_Rows > 0 )
      {
         return subGridsdt_tratamiento_recetass_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdt_tratamiento_recetass_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage/ (double) (subgridsdt_tratamiento_recetass_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdt_tratamiento_recetass_firstpage( )
   {
      GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_tratamiento_recetass_refresh( subGridsdt_tratamiento_recetass_Rows, AV124SDT_TRATAMIENTO_RECETAS, AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, AV120Moda21, AV13BarAgrEst, AV75RecTotKgm, AV77RecTotMtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdt_tratamiento_recetass_nextpage( )
   {
      GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount = subgridsdt_tratamiento_recetass_fnc_recordcount( ) ;
      if ( ( GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount >= subgridsdt_tratamiento_recetass_fnc_recordsperpage( ) ) && ( GRIDSDT_TRATAMIENTO_RECETASS_nEOF == 0 ) )
      {
         GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = (long)(GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage+subgridsdt_tratamiento_recetass_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_tratamiento_recetass_refresh( subGridsdt_tratamiento_recetass_Rows, AV124SDT_TRATAMIENTO_RECETAS, AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, AV120Moda21, AV13BarAgrEst, AV75RecTotKgm, AV77RecTotMtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDT_TRATAMIENTO_RECETASS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdt_tratamiento_recetass_previouspage( )
   {
      if ( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage >= subgridsdt_tratamiento_recetass_fnc_recordsperpage( ) )
      {
         GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = (long)(GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage-subgridsdt_tratamiento_recetass_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_tratamiento_recetass_refresh( subGridsdt_tratamiento_recetass_Rows, AV124SDT_TRATAMIENTO_RECETAS, AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, AV120Moda21, AV13BarAgrEst, AV75RecTotKgm, AV77RecTotMtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdt_tratamiento_recetass_lastpage( )
   {
      GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount = subgridsdt_tratamiento_recetass_fnc_recordcount( ) ;
      if ( GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount > subgridsdt_tratamiento_recetass_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount) % (subgridsdt_tratamiento_recetass_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = (long)(GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount-subgridsdt_tratamiento_recetass_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = (long)(GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount-((int)((GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount) % (subgridsdt_tratamiento_recetass_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_tratamiento_recetass_refresh( subGridsdt_tratamiento_recetass_Rows, AV124SDT_TRATAMIENTO_RECETAS, AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, AV120Moda21, AV13BarAgrEst, AV75RecTotKgm, AV77RecTotMtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdt_tratamiento_recetass_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = (long)(subgridsdt_tratamiento_recetass_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdt_tratamiento_recetass_refresh( subGridsdt_tratamiento_recetass_Rows, AV124SDT_TRATAMIENTO_RECETAS, AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie, AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, AV120Moda21, AV13BarAgrEst, AV75RecTotKgm, AV77RecTotMtr) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV158Pgmname = "RecetadeTinte01_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavSdt_tratamiento_recetas__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__emprcod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcodreo_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcodpar_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__emprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__emprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__emprnom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__clicod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__clinom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bartotagr_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bartotpie_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bartotmtr_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barartcod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barartdsc_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__bargraaca_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcolnom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdt_tratamiento_recetas__barcolnum_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled), 5, 0), true);
      edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled), 5, 0), true);
      edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled), 5, 0), true);
      edtavRectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgm_Enabled), 5, 0), true);
      edtavRectotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgs_Enabled), 5, 0), true);
      edtavRectotmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotmtr_Enabled), 5, 0), true);
      edtavRectotmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotmts_Enabled), 5, 0), true);
      edtavRectotpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotpie_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavMaqvolmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmax_Enabled), 5, 0), true);
      edtavMaqvolmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmin_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_barmacpro_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.numerodeprogramaautomataprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vBARMACPRO"+"'), id:'"+"vBARMACPRO"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMACPRODSC"+"'), id:'"+"vMACPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_barmacpro_Internalname, "Link", imgPrompt_barmacpro_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup1FP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161FP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdt_tratamiento_recetas"), AV124SDT_TRATAMIENTO_RECETAS);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV112DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARMAQCOD_DATA"), AV109BarMaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDT_TRATAMIENTO_RECETAS"), AV124SDT_TRATAMIENTO_RECETAS);
         /* Read saved values. */
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( "vMSG") ;
         GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDT_TRATAMIENTO_RECETASS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_TRATAMIENTO_RECETASS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdt_tratamiento_recetass_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDT_TRATAMIENTO_RECETASS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Combo_barmaqcod_Cls = httpContext.cgiGet( "COMBO_BARMAQCOD_Cls") ;
         Combo_barmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARMAQCOD_Selectedvalue_set") ;
         Combo_barmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_BARMAQCOD_Emptyitem")) ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Gridsdt_tratamiento_recetass_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDT_TRATAMIENTO_RECETASS_EMPOWERER_Gridinternalname") ;
         Combo_barmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_BARMAQCOD_Selectedvalue_get") ;
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_48_fel_idx = 0 ;
         while ( nGXsfl_48_fel_idx < nRC_GXsfl_48 )
         {
            nGXsfl_48_fel_idx = ((subGridsdt_tratamiento_recetass_Islastpage==1)&&(nGXsfl_48_fel_idx+1>subgridsdt_tratamiento_recetass_fnc_recordsperpage( )) ? 1 : nGXsfl_48_fel_idx+1) ;
            sGXsfl_48_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_482( ) ;
            AV142GXV1 = (int)(nGXsfl_48_fel_idx+GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage) ;
            if ( ( AV124SDT_TRATAMIENTO_RECETAS.size() >= AV142GXV1 ) && ( AV142GXV1 > 0 ) )
            {
               AV124SDT_TRATAMIENTO_RECETAS.currentItem( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)) );
            }
         }
         if ( nGXsfl_48_fel_idx == 0 )
         {
            nGXsfl_48_idx = 1 ;
            sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_482( ) ;
         }
         nGXsfl_48_fel_idx = 1 ;
         /* Read variables values. */
         AV92BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92BarNHdr", AV92BarNHdr);
         AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = httpContext.cgiGet( edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr", AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr);
         AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie = httpContext.cgiGet( edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie", AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie);
         AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = httpContext.cgiGet( edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr", AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGM");
            GX_FocusControl = edtavRectotkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75RecTotKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75RecTotKgm", GXutil.ltrimstr( AV75RecTotKgm, 10, 2));
         }
         else
         {
            AV75RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75RecTotKgm", GXutil.ltrimstr( AV75RecTotKgm, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGS");
            GX_FocusControl = edtavRectotkgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76RecTotKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76RecTotKgs", GXutil.ltrimstr( AV76RecTotKgs, 10, 2));
         }
         else
         {
            AV76RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76RecTotKgs", GXutil.ltrimstr( AV76RecTotKgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTMTR");
            GX_FocusControl = edtavRectotmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77RecTotMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77RecTotMtr", GXutil.ltrimstr( AV77RecTotMtr, 10, 2));
         }
         else
         {
            AV77RecTotMtr = localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77RecTotMtr", GXutil.ltrimstr( AV77RecTotMtr, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotmts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTMTS");
            GX_FocusControl = edtavRectotmts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78RecTotMts = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78RecTotMts", GXutil.ltrimstr( AV78RecTotMts, 10, 2));
         }
         else
         {
            AV78RecTotMts = localUtil.ctond( httpContext.cgiGet( edtavRectotmts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78RecTotMts", GXutil.ltrimstr( AV78RecTotMts, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRectotpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRectotpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTPIE");
            GX_FocusControl = edtavRectotpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79RecTotpie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79RecTotpie), 5, 0));
         }
         else
         {
            AV79RecTotpie = (int)(localUtil.ctol( httpContext.cgiGet( edtavRectotpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79RecTotpie), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE");
            GX_FocusControl = edtavBarpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24BarPie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarPie), 6, 0));
         }
         else
         {
            AV24BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarPie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMAX");
            GX_FocusControl = edtavMaqvolmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56MaqVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
         }
         else
         {
            AV56MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMIN");
            GX_FocusControl = edtavMaqvolmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58MaqVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58MaqVolMin), 5, 0));
         }
         else
         {
            AV58MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58MaqVolMin), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
            GX_FocusControl = edtavRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         }
         else
         {
            AV70Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARVOLMAQ");
            GX_FocusControl = edtavBarvolmaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30BarVolmaq = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
         }
         else
         {
            AV30BarVolmaq = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34Clicod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Clicod), 6, 0));
         }
         else
         {
            AV34Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Clicod), 6, 0));
         }
         AV35CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35CliNom", AV35CliNom);
         AV26Barser = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Barser", AV26Barser);
         AV27BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarSerDsc", AV27BarSerDsc);
         AV15Barcolnom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnom", AV15Barcolnom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Barcolnum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barcolnum), 6, 0));
         }
         else
         {
            AV16Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barcolnum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29BarTipcol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarTipcol), 2, 0));
         }
         else
         {
            AV29BarTipcol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarTipcol), 2, 0));
         }
         AV22BarNomcli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarNomcli", AV22BarNomcli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLI");
            GX_FocusControl = edtavBarnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23BarNumcli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarNumcli), 6, 0));
         }
         else
         {
            AV23BarNumcli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarNumcli), 6, 0));
         }
         AV18BarMacPro = httpContext.cgiGet( edtavBarmacpro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarMacPro", AV18BarMacPro);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarfacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarfacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFACABS");
            GX_FocusControl = edtavBarfacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17BarFacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
         }
         else
         {
            AV17BarFacAbs = localUtil.ctond( httpContext.cgiGet( edtavBarfacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarbp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarbp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARBP12");
            GX_FocusControl = edtavBarbp12_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV113BarBp12 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113BarBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113BarBp12), 4, 0));
         }
         else
         {
            AV113BarBp12 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarbp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113BarBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113BarBp12), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarbp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarbp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARBP13");
            GX_FocusControl = edtavBarbp13_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV114BarBp13 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114BarBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114BarBp13), 4, 0));
         }
         else
         {
            AV114BarBp13 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarbp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114BarBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114BarBp13), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarbp14_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarbp14_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARBP14");
            GX_FocusControl = edtavBarbp14_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV115BarBp14 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115BarBp14", GXutil.ltrimstr( AV115BarBp14, 6, 3));
         }
         else
         {
            AV115BarBp14 = localUtil.ctond( httpContext.cgiGet( edtavBarbp14_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115BarBp14", GXutil.ltrimstr( AV115BarBp14, 6, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarbp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarbp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARBP15");
            GX_FocusControl = edtavBarbp15_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116BarBp15 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116BarBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarBp15), 4, 0));
         }
         else
         {
            AV116BarBp15 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarbp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116BarBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarBp15), 4, 0));
         }
         AV158Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
         AV21BarMaqCod = httpContext.cgiGet( edtavBarmaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
         AV102RecetasTinteProcesosQuimicosToJson = httpContext.cgiGet( edtavRecetastinteprocesosquimicostojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102RecetasTinteProcesosQuimicosToJson", AV102RecetasTinteProcesosQuimicosToJson);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte01_WP");
         AV75RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75RecTotKgm", GXutil.ltrimstr( AV75RecTotKgm, 10, 2));
         forbiddenHiddens.add("RecTotKgm", localUtil.format( AV75RecTotKgm, "ZZZZZZZ.ZZ"));
         AV77RecTotMtr = localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77RecTotMtr", GXutil.ltrimstr( AV77RecTotMtr, 10, 2));
         forbiddenHiddens.add("RecTotMtr", localUtil.format( AV77RecTotMtr, "ZZZZZZZ.ZZ"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetadetinte01_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e161FP2 ();
      if (returnInSub) return;
   }

   public void e161FP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV89UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
      GXt_char1 = AV83Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte01_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV83Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Station", AV83Station);
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV89UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char2[0] ;
      recetadetinte01_wp_impl.this.AV40EmprNom = GXv_char3[0] ;
      recetadetinte01_wp_impl.this.AV89UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV40EmprNom", AV40EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
      GXt_int5 = AV33Carvitin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Carvitin", GXutil.str( AV33Carvitin, 1, 0));
      GXt_int5 = AV41FlagAut ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "AUTOMA", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41FlagAut = GXt_int5 ;
      GXt_int5 = AV67ProductosCaderno ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "NOPRDE", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV67ProductosCaderno = GXt_int5 ;
      GXt_int7 = AV36ConversionLbvsKgs ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "LBVSKG", ""), GXv_int8) ;
      recetadetinte01_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV36ConversionLbvsKgs = GXt_int7 ;
      GXt_int5 = AV71RBaFor ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "RBAFOR", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV71RBaFor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71RBaFor", GXutil.str( AV71RBaFor, 1, 0));
      GXt_int5 = AV65orgatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "ORGATE", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV65orgatex = GXt_int5 ;
      GXt_int7 = AV91VarSleep ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "SEDTIM", ""), GXv_int8) ;
      recetadetinte01_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV91VarSleep = (short)(GXt_int7) ;
      AV91VarSleep = (short)(((AV91VarSleep==0) ? 0 : AV91VarSleep)) ;
      GXt_int5 = AV37Cotexsur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37Cotexsur = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Cotexsur", GXutil.str( AV37Cotexsur, 1, 0));
      GXt_int5 = AV39DscArt80 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "DSCA80", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV39DscArt80 = GXt_int5 ;
      GXt_int5 = (byte)(AV120Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV120Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV120Moda21), "ZZZ9")));
      AV62Msg_sedomaster = httpContext.getMessage( "Tempo de espera para criar arquivos PREP e PROD, de ", "") + GXutil.trim( GXutil.str( AV91VarSleep, 4, 0)) + httpContext.getMessage( " segundos", "") ;
      AV51lbvsKgs = ((AV36ConversionLbvsKgs==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(AV36ConversionLbvsKgs/ (double) (10000))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51lbvsKgs", GXutil.ltrimstr( AV51lbvsKgs, 7, 4));
      AV102RecetasTinteProcesosQuimicosToJson = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102RecetasTinteProcesosQuimicosToJson", AV102RecetasTinteProcesosQuimicosToJson);
      GXt_int5 = (byte)(AV117volumenmsg) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "VOLMSG", ""), GXv_int6) ;
      recetadetinte01_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV117volumenmsg = GXt_int5 ;
      /* Execute user subroutine: 'BARCAD' */
      S112 ();
      if (returnInSub) return;
      AV105RecetasTinteProcesosQuimicos_SDTs.clear();
      AV106Tabla_Lformu = (short)(0) ;
      /* Using cursor H01FP2 */
      pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV34Clicod), AV26Barser, AV15Barcolnom, Integer.valueOf(AV16Barcolnum), Byte.valueOf(AV29BarTipcol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = H01FP2_A831TipColCod[0] ;
         A483ForColNum = H01FP2_A483ForColNum[0] ;
         A482ForColNom = H01FP2_A482ForColNom[0] ;
         A494ForSer = H01FP2_A494ForSer[0] ;
         A252CliCod = H01FP2_A252CliCod[0] ;
         n252CliCod = H01FP2_n252CliCod[0] ;
         A396EmprCod = H01FP2_A396EmprCod[0] ;
         A764ProForCod = H01FP2_A764ProForCod[0] ;
         A766ProForDsc = H01FP2_A766ProForDsc[0] ;
         A1160ProForL = H01FP2_A1160ProForL[0] ;
         A766ProForDsc = H01FP2_A766ProForDsc[0] ;
         AV104RecetasTinteProcesosQuimicos_SDT = (app.SdtRecetasTinteProcesosQuimicos_SDT)new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
         AV104RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod( A764ProForCod );
         AV104RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( A766ProForDsc );
         AV104RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( A1160ProForL );
         AV105RecetasTinteProcesosQuimicos_SDTs.add(AV104RecetasTinteProcesosQuimicos_SDT, 0);
         AV106Tabla_Lformu = (short)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV102RecetasTinteProcesosQuimicosToJson = AV105RecetasTinteProcesosQuimicos_SDTs.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102RecetasTinteProcesosQuimicosToJson", AV102RecetasTinteProcesosQuimicosToJson);
      httpContext.doAjaxRefresh();
      AV107ErrMensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107ErrMensaje", AV107ErrMensaje);
      GXt_char1 = AV83Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetadetinte01_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV83Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Station", AV83Station);
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char2[0] = AV89UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
      recetadetinte01_wp_impl.this.AV40EmprNom = GXv_char3[0] ;
      recetadetinte01_wp_impl.this.AV89UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV40EmprNom", AV40EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
      divUnnamedtable6_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV112DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV112DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      edtavBarmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOBARMAQCOD' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
      if (returnInSub) return;
      edtavRecetastinteprocesosquimicostojson_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetastinteprocesosquimicostojson_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetastinteprocesosquimicostojson_Visible), 5, 0), true);
      Gridsdt_tratamiento_recetass_empowerer_Gridinternalname = subGridsdt_tratamiento_recetass_Internalname ;
      ucGridsdt_tratamiento_recetass_empowerer.sendProperty(context, "", false, Gridsdt_tratamiento_recetass_empowerer_Internalname, "GridInternalName", Gridsdt_tratamiento_recetass_empowerer_Gridinternalname);
      subGridsdt_tratamiento_recetass_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Rows, (byte)(6), (byte)(0), ".", "")));
      imgMaquinaprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgMaquinaprompt_Internalname, "gximage", imgMaquinaprompt_gximage, true);
      AV111MaquinaPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      AV160Maquinaprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
   }

   public void e171FP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'INITIALIZETOTALIZERSGRIDSDT_TRATAMIENTO_RECETASS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERSGRIDSDT_TRATAMIENTO_RECETASS' */
      S152 ();
      if (returnInSub) return;
      edtavSdt_tratamiento_recetas__barcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcod_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__barcod_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotagr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotagr_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__bartotagr_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotpie_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotpie_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__bartotpie_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bartotmtr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bartotmtr_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__bartotmtr_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barartcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barartcod_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__barartcod_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barartdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barartdsc_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__barartdsc_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__bargraaca_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__bargraaca_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__bargraaca_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcolnom_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__barcolnom_Columnheaderclass, !bGXsfl_48_Refreshing);
      edtavSdt_tratamiento_recetas__barcolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdt_tratamiento_recetas__barcolnum_Internalname, "Columnheaderclass", edtavSdt_tratamiento_recetas__barcolnum_Columnheaderclass, !bGXsfl_48_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e181FP2( )
   {
      /* Gridsdt_tratamiento_recetass_Load Routine */
      returnInSub = false ;
      AV142GXV1 = 1 ;
      while ( AV142GXV1 <= AV124SDT_TRATAMIENTO_RECETAS.size() )
      {
         AV124SDT_TRATAMIENTO_RECETAS.currentItem( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)) );
         edtavSdt_tratamiento_recetas__barcod_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess WWColumnSuccessFirstColumn" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__bartotagr_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__bartotpie_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__bartotmtr_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__barartcod_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__barartdsc_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__bargraaca_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__barcolnom_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavSdt_tratamiento_recetas__barcolnum_Columnclass = ((((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(AV124SDT_TRATAMIENTO_RECETAS.currentItem())).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal()==1) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(48) ;
         }
         if ( ( subGridsdt_tratamiento_recetass_Islastpage == 1 ) || ( subGridsdt_tratamiento_recetass_Rows == 0 ) || ( ( GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord >= GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage ) && ( GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord < GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage + subgridsdt_tratamiento_recetass_fnc_recordsperpage( ) ) ) )
         {
            sendrow_482( ) ;
            GRIDSDT_TRATAMIENTO_RECETASS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord + 1 >= subgridsdt_tratamiento_recetass_fnc_recordcount( ) )
            {
               GRIDSDT_TRATAMIENTO_RECETASS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDT_TRATAMIENTO_RECETASS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDT_TRATAMIENTO_RECETASS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord = (long)(GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_48_Refreshing )
         {
            httpContext.doAjaxLoad(48, Gridsdt_tratamiento_recetassRow);
         }
         AV142GXV1 = (int)(AV142GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e121FP2( )
   {
      /* 'DoBarNHdr' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.consultahdrsagrupadastinte_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {"AV5EmprCod","AV6Barcod","AV7Barcodreo","AV8Barcodpar"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e131FP2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar,Short.valueOf(AV73RecLinmaq),AV107ErrMensaje});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6Barcod","AV7Barcodreo","AV8Barcodpar","AV73RecLinmaq","AV107ErrMensaje"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e151FP2( )
   {
      /* 'DoProcesosQuimicos' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.recetastinteprocesosquimicos_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV26Barser)),GXutil.URLEncode(GXutil.rtrim(AV15Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV16Barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarTipcol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV102RecetasTinteProcesosQuimicosToJson))}, new String[] {"Emprcod","Clicod","Forser","Forcolnom","Forcolnum","Tipcolcod","RecetasTinteProcesosQuimicosToJson"}) , new Object[] {"AV5EmprCod","AV34Clicod","AV26Barser","AV15Barcolnom","AV16Barcolnum","AV29BarTipcol","AV102RecetasTinteProcesosQuimicosToJson"});
      /*  Sending Event outputs  */
   }

   public void e111FP2( )
   {
      /* Combo_barmaqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV21BarMaqCod = Combo_barmaqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
      /* Execute user subroutine: 'MAQUIN' */
      S162 ();
      if (returnInSub) return;
      if ( (0==AV55Maquin) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "ERROR.Codigo Inexistente", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavBarmaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV70Rb = ((AV54MaqRelban>0) ? DecimalUtil.doubleToDec(AV54MaqRelban) : AV70Rb) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         AV30BarVolmaq = AV57MaqVolMed ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
         AV30BarVolmaq = (int)(((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Rb)==0) ? AV30BarVolmaq : (long)(DecimalUtil.decToDouble(AV75RecTotKgm.multiply(AV70Rb))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5EmprCod, httpContext.getMessage( "AUTOMA", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable5_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable5_cell_Internalname, "Class", divDvpanel_unnamedtable5_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable5_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable5_cell_Internalname, "Class", divDvpanel_unnamedtable5_cell_Class, true);
      }
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERSGRIDSDT_TRATAMIENTO_RECETASS' Routine */
      returnInSub = false ;
      AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr", GXutil.ltrimstr( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", getSecureSignedToken( "", localUtil.format( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "ZZZZZZ9.99")));
      AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), "ZZZZ9")));
      AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr", GXutil.ltrimstr( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", getSecureSignedToken( "", localUtil.format( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "ZZZZZZ9.99")));
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERSGRIDSDT_TRATAMIENTO_RECETASS' Routine */
      returnInSub = false ;
      AV161GXV17 = 1 ;
      while ( AV161GXV17 <= AV124SDT_TRATAMIENTO_RECETAS.size() )
      {
         AV128SDT_TRATAMIENTO_RECETASItem = (app.SdtSDT_TRATAMIENTO_RECETAS_Receta)((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV161GXV17));
         AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr.add((AV128SDT_TRATAMIENTO_RECETASItem.getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr", GXutil.ltrimstr( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR", getSecureSignedToken( "", localUtil.format( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "ZZZZZZ9.99")));
         AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie = (long)(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie+(AV128SDT_TRATAMIENTO_RECETASItem.getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), "ZZZZ9")));
         AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr.add((AV128SDT_TRATAMIENTO_RECETASItem.getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr", GXutil.ltrimstr( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR", getSecureSignedToken( "", localUtil.format( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "ZZZZZZ9.99")));
         AV161GXV17 = (int)(AV161GXV17+1) ;
      }
      AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = localUtil.format( AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr", AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr);
      AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie = localUtil.format( DecimalUtil.doubleToDec(AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie), "ZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie", AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie);
      AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = localUtil.format( AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr", AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr);
   }

   public void S122( )
   {
      /* 'LOADCOMBOBARMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01FP3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A607MaqEst = H01FP3_A607MaqEst[0] ;
         n607MaqEst = H01FP3_n607MaqEst[0] ;
         A623MaqVolMax = H01FP3_A623MaqVolMax[0] ;
         n623MaqVolMax = H01FP3_n623MaqVolMax[0] ;
         A602MaqCod = H01FP3_A602MaqCod[0] ;
         A625MaqVolMin = H01FP3_A625MaqVolMin[0] ;
         n625MaqVolMin = H01FP3_n625MaqVolMin[0] ;
         A606MaqDsc = H01FP3_A606MaqDsc[0] ;
         n606MaqDsc = H01FP3_n606MaqDsc[0] ;
         AV110Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV110Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV110Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A602MaqCod)+"-"+GXutil.trim( A606MaqDsc)+httpContext.getMessage( " Vol. ", "")+GXutil.trim( GXutil.str( A623MaqVolMax, 5, 0))+"/"+GXutil.trim( GXutil.str( A625MaqVolMin, 5, 0)) );
         AV109BarMaqCod_Data.add(AV110Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV109BarMaqCod_Data.sort("Title");
      Combo_barmaqcod_Selectedvalue_set = AV21BarMaqCod ;
      ucCombo_barmaqcod.sendProperty(context, "", false, Combo_barmaqcod_Internalname, "SelectedValue_set", Combo_barmaqcod_Selectedvalue_set);
   }

   public void e191FP2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV105RecetasTinteProcesosQuimicos_SDTs.fromJSonString(AV102RecetasTinteProcesosQuimicosToJson, null);
      /* Execute user subroutine: 'MAQUIN' */
      S162 ();
      if (returnInSub) return;
      GXv_int11[0] = AV119errNprograma ;
      new app.existenprograma(remoteHandle, context).execute( AV5EmprCod, AV18BarMacPro, GXv_int11) ;
      recetadetinte01_wp_impl.this.AV119errNprograma = GXv_int11[0] ;
      if ( AV105RecetasTinteProcesosQuimicos_SDTs.size() == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hay Procesos Quimicos", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( (0==AV55Maquin) || (GXutil.strcmp("", AV21BarMaqCod)==0) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Error.Maquina Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavBarmaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV30BarVolmaq > AV56MaqVolMax ) && ( AV56MaqVolMax > 0 ) )
            {
               Gx_msg = httpContext.getMessage( "ERROR. ", "") + httpContext.getMessage( "Volumen ", "") + GXutil.trim( GXutil.str( AV30BarVolmaq, 5, 0)) + httpContext.getMessage( " superior Volumen Max ", "") + GXutil.trim( GXutil.str( AV56MaqVolMax, 5, 0)) ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavBarvolmaq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( AV30BarVolmaq < AV58MaqVolMin ) && ( AV58MaqVolMin > 0 ) )
               {
                  Gx_msg = httpContext.getMessage( "ERROR. ", "") + httpContext.getMessage( "Volumen ", "") + GXutil.trim( GXutil.str( AV30BarVolmaq, 5, 0)) + httpContext.getMessage( " inferior Volumen Min ", "") + GXutil.trim( GXutil.str( AV58MaqVolMin, 5, 0)) ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavBarvolmaq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( (0==AV30BarVolmaq) )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Error.Volumen sin valor ¡¡¡", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavBarvolmaq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( AV119errNprograma == 1 ) && ( AV120Moda21 == 1 ) && ! (GXutil.strcmp("", AV18BarMacPro)==0) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "Error. NO existe Numero de Programa", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavBarmacpro_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( (GXutil.strcmp("", AV18BarMacPro)==0) && ( AV120Moda21 == 1 ) && ! (GXutil.strcmp("", AV18BarMacPro)==0) )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "Error. Falta Numero de Programa", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           GX_FocusControl = edtavBarmacpro_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           AV73RecLinmaq = (short)(10) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV73RecLinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73RecLinmaq), 4, 0));
                           GXv_char4[0] = AV5EmprCod ;
                           GXv_int8[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char3[0] = AV8Barcodpar ;
                           GXv_char2[0] = AV18BarMacPro ;
                           GXv_decimal12[0] = AV17BarFacAbs ;
                           new app.pdyrp028(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2, GXv_decimal12) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int8[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV18BarMacPro = GXv_char2[0] ;
                           recetadetinte01_wp_impl.this.AV17BarFacAbs = GXv_decimal12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV18BarMacPro", AV18BarMacPro);
                           httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
                           new app.pvarsedo(remoteHandle, context).execute( AV5EmprCod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV113BarBp12, AV114BarBp13, AV115BarBp14, AV116BarBp15, (short)(0)) ;
                           new app.pdyrp000(remoteHandle, context).execute( AV5EmprCod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV73RecLinmaq, AV17BarFacAbs, AV75RecTotKgm, AV77RecTotMtr, AV30BarVolmaq, AV21BarMaqCod, AV18BarMacPro, AV102RecetasTinteProcesosQuimicosToJson, AV83Station, httpContext.getMessage( "INS", "")) ;
                           GXv_char4[0] = AV5EmprCod ;
                           GXv_int8[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char3[0] = AV8Barcodpar ;
                           GXv_int11[0] = AV73RecLinmaq ;
                           new app.pdyrp013(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_int11) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int8[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV73RecLinmaq = GXv_int11[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV73RecLinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73RecLinmaq), 4, 0));
                           GXv_char4[0] = AV5EmprCod ;
                           GXv_int8[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char3[0] = AV8Barcodpar ;
                           GXv_char2[0] = AV21BarMaqCod ;
                           GXv_int13[0] = AV30BarVolmaq ;
                           GXv_decimal12[0] = AV17BarFacAbs ;
                           new app.pdyrp014(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2, GXv_int13, GXv_decimal12) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int8[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV21BarMaqCod = GXv_char2[0] ;
                           recetadetinte01_wp_impl.this.AV30BarVolmaq = GXv_int13[0] ;
                           recetadetinte01_wp_impl.this.AV17BarFacAbs = GXv_decimal12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
                           if ( GXutil.strcmp(AV13BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
                           {
                              GXv_char4[0] = AV5EmprCod ;
                              GXv_int13[0] = AV6Barcod ;
                              GXv_int6[0] = AV7Barcodreo ;
                              GXv_char3[0] = AV8Barcodpar ;
                              GXv_char2[0] = AV21BarMaqCod ;
                              GXv_int8[0] = AV30BarVolmaq ;
                              new app.pdyrp015(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int6, GXv_char3, GXv_char2, GXv_int8) ;
                              recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
                              recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                              recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                              recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char3[0] ;
                              recetadetinte01_wp_impl.this.AV21BarMaqCod = GXv_char2[0] ;
                              recetadetinte01_wp_impl.this.AV30BarVolmaq = GXv_int8[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                              httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
                           }
                           GXv_char4[0] = AV5EmprCod ;
                           GXv_int13[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char3[0] = AV8Barcodpar ;
                           GXv_char2[0] = AV89UsurCod ;
                           GXv_char14[0] = AV83Station ;
                           new app.pdyrp031(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int6, GXv_char3, GXv_char2, GXv_char14) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV89UsurCod = GXv_char2[0] ;
                           recetadetinte01_wp_impl.this.AV83Station = GXv_char14[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV83Station", AV83Station);
                           if ( GXutil.strcmp(AV13BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
                           {
                              GXv_char14[0] = AV5EmprCod ;
                              GXv_int13[0] = AV6Barcod ;
                              GXv_int6[0] = AV7Barcodreo ;
                              GXv_char4[0] = AV8Barcodpar ;
                              GXv_char3[0] = AV89UsurCod ;
                              GXv_char2[0] = AV83Station ;
                              new app.pdyrp032(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
                              recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                              recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                              recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                              recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                              recetadetinte01_wp_impl.this.AV89UsurCod = GXv_char3[0] ;
                              recetadetinte01_wp_impl.this.AV83Station = GXv_char2[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                              httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV83Station", AV83Station);
                           }
                           AV107ErrMensaje = httpContext.getMessage( "Proceso finalizado con exito!", "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV107ErrMensaje", AV107ErrMensaje);
                           httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar,Short.valueOf(AV73RecLinmaq),AV107ErrMensaje});
                           httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6Barcod","AV7Barcodreo","AV8Barcodpar","AV73RecLinmaq","AV107ErrMensaje"});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e141FP2 ();
      if (returnInSub) return;
   }

   public void e141FP2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV105RecetasTinteProcesosQuimicos_SDTs.fromJSonString(AV102RecetasTinteProcesosQuimicosToJson, null);
      /* Execute user subroutine: 'MAQUIN' */
      S162 ();
      if (returnInSub) return;
      GXv_int11[0] = AV119errNprograma ;
      new app.existenprograma(remoteHandle, context).execute( AV5EmprCod, AV18BarMacPro, GXv_int11) ;
      recetadetinte01_wp_impl.this.AV119errNprograma = GXv_int11[0] ;
      if ( AV105RecetasTinteProcesosQuimicos_SDTs.size() == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hay Procesos Quimicos", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( (0==AV55Maquin) || (GXutil.strcmp("", AV21BarMaqCod)==0) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Error.Maquina Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavBarmaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV30BarVolmaq > AV56MaqVolMax ) && ( AV56MaqVolMax > 0 ) )
            {
               Gx_msg = httpContext.getMessage( "ERROR. ", "") + httpContext.getMessage( "Volumen ", "") + GXutil.trim( GXutil.str( AV30BarVolmaq, 5, 0)) + httpContext.getMessage( " superior Volumen Max ", "") + GXutil.trim( GXutil.str( AV56MaqVolMax, 5, 0)) ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavBarvolmaq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( AV30BarVolmaq < AV58MaqVolMin ) && ( AV58MaqVolMin > 0 ) )
               {
                  Gx_msg = httpContext.getMessage( "ERROR. ", "") + httpContext.getMessage( "Volumen ", "") + GXutil.trim( GXutil.str( AV30BarVolmaq, 5, 0)) + httpContext.getMessage( " inferior Volumen Min ", "") + GXutil.trim( GXutil.str( AV58MaqVolMin, 5, 0)) ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavBarvolmaq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( (0==AV30BarVolmaq) )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Error.Volumen sin valor ¡¡¡", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavBarvolmaq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( AV119errNprograma == 1 ) && ( AV120Moda21 == 1 ) && ! (GXutil.strcmp("", AV18BarMacPro)==0) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "Error. NO existe Numero de Programa", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavBarmacpro_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( (GXutil.strcmp("", AV18BarMacPro)==0) && ( AV120Moda21 == 1 ) && ! (GXutil.strcmp("", AV18BarMacPro)==0) )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "Error. Falta Numero de Programa", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           GX_FocusControl = edtavBarmacpro_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           AV73RecLinmaq = (short)(10) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV73RecLinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73RecLinmaq), 4, 0));
                           GXv_char14[0] = AV5EmprCod ;
                           GXv_int13[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char4[0] = AV8Barcodpar ;
                           GXv_char3[0] = AV18BarMacPro ;
                           GXv_decimal12[0] = AV17BarFacAbs ;
                           new app.pdyrp028(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_char3, GXv_decimal12) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV18BarMacPro = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV17BarFacAbs = GXv_decimal12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV18BarMacPro", AV18BarMacPro);
                           httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
                           new app.pvarsedo(remoteHandle, context).execute( AV5EmprCod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV113BarBp12, AV114BarBp13, AV115BarBp14, AV116BarBp15, (short)(0)) ;
                           new app.pdyrp000(remoteHandle, context).execute( AV5EmprCod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV73RecLinmaq, AV17BarFacAbs, AV75RecTotKgm, AV77RecTotMtr, AV30BarVolmaq, AV21BarMaqCod, AV18BarMacPro, AV102RecetasTinteProcesosQuimicosToJson, AV83Station, httpContext.getMessage( "INS", "")) ;
                           GXv_char14[0] = AV5EmprCod ;
                           GXv_int13[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char4[0] = AV8Barcodpar ;
                           GXv_int11[0] = AV73RecLinmaq ;
                           new app.pdyrp013(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_int11) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV73RecLinmaq = GXv_int11[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV73RecLinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73RecLinmaq), 4, 0));
                           GXv_char14[0] = AV5EmprCod ;
                           GXv_int13[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char4[0] = AV8Barcodpar ;
                           GXv_char3[0] = AV21BarMaqCod ;
                           GXv_int8[0] = AV30BarVolmaq ;
                           GXv_decimal12[0] = AV17BarFacAbs ;
                           new app.pdyrp014(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_char3, GXv_int8, GXv_decimal12) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV21BarMaqCod = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV30BarVolmaq = GXv_int8[0] ;
                           recetadetinte01_wp_impl.this.AV17BarFacAbs = GXv_decimal12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
                           if ( GXutil.strcmp(AV13BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
                           {
                              GXv_char14[0] = AV5EmprCod ;
                              GXv_int13[0] = AV6Barcod ;
                              GXv_int6[0] = AV7Barcodreo ;
                              GXv_char4[0] = AV8Barcodpar ;
                              GXv_char3[0] = AV21BarMaqCod ;
                              GXv_int8[0] = AV30BarVolmaq ;
                              new app.pdyrp015(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_char3, GXv_int8) ;
                              recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                              recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                              recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                              recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                              recetadetinte01_wp_impl.this.AV21BarMaqCod = GXv_char3[0] ;
                              recetadetinte01_wp_impl.this.AV30BarVolmaq = GXv_int8[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                              httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
                           }
                           GXv_char14[0] = AV5EmprCod ;
                           GXv_int13[0] = AV6Barcod ;
                           GXv_int6[0] = AV7Barcodreo ;
                           GXv_char4[0] = AV8Barcodpar ;
                           GXv_char3[0] = AV89UsurCod ;
                           GXv_char2[0] = AV83Station ;
                           new app.pdyrp031(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
                           recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                           recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                           recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                           recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                           recetadetinte01_wp_impl.this.AV89UsurCod = GXv_char3[0] ;
                           recetadetinte01_wp_impl.this.AV83Station = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV83Station", AV83Station);
                           if ( GXutil.strcmp(AV13BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
                           {
                              GXv_char14[0] = AV5EmprCod ;
                              GXv_int13[0] = AV6Barcod ;
                              GXv_int6[0] = AV7Barcodreo ;
                              GXv_char4[0] = AV8Barcodpar ;
                              GXv_char3[0] = AV89UsurCod ;
                              GXv_char2[0] = AV83Station ;
                              new app.pdyrp032(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
                              recetadetinte01_wp_impl.this.AV5EmprCod = GXv_char14[0] ;
                              recetadetinte01_wp_impl.this.AV6Barcod = GXv_int13[0] ;
                              recetadetinte01_wp_impl.this.AV7Barcodreo = GXv_int6[0] ;
                              recetadetinte01_wp_impl.this.AV8Barcodpar = GXv_char4[0] ;
                              recetadetinte01_wp_impl.this.AV89UsurCod = GXv_char3[0] ;
                              recetadetinte01_wp_impl.this.AV83Station = GXv_char2[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
                              httpContext.ajax_rsp_assign_attri("", false, "AV89UsurCod", AV89UsurCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV83Station", AV83Station);
                           }
                           AV107ErrMensaje = httpContext.getMessage( "Proceso finalizado con exito!", "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV107ErrMensaje", AV107ErrMensaje);
                           httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar,Short.valueOf(AV73RecLinmaq),AV107ErrMensaje});
                           httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6Barcod","AV7Barcodreo","AV8Barcodpar","AV73RecLinmaq","AV107ErrMensaje"});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor H01FP6 */
      pr_default.execute(2, new Object[] {AV5EmprCod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H01FP6_A396EmprCod[0] ;
         A1652BarSerDsc = H01FP6_A1652BarSerDsc[0] ;
         A135BarColNom = H01FP6_A135BarColNom[0] ;
         A136BarColNum = H01FP6_A136BarColNum[0] ;
         A1234BarNomCli = H01FP6_A1234BarNomCli[0] ;
         A1235BarNumCli = H01FP6_A1235BarNumCli[0] ;
         A180BarMaqCod = H01FP6_A180BarMaqCod[0] ;
         A218BarTipCol = H01FP6_A218BarTipCol[0] ;
         A120BarAgrEst = H01FP6_A120BarAgrEst[0] ;
         A1909BarGraAca = H01FP6_A1909BarGraAca[0] ;
         A252CliCod = H01FP6_A252CliCod[0] ;
         n252CliCod = H01FP6_n252CliCod[0] ;
         A212BarSer = H01FP6_A212BarSer[0] ;
         A4908BarMacPro = H01FP6_A4908BarMacPro[0] ;
         A279CliNom = H01FP6_A279CliNom[0] ;
         A236BarVolMaq = H01FP6_A236BarVolMaq[0] ;
         A5053BarBp12 = H01FP6_A5053BarBp12[0] ;
         n5053BarBp12 = H01FP6_n5053BarBp12[0] ;
         A5054BarBp13 = H01FP6_A5054BarBp13[0] ;
         n5054BarBp13 = H01FP6_n5054BarBp13[0] ;
         A5055BarBp14 = H01FP6_A5055BarBp14[0] ;
         n5055BarBp14 = H01FP6_n5055BarBp14[0] ;
         A5056BarBp15 = H01FP6_A5056BarBp15[0] ;
         n5056BarBp15 = H01FP6_n5056BarBp15[0] ;
         A5057BarFacAbs = H01FP6_A5057BarFacAbs[0] ;
         n5057BarFacAbs = H01FP6_n5057BarFacAbs[0] ;
         A199BarPie1 = H01FP6_A199BarPie1[0] ;
         A365DisDes = H01FP6_A365DisDes[0] ;
         A898BarPieNDes = H01FP6_A898BarPieNDes[0] ;
         A220BarTotPie = H01FP6_A220BarTotPie[0] ;
         A184BarMtr = H01FP6_A184BarMtr[0] ;
         A870BarTotMtr = H01FP6_A870BarTotMtr[0] ;
         A166BarKgm = H01FP6_A166BarKgm[0] ;
         A219BarTotAgr = H01FP6_A219BarTotAgr[0] ;
         A130BarCodPar = H01FP6_A130BarCodPar[0] ;
         A132BarCodReo = H01FP6_A132BarCodReo[0] ;
         A129BarCod = H01FP6_A129BarCod[0] ;
         A279CliNom = H01FP6_A279CliNom[0] ;
         A220BarTotPie = H01FP6_A220BarTotPie[0] ;
         A870BarTotMtr = H01FP6_A870BarTotMtr[0] ;
         A219BarTotAgr = H01FP6_A219BarTotAgr[0] ;
         A199BarPie1 = H01FP6_A199BarPie1[0] ;
         A898BarPieNDes = H01FP6_A898BarPieNDes[0] ;
         A184BarMtr = H01FP6_A184BarMtr[0] ;
         A166BarKgm = H01FP6_A166BarKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         if ( A220BarTotPie != 0 )
         {
            A813RecTotPie = (int)(A220BarTotPie+A198BarPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A813RecTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A813RecTotPie), 5, 0));
         }
         else
         {
            A813RecTotPie = A198BarPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A813RecTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A813RecTotPie), 5, 0));
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A871RecTotMtr", GXutil.ltrimstr( A871RecTotMtr, 10, 2));
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "A871RecTotMtr", GXutil.ltrimstr( A871RecTotMtr, 10, 2));
         }
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         System.out.println( localUtil.format( DecimalUtil.doubleToDec(AV6Barcod), "ZZZZZZZ9") );
         AV136BarGraaca = (short)(0) ;
         AV92BarNHdr = A13696BarNHdr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92BarNHdr", AV92BarNHdr);
         AV27BarSerDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarSerDsc", AV27BarSerDsc);
         AV15Barcolnom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnom", AV15Barcolnom);
         AV16Barcolnum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Barcolnum), 6, 0));
         AV22BarNomcli = A1234BarNomCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22BarNomcli", AV22BarNomcli);
         AV23BarNumcli = A1235BarNumCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarNumcli), 6, 0));
         AV21BarMaqCod = A180BarMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarMaqCod", AV21BarMaqCod);
         AV29BarTipcol = A218BarTipCol ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29BarTipcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarTipcol), 2, 0));
         AV13BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarAgrEst", AV13BarAgrEst);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrEst, "@!"))));
         AV136BarGraaca = A1909BarGraAca ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int13[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_char3[0] = A135BarColNom ;
         GXv_int8[0] = A136BarColNum ;
         GXv_int6[0] = A218BarTipCol ;
         GXv_char2[0] = " " ;
         GXv_char15[0] = AV19BarMacProFormula ;
         new app.pdyrp024(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_char4, GXv_char3, GXv_int8, GXv_int6, GXv_char2, GXv_char15) ;
         recetadetinte01_wp_impl.this.A396EmprCod = GXv_char14[0] ;
         recetadetinte01_wp_impl.this.A252CliCod = GXv_int13[0] ;
         recetadetinte01_wp_impl.this.A212BarSer = GXv_char4[0] ;
         recetadetinte01_wp_impl.this.A135BarColNom = GXv_char3[0] ;
         recetadetinte01_wp_impl.this.A136BarColNum = GXv_int8[0] ;
         recetadetinte01_wp_impl.this.A218BarTipCol = GXv_int6[0] ;
         recetadetinte01_wp_impl.this.AV19BarMacProFormula = GXv_char15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarMacProFormula", AV19BarMacProFormula);
         GXv_char15[0] = A396EmprCod ;
         GXv_char14[0] = AV19BarMacProFormula ;
         GXv_char4[0] = AV53MacProdscformula ;
         new app.pdyrp025(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_char4) ;
         recetadetinte01_wp_impl.this.A396EmprCod = GXv_char15[0] ;
         recetadetinte01_wp_impl.this.AV19BarMacProFormula = GXv_char14[0] ;
         recetadetinte01_wp_impl.this.AV53MacProdscformula = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarMacProFormula", AV19BarMacProFormula);
         httpContext.ajax_rsp_assign_attri("", false, "AV53MacProdscformula", AV53MacProdscformula);
         AV18BarMacPro = ((AV37Cotexsur==0) ? AV19BarMacProFormula : A4908BarMacPro) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarMacPro", AV18BarMacPro);
         GXv_char15[0] = A396EmprCod ;
         GXv_char14[0] = AV18BarMacPro ;
         GXv_char4[0] = AV52MacProdsc ;
         new app.pdyrp025(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_char4) ;
         recetadetinte01_wp_impl.this.A396EmprCod = GXv_char15[0] ;
         recetadetinte01_wp_impl.this.AV18BarMacPro = GXv_char14[0] ;
         recetadetinte01_wp_impl.this.AV52MacProdsc = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarMacPro", AV18BarMacPro);
         httpContext.ajax_rsp_assign_attri("", false, "AV52MacProdsc", AV52MacProdsc);
         AV52MacProdsc = ((GXutil.strcmp("", AV18BarMacPro)==0) ? "" : AV52MacProdsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52MacProdsc", AV52MacProdsc);
         AV123Combo_BarMacPro2 = AV18BarMacPro ;
         AV31Cargar = (byte)(0) ;
         AV64oldBarMacpro = AV18BarMacPro ;
         AV34Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Clicod), 6, 0));
         AV35CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35CliNom", AV35CliNom);
         AV26Barser = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Barser", AV26Barser);
         /* Execute user subroutine: 'ARTICU' */
         S175 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'MAQUIN' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV30BarVolmaq = ((0==A236BarVolMaq) ? AV57MaqVolMed : A236BarVolMaq) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarVolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarVolmaq), 5, 0));
         AV75RecTotKgm = GXutil.roundDecimal( (A812RecTotKgm.divide(AV51lbvsKgs, 18, java.math.RoundingMode.DOWN)), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75RecTotKgm", GXutil.ltrimstr( AV75RecTotKgm, 10, 2));
         AV70Rb = ((AV75RecTotKgm.doubleValue()>0) ? DecimalUtil.doubleToDec(A236BarVolMaq).divide(AV75RecTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         if ( AV71RBaFor == 1 )
         {
            GXv_char15[0] = A396EmprCod ;
            GXv_int13[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char14[0] = A130BarCodPar ;
            GXv_decimal12[0] = AV70Rb ;
            new app.pdyrp026(remoteHandle, context).execute( GXv_char15, GXv_int13, GXv_int6, GXv_char14, GXv_decimal12) ;
            recetadetinte01_wp_impl.this.A396EmprCod = GXv_char15[0] ;
            recetadetinte01_wp_impl.this.A129BarCod = GXv_int13[0] ;
            recetadetinte01_wp_impl.this.A132BarCodReo = GXv_int6[0] ;
            recetadetinte01_wp_impl.this.A130BarCodPar = GXv_char14[0] ;
            recetadetinte01_wp_impl.this.AV70Rb = GXv_decimal12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         }
         AV70Rb = ((AV54MaqRelban>0) ? DecimalUtil.doubleToDec(AV54MaqRelban) : AV70Rb) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         AV70Rb = ((AV33Carvitin==1) ? DecimalUtil.doubleToDec(7) : AV70Rb) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Rb", GXutil.ltrimstr( AV70Rb, 7, 2));
         AV77RecTotMtr = A871RecTotMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77RecTotMtr", GXutil.ltrimstr( AV77RecTotMtr, 10, 2));
         AV79RecTotpie = A813RecTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79RecTotpie), 5, 0));
         AV76RecTotKgs = GXutil.roundDecimal( (A166BarKgm.divide(AV51lbvsKgs, 18, java.math.RoundingMode.DOWN)), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76RecTotKgs", GXutil.ltrimstr( AV76RecTotKgs, 10, 2));
         AV78RecTotMts = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78RecTotMts", GXutil.ltrimstr( AV78RecTotMts, 10, 2));
         AV24BarPie = A198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarPie), 6, 0));
         AV13BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarAgrEst", AV13BarAgrEst);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrEst, "@!"))));
         AV113BarBp12 = A5053BarBp12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113BarBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113BarBp12), 4, 0));
         AV114BarBp13 = A5054BarBp13 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114BarBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114BarBp13), 4, 0));
         AV115BarBp14 = A5055BarBp14 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115BarBp14", GXutil.ltrimstr( AV115BarBp14, 6, 3));
         AV116BarBp15 = A5056BarBp15 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116BarBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116BarBp15), 4, 0));
         AV18BarMacPro = A4908BarMacPro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarMacPro", AV18BarMacPro);
         AV17BarFacAbs = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A5057BarFacAbs)==0) ? AV118ArtFacAbs : A5057BarFacAbs) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarFacAbs", GXutil.ltrimstr( AV17BarFacAbs, 6, 2));
         AV127SDT_TRATAMIENTO_RECETAS_Item = (app.SdtSDT_TRATAMIENTO_RECETAS_Receta)new app.SdtSDT_TRATAMIENTO_RECETAS_Receta(remoteHandle, context);
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod( AV5EmprCod );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod( AV92BarNHdr );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo( AV7Barcodreo );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar( AV8Barcodpar );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom( AV40EmprNom );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod( AV34Clicod );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom( AV35CliNom );
         GXt_decimal16 = DecimalUtil.ZERO ;
         GXv_decimal12[0] = GXt_decimal16 ;
         new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal12) ;
         recetadetinte01_wp_impl.this.GXt_decimal16 = GXv_decimal12[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr( GXt_decimal16 );
         GXt_int7 = 0 ;
         GXv_int13[0] = GXt_int7 ;
         new app.get_barpie(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int13) ;
         recetadetinte01_wp_impl.this.GXt_int7 = GXv_int13[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie( GXt_int7 );
         GXt_decimal16 = DecimalUtil.ZERO ;
         GXv_decimal12[0] = GXt_decimal16 ;
         new app.get_barmtr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal12) ;
         recetadetinte01_wp_impl.this.GXt_decimal16 = GXv_decimal12[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr( GXt_decimal16 );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum( AV16Barcolnum );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom( AV15Barcolnom );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod( AV26Barser );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc( AV135Artdsc );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal( (short)(1) );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca( AV136BarGraaca );
         AV124SDT_TRATAMIENTO_RECETAS.add(AV127SDT_TRATAMIENTO_RECETAS_Item, 0);
         gx_BV48 = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Execute user subroutine: 'ARTGROUPDATA' */
      S182 ();
      if (returnInSub) return;
      AV124SDT_TRATAMIENTO_RECETAS.sort(httpContext.getMessage( "[BarTotAgr]", ""));
      gx_BV48 = true ;
   }

   public void S162( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV55Maquin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Maquin", GXutil.str( AV55Maquin, 1, 0));
      AV57MaqVolMed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57MaqVolMed), 5, 0));
      AV56MaqVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
      AV58MaqVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58MaqVolMin), 5, 0));
      AV54MaqRelban = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54MaqRelban", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54MaqRelban), 2, 0));
      AV101Maqdsc = "" ;
      if ( ! (GXutil.strcmp("", AV21BarMaqCod)==0) )
      {
         /* Using cursor H01FP7 */
         pr_default.execute(3, new Object[] {AV5EmprCod, AV21BarMaqCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A602MaqCod = H01FP7_A602MaqCod[0] ;
            A396EmprCod = H01FP7_A396EmprCod[0] ;
            A624MaqVolMed = H01FP7_A624MaqVolMed[0] ;
            n624MaqVolMed = H01FP7_n624MaqVolMed[0] ;
            A623MaqVolMax = H01FP7_A623MaqVolMax[0] ;
            n623MaqVolMax = H01FP7_n623MaqVolMax[0] ;
            A625MaqVolMin = H01FP7_A625MaqVolMin[0] ;
            n625MaqVolMin = H01FP7_n625MaqVolMin[0] ;
            A3599MaqRelBan = H01FP7_A3599MaqRelBan[0] ;
            n3599MaqRelBan = H01FP7_n3599MaqRelBan[0] ;
            A606MaqDsc = H01FP7_A606MaqDsc[0] ;
            n606MaqDsc = H01FP7_n606MaqDsc[0] ;
            AV57MaqVolMed = A624MaqVolMed ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57MaqVolMed), 5, 0));
            AV56MaqVolMax = A623MaqVolMax ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
            AV58MaqVolMin = A625MaqVolMin ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58MaqVolMin), 5, 0));
            AV54MaqRelban = A3599MaqRelBan ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54MaqRelban", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54MaqRelban), 2, 0));
            AV101Maqdsc = A606MaqDsc ;
            AV55Maquin = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Maquin", GXutil.str( AV55Maquin, 1, 0));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S175( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV118ArtFacAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118ArtFacAbs", GXutil.ltrimstr( AV118ArtFacAbs, 6, 2));
      /* Using cursor H01FP8 */
      pr_default.execute(4, new Object[] {AV5EmprCod, Integer.valueOf(AV34Clicod), AV26Barser});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = H01FP8_A65ArtCod[0] ;
         A252CliCod = H01FP8_A252CliCod[0] ;
         n252CliCod = H01FP8_n252CliCod[0] ;
         A396EmprCod = H01FP8_A396EmprCod[0] ;
         A69ArtDsc = H01FP8_A69ArtDsc[0] ;
         n69ArtDsc = H01FP8_n69ArtDsc[0] ;
         A2791ArtFacAbs = H01FP8_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = H01FP8_n2791ArtFacAbs[0] ;
         AV135Artdsc = A69ArtDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV135Artdsc", AV135Artdsc);
         AV118ArtFacAbs = A2791ArtFacAbs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118ArtFacAbs", GXutil.ltrimstr( AV118ArtFacAbs, 6, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S182( )
   {
      /* 'ARTGROUPDATA' Routine */
      returnInSub = false ;
      /* Using cursor H01FP9 */
      pr_default.execute(5, new Object[] {AV5EmprCod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = H01FP9_A130BarCodPar[0] ;
         A132BarCodReo = H01FP9_A132BarCodReo[0] ;
         A129BarCod = H01FP9_A129BarCod[0] ;
         A396EmprCod = H01FP9_A396EmprCod[0] ;
         A124BarAgrReo = H01FP9_A124BarAgrReo[0] ;
         A119BarAgrCod = H01FP9_A119BarAgrCod[0] ;
         A122BarAgrPar = H01FP9_A122BarAgrPar[0] ;
         A407EmprNom = H01FP9_A407EmprNom[0] ;
         n407EmprNom = H01FP9_n407EmprNom[0] ;
         A1508CliCodAgr = H01FP9_A1508CliCodAgr[0] ;
         A1512ColNumAgr = H01FP9_A1512ColNumAgr[0] ;
         A1510ColNomAgr = H01FP9_A1510ColNomAgr[0] ;
         A1245BarAgrSer = H01FP9_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = H01FP9_A1507BarAgrDsc[0] ;
         A407EmprNom = H01FP9_A407EmprNom[0] ;
         n407EmprNom = H01FP9_n407EmprNom[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item = (app.SdtSDT_TRATAMIENTO_RECETAS_Receta)new app.SdtSDT_TRATAMIENTO_RECETAS_Receta(remoteHandle, context);
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod( A396EmprCod );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)), "", "", "", "", "", "", "") );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo( A124BarAgrReo );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar( A122BarAgrPar );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom( A407EmprNom );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod( A1508CliCodAgr );
         GXt_char1 = "" ;
         GXv_char15[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A1508CliCodAgr, GXv_char15) ;
         recetadetinte01_wp_impl.this.GXt_char1 = GXv_char15[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom( GXt_char1 );
         GXt_decimal16 = DecimalUtil.ZERO ;
         GXv_decimal12[0] = GXt_decimal16 ;
         new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_decimal12) ;
         recetadetinte01_wp_impl.this.GXt_decimal16 = GXv_decimal12[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr( GXt_decimal16 );
         GXt_int7 = 0 ;
         GXv_int13[0] = GXt_int7 ;
         new app.get_barpie(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int13) ;
         recetadetinte01_wp_impl.this.GXt_int7 = GXv_int13[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie( GXt_int7 );
         GXt_decimal16 = DecimalUtil.ZERO ;
         GXv_decimal12[0] = GXt_decimal16 ;
         new app.get_barmtr(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_decimal12) ;
         recetadetinte01_wp_impl.this.GXt_decimal16 = GXv_decimal12[0] ;
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr( GXt_decimal16 );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum( A1512ColNumAgr );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom( A1510ColNomAgr );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod( A1245BarAgrSer );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc( A1507BarAgrDsc );
         AV137BarAgrCod = A119BarAgrCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV137BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137BarAgrCod), 8, 0));
         AV138BarAgrReo = A124BarAgrReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138BarAgrReo", GXutil.str( AV138BarAgrReo, 1, 0));
         AV139BarAgrPar = A122BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV139BarAgrPar", AV139BarAgrPar);
         AV136BarGraaca = (short)(0) ;
         /* Execute user subroutine: 'SEARCHGRM' */
         S198 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca( AV136BarGraaca );
         AV127SDT_TRATAMIENTO_RECETAS_Item.setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal( (short)(0) );
         AV124SDT_TRATAMIENTO_RECETAS.add(AV127SDT_TRATAMIENTO_RECETAS_Item, 0);
         gx_BV48 = true ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S198( )
   {
      /* 'SEARCHGRM' Routine */
      returnInSub = false ;
      /* Using cursor H01FP10 */
      pr_default.execute(6, new Object[] {AV5EmprCod, Integer.valueOf(AV137BarAgrCod), Byte.valueOf(AV138BarAgrReo), AV139BarAgrPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = H01FP10_A130BarCodPar[0] ;
         A132BarCodReo = H01FP10_A132BarCodReo[0] ;
         A129BarCod = H01FP10_A129BarCod[0] ;
         A396EmprCod = H01FP10_A396EmprCod[0] ;
         A1909BarGraAca = H01FP10_A1909BarGraAca[0] ;
         A1909BarGraAca = H01FP10_A1909BarGraAca[0] ;
         AV136BarGraaca = A1909BarGraAca ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void wb_table3_230_1FP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarmacpro_Internalname, tblTablemergedbarmacpro_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmacpro_Internalname, httpContext.getMessage( "MacroProceso", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmacpro_Internalname, GXutil.rtrim( AV18BarMacPro), GXutil.rtrim( localUtil.format( AV18BarMacPro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmacpro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmacpro_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_barmacpro_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_barmacpro_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_barmacpro_Internalname, sImgUrl, imgPrompt_barmacpro_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetadeTinte01_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_230_1FP2e( true) ;
      }
      else
      {
         wb_table3_230_1FP2e( false) ;
      }
   }

   public void wb_table2_170_1FP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV34Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34Clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV35CliNom), GXutil.rtrim( localUtil.format( AV35CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV26Barser), GXutil.rtrim( localUtil.format( AV26Barser, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV27BarSerDsc), GXutil.rtrim( localUtil.format( AV27BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV15Barcolnom), GXutil.rtrim( localUtil.format( AV15Barcolnom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,198);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16Barcolnum), "ZZZZZZ") : localUtil.format( DecimalUtil.doubleToDec(AV16Barcolnum), "ZZZZZZ"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,202);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV29BarTipcol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29BarTipcol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV29BarTipcol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV22BarNomcli), GXutil.rtrim( localUtil.format( AV22BarNomcli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,210);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumcli_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV23BarNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23BarNumcli), "ZZZZZZ") : localUtil.format( DecimalUtil.doubleToDec(AV23BarNumcli), "ZZZZZZ"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_170_1FP2e( true) ;
      }
      else
      {
         wb_table2_170_1FP2e( false) ;
      }
   }

   public void wb_table1_66_1FP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridsdt_tratamiento_recetasstabletotalizer_Internalname, tblGridsdt_tratamiento_recetasstabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname, httpContext.getMessage( "Tot Value Grid SDT_TRATAMIENTO_RECETASs_Bar Tot Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname, AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, GXutil.rtrim( localUtil.format( AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname, httpContext.getMessage( "Tot Value Grid SDT_TRATAMIENTO_RECETASs_Bar Tot Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname, AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie, GXutil.rtrim( localUtil.format( AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname, httpContext.getMessage( "Tot Value Grid SDT_TRATAMIENTO_RECETASs_Bar Tot Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname, AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, GXutil.rtrim( localUtil.format( AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_66_1FP2e( true) ;
      }
      else
      {
         wb_table1_66_1FP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      AV8Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
      AV73RecLinmaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73RecLinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73RecLinmaq), 4, 0));
      AV107ErrMensaje = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107ErrMensaje", AV107ErrMensaje);
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
      pa1FP2( ) ;
      ws1FP2( ) ;
      we1FP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415132078", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("recetadetinte01_wp.js", "?202682415132078", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_482( )
   {
      edtavSdt_tratamiento_recetas__emprcod_Internalname = "SDT_TRATAMIENTO_RECETAS__EMPRCOD_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barcod_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOD_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barcodreo_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCODREO_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barcodpar_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCODPAR_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__emprnom_Internalname = "SDT_TRATAMIENTO_RECETAS__EMPRNOM_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__clicod_Internalname = "SDT_TRATAMIENTO_RECETAS__CLICOD_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__clinom_Internalname = "SDT_TRATAMIENTO_RECETAS__CLINOM_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__bartotagr_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTAGR_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__bartotpie_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTPIE_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__bartotmtr_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTMTR_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barartcod_Internalname = "SDT_TRATAMIENTO_RECETAS__BARARTCOD_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barartdsc_Internalname = "SDT_TRATAMIENTO_RECETAS__BARARTDSC_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__bargraaca_Internalname = "SDT_TRATAMIENTO_RECETAS__BARGRAACA_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barcolnom_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOLNOM_"+sGXsfl_48_idx ;
      edtavSdt_tratamiento_recetas__barcolnum_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOLNUM_"+sGXsfl_48_idx ;
   }

   public void subsflControlProps_fel_482( )
   {
      edtavSdt_tratamiento_recetas__emprcod_Internalname = "SDT_TRATAMIENTO_RECETAS__EMPRCOD_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barcod_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOD_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barcodreo_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCODREO_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barcodpar_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCODPAR_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__emprnom_Internalname = "SDT_TRATAMIENTO_RECETAS__EMPRNOM_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__clicod_Internalname = "SDT_TRATAMIENTO_RECETAS__CLICOD_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__clinom_Internalname = "SDT_TRATAMIENTO_RECETAS__CLINOM_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__bartotagr_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTAGR_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__bartotpie_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTPIE_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__bartotmtr_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTMTR_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barartcod_Internalname = "SDT_TRATAMIENTO_RECETAS__BARARTCOD_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barartdsc_Internalname = "SDT_TRATAMIENTO_RECETAS__BARARTDSC_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__bargraaca_Internalname = "SDT_TRATAMIENTO_RECETAS__BARGRAACA_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barcolnom_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOLNOM_"+sGXsfl_48_fel_idx ;
      edtavSdt_tratamiento_recetas__barcolnum_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOLNUM_"+sGXsfl_48_fel_idx ;
   }

   public void sendrow_482( )
   {
      subsflControlProps_482( ) ;
      wb1FP0( ) ;
      if ( ( subGridsdt_tratamiento_recetass_Rows * 1 == 0 ) || ( nGXsfl_48_idx <= subgridsdt_tratamiento_recetass_fnc_recordsperpage( ) * 1 ) )
      {
         Gridsdt_tratamiento_recetassRow = GXWebRow.GetNew(context,Gridsdt_tratamiento_recetassContainer) ;
         if ( subGridsdt_tratamiento_recetass_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdt_tratamiento_recetass_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdt_tratamiento_recetass_Class, "") != 0 )
            {
               subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Odd" ;
            }
         }
         else if ( subGridsdt_tratamiento_recetass_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdt_tratamiento_recetass_Backstyle = (byte)(0) ;
            subGridsdt_tratamiento_recetass_Backcolor = subGridsdt_tratamiento_recetass_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdt_tratamiento_recetass_Class, "") != 0 )
            {
               subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Uniform" ;
            }
         }
         else if ( subGridsdt_tratamiento_recetass_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdt_tratamiento_recetass_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdt_tratamiento_recetass_Class, "") != 0 )
            {
               subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Odd" ;
            }
            subGridsdt_tratamiento_recetass_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdt_tratamiento_recetass_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdt_tratamiento_recetass_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_48_idx) % (2))) == 0 )
            {
               subGridsdt_tratamiento_recetass_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdt_tratamiento_recetass_Class, "") != 0 )
               {
                  subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Even" ;
               }
            }
            else
            {
               subGridsdt_tratamiento_recetass_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdt_tratamiento_recetass_Class, "") != 0 )
               {
                  subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Odd" ;
               }
            }
         }
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_48_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__emprcod_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod()),GXutil.rtrim( localUtil.format( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdt_tratamiento_recetas__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barcod_Internalname,((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__barcod_Columnclass,edtavSdt_tratamiento_recetas__barcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__barcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdt_tratamiento_recetas__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barcodpar_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdt_tratamiento_recetas__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__emprnom_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__emprnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdt_tratamiento_recetas__emprnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdt_tratamiento_recetas__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__clinom_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdt_tratamiento_recetas__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__bartotagr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__bartotagr_Enabled!=0) ? localUtil.format( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__bartotagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__bartotagr_Columnclass,edtavSdt_tratamiento_recetas__bartotagr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__bartotagr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__bartotpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie(), (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__bartotpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie()), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie()), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__bartotpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__bartotpie_Columnclass,edtavSdt_tratamiento_recetas__bartotpie_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__bartotpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__bartotmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__bartotmtr_Enabled!=0) ? localUtil.format( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__bartotmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__bartotmtr_Columnclass,edtavSdt_tratamiento_recetas__bartotmtr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__bartotmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barartcod_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barartcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__barartcod_Columnclass,edtavSdt_tratamiento_recetas__barartcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__barartcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barartdsc_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__barartdsc_Columnclass,edtavSdt_tratamiento_recetas__barartdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__barartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__bargraaca_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__bargraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__bargraaca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__bargraaca_Columnclass,edtavSdt_tratamiento_recetas__bargraaca_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__bargraaca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barcolnom_Internalname,GXutil.rtrim( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__barcolnom_Columnclass,edtavSdt_tratamiento_recetas__barcolnom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsdt_tratamiento_recetassRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdt_tratamiento_recetas__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdt_tratamiento_recetas__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDT_TRATAMIENTO_RECETAS_Receta)AV124SDT_TRATAMIENTO_RECETAS.elementAt(-1+AV142GXV1)).getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdt_tratamiento_recetas__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavSdt_tratamiento_recetas__barcolnum_Columnclass,edtavSdt_tratamiento_recetas__barcolnum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSdt_tratamiento_recetas__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1FP2( ) ;
         Gridsdt_tratamiento_recetassContainer.AddRow(Gridsdt_tratamiento_recetassRow);
         nGXsfl_48_idx = ((subGridsdt_tratamiento_recetass_Islastpage==1)&&(nGXsfl_48_idx+1>subgridsdt_tratamiento_recetass_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      /* End function sendrow_482 */
   }

   public void startgridcontrol48( )
   {
      if ( Gridsdt_tratamiento_recetassContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridsdt_tratamiento_recetassContainer"+"DivS\" data-gxgridid=\"48\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdt_tratamiento_recetass_Internalname, subGridsdt_tratamiento_recetass_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdt_tratamiento_recetass_Backcolorstyle == 0 )
         {
            subGridsdt_tratamiento_recetass_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdt_tratamiento_recetass_Class) > 0 )
            {
               subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Title" ;
            }
         }
         else
         {
            subGridsdt_tratamiento_recetass_Titlebackstyle = (byte)(1) ;
            if ( subGridsdt_tratamiento_recetass_Backcolorstyle == 1 )
            {
               subGridsdt_tratamiento_recetass_Titlebackcolor = subGridsdt_tratamiento_recetass_Allbackcolor ;
               if ( GXutil.len( subGridsdt_tratamiento_recetass_Class) > 0 )
               {
                  subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdt_tratamiento_recetass_Class) > 0 )
               {
                  subGridsdt_tratamiento_recetass_Linesclass = subGridsdt_tratamiento_recetass_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gr_m2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GridName", "Gridsdt_tratamiento_recetass");
      }
      else
      {
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("GridName", "Gridsdt_tratamiento_recetass");
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Header", subGridsdt_tratamiento_recetass_Header);
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("CmpContext", "");
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("InMasterPage", "false");
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barcod_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barcod_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__emprnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bartotagr_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bartotagr_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__bartotagr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bartotpie_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bartotpie_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__bartotpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bartotmtr_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bartotmtr_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__bartotmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barartcod_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barartcod_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barartcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barartdsc_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barartdsc_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bargraaca_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__bargraaca_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__bargraaca_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barcolnom_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barcolnom_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barcolnum_Columnclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSdt_tratamiento_recetas__barcolnum_Columnheaderclass));
         Gridsdt_tratamiento_recetassColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdt_tratamiento_recetas__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddColumnProperties(Gridsdt_tratamiento_recetassColumn);
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridsdt_tratamiento_recetassContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdt_tratamiento_recetass_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnprocesosquimicos_Internalname = "BTNPROCESOSQUIMICOS" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      edtavSdt_tratamiento_recetas__emprcod_Internalname = "SDT_TRATAMIENTO_RECETAS__EMPRCOD" ;
      edtavSdt_tratamiento_recetas__barcod_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOD" ;
      edtavSdt_tratamiento_recetas__barcodreo_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCODREO" ;
      edtavSdt_tratamiento_recetas__barcodpar_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCODPAR" ;
      edtavSdt_tratamiento_recetas__emprnom_Internalname = "SDT_TRATAMIENTO_RECETAS__EMPRNOM" ;
      edtavSdt_tratamiento_recetas__clicod_Internalname = "SDT_TRATAMIENTO_RECETAS__CLICOD" ;
      edtavSdt_tratamiento_recetas__clinom_Internalname = "SDT_TRATAMIENTO_RECETAS__CLINOM" ;
      edtavSdt_tratamiento_recetas__bartotagr_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTAGR" ;
      edtavSdt_tratamiento_recetas__bartotpie_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTPIE" ;
      edtavSdt_tratamiento_recetas__bartotmtr_Internalname = "SDT_TRATAMIENTO_RECETAS__BARTOTMTR" ;
      edtavSdt_tratamiento_recetas__barartcod_Internalname = "SDT_TRATAMIENTO_RECETAS__BARARTCOD" ;
      edtavSdt_tratamiento_recetas__barartdsc_Internalname = "SDT_TRATAMIENTO_RECETAS__BARARTDSC" ;
      edtavSdt_tratamiento_recetas__bargraaca_Internalname = "SDT_TRATAMIENTO_RECETAS__BARGRAACA" ;
      edtavSdt_tratamiento_recetas__barcolnom_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOLNOM" ;
      edtavSdt_tratamiento_recetas__barcolnum_Internalname = "SDT_TRATAMIENTO_RECETAS__BARCOLNUM" ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname = "vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR" ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname = "vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE" ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname = "vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR" ;
      tblGridsdt_tratamiento_recetasstabletotalizer_Internalname = "GRIDSDT_TRATAMIENTO_RECETASSTABLETOTALIZER" ;
      divGridsdt_tratamiento_recetasstablewithtotalizers_Internalname = "GRIDSDT_TRATAMIENTO_RECETASSTABLEWITHTOTALIZERS" ;
      divTablegrid_Internalname = "TABLEGRID" ;
      lblBarnhdr_Internalname = "BARNHDR" ;
      edtavRectotkgm_Internalname = "vRECTOTKGM" ;
      edtavRectotkgs_Internalname = "vRECTOTKGS" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      grpUnnamedgroup13_Internalname = "UNNAMEDGROUP13" ;
      edtavRectotmtr_Internalname = "vRECTOTMTR" ;
      edtavRectotmts_Internalname = "vRECTOTMTS" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      grpUnnamedgroup15_Internalname = "UNNAMEDGROUP15" ;
      edtavRectotpie_Internalname = "vRECTOTPIE" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
      grpUnnamedgroup17_Internalname = "UNNAMEDGROUP17" ;
      divTablevisibleaction_Internalname = "TABLEVISIBLEACTION" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTextblockcombo_barmaqcod_Internalname = "TEXTBLOCKCOMBO_BARMAQCOD" ;
      Combo_barmaqcod_Internalname = "COMBO_BARMAQCOD" ;
      divTablesplittedbarmaqcod_Internalname = "TABLESPLITTEDBARMAQCOD" ;
      edtavMaqvolmax_Internalname = "vMAQVOLMAX" ;
      divVolumen_Internalname = "VOLUMEN" ;
      edtavMaqvolmin_Internalname = "vMAQVOLMIN" ;
      edtavRb_Internalname = "vRB" ;
      edtavBarvolmaq_Internalname = "vBARVOLMAQ" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarnumcli_Internalname = "vBARNUMCLI" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      lblTextblockbarmacpro_Internalname = "TEXTBLOCKBARMACPRO" ;
      edtavBarmacpro_Internalname = "vBARMACPRO" ;
      imgPrompt_barmacpro_Internalname = "PROMPT_BARMACPRO" ;
      tblTablemergedbarmacpro_Internalname = "TABLEMERGEDBARMACPRO" ;
      divTablesplittedbarmacpro_Internalname = "TABLESPLITTEDBARMACPRO" ;
      edtavBarfacabs_Internalname = "vBARFACABS" ;
      edtavBarbp12_Internalname = "vBARBP12" ;
      edtavBarbp13_Internalname = "vBARBP13" ;
      edtavBarbp14_Internalname = "vBARBP14" ;
      edtavBarbp15_Internalname = "vBARBP15" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      divDvpanel_unnamedtable5_cell_Internalname = "DVPANEL_UNNAMEDTABLE5_CELL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavBarmaqcod_Internalname = "vBARMAQCOD" ;
      edtavRecetastinteprocesosquimicostojson_Internalname = "vRECETASTINTEPROCESOSQUIMICOSTOJSON" ;
      Gridsdt_tratamiento_recetass_empowerer_Internalname = "GRIDSDT_TRATAMIENTO_RECETASS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsdt_tratamiento_recetass_Internalname = "GRIDSDT_TRATAMIENTO_RECETASS" ;
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
      subGridsdt_tratamiento_recetass_Allowcollapsing = (byte)(0) ;
      subGridsdt_tratamiento_recetass_Allowselection = (byte)(0) ;
      subGridsdt_tratamiento_recetass_Header = "" ;
      edtavSdt_tratamiento_recetas__barcolnum_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barcolnum_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__barcolnum_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__barcolnum_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcolnom_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barcolnom_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__barcolnom_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__barcolnom_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bargraaca_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__bargraaca_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__bargraaca_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__bargraaca_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barartdsc_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barartdsc_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__barartdsc_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__barartdsc_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barartcod_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barartcod_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__barartcod_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__barartcod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bartotmtr_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__bartotmtr_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__bartotmtr_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__bartotmtr_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bartotpie_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__bartotpie_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__bartotpie_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__bartotpie_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bartotagr_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__bartotagr_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__bartotagr_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__bartotagr_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__clinom_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__clinom_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__clicod_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__clicod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__emprnom_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__emprnom_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcodpar_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barcodpar_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcodreo_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barcodreo_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcod_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__barcod_Columnheaderclass = "" ;
      edtavSdt_tratamiento_recetas__barcod_Columnclass = "WWColumn" ;
      edtavSdt_tratamiento_recetas__barcod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__emprcod_Jsonclick = "" ;
      edtavSdt_tratamiento_recetas__emprcod_Enabled = 0 ;
      subGridsdt_tratamiento_recetass_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
      subGridsdt_tratamiento_recetass_Backcolorstyle = (byte)(0) ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Jsonclick = "" ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled = 1 ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Jsonclick = "" ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled = 1 ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Jsonclick = "" ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled = 1 ;
      edtavBarnumcli_Jsonclick = "" ;
      edtavBarnumcli_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      imgPrompt_barmacpro_Link = "" ;
      edtavBarmacpro_Jsonclick = "" ;
      edtavBarmacpro_Enabled = 1 ;
      edtavSdt_tratamiento_recetas__barcolnum_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__barcolnom_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__bargraaca_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__barartdsc_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__barartcod_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__bartotmtr_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__bartotpie_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__bartotagr_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__clinom_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__clicod_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__emprnom_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__barcodpar_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__barcodreo_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__barcod_Enabled = -1 ;
      edtavSdt_tratamiento_recetas__emprcod_Enabled = -1 ;
      edtavRecetastinteprocesosquimicostojson_Visible = 1 ;
      edtavBarmaqcod_Jsonclick = "" ;
      edtavBarmaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable6_Height = 0 ;
      edtavBarbp15_Jsonclick = "" ;
      edtavBarbp15_Enabled = 1 ;
      edtavBarbp14_Jsonclick = "" ;
      edtavBarbp14_Enabled = 1 ;
      edtavBarbp13_Jsonclick = "" ;
      edtavBarbp13_Enabled = 1 ;
      edtavBarbp12_Jsonclick = "" ;
      edtavBarbp12_Enabled = 1 ;
      edtavBarfacabs_Jsonclick = "" ;
      edtavBarfacabs_Enabled = 1 ;
      divDvpanel_unnamedtable5_cell_Class = "col-xs-12" ;
      edtavBarvolmaq_Jsonclick = "" ;
      edtavBarvolmaq_Enabled = 1 ;
      edtavRb_Jsonclick = "" ;
      edtavRb_Enabled = 1 ;
      edtavMaqvolmin_Jsonclick = "" ;
      edtavMaqvolmin_Enabled = 1 ;
      edtavMaqvolmax_Jsonclick = "" ;
      edtavMaqvolmax_Enabled = 1 ;
      Combo_barmaqcod_Caption = "" ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 1 ;
      edtavRectotpie_Jsonclick = "" ;
      edtavRectotpie_Enabled = 1 ;
      edtavRectotmts_Jsonclick = "" ;
      edtavRectotmts_Enabled = 1 ;
      edtavRectotmtr_Jsonclick = "" ;
      edtavRectotmtr_Enabled = 1 ;
      edtavRectotkgs_Jsonclick = "" ;
      edtavRectotkgs_Enabled = 1 ;
      edtavRectotkgm_Jsonclick = "" ;
      edtavRectotkgm_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Centralizacion", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Informacion Color", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Maquina", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Combo_barmaqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_barmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Receta de Tinte", "") );
      subGridsdt_tratamiento_recetass_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nEOF'},{av:'subGridsdt_tratamiento_recetass_Rows',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'Rows'},{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnheaderclass'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:''},{av:'AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:''},{av:'AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:''}]}");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS.LOAD","{handler:'e181FP2',iparms:[{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48}]");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS.LOAD",",oparms:[{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnclass'}]}");
      setEventMetadata("'DOBARNHDR'","{handler:'e121FP2',iparms:[{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nEOF'},{av:'subGridsdt_tratamiento_recetass_Rows',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'Rows'},{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOBARNHDR'",",oparms:[{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnheaderclass'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:''},{av:'AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:''},{av:'AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131FP2',iparms:[{av:'AV107ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV73RecLinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOPROCESOSQUIMICOS'","{handler:'e151FP2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV26Barser',fld:'vBARSER',pic:''},{av:'AV15Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV16Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZZ'},{av:'AV29BarTipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV102RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:''}]");
      setEventMetadata("'DOPROCESOSQUIMICOS'",",oparms:[{av:'AV102RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:''},{av:'AV29BarTipcol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV16Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZZ'},{av:'AV15Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV26Barser',fld:'vBARSER',pic:''},{av:'AV34Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("COMBO_BARMAQCOD.ONOPTIONCLICKED","{handler:'e111FP2',iparms:[{av:'Combo_barmaqcod_Selectedvalue_get',ctrl:'COMBO_BARMAQCOD',prop:'SelectedValue_get'},{av:'AV55Maquin',fld:'vMAQUIN',pic:'9'},{av:'AV54MaqRelban',fld:'vMAQRELBAN',pic:'Z9'},{av:'AV70Rb',fld:'vRB',pic:'ZZZ9.99'},{av:'AV57MaqVolMed',fld:'vMAQVOLMED',pic:'ZZZZ9'},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV21BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("COMBO_BARMAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV21BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV70Rb',fld:'vRB',pic:'ZZZ9.99'},{av:'AV30BarVolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV55Maquin',fld:'vMAQUIN',pic:'9'},{av:'AV57MaqVolMed',fld:'vMAQVOLMED',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV58MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV54MaqRelban',fld:'vMAQRELBAN',pic:'Z9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e191FP2',iparms:[{av:'AV102RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18BarMacPro',fld:'vBARMACPRO',pic:''},{av:'AV55Maquin',fld:'vMAQUIN',pic:'9'},{av:'AV21BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'AV30BarVolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV58MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV17BarFacAbs',fld:'vBARFACABS',pic:'ZZ9.99'},{av:'AV113BarBp12',fld:'vBARBP12',pic:'ZZZ9'},{av:'AV114BarBp13',fld:'vBARBP13',pic:'ZZZ9'},{av:'AV115BarBp14',fld:'vBARBP14',pic:'Z9.999'},{av:'AV116BarBp15',fld:'vBARBP15',pic:'ZZZ9'},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV83Station',fld:'vSTATION',pic:''},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV89UsurCod',fld:'vUSURCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV73RecLinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV17BarFacAbs',fld:'vBARFACABS',pic:'ZZ9.99'},{av:'AV18BarMacPro',fld:'vBARMACPRO',pic:''},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30BarVolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV21BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'AV83Station',fld:'vSTATION',pic:''},{av:'AV89UsurCod',fld:'vUSURCOD',pic:''},{av:'AV107ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV55Maquin',fld:'vMAQUIN',pic:'9'},{av:'AV57MaqVolMed',fld:'vMAQVOLMED',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV58MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV54MaqRelban',fld:'vMAQRELBAN',pic:'Z9'}]}");
      setEventMetadata("ENTER","{handler:'e141FP2',iparms:[{av:'AV102RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18BarMacPro',fld:'vBARMACPRO',pic:''},{av:'AV55Maquin',fld:'vMAQUIN',pic:'9'},{av:'AV21BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'AV30BarVolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV58MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV17BarFacAbs',fld:'vBARFACABS',pic:'ZZ9.99'},{av:'AV113BarBp12',fld:'vBARBP12',pic:'ZZZ9'},{av:'AV114BarBp13',fld:'vBARBP13',pic:'ZZZ9'},{av:'AV115BarBp14',fld:'vBARBP14',pic:'Z9.999'},{av:'AV116BarBp15',fld:'vBARBP15',pic:'ZZZ9'},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV83Station',fld:'vSTATION',pic:''},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV89UsurCod',fld:'vUSURCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV73RecLinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV17BarFacAbs',fld:'vBARFACABS',pic:'ZZ9.99'},{av:'AV18BarMacPro',fld:'vBARMACPRO',pic:''},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30BarVolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV21BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'AV83Station',fld:'vSTATION',pic:''},{av:'AV89UsurCod',fld:'vUSURCOD',pic:''},{av:'AV107ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV55Maquin',fld:'vMAQUIN',pic:'9'},{av:'AV57MaqVolMed',fld:'vMAQVOLMED',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV58MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV54MaqRelban',fld:'vMAQRELBAN',pic:'Z9'}]}");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_FIRSTPAGE","{handler:'subgridsdt_tratamiento_recetass_firstpage',iparms:[{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nEOF'},{av:'subGridsdt_tratamiento_recetass_Rows',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'Rows'},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48}]");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_FIRSTPAGE",",oparms:[{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnheaderclass'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:''},{av:'AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:''},{av:'AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:''}]}");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_PREVPAGE","{handler:'subgridsdt_tratamiento_recetass_previouspage',iparms:[{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nEOF'},{av:'subGridsdt_tratamiento_recetass_Rows',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'Rows'},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48}]");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_PREVPAGE",",oparms:[{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnheaderclass'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:''},{av:'AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:''},{av:'AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:''}]}");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_NEXTPAGE","{handler:'subgridsdt_tratamiento_recetass_nextpage',iparms:[{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nEOF'},{av:'subGridsdt_tratamiento_recetass_Rows',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'Rows'},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48}]");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_NEXTPAGE",",oparms:[{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnheaderclass'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:''},{av:'AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:''},{av:'AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:''}]}");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_LASTPAGE","{handler:'subgridsdt_tratamiento_recetass_lastpage',iparms:[{av:'GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage'},{av:'GRIDSDT_TRATAMIENTO_RECETASS_nEOF'},{av:'subGridsdt_tratamiento_recetass_Rows',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'Rows'},{av:'AV120Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV75RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZZ.ZZ'},{av:'AV77RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZZ.ZZ'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV124SDT_TRATAMIENTO_RECETAS',fld:'vSDT_TRATAMIENTO_RECETAS',grid:48,pic:'',hsh:true},{av:'nGXsfl_48_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:48},{av:'nRC_GXsfl_48',ctrl:'GRIDSDT_TRATAMIENTO_RECETASS',prop:'GridRC',grid:48}]");
      setEventMetadata("GRIDSDT_TRATAMIENTO_RECETASS_LASTPAGE",",oparms:[{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTAGR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTPIE',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARTOTMTR',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTCOD',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARARTDSC',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARGRAACA',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'SDT_TRATAMIENTO_RECETAS__BARCOLNUM',prop:'Columnheaderclass'},{av:'AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:'ZZZZ9',hsh:true},{av:'AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTAGR',pic:''},{av:'AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTPIE',pic:''},{av:'AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr',fld:'vTOTVALUEGRIDSDT_TRATAMIENTO_RECETASS_BARTOTMTR',pic:''}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARSER","{handler:'validv_Barser',iparms:[]");
      setEventMetadata("VALIDV_BARSER",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOLNOM","{handler:'validv_Barcolnom',iparms:[]");
      setEventMetadata("VALIDV_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOLNUM","{handler:'validv_Barcolnum',iparms:[]");
      setEventMetadata("VALIDV_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALIDV_BARTIPCOL","{handler:'validv_Bartipcol',iparms:[]");
      setEventMetadata("VALIDV_BARTIPCOL",",oparms:[]}");
      setEventMetadata("VALIDV_BARMAQCOD","{handler:'validv_Barmaqcod',iparms:[]");
      setEventMetadata("VALIDV_BARMAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv16',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV8Barcodpar = "" ;
      Combo_barmaqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV8Barcodpar = "" ;
      AV107ErrMensaje = "" ;
      AV124SDT_TRATAMIENTO_RECETAS = new GXBaseCollection<app.SdtSDT_TRATAMIENTO_RECETAS_Receta>(app.SdtSDT_TRATAMIENTO_RECETAS_Receta.class, "Receta", "TexplusNET", remoteHandle);
      AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = DecimalUtil.ZERO ;
      AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = DecimalUtil.ZERO ;
      AV13BarAgrEst = "" ;
      AV75RecTotKgm = DecimalUtil.ZERO ;
      AV77RecTotMtr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV112DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV109BarMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV83Station = "" ;
      AV89UsurCod = "" ;
      Gx_msg = "" ;
      Combo_barmaqcod_Selectedvalue_set = "" ;
      Gridsdt_tratamiento_recetass_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnprocesosquimicos_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV92BarNHdr = "" ;
      Gridsdt_tratamiento_recetassContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblBarnhdr_Jsonclick = "" ;
      AV76RecTotKgs = DecimalUtil.ZERO ;
      AV78RecTotMts = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_barmaqcod_Jsonclick = "" ;
      ucCombo_barmaqcod = new com.genexus.webpanels.GXUserControl();
      AV70Rb = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTextblockbarmacpro_Jsonclick = "" ;
      AV17BarFacAbs = DecimalUtil.ZERO ;
      AV115BarBp14 = DecimalUtil.ZERO ;
      AV158Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV21BarMaqCod = "" ;
      AV102RecetasTinteProcesosQuimicosToJson = "" ;
      ucGridsdt_tratamiento_recetass_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr = "" ;
      AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie = "" ;
      AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr = "" ;
      AV35CliNom = "" ;
      AV26Barser = "" ;
      AV27BarSerDsc = "" ;
      AV15Barcolnom = "" ;
      AV22BarNomcli = "" ;
      AV18BarMacPro = "" ;
      hsh = "" ;
      AV40EmprNom = "" ;
      AV62Msg_sedomaster = "" ;
      AV51lbvsKgs = DecimalUtil.ZERO ;
      AV105RecetasTinteProcesosQuimicos_SDTs = new GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT>(app.SdtRecetasTinteProcesosQuimicos_SDT.class, "RecetasTinteProcesosQuimicos_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      H01FP2_A831TipColCod = new byte[1] ;
      H01FP2_A483ForColNum = new int[1] ;
      H01FP2_A482ForColNom = new String[] {""} ;
      H01FP2_A494ForSer = new String[] {""} ;
      H01FP2_A252CliCod = new int[1] ;
      H01FP2_n252CliCod = new boolean[] {false} ;
      H01FP2_A396EmprCod = new String[] {""} ;
      H01FP2_A764ProForCod = new String[] {""} ;
      H01FP2_A766ProForDsc = new String[] {""} ;
      H01FP2_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV104RecetasTinteProcesosQuimicos_SDT = new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV111MaquinaPrompt = "" ;
      imgMaquinaprompt_gximage = "" ;
      imgMaquinaprompt_Internalname = "" ;
      AV160Maquinaprompt_GXI = "" ;
      Gridsdt_tratamiento_recetassRow = new com.genexus.webpanels.GXWebRow();
      AV128SDT_TRATAMIENTO_RECETASItem = new app.SdtSDT_TRATAMIENTO_RECETAS_Receta(remoteHandle, context);
      H01FP3_A396EmprCod = new String[] {""} ;
      H01FP3_A607MaqEst = new String[] {""} ;
      H01FP3_n607MaqEst = new boolean[] {false} ;
      H01FP3_A623MaqVolMax = new int[1] ;
      H01FP3_n623MaqVolMax = new boolean[] {false} ;
      H01FP3_A602MaqCod = new String[] {""} ;
      H01FP3_A625MaqVolMin = new int[1] ;
      H01FP3_n625MaqVolMin = new boolean[] {false} ;
      H01FP3_A606MaqDsc = new String[] {""} ;
      H01FP3_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      AV110Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_int11 = new short[1] ;
      H01FP6_A396EmprCod = new String[] {""} ;
      H01FP6_A1652BarSerDsc = new String[] {""} ;
      H01FP6_A135BarColNom = new String[] {""} ;
      H01FP6_A136BarColNum = new int[1] ;
      H01FP6_A1234BarNomCli = new String[] {""} ;
      H01FP6_A1235BarNumCli = new int[1] ;
      H01FP6_A180BarMaqCod = new String[] {""} ;
      H01FP6_A218BarTipCol = new byte[1] ;
      H01FP6_A120BarAgrEst = new String[] {""} ;
      H01FP6_A1909BarGraAca = new short[1] ;
      H01FP6_A252CliCod = new int[1] ;
      H01FP6_n252CliCod = new boolean[] {false} ;
      H01FP6_A212BarSer = new String[] {""} ;
      H01FP6_A4908BarMacPro = new String[] {""} ;
      H01FP6_A279CliNom = new String[] {""} ;
      H01FP6_A236BarVolMaq = new int[1] ;
      H01FP6_A5053BarBp12 = new short[1] ;
      H01FP6_n5053BarBp12 = new boolean[] {false} ;
      H01FP6_A5054BarBp13 = new short[1] ;
      H01FP6_n5054BarBp13 = new boolean[] {false} ;
      H01FP6_A5055BarBp14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP6_n5055BarBp14 = new boolean[] {false} ;
      H01FP6_A5056BarBp15 = new short[1] ;
      H01FP6_n5056BarBp15 = new boolean[] {false} ;
      H01FP6_A5057BarFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP6_n5057BarFacAbs = new boolean[] {false} ;
      H01FP6_A199BarPie1 = new short[1] ;
      H01FP6_A365DisDes = new String[] {""} ;
      H01FP6_A898BarPieNDes = new int[1] ;
      H01FP6_A220BarTotPie = new int[1] ;
      H01FP6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP6_A130BarCodPar = new String[] {""} ;
      H01FP6_A132BarCodReo = new byte[1] ;
      H01FP6_A129BarCod = new int[1] ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A4908BarMacPro = "" ;
      A279CliNom = "" ;
      A5055BarBp14 = DecimalUtil.ZERO ;
      A5057BarFacAbs = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char2 = new String[1] ;
      AV19BarMacProFormula = "" ;
      AV53MacProdscformula = "" ;
      AV52MacProdsc = "" ;
      GXv_char4 = new String[1] ;
      AV123Combo_BarMacPro2 = "" ;
      AV64oldBarMacpro = "" ;
      GXv_int6 = new byte[1] ;
      GXv_char14 = new String[1] ;
      AV118ArtFacAbs = DecimalUtil.ZERO ;
      AV127SDT_TRATAMIENTO_RECETAS_Item = new app.SdtSDT_TRATAMIENTO_RECETAS_Receta(remoteHandle, context);
      AV135Artdsc = "" ;
      AV101Maqdsc = "" ;
      H01FP7_A602MaqCod = new String[] {""} ;
      H01FP7_A396EmprCod = new String[] {""} ;
      H01FP7_A624MaqVolMed = new int[1] ;
      H01FP7_n624MaqVolMed = new boolean[] {false} ;
      H01FP7_A623MaqVolMax = new int[1] ;
      H01FP7_n623MaqVolMax = new boolean[] {false} ;
      H01FP7_A625MaqVolMin = new int[1] ;
      H01FP7_n625MaqVolMin = new boolean[] {false} ;
      H01FP7_A3599MaqRelBan = new byte[1] ;
      H01FP7_n3599MaqRelBan = new boolean[] {false} ;
      H01FP7_A606MaqDsc = new String[] {""} ;
      H01FP7_n606MaqDsc = new boolean[] {false} ;
      H01FP8_A65ArtCod = new String[] {""} ;
      H01FP8_A252CliCod = new int[1] ;
      H01FP8_n252CliCod = new boolean[] {false} ;
      H01FP8_A396EmprCod = new String[] {""} ;
      H01FP8_A69ArtDsc = new String[] {""} ;
      H01FP8_n69ArtDsc = new boolean[] {false} ;
      H01FP8_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FP8_n2791ArtFacAbs = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      H01FP9_A130BarCodPar = new String[] {""} ;
      H01FP9_A132BarCodReo = new byte[1] ;
      H01FP9_A129BarCod = new int[1] ;
      H01FP9_A396EmprCod = new String[] {""} ;
      H01FP9_A124BarAgrReo = new byte[1] ;
      H01FP9_A119BarAgrCod = new int[1] ;
      H01FP9_A122BarAgrPar = new String[] {""} ;
      H01FP9_A407EmprNom = new String[] {""} ;
      H01FP9_n407EmprNom = new boolean[] {false} ;
      H01FP9_A1508CliCodAgr = new int[1] ;
      H01FP9_A1512ColNumAgr = new int[1] ;
      H01FP9_A1510ColNomAgr = new String[] {""} ;
      H01FP9_A1245BarAgrSer = new String[] {""} ;
      H01FP9_A1507BarAgrDsc = new String[] {""} ;
      A122BarAgrPar = "" ;
      A407EmprNom = "" ;
      A1510ColNomAgr = "" ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      GXt_char1 = "" ;
      GXv_char15 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXt_decimal16 = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV139BarAgrPar = "" ;
      H01FP10_A130BarCodPar = new String[] {""} ;
      H01FP10_A132BarCodReo = new byte[1] ;
      H01FP10_A129BarCod = new int[1] ;
      H01FP10_A396EmprCod = new String[] {""} ;
      H01FP10_A1909BarGraAca = new short[1] ;
      imgPrompt_barmacpro_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsdt_tratamiento_recetass_Linesclass = "" ;
      ROClassString = "" ;
      Gridsdt_tratamiento_recetassColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte01_wp__default(),
         new Object[] {
             new Object[] {
            H01FP2_A831TipColCod, H01FP2_A483ForColNum, H01FP2_A482ForColNom, H01FP2_A494ForSer, H01FP2_A252CliCod, H01FP2_A396EmprCod, H01FP2_A764ProForCod, H01FP2_A766ProForDsc, H01FP2_A1160ProForL
            }
            , new Object[] {
            H01FP3_A396EmprCod, H01FP3_A607MaqEst, H01FP3_n607MaqEst, H01FP3_A623MaqVolMax, H01FP3_n623MaqVolMax, H01FP3_A602MaqCod, H01FP3_A625MaqVolMin, H01FP3_n625MaqVolMin, H01FP3_A606MaqDsc, H01FP3_n606MaqDsc
            }
            , new Object[] {
            H01FP6_A396EmprCod, H01FP6_A1652BarSerDsc, H01FP6_A135BarColNom, H01FP6_A136BarColNum, H01FP6_A1234BarNomCli, H01FP6_A1235BarNumCli, H01FP6_A180BarMaqCod, H01FP6_A218BarTipCol, H01FP6_A120BarAgrEst, H01FP6_A1909BarGraAca,
            H01FP6_A252CliCod, H01FP6_n252CliCod, H01FP6_A212BarSer, H01FP6_A4908BarMacPro, H01FP6_A279CliNom, H01FP6_A236BarVolMaq, H01FP6_A5053BarBp12, H01FP6_n5053BarBp12, H01FP6_A5054BarBp13, H01FP6_n5054BarBp13,
            H01FP6_A5055BarBp14, H01FP6_n5055BarBp14, H01FP6_A5056BarBp15, H01FP6_n5056BarBp15, H01FP6_A5057BarFacAbs, H01FP6_n5057BarFacAbs, H01FP6_A199BarPie1, H01FP6_A365DisDes, H01FP6_A898BarPieNDes, H01FP6_A220BarTotPie,
            H01FP6_A184BarMtr, H01FP6_A870BarTotMtr, H01FP6_A166BarKgm, H01FP6_A219BarTotAgr, H01FP6_A130BarCodPar, H01FP6_A132BarCodReo, H01FP6_A129BarCod
            }
            , new Object[] {
            H01FP7_A602MaqCod, H01FP7_A396EmprCod, H01FP7_A624MaqVolMed, H01FP7_n624MaqVolMed, H01FP7_A623MaqVolMax, H01FP7_n623MaqVolMax, H01FP7_A625MaqVolMin, H01FP7_n625MaqVolMin, H01FP7_A3599MaqRelBan, H01FP7_n3599MaqRelBan,
            H01FP7_A606MaqDsc, H01FP7_n606MaqDsc
            }
            , new Object[] {
            H01FP8_A65ArtCod, H01FP8_A252CliCod, H01FP8_A396EmprCod, H01FP8_A69ArtDsc, H01FP8_n69ArtDsc, H01FP8_A2791ArtFacAbs, H01FP8_n2791ArtFacAbs
            }
            , new Object[] {
            H01FP9_A130BarCodPar, H01FP9_A132BarCodReo, H01FP9_A129BarCod, H01FP9_A396EmprCod, H01FP9_A124BarAgrReo, H01FP9_A119BarAgrCod, H01FP9_A122BarAgrPar, H01FP9_A407EmprNom, H01FP9_n407EmprNom, H01FP9_A1508CliCodAgr,
            H01FP9_A1512ColNumAgr, H01FP9_A1510ColNomAgr, H01FP9_A1245BarAgrSer, H01FP9_A1507BarAgrDsc
            }
            , new Object[] {
            H01FP10_A130BarCodPar, H01FP10_A132BarCodReo, H01FP10_A129BarCod, H01FP10_A396EmprCod, H01FP10_A1909BarGraAca
            }
         }
      );
      AV158Pgmname = "RecetadeTinte01_WP" ;
      /* GeneXus formulas. */
      AV158Pgmname = "RecetadeTinte01_WP" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__emprcod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcodreo_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcodpar_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__emprnom_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__clicod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__clinom_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bartotagr_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bartotpie_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bartotmtr_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barartcod_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barartdsc_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__bargraaca_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcolnom_Enabled = 0 ;
      edtavSdt_tratamiento_recetas__barcolnum_Enabled = 0 ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled = 0 ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled = 0 ;
      edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled = 0 ;
      edtavRectotkgm_Enabled = 0 ;
      edtavRectotkgs_Enabled = 0 ;
      edtavRectotmtr_Enabled = 0 ;
      edtavRectotmts_Enabled = 0 ;
      edtavRectotpie_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavMaqvolmax_Enabled = 0 ;
      edtavMaqvolmin_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarnumcli_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_barmacpro_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.numerodeprogramaautomataprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vBARMACPRO"+"'), id:'"+"vBARMACPRO"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMACPRODSC"+"'), id:'"+"vMACPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte wcpOAV7Barcodreo ;
   private byte GRIDSDT_TRATAMIENTO_RECETASS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7Barcodreo ;
   private byte gxajaxcallmode ;
   private byte AV55Maquin ;
   private byte AV54MaqRelban ;
   private byte A3599MaqRelBan ;
   private byte nDonePA ;
   private byte subGridsdt_tratamiento_recetass_Backcolorstyle ;
   private byte AV29BarTipcol ;
   private byte AV33Carvitin ;
   private byte AV41FlagAut ;
   private byte AV67ProductosCaderno ;
   private byte AV71RBaFor ;
   private byte AV65orgatex ;
   private byte AV37Cotexsur ;
   private byte AV39DscArt80 ;
   private byte GXt_int5 ;
   private byte A831TipColCod ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte AV31Cargar ;
   private byte GXv_int6[] ;
   private byte A124BarAgrReo ;
   private byte AV138BarAgrReo ;
   private byte nGXWrapped ;
   private byte subGridsdt_tratamiento_recetass_Backstyle ;
   private byte subGridsdt_tratamiento_recetass_Titlebackstyle ;
   private byte subGridsdt_tratamiento_recetass_Allowselection ;
   private byte subGridsdt_tratamiento_recetass_Allowhovering ;
   private byte subGridsdt_tratamiento_recetass_Allowcollapsing ;
   private byte subGridsdt_tratamiento_recetass_Collapsed ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV73RecLinmaq ;
   private short AV120Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV113BarBp12 ;
   private short AV114BarBp13 ;
   private short AV116BarBp15 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV91VarSleep ;
   private short AV117volumenmsg ;
   private short AV106Tabla_Lformu ;
   private short A1160ProForL ;
   private short AV119errNprograma ;
   private short GXv_int11[] ;
   private short A1909BarGraAca ;
   private short A5053BarBp12 ;
   private short A5054BarBp13 ;
   private short A5056BarBp15 ;
   private short A199BarPie1 ;
   private short AV136BarGraaca ;
   private int wcpOAV6Barcod ;
   private int nRC_GXsfl_48 ;
   private int subGridsdt_tratamiento_recetass_Rows ;
   private int AV6Barcod ;
   private int nGXsfl_48_idx=1 ;
   private int AV57MaqVolMed ;
   private int A624MaqVolMed ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int edtavBarnhdr_Enabled ;
   private int AV142GXV1 ;
   private int edtavRectotkgm_Enabled ;
   private int edtavRectotkgs_Enabled ;
   private int edtavRectotmtr_Enabled ;
   private int edtavRectotmts_Enabled ;
   private int AV79RecTotpie ;
   private int edtavRectotpie_Enabled ;
   private int AV24BarPie ;
   private int edtavBarpie_Enabled ;
   private int AV56MaqVolMax ;
   private int edtavMaqvolmax_Enabled ;
   private int AV58MaqVolMin ;
   private int edtavMaqvolmin_Enabled ;
   private int edtavRb_Enabled ;
   private int AV30BarVolmaq ;
   private int edtavBarvolmaq_Enabled ;
   private int edtavBarfacabs_Enabled ;
   private int edtavBarbp12_Enabled ;
   private int edtavBarbp13_Enabled ;
   private int edtavBarbp14_Enabled ;
   private int edtavBarbp15_Enabled ;
   private int divUnnamedtable6_Height ;
   private int edtavPgmname_Enabled ;
   private int edtavBarmaqcod_Visible ;
   private int edtavRecetastinteprocesosquimicostojson_Visible ;
   private int subGridsdt_tratamiento_recetass_Islastpage ;
   private int edtavSdt_tratamiento_recetas__emprcod_Enabled ;
   private int edtavSdt_tratamiento_recetas__barcod_Enabled ;
   private int edtavSdt_tratamiento_recetas__barcodreo_Enabled ;
   private int edtavSdt_tratamiento_recetas__barcodpar_Enabled ;
   private int edtavSdt_tratamiento_recetas__emprnom_Enabled ;
   private int edtavSdt_tratamiento_recetas__clicod_Enabled ;
   private int edtavSdt_tratamiento_recetas__clinom_Enabled ;
   private int edtavSdt_tratamiento_recetas__bartotagr_Enabled ;
   private int edtavSdt_tratamiento_recetas__bartotpie_Enabled ;
   private int edtavSdt_tratamiento_recetas__bartotmtr_Enabled ;
   private int edtavSdt_tratamiento_recetas__barartcod_Enabled ;
   private int edtavSdt_tratamiento_recetas__barartdsc_Enabled ;
   private int edtavSdt_tratamiento_recetas__bargraaca_Enabled ;
   private int edtavSdt_tratamiento_recetas__barcolnom_Enabled ;
   private int edtavSdt_tratamiento_recetas__barcolnum_Enabled ;
   private int edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Enabled ;
   private int edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Enabled ;
   private int edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarnumcli_Enabled ;
   private int GRIDSDT_TRATAMIENTO_RECETASS_nGridOutOfScope ;
   private int nGXsfl_48_fel_idx=1 ;
   private int AV34Clicod ;
   private int AV16Barcolnum ;
   private int AV23BarNumcli ;
   private int AV36ConversionLbvsKgs ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV161GXV17 ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A236BarVolMaq ;
   private int A898BarPieNDes ;
   private int A220BarTotPie ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int A813RecTotPie ;
   private int GXv_int8[] ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int GXt_int7 ;
   private int GXv_int13[] ;
   private int AV137BarAgrCod ;
   private int edtavBarmacpro_Enabled ;
   private int idxLst ;
   private int subGridsdt_tratamiento_recetass_Backcolor ;
   private int subGridsdt_tratamiento_recetass_Allbackcolor ;
   private int subGridsdt_tratamiento_recetass_Titlebackcolor ;
   private int subGridsdt_tratamiento_recetass_Selectedindex ;
   private int subGridsdt_tratamiento_recetass_Selectioncolor ;
   private int subGridsdt_tratamiento_recetass_Hoveringcolor ;
   private long GRIDSDT_TRATAMIENTO_RECETASS_nFirstRecordOnPage ;
   private long AV131TotGridSDT_TRATAMIENTO_RECETASs_BarTotPie ;
   private long GRIDSDT_TRATAMIENTO_RECETASS_nCurrentRecord ;
   private long GRIDSDT_TRATAMIENTO_RECETASS_nRecordCount ;
   private java.math.BigDecimal AV129TotGridSDT_TRATAMIENTO_RECETASs_BarTotAgr ;
   private java.math.BigDecimal AV133TotGridSDT_TRATAMIENTO_RECETASs_BarTotMtr ;
   private java.math.BigDecimal AV75RecTotKgm ;
   private java.math.BigDecimal AV77RecTotMtr ;
   private java.math.BigDecimal AV76RecTotKgs ;
   private java.math.BigDecimal AV78RecTotMts ;
   private java.math.BigDecimal AV70Rb ;
   private java.math.BigDecimal AV17BarFacAbs ;
   private java.math.BigDecimal AV115BarBp14 ;
   private java.math.BigDecimal AV51lbvsKgs ;
   private java.math.BigDecimal A5055BarBp14 ;
   private java.math.BigDecimal A5057BarFacAbs ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV118ArtFacAbs ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal GXt_decimal16 ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8Barcodpar ;
   private String Combo_barmaqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV8Barcodpar ;
   private String sGXsfl_48_idx="0001" ;
   private String AV13BarAgrEst ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV83Station ;
   private String AV89UsurCod ;
   private String Gx_msg ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Combo_barmaqcod_Cls ;
   private String Combo_barmaqcod_Selectedvalue_set ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Gridsdt_tratamiento_recetass_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnprocesosquimicos_Internalname ;
   private String bttBtnprocesosquimicos_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String AV92BarNHdr ;
   private String edtavBarnhdr_Jsonclick ;
   private String divTablegrid_Internalname ;
   private String divGridsdt_tratamiento_recetasstablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGridsdt_tratamiento_recetass_Internalname ;
   private String divTablevisibleaction_Internalname ;
   private String lblBarnhdr_Internalname ;
   private String lblBarnhdr_Jsonclick ;
   private String grpUnnamedgroup13_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtavRectotkgm_Internalname ;
   private String edtavRectotkgm_Jsonclick ;
   private String edtavRectotkgs_Internalname ;
   private String edtavRectotkgs_Jsonclick ;
   private String grpUnnamedgroup15_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtavRectotmtr_Internalname ;
   private String edtavRectotmtr_Jsonclick ;
   private String edtavRectotmts_Internalname ;
   private String edtavRectotmts_Jsonclick ;
   private String grpUnnamedgroup17_Internalname ;
   private String divUnnamedtable16_Internalname ;
   private String edtavRectotpie_Internalname ;
   private String edtavRectotpie_Jsonclick ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divTablesplittedbarmaqcod_Internalname ;
   private String lblTextblockcombo_barmaqcod_Internalname ;
   private String lblTextblockcombo_barmaqcod_Jsonclick ;
   private String Combo_barmaqcod_Caption ;
   private String Combo_barmaqcod_Internalname ;
   private String divVolumen_Internalname ;
   private String edtavMaqvolmax_Internalname ;
   private String edtavMaqvolmax_Jsonclick ;
   private String edtavMaqvolmin_Internalname ;
   private String edtavMaqvolmin_Jsonclick ;
   private String edtavRb_Internalname ;
   private String edtavRb_Jsonclick ;
   private String edtavBarvolmaq_Internalname ;
   private String edtavBarvolmaq_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divDvpanel_unnamedtable5_cell_Internalname ;
   private String divDvpanel_unnamedtable5_cell_Class ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divTablesplittedbarmacpro_Internalname ;
   private String lblTextblockbarmacpro_Internalname ;
   private String lblTextblockbarmacpro_Jsonclick ;
   private String edtavBarfacabs_Internalname ;
   private String edtavBarfacabs_Jsonclick ;
   private String edtavBarbp12_Internalname ;
   private String edtavBarbp12_Jsonclick ;
   private String edtavBarbp13_Internalname ;
   private String edtavBarbp13_Jsonclick ;
   private String edtavBarbp14_Internalname ;
   private String edtavBarbp14_Jsonclick ;
   private String edtavBarbp15_Internalname ;
   private String edtavBarbp15_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV158Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavBarmaqcod_Internalname ;
   private String AV21BarMaqCod ;
   private String edtavBarmaqcod_Jsonclick ;
   private String edtavRecetastinteprocesosquimicostojson_Internalname ;
   private String Gridsdt_tratamiento_recetass_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdt_tratamiento_recetas__emprcod_Internalname ;
   private String edtavSdt_tratamiento_recetas__barcod_Internalname ;
   private String edtavSdt_tratamiento_recetas__barcodreo_Internalname ;
   private String edtavSdt_tratamiento_recetas__barcodpar_Internalname ;
   private String edtavSdt_tratamiento_recetas__emprnom_Internalname ;
   private String edtavSdt_tratamiento_recetas__clicod_Internalname ;
   private String edtavSdt_tratamiento_recetas__clinom_Internalname ;
   private String edtavSdt_tratamiento_recetas__bartotagr_Internalname ;
   private String edtavSdt_tratamiento_recetas__bartotpie_Internalname ;
   private String edtavSdt_tratamiento_recetas__bartotmtr_Internalname ;
   private String edtavSdt_tratamiento_recetas__barartcod_Internalname ;
   private String edtavSdt_tratamiento_recetas__barartdsc_Internalname ;
   private String edtavSdt_tratamiento_recetas__bargraaca_Internalname ;
   private String edtavSdt_tratamiento_recetas__barcolnom_Internalname ;
   private String edtavSdt_tratamiento_recetas__barcolnum_Internalname ;
   private String edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Internalname ;
   private String edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Internalname ;
   private String edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClinom_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBartipcol_Internalname ;
   private String edtavBarnomcli_Internalname ;
   private String edtavBarnumcli_Internalname ;
   private String imgPrompt_barmacpro_Link ;
   private String imgPrompt_barmacpro_Internalname ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String AV35CliNom ;
   private String AV26Barser ;
   private String AV27BarSerDsc ;
   private String AV15Barcolnom ;
   private String AV22BarNomcli ;
   private String AV18BarMacPro ;
   private String edtavBarmacpro_Internalname ;
   private String hsh ;
   private String AV40EmprNom ;
   private String AV62Msg_sedomaster ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String imgMaquinaprompt_gximage ;
   private String imgMaquinaprompt_Internalname ;
   private String edtavSdt_tratamiento_recetas__barcod_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__bartotagr_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__bartotpie_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__bartotmtr_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__barartcod_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__barartdsc_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__bargraaca_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__barcolnom_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__barcolnum_Columnheaderclass ;
   private String edtavSdt_tratamiento_recetas__barcod_Columnclass ;
   private String edtavSdt_tratamiento_recetas__bartotagr_Columnclass ;
   private String edtavSdt_tratamiento_recetas__bartotpie_Columnclass ;
   private String edtavSdt_tratamiento_recetas__bartotmtr_Columnclass ;
   private String edtavSdt_tratamiento_recetas__barartcod_Columnclass ;
   private String edtavSdt_tratamiento_recetas__barartdsc_Columnclass ;
   private String edtavSdt_tratamiento_recetas__bargraaca_Columnclass ;
   private String edtavSdt_tratamiento_recetas__barcolnom_Columnclass ;
   private String edtavSdt_tratamiento_recetas__barcolnum_Columnclass ;
   private String A607MaqEst ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A4908BarMacPro ;
   private String A279CliNom ;
   private String A365DisDes ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV19BarMacProFormula ;
   private String AV53MacProdscformula ;
   private String AV52MacProdsc ;
   private String GXv_char4[] ;
   private String AV123Combo_BarMacPro2 ;
   private String AV64oldBarMacpro ;
   private String GXv_char14[] ;
   private String AV135Artdsc ;
   private String AV101Maqdsc ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A122BarAgrPar ;
   private String A407EmprNom ;
   private String A1510ColNomAgr ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String GXt_char1 ;
   private String GXv_char15[] ;
   private String AV139BarAgrPar ;
   private String tblTablemergedbarmacpro_Internalname ;
   private String edtavBarmacpro_Jsonclick ;
   private String imgPrompt_barmacpro_gximage ;
   private String sImgUrl ;
   private String tblUnnamedtable4_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Jsonclick ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarnumcli_Jsonclick ;
   private String tblGridsdt_tratamiento_recetasstabletotalizer_Internalname ;
   private String edtavTotvaluegridsdt_tratamiento_recetass_bartotagr_Jsonclick ;
   private String edtavTotvaluegridsdt_tratamiento_recetass_bartotpie_Jsonclick ;
   private String edtavTotvaluegridsdt_tratamiento_recetass_bartotmtr_Jsonclick ;
   private String subGridsdt_tratamiento_recetass_Class ;
   private String subGridsdt_tratamiento_recetass_Linesclass ;
   private String ROClassString ;
   private String edtavSdt_tratamiento_recetas__emprcod_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barcod_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barcodreo_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barcodpar_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__emprnom_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__clicod_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__clinom_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__bartotagr_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__bartotpie_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__bartotmtr_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barartcod_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barartdsc_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__bargraaca_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barcolnom_Jsonclick ;
   private String edtavSdt_tratamiento_recetas__barcolnum_Jsonclick ;
   private String subGridsdt_tratamiento_recetass_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Combo_barmaqcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_48_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private boolean n607MaqEst ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private boolean n606MaqDsc ;
   private boolean n5053BarBp12 ;
   private boolean n5054BarBp13 ;
   private boolean n5055BarBp14 ;
   private boolean n5056BarBp15 ;
   private boolean n5057BarFacAbs ;
   private boolean gx_BV48 ;
   private boolean n624MaqVolMed ;
   private boolean n3599MaqRelBan ;
   private boolean n69ArtDsc ;
   private boolean n2791ArtFacAbs ;
   private boolean n407EmprNom ;
   private String AV107ErrMensaje ;
   private String AV102RecetasTinteProcesosQuimicosToJson ;
   private String AV130TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotAgr ;
   private String AV132TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotPie ;
   private String AV134TotValueGridSDT_TRATAMIENTO_RECETASs_BarTotMtr ;
   private String AV160Maquinaprompt_GXI ;
   private String AV111MaquinaPrompt ;
   private com.genexus.webpanels.GXWebGrid Gridsdt_tratamiento_recetassContainer ;
   private com.genexus.webpanels.GXWebRow Gridsdt_tratamiento_recetassRow ;
   private com.genexus.webpanels.GXWebColumn Gridsdt_tratamiento_recetassColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucCombo_barmaqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridsdt_tratamiento_recetass_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] H01FP2_A831TipColCod ;
   private int[] H01FP2_A483ForColNum ;
   private String[] H01FP2_A482ForColNom ;
   private String[] H01FP2_A494ForSer ;
   private int[] H01FP2_A252CliCod ;
   private boolean[] H01FP2_n252CliCod ;
   private String[] H01FP2_A396EmprCod ;
   private String[] H01FP2_A764ProForCod ;
   private String[] H01FP2_A766ProForDsc ;
   private short[] H01FP2_A1160ProForL ;
   private String[] H01FP3_A396EmprCod ;
   private String[] H01FP3_A607MaqEst ;
   private boolean[] H01FP3_n607MaqEst ;
   private int[] H01FP3_A623MaqVolMax ;
   private boolean[] H01FP3_n623MaqVolMax ;
   private String[] H01FP3_A602MaqCod ;
   private int[] H01FP3_A625MaqVolMin ;
   private boolean[] H01FP3_n625MaqVolMin ;
   private String[] H01FP3_A606MaqDsc ;
   private boolean[] H01FP3_n606MaqDsc ;
   private String[] H01FP6_A396EmprCod ;
   private String[] H01FP6_A1652BarSerDsc ;
   private String[] H01FP6_A135BarColNom ;
   private int[] H01FP6_A136BarColNum ;
   private String[] H01FP6_A1234BarNomCli ;
   private int[] H01FP6_A1235BarNumCli ;
   private String[] H01FP6_A180BarMaqCod ;
   private byte[] H01FP6_A218BarTipCol ;
   private String[] H01FP6_A120BarAgrEst ;
   private short[] H01FP6_A1909BarGraAca ;
   private int[] H01FP6_A252CliCod ;
   private boolean[] H01FP6_n252CliCod ;
   private String[] H01FP6_A212BarSer ;
   private String[] H01FP6_A4908BarMacPro ;
   private String[] H01FP6_A279CliNom ;
   private int[] H01FP6_A236BarVolMaq ;
   private short[] H01FP6_A5053BarBp12 ;
   private boolean[] H01FP6_n5053BarBp12 ;
   private short[] H01FP6_A5054BarBp13 ;
   private boolean[] H01FP6_n5054BarBp13 ;
   private java.math.BigDecimal[] H01FP6_A5055BarBp14 ;
   private boolean[] H01FP6_n5055BarBp14 ;
   private short[] H01FP6_A5056BarBp15 ;
   private boolean[] H01FP6_n5056BarBp15 ;
   private java.math.BigDecimal[] H01FP6_A5057BarFacAbs ;
   private boolean[] H01FP6_n5057BarFacAbs ;
   private short[] H01FP6_A199BarPie1 ;
   private String[] H01FP6_A365DisDes ;
   private int[] H01FP6_A898BarPieNDes ;
   private int[] H01FP6_A220BarTotPie ;
   private java.math.BigDecimal[] H01FP6_A184BarMtr ;
   private java.math.BigDecimal[] H01FP6_A870BarTotMtr ;
   private java.math.BigDecimal[] H01FP6_A166BarKgm ;
   private java.math.BigDecimal[] H01FP6_A219BarTotAgr ;
   private String[] H01FP6_A130BarCodPar ;
   private byte[] H01FP6_A132BarCodReo ;
   private int[] H01FP6_A129BarCod ;
   private String[] H01FP7_A602MaqCod ;
   private String[] H01FP7_A396EmprCod ;
   private int[] H01FP7_A624MaqVolMed ;
   private boolean[] H01FP7_n624MaqVolMed ;
   private int[] H01FP7_A623MaqVolMax ;
   private boolean[] H01FP7_n623MaqVolMax ;
   private int[] H01FP7_A625MaqVolMin ;
   private boolean[] H01FP7_n625MaqVolMin ;
   private byte[] H01FP7_A3599MaqRelBan ;
   private boolean[] H01FP7_n3599MaqRelBan ;
   private String[] H01FP7_A606MaqDsc ;
   private boolean[] H01FP7_n606MaqDsc ;
   private String[] H01FP8_A65ArtCod ;
   private int[] H01FP8_A252CliCod ;
   private boolean[] H01FP8_n252CliCod ;
   private String[] H01FP8_A396EmprCod ;
   private String[] H01FP8_A69ArtDsc ;
   private boolean[] H01FP8_n69ArtDsc ;
   private java.math.BigDecimal[] H01FP8_A2791ArtFacAbs ;
   private boolean[] H01FP8_n2791ArtFacAbs ;
   private String[] H01FP9_A130BarCodPar ;
   private byte[] H01FP9_A132BarCodReo ;
   private int[] H01FP9_A129BarCod ;
   private String[] H01FP9_A396EmprCod ;
   private byte[] H01FP9_A124BarAgrReo ;
   private int[] H01FP9_A119BarAgrCod ;
   private String[] H01FP9_A122BarAgrPar ;
   private String[] H01FP9_A407EmprNom ;
   private boolean[] H01FP9_n407EmprNom ;
   private int[] H01FP9_A1508CliCodAgr ;
   private int[] H01FP9_A1512ColNumAgr ;
   private String[] H01FP9_A1510ColNomAgr ;
   private String[] H01FP9_A1245BarAgrSer ;
   private String[] H01FP9_A1507BarAgrDsc ;
   private String[] H01FP10_A130BarCodPar ;
   private byte[] H01FP10_A132BarCodReo ;
   private int[] H01FP10_A129BarCod ;
   private String[] H01FP10_A396EmprCod ;
   private short[] H01FP10_A1909BarGraAca ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT> AV105RecetasTinteProcesosQuimicos_SDTs ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV109BarMaqCod_Data ;
   private GXBaseCollection<app.SdtSDT_TRATAMIENTO_RECETAS_Receta> AV124SDT_TRATAMIENTO_RECETAS ;
   private app.SdtRecetasTinteProcesosQuimicos_SDT AV104RecetasTinteProcesosQuimicos_SDT ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV110Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV112DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.SdtSDT_TRATAMIENTO_RECETAS_Receta AV128SDT_TRATAMIENTO_RECETASItem ;
   private app.SdtSDT_TRATAMIENTO_RECETAS_Receta AV127SDT_TRATAMIENTO_RECETAS_Item ;
}

final  class recetadetinte01_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FP2", "SELECT T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T1.ProForCod, T2.ProForDsc, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FP3", "SELECT EmprCod, MaqEst, MaqVolMax, MaqCod, MaqVolMin, MaqDsc FROM TXPMAQUIN WHERE (MaqVolMax > 0) AND (MaqEst = 'A') ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FP6", "SELECT T1.EmprCod, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarMaqCod, T1.BarTipCol, T1.BarAgrEst, T1.BarGraAca, T1.CliCod, T1.BarSer, T1.BarMacPro, T2.CliNom, T1.BarVolMaq, T1.BarBp12, T1.BarBp13, T1.BarBp14, T1.BarBp15, T1.BarFacAbs, COALESCE( T4.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes, COALESCE( T3.BarTotPie, 0) AS BarTotPie, COALESCE( T4.BarMtr, 0) AS BarMtr, COALESCE( T3.BarTotMtr, 0) AS BarTotMtr, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr, SUM(PieAgr) AS BarTotPie FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01FP7", "SELECT MaqCod, EmprCod, MaqVolMed, MaqVolMax, MaqVolMin, MaqRelBan, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01FP8", "SELECT ArtCod, CliCod, EmprCod, ArtDsc, ArtFacAbs FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01FP9", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarAgrReo, T1.BarAgrCod, T1.BarAgrPar, T2.EmprNom, T1.CliCodAgr, T1.ColNumAgr, T1.ColNomAgr, T1.BarAgrSer, T1.BarAgrDsc FROM (TXPBARAGR T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FP10", "SELECT DISTINCT NULL AS BarCodPar, NULL AS BarCodReo, NULL AS BarCod, NULL AS EmprCod, BarGraAca FROM ( SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.BarGraAca FROM (TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) DistinctT ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,3);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(21);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[34])[0] = rslt.getString(29, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(30);
               ((int[]) buf[36])[0] = rslt.getInt(31);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

