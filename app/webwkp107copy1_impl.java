package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwkp107copy1_impl extends GXDataArea
{
   public webwkp107copy1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwkp107copy1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwkp107copy1_impl.class ));
   }

   public webwkp107copy1_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      nRC_GXsfl_34 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_34"))) ;
      nGXsfl_34_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_34_idx"))) ;
      sGXsfl_34_idx = httpContext.GetPar( "sGXsfl_34_idx") ;
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
      AV62EmprCod = httpContext.GetPar( "EmprCod") ;
      AV70FecInicio = localUtil.parseDateParm( httpContext.GetPar( "FecInicio")) ;
      AV69FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      AV165Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV166MaqCod10 = httpContext.GetPar( "MaqCod10") ;
      AV167Maqcod11 = httpContext.GetPar( "Maqcod11") ;
      AV168MaqCod12 = httpContext.GetPar( "MaqCod12") ;
      AV169Maqcod13 = httpContext.GetPar( "Maqcod13") ;
      AV170Maqcod14 = httpContext.GetPar( "Maqcod14") ;
      AV171Maqcod15 = httpContext.GetPar( "Maqcod15") ;
      AV172Maqcod16 = httpContext.GetPar( "Maqcod16") ;
      AV173Maqcod17 = httpContext.GetPar( "Maqcod17") ;
      AV174Maqcod18 = httpContext.GetPar( "Maqcod18") ;
      AV175Maqcod19 = httpContext.GetPar( "Maqcod19") ;
      AV176Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      AV177Maqcod20 = httpContext.GetPar( "Maqcod20") ;
      AV178Maqcod21 = httpContext.GetPar( "Maqcod21") ;
      AV179Maqcod22 = httpContext.GetPar( "Maqcod22") ;
      AV180Maqcod23 = httpContext.GetPar( "Maqcod23") ;
      AV181Maqcod24 = httpContext.GetPar( "Maqcod24") ;
      AV182Maqcod25 = httpContext.GetPar( "Maqcod25") ;
      AV183Maqcod26 = httpContext.GetPar( "Maqcod26") ;
      AV184Maqcod27 = httpContext.GetPar( "Maqcod27") ;
      AV185Maqcod28 = httpContext.GetPar( "Maqcod28") ;
      AV186Maqcod3 = httpContext.GetPar( "Maqcod3") ;
      AV187Maqcod4 = httpContext.GetPar( "Maqcod4") ;
      AV188Maqcod5 = httpContext.GetPar( "Maqcod5") ;
      AV189Maqcod6 = httpContext.GetPar( "Maqcod6") ;
      AV190Maqcod7 = httpContext.GetPar( "Maqcod7") ;
      AV191Maqcod8 = httpContext.GetPar( "Maqcod8") ;
      AV192Maqcod9 = httpContext.GetPar( "Maqcod9") ;
      AV225Maqdsc1 = httpContext.GetPar( "Maqdsc1") ;
      AV226Maqdsc10 = httpContext.GetPar( "Maqdsc10") ;
      AV227Maqdsc11 = httpContext.GetPar( "Maqdsc11") ;
      AV228Maqdsc12 = httpContext.GetPar( "Maqdsc12") ;
      AV229Maqdsc13 = httpContext.GetPar( "Maqdsc13") ;
      AV230Maqdsc14 = httpContext.GetPar( "Maqdsc14") ;
      AV231Maqdsc15 = httpContext.GetPar( "Maqdsc15") ;
      AV232MaqDsc16 = httpContext.GetPar( "MaqDsc16") ;
      AV233MaqDsc17 = httpContext.GetPar( "MaqDsc17") ;
      AV234MaqDsc18 = httpContext.GetPar( "MaqDsc18") ;
      AV235MaqDsc19 = httpContext.GetPar( "MaqDsc19") ;
      AV236Maqdsc2 = httpContext.GetPar( "Maqdsc2") ;
      AV237MaqDsc20 = httpContext.GetPar( "MaqDsc20") ;
      AV238MaqDsc21 = httpContext.GetPar( "MaqDsc21") ;
      AV239MaqDsc22 = httpContext.GetPar( "MaqDsc22") ;
      AV240MaqDsc23 = httpContext.GetPar( "MaqDsc23") ;
      AV241MaqDsc24 = httpContext.GetPar( "MaqDsc24") ;
      AV242MaqDsc25 = httpContext.GetPar( "MaqDsc25") ;
      AV243MaqDsc26 = httpContext.GetPar( "MaqDsc26") ;
      AV244MaqDsc27 = httpContext.GetPar( "MaqDsc27") ;
      AV245MaqDsc28 = httpContext.GetPar( "MaqDsc28") ;
      AV246Maqdsc3 = httpContext.GetPar( "Maqdsc3") ;
      AV247Maqdsc4 = httpContext.GetPar( "Maqdsc4") ;
      AV248Maqdsc5 = httpContext.GetPar( "Maqdsc5") ;
      AV249Maqdsc6 = httpContext.GetPar( "Maqdsc6") ;
      AV250Maqdsc7 = httpContext.GetPar( "Maqdsc7") ;
      AV251Maqdsc8 = httpContext.GetPar( "Maqdsc8") ;
      AV252Maqdsc9 = httpContext.GetPar( "Maqdsc9") ;
      AV333t = (short)(GXutil.lval( httpContext.GetPar( "t"))) ;
      AV360ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV355ColumnsSelector);
      AV164Maqcod = httpContext.GetPar( "Maqcod") ;
      AV41Barordlin = (short)(GXutil.lval( httpContext.GetPar( "Barordlin"))) ;
      AV30Barfasestant = (byte)(GXutil.lval( httpContext.GetPar( "Barfasestant"))) ;
      AV366Pgmname = httpContext.GetPar( "Pgmname") ;
      AV362FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV10Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV18Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV14Barcodpar = httpContext.GetPar( "Barcodpar") ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV88Hdr2 = httpContext.GetPar( "Hdr2") ;
      AV8B2 = (short)(GXutil.lval( httpContext.GetPar( "B2"))) ;
      AV75G2 = (short)(GXutil.lval( httpContext.GetPar( "G2"))) ;
      AV296R2 = (short)(GXutil.lval( httpContext.GetPar( "R2"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV333t, AV360ManageFiltersExecutionStep, AV355ColumnsSelector, AV164Maqcod, AV41Barordlin, AV30Barfasestant, AV366Pgmname, AV362FilterFullText, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV296R2) ;
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
      paAM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAM2( ) ;
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
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwkp107copy1", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV333t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV366Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV296R2), "ZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV358ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV358ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV361DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV361DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV355ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV355ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV62EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_MAQ", AV335Tab_maq);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_MAQ", AV335Tab_maq);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vFECINICIO", localUtil.dtoc( AV70FecInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHAFIN", localUtil.dtoc( AV69FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC1", GXutil.rtrim( AV225Maqdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC10", GXutil.rtrim( AV226Maqdsc10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC11", GXutil.rtrim( AV227Maqdsc11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC12", GXutil.rtrim( AV228Maqdsc12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC13", GXutil.rtrim( AV229Maqdsc13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC14", GXutil.rtrim( AV230Maqdsc14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC15", GXutil.rtrim( AV231Maqdsc15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC16", GXutil.rtrim( AV232MaqDsc16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC17", GXutil.rtrim( AV233MaqDsc17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC18", GXutil.rtrim( AV234MaqDsc18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC19", GXutil.rtrim( AV235MaqDsc19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC2", GXutil.rtrim( AV236Maqdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC20", GXutil.rtrim( AV237MaqDsc20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC21", GXutil.rtrim( AV238MaqDsc21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC22", GXutil.rtrim( AV239MaqDsc22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC23", GXutil.rtrim( AV240MaqDsc23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC24", GXutil.rtrim( AV241MaqDsc24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC25", GXutil.rtrim( AV242MaqDsc25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC26", GXutil.rtrim( AV243MaqDsc26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC27", GXutil.rtrim( AV244MaqDsc27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC28", GXutil.rtrim( AV245MaqDsc28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC3", GXutil.rtrim( AV246Maqdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC4", GXutil.rtrim( AV247Maqdsc4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC5", GXutil.rtrim( AV248Maqdsc5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC6", GXutil.rtrim( AV249Maqdsc6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC7", GXutil.rtrim( AV250Maqdsc7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC8", GXutil.rtrim( AV251Maqdsc8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC9", GXutil.rtrim( AV252Maqdsc9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQHDRS", AV253MaqHdrs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQHDRS", AV253MaqHdrs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vT", GXutil.ltrim( localUtil.ntoc( AV333t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV333t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV360ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV164Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV41Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTANT", GXutil.ltrim( localUtil.ntoc( AV30Barfasestant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV366Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV366Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV18Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV14Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2", GXutil.ltrim( localUtil.ntoc( AV8B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2", GXutil.ltrim( localUtil.ntoc( AV75G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2", GXutil.ltrim( localUtil.ntoc( AV296R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV296R2), "ZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV351GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV351GridState);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_Eof", GXutil.booltostr( AV5Archivo.getEof()));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         weAM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAM2( ) ;
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
      return formatLink("app.webwkp107copy1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWkp107Copy1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Wkp107 Copy1", "") ;
   }

   public void wbAM0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWkp107Copy1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_AM2( true) ;
      }
      else
      {
         wb_table1_19_AM2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_AM2e( boolean wbgen )
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
         startgridcontrol34( ) ;
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (int)(nGXsfl_34_idx-1) ;
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV361DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV361DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV355ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 34 )
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

   public void startAM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Wkp107 Copy1", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAM0( ) ;
   }

   public void wsAM2( )
   {
      startAM2( ) ;
      evtAM2( ) ;
   }

   public void evtAM2( )
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
                           e11AM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12AM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
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
                           nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV363GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV363GridActions), 4, 0));
                           AV77Hdr1 = httpContext.cgiGet( edtavHdr1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
                           AV88Hdr2 = httpContext.cgiGet( edtavHdr2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
                           AV98Hdr3 = httpContext.cgiGet( edtavHdr3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
                           AV99Hdr4 = httpContext.cgiGet( edtavHdr4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
                           AV100Hdr5 = httpContext.cgiGet( edtavHdr5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
                           AV101Hdr6 = httpContext.cgiGet( edtavHdr6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
                           AV102Hdr7 = httpContext.cgiGet( edtavHdr7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
                           AV103Hdr8 = httpContext.cgiGet( edtavHdr8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
                           AV104Hdr9 = httpContext.cgiGet( edtavHdr9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
                           AV78Hdr10 = httpContext.cgiGet( edtavHdr10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
                           AV79Hdr11 = httpContext.cgiGet( edtavHdr11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
                           AV80Hdr12 = httpContext.cgiGet( edtavHdr12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
                           AV81Hdr13 = httpContext.cgiGet( edtavHdr13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
                           AV82Hdr14 = httpContext.cgiGet( edtavHdr14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
                           AV83Hdr15 = httpContext.cgiGet( edtavHdr15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
                           AV84Hdr16 = httpContext.cgiGet( edtavHdr16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
                           AV85Hdr17 = httpContext.cgiGet( edtavHdr17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
                           AV86Hdr18 = httpContext.cgiGet( edtavHdr18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
                           AV87Hdr19 = httpContext.cgiGet( edtavHdr19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
                           AV89Hdr20 = httpContext.cgiGet( edtavHdr20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
                           AV90Hdr21 = httpContext.cgiGet( edtavHdr21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
                           AV91Hdr22 = httpContext.cgiGet( edtavHdr22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
                           AV92Hdr23 = httpContext.cgiGet( edtavHdr23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
                           AV93Hdr24 = httpContext.cgiGet( edtavHdr24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
                           AV94Hdr25 = httpContext.cgiGet( edtavHdr25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
                           AV95Hdr26 = httpContext.cgiGet( edtavHdr26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
                           AV96Hdr27 = httpContext.cgiGet( edtavHdr27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
                           AV97Hdr28 = httpContext.cgiGet( edtavHdr28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
                           AV112Linea1 = httpContext.cgiGet( edtavLinea1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea1_Internalname, AV112Linea1);
                           AV113Linea10 = httpContext.cgiGet( edtavLinea10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea10_Internalname, AV113Linea10);
                           AV114Linea11 = httpContext.cgiGet( edtavLinea11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea11_Internalname, AV114Linea11);
                           AV115Linea12 = httpContext.cgiGet( edtavLinea12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea12_Internalname, AV115Linea12);
                           AV116Linea13 = httpContext.cgiGet( edtavLinea13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea13_Internalname, AV116Linea13);
                           AV117Linea14 = httpContext.cgiGet( edtavLinea14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea14_Internalname, AV117Linea14);
                           AV118Linea15 = httpContext.cgiGet( edtavLinea15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea15_Internalname, AV118Linea15);
                           AV119Linea16 = httpContext.cgiGet( edtavLinea16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea16_Internalname, AV119Linea16);
                           AV120Linea17 = httpContext.cgiGet( edtavLinea17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea17_Internalname, AV120Linea17);
                           AV121Linea18 = httpContext.cgiGet( edtavLinea18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea18_Internalname, AV121Linea18);
                           AV122Linea19 = httpContext.cgiGet( edtavLinea19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea19_Internalname, AV122Linea19);
                           AV123Linea2 = httpContext.cgiGet( edtavLinea2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea2_Internalname, AV123Linea2);
                           AV124Linea20 = httpContext.cgiGet( edtavLinea20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea20_Internalname, AV124Linea20);
                           AV125Linea21 = httpContext.cgiGet( edtavLinea21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea21_Internalname, AV125Linea21);
                           AV126Linea22 = httpContext.cgiGet( edtavLinea22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea22_Internalname, AV126Linea22);
                           AV127Linea23 = httpContext.cgiGet( edtavLinea23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea23_Internalname, AV127Linea23);
                           AV128Linea24 = httpContext.cgiGet( edtavLinea24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea24_Internalname, AV128Linea24);
                           AV129Linea25 = httpContext.cgiGet( edtavLinea25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea25_Internalname, AV129Linea25);
                           AV130Linea26 = httpContext.cgiGet( edtavLinea26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea26_Internalname, AV130Linea26);
                           AV131Linea27 = httpContext.cgiGet( edtavLinea27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea27_Internalname, AV131Linea27);
                           AV132Linea28 = httpContext.cgiGet( edtavLinea28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea28_Internalname, AV132Linea28);
                           AV133Linea3 = httpContext.cgiGet( edtavLinea3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea3_Internalname, AV133Linea3);
                           AV134Linea4 = httpContext.cgiGet( edtavLinea4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea4_Internalname, AV134Linea4);
                           AV135Linea5 = httpContext.cgiGet( edtavLinea5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea5_Internalname, AV135Linea5);
                           AV136Linea6 = httpContext.cgiGet( edtavLinea6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea6_Internalname, AV136Linea6);
                           AV137Linea7 = httpContext.cgiGet( edtavLinea7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea7_Internalname, AV137Linea7);
                           AV138LInea8 = httpContext.cgiGet( edtavLinea8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea8_Internalname, AV138LInea8);
                           AV139Linea9 = httpContext.cgiGet( edtavLinea9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea9_Internalname, AV139Linea9);
                           AV165Maqcod1 = httpContext.cgiGet( edtavMaqcod1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod1_Internalname, AV165Maqcod1);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
                           AV166MaqCod10 = httpContext.cgiGet( edtavMaqcod10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod10_Internalname, AV166MaqCod10);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
                           AV167Maqcod11 = httpContext.cgiGet( edtavMaqcod11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod11_Internalname, AV167Maqcod11);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
                           AV168MaqCod12 = httpContext.cgiGet( edtavMaqcod12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod12_Internalname, AV168MaqCod12);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
                           AV169Maqcod13 = httpContext.cgiGet( edtavMaqcod13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod13_Internalname, AV169Maqcod13);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
                           AV170Maqcod14 = httpContext.cgiGet( edtavMaqcod14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod14_Internalname, AV170Maqcod14);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
                           AV171Maqcod15 = httpContext.cgiGet( edtavMaqcod15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod15_Internalname, AV171Maqcod15);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
                           AV172Maqcod16 = httpContext.cgiGet( edtavMaqcod16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod16_Internalname, AV172Maqcod16);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
                           AV173Maqcod17 = httpContext.cgiGet( edtavMaqcod17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod17_Internalname, AV173Maqcod17);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
                           AV174Maqcod18 = httpContext.cgiGet( edtavMaqcod18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod18_Internalname, AV174Maqcod18);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
                           AV175Maqcod19 = httpContext.cgiGet( edtavMaqcod19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod19_Internalname, AV175Maqcod19);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
                           AV176Maqcod2 = httpContext.cgiGet( edtavMaqcod2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod2_Internalname, AV176Maqcod2);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
                           AV177Maqcod20 = httpContext.cgiGet( edtavMaqcod20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod20_Internalname, AV177Maqcod20);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
                           AV178Maqcod21 = httpContext.cgiGet( edtavMaqcod21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod21_Internalname, AV178Maqcod21);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
                           AV179Maqcod22 = httpContext.cgiGet( edtavMaqcod22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod22_Internalname, AV179Maqcod22);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
                           AV180Maqcod23 = httpContext.cgiGet( edtavMaqcod23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod23_Internalname, AV180Maqcod23);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
                           AV181Maqcod24 = httpContext.cgiGet( edtavMaqcod24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod24_Internalname, AV181Maqcod24);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
                           AV182Maqcod25 = httpContext.cgiGet( edtavMaqcod25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod25_Internalname, AV182Maqcod25);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
                           AV183Maqcod26 = httpContext.cgiGet( edtavMaqcod26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod26_Internalname, AV183Maqcod26);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
                           AV184Maqcod27 = httpContext.cgiGet( edtavMaqcod27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod27_Internalname, AV184Maqcod27);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
                           AV185Maqcod28 = httpContext.cgiGet( edtavMaqcod28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod28_Internalname, AV185Maqcod28);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
                           AV186Maqcod3 = httpContext.cgiGet( edtavMaqcod3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod3_Internalname, AV186Maqcod3);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
                           AV187Maqcod4 = httpContext.cgiGet( edtavMaqcod4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod4_Internalname, AV187Maqcod4);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
                           AV188Maqcod5 = httpContext.cgiGet( edtavMaqcod5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod5_Internalname, AV188Maqcod5);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
                           AV189Maqcod6 = httpContext.cgiGet( edtavMaqcod6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod6_Internalname, AV189Maqcod6);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
                           AV190Maqcod7 = httpContext.cgiGet( edtavMaqcod7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod7_Internalname, AV190Maqcod7);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
                           AV191Maqcod8 = httpContext.cgiGet( edtavMaqcod8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod8_Internalname, AV191Maqcod8);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
                           AV192Maqcod9 = httpContext.cgiGet( edtavMaqcod9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod9_Internalname, AV192Maqcod9);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13AM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14AM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e15AM2 ();
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

   public void weAM2( )
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

   public void paAM2( )
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
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV62EmprCod ,
                                 java.util.Date AV70FecInicio ,
                                 java.util.Date AV69FechaFin ,
                                 String AV165Maqcod1 ,
                                 String AV166MaqCod10 ,
                                 String AV167Maqcod11 ,
                                 String AV168MaqCod12 ,
                                 String AV169Maqcod13 ,
                                 String AV170Maqcod14 ,
                                 String AV171Maqcod15 ,
                                 String AV172Maqcod16 ,
                                 String AV173Maqcod17 ,
                                 String AV174Maqcod18 ,
                                 String AV175Maqcod19 ,
                                 String AV176Maqcod2 ,
                                 String AV177Maqcod20 ,
                                 String AV178Maqcod21 ,
                                 String AV179Maqcod22 ,
                                 String AV180Maqcod23 ,
                                 String AV181Maqcod24 ,
                                 String AV182Maqcod25 ,
                                 String AV183Maqcod26 ,
                                 String AV184Maqcod27 ,
                                 String AV185Maqcod28 ,
                                 String AV186Maqcod3 ,
                                 String AV187Maqcod4 ,
                                 String AV188Maqcod5 ,
                                 String AV189Maqcod6 ,
                                 String AV190Maqcod7 ,
                                 String AV191Maqcod8 ,
                                 String AV192Maqcod9 ,
                                 String AV225Maqdsc1 ,
                                 String AV226Maqdsc10 ,
                                 String AV227Maqdsc11 ,
                                 String AV228Maqdsc12 ,
                                 String AV229Maqdsc13 ,
                                 String AV230Maqdsc14 ,
                                 String AV231Maqdsc15 ,
                                 String AV232MaqDsc16 ,
                                 String AV233MaqDsc17 ,
                                 String AV234MaqDsc18 ,
                                 String AV235MaqDsc19 ,
                                 String AV236Maqdsc2 ,
                                 String AV237MaqDsc20 ,
                                 String AV238MaqDsc21 ,
                                 String AV239MaqDsc22 ,
                                 String AV240MaqDsc23 ,
                                 String AV241MaqDsc24 ,
                                 String AV242MaqDsc25 ,
                                 String AV243MaqDsc26 ,
                                 String AV244MaqDsc27 ,
                                 String AV245MaqDsc28 ,
                                 String AV246Maqdsc3 ,
                                 String AV247Maqdsc4 ,
                                 String AV248Maqdsc5 ,
                                 String AV249Maqdsc6 ,
                                 String AV250Maqdsc7 ,
                                 String AV251Maqdsc8 ,
                                 String AV252Maqdsc9 ,
                                 short AV333t ,
                                 byte AV360ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV355ColumnsSelector ,
                                 String AV164Maqcod ,
                                 short AV41Barordlin ,
                                 byte AV30Barfasestant ,
                                 String AV366Pgmname ,
                                 String AV362FilterFullText ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 int AV10Barcod ,
                                 byte A132BarCodReo ,
                                 byte AV18Barcodreo ,
                                 String A130BarCodPar ,
                                 String AV14Barcodpar ,
                                 String A150BarFacTin ,
                                 byte A153BarFasEst ,
                                 short A194BarOrdLin ,
                                 String AV88Hdr2 ,
                                 short AV8B2 ,
                                 short AV75G2 ,
                                 short AV296R2 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14AM2 ();
      GRID_nCurrentRecord = 0 ;
      rfAM2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD1", GXutil.rtrim( AV165Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD10", GXutil.rtrim( AV166MaqCod10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD11", GXutil.rtrim( AV167Maqcod11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD12", GXutil.rtrim( AV168MaqCod12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD13", GXutil.rtrim( AV169Maqcod13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD14", GXutil.rtrim( AV170Maqcod14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD15", GXutil.rtrim( AV171Maqcod15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD16", GXutil.rtrim( AV172Maqcod16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD17", GXutil.rtrim( AV173Maqcod17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD18", GXutil.rtrim( AV174Maqcod18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD19", GXutil.rtrim( AV175Maqcod19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV176Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD20", GXutil.rtrim( AV177Maqcod20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD21", GXutil.rtrim( AV178Maqcod21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD22", GXutil.rtrim( AV179Maqcod22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD23", GXutil.rtrim( AV180Maqcod23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD24", GXutil.rtrim( AV181Maqcod24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD25", GXutil.rtrim( AV182Maqcod25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD26", GXutil.rtrim( AV183Maqcod26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD27", GXutil.rtrim( AV184Maqcod27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD28", GXutil.rtrim( AV185Maqcod28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD3", GXutil.rtrim( AV186Maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD4", GXutil.rtrim( AV187Maqcod4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD5", GXutil.rtrim( AV188Maqcod5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD6", GXutil.rtrim( AV189Maqcod6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD7", GXutil.rtrim( AV190Maqcod7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD8", GXutil.rtrim( AV191Maqcod8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD9", GXutil.rtrim( AV192Maqcod9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDR2", GXutil.rtrim( AV88Hdr2));
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
      rfAM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV366Pgmname = "WebWkp107Copy1" ;
      Gx_err = (short)(0) ;
      edtavHdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr1_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr2_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr3_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr4_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr5_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr6_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr7_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr8_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr9_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr10_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr11_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr12_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr13_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr14_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr15_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr16_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr17_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr18_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr19_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr20_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr21_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr22_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr23_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr24_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr25_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr26_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr27_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr28_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea1_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea10_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea11_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea12_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea13_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea14_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea15_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea16_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea17_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea18_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea19_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea2_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea20_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea21_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea22_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea23_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea24_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea25_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea26_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea27_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea28_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea3_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea4_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea5_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea6_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea7_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea8_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea9_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod1_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod10_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod11_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod12_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod13_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod14_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod15_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod16_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod17_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod18_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod19_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod2_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod20_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod21_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod22_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod23_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod24_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod25_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod26_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod27_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod28_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod3_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod4_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod5_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod6_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod7_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod8_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod9_Enabled), 5, 0), !bGXsfl_34_Refreshing);
   }

   public void rfAM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      /* Execute user event: Refresh */
      e14AM2 ();
      nGXsfl_34_idx = 1 ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_342( ) ;
         e15AM2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_34_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e15AM2 ();
         }
         wbEnd = (short)(34) ;
         wbAM0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesAM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV62EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECINICIO", localUtil.dtoc( AV70FecInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHAFIN", localUtil.dtoc( AV69FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC1", GXutil.rtrim( AV225Maqdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC10", GXutil.rtrim( AV226Maqdsc10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC11", GXutil.rtrim( AV227Maqdsc11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC12", GXutil.rtrim( AV228Maqdsc12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC13", GXutil.rtrim( AV229Maqdsc13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC14", GXutil.rtrim( AV230Maqdsc14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC15", GXutil.rtrim( AV231Maqdsc15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC16", GXutil.rtrim( AV232MaqDsc16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC17", GXutil.rtrim( AV233MaqDsc17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC18", GXutil.rtrim( AV234MaqDsc18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC19", GXutil.rtrim( AV235MaqDsc19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC2", GXutil.rtrim( AV236Maqdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC20", GXutil.rtrim( AV237MaqDsc20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC21", GXutil.rtrim( AV238MaqDsc21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC22", GXutil.rtrim( AV239MaqDsc22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC23", GXutil.rtrim( AV240MaqDsc23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC24", GXutil.rtrim( AV241MaqDsc24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC25", GXutil.rtrim( AV242MaqDsc25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC26", GXutil.rtrim( AV243MaqDsc26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC27", GXutil.rtrim( AV244MaqDsc27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC28", GXutil.rtrim( AV245MaqDsc28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC3", GXutil.rtrim( AV246Maqdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC4", GXutil.rtrim( AV247Maqdsc4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC5", GXutil.rtrim( AV248Maqdsc5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC6", GXutil.rtrim( AV249Maqdsc6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC7", GXutil.rtrim( AV250Maqdsc7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC8", GXutil.rtrim( AV251Maqdsc8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC9", GXutil.rtrim( AV252Maqdsc9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vT", GXutil.ltrim( localUtil.ntoc( AV333t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV333t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV164Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV41Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTANT", GXutil.ltrim( localUtil.ntoc( AV30Barfasestant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV366Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV366Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV18Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV14Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2", GXutil.ltrim( localUtil.ntoc( AV8B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2", GXutil.ltrim( localUtil.ntoc( AV75G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2", GXutil.ltrim( localUtil.ntoc( AV296R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV296R2), "ZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV333t, AV360ManageFiltersExecutionStep, AV355ColumnsSelector, AV164Maqcod, AV41Barordlin, AV30Barfasestant, AV366Pgmname, AV362FilterFullText, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV296R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV333t, AV360ManageFiltersExecutionStep, AV355ColumnsSelector, AV164Maqcod, AV41Barordlin, AV30Barfasestant, AV366Pgmname, AV362FilterFullText, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV296R2) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV333t, AV360ManageFiltersExecutionStep, AV355ColumnsSelector, AV164Maqcod, AV41Barordlin, AV30Barfasestant, AV366Pgmname, AV362FilterFullText, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV296R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV333t, AV360ManageFiltersExecutionStep, AV355ColumnsSelector, AV164Maqcod, AV41Barordlin, AV30Barfasestant, AV366Pgmname, AV362FilterFullText, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV296R2) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV333t, AV360ManageFiltersExecutionStep, AV355ColumnsSelector, AV164Maqcod, AV41Barordlin, AV30Barfasestant, AV366Pgmname, AV362FilterFullText, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV296R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV366Pgmname = "WebWkp107Copy1" ;
      Gx_err = (short)(0) ;
      edtavHdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr1_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr2_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr3_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr4_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr5_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr6_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr7_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr8_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr9_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr10_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr11_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr12_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr13_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr14_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr15_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr16_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr17_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr18_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr19_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr20_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr21_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr22_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr23_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr24_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr25_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr26_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr27_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr28_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea1_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea10_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea11_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea12_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea13_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea14_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea15_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea16_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea17_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea18_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea19_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea2_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea20_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea21_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea22_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea23_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea24_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea25_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea26_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea27_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea28_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea3_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea4_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea5_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea6_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea7_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea8_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavLinea9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea9_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod1_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod10_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod11_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod12_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod13_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod14_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod15_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod16_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod17_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod18_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod19_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod2_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod20_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod21_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod22_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod23_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod24_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod25_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod26_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod27_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod28_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod3_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod4_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod5_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod6_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod7_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod8_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMaqcod9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod9_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupAM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13AM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV358ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV361DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV355ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV362FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV362FilterFullText", AV362FilterFullText);
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
      e13AM2 ();
      if (returnInSub) return;
   }

   public void e13AM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV332Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwkp107copy1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV332Station = GXt_char1 ;
      GXv_char2[0] = AV62EmprCod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char4[0] = AV344UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV332Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwkp107copy1_impl.this.AV62EmprCod = GXv_char2[0] ;
      webwkp107copy1_impl.this.AV63EmprNom = GXv_char3[0] ;
      webwkp107copy1_impl.this.AV344UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      GXt_char1 = AV49Carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV62EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      webwkp107copy1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49Carpeta = GXt_char1 ;
      AV260NomInf = httpContext.getMessage( "MAQUINASPLN", "") ;
      GXt_int5 = AV59dias ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV62EmprCod, httpContext.getMessage( "DIASPL", ""), GXv_int6) ;
      webwkp107copy1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV59dias = (short)(GXt_int5) ;
      AV59dias = (short)(((AV59dias==0) ? 60 : AV59dias)) ;
      AV70FecInicio = GXutil.dadd(GXutil.today( ),-((int)(AV59dias))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FecInicio", localUtil.format(AV70FecInicio, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      AV69FechaFin = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69FechaFin", localUtil.format(AV69FechaFin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      GXt_char1 = AV332Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwkp107copy1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV332Station = GXt_char1 ;
      GXv_char4[0] = AV62EmprCod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char2[0] = AV344UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV332Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwkp107copy1_impl.this.AV62EmprCod = GXv_char4[0] ;
      webwkp107copy1_impl.this.AV63EmprNom = GXv_char3[0] ;
      webwkp107copy1_impl.this.AV344UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 15 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV348HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Web Wkp107 Copy1", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV361DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV361DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e14AM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "Actualizando Array de Maquinas", "") );
      GXv_char4[0] = AV62EmprCod ;
      new app.pprc207(remoteHandle, context).execute( GXv_char4, AV335Tab_maq) ;
      webwkp107copy1_impl.this.AV62EmprCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      System.out.println( httpContext.getMessage( "Creando fichero PLANO", "") );
      new app.copypprc218(remoteHandle, context).execute( ) ;
      GXv_char4[0] = AV62EmprCod ;
      GXv_char3[0] = AV165Maqcod1 ;
      GXv_char2[0] = AV166MaqCod10 ;
      GXv_char9[0] = AV167Maqcod11 ;
      GXv_char10[0] = AV168MaqCod12 ;
      GXv_char11[0] = AV169Maqcod13 ;
      GXv_char12[0] = AV170Maqcod14 ;
      GXv_char13[0] = AV171Maqcod15 ;
      GXv_char14[0] = AV172Maqcod16 ;
      GXv_char15[0] = AV173Maqcod17 ;
      GXv_char16[0] = AV174Maqcod18 ;
      GXv_char17[0] = AV175Maqcod19 ;
      GXv_char18[0] = AV176Maqcod2 ;
      GXv_char19[0] = AV177Maqcod20 ;
      GXv_char20[0] = AV178Maqcod21 ;
      GXv_char21[0] = AV179Maqcod22 ;
      GXv_char22[0] = AV180Maqcod23 ;
      GXv_char23[0] = AV181Maqcod24 ;
      GXv_char24[0] = AV182Maqcod25 ;
      GXv_char25[0] = AV183Maqcod26 ;
      GXv_char26[0] = AV184Maqcod27 ;
      GXv_char27[0] = AV185Maqcod28 ;
      GXv_char28[0] = AV186Maqcod3 ;
      GXv_char29[0] = AV187Maqcod4 ;
      GXv_char30[0] = AV188Maqcod5 ;
      GXv_char31[0] = AV189Maqcod6 ;
      GXv_char32[0] = AV190Maqcod7 ;
      GXv_char33[0] = AV191Maqcod8 ;
      GXv_char34[0] = AV192Maqcod9 ;
      GXv_char35[0] = AV225Maqdsc1 ;
      GXv_char36[0] = AV226Maqdsc10 ;
      GXv_char37[0] = AV227Maqdsc11 ;
      GXv_char38[0] = AV228Maqdsc12 ;
      GXv_char39[0] = AV229Maqdsc13 ;
      GXv_char40[0] = AV230Maqdsc14 ;
      GXv_char41[0] = AV231Maqdsc15 ;
      GXv_char42[0] = AV232MaqDsc16 ;
      GXv_char43[0] = AV233MaqDsc17 ;
      GXv_char44[0] = AV234MaqDsc18 ;
      GXv_char45[0] = AV235MaqDsc19 ;
      GXv_char46[0] = AV236Maqdsc2 ;
      GXv_char47[0] = AV237MaqDsc20 ;
      GXv_char48[0] = AV238MaqDsc21 ;
      GXv_char49[0] = AV239MaqDsc22 ;
      GXv_char50[0] = AV240MaqDsc23 ;
      GXv_char51[0] = AV241MaqDsc24 ;
      GXv_char52[0] = AV242MaqDsc25 ;
      GXv_char53[0] = AV243MaqDsc26 ;
      GXv_char54[0] = AV244MaqDsc27 ;
      GXv_char55[0] = AV245MaqDsc28 ;
      GXv_char56[0] = AV246Maqdsc3 ;
      GXv_char57[0] = AV247Maqdsc4 ;
      GXv_char58[0] = AV248Maqdsc5 ;
      GXv_char59[0] = AV249Maqdsc6 ;
      GXv_char60[0] = AV250Maqdsc7 ;
      GXv_char61[0] = AV251Maqdsc8 ;
      GXv_char62[0] = AV252Maqdsc9 ;
      GXv_int63[0] = AV333t ;
      new app.pprc204(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_char21, GXv_char22, GXv_char23, GXv_char24, GXv_char25, GXv_char26, GXv_char27, GXv_char28, GXv_char29, GXv_char30, GXv_char31, GXv_char32, GXv_char33, GXv_char34, GXv_char35, GXv_char36, GXv_char37, GXv_char38, GXv_char39, GXv_char40, GXv_char41, GXv_char42, GXv_char43, GXv_char44, GXv_char45, GXv_char46, GXv_char47, GXv_char48, GXv_char49, GXv_char50, GXv_char51, GXv_char52, GXv_char53, GXv_char54, GXv_char55, GXv_char56, GXv_char57, GXv_char58, GXv_char59, GXv_char60, GXv_char61, GXv_char62, AV335Tab_maq, AV253MaqHdrs, GXv_int63) ;
      webwkp107copy1_impl.this.AV62EmprCod = GXv_char4[0] ;
      webwkp107copy1_impl.this.AV165Maqcod1 = GXv_char3[0] ;
      webwkp107copy1_impl.this.AV166MaqCod10 = GXv_char2[0] ;
      webwkp107copy1_impl.this.AV167Maqcod11 = GXv_char9[0] ;
      webwkp107copy1_impl.this.AV168MaqCod12 = GXv_char10[0] ;
      webwkp107copy1_impl.this.AV169Maqcod13 = GXv_char11[0] ;
      webwkp107copy1_impl.this.AV170Maqcod14 = GXv_char12[0] ;
      webwkp107copy1_impl.this.AV171Maqcod15 = GXv_char13[0] ;
      webwkp107copy1_impl.this.AV172Maqcod16 = GXv_char14[0] ;
      webwkp107copy1_impl.this.AV173Maqcod17 = GXv_char15[0] ;
      webwkp107copy1_impl.this.AV174Maqcod18 = GXv_char16[0] ;
      webwkp107copy1_impl.this.AV175Maqcod19 = GXv_char17[0] ;
      webwkp107copy1_impl.this.AV176Maqcod2 = GXv_char18[0] ;
      webwkp107copy1_impl.this.AV177Maqcod20 = GXv_char19[0] ;
      webwkp107copy1_impl.this.AV178Maqcod21 = GXv_char20[0] ;
      webwkp107copy1_impl.this.AV179Maqcod22 = GXv_char21[0] ;
      webwkp107copy1_impl.this.AV180Maqcod23 = GXv_char22[0] ;
      webwkp107copy1_impl.this.AV181Maqcod24 = GXv_char23[0] ;
      webwkp107copy1_impl.this.AV182Maqcod25 = GXv_char24[0] ;
      webwkp107copy1_impl.this.AV183Maqcod26 = GXv_char25[0] ;
      webwkp107copy1_impl.this.AV184Maqcod27 = GXv_char26[0] ;
      webwkp107copy1_impl.this.AV185Maqcod28 = GXv_char27[0] ;
      webwkp107copy1_impl.this.AV186Maqcod3 = GXv_char28[0] ;
      webwkp107copy1_impl.this.AV187Maqcod4 = GXv_char29[0] ;
      webwkp107copy1_impl.this.AV188Maqcod5 = GXv_char30[0] ;
      webwkp107copy1_impl.this.AV189Maqcod6 = GXv_char31[0] ;
      webwkp107copy1_impl.this.AV190Maqcod7 = GXv_char32[0] ;
      webwkp107copy1_impl.this.AV191Maqcod8 = GXv_char33[0] ;
      webwkp107copy1_impl.this.AV192Maqcod9 = GXv_char34[0] ;
      webwkp107copy1_impl.this.AV225Maqdsc1 = GXv_char35[0] ;
      webwkp107copy1_impl.this.AV226Maqdsc10 = GXv_char36[0] ;
      webwkp107copy1_impl.this.AV227Maqdsc11 = GXv_char37[0] ;
      webwkp107copy1_impl.this.AV228Maqdsc12 = GXv_char38[0] ;
      webwkp107copy1_impl.this.AV229Maqdsc13 = GXv_char39[0] ;
      webwkp107copy1_impl.this.AV230Maqdsc14 = GXv_char40[0] ;
      webwkp107copy1_impl.this.AV231Maqdsc15 = GXv_char41[0] ;
      webwkp107copy1_impl.this.AV232MaqDsc16 = GXv_char42[0] ;
      webwkp107copy1_impl.this.AV233MaqDsc17 = GXv_char43[0] ;
      webwkp107copy1_impl.this.AV234MaqDsc18 = GXv_char44[0] ;
      webwkp107copy1_impl.this.AV235MaqDsc19 = GXv_char45[0] ;
      webwkp107copy1_impl.this.AV236Maqdsc2 = GXv_char46[0] ;
      webwkp107copy1_impl.this.AV237MaqDsc20 = GXv_char47[0] ;
      webwkp107copy1_impl.this.AV238MaqDsc21 = GXv_char48[0] ;
      webwkp107copy1_impl.this.AV239MaqDsc22 = GXv_char49[0] ;
      webwkp107copy1_impl.this.AV240MaqDsc23 = GXv_char50[0] ;
      webwkp107copy1_impl.this.AV241MaqDsc24 = GXv_char51[0] ;
      webwkp107copy1_impl.this.AV242MaqDsc25 = GXv_char52[0] ;
      webwkp107copy1_impl.this.AV243MaqDsc26 = GXv_char53[0] ;
      webwkp107copy1_impl.this.AV244MaqDsc27 = GXv_char54[0] ;
      webwkp107copy1_impl.this.AV245MaqDsc28 = GXv_char55[0] ;
      webwkp107copy1_impl.this.AV246Maqdsc3 = GXv_char56[0] ;
      webwkp107copy1_impl.this.AV247Maqdsc4 = GXv_char57[0] ;
      webwkp107copy1_impl.this.AV248Maqdsc5 = GXv_char58[0] ;
      webwkp107copy1_impl.this.AV249Maqdsc6 = GXv_char59[0] ;
      webwkp107copy1_impl.this.AV250Maqdsc7 = GXv_char60[0] ;
      webwkp107copy1_impl.this.AV251Maqdsc8 = GXv_char61[0] ;
      webwkp107copy1_impl.this.AV252Maqdsc9 = GXv_char62[0] ;
      webwkp107copy1_impl.this.AV333t = GXv_int63[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod1_Internalname, AV165Maqcod1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod10_Internalname, AV166MaqCod10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod11_Internalname, AV167Maqcod11);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod12_Internalname, AV168MaqCod12);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod13_Internalname, AV169Maqcod13);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod14_Internalname, AV170Maqcod14);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod15_Internalname, AV171Maqcod15);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod16_Internalname, AV172Maqcod16);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod17_Internalname, AV173Maqcod17);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod18_Internalname, AV174Maqcod18);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod19_Internalname, AV175Maqcod19);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod2_Internalname, AV176Maqcod2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod20_Internalname, AV177Maqcod20);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod21_Internalname, AV178Maqcod21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod22_Internalname, AV179Maqcod22);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod23_Internalname, AV180Maqcod23);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod24_Internalname, AV181Maqcod24);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod25_Internalname, AV182Maqcod25);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod26_Internalname, AV183Maqcod26);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod27_Internalname, AV184Maqcod27);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod28_Internalname, AV185Maqcod28);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod3_Internalname, AV186Maqcod3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod4_Internalname, AV187Maqcod4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod5_Internalname, AV188Maqcod5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod6_Internalname, AV189Maqcod6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod7_Internalname, AV190Maqcod7);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod8_Internalname, AV191Maqcod8);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod9_Internalname, AV192Maqcod9);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV225Maqdsc1", AV225Maqdsc1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV226Maqdsc10", AV226Maqdsc10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV227Maqdsc11", AV227Maqdsc11);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV228Maqdsc12", AV228Maqdsc12);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV229Maqdsc13", AV229Maqdsc13);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV230Maqdsc14", AV230Maqdsc14);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV231Maqdsc15", AV231Maqdsc15);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV232MaqDsc16", AV232MaqDsc16);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV233MaqDsc17", AV233MaqDsc17);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV234MaqDsc18", AV234MaqDsc18);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV235MaqDsc19", AV235MaqDsc19);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV236Maqdsc2", AV236Maqdsc2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV237MaqDsc20", AV237MaqDsc20);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV238MaqDsc21", AV238MaqDsc21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV239MaqDsc22", AV239MaqDsc22);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV240MaqDsc23", AV240MaqDsc23);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV241MaqDsc24", AV241MaqDsc24);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV242MaqDsc25", AV242MaqDsc25);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV243MaqDsc26", AV243MaqDsc26);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV244MaqDsc27", AV244MaqDsc27);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV245MaqDsc28", AV245MaqDsc28);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV246Maqdsc3", AV246Maqdsc3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV247Maqdsc4", AV247Maqdsc4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV248Maqdsc5", AV248Maqdsc5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV249Maqdsc6", AV249Maqdsc6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV250Maqdsc7", AV250Maqdsc7);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV251Maqdsc8", AV251Maqdsc8);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV252Maqdsc9", AV252Maqdsc9);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV333t", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV333t), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV333t), "ZZZ9")));
      System.out.println( httpContext.getMessage( "Presentamos DATOS", "") );
      AV108i = (short)(1) ;
      while ( AV108i <= 28 )
      {
         if ( GXutil.strcmp(AV335Tab_maq[AV108i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV164Maqcod = AV335Tab_maq[AV108i-1] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV164Maqcod", AV164Maqcod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
         /* Execute user subroutine: 'CARGOHDRS' */
         S142 ();
         if (returnInSub) return;
         AV108i = (short)(AV108i+1) ;
      }
      edtavHdr1_Title = AV225Maqdsc1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Title", edtavHdr1_Title, !bGXsfl_34_Refreshing);
      edtavHdr2_Title = AV236Maqdsc2 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Title", edtavHdr2_Title, !bGXsfl_34_Refreshing);
      edtavHdr3_Title = AV246Maqdsc3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Title", edtavHdr3_Title, !bGXsfl_34_Refreshing);
      edtavHdr4_Title = AV247Maqdsc4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Title", edtavHdr4_Title, !bGXsfl_34_Refreshing);
      edtavHdr5_Title = AV248Maqdsc5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Title", edtavHdr5_Title, !bGXsfl_34_Refreshing);
      edtavHdr6_Title = AV249Maqdsc6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Title", edtavHdr6_Title, !bGXsfl_34_Refreshing);
      edtavHdr7_Title = AV250Maqdsc7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Title", edtavHdr7_Title, !bGXsfl_34_Refreshing);
      edtavHdr8_Title = AV251Maqdsc8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Title", edtavHdr8_Title, !bGXsfl_34_Refreshing);
      edtavHdr9_Title = AV252Maqdsc9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Title", edtavHdr9_Title, !bGXsfl_34_Refreshing);
      edtavHdr10_Title = AV226Maqdsc10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Title", edtavHdr10_Title, !bGXsfl_34_Refreshing);
      edtavHdr11_Title = AV227Maqdsc11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Title", edtavHdr11_Title, !bGXsfl_34_Refreshing);
      edtavHdr12_Title = AV228Maqdsc12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Title", edtavHdr12_Title, !bGXsfl_34_Refreshing);
      edtavHdr13_Title = AV229Maqdsc13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Title", edtavHdr13_Title, !bGXsfl_34_Refreshing);
      edtavHdr14_Title = AV230Maqdsc14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Title", edtavHdr14_Title, !bGXsfl_34_Refreshing);
      edtavHdr15_Title = AV231Maqdsc15 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Title", edtavHdr15_Title, !bGXsfl_34_Refreshing);
      edtavHdr16_Title = AV232MaqDsc16 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Title", edtavHdr16_Title, !bGXsfl_34_Refreshing);
      edtavHdr17_Title = AV233MaqDsc17 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Title", edtavHdr17_Title, !bGXsfl_34_Refreshing);
      edtavHdr18_Title = AV234MaqDsc18 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Title", edtavHdr18_Title, !bGXsfl_34_Refreshing);
      edtavHdr19_Title = AV235MaqDsc19 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Title", edtavHdr19_Title, !bGXsfl_34_Refreshing);
      edtavHdr20_Title = AV237MaqDsc20 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Title", edtavHdr20_Title, !bGXsfl_34_Refreshing);
      edtavHdr21_Title = AV238MaqDsc21 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Title", edtavHdr21_Title, !bGXsfl_34_Refreshing);
      edtavHdr22_Title = AV239MaqDsc22 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Title", edtavHdr22_Title, !bGXsfl_34_Refreshing);
      edtavHdr23_Title = AV240MaqDsc23 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Title", edtavHdr23_Title, !bGXsfl_34_Refreshing);
      edtavHdr24_Title = AV241MaqDsc24 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Title", edtavHdr24_Title, !bGXsfl_34_Refreshing);
      edtavHdr25_Title = AV242MaqDsc25 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Title", edtavHdr25_Title, !bGXsfl_34_Refreshing);
      edtavHdr26_Title = AV243MaqDsc26 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Title", edtavHdr26_Title, !bGXsfl_34_Refreshing);
      edtavHdr27_Title = AV244MaqDsc27 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Title", edtavHdr27_Title, !bGXsfl_34_Refreshing);
      edtavHdr28_Title = AV245MaqDsc28 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Title", edtavHdr28_Title, !bGXsfl_34_Refreshing);
      System.out.println( " " );
      GXt_int5 = AV261NospMaq ;
      GXv_char62[0] = AV62EmprCod ;
      GXv_char61[0] = httpContext.getMessage( "NOSMAQ", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char62, GXv_char61, GXv_int6) ;
      webwkp107copy1_impl.this.AV62EmprCod = GXv_char62[0] ;
      webwkp107copy1_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
      AV261NospMaq = (short)(GXt_int5) ;
      AV261NospMaq = (short)(((0==AV261NospMaq) ? 3 : AV261NospMaq)) ;
      GXv_SdtWWPContext64[0] = AV347WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext64) ;
      AV347WWPContext = GXv_SdtWWPContext64[0] ;
      if ( AV360ManageFiltersExecutionStep == 1 )
      {
         AV360ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV360ManageFiltersExecutionStep", GXutil.str( AV360ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV360ManageFiltersExecutionStep == 2 )
      {
         AV360ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV360ManageFiltersExecutionStep", GXutil.str( AV360ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV357Session.getValue("WebWkp107Copy1ColumnsSelector"), "") != 0 )
      {
         AV353ColumnsSelectorXML = AV357Session.getValue("WebWkp107Copy1ColumnsSelector") ;
         AV355ColumnsSelector.fromxml(AV353ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtavHdr1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr1_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr2_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr3_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr3_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr4_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr4_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr5_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr5_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr6_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr6_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr7_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr7_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr8_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr8_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr9_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr9_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr10_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr10_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr11_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr11_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr12_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr12_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr13_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr13_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr14_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr14_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr15_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr15_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr16_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr16_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr17_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr17_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr18_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr18_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr19_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr19_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr20_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr20_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr21_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr21_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr22_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr22_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr23_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr23_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr24_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr24_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr25_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr25_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr26_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr26_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr27_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr27_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavHdr28_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV355ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr28_Visible), 5, 0), !bGXsfl_34_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV355ColumnsSelector", AV355ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV358ManageFiltersData", AV358ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV351GridState", AV351GridState);
   }

   private void e15AM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV266Partidas = DecimalUtil.doubleToDec(1) ;
      AV110k = (short)(2) ;
      while ( AV110k <= 26 )
      {
         AV109j = (short)(1) ;
         while ( AV109j <= 28 )
         {
            AV338Texto = AV253MaqHdrs[AV109j-1][AV110k-1] ;
            AV76Hdr = GXutil.substring( AV338Texto, 27, 11) ;
            AV64EstadoFasegrid = " " ;
            AV299Rgb = 16777215 ;
            GXv_int65[0] = AV299Rgb ;
            GXv_int63[0] = AV295R ;
            GXv_int66[0] = AV74G ;
            GXv_int67[0] = AV7B ;
            new app.pleorgb(remoteHandle, context).execute( GXv_int65, GXv_int63, GXv_int66, GXv_int67) ;
            webwkp107copy1_impl.this.AV299Rgb = GXv_int65[0] ;
            webwkp107copy1_impl.this.AV295R = GXv_int63[0] ;
            webwkp107copy1_impl.this.AV74G = GXv_int66[0] ;
            webwkp107copy1_impl.this.AV7B = GXv_int67[0] ;
            if ( GXutil.strcmp(AV76Hdr, " ") != 0 )
            {
               AV10Barcod = (int)(GXutil.lval( GXutil.substring( AV76Hdr, 1, 8))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
               AV18Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV76Hdr, 10, 1))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
               AV14Barcodpar = GXutil.substring( AV76Hdr, 11, 1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
               GXv_char62[0] = AV62EmprCod ;
               GXv_int6[0] = AV10Barcod ;
               GXv_int68[0] = AV18Barcodreo ;
               GXv_char61[0] = AV14Barcodpar ;
               GXv_int69[0] = AV32BarFasestGrid1 ;
               new app.pcp0999(remoteHandle, context).execute( GXv_char62, GXv_int6, GXv_int68, GXv_char61, GXv_int69) ;
               webwkp107copy1_impl.this.AV62EmprCod = GXv_char62[0] ;
               webwkp107copy1_impl.this.AV10Barcod = GXv_int6[0] ;
               webwkp107copy1_impl.this.AV18Barcodreo = GXv_int68[0] ;
               webwkp107copy1_impl.this.AV14Barcodpar = GXv_char61[0] ;
               webwkp107copy1_impl.this.AV32BarFasestGrid1 = GXv_int69[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
               AV64EstadoFasegrid = ((AV32BarFasestGrid1==9) ? httpContext.getMessage( "TIN:-", "") : httpContext.getMessage( "TIN:", "")+GXutil.str( AV32BarFasestGrid1, 1, 0)) ;
               AV299Rgb = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               GXv_int65[0] = AV299Rgb ;
               GXv_int67[0] = AV295R ;
               GXv_int66[0] = AV74G ;
               GXv_int63[0] = AV7B ;
               new app.pleorgb(remoteHandle, context).execute( GXv_int65, GXv_int67, GXv_int66, GXv_int63) ;
               webwkp107copy1_impl.this.AV299Rgb = GXv_int65[0] ;
               webwkp107copy1_impl.this.AV295R = GXv_int67[0] ;
               webwkp107copy1_impl.this.AV74G = GXv_int66[0] ;
               webwkp107copy1_impl.this.AV7B = GXv_int63[0] ;
               GXv_int65[0] = AV299Rgb ;
               GXv_int67[0] = AV296R2 ;
               GXv_int66[0] = AV75G2 ;
               GXv_int63[0] = AV8B2 ;
               new app.pleorgb(remoteHandle, context).execute( GXv_int65, GXv_int67, GXv_int66, GXv_int63) ;
               webwkp107copy1_impl.this.AV299Rgb = GXv_int65[0] ;
               webwkp107copy1_impl.this.AV296R2 = GXv_int67[0] ;
               webwkp107copy1_impl.this.AV75G2 = GXv_int66[0] ;
               webwkp107copy1_impl.this.AV8B2 = GXv_int63[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV296R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV296R2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV296R2), "ZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
               AV256Min = ((AV296R2<AV75G2) ? ((AV296R2<AV8B2) ? DecimalUtil.doubleToDec(AV296R2) : DecimalUtil.doubleToDec(AV8B2)) : ((AV75G2<AV8B2) ? DecimalUtil.doubleToDec(AV75G2) : DecimalUtil.doubleToDec(AV8B2))) ;
               AV255Max = ((AV296R2>AV75G2) ? ((AV296R2>AV8B2) ? DecimalUtil.doubleToDec(AV296R2) : DecimalUtil.doubleToDec(AV8B2)) : ((AV75G2>AV8B2) ? DecimalUtil.doubleToDec(AV75G2) : DecimalUtil.doubleToDec(AV8B2))) ;
               AV111L = (AV256Min.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN).add(AV255Max.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
               if ( DecimalUtil.compareTo(AV111L, DecimalUtil.stringToDec("0.5")) >= 0 )
               {
                  AV296R2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV296R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV296R2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV296R2), "ZZ9")));
                  AV8B2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                  AV75G2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
               }
               else
               {
                  AV296R2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV296R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV296R2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV296R2), "ZZ9")));
                  AV8B2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                  AV75G2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
               }
            }
            AV76Hdr = ((GXutil.strcmp("", AV338Texto)==0) ? " " : httpContext.getMessage( "Os ", "")+AV76Hdr) ;
            AV48Cant = GXutil.ltrim( GXutil.rtrim( GXutil.substring( AV338Texto, 38, 10))) ;
            AV48Cant = ((GXutil.strcmp("", AV48Cant)==0) ? " " : AV48Cant+httpContext.getMessage( " kg", "")) ;
            if ( AV109j == 1 )
            {
               AV77Hdr1 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV112Linea1 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea1_Internalname, AV112Linea1);
               AV300Rgb1 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV165Maqcod1 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod1_Internalname, AV165Maqcod1);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
               AV196MaqCodRc1 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr1_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr1_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 2 )
            {
               AV88Hdr2 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
               AV88Hdr2 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
               AV88Hdr2 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
               AV88Hdr2 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
               AV88Hdr2 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
               AV123Linea2 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea2_Internalname, AV123Linea2);
               AV311Rgb2 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV176Maqcod2 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod2_Internalname, AV176Maqcod2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
               AV207MaqCodRc2 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr2_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr3_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 3 )
            {
               AV98Hdr3 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV133Linea3 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea3_Internalname, AV133Linea3);
               AV321Rgb3 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV186Maqcod3 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod3_Internalname, AV186Maqcod3);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
               AV217MaqCodRc3 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr3_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr3_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 4 )
            {
               AV99Hdr4 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV134Linea4 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea4_Internalname, AV134Linea4);
               AV322Rgb4 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV187Maqcod4 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod4_Internalname, AV187Maqcod4);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
               AV218MaqCodRc4 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr4_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr4_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 5 )
            {
               AV100Hdr5 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV135Linea5 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea5_Internalname, AV135Linea5);
               AV323Rgb5 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV188Maqcod5 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod5_Internalname, AV188Maqcod5);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
               AV219MaqCodRc5 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr5_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr5_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 6 )
            {
               AV101Hdr6 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV136Linea6 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea6_Internalname, AV136Linea6);
               AV324Rgb6 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV189Maqcod6 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod6_Internalname, AV189Maqcod6);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
               AV220MaqCodRc6 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr6_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr6_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 7 )
            {
               AV102Hdr7 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV137Linea7 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea7_Internalname, AV137Linea7);
               AV325Rgb7 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV190Maqcod7 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod7_Internalname, AV190Maqcod7);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
               AV221MaqCodRc7 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr7_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr7_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 8 )
            {
               AV103Hdr8 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV138LInea8 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea8_Internalname, AV138LInea8);
               AV326Rgb8 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV191Maqcod8 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod8_Internalname, AV191Maqcod8);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
               AV222MaqCodRc8 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr8_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr8_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 9 )
            {
               AV104Hdr9 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV139Linea9 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea9_Internalname, AV139Linea9);
               AV327Rgb9 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV192Maqcod9 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod9_Internalname, AV192Maqcod9);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
               AV223MaqCodRc9 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr9_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr9_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 10 )
            {
               AV78Hdr10 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV113Linea10 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea10_Internalname, AV113Linea10);
               AV301Rgb10 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV166MaqCod10 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod10_Internalname, AV166MaqCod10);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
               AV197MaqCodRc10 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr10_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr10_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 11 )
            {
               AV79Hdr11 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV114Linea11 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea11_Internalname, AV114Linea11);
               AV302Rgb11 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV167Maqcod11 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod11_Internalname, AV167Maqcod11);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
               AV198MaqCodRc11 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr11_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr11_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 12 )
            {
               AV80Hdr12 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV115Linea12 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea12_Internalname, AV115Linea12);
               AV303Rgb12 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV168MaqCod12 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod12_Internalname, AV168MaqCod12);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
               AV199MaqCodRc12 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr12_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr12_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 13 )
            {
               AV81Hdr13 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV116Linea13 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea13_Internalname, AV116Linea13);
               AV304Rgb13 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV169Maqcod13 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod13_Internalname, AV169Maqcod13);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
               AV200MaqCodRc13 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr13_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr13_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 14 )
            {
               AV82Hdr14 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV117Linea14 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea14_Internalname, AV117Linea14);
               AV305Rgb14 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV170Maqcod14 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod14_Internalname, AV170Maqcod14);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
               AV201MaqCodRc14 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr14_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr14_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 15 )
            {
               AV83Hdr15 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV118Linea15 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea15_Internalname, AV118Linea15);
               AV306Rgb15 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV171Maqcod15 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod15_Internalname, AV171Maqcod15);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
               AV219MaqCodRc5 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr15_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr15_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 16 )
            {
               AV84Hdr16 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV119Linea16 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea16_Internalname, AV119Linea16);
               AV307Rgb16 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV172Maqcod16 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod16_Internalname, AV172Maqcod16);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
               AV203MaqCodRc16 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr16_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr16_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 17 )
            {
               AV85Hdr17 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV85Hdr17 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV85Hdr17 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV85Hdr17 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV88Hdr2 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV88Hdr2, ""))));
               AV120Linea17 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea17_Internalname, AV120Linea17);
               AV308Rgb17 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV173Maqcod17 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod17_Internalname, AV173Maqcod17);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
               AV204MaqCodRc17 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr17_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr17_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 18 )
            {
               AV86Hdr18 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV121Linea18 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea18_Internalname, AV121Linea18);
               AV309Rgb18 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV174Maqcod18 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod18_Internalname, AV174Maqcod18);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
               AV205MaqCodRc18 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr18_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr18_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 19 )
            {
               AV87Hdr19 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV122Linea19 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea19_Internalname, AV122Linea19);
               AV310Rgb19 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV175Maqcod19 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod19_Internalname, AV175Maqcod19);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
               AV206MaqCodRc19 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr19_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr19_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 20 )
            {
               AV89Hdr20 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV124Linea20 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea20_Internalname, AV124Linea20);
               AV312Rgb20 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV177Maqcod20 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod20_Internalname, AV177Maqcod20);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
               AV208MaqCodRc20 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr20_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr20_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 21 )
            {
               AV90Hdr21 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV125Linea21 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea21_Internalname, AV125Linea21);
               AV313Rgb21 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV178Maqcod21 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod21_Internalname, AV178Maqcod21);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
               AV209MaqCodRc21 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr21_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr21_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 22 )
            {
               AV91Hdr22 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV126Linea22 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea22_Internalname, AV126Linea22);
               AV314Rgb22 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV179Maqcod22 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod22_Internalname, AV179Maqcod22);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
               AV210MaqCodRc22 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr22_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr22_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 23 )
            {
               AV92Hdr23 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV127Linea23 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea23_Internalname, AV127Linea23);
               AV315Rgb23 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV180Maqcod23 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod23_Internalname, AV180Maqcod23);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
               AV211MaqCodRc23 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr23_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr23_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 24 )
            {
               AV93Hdr24 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV128Linea24 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea24_Internalname, AV128Linea24);
               AV316Rgb24 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV181Maqcod24 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod24_Internalname, AV181Maqcod24);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
               AV212MaqCodRc24 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr24_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr24_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 25 )
            {
               AV94Hdr25 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV129Linea25 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea25_Internalname, AV129Linea25);
               AV317Rgb25 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV182Maqcod25 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod25_Internalname, AV182Maqcod25);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
               AV213MaqCodRc25 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr25_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr25_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 26 )
            {
               AV95Hdr26 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV130Linea26 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea26_Internalname, AV130Linea26);
               AV318Rgb26 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV183Maqcod26 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod26_Internalname, AV183Maqcod26);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
               AV214MaqCodRc26 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr26_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr26_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 27 )
            {
               AV96Hdr27 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV131Linea27 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea27_Internalname, AV131Linea27);
               AV319Rgb27 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV184Maqcod27 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod27_Internalname, AV184Maqcod27);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
               AV215MaqCodRc27 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr27_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr27_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 28 )
            {
               AV97Hdr28 = GXutil.substring( AV338Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += GXutil.substring( AV338Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV132Linea28 = AV338Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea28_Internalname, AV132Linea28);
               AV320Rgb28 = ((GXutil.strcmp("", AV338Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV338Texto, 50, 10), ".")))) ;
               AV185Maqcod28 = AV335Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod28_Internalname, AV185Maqcod28);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_34_idx, getSecureSignedToken( sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
               AV216MaqCodRc28 = GXutil.substring( AV338Texto, 59, 6) ;
               edtavHdr28_Backcolor = GXutil.getColor( AV295R, AV74G, AV7B) ;
               edtavHdr28_Forecolor = GXutil.getColor( AV296R2, AV75G2, AV8B2) ;
            }
            AV109j = (short)(AV109j+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(34) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_342( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
         {
            httpContext.doAjaxLoad(34, GridRow);
         }
         AV110k = (short)(AV110k+1) ;
         AV266Partidas = AV266Partidas.add(DecimalUtil.doubleToDec(1)) ;
      }
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV363GridActions, 4, 0)) );
   }

   public void e12AM2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV353ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV355ColumnsSelector.fromJSonString(AV353ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWkp107Copy1ColumnsSelector", ((GXutil.strcmp("", AV353ColumnsSelectorXML)==0) ? "" : AV355ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV355ColumnsSelector", AV355ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV358ManageFiltersData", AV358ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV351GridState", AV351GridState);
   }

   public void e11AM2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWkp107Copy1Filters")),GXutil.URLEncode(GXutil.rtrim(AV366Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV360ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV360ManageFiltersExecutionStep", GXutil.str( AV360ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWkp107Copy1Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV360ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV360ManageFiltersExecutionStep", GXutil.str( AV360ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV359ManageFiltersXml ;
         GXv_char62[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWkp107Copy1Filters", Ddo_managefilters_Activeeventkey, GXv_char62) ;
         webwkp107copy1_impl.this.GXt_char1 = GXv_char62[0] ;
         AV359ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV359ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV366Pgmname+"GridState", AV359ManageFiltersXml) ;
            AV351GridState.fromxml(AV359ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV351GridState", AV351GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV355ColumnsSelector", AV355ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV358ManageFiltersData", AV358ManageFiltersData);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV355ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr1", "", "Hdr1", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr2", "", "Hdr2", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr3", "", "Hdr3", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr4", "", "Hdr4", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr5", "", "Hdr5", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr6", "", "Hdr6", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr7", "", "Hdr7", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr8", "", "Hdr8", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr9", "", "Hdr9", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr10", "", "Hdr10", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr11", "", "Hdr11", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr12", "", "Hdr12", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr13", "", "Hdr13", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr14", "", "Hdr14", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr15", "", "Hdr15", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr16", "", "Hdr16", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr17", "", "Hdr17", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr18", "", "Hdr18", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr19", "", "Hdr19", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr20", "", "Hdr20", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr21", "", "Hdr21", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr22", "", "Hdr22", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr23", "", "Hdr23", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr24", "", "Hdr24", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr25", "", "Hdr25", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr26", "", "Hdr26", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr27", "", "Hdr27", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXv_SdtWWPColumnsSelector70[0] = AV355ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, "&Hdr28", "", "Hdr28", true, "") ;
      AV355ColumnsSelector = GXv_SdtWWPColumnsSelector70[0] ;
      GXt_char1 = AV354UserCustomValue ;
      GXv_char62[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWkp107Copy1ColumnsSelector", GXv_char62) ;
      webwkp107copy1_impl.this.GXt_char1 = GXv_char62[0] ;
      AV354UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV354UserCustomValue)==0) ) )
      {
         AV356ColumnsSelectorAux.fromxml(AV354UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector70[0] = AV356ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector71[0] = AV355ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector70, GXv_SdtWWPColumnsSelector71) ;
         AV356ColumnsSelectorAux = GXv_SdtWWPColumnsSelector70[0] ;
         AV355ColumnsSelector = GXv_SdtWWPColumnsSelector71[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item72 = AV358ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item73[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item72 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWkp107Copy1Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item73) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item72 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item73[0] ;
      AV358ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item72 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV362FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV362FilterFullText", AV362FilterFullText);
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV357Session.getValue(AV366Pgmname+"GridState"), "") == 0 )
      {
         AV351GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV366Pgmname+"GridState"), null, null);
      }
      else
      {
         AV351GridState.fromxml(AV357Session.getValue(AV366Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV351GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV351GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV351GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV367GXV1 = 1 ;
      while ( AV367GXV1 <= AV351GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV352GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV351GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV367GXV1));
         if ( GXutil.strcmp(AV352GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV362FilterFullText = AV352GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV362FilterFullText", AV362FilterFullText);
         }
         AV367GXV1 = (int)(AV367GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV351GridState.fromxml(AV357Session.getValue(AV366Pgmname+"GridState"), null, null);
      AV351GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState74[0] = AV351GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState74, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV362FilterFullText)==0), (short)(0), AV362FilterFullText, "") ;
      AV351GridState = GXv_SdtWWPGridState74[0] ;
      AV351GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV351GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV366Pgmname+"GridState", AV351GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      tblTablerightheader_Visible = (((0>1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTablerightheader_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTablerightheader_Visible), 5, 0), true);
   }

   public void S142( )
   {
      /* 'CARGOHDRS' Routine */
      returnInSub = false ;
      AV5Archivo.openRead("");
      AV109j = (short)(2) ;
      AV339Texto_l = AV5Archivo.readLine() ;
      while ( ! AV5Archivo.getEof() )
      {
         AV339Texto_l = ((GXutil.len( AV339Texto_l)<=0) ? httpContext.getMessage( "FIN", "") : AV339Texto_l) ;
         if ( GXutil.strcmp(AV339Texto_l, httpContext.getMessage( "FIN", "")) == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV164Maqcod, GXutil.substring( AV339Texto_l, 7, 6)) == 0 )
         {
            AV10Barcod = (int)(GXutil.lval( GXutil.substring( AV339Texto_l, 13, 8))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            AV18Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV339Texto_l, 22, 1))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            AV14Barcodpar = (GXutil.substring( AV339Texto_l, 23, 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            /* Execute user subroutine: 'BARFAS' */
            S222 ();
            if (returnInSub) return;
            GXv_char62[0] = AV62EmprCod ;
            GXv_int6[0] = AV10Barcod ;
            GXv_int69[0] = AV18Barcodreo ;
            GXv_char61[0] = AV14Barcodpar ;
            GXv_int67[0] = AV41Barordlin ;
            GXv_char60[0] = " " ;
            GXv_int68[0] = AV30Barfasestant ;
            GXv_char59[0] = " " ;
            GXv_int66[0] = (short)(0) ;
            GXv_char58[0] = " " ;
            GXv_int75[0] = (byte)(0) ;
            GXv_char57[0] = " " ;
            GXv_int63[0] = (short)(0) ;
            new app.pprc39(remoteHandle, context).execute( GXv_char62, GXv_int6, GXv_int69, GXv_char61, GXv_int67, GXv_char60, GXv_int68, GXv_char59, GXv_int66, GXv_char58, GXv_int75, GXv_char57, GXv_int63) ;
            webwkp107copy1_impl.this.AV62EmprCod = GXv_char62[0] ;
            webwkp107copy1_impl.this.AV10Barcod = GXv_int6[0] ;
            webwkp107copy1_impl.this.AV18Barcodreo = GXv_int69[0] ;
            webwkp107copy1_impl.this.AV14Barcodpar = GXv_char61[0] ;
            webwkp107copy1_impl.this.AV41Barordlin = GXv_int67[0] ;
            webwkp107copy1_impl.this.AV30Barfasestant = GXv_int68[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV30Barfasestant", GXutil.str( AV30Barfasestant, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
            GXv_char62[0] = AV62EmprCod ;
            GXv_int6[0] = AV10Barcod ;
            GXv_int75[0] = AV18Barcodreo ;
            GXv_char61[0] = AV14Barcodpar ;
            GXv_int69[0] = AV28BarFasEst ;
            GXv_date76[0] = AV68fecha ;
            GXv_char60[0] = AV193MaqCodBis ;
            new app.pplat07(remoteHandle, context).execute( GXv_char62, GXv_int6, GXv_int75, GXv_char61, GXv_int69, GXv_date76, GXv_char60) ;
            webwkp107copy1_impl.this.AV62EmprCod = GXv_char62[0] ;
            webwkp107copy1_impl.this.AV10Barcod = GXv_int6[0] ;
            webwkp107copy1_impl.this.AV18Barcodreo = GXv_int75[0] ;
            webwkp107copy1_impl.this.AV14Barcodpar = GXv_char61[0] ;
            webwkp107copy1_impl.this.AV28BarFasEst = GXv_int69[0] ;
            webwkp107copy1_impl.this.AV68fecha = GXv_date76[0] ;
            webwkp107copy1_impl.this.AV193MaqCodBis = GXv_char60[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            if ( AV28BarFasEst < 2 )
            {
               AV338Texto = GXutil.substring( AV339Texto_l, 24, 13) ;
               AV338Texto = ((GXutil.strcmp("", AV338Texto)==0) ? "."+GXutil.space( (short)(12)) : AV338Texto) ;
               AV340Texto1 = AV338Texto ;
               AV338Texto = GXutil.substring( AV339Texto_l, 37, 13) ;
               AV338Texto = ((GXutil.strcmp("", AV338Texto)==0) ? "."+GXutil.space( (short)(12)) : AV338Texto) ;
               AV340Texto1 += AV338Texto ;
               AV338Texto = GXutil.str( AV10Barcod, 8, 0) + "-" + GXutil.str( AV18Barcodreo, 1, 0) + AV14Barcodpar ;
               AV338Texto = ((GXutil.strcmp("", AV338Texto)==0) ? "."+GXutil.space( (short)(9)) : AV338Texto) ;
               AV340Texto1 += AV338Texto ;
               AV338Texto = GXutil.substring( AV339Texto_l, 50, 10) ;
               AV338Texto = ((GXutil.strcmp("", AV338Texto)==0) ? "."+GXutil.space( (short)(9)) : AV338Texto) ;
               AV340Texto1 += AV338Texto ;
               AV338Texto = " " ;
               AV340Texto1 += AV338Texto ;
               AV338Texto = GXutil.substring( AV339Texto_l, 60, 10) ;
               AV340Texto1 += AV338Texto ;
               AV338Texto = GXutil.substring( AV339Texto_l, 1, 6) ;
               AV340Texto1 += AV338Texto ;
               AV253MaqHdrs[AV108i-1][AV109j-1] = AV340Texto1 ;
               AV109j = (short)(AV109j+1) ;
            }
         }
         AV339Texto_l = AV5Archivo.readLine() ;
      }
      AV5Archivo.close();
   }

   public void S222( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV41Barordlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      AV65EstadoFaseHdr = (byte)(0) ;
      /* Using cursor H00AM2 */
      pr_default.execute(0, new Object[] {AV62EmprCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV18Barcodreo), AV14Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = H00AM2_A153BarFasEst[0] ;
         A150BarFacTin = H00AM2_A150BarFacTin[0] ;
         A130BarCodPar = H00AM2_A130BarCodPar[0] ;
         A132BarCodReo = H00AM2_A132BarCodReo[0] ;
         A129BarCod = H00AM2_A129BarCod[0] ;
         A396EmprCod = H00AM2_A396EmprCod[0] ;
         A194BarOrdLin = H00AM2_A194BarOrdLin[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV41Barordlin = A194BarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
            AV65EstadoFaseHdr = A153BarFasEst ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void wb_table1_19_AM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTablerightheader_Visible == 0 )
         {
            sStyleString += "display:none;" ;
         }
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV358ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_24_AM2( true) ;
      }
      else
      {
         wb_table2_24_AM2( false) ;
      }
      return  ;
   }

   public void wb_table2_24_AM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_AM2e( true) ;
      }
      else
      {
         wb_table1_19_AM2e( false) ;
      }
   }

   public void wb_table2_24_AM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV362FilterFullText, GXutil.rtrim( localUtil.format( AV362FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebWkp107Copy1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_24_AM2e( true) ;
      }
      else
      {
         wb_table2_24_AM2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paAM2( ) ;
      wsAM2( ) ;
      weAM2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116114811", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("webwkp107copy1.js", "?202682116114812", false, true);
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
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_34_idx );
      edtavHdr1_Internalname = "vHDR1_"+sGXsfl_34_idx ;
      edtavHdr2_Internalname = "vHDR2_"+sGXsfl_34_idx ;
      edtavHdr3_Internalname = "vHDR3_"+sGXsfl_34_idx ;
      edtavHdr4_Internalname = "vHDR4_"+sGXsfl_34_idx ;
      edtavHdr5_Internalname = "vHDR5_"+sGXsfl_34_idx ;
      edtavHdr6_Internalname = "vHDR6_"+sGXsfl_34_idx ;
      edtavHdr7_Internalname = "vHDR7_"+sGXsfl_34_idx ;
      edtavHdr8_Internalname = "vHDR8_"+sGXsfl_34_idx ;
      edtavHdr9_Internalname = "vHDR9_"+sGXsfl_34_idx ;
      edtavHdr10_Internalname = "vHDR10_"+sGXsfl_34_idx ;
      edtavHdr11_Internalname = "vHDR11_"+sGXsfl_34_idx ;
      edtavHdr12_Internalname = "vHDR12_"+sGXsfl_34_idx ;
      edtavHdr13_Internalname = "vHDR13_"+sGXsfl_34_idx ;
      edtavHdr14_Internalname = "vHDR14_"+sGXsfl_34_idx ;
      edtavHdr15_Internalname = "vHDR15_"+sGXsfl_34_idx ;
      edtavHdr16_Internalname = "vHDR16_"+sGXsfl_34_idx ;
      edtavHdr17_Internalname = "vHDR17_"+sGXsfl_34_idx ;
      edtavHdr18_Internalname = "vHDR18_"+sGXsfl_34_idx ;
      edtavHdr19_Internalname = "vHDR19_"+sGXsfl_34_idx ;
      edtavHdr20_Internalname = "vHDR20_"+sGXsfl_34_idx ;
      edtavHdr21_Internalname = "vHDR21_"+sGXsfl_34_idx ;
      edtavHdr22_Internalname = "vHDR22_"+sGXsfl_34_idx ;
      edtavHdr23_Internalname = "vHDR23_"+sGXsfl_34_idx ;
      edtavHdr24_Internalname = "vHDR24_"+sGXsfl_34_idx ;
      edtavHdr25_Internalname = "vHDR25_"+sGXsfl_34_idx ;
      edtavHdr26_Internalname = "vHDR26_"+sGXsfl_34_idx ;
      edtavHdr27_Internalname = "vHDR27_"+sGXsfl_34_idx ;
      edtavHdr28_Internalname = "vHDR28_"+sGXsfl_34_idx ;
      edtavLinea1_Internalname = "vLINEA1_"+sGXsfl_34_idx ;
      edtavLinea10_Internalname = "vLINEA10_"+sGXsfl_34_idx ;
      edtavLinea11_Internalname = "vLINEA11_"+sGXsfl_34_idx ;
      edtavLinea12_Internalname = "vLINEA12_"+sGXsfl_34_idx ;
      edtavLinea13_Internalname = "vLINEA13_"+sGXsfl_34_idx ;
      edtavLinea14_Internalname = "vLINEA14_"+sGXsfl_34_idx ;
      edtavLinea15_Internalname = "vLINEA15_"+sGXsfl_34_idx ;
      edtavLinea16_Internalname = "vLINEA16_"+sGXsfl_34_idx ;
      edtavLinea17_Internalname = "vLINEA17_"+sGXsfl_34_idx ;
      edtavLinea18_Internalname = "vLINEA18_"+sGXsfl_34_idx ;
      edtavLinea19_Internalname = "vLINEA19_"+sGXsfl_34_idx ;
      edtavLinea2_Internalname = "vLINEA2_"+sGXsfl_34_idx ;
      edtavLinea20_Internalname = "vLINEA20_"+sGXsfl_34_idx ;
      edtavLinea21_Internalname = "vLINEA21_"+sGXsfl_34_idx ;
      edtavLinea22_Internalname = "vLINEA22_"+sGXsfl_34_idx ;
      edtavLinea23_Internalname = "vLINEA23_"+sGXsfl_34_idx ;
      edtavLinea24_Internalname = "vLINEA24_"+sGXsfl_34_idx ;
      edtavLinea25_Internalname = "vLINEA25_"+sGXsfl_34_idx ;
      edtavLinea26_Internalname = "vLINEA26_"+sGXsfl_34_idx ;
      edtavLinea27_Internalname = "vLINEA27_"+sGXsfl_34_idx ;
      edtavLinea28_Internalname = "vLINEA28_"+sGXsfl_34_idx ;
      edtavLinea3_Internalname = "vLINEA3_"+sGXsfl_34_idx ;
      edtavLinea4_Internalname = "vLINEA4_"+sGXsfl_34_idx ;
      edtavLinea5_Internalname = "vLINEA5_"+sGXsfl_34_idx ;
      edtavLinea6_Internalname = "vLINEA6_"+sGXsfl_34_idx ;
      edtavLinea7_Internalname = "vLINEA7_"+sGXsfl_34_idx ;
      edtavLinea8_Internalname = "vLINEA8_"+sGXsfl_34_idx ;
      edtavLinea9_Internalname = "vLINEA9_"+sGXsfl_34_idx ;
      edtavMaqcod1_Internalname = "vMAQCOD1_"+sGXsfl_34_idx ;
      edtavMaqcod10_Internalname = "vMAQCOD10_"+sGXsfl_34_idx ;
      edtavMaqcod11_Internalname = "vMAQCOD11_"+sGXsfl_34_idx ;
      edtavMaqcod12_Internalname = "vMAQCOD12_"+sGXsfl_34_idx ;
      edtavMaqcod13_Internalname = "vMAQCOD13_"+sGXsfl_34_idx ;
      edtavMaqcod14_Internalname = "vMAQCOD14_"+sGXsfl_34_idx ;
      edtavMaqcod15_Internalname = "vMAQCOD15_"+sGXsfl_34_idx ;
      edtavMaqcod16_Internalname = "vMAQCOD16_"+sGXsfl_34_idx ;
      edtavMaqcod17_Internalname = "vMAQCOD17_"+sGXsfl_34_idx ;
      edtavMaqcod18_Internalname = "vMAQCOD18_"+sGXsfl_34_idx ;
      edtavMaqcod19_Internalname = "vMAQCOD19_"+sGXsfl_34_idx ;
      edtavMaqcod2_Internalname = "vMAQCOD2_"+sGXsfl_34_idx ;
      edtavMaqcod20_Internalname = "vMAQCOD20_"+sGXsfl_34_idx ;
      edtavMaqcod21_Internalname = "vMAQCOD21_"+sGXsfl_34_idx ;
      edtavMaqcod22_Internalname = "vMAQCOD22_"+sGXsfl_34_idx ;
      edtavMaqcod23_Internalname = "vMAQCOD23_"+sGXsfl_34_idx ;
      edtavMaqcod24_Internalname = "vMAQCOD24_"+sGXsfl_34_idx ;
      edtavMaqcod25_Internalname = "vMAQCOD25_"+sGXsfl_34_idx ;
      edtavMaqcod26_Internalname = "vMAQCOD26_"+sGXsfl_34_idx ;
      edtavMaqcod27_Internalname = "vMAQCOD27_"+sGXsfl_34_idx ;
      edtavMaqcod28_Internalname = "vMAQCOD28_"+sGXsfl_34_idx ;
      edtavMaqcod3_Internalname = "vMAQCOD3_"+sGXsfl_34_idx ;
      edtavMaqcod4_Internalname = "vMAQCOD4_"+sGXsfl_34_idx ;
      edtavMaqcod5_Internalname = "vMAQCOD5_"+sGXsfl_34_idx ;
      edtavMaqcod6_Internalname = "vMAQCOD6_"+sGXsfl_34_idx ;
      edtavMaqcod7_Internalname = "vMAQCOD7_"+sGXsfl_34_idx ;
      edtavMaqcod8_Internalname = "vMAQCOD8_"+sGXsfl_34_idx ;
      edtavMaqcod9_Internalname = "vMAQCOD9_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_34_fel_idx );
      edtavHdr1_Internalname = "vHDR1_"+sGXsfl_34_fel_idx ;
      edtavHdr2_Internalname = "vHDR2_"+sGXsfl_34_fel_idx ;
      edtavHdr3_Internalname = "vHDR3_"+sGXsfl_34_fel_idx ;
      edtavHdr4_Internalname = "vHDR4_"+sGXsfl_34_fel_idx ;
      edtavHdr5_Internalname = "vHDR5_"+sGXsfl_34_fel_idx ;
      edtavHdr6_Internalname = "vHDR6_"+sGXsfl_34_fel_idx ;
      edtavHdr7_Internalname = "vHDR7_"+sGXsfl_34_fel_idx ;
      edtavHdr8_Internalname = "vHDR8_"+sGXsfl_34_fel_idx ;
      edtavHdr9_Internalname = "vHDR9_"+sGXsfl_34_fel_idx ;
      edtavHdr10_Internalname = "vHDR10_"+sGXsfl_34_fel_idx ;
      edtavHdr11_Internalname = "vHDR11_"+sGXsfl_34_fel_idx ;
      edtavHdr12_Internalname = "vHDR12_"+sGXsfl_34_fel_idx ;
      edtavHdr13_Internalname = "vHDR13_"+sGXsfl_34_fel_idx ;
      edtavHdr14_Internalname = "vHDR14_"+sGXsfl_34_fel_idx ;
      edtavHdr15_Internalname = "vHDR15_"+sGXsfl_34_fel_idx ;
      edtavHdr16_Internalname = "vHDR16_"+sGXsfl_34_fel_idx ;
      edtavHdr17_Internalname = "vHDR17_"+sGXsfl_34_fel_idx ;
      edtavHdr18_Internalname = "vHDR18_"+sGXsfl_34_fel_idx ;
      edtavHdr19_Internalname = "vHDR19_"+sGXsfl_34_fel_idx ;
      edtavHdr20_Internalname = "vHDR20_"+sGXsfl_34_fel_idx ;
      edtavHdr21_Internalname = "vHDR21_"+sGXsfl_34_fel_idx ;
      edtavHdr22_Internalname = "vHDR22_"+sGXsfl_34_fel_idx ;
      edtavHdr23_Internalname = "vHDR23_"+sGXsfl_34_fel_idx ;
      edtavHdr24_Internalname = "vHDR24_"+sGXsfl_34_fel_idx ;
      edtavHdr25_Internalname = "vHDR25_"+sGXsfl_34_fel_idx ;
      edtavHdr26_Internalname = "vHDR26_"+sGXsfl_34_fel_idx ;
      edtavHdr27_Internalname = "vHDR27_"+sGXsfl_34_fel_idx ;
      edtavHdr28_Internalname = "vHDR28_"+sGXsfl_34_fel_idx ;
      edtavLinea1_Internalname = "vLINEA1_"+sGXsfl_34_fel_idx ;
      edtavLinea10_Internalname = "vLINEA10_"+sGXsfl_34_fel_idx ;
      edtavLinea11_Internalname = "vLINEA11_"+sGXsfl_34_fel_idx ;
      edtavLinea12_Internalname = "vLINEA12_"+sGXsfl_34_fel_idx ;
      edtavLinea13_Internalname = "vLINEA13_"+sGXsfl_34_fel_idx ;
      edtavLinea14_Internalname = "vLINEA14_"+sGXsfl_34_fel_idx ;
      edtavLinea15_Internalname = "vLINEA15_"+sGXsfl_34_fel_idx ;
      edtavLinea16_Internalname = "vLINEA16_"+sGXsfl_34_fel_idx ;
      edtavLinea17_Internalname = "vLINEA17_"+sGXsfl_34_fel_idx ;
      edtavLinea18_Internalname = "vLINEA18_"+sGXsfl_34_fel_idx ;
      edtavLinea19_Internalname = "vLINEA19_"+sGXsfl_34_fel_idx ;
      edtavLinea2_Internalname = "vLINEA2_"+sGXsfl_34_fel_idx ;
      edtavLinea20_Internalname = "vLINEA20_"+sGXsfl_34_fel_idx ;
      edtavLinea21_Internalname = "vLINEA21_"+sGXsfl_34_fel_idx ;
      edtavLinea22_Internalname = "vLINEA22_"+sGXsfl_34_fel_idx ;
      edtavLinea23_Internalname = "vLINEA23_"+sGXsfl_34_fel_idx ;
      edtavLinea24_Internalname = "vLINEA24_"+sGXsfl_34_fel_idx ;
      edtavLinea25_Internalname = "vLINEA25_"+sGXsfl_34_fel_idx ;
      edtavLinea26_Internalname = "vLINEA26_"+sGXsfl_34_fel_idx ;
      edtavLinea27_Internalname = "vLINEA27_"+sGXsfl_34_fel_idx ;
      edtavLinea28_Internalname = "vLINEA28_"+sGXsfl_34_fel_idx ;
      edtavLinea3_Internalname = "vLINEA3_"+sGXsfl_34_fel_idx ;
      edtavLinea4_Internalname = "vLINEA4_"+sGXsfl_34_fel_idx ;
      edtavLinea5_Internalname = "vLINEA5_"+sGXsfl_34_fel_idx ;
      edtavLinea6_Internalname = "vLINEA6_"+sGXsfl_34_fel_idx ;
      edtavLinea7_Internalname = "vLINEA7_"+sGXsfl_34_fel_idx ;
      edtavLinea8_Internalname = "vLINEA8_"+sGXsfl_34_fel_idx ;
      edtavLinea9_Internalname = "vLINEA9_"+sGXsfl_34_fel_idx ;
      edtavMaqcod1_Internalname = "vMAQCOD1_"+sGXsfl_34_fel_idx ;
      edtavMaqcod10_Internalname = "vMAQCOD10_"+sGXsfl_34_fel_idx ;
      edtavMaqcod11_Internalname = "vMAQCOD11_"+sGXsfl_34_fel_idx ;
      edtavMaqcod12_Internalname = "vMAQCOD12_"+sGXsfl_34_fel_idx ;
      edtavMaqcod13_Internalname = "vMAQCOD13_"+sGXsfl_34_fel_idx ;
      edtavMaqcod14_Internalname = "vMAQCOD14_"+sGXsfl_34_fel_idx ;
      edtavMaqcod15_Internalname = "vMAQCOD15_"+sGXsfl_34_fel_idx ;
      edtavMaqcod16_Internalname = "vMAQCOD16_"+sGXsfl_34_fel_idx ;
      edtavMaqcod17_Internalname = "vMAQCOD17_"+sGXsfl_34_fel_idx ;
      edtavMaqcod18_Internalname = "vMAQCOD18_"+sGXsfl_34_fel_idx ;
      edtavMaqcod19_Internalname = "vMAQCOD19_"+sGXsfl_34_fel_idx ;
      edtavMaqcod2_Internalname = "vMAQCOD2_"+sGXsfl_34_fel_idx ;
      edtavMaqcod20_Internalname = "vMAQCOD20_"+sGXsfl_34_fel_idx ;
      edtavMaqcod21_Internalname = "vMAQCOD21_"+sGXsfl_34_fel_idx ;
      edtavMaqcod22_Internalname = "vMAQCOD22_"+sGXsfl_34_fel_idx ;
      edtavMaqcod23_Internalname = "vMAQCOD23_"+sGXsfl_34_fel_idx ;
      edtavMaqcod24_Internalname = "vMAQCOD24_"+sGXsfl_34_fel_idx ;
      edtavMaqcod25_Internalname = "vMAQCOD25_"+sGXsfl_34_fel_idx ;
      edtavMaqcod26_Internalname = "vMAQCOD26_"+sGXsfl_34_fel_idx ;
      edtavMaqcod27_Internalname = "vMAQCOD27_"+sGXsfl_34_fel_idx ;
      edtavMaqcod28_Internalname = "vMAQCOD28_"+sGXsfl_34_fel_idx ;
      edtavMaqcod3_Internalname = "vMAQCOD3_"+sGXsfl_34_fel_idx ;
      edtavMaqcod4_Internalname = "vMAQCOD4_"+sGXsfl_34_fel_idx ;
      edtavMaqcod5_Internalname = "vMAQCOD5_"+sGXsfl_34_fel_idx ;
      edtavMaqcod6_Internalname = "vMAQCOD6_"+sGXsfl_34_fel_idx ;
      edtavMaqcod7_Internalname = "vMAQCOD7_"+sGXsfl_34_fel_idx ;
      edtavMaqcod8_Internalname = "vMAQCOD8_"+sGXsfl_34_fel_idx ;
      edtavMaqcod9_Internalname = "vMAQCOD9_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wbAM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_34_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV363GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV363GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV363GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV363GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e16am2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,35);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV363GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_34_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr1_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr1_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr1_Enabled!=0)&&(edtavHdr1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr1_Internalname,GXutil.rtrim( AV77Hdr1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr1_Enabled!=0)&&(edtavHdr1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,36);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr1_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr1_Forecolor)+";"+((edtavHdr1_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr1_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr1_Visible),Integer.valueOf(edtavHdr1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr2_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr2_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr2_Enabled!=0)&&(edtavHdr2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr2_Internalname,GXutil.rtrim( AV88Hdr2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr2_Enabled!=0)&&(edtavHdr2_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,37);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr2_Jsonclick,Integer.valueOf(0),"Attribute",((edtavHdr2_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr2_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr2_Visible),Integer.valueOf(edtavHdr2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr3_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr3_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr3_Enabled!=0)&&(edtavHdr3_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr3_Internalname,GXutil.rtrim( AV98Hdr3),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr3_Enabled!=0)&&(edtavHdr3_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr3_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr3_Forecolor)+";"+((edtavHdr3_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr3_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr3_Visible),Integer.valueOf(edtavHdr3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr4_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr4_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr4_Enabled!=0)&&(edtavHdr4_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr4_Internalname,GXutil.rtrim( AV99Hdr4),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr4_Enabled!=0)&&(edtavHdr4_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr4_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr4_Forecolor)+";"+((edtavHdr4_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr4_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr4_Visible),Integer.valueOf(edtavHdr4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr5_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr5_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr5_Enabled!=0)&&(edtavHdr5_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr5_Internalname,GXutil.rtrim( AV100Hdr5),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr5_Enabled!=0)&&(edtavHdr5_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,40);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr5_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr5_Forecolor)+";"+((edtavHdr5_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr5_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr5_Visible),Integer.valueOf(edtavHdr5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr6_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr6_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr6_Enabled!=0)&&(edtavHdr6_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr6_Internalname,GXutil.rtrim( AV101Hdr6),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr6_Enabled!=0)&&(edtavHdr6_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr6_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr6_Forecolor)+";"+((edtavHdr6_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr6_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr6_Visible),Integer.valueOf(edtavHdr6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr7_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr7_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr7_Enabled!=0)&&(edtavHdr7_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr7_Internalname,GXutil.rtrim( AV102Hdr7),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr7_Enabled!=0)&&(edtavHdr7_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr7_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr7_Forecolor)+";"+((edtavHdr7_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr7_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr7_Visible),Integer.valueOf(edtavHdr7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr8_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr8_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr8_Enabled!=0)&&(edtavHdr8_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr8_Internalname,GXutil.rtrim( AV103Hdr8),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr8_Enabled!=0)&&(edtavHdr8_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr8_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr8_Forecolor)+";"+((edtavHdr8_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr8_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr8_Visible),Integer.valueOf(edtavHdr8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr9_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr9_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr9_Enabled!=0)&&(edtavHdr9_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr9_Internalname,GXutil.rtrim( AV104Hdr9),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr9_Enabled!=0)&&(edtavHdr9_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr9_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr9_Forecolor)+";"+((edtavHdr9_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr9_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr9_Visible),Integer.valueOf(edtavHdr9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr10_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr10_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr10_Enabled!=0)&&(edtavHdr10_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr10_Internalname,GXutil.rtrim( AV78Hdr10),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr10_Enabled!=0)&&(edtavHdr10_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr10_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr10_Forecolor)+";"+((edtavHdr10_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr10_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr10_Visible),Integer.valueOf(edtavHdr10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr11_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr11_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr11_Enabled!=0)&&(edtavHdr11_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr11_Internalname,GXutil.rtrim( AV79Hdr11),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr11_Enabled!=0)&&(edtavHdr11_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr11_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr11_Forecolor)+";"+((edtavHdr11_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr11_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr11_Visible),Integer.valueOf(edtavHdr11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr12_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr12_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr12_Enabled!=0)&&(edtavHdr12_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr12_Internalname,GXutil.rtrim( AV80Hdr12),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr12_Enabled!=0)&&(edtavHdr12_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr12_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr12_Forecolor)+";"+((edtavHdr12_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr12_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr12_Visible),Integer.valueOf(edtavHdr12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr13_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr13_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr13_Enabled!=0)&&(edtavHdr13_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr13_Internalname,GXutil.rtrim( AV81Hdr13),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr13_Enabled!=0)&&(edtavHdr13_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr13_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr13_Forecolor)+";"+((edtavHdr13_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr13_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr13_Visible),Integer.valueOf(edtavHdr13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr14_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr14_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr14_Enabled!=0)&&(edtavHdr14_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr14_Internalname,GXutil.rtrim( AV82Hdr14),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr14_Enabled!=0)&&(edtavHdr14_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr14_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr14_Forecolor)+";"+((edtavHdr14_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr14_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr14_Visible),Integer.valueOf(edtavHdr14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr15_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr15_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr15_Enabled!=0)&&(edtavHdr15_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr15_Internalname,GXutil.rtrim( AV83Hdr15),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr15_Enabled!=0)&&(edtavHdr15_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr15_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr15_Forecolor)+";"+((edtavHdr15_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr15_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr15_Visible),Integer.valueOf(edtavHdr15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr16_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr16_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr16_Enabled!=0)&&(edtavHdr16_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr16_Internalname,GXutil.rtrim( AV84Hdr16),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr16_Enabled!=0)&&(edtavHdr16_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr16_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr16_Forecolor)+";"+((edtavHdr16_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr16_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr16_Visible),Integer.valueOf(edtavHdr16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr17_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr17_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr17_Enabled!=0)&&(edtavHdr17_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr17_Internalname,GXutil.rtrim( AV85Hdr17),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr17_Enabled!=0)&&(edtavHdr17_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr17_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr17_Forecolor)+";"+((edtavHdr17_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr17_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr17_Visible),Integer.valueOf(edtavHdr17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr18_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr18_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr18_Enabled!=0)&&(edtavHdr18_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr18_Internalname,GXutil.rtrim( AV86Hdr18),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr18_Enabled!=0)&&(edtavHdr18_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr18_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr18_Forecolor)+";"+((edtavHdr18_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr18_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr18_Visible),Integer.valueOf(edtavHdr18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr19_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr19_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr19_Enabled!=0)&&(edtavHdr19_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr19_Internalname,GXutil.rtrim( AV87Hdr19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr19_Enabled!=0)&&(edtavHdr19_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr19_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr19_Forecolor)+";"+((edtavHdr19_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr19_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr19_Visible),Integer.valueOf(edtavHdr19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr20_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr20_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr20_Enabled!=0)&&(edtavHdr20_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr20_Internalname,GXutil.rtrim( AV89Hdr20),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr20_Enabled!=0)&&(edtavHdr20_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr20_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr20_Forecolor)+";"+((edtavHdr20_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr20_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr20_Visible),Integer.valueOf(edtavHdr20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr21_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr21_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr21_Enabled!=0)&&(edtavHdr21_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr21_Internalname,GXutil.rtrim( AV90Hdr21),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr21_Enabled!=0)&&(edtavHdr21_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr21_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr21_Forecolor)+";"+((edtavHdr21_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr21_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr21_Visible),Integer.valueOf(edtavHdr21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr22_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr22_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr22_Enabled!=0)&&(edtavHdr22_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr22_Internalname,GXutil.rtrim( AV91Hdr22),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr22_Enabled!=0)&&(edtavHdr22_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr22_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr22_Forecolor)+";"+((edtavHdr22_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr22_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr22_Visible),Integer.valueOf(edtavHdr22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr23_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr23_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr23_Enabled!=0)&&(edtavHdr23_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr23_Internalname,GXutil.rtrim( AV92Hdr23),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr23_Enabled!=0)&&(edtavHdr23_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr23_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr23_Forecolor)+";"+((edtavHdr23_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr23_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr23_Visible),Integer.valueOf(edtavHdr23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr24_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr24_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr24_Enabled!=0)&&(edtavHdr24_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr24_Internalname,GXutil.rtrim( AV93Hdr24),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr24_Enabled!=0)&&(edtavHdr24_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr24_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr24_Forecolor)+";"+((edtavHdr24_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr24_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr24_Visible),Integer.valueOf(edtavHdr24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr25_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr25_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr25_Enabled!=0)&&(edtavHdr25_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr25_Internalname,GXutil.rtrim( AV94Hdr25),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr25_Enabled!=0)&&(edtavHdr25_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr25_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr25_Forecolor)+";"+((edtavHdr25_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr25_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr25_Visible),Integer.valueOf(edtavHdr25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr26_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr26_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr26_Enabled!=0)&&(edtavHdr26_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr26_Internalname,GXutil.rtrim( AV95Hdr26),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr26_Enabled!=0)&&(edtavHdr26_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr26_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr26_Forecolor)+";"+((edtavHdr26_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr26_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr26_Visible),Integer.valueOf(edtavHdr26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr27_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr27_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr27_Enabled!=0)&&(edtavHdr27_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr27_Internalname,GXutil.rtrim( AV96Hdr27),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr27_Enabled!=0)&&(edtavHdr27_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr27_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr27_Forecolor)+";"+((edtavHdr27_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr27_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr27_Visible),Integer.valueOf(edtavHdr27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr28_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr28_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr28_Enabled!=0)&&(edtavHdr28_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr28_Internalname,GXutil.rtrim( AV97Hdr28),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr28_Enabled!=0)&&(edtavHdr28_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr28_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr28_Forecolor)+";"+((edtavHdr28_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr28_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavHdr28_Visible),Integer.valueOf(edtavHdr28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea1_Enabled!=0)&&(edtavLinea1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea1_Internalname,GXutil.rtrim( AV112Linea1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea1_Enabled!=0)&&(edtavLinea1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,64);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea10_Enabled!=0)&&(edtavLinea10_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea10_Internalname,GXutil.rtrim( AV113Linea10),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea10_Enabled!=0)&&(edtavLinea10_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,65);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea10_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea11_Enabled!=0)&&(edtavLinea11_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea11_Internalname,GXutil.rtrim( AV114Linea11),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea11_Enabled!=0)&&(edtavLinea11_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,66);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea11_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea12_Enabled!=0)&&(edtavLinea12_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea12_Internalname,GXutil.rtrim( AV115Linea12),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea12_Enabled!=0)&&(edtavLinea12_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,67);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea12_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea13_Enabled!=0)&&(edtavLinea13_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea13_Internalname,GXutil.rtrim( AV116Linea13),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea13_Enabled!=0)&&(edtavLinea13_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,68);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea13_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea14_Enabled!=0)&&(edtavLinea14_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea14_Internalname,GXutil.rtrim( AV117Linea14),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea14_Enabled!=0)&&(edtavLinea14_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea14_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea15_Enabled!=0)&&(edtavLinea15_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea15_Internalname,GXutil.rtrim( AV118Linea15),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea15_Enabled!=0)&&(edtavLinea15_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea16_Enabled!=0)&&(edtavLinea16_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea16_Internalname,GXutil.rtrim( AV119Linea16),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea16_Enabled!=0)&&(edtavLinea16_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea16_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea17_Enabled!=0)&&(edtavLinea17_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea17_Internalname,GXutil.rtrim( AV120Linea17),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea17_Enabled!=0)&&(edtavLinea17_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,72);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea17_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea18_Enabled!=0)&&(edtavLinea18_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea18_Internalname,GXutil.rtrim( AV121Linea18),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea18_Enabled!=0)&&(edtavLinea18_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,73);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea18_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea19_Enabled!=0)&&(edtavLinea19_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea19_Internalname,GXutil.rtrim( AV122Linea19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea19_Enabled!=0)&&(edtavLinea19_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,74);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea2_Enabled!=0)&&(edtavLinea2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea2_Internalname,GXutil.rtrim( AV123Linea2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea2_Enabled!=0)&&(edtavLinea2_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,75);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea20_Enabled!=0)&&(edtavLinea20_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea20_Internalname,GXutil.rtrim( AV124Linea20),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea20_Enabled!=0)&&(edtavLinea20_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,76);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea20_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea21_Enabled!=0)&&(edtavLinea21_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea21_Internalname,GXutil.rtrim( AV125Linea21),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea21_Enabled!=0)&&(edtavLinea21_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,77);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea21_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea22_Enabled!=0)&&(edtavLinea22_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea22_Internalname,GXutil.rtrim( AV126Linea22),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea22_Enabled!=0)&&(edtavLinea22_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,78);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea22_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea23_Enabled!=0)&&(edtavLinea23_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea23_Internalname,GXutil.rtrim( AV127Linea23),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea23_Enabled!=0)&&(edtavLinea23_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,79);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea23_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea24_Enabled!=0)&&(edtavLinea24_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea24_Internalname,GXutil.rtrim( AV128Linea24),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea24_Enabled!=0)&&(edtavLinea24_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea24_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea25_Enabled!=0)&&(edtavLinea25_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea25_Internalname,GXutil.rtrim( AV129Linea25),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea25_Enabled!=0)&&(edtavLinea25_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea25_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea26_Enabled!=0)&&(edtavLinea26_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea26_Internalname,GXutil.rtrim( AV130Linea26),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea26_Enabled!=0)&&(edtavLinea26_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,82);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea26_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea27_Enabled!=0)&&(edtavLinea27_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea27_Internalname,GXutil.rtrim( AV131Linea27),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea27_Enabled!=0)&&(edtavLinea27_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,83);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea27_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea28_Enabled!=0)&&(edtavLinea28_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea28_Internalname,GXutil.rtrim( AV132Linea28),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea28_Enabled!=0)&&(edtavLinea28_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea28_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea3_Enabled!=0)&&(edtavLinea3_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea3_Internalname,GXutil.rtrim( AV133Linea3),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea3_Enabled!=0)&&(edtavLinea3_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,85);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea4_Enabled!=0)&&(edtavLinea4_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 86,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea4_Internalname,GXutil.rtrim( AV134Linea4),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea4_Enabled!=0)&&(edtavLinea4_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,86);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea5_Enabled!=0)&&(edtavLinea5_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 87,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea5_Internalname,GXutil.rtrim( AV135Linea5),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea5_Enabled!=0)&&(edtavLinea5_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,87);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea6_Enabled!=0)&&(edtavLinea6_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 88,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea6_Internalname,GXutil.rtrim( AV136Linea6),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea6_Enabled!=0)&&(edtavLinea6_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,88);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea7_Enabled!=0)&&(edtavLinea7_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea7_Internalname,GXutil.rtrim( AV137Linea7),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea7_Enabled!=0)&&(edtavLinea7_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea7_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea8_Enabled!=0)&&(edtavLinea8_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea8_Internalname,GXutil.rtrim( AV138LInea8),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea8_Enabled!=0)&&(edtavLinea8_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,90);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea8_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLinea9_Enabled!=0)&&(edtavLinea9_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 91,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea9_Internalname,GXutil.rtrim( AV139Linea9),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLinea9_Enabled!=0)&&(edtavLinea9_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,91);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea9_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod1_Enabled!=0)&&(edtavMaqcod1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 92,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod1_Internalname,GXutil.rtrim( AV165Maqcod1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod1_Enabled!=0)&&(edtavMaqcod1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,92);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod10_Enabled!=0)&&(edtavMaqcod10_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod10_Internalname,GXutil.rtrim( AV166MaqCod10),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod10_Enabled!=0)&&(edtavMaqcod10_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,93);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod10_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod11_Enabled!=0)&&(edtavMaqcod11_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod11_Internalname,GXutil.rtrim( AV167Maqcod11),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod11_Enabled!=0)&&(edtavMaqcod11_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod11_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod12_Enabled!=0)&&(edtavMaqcod12_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod12_Internalname,GXutil.rtrim( AV168MaqCod12),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod12_Enabled!=0)&&(edtavMaqcod12_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,95);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod12_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod13_Enabled!=0)&&(edtavMaqcod13_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 96,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod13_Internalname,GXutil.rtrim( AV169Maqcod13),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod13_Enabled!=0)&&(edtavMaqcod13_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,96);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod13_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod14_Enabled!=0)&&(edtavMaqcod14_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 97,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod14_Internalname,GXutil.rtrim( AV170Maqcod14),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod14_Enabled!=0)&&(edtavMaqcod14_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,97);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod14_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod15_Enabled!=0)&&(edtavMaqcod15_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 98,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod15_Internalname,GXutil.rtrim( AV171Maqcod15),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod15_Enabled!=0)&&(edtavMaqcod15_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,98);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod16_Enabled!=0)&&(edtavMaqcod16_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod16_Internalname,GXutil.rtrim( AV172Maqcod16),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod16_Enabled!=0)&&(edtavMaqcod16_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,99);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod16_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod17_Enabled!=0)&&(edtavMaqcod17_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod17_Internalname,GXutil.rtrim( AV173Maqcod17),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod17_Enabled!=0)&&(edtavMaqcod17_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod17_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod18_Enabled!=0)&&(edtavMaqcod18_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod18_Internalname,GXutil.rtrim( AV174Maqcod18),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod18_Enabled!=0)&&(edtavMaqcod18_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod18_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod19_Enabled!=0)&&(edtavMaqcod19_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod19_Internalname,GXutil.rtrim( AV175Maqcod19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod19_Enabled!=0)&&(edtavMaqcod19_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,102);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod2_Enabled!=0)&&(edtavMaqcod2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod2_Internalname,GXutil.rtrim( AV176Maqcod2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod2_Enabled!=0)&&(edtavMaqcod2_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,103);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod20_Enabled!=0)&&(edtavMaqcod20_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod20_Internalname,GXutil.rtrim( AV177Maqcod20),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod20_Enabled!=0)&&(edtavMaqcod20_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,104);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod20_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod21_Enabled!=0)&&(edtavMaqcod21_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod21_Internalname,GXutil.rtrim( AV178Maqcod21),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod21_Enabled!=0)&&(edtavMaqcod21_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,105);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod21_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod22_Enabled!=0)&&(edtavMaqcod22_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod22_Internalname,GXutil.rtrim( AV179Maqcod22),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod22_Enabled!=0)&&(edtavMaqcod22_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod22_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod23_Enabled!=0)&&(edtavMaqcod23_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod23_Internalname,GXutil.rtrim( AV180Maqcod23),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod23_Enabled!=0)&&(edtavMaqcod23_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod23_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod24_Enabled!=0)&&(edtavMaqcod24_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod24_Internalname,GXutil.rtrim( AV181Maqcod24),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod24_Enabled!=0)&&(edtavMaqcod24_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod24_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod25_Enabled!=0)&&(edtavMaqcod25_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod25_Internalname,GXutil.rtrim( AV182Maqcod25),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod25_Enabled!=0)&&(edtavMaqcod25_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod25_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod26_Enabled!=0)&&(edtavMaqcod26_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod26_Internalname,GXutil.rtrim( AV183Maqcod26),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod26_Enabled!=0)&&(edtavMaqcod26_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,110);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod26_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod27_Enabled!=0)&&(edtavMaqcod27_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod27_Internalname,GXutil.rtrim( AV184Maqcod27),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod27_Enabled!=0)&&(edtavMaqcod27_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod27_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod28_Enabled!=0)&&(edtavMaqcod28_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod28_Internalname,GXutil.rtrim( AV185Maqcod28),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod28_Enabled!=0)&&(edtavMaqcod28_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,112);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod28_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod3_Enabled!=0)&&(edtavMaqcod3_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod3_Internalname,GXutil.rtrim( AV186Maqcod3),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod3_Enabled!=0)&&(edtavMaqcod3_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod4_Enabled!=0)&&(edtavMaqcod4_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod4_Internalname,GXutil.rtrim( AV187Maqcod4),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod4_Enabled!=0)&&(edtavMaqcod4_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,114);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod5_Enabled!=0)&&(edtavMaqcod5_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod5_Internalname,GXutil.rtrim( AV188Maqcod5),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod5_Enabled!=0)&&(edtavMaqcod5_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,115);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod6_Enabled!=0)&&(edtavMaqcod6_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod6_Internalname,GXutil.rtrim( AV189Maqcod6),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod6_Enabled!=0)&&(edtavMaqcod6_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,116);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod7_Enabled!=0)&&(edtavMaqcod7_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod7_Internalname,GXutil.rtrim( AV190Maqcod7),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod7_Enabled!=0)&&(edtavMaqcod7_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,117);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod7_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod8_Enabled!=0)&&(edtavMaqcod8_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod8_Internalname,GXutil.rtrim( AV191Maqcod8),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod8_Enabled!=0)&&(edtavMaqcod8_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,118);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod8_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod9_Enabled!=0)&&(edtavMaqcod9_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod9_Internalname,GXutil.rtrim( AV192Maqcod9),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod9_Enabled!=0)&&(edtavMaqcod9_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,119);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod9_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesAM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void startgridcontrol34( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"34\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr1_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr2_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr3_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr3_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr4_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr4_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr5_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr5_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr6_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr6_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr7_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr7_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr8_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr8_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr9_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr9_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr10_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr10_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr11_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr11_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr12_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr12_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr13_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr13_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr14_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr14_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr15_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr15_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr16_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr16_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr17_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr17_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr18_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr18_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr19_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr19_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr20_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr20_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr21_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr21_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr22_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr22_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr23_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr23_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr24_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr24_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr25_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr25_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr26_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr26_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr27_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr27_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr28_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr28_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV363GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV77Hdr1));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr1_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV88Hdr2));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr2_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr2_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV98Hdr3));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr3_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV99Hdr4));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr4_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV100Hdr5));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr5_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV101Hdr6));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr6_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV102Hdr7));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr7_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV103Hdr8));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr8_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV104Hdr9));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr9_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV78Hdr10));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr10_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV79Hdr11));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr11_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV80Hdr12));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr12_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV81Hdr13));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr13_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV82Hdr14));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr14_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV83Hdr15));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr15_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV84Hdr16));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr16_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV85Hdr17));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr17_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV86Hdr18));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr18_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV87Hdr19));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr19_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89Hdr20));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr20_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV90Hdr21));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr21_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV91Hdr22));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr22_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV92Hdr23));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr23_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV93Hdr24));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr24_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV94Hdr25));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr25_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV95Hdr26));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr26_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV96Hdr27));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr27_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV97Hdr28));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr28_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV112Linea1));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV113Linea10));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV114Linea11));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV115Linea12));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV116Linea13));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV117Linea14));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV118Linea15));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV119Linea16));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV120Linea17));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV121Linea18));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV122Linea19));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV123Linea2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV124Linea20));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV125Linea21));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV126Linea22));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV127Linea23));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV128Linea24));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV129Linea25));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV130Linea26));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV131Linea27));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV132Linea28));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea28_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV133Linea3));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV134Linea4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV135Linea5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV136Linea6));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV137Linea7));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV138LInea8));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV139Linea9));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea9_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV165Maqcod1));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV166MaqCod10));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV167Maqcod11));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV168MaqCod12));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV169Maqcod13));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV170Maqcod14));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV171Maqcod15));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV172Maqcod16));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV173Maqcod17));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV174Maqcod18));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV175Maqcod19));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV176Maqcod2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV177Maqcod20));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV178Maqcod21));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV179Maqcod22));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV180Maqcod23));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV181Maqcod24));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV182Maqcod25));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV183Maqcod26));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV184Maqcod27));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV185Maqcod28));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod28_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV186Maqcod3));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV187Maqcod4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV188Maqcod5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV189Maqcod6));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV190Maqcod7));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV191Maqcod8));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV192Maqcod9));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod9_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavHdr1_Internalname = "vHDR1" ;
      edtavHdr2_Internalname = "vHDR2" ;
      edtavHdr3_Internalname = "vHDR3" ;
      edtavHdr4_Internalname = "vHDR4" ;
      edtavHdr5_Internalname = "vHDR5" ;
      edtavHdr6_Internalname = "vHDR6" ;
      edtavHdr7_Internalname = "vHDR7" ;
      edtavHdr8_Internalname = "vHDR8" ;
      edtavHdr9_Internalname = "vHDR9" ;
      edtavHdr10_Internalname = "vHDR10" ;
      edtavHdr11_Internalname = "vHDR11" ;
      edtavHdr12_Internalname = "vHDR12" ;
      edtavHdr13_Internalname = "vHDR13" ;
      edtavHdr14_Internalname = "vHDR14" ;
      edtavHdr15_Internalname = "vHDR15" ;
      edtavHdr16_Internalname = "vHDR16" ;
      edtavHdr17_Internalname = "vHDR17" ;
      edtavHdr18_Internalname = "vHDR18" ;
      edtavHdr19_Internalname = "vHDR19" ;
      edtavHdr20_Internalname = "vHDR20" ;
      edtavHdr21_Internalname = "vHDR21" ;
      edtavHdr22_Internalname = "vHDR22" ;
      edtavHdr23_Internalname = "vHDR23" ;
      edtavHdr24_Internalname = "vHDR24" ;
      edtavHdr25_Internalname = "vHDR25" ;
      edtavHdr26_Internalname = "vHDR26" ;
      edtavHdr27_Internalname = "vHDR27" ;
      edtavHdr28_Internalname = "vHDR28" ;
      edtavLinea1_Internalname = "vLINEA1" ;
      edtavLinea10_Internalname = "vLINEA10" ;
      edtavLinea11_Internalname = "vLINEA11" ;
      edtavLinea12_Internalname = "vLINEA12" ;
      edtavLinea13_Internalname = "vLINEA13" ;
      edtavLinea14_Internalname = "vLINEA14" ;
      edtavLinea15_Internalname = "vLINEA15" ;
      edtavLinea16_Internalname = "vLINEA16" ;
      edtavLinea17_Internalname = "vLINEA17" ;
      edtavLinea18_Internalname = "vLINEA18" ;
      edtavLinea19_Internalname = "vLINEA19" ;
      edtavLinea2_Internalname = "vLINEA2" ;
      edtavLinea20_Internalname = "vLINEA20" ;
      edtavLinea21_Internalname = "vLINEA21" ;
      edtavLinea22_Internalname = "vLINEA22" ;
      edtavLinea23_Internalname = "vLINEA23" ;
      edtavLinea24_Internalname = "vLINEA24" ;
      edtavLinea25_Internalname = "vLINEA25" ;
      edtavLinea26_Internalname = "vLINEA26" ;
      edtavLinea27_Internalname = "vLINEA27" ;
      edtavLinea28_Internalname = "vLINEA28" ;
      edtavLinea3_Internalname = "vLINEA3" ;
      edtavLinea4_Internalname = "vLINEA4" ;
      edtavLinea5_Internalname = "vLINEA5" ;
      edtavLinea6_Internalname = "vLINEA6" ;
      edtavLinea7_Internalname = "vLINEA7" ;
      edtavLinea8_Internalname = "vLINEA8" ;
      edtavLinea9_Internalname = "vLINEA9" ;
      edtavMaqcod1_Internalname = "vMAQCOD1" ;
      edtavMaqcod10_Internalname = "vMAQCOD10" ;
      edtavMaqcod11_Internalname = "vMAQCOD11" ;
      edtavMaqcod12_Internalname = "vMAQCOD12" ;
      edtavMaqcod13_Internalname = "vMAQCOD13" ;
      edtavMaqcod14_Internalname = "vMAQCOD14" ;
      edtavMaqcod15_Internalname = "vMAQCOD15" ;
      edtavMaqcod16_Internalname = "vMAQCOD16" ;
      edtavMaqcod17_Internalname = "vMAQCOD17" ;
      edtavMaqcod18_Internalname = "vMAQCOD18" ;
      edtavMaqcod19_Internalname = "vMAQCOD19" ;
      edtavMaqcod2_Internalname = "vMAQCOD2" ;
      edtavMaqcod20_Internalname = "vMAQCOD20" ;
      edtavMaqcod21_Internalname = "vMAQCOD21" ;
      edtavMaqcod22_Internalname = "vMAQCOD22" ;
      edtavMaqcod23_Internalname = "vMAQCOD23" ;
      edtavMaqcod24_Internalname = "vMAQCOD24" ;
      edtavMaqcod25_Internalname = "vMAQCOD25" ;
      edtavMaqcod26_Internalname = "vMAQCOD26" ;
      edtavMaqcod27_Internalname = "vMAQCOD27" ;
      edtavMaqcod28_Internalname = "vMAQCOD28" ;
      edtavMaqcod3_Internalname = "vMAQCOD3" ;
      edtavMaqcod4_Internalname = "vMAQCOD4" ;
      edtavMaqcod5_Internalname = "vMAQCOD5" ;
      edtavMaqcod6_Internalname = "vMAQCOD6" ;
      edtavMaqcod7_Internalname = "vMAQCOD7" ;
      edtavMaqcod8_Internalname = "vMAQCOD8" ;
      edtavMaqcod9_Internalname = "vMAQCOD9" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavMaqcod9_Jsonclick = "" ;
      edtavMaqcod9_Visible = 0 ;
      edtavMaqcod9_Enabled = 1 ;
      edtavMaqcod8_Jsonclick = "" ;
      edtavMaqcod8_Visible = 0 ;
      edtavMaqcod8_Enabled = 1 ;
      edtavMaqcod7_Jsonclick = "" ;
      edtavMaqcod7_Visible = 0 ;
      edtavMaqcod7_Enabled = 1 ;
      edtavMaqcod6_Jsonclick = "" ;
      edtavMaqcod6_Visible = 0 ;
      edtavMaqcod6_Enabled = 1 ;
      edtavMaqcod5_Jsonclick = "" ;
      edtavMaqcod5_Visible = 0 ;
      edtavMaqcod5_Enabled = 1 ;
      edtavMaqcod4_Jsonclick = "" ;
      edtavMaqcod4_Visible = 0 ;
      edtavMaqcod4_Enabled = 1 ;
      edtavMaqcod3_Jsonclick = "" ;
      edtavMaqcod3_Visible = 0 ;
      edtavMaqcod3_Enabled = 1 ;
      edtavMaqcod28_Jsonclick = "" ;
      edtavMaqcod28_Visible = 0 ;
      edtavMaqcod28_Enabled = 1 ;
      edtavMaqcod27_Jsonclick = "" ;
      edtavMaqcod27_Visible = 0 ;
      edtavMaqcod27_Enabled = 1 ;
      edtavMaqcod26_Jsonclick = "" ;
      edtavMaqcod26_Visible = 0 ;
      edtavMaqcod26_Enabled = 1 ;
      edtavMaqcod25_Jsonclick = "" ;
      edtavMaqcod25_Visible = 0 ;
      edtavMaqcod25_Enabled = 1 ;
      edtavMaqcod24_Jsonclick = "" ;
      edtavMaqcod24_Visible = 0 ;
      edtavMaqcod24_Enabled = 1 ;
      edtavMaqcod23_Jsonclick = "" ;
      edtavMaqcod23_Visible = 0 ;
      edtavMaqcod23_Enabled = 1 ;
      edtavMaqcod22_Jsonclick = "" ;
      edtavMaqcod22_Visible = 0 ;
      edtavMaqcod22_Enabled = 1 ;
      edtavMaqcod21_Jsonclick = "" ;
      edtavMaqcod21_Visible = 0 ;
      edtavMaqcod21_Enabled = 1 ;
      edtavMaqcod20_Jsonclick = "" ;
      edtavMaqcod20_Visible = 0 ;
      edtavMaqcod20_Enabled = 1 ;
      edtavMaqcod2_Jsonclick = "" ;
      edtavMaqcod2_Visible = 0 ;
      edtavMaqcod2_Enabled = 1 ;
      edtavMaqcod19_Jsonclick = "" ;
      edtavMaqcod19_Visible = 0 ;
      edtavMaqcod19_Enabled = 1 ;
      edtavMaqcod18_Jsonclick = "" ;
      edtavMaqcod18_Visible = 0 ;
      edtavMaqcod18_Enabled = 1 ;
      edtavMaqcod17_Jsonclick = "" ;
      edtavMaqcod17_Visible = 0 ;
      edtavMaqcod17_Enabled = 1 ;
      edtavMaqcod16_Jsonclick = "" ;
      edtavMaqcod16_Visible = 0 ;
      edtavMaqcod16_Enabled = 1 ;
      edtavMaqcod15_Jsonclick = "" ;
      edtavMaqcod15_Visible = 0 ;
      edtavMaqcod15_Enabled = 1 ;
      edtavMaqcod14_Jsonclick = "" ;
      edtavMaqcod14_Visible = 0 ;
      edtavMaqcod14_Enabled = 1 ;
      edtavMaqcod13_Jsonclick = "" ;
      edtavMaqcod13_Visible = 0 ;
      edtavMaqcod13_Enabled = 1 ;
      edtavMaqcod12_Jsonclick = "" ;
      edtavMaqcod12_Visible = 0 ;
      edtavMaqcod12_Enabled = 1 ;
      edtavMaqcod11_Jsonclick = "" ;
      edtavMaqcod11_Visible = 0 ;
      edtavMaqcod11_Enabled = 1 ;
      edtavMaqcod10_Jsonclick = "" ;
      edtavMaqcod10_Visible = 0 ;
      edtavMaqcod10_Enabled = 1 ;
      edtavMaqcod1_Jsonclick = "" ;
      edtavMaqcod1_Visible = 0 ;
      edtavMaqcod1_Enabled = 1 ;
      edtavLinea9_Jsonclick = "" ;
      edtavLinea9_Visible = 0 ;
      edtavLinea9_Enabled = 1 ;
      edtavLinea8_Jsonclick = "" ;
      edtavLinea8_Visible = 0 ;
      edtavLinea8_Enabled = 1 ;
      edtavLinea7_Jsonclick = "" ;
      edtavLinea7_Visible = 0 ;
      edtavLinea7_Enabled = 1 ;
      edtavLinea6_Jsonclick = "" ;
      edtavLinea6_Visible = 0 ;
      edtavLinea6_Enabled = 1 ;
      edtavLinea5_Jsonclick = "" ;
      edtavLinea5_Visible = 0 ;
      edtavLinea5_Enabled = 1 ;
      edtavLinea4_Jsonclick = "" ;
      edtavLinea4_Visible = 0 ;
      edtavLinea4_Enabled = 1 ;
      edtavLinea3_Jsonclick = "" ;
      edtavLinea3_Visible = 0 ;
      edtavLinea3_Enabled = 1 ;
      edtavLinea28_Jsonclick = "" ;
      edtavLinea28_Visible = 0 ;
      edtavLinea28_Enabled = 1 ;
      edtavLinea27_Jsonclick = "" ;
      edtavLinea27_Visible = 0 ;
      edtavLinea27_Enabled = 1 ;
      edtavLinea26_Jsonclick = "" ;
      edtavLinea26_Visible = 0 ;
      edtavLinea26_Enabled = 1 ;
      edtavLinea25_Jsonclick = "" ;
      edtavLinea25_Visible = 0 ;
      edtavLinea25_Enabled = 1 ;
      edtavLinea24_Jsonclick = "" ;
      edtavLinea24_Visible = 0 ;
      edtavLinea24_Enabled = 1 ;
      edtavLinea23_Jsonclick = "" ;
      edtavLinea23_Visible = 0 ;
      edtavLinea23_Enabled = 1 ;
      edtavLinea22_Jsonclick = "" ;
      edtavLinea22_Visible = 0 ;
      edtavLinea22_Enabled = 1 ;
      edtavLinea21_Jsonclick = "" ;
      edtavLinea21_Visible = 0 ;
      edtavLinea21_Enabled = 1 ;
      edtavLinea20_Jsonclick = "" ;
      edtavLinea20_Visible = 0 ;
      edtavLinea20_Enabled = 1 ;
      edtavLinea2_Jsonclick = "" ;
      edtavLinea2_Visible = 0 ;
      edtavLinea2_Enabled = 1 ;
      edtavLinea19_Jsonclick = "" ;
      edtavLinea19_Visible = 0 ;
      edtavLinea19_Enabled = 1 ;
      edtavLinea18_Jsonclick = "" ;
      edtavLinea18_Visible = 0 ;
      edtavLinea18_Enabled = 1 ;
      edtavLinea17_Jsonclick = "" ;
      edtavLinea17_Visible = 0 ;
      edtavLinea17_Enabled = 1 ;
      edtavLinea16_Jsonclick = "" ;
      edtavLinea16_Visible = 0 ;
      edtavLinea16_Enabled = 1 ;
      edtavLinea15_Jsonclick = "" ;
      edtavLinea15_Visible = 0 ;
      edtavLinea15_Enabled = 1 ;
      edtavLinea14_Jsonclick = "" ;
      edtavLinea14_Visible = 0 ;
      edtavLinea14_Enabled = 1 ;
      edtavLinea13_Jsonclick = "" ;
      edtavLinea13_Visible = 0 ;
      edtavLinea13_Enabled = 1 ;
      edtavLinea12_Jsonclick = "" ;
      edtavLinea12_Visible = 0 ;
      edtavLinea12_Enabled = 1 ;
      edtavLinea11_Jsonclick = "" ;
      edtavLinea11_Visible = 0 ;
      edtavLinea11_Enabled = 1 ;
      edtavLinea10_Jsonclick = "" ;
      edtavLinea10_Visible = 0 ;
      edtavLinea10_Enabled = 1 ;
      edtavLinea1_Jsonclick = "" ;
      edtavLinea1_Visible = 0 ;
      edtavLinea1_Enabled = 1 ;
      edtavHdr28_Jsonclick = "" ;
      edtavHdr28_Forecolor = (int)(0x000000) ;
      edtavHdr28_Enabled = 1 ;
      edtavHdr28_Backcolor = -1 ;
      edtavHdr27_Jsonclick = "" ;
      edtavHdr27_Forecolor = (int)(0x000000) ;
      edtavHdr27_Enabled = 1 ;
      edtavHdr27_Backcolor = -1 ;
      edtavHdr26_Jsonclick = "" ;
      edtavHdr26_Forecolor = (int)(0x000000) ;
      edtavHdr26_Enabled = 1 ;
      edtavHdr26_Backcolor = -1 ;
      edtavHdr25_Jsonclick = "" ;
      edtavHdr25_Forecolor = (int)(0x000000) ;
      edtavHdr25_Enabled = 1 ;
      edtavHdr25_Backcolor = -1 ;
      edtavHdr24_Jsonclick = "" ;
      edtavHdr24_Forecolor = (int)(0x000000) ;
      edtavHdr24_Enabled = 1 ;
      edtavHdr24_Backcolor = -1 ;
      edtavHdr23_Jsonclick = "" ;
      edtavHdr23_Forecolor = (int)(0x000000) ;
      edtavHdr23_Enabled = 1 ;
      edtavHdr23_Backcolor = -1 ;
      edtavHdr22_Jsonclick = "" ;
      edtavHdr22_Forecolor = (int)(0x000000) ;
      edtavHdr22_Enabled = 1 ;
      edtavHdr22_Backcolor = -1 ;
      edtavHdr21_Jsonclick = "" ;
      edtavHdr21_Forecolor = (int)(0x000000) ;
      edtavHdr21_Enabled = 1 ;
      edtavHdr21_Backcolor = -1 ;
      edtavHdr20_Jsonclick = "" ;
      edtavHdr20_Forecolor = (int)(0x000000) ;
      edtavHdr20_Enabled = 1 ;
      edtavHdr20_Backcolor = -1 ;
      edtavHdr19_Jsonclick = "" ;
      edtavHdr19_Forecolor = (int)(0x000000) ;
      edtavHdr19_Enabled = 1 ;
      edtavHdr19_Backcolor = -1 ;
      edtavHdr18_Jsonclick = "" ;
      edtavHdr18_Forecolor = (int)(0x000000) ;
      edtavHdr18_Enabled = 1 ;
      edtavHdr18_Backcolor = -1 ;
      edtavHdr17_Jsonclick = "" ;
      edtavHdr17_Forecolor = (int)(0x000000) ;
      edtavHdr17_Enabled = 1 ;
      edtavHdr17_Backcolor = -1 ;
      edtavHdr16_Jsonclick = "" ;
      edtavHdr16_Forecolor = (int)(0x000000) ;
      edtavHdr16_Enabled = 1 ;
      edtavHdr16_Backcolor = -1 ;
      edtavHdr15_Jsonclick = "" ;
      edtavHdr15_Forecolor = (int)(0x000000) ;
      edtavHdr15_Enabled = 1 ;
      edtavHdr15_Backcolor = -1 ;
      edtavHdr14_Jsonclick = "" ;
      edtavHdr14_Forecolor = (int)(0x000000) ;
      edtavHdr14_Enabled = 1 ;
      edtavHdr14_Backcolor = -1 ;
      edtavHdr13_Jsonclick = "" ;
      edtavHdr13_Forecolor = (int)(0x000000) ;
      edtavHdr13_Enabled = 1 ;
      edtavHdr13_Backcolor = -1 ;
      edtavHdr12_Jsonclick = "" ;
      edtavHdr12_Forecolor = (int)(0x000000) ;
      edtavHdr12_Enabled = 1 ;
      edtavHdr12_Backcolor = -1 ;
      edtavHdr11_Jsonclick = "" ;
      edtavHdr11_Forecolor = (int)(0x000000) ;
      edtavHdr11_Enabled = 1 ;
      edtavHdr11_Backcolor = -1 ;
      edtavHdr10_Jsonclick = "" ;
      edtavHdr10_Forecolor = (int)(0x000000) ;
      edtavHdr10_Enabled = 1 ;
      edtavHdr10_Backcolor = -1 ;
      edtavHdr9_Jsonclick = "" ;
      edtavHdr9_Forecolor = (int)(0x000000) ;
      edtavHdr9_Enabled = 1 ;
      edtavHdr9_Backcolor = -1 ;
      edtavHdr8_Jsonclick = "" ;
      edtavHdr8_Forecolor = (int)(0x000000) ;
      edtavHdr8_Enabled = 1 ;
      edtavHdr8_Backcolor = -1 ;
      edtavHdr7_Jsonclick = "" ;
      edtavHdr7_Forecolor = (int)(0x000000) ;
      edtavHdr7_Enabled = 1 ;
      edtavHdr7_Backcolor = -1 ;
      edtavHdr6_Jsonclick = "" ;
      edtavHdr6_Forecolor = (int)(0x000000) ;
      edtavHdr6_Enabled = 1 ;
      edtavHdr6_Backcolor = -1 ;
      edtavHdr5_Jsonclick = "" ;
      edtavHdr5_Forecolor = (int)(0x000000) ;
      edtavHdr5_Enabled = 1 ;
      edtavHdr5_Backcolor = -1 ;
      edtavHdr4_Jsonclick = "" ;
      edtavHdr4_Forecolor = (int)(0x000000) ;
      edtavHdr4_Enabled = 1 ;
      edtavHdr4_Backcolor = -1 ;
      edtavHdr3_Jsonclick = "" ;
      edtavHdr3_Forecolor = (int)(0x000000) ;
      edtavHdr3_Enabled = 1 ;
      edtavHdr3_Backcolor = -1 ;
      edtavHdr2_Jsonclick = "" ;
      edtavHdr2_Enabled = 1 ;
      edtavHdr2_Backcolor = -1 ;
      edtavHdr1_Jsonclick = "" ;
      edtavHdr1_Forecolor = (int)(0x000000) ;
      edtavHdr1_Enabled = 1 ;
      edtavHdr1_Backcolor = -1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      tblTablerightheader_Visible = 1 ;
      edtavHdr28_Visible = -1 ;
      edtavHdr27_Visible = -1 ;
      edtavHdr26_Visible = -1 ;
      edtavHdr25_Visible = -1 ;
      edtavHdr24_Visible = -1 ;
      edtavHdr23_Visible = -1 ;
      edtavHdr22_Visible = -1 ;
      edtavHdr21_Visible = -1 ;
      edtavHdr20_Visible = -1 ;
      edtavHdr19_Visible = -1 ;
      edtavHdr18_Visible = -1 ;
      edtavHdr17_Visible = -1 ;
      edtavHdr16_Visible = -1 ;
      edtavHdr15_Visible = -1 ;
      edtavHdr14_Visible = -1 ;
      edtavHdr13_Visible = -1 ;
      edtavHdr12_Visible = -1 ;
      edtavHdr11_Visible = -1 ;
      edtavHdr10_Visible = -1 ;
      edtavHdr9_Visible = -1 ;
      edtavHdr8_Visible = -1 ;
      edtavHdr7_Visible = -1 ;
      edtavHdr6_Visible = -1 ;
      edtavHdr5_Visible = -1 ;
      edtavHdr4_Visible = -1 ;
      edtavHdr3_Visible = -1 ;
      edtavHdr2_Visible = -1 ;
      edtavHdr1_Visible = -1 ;
      edtavHdr28_Title = httpContext.getMessage( "Hdr28", "") ;
      edtavHdr27_Title = httpContext.getMessage( "Hdr27", "") ;
      edtavHdr26_Title = httpContext.getMessage( "Hdr26", "") ;
      edtavHdr25_Title = httpContext.getMessage( "Hdr25", "") ;
      edtavHdr24_Title = httpContext.getMessage( "Hdr24", "") ;
      edtavHdr23_Title = httpContext.getMessage( "Hdr23", "") ;
      edtavHdr22_Title = httpContext.getMessage( "Hdr22", "") ;
      edtavHdr21_Title = httpContext.getMessage( "Hdr21", "") ;
      edtavHdr20_Title = httpContext.getMessage( "Hdr20", "") ;
      edtavHdr19_Title = httpContext.getMessage( "Hdr19", "") ;
      edtavHdr18_Title = httpContext.getMessage( "Hdr18", "") ;
      edtavHdr17_Title = httpContext.getMessage( "Hdr17", "") ;
      edtavHdr16_Title = httpContext.getMessage( "Hdr16", "") ;
      edtavHdr15_Title = httpContext.getMessage( "Hdr15", "") ;
      edtavHdr14_Title = httpContext.getMessage( "Hdr14", "") ;
      edtavHdr13_Title = httpContext.getMessage( "Hdr13", "") ;
      edtavHdr12_Title = httpContext.getMessage( "Hdr12", "") ;
      edtavHdr11_Title = httpContext.getMessage( "Hdr11", "") ;
      edtavHdr10_Title = httpContext.getMessage( "Hdr10", "") ;
      edtavHdr9_Title = httpContext.getMessage( "Hdr9", "") ;
      edtavHdr8_Title = httpContext.getMessage( "Hdr8", "") ;
      edtavHdr7_Title = httpContext.getMessage( "Hdr7", "") ;
      edtavHdr6_Title = httpContext.getMessage( "Hdr6", "") ;
      edtavHdr5_Title = httpContext.getMessage( "Hdr5", "") ;
      edtavHdr4_Title = httpContext.getMessage( "Hdr4", "") ;
      edtavHdr3_Title = httpContext.getMessage( "Hdr3", "") ;
      edtavHdr2_Title = httpContext.getMessage( "Hdr2", "") ;
      edtavHdr1_Title = httpContext.getMessage( "Hdr1", "") ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:Hdr1|2:Hdr2|3:Hdr3|4:Hdr4|5:Hdr5|6:Hdr6|7:Hdr7|8:Hdr8|9:Hdr9|10:Hdr10|11:Hdr11|12:Hdr12|13:Hdr13|14:Hdr14|15:Hdr15|16:Hdr16|17:Hdr17|18:Hdr18|19:Hdr19|20:Hdr20|21:Hdr21|22:Hdr22|23:Hdr23|24:Hdr24|25:Hdr25|26:Hdr26|27:Hdr27|28:Hdr28" ;
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
      Form.setCaption( httpContext.getMessage( "Web Wkp107 Copy1", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_34_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV363GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV363GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV363GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e15AM2',iparms:[{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV97Hdr28',fld:'vHDR28',pic:''},{av:'AV132Linea28',fld:'vLINEA28',pic:''},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'edtavHdr28_Backcolor',ctrl:'vHDR28',prop:'Backcolor'},{av:'edtavHdr28_Forecolor',ctrl:'vHDR28',prop:'Forecolor'},{av:'AV96Hdr27',fld:'vHDR27',pic:''},{av:'AV131Linea27',fld:'vLINEA27',pic:''},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'edtavHdr27_Backcolor',ctrl:'vHDR27',prop:'Backcolor'},{av:'edtavHdr27_Forecolor',ctrl:'vHDR27',prop:'Forecolor'},{av:'AV95Hdr26',fld:'vHDR26',pic:''},{av:'AV130Linea26',fld:'vLINEA26',pic:''},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'edtavHdr26_Backcolor',ctrl:'vHDR26',prop:'Backcolor'},{av:'edtavHdr26_Forecolor',ctrl:'vHDR26',prop:'Forecolor'},{av:'AV94Hdr25',fld:'vHDR25',pic:''},{av:'AV129Linea25',fld:'vLINEA25',pic:''},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'edtavHdr25_Backcolor',ctrl:'vHDR25',prop:'Backcolor'},{av:'edtavHdr25_Forecolor',ctrl:'vHDR25',prop:'Forecolor'},{av:'AV93Hdr24',fld:'vHDR24',pic:''},{av:'AV128Linea24',fld:'vLINEA24',pic:''},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'edtavHdr24_Backcolor',ctrl:'vHDR24',prop:'Backcolor'},{av:'edtavHdr24_Forecolor',ctrl:'vHDR24',prop:'Forecolor'},{av:'AV92Hdr23',fld:'vHDR23',pic:''},{av:'AV127Linea23',fld:'vLINEA23',pic:''},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'edtavHdr23_Backcolor',ctrl:'vHDR23',prop:'Backcolor'},{av:'edtavHdr23_Forecolor',ctrl:'vHDR23',prop:'Forecolor'},{av:'AV91Hdr22',fld:'vHDR22',pic:''},{av:'AV126Linea22',fld:'vLINEA22',pic:''},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'edtavHdr22_Backcolor',ctrl:'vHDR22',prop:'Backcolor'},{av:'edtavHdr22_Forecolor',ctrl:'vHDR22',prop:'Forecolor'},{av:'AV90Hdr21',fld:'vHDR21',pic:''},{av:'AV125Linea21',fld:'vLINEA21',pic:''},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'edtavHdr21_Backcolor',ctrl:'vHDR21',prop:'Backcolor'},{av:'edtavHdr21_Forecolor',ctrl:'vHDR21',prop:'Forecolor'},{av:'AV89Hdr20',fld:'vHDR20',pic:''},{av:'AV124Linea20',fld:'vLINEA20',pic:''},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'edtavHdr20_Backcolor',ctrl:'vHDR20',prop:'Backcolor'},{av:'edtavHdr20_Forecolor',ctrl:'vHDR20',prop:'Forecolor'},{av:'AV87Hdr19',fld:'vHDR19',pic:''},{av:'AV122Linea19',fld:'vLINEA19',pic:''},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'edtavHdr19_Backcolor',ctrl:'vHDR19',prop:'Backcolor'},{av:'edtavHdr19_Forecolor',ctrl:'vHDR19',prop:'Forecolor'},{av:'AV86Hdr18',fld:'vHDR18',pic:''},{av:'AV121Linea18',fld:'vLINEA18',pic:''},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'edtavHdr18_Backcolor',ctrl:'vHDR18',prop:'Backcolor'},{av:'edtavHdr18_Forecolor',ctrl:'vHDR18',prop:'Forecolor'},{av:'AV85Hdr17',fld:'vHDR17',pic:''},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV120Linea17',fld:'vLINEA17',pic:''},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'edtavHdr17_Backcolor',ctrl:'vHDR17',prop:'Backcolor'},{av:'edtavHdr17_Forecolor',ctrl:'vHDR17',prop:'Forecolor'},{av:'AV84Hdr16',fld:'vHDR16',pic:''},{av:'AV119Linea16',fld:'vLINEA16',pic:''},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'edtavHdr16_Backcolor',ctrl:'vHDR16',prop:'Backcolor'},{av:'edtavHdr16_Forecolor',ctrl:'vHDR16',prop:'Forecolor'},{av:'AV83Hdr15',fld:'vHDR15',pic:''},{av:'AV118Linea15',fld:'vLINEA15',pic:''},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'edtavHdr15_Backcolor',ctrl:'vHDR15',prop:'Backcolor'},{av:'edtavHdr15_Forecolor',ctrl:'vHDR15',prop:'Forecolor'},{av:'AV82Hdr14',fld:'vHDR14',pic:''},{av:'AV117Linea14',fld:'vLINEA14',pic:''},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'edtavHdr14_Backcolor',ctrl:'vHDR14',prop:'Backcolor'},{av:'edtavHdr14_Forecolor',ctrl:'vHDR14',prop:'Forecolor'},{av:'AV81Hdr13',fld:'vHDR13',pic:''},{av:'AV116Linea13',fld:'vLINEA13',pic:''},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'edtavHdr13_Backcolor',ctrl:'vHDR13',prop:'Backcolor'},{av:'edtavHdr13_Forecolor',ctrl:'vHDR13',prop:'Forecolor'},{av:'AV80Hdr12',fld:'vHDR12',pic:''},{av:'AV115Linea12',fld:'vLINEA12',pic:''},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'edtavHdr12_Backcolor',ctrl:'vHDR12',prop:'Backcolor'},{av:'edtavHdr12_Forecolor',ctrl:'vHDR12',prop:'Forecolor'},{av:'AV79Hdr11',fld:'vHDR11',pic:''},{av:'AV114Linea11',fld:'vLINEA11',pic:''},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'edtavHdr11_Backcolor',ctrl:'vHDR11',prop:'Backcolor'},{av:'edtavHdr11_Forecolor',ctrl:'vHDR11',prop:'Forecolor'},{av:'AV78Hdr10',fld:'vHDR10',pic:''},{av:'AV113Linea10',fld:'vLINEA10',pic:''},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'edtavHdr10_Backcolor',ctrl:'vHDR10',prop:'Backcolor'},{av:'edtavHdr10_Forecolor',ctrl:'vHDR10',prop:'Forecolor'},{av:'AV104Hdr9',fld:'vHDR9',pic:''},{av:'AV139Linea9',fld:'vLINEA9',pic:''},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'edtavHdr9_Backcolor',ctrl:'vHDR9',prop:'Backcolor'},{av:'edtavHdr9_Forecolor',ctrl:'vHDR9',prop:'Forecolor'},{av:'AV103Hdr8',fld:'vHDR8',pic:''},{av:'AV138LInea8',fld:'vLINEA8',pic:''},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'edtavHdr8_Backcolor',ctrl:'vHDR8',prop:'Backcolor'},{av:'edtavHdr8_Forecolor',ctrl:'vHDR8',prop:'Forecolor'},{av:'AV102Hdr7',fld:'vHDR7',pic:''},{av:'AV137Linea7',fld:'vLINEA7',pic:''},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'edtavHdr7_Backcolor',ctrl:'vHDR7',prop:'Backcolor'},{av:'edtavHdr7_Forecolor',ctrl:'vHDR7',prop:'Forecolor'},{av:'AV101Hdr6',fld:'vHDR6',pic:''},{av:'AV136Linea6',fld:'vLINEA6',pic:''},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'edtavHdr6_Backcolor',ctrl:'vHDR6',prop:'Backcolor'},{av:'edtavHdr6_Forecolor',ctrl:'vHDR6',prop:'Forecolor'},{av:'AV100Hdr5',fld:'vHDR5',pic:''},{av:'AV135Linea5',fld:'vLINEA5',pic:''},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'edtavHdr5_Backcolor',ctrl:'vHDR5',prop:'Backcolor'},{av:'edtavHdr5_Forecolor',ctrl:'vHDR5',prop:'Forecolor'},{av:'AV99Hdr4',fld:'vHDR4',pic:''},{av:'AV134Linea4',fld:'vLINEA4',pic:''},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'edtavHdr4_Backcolor',ctrl:'vHDR4',prop:'Backcolor'},{av:'edtavHdr4_Forecolor',ctrl:'vHDR4',prop:'Forecolor'},{av:'AV98Hdr3',fld:'vHDR3',pic:''},{av:'AV133Linea3',fld:'vLINEA3',pic:''},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'edtavHdr3_Backcolor',ctrl:'vHDR3',prop:'Backcolor'},{av:'edtavHdr3_Forecolor',ctrl:'vHDR3',prop:'Forecolor'},{av:'AV123Linea2',fld:'vLINEA2',pic:''},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'edtavHdr2_Backcolor',ctrl:'vHDR2',prop:'Backcolor'},{av:'AV77Hdr1',fld:'vHDR1',pic:''},{av:'AV112Linea1',fld:'vLINEA1',pic:''},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'edtavHdr1_Backcolor',ctrl:'vHDR1',prop:'Backcolor'},{av:'edtavHdr1_Forecolor',ctrl:'vHDR1',prop:'Forecolor'},{av:'cmbavGridactions'},{av:'AV363GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e12AM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11AM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e16AM2',iparms:[{av:'cmbavGridactions'},{av:'AV363GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV363GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV296R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV366Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV362FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV335Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV333t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV360ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV355ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavHdr1_Visible',ctrl:'vHDR1',prop:'Visible'},{av:'edtavHdr2_Visible',ctrl:'vHDR2',prop:'Visible'},{av:'edtavHdr3_Visible',ctrl:'vHDR3',prop:'Visible'},{av:'edtavHdr4_Visible',ctrl:'vHDR4',prop:'Visible'},{av:'edtavHdr5_Visible',ctrl:'vHDR5',prop:'Visible'},{av:'edtavHdr6_Visible',ctrl:'vHDR6',prop:'Visible'},{av:'edtavHdr7_Visible',ctrl:'vHDR7',prop:'Visible'},{av:'edtavHdr8_Visible',ctrl:'vHDR8',prop:'Visible'},{av:'edtavHdr9_Visible',ctrl:'vHDR9',prop:'Visible'},{av:'edtavHdr10_Visible',ctrl:'vHDR10',prop:'Visible'},{av:'edtavHdr11_Visible',ctrl:'vHDR11',prop:'Visible'},{av:'edtavHdr12_Visible',ctrl:'vHDR12',prop:'Visible'},{av:'edtavHdr13_Visible',ctrl:'vHDR13',prop:'Visible'},{av:'edtavHdr14_Visible',ctrl:'vHDR14',prop:'Visible'},{av:'edtavHdr15_Visible',ctrl:'vHDR15',prop:'Visible'},{av:'edtavHdr16_Visible',ctrl:'vHDR16',prop:'Visible'},{av:'edtavHdr17_Visible',ctrl:'vHDR17',prop:'Visible'},{av:'edtavHdr18_Visible',ctrl:'vHDR18',prop:'Visible'},{av:'edtavHdr19_Visible',ctrl:'vHDR19',prop:'Visible'},{av:'edtavHdr20_Visible',ctrl:'vHDR20',prop:'Visible'},{av:'edtavHdr21_Visible',ctrl:'vHDR21',prop:'Visible'},{av:'edtavHdr22_Visible',ctrl:'vHDR22',prop:'Visible'},{av:'edtavHdr23_Visible',ctrl:'vHDR23',prop:'Visible'},{av:'edtavHdr24_Visible',ctrl:'vHDR24',prop:'Visible'},{av:'edtavHdr25_Visible',ctrl:'vHDR25',prop:'Visible'},{av:'edtavHdr26_Visible',ctrl:'vHDR26',prop:'Visible'},{av:'edtavHdr27_Visible',ctrl:'vHDR27',prop:'Visible'},{av:'edtavHdr28_Visible',ctrl:'vHDR28',prop:'Visible'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV358ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV351GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Maqcod9',iparms:[]");
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
      AV5Archivo = new com.genexus.util.GXFile();
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV62EmprCod = "" ;
      AV70FecInicio = GXutil.nullDate() ;
      AV69FechaFin = GXutil.nullDate() ;
      AV165Maqcod1 = "" ;
      AV166MaqCod10 = "" ;
      AV167Maqcod11 = "" ;
      AV168MaqCod12 = "" ;
      AV169Maqcod13 = "" ;
      AV170Maqcod14 = "" ;
      AV171Maqcod15 = "" ;
      AV172Maqcod16 = "" ;
      AV173Maqcod17 = "" ;
      AV174Maqcod18 = "" ;
      AV175Maqcod19 = "" ;
      AV176Maqcod2 = "" ;
      AV177Maqcod20 = "" ;
      AV178Maqcod21 = "" ;
      AV179Maqcod22 = "" ;
      AV180Maqcod23 = "" ;
      AV181Maqcod24 = "" ;
      AV182Maqcod25 = "" ;
      AV183Maqcod26 = "" ;
      AV184Maqcod27 = "" ;
      AV185Maqcod28 = "" ;
      AV186Maqcod3 = "" ;
      AV187Maqcod4 = "" ;
      AV188Maqcod5 = "" ;
      AV189Maqcod6 = "" ;
      AV190Maqcod7 = "" ;
      AV191Maqcod8 = "" ;
      AV192Maqcod9 = "" ;
      AV225Maqdsc1 = "" ;
      AV226Maqdsc10 = "" ;
      AV227Maqdsc11 = "" ;
      AV228Maqdsc12 = "" ;
      AV229Maqdsc13 = "" ;
      AV230Maqdsc14 = "" ;
      AV231Maqdsc15 = "" ;
      AV232MaqDsc16 = "" ;
      AV233MaqDsc17 = "" ;
      AV234MaqDsc18 = "" ;
      AV235MaqDsc19 = "" ;
      AV236Maqdsc2 = "" ;
      AV237MaqDsc20 = "" ;
      AV238MaqDsc21 = "" ;
      AV239MaqDsc22 = "" ;
      AV240MaqDsc23 = "" ;
      AV241MaqDsc24 = "" ;
      AV242MaqDsc25 = "" ;
      AV243MaqDsc26 = "" ;
      AV244MaqDsc27 = "" ;
      AV245MaqDsc28 = "" ;
      AV246Maqdsc3 = "" ;
      AV247Maqdsc4 = "" ;
      AV248Maqdsc5 = "" ;
      AV249Maqdsc6 = "" ;
      AV250Maqdsc7 = "" ;
      AV251Maqdsc8 = "" ;
      AV252Maqdsc9 = "" ;
      AV355ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV164Maqcod = "" ;
      AV366Pgmname = "" ;
      AV362FilterFullText = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV14Barcodpar = "" ;
      A150BarFacTin = "" ;
      AV88Hdr2 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV358ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV361DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV335Tab_maq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV335Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV253MaqHdrs = new String[100][1000] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV253MaqHdrs[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV351GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
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
      AV77Hdr1 = "" ;
      AV98Hdr3 = "" ;
      AV99Hdr4 = "" ;
      AV100Hdr5 = "" ;
      AV101Hdr6 = "" ;
      AV102Hdr7 = "" ;
      AV103Hdr8 = "" ;
      AV104Hdr9 = "" ;
      AV78Hdr10 = "" ;
      AV79Hdr11 = "" ;
      AV80Hdr12 = "" ;
      AV81Hdr13 = "" ;
      AV82Hdr14 = "" ;
      AV83Hdr15 = "" ;
      AV84Hdr16 = "" ;
      AV85Hdr17 = "" ;
      AV86Hdr18 = "" ;
      AV87Hdr19 = "" ;
      AV89Hdr20 = "" ;
      AV90Hdr21 = "" ;
      AV91Hdr22 = "" ;
      AV92Hdr23 = "" ;
      AV93Hdr24 = "" ;
      AV94Hdr25 = "" ;
      AV95Hdr26 = "" ;
      AV96Hdr27 = "" ;
      AV97Hdr28 = "" ;
      AV112Linea1 = "" ;
      AV113Linea10 = "" ;
      AV114Linea11 = "" ;
      AV115Linea12 = "" ;
      AV116Linea13 = "" ;
      AV117Linea14 = "" ;
      AV118Linea15 = "" ;
      AV119Linea16 = "" ;
      AV120Linea17 = "" ;
      AV121Linea18 = "" ;
      AV122Linea19 = "" ;
      AV123Linea2 = "" ;
      AV124Linea20 = "" ;
      AV125Linea21 = "" ;
      AV126Linea22 = "" ;
      AV127Linea23 = "" ;
      AV128Linea24 = "" ;
      AV129Linea25 = "" ;
      AV130Linea26 = "" ;
      AV131Linea27 = "" ;
      AV132Linea28 = "" ;
      AV133Linea3 = "" ;
      AV134Linea4 = "" ;
      AV135Linea5 = "" ;
      AV136Linea6 = "" ;
      AV137Linea7 = "" ;
      AV138LInea8 = "" ;
      AV139Linea9 = "" ;
      AV332Station = "" ;
      AV63EmprNom = "" ;
      AV344UsurCod = "" ;
      AV49Carpeta = "" ;
      AV260NomInf = "" ;
      AV348HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char25 = new String[1] ;
      GXv_char26 = new String[1] ;
      GXv_char27 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_char29 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_char31 = new String[1] ;
      GXv_char32 = new String[1] ;
      GXv_char33 = new String[1] ;
      GXv_char34 = new String[1] ;
      GXv_char35 = new String[1] ;
      GXv_char36 = new String[1] ;
      GXv_char37 = new String[1] ;
      GXv_char38 = new String[1] ;
      GXv_char39 = new String[1] ;
      GXv_char40 = new String[1] ;
      GXv_char41 = new String[1] ;
      GXv_char42 = new String[1] ;
      GXv_char43 = new String[1] ;
      GXv_char44 = new String[1] ;
      GXv_char45 = new String[1] ;
      GXv_char46 = new String[1] ;
      GXv_char47 = new String[1] ;
      GXv_char48 = new String[1] ;
      GXv_char49 = new String[1] ;
      GXv_char50 = new String[1] ;
      GXv_char51 = new String[1] ;
      GXv_char52 = new String[1] ;
      GXv_char53 = new String[1] ;
      GXv_char54 = new String[1] ;
      GXv_char55 = new String[1] ;
      GXv_char56 = new String[1] ;
      AV347WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext64 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV357Session = httpContext.getWebSession();
      AV353ColumnsSelectorXML = "" ;
      AV266Partidas = DecimalUtil.ZERO ;
      AV338Texto = "" ;
      AV76Hdr = "" ;
      AV64EstadoFasegrid = "" ;
      GXv_int65 = new long[1] ;
      AV256Min = DecimalUtil.ZERO ;
      AV255Max = DecimalUtil.ZERO ;
      AV111L = DecimalUtil.ZERO ;
      AV48Cant = "" ;
      AV196MaqCodRc1 = "" ;
      AV207MaqCodRc2 = "" ;
      AV217MaqCodRc3 = "" ;
      AV218MaqCodRc4 = "" ;
      AV219MaqCodRc5 = "" ;
      AV220MaqCodRc6 = "" ;
      AV221MaqCodRc7 = "" ;
      AV222MaqCodRc8 = "" ;
      AV223MaqCodRc9 = "" ;
      AV197MaqCodRc10 = "" ;
      AV198MaqCodRc11 = "" ;
      AV199MaqCodRc12 = "" ;
      AV200MaqCodRc13 = "" ;
      AV201MaqCodRc14 = "" ;
      AV203MaqCodRc16 = "" ;
      AV204MaqCodRc17 = "" ;
      AV205MaqCodRc18 = "" ;
      AV206MaqCodRc19 = "" ;
      AV208MaqCodRc20 = "" ;
      AV209MaqCodRc21 = "" ;
      AV210MaqCodRc22 = "" ;
      AV211MaqCodRc23 = "" ;
      AV212MaqCodRc24 = "" ;
      AV213MaqCodRc25 = "" ;
      AV214MaqCodRc26 = "" ;
      AV215MaqCodRc27 = "" ;
      AV216MaqCodRc28 = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV359ManageFiltersXml = "" ;
      AV354UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV356ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector70 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector71 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item72 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item73 = new GXBaseCollection[1] ;
      AV352GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState74 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV339Texto_l = "" ;
      GXv_int67 = new short[1] ;
      GXv_int68 = new byte[1] ;
      GXv_char59 = new String[1] ;
      GXv_int66 = new short[1] ;
      GXv_char58 = new String[1] ;
      GXv_char57 = new String[1] ;
      GXv_int63 = new short[1] ;
      GXv_char62 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int75 = new byte[1] ;
      GXv_char61 = new String[1] ;
      GXv_int69 = new byte[1] ;
      AV68fecha = GXutil.nullDate() ;
      GXv_date76 = new java.util.Date[1] ;
      AV193MaqCodBis = "" ;
      GXv_char60 = new String[1] ;
      AV340Texto1 = "" ;
      scmdbuf = "" ;
      H00AM2_A758ProCod = new String[] {""} ;
      H00AM2_A153BarFasEst = new byte[1] ;
      H00AM2_A150BarFacTin = new String[] {""} ;
      H00AM2_A130BarCodPar = new String[] {""} ;
      H00AM2_A132BarCodReo = new byte[1] ;
      H00AM2_A129BarCod = new int[1] ;
      H00AM2_A396EmprCod = new String[] {""} ;
      H00AM2_A194BarOrdLin = new short[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwkp107copy1__default(),
         new Object[] {
             new Object[] {
            H00AM2_A758ProCod, H00AM2_A153BarFasEst, H00AM2_A150BarFacTin, H00AM2_A130BarCodPar, H00AM2_A132BarCodReo, H00AM2_A129BarCod, H00AM2_A396EmprCod, H00AM2_A194BarOrdLin
            }
         }
      );
      AV366Pgmname = "WebWkp107Copy1" ;
      /* GeneXus formulas. */
      AV366Pgmname = "WebWkp107Copy1" ;
      Gx_err = (short)(0) ;
      edtavHdr1_Enabled = 0 ;
      edtavHdr2_Enabled = 0 ;
      edtavHdr3_Enabled = 0 ;
      edtavHdr4_Enabled = 0 ;
      edtavHdr5_Enabled = 0 ;
      edtavHdr6_Enabled = 0 ;
      edtavHdr7_Enabled = 0 ;
      edtavHdr8_Enabled = 0 ;
      edtavHdr9_Enabled = 0 ;
      edtavHdr10_Enabled = 0 ;
      edtavHdr11_Enabled = 0 ;
      edtavHdr12_Enabled = 0 ;
      edtavHdr13_Enabled = 0 ;
      edtavHdr14_Enabled = 0 ;
      edtavHdr15_Enabled = 0 ;
      edtavHdr16_Enabled = 0 ;
      edtavHdr17_Enabled = 0 ;
      edtavHdr18_Enabled = 0 ;
      edtavHdr19_Enabled = 0 ;
      edtavHdr20_Enabled = 0 ;
      edtavHdr21_Enabled = 0 ;
      edtavHdr22_Enabled = 0 ;
      edtavHdr23_Enabled = 0 ;
      edtavHdr24_Enabled = 0 ;
      edtavHdr25_Enabled = 0 ;
      edtavHdr26_Enabled = 0 ;
      edtavHdr27_Enabled = 0 ;
      edtavHdr28_Enabled = 0 ;
      edtavLinea1_Enabled = 0 ;
      edtavLinea10_Enabled = 0 ;
      edtavLinea11_Enabled = 0 ;
      edtavLinea12_Enabled = 0 ;
      edtavLinea13_Enabled = 0 ;
      edtavLinea14_Enabled = 0 ;
      edtavLinea15_Enabled = 0 ;
      edtavLinea16_Enabled = 0 ;
      edtavLinea17_Enabled = 0 ;
      edtavLinea18_Enabled = 0 ;
      edtavLinea19_Enabled = 0 ;
      edtavLinea2_Enabled = 0 ;
      edtavLinea20_Enabled = 0 ;
      edtavLinea21_Enabled = 0 ;
      edtavLinea22_Enabled = 0 ;
      edtavLinea23_Enabled = 0 ;
      edtavLinea24_Enabled = 0 ;
      edtavLinea25_Enabled = 0 ;
      edtavLinea26_Enabled = 0 ;
      edtavLinea27_Enabled = 0 ;
      edtavLinea28_Enabled = 0 ;
      edtavLinea3_Enabled = 0 ;
      edtavLinea4_Enabled = 0 ;
      edtavLinea5_Enabled = 0 ;
      edtavLinea6_Enabled = 0 ;
      edtavLinea7_Enabled = 0 ;
      edtavLinea8_Enabled = 0 ;
      edtavLinea9_Enabled = 0 ;
      edtavMaqcod1_Enabled = 0 ;
      edtavMaqcod10_Enabled = 0 ;
      edtavMaqcod11_Enabled = 0 ;
      edtavMaqcod12_Enabled = 0 ;
      edtavMaqcod13_Enabled = 0 ;
      edtavMaqcod14_Enabled = 0 ;
      edtavMaqcod15_Enabled = 0 ;
      edtavMaqcod16_Enabled = 0 ;
      edtavMaqcod17_Enabled = 0 ;
      edtavMaqcod18_Enabled = 0 ;
      edtavMaqcod19_Enabled = 0 ;
      edtavMaqcod2_Enabled = 0 ;
      edtavMaqcod20_Enabled = 0 ;
      edtavMaqcod21_Enabled = 0 ;
      edtavMaqcod22_Enabled = 0 ;
      edtavMaqcod23_Enabled = 0 ;
      edtavMaqcod24_Enabled = 0 ;
      edtavMaqcod25_Enabled = 0 ;
      edtavMaqcod26_Enabled = 0 ;
      edtavMaqcod27_Enabled = 0 ;
      edtavMaqcod28_Enabled = 0 ;
      edtavMaqcod3_Enabled = 0 ;
      edtavMaqcod4_Enabled = 0 ;
      edtavMaqcod5_Enabled = 0 ;
      edtavMaqcod6_Enabled = 0 ;
      edtavMaqcod7_Enabled = 0 ;
      edtavMaqcod8_Enabled = 0 ;
      edtavMaqcod9_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV360ManageFiltersExecutionStep ;
   private byte AV30Barfasestant ;
   private byte A132BarCodReo ;
   private byte AV18Barcodreo ;
   private byte A153BarFasEst ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV32BarFasestGrid1 ;
   private byte GXv_int68[] ;
   private byte GXv_int75[] ;
   private byte AV28BarFasEst ;
   private byte GXv_int69[] ;
   private byte AV65EstadoFaseHdr ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV333t ;
   private short AV41Barordlin ;
   private short A194BarOrdLin ;
   private short AV8B2 ;
   private short AV75G2 ;
   private short AV296R2 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV363GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV59dias ;
   private short AV108i ;
   private short AV261NospMaq ;
   private short AV110k ;
   private short AV109j ;
   private short AV295R ;
   private short AV74G ;
   private short AV7B ;
   private short GXv_int67[] ;
   private short GXv_int66[] ;
   private short GXv_int63[] ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_34 ;
   private int nGXsfl_34_idx=1 ;
   private int A129BarCod ;
   private int AV10Barcod ;
   private int subGrid_Islastpage ;
   private int edtavHdr1_Enabled ;
   private int edtavHdr2_Enabled ;
   private int edtavHdr3_Enabled ;
   private int edtavHdr4_Enabled ;
   private int edtavHdr5_Enabled ;
   private int edtavHdr6_Enabled ;
   private int edtavHdr7_Enabled ;
   private int edtavHdr8_Enabled ;
   private int edtavHdr9_Enabled ;
   private int edtavHdr10_Enabled ;
   private int edtavHdr11_Enabled ;
   private int edtavHdr12_Enabled ;
   private int edtavHdr13_Enabled ;
   private int edtavHdr14_Enabled ;
   private int edtavHdr15_Enabled ;
   private int edtavHdr16_Enabled ;
   private int edtavHdr17_Enabled ;
   private int edtavHdr18_Enabled ;
   private int edtavHdr19_Enabled ;
   private int edtavHdr20_Enabled ;
   private int edtavHdr21_Enabled ;
   private int edtavHdr22_Enabled ;
   private int edtavHdr23_Enabled ;
   private int edtavHdr24_Enabled ;
   private int edtavHdr25_Enabled ;
   private int edtavHdr26_Enabled ;
   private int edtavHdr27_Enabled ;
   private int edtavHdr28_Enabled ;
   private int edtavLinea1_Enabled ;
   private int edtavLinea10_Enabled ;
   private int edtavLinea11_Enabled ;
   private int edtavLinea12_Enabled ;
   private int edtavLinea13_Enabled ;
   private int edtavLinea14_Enabled ;
   private int edtavLinea15_Enabled ;
   private int edtavLinea16_Enabled ;
   private int edtavLinea17_Enabled ;
   private int edtavLinea18_Enabled ;
   private int edtavLinea19_Enabled ;
   private int edtavLinea2_Enabled ;
   private int edtavLinea20_Enabled ;
   private int edtavLinea21_Enabled ;
   private int edtavLinea22_Enabled ;
   private int edtavLinea23_Enabled ;
   private int edtavLinea24_Enabled ;
   private int edtavLinea25_Enabled ;
   private int edtavLinea26_Enabled ;
   private int edtavLinea27_Enabled ;
   private int edtavLinea28_Enabled ;
   private int edtavLinea3_Enabled ;
   private int edtavLinea4_Enabled ;
   private int edtavLinea5_Enabled ;
   private int edtavLinea6_Enabled ;
   private int edtavLinea7_Enabled ;
   private int edtavLinea8_Enabled ;
   private int edtavLinea9_Enabled ;
   private int edtavMaqcod1_Enabled ;
   private int edtavMaqcod10_Enabled ;
   private int edtavMaqcod11_Enabled ;
   private int edtavMaqcod12_Enabled ;
   private int edtavMaqcod13_Enabled ;
   private int edtavMaqcod14_Enabled ;
   private int edtavMaqcod15_Enabled ;
   private int edtavMaqcod16_Enabled ;
   private int edtavMaqcod17_Enabled ;
   private int edtavMaqcod18_Enabled ;
   private int edtavMaqcod19_Enabled ;
   private int edtavMaqcod2_Enabled ;
   private int edtavMaqcod20_Enabled ;
   private int edtavMaqcod21_Enabled ;
   private int edtavMaqcod22_Enabled ;
   private int edtavMaqcod23_Enabled ;
   private int edtavMaqcod24_Enabled ;
   private int edtavMaqcod25_Enabled ;
   private int edtavMaqcod26_Enabled ;
   private int edtavMaqcod27_Enabled ;
   private int edtavMaqcod28_Enabled ;
   private int edtavMaqcod3_Enabled ;
   private int edtavMaqcod4_Enabled ;
   private int edtavMaqcod5_Enabled ;
   private int edtavMaqcod6_Enabled ;
   private int edtavMaqcod7_Enabled ;
   private int edtavMaqcod8_Enabled ;
   private int edtavMaqcod9_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int GXt_int5 ;
   private int edtavHdr1_Visible ;
   private int edtavHdr2_Visible ;
   private int edtavHdr3_Visible ;
   private int edtavHdr4_Visible ;
   private int edtavHdr5_Visible ;
   private int edtavHdr6_Visible ;
   private int edtavHdr7_Visible ;
   private int edtavHdr8_Visible ;
   private int edtavHdr9_Visible ;
   private int edtavHdr10_Visible ;
   private int edtavHdr11_Visible ;
   private int edtavHdr12_Visible ;
   private int edtavHdr13_Visible ;
   private int edtavHdr14_Visible ;
   private int edtavHdr15_Visible ;
   private int edtavHdr16_Visible ;
   private int edtavHdr17_Visible ;
   private int edtavHdr18_Visible ;
   private int edtavHdr19_Visible ;
   private int edtavHdr20_Visible ;
   private int edtavHdr21_Visible ;
   private int edtavHdr22_Visible ;
   private int edtavHdr23_Visible ;
   private int edtavHdr24_Visible ;
   private int edtavHdr25_Visible ;
   private int edtavHdr26_Visible ;
   private int edtavHdr27_Visible ;
   private int edtavHdr28_Visible ;
   private int edtavHdr1_Backcolor ;
   private int edtavHdr1_Forecolor ;
   private int edtavHdr2_Backcolor ;
   private int edtavHdr3_Forecolor ;
   private int edtavHdr3_Backcolor ;
   private int edtavHdr4_Backcolor ;
   private int edtavHdr4_Forecolor ;
   private int edtavHdr5_Backcolor ;
   private int edtavHdr5_Forecolor ;
   private int edtavHdr6_Backcolor ;
   private int edtavHdr6_Forecolor ;
   private int edtavHdr7_Backcolor ;
   private int edtavHdr7_Forecolor ;
   private int edtavHdr8_Backcolor ;
   private int edtavHdr8_Forecolor ;
   private int edtavHdr9_Backcolor ;
   private int edtavHdr9_Forecolor ;
   private int edtavHdr10_Backcolor ;
   private int edtavHdr10_Forecolor ;
   private int edtavHdr11_Backcolor ;
   private int edtavHdr11_Forecolor ;
   private int edtavHdr12_Backcolor ;
   private int edtavHdr12_Forecolor ;
   private int edtavHdr13_Backcolor ;
   private int edtavHdr13_Forecolor ;
   private int edtavHdr14_Backcolor ;
   private int edtavHdr14_Forecolor ;
   private int edtavHdr15_Backcolor ;
   private int edtavHdr15_Forecolor ;
   private int edtavHdr16_Backcolor ;
   private int edtavHdr16_Forecolor ;
   private int edtavHdr17_Backcolor ;
   private int edtavHdr17_Forecolor ;
   private int edtavHdr18_Backcolor ;
   private int edtavHdr18_Forecolor ;
   private int edtavHdr19_Backcolor ;
   private int edtavHdr19_Forecolor ;
   private int edtavHdr20_Backcolor ;
   private int edtavHdr20_Forecolor ;
   private int edtavHdr21_Backcolor ;
   private int edtavHdr21_Forecolor ;
   private int edtavHdr22_Backcolor ;
   private int edtavHdr22_Forecolor ;
   private int edtavHdr23_Backcolor ;
   private int edtavHdr23_Forecolor ;
   private int edtavHdr24_Backcolor ;
   private int edtavHdr24_Forecolor ;
   private int edtavHdr25_Backcolor ;
   private int edtavHdr25_Forecolor ;
   private int edtavHdr26_Backcolor ;
   private int edtavHdr26_Forecolor ;
   private int edtavHdr27_Backcolor ;
   private int edtavHdr27_Forecolor ;
   private int edtavHdr28_Backcolor ;
   private int edtavHdr28_Forecolor ;
   private int AV367GXV1 ;
   private int tblTablerightheader_Visible ;
   private int GXv_int6[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavLinea1_Visible ;
   private int edtavLinea10_Visible ;
   private int edtavLinea11_Visible ;
   private int edtavLinea12_Visible ;
   private int edtavLinea13_Visible ;
   private int edtavLinea14_Visible ;
   private int edtavLinea15_Visible ;
   private int edtavLinea16_Visible ;
   private int edtavLinea17_Visible ;
   private int edtavLinea18_Visible ;
   private int edtavLinea19_Visible ;
   private int edtavLinea2_Visible ;
   private int edtavLinea20_Visible ;
   private int edtavLinea21_Visible ;
   private int edtavLinea22_Visible ;
   private int edtavLinea23_Visible ;
   private int edtavLinea24_Visible ;
   private int edtavLinea25_Visible ;
   private int edtavLinea26_Visible ;
   private int edtavLinea27_Visible ;
   private int edtavLinea28_Visible ;
   private int edtavLinea3_Visible ;
   private int edtavLinea4_Visible ;
   private int edtavLinea5_Visible ;
   private int edtavLinea6_Visible ;
   private int edtavLinea7_Visible ;
   private int edtavLinea8_Visible ;
   private int edtavLinea9_Visible ;
   private int edtavMaqcod1_Visible ;
   private int edtavMaqcod10_Visible ;
   private int edtavMaqcod11_Visible ;
   private int edtavMaqcod12_Visible ;
   private int edtavMaqcod13_Visible ;
   private int edtavMaqcod14_Visible ;
   private int edtavMaqcod15_Visible ;
   private int edtavMaqcod16_Visible ;
   private int edtavMaqcod17_Visible ;
   private int edtavMaqcod18_Visible ;
   private int edtavMaqcod19_Visible ;
   private int edtavMaqcod2_Visible ;
   private int edtavMaqcod20_Visible ;
   private int edtavMaqcod21_Visible ;
   private int edtavMaqcod22_Visible ;
   private int edtavMaqcod23_Visible ;
   private int edtavMaqcod24_Visible ;
   private int edtavMaqcod25_Visible ;
   private int edtavMaqcod26_Visible ;
   private int edtavMaqcod27_Visible ;
   private int edtavMaqcod28_Visible ;
   private int edtavMaqcod3_Visible ;
   private int edtavMaqcod4_Visible ;
   private int edtavMaqcod5_Visible ;
   private int edtavMaqcod6_Visible ;
   private int edtavMaqcod7_Visible ;
   private int edtavMaqcod8_Visible ;
   private int edtavMaqcod9_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GX_I ;
   private int GX_J ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long AV299Rgb ;
   private long GXv_int65[] ;
   private long AV300Rgb1 ;
   private long AV311Rgb2 ;
   private long AV321Rgb3 ;
   private long AV322Rgb4 ;
   private long AV323Rgb5 ;
   private long AV324Rgb6 ;
   private long AV325Rgb7 ;
   private long AV326Rgb8 ;
   private long AV327Rgb9 ;
   private long AV301Rgb10 ;
   private long AV302Rgb11 ;
   private long AV303Rgb12 ;
   private long AV304Rgb13 ;
   private long AV305Rgb14 ;
   private long AV306Rgb15 ;
   private long AV307Rgb16 ;
   private long AV308Rgb17 ;
   private long AV309Rgb18 ;
   private long AV310Rgb19 ;
   private long AV312Rgb20 ;
   private long AV313Rgb21 ;
   private long AV314Rgb22 ;
   private long AV315Rgb23 ;
   private long AV316Rgb24 ;
   private long AV317Rgb25 ;
   private long AV318Rgb26 ;
   private long AV319Rgb27 ;
   private long AV320Rgb28 ;
   private java.math.BigDecimal AV266Partidas ;
   private java.math.BigDecimal AV256Min ;
   private java.math.BigDecimal AV255Max ;
   private java.math.BigDecimal AV111L ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_34_idx="0001" ;
   private String AV62EmprCod ;
   private String AV165Maqcod1 ;
   private String AV166MaqCod10 ;
   private String AV167Maqcod11 ;
   private String AV168MaqCod12 ;
   private String AV169Maqcod13 ;
   private String AV170Maqcod14 ;
   private String AV171Maqcod15 ;
   private String AV172Maqcod16 ;
   private String AV173Maqcod17 ;
   private String AV174Maqcod18 ;
   private String AV175Maqcod19 ;
   private String AV176Maqcod2 ;
   private String AV177Maqcod20 ;
   private String AV178Maqcod21 ;
   private String AV179Maqcod22 ;
   private String AV180Maqcod23 ;
   private String AV181Maqcod24 ;
   private String AV182Maqcod25 ;
   private String AV183Maqcod26 ;
   private String AV184Maqcod27 ;
   private String AV185Maqcod28 ;
   private String AV186Maqcod3 ;
   private String AV187Maqcod4 ;
   private String AV188Maqcod5 ;
   private String AV189Maqcod6 ;
   private String AV190Maqcod7 ;
   private String AV191Maqcod8 ;
   private String AV192Maqcod9 ;
   private String AV225Maqdsc1 ;
   private String AV226Maqdsc10 ;
   private String AV227Maqdsc11 ;
   private String AV228Maqdsc12 ;
   private String AV229Maqdsc13 ;
   private String AV230Maqdsc14 ;
   private String AV231Maqdsc15 ;
   private String AV232MaqDsc16 ;
   private String AV233MaqDsc17 ;
   private String AV234MaqDsc18 ;
   private String AV235MaqDsc19 ;
   private String AV236Maqdsc2 ;
   private String AV237MaqDsc20 ;
   private String AV238MaqDsc21 ;
   private String AV239MaqDsc22 ;
   private String AV240MaqDsc23 ;
   private String AV241MaqDsc24 ;
   private String AV242MaqDsc25 ;
   private String AV243MaqDsc26 ;
   private String AV244MaqDsc27 ;
   private String AV245MaqDsc28 ;
   private String AV246Maqdsc3 ;
   private String AV247Maqdsc4 ;
   private String AV248Maqdsc5 ;
   private String AV249Maqdsc6 ;
   private String AV250Maqdsc7 ;
   private String AV251Maqdsc8 ;
   private String AV252Maqdsc9 ;
   private String AV164Maqcod ;
   private String AV366Pgmname ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14Barcodpar ;
   private String A150BarFacTin ;
   private String AV88Hdr2 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV335Tab_maq[] ;
   private String AV253MaqHdrs[][] ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
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
   private String AV77Hdr1 ;
   private String edtavHdr1_Internalname ;
   private String edtavHdr2_Internalname ;
   private String AV98Hdr3 ;
   private String edtavHdr3_Internalname ;
   private String AV99Hdr4 ;
   private String edtavHdr4_Internalname ;
   private String AV100Hdr5 ;
   private String edtavHdr5_Internalname ;
   private String AV101Hdr6 ;
   private String edtavHdr6_Internalname ;
   private String AV102Hdr7 ;
   private String edtavHdr7_Internalname ;
   private String AV103Hdr8 ;
   private String edtavHdr8_Internalname ;
   private String AV104Hdr9 ;
   private String edtavHdr9_Internalname ;
   private String AV78Hdr10 ;
   private String edtavHdr10_Internalname ;
   private String AV79Hdr11 ;
   private String edtavHdr11_Internalname ;
   private String AV80Hdr12 ;
   private String edtavHdr12_Internalname ;
   private String AV81Hdr13 ;
   private String edtavHdr13_Internalname ;
   private String AV82Hdr14 ;
   private String edtavHdr14_Internalname ;
   private String AV83Hdr15 ;
   private String edtavHdr15_Internalname ;
   private String AV84Hdr16 ;
   private String edtavHdr16_Internalname ;
   private String AV85Hdr17 ;
   private String edtavHdr17_Internalname ;
   private String AV86Hdr18 ;
   private String edtavHdr18_Internalname ;
   private String AV87Hdr19 ;
   private String edtavHdr19_Internalname ;
   private String AV89Hdr20 ;
   private String edtavHdr20_Internalname ;
   private String AV90Hdr21 ;
   private String edtavHdr21_Internalname ;
   private String AV91Hdr22 ;
   private String edtavHdr22_Internalname ;
   private String AV92Hdr23 ;
   private String edtavHdr23_Internalname ;
   private String AV93Hdr24 ;
   private String edtavHdr24_Internalname ;
   private String AV94Hdr25 ;
   private String edtavHdr25_Internalname ;
   private String AV95Hdr26 ;
   private String edtavHdr26_Internalname ;
   private String AV96Hdr27 ;
   private String edtavHdr27_Internalname ;
   private String AV97Hdr28 ;
   private String edtavHdr28_Internalname ;
   private String AV112Linea1 ;
   private String edtavLinea1_Internalname ;
   private String AV113Linea10 ;
   private String edtavLinea10_Internalname ;
   private String AV114Linea11 ;
   private String edtavLinea11_Internalname ;
   private String AV115Linea12 ;
   private String edtavLinea12_Internalname ;
   private String AV116Linea13 ;
   private String edtavLinea13_Internalname ;
   private String AV117Linea14 ;
   private String edtavLinea14_Internalname ;
   private String AV118Linea15 ;
   private String edtavLinea15_Internalname ;
   private String AV119Linea16 ;
   private String edtavLinea16_Internalname ;
   private String AV120Linea17 ;
   private String edtavLinea17_Internalname ;
   private String AV121Linea18 ;
   private String edtavLinea18_Internalname ;
   private String AV122Linea19 ;
   private String edtavLinea19_Internalname ;
   private String AV123Linea2 ;
   private String edtavLinea2_Internalname ;
   private String AV124Linea20 ;
   private String edtavLinea20_Internalname ;
   private String AV125Linea21 ;
   private String edtavLinea21_Internalname ;
   private String AV126Linea22 ;
   private String edtavLinea22_Internalname ;
   private String AV127Linea23 ;
   private String edtavLinea23_Internalname ;
   private String AV128Linea24 ;
   private String edtavLinea24_Internalname ;
   private String AV129Linea25 ;
   private String edtavLinea25_Internalname ;
   private String AV130Linea26 ;
   private String edtavLinea26_Internalname ;
   private String AV131Linea27 ;
   private String edtavLinea27_Internalname ;
   private String AV132Linea28 ;
   private String edtavLinea28_Internalname ;
   private String AV133Linea3 ;
   private String edtavLinea3_Internalname ;
   private String AV134Linea4 ;
   private String edtavLinea4_Internalname ;
   private String AV135Linea5 ;
   private String edtavLinea5_Internalname ;
   private String AV136Linea6 ;
   private String edtavLinea6_Internalname ;
   private String AV137Linea7 ;
   private String edtavLinea7_Internalname ;
   private String AV138LInea8 ;
   private String edtavLinea8_Internalname ;
   private String AV139Linea9 ;
   private String edtavLinea9_Internalname ;
   private String edtavMaqcod1_Internalname ;
   private String edtavMaqcod10_Internalname ;
   private String edtavMaqcod11_Internalname ;
   private String edtavMaqcod12_Internalname ;
   private String edtavMaqcod13_Internalname ;
   private String edtavMaqcod14_Internalname ;
   private String edtavMaqcod15_Internalname ;
   private String edtavMaqcod16_Internalname ;
   private String edtavMaqcod17_Internalname ;
   private String edtavMaqcod18_Internalname ;
   private String edtavMaqcod19_Internalname ;
   private String edtavMaqcod2_Internalname ;
   private String edtavMaqcod20_Internalname ;
   private String edtavMaqcod21_Internalname ;
   private String edtavMaqcod22_Internalname ;
   private String edtavMaqcod23_Internalname ;
   private String edtavMaqcod24_Internalname ;
   private String edtavMaqcod25_Internalname ;
   private String edtavMaqcod26_Internalname ;
   private String edtavMaqcod27_Internalname ;
   private String edtavMaqcod28_Internalname ;
   private String edtavMaqcod3_Internalname ;
   private String edtavMaqcod4_Internalname ;
   private String edtavMaqcod5_Internalname ;
   private String edtavMaqcod6_Internalname ;
   private String edtavMaqcod7_Internalname ;
   private String edtavMaqcod8_Internalname ;
   private String edtavMaqcod9_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV332Station ;
   private String AV63EmprNom ;
   private String AV344UsurCod ;
   private String AV49Carpeta ;
   private String AV260NomInf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String GXv_char26[] ;
   private String GXv_char27[] ;
   private String GXv_char28[] ;
   private String GXv_char29[] ;
   private String GXv_char30[] ;
   private String GXv_char31[] ;
   private String GXv_char32[] ;
   private String GXv_char33[] ;
   private String GXv_char34[] ;
   private String GXv_char35[] ;
   private String GXv_char36[] ;
   private String GXv_char37[] ;
   private String GXv_char38[] ;
   private String GXv_char39[] ;
   private String GXv_char40[] ;
   private String GXv_char41[] ;
   private String GXv_char42[] ;
   private String GXv_char43[] ;
   private String GXv_char44[] ;
   private String GXv_char45[] ;
   private String GXv_char46[] ;
   private String GXv_char47[] ;
   private String GXv_char48[] ;
   private String GXv_char49[] ;
   private String GXv_char50[] ;
   private String GXv_char51[] ;
   private String GXv_char52[] ;
   private String GXv_char53[] ;
   private String GXv_char54[] ;
   private String GXv_char55[] ;
   private String GXv_char56[] ;
   private String edtavHdr1_Title ;
   private String edtavHdr2_Title ;
   private String edtavHdr3_Title ;
   private String edtavHdr4_Title ;
   private String edtavHdr5_Title ;
   private String edtavHdr6_Title ;
   private String edtavHdr7_Title ;
   private String edtavHdr8_Title ;
   private String edtavHdr9_Title ;
   private String edtavHdr10_Title ;
   private String edtavHdr11_Title ;
   private String edtavHdr12_Title ;
   private String edtavHdr13_Title ;
   private String edtavHdr14_Title ;
   private String edtavHdr15_Title ;
   private String edtavHdr16_Title ;
   private String edtavHdr17_Title ;
   private String edtavHdr18_Title ;
   private String edtavHdr19_Title ;
   private String edtavHdr20_Title ;
   private String edtavHdr21_Title ;
   private String edtavHdr22_Title ;
   private String edtavHdr23_Title ;
   private String edtavHdr24_Title ;
   private String edtavHdr25_Title ;
   private String edtavHdr26_Title ;
   private String edtavHdr27_Title ;
   private String edtavHdr28_Title ;
   private String AV338Texto ;
   private String AV76Hdr ;
   private String AV64EstadoFasegrid ;
   private String AV48Cant ;
   private String AV196MaqCodRc1 ;
   private String AV207MaqCodRc2 ;
   private String AV217MaqCodRc3 ;
   private String AV218MaqCodRc4 ;
   private String AV219MaqCodRc5 ;
   private String AV220MaqCodRc6 ;
   private String AV221MaqCodRc7 ;
   private String AV222MaqCodRc8 ;
   private String AV223MaqCodRc9 ;
   private String AV197MaqCodRc10 ;
   private String AV198MaqCodRc11 ;
   private String AV199MaqCodRc12 ;
   private String AV200MaqCodRc13 ;
   private String AV201MaqCodRc14 ;
   private String AV203MaqCodRc16 ;
   private String AV204MaqCodRc17 ;
   private String AV205MaqCodRc18 ;
   private String AV206MaqCodRc19 ;
   private String AV208MaqCodRc20 ;
   private String AV209MaqCodRc21 ;
   private String AV210MaqCodRc22 ;
   private String AV211MaqCodRc23 ;
   private String AV212MaqCodRc24 ;
   private String AV213MaqCodRc25 ;
   private String AV214MaqCodRc26 ;
   private String AV215MaqCodRc27 ;
   private String AV216MaqCodRc28 ;
   private String GXt_char1 ;
   private String tblTablerightheader_Internalname ;
   private String AV339Texto_l ;
   private String GXv_char59[] ;
   private String GXv_char58[] ;
   private String GXv_char57[] ;
   private String GXv_char62[] ;
   private String GXv_char61[] ;
   private String AV193MaqCodBis ;
   private String GXv_char60[] ;
   private String AV340Texto1 ;
   private String scmdbuf ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavHdr1_Jsonclick ;
   private String edtavHdr2_Jsonclick ;
   private String edtavHdr3_Jsonclick ;
   private String edtavHdr4_Jsonclick ;
   private String edtavHdr5_Jsonclick ;
   private String edtavHdr6_Jsonclick ;
   private String edtavHdr7_Jsonclick ;
   private String edtavHdr8_Jsonclick ;
   private String edtavHdr9_Jsonclick ;
   private String edtavHdr10_Jsonclick ;
   private String edtavHdr11_Jsonclick ;
   private String edtavHdr12_Jsonclick ;
   private String edtavHdr13_Jsonclick ;
   private String edtavHdr14_Jsonclick ;
   private String edtavHdr15_Jsonclick ;
   private String edtavHdr16_Jsonclick ;
   private String edtavHdr17_Jsonclick ;
   private String edtavHdr18_Jsonclick ;
   private String edtavHdr19_Jsonclick ;
   private String edtavHdr20_Jsonclick ;
   private String edtavHdr21_Jsonclick ;
   private String edtavHdr22_Jsonclick ;
   private String edtavHdr23_Jsonclick ;
   private String edtavHdr24_Jsonclick ;
   private String edtavHdr25_Jsonclick ;
   private String edtavHdr26_Jsonclick ;
   private String edtavHdr27_Jsonclick ;
   private String edtavHdr28_Jsonclick ;
   private String edtavLinea1_Jsonclick ;
   private String edtavLinea10_Jsonclick ;
   private String edtavLinea11_Jsonclick ;
   private String edtavLinea12_Jsonclick ;
   private String edtavLinea13_Jsonclick ;
   private String edtavLinea14_Jsonclick ;
   private String edtavLinea15_Jsonclick ;
   private String edtavLinea16_Jsonclick ;
   private String edtavLinea17_Jsonclick ;
   private String edtavLinea18_Jsonclick ;
   private String edtavLinea19_Jsonclick ;
   private String edtavLinea2_Jsonclick ;
   private String edtavLinea20_Jsonclick ;
   private String edtavLinea21_Jsonclick ;
   private String edtavLinea22_Jsonclick ;
   private String edtavLinea23_Jsonclick ;
   private String edtavLinea24_Jsonclick ;
   private String edtavLinea25_Jsonclick ;
   private String edtavLinea26_Jsonclick ;
   private String edtavLinea27_Jsonclick ;
   private String edtavLinea28_Jsonclick ;
   private String edtavLinea3_Jsonclick ;
   private String edtavLinea4_Jsonclick ;
   private String edtavLinea5_Jsonclick ;
   private String edtavLinea6_Jsonclick ;
   private String edtavLinea7_Jsonclick ;
   private String edtavLinea8_Jsonclick ;
   private String edtavLinea9_Jsonclick ;
   private String edtavMaqcod1_Jsonclick ;
   private String edtavMaqcod10_Jsonclick ;
   private String edtavMaqcod11_Jsonclick ;
   private String edtavMaqcod12_Jsonclick ;
   private String edtavMaqcod13_Jsonclick ;
   private String edtavMaqcod14_Jsonclick ;
   private String edtavMaqcod15_Jsonclick ;
   private String edtavMaqcod16_Jsonclick ;
   private String edtavMaqcod17_Jsonclick ;
   private String edtavMaqcod18_Jsonclick ;
   private String edtavMaqcod19_Jsonclick ;
   private String edtavMaqcod2_Jsonclick ;
   private String edtavMaqcod20_Jsonclick ;
   private String edtavMaqcod21_Jsonclick ;
   private String edtavMaqcod22_Jsonclick ;
   private String edtavMaqcod23_Jsonclick ;
   private String edtavMaqcod24_Jsonclick ;
   private String edtavMaqcod25_Jsonclick ;
   private String edtavMaqcod26_Jsonclick ;
   private String edtavMaqcod27_Jsonclick ;
   private String edtavMaqcod28_Jsonclick ;
   private String edtavMaqcod3_Jsonclick ;
   private String edtavMaqcod4_Jsonclick ;
   private String edtavMaqcod5_Jsonclick ;
   private String edtavMaqcod6_Jsonclick ;
   private String edtavMaqcod7_Jsonclick ;
   private String edtavMaqcod8_Jsonclick ;
   private String edtavMaqcod9_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV70FecInicio ;
   private java.util.Date AV69FechaFin ;
   private java.util.Date AV68fecha ;
   private java.util.Date GXv_date76[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV353ColumnsSelectorXML ;
   private String AV359ManageFiltersXml ;
   private String AV354UserCustomValue ;
   private String AV362FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV348HTTPRequest ;
   private com.genexus.webpanels.WebSession AV357Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXFile AV5Archivo ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H00AM2_A758ProCod ;
   private byte[] H00AM2_A153BarFasEst ;
   private String[] H00AM2_A150BarFacTin ;
   private String[] H00AM2_A130BarCodPar ;
   private byte[] H00AM2_A132BarCodReo ;
   private int[] H00AM2_A129BarCod ;
   private String[] H00AM2_A396EmprCod ;
   private short[] H00AM2_A194BarOrdLin ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV358ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item72 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item73[] ;
   private app.wwpbaseobjects.SdtWWPContext AV347WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext64[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV351GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState74[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV352GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV355ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV356ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector70[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector71[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV361DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class webwkp107copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00AM2", "SELECT ProCod, BarFasEst, BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst < 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

