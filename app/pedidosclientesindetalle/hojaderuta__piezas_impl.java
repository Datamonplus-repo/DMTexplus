package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta__piezas_impl extends GXDataArea
{
   public hojaderuta__piezas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta__piezas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__piezas_impl.class ));
   }

   public hojaderuta__piezas_impl( int remoteHandle ,
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
            AV41EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV49BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
               AV50BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
               AV51BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
               AV52CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52CliCod), 6, 0));
               AV53Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Discod), 8, 0));
               AV54BarUniMed = httpContext.GetPar( "BarUniMed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54BarUniMed", AV54BarUniMed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarUniMed, "@!"))));
               AV55BarPes = (short)(GXutil.lval( httpContext.GetPar( "BarPes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarPes), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55BarPes), "ZZZ9")));
               AV56BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56BarSer", AV56BarSer);
               AV57PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57PedidoCliente", AV57PedidoCliente);
               AV58BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58BarColNom", AV58BarColNom);
               AV59BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarColNum), 6, 0));
               AV60BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarPie), 6, 0));
               AV61BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61BarKgm", GXutil.ltrimstr( AV61BarKgm, 9, 2));
               AV62BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62BarMtr", GXutil.ltrimstr( AV62BarMtr, 9, 2));
               AV63CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63CliNom", AV63CliNom);
               AV64BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64BarSerDsc", AV64BarSerDsc);
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
      nRC_GXsfl_131 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_131"))) ;
      nGXsfl_131_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_131_idx"))) ;
      sGXsfl_131_idx = httpContext.GetPar( "sGXsfl_131_idx") ;
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
      AV41EmprCod = httpContext.GetPar( "EmprCod") ;
      AV49BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV50BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV51BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV20TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV21TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV22TFAlbREnt = httpContext.GetPar( "TFAlbREnt") ;
      AV23TFAlbREnt_Sel = httpContext.GetPar( "TFAlbREnt_Sel") ;
      AV24TFBarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil"), ".") ;
      AV25TFBarPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil_To"), ".") ;
      AV26TFBarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet"), ".") ;
      AV27TFBarPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet_To"), ".") ;
      AV28TFBarPiePie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPiePie"))) ;
      AV29TFBarPiePie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPiePie_To"))) ;
      AV84Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV34TotBarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotBarPieKil"), ".") ;
      AV36TotBarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotBarPieMet"), ".") ;
      AV38TotBarPiePie = GXutil.lval( httpContext.GetPar( "TotBarPiePie")) ;
      AV67TinEst = (short)(GXutil.lval( httpContext.GetPar( "TinEst"))) ;
      AV77BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV54BarUniMed = httpContext.GetPar( "BarUniMed") ;
      AV55BarPes = (short)(GXutil.lval( httpContext.GetPar( "BarPes"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV20TFAlbRecCod, AV21TFAlbRecCod_To, AV22TFAlbREnt, AV23TFAlbREnt_Sel, AV24TFBarPieKil, AV25TFBarPieKil_To, AV26TFBarPieMet, AV27TFBarPieMet_To, AV28TFBarPiePie, AV29TFBarPiePie_To, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, AV34TotBarPieKil, AV36TotBarPieMet, AV38TotBarPiePie, AV67TinEst, AV77BarAgrEst, AV54BarUniMed, AV55BarPes) ;
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
      pa24D2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24D2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta__piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV51BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV52CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53Discod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV56BarSer)),GXutil.URLEncode(GXutil.rtrim(AV57PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV58BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV60BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV61BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV62BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV63CliNom)),GXutil.URLEncode(GXutil.rtrim(AV64BarSerDsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEKIL", getSecureSignedToken( "", localUtil.format( AV34TotBarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEMET", getSecureSignedToken( "", localUtil.format( AV36TotBarPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38TotBarPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55BarPes), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Piezas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__piezas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_131", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_131, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV20TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV21TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRENT", GXutil.rtrim( AV22TFAlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRENT_SEL", GXutil.rtrim( AV23TFAlbREnt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV24TFBarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV25TFBarPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV26TFBarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV27TFBarPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEPIE", GXutil.ltrim( localUtil.ntoc( AV28TFBarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEPIE_TO", GXutil.ltrim( localUtil.ntoc( AV29TFBarPiePie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV34TotBarPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEKIL", getSecureSignedToken( "", localUtil.format( AV34TotBarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV36TotBarPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEMET", getSecureSignedToken( "", localUtil.format( AV36TotBarPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIEPIE", GXutil.ltrim( localUtil.ntoc( AV38TotBarPiePie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38TotBarPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIECOD_SELECTED", GXutil.rtrim( AV81Barpiecod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINEST", GXutil.ltrim( localUtil.ntoc( AV67TinEst, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV53Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV77BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV64BarSerDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we24D2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24D2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta__piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV51BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV52CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53Discod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV56BarSer)),GXutil.URLEncode(GXutil.rtrim(AV57PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV58BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV60BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV61BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV62BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV63CliNom)),GXutil.URLEncode(GXutil.rtrim(AV64BarSerDsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta__Piezas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Modificacion", "") ;
   }

   public void wb24D0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV49BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV50BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV50BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV51BarCodPar), GXutil.rtrim( localUtil.format( AV51BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV52CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV52CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV63CliNom), GXutil.rtrim( localUtil.format( AV63CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV57PedidoCliente), GXutil.rtrim( localUtil.format( AV57PedidoCliente, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV56BarSer), GXutil.rtrim( localUtil.format( AV56BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV58BarColNom), GXutil.rtrim( localUtil.format( AV58BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV59BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV59BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV60BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV61BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV61BarKgm, "ZZZZZ9.99") : localUtil.format( AV61BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV62BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV62BarMtr, "ZZZZZ9.99") : localUtil.format( AV62BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpes_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpes_Internalname, GXutil.ltrim( localUtil.ntoc( AV55BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarunimed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarunimed_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarunimed_Internalname, GXutil.rtrim( AV54BarUniMed), GXutil.rtrim( localUtil.format( AV54BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarunimed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarunimed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbreccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "Nº Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptalbrec_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptalbrec_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptalbrec_gximage+"_Class") ;
         StyleString = "" ;
         AV45promptalbrec_IsBlob = (boolean)(((GXutil.strcmp("", AV45promptalbrec)==0)&&(GXutil.strcmp("", AV85Promptalbrec_GXI)==0))||!(GXutil.strcmp("", AV45promptalbrec)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV45promptalbrec)==0) ? AV85Promptalbrec_GXI : httpContext.getResourceRelative(AV45promptalbrec)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPromptalbrec_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPromptalbrec_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPTALBREC.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV45promptalbrec_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiekil_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV46BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiekil_Enabled!=0) ? localUtil.format( AV46BarPieKil, "ZZZZZ9.99") : localUtil.format( AV46BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV47BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiemet_Enabled!=0) ? localUtil.format( AV47BarPieMet, "ZZZZZ9.99") : localUtil.format( AV47BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiepie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiepie_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiepie_Internalname, GXutil.ltrim( localUtil.ntoc( AV48BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48BarPiePie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiepie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiepie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 131, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 131, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
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
         wb_table1_120_24D2( true) ;
      }
      else
      {
         wb_table1_120_24D2( false) ;
      }
      return  ;
   }

   public void wb_table1_120_24D2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol131( ) ;
      }
      if ( wbEnd == 131 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_131 = (int)(nGXsfl_131_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_141_24D2( true) ;
      }
      else
      {
         wb_table2_141_24D2( false) ;
      }
      return  ;
   }

   public void wb_table2_141_24D2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV84Pgmname), GXutil.rtrim( localUtil.format( AV84Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table3_167_24D2( true) ;
      }
      else
      {
         wb_table3_167_24D2( false) ;
      }
      return  ;
   }

   public void wb_table3_167_24D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_172_24D2( true) ;
      }
      else
      {
         wb_table4_172_24D2( false) ;
      }
      return  ;
   }

   public void wb_table4_172_24D2e( boolean wbgen )
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
      if ( wbEnd == 131 )
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

   public void start24D2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Modificacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24D0( ) ;
   }

   public void ws24D2( )
   {
      start24D2( ) ;
      evt24D2( ) ;
   }

   public void evt24D2( )
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
                           e1124D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1224D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1324D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e1424D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1524D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1624D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPTALBREC.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1724D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
                           AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
                           AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
                           AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
                           AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
                           AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
                           AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
                           AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
                           AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
                           AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_131_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1312( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV80GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
                           A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
                           A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
                           A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
                           A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1824D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1924D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2024D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2124D2 ();
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

   public void we24D2( )
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

   public void pa24D2( )
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
            GX_FocusControl = edtavAlbreccod_Internalname ;
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
      subsflControlProps_1312( ) ;
      while ( nGXsfl_131_idx <= nRC_GXsfl_131 )
      {
         sendrow_1312( ) ;
         nGXsfl_131_idx = ((subGrid_Islastpage==1)&&(nGXsfl_131_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_131_idx+1) ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV41EmprCod ,
                                 int AV49BarCod ,
                                 byte AV50BarCodReo ,
                                 String AV51BarCodPar ,
                                 int AV20TFAlbRecCod ,
                                 int AV21TFAlbRecCod_To ,
                                 String AV22TFAlbREnt ,
                                 String AV23TFAlbREnt_Sel ,
                                 java.math.BigDecimal AV24TFBarPieKil ,
                                 java.math.BigDecimal AV25TFBarPieKil_To ,
                                 java.math.BigDecimal AV26TFBarPieMet ,
                                 java.math.BigDecimal AV27TFBarPieMet_To ,
                                 int AV28TFBarPiePie ,
                                 int AV29TFBarPiePie_To ,
                                 String AV84Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV34TotBarPieKil ,
                                 java.math.BigDecimal AV36TotBarPieMet ,
                                 long AV38TotBarPiePie ,
                                 short AV67TinEst ,
                                 String AV77BarAgrEst ,
                                 String AV54BarUniMed ,
                                 short AV55BarPes )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1924D2 ();
      GRID_nCurrentRecord = 0 ;
      rf24D2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Piezas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__piezas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIECOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A200BarPieCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
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
      rf24D2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV84Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Piezas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpes_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavTotvaluebarpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiekil_Enabled), 5, 0), true);
      edtavTotvaluebarpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiemet_Enabled), 5, 0), true);
      edtavTotvaluebarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiepie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24D2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(131) ;
      /* Execute user event: Refresh */
      e1924D2 ();
      nGXsfl_131_idx = 1 ;
      sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1312( ) ;
      bGXsfl_131_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_1312( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) ,
                                              Integer.valueOf(AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) ,
                                              AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                              AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                              AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                              AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                              AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                              AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                              Integer.valueOf(AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) ,
                                              Integer.valueOf(AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A46AlbREnt ,
                                              A203BarPieKil ,
                                              A205BarPieMet ,
                                              Integer.valueOf(A1501BarPiePie) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV41EmprCod ,
                                              Integer.valueOf(AV49BarCod) ,
                                              Byte.valueOf(AV50BarCodReo) ,
                                              AV51BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = GXutil.padr( GXutil.rtrim( AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent), 8, "%") ;
         /* Using cursor H024D2 */
         pr_default.execute(0, new Object[] {AV41EmprCod, Integer.valueOf(AV49BarCod), Byte.valueOf(AV50BarCodReo), AV51BarCodPar, Integer.valueOf(AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod), Integer.valueOf(AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to), lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent, AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel, AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil, AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to, AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet, AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to, Integer.valueOf(AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie), Integer.valueOf(AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_131_idx = 1 ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A130BarCodPar = H024D2_A130BarCodPar[0] ;
            A132BarCodReo = H024D2_A132BarCodReo[0] ;
            A129BarCod = H024D2_A129BarCod[0] ;
            A396EmprCod = H024D2_A396EmprCod[0] ;
            A1501BarPiePie = H024D2_A1501BarPiePie[0] ;
            A205BarPieMet = H024D2_A205BarPieMet[0] ;
            A203BarPieKil = H024D2_A203BarPieKil[0] ;
            A46AlbREnt = H024D2_A46AlbREnt[0] ;
            A44AlbRecCod = H024D2_A44AlbRecCod[0] ;
            A200BarPieCod = H024D2_A200BarPieCod[0] ;
            A46AlbREnt = H024D2_A46AlbREnt[0] ;
            e2024D2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(131) ;
         wb24D0( ) ;
      }
      bGXsfl_131_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24D2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV34TotBarPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEKIL", getSecureSignedToken( "", localUtil.format( AV34TotBarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV36TotBarPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEMET", getSecureSignedToken( "", localUtil.format( AV36TotBarPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIEPIE", GXutil.ltrim( localUtil.ntoc( AV38TotBarPiePie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38TotBarPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIECOD"+"_"+sGXsfl_131_idx, getSecureSignedToken( sGXsfl_131_idx, GXutil.rtrim( localUtil.format( A200BarPieCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINEST", GXutil.ltrim( localUtil.ntoc( AV67TinEst, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV77BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV77BarAgrEst, "@!"))));
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
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) ,
                                           Integer.valueOf(AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) ,
                                           AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                           AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                           AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                           AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                           AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                           AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                           Integer.valueOf(AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) ,
                                           Integer.valueOf(AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV41EmprCod ,
                                           Integer.valueOf(AV49BarCod) ,
                                           Byte.valueOf(AV50BarCodReo) ,
                                           AV51BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = GXutil.padr( GXutil.rtrim( AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent), 8, "%") ;
      /* Using cursor H024D3 */
      pr_default.execute(1, new Object[] {AV41EmprCod, Integer.valueOf(AV49BarCod), Byte.valueOf(AV50BarCodReo), AV51BarCodPar, Integer.valueOf(AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod), Integer.valueOf(AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to), lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent, AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel, AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil, AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to, AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet, AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to, Integer.valueOf(AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie), Integer.valueOf(AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to)});
      GRID_nRecordCount = H024D3_AGRID_nRecordCount[0] ;
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
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV20TFAlbRecCod, AV21TFAlbRecCod_To, AV22TFAlbREnt, AV23TFAlbREnt_Sel, AV24TFBarPieKil, AV25TFBarPieKil_To, AV26TFBarPieMet, AV27TFBarPieMet_To, AV28TFBarPiePie, AV29TFBarPiePie_To, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, AV34TotBarPieKil, AV36TotBarPieMet, AV38TotBarPiePie, AV67TinEst, AV77BarAgrEst, AV54BarUniMed, AV55BarPes) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV20TFAlbRecCod, AV21TFAlbRecCod_To, AV22TFAlbREnt, AV23TFAlbREnt_Sel, AV24TFBarPieKil, AV25TFBarPieKil_To, AV26TFBarPieMet, AV27TFBarPieMet_To, AV28TFBarPiePie, AV29TFBarPiePie_To, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, AV34TotBarPieKil, AV36TotBarPieMet, AV38TotBarPiePie, AV67TinEst, AV77BarAgrEst, AV54BarUniMed, AV55BarPes) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV20TFAlbRecCod, AV21TFAlbRecCod_To, AV22TFAlbREnt, AV23TFAlbREnt_Sel, AV24TFBarPieKil, AV25TFBarPieKil_To, AV26TFBarPieMet, AV27TFBarPieMet_To, AV28TFBarPiePie, AV29TFBarPiePie_To, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, AV34TotBarPieKil, AV36TotBarPieMet, AV38TotBarPiePie, AV67TinEst, AV77BarAgrEst, AV54BarUniMed, AV55BarPes) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV20TFAlbRecCod, AV21TFAlbRecCod_To, AV22TFAlbREnt, AV23TFAlbREnt_Sel, AV24TFBarPieKil, AV25TFBarPieKil_To, AV26TFBarPieMet, AV27TFBarPieMet_To, AV28TFBarPiePie, AV29TFBarPiePie_To, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, AV34TotBarPieKil, AV36TotBarPieMet, AV38TotBarPiePie, AV67TinEst, AV77BarAgrEst, AV54BarUniMed, AV55BarPes) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV20TFAlbRecCod, AV21TFAlbRecCod_To, AV22TFAlbREnt, AV23TFAlbREnt_Sel, AV24TFBarPieKil, AV25TFBarPieKil_To, AV26TFBarPieMet, AV27TFBarPieMet_To, AV28TFBarPiePie, AV29TFBarPiePie_To, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, AV34TotBarPieKil, AV36TotBarPieMet, AV38TotBarPiePie, AV67TinEst, AV77BarAgrEst, AV54BarUniMed, AV55BarPes) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV84Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Piezas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpes_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavTotvaluebarpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiekil_Enabled), 5, 0), true);
      edtavTotvaluebarpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiemet_Enabled), 5, 0), true);
      edtavTotvaluebarpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiepie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1824D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV30DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_131 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_131"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44AlbRecCod), 8, 0));
         }
         else
         {
            AV44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44AlbRecCod), 8, 0));
         }
         AV45promptalbrec = httpContext.cgiGet( imgavPromptalbrec_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEKIL");
            GX_FocusControl = edtavBarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46BarPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
         }
         else
         {
            AV46BarPieKil = localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
         }
         else
         {
            AV47BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEPIE");
            GX_FocusControl = edtavBarpiepie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48BarPiePie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
         }
         else
         {
            AV48BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
         }
         AV35TotValueBarPieKil = httpContext.cgiGet( edtavTotvaluebarpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35TotValueBarPieKil", AV35TotValueBarPieKil);
         AV37TotValueBarPieMet = httpContext.cgiGet( edtavTotvaluebarpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37TotValueBarPieMet", AV37TotValueBarPieMet);
         AV39TotValueBarPiePie = httpContext.cgiGet( edtavTotvaluebarpiepie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39TotValueBarPiePie", AV39TotValueBarPiePie);
         AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_131_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
         if ( nGXsfl_131_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV80GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
            A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
            A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
            A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__Piezas");
         AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta__piezas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1824D2 ();
      if (returnInSub) return;
   }

   public void e1824D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV67TinEst) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int2) ;
      hojaderuta__piezas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV67TinEst = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TinEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TinEst), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67TinEst), "ZZZ9")));
      GXv_int2[0] = (byte)(AV68Vertic) ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "VERTIC", ""), GXv_int2) ;
      hojaderuta__piezas_impl.this.AV68Vertic = GXv_int2[0] ;
      GXt_int1 = (byte)(AV69Tela) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int2) ;
      hojaderuta__piezas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV69Tela = GXt_int1 ;
      GXt_int1 = (byte)(AV70Erfoc) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      hojaderuta__piezas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV70Erfoc = GXt_int1 ;
      GXt_int1 = (byte)(AV71TTRN22) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "TTRN22", ""), GXv_int2) ;
      hojaderuta__piezas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV71TTRN22 = GXt_int1 ;
      imgavPromptalbrec_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "gximage", imgavPromptalbrec_gximage, true);
      AV45promptalbrec = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "Bitmap", ((GXutil.strcmp("", AV45promptalbrec)==0) ? AV85Promptalbrec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV45promptalbrec))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV45promptalbrec), true);
      AV85Promptalbrec_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "Bitmap", ((GXutil.strcmp("", AV45promptalbrec)==0) ? AV85Promptalbrec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV45promptalbrec))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV45promptalbrec), true);
      GXt_char3 = AV40Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta__piezas_impl.this.GXt_char3 = GXv_char4[0] ;
      AV40Station = GXt_char3 ;
      GXv_char4[0] = AV41EmprCod ;
      GXv_char5[0] = AV42EmprNom ;
      GXv_char6[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char4, GXv_char5, GXv_char6) ;
      hojaderuta__piezas_impl.this.AV41EmprCod = GXv_char4[0] ;
      hojaderuta__piezas_impl.this.AV42EmprNom = GXv_char5[0] ;
      hojaderuta__piezas_impl.this.AV43UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Modificacion", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV30DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV30DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
   }

   public void e1924D2( )
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
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
      /*  Sending Event outputs  */
   }

   public void e1124D2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV20TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAlbRecCod), 8, 0));
            AV21TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREnt") == 0 )
         {
            AV22TFAlbREnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFAlbREnt", AV22TFAlbREnt);
            AV23TFAlbREnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFAlbREnt_Sel", AV23TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieKil") == 0 )
         {
            AV24TFBarPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFBarPieKil", GXutil.ltrimstr( AV24TFBarPieKil, 9, 2));
            AV25TFBarPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFBarPieKil_To", GXutil.ltrimstr( AV25TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieMet") == 0 )
         {
            AV26TFBarPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFBarPieMet", GXutil.ltrimstr( AV26TFBarPieMet, 9, 2));
            AV27TFBarPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFBarPieMet_To", GXutil.ltrimstr( AV27TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPiePie") == 0 )
         {
            AV28TFBarPiePie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarPiePie), 6, 0));
            AV29TFBarPiePie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarPiePie_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2024D2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", httpContext.getMessage( "Modificar", ""), (short)(0));
      cmbavGridactions.addItem("2", httpContext.getMessage( "Eliminar", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(131) ;
      }
      sendrow_1312( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_131_Refreshing )
      {
         httpContext.doAjaxLoad(131, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
   }

   public void e2124D2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV80GridActions == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV80GridActions == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      AV80GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e1224D2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1424D2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( (0==AV48BarPiePie) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar Piezas", ""));
         GX_FocusControl = edtavBarpiepie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV44AlbRecCod) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion nulo", ""));
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV54BarUniMed, "K") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46BarPieKil)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Kilos", ""));
               GX_FocusControl = edtavBarpiekil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( GXutil.strcmp(AV54BarUniMed, "M") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47BarPieMet)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Metros", ""));
                  GX_FocusControl = edtavBarpiemet_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXv_decimal10[0] = AV74KilosDisp ;
                  GXv_decimal11[0] = AV73MetrosDisp ;
                  GXv_int12[0] = AV75PiezasDisp ;
                  GXv_char6[0] = AV72Errmessages ;
                  new app.unidadespiezasdisponibles(remoteHandle, context).execute( AV41EmprCod, AV44AlbRecCod, AV54BarUniMed, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_char6) ;
                  hojaderuta__piezas_impl.this.AV74KilosDisp = GXv_decimal10[0] ;
                  hojaderuta__piezas_impl.this.AV73MetrosDisp = GXv_decimal11[0] ;
                  hojaderuta__piezas_impl.this.AV75PiezasDisp = GXv_int12[0] ;
                  hojaderuta__piezas_impl.this.AV72Errmessages = GXv_char6[0] ;
                  if ( ! (GXutil.strcmp("", AV72Errmessages)==0) )
                  {
                     httpContext.GX_msglist.addItem(AV72Errmessages);
                     GX_FocusControl = edtavAlbreccod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV54BarUniMed, "M") == 0 ) && ( DecimalUtil.compareTo(AV47BarPieMet, AV73MetrosDisp) > 0 ) )
                     {
                        Gx_msg = httpContext.getMessage( "Los metros ", "") + GXutil.trim( GXutil.str( AV47BarPieMet, 9, 2)) + httpContext.getMessage( " es mayor a los disponibles ", "") + GXutil.trim( GXutil.str( AV73MetrosDisp, 9, 2)) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                        GX_FocusControl = edtavAlbreccod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV54BarUniMed, "K") == 0 ) && ( DecimalUtil.compareTo(AV46BarPieKil, AV74KilosDisp) > 0 ) )
                        {
                           Gx_msg = httpContext.getMessage( "Los kilos ", "") + GXutil.trim( GXutil.str( AV46BarPieKil, 9, 2)) + httpContext.getMessage( " es mayor a los disponibles ", "") + GXutil.trim( GXutil.str( AV74KilosDisp, 9, 2)) ;
                           httpContext.GX_msglist.addItem(Gx_msg);
                           GX_FocusControl = edtavAlbreccod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void e1324D2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1524D2( )
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

   public void S172( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta_pieza", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV51BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV81Barpiecod_Selected = A200BarPieCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Barpiecod_Selected", AV81Barpiecod_Selected);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S192( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV41EmprCod ;
      GXv_int12[0] = AV49BarCod ;
      GXv_int2[0] = AV50BarCodReo ;
      GXv_char5[0] = AV51BarCodPar ;
      GXv_char4[0] = AV81Barpiecod_Selected ;
      new app.eliminarregistrobarpie(remoteHandle, context).execute( GXv_char6, GXv_int12, GXv_int2, GXv_char5, GXv_char4) ;
      hojaderuta__piezas_impl.this.AV41EmprCod = GXv_char6[0] ;
      hojaderuta__piezas_impl.this.AV49BarCod = GXv_int12[0] ;
      hojaderuta__piezas_impl.this.AV50BarCodReo = GXv_int2[0] ;
      hojaderuta__piezas_impl.this.AV51BarCodPar = GXv_char5[0] ;
      hojaderuta__piezas_impl.this.AV81Barpiecod_Selected = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV81Barpiecod_Selected", AV81Barpiecod_Selected);
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV76BarpieCod = GXutil.str( AV44AlbRecCod, 8, 0) ;
      AV46BarPieKil = ((GXutil.strcmp(AV54BarUniMed, httpContext.getMessage( "M", ""))==0) ? AV47BarPieMet.multiply(DecimalUtil.doubleToDec(AV55BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV46BarPieKil) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
      GXv_char6[0] = AV41EmprCod ;
      GXv_int12[0] = AV49BarCod ;
      GXv_int2[0] = AV50BarCodReo ;
      GXv_char5[0] = AV51BarCodPar ;
      GXv_int13[0] = AV44AlbRecCod ;
      GXv_char4[0] = AV76BarpieCod ;
      GXv_decimal11[0] = AV46BarPieKil ;
      GXv_decimal10[0] = AV47BarPieMet ;
      GXv_int14[0] = AV48BarPiePie ;
      new app.paltpin(remoteHandle, context).execute( GXv_char6, GXv_int12, GXv_int2, GXv_char5, GXv_int13, GXv_char4, GXv_decimal11, GXv_decimal10, GXv_int14) ;
      hojaderuta__piezas_impl.this.AV41EmprCod = GXv_char6[0] ;
      hojaderuta__piezas_impl.this.AV49BarCod = GXv_int12[0] ;
      hojaderuta__piezas_impl.this.AV50BarCodReo = GXv_int2[0] ;
      hojaderuta__piezas_impl.this.AV51BarCodPar = GXv_char5[0] ;
      hojaderuta__piezas_impl.this.AV44AlbRecCod = GXv_int13[0] ;
      hojaderuta__piezas_impl.this.AV76BarpieCod = GXv_char4[0] ;
      hojaderuta__piezas_impl.this.AV46BarPieKil = GXv_decimal11[0] ;
      hojaderuta__piezas_impl.this.AV47BarPieMet = GXv_decimal10[0] ;
      hojaderuta__piezas_impl.this.AV48BarPiePie = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44AlbRecCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
      if ( AV67TinEst == 1 )
      {
         GXv_char6[0] = AV41EmprCod ;
         GXv_int14[0] = AV53Discod ;
         GXv_decimal11[0] = AV47BarPieMet ;
         GXv_int13[0] = AV48BarPiePie ;
         new app.pcreoemp(remoteHandle, context).execute( GXv_char6, GXv_int14, GXv_decimal11, GXv_int13) ;
         hojaderuta__piezas_impl.this.AV41EmprCod = GXv_char6[0] ;
         hojaderuta__piezas_impl.this.AV53Discod = GXv_int14[0] ;
         hojaderuta__piezas_impl.this.AV47BarPieMet = GXv_decimal11[0] ;
         hojaderuta__piezas_impl.this.AV48BarPiePie = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV53Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Discod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
      }
      if ( GXutil.strcmp(AV77BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char6[0] = AV41EmprCod ;
         GXv_int14[0] = AV49BarCod ;
         GXv_int2[0] = AV50BarCodReo ;
         GXv_char5[0] = AV51BarCodPar ;
         new app.pactagr(remoteHandle, context).execute( GXv_char6, GXv_int14, GXv_int2, GXv_char5) ;
         hojaderuta__piezas_impl.this.AV41EmprCod = GXv_char6[0] ;
         hojaderuta__piezas_impl.this.AV49BarCod = GXv_int14[0] ;
         hojaderuta__piezas_impl.this.AV50BarCodReo = GXv_int2[0] ;
         hojaderuta__piezas_impl.this.AV51BarCodPar = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
      }
      AV44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44AlbRecCod), 8, 0));
      AV46BarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
      AV47BarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
      AV48BarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV84Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV84Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV84Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV20TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAlbRecCod), 8, 0));
            AV21TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV22TFAlbREnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFAlbREnt", AV22TFAlbREnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV23TFAlbREnt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFAlbREnt_Sel", AV23TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV24TFBarPieKil = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFBarPieKil", GXutil.ltrimstr( AV24TFBarPieKil, 9, 2));
            AV25TFBarPieKil_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFBarPieKil_To", GXutil.ltrimstr( AV25TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV26TFBarPieMet = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFBarPieMet", GXutil.ltrimstr( AV26TFBarPieMet, 9, 2));
            AV27TFBarPieMet_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFBarPieMet_To", GXutil.ltrimstr( AV27TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEPIE") == 0 )
         {
            AV28TFBarPiePie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarPiePie), 6, 0));
            AV29TFBarPiePie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarPiePie_To), 6, 0));
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFAlbREnt_Sel)==0), AV23TFAlbREnt_Sel, GXv_char6) ;
      hojaderuta__piezas_impl.this.GXt_char3 = GXv_char6[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char3+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFAlbREnt)==0), AV22TFAlbREnt, GXv_char6) ;
      hojaderuta__piezas_impl.this.GXt_char3 = GXv_char6[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV20TFAlbRecCod) ? "" : GXutil.str( AV20TFAlbRecCod, 8, 0))+"|"+GXt_char3+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFBarPieKil)==0) ? "" : GXutil.str( AV24TFBarPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarPieMet)==0) ? "" : GXutil.str( AV26TFBarPieMet, 9, 2))+"|"+((0==AV28TFBarPiePie) ? "" : GXutil.str( AV28TFBarPiePie, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV21TFAlbRecCod_To) ? "" : GXutil.str( AV21TFAlbRecCod_To, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFBarPieKil_To)==0) ? "" : GXutil.str( AV25TFBarPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarPieMet_To)==0) ? "" : GXutil.str( AV27TFBarPieMet_To, 9, 2))+"|"+((0==AV29TFBarPiePie_To) ? "" : GXutil.str( AV29TFBarPiePie_To, 6, 0)) ;
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
      AV10GridState.fromxml(AV19Session.getValue(AV84Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBRECCOD", "", !((0==AV20TFAlbRecCod)&&(0==AV21TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV20TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV21TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBRENT", "", !(GXutil.strcmp("", AV22TFAlbREnt)==0), (short)(0), AV22TFAlbREnt, "", !(GXutil.strcmp("", AV23TFAlbREnt_Sel)==0), AV23TFAlbREnt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFBarPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFBarPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV24TFBarPieKil, 9, 2)), GXutil.trim( GXutil.str( AV25TFBarPieKil_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV26TFBarPieMet, 9, 2)), GXutil.trim( GXutil.str( AV27TFBarPieMet_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARPIEPIE", "", !((0==AV28TFBarPiePie)&&(0==AV29TFBarPiePie_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFBarPiePie, 6, 0)), GXutil.trim( GXutil.str( AV29TFBarPiePie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV84Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_Pieza" );
      AV19Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV34TotBarPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TotBarPieKil", GXutil.ltrimstr( AV34TotBarPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEKIL", getSecureSignedToken( "", localUtil.format( AV34TotBarPieKil, "ZZZZZ9.99")));
      AV36TotBarPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TotBarPieMet", GXutil.ltrimstr( AV36TotBarPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEMET", getSecureSignedToken( "", localUtil.format( AV36TotBarPieMet, "ZZZZZ9.99")));
      AV38TotBarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TotBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TotBarPiePie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38TotBarPiePie), "ZZZ9")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV20TFAlbRecCod ;
      AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV21TFAlbRecCod_To ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV22TFAlbREnt ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV23TFAlbREnt_Sel ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV24TFBarPieKil ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV25TFBarPieKil_To ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV26TFBarPieMet ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV27TFBarPieMet_To ;
      AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV28TFBarPiePie ;
      AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV29TFBarPiePie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) ,
                                           Integer.valueOf(AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) ,
                                           AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                           AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                           AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                           AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                           AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                           AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                           Integer.valueOf(AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) ,
                                           Integer.valueOf(AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           AV41EmprCod ,
                                           Integer.valueOf(AV49BarCod) ,
                                           Byte.valueOf(AV50BarCodReo) ,
                                           AV51BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = GXutil.padr( GXutil.rtrim( AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent), 8, "%") ;
      /* Using cursor H024D4 */
      pr_default.execute(2, new Object[] {AV41EmprCod, Integer.valueOf(AV49BarCod), Byte.valueOf(AV50BarCodReo), AV51BarCodPar, Integer.valueOf(AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod), Integer.valueOf(AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to), lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent, AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel, AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil, AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to, AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet, AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to, Integer.valueOf(AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie), Integer.valueOf(AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H024D4_A130BarCodPar[0] ;
         A132BarCodReo = H024D4_A132BarCodReo[0] ;
         A129BarCod = H024D4_A129BarCod[0] ;
         A396EmprCod = H024D4_A396EmprCod[0] ;
         A1501BarPiePie = H024D4_A1501BarPiePie[0] ;
         A205BarPieMet = H024D4_A205BarPieMet[0] ;
         A203BarPieKil = H024D4_A203BarPieKil[0] ;
         A46AlbREnt = H024D4_A46AlbREnt[0] ;
         A44AlbRecCod = H024D4_A44AlbRecCod[0] ;
         A46AlbREnt = H024D4_A46AlbREnt[0] ;
         AV34TotBarPieKil = A203BarPieKil.add(AV34TotBarPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34TotBarPieKil", GXutil.ltrimstr( AV34TotBarPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEKIL", getSecureSignedToken( "", localUtil.format( AV34TotBarPieKil, "ZZZZZ9.99")));
         AV36TotBarPieMet = A205BarPieMet.add(AV36TotBarPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36TotBarPieMet", GXutil.ltrimstr( AV36TotBarPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEMET", getSecureSignedToken( "", localUtil.format( AV36TotBarPieMet, "ZZZZZ9.99")));
         AV38TotBarPiePie = (long)(A1501BarPiePie+AV38TotBarPiePie) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38TotBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TotBarPiePie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIEPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38TotBarPiePie), "ZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV35TotValueBarPieKil = localUtil.format( AV34TotBarPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TotValueBarPieKil", AV35TotValueBarPieKil);
      AV37TotValueBarPieMet = localUtil.format( AV36TotBarPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TotValueBarPieMet", AV37TotValueBarPieMet);
      AV39TotValueBarPiePie = localUtil.format( DecimalUtil.doubleToDec(AV38TotBarPiePie), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TotValueBarPiePie", AV39TotValueBarPiePie);
   }

   public void e1624D2( )
   {
      /* Albreccod_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_decimal11[0] = AV46BarPieKil ;
      GXv_decimal10[0] = AV47BarPieMet ;
      GXv_int14[0] = AV48BarPiePie ;
      GXv_char6[0] = AV72Errmessages ;
      new app.unidadespiezasdisponibles(remoteHandle, context).execute( AV41EmprCod, AV44AlbRecCod, AV54BarUniMed, GXv_decimal11, GXv_decimal10, GXv_int14, GXv_char6) ;
      hojaderuta__piezas_impl.this.AV46BarPieKil = GXv_decimal11[0] ;
      hojaderuta__piezas_impl.this.AV47BarPieMet = GXv_decimal10[0] ;
      hojaderuta__piezas_impl.this.AV48BarPiePie = GXv_int14[0] ;
      hojaderuta__piezas_impl.this.AV72Errmessages = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
      if ( ! (GXutil.strcmp("", AV72Errmessages)==0) )
      {
         httpContext.GX_msglist.addItem(AV72Errmessages);
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e1724D2( )
   {
      /* Promptalbrec_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.consultaalmacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV52CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutAlbRecCod","CliCod","OutAlbRUniDis","OutAlbRPieDis"}) , new Object[] {"AV41EmprCod","AV44AlbRecCod","AV52CliCod","AV78Albrunidis","AV79albrpiedis"});
      AV48BarPiePie = AV79albrpiedis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarPiePie), 6, 0));
      if ( GXutil.strcmp(AV54BarUniMed, "K") == 0 )
      {
         AV46BarPieKil = AV78Albrunidis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarPieKil", GXutil.ltrimstr( AV46BarPieKil, 9, 2));
      }
      else
      {
         AV47BarPieMet = AV78Albrunidis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarPieMet", GXutil.ltrimstr( AV47BarPieMet, 9, 2));
      }
      /*  Sending Event outputs  */
   }

   public void wb_table4_172_24D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_172_24D2e( true) ;
      }
      else
      {
         wb_table4_172_24D2e( false) ;
      }
   }

   public void wb_table3_167_24D2( boolean wbgen )
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
         wb_table3_167_24D2e( true) ;
      }
      else
      {
         wb_table3_167_24D2e( false) ;
      }
   }

   public void wb_table2_141_24D2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpiekil_Internalname, httpContext.getMessage( "Tot Value Bar Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpiekil_Internalname, AV35TotValueBarPieKil, GXutil.rtrim( localUtil.format( AV35TotValueBarPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpiemet_Internalname, httpContext.getMessage( "Tot Value Bar Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpiemet_Internalname, AV37TotValueBarPieMet, GXutil.rtrim( localUtil.format( AV37TotValueBarPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpiepie_Internalname, httpContext.getMessage( "Tot Value Bar Pie Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_131_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpiepie_Internalname, AV39TotValueBarPiePie, GXutil.rtrim( localUtil.format( AV39TotValueBarPiePie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpiepie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpiepie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Piezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_141_24D2e( true) ;
      }
      else
      {
         wb_table2_141_24D2e( false) ;
      }
   }

   public void wb_table1_120_24D2( boolean wbgen )
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
         wb_table1_120_24D2e( true) ;
      }
      else
      {
         wb_table1_120_24D2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV41EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      AV49BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
      AV50BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
      AV51BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
      AV52CliCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52CliCod), 6, 0));
      AV53Discod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Discod), 8, 0));
      AV54BarUniMed = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54BarUniMed", AV54BarUniMed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54BarUniMed, "@!"))));
      AV55BarPes = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55BarPes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55BarPes), "ZZZ9")));
      AV56BarSer = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56BarSer", AV56BarSer);
      AV57PedidoCliente = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57PedidoCliente", AV57PedidoCliente);
      AV58BarColNom = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58BarColNom", AV58BarColNom);
      AV59BarColNum = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarColNum), 6, 0));
      AV60BarPie = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarPie), 6, 0));
      AV61BarKgm = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61BarKgm", GXutil.ltrimstr( AV61BarKgm, 9, 2));
      AV62BarMtr = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62BarMtr", GXutil.ltrimstr( AV62BarMtr, 9, 2));
      AV63CliNom = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63CliNom", AV63CliNom);
      AV64BarSerDsc = (String)getParm(obj,16) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64BarSerDsc", AV64BarSerDsc);
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
      pa24D2( ) ;
      ws24D2( ) ;
      we24D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614463", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta__piezas.js", "?20268211614464", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1312( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_131_idx );
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_131_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_131_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_131_idx ;
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_131_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_131_idx ;
      edtBarPiePie_Internalname = "BARPIEPIE_"+sGXsfl_131_idx ;
   }

   public void subsflControlProps_fel_1312( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_131_fel_idx );
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_131_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_131_fel_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_131_fel_idx ;
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_131_fel_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_131_fel_idx ;
      edtBarPiePie_Internalname = "BARPIEPIE_"+sGXsfl_131_fel_idx ;
   }

   public void sendrow_1312( )
   {
      subsflControlProps_1312( ) ;
      wb24D0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_131_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_131_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_131_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 132,'',false,'"+sGXsfl_131_idx+"',131)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_131_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV80GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV80GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV80GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_131_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,132);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_131_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt_Internalname,GXutil.rtrim( A46AlbREnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbREnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(131),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes24D2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_131_idx = ((subGrid_Islastpage==1)&&(nGXsfl_131_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_131_idx+1) ;
         sGXsfl_131_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_131_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1312( ) ;
      }
      /* End function sendrow_1312 */
   }

   public void startgridcontrol131( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"131\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Nº Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A46AlbREnt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpes_Internalname = "vBARPES" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      imgavPromptalbrec_Internalname = "vPROMPTALBREC" ;
      edtavBarpiekil_Internalname = "vBARPIEKIL" ;
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      edtavBarpiepie_Internalname = "vBARPIEPIE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      edtBarPiePie_Internalname = "BARPIEPIE" ;
      edtavTotvaluebarpiekil_Internalname = "vTOTVALUEBARPIEKIL" ;
      edtavTotvaluebarpiemet_Internalname = "vTOTVALUEBARPIEMET" ;
      edtavTotvaluebarpiepie_Internalname = "vTOTVALUEBARPIEPIE" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      divGridtablewithtotalizers_Internalname = "GRIDTABLEWITHTOTALIZERS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieKil_Jsonclick = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtBarPieCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluebarpiepie_Jsonclick = "" ;
      edtavTotvaluebarpiepie_Enabled = 1 ;
      edtavTotvaluebarpiemet_Jsonclick = "" ;
      edtavTotvaluebarpiemet_Enabled = 1 ;
      edtavTotvaluebarpiekil_Jsonclick = "" ;
      edtavTotvaluebarpiekil_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarpiepie_Jsonclick = "" ;
      edtavBarpiepie_Enabled = 1 ;
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Enabled = 1 ;
      edtavBarpiekil_Jsonclick = "" ;
      edtavBarpiekil_Enabled = 1 ;
      imgavPromptalbrec_Jsonclick = "" ;
      imgavPromptalbrec_gximage = "" ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavAlbreccod_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 0 ;
      edtavBarpes_Jsonclick = "" ;
      edtavBarpes_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.HojadeRuta__PiezasGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|||" ;
      Ddo_grid_Includedatalist = "|T|||" ;
      Ddo_grid_Filterisrange = "T||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6" ;
      Ddo_grid_Columnids = "2:AlbRecCod|3:AlbREnt|4:BarPieKil|5:BarPieMet|6:BarPiePie" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = "" ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
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
      Form.setCaption( httpContext.getMessage( " Modificacion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_131_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV80GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV80GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1124D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2024D2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2124D2',iparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV81Barpiecod_Selected',fld:'vBARPIECOD_SELECTED',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1224D2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV81Barpiecod_Selected',fld:'vBARPIECOD_SELECTED',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV81Barpiecod_Selected',fld:'vBARPIECOD_SELECTED',pic:''},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1424D2',iparms:[{av:'AV48BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV44AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV46BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV47BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1324D2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV44AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV46BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV48BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV53Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV46BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV48BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV44AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1524D2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED","{handler:'e1624D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV44AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV48BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV46BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("VPROMPTALBREC.CLICK","{handler:'e1724D2',iparms:[{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true}]");
      setEventMetadata("VPROMPTALBREC.CLICK",",oparms:[{av:'AV52CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV46BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV47BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV67TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV77BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV54BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV55BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV20TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV21TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV23TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV24TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV25TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV27TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV29TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV34TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV36TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV38TotBarPiePie',fld:'vTOTBARPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV35TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV37TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''},{av:'AV39TotValueBarPiePie',fld:'vTOTVALUEBARPIEPIE',pic:''}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barpiepie',iparms:[]");
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
      wcpOAV41EmprCod = "" ;
      wcpOAV51BarCodPar = "" ;
      wcpOAV54BarUniMed = "" ;
      wcpOAV56BarSer = "" ;
      wcpOAV57PedidoCliente = "" ;
      wcpOAV58BarColNom = "" ;
      wcpOAV61BarKgm = DecimalUtil.ZERO ;
      wcpOAV62BarMtr = DecimalUtil.ZERO ;
      wcpOAV63CliNom = "" ;
      wcpOAV64BarSerDsc = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV41EmprCod = "" ;
      AV51BarCodPar = "" ;
      AV54BarUniMed = "" ;
      AV56BarSer = "" ;
      AV57PedidoCliente = "" ;
      AV58BarColNom = "" ;
      AV61BarKgm = DecimalUtil.ZERO ;
      AV62BarMtr = DecimalUtil.ZERO ;
      AV63CliNom = "" ;
      AV64BarSerDsc = "" ;
      AV22TFAlbREnt = "" ;
      AV23TFAlbREnt_Sel = "" ;
      AV24TFBarPieKil = DecimalUtil.ZERO ;
      AV25TFBarPieKil_To = DecimalUtil.ZERO ;
      AV26TFBarPieMet = DecimalUtil.ZERO ;
      AV27TFBarPieMet_To = DecimalUtil.ZERO ;
      AV84Pgmname = "" ;
      AV34TotBarPieKil = DecimalUtil.ZERO ;
      AV36TotBarPieMet = DecimalUtil.ZERO ;
      AV77BarAgrEst = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV30DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV81Barpiecod_Selected = "" ;
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
      ClassString = "" ;
      StyleString = "" ;
      AV45promptalbrec = "" ;
      AV85Promptalbrec_GXI = "" ;
      sImgUrl = "" ;
      AV46BarPieKil = DecimalUtil.ZERO ;
      AV47BarPieMet = DecimalUtil.ZERO ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = "" ;
      AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = "" ;
      AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      A46AlbREnt = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = "" ;
      H024D2_A130BarCodPar = new String[] {""} ;
      H024D2_A132BarCodReo = new byte[1] ;
      H024D2_A129BarCod = new int[1] ;
      H024D2_A396EmprCod = new String[] {""} ;
      H024D2_A1501BarPiePie = new int[1] ;
      H024D2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024D2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024D2_A46AlbREnt = new String[] {""} ;
      H024D2_A44AlbRecCod = new int[1] ;
      H024D2_A200BarPieCod = new String[] {""} ;
      H024D3_AGRID_nRecordCount = new long[1] ;
      AV35TotValueBarPieKil = "" ;
      AV37TotValueBarPieMet = "" ;
      AV39TotValueBarPiePie = "" ;
      hsh = "" ;
      AV40Station = "" ;
      AV42EmprNom = "" ;
      AV43UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV74KilosDisp = DecimalUtil.ZERO ;
      AV73MetrosDisp = DecimalUtil.ZERO ;
      AV72Errmessages = "" ;
      Gx_msg = "" ;
      AV76BarpieCod = "" ;
      GXv_int12 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char3 = "" ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H024D4_A200BarPieCod = new String[] {""} ;
      H024D4_A130BarCodPar = new String[] {""} ;
      H024D4_A132BarCodReo = new byte[1] ;
      H024D4_A129BarCod = new int[1] ;
      H024D4_A396EmprCod = new String[] {""} ;
      H024D4_A1501BarPiePie = new int[1] ;
      H024D4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024D4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H024D4_A46AlbREnt = new String[] {""} ;
      H024D4_A44AlbRecCod = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int14 = new int[1] ;
      GXv_char6 = new String[1] ;
      AV78Albrunidis = DecimalUtil.ZERO ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__piezas__default(),
         new Object[] {
             new Object[] {
            H024D2_A130BarCodPar, H024D2_A132BarCodReo, H024D2_A129BarCod, H024D2_A396EmprCod, H024D2_A1501BarPiePie, H024D2_A205BarPieMet, H024D2_A203BarPieKil, H024D2_A46AlbREnt, H024D2_A44AlbRecCod, H024D2_A200BarPieCod
            }
            , new Object[] {
            H024D3_AGRID_nRecordCount
            }
            , new Object[] {
            H024D4_A200BarPieCod, H024D4_A130BarCodPar, H024D4_A132BarCodReo, H024D4_A129BarCod, H024D4_A396EmprCod, H024D4_A1501BarPiePie, H024D4_A205BarPieMet, H024D4_A203BarPieKil, H024D4_A46AlbREnt, H024D4_A44AlbRecCod
            }
         }
      );
      AV84Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Piezas" ;
      /* GeneXus formulas. */
      AV84Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Piezas" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpes_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavTotvaluebarpiekil_Enabled = 0 ;
      edtavTotvaluebarpiemet_Enabled = 0 ;
      edtavTotvaluebarpiepie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV50BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV50BarCodReo ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV55BarPes ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV55BarPes ;
   private short AV12OrderedBy ;
   private short AV67TinEst ;
   private short wbEnd ;
   private short wbStart ;
   private short AV80GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68Vertic ;
   private short AV69Tela ;
   private short AV70Erfoc ;
   private short AV71TTRN22 ;
   private int wcpOAV49BarCod ;
   private int wcpOAV52CliCod ;
   private int wcpOAV53Discod ;
   private int wcpOAV59BarColNum ;
   private int wcpOAV60BarPie ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_131 ;
   private int AV49BarCod ;
   private int AV52CliCod ;
   private int AV53Discod ;
   private int AV59BarColNum ;
   private int AV60BarPie ;
   private int nGXsfl_131_idx=1 ;
   private int AV20TFAlbRecCod ;
   private int AV21TFAlbRecCod_To ;
   private int AV28TFBarPiePie ;
   private int AV29TFBarPiePie_To ;
   private int A129BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpes_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int AV44AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int edtavBarpiekil_Enabled ;
   private int edtavBarpiemet_Enabled ;
   private int AV48BarPiePie ;
   private int edtavBarpiepie_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod ;
   private int AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to ;
   private int AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie ;
   private int AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebarpiekil_Enabled ;
   private int edtavTotvaluebarpiemet_Enabled ;
   private int edtavTotvaluebarpiepie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV75PiezasDisp ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int AV97GXV1 ;
   private int GXv_int14[] ;
   private int AV79albrpiedis ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV38TotBarPiePie ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV61BarKgm ;
   private java.math.BigDecimal wcpOAV62BarMtr ;
   private java.math.BigDecimal AV61BarKgm ;
   private java.math.BigDecimal AV62BarMtr ;
   private java.math.BigDecimal AV24TFBarPieKil ;
   private java.math.BigDecimal AV25TFBarPieKil_To ;
   private java.math.BigDecimal AV26TFBarPieMet ;
   private java.math.BigDecimal AV27TFBarPieMet_To ;
   private java.math.BigDecimal AV34TotBarPieKil ;
   private java.math.BigDecimal AV36TotBarPieMet ;
   private java.math.BigDecimal AV46BarPieKil ;
   private java.math.BigDecimal AV47BarPieMet ;
   private java.math.BigDecimal AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ;
   private java.math.BigDecimal AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ;
   private java.math.BigDecimal AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV74KilosDisp ;
   private java.math.BigDecimal AV73MetrosDisp ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV78Albrunidis ;
   private String wcpOAV41EmprCod ;
   private String wcpOAV51BarCodPar ;
   private String wcpOAV54BarUniMed ;
   private String wcpOAV56BarSer ;
   private String wcpOAV57PedidoCliente ;
   private String wcpOAV58BarColNom ;
   private String wcpOAV63CliNom ;
   private String wcpOAV64BarSerDsc ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV41EmprCod ;
   private String AV51BarCodPar ;
   private String AV54BarUniMed ;
   private String AV56BarSer ;
   private String AV57PedidoCliente ;
   private String AV58BarColNom ;
   private String AV63CliNom ;
   private String AV64BarSerDsc ;
   private String sGXsfl_131_idx="0001" ;
   private String AV22TFAlbREnt ;
   private String AV23TFAlbREnt_Sel ;
   private String AV84Pgmname ;
   private String AV77BarAgrEst ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV81Barpiecod_Selected ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpes_Internalname ;
   private String edtavBarpes_Jsonclick ;
   private String edtavBarunimed_Internalname ;
   private String edtavBarunimed_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbreccod_Internalname ;
   private String TempTags ;
   private String edtavAlbreccod_Jsonclick ;
   private String imgavPromptalbrec_Internalname ;
   private String ClassString ;
   private String imgavPromptalbrec_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgavPromptalbrec_Jsonclick ;
   private String edtavBarpiekil_Internalname ;
   private String edtavBarpiekil_Jsonclick ;
   private String edtavBarpiemet_Internalname ;
   private String edtavBarpiemet_Jsonclick ;
   private String edtavBarpiepie_Internalname ;
   private String edtavBarpiepie_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
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
   private String AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ;
   private String AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Internalname ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPiePie_Internalname ;
   private String edtavTotvaluebarpiekil_Internalname ;
   private String edtavTotvaluebarpiemet_Internalname ;
   private String edtavTotvaluebarpiepie_Internalname ;
   private String scmdbuf ;
   private String lV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ;
   private String hsh ;
   private String AV40Station ;
   private String AV42EmprNom ;
   private String AV43UsurCod ;
   private String Gx_msg ;
   private String AV76BarpieCod ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char6[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarpiekil_Jsonclick ;
   private String edtavTotvaluebarpiemet_Jsonclick ;
   private String edtavTotvaluebarpiepie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_131_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbREnt_Jsonclick ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPiePie_Jsonclick ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean AV45promptalbrec_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_131_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV85Promptalbrec_GXI ;
   private String AV35TotValueBarPieKil ;
   private String AV37TotValueBarPieMet ;
   private String AV39TotValueBarPiePie ;
   private String AV72Errmessages ;
   private String AV45promptalbrec ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H024D2_A130BarCodPar ;
   private byte[] H024D2_A132BarCodReo ;
   private int[] H024D2_A129BarCod ;
   private String[] H024D2_A396EmprCod ;
   private int[] H024D2_A1501BarPiePie ;
   private java.math.BigDecimal[] H024D2_A205BarPieMet ;
   private java.math.BigDecimal[] H024D2_A203BarPieKil ;
   private String[] H024D2_A46AlbREnt ;
   private int[] H024D2_A44AlbRecCod ;
   private String[] H024D2_A200BarPieCod ;
   private long[] H024D3_AGRID_nRecordCount ;
   private String[] H024D4_A200BarPieCod ;
   private String[] H024D4_A130BarCodPar ;
   private byte[] H024D4_A132BarCodReo ;
   private int[] H024D4_A129BarCod ;
   private String[] H024D4_A396EmprCod ;
   private int[] H024D4_A1501BarPiePie ;
   private java.math.BigDecimal[] H024D4_A205BarPieMet ;
   private java.math.BigDecimal[] H024D4_A203BarPieKil ;
   private String[] H024D4_A46AlbREnt ;
   private int[] H024D4_A44AlbRecCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV30DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class hojaderuta__piezas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H024D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod ,
                                          int AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                          java.math.BigDecimal AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                          java.math.BigDecimal AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                          int AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie ,
                                          int AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV41EmprCod ,
                                          int AV49BarCod ,
                                          byte AV50BarCodReo ,
                                          String AV51BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[19];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.AlbREnt, T1.AlbRecCod, T1.BarPieCod" ;
      sFromString = " FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbREnt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbREnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieKil" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieMet" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPiePie" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPiePie DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H024D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod ,
                                          int AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                          java.math.BigDecimal AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                          java.math.BigDecimal AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                          int AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie ,
                                          int AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV41EmprCod ,
                                          int AV49BarCod ,
                                          byte AV50BarCodReo ,
                                          String AV51BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[14];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H024D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod ,
                                          int AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                          java.math.BigDecimal AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                          java.math.BigDecimal AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                          int AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie ,
                                          int AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          String AV41EmprCod ,
                                          int AV49BarCod ,
                                          byte AV50BarCodReo ,
                                          String AV51BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[14];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.BarPieCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.AlbREnt, T1.AlbRecCod FROM (TXPBARPIE T1 INNER" ;
      scmdbuf += " JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV86Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
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
                  return conditional_H024D2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H024D3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] );
            case 2 :
                  return conditional_H024D4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H024D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
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
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
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
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
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
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               return;
            case 2 :
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
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
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
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               return;
      }
   }

}

