package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webdatospedidocolor_impl extends GXDataArea
{
   public webdatospedidocolor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webdatospedidocolor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdatospedidocolor_impl.class ));
   }

   public webdatospedidocolor_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccionar = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Seleccion") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Seleccion") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Seleccion") ;
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
            AV33Seleccion = GXutil.strtobool( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Seleccion", AV33Seleccion);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSELECCION", getSecureSignedToken( "", AV33Seleccion));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
               AV13CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CliCod), "ZZZZZ9")));
               AV126pForSer = httpContext.GetPar( "pForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV126pForSer", AV126pForSer);
               AV19ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19ForColNom", AV19ForColNom);
               AV20ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
               AV8TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
               AV6ForNumCli = (int)(GXutil.lval( httpContext.GetPar( "ForNumCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ForNumCli), 6, 0));
               AV5ForNomCli = httpContext.GetPar( "ForNomCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5ForNomCli", AV5ForNomCli);
               AV7ForTonal = httpContext.GetPar( "ForTonal") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ForTonal", AV7ForTonal);
               AV25Realizado = GXutil.strtobool( httpContext.GetPar( "Realizado")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Realizado", AV25Realizado);
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      chkavSeleccionar.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_35_Refreshing);
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
      AV44FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV18EmprCod = httpContext.GetPar( "EmprCod") ;
      AV13CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV126pForSer = httpContext.GetPar( "pForSer") ;
      AV55ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV50ColumnsSelector);
      AV60TFForSer = httpContext.GetPar( "TFForSer") ;
      AV61TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV62TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV63TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV64TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV65TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV66TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV67TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV72TFForNomCli = httpContext.GetPar( "TFForNomCli") ;
      AV73TFForNomCli_Sel = httpContext.GetPar( "TFForNomCli_Sel") ;
      AV70TFForNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCli"))) ;
      AV71TFForNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCli_To"))) ;
      AV108TFForTonal = httpContext.GetPar( "TFForTonal") ;
      AV109TFForTonal_Sel = httpContext.GetPar( "TFForTonal_Sel") ;
      AV157Pgmname = httpContext.GetPar( "Pgmname") ;
      AV41OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV42OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      chkavSeleccionar.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_35_Refreshing);
      AV33Seleccion = GXutil.strtobool( httpContext.GetPar( "Seleccion")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV44FilterFullText, AV18EmprCod, AV13CliCod, AV126pForSer, AV55ManageFiltersExecutionStep, AV50ColumnsSelector, AV60TFForSer, AV61TFForSer_Sel, AV62TFForColNom, AV63TFForColNom_Sel, AV64TFForColNum, AV65TFForColNum_To, AV66TFTipColCod, AV67TFTipColCod_To, AV72TFForNomCli, AV73TFForNomCli_Sel, AV70TFForNumCli, AV71TFForNumCli_To, AV108TFForTonal, AV109TFForTonal_Sel, AV157Pgmname, AV41OrderedBy, AV42OrderedDsc, AV33Seleccion) ;
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
      paDD2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDD2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webdatospedidocolor", new String[] {GXutil.URLEncode(GXutil.booltostr(AV33Seleccion)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV126pForSer)),GXutil.URLEncode(GXutil.rtrim(AV19ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV20ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6ForNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5ForNomCli)),GXutil.URLEncode(GXutil.rtrim(AV7ForTonal)),GXutil.URLEncode(GXutil.booltostr(AV25Realizado))}, new String[] {"Seleccion","EmprCod","CliCod","pForSer","ForColNom","ForColNum","TipColCod","ForNumCli","ForNomCli","ForTonal","Realizado"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSELECCION", getSecureSignedToken( "", AV33Seleccion));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CliCod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV44FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV53ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV53ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV120DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV120DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV50ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV50ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV55ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER", GXutil.rtrim( AV60TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER_SEL", GXutil.rtrim( AV61TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM", GXutil.rtrim( AV62TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM_SEL", GXutil.rtrim( AV63TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV64TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV65TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV66TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV67TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI", GXutil.rtrim( AV72TFForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI_SEL", GXutil.rtrim( AV73TFForNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV70TFForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV71TFForNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTONAL", GXutil.rtrim( AV108TFForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTONAL_SEL", GXutil.rtrim( AV109TFForTonal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV157Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV41OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV42OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV39GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV39GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vSELECCION", AV33Seleccion);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSELECCION", getSecureSignedToken( "", AV33Seleccion));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV13CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPFORSER", GXutil.rtrim( AV126pForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV19ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV20ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV8TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV6ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNOMCLI", GXutil.rtrim( AV5ForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORTONAL", GXutil.rtrim( AV7ForTonal));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREALIZADO", AV25Realizado);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "vSELECCIONAR_Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
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
         weDD2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDD2( ) ;
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
      return formatLink("app.webdatospedidocolor", new String[] {GXutil.URLEncode(GXutil.booltostr(AV33Seleccion)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV126pForSer)),GXutil.URLEncode(GXutil.rtrim(AV19ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV20ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6ForNumCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5ForNomCli)),GXutil.URLEncode(GXutil.rtrim(AV7ForTonal)),GXutil.URLEncode(GXutil.booltostr(AV25Realizado))}, new String[] {"Seleccion","EmprCod","CliCod","pForSer","ForColNom","ForColNum","TipColCod","ForNumCli","ForNomCli","ForTonal","Realizado"})  ;
   }

   public String getPgmname( )
   {
      return "WebDatosPedidoColor" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " LLAMADA DESDE WKP", "") ;
   }

   public void wbDD0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDatosPedidoColor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_DD2( true) ;
      }
      else
      {
         wb_table1_19_DD2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_DD2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol35( ) ;
      }
      if ( wbEnd == 35 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_35 = (int)(nGXsfl_35_idx-1) ;
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV120DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV120DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV50ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 35 )
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

   public void startDD2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " LLAMADA DESDE WKP", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDD0( ) ;
   }

   public void wsDD2( )
   {
      startDD2( ) ;
      evtDD2( ) ;
   }

   public void evtDD2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11DD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12DD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13DD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
                           AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
                           AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
                           AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
                           AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
                           AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
                           AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
                           AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
                           AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
                           AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
                           AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
                           AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
                           AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
                           AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
                           AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VSELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VSELECCIONAR.CLICK") == 0 ) )
                        {
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           AV45Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV45Seleccionar);
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
                           n1191ForNomCli = false ;
                           A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1192ForNumCli = false ;
                           A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
                           n995ForTonal = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e14DD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e15DD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e16DD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VSELECCIONAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e17DD2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV44FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
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

   public void weDD2( )
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

   public void paDD2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_352( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         sendrow_352( ) ;
         nGXsfl_35_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV44FilterFullText ,
                                 String AV18EmprCod ,
                                 int AV13CliCod ,
                                 String AV126pForSer ,
                                 byte AV55ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ,
                                 String AV60TFForSer ,
                                 String AV61TFForSer_Sel ,
                                 String AV62TFForColNom ,
                                 String AV63TFForColNom_Sel ,
                                 int AV64TFForColNum ,
                                 int AV65TFForColNum_To ,
                                 byte AV66TFTipColCod ,
                                 byte AV67TFTipColCod_To ,
                                 String AV72TFForNomCli ,
                                 String AV73TFForNomCli_Sel ,
                                 int AV70TFForNumCli ,
                                 int AV71TFForNumCli_To ,
                                 String AV108TFForTonal ,
                                 String AV109TFForTonal_Sel ,
                                 String AV157Pgmname ,
                                 short AV41OrderedBy ,
                                 boolean AV42OrderedDsc ,
                                 boolean AV33Seleccion )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e15DD2 ();
      GRID_nCurrentRecord = 0 ;
      rfDD2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNUMCLI", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1191ForNomCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNOMCLI", GXutil.rtrim( A1191ForNomCli));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfDD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV157Pgmname = "WebDatosPedidoColor" ;
      Gx_err = (short)(0) ;
   }

   public void rfDD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e15DD2 ();
      nGXsfl_35_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_352( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV142Webdatospedidocolords_1_filterfulltext ,
                                              AV144Webdatospedidocolords_3_tfforser_sel ,
                                              AV143Webdatospedidocolords_2_tfforser ,
                                              AV146Webdatospedidocolords_5_tfforcolnom_sel ,
                                              AV145Webdatospedidocolords_4_tfforcolnom ,
                                              Integer.valueOf(AV147Webdatospedidocolords_6_tfforcolnum) ,
                                              Integer.valueOf(AV148Webdatospedidocolords_7_tfforcolnum_to) ,
                                              Byte.valueOf(AV149Webdatospedidocolords_8_tftipcolcod) ,
                                              Byte.valueOf(AV150Webdatospedidocolords_9_tftipcolcod_to) ,
                                              AV152Webdatospedidocolords_11_tffornomcli_sel ,
                                              AV151Webdatospedidocolords_10_tffornomcli ,
                                              Integer.valueOf(AV153Webdatospedidocolords_12_tffornumcli) ,
                                              Integer.valueOf(AV154Webdatospedidocolords_13_tffornumcli_to) ,
                                              AV156Webdatospedidocolords_15_tffortonal_sel ,
                                              AV155Webdatospedidocolords_14_tffortonal ,
                                              AV126pForSer ,
                                              A494ForSer ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A1191ForNomCli ,
                                              Integer.valueOf(A1192ForNumCli) ,
                                              A995ForTonal ,
                                              Short.valueOf(AV41OrderedBy) ,
                                              Boolean.valueOf(AV42OrderedDsc) ,
                                              AV18EmprCod ,
                                              Integer.valueOf(AV13CliCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
         lV143Webdatospedidocolords_2_tfforser = GXutil.padr( GXutil.rtrim( AV143Webdatospedidocolords_2_tfforser), 16, "%") ;
         lV145Webdatospedidocolords_4_tfforcolnom = GXutil.padr( GXutil.rtrim( AV145Webdatospedidocolords_4_tfforcolnom), 13, "%") ;
         lV151Webdatospedidocolords_10_tffornomcli = GXutil.padr( GXutil.rtrim( AV151Webdatospedidocolords_10_tffornomcli), 13, "%") ;
         lV155Webdatospedidocolords_14_tffortonal = GXutil.padr( GXutil.rtrim( AV155Webdatospedidocolords_14_tffortonal), 20, "%") ;
         /* Using cursor H00DD2 */
         pr_default.execute(0, new Object[] {AV18EmprCod, Integer.valueOf(AV13CliCod), lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV143Webdatospedidocolords_2_tfforser, AV144Webdatospedidocolords_3_tfforser_sel, lV145Webdatospedidocolords_4_tfforcolnom, AV146Webdatospedidocolords_5_tfforcolnom_sel, Integer.valueOf(AV147Webdatospedidocolords_6_tfforcolnum), Integer.valueOf(AV148Webdatospedidocolords_7_tfforcolnum_to), Byte.valueOf(AV149Webdatospedidocolords_8_tftipcolcod), Byte.valueOf(AV150Webdatospedidocolords_9_tftipcolcod_to), lV151Webdatospedidocolords_10_tffornomcli, AV152Webdatospedidocolords_11_tffornomcli_sel, Integer.valueOf(AV153Webdatospedidocolords_12_tffornumcli), Integer.valueOf(AV154Webdatospedidocolords_13_tffornumcli_to), lV155Webdatospedidocolords_14_tffortonal, AV156Webdatospedidocolords_15_tffortonal_sel, AV126pForSer, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_35_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00DD2_A396EmprCod[0] ;
            A995ForTonal = H00DD2_A995ForTonal[0] ;
            n995ForTonal = H00DD2_n995ForTonal[0] ;
            A1192ForNumCli = H00DD2_A1192ForNumCli[0] ;
            n1192ForNumCli = H00DD2_n1192ForNumCli[0] ;
            A1191ForNomCli = H00DD2_A1191ForNomCli[0] ;
            n1191ForNomCli = H00DD2_n1191ForNomCli[0] ;
            A831TipColCod = H00DD2_A831TipColCod[0] ;
            A483ForColNum = H00DD2_A483ForColNum[0] ;
            A482ForColNom = H00DD2_A482ForColNom[0] ;
            A494ForSer = H00DD2_A494ForSer[0] ;
            A252CliCod = H00DD2_A252CliCod[0] ;
            e16DD2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(35) ;
         wbDD0( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV157Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNUMCLI"+"_"+sGXsfl_35_idx, getSecureSignedToken( sGXsfl_35_idx, localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNOMCLI"+"_"+sGXsfl_35_idx, getSecureSignedToken( sGXsfl_35_idx, GXutil.rtrim( localUtil.format( A1191ForNomCli, ""))));
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
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV142Webdatospedidocolords_1_filterfulltext ,
                                           AV144Webdatospedidocolords_3_tfforser_sel ,
                                           AV143Webdatospedidocolords_2_tfforser ,
                                           AV146Webdatospedidocolords_5_tfforcolnom_sel ,
                                           AV145Webdatospedidocolords_4_tfforcolnom ,
                                           Integer.valueOf(AV147Webdatospedidocolords_6_tfforcolnum) ,
                                           Integer.valueOf(AV148Webdatospedidocolords_7_tfforcolnum_to) ,
                                           Byte.valueOf(AV149Webdatospedidocolords_8_tftipcolcod) ,
                                           Byte.valueOf(AV150Webdatospedidocolords_9_tftipcolcod_to) ,
                                           AV152Webdatospedidocolords_11_tffornomcli_sel ,
                                           AV151Webdatospedidocolords_10_tffornomcli ,
                                           Integer.valueOf(AV153Webdatospedidocolords_12_tffornumcli) ,
                                           Integer.valueOf(AV154Webdatospedidocolords_13_tffornumcli_to) ,
                                           AV156Webdatospedidocolords_15_tffortonal_sel ,
                                           AV155Webdatospedidocolords_14_tffortonal ,
                                           AV126pForSer ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           Short.valueOf(AV41OrderedBy) ,
                                           Boolean.valueOf(AV42OrderedDsc) ,
                                           AV18EmprCod ,
                                           Integer.valueOf(AV13CliCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV142Webdatospedidocolords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV142Webdatospedidocolords_1_filterfulltext), "%", "") ;
      lV143Webdatospedidocolords_2_tfforser = GXutil.padr( GXutil.rtrim( AV143Webdatospedidocolords_2_tfforser), 16, "%") ;
      lV145Webdatospedidocolords_4_tfforcolnom = GXutil.padr( GXutil.rtrim( AV145Webdatospedidocolords_4_tfforcolnom), 13, "%") ;
      lV151Webdatospedidocolords_10_tffornomcli = GXutil.padr( GXutil.rtrim( AV151Webdatospedidocolords_10_tffornomcli), 13, "%") ;
      lV155Webdatospedidocolords_14_tffortonal = GXutil.padr( GXutil.rtrim( AV155Webdatospedidocolords_14_tffortonal), 20, "%") ;
      /* Using cursor H00DD3 */
      pr_default.execute(1, new Object[] {AV18EmprCod, Integer.valueOf(AV13CliCod), lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV142Webdatospedidocolords_1_filterfulltext, lV143Webdatospedidocolords_2_tfforser, AV144Webdatospedidocolords_3_tfforser_sel, lV145Webdatospedidocolords_4_tfforcolnom, AV146Webdatospedidocolords_5_tfforcolnom_sel, Integer.valueOf(AV147Webdatospedidocolords_6_tfforcolnum), Integer.valueOf(AV148Webdatospedidocolords_7_tfforcolnum_to), Byte.valueOf(AV149Webdatospedidocolords_8_tftipcolcod), Byte.valueOf(AV150Webdatospedidocolords_9_tftipcolcod_to), lV151Webdatospedidocolords_10_tffornomcli, AV152Webdatospedidocolords_11_tffornomcli_sel, Integer.valueOf(AV153Webdatospedidocolords_12_tffornumcli), Integer.valueOf(AV154Webdatospedidocolords_13_tffornumcli_to), lV155Webdatospedidocolords_14_tffortonal, AV156Webdatospedidocolords_15_tffortonal_sel, AV126pForSer});
      GRID_nRecordCount = H00DD3_AGRID_nRecordCount[0] ;
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
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV44FilterFullText, AV18EmprCod, AV13CliCod, AV126pForSer, AV55ManageFiltersExecutionStep, AV50ColumnsSelector, AV60TFForSer, AV61TFForSer_Sel, AV62TFForColNom, AV63TFForColNom_Sel, AV64TFForColNum, AV65TFForColNum_To, AV66TFTipColCod, AV67TFTipColCod_To, AV72TFForNomCli, AV73TFForNomCli_Sel, AV70TFForNumCli, AV71TFForNumCli_To, AV108TFForTonal, AV109TFForTonal_Sel, AV157Pgmname, AV41OrderedBy, AV42OrderedDsc, AV33Seleccion) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44FilterFullText, AV18EmprCod, AV13CliCod, AV126pForSer, AV55ManageFiltersExecutionStep, AV50ColumnsSelector, AV60TFForSer, AV61TFForSer_Sel, AV62TFForColNom, AV63TFForColNom_Sel, AV64TFForColNum, AV65TFForColNum_To, AV66TFTipColCod, AV67TFTipColCod_To, AV72TFForNomCli, AV73TFForNomCli_Sel, AV70TFForNumCli, AV71TFForNumCli_To, AV108TFForTonal, AV109TFForTonal_Sel, AV157Pgmname, AV41OrderedBy, AV42OrderedDsc, AV33Seleccion) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44FilterFullText, AV18EmprCod, AV13CliCod, AV126pForSer, AV55ManageFiltersExecutionStep, AV50ColumnsSelector, AV60TFForSer, AV61TFForSer_Sel, AV62TFForColNom, AV63TFForColNom_Sel, AV64TFForColNum, AV65TFForColNum_To, AV66TFTipColCod, AV67TFTipColCod_To, AV72TFForNomCli, AV73TFForNomCli_Sel, AV70TFForNumCli, AV71TFForNumCli_To, AV108TFForTonal, AV109TFForTonal_Sel, AV157Pgmname, AV41OrderedBy, AV42OrderedDsc, AV33Seleccion) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44FilterFullText, AV18EmprCod, AV13CliCod, AV126pForSer, AV55ManageFiltersExecutionStep, AV50ColumnsSelector, AV60TFForSer, AV61TFForSer_Sel, AV62TFForColNom, AV63TFForColNom_Sel, AV64TFForColNum, AV65TFForColNum_To, AV66TFTipColCod, AV67TFTipColCod_To, AV72TFForNomCli, AV73TFForNomCli_Sel, AV70TFForNumCli, AV71TFForNumCli_To, AV108TFForTonal, AV109TFForTonal_Sel, AV157Pgmname, AV41OrderedBy, AV42OrderedDsc, AV33Seleccion) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44FilterFullText, AV18EmprCod, AV13CliCod, AV126pForSer, AV55ManageFiltersExecutionStep, AV50ColumnsSelector, AV60TFForSer, AV61TFForSer_Sel, AV62TFForColNom, AV63TFForColNom_Sel, AV64TFForColNum, AV65TFForColNum_To, AV66TFTipColCod, AV67TFTipColCod_To, AV72TFForNomCli, AV73TFForNomCli_Sel, AV70TFForNumCli, AV71TFForNumCli_To, AV108TFForTonal, AV109TFForTonal_Sel, AV157Pgmname, AV41OrderedBy, AV42OrderedDsc, AV33Seleccion) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV157Pgmname = "WebDatosPedidoColor" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e14DD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV53ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV120DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV50ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV44FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44FilterFullText", AV44FilterFullText);
         /* Read subfile selected row values. */
         nGXsfl_35_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         if ( nGXsfl_35_idx > 0 )
         {
            AV45Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV45Seleccionar);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
            n1191ForNomCli = false ;
            A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1192ForNumCli = false ;
            A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
            n995ForTonal = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV44FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e14DD2 ();
      if (returnInSub) return;
   }

   public void e14DD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      chkavSeleccionar.setVisible( ((AV33Seleccion) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_35_Refreshing);
      AV25Realizado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Realizado", AV25Realizado);
      GXt_char1 = AV14CliNom ;
      GXv_char2[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( AV18EmprCod, AV13CliCod, GXv_char2) ;
      webdatospedidocolor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14CliNom = GXt_char1 ;
      GXt_char1 = AV139Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webdatospedidocolor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV139Station = GXt_char1 ;
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV140Emprnom ;
      GXv_char4[0] = AV141Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV139Station, GXv_char2, GXv_char3, GXv_char4) ;
      webdatospedidocolor_impl.this.AV18EmprCod = GXv_char2[0] ;
      webdatospedidocolor_impl.this.AV140Emprnom = GXv_char3[0] ;
      webdatospedidocolor_impl.this.AV141Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV36HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " LLAMADA DESDE WKP", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV41OrderedBy < 1 )
      {
         AV41OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV120DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV120DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Form.setCaption( GXutil.format( httpContext.getMessage( "Colores para %1", ""), AV14CliNom, "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
   }

   public void e15DD2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV55ManageFiltersExecutionStep == 1 )
      {
         AV55ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV55ManageFiltersExecutionStep == 2 )
      {
         AV55ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV52Session.getValue("WebDatosPedidoColorColumnsSelector"), "") != 0 )
      {
         AV48ColumnsSelectorXML = AV52Session.getValue("WebDatosPedidoColorColumnsSelector") ;
         AV50ColumnsSelector.fromxml(AV48ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_35_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtForNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtForNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCli_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtForTonal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTonal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTonal_Visible), 5, 0), !bGXsfl_35_Refreshing);
      AV142Webdatospedidocolords_1_filterfulltext = AV44FilterFullText ;
      AV143Webdatospedidocolords_2_tfforser = AV60TFForSer ;
      AV144Webdatospedidocolords_3_tfforser_sel = AV61TFForSer_Sel ;
      AV145Webdatospedidocolords_4_tfforcolnom = AV62TFForColNom ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = AV63TFForColNom_Sel ;
      AV147Webdatospedidocolords_6_tfforcolnum = AV64TFForColNum ;
      AV148Webdatospedidocolords_7_tfforcolnum_to = AV65TFForColNum_To ;
      AV149Webdatospedidocolords_8_tftipcolcod = AV66TFTipColCod ;
      AV150Webdatospedidocolords_9_tftipcolcod_to = AV67TFTipColCod_To ;
      AV151Webdatospedidocolords_10_tffornomcli = AV72TFForNomCli ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = AV73TFForNomCli_Sel ;
      AV153Webdatospedidocolords_12_tffornumcli = AV70TFForNumCli ;
      AV154Webdatospedidocolords_13_tffornumcli_to = AV71TFForNumCli_To ;
      AV155Webdatospedidocolords_14_tffortonal = AV108TFForTonal ;
      AV156Webdatospedidocolords_15_tffortonal_sel = AV109TFForTonal_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50ColumnsSelector", AV50ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53ManageFiltersData", AV53ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39GridState", AV39GridState);
   }

   public void e12DD2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV41OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OrderedBy), 4, 0));
         AV42OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42OrderedDsc", AV42OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV60TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFForSer", AV60TFForSer);
            AV61TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFForSer_Sel", AV61TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV62TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFForColNom", AV62TFForColNom);
            AV63TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFForColNom_Sel", AV63TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV64TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFForColNum), 6, 0));
            AV65TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV66TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFTipColCod), 2, 0));
            AV67TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNomCli") == 0 )
         {
            AV72TFForNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFForNomCli", AV72TFForNomCli);
            AV73TFForNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFForNomCli_Sel", AV73TFForNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCli") == 0 )
         {
            AV70TFForNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFForNumCli), 6, 0));
            AV71TFForNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFForNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFForNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTonal") == 0 )
         {
            AV108TFForTonal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFForTonal", AV108TFForTonal);
            AV109TFForTonal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TFForTonal_Sel", AV109TFForTonal_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e16DD2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(35) ;
      }
      sendrow_352( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
      {
         httpContext.doAjaxLoad(35, GridRow);
      }
   }

   public void e13DD2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV48ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV50ColumnsSelector.fromJSonString(AV48ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebDatosPedidoColorColumnsSelector", ((GXutil.strcmp("", AV48ColumnsSelectorXML)==0) ? "" : AV50ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50ColumnsSelector", AV50ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53ManageFiltersData", AV53ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39GridState", AV39GridState);
   }

   public void e11DD2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebDatosPedidoColorFilters")),GXutil.URLEncode(GXutil.rtrim(AV157Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV55ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebDatosPedidoColorFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV55ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV54ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebDatosPedidoColorFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webdatospedidocolor_impl.this.GXt_char1 = GXv_char4[0] ;
         AV54ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV54ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV157Pgmname+"GridState", AV54ManageFiltersXml) ;
            AV39GridState.fromxml(AV54ManageFiltersXml, null, null);
            AV41OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OrderedBy), 4, 0));
            AV42OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42OrderedDsc", AV42OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39GridState", AV39GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50ColumnsSelector", AV50ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53ManageFiltersData", AV53ManageFiltersData);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV41OrderedBy, 4, 0))+":"+(AV42OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV50ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Seleccionar", "", "", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForSer", "", "Artigo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNom", "", "Cor", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForColNum", "", "Numero", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColCod", "", "Tc", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForNomCli", "", "Cor Cliente", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForNumCli", "", "Numero", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ForTonal", "", "Cartaz", false, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV49UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebDatosPedidoColorColumnsSelector", GXv_char4) ;
      webdatospedidocolor_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV49UserCustomValue)==0) ) )
      {
         AV51ColumnsSelectorAux.fromxml(AV49UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV51ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV50ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV51ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV50ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV53ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebDatosPedidoColorFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV53ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV44FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44FilterFullText", AV44FilterFullText);
      AV60TFForSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFForSer", AV60TFForSer);
      AV61TFForSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFForSer_Sel", AV61TFForSer_Sel);
      AV62TFForColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFForColNom", AV62TFForColNom);
      AV63TFForColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFForColNom_Sel", AV63TFForColNom_Sel);
      AV64TFForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFForColNum), 6, 0));
      AV65TFForColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFForColNum_To), 6, 0));
      AV66TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFTipColCod), 2, 0));
      AV67TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFTipColCod_To), 2, 0));
      AV72TFForNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFForNomCli", AV72TFForNomCli);
      AV73TFForNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFForNomCli_Sel", AV73TFForNomCli_Sel);
      AV70TFForNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFForNumCli), 6, 0));
      AV71TFForNumCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFForNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFForNumCli_To), 6, 0));
      AV108TFForTonal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFForTonal", AV108TFForTonal);
      AV109TFForTonal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109TFForTonal_Sel", AV109TFForTonal_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV52Session.getValue(AV157Pgmname+"GridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV157Pgmname+"GridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV52Session.getValue(AV157Pgmname+"GridState"), null, null);
      }
      AV41OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OrderedBy), 4, 0));
      AV42OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OrderedDsc", AV42OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV158GXV1 = 1 ;
      while ( AV158GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV158GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44FilterFullText", AV44FilterFullText);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV60TFForSer = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFForSer", AV60TFForSer);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV61TFForSer_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFForSer_Sel", AV61TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV62TFForColNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFForColNom", AV62TFForColNom);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV63TFForColNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFForColNom_Sel", AV63TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV64TFForColNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFForColNum), 6, 0));
            AV65TFForColNum_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV66TFTipColCod = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFTipColCod), 2, 0));
            AV67TFTipColCod_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV72TFForNomCli = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFForNomCli", AV72TFForNomCli);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV73TFForNomCli_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFForNomCli_Sel", AV73TFForNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCLI") == 0 )
         {
            AV70TFForNumCli = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFForNumCli), 6, 0));
            AV71TFForNumCli_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFForNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFForNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV108TFForTonal = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFForTonal", AV108TFForTonal);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL_SEL") == 0 )
         {
            AV109TFForTonal_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TFForTonal_Sel", AV109TFForTonal_Sel);
         }
         AV158GXV1 = (int)(AV158GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFForSer_Sel)==0), AV61TFForSer_Sel, GXv_char4) ;
      webdatospedidocolor_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFForColNom_Sel)==0), AV63TFForColNom_Sel, GXv_char3) ;
      webdatospedidocolor_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFForNomCli_Sel)==0), AV73TFForNomCli_Sel, GXv_char2) ;
      webdatospedidocolor_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFForTonal_Sel)==0), AV109TFForTonal_Sel, GXv_char15) ;
      webdatospedidocolor_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|||"+GXt_char13+"||"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFForSer)==0), AV60TFForSer, GXv_char15) ;
      webdatospedidocolor_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFForColNom)==0), AV62TFForColNom, GXv_char4) ;
      webdatospedidocolor_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFForNomCli)==0), AV72TFForNomCli, GXv_char3) ;
      webdatospedidocolor_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFForTonal)==0), AV108TFForTonal, GXv_char2) ;
      webdatospedidocolor_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+GXt_char13+"|"+((0==AV64TFForColNum) ? "" : GXutil.str( AV64TFForColNum, 6, 0))+"|"+((0==AV66TFTipColCod) ? "" : GXutil.str( AV66TFTipColCod, 2, 0))+"|"+GXt_char12+"|"+((0==AV70TFForNumCli) ? "" : GXutil.str( AV70TFForNumCli, 6, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV65TFForColNum_To) ? "" : GXutil.str( AV65TFForColNum_To, 6, 0))+"|"+((0==AV67TFTipColCod_To) ? "" : GXutil.str( AV67TFTipColCod_To, 2, 0))+"||"+((0==AV71TFForNumCli_To) ? "" : GXutil.str( AV71TFForNumCli_To, 6, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV39GridState.fromxml(AV52Session.getValue(AV157Pgmname+"GridState"), null, null);
      AV39GridState.setgxTv_SdtWWPGridState_Orderedby( AV41OrderedBy );
      AV39GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV42OrderedDsc );
      AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV44FilterFullText)==0), (short)(0), AV44FilterFullText, "") ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORSER", "", !(GXutil.strcmp("", AV60TFForSer)==0), (short)(0), AV60TFForSer, "", !(GXutil.strcmp("", AV61TFForSer_Sel)==0), AV61TFForSer_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV62TFForColNom)==0), (short)(0), AV62TFForColNom, "", !(GXutil.strcmp("", AV63TFForColNom_Sel)==0), AV63TFForColNom_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORCOLNUM", "", !((0==AV64TFForColNum)&&(0==AV65TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV64TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV65TFForColNum_To, 6, 0))) ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFTIPCOLCOD", "", !((0==AV66TFTipColCod)&&(0==AV67TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV66TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV67TFTipColCod_To, 2, 0))) ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORNOMCLI", "", !(GXutil.strcmp("", AV72TFForNomCli)==0), (short)(0), AV72TFForNomCli, "", !(GXutil.strcmp("", AV73TFForNomCli_Sel)==0), AV73TFForNomCli_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORNUMCLI", "", !((0==AV70TFForNumCli)&&(0==AV71TFForNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV70TFForNumCli, 6, 0)), GXutil.trim( GXutil.str( AV71TFForNumCli_To, 6, 0))) ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORTONAL", "", !(GXutil.strcmp("", AV108TFForTonal)==0), (short)(0), AV108TFForTonal, "", !(GXutil.strcmp("", AV109TFForTonal_Sel)==0), AV109TFForTonal_Sel, "") ;
      AV39GridState = GXv_SdtWWPGridState16[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV157Pgmname+"GridState", AV39GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV37TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV157Pgmname );
      AV37TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV37TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV36HTTPRequest.getScriptName()+"?"+AV36HTTPRequest.getQuerystring() );
      AV37TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCFORMU" );
      AV52Session.setValue("TrnContext", AV37TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e17DD2( )
   {
      /* Seleccionar_Click Routine */
      returnInSub = false ;
      AV19ForColNom = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ForColNom", AV19ForColNom);
      AV20ForColNum = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
      AV8TipColCod = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
      AV6ForNumCli = A1192ForNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ForNumCli), 6, 0));
      AV5ForNomCli = A1191ForNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ForNomCli", AV5ForNomCli);
      GXt_char14 = AV7ForTonal ;
      GXv_char15[0] = A396EmprCod ;
      GXv_int17[0] = A252CliCod ;
      GXv_char4[0] = A494ForSer ;
      GXv_char3[0] = A482ForColNom ;
      GXv_int18[0] = A483ForColNum ;
      GXv_int19[0] = A831TipColCod ;
      GXv_char2[0] = GXt_char14 ;
      new app.pcolcl5(remoteHandle, context).execute( GXv_char15, GXv_int17, GXv_char4, GXv_char3, GXv_int18, GXv_int19, GXv_char2) ;
      webdatospedidocolor_impl.this.A396EmprCod = GXv_char15[0] ;
      webdatospedidocolor_impl.this.A252CliCod = GXv_int17[0] ;
      webdatospedidocolor_impl.this.A494ForSer = GXv_char4[0] ;
      webdatospedidocolor_impl.this.A482ForColNom = GXv_char3[0] ;
      webdatospedidocolor_impl.this.A483ForColNum = GXv_int18[0] ;
      webdatospedidocolor_impl.this.A831TipColCod = GXv_int19[0] ;
      webdatospedidocolor_impl.this.GXt_char14 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV7ForTonal = GXt_char14 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForTonal", AV7ForTonal);
      AV25Realizado = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Realizado", AV25Realizado);
      httpContext.setWebReturnParms(new Object[] {AV19ForColNom,Integer.valueOf(AV20ForColNum),Byte.valueOf(AV8TipColCod),Integer.valueOf(AV6ForNumCli),AV5ForNomCli,AV7ForTonal,Boolean.valueOf(AV25Realizado)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV19ForColNom","AV20ForColNum","AV8TipColCod","AV6ForNumCli","AV5ForNomCli","AV7ForTonal","AV25Realizado"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void wb_table1_19_DD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV53ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_24_DD2( true) ;
      }
      else
      {
         wb_table2_24_DD2( false) ;
      }
      return  ;
   }

   public void wb_table2_24_DD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_DD2e( true) ;
      }
      else
      {
         wb_table1_19_DD2e( false) ;
      }
   }

   public void wb_table2_24_DD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFilterfulltext_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Búsqueda General", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV44FilterFullText, GXutil.rtrim( localUtil.format( AV44FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebDatosPedidoColor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_24_DD2e( true) ;
      }
      else
      {
         wb_table2_24_DD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV33Seleccion = ((Boolean) getParm(obj,0)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Seleccion", AV33Seleccion);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSELECCION", getSecureSignedToken( "", AV33Seleccion));
      AV18EmprCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      AV13CliCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13CliCod), "ZZZZZ9")));
      AV126pForSer = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126pForSer", AV126pForSer);
      AV19ForColNom = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ForColNom", AV19ForColNom);
      AV20ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
      AV8TipColCod = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8TipColCod), 2, 0));
      AV6ForNumCli = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ForNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ForNumCli), 6, 0));
      AV5ForNomCli = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ForNomCli", AV5ForNomCli);
      AV7ForTonal = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForTonal", AV7ForTonal);
      AV25Realizado = ((Boolean) getParm(obj,10)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Realizado", AV25Realizado);
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
      paDD2( ) ;
      wsDD2( ) ;
      weDD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116115143", true, true);
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
      httpContext.AddJavascriptSource("webdatospedidocolor.js", "?202682116115144", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_352( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_35_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_35_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_35_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_35_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_35_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_35_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_35_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_35_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_35_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_35_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_35_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_35_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_35_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_35_fel_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_35_fel_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_35_fel_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wbDD0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_35_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_35_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_35_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         AV45Seleccionar = GXutil.strtobool( GXutil.booltostr( AV45Seleccionar)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV45Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV45Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,36);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNomCli_Internalname,GXutil.rtrim( A1191ForNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForTonal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTonal_Internalname,GXutil.rtrim( A995ForTonal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForTonal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesDD2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_35_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      /* End function sendrow_352 */
   }

   public void startgridcontrol35( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"35\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "&nbsp;", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForNumCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForTonal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cartaz", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV45Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1191ForNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForNumCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A995ForTonal));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForTonal_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      edtCliCod_Internalname = "CLICOD" ;
      edtForSer_Internalname = "FORSER" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      edtForTonal_Internalname = "FORTONAL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtForTonal_Jsonclick = "" ;
      edtForNumCli_Jsonclick = "" ;
      edtForNomCli_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtForTonal_Visible = -1 ;
      edtForNumCli_Visible = -1 ;
      edtForNomCli_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForSer_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Grid" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebDatosPedidoColorGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|||T||T" ;
      Ddo_grid_Filterisrange = "||T|T||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7" ;
      Ddo_grid_Columnids = "2:ForSer|3:ForColNom|4:ForColNum|5:TipColCod|6:ForNomCli|7:ForNumCli|8:ForTonal" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " LLAMADA DESDE WKP", "") );
      chkavSeleccionar.setVisible( -1 );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCIONAR_" + sGXsfl_35_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_35_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      AV45Seleccionar = GXutil.strtobool( GXutil.booltostr( AV45Seleccionar)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV45Seleccionar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e12DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e16DD2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e13DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11DD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VSELECCIONAR.CLICK","{handler:'e17DD2',iparms:[{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''}]");
      setEventMetadata("VSELECCIONAR.CLICK",",oparms:[{av:'AV19ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV6ForNumCli',fld:'vFORNUMCLI',pic:'ZZZZZ9'},{av:'AV5ForNomCli',fld:'vFORNOMCLI',pic:''},{av:'AV7ForTonal',fld:'vFORTONAL',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Realizado',fld:'vREALIZADO',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV126pForSer',fld:'vPFORSER',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV33Seleccion',fld:'vSELECCION',pic:'',hsh:true},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV60TFForSer',fld:'vTFFORSER',pic:''},{av:'AV61TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV62TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV63TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV67TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV72TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV73TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV70TFForNumCli',fld:'vTFFORNUMCLI',pic:'ZZZZZ9'},{av:'AV71TFForNumCli_To',fld:'vTFFORNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV108TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV109TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV157Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtForNumCli_Visible',ctrl:'FORNUMCLI',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Fortonal',iparms:[]");
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
      wcpOAV18EmprCod = "" ;
      wcpOAV126pForSer = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV18EmprCod = "" ;
      AV126pForSer = "" ;
      AV19ForColNom = "" ;
      AV5ForNomCli = "" ;
      AV7ForTonal = "" ;
      AV44FilterFullText = "" ;
      AV50ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV60TFForSer = "" ;
      AV61TFForSer_Sel = "" ;
      AV62TFForColNom = "" ;
      AV63TFForColNom_Sel = "" ;
      AV72TFForNomCli = "" ;
      AV73TFForNomCli_Sel = "" ;
      AV108TFForTonal = "" ;
      AV109TFForTonal_Sel = "" ;
      AV157Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV53ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV120DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV142Webdatospedidocolords_1_filterfulltext = "" ;
      AV143Webdatospedidocolords_2_tfforser = "" ;
      AV144Webdatospedidocolords_3_tfforser_sel = "" ;
      AV145Webdatospedidocolords_4_tfforcolnom = "" ;
      AV146Webdatospedidocolords_5_tfforcolnom_sel = "" ;
      AV151Webdatospedidocolords_10_tffornomcli = "" ;
      AV152Webdatospedidocolords_11_tffornomcli_sel = "" ;
      AV155Webdatospedidocolords_14_tffortonal = "" ;
      AV156Webdatospedidocolords_15_tffortonal_sel = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV142Webdatospedidocolords_1_filterfulltext = "" ;
      lV143Webdatospedidocolords_2_tfforser = "" ;
      lV145Webdatospedidocolords_4_tfforcolnom = "" ;
      lV151Webdatospedidocolords_10_tffornomcli = "" ;
      lV155Webdatospedidocolords_14_tffortonal = "" ;
      H00DD2_A396EmprCod = new String[] {""} ;
      H00DD2_A995ForTonal = new String[] {""} ;
      H00DD2_n995ForTonal = new boolean[] {false} ;
      H00DD2_A1192ForNumCli = new int[1] ;
      H00DD2_n1192ForNumCli = new boolean[] {false} ;
      H00DD2_A1191ForNomCli = new String[] {""} ;
      H00DD2_n1191ForNomCli = new boolean[] {false} ;
      H00DD2_A831TipColCod = new byte[1] ;
      H00DD2_A483ForColNum = new int[1] ;
      H00DD2_A482ForColNom = new String[] {""} ;
      H00DD2_A494ForSer = new String[] {""} ;
      H00DD2_A252CliCod = new int[1] ;
      H00DD3_AGRID_nRecordCount = new long[1] ;
      AV14CliNom = "" ;
      AV139Station = "" ;
      AV140Emprnom = "" ;
      AV141Usurcod = "" ;
      AV36HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV52Session = httpContext.getWebSession();
      AV48ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV54ManageFiltersXml = "" ;
      AV49UserCustomValue = "" ;
      AV51ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXt_char12 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV37TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int18 = new int[1] ;
      GXv_int19 = new byte[1] ;
      GXv_char2 = new String[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webdatospedidocolor__default(),
         new Object[] {
             new Object[] {
            H00DD2_A396EmprCod, H00DD2_A995ForTonal, H00DD2_n995ForTonal, H00DD2_A1192ForNumCli, H00DD2_n1192ForNumCli, H00DD2_A1191ForNomCli, H00DD2_n1191ForNomCli, H00DD2_A831TipColCod, H00DD2_A483ForColNum, H00DD2_A482ForColNom,
            H00DD2_A494ForSer, H00DD2_A252CliCod
            }
            , new Object[] {
            H00DD3_AGRID_nRecordCount
            }
         }
      );
      AV157Pgmname = "WebDatosPedidoColor" ;
      /* GeneXus formulas. */
      AV157Pgmname = "WebDatosPedidoColor" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8TipColCod ;
   private byte AV55ManageFiltersExecutionStep ;
   private byte AV66TFTipColCod ;
   private byte AV67TFTipColCod_To ;
   private byte gxajaxcallmode ;
   private byte AV149Webdatospedidocolords_8_tftipcolcod ;
   private byte AV150Webdatospedidocolords_9_tftipcolcod_to ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV41OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV13CliCod ;
   private int nRC_GXsfl_35 ;
   private int subGrid_Rows ;
   private int AV13CliCod ;
   private int AV20ForColNum ;
   private int AV6ForNumCli ;
   private int nGXsfl_35_idx=1 ;
   private int AV64TFForColNum ;
   private int AV65TFForColNum_To ;
   private int AV70TFForNumCli ;
   private int AV71TFForNumCli_To ;
   private int AV147Webdatospedidocolords_6_tfforcolnum ;
   private int AV148Webdatospedidocolords_7_tfforcolnum_to ;
   private int AV153Webdatospedidocolords_12_tffornumcli ;
   private int AV154Webdatospedidocolords_13_tffornumcli_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtForSer_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtForNomCli_Visible ;
   private int edtForNumCli_Visible ;
   private int edtForTonal_Visible ;
   private int AV158GXV1 ;
   private int GXv_int17[] ;
   private int GXv_int18[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV18EmprCod ;
   private String wcpOAV126pForSer ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV18EmprCod ;
   private String AV126pForSer ;
   private String AV19ForColNom ;
   private String AV5ForNomCli ;
   private String AV7ForTonal ;
   private String sGXsfl_35_idx="0001" ;
   private String AV60TFForSer ;
   private String AV61TFForSer_Sel ;
   private String AV62TFForColNom ;
   private String AV63TFForColNom_Sel ;
   private String AV72TFForNomCli ;
   private String AV73TFForNomCli_Sel ;
   private String AV108TFForTonal ;
   private String AV109TFForTonal_Sel ;
   private String AV157Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV143Webdatospedidocolords_2_tfforser ;
   private String AV144Webdatospedidocolords_3_tfforser_sel ;
   private String AV145Webdatospedidocolords_4_tfforcolnom ;
   private String AV146Webdatospedidocolords_5_tfforcolnom_sel ;
   private String AV151Webdatospedidocolords_10_tffornomcli ;
   private String AV152Webdatospedidocolords_11_tffornomcli_sel ;
   private String AV155Webdatospedidocolords_14_tffortonal ;
   private String AV156Webdatospedidocolords_15_tffortonal_sel ;
   private String edtCliCod_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Internalname ;
   private String edtForNumCli_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV143Webdatospedidocolords_2_tfforser ;
   private String lV145Webdatospedidocolords_4_tfforcolnom ;
   private String lV151Webdatospedidocolords_10_tffornomcli ;
   private String lV155Webdatospedidocolords_14_tffortonal ;
   private String AV14CliNom ;
   private String AV139Station ;
   private String AV140Emprnom ;
   private String AV141Usurcod ;
   private String GXt_char13 ;
   private String GXt_char12 ;
   private String GXt_char1 ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtForNomCli_Jsonclick ;
   private String edtForNumCli_Jsonclick ;
   private String edtForTonal_Jsonclick ;
   private String subGrid_Header ;
   private boolean wcpOAV33Seleccion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV33Seleccion ;
   private boolean AV25Realizado ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean AV42OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV45Seleccionar ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV48ColumnsSelectorXML ;
   private String AV54ManageFiltersXml ;
   private String AV49UserCustomValue ;
   private String AV44FilterFullText ;
   private String AV142Webdatospedidocolords_1_filterfulltext ;
   private String lV142Webdatospedidocolords_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV36HTTPRequest ;
   private com.genexus.webpanels.WebSession AV52Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H00DD2_A396EmprCod ;
   private String[] H00DD2_A995ForTonal ;
   private boolean[] H00DD2_n995ForTonal ;
   private int[] H00DD2_A1192ForNumCli ;
   private boolean[] H00DD2_n1192ForNumCli ;
   private String[] H00DD2_A1191ForNomCli ;
   private boolean[] H00DD2_n1191ForNomCli ;
   private byte[] H00DD2_A831TipColCod ;
   private int[] H00DD2_A483ForColNum ;
   private String[] H00DD2_A482ForColNom ;
   private String[] H00DD2_A494ForSer ;
   private int[] H00DD2_A252CliCod ;
   private long[] H00DD3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV53ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV37TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV120DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webdatospedidocolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00DD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV142Webdatospedidocolords_1_filterfulltext ,
                                          String AV144Webdatospedidocolords_3_tfforser_sel ,
                                          String AV143Webdatospedidocolords_2_tfforser ,
                                          String AV146Webdatospedidocolords_5_tfforcolnom_sel ,
                                          String AV145Webdatospedidocolords_4_tfforcolnom ,
                                          int AV147Webdatospedidocolords_6_tfforcolnum ,
                                          int AV148Webdatospedidocolords_7_tfforcolnum_to ,
                                          byte AV149Webdatospedidocolords_8_tftipcolcod ,
                                          byte AV150Webdatospedidocolords_9_tftipcolcod_to ,
                                          String AV152Webdatospedidocolords_11_tffornomcli_sel ,
                                          String AV151Webdatospedidocolords_10_tffornomcli ,
                                          int AV153Webdatospedidocolords_12_tffornumcli ,
                                          int AV154Webdatospedidocolords_13_tffornumcli_to ,
                                          String AV156Webdatospedidocolords_15_tffortonal_sel ,
                                          String AV155Webdatospedidocolords_14_tffortonal ,
                                          String AV126pForSer ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          short AV41OrderedBy ,
                                          boolean AV42OrderedDsc ,
                                          String AV18EmprCod ,
                                          int AV13CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[29];
      Object[] GXv_Object21 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ EmprCod, ForTonal, ForNumCli, ForNomCli, TipColCod, ForColNum, ForColNom, ForSer, CliCod" ;
      sFromString = " FROM TXPCFORMU" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV142Webdatospedidocolords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForNumCli,'999990'), 2) like '%' || ?) or ( UPPER(ForTonal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webdatospedidocolords_3_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV143Webdatospedidocolords_2_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webdatospedidocolords_3_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webdatospedidocolords_5_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webdatospedidocolords_4_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webdatospedidocolords_5_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV147Webdatospedidocolords_6_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV148Webdatospedidocolords_7_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV149Webdatospedidocolords_8_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV150Webdatospedidocolords_9_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Webdatospedidocolords_11_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV151Webdatospedidocolords_10_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Webdatospedidocolords_11_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(ForNomCli = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV153Webdatospedidocolords_12_tffornumcli) )
      {
         addWhere(sWhereString, "(ForNumCli >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV154Webdatospedidocolords_13_tffornumcli_to) )
      {
         addWhere(sWhereString, "(ForNumCli <= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Webdatospedidocolords_15_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV155Webdatospedidocolords_14_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Webdatospedidocolords_15_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(ForTonal = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126pForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ( AV41OrderedBy == 1 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY ForColNom" ;
      }
      else if ( ( AV41OrderedBy == 1 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForColNom DESC" ;
      }
      else if ( ( AV41OrderedBy == 2 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY ForSer" ;
      }
      else if ( ( AV41OrderedBy == 2 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForSer DESC" ;
      }
      else if ( ( AV41OrderedBy == 3 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY ForColNum" ;
      }
      else if ( ( AV41OrderedBy == 3 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForColNum DESC" ;
      }
      else if ( ( AV41OrderedBy == 4 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY TipColCod" ;
      }
      else if ( ( AV41OrderedBy == 4 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV41OrderedBy == 5 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY ForNomCli" ;
      }
      else if ( ( AV41OrderedBy == 5 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForNomCli DESC" ;
      }
      else if ( ( AV41OrderedBy == 6 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY ForNumCli" ;
      }
      else if ( ( AV41OrderedBy == 6 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForNumCli DESC" ;
      }
      else if ( ( AV41OrderedBy == 7 ) && ! AV42OrderedDsc )
      {
         sOrderString += " ORDER BY ForTonal" ;
      }
      else if ( ( AV41OrderedBy == 7 ) && ( AV42OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForTonal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H00DD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV142Webdatospedidocolords_1_filterfulltext ,
                                          String AV144Webdatospedidocolords_3_tfforser_sel ,
                                          String AV143Webdatospedidocolords_2_tfforser ,
                                          String AV146Webdatospedidocolords_5_tfforcolnom_sel ,
                                          String AV145Webdatospedidocolords_4_tfforcolnom ,
                                          int AV147Webdatospedidocolords_6_tfforcolnum ,
                                          int AV148Webdatospedidocolords_7_tfforcolnum_to ,
                                          byte AV149Webdatospedidocolords_8_tftipcolcod ,
                                          byte AV150Webdatospedidocolords_9_tftipcolcod_to ,
                                          String AV152Webdatospedidocolords_11_tffornomcli_sel ,
                                          String AV151Webdatospedidocolords_10_tffornomcli ,
                                          int AV153Webdatospedidocolords_12_tffornumcli ,
                                          int AV154Webdatospedidocolords_13_tffornumcli_to ,
                                          String AV156Webdatospedidocolords_15_tffortonal_sel ,
                                          String AV155Webdatospedidocolords_14_tffortonal ,
                                          String AV126pForSer ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          short AV41OrderedBy ,
                                          boolean AV42OrderedDsc ,
                                          String AV18EmprCod ,
                                          int AV13CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[24];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV142Webdatospedidocolords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForNumCli,'999990'), 2) like '%' || ?) or ( UPPER(ForTonal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Webdatospedidocolords_3_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV143Webdatospedidocolords_2_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Webdatospedidocolords_3_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Webdatospedidocolords_5_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV145Webdatospedidocolords_4_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Webdatospedidocolords_5_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV147Webdatospedidocolords_6_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (0==AV148Webdatospedidocolords_7_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV149Webdatospedidocolords_8_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV150Webdatospedidocolords_9_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Webdatospedidocolords_11_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV151Webdatospedidocolords_10_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Webdatospedidocolords_11_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(ForNomCli = ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (0==AV153Webdatospedidocolords_12_tffornumcli) )
      {
         addWhere(sWhereString, "(ForNumCli >= ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (0==AV154Webdatospedidocolords_13_tffornumcli_to) )
      {
         addWhere(sWhereString, "(ForNumCli <= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Webdatospedidocolords_15_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV155Webdatospedidocolords_14_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Webdatospedidocolords_15_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(ForTonal = ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126pForSer)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV41OrderedBy == 1 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 1 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 2 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 2 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 3 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 3 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 4 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 4 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 5 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 5 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 6 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 6 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 7 ) && ! AV42OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV41OrderedBy == 7 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H00DD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 1 :
                  return conditional_H00DD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((int[]) buf[11])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               return;
      }
   }

}

