package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_piezas_impl extends GXDataArea
{
   public documentodetransporteproduccion_piezas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_piezas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_piezas_impl.class ));
   }

   public documentodetransporteproduccion_piezas_impl( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Modo") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Modo") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Modo") ;
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
            AV57Modo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57Modo", AV57Modo);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Modo, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV36EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
               AV37MetTerCod = httpContext.GetPar( "MetTerCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37MetTerCod", AV37MetTerCod);
               AV38BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarCod), 8, 0));
               AV39BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodReo", GXutil.str( AV39BarCodReo, 1, 0));
               AV40BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40BarCodPar", AV40BarCodPar);
               AV41AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCod), 10, 0));
               AV42Pzs = (int)(GXutil.lval( httpContext.GetPar( "Pzs"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Pzs), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Pzs), "ZZZZZ9")));
               AV43Kgs = CommonUtil.decimalVal( httpContext.GetPar( "Kgs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43Kgs", GXutil.ltrimstr( AV43Kgs, 9, 2));
               AV44Mts = CommonUtil.decimalVal( httpContext.GetPar( "Mts"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Mts", GXutil.ltrimstr( AV44Mts, 9, 2));
               AV45MetPiectr = httpContext.GetPar( "MetPiectr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45MetPiectr", AV45MetPiectr);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MetPiectr, ""))));
               AV46Mensaje = httpContext.GetPar( "Mensaje") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
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
      nRC_GXsfl_108 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_108"))) ;
      nGXsfl_108_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_108_idx"))) ;
      sGXsfl_108_idx = httpContext.GetPar( "sGXsfl_108_idx") ;
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
      AV36EmprCod = httpContext.GetPar( "EmprCod") ;
      AV37MetTerCod = httpContext.GetPar( "MetTerCod") ;
      AV38BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV39BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV40BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV15TFMetPieCod = httpContext.GetPar( "TFMetPieCod") ;
      AV16TFMetPieCod_Sel = httpContext.GetPar( "TFMetPieCod_Sel") ;
      AV17TFMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil"), ".") ;
      AV18TFMetPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil_To"), ".") ;
      AV19TFMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet"), ".") ;
      AV20TFMetPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet_To"), ".") ;
      AV21TFMetPieAnc = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc"))) ;
      AV22TFMetPieAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc_To"))) ;
      AV23TFMetPieMtD = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMtD"), ".") ;
      AV24TFMetPieMtD_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMtD_To"), ".") ;
      AV25TFMetPiectr = httpContext.GetPar( "TFMetPiectr") ;
      AV26TFMetPiectr_Sel = httpContext.GetPar( "TFMetPiectr_Sel") ;
      AV60Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV52TotMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieKil"), ".") ;
      AV54TotMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieMet"), ".") ;
      AV45MetPiectr = httpContext.GetPar( "MetPiectr") ;
      AV57Modo = httpContext.GetPar( "Modo") ;
      AV42Pzs = (int)(GXutil.lval( httpContext.GetPar( "Pzs"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV15TFMetPieCod, AV16TFMetPieCod_Sel, AV17TFMetPieKil, AV18TFMetPieKil_To, AV19TFMetPieMet, AV20TFMetPieMet_To, AV21TFMetPieAnc, AV22TFMetPieAnc_To, AV23TFMetPieMtD, AV24TFMetPieMtD_To, AV25TFMetPiectr, AV26TFMetPiectr_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52TotMetPieKil, AV54TotMetPieMet, AV45MetPiectr, AV57Modo, AV42Pzs) ;
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
      pa2AQ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2AQ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57Modo)),GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV37MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV40BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV41AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV43Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV44Mts)),GXutil.URLEncode(GXutil.rtrim(AV45MetPiectr)),GXutil.URLEncode(GXutil.rtrim(AV46Mensaje))}, new String[] {"Modo","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProCod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV52TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV54TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Modo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Pzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MetPiectr, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_Piezas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_piezas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_108", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_108, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV29GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV30GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIECOD", GXutil.rtrim( AV15TFMetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIECOD_SEL", GXutil.rtrim( AV16TFMetPieCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV17TFMetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV18TFMetPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV19TFMetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV20TFMetPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEANC", GXutil.ltrim( localUtil.ntoc( AV21TFMetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEANC_TO", GXutil.ltrim( localUtil.ntoc( AV22TFMetPieAnc_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEMTD", GXutil.ltrim( localUtil.ntoc( AV23TFMetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIEMTD_TO", GXutil.ltrim( localUtil.ntoc( AV24TFMetPieMtD_To, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIECTR", GXutil.rtrim( AV25TFMetPiectr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETPIECTR_SEL", GXutil.rtrim( AV26TFMetPiectr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV36EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "METTERCOD", GXutil.rtrim( A2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETTERCOD", GXutil.rtrim( AV37MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV52TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV52TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV54TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV54TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIECTR", GXutil.rtrim( AV45MetPiectr));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MetPiectr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV46Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
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
         we2AQ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2AQ2( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57Modo)),GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV37MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV40BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV41AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV43Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV44Mts)),GXutil.URLEncode(GXutil.rtrim(AV45MetPiectr)),GXutil.URLEncode(GXutil.rtrim(AV46Mensaje))}, new String[] {"Modo","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProCod","Pzs","Kgs","Mts","MetPiectr","Mensaje"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Piezas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla LMETPI", "") ;
   }

   public void wb2AQ0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV41AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "N OS", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV38BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV38BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV39BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV39BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV40BarCodPar), GXutil.rtrim( localUtil.format( AV40BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavModo_Internalname, httpContext.getMessage( "Mode", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModo_Internalname, GXutil.rtrim( AV57Modo), GXutil.rtrim( localUtil.format( AV57Modo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPzs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPzs_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPzs_Internalname, GXutil.ltrim( localUtil.ntoc( AV42Pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42Pzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42Pzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKgs_Internalname, httpContext.getMessage( "Kgs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV43Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKgs_Enabled!=0) ? localUtil.format( AV43Kgs, "ZZZZZ9.99") : localUtil.format( AV43Kgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMts_Internalname, httpContext.getMessage( "Mts", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMts_Internalname, GXutil.ltrim( localUtil.ntoc( AV44Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMts_Enabled!=0) ? localUtil.format( AV44Mts, "ZZZZZ9.99") : localUtil.format( AV44Mts, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiecod_Internalname, httpContext.getMessage( "Pieza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiecod_Internalname, GXutil.rtrim( AV31MetPieCod), GXutil.rtrim( localUtil.format( AV31MetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiecod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiekil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV32MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpiekil_Enabled!=0) ? localUtil.format( AV32MetPieKil, "ZZZZZ9.99") : localUtil.format( AV32MetPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiemet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV33MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpiemet_Enabled!=0) ? localUtil.format( AV33MetPieMet, "ZZZZZ9.99") : localUtil.format( AV33MetPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpieanc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpieanc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpieanc_Internalname, GXutil.ltrim( localUtil.ntoc( AV34MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpieanc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34MetPieAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpieanc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpieanc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiemtd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiemtd_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiemtd_Internalname, GXutil.ltrim( localUtil.ntoc( AV35MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpiemtd_Enabled!=0) ? localUtil.format( AV35MetPieMtD, "ZZZZ9.99") : localUtil.format( AV35MetPieMtD, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiemtd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiemtd_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
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
         wb_table1_80_2AQ2( true) ;
      }
      else
      {
         wb_table1_80_2AQ2( false) ;
      }
      return  ;
   }

   public void wb_table1_80_2AQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 108, 3, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 108, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnetiqueta_Internalname, "gx.evt.setGridEvt("+GXutil.str( 108, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir Etiqueta", ""), bttBtnetiqueta_Jsonclick, 5, httpContext.getMessage( "Imprimir Etiqueta", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOETIQUETA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirtodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 108, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir TODAS", ""), bttBtnimprimirtodas_Jsonclick, 5, httpContext.getMessage( "Imprimir TODAS", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIRTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
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
         startgridcontrol108( ) ;
      }
      if ( wbEnd == 108 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_108 = (int)(nGXsfl_108_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_118_2AQ2( true) ;
      }
      else
      {
         wb_table2_118_2AQ2( false) ;
      }
      return  ;
   }

   public void wb_table2_118_2AQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV29GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV30GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV60Pgmname), GXutil.rtrim( localUtil.format( AV60Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table3_147_2AQ2( true) ;
      }
      else
      {
         wb_table3_147_2AQ2( false) ;
      }
      return  ;
   }

   public void wb_table3_147_2AQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 108 )
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

   public void start2AQ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Tabla LMETPI", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2AQ0( ) ;
   }

   public void ws2AQ2( )
   {
      start2AQ2( ) ;
      evt2AQ2( ) ;
   }

   public void evt2AQ2( )
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
                           e112AQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122AQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132AQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142AQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152AQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOETIQUETA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEtiqueta' */
                           e162AQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIRTODAS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimirTodas' */
                           e172AQ2 ();
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
                                 e182AQ2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VMETPIECOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192AQ2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_108_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1082( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV56GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActionGroup1), 4, 0));
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
                           A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
                           A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
                           A10780MetPiectr = httpContext.cgiGet( edtMetPiectr_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202AQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212AQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222AQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232AQ2 ();
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

   public void we2AQ2( )
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

   public void pa2AQ2( )
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
            GX_FocusControl = edtavMetpiecod_Internalname ;
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
      subsflControlProps_1082( ) ;
      while ( nGXsfl_108_idx <= nRC_GXsfl_108 )
      {
         sendrow_1082( ) ;
         nGXsfl_108_idx = ((subGrid_Islastpage==1)&&(nGXsfl_108_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_108_idx+1) ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1082( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV36EmprCod ,
                                 String AV37MetTerCod ,
                                 int AV38BarCod ,
                                 byte AV39BarCodReo ,
                                 String AV40BarCodPar ,
                                 String AV15TFMetPieCod ,
                                 String AV16TFMetPieCod_Sel ,
                                 java.math.BigDecimal AV17TFMetPieKil ,
                                 java.math.BigDecimal AV18TFMetPieKil_To ,
                                 java.math.BigDecimal AV19TFMetPieMet ,
                                 java.math.BigDecimal AV20TFMetPieMet_To ,
                                 short AV21TFMetPieAnc ,
                                 short AV22TFMetPieAnc_To ,
                                 java.math.BigDecimal AV23TFMetPieMtD ,
                                 java.math.BigDecimal AV24TFMetPieMtD_To ,
                                 String AV25TFMetPiectr ,
                                 String AV26TFMetPiectr_Sel ,
                                 String AV60Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV52TotMetPieKil ,
                                 java.math.BigDecimal AV54TotMetPieMet ,
                                 String AV45MetPiectr ,
                                 String AV57Modo ,
                                 int AV42Pzs )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212AQ2 ();
      GRID_nCurrentRecord = 0 ;
      rf2AQ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_Piezas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_piezas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2AQ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV60Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Piezas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Enabled), 5, 0), true);
      edtavKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Enabled), 5, 0), true);
      edtavMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Enabled), 5, 0), true);
      edtavTotvaluemetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiecod_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(108) ;
      /* Execute user event: Refresh */
      e212AQ2 ();
      nGXsfl_108_idx = 1 ;
      sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1082( ) ;
      bGXsfl_108_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_1082( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                              AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                              AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                              AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                              AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                              AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                              Short.valueOf(AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) ,
                                              Short.valueOf(AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) ,
                                              AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                              AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                              AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                              AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                              A2813MetPieCod ,
                                              A2814MetPieKil ,
                                              A2815MetPieMet ,
                                              Short.valueOf(A6635MetPieAnc) ,
                                              A4910MetPieMtD ,
                                              A10780MetPiectr ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV36EmprCod ,
                                              AV37MetTerCod ,
                                              Integer.valueOf(AV38BarCod) ,
                                              Byte.valueOf(AV39BarCodReo) ,
                                              AV40BarCodPar ,
                                              A396EmprCod ,
                                              A2809MetTerCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod), 9, "%") ;
         lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = GXutil.padr( GXutil.rtrim( AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr), 40, "%") ;
         /* Using cursor H02AQ2 */
         pr_default.execute(0, new Object[] {AV36EmprCod, AV37MetTerCod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV40BarCodPar, lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod, AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel, AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil, AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to, AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet, AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to, Short.valueOf(AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc), Short.valueOf(AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to), AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd, AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to, lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr, AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_108_idx = 1 ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1082( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02AQ2_A396EmprCod[0] ;
            A2809MetTerCod = H02AQ2_A2809MetTerCod[0] ;
            A129BarCod = H02AQ2_A129BarCod[0] ;
            A132BarCodReo = H02AQ2_A132BarCodReo[0] ;
            A130BarCodPar = H02AQ2_A130BarCodPar[0] ;
            A10780MetPiectr = H02AQ2_A10780MetPiectr[0] ;
            A4910MetPieMtD = H02AQ2_A4910MetPieMtD[0] ;
            A6635MetPieAnc = H02AQ2_A6635MetPieAnc[0] ;
            A2815MetPieMet = H02AQ2_A2815MetPieMet[0] ;
            A2814MetPieKil = H02AQ2_A2814MetPieKil[0] ;
            A2813MetPieCod = H02AQ2_A2813MetPieCod[0] ;
            e222AQ2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(108) ;
         wb2AQ0( ) ;
      }
      bGXsfl_108_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2AQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV52TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV52TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV54TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV54TotMetPieMet, "ZZZZZ9.99")));
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
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                           AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                           AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                           AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                           AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                           AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                           Short.valueOf(AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) ,
                                           Short.valueOf(AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           A10780MetPiectr ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV36EmprCod ,
                                           AV37MetTerCod ,
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV40BarCodPar ,
                                           A396EmprCod ,
                                           A2809MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod), 9, "%") ;
      lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = GXutil.padr( GXutil.rtrim( AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr), 40, "%") ;
      /* Using cursor H02AQ3 */
      pr_default.execute(1, new Object[] {AV36EmprCod, AV37MetTerCod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV40BarCodPar, lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod, AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel, AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil, AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to, AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet, AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to, Short.valueOf(AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc), Short.valueOf(AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to), AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd, AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to, lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr, AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel});
      GRID_nRecordCount = H02AQ3_AGRID_nRecordCount[0] ;
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
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV15TFMetPieCod, AV16TFMetPieCod_Sel, AV17TFMetPieKil, AV18TFMetPieKil_To, AV19TFMetPieMet, AV20TFMetPieMet_To, AV21TFMetPieAnc, AV22TFMetPieAnc_To, AV23TFMetPieMtD, AV24TFMetPieMtD_To, AV25TFMetPiectr, AV26TFMetPiectr_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52TotMetPieKil, AV54TotMetPieMet, AV45MetPiectr, AV57Modo, AV42Pzs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV15TFMetPieCod, AV16TFMetPieCod_Sel, AV17TFMetPieKil, AV18TFMetPieKil_To, AV19TFMetPieMet, AV20TFMetPieMet_To, AV21TFMetPieAnc, AV22TFMetPieAnc_To, AV23TFMetPieMtD, AV24TFMetPieMtD_To, AV25TFMetPiectr, AV26TFMetPiectr_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52TotMetPieKil, AV54TotMetPieMet, AV45MetPiectr, AV57Modo, AV42Pzs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV15TFMetPieCod, AV16TFMetPieCod_Sel, AV17TFMetPieKil, AV18TFMetPieKil_To, AV19TFMetPieMet, AV20TFMetPieMet_To, AV21TFMetPieAnc, AV22TFMetPieAnc_To, AV23TFMetPieMtD, AV24TFMetPieMtD_To, AV25TFMetPiectr, AV26TFMetPiectr_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52TotMetPieKil, AV54TotMetPieMet, AV45MetPiectr, AV57Modo, AV42Pzs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV15TFMetPieCod, AV16TFMetPieCod_Sel, AV17TFMetPieKil, AV18TFMetPieKil_To, AV19TFMetPieMet, AV20TFMetPieMet_To, AV21TFMetPieAnc, AV22TFMetPieAnc_To, AV23TFMetPieMtD, AV24TFMetPieMtD_To, AV25TFMetPiectr, AV26TFMetPiectr_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52TotMetPieKil, AV54TotMetPieMet, AV45MetPiectr, AV57Modo, AV42Pzs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV15TFMetPieCod, AV16TFMetPieCod_Sel, AV17TFMetPieKil, AV18TFMetPieKil_To, AV19TFMetPieMet, AV20TFMetPieMet_To, AV21TFMetPieAnc, AV22TFMetPieAnc_To, AV23TFMetPieMtD, AV24TFMetPieMtD_To, AV25TFMetPiectr, AV26TFMetPiectr_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV52TotMetPieKil, AV54TotMetPieMet, AV45MetPiectr, AV57Modo, AV42Pzs) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV60Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Piezas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPzs_Enabled), 5, 0), true);
      edtavKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgs_Enabled), 5, 0), true);
      edtavMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMts_Enabled), 5, 0), true);
      edtavTotvaluemetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiecod_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202AQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV27DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_108 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_108"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV30GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV31MetPieCod = httpContext.cgiGet( edtavMetpiecod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31MetPieCod", AV31MetPieCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEKIL");
            GX_FocusControl = edtavMetpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32MetPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32MetPieKil", GXutil.ltrimstr( AV32MetPieKil, 9, 2));
         }
         else
         {
            AV32MetPieKil = localUtil.ctond( httpContext.cgiGet( edtavMetpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32MetPieKil", GXutil.ltrimstr( AV32MetPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEMET");
            GX_FocusControl = edtavMetpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33MetPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33MetPieMet", GXutil.ltrimstr( AV33MetPieMet, 9, 2));
         }
         else
         {
            AV33MetPieMet = localUtil.ctond( httpContext.cgiGet( edtavMetpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33MetPieMet", GXutil.ltrimstr( AV33MetPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMetpieanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMetpieanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEANC");
            GX_FocusControl = edtavMetpieanc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34MetPieAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MetPieAnc), 3, 0));
         }
         else
         {
            AV34MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtavMetpieanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MetPieAnc), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEMTD");
            GX_FocusControl = edtavMetpiemtd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35MetPieMtD = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35MetPieMtD", GXutil.ltrimstr( AV35MetPieMtD, 8, 2));
         }
         else
         {
            AV35MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35MetPieMtD", GXutil.ltrimstr( AV35MetPieMtD, 8, 2));
         }
         AV51TotValueMetPieCod = httpContext.cgiGet( edtavTotvaluemetpiecod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51TotValueMetPieCod", AV51TotValueMetPieCod);
         AV53TotValueMetPieKil = httpContext.cgiGet( edtavTotvaluemetpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TotValueMetPieKil", AV53TotValueMetPieKil);
         AV55TotValueMetPieMet = httpContext.cgiGet( edtavTotvaluemetpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55TotValueMetPieMet", AV55TotValueMetPieMet);
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_Piezas");
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_piezas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e202AQ2 ();
      if (returnInSub) return;
   }

   public void e202AQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV47Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_piezas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47Station = GXt_char1 ;
      GXv_char2[0] = AV36EmprCod ;
      GXv_char3[0] = AV48EmprNom ;
      GXv_char4[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_piezas_impl.this.AV36EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV48EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV49UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Tabla LMETPI", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV27DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV27DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GX_FocusControl = edtavMetpiecod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
   }

   public void e212AQ2( )
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
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV29GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GridCurrentPage), 10, 0));
      AV30GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112AQ2( )
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
         AV28PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV28PageToGo) ;
      }
   }

   public void e122AQ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132AQ2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieCod") == 0 )
         {
            AV15TFMetPieCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFMetPieCod", AV15TFMetPieCod);
            AV16TFMetPieCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFMetPieCod_Sel", AV16TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieKil") == 0 )
         {
            AV17TFMetPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFMetPieKil", GXutil.ltrimstr( AV17TFMetPieKil, 9, 2));
            AV18TFMetPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFMetPieKil_To", GXutil.ltrimstr( AV18TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMet") == 0 )
         {
            AV19TFMetPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFMetPieMet", GXutil.ltrimstr( AV19TFMetPieMet, 9, 2));
            AV20TFMetPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFMetPieMet_To", GXutil.ltrimstr( AV20TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieAnc") == 0 )
         {
            AV21TFMetPieAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFMetPieAnc), 3, 0));
            AV22TFMetPieAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMtD") == 0 )
         {
            AV23TFMetPieMtD = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFMetPieMtD", GXutil.ltrimstr( AV23TFMetPieMtD, 8, 2));
            AV24TFMetPieMtD_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFMetPieMtD_To", GXutil.ltrimstr( AV24TFMetPieMtD_To, 8, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPiectr") == 0 )
         {
            AV25TFMetPiectr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFMetPiectr", AV25TFMetPiectr);
            AV26TFMetPiectr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMetPiectr_Sel", AV26TFMetPiectr_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e222AQ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar ", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(108) ;
      }
      sendrow_1082( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_108_Refreshing )
      {
         httpContext.doAjaxLoad(108, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV56GridActionGroup1, 4, 0)) );
   }

   public void e232AQ2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV56GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S172 ();
         if (returnInSub) return;
      }
      AV56GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV56GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e142AQ2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152AQ2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_char4[0] = AV46Mensaje ;
      new app.pmetpiacopy1copy1(remoteHandle, context).execute( AV36EmprCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV42Pzs, GXv_char4) ;
      documentodetransporteproduccion_piezas_impl.this.AV46Mensaje = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
      if ( GXutil.strcmp(AV46Mensaje, " ") != 0 )
      {
         lblTbmessage_Caption = AV46Mensaje ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e162AQ2( )
   {
      /* 'DoEtiqueta' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
      {
         httpContext.popup(formatLink("app.retim21", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV40BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A2814MetPieKil)),GXutil.URLEncode(DecimalUtil.decToString(A2815MetPieMet)),GXutil.URLEncode(GXutil.ltrimstr(A6635MetPieAnc,3,0)),GXutil.URLEncode(DecimalUtil.decToString(A4910MetPieMtD)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Metpiecod","Metpiekil","Metpiemet","MetPieAnc","MetPieMtd","MaqCod","Opecod","Output"}) , new Object[] {"AV36EmprCod","AV38BarCod","AV39BarCodReo","AV40BarCodPar","A2813MetPieCod","A2814MetPieKil","A2815MetPieMet","A6635MetPieAnc","A4910MetPieMtD","","",""});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e172AQ2( )
   {
      /* 'DoImprimirTodas' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV36EmprCod ;
      GXv_char3[0] = AV37MetTerCod ;
      GXv_int8[0] = AV38BarCod ;
      GXv_int9[0] = AV39BarCodReo ;
      GXv_char2[0] = AV40BarCodPar ;
      new app.pmetpii(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_int9, GXv_char2) ;
      documentodetransporteproduccion_piezas_impl.this.AV36EmprCod = GXv_char4[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV37MetTerCod = GXv_char3[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV38BarCod = GXv_int8[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV39BarCodReo = GXv_int9[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV40BarCodPar = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37MetTerCod", AV37MetTerCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodReo", GXutil.str( AV39BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarCodPar", AV40BarCodPar);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( GXutil.strcmp(AV57Modo, httpContext.getMessage( "DSP", "")) == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Estamos en modo DSP", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( GXutil.strcmp(A10780MetPiectr, AV45MetPiectr) != 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Eliminacion NO permitida", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV73Emprcod_selected = A396EmprCod ;
            AV74Mettercod_selected = A2809MetTerCod ;
            AV75Barcod_selected = A129BarCod ;
            AV76Barcodreo_selected = A132BarCodReo ;
            AV77Barcodpar_selected = A130BarCodPar ;
            AV78Metpiecod_selected = A2813MetPieCod ;
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_del(remoteHandle, context).execute( AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, A2813MetPieCod) ;
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV60Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV60Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV60Pgmname+"GridState"), null, null);
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
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV15TFMetPieCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFMetPieCod", AV15TFMetPieCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV16TFMetPieCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFMetPieCod_Sel", AV16TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV17TFMetPieKil = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFMetPieKil", GXutil.ltrimstr( AV17TFMetPieKil, 9, 2));
            AV18TFMetPieKil_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFMetPieKil_To", GXutil.ltrimstr( AV18TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV19TFMetPieMet = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFMetPieMet", GXutil.ltrimstr( AV19TFMetPieMet, 9, 2));
            AV20TFMetPieMet_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFMetPieMet_To", GXutil.ltrimstr( AV20TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV21TFMetPieAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFMetPieAnc), 3, 0));
            AV22TFMetPieAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV23TFMetPieMtD = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFMetPieMtD", GXutil.ltrimstr( AV23TFMetPieMtD, 8, 2));
            AV24TFMetPieMtD_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFMetPieMtD_To", GXutil.ltrimstr( AV24TFMetPieMtD_To, 8, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECTR") == 0 )
         {
            AV25TFMetPiectr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFMetPiectr", AV25TFMetPiectr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECTR_SEL") == 0 )
         {
            AV26TFMetPiectr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMetPiectr_Sel", AV26TFMetPiectr_Sel);
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV16TFMetPieCod_Sel)==0), AV16TFMetPieCod_Sel, GXv_char4) ;
      documentodetransporteproduccion_piezas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFMetPiectr_Sel)==0), AV26TFMetPiectr_Sel, GXv_char3) ;
      documentodetransporteproduccion_piezas_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||||"+GXt_char10 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char10 = "" ;
      GXv_char4[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV15TFMetPieCod)==0), AV15TFMetPieCod, GXv_char4) ;
      documentodetransporteproduccion_piezas_impl.this.GXt_char10 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFMetPiectr)==0), AV25TFMetPiectr, GXv_char3) ;
      documentodetransporteproduccion_piezas_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char10+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV17TFMetPieKil)==0) ? "" : GXutil.str( AV17TFMetPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFMetPieMet)==0) ? "" : GXutil.str( AV19TFMetPieMet, 9, 2))+"|"+((0==AV21TFMetPieAnc) ? "" : GXutil.str( AV21TFMetPieAnc, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFMetPieMtD)==0) ? "" : GXutil.str( AV23TFMetPieMtD, 8, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFMetPieKil_To)==0) ? "" : GXutil.str( AV18TFMetPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV20TFMetPieMet_To)==0) ? "" : GXutil.str( AV20TFMetPieMet_To, 9, 2))+"|"+((0==AV22TFMetPieAnc_To) ? "" : GXutil.str( AV22TFMetPieAnc_To, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFMetPieMtD_To)==0) ? "" : GXutil.str( AV24TFMetPieMtD_To, 8, 2))+"|" ;
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
      AV10GridState.fromxml(AV14Session.getValue(AV60Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFMETPIECOD", "", !(GXutil.strcmp("", AV15TFMetPieCod)==0), (short)(0), AV15TFMetPieCod, "", !(GXutil.strcmp("", AV16TFMetPieCod_Sel)==0), AV16TFMetPieCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFMETPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV17TFMetPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFMetPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV17TFMetPieKil, 9, 2)), GXutil.trim( GXutil.str( AV18TFMetPieKil_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFMETPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFMetPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV20TFMetPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV19TFMetPieMet, 9, 2)), GXutil.trim( GXutil.str( AV20TFMetPieMet_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFMETPIEANC", "", !((0==AV21TFMetPieAnc)&&(0==AV22TFMetPieAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV21TFMetPieAnc, 3, 0)), GXutil.trim( GXutil.str( AV22TFMetPieAnc_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFMETPIEMTD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFMetPieMtD)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFMetPieMtD_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFMetPieMtD, 8, 2)), GXutil.trim( GXutil.str( AV24TFMetPieMtD_To, 8, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFMETPIECTR", "", !(GXutil.strcmp("", AV25TFMetPiectr)==0), (short)(0), AV25TFMetPiectr, "", !(GXutil.strcmp("", AV26TFMetPiectr_Sel)==0), AV26TFMetPiectr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV60Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.LMETPI" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV50TotMetPieCod = 0 ;
      AV52TotMetPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TotMetPieKil", GXutil.ltrimstr( AV52TotMetPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV52TotMetPieKil, "ZZZZZ9.99")));
      AV54TotMetPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TotMetPieMet", GXutil.ltrimstr( AV54TotMetPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV54TotMetPieMet, "ZZZZZ9.99")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV15TFMetPieCod ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV16TFMetPieCod_Sel ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV17TFMetPieKil ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV18TFMetPieKil_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV19TFMetPieMet ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV20TFMetPieMet_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV21TFMetPieAnc ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV22TFMetPieAnc_To ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV23TFMetPieMtD ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV24TFMetPieMtD_To ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV25TFMetPiectr ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV26TFMetPiectr_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                           AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                           AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                           AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                           AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                           AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                           Short.valueOf(AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) ,
                                           Short.valueOf(AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           A10780MetPiectr ,
                                           AV36EmprCod ,
                                           AV37MetTerCod ,
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV40BarCodPar ,
                                           A396EmprCod ,
                                           A2809MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod), 9, "%") ;
      lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = GXutil.padr( GXutil.rtrim( AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr), 40, "%") ;
      /* Using cursor H02AQ4 */
      pr_default.execute(2, new Object[] {AV36EmprCod, AV37MetTerCod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV40BarCodPar, lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod, AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel, AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil, AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to, AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet, AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to, Short.valueOf(AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc), Short.valueOf(AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to), AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd, AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to, lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr, AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H02AQ4_A130BarCodPar[0] ;
         A132BarCodReo = H02AQ4_A132BarCodReo[0] ;
         A129BarCod = H02AQ4_A129BarCod[0] ;
         A2809MetTerCod = H02AQ4_A2809MetTerCod[0] ;
         A396EmprCod = H02AQ4_A396EmprCod[0] ;
         A10780MetPiectr = H02AQ4_A10780MetPiectr[0] ;
         A4910MetPieMtD = H02AQ4_A4910MetPieMtD[0] ;
         A6635MetPieAnc = H02AQ4_A6635MetPieAnc[0] ;
         A2815MetPieMet = H02AQ4_A2815MetPieMet[0] ;
         A2814MetPieKil = H02AQ4_A2814MetPieKil[0] ;
         A2813MetPieCod = H02AQ4_A2813MetPieCod[0] ;
         AV52TotMetPieKil = A2814MetPieKil.add(AV52TotMetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52TotMetPieKil", GXutil.ltrimstr( AV52TotMetPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV52TotMetPieKil, "ZZZZZ9.99")));
         AV54TotMetPieMet = A2815MetPieMet.add(AV54TotMetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54TotMetPieMet", GXutil.ltrimstr( AV54TotMetPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV54TotMetPieMet, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV50TotMetPieCod = subgrid_fnc_recordcount( ) ;
      AV51TotValueMetPieCod = httpContext.getMessage( "WWP_TotalizerCount", "") + localUtil.format( DecimalUtil.doubleToDec(AV50TotMetPieCod), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TotValueMetPieCod", AV51TotValueMetPieCod);
      AV53TotValueMetPieKil = localUtil.format( AV52TotMetPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TotValueMetPieKil", AV53TotValueMetPieKil);
      AV55TotValueMetPieMet = localUtil.format( AV54TotMetPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TotValueMetPieMet", AV55TotValueMetPieMet);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e182AQ2 ();
      if (returnInSub) return;
   }

   public void e182AQ2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( GXutil.strcmp(AV57Modo, httpContext.getMessage( "DSP", "")) == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Estamos en modo DSP", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavMetpiecod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV31MetPieCod)==0) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Codigo de Pieza incorrecto", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavMetpiecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            new app.documentotransporteproduccion.documentodetransporteproduccion_ins_upd_lmetpi(remoteHandle, context).execute( AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV31MetPieCod, AV32MetPieKil, AV33MetPieMet, AV34MetPieAnc, AV35MetPieMtD) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
   }

   public void e192AQ2( )
   {
      /* Metpiecod_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_decimal12[0] = AV32MetPieKil ;
      GXv_decimal13[0] = AV33MetPieMet ;
      GXv_int14[0] = AV34MetPieAnc ;
      GXv_decimal15[0] = AV35MetPieMtD ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_get_lmeti(remoteHandle, context).execute( AV36EmprCod, AV37MetTerCod, AV38BarCod, AV39BarCodReo, AV40BarCodPar, AV31MetPieCod, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_decimal15) ;
      documentodetransporteproduccion_piezas_impl.this.AV32MetPieKil = GXv_decimal12[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV33MetPieMet = GXv_decimal13[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV34MetPieAnc = GXv_int14[0] ;
      documentodetransporteproduccion_piezas_impl.this.AV35MetPieMtD = GXv_decimal15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32MetPieKil", GXutil.ltrimstr( AV32MetPieKil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV33MetPieMet", GXutil.ltrimstr( AV33MetPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV34MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MetPieAnc), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35MetPieMtD", GXutil.ltrimstr( AV35MetPieMtD, 8, 2));
      /*  Sending Event outputs  */
   }

   public void wb_table3_147_2AQ2( boolean wbgen )
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
         wb_table3_147_2AQ2e( true) ;
      }
      else
      {
         wb_table3_147_2AQ2e( false) ;
      }
   }

   public void wb_table2_118_2AQ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiecod_Internalname, httpContext.getMessage( "Tot Value Met Pie Cod", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiecod_Internalname, AV51TotValueMetPieCod, GXutil.rtrim( localUtil.format( AV51TotValueMetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiecod_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiecod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiekil_Internalname, httpContext.getMessage( "Tot Value Met Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiekil_Internalname, AV53TotValueMetPieKil, GXutil.rtrim( localUtil.format( AV53TotValueMetPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiemet_Internalname, httpContext.getMessage( "Tot Value Met Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiemet_Internalname, AV55TotValueMetPieMet, GXutil.rtrim( localUtil.format( AV55TotValueMetPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table2_118_2AQ2e( true) ;
      }
      else
      {
         wb_table2_118_2AQ2e( false) ;
      }
   }

   public void wb_table1_80_2AQ2( boolean wbgen )
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
         wb_table1_80_2AQ2e( true) ;
      }
      else
      {
         wb_table1_80_2AQ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV57Modo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Modo", AV57Modo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Modo, ""))));
      AV36EmprCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      AV37MetTerCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37MetTerCod", AV37MetTerCod);
      AV38BarCod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarCod), 8, 0));
      AV39BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodReo", GXutil.str( AV39BarCodReo, 1, 0));
      AV40BarCodPar = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarCodPar", AV40BarCodPar);
      AV41AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCod), 10, 0));
      AV42Pzs = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Pzs), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42Pzs), "ZZZZZ9")));
      AV43Kgs = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Kgs", GXutil.ltrimstr( AV43Kgs, 9, 2));
      AV44Mts = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Mts", GXutil.ltrimstr( AV44Mts, 9, 2));
      AV45MetPiectr = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45MetPiectr", AV45MetPiectr);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECTR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MetPiectr, ""))));
      AV46Mensaje = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Mensaje", AV46Mensaje);
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
      pa2AQ2( ) ;
      ws2AQ2( ) ;
      we2AQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151437", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_piezas.js", "?202682116151437", false, true);
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

   public void subsflControlProps_1082( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_108_idx );
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_108_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_108_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_108_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_108_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_108_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_108_idx ;
   }

   public void subsflControlProps_fel_1082( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_108_fel_idx );
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_108_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_108_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_108_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_108_fel_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_108_fel_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_108_fel_idx ;
   }

   public void sendrow_1082( )
   {
      subsflControlProps_1082( ) ;
      wb2AQ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_108_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_108_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_108_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'',false,'"+sGXsfl_108_idx+"',108)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_108_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV56GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV56GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV56GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_108_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV56GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_108_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2814MetPieKil, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2815MetPieMet, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4910MetPieMtD, "ZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPiectr_Internalname,GXutil.rtrim( A10780MetPiectr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPiectr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2AQ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_108_idx = ((subGrid_Islastpage==1)&&(nGXsfl_108_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_108_idx+1) ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1082( ) ;
      }
      /* End function sendrow_1082 */
   }

   public void startgridcontrol108( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"108\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Peça", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Largura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Control", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10780MetPiectr));
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
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavModo_Internalname = "vMODO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPzs_Internalname = "vPZS" ;
      edtavKgs_Internalname = "vKGS" ;
      edtavMts_Internalname = "vMTS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavMetpiecod_Internalname = "vMETPIECOD" ;
      edtavMetpiekil_Internalname = "vMETPIEKIL" ;
      edtavMetpiemet_Internalname = "vMETPIEMET" ;
      edtavMetpieanc_Internalname = "vMETPIEANC" ;
      edtavMetpiemtd_Internalname = "vMETPIEMTD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnetiqueta_Internalname = "BTNETIQUETA" ;
      bttBtnimprimirtodas_Internalname = "BTNIMPRIMIRTODAS" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
      edtMetPiectr_Internalname = "METPIECTR" ;
      edtavTotvaluemetpiecod_Internalname = "vTOTVALUEMETPIECOD" ;
      edtavTotvaluemetpiekil_Internalname = "vTOTVALUEMETPIEKIL" ;
      edtavTotvaluemetpiemet_Internalname = "vTOTVALUEMETPIEMET" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
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
      edtMetPiectr_Jsonclick = "" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluemetpiemet_Jsonclick = "" ;
      edtavTotvaluemetpiemet_Enabled = 1 ;
      edtavTotvaluemetpiekil_Jsonclick = "" ;
      edtavTotvaluemetpiekil_Enabled = 1 ;
      edtavTotvaluemetpiecod_Jsonclick = "" ;
      edtavTotvaluemetpiecod_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      edtavMetpiemtd_Jsonclick = "" ;
      edtavMetpiemtd_Enabled = 1 ;
      edtavMetpieanc_Jsonclick = "" ;
      edtavMetpieanc_Enabled = 1 ;
      edtavMetpiemet_Jsonclick = "" ;
      edtavMetpiemet_Enabled = 1 ;
      edtavMetpiekil_Jsonclick = "" ;
      edtavMetpiekil_Enabled = 1 ;
      edtavMetpiecod_Jsonclick = "" ;
      edtavMetpiecod_Enabled = 1 ;
      edtavMts_Jsonclick = "" ;
      edtavMts_Enabled = 0 ;
      edtavKgs_Jsonclick = "" ;
      edtavKgs_Enabled = 0 ;
      edtavPzs_Jsonclick = "" ;
      edtavPzs_Enabled = 0 ;
      edtavModo_Jsonclick = "" ;
      edtavModo_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Confirma la eliminacion?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_PiezasGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|||||T" ;
      Ddo_grid_Filterisrange = "|T|T|T|T|" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "1:MetPieCod|2:MetPieKil|3:MetPieMet|4:MetPieAnc|5:MetPieMtD|6:MetPiectr" ;
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
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Tabla LMETPI", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_108_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV56GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV56GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV53TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV55TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112AQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122AQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132AQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222AQ2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV56GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e232AQ2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV56GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'A10780MetPiectr',fld:'METPIECTR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV56GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV53TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV55TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142AQ2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV53TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV55TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152AQ2',iparms:[{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV46Mensaje',fld:'vMENSAJE',pic:''}]}");
      setEventMetadata("'DOETIQUETA'","{handler:'e162AQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'DOETIQUETA'",",oparms:[{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV53TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV55TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("'DOIMPRIMIRTODAS'","{handler:'e172AQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOIMPRIMIRTODAS'",",oparms:[{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV53TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV55TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e182AQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV16TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV17TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV18TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV19TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV20TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV21TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV22TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV23TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV24TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV25TFMetPiectr',fld:'vTFMETPIECTR',pic:''},{av:'AV26TFMetPiectr_Sel',fld:'vTFMETPIECTR_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45MetPiectr',fld:'vMETPIECTR',pic:'',hsh:true},{av:'AV57Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV42Pzs',fld:'vPZS',pic:'ZZZZZ9',hsh:true},{av:'AV31MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV32MetPieKil',fld:'vMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV33MetPieMet',fld:'vMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV34MetPieAnc',fld:'vMETPIEANC',pic:'ZZ9'},{av:'AV35MetPieMtD',fld:'vMETPIEMTD',pic:'ZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV54TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV53TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV55TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("VMETPIECOD.CONTROLVALUECHANGED","{handler:'e192AQ2',iparms:[{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV38BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV40BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV31MetPieCod',fld:'vMETPIECOD',pic:''}]");
      setEventMetadata("VMETPIECOD.CONTROLVALUECHANGED",",oparms:[{av:'AV35MetPieMtD',fld:'vMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV34MetPieAnc',fld:'vMETPIEANC',pic:'ZZ9'},{av:'AV33MetPieMet',fld:'vMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV32MetPieKil',fld:'vMETPIEKIL',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metpiectr',iparms:[]");
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
      wcpOAV57Modo = "" ;
      wcpOAV36EmprCod = "" ;
      wcpOAV37MetTerCod = "" ;
      wcpOAV40BarCodPar = "" ;
      wcpOAV43Kgs = DecimalUtil.ZERO ;
      wcpOAV44Mts = DecimalUtil.ZERO ;
      wcpOAV45MetPiectr = "" ;
      wcpOAV46Mensaje = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV57Modo = "" ;
      AV36EmprCod = "" ;
      AV37MetTerCod = "" ;
      AV40BarCodPar = "" ;
      AV43Kgs = DecimalUtil.ZERO ;
      AV44Mts = DecimalUtil.ZERO ;
      AV45MetPiectr = "" ;
      AV46Mensaje = "" ;
      AV15TFMetPieCod = "" ;
      AV16TFMetPieCod_Sel = "" ;
      AV17TFMetPieKil = DecimalUtil.ZERO ;
      AV18TFMetPieKil_To = DecimalUtil.ZERO ;
      AV19TFMetPieMet = DecimalUtil.ZERO ;
      AV20TFMetPieMet_To = DecimalUtil.ZERO ;
      AV23TFMetPieMtD = DecimalUtil.ZERO ;
      AV24TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV25TFMetPiectr = "" ;
      AV26TFMetPiectr_Sel = "" ;
      AV60Pgmname = "" ;
      AV52TotMetPieKil = DecimalUtil.ZERO ;
      AV54TotMetPieMet = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV31MetPieCod = "" ;
      AV32MetPieKil = DecimalUtil.ZERO ;
      AV33MetPieMet = DecimalUtil.ZERO ;
      AV35MetPieMtD = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnetiqueta_Jsonclick = "" ;
      bttBtnimprimirtodas_Jsonclick = "" ;
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
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A10780MetPiectr = "" ;
      scmdbuf = "" ;
      lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = "" ;
      lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = "" ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = "" ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = "" ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = DecimalUtil.ZERO ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = DecimalUtil.ZERO ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = DecimalUtil.ZERO ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = "" ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = "" ;
      H02AQ2_A396EmprCod = new String[] {""} ;
      H02AQ2_A2809MetTerCod = new String[] {""} ;
      H02AQ2_A129BarCod = new int[1] ;
      H02AQ2_A132BarCodReo = new byte[1] ;
      H02AQ2_A130BarCodPar = new String[] {""} ;
      H02AQ2_A10780MetPiectr = new String[] {""} ;
      H02AQ2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AQ2_A6635MetPieAnc = new short[1] ;
      H02AQ2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AQ2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AQ2_A2813MetPieCod = new String[] {""} ;
      H02AQ3_AGRID_nRecordCount = new long[1] ;
      AV51TotValueMetPieCod = "" ;
      AV53TotValueMetPieKil = "" ;
      AV55TotValueMetPieMet = "" ;
      hsh = "" ;
      AV47Station = "" ;
      AV48EmprNom = "" ;
      AV49UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV73Emprcod_selected = "" ;
      AV74Mettercod_selected = "" ;
      AV77Barcodpar_selected = "" ;
      AV78Metpiecod_selected = "" ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char10 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState11 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02AQ4_A130BarCodPar = new String[] {""} ;
      H02AQ4_A132BarCodReo = new byte[1] ;
      H02AQ4_A129BarCod = new int[1] ;
      H02AQ4_A2809MetTerCod = new String[] {""} ;
      H02AQ4_A396EmprCod = new String[] {""} ;
      H02AQ4_A10780MetPiectr = new String[] {""} ;
      H02AQ4_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AQ4_A6635MetPieAnc = new short[1] ;
      H02AQ4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AQ4_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AQ4_A2813MetPieCod = new String[] {""} ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new short[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_piezas__default(),
         new Object[] {
             new Object[] {
            H02AQ2_A396EmprCod, H02AQ2_A2809MetTerCod, H02AQ2_A129BarCod, H02AQ2_A132BarCodReo, H02AQ2_A130BarCodPar, H02AQ2_A10780MetPiectr, H02AQ2_A4910MetPieMtD, H02AQ2_A6635MetPieAnc, H02AQ2_A2815MetPieMet, H02AQ2_A2814MetPieKil,
            H02AQ2_A2813MetPieCod
            }
            , new Object[] {
            H02AQ3_AGRID_nRecordCount
            }
            , new Object[] {
            H02AQ4_A130BarCodPar, H02AQ4_A132BarCodReo, H02AQ4_A129BarCod, H02AQ4_A2809MetTerCod, H02AQ4_A396EmprCod, H02AQ4_A10780MetPiectr, H02AQ4_A4910MetPieMtD, H02AQ4_A6635MetPieAnc, H02AQ4_A2815MetPieMet, H02AQ4_A2814MetPieKil,
            H02AQ4_A2813MetPieCod
            }
         }
      );
      AV60Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Piezas" ;
      /* GeneXus formulas. */
      AV60Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Piezas" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavModo_Enabled = 0 ;
      edtavPzs_Enabled = 0 ;
      edtavKgs_Enabled = 0 ;
      edtavMts_Enabled = 0 ;
      edtavTotvaluemetpiecod_Enabled = 0 ;
      edtavTotvaluemetpiekil_Enabled = 0 ;
      edtavTotvaluemetpiemet_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV39BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV39BarCodReo ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int9[] ;
   private byte AV76Barcodreo_selected ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV21TFMetPieAnc ;
   private short AV22TFMetPieAnc_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV34MetPieAnc ;
   private short AV56GridActionGroup1 ;
   private short A6635MetPieAnc ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ;
   private short AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ;
   private short GXv_int14[] ;
   private int wcpOAV38BarCod ;
   private int wcpOAV42Pzs ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_108 ;
   private int AV38BarCod ;
   private int AV42Pzs ;
   private int nGXsfl_108_idx=1 ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavModo_Enabled ;
   private int edtavPzs_Enabled ;
   private int edtavKgs_Enabled ;
   private int edtavMts_Enabled ;
   private int edtavMetpiecod_Enabled ;
   private int edtavMetpiekil_Enabled ;
   private int edtavMetpiemet_Enabled ;
   private int edtavMetpieanc_Enabled ;
   private int edtavMetpiemtd_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluemetpiecod_Enabled ;
   private int edtavTotvaluemetpiekil_Enabled ;
   private int edtavTotvaluemetpiemet_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV28PageToGo ;
   private int GXv_int8[] ;
   private int AV75Barcod_selected ;
   private int AV79GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV41AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV41AlbProCod ;
   private long AV29GridCurrentPage ;
   private long AV30GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV50TotMetPieCod ;
   private java.math.BigDecimal wcpOAV43Kgs ;
   private java.math.BigDecimal wcpOAV44Mts ;
   private java.math.BigDecimal AV43Kgs ;
   private java.math.BigDecimal AV44Mts ;
   private java.math.BigDecimal AV17TFMetPieKil ;
   private java.math.BigDecimal AV18TFMetPieKil_To ;
   private java.math.BigDecimal AV19TFMetPieMet ;
   private java.math.BigDecimal AV20TFMetPieMet_To ;
   private java.math.BigDecimal AV23TFMetPieMtD ;
   private java.math.BigDecimal AV24TFMetPieMtD_To ;
   private java.math.BigDecimal AV52TotMetPieKil ;
   private java.math.BigDecimal AV54TotMetPieMet ;
   private java.math.BigDecimal AV32MetPieKil ;
   private java.math.BigDecimal AV33MetPieMet ;
   private java.math.BigDecimal AV35MetPieMtD ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ;
   private java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ;
   private java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ;
   private java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ;
   private java.math.BigDecimal AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ;
   private java.math.BigDecimal AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOAV57Modo ;
   private String wcpOAV36EmprCod ;
   private String wcpOAV37MetTerCod ;
   private String wcpOAV40BarCodPar ;
   private String wcpOAV45MetPiectr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV57Modo ;
   private String AV36EmprCod ;
   private String AV37MetTerCod ;
   private String AV40BarCodPar ;
   private String AV45MetPiectr ;
   private String sGXsfl_108_idx="0001" ;
   private String AV15TFMetPieCod ;
   private String AV16TFMetPieCod_Sel ;
   private String AV25TFMetPiectr ;
   private String AV26TFMetPiectr_Sel ;
   private String AV60Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavModo_Internalname ;
   private String edtavModo_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPzs_Internalname ;
   private String edtavPzs_Jsonclick ;
   private String edtavKgs_Internalname ;
   private String edtavKgs_Jsonclick ;
   private String edtavMts_Internalname ;
   private String edtavMts_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavMetpiecod_Internalname ;
   private String TempTags ;
   private String AV31MetPieCod ;
   private String edtavMetpiecod_Jsonclick ;
   private String edtavMetpiekil_Internalname ;
   private String edtavMetpiekil_Jsonclick ;
   private String edtavMetpiemet_Internalname ;
   private String edtavMetpiemet_Jsonclick ;
   private String edtavMetpieanc_Internalname ;
   private String edtavMetpieanc_Jsonclick ;
   private String edtavMetpiemtd_Internalname ;
   private String edtavMetpiemtd_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnetiqueta_Internalname ;
   private String bttBtnetiqueta_Jsonclick ;
   private String bttBtnimprimirtodas_Internalname ;
   private String bttBtnimprimirtodas_Jsonclick ;
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
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String A10780MetPiectr ;
   private String edtMetPiectr_Internalname ;
   private String edtavTotvaluemetpiecod_Internalname ;
   private String edtavTotvaluemetpiekil_Internalname ;
   private String edtavTotvaluemetpiemet_Internalname ;
   private String scmdbuf ;
   private String lV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ;
   private String lV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ;
   private String AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ;
   private String AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ;
   private String AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ;
   private String AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ;
   private String hsh ;
   private String AV47Station ;
   private String AV48EmprNom ;
   private String AV49UsurCod ;
   private String GXv_char2[] ;
   private String AV73Emprcod_selected ;
   private String AV74Mettercod_selected ;
   private String AV77Barcodpar_selected ;
   private String AV78Metpiecod_selected ;
   private String GXt_char10 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemetpiecod_Jsonclick ;
   private String edtavTotvaluemetpiekil_Jsonclick ;
   private String edtavTotvaluemetpiemet_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_108_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPiectr_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
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
   private boolean bGXsfl_108_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String wcpOAV46Mensaje ;
   private String AV46Mensaje ;
   private String AV51TotValueMetPieCod ;
   private String AV53TotValueMetPieKil ;
   private String AV55TotValueMetPieMet ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H02AQ2_A396EmprCod ;
   private String[] H02AQ2_A2809MetTerCod ;
   private int[] H02AQ2_A129BarCod ;
   private byte[] H02AQ2_A132BarCodReo ;
   private String[] H02AQ2_A130BarCodPar ;
   private String[] H02AQ2_A10780MetPiectr ;
   private java.math.BigDecimal[] H02AQ2_A4910MetPieMtD ;
   private short[] H02AQ2_A6635MetPieAnc ;
   private java.math.BigDecimal[] H02AQ2_A2815MetPieMet ;
   private java.math.BigDecimal[] H02AQ2_A2814MetPieKil ;
   private String[] H02AQ2_A2813MetPieCod ;
   private long[] H02AQ3_AGRID_nRecordCount ;
   private String[] H02AQ4_A130BarCodPar ;
   private byte[] H02AQ4_A132BarCodReo ;
   private int[] H02AQ4_A129BarCod ;
   private String[] H02AQ4_A2809MetTerCod ;
   private String[] H02AQ4_A396EmprCod ;
   private String[] H02AQ4_A10780MetPiectr ;
   private java.math.BigDecimal[] H02AQ4_A4910MetPieMtD ;
   private short[] H02AQ4_A6635MetPieAnc ;
   private java.math.BigDecimal[] H02AQ4_A2815MetPieMet ;
   private java.math.BigDecimal[] H02AQ4_A2814MetPieKil ;
   private String[] H02AQ4_A2813MetPieCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState11[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV27DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class documentodetransporteproduccion_piezas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02AQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                          String AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                          java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                          short AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ,
                                          short AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ,
                                          java.math.BigDecimal AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                          java.math.BigDecimal AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          String A10780MetPiectr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV36EmprCod ,
                                          String AV37MetTerCod ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV40BarCodPar ,
                                          String A396EmprCod ,
                                          String A2809MetTerCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[22];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod" ;
      sFromString = " FROM TXPLMETPI" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) && ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPiectr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) )
      {
         addWhere(sWhereString, "(MetPiectr = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieKil" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieMet" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieAnc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPieMtD" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPieMtD DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY MetPiectr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY MetPiectr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H02AQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                          String AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                          java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                          short AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ,
                                          short AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ,
                                          java.math.BigDecimal AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                          java.math.BigDecimal AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          String A10780MetPiectr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV36EmprCod ,
                                          String AV37MetTerCod ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV40BarCodPar ,
                                          String A396EmprCod ,
                                          String A2809MetTerCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[17];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) && ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPiectr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) )
      {
         addWhere(sWhereString, "(MetPiectr = ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
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

   protected Object[] conditional_H02AQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                          String AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                          java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                          short AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ,
                                          short AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ,
                                          java.math.BigDecimal AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                          java.math.BigDecimal AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          String A10780MetPiectr ,
                                          String AV36EmprCod ,
                                          String AV37MetTerCod ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV40BarCodPar ,
                                          String A396EmprCod ,
                                          String A2809MetTerCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[17];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, MetTerCod, EmprCod, MetPiectr, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV61Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) && ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPiectr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) )
      {
         addWhere(sWhereString, "(MetPiectr = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar" ;
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
                  return conditional_H02AQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 1 :
                  return conditional_H02AQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 2 :
                  return conditional_H02AQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02AQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 40);
               }
               return;
      }
   }

}

