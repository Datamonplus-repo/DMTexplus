package app.balance ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpexpauto_impl extends GXDataArea
{
   public wpexpauto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpexpauto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpexpauto_impl.class ));
   }

   public wpexpauto_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      try
      {
         AV380InOpeCod = (int) GXutil.lval( args[0]);
         AV381InOpeNom = (String) args[1];
         AV382InMaqCod = (String) args[2];
         AV383InMaqNom = (short) GXutil.lval( args[3]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      nGotPars = 1 ;
      webExecute();
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
         gxfirstwebparm = httpContext.GetFirstPar( "InOpeCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InOpeCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOpeCod") ;
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
            AV380InOpeCod = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV380InOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV380InOpeCod), 6, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV381InOpeNom = httpContext.GetPar( "InOpeNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV381InOpeNom", AV381InOpeNom);
               AV382InMaqCod = httpContext.GetPar( "InMaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV382InMaqCod", AV382InMaqCod);
               AV383InMaqNom = (short)(GXutil.lval( httpContext.GetPar( "InMaqNom"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV383InMaqNom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV383InMaqNom), 4, 0));
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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
      AV10BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV394Pgmname = httpContext.GetPar( "Pgmname") ;
      AV361OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV32BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV31BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV388TotMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieKil"), ".") ;
      AV390TotMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieMet"), ".") ;
      AV20EmprCod = httpContext.GetPar( "EmprCod") ;
      AV138MaqNom = httpContext.GetPar( "MaqNom") ;
      AV188Device_id = httpContext.GetPar( "Device_id") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV10BarCod, AV394Pgmname, AV361OrderedDsc, AV32BarCodReo, AV31BarCodPar, AV388TotMetPieKil, AV390TotMetPieMet, AV20EmprCod, AV138MaqNom, AV188Device_id) ;
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
      pa2EC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2EC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Balance.UCBalanceRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/WWP_IconButtonRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.balance.wpexpauto", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV380InOpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV381InOpeNom)),GXutil.URLEncode(GXutil.rtrim(AV382InMaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV383InMaqNom,4,0))}, new String[] {"InOpeCod","InOpeNom","InMaqCod","InMaqNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV388TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV390TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVICE_ID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Device_id, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WPExpAuto");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV394Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("balance\\wpexpauto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_60, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPECOD_DATA", AV7OpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPECOD_DATA", AV7OpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV179DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV179DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV9MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV9MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV371GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV372GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV361OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV32BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV31BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV388TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV388TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV390TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV390TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOG", AV191Log);
      app.GxWebStd.gx_hidden_field( httpContext, "vLECMAQNOM", AV12LecMaqNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vLECMAQCOD", GXutil.rtrim( AV11LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECNOM", AV13LecNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vLECBARCOD", GXutil.ltrim( localUtil.ntoc( AV14LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECFASNOM", AV15LecFasNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vLECPARNOM", GXutil.rtrim( AV16LecParNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vVDESESTADO", GXutil.rtrim( AV173vDesEstado));
      app.GxWebStd.gx_hidden_field( httpContext, "LECMAQCOD", GXutil.rtrim( A1166LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQNOM", GXutil.rtrim( AV138MaqNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARCOD", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARPAR", GXutil.rtrim( A1169LecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARREO", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASORD", GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASCOD", GXutil.rtrim( A1171LecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECOPECOD", GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECPARCOD", GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPENOM", GXutil.rtrim( A653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN", GXutil.rtrim( A456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCODNOM", GXutil.rtrim( A867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVICE_ID", AV188Device_id);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVICE_ID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Device_id, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTITLE", AV196Title);
      app.GxWebStd.gx_hidden_field( httpContext, "vLECBARREO", GXutil.ltrim( localUtil.ntoc( AV17LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECBARPAR", GXutil.rtrim( AV18LecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOPECOD", GXutil.ltrim( localUtil.ntoc( AV380InOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOPENOM", GXutil.rtrim( AV381InOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vINMAQCOD", GXutil.rtrim( AV382InMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINMAQNOM", GXutil.ltrim( localUtil.ntoc( AV383InMaqNom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDATAHORACAPTURA", AV187DataHoraCaptura);
      app.GxWebStd.gx_hidden_field( httpContext, "vRAWCAPTURADO", AV195RawCapturado);
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIDADECAPTURADA", AV197UnidadeCapturada);
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOCAPTURADO", AV194PesoCapturado);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_weight", GXutil.rtrim( Balance_Stopped_weight));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_unit", GXutil.rtrim( Balance_Stopped_unit));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_raw", GXutil.rtrim( Balance_Stopped_raw));
      app.GxWebStd.gx_hidden_field( httpContext, "BALANCE_Stopped_timestamp", GXutil.rtrim( Balance_Stopped_timestamp));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Selectedvalue_get", GXutil.rtrim( Combo_opecod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
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
         we2EC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2EC2( ) ;
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
      return formatLink("app.balance.wpexpauto", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV380InOpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV381InOpeNom)),GXutil.URLEncode(GXutil.rtrim(AV382InMaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV383InMaqNom,4,0))}, new String[] {"InOpeCod","InOpeNom","InMaqCod","InMaqNom"})  ;
   }

   public String getPgmname( )
   {
      return "Balance.WPExpAuto" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " LMETPI", "") ;
   }

   public void wb2EC0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaincontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContentleft_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHeadercontent_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentExp", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheaderinput_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTboperario_Internalname, httpContext.getMessage( "Operário", ""), "", "", lblTboperario_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleMaterial", 0, "", 1, 1, 0, (short)(0), "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ExtendedComboCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_opecod.setProperty("Caption", Combo_opecod_Caption);
         ucCombo_opecod.setProperty("Cls", Combo_opecod_Cls);
         ucCombo_opecod.setProperty("DropDownOptionsData", AV7OpeCod_Data);
         ucCombo_opecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opecod_Internalname, "COMBO_OPECODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbhojaruta_Internalname, httpContext.getMessage( "Hoja de Ruta / Paro", ""), "", "", lblTbhojaruta_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleMaterial", 0, "", 1, 1, 0, (short)(0), "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Bar Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Hoja de Ruta / Paro", ""), edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmaquina_Internalname, httpContext.getMessage( "Marquina", ""), "", "", lblTbmaquina_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleMaterial", 0, "", 1, 1, 0, (short)(0), "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ExtendedComboCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV179DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV9MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divErrorcontent_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentError", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, divTabledatalist_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentList", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol60( ) ;
      }
      if ( wbEnd == 60 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_60 = (int)(nGXsfl_60_idx-1) ;
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
         wb_table1_78_2EC2( true) ;
      }
      else
      {
         wb_table1_78_2EC2( false) ;
      }
      return  ;
   }

   public void wb_table1_78_2EC2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV371GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV372GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContentwidget_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBalance.setProperty("title", Balance_Title);
         ucBalance.render(context, "balance.ucbalance", Balance_Internalname, "BALANCEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divActionbarwidget_Internalname, 1, 0, "px", 0, "px", "TableHeaderContentError", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContentwidgetcenter_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;justify-content:space-between;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:center;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbwidgetvalue_Internalname, lblTbwidgetvalue_Caption, "", "", lblTbwidgetvalue_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "HTMLClass", 0, "", 1, 1, 0, (short)(1), "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:center;", "div");
         /* User Defined Control */
         ucBtnwidget.setProperty("BeforeIconClass", Btnwidget_Beforeiconclass);
         ucBtnwidget.setProperty("Caption", Btnwidget_Caption);
         ucBtnwidget.setProperty("Class", Btnwidget_Class);
         ucBtnwidget.render(context, "wwp_iconbutton", Btnwidget_Internalname, "BTNWIDGETContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         ClassString = "btn-success" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 60, 2, 0)+","+"null"+");", httpContext.getMessage( "Registrar", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Balance\\WPExpAuto.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinformation_Internalname, divTableinformation_Visible, 0, "px", 0, "px", "TableInformatioEXP", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmaquinaintroduzida_Internalname, lblTbmaquinaintroduzida_Caption, "", "", lblTbmaquinaintroduzida_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Balance\\WPExpAuto.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableinformationcliente_Internalname, divTableinformationcliente_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbclientinfo_Internalname, lblTbclientinfo_Caption, "", "", lblTbclientinfo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Balance\\WPExpAuto.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV394Pgmname), GXutil.rtrim( localUtil.format( AV394Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5OpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpecod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Balance\\WPExpAuto.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV6MaqCod), GXutil.rtrim( localUtil.format( AV6MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV179DDO_TitleSettingsIcons);
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
      if ( wbEnd == 60 )
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

   public void start2EC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " LMETPI", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2EC0( ) ;
   }

   public void ws2EC2( )
   {
      start2EC2( ) ;
      evt2EC2( ) ;
   }

   public void evt2EC2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e152EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162EC2 ();
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
                           nGXsfl_60_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_602( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV373GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV373GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
                           A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
                           A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
                           A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
                           A12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172EC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182EC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192EC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202EC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Barcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV10BarCod )
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

   public void we2EC2( )
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

   public void pa2EC2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      subsflControlProps_602( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         sendrow_602( ) ;
         nGXsfl_60_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV10BarCod ,
                                 String AV394Pgmname ,
                                 boolean AV361OrderedDsc ,
                                 byte AV32BarCodReo ,
                                 String AV31BarCodPar ,
                                 java.math.BigDecimal AV388TotMetPieKil ,
                                 java.math.BigDecimal AV390TotMetPieMet ,
                                 String AV20EmprCod ,
                                 String AV138MaqNom ,
                                 String AV188Device_id )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182EC2 ();
      GRID_nCurrentRecord = 0 ;
      rf2EC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WPExpAuto");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV394Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("balance\\wpexpauto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2EC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV394Pgmname = "Balance.WPExpAuto" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV394Pgmname", AV394Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluemetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiecod_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2EC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(60) ;
      /* Execute user event: Refresh */
      e182EC2 ();
      nGXsfl_60_idx = 1 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_602( ) ;
      bGXsfl_60_Refreshing = true ;
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
         subsflControlProps_602( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Boolean.valueOf(AV361OrderedDsc) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV10BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV32BarCodReo) ,
                                              A130BarCodPar ,
                                              AV31BarCodPar } ,
                                              new int[]{
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H02EC2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV10BarCod), Byte.valueOf(AV32BarCodReo), AV31BarCodPar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_60_idx = 1 ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A129BarCod = H02EC2_A129BarCod[0] ;
            A132BarCodReo = H02EC2_A132BarCodReo[0] ;
            A130BarCodPar = H02EC2_A130BarCodPar[0] ;
            A228BarUniMed = H02EC2_A228BarUniMed[0] ;
            A12994MetPieDfUl = H02EC2_A12994MetPieDfUl[0] ;
            A4917MetPieObs = H02EC2_A4917MetPieObs[0] ;
            A2816MetPieEst = H02EC2_A2816MetPieEst[0] ;
            A4910MetPieMtD = H02EC2_A4910MetPieMtD[0] ;
            A6635MetPieAnc = H02EC2_A6635MetPieAnc[0] ;
            A2815MetPieMet = H02EC2_A2815MetPieMet[0] ;
            A2814MetPieKil = H02EC2_A2814MetPieKil[0] ;
            A2813MetPieCod = H02EC2_A2813MetPieCod[0] ;
            A2809MetTerCod = H02EC2_A2809MetTerCod[0] ;
            A396EmprCod = H02EC2_A396EmprCod[0] ;
            A228BarUniMed = H02EC2_A228BarUniMed[0] ;
            e192EC2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(60) ;
         wb2EC0( ) ;
      }
      bGXsfl_60_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2EC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV32BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV31BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV388TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV388TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV390TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV390TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQNOM", GXutil.rtrim( AV138MaqNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVICE_ID", AV188Device_id);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVICE_ID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Device_id, ""))));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Boolean.valueOf(AV361OrderedDsc) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV10BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV32BarCodReo) ,
                                           A130BarCodPar ,
                                           AV31BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H02EC3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV10BarCod), Byte.valueOf(AV32BarCodReo), AV31BarCodPar});
      GRID_nRecordCount = H02EC3_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV10BarCod, AV394Pgmname, AV361OrderedDsc, AV32BarCodReo, AV31BarCodPar, AV388TotMetPieKil, AV390TotMetPieMet, AV20EmprCod, AV138MaqNom, AV188Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV10BarCod, AV394Pgmname, AV361OrderedDsc, AV32BarCodReo, AV31BarCodPar, AV388TotMetPieKil, AV390TotMetPieMet, AV20EmprCod, AV138MaqNom, AV188Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV10BarCod, AV394Pgmname, AV361OrderedDsc, AV32BarCodReo, AV31BarCodPar, AV388TotMetPieKil, AV390TotMetPieMet, AV20EmprCod, AV138MaqNom, AV188Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV10BarCod, AV394Pgmname, AV361OrderedDsc, AV32BarCodReo, AV31BarCodPar, AV388TotMetPieKil, AV390TotMetPieMet, AV20EmprCod, AV138MaqNom, AV188Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV10BarCod, AV394Pgmname, AV361OrderedDsc, AV32BarCodReo, AV31BarCodPar, AV388TotMetPieKil, AV390TotMetPieMet, AV20EmprCod, AV138MaqNom, AV188Device_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV394Pgmname = "Balance.WPExpAuto" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV394Pgmname", AV394Pgmname);
      Gx_err = (short)(0) ;
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

   public void strup2EC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172EC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPECOD_DATA"), AV7OpeCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV179DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV9MaqCod_Data);
         /* Read saved values. */
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV371GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV372GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV191Log = httpContext.cgiGet( "vLOG") ;
         AV187DataHoraCaptura = httpContext.cgiGet( "vDATAHORACAPTURA") ;
         AV195RawCapturado = httpContext.cgiGet( "vRAWCAPTURADO") ;
         AV197UnidadeCapturada = httpContext.cgiGet( "vUNIDADECAPTURADA") ;
         AV194PesoCapturado = httpContext.cgiGet( "vPESOCAPTURADO") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
         }
         else
         {
            AV10BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarCod), 8, 0));
         }
         AV387TotValueMetPieCod = httpContext.cgiGet( edtavTotvaluemetpiecod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV387TotValueMetPieCod", AV387TotValueMetPieCod);
         AV389TotValueMetPieKil = httpContext.cgiGet( edtavTotvaluemetpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV389TotValueMetPieKil", AV389TotValueMetPieKil);
         AV391TotValueMetPieMet = httpContext.cgiGet( edtavTotvaluemetpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV391TotValueMetPieMet", AV391TotValueMetPieMet);
         AV394Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV394Pgmname", AV394Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOPECOD");
            GX_FocusControl = edtavOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5OpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5OpeCod), 6, 0));
         }
         else
         {
            AV5OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5OpeCod), 6, 0));
         }
         AV6MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MaqCod", AV6MaqCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WPExpAuto");
         AV394Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV394Pgmname", AV394Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV394Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("balance\\wpexpauto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV10BarCod )
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
      e172EC2 ();
      if (returnInSub) return;
   }

   public void e172EC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpexpauto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV351UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpexpauto_impl.this.AV20EmprCod = GXv_char2[0] ;
      wpexpauto_impl.this.AV21EmprNom = GXv_char3[0] ;
      wpexpauto_impl.this.AV351UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV179DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV179DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      edtavOpecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOOPECOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S122 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " LMETPI", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV179DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV179DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Execute user subroutine: 'INITPARAMETERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITBALANCE' */
      S162 ();
      if (returnInSub) return;
   }

   public void e182EC2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV198WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV198WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV371GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV371GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV371GridCurrentPage), 10, 0));
      AV372GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV372GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV372GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e122EC2( )
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
         AV352PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV352PageToGo) ;
      }
   }

   public void e132EC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142EC2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV361OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV361OrderedDsc", AV361OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S202 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e192EC2( )
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
         wbStart = (short)(60) ;
      }
      sendrow_602( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_60_Refreshing )
      {
         httpContext.doAjaxLoad(60, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV373GridActions, 4, 0)) );
   }

   public void e152EC2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem(AV191Log);
      if ( 1 == 2 )
      {
         callWebObject(formatLink("app.expedicionesautomatizadas.lmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e202EC2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV373GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV373GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S222 ();
         if (returnInSub) return;
      }
      AV373GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV373GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV373GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e112EC2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV6MaqCod = Combo_maqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6MaqCod", AV6MaqCod);
      /* Execute user subroutine: 'LECTOR' */
      S232 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITBALANCE' */
      S162 ();
      if (returnInSub) return;
      AV196Title = AV12LecMaqNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV196Title", AV196Title);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.balance.get_maquinaintroduzida(remoteHandle, context).execute( AV11LecMaqCod, AV12LecMaqNom, AV13LecNom, AV14LecBarCod, AV15LecFasNom, AV16LecParNom, AV173vDesEstado, GXv_char4) ;
      wpexpauto_impl.this.GXt_char1 = GXv_char4[0] ;
      lblTbmaquinaintroduzida_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmaquinaintroduzida_Internalname, "Caption", lblTbmaquinaintroduzida_Caption, true);
      /*  Sending Event outputs  */
   }

   public void S202( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = "-1:"+(AV361OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.expedicionesautomatizadas.lmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.expedicionesautomatizadas.lmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV362Session.getValue(AV394Pgmname+"GridState"), "") == 0 )
      {
         AV358GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV394Pgmname+"GridState"), null, null);
      }
      else
      {
         AV358GridState.fromxml(AV362Session.getValue(AV394Pgmname+"GridState"), null, null);
      }
      AV361OrderedDsc = AV358GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV361OrderedDsc", AV361OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV358GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV358GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV358GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV358GridState.fromxml(AV362Session.getValue(AV394Pgmname+"GridState"), null, null);
      AV358GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV361OrderedDsc );
      AV358GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV358GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV394Pgmname+"GridState", AV358GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV356TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV356TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV394Pgmname );
      AV356TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV356TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV189HTTPRequest.getScriptName()+"?"+AV189HTTPRequest.getQuerystring() );
      AV356TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ExpedicionesAutomatizadas.LMETPI" );
      AV362Session.setValue("TrnContext", AV356TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S182( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV386TotMetPieCod = 0 ;
      AV388TotMetPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV388TotMetPieKil", GXutil.ltrimstr( AV388TotMetPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV388TotMetPieKil, "ZZZZZ9.99")));
      AV390TotMetPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV390TotMetPieMet", GXutil.ltrimstr( AV390TotMetPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV390TotMetPieMet, "ZZZZZ9.99")));
   }

   public void S192( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      /* Using cursor H02EC4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV10BarCod), Byte.valueOf(AV32BarCodReo), AV31BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = H02EC4_A130BarCodPar[0] ;
         A132BarCodReo = H02EC4_A132BarCodReo[0] ;
         A129BarCod = H02EC4_A129BarCod[0] ;
         A2814MetPieKil = H02EC4_A2814MetPieKil[0] ;
         A2815MetPieMet = H02EC4_A2815MetPieMet[0] ;
         AV388TotMetPieKil = A2814MetPieKil.add(AV388TotMetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV388TotMetPieKil", GXutil.ltrimstr( AV388TotMetPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV388TotMetPieKil, "ZZZZZ9.99")));
         AV390TotMetPieMet = A2815MetPieMet.add(AV390TotMetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV390TotMetPieMet", GXutil.ltrimstr( AV390TotMetPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETPIEMET", getSecureSignedToken( "", localUtil.format( AV390TotMetPieMet, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV386TotMetPieCod = subgrid_fnc_recordcount( ) ;
      AV387TotValueMetPieCod = httpContext.getMessage( "WWP_TotalizerCount", "") + localUtil.format( DecimalUtil.doubleToDec(AV386TotMetPieCod), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV387TotValueMetPieCod", AV387TotValueMetPieCod);
      AV389TotValueMetPieKil = localUtil.format( AV388TotMetPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV389TotValueMetPieKil", AV389TotValueMetPieKil);
      AV391TotValueMetPieMet = localUtil.format( AV390TotMetPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV391TotValueMetPieMet", AV391TotValueMetPieMet);
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02EC5 */
      pr_default.execute(3, new Object[] {AV20EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A607MaqEst = H02EC5_A607MaqEst[0] ;
         n607MaqEst = H02EC5_n607MaqEst[0] ;
         A396EmprCod = H02EC5_A396EmprCod[0] ;
         A606MaqDsc = H02EC5_A606MaqDsc[0] ;
         n606MaqDsc = H02EC5_n606MaqDsc[0] ;
         A620MaqTip = H02EC5_A620MaqTip[0] ;
         n620MaqTip = H02EC5_n620MaqTip[0] ;
         A602MaqCod = H02EC5_A602MaqCod[0] ;
         AV6MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MaqCod", AV6MaqCod);
         AV138MaqNom = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138MaqNom", AV138MaqNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138MaqNom, ""))));
         AV183MaqTip = A620MaqTip ;
         AV182MaqEst = A607MaqEst ;
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( AV6MaqCod) );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( AV6MaqCod+"-"+AV138MaqNom );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Type( AV183MaqTip );
         AV9MaqCod_Data.add(AV8Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV9MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV6MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor H02EC6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A8482OpeAct = H02EC6_A8482OpeAct[0] ;
         n8482OpeAct = H02EC6_n8482OpeAct[0] ;
         A13748OpeCNom = H02EC6_A13748OpeCNom[0] ;
         A652OpeCod = H02EC6_A652OpeCod[0] ;
         A653OpeNom = H02EC6_A653OpeNom[0] ;
         n653OpeNom = H02EC6_n653OpeNom[0] ;
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV7OpeCod_Data.add(AV8Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_opecod_Selectedvalue_set = ((0==AV5OpeCod) ? "" : GXutil.trim( GXutil.str( AV5OpeCod, 6, 0))) ;
      ucCombo_opecod.sendProperty(context, "", false, Combo_opecod_Internalname, "SelectedValue_set", Combo_opecod_Selectedvalue_set);
   }

   public void e162EC2( )
   {
      /* Barcod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (0==AV10BarCod) )
      {
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.balance.get_clientinfo(remoteHandle, context).execute( AV20EmprCod, AV14LecBarCod, AV17LecBarReo, AV18LecBarPar, GXv_char4) ;
         wpexpauto_impl.this.GXt_char1 = GXv_char4[0] ;
         lblTbclientinfo_Caption = GXt_char1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbclientinfo_Internalname, "Caption", lblTbclientinfo_Caption, true);
         divTableinformation_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableinformation_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinformation_Visible), 5, 0), true);
         divTableinformationcliente_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableinformationcliente_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinformationcliente_Visible), 5, 0), true);
      }
      else
      {
         divTableinformation_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableinformation_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinformation_Visible), 5, 0), true);
         divTableinformationcliente_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableinformationcliente_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinformationcliente_Visible), 5, 0), true);
      }
      /*  Sending Event outputs  */
   }

   public void S242( )
   {
      /* 'MAQFAS' Routine */
      returnInSub = false ;
      AV137MaqFasi = (byte)(0) ;
      AV35Barfasest = (byte)(9) ;
      /* Using cursor H02EC7 */
      pr_default.execute(5, new Object[] {AV20EmprCod, Integer.valueOf(AV29Barcada), Byte.valueOf(AV32BarCodReo), AV31BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A457FasCod = H02EC7_A457FasCod[0] ;
         A152BarFasCon = H02EC7_A152BarFasCon[0] ;
         A153BarFasEst = H02EC7_A153BarFasEst[0] ;
         A130BarCodPar = H02EC7_A130BarCodPar[0] ;
         A132BarCodReo = H02EC7_A132BarCodReo[0] ;
         A129BarCod = H02EC7_A129BarCod[0] ;
         A396EmprCod = H02EC7_A396EmprCod[0] ;
         A460FasDsc = H02EC7_A460FasDsc[0] ;
         A6011FasTip = H02EC7_A6011FasTip[0] ;
         n6011FasTip = H02EC7_n6011FasTip[0] ;
         A7600FasH2OReh = H02EC7_A7600FasH2OReh[0] ;
         n7600FasH2OReh = H02EC7_n7600FasH2OReh[0] ;
         A194BarOrdLin = H02EC7_A194BarOrdLin[0] ;
         A758ProCod = H02EC7_A758ProCod[0] ;
         A460FasDsc = H02EC7_A460FasDsc[0] ;
         A6011FasTip = H02EC7_A6011FasTip[0] ;
         n6011FasTip = H02EC7_n6011FasTip[0] ;
         A7600FasH2OReh = H02EC7_A7600FasH2OReh[0] ;
         n7600FasH2OReh = H02EC7_n7600FasH2OReh[0] ;
         if ( ( A153BarFasEst != 2 ) && ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV69FasCodi = A457FasCod ;
            AV71FasDscmf = A460FasDsc ;
            AV74FasTip = A6011FasTip ;
            AV38BarOrdLin = A194BarOrdLin ;
            AV156Procod = A758ProCod ;
            AV93KgMt = A7600FasH2OReh ;
            AV35Barfasest = A153BarFasEst ;
            /* Using cursor H02EC8 */
            pr_default.execute(6, new Object[] {AV20EmprCod, AV6MaqCod, AV69FasCodi});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1142MaqFCod = H02EC8_A1142MaqFCod[0] ;
               A602MaqCod = H02EC8_A602MaqCod[0] ;
               A396EmprCod = H02EC8_A396EmprCod[0] ;
               AV137MaqFasi = (byte)(1) ;
               AV70FasCodmf = A457FasCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            if ( AV137MaqFasi == 1 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( ( AV137MaqFasi == 1 ) && ( AV84FsSgts == 1 ) )
      {
         GXv_char4[0] = AV20EmprCod ;
         GXv_int8[0] = AV29Barcada ;
         GXv_int9[0] = AV32BarCodReo ;
         GXv_char3[0] = AV31BarCodPar ;
         GXv_char2[0] = AV156Procod ;
         GXv_int10[0] = AV38BarOrdLin ;
         GXv_char11[0] = AV351UsurCod ;
         GXv_char12[0] = AV19Station ;
         new app.pfssgts(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_char2, GXv_int10, GXv_char11, GXv_char12) ;
         wpexpauto_impl.this.AV20EmprCod = GXv_char4[0] ;
         wpexpauto_impl.this.AV29Barcada = GXv_int8[0] ;
         wpexpauto_impl.this.AV32BarCodReo = GXv_int9[0] ;
         wpexpauto_impl.this.AV31BarCodPar = GXv_char3[0] ;
         wpexpauto_impl.this.AV156Procod = GXv_char2[0] ;
         wpexpauto_impl.this.AV38BarOrdLin = GXv_int10[0] ;
         wpexpauto_impl.this.AV351UsurCod = GXv_char11[0] ;
         wpexpauto_impl.this.AV19Station = GXv_char12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      }
      if ( AV168Tintutex == 1 )
      {
         AV137MaqFasi = (byte)(1) ;
      }
   }

   public void S252( )
   {
      /* 'STKI' Routine */
      returnInSub = false ;
      AV86HDRs = "" ;
      AV34BarEst = (byte)(0) ;
      AV400GXLvl452 = (byte)(0) ;
      /* Using cursor H02EC9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV56Discod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk2EC8 = false ;
         A361DisCod = H02EC9_A361DisCod[0] ;
         A3400DisRefBCPa = H02EC9_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = H02EC9_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = H02EC9_A3398DisRefBarC[0] ;
         AV400GXLvl452 = (byte)(1) ;
         AV34BarEst = (byte)(1) ;
         AV86HDRs += ((GXutil.strcmp(AV86HDRs, "")==0) ? "" : ", ") ;
         AV86HDRs += GXutil.trim( GXutil.str( A3398DisRefBarC, 10, 0)) + "-" + GXutil.trim( GXutil.str( A3399DisRefBCRe, 10, 0)) + GXutil.trim( A3400DisRefBCPa) ;
         while ( (pr_default.getStatus(7) != 101) && ( H02EC9_A3398DisRefBarC[0] == A3398DisRefBarC ) && ( H02EC9_A3399DisRefBCRe[0] == A3399DisRefBCRe ) && ( GXutil.strcmp(H02EC9_A3400DisRefBCPa[0], A3400DisRefBCPa) == 0 ) )
         {
            brk2EC8 = false ;
            A361DisCod = H02EC9_A361DisCod[0] ;
            brk2EC8 = true ;
            pr_default.readNext(7);
         }
         if ( ! brk2EC8 )
         {
            brk2EC8 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
      if ( AV400GXLvl452 == 0 )
      {
         AV86HDRs = httpContext.getMessage( "No Stki", "") ;
         AV34BarEst = (byte)(0) ;
      }
   }

   public void S232( )
   {
      /* 'LECTOR' Routine */
      returnInSub = false ;
      /* Using cursor H02EC10 */
      pr_default.execute(8, new Object[] {AV20EmprCod, AV6MaqCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A1172LecParCod = H02EC10_A1172LecParCod[0] ;
         n1172LecParCod = H02EC10_n1172LecParCod[0] ;
         A1171LecFasCod = H02EC10_A1171LecFasCod[0] ;
         n1171LecFasCod = H02EC10_n1171LecFasCod[0] ;
         A1170LecOpeCod = H02EC10_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H02EC10_n1170LecOpeCod[0] ;
         A396EmprCod = H02EC10_A396EmprCod[0] ;
         A1166LecMaqCod = H02EC10_A1166LecMaqCod[0] ;
         A1167LecBarCod = H02EC10_A1167LecBarCod[0] ;
         n1167LecBarCod = H02EC10_n1167LecBarCod[0] ;
         A1169LecBarPar = H02EC10_A1169LecBarPar[0] ;
         n1169LecBarPar = H02EC10_n1169LecBarPar[0] ;
         A1168LecBarReo = H02EC10_A1168LecBarReo[0] ;
         n1168LecBarReo = H02EC10_n1168LecBarReo[0] ;
         A1188LecFasOrd = H02EC10_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H02EC10_n1188LecFasOrd[0] ;
         AV11LecMaqCod = A1166LecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11LecMaqCod", AV11LecMaqCod);
         AV12LecMaqNom = AV138MaqNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12LecMaqNom", AV12LecMaqNom);
         AV14LecBarCod = A1167LecBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14LecBarCod), 8, 0));
         AV18LecBarPar = A1169LecBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18LecBarPar", AV18LecBarPar);
         AV17LecBarReo = A1168LecBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17LecBarReo", GXutil.str( AV17LecBarReo, 1, 0));
         AV13LecNom = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13LecNom", AV13LecNom);
         AV100LecFasord = A1188LecFasOrd ;
         AV98LecFasCod = A1171LecFasCod ;
         AV105LecOpeCod = A1170LecOpeCod ;
         AV106Lecparcod = A1172LecParCod ;
         /* Using cursor H02EC11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A652OpeCod = H02EC11_A652OpeCod[0] ;
            A653OpeNom = H02EC11_A653OpeNom[0] ;
            n653OpeNom = H02EC11_n653OpeNom[0] ;
            AV13LecNom = A653OpeNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13LecNom", AV13LecNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         AV15LecFasNom = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15LecFasNom", AV15LecFasNom);
         /* Using cursor H02EC12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1171LecFasCod), A1171LecFasCod});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A457FasCod = H02EC12_A457FasCod[0] ;
            A460FasDsc = H02EC12_A460FasDsc[0] ;
            A456FasActTin = H02EC12_A456FasActTin[0] ;
            n456FasActTin = H02EC12_n456FasActTin[0] ;
            AV15LecFasNom = A460FasDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15LecFasNom", AV15LecFasNom);
            AV67FasAgr = A456FasActTin ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
         AV16LecParNom = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16LecParNom", AV16LecParNom);
         /* Using cursor H02EC13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A656ParCod = H02EC13_A656ParCod[0] ;
            A867ParCodNom = H02EC13_A867ParCodNom[0] ;
            n867ParCodNom = H02EC13_n867ParCodNom[0] ;
            AV16LecParNom = A867ParCodNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16LecParNom", AV16LecParNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
         GXv_char12[0] = AV63EstFase ;
         GXv_char11[0] = AV164terminus ;
         new app.psitfas(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char12, GXv_char11) ;
         wpexpauto_impl.this.AV63EstFase = GXv_char12[0] ;
         wpexpauto_impl.this.AV164terminus = GXv_char11[0] ;
         AV173vDesEstado = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173vDesEstado", AV173vDesEstado);
         if ( GXutil.strcmp(AV63EstFase, "I") == 0 )
         {
            AV173vDesEstado = "EN PROCESO" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV173vDesEstado", AV173vDesEstado);
         }
         if ( GXutil.strcmp(AV63EstFase, "F") == 0 )
         {
            AV173vDesEstado = "FINALIZADA" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV173vDesEstado", AV173vDesEstado);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S152( )
   {
      /* 'INITPARAMETERS' Routine */
      returnInSub = false ;
      GXt_int13 = AV79FlagCB ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "HP710C", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV79FlagCB = GXt_int13 ;
      GXt_int13 = AV133Magosa ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "MAGOSA", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV133Magosa = GXt_int13 ;
      GXt_int13 = AV77Finite ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "FINITE", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV77Finite = GXt_int13 ;
      GXt_int13 = AV82FlagRibes ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "RIBES", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV82FlagRibes = GXt_int13 ;
      GXt_int13 = AV83FlagSit ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "LECSIT", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV83FlagSit = GXt_int13 ;
      GXt_int13 = AV92JBP ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "JBURGO", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV92JBP = GXt_int13 ;
      GXt_int13 = AV62Estamp ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "ESTAMP", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV62Estamp = GXt_int13 ;
      GXt_int13 = AV167TinEst ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "TINEST", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV167TinEst = GXt_int13 ;
      GXt_int13 = AV73FasMan ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "MAQMAN", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV73FasMan = GXt_int13 ;
      GXt_int13 = AV91JBMartin ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "JBMAR", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV91JBMartin = GXt_int13 ;
      GXt_int13 = AV145NoProc ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "NOPROC", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV145NoProc = GXt_int13 ;
      GXt_int13 = AV66F_vt ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "VTABUA", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV66F_vt = GXt_int13 ;
      GXt_int13 = AV87Hidro ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "HIDRO", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV87Hidro = GXt_int13 ;
      GXt_int13 = AV75Fidel ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "FIDEL", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV75Fidel = GXt_int13 ;
      GXt_int13 = AV44CieHrI ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "CIEHRI", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV44CieHrI = GXt_int13 ;
      GXt_int13 = AV45Cierre_Hdr ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "CIEHRP", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV45Cierre_Hdr = GXt_int13 ;
      GXt_int13 = (byte)(AV23Revhdm) ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "REVHDM", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV23Revhdm = GXt_int13 ;
      GXt_int13 = (byte)(AV24MetSim) ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "METSIM", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV24MetSim = GXt_int13 ;
      GXt_int14 = AV65ExpSinDetail ;
      GXv_char12[0] = AV20EmprCod ;
      GXv_char11[0] = "METSIM" ;
      GXv_int8[0] = GXt_int14 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int8) ;
      wpexpauto_impl.this.AV20EmprCod = GXv_char12[0] ;
      wpexpauto_impl.this.GXt_int14 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      AV65ExpSinDetail = (byte)(GXt_int14) ;
      GXt_int13 = AV42Carolina ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "CAROLI", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV42Carolina = GXt_int13 ;
      GXt_int13 = AV94KgMtcc ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "KGMTCC", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV94KgMtcc = GXt_int13 ;
      GXt_int13 = AV50CosFrac ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "COSFRA", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV50CosFrac = GXt_int13 ;
      GXt_int13 = AV64Expcondetail ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "DETAIL", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV64Expcondetail = GXt_int13 ;
      GXt_int13 = AV158PzasTrozos ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "PZSTRS", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV158PzasTrozos = GXt_int13 ;
      GXt_int14 = AV154Pass00 ;
      GXv_char12[0] = AV20EmprCod ;
      GXv_char11[0] = "PWD111" ;
      GXv_int8[0] = GXt_int14 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int8) ;
      wpexpauto_impl.this.AV20EmprCod = GXv_char12[0] ;
      wpexpauto_impl.this.GXt_int14 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      AV154Pass00 = GXt_int14 ;
      GXt_int13 = AV168Tintutex ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "TINTUT", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV168Tintutex = GXt_int13 ;
      GXt_int13 = AV166Tinamar ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "TINAMA", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV166Tinamar = GXt_int13 ;
      GXt_int13 = AV84FsSgts ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "FSSGTS", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV84FsSgts = GXt_int13 ;
      GXt_int13 = AV48ContadorCarvema ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "CTDCAV", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV48ContadorCarvema = GXt_int13 ;
      GXt_int13 = AV49ContadorErfoc ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "ERFOC", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV49ContadorErfoc = GXt_int13 ;
      GXt_int13 = AV41bianco ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "BIANCO", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV41bianco = GXt_int13 ;
      GXt_int13 = AV43Carvitin ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "CARVIT", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV43Carvitin = GXt_int13 ;
      GXt_int13 = AV60Endutex ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "ENDTEX", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV60Endutex = GXt_int13 ;
      GXt_int13 = AV55defectos ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "DEFCAV", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV55defectos = GXt_int13 ;
      GXt_int13 = AV51crearalbaranproduccion ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "FSINAL", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV51crearalbaranproduccion = GXt_int13 ;
      GXt_int13 = AV54ctrlsinrollos ;
      GXv_int9[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "SINPZS", GXv_int9) ;
      wpexpauto_impl.this.GXt_int13 = GXv_int9[0] ;
      AV54ctrlsinrollos = GXt_int13 ;
   }

   public void S162( )
   {
      /* 'INITBALANCE' Routine */
      returnInSub = false ;
      GXt_char1 = AV184BalanceServer ;
      GXv_char12[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "BALANC", ""), GXv_char12) ;
      wpexpauto_impl.this.GXt_char1 = GXv_char12[0] ;
      AV184BalanceServer = GXt_char1 ;
      AV184BalanceServer = ((GXutil.strcmp("", AV184BalanceServer)==0) ? httpContext.getMessage( "localhost:3000", "") : AV184BalanceServer) ;
      Form.getJscriptsrc().add(GXutil.format( httpContext.getMessage( "http://%1%2", ""), AV184BalanceServer, httpContext.getMessage( "/balance-widget.js?v=20260722-3", ""), "", "", "", "", "", "", "")) ;
      Balance_Server = AV184BalanceServer ;
      ucBalance.sendProperty(context, "", false, Balance_Internalname, "server", Balance_Server);
      Balance_Device_id = ((GXutil.strcmp("", AV188Device_id)==0) ? "1" : AV188Device_id) ;
      ucBalance.sendProperty(context, "", false, Balance_Internalname, "device_id", Balance_Device_id);
      Balance_Title = ((GXutil.strcmp("", AV196Title)==0) ? httpContext.getMessage( "Balanza", "") : AV196Title) ;
      ucBalance.sendProperty(context, "", false, Balance_Internalname, "title", Balance_Title);
   }

   public void wb_table1_78_2EC2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiecod_Internalname, httpContext.getMessage( "Tot Value Met Pie Cod", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiecod_Internalname, AV387TotValueMetPieCod, GXutil.rtrim( localUtil.format( AV387TotValueMetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiecod_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiecod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiekil_Internalname, httpContext.getMessage( "Tot Value Met Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiekil_Internalname, AV389TotValueMetPieKil, GXutil.rtrim( localUtil.format( AV389TotValueMetPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiemet_Internalname, httpContext.getMessage( "Tot Value Met Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiemet_Internalname, AV391TotValueMetPieMet, GXutil.rtrim( localUtil.format( AV391TotValueMetPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Balance\\WPExpAuto.htm");
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
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_78_2EC2e( true) ;
      }
      else
      {
         wb_table1_78_2EC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV380InOpeCod = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV380InOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV380InOpeCod), 6, 0));
      AV381InOpeNom = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV381InOpeNom", AV381InOpeNom);
      AV382InMaqCod = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV382InMaqCod", AV382InMaqCod);
      AV383InMaqNom = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV383InMaqNom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV383InMaqNom), 4, 0));
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
      pa2EC2( ) ;
      ws2EC2( ) ;
      we2EC2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202610521175842", true, true);
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
      httpContext.AddJavascriptSource("balance/wpexpauto.js", "?202610521175842", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Balance.UCBalanceRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/WWP_IconButtonRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_602( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_60_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_60_idx ;
      edtMetTerCod_Internalname = "METTERCOD_"+sGXsfl_60_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_60_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_60_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_60_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_60_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_60_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_60_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_60_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_60_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_60_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_60_idx ;
      edtMetPieDfUl_Internalname = "METPIEDFUL_"+sGXsfl_60_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_602( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_60_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_60_fel_idx ;
      edtMetTerCod_Internalname = "METTERCOD_"+sGXsfl_60_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_60_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_60_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_60_fel_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_60_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_60_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_60_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_60_fel_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_60_fel_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_60_fel_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_60_fel_idx ;
      edtMetPieDfUl_Internalname = "METPIEDFUL_"+sGXsfl_60_fel_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_60_fel_idx ;
   }

   public void sendrow_602( )
   {
      subsflControlProps_602( ) ;
      wb2EC0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_60_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_60_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_60_idx+"',60)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_60_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV373GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV373GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV373GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV373GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_60_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV373GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_60_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetTerCod_Internalname,GXutil.rtrim( A2809MetTerCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetTerCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2814MetPieKil, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2815MetPieMet, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4910MetPieMtD, "ZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieObs_Internalname,A4917MetPieObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfUl_Internalname,GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfUl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2EC2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_60_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
      }
      /* End function sendrow_602 */
   }

   public void startgridcontrol60( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"60\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Larg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultima Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Un", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV373GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2809MetTerCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A4917MetPieObs);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228BarUniMed));
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
      lblTboperario_Internalname = "TBOPERARIO" ;
      Combo_opecod_Internalname = "COMBO_OPECOD" ;
      lblTbhojaruta_Internalname = "TBHOJARUTA" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      divTableheaderinput_Internalname = "TABLEHEADERINPUT" ;
      lblTbmaquina_Internalname = "TBMAQUINA" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      divHeadercontent_Internalname = "HEADERCONTENT" ;
      divErrorcontent_Internalname = "ERRORCONTENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtMetTerCod_Internalname = "METTERCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      edtMetPieObs_Internalname = "METPIEOBS" ;
      edtMetPieDfUl_Internalname = "METPIEDFUL" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      edtavTotvaluemetpiecod_Internalname = "vTOTVALUEMETPIECOD" ;
      edtavTotvaluemetpiekil_Internalname = "vTOTVALUEMETPIEKIL" ;
      edtavTotvaluemetpiemet_Internalname = "vTOTVALUEMETPIEMET" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTabledatalist_Internalname = "TABLEDATALIST" ;
      divContentleft_Internalname = "CONTENTLEFT" ;
      Balance_Internalname = "BALANCE" ;
      lblTbwidgetvalue_Internalname = "TBWIDGETVALUE" ;
      Btnwidget_Internalname = "BTNWIDGET" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      divContentwidgetcenter_Internalname = "CONTENTWIDGETCENTER" ;
      divActionbarwidget_Internalname = "ACTIONBARWIDGET" ;
      lblTbmaquinaintroduzida_Internalname = "TBMAQUINAINTRODUZIDA" ;
      divTableinformation_Internalname = "TABLEINFORMATION" ;
      lblTbclientinfo_Internalname = "TBCLIENTINFO" ;
      divTableinformationcliente_Internalname = "TABLEINFORMATIONCLIENTE" ;
      divContentwidget_Internalname = "CONTENTWIDGET" ;
      divMaincontent_Internalname = "MAINCONTENT" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavOpecod_Internalname = "vOPECOD" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
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
      edtBarUniMed_Jsonclick = "" ;
      edtMetPieDfUl_Jsonclick = "" ;
      edtMetPieObs_Jsonclick = "" ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtMetTerCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluemetpiemet_Jsonclick = "" ;
      edtavTotvaluemetpiemet_Enabled = 1 ;
      edtavTotvaluemetpiekil_Jsonclick = "" ;
      edtavTotvaluemetpiekil_Enabled = 1 ;
      edtavTotvaluemetpiecod_Jsonclick = "" ;
      edtavTotvaluemetpiecod_Enabled = 1 ;
      Balance_Device_id = "1" ;
      Balance_Server = "" ;
      Ddo_grid_Gridinternalname = "" ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "-1" ;
      Ddo_grid_Columnids = "7:MetPieKil" ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbclientinfo_Caption = "" ;
      divTableinformationcliente_Visible = 1 ;
      lblTbmaquinaintroduzida_Caption = "" ;
      divTableinformation_Visible = 1 ;
      Btnwidget_Class = "BtnDefault" ;
      Btnwidget_Caption = httpContext.getMessage( "Capturar", "") ;
      Btnwidget_Beforeiconclass = "fas fa-balance-scale-right" ;
      lblTbwidgetvalue_Caption = "000.000" ;
      Balance_Title = httpContext.getMessage( "Balança", "") ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
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
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Caption = "" ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Combo_opecod_Cls = "ExtendedCombo AttributeFL" ;
      Balance_Stopped_timestamp = "" ;
      Balance_Stopped_raw = "" ;
      Balance_Stopped_unit = "" ;
      Balance_Stopped_weight = "" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " LMETPI", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_60_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV373GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV373GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV373GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV394Pgmname',fld:'vPGMNAME',pic:''},{av:'AV361OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV31BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV388TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV390TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV138MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV188Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV371GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV372GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV388TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV390TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV387TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV389TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV391TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122EC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV394Pgmname',fld:'vPGMNAME',pic:''},{av:'AV361OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV31BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV388TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV390TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV138MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV188Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132EC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV394Pgmname',fld:'vPGMNAME',pic:''},{av:'AV361OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV31BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV388TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV390TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV138MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV188Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142EC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV394Pgmname',fld:'vPGMNAME',pic:''},{av:'AV361OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV31BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV388TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV390TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV138MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV188Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV361OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192EC2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV373GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e152EC2',iparms:[{av:'AV191Log',fld:'vLOG',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e202EC2',iparms:[{av:'cmbavGridactions'},{av:'AV373GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV373GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e112EC2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV12LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'AV11LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV13LecNom',fld:'vLECNOM',pic:''},{av:'AV14LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV15LecFasNom',fld:'vLECFASNOM',pic:''},{av:'AV16LecParNom',fld:'vLECPARNOM',pic:''},{av:'AV173vDesEstado',fld:'vVDESESTADO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6MaqCod',fld:'vMAQCOD',pic:''},{av:'AV138MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'AV188Device_id',fld:'vDEVICE_ID',pic:'',hsh:true},{av:'AV196Title',fld:'vTITLE',pic:''}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV6MaqCod',fld:'vMAQCOD',pic:''},{av:'AV196Title',fld:'vTITLE',pic:''},{av:'lblTbmaquinaintroduzida_Caption',ctrl:'TBMAQUINAINTRODUZIDA',prop:'Caption'},{av:'AV11LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV12LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'AV14LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV18LecBarPar',fld:'vLECBARPAR',pic:''},{av:'AV17LecBarReo',fld:'vLECBARREO',pic:'9'},{av:'AV13LecNom',fld:'vLECNOM',pic:''},{av:'AV15LecFasNom',fld:'vLECFASNOM',pic:''},{av:'AV16LecParNom',fld:'vLECPARNOM',pic:''},{av:'AV173vDesEstado',fld:'vVDESESTADO',pic:''},{av:'Balance_Server',ctrl:'BALANCE',prop:'server'},{av:'Balance_Device_id',ctrl:'BALANCE',prop:'device_id'},{av:'Balance_Title',ctrl:'BALANCE',prop:'title'}]}");
      setEventMetadata("VBARCOD.CONTROLVALUECHANGED","{handler:'e162EC2',iparms:[{av:'AV10BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV17LecBarReo',fld:'vLECBARREO',pic:'9'},{av:'AV18LecBarPar',fld:'vLECBARPAR',pic:''}]");
      setEventMetadata("VBARCOD.CONTROLVALUECHANGED",",oparms:[{av:'lblTbclientinfo_Caption',ctrl:'TBCLIENTINFO',prop:'Caption'},{av:'divTableinformation_Visible',ctrl:'TABLEINFORMATION',prop:'Visible'},{av:'divTableinformationcliente_Visible',ctrl:'TABLEINFORMATIONCLIENTE',prop:'Visible'}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barunimed',iparms:[]");
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
      wcpOAV381InOpeNom = "" ;
      wcpOAV382InMaqCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_opecod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV381InOpeNom = "" ;
      AV382InMaqCod = "" ;
      AV394Pgmname = "" ;
      AV31BarCodPar = "" ;
      AV388TotMetPieKil = DecimalUtil.ZERO ;
      AV390TotMetPieMet = DecimalUtil.ZERO ;
      AV20EmprCod = "" ;
      AV138MaqNom = "" ;
      AV188Device_id = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV7OpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV179DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV9MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV191Log = "" ;
      AV12LecMaqNom = "" ;
      AV11LecMaqCod = "" ;
      AV13LecNom = "" ;
      AV15LecFasNom = "" ;
      AV16LecParNom = "" ;
      AV173vDesEstado = "" ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A653OpeNom = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A456FasActTin = "" ;
      A867ParCodNom = "" ;
      AV196Title = "" ;
      AV18LecBarPar = "" ;
      AV187DataHoraCaptura = "" ;
      AV195RawCapturado = "" ;
      AV197UnidadeCapturada = "" ;
      AV194PesoCapturado = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTboperario_Jsonclick = "" ;
      ucCombo_opecod = new com.genexus.webpanels.GXUserControl();
      Combo_opecod_Caption = "" ;
      lblTbhojaruta_Jsonclick = "" ;
      TempTags = "" ;
      lblTbmaquina_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucBalance = new com.genexus.webpanels.GXUserControl();
      lblTbwidgetvalue_Jsonclick = "" ;
      ucBtnwidget = new com.genexus.webpanels.GXUserControl();
      bttBtninsert_Jsonclick = "" ;
      lblTbmaquinaintroduzida_Jsonclick = "" ;
      lblTbclientinfo_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV6MaqCod = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      Ddo_grid_Caption = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      A228BarUniMed = "" ;
      scmdbuf = "" ;
      H02EC2_A129BarCod = new int[1] ;
      H02EC2_A132BarCodReo = new byte[1] ;
      H02EC2_A130BarCodPar = new String[] {""} ;
      H02EC2_A228BarUniMed = new String[] {""} ;
      H02EC2_A12994MetPieDfUl = new short[1] ;
      H02EC2_A4917MetPieObs = new String[] {""} ;
      H02EC2_A2816MetPieEst = new byte[1] ;
      H02EC2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02EC2_A6635MetPieAnc = new short[1] ;
      H02EC2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02EC2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02EC2_A2813MetPieCod = new String[] {""} ;
      H02EC2_A2809MetTerCod = new String[] {""} ;
      H02EC2_A396EmprCod = new String[] {""} ;
      H02EC3_AGRID_nRecordCount = new long[1] ;
      AV387TotValueMetPieCod = "" ;
      AV389TotValueMetPieKil = "" ;
      AV391TotValueMetPieMet = "" ;
      hsh = "" ;
      AV19Station = "" ;
      AV21EmprNom = "" ;
      AV351UsurCod = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV198WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Ddo_grid_Sortedstatus = "" ;
      AV362Session = httpContext.getWebSession();
      AV358GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV356TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV189HTTPRequest = httpContext.getHttpRequest();
      H02EC4_A396EmprCod = new String[] {""} ;
      H02EC4_A2809MetTerCod = new String[] {""} ;
      H02EC4_A2813MetPieCod = new String[] {""} ;
      H02EC4_A130BarCodPar = new String[] {""} ;
      H02EC4_A132BarCodReo = new byte[1] ;
      H02EC4_A129BarCod = new int[1] ;
      H02EC4_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02EC4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02EC5_A607MaqEst = new String[] {""} ;
      H02EC5_n607MaqEst = new boolean[] {false} ;
      H02EC5_A396EmprCod = new String[] {""} ;
      H02EC5_A606MaqDsc = new String[] {""} ;
      H02EC5_n606MaqDsc = new boolean[] {false} ;
      H02EC5_A620MaqTip = new String[] {""} ;
      H02EC5_n620MaqTip = new boolean[] {false} ;
      H02EC5_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A620MaqTip = "" ;
      A602MaqCod = "" ;
      AV183MaqTip = "" ;
      AV182MaqEst = "" ;
      AV8Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      Combo_maqcod_Selectedvalue_set = "" ;
      H02EC6_A396EmprCod = new String[] {""} ;
      H02EC6_A8482OpeAct = new String[] {""} ;
      H02EC6_n8482OpeAct = new boolean[] {false} ;
      H02EC6_A13748OpeCNom = new String[] {""} ;
      H02EC6_A652OpeCod = new int[1] ;
      H02EC6_A653OpeNom = new String[] {""} ;
      H02EC6_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      Combo_opecod_Selectedvalue_set = "" ;
      H02EC7_A457FasCod = new String[] {""} ;
      H02EC7_A152BarFasCon = new String[] {""} ;
      H02EC7_A153BarFasEst = new byte[1] ;
      H02EC7_A130BarCodPar = new String[] {""} ;
      H02EC7_A132BarCodReo = new byte[1] ;
      H02EC7_A129BarCod = new int[1] ;
      H02EC7_A396EmprCod = new String[] {""} ;
      H02EC7_A460FasDsc = new String[] {""} ;
      H02EC7_A6011FasTip = new String[] {""} ;
      H02EC7_n6011FasTip = new boolean[] {false} ;
      H02EC7_A7600FasH2OReh = new String[] {""} ;
      H02EC7_n7600FasH2OReh = new boolean[] {false} ;
      H02EC7_A194BarOrdLin = new short[1] ;
      H02EC7_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A6011FasTip = "" ;
      A7600FasH2OReh = "" ;
      A758ProCod = "" ;
      AV69FasCodi = "" ;
      AV71FasDscmf = "" ;
      AV74FasTip = "" ;
      AV156Procod = "" ;
      AV93KgMt = "" ;
      H02EC8_A1142MaqFCod = new String[] {""} ;
      H02EC8_A602MaqCod = new String[] {""} ;
      H02EC8_A396EmprCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      AV70FasCodmf = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new short[1] ;
      A3400DisRefBCPa = "" ;
      AV86HDRs = "" ;
      H02EC9_A396EmprCod = new String[] {""} ;
      H02EC9_A3607DisRefBPie = new String[] {""} ;
      H02EC9_A361DisCod = new int[1] ;
      H02EC9_A3400DisRefBCPa = new String[] {""} ;
      H02EC9_A3399DisRefBCRe = new byte[1] ;
      H02EC9_A3398DisRefBarC = new int[1] ;
      H02EC10_A1172LecParCod = new short[1] ;
      H02EC10_n1172LecParCod = new boolean[] {false} ;
      H02EC10_A1171LecFasCod = new String[] {""} ;
      H02EC10_n1171LecFasCod = new boolean[] {false} ;
      H02EC10_A1170LecOpeCod = new int[1] ;
      H02EC10_n1170LecOpeCod = new boolean[] {false} ;
      H02EC10_A396EmprCod = new String[] {""} ;
      H02EC10_A1166LecMaqCod = new String[] {""} ;
      H02EC10_A1167LecBarCod = new int[1] ;
      H02EC10_n1167LecBarCod = new boolean[] {false} ;
      H02EC10_A1169LecBarPar = new String[] {""} ;
      H02EC10_n1169LecBarPar = new boolean[] {false} ;
      H02EC10_A1168LecBarReo = new byte[1] ;
      H02EC10_n1168LecBarReo = new boolean[] {false} ;
      H02EC10_A1188LecFasOrd = new short[1] ;
      H02EC10_n1188LecFasOrd = new boolean[] {false} ;
      AV98LecFasCod = "" ;
      H02EC11_A396EmprCod = new String[] {""} ;
      H02EC11_A652OpeCod = new int[1] ;
      H02EC11_A653OpeNom = new String[] {""} ;
      H02EC11_n653OpeNom = new boolean[] {false} ;
      H02EC12_A396EmprCod = new String[] {""} ;
      H02EC12_A457FasCod = new String[] {""} ;
      H02EC12_A460FasDsc = new String[] {""} ;
      H02EC12_A456FasActTin = new String[] {""} ;
      H02EC12_n456FasActTin = new boolean[] {false} ;
      AV67FasAgr = "" ;
      H02EC13_A396EmprCod = new String[] {""} ;
      H02EC13_A656ParCod = new short[1] ;
      H02EC13_A867ParCodNom = new String[] {""} ;
      H02EC13_n867ParCodNom = new boolean[] {false} ;
      AV63EstFase = "" ;
      AV164terminus = "" ;
      GXv_char11 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      AV184BalanceServer = "" ;
      GXt_char1 = "" ;
      GXv_char12 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.balance.wpexpauto__default(),
         new Object[] {
             new Object[] {
            H02EC2_A129BarCod, H02EC2_A132BarCodReo, H02EC2_A130BarCodPar, H02EC2_A228BarUniMed, H02EC2_A12994MetPieDfUl, H02EC2_A4917MetPieObs, H02EC2_A2816MetPieEst, H02EC2_A4910MetPieMtD, H02EC2_A6635MetPieAnc, H02EC2_A2815MetPieMet,
            H02EC2_A2814MetPieKil, H02EC2_A2813MetPieCod, H02EC2_A2809MetTerCod, H02EC2_A396EmprCod
            }
            , new Object[] {
            H02EC3_AGRID_nRecordCount
            }
            , new Object[] {
            H02EC4_A396EmprCod, H02EC4_A2809MetTerCod, H02EC4_A2813MetPieCod, H02EC4_A130BarCodPar, H02EC4_A132BarCodReo, H02EC4_A129BarCod, H02EC4_A2814MetPieKil, H02EC4_A2815MetPieMet
            }
            , new Object[] {
            H02EC5_A607MaqEst, H02EC5_n607MaqEst, H02EC5_A396EmprCod, H02EC5_A606MaqDsc, H02EC5_n606MaqDsc, H02EC5_A620MaqTip, H02EC5_n620MaqTip, H02EC5_A602MaqCod
            }
            , new Object[] {
            H02EC6_A396EmprCod, H02EC6_A8482OpeAct, H02EC6_n8482OpeAct, H02EC6_A13748OpeCNom, H02EC6_A652OpeCod, H02EC6_A653OpeNom, H02EC6_n653OpeNom
            }
            , new Object[] {
            H02EC7_A457FasCod, H02EC7_A152BarFasCon, H02EC7_A153BarFasEst, H02EC7_A130BarCodPar, H02EC7_A132BarCodReo, H02EC7_A129BarCod, H02EC7_A396EmprCod, H02EC7_A460FasDsc, H02EC7_A6011FasTip, H02EC7_n6011FasTip,
            H02EC7_A7600FasH2OReh, H02EC7_n7600FasH2OReh, H02EC7_A194BarOrdLin, H02EC7_A758ProCod
            }
            , new Object[] {
            H02EC8_A1142MaqFCod, H02EC8_A602MaqCod, H02EC8_A396EmprCod
            }
            , new Object[] {
            H02EC9_A396EmprCod, H02EC9_A3607DisRefBPie, H02EC9_A361DisCod, H02EC9_A3400DisRefBCPa, H02EC9_A3399DisRefBCRe, H02EC9_A3398DisRefBarC
            }
            , new Object[] {
            H02EC10_A1172LecParCod, H02EC10_n1172LecParCod, H02EC10_A1171LecFasCod, H02EC10_n1171LecFasCod, H02EC10_A1170LecOpeCod, H02EC10_n1170LecOpeCod, H02EC10_A396EmprCod, H02EC10_A1166LecMaqCod, H02EC10_A1167LecBarCod, H02EC10_n1167LecBarCod,
            H02EC10_A1169LecBarPar, H02EC10_n1169LecBarPar, H02EC10_A1168LecBarReo, H02EC10_n1168LecBarReo, H02EC10_A1188LecFasOrd, H02EC10_n1188LecFasOrd
            }
            , new Object[] {
            H02EC11_A396EmprCod, H02EC11_A652OpeCod, H02EC11_A653OpeNom, H02EC11_n653OpeNom
            }
            , new Object[] {
            H02EC12_A396EmprCod, H02EC12_A457FasCod, H02EC12_A460FasDsc, H02EC12_A456FasActTin, H02EC12_n456FasActTin
            }
            , new Object[] {
            H02EC13_A396EmprCod, H02EC13_A656ParCod, H02EC13_A867ParCodNom, H02EC13_n867ParCodNom
            }
         }
      );
      AV394Pgmname = "Balance.WPExpAuto" ;
      /* GeneXus formulas. */
      AV394Pgmname = "Balance.WPExpAuto" ;
      Gx_err = (short)(0) ;
      edtavTotvaluemetpiecod_Enabled = 0 ;
      edtavTotvaluemetpiekil_Enabled = 0 ;
      edtavTotvaluemetpiemet_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte AV32BarCodReo ;
   private byte gxajaxcallmode ;
   private byte A1168LecBarReo ;
   private byte AV17LecBarReo ;
   private byte A132BarCodReo ;
   private byte A2816MetPieEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV137MaqFasi ;
   private byte AV35Barfasest ;
   private byte A153BarFasEst ;
   private byte AV84FsSgts ;
   private byte AV168Tintutex ;
   private byte A3399DisRefBCRe ;
   private byte AV34BarEst ;
   private byte AV400GXLvl452 ;
   private byte AV79FlagCB ;
   private byte AV133Magosa ;
   private byte AV77Finite ;
   private byte AV82FlagRibes ;
   private byte AV83FlagSit ;
   private byte AV92JBP ;
   private byte AV62Estamp ;
   private byte AV167TinEst ;
   private byte AV73FasMan ;
   private byte AV91JBMartin ;
   private byte AV145NoProc ;
   private byte AV66F_vt ;
   private byte AV87Hidro ;
   private byte AV75Fidel ;
   private byte AV44CieHrI ;
   private byte AV45Cierre_Hdr ;
   private byte AV65ExpSinDetail ;
   private byte AV42Carolina ;
   private byte AV94KgMtcc ;
   private byte AV50CosFrac ;
   private byte AV64Expcondetail ;
   private byte AV158PzasTrozos ;
   private byte AV166Tinamar ;
   private byte AV48ContadorCarvema ;
   private byte AV49ContadorErfoc ;
   private byte AV41bianco ;
   private byte AV43Carvitin ;
   private byte AV60Endutex ;
   private byte AV55defectos ;
   private byte AV51crearalbaranproduccion ;
   private byte AV54ctrlsinrollos ;
   private byte GXt_int13 ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV383InMaqNom ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV383InMaqNom ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short A656ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV373GridActions ;
   private short A6635MetPieAnc ;
   private short A12994MetPieDfUl ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A194BarOrdLin ;
   private short AV38BarOrdLin ;
   private short GXv_int10[] ;
   private short AV100LecFasord ;
   private short AV106Lecparcod ;
   private short AV23Revhdm ;
   private short AV24MetSim ;
   private int wcpOAV380InOpeCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_60 ;
   private int AV380InOpeCod ;
   private int nGXsfl_60_idx=1 ;
   private int AV10BarCod ;
   private int AV14LecBarCod ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int A652OpeCod ;
   private int edtavBarcod_Enabled ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divTableinformation_Visible ;
   private int divTableinformationcliente_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV5OpeCod ;
   private int edtavOpecod_Visible ;
   private int edtavMaqcod_Visible ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluemetpiecod_Enabled ;
   private int edtavTotvaluemetpiekil_Enabled ;
   private int edtavTotvaluemetpiemet_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV352PageToGo ;
   private int AV29Barcada ;
   private int A3398DisRefBarC ;
   private int AV56Discod ;
   private int A361DisCod ;
   private int AV105LecOpeCod ;
   private int AV154Pass00 ;
   private int GXt_int14 ;
   private int GXv_int8[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV371GridCurrentPage ;
   private long AV372GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV386TotMetPieCod ;
   private java.math.BigDecimal AV388TotMetPieKil ;
   private java.math.BigDecimal AV390TotMetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String wcpOAV381InOpeNom ;
   private String wcpOAV382InMaqCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Balance_Stopped_weight ;
   private String Balance_Stopped_unit ;
   private String Balance_Stopped_raw ;
   private String Balance_Stopped_timestamp ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_opecod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV381InOpeNom ;
   private String AV382InMaqCod ;
   private String sGXsfl_60_idx="0001" ;
   private String AV394Pgmname ;
   private String AV31BarCodPar ;
   private String AV20EmprCod ;
   private String AV138MaqNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV11LecMaqCod ;
   private String AV16LecParNom ;
   private String AV173vDesEstado ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A653OpeNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A456FasActTin ;
   private String A867ParCodNom ;
   private String AV18LecBarPar ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String divMaincontent_Internalname ;
   private String divContentleft_Internalname ;
   private String divHeadercontent_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableheaderinput_Internalname ;
   private String lblTboperario_Internalname ;
   private String lblTboperario_Jsonclick ;
   private String Combo_opecod_Caption ;
   private String Combo_opecod_Cls ;
   private String Combo_opecod_Internalname ;
   private String lblTbhojaruta_Internalname ;
   private String lblTbhojaruta_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String lblTbmaquina_Internalname ;
   private String lblTbmaquina_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Internalname ;
   private String divErrorcontent_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTabledatalist_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
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
   private String Gridpaginationbar_Internalname ;
   private String divContentwidget_Internalname ;
   private String Balance_Title ;
   private String Balance_Internalname ;
   private String divActionbarwidget_Internalname ;
   private String divContentwidgetcenter_Internalname ;
   private String lblTbwidgetvalue_Internalname ;
   private String lblTbwidgetvalue_Caption ;
   private String lblTbwidgetvalue_Jsonclick ;
   private String Btnwidget_Beforeiconclass ;
   private String Btnwidget_Caption ;
   private String Btnwidget_Class ;
   private String Btnwidget_Internalname ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divTableinformation_Internalname ;
   private String lblTbmaquinaintroduzida_Internalname ;
   private String lblTbmaquinaintroduzida_Caption ;
   private String lblTbmaquinaintroduzida_Jsonclick ;
   private String divTableinformationcliente_Internalname ;
   private String lblTbclientinfo_Internalname ;
   private String lblTbclientinfo_Caption ;
   private String lblTbclientinfo_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavOpecod_Internalname ;
   private String edtavOpecod_Jsonclick ;
   private String edtavMaqcod_Internalname ;
   private String AV6MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A2809MetTerCod ;
   private String edtMetTerCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieObs_Internalname ;
   private String edtMetPieDfUl_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Internalname ;
   private String edtavTotvaluemetpiecod_Internalname ;
   private String edtavTotvaluemetpiekil_Internalname ;
   private String edtavTotvaluemetpiemet_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV19Station ;
   private String AV21EmprNom ;
   private String AV351UsurCod ;
   private String Grid_empowerer_Gridinternalname ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Sortedstatus ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A620MaqTip ;
   private String A602MaqCod ;
   private String AV183MaqTip ;
   private String AV182MaqEst ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String A8482OpeAct ;
   private String Combo_opecod_Selectedvalue_set ;
   private String A152BarFasCon ;
   private String A6011FasTip ;
   private String A7600FasH2OReh ;
   private String A758ProCod ;
   private String AV69FasCodi ;
   private String AV71FasDscmf ;
   private String AV74FasTip ;
   private String AV156Procod ;
   private String AV93KgMt ;
   private String A1142MaqFCod ;
   private String AV70FasCodmf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A3400DisRefBCPa ;
   private String AV86HDRs ;
   private String AV98LecFasCod ;
   private String AV67FasAgr ;
   private String AV63EstFase ;
   private String AV164terminus ;
   private String GXv_char11[] ;
   private String GXt_char1 ;
   private String GXv_char12[] ;
   private String Balance_Server ;
   private String Balance_Device_id ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemetpiecod_Jsonclick ;
   private String edtavTotvaluemetpiekil_Jsonclick ;
   private String edtavTotvaluemetpiemet_Jsonclick ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieObs_Jsonclick ;
   private String edtMetPieDfUl_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV361OrderedDsc ;
   private boolean wbLoad ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private boolean n620MaqTip ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n6011FasTip ;
   private boolean n7600FasH2OReh ;
   private boolean brk2EC8 ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1167LecBarCod ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1188LecFasOrd ;
   private boolean n456FasActTin ;
   private boolean n867ParCodNom ;
   private String AV191Log ;
   private String AV188Device_id ;
   private String AV12LecMaqNom ;
   private String AV13LecNom ;
   private String AV15LecFasNom ;
   private String AV196Title ;
   private String AV187DataHoraCaptura ;
   private String AV195RawCapturado ;
   private String AV197UnidadeCapturada ;
   private String AV194PesoCapturado ;
   private String A4917MetPieObs ;
   private String AV387TotValueMetPieCod ;
   private String AV389TotValueMetPieKil ;
   private String AV391TotValueMetPieMet ;
   private String A13748OpeCNom ;
   private String AV184BalanceServer ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV189HTTPRequest ;
   private com.genexus.webpanels.WebSession AV362Session ;
   private com.genexus.webpanels.GXUserControl ucCombo_opecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucBalance ;
   private com.genexus.webpanels.GXUserControl ucBtnwidget ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private int[] H02EC2_A129BarCod ;
   private byte[] H02EC2_A132BarCodReo ;
   private String[] H02EC2_A130BarCodPar ;
   private String[] H02EC2_A228BarUniMed ;
   private short[] H02EC2_A12994MetPieDfUl ;
   private String[] H02EC2_A4917MetPieObs ;
   private byte[] H02EC2_A2816MetPieEst ;
   private java.math.BigDecimal[] H02EC2_A4910MetPieMtD ;
   private short[] H02EC2_A6635MetPieAnc ;
   private java.math.BigDecimal[] H02EC2_A2815MetPieMet ;
   private java.math.BigDecimal[] H02EC2_A2814MetPieKil ;
   private String[] H02EC2_A2813MetPieCod ;
   private String[] H02EC2_A2809MetTerCod ;
   private String[] H02EC2_A396EmprCod ;
   private long[] H02EC3_AGRID_nRecordCount ;
   private String[] H02EC4_A396EmprCod ;
   private String[] H02EC4_A2809MetTerCod ;
   private String[] H02EC4_A2813MetPieCod ;
   private String[] H02EC4_A130BarCodPar ;
   private byte[] H02EC4_A132BarCodReo ;
   private int[] H02EC4_A129BarCod ;
   private java.math.BigDecimal[] H02EC4_A2814MetPieKil ;
   private java.math.BigDecimal[] H02EC4_A2815MetPieMet ;
   private String[] H02EC5_A607MaqEst ;
   private boolean[] H02EC5_n607MaqEst ;
   private String[] H02EC5_A396EmprCod ;
   private String[] H02EC5_A606MaqDsc ;
   private boolean[] H02EC5_n606MaqDsc ;
   private String[] H02EC5_A620MaqTip ;
   private boolean[] H02EC5_n620MaqTip ;
   private String[] H02EC5_A602MaqCod ;
   private String[] H02EC6_A396EmprCod ;
   private String[] H02EC6_A8482OpeAct ;
   private boolean[] H02EC6_n8482OpeAct ;
   private String[] H02EC6_A13748OpeCNom ;
   private int[] H02EC6_A652OpeCod ;
   private String[] H02EC6_A653OpeNom ;
   private boolean[] H02EC6_n653OpeNom ;
   private String[] H02EC7_A457FasCod ;
   private String[] H02EC7_A152BarFasCon ;
   private byte[] H02EC7_A153BarFasEst ;
   private String[] H02EC7_A130BarCodPar ;
   private byte[] H02EC7_A132BarCodReo ;
   private int[] H02EC7_A129BarCod ;
   private String[] H02EC7_A396EmprCod ;
   private String[] H02EC7_A460FasDsc ;
   private String[] H02EC7_A6011FasTip ;
   private boolean[] H02EC7_n6011FasTip ;
   private String[] H02EC7_A7600FasH2OReh ;
   private boolean[] H02EC7_n7600FasH2OReh ;
   private short[] H02EC7_A194BarOrdLin ;
   private String[] H02EC7_A758ProCod ;
   private String[] H02EC8_A1142MaqFCod ;
   private String[] H02EC8_A602MaqCod ;
   private String[] H02EC8_A396EmprCod ;
   private String[] H02EC9_A396EmprCod ;
   private String[] H02EC9_A3607DisRefBPie ;
   private int[] H02EC9_A361DisCod ;
   private String[] H02EC9_A3400DisRefBCPa ;
   private byte[] H02EC9_A3399DisRefBCRe ;
   private int[] H02EC9_A3398DisRefBarC ;
   private short[] H02EC10_A1172LecParCod ;
   private boolean[] H02EC10_n1172LecParCod ;
   private String[] H02EC10_A1171LecFasCod ;
   private boolean[] H02EC10_n1171LecFasCod ;
   private int[] H02EC10_A1170LecOpeCod ;
   private boolean[] H02EC10_n1170LecOpeCod ;
   private String[] H02EC10_A396EmprCod ;
   private String[] H02EC10_A1166LecMaqCod ;
   private int[] H02EC10_A1167LecBarCod ;
   private boolean[] H02EC10_n1167LecBarCod ;
   private String[] H02EC10_A1169LecBarPar ;
   private boolean[] H02EC10_n1169LecBarPar ;
   private byte[] H02EC10_A1168LecBarReo ;
   private boolean[] H02EC10_n1168LecBarReo ;
   private short[] H02EC10_A1188LecFasOrd ;
   private boolean[] H02EC10_n1188LecFasOrd ;
   private String[] H02EC11_A396EmprCod ;
   private int[] H02EC11_A652OpeCod ;
   private String[] H02EC11_A653OpeNom ;
   private boolean[] H02EC11_n653OpeNom ;
   private String[] H02EC12_A396EmprCod ;
   private String[] H02EC12_A457FasCod ;
   private String[] H02EC12_A460FasDsc ;
   private String[] H02EC12_A456FasActTin ;
   private boolean[] H02EC12_n456FasActTin ;
   private String[] H02EC13_A396EmprCod ;
   private short[] H02EC13_A656ParCod ;
   private String[] H02EC13_A867ParCodNom ;
   private boolean[] H02EC13_n867ParCodNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV7OpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV9MaqCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV8Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV179DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPContext AV198WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV356TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV358GridState ;
}

final  class wpexpauto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02EC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          boolean AV361OrderedDsc ,
                                          int A129BarCod ,
                                          int AV10BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV32BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV31BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[8];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieEst, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil, T1.MetPieCod," ;
      sSelectString += " T1.MetTerCod, T1.EmprCod" ;
      sFromString = " FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! AV361OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MetPieKil" ;
      }
      else if ( AV361OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MetPieKil DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H02EC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          boolean AV361OrderedDsc ,
                                          int A129BarCod ,
                                          int AV10BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV32BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV31BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[3];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      scmdbuf += sWhereString ;
      if ( ! AV361OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( AV361OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_H02EC2(context, remoteHandle, httpContext, ((Boolean) dynConstraints[0]).booleanValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_H02EC3(context, remoteHandle, httpContext, ((Boolean) dynConstraints[0]).booleanValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02EC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC4", "SELECT EmprCod, MetTerCod, MetPieCod, BarCodPar, BarCodReo, BarCod, MetPieKil, MetPieMet FROM TXPLMETPI WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC5", "SELECT MaqEst, EmprCod, MaqDsc, MaqTip, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC6", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR WHERE OpeAct = 'A' ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC7", "SELECT T1.FasCod, T1.BarFasCon, T1.BarFasEst, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.FasDsc, T2.FasTip, T2.FasH2OReh, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC8", "SELECT MaqFCod, MaqCod, EmprCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02EC9", "SELECT EmprCod, DisRefBPie, DisCod, DisRefBCPa, DisRefBCRe, DisRefBarC FROM TXPDISREF WHERE DisCod = ? ORDER BY DisRefBarC, DisRefBCRe, DisRefBCPa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EC10", "SELECT LecParCod, LecFasCod, LecOpeCod, EmprCod, LecMaqCod, LecBarCod, LecBarPar, LecBarReo, LecFasOrd FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02EC11", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02EC12", "SELECT EmprCod, FasCod, FasDsc, FasActTin FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02EC13", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[4]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 1);
               }
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

