package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwkp107_impl extends GXDataArea
{
   public webwkp107_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwkp107_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwkp107_impl.class ));
   }

   public webwkp107_impl( int remoteHandle ,
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
      nRC_GXsfl_17 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_17"))) ;
      nGXsfl_17_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_17_idx"))) ;
      sGXsfl_17_idx = httpContext.GetPar( "sGXsfl_17_idx") ;
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
      AV60EmprCod = httpContext.GetPar( "EmprCod") ;
      AV348FecInicio = localUtil.parseDateParm( httpContext.GetPar( "FecInicio")) ;
      AV349FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      AV160Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV161MaqCod10 = httpContext.GetPar( "MaqCod10") ;
      AV162Maqcod11 = httpContext.GetPar( "Maqcod11") ;
      AV163MaqCod12 = httpContext.GetPar( "MaqCod12") ;
      AV164Maqcod13 = httpContext.GetPar( "Maqcod13") ;
      AV165Maqcod14 = httpContext.GetPar( "Maqcod14") ;
      AV166Maqcod15 = httpContext.GetPar( "Maqcod15") ;
      AV167Maqcod16 = httpContext.GetPar( "Maqcod16") ;
      AV168Maqcod17 = httpContext.GetPar( "Maqcod17") ;
      AV169Maqcod18 = httpContext.GetPar( "Maqcod18") ;
      AV170Maqcod19 = httpContext.GetPar( "Maqcod19") ;
      AV171Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      AV172Maqcod20 = httpContext.GetPar( "Maqcod20") ;
      AV173Maqcod21 = httpContext.GetPar( "Maqcod21") ;
      AV174Maqcod22 = httpContext.GetPar( "Maqcod22") ;
      AV175Maqcod23 = httpContext.GetPar( "Maqcod23") ;
      AV176Maqcod24 = httpContext.GetPar( "Maqcod24") ;
      AV177Maqcod25 = httpContext.GetPar( "Maqcod25") ;
      AV178Maqcod26 = httpContext.GetPar( "Maqcod26") ;
      AV179Maqcod27 = httpContext.GetPar( "Maqcod27") ;
      AV180Maqcod28 = httpContext.GetPar( "Maqcod28") ;
      AV181Maqcod3 = httpContext.GetPar( "Maqcod3") ;
      AV182Maqcod4 = httpContext.GetPar( "Maqcod4") ;
      AV183Maqcod5 = httpContext.GetPar( "Maqcod5") ;
      AV184Maqcod6 = httpContext.GetPar( "Maqcod6") ;
      AV185Maqcod7 = httpContext.GetPar( "Maqcod7") ;
      AV186Maqcod8 = httpContext.GetPar( "Maqcod8") ;
      AV187Maqcod9 = httpContext.GetPar( "Maqcod9") ;
      AV220Maqdsc1 = httpContext.GetPar( "Maqdsc1") ;
      AV221Maqdsc10 = httpContext.GetPar( "Maqdsc10") ;
      AV222Maqdsc11 = httpContext.GetPar( "Maqdsc11") ;
      AV223Maqdsc12 = httpContext.GetPar( "Maqdsc12") ;
      AV224Maqdsc13 = httpContext.GetPar( "Maqdsc13") ;
      AV225Maqdsc14 = httpContext.GetPar( "Maqdsc14") ;
      AV226Maqdsc15 = httpContext.GetPar( "Maqdsc15") ;
      AV227MaqDsc16 = httpContext.GetPar( "MaqDsc16") ;
      AV228MaqDsc17 = httpContext.GetPar( "MaqDsc17") ;
      AV229MaqDsc18 = httpContext.GetPar( "MaqDsc18") ;
      AV230MaqDsc19 = httpContext.GetPar( "MaqDsc19") ;
      AV231Maqdsc2 = httpContext.GetPar( "Maqdsc2") ;
      AV232MaqDsc20 = httpContext.GetPar( "MaqDsc20") ;
      AV233MaqDsc21 = httpContext.GetPar( "MaqDsc21") ;
      AV234MaqDsc22 = httpContext.GetPar( "MaqDsc22") ;
      AV235MaqDsc23 = httpContext.GetPar( "MaqDsc23") ;
      AV236MaqDsc24 = httpContext.GetPar( "MaqDsc24") ;
      AV237MaqDsc25 = httpContext.GetPar( "MaqDsc25") ;
      AV238MaqDsc26 = httpContext.GetPar( "MaqDsc26") ;
      AV239MaqDsc27 = httpContext.GetPar( "MaqDsc27") ;
      AV240MaqDsc28 = httpContext.GetPar( "MaqDsc28") ;
      AV241Maqdsc3 = httpContext.GetPar( "Maqdsc3") ;
      AV242Maqdsc4 = httpContext.GetPar( "Maqdsc4") ;
      AV243Maqdsc5 = httpContext.GetPar( "Maqdsc5") ;
      AV244Maqdsc6 = httpContext.GetPar( "Maqdsc6") ;
      AV245Maqdsc7 = httpContext.GetPar( "Maqdsc7") ;
      AV246Maqdsc8 = httpContext.GetPar( "Maqdsc8") ;
      AV247Maqdsc9 = httpContext.GetPar( "Maqdsc9") ;
      AV327t = (short)(GXutil.lval( httpContext.GetPar( "t"))) ;
      AV159Maqcod = httpContext.GetPar( "Maqcod") ;
      AV40Barordlin = (short)(GXutil.lval( httpContext.GetPar( "Barordlin"))) ;
      AV29Barfasestant = (byte)(GXutil.lval( httpContext.GetPar( "Barfasestant"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV9Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV17Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV13Barcodpar = httpContext.GetPar( "Barcodpar") ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV83Hdr2 = httpContext.GetPar( "Hdr2") ;
      AV7B2 = (short)(GXutil.lval( httpContext.GetPar( "B2"))) ;
      AV70G2 = (short)(GXutil.lval( httpContext.GetPar( "G2"))) ;
      AV291R2 = (short)(GXutil.lval( httpContext.GetPar( "R2"))) ;
      AV353Maquinastxt = httpContext.GetPar( "Maquinastxt") ;
      AV356MaquinasHdrstxt = httpContext.GetPar( "MaquinasHdrstxt") ;
      AV256NospMaq = (short)(GXutil.lval( httpContext.GetPar( "NospMaq"))) ;
      AV67Filename = httpContext.GetPar( "Filename") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV60EmprCod, AV348FecInicio, AV349FechaFin, AV160Maqcod1, AV161MaqCod10, AV162Maqcod11, AV163MaqCod12, AV164Maqcod13, AV165Maqcod14, AV166Maqcod15, AV167Maqcod16, AV168Maqcod17, AV169Maqcod18, AV170Maqcod19, AV171Maqcod2, AV172Maqcod20, AV173Maqcod21, AV174Maqcod22, AV175Maqcod23, AV176Maqcod24, AV177Maqcod25, AV178Maqcod26, AV179Maqcod27, AV180Maqcod28, AV181Maqcod3, AV182Maqcod4, AV183Maqcod5, AV184Maqcod6, AV185Maqcod7, AV186Maqcod8, AV187Maqcod9, AV220Maqdsc1, AV221Maqdsc10, AV222Maqdsc11, AV223Maqdsc12, AV224Maqdsc13, AV225Maqdsc14, AV226Maqdsc15, AV227MaqDsc16, AV228MaqDsc17, AV229MaqDsc18, AV230MaqDsc19, AV231Maqdsc2, AV232MaqDsc20, AV233MaqDsc21, AV234MaqDsc22, AV235MaqDsc23, AV236MaqDsc24, AV237MaqDsc25, AV238MaqDsc26, AV239MaqDsc27, AV240MaqDsc28, AV241Maqdsc3, AV242Maqdsc4, AV243Maqdsc5, AV244Maqdsc6, AV245Maqdsc7, AV246Maqdsc8, AV247Maqdsc9, AV327t, AV159Maqcod, AV40Barordlin, AV29Barfasestant, A396EmprCod, A129BarCod, AV9Barcod, A132BarCodReo, AV17Barcodreo, A130BarCodPar, AV13Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV83Hdr2, AV7B2, AV70G2, AV291R2, AV353Maquinastxt, AV356MaquinasHdrstxt, AV256NospMaq, AV67Filename) ;
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
      paAL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAL2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwkp107", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV348FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV349FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV220Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV327t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV291R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV353Maquinastxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASHDRSTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV356MaquinasHdrstxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOSPMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV256NospMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFILENAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67Filename, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV60EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_MAQ", AV329Tab_maq);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_MAQ", AV329Tab_maq);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vFECINICIO", localUtil.dtoc( AV348FecInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV348FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHAFIN", localUtil.dtoc( AV349FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV349FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC1", GXutil.rtrim( AV220Maqdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV220Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC10", GXutil.rtrim( AV221Maqdsc10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC11", GXutil.rtrim( AV222Maqdsc11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC12", GXutil.rtrim( AV223Maqdsc12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC13", GXutil.rtrim( AV224Maqdsc13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC14", GXutil.rtrim( AV225Maqdsc14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC15", GXutil.rtrim( AV226Maqdsc15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC16", GXutil.rtrim( AV227MaqDsc16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC17", GXutil.rtrim( AV228MaqDsc17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC18", GXutil.rtrim( AV229MaqDsc18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC19", GXutil.rtrim( AV230MaqDsc19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC2", GXutil.rtrim( AV231Maqdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC20", GXutil.rtrim( AV232MaqDsc20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC21", GXutil.rtrim( AV233MaqDsc21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC22", GXutil.rtrim( AV234MaqDsc22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC23", GXutil.rtrim( AV235MaqDsc23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC24", GXutil.rtrim( AV236MaqDsc24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC25", GXutil.rtrim( AV237MaqDsc25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC26", GXutil.rtrim( AV238MaqDsc26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC27", GXutil.rtrim( AV239MaqDsc27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC28", GXutil.rtrim( AV240MaqDsc28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC3", GXutil.rtrim( AV241Maqdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC4", GXutil.rtrim( AV242Maqdsc4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC5", GXutil.rtrim( AV243Maqdsc5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC6", GXutil.rtrim( AV244Maqdsc6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC7", GXutil.rtrim( AV245Maqdsc7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC8", GXutil.rtrim( AV246Maqdsc8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC9", GXutil.rtrim( AV247Maqdsc9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc9, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQHDRS", AV248MaqHdrs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQHDRS", AV248MaqHdrs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vT", GXutil.ltrim( localUtil.ntoc( AV327t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV327t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV159Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV40Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTANT", GXutil.ltrim( localUtil.ntoc( AV29Barfasestant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV17Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV13Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2", GXutil.ltrim( localUtil.ntoc( AV7B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2", GXutil.ltrim( localUtil.ntoc( AV70G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2", GXutil.ltrim( localUtil.ntoc( AV291R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV291R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUINASTXT", AV353Maquinastxt);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV353Maquinastxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUINASHDRSTXT", AV356MaquinasHdrstxt);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASHDRSTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV356MaquinasHdrstxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOSPMAQ", GXutil.ltrim( localUtil.ntoc( AV256NospMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOSPMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV256NospMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILENAME", GXutil.rtrim( AV67Filename));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFILENAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67Filename, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_Eof", GXutil.booltostr( AV341Archivo.getEof()));
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
         weAL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAL2( ) ;
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
      return formatLink("app.webwkp107", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWkp107" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Planificacion TINTE", "") ;
   }

   public void wbAL0( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, httpContext.getMessage( "Informes", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_WebWkp107.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGroup1table_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "Center", "Middle", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "BtnExportReport" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttExportarrtf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 17, 2, 0)+","+"null"+");", "", bttExportarrtf_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11al1_client"+"'", TempTags, "", 2, "HLP_WebWkp107.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "Middle", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol17( ) ;
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (int)(nGXsfl_17_idx-1) ;
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 17 )
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

   public void startAL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Planificacion TINTE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAL0( ) ;
   }

   public void wsAL2( )
   {
      startAL2( ) ;
      evtAL2( ) ;
   }

   public void evtAL2( )
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
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           AV72Hdr1 = httpContext.cgiGet( edtavHdr1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV72Hdr1);
                           AV83Hdr2 = httpContext.cgiGet( edtavHdr2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
                           AV93Hdr3 = httpContext.cgiGet( edtavHdr3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV93Hdr3);
                           AV94Hdr4 = httpContext.cgiGet( edtavHdr4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV94Hdr4);
                           AV95Hdr5 = httpContext.cgiGet( edtavHdr5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV95Hdr5);
                           AV96Hdr6 = httpContext.cgiGet( edtavHdr6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV96Hdr6);
                           AV97Hdr7 = httpContext.cgiGet( edtavHdr7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV97Hdr7);
                           AV98Hdr8 = httpContext.cgiGet( edtavHdr8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV98Hdr8);
                           AV99Hdr9 = httpContext.cgiGet( edtavHdr9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV99Hdr9);
                           AV73Hdr10 = httpContext.cgiGet( edtavHdr10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV73Hdr10);
                           AV74Hdr11 = httpContext.cgiGet( edtavHdr11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV74Hdr11);
                           AV75Hdr12 = httpContext.cgiGet( edtavHdr12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV75Hdr12);
                           AV76Hdr13 = httpContext.cgiGet( edtavHdr13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV76Hdr13);
                           AV77Hdr14 = httpContext.cgiGet( edtavHdr14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV77Hdr14);
                           AV78Hdr15 = httpContext.cgiGet( edtavHdr15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV78Hdr15);
                           AV79Hdr16 = httpContext.cgiGet( edtavHdr16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV79Hdr16);
                           AV80Hdr17 = httpContext.cgiGet( edtavHdr17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV80Hdr17);
                           AV81Hdr18 = httpContext.cgiGet( edtavHdr18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV81Hdr18);
                           AV82Hdr19 = httpContext.cgiGet( edtavHdr19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV82Hdr19);
                           AV84Hdr20 = httpContext.cgiGet( edtavHdr20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV84Hdr20);
                           AV85Hdr21 = httpContext.cgiGet( edtavHdr21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV85Hdr21);
                           AV86Hdr22 = httpContext.cgiGet( edtavHdr22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV86Hdr22);
                           AV87Hdr23 = httpContext.cgiGet( edtavHdr23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV87Hdr23);
                           AV88Hdr24 = httpContext.cgiGet( edtavHdr24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV88Hdr24);
                           AV89Hdr25 = httpContext.cgiGet( edtavHdr25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV89Hdr25);
                           AV90Hdr26 = httpContext.cgiGet( edtavHdr26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV90Hdr26);
                           AV91Hdr27 = httpContext.cgiGet( edtavHdr27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV91Hdr27);
                           AV92Hdr28 = httpContext.cgiGet( edtavHdr28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV92Hdr28);
                           AV107Linea1 = httpContext.cgiGet( edtavLinea1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea1_Internalname, AV107Linea1);
                           AV108Linea10 = httpContext.cgiGet( edtavLinea10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea10_Internalname, AV108Linea10);
                           AV109Linea11 = httpContext.cgiGet( edtavLinea11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea11_Internalname, AV109Linea11);
                           AV110Linea12 = httpContext.cgiGet( edtavLinea12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea12_Internalname, AV110Linea12);
                           AV111Linea13 = httpContext.cgiGet( edtavLinea13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea13_Internalname, AV111Linea13);
                           AV112Linea14 = httpContext.cgiGet( edtavLinea14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea14_Internalname, AV112Linea14);
                           AV113Linea15 = httpContext.cgiGet( edtavLinea15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea15_Internalname, AV113Linea15);
                           AV114Linea16 = httpContext.cgiGet( edtavLinea16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea16_Internalname, AV114Linea16);
                           AV115Linea17 = httpContext.cgiGet( edtavLinea17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea17_Internalname, AV115Linea17);
                           AV116Linea18 = httpContext.cgiGet( edtavLinea18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea18_Internalname, AV116Linea18);
                           AV117Linea19 = httpContext.cgiGet( edtavLinea19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea19_Internalname, AV117Linea19);
                           AV118Linea2 = httpContext.cgiGet( edtavLinea2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea2_Internalname, AV118Linea2);
                           AV119Linea20 = httpContext.cgiGet( edtavLinea20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea20_Internalname, AV119Linea20);
                           AV120Linea21 = httpContext.cgiGet( edtavLinea21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea21_Internalname, AV120Linea21);
                           AV121Linea22 = httpContext.cgiGet( edtavLinea22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea22_Internalname, AV121Linea22);
                           AV122Linea23 = httpContext.cgiGet( edtavLinea23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea23_Internalname, AV122Linea23);
                           AV123Linea24 = httpContext.cgiGet( edtavLinea24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea24_Internalname, AV123Linea24);
                           AV124Linea25 = httpContext.cgiGet( edtavLinea25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea25_Internalname, AV124Linea25);
                           AV125Linea26 = httpContext.cgiGet( edtavLinea26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea26_Internalname, AV125Linea26);
                           AV126Linea27 = httpContext.cgiGet( edtavLinea27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea27_Internalname, AV126Linea27);
                           AV127Linea28 = httpContext.cgiGet( edtavLinea28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea28_Internalname, AV127Linea28);
                           AV128Linea3 = httpContext.cgiGet( edtavLinea3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea3_Internalname, AV128Linea3);
                           AV129Linea4 = httpContext.cgiGet( edtavLinea4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea4_Internalname, AV129Linea4);
                           AV130Linea5 = httpContext.cgiGet( edtavLinea5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea5_Internalname, AV130Linea5);
                           AV131Linea6 = httpContext.cgiGet( edtavLinea6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea6_Internalname, AV131Linea6);
                           AV132Linea7 = httpContext.cgiGet( edtavLinea7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea7_Internalname, AV132Linea7);
                           AV133LInea8 = httpContext.cgiGet( edtavLinea8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea8_Internalname, AV133LInea8);
                           AV134Linea9 = httpContext.cgiGet( edtavLinea9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea9_Internalname, AV134Linea9);
                           AV160Maqcod1 = httpContext.cgiGet( edtavMaqcod1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod1_Internalname, AV160Maqcod1);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV160Maqcod1, ""))));
                           AV161MaqCod10 = httpContext.cgiGet( edtavMaqcod10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod10_Internalname, AV161MaqCod10);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV161MaqCod10, ""))));
                           AV162Maqcod11 = httpContext.cgiGet( edtavMaqcod11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod11_Internalname, AV162Maqcod11);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV162Maqcod11, ""))));
                           AV163MaqCod12 = httpContext.cgiGet( edtavMaqcod12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod12_Internalname, AV163MaqCod12);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV163MaqCod12, ""))));
                           AV164Maqcod13 = httpContext.cgiGet( edtavMaqcod13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod13_Internalname, AV164Maqcod13);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV164Maqcod13, ""))));
                           AV165Maqcod14 = httpContext.cgiGet( edtavMaqcod14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod14_Internalname, AV165Maqcod14);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV165Maqcod14, ""))));
                           AV166Maqcod15 = httpContext.cgiGet( edtavMaqcod15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod15_Internalname, AV166Maqcod15);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV166Maqcod15, ""))));
                           AV167Maqcod16 = httpContext.cgiGet( edtavMaqcod16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod16_Internalname, AV167Maqcod16);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV167Maqcod16, ""))));
                           AV168Maqcod17 = httpContext.cgiGet( edtavMaqcod17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod17_Internalname, AV168Maqcod17);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV168Maqcod17, ""))));
                           AV169Maqcod18 = httpContext.cgiGet( edtavMaqcod18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod18_Internalname, AV169Maqcod18);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV169Maqcod18, ""))));
                           AV170Maqcod19 = httpContext.cgiGet( edtavMaqcod19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod19_Internalname, AV170Maqcod19);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV170Maqcod19, ""))));
                           AV171Maqcod2 = httpContext.cgiGet( edtavMaqcod2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod2_Internalname, AV171Maqcod2);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV171Maqcod2, ""))));
                           AV172Maqcod20 = httpContext.cgiGet( edtavMaqcod20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod20_Internalname, AV172Maqcod20);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV172Maqcod20, ""))));
                           AV173Maqcod21 = httpContext.cgiGet( edtavMaqcod21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod21_Internalname, AV173Maqcod21);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV173Maqcod21, ""))));
                           AV174Maqcod22 = httpContext.cgiGet( edtavMaqcod22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod22_Internalname, AV174Maqcod22);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV174Maqcod22, ""))));
                           AV175Maqcod23 = httpContext.cgiGet( edtavMaqcod23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod23_Internalname, AV175Maqcod23);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV175Maqcod23, ""))));
                           AV176Maqcod24 = httpContext.cgiGet( edtavMaqcod24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod24_Internalname, AV176Maqcod24);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV176Maqcod24, ""))));
                           AV177Maqcod25 = httpContext.cgiGet( edtavMaqcod25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod25_Internalname, AV177Maqcod25);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV177Maqcod25, ""))));
                           AV178Maqcod26 = httpContext.cgiGet( edtavMaqcod26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod26_Internalname, AV178Maqcod26);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV178Maqcod26, ""))));
                           AV179Maqcod27 = httpContext.cgiGet( edtavMaqcod27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod27_Internalname, AV179Maqcod27);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV179Maqcod27, ""))));
                           AV180Maqcod28 = httpContext.cgiGet( edtavMaqcod28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod28_Internalname, AV180Maqcod28);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV180Maqcod28, ""))));
                           AV181Maqcod3 = httpContext.cgiGet( edtavMaqcod3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod3_Internalname, AV181Maqcod3);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV181Maqcod3, ""))));
                           AV182Maqcod4 = httpContext.cgiGet( edtavMaqcod4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod4_Internalname, AV182Maqcod4);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV182Maqcod4, ""))));
                           AV183Maqcod5 = httpContext.cgiGet( edtavMaqcod5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod5_Internalname, AV183Maqcod5);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV183Maqcod5, ""))));
                           AV184Maqcod6 = httpContext.cgiGet( edtavMaqcod6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod6_Internalname, AV184Maqcod6);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV184Maqcod6, ""))));
                           AV185Maqcod7 = httpContext.cgiGet( edtavMaqcod7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod7_Internalname, AV185Maqcod7);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV185Maqcod7, ""))));
                           AV186Maqcod8 = httpContext.cgiGet( edtavMaqcod8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod8_Internalname, AV186Maqcod8);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV186Maqcod8, ""))));
                           AV187Maqcod9 = httpContext.cgiGet( edtavMaqcod9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod9_Internalname, AV187Maqcod9);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV187Maqcod9, ""))));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e12AL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e13AL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e14AL2 ();
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

   public void weAL2( )
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

   public void paAL2( )
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
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV60EmprCod ,
                                 java.util.Date AV348FecInicio ,
                                 java.util.Date AV349FechaFin ,
                                 String AV160Maqcod1 ,
                                 String AV161MaqCod10 ,
                                 String AV162Maqcod11 ,
                                 String AV163MaqCod12 ,
                                 String AV164Maqcod13 ,
                                 String AV165Maqcod14 ,
                                 String AV166Maqcod15 ,
                                 String AV167Maqcod16 ,
                                 String AV168Maqcod17 ,
                                 String AV169Maqcod18 ,
                                 String AV170Maqcod19 ,
                                 String AV171Maqcod2 ,
                                 String AV172Maqcod20 ,
                                 String AV173Maqcod21 ,
                                 String AV174Maqcod22 ,
                                 String AV175Maqcod23 ,
                                 String AV176Maqcod24 ,
                                 String AV177Maqcod25 ,
                                 String AV178Maqcod26 ,
                                 String AV179Maqcod27 ,
                                 String AV180Maqcod28 ,
                                 String AV181Maqcod3 ,
                                 String AV182Maqcod4 ,
                                 String AV183Maqcod5 ,
                                 String AV184Maqcod6 ,
                                 String AV185Maqcod7 ,
                                 String AV186Maqcod8 ,
                                 String AV187Maqcod9 ,
                                 String AV220Maqdsc1 ,
                                 String AV221Maqdsc10 ,
                                 String AV222Maqdsc11 ,
                                 String AV223Maqdsc12 ,
                                 String AV224Maqdsc13 ,
                                 String AV225Maqdsc14 ,
                                 String AV226Maqdsc15 ,
                                 String AV227MaqDsc16 ,
                                 String AV228MaqDsc17 ,
                                 String AV229MaqDsc18 ,
                                 String AV230MaqDsc19 ,
                                 String AV231Maqdsc2 ,
                                 String AV232MaqDsc20 ,
                                 String AV233MaqDsc21 ,
                                 String AV234MaqDsc22 ,
                                 String AV235MaqDsc23 ,
                                 String AV236MaqDsc24 ,
                                 String AV237MaqDsc25 ,
                                 String AV238MaqDsc26 ,
                                 String AV239MaqDsc27 ,
                                 String AV240MaqDsc28 ,
                                 String AV241Maqdsc3 ,
                                 String AV242Maqdsc4 ,
                                 String AV243Maqdsc5 ,
                                 String AV244Maqdsc6 ,
                                 String AV245Maqdsc7 ,
                                 String AV246Maqdsc8 ,
                                 String AV247Maqdsc9 ,
                                 short AV327t ,
                                 String AV159Maqcod ,
                                 short AV40Barordlin ,
                                 byte AV29Barfasestant ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 int AV9Barcod ,
                                 byte A132BarCodReo ,
                                 byte AV17Barcodreo ,
                                 String A130BarCodPar ,
                                 String AV13Barcodpar ,
                                 String A150BarFacTin ,
                                 byte A153BarFasEst ,
                                 short A194BarOrdLin ,
                                 String AV83Hdr2 ,
                                 short AV7B2 ,
                                 short AV70G2 ,
                                 short AV291R2 ,
                                 String AV353Maquinastxt ,
                                 String AV356MaquinasHdrstxt ,
                                 short AV256NospMaq ,
                                 String AV67Filename )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13AL2 ();
      GRID_nCurrentRecord = 0 ;
      rfAL2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV160Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD1", GXutil.rtrim( AV160Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV161MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD10", GXutil.rtrim( AV161MaqCod10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV162Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD11", GXutil.rtrim( AV162Maqcod11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV163MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD12", GXutil.rtrim( AV163MaqCod12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD13", GXutil.rtrim( AV164Maqcod13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD14", GXutil.rtrim( AV165Maqcod14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD15", GXutil.rtrim( AV166Maqcod15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD16", GXutil.rtrim( AV167Maqcod16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD17", GXutil.rtrim( AV168Maqcod17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD18", GXutil.rtrim( AV169Maqcod18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD19", GXutil.rtrim( AV170Maqcod19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV171Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD20", GXutil.rtrim( AV172Maqcod20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD21", GXutil.rtrim( AV173Maqcod21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD22", GXutil.rtrim( AV174Maqcod22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD23", GXutil.rtrim( AV175Maqcod23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD24", GXutil.rtrim( AV176Maqcod24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD25", GXutil.rtrim( AV177Maqcod25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD26", GXutil.rtrim( AV178Maqcod26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD27", GXutil.rtrim( AV179Maqcod27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD28", GXutil.rtrim( AV180Maqcod28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD3", GXutil.rtrim( AV181Maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD4", GXutil.rtrim( AV182Maqcod4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD5", GXutil.rtrim( AV183Maqcod5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD6", GXutil.rtrim( AV184Maqcod6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD7", GXutil.rtrim( AV185Maqcod7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD8", GXutil.rtrim( AV186Maqcod8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD9", GXutil.rtrim( AV187Maqcod9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDR2", GXutil.rtrim( AV83Hdr2));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_17_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfAL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavHdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr1_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr2_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr3_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr4_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr5_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr6_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr7_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr8_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr9_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr10_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr11_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr12_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr13_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr14_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr15_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr16_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr17_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr18_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr19_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr20_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr21_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr22_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr23_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr24_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr25_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr26_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr27_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr28_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea1_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea10_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea11_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea12_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea13_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea14_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea15_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea16_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea17_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea18_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea19_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea2_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea20_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea21_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea22_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea23_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea24_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea25_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea26_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea27_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea28_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea3_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea4_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea5_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea6_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea7_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea8_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea9_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod1_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod10_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod11_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod12_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod13_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod14_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod15_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod16_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod17_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod18_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod19_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod2_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod20_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod21_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod22_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod23_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod24_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod25_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod26_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod27_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod28_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod3_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod4_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod5_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod6_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod7_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod8_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod9_Enabled), 5, 0), !bGXsfl_17_Refreshing);
   }

   public void rfAL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e13AL2 ();
      nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
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
         subsflControlProps_172( ) ;
         e14AL2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_17_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e14AL2 ();
         }
         wbEnd = (short)(17) ;
         wbAL0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesAL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV60EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECINICIO", localUtil.dtoc( AV348FecInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV348FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHAFIN", localUtil.dtoc( AV349FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV349FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV160Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV161MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV162Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV163MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV164Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV165Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV166Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV167Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV168Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV169Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV170Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV171Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV172Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV173Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV174Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV175Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV176Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV177Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV178Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV179Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV180Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV181Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV182Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV183Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV184Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV185Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV186Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV187Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC1", GXutil.rtrim( AV220Maqdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV220Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC10", GXutil.rtrim( AV221Maqdsc10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC11", GXutil.rtrim( AV222Maqdsc11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC12", GXutil.rtrim( AV223Maqdsc12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC13", GXutil.rtrim( AV224Maqdsc13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC14", GXutil.rtrim( AV225Maqdsc14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC15", GXutil.rtrim( AV226Maqdsc15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC16", GXutil.rtrim( AV227MaqDsc16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC17", GXutil.rtrim( AV228MaqDsc17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC18", GXutil.rtrim( AV229MaqDsc18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC19", GXutil.rtrim( AV230MaqDsc19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC2", GXutil.rtrim( AV231Maqdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC20", GXutil.rtrim( AV232MaqDsc20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC21", GXutil.rtrim( AV233MaqDsc21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC22", GXutil.rtrim( AV234MaqDsc22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC23", GXutil.rtrim( AV235MaqDsc23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC24", GXutil.rtrim( AV236MaqDsc24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC25", GXutil.rtrim( AV237MaqDsc25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC26", GXutil.rtrim( AV238MaqDsc26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC27", GXutil.rtrim( AV239MaqDsc27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC28", GXutil.rtrim( AV240MaqDsc28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC3", GXutil.rtrim( AV241Maqdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC4", GXutil.rtrim( AV242Maqdsc4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC5", GXutil.rtrim( AV243Maqdsc5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC6", GXutil.rtrim( AV244Maqdsc6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC7", GXutil.rtrim( AV245Maqdsc7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC8", GXutil.rtrim( AV246Maqdsc8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC9", GXutil.rtrim( AV247Maqdsc9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vT", GXutil.ltrim( localUtil.ntoc( AV327t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV327t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV159Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV40Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTANT", GXutil.ltrim( localUtil.ntoc( AV29Barfasestant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV17Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV13Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2", GXutil.ltrim( localUtil.ntoc( AV7B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2", GXutil.ltrim( localUtil.ntoc( AV70G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2", GXutil.ltrim( localUtil.ntoc( AV291R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV291R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUINASTXT", AV353Maquinastxt);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV353Maquinastxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUINASHDRSTXT", AV356MaquinasHdrstxt);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASHDRSTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV356MaquinasHdrstxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOSPMAQ", GXutil.ltrim( localUtil.ntoc( AV256NospMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOSPMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV256NospMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILENAME", GXutil.rtrim( AV67Filename));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFILENAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67Filename, ""))));
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
      return 50*1 ;
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
         gxgrgrid_refresh( subGrid_Rows, AV60EmprCod, AV348FecInicio, AV349FechaFin, AV160Maqcod1, AV161MaqCod10, AV162Maqcod11, AV163MaqCod12, AV164Maqcod13, AV165Maqcod14, AV166Maqcod15, AV167Maqcod16, AV168Maqcod17, AV169Maqcod18, AV170Maqcod19, AV171Maqcod2, AV172Maqcod20, AV173Maqcod21, AV174Maqcod22, AV175Maqcod23, AV176Maqcod24, AV177Maqcod25, AV178Maqcod26, AV179Maqcod27, AV180Maqcod28, AV181Maqcod3, AV182Maqcod4, AV183Maqcod5, AV184Maqcod6, AV185Maqcod7, AV186Maqcod8, AV187Maqcod9, AV220Maqdsc1, AV221Maqdsc10, AV222Maqdsc11, AV223Maqdsc12, AV224Maqdsc13, AV225Maqdsc14, AV226Maqdsc15, AV227MaqDsc16, AV228MaqDsc17, AV229MaqDsc18, AV230MaqDsc19, AV231Maqdsc2, AV232MaqDsc20, AV233MaqDsc21, AV234MaqDsc22, AV235MaqDsc23, AV236MaqDsc24, AV237MaqDsc25, AV238MaqDsc26, AV239MaqDsc27, AV240MaqDsc28, AV241Maqdsc3, AV242Maqdsc4, AV243Maqdsc5, AV244Maqdsc6, AV245Maqdsc7, AV246Maqdsc8, AV247Maqdsc9, AV327t, AV159Maqcod, AV40Barordlin, AV29Barfasestant, A396EmprCod, A129BarCod, AV9Barcod, A132BarCodReo, AV17Barcodreo, A130BarCodPar, AV13Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV83Hdr2, AV7B2, AV70G2, AV291R2, AV353Maquinastxt, AV356MaquinasHdrstxt, AV256NospMaq, AV67Filename) ;
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
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV60EmprCod, AV348FecInicio, AV349FechaFin, AV160Maqcod1, AV161MaqCod10, AV162Maqcod11, AV163MaqCod12, AV164Maqcod13, AV165Maqcod14, AV166Maqcod15, AV167Maqcod16, AV168Maqcod17, AV169Maqcod18, AV170Maqcod19, AV171Maqcod2, AV172Maqcod20, AV173Maqcod21, AV174Maqcod22, AV175Maqcod23, AV176Maqcod24, AV177Maqcod25, AV178Maqcod26, AV179Maqcod27, AV180Maqcod28, AV181Maqcod3, AV182Maqcod4, AV183Maqcod5, AV184Maqcod6, AV185Maqcod7, AV186Maqcod8, AV187Maqcod9, AV220Maqdsc1, AV221Maqdsc10, AV222Maqdsc11, AV223Maqdsc12, AV224Maqdsc13, AV225Maqdsc14, AV226Maqdsc15, AV227MaqDsc16, AV228MaqDsc17, AV229MaqDsc18, AV230MaqDsc19, AV231Maqdsc2, AV232MaqDsc20, AV233MaqDsc21, AV234MaqDsc22, AV235MaqDsc23, AV236MaqDsc24, AV237MaqDsc25, AV238MaqDsc26, AV239MaqDsc27, AV240MaqDsc28, AV241Maqdsc3, AV242Maqdsc4, AV243Maqdsc5, AV244Maqdsc6, AV245Maqdsc7, AV246Maqdsc8, AV247Maqdsc9, AV327t, AV159Maqcod, AV40Barordlin, AV29Barfasestant, A396EmprCod, A129BarCod, AV9Barcod, A132BarCodReo, AV17Barcodreo, A130BarCodPar, AV13Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV83Hdr2, AV7B2, AV70G2, AV291R2, AV353Maquinastxt, AV356MaquinasHdrstxt, AV256NospMaq, AV67Filename) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV60EmprCod, AV348FecInicio, AV349FechaFin, AV160Maqcod1, AV161MaqCod10, AV162Maqcod11, AV163MaqCod12, AV164Maqcod13, AV165Maqcod14, AV166Maqcod15, AV167Maqcod16, AV168Maqcod17, AV169Maqcod18, AV170Maqcod19, AV171Maqcod2, AV172Maqcod20, AV173Maqcod21, AV174Maqcod22, AV175Maqcod23, AV176Maqcod24, AV177Maqcod25, AV178Maqcod26, AV179Maqcod27, AV180Maqcod28, AV181Maqcod3, AV182Maqcod4, AV183Maqcod5, AV184Maqcod6, AV185Maqcod7, AV186Maqcod8, AV187Maqcod9, AV220Maqdsc1, AV221Maqdsc10, AV222Maqdsc11, AV223Maqdsc12, AV224Maqdsc13, AV225Maqdsc14, AV226Maqdsc15, AV227MaqDsc16, AV228MaqDsc17, AV229MaqDsc18, AV230MaqDsc19, AV231Maqdsc2, AV232MaqDsc20, AV233MaqDsc21, AV234MaqDsc22, AV235MaqDsc23, AV236MaqDsc24, AV237MaqDsc25, AV238MaqDsc26, AV239MaqDsc27, AV240MaqDsc28, AV241Maqdsc3, AV242Maqdsc4, AV243Maqdsc5, AV244Maqdsc6, AV245Maqdsc7, AV246Maqdsc8, AV247Maqdsc9, AV327t, AV159Maqcod, AV40Barordlin, AV29Barfasestant, A396EmprCod, A129BarCod, AV9Barcod, A132BarCodReo, AV17Barcodreo, A130BarCodPar, AV13Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV83Hdr2, AV7B2, AV70G2, AV291R2, AV353Maquinastxt, AV356MaquinasHdrstxt, AV256NospMaq, AV67Filename) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV60EmprCod, AV348FecInicio, AV349FechaFin, AV160Maqcod1, AV161MaqCod10, AV162Maqcod11, AV163MaqCod12, AV164Maqcod13, AV165Maqcod14, AV166Maqcod15, AV167Maqcod16, AV168Maqcod17, AV169Maqcod18, AV170Maqcod19, AV171Maqcod2, AV172Maqcod20, AV173Maqcod21, AV174Maqcod22, AV175Maqcod23, AV176Maqcod24, AV177Maqcod25, AV178Maqcod26, AV179Maqcod27, AV180Maqcod28, AV181Maqcod3, AV182Maqcod4, AV183Maqcod5, AV184Maqcod6, AV185Maqcod7, AV186Maqcod8, AV187Maqcod9, AV220Maqdsc1, AV221Maqdsc10, AV222Maqdsc11, AV223Maqdsc12, AV224Maqdsc13, AV225Maqdsc14, AV226Maqdsc15, AV227MaqDsc16, AV228MaqDsc17, AV229MaqDsc18, AV230MaqDsc19, AV231Maqdsc2, AV232MaqDsc20, AV233MaqDsc21, AV234MaqDsc22, AV235MaqDsc23, AV236MaqDsc24, AV237MaqDsc25, AV238MaqDsc26, AV239MaqDsc27, AV240MaqDsc28, AV241Maqdsc3, AV242Maqdsc4, AV243Maqdsc5, AV244Maqdsc6, AV245Maqdsc7, AV246Maqdsc8, AV247Maqdsc9, AV327t, AV159Maqcod, AV40Barordlin, AV29Barfasestant, A396EmprCod, A129BarCod, AV9Barcod, A132BarCodReo, AV17Barcodreo, A130BarCodPar, AV13Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV83Hdr2, AV7B2, AV70G2, AV291R2, AV353Maquinastxt, AV356MaquinasHdrstxt, AV256NospMaq, AV67Filename) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV60EmprCod, AV348FecInicio, AV349FechaFin, AV160Maqcod1, AV161MaqCod10, AV162Maqcod11, AV163MaqCod12, AV164Maqcod13, AV165Maqcod14, AV166Maqcod15, AV167Maqcod16, AV168Maqcod17, AV169Maqcod18, AV170Maqcod19, AV171Maqcod2, AV172Maqcod20, AV173Maqcod21, AV174Maqcod22, AV175Maqcod23, AV176Maqcod24, AV177Maqcod25, AV178Maqcod26, AV179Maqcod27, AV180Maqcod28, AV181Maqcod3, AV182Maqcod4, AV183Maqcod5, AV184Maqcod6, AV185Maqcod7, AV186Maqcod8, AV187Maqcod9, AV220Maqdsc1, AV221Maqdsc10, AV222Maqdsc11, AV223Maqdsc12, AV224Maqdsc13, AV225Maqdsc14, AV226Maqdsc15, AV227MaqDsc16, AV228MaqDsc17, AV229MaqDsc18, AV230MaqDsc19, AV231Maqdsc2, AV232MaqDsc20, AV233MaqDsc21, AV234MaqDsc22, AV235MaqDsc23, AV236MaqDsc24, AV237MaqDsc25, AV238MaqDsc26, AV239MaqDsc27, AV240MaqDsc28, AV241Maqdsc3, AV242Maqdsc4, AV243Maqdsc5, AV244Maqdsc6, AV245Maqdsc7, AV246Maqdsc8, AV247Maqdsc9, AV327t, AV159Maqcod, AV40Barordlin, AV29Barfasestant, A396EmprCod, A129BarCod, AV9Barcod, A132BarCodReo, AV17Barcodreo, A130BarCodPar, AV13Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV83Hdr2, AV7B2, AV70G2, AV291R2, AV353Maquinastxt, AV356MaquinasHdrstxt, AV256NospMaq, AV67Filename) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavHdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr1_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr2_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr3_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr4_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr5_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr6_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr7_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr8_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr9_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr10_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr11_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr12_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr13_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr14_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr15_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr16_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr17_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr18_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr19_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr20_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr21_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr22_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr23_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr24_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr25_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr26_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr27_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavHdr28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr28_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea1_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea10_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea11_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea12_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea13_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea14_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea15_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea16_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea17_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea18_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea19_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea2_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea20_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea21_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea22_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea23_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea24_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea25_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea26_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea27_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea28_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea3_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea4_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea5_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea6_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea7_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea8_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavLinea9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea9_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod1_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod10_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod11_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod12_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod13_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod14_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod15_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod16_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod17_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod18_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod19_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod2_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod20_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod21_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod22_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod23_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod24_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod25_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod26_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod27_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod28_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod3_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod4_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod5_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod6_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod7_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod8_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavMaqcod9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod9_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupAL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12AL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV67Filename = httpContext.cgiGet( "vFILENAME") ;
         AV256NospMaq = (short)(localUtil.ctol( httpContext.cgiGet( "vNOSPMAQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV356MaquinasHdrstxt = httpContext.cgiGet( "vMAQUINASHDRSTXT") ;
         AV353Maquinastxt = httpContext.cgiGet( "vMAQUINASTXT") ;
         AV60EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
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
      e12AL2 ();
      if (returnInSub) return;
   }

   public void e12AL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV326Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwkp107_impl.this.GXt_char1 = GXv_char2[0] ;
      AV326Station = GXt_char1 ;
      GXv_char2[0] = AV60EmprCod ;
      GXv_char3[0] = AV61EmprNom ;
      GXv_char4[0] = AV338UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV326Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwkp107_impl.this.AV60EmprCod = GXv_char2[0] ;
      webwkp107_impl.this.AV61EmprNom = GXv_char3[0] ;
      webwkp107_impl.this.AV338UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      GXt_char1 = AV48Carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV60EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      webwkp107_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48Carpeta = GXt_char1 ;
      AV255NomInf = httpContext.getMessage( "MAQUINASPLN", "") ;
      GXt_int5 = AV347dias ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV60EmprCod, httpContext.getMessage( "DIASPL", ""), GXv_int6) ;
      webwkp107_impl.this.GXt_int5 = GXv_int6[0] ;
      AV347dias = (short)(GXt_int5) ;
      AV347dias = (short)(((AV347dias==0) ? 60 : AV347dias)) ;
      AV348FecInicio = GXutil.dadd(GXutil.today( ),-((int)(AV347dias))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV348FecInicio", localUtil.format(AV348FecInicio, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV348FecInicio));
      AV349FechaFin = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV349FechaFin", localUtil.format(AV349FechaFin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV349FechaFin));
   }

   public void e13AL2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "Actualizando Array de Maquinas", "") );
      GXv_char4[0] = AV60EmprCod ;
      new app.pprc207(remoteHandle, context).execute( GXv_char4, AV329Tab_maq) ;
      webwkp107_impl.this.AV60EmprCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      System.out.println( httpContext.getMessage( "Creando fichero PLANO", "") );
      new app.copypprc218(remoteHandle, context).execute( ) ;
      GXv_char4[0] = AV60EmprCod ;
      GXv_char3[0] = AV160Maqcod1 ;
      GXv_char2[0] = AV161MaqCod10 ;
      GXv_char7[0] = AV162Maqcod11 ;
      GXv_char8[0] = AV163MaqCod12 ;
      GXv_char9[0] = AV164Maqcod13 ;
      GXv_char10[0] = AV165Maqcod14 ;
      GXv_char11[0] = AV166Maqcod15 ;
      GXv_char12[0] = AV167Maqcod16 ;
      GXv_char13[0] = AV168Maqcod17 ;
      GXv_char14[0] = AV169Maqcod18 ;
      GXv_char15[0] = AV170Maqcod19 ;
      GXv_char16[0] = AV171Maqcod2 ;
      GXv_char17[0] = AV172Maqcod20 ;
      GXv_char18[0] = AV173Maqcod21 ;
      GXv_char19[0] = AV174Maqcod22 ;
      GXv_char20[0] = AV175Maqcod23 ;
      GXv_char21[0] = AV176Maqcod24 ;
      GXv_char22[0] = AV177Maqcod25 ;
      GXv_char23[0] = AV178Maqcod26 ;
      GXv_char24[0] = AV179Maqcod27 ;
      GXv_char25[0] = AV180Maqcod28 ;
      GXv_char26[0] = AV181Maqcod3 ;
      GXv_char27[0] = AV182Maqcod4 ;
      GXv_char28[0] = AV183Maqcod5 ;
      GXv_char29[0] = AV184Maqcod6 ;
      GXv_char30[0] = AV185Maqcod7 ;
      GXv_char31[0] = AV186Maqcod8 ;
      GXv_char32[0] = AV187Maqcod9 ;
      GXv_char33[0] = AV220Maqdsc1 ;
      GXv_char34[0] = AV221Maqdsc10 ;
      GXv_char35[0] = AV222Maqdsc11 ;
      GXv_char36[0] = AV223Maqdsc12 ;
      GXv_char37[0] = AV224Maqdsc13 ;
      GXv_char38[0] = AV225Maqdsc14 ;
      GXv_char39[0] = AV226Maqdsc15 ;
      GXv_char40[0] = AV227MaqDsc16 ;
      GXv_char41[0] = AV228MaqDsc17 ;
      GXv_char42[0] = AV229MaqDsc18 ;
      GXv_char43[0] = AV230MaqDsc19 ;
      GXv_char44[0] = AV231Maqdsc2 ;
      GXv_char45[0] = AV232MaqDsc20 ;
      GXv_char46[0] = AV233MaqDsc21 ;
      GXv_char47[0] = AV234MaqDsc22 ;
      GXv_char48[0] = AV235MaqDsc23 ;
      GXv_char49[0] = AV236MaqDsc24 ;
      GXv_char50[0] = AV237MaqDsc25 ;
      GXv_char51[0] = AV238MaqDsc26 ;
      GXv_char52[0] = AV239MaqDsc27 ;
      GXv_char53[0] = AV240MaqDsc28 ;
      GXv_char54[0] = AV241Maqdsc3 ;
      GXv_char55[0] = AV242Maqdsc4 ;
      GXv_char56[0] = AV243Maqdsc5 ;
      GXv_char57[0] = AV244Maqdsc6 ;
      GXv_char58[0] = AV245Maqdsc7 ;
      GXv_char59[0] = AV246Maqdsc8 ;
      GXv_char60[0] = AV247Maqdsc9 ;
      GXv_int61[0] = AV327t ;
      new app.pprc204(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char7, GXv_char8, GXv_char9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_char21, GXv_char22, GXv_char23, GXv_char24, GXv_char25, GXv_char26, GXv_char27, GXv_char28, GXv_char29, GXv_char30, GXv_char31, GXv_char32, GXv_char33, GXv_char34, GXv_char35, GXv_char36, GXv_char37, GXv_char38, GXv_char39, GXv_char40, GXv_char41, GXv_char42, GXv_char43, GXv_char44, GXv_char45, GXv_char46, GXv_char47, GXv_char48, GXv_char49, GXv_char50, GXv_char51, GXv_char52, GXv_char53, GXv_char54, GXv_char55, GXv_char56, GXv_char57, GXv_char58, GXv_char59, GXv_char60, AV329Tab_maq, AV248MaqHdrs, GXv_int61) ;
      webwkp107_impl.this.AV60EmprCod = GXv_char4[0] ;
      webwkp107_impl.this.AV160Maqcod1 = GXv_char3[0] ;
      webwkp107_impl.this.AV161MaqCod10 = GXv_char2[0] ;
      webwkp107_impl.this.AV162Maqcod11 = GXv_char7[0] ;
      webwkp107_impl.this.AV163MaqCod12 = GXv_char8[0] ;
      webwkp107_impl.this.AV164Maqcod13 = GXv_char9[0] ;
      webwkp107_impl.this.AV165Maqcod14 = GXv_char10[0] ;
      webwkp107_impl.this.AV166Maqcod15 = GXv_char11[0] ;
      webwkp107_impl.this.AV167Maqcod16 = GXv_char12[0] ;
      webwkp107_impl.this.AV168Maqcod17 = GXv_char13[0] ;
      webwkp107_impl.this.AV169Maqcod18 = GXv_char14[0] ;
      webwkp107_impl.this.AV170Maqcod19 = GXv_char15[0] ;
      webwkp107_impl.this.AV171Maqcod2 = GXv_char16[0] ;
      webwkp107_impl.this.AV172Maqcod20 = GXv_char17[0] ;
      webwkp107_impl.this.AV173Maqcod21 = GXv_char18[0] ;
      webwkp107_impl.this.AV174Maqcod22 = GXv_char19[0] ;
      webwkp107_impl.this.AV175Maqcod23 = GXv_char20[0] ;
      webwkp107_impl.this.AV176Maqcod24 = GXv_char21[0] ;
      webwkp107_impl.this.AV177Maqcod25 = GXv_char22[0] ;
      webwkp107_impl.this.AV178Maqcod26 = GXv_char23[0] ;
      webwkp107_impl.this.AV179Maqcod27 = GXv_char24[0] ;
      webwkp107_impl.this.AV180Maqcod28 = GXv_char25[0] ;
      webwkp107_impl.this.AV181Maqcod3 = GXv_char26[0] ;
      webwkp107_impl.this.AV182Maqcod4 = GXv_char27[0] ;
      webwkp107_impl.this.AV183Maqcod5 = GXv_char28[0] ;
      webwkp107_impl.this.AV184Maqcod6 = GXv_char29[0] ;
      webwkp107_impl.this.AV185Maqcod7 = GXv_char30[0] ;
      webwkp107_impl.this.AV186Maqcod8 = GXv_char31[0] ;
      webwkp107_impl.this.AV187Maqcod9 = GXv_char32[0] ;
      webwkp107_impl.this.AV220Maqdsc1 = GXv_char33[0] ;
      webwkp107_impl.this.AV221Maqdsc10 = GXv_char34[0] ;
      webwkp107_impl.this.AV222Maqdsc11 = GXv_char35[0] ;
      webwkp107_impl.this.AV223Maqdsc12 = GXv_char36[0] ;
      webwkp107_impl.this.AV224Maqdsc13 = GXv_char37[0] ;
      webwkp107_impl.this.AV225Maqdsc14 = GXv_char38[0] ;
      webwkp107_impl.this.AV226Maqdsc15 = GXv_char39[0] ;
      webwkp107_impl.this.AV227MaqDsc16 = GXv_char40[0] ;
      webwkp107_impl.this.AV228MaqDsc17 = GXv_char41[0] ;
      webwkp107_impl.this.AV229MaqDsc18 = GXv_char42[0] ;
      webwkp107_impl.this.AV230MaqDsc19 = GXv_char43[0] ;
      webwkp107_impl.this.AV231Maqdsc2 = GXv_char44[0] ;
      webwkp107_impl.this.AV232MaqDsc20 = GXv_char45[0] ;
      webwkp107_impl.this.AV233MaqDsc21 = GXv_char46[0] ;
      webwkp107_impl.this.AV234MaqDsc22 = GXv_char47[0] ;
      webwkp107_impl.this.AV235MaqDsc23 = GXv_char48[0] ;
      webwkp107_impl.this.AV236MaqDsc24 = GXv_char49[0] ;
      webwkp107_impl.this.AV237MaqDsc25 = GXv_char50[0] ;
      webwkp107_impl.this.AV238MaqDsc26 = GXv_char51[0] ;
      webwkp107_impl.this.AV239MaqDsc27 = GXv_char52[0] ;
      webwkp107_impl.this.AV240MaqDsc28 = GXv_char53[0] ;
      webwkp107_impl.this.AV241Maqdsc3 = GXv_char54[0] ;
      webwkp107_impl.this.AV242Maqdsc4 = GXv_char55[0] ;
      webwkp107_impl.this.AV243Maqdsc5 = GXv_char56[0] ;
      webwkp107_impl.this.AV244Maqdsc6 = GXv_char57[0] ;
      webwkp107_impl.this.AV245Maqdsc7 = GXv_char58[0] ;
      webwkp107_impl.this.AV246Maqdsc8 = GXv_char59[0] ;
      webwkp107_impl.this.AV247Maqdsc9 = GXv_char60[0] ;
      webwkp107_impl.this.AV327t = GXv_int61[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod1_Internalname, AV160Maqcod1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV160Maqcod1, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod10_Internalname, AV161MaqCod10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV161MaqCod10, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod11_Internalname, AV162Maqcod11);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV162Maqcod11, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod12_Internalname, AV163MaqCod12);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV163MaqCod12, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod13_Internalname, AV164Maqcod13);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV164Maqcod13, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod14_Internalname, AV165Maqcod14);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV165Maqcod14, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod15_Internalname, AV166Maqcod15);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV166Maqcod15, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod16_Internalname, AV167Maqcod16);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV167Maqcod16, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod17_Internalname, AV168Maqcod17);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV168Maqcod17, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod18_Internalname, AV169Maqcod18);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV169Maqcod18, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod19_Internalname, AV170Maqcod19);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV170Maqcod19, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod2_Internalname, AV171Maqcod2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV171Maqcod2, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod20_Internalname, AV172Maqcod20);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV172Maqcod20, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod21_Internalname, AV173Maqcod21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV173Maqcod21, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod22_Internalname, AV174Maqcod22);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV174Maqcod22, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod23_Internalname, AV175Maqcod23);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV175Maqcod23, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod24_Internalname, AV176Maqcod24);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV176Maqcod24, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod25_Internalname, AV177Maqcod25);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV177Maqcod25, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod26_Internalname, AV178Maqcod26);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV178Maqcod26, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod27_Internalname, AV179Maqcod27);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV179Maqcod27, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod28_Internalname, AV180Maqcod28);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV180Maqcod28, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod3_Internalname, AV181Maqcod3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV181Maqcod3, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod4_Internalname, AV182Maqcod4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV182Maqcod4, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod5_Internalname, AV183Maqcod5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV183Maqcod5, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod6_Internalname, AV184Maqcod6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV184Maqcod6, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod7_Internalname, AV185Maqcod7);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV185Maqcod7, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod8_Internalname, AV186Maqcod8);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV186Maqcod8, ""))));
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod9_Internalname, AV187Maqcod9);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV187Maqcod9, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV220Maqdsc1", AV220Maqdsc1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV220Maqdsc1, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV221Maqdsc10", AV221Maqdsc10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221Maqdsc10, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV222Maqdsc11", AV222Maqdsc11);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Maqdsc11, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV223Maqdsc12", AV223Maqdsc12);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223Maqdsc12, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV224Maqdsc13", AV224Maqdsc13);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224Maqdsc13, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV225Maqdsc14", AV225Maqdsc14);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc14, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV226Maqdsc15", AV226Maqdsc15);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc15, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV227MaqDsc16", AV227MaqDsc16);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227MaqDsc16, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV228MaqDsc17", AV228MaqDsc17);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228MaqDsc17, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV229MaqDsc18", AV229MaqDsc18);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229MaqDsc18, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV230MaqDsc19", AV230MaqDsc19);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230MaqDsc19, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV231Maqdsc2", AV231Maqdsc2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc2, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV232MaqDsc20", AV232MaqDsc20);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc20, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV233MaqDsc21", AV233MaqDsc21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc21, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV234MaqDsc22", AV234MaqDsc22);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc22, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV235MaqDsc23", AV235MaqDsc23);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc23, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV236MaqDsc24", AV236MaqDsc24);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236MaqDsc24, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV237MaqDsc25", AV237MaqDsc25);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc25, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV238MaqDsc26", AV238MaqDsc26);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc26, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV239MaqDsc27", AV239MaqDsc27);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc27, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV240MaqDsc28", AV240MaqDsc28);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc28, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV241Maqdsc3", AV241Maqdsc3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241Maqdsc3, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV242Maqdsc4", AV242Maqdsc4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242Maqdsc4, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV243Maqdsc5", AV243Maqdsc5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243Maqdsc5, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV244Maqdsc6", AV244Maqdsc6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244Maqdsc6, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV245Maqdsc7", AV245Maqdsc7);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245Maqdsc7, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV246Maqdsc8", AV246Maqdsc8);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc8, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV247Maqdsc9", AV247Maqdsc9);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc9, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV327t", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV327t), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV327t), "ZZZ9")));
      System.out.println( httpContext.getMessage( "Presentamos DATOS", "") );
      AV103i = (short)(1) ;
      while ( AV103i <= 28 )
      {
         if ( GXutil.strcmp(AV329Tab_maq[AV103i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV159Maqcod = AV329Tab_maq[AV103i-1] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV159Maqcod", AV159Maqcod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159Maqcod, ""))));
         /* Execute user subroutine: 'CARGOHDRS' */
         S112 ();
         if (returnInSub) return;
         AV103i = (short)(AV103i+1) ;
      }
      GXv_char60[0] = AV353Maquinastxt ;
      GXv_char59[0] = AV356MaquinasHdrstxt ;
      new app.creoarchivofvectormatriz(remoteHandle, context).execute( AV329Tab_maq, AV248MaqHdrs, GXv_char60, GXv_char59) ;
      webwkp107_impl.this.AV353Maquinastxt = GXv_char60[0] ;
      webwkp107_impl.this.AV356MaquinasHdrstxt = GXv_char59[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV353Maquinastxt", AV353Maquinastxt);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV353Maquinastxt, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV356MaquinasHdrstxt", AV356MaquinasHdrstxt);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQUINASHDRSTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV356MaquinasHdrstxt, ""))));
      edtavHdr1_Title = AV220Maqdsc1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Title", edtavHdr1_Title, !bGXsfl_17_Refreshing);
      edtavHdr2_Title = AV231Maqdsc2 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Title", edtavHdr2_Title, !bGXsfl_17_Refreshing);
      edtavHdr3_Title = AV241Maqdsc3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Title", edtavHdr3_Title, !bGXsfl_17_Refreshing);
      edtavHdr4_Title = AV242Maqdsc4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Title", edtavHdr4_Title, !bGXsfl_17_Refreshing);
      edtavHdr5_Title = AV243Maqdsc5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Title", edtavHdr5_Title, !bGXsfl_17_Refreshing);
      edtavHdr6_Title = AV244Maqdsc6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Title", edtavHdr6_Title, !bGXsfl_17_Refreshing);
      edtavHdr7_Title = AV245Maqdsc7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Title", edtavHdr7_Title, !bGXsfl_17_Refreshing);
      edtavHdr8_Title = AV246Maqdsc8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Title", edtavHdr8_Title, !bGXsfl_17_Refreshing);
      edtavHdr9_Title = AV247Maqdsc9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Title", edtavHdr9_Title, !bGXsfl_17_Refreshing);
      edtavHdr10_Title = AV221Maqdsc10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Title", edtavHdr10_Title, !bGXsfl_17_Refreshing);
      edtavHdr11_Title = AV222Maqdsc11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Title", edtavHdr11_Title, !bGXsfl_17_Refreshing);
      edtavHdr12_Title = AV223Maqdsc12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Title", edtavHdr12_Title, !bGXsfl_17_Refreshing);
      edtavHdr13_Title = AV224Maqdsc13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Title", edtavHdr13_Title, !bGXsfl_17_Refreshing);
      edtavHdr14_Title = AV225Maqdsc14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Title", edtavHdr14_Title, !bGXsfl_17_Refreshing);
      edtavHdr15_Title = AV226Maqdsc15 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Title", edtavHdr15_Title, !bGXsfl_17_Refreshing);
      edtavHdr16_Title = AV227MaqDsc16 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Title", edtavHdr16_Title, !bGXsfl_17_Refreshing);
      edtavHdr17_Title = AV228MaqDsc17 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Title", edtavHdr17_Title, !bGXsfl_17_Refreshing);
      edtavHdr18_Title = AV229MaqDsc18 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Title", edtavHdr18_Title, !bGXsfl_17_Refreshing);
      edtavHdr19_Title = AV230MaqDsc19 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Title", edtavHdr19_Title, !bGXsfl_17_Refreshing);
      edtavHdr20_Title = AV232MaqDsc20 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Title", edtavHdr20_Title, !bGXsfl_17_Refreshing);
      edtavHdr21_Title = AV233MaqDsc21 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Title", edtavHdr21_Title, !bGXsfl_17_Refreshing);
      edtavHdr22_Title = AV234MaqDsc22 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Title", edtavHdr22_Title, !bGXsfl_17_Refreshing);
      edtavHdr23_Title = AV235MaqDsc23 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Title", edtavHdr23_Title, !bGXsfl_17_Refreshing);
      edtavHdr24_Title = AV236MaqDsc24 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Title", edtavHdr24_Title, !bGXsfl_17_Refreshing);
      edtavHdr25_Title = AV237MaqDsc25 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Title", edtavHdr25_Title, !bGXsfl_17_Refreshing);
      edtavHdr26_Title = AV238MaqDsc26 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Title", edtavHdr26_Title, !bGXsfl_17_Refreshing);
      edtavHdr27_Title = AV239MaqDsc27 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Title", edtavHdr27_Title, !bGXsfl_17_Refreshing);
      edtavHdr28_Title = AV240MaqDsc28 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Title", edtavHdr28_Title, !bGXsfl_17_Refreshing);
      System.out.println( " " );
      GXt_int5 = AV256NospMaq ;
      GXv_char60[0] = AV60EmprCod ;
      GXv_char59[0] = httpContext.getMessage( "NOSMAQ", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char60, GXv_char59, GXv_int6) ;
      webwkp107_impl.this.AV60EmprCod = GXv_char60[0] ;
      webwkp107_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
      AV256NospMaq = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV256NospMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV256NospMaq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOSPMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV256NospMaq), "ZZZ9")));
      AV256NospMaq = (short)(((0==AV256NospMaq) ? 3 : AV256NospMaq)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV256NospMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV256NospMaq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOSPMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV256NospMaq), "ZZZ9")));
      /*  Sending Event outputs  */
   }

   private void e14AL2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV261Partidas = DecimalUtil.doubleToDec(1) ;
      AV105k = (short)(2) ;
      while ( AV105k <= 26 )
      {
         AV104j = (short)(1) ;
         while ( AV104j <= 28 )
         {
            AV332Texto = AV248MaqHdrs[AV104j-1][AV105k-1] ;
            AV71Hdr = GXutil.substring( AV332Texto, 27, 11) ;
            AV344EstadoFasegrid = " " ;
            AV345Rgb = 16777215 ;
            GXv_int62[0] = AV345Rgb ;
            GXv_int61[0] = AV290R ;
            GXv_int63[0] = AV69G ;
            GXv_int64[0] = AV6B ;
            new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int61, GXv_int63, GXv_int64) ;
            webwkp107_impl.this.AV345Rgb = GXv_int62[0] ;
            webwkp107_impl.this.AV290R = GXv_int61[0] ;
            webwkp107_impl.this.AV69G = GXv_int63[0] ;
            webwkp107_impl.this.AV6B = GXv_int64[0] ;
            if ( GXutil.strcmp(AV71Hdr, " ") != 0 )
            {
               AV9Barcod = (int)(GXutil.lval( GXutil.substring( AV71Hdr, 1, 8))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
               AV17Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV71Hdr, 10, 1))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Barcodreo", GXutil.str( AV17Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
               AV13Barcodpar = GXutil.substring( AV71Hdr, 11, 1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodpar", AV13Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
               GXv_char60[0] = AV60EmprCod ;
               GXv_int6[0] = AV9Barcod ;
               GXv_int65[0] = AV17Barcodreo ;
               GXv_char59[0] = AV13Barcodpar ;
               GXv_int66[0] = AV31BarFasestGrid1 ;
               new app.pcp0999(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int65, GXv_char59, GXv_int66) ;
               webwkp107_impl.this.AV60EmprCod = GXv_char60[0] ;
               webwkp107_impl.this.AV9Barcod = GXv_int6[0] ;
               webwkp107_impl.this.AV17Barcodreo = GXv_int65[0] ;
               webwkp107_impl.this.AV13Barcodpar = GXv_char59[0] ;
               webwkp107_impl.this.AV31BarFasestGrid1 = GXv_int66[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17Barcodreo", GXutil.str( AV17Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodpar", AV13Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
               AV344EstadoFasegrid = ((AV31BarFasestGrid1==9) ? httpContext.getMessage( "TIN:-", "") : httpContext.getMessage( "TIN:", "")+GXutil.str( AV31BarFasestGrid1, 1, 0)) ;
               AV345Rgb = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               GXv_int62[0] = AV345Rgb ;
               GXv_int64[0] = AV290R ;
               GXv_int63[0] = AV69G ;
               GXv_int61[0] = AV6B ;
               new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int64, GXv_int63, GXv_int61) ;
               webwkp107_impl.this.AV345Rgb = GXv_int62[0] ;
               webwkp107_impl.this.AV290R = GXv_int64[0] ;
               webwkp107_impl.this.AV69G = GXv_int63[0] ;
               webwkp107_impl.this.AV6B = GXv_int61[0] ;
               GXv_int62[0] = AV345Rgb ;
               GXv_int64[0] = AV291R2 ;
               GXv_int63[0] = AV70G2 ;
               GXv_int61[0] = AV7B2 ;
               new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int64, GXv_int63, GXv_int61) ;
               webwkp107_impl.this.AV345Rgb = GXv_int62[0] ;
               webwkp107_impl.this.AV291R2 = GXv_int64[0] ;
               webwkp107_impl.this.AV70G2 = GXv_int63[0] ;
               webwkp107_impl.this.AV7B2 = GXv_int61[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV291R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV291R2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV291R2), "ZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV70G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70G2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70G2), "ZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV7B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")));
               AV251Min = ((AV291R2<AV70G2) ? ((AV291R2<AV7B2) ? DecimalUtil.doubleToDec(AV291R2) : DecimalUtil.doubleToDec(AV7B2)) : ((AV70G2<AV7B2) ? DecimalUtil.doubleToDec(AV70G2) : DecimalUtil.doubleToDec(AV7B2))) ;
               AV250Max = ((AV291R2>AV70G2) ? ((AV291R2>AV7B2) ? DecimalUtil.doubleToDec(AV291R2) : DecimalUtil.doubleToDec(AV7B2)) : ((AV70G2>AV7B2) ? DecimalUtil.doubleToDec(AV70G2) : DecimalUtil.doubleToDec(AV7B2))) ;
               AV106L = (AV251Min.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN).add(AV250Max.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
               if ( DecimalUtil.compareTo(AV106L, DecimalUtil.stringToDec("0.5")) >= 0 )
               {
                  AV291R2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV291R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV291R2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV291R2), "ZZ9")));
                  AV7B2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV7B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")));
                  AV70G2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV70G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70G2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70G2), "ZZ9")));
               }
               else
               {
                  AV291R2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV291R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV291R2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV291R2), "ZZ9")));
                  AV7B2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV7B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")));
                  AV70G2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV70G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70G2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70G2), "ZZ9")));
               }
            }
            AV71Hdr = ((GXutil.strcmp("", AV332Texto)==0) ? " " : httpContext.getMessage( "Os ", "")+AV71Hdr) ;
            AV47Cant = GXutil.ltrim( GXutil.rtrim( GXutil.substring( AV332Texto, 38, 10))) ;
            AV47Cant = ((GXutil.strcmp("", AV47Cant)==0) ? " " : AV47Cant+httpContext.getMessage( " kg", "")) ;
            if ( AV104j == 1 )
            {
               AV72Hdr1 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV72Hdr1);
               AV72Hdr1 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV72Hdr1);
               AV72Hdr1 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV72Hdr1);
               AV72Hdr1 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV72Hdr1);
               AV72Hdr1 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV72Hdr1);
               AV107Linea1 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea1_Internalname, AV107Linea1);
               AV294Rgb1 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV160Maqcod1 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod1_Internalname, AV160Maqcod1);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV160Maqcod1, ""))));
               AV191MaqCodRc1 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr1_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr1_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 2 )
            {
               AV83Hdr2 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
               AV83Hdr2 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
               AV83Hdr2 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
               AV83Hdr2 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
               AV83Hdr2 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
               AV118Linea2 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea2_Internalname, AV118Linea2);
               AV305Rgb2 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV171Maqcod2 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod2_Internalname, AV171Maqcod2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV171Maqcod2, ""))));
               AV202MaqCodRc2 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr2_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr3_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 3 )
            {
               AV93Hdr3 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV93Hdr3);
               AV93Hdr3 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV93Hdr3);
               AV93Hdr3 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV93Hdr3);
               AV93Hdr3 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV93Hdr3);
               AV93Hdr3 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV93Hdr3);
               AV128Linea3 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea3_Internalname, AV128Linea3);
               AV315Rgb3 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV181Maqcod3 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod3_Internalname, AV181Maqcod3);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV181Maqcod3, ""))));
               AV212MaqCodRc3 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr3_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr3_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 4 )
            {
               AV94Hdr4 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV94Hdr4);
               AV94Hdr4 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV94Hdr4);
               AV94Hdr4 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV94Hdr4);
               AV94Hdr4 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV94Hdr4);
               AV94Hdr4 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV94Hdr4);
               AV129Linea4 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea4_Internalname, AV129Linea4);
               AV316Rgb4 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV182Maqcod4 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod4_Internalname, AV182Maqcod4);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV182Maqcod4, ""))));
               AV213MaqCodRc4 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr4_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr4_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 5 )
            {
               AV95Hdr5 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV95Hdr5);
               AV95Hdr5 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV95Hdr5);
               AV95Hdr5 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV95Hdr5);
               AV95Hdr5 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV95Hdr5);
               AV95Hdr5 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV95Hdr5);
               AV130Linea5 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea5_Internalname, AV130Linea5);
               AV317Rgb5 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV183Maqcod5 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod5_Internalname, AV183Maqcod5);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV183Maqcod5, ""))));
               AV214MaqCodRc5 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr5_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr5_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 6 )
            {
               AV96Hdr6 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV96Hdr6);
               AV96Hdr6 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV96Hdr6);
               AV96Hdr6 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV96Hdr6);
               AV96Hdr6 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV96Hdr6);
               AV96Hdr6 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV96Hdr6);
               AV131Linea6 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea6_Internalname, AV131Linea6);
               AV318Rgb6 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV184Maqcod6 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod6_Internalname, AV184Maqcod6);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV184Maqcod6, ""))));
               AV215MaqCodRc6 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr6_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr6_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 7 )
            {
               AV97Hdr7 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV97Hdr7);
               AV97Hdr7 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV97Hdr7);
               AV97Hdr7 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV97Hdr7);
               AV97Hdr7 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV97Hdr7);
               AV97Hdr7 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV97Hdr7);
               AV132Linea7 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea7_Internalname, AV132Linea7);
               AV319Rgb7 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV185Maqcod7 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod7_Internalname, AV185Maqcod7);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV185Maqcod7, ""))));
               AV216MaqCodRc7 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr7_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr7_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 8 )
            {
               AV98Hdr8 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV98Hdr8);
               AV98Hdr8 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV98Hdr8);
               AV98Hdr8 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV98Hdr8);
               AV98Hdr8 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV98Hdr8);
               AV98Hdr8 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV98Hdr8);
               AV133LInea8 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea8_Internalname, AV133LInea8);
               AV320Rgb8 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV186Maqcod8 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod8_Internalname, AV186Maqcod8);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV186Maqcod8, ""))));
               AV217MaqCodRc8 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr8_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr8_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 9 )
            {
               AV99Hdr9 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV99Hdr9);
               AV99Hdr9 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV99Hdr9);
               AV99Hdr9 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV99Hdr9);
               AV99Hdr9 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV99Hdr9);
               AV99Hdr9 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV99Hdr9);
               AV134Linea9 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea9_Internalname, AV134Linea9);
               AV321Rgb9 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV187Maqcod9 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod9_Internalname, AV187Maqcod9);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV187Maqcod9, ""))));
               AV218MaqCodRc9 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr9_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr9_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 10 )
            {
               AV73Hdr10 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV73Hdr10);
               AV73Hdr10 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV73Hdr10);
               AV73Hdr10 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV73Hdr10);
               AV73Hdr10 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV73Hdr10);
               AV73Hdr10 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV73Hdr10);
               AV108Linea10 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea10_Internalname, AV108Linea10);
               AV295Rgb10 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV161MaqCod10 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod10_Internalname, AV161MaqCod10);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV161MaqCod10, ""))));
               AV192MaqCodRc10 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr10_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr10_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 11 )
            {
               AV74Hdr11 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV74Hdr11);
               AV74Hdr11 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV74Hdr11);
               AV74Hdr11 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV74Hdr11);
               AV74Hdr11 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV74Hdr11);
               AV74Hdr11 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV74Hdr11);
               AV109Linea11 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea11_Internalname, AV109Linea11);
               AV296Rgb11 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV162Maqcod11 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod11_Internalname, AV162Maqcod11);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV162Maqcod11, ""))));
               AV193MaqCodRc11 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr11_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr11_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 12 )
            {
               AV75Hdr12 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV75Hdr12);
               AV75Hdr12 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV75Hdr12);
               AV75Hdr12 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV75Hdr12);
               AV75Hdr12 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV75Hdr12);
               AV75Hdr12 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV75Hdr12);
               AV110Linea12 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea12_Internalname, AV110Linea12);
               AV297Rgb12 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV163MaqCod12 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod12_Internalname, AV163MaqCod12);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV163MaqCod12, ""))));
               AV194MaqCodRc12 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr12_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr12_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 13 )
            {
               AV76Hdr13 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV76Hdr13);
               AV76Hdr13 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV76Hdr13);
               AV76Hdr13 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV76Hdr13);
               AV76Hdr13 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV76Hdr13);
               AV76Hdr13 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV76Hdr13);
               AV111Linea13 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea13_Internalname, AV111Linea13);
               AV298Rgb13 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV164Maqcod13 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod13_Internalname, AV164Maqcod13);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV164Maqcod13, ""))));
               AV195MaqCodRc13 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr13_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr13_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 14 )
            {
               AV77Hdr14 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV77Hdr14);
               AV77Hdr14 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV77Hdr14);
               AV77Hdr14 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV77Hdr14);
               AV77Hdr14 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV77Hdr14);
               AV77Hdr14 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV77Hdr14);
               AV112Linea14 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea14_Internalname, AV112Linea14);
               AV299Rgb14 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV165Maqcod14 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod14_Internalname, AV165Maqcod14);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV165Maqcod14, ""))));
               AV196MaqCodRc14 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr14_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr14_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 15 )
            {
               AV78Hdr15 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV78Hdr15);
               AV78Hdr15 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV78Hdr15);
               AV78Hdr15 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV78Hdr15);
               AV78Hdr15 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV78Hdr15);
               AV78Hdr15 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV78Hdr15);
               AV113Linea15 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea15_Internalname, AV113Linea15);
               AV300Rgb15 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV166Maqcod15 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod15_Internalname, AV166Maqcod15);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV166Maqcod15, ""))));
               AV214MaqCodRc5 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr15_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr15_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 16 )
            {
               AV79Hdr16 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV79Hdr16);
               AV79Hdr16 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV79Hdr16);
               AV79Hdr16 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV79Hdr16);
               AV79Hdr16 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV79Hdr16);
               AV79Hdr16 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV79Hdr16);
               AV114Linea16 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea16_Internalname, AV114Linea16);
               AV301Rgb16 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV167Maqcod16 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod16_Internalname, AV167Maqcod16);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV167Maqcod16, ""))));
               AV198MaqCodRc16 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr16_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr16_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 17 )
            {
               AV80Hdr17 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV80Hdr17);
               AV80Hdr17 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV80Hdr17);
               AV80Hdr17 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV80Hdr17);
               AV80Hdr17 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV80Hdr17);
               AV83Hdr2 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV83Hdr2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDR2"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV83Hdr2, ""))));
               AV115Linea17 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea17_Internalname, AV115Linea17);
               AV302Rgb17 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV168Maqcod17 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod17_Internalname, AV168Maqcod17);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV168Maqcod17, ""))));
               AV199MaqCodRc17 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr17_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr17_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 18 )
            {
               AV81Hdr18 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV81Hdr18);
               AV81Hdr18 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV81Hdr18);
               AV81Hdr18 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV81Hdr18);
               AV81Hdr18 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV81Hdr18);
               AV81Hdr18 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV81Hdr18);
               AV116Linea18 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea18_Internalname, AV116Linea18);
               AV303Rgb18 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV169Maqcod18 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod18_Internalname, AV169Maqcod18);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV169Maqcod18, ""))));
               AV200MaqCodRc18 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr18_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr18_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 19 )
            {
               AV82Hdr19 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV82Hdr19);
               AV82Hdr19 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV82Hdr19);
               AV82Hdr19 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV82Hdr19);
               AV82Hdr19 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV82Hdr19);
               AV82Hdr19 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV82Hdr19);
               AV117Linea19 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea19_Internalname, AV117Linea19);
               AV304Rgb19 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV170Maqcod19 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod19_Internalname, AV170Maqcod19);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV170Maqcod19, ""))));
               AV201MaqCodRc19 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr19_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr19_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 20 )
            {
               AV84Hdr20 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV84Hdr20);
               AV84Hdr20 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV84Hdr20);
               AV84Hdr20 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV84Hdr20);
               AV84Hdr20 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV84Hdr20);
               AV84Hdr20 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV84Hdr20);
               AV119Linea20 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea20_Internalname, AV119Linea20);
               AV306Rgb20 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV172Maqcod20 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod20_Internalname, AV172Maqcod20);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV172Maqcod20, ""))));
               AV203MaqCodRc20 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr20_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr20_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 21 )
            {
               AV85Hdr21 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV85Hdr21);
               AV85Hdr21 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV85Hdr21);
               AV85Hdr21 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV85Hdr21);
               AV85Hdr21 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV85Hdr21);
               AV85Hdr21 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV85Hdr21);
               AV120Linea21 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea21_Internalname, AV120Linea21);
               AV307Rgb21 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV173Maqcod21 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod21_Internalname, AV173Maqcod21);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV173Maqcod21, ""))));
               AV204MaqCodRc21 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr21_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr21_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 22 )
            {
               AV86Hdr22 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV86Hdr22);
               AV86Hdr22 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV86Hdr22);
               AV86Hdr22 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV86Hdr22);
               AV86Hdr22 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV86Hdr22);
               AV86Hdr22 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV86Hdr22);
               AV121Linea22 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea22_Internalname, AV121Linea22);
               AV308Rgb22 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV174Maqcod22 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod22_Internalname, AV174Maqcod22);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV174Maqcod22, ""))));
               AV205MaqCodRc22 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr22_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr22_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 23 )
            {
               AV87Hdr23 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV87Hdr23);
               AV87Hdr23 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV87Hdr23);
               AV87Hdr23 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV87Hdr23);
               AV87Hdr23 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV87Hdr23);
               AV87Hdr23 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV87Hdr23);
               AV122Linea23 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea23_Internalname, AV122Linea23);
               AV309Rgb23 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV175Maqcod23 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod23_Internalname, AV175Maqcod23);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV175Maqcod23, ""))));
               AV206MaqCodRc23 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr23_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr23_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 24 )
            {
               AV88Hdr24 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV88Hdr24);
               AV88Hdr24 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV88Hdr24);
               AV88Hdr24 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV88Hdr24);
               AV88Hdr24 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV88Hdr24);
               AV88Hdr24 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV88Hdr24);
               AV123Linea24 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea24_Internalname, AV123Linea24);
               AV310Rgb24 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV176Maqcod24 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod24_Internalname, AV176Maqcod24);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV176Maqcod24, ""))));
               AV207MaqCodRc24 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr24_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr24_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 25 )
            {
               AV89Hdr25 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV89Hdr25);
               AV89Hdr25 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV89Hdr25);
               AV89Hdr25 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV89Hdr25);
               AV89Hdr25 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV89Hdr25);
               AV89Hdr25 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV89Hdr25);
               AV124Linea25 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea25_Internalname, AV124Linea25);
               AV311Rgb25 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV177Maqcod25 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod25_Internalname, AV177Maqcod25);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV177Maqcod25, ""))));
               AV208MaqCodRc25 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr25_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr25_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 26 )
            {
               AV90Hdr26 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV90Hdr26);
               AV90Hdr26 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV90Hdr26);
               AV90Hdr26 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV90Hdr26);
               AV90Hdr26 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV90Hdr26);
               AV90Hdr26 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV90Hdr26);
               AV125Linea26 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea26_Internalname, AV125Linea26);
               AV312Rgb26 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV178Maqcod26 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod26_Internalname, AV178Maqcod26);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV178Maqcod26, ""))));
               AV209MaqCodRc26 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr26_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr26_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 27 )
            {
               AV91Hdr27 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV91Hdr27);
               AV91Hdr27 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV91Hdr27);
               AV91Hdr27 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV91Hdr27);
               AV91Hdr27 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV91Hdr27);
               AV91Hdr27 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV91Hdr27);
               AV126Linea27 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea27_Internalname, AV126Linea27);
               AV313Rgb27 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV179Maqcod27 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod27_Internalname, AV179Maqcod27);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV179Maqcod27, ""))));
               AV210MaqCodRc27 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr27_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr27_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            else if ( AV104j == 28 )
            {
               AV92Hdr28 = GXutil.substring( AV332Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV92Hdr28);
               AV92Hdr28 += GXutil.substring( AV332Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV92Hdr28);
               AV92Hdr28 += AV71Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV92Hdr28);
               AV92Hdr28 += AV47Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV92Hdr28);
               AV92Hdr28 += AV344EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV92Hdr28);
               AV127Linea28 = AV332Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea28_Internalname, AV127Linea28);
               AV314Rgb28 = ((GXutil.strcmp("", AV332Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV332Texto, 50, 10), ".")))) ;
               AV180Maqcod28 = AV329Tab_maq[AV104j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod28_Internalname, AV180Maqcod28);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV180Maqcod28, ""))));
               AV211MaqCodRc28 = GXutil.substring( AV332Texto, 59, 6) ;
               edtavHdr28_Backcolor = GXutil.getColor( AV290R, AV69G, AV6B) ;
               edtavHdr28_Forecolor = GXutil.getColor( AV291R2, AV70G2, AV7B2) ;
            }
            AV104j = (short)(AV104j+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(17) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( 50 == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_172( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
         {
            httpContext.doAjaxLoad(17, GridRow);
         }
         AV105k = (short)(AV105k+1) ;
         AV261Partidas = AV261Partidas.add(DecimalUtil.doubleToDec(1)) ;
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CARGOHDRS' Routine */
      returnInSub = false ;
      AV341Archivo.openRead("");
      AV104j = (short)(2) ;
      AV333Texto_l = AV341Archivo.readLine() ;
      while ( ! AV341Archivo.getEof() )
      {
         AV333Texto_l = ((GXutil.len( AV333Texto_l)<=0) ? httpContext.getMessage( "FIN", "") : AV333Texto_l) ;
         if ( GXutil.strcmp(AV333Texto_l, httpContext.getMessage( "FIN", "")) == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV159Maqcod, GXutil.substring( AV333Texto_l, 7, 6)) == 0 )
         {
            AV9Barcod = (int)(GXutil.lval( GXutil.substring( AV333Texto_l, 13, 8))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
            AV17Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV333Texto_l, 22, 1))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Barcodreo", GXutil.str( AV17Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
            AV13Barcodpar = (GXutil.substring( AV333Texto_l, 23, 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodpar", AV13Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
            /* Execute user subroutine: 'BARFAS' */
            S122 ();
            if (returnInSub) return;
            GXv_char60[0] = AV60EmprCod ;
            GXv_int6[0] = AV9Barcod ;
            GXv_int66[0] = AV17Barcodreo ;
            GXv_char59[0] = AV13Barcodpar ;
            GXv_int64[0] = AV40Barordlin ;
            GXv_char58[0] = " " ;
            GXv_int65[0] = AV29Barfasestant ;
            GXv_char57[0] = " " ;
            GXv_int63[0] = (short)(0) ;
            GXv_char56[0] = " " ;
            GXv_int67[0] = (byte)(0) ;
            GXv_char55[0] = " " ;
            GXv_int61[0] = (short)(0) ;
            new app.pprc39(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int66, GXv_char59, GXv_int64, GXv_char58, GXv_int65, GXv_char57, GXv_int63, GXv_char56, GXv_int67, GXv_char55, GXv_int61) ;
            webwkp107_impl.this.AV60EmprCod = GXv_char60[0] ;
            webwkp107_impl.this.AV9Barcod = GXv_int6[0] ;
            webwkp107_impl.this.AV17Barcodreo = GXv_int66[0] ;
            webwkp107_impl.this.AV13Barcodpar = GXv_char59[0] ;
            webwkp107_impl.this.AV40Barordlin = GXv_int64[0] ;
            webwkp107_impl.this.AV29Barfasestant = GXv_int65[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV17Barcodreo", GXutil.str( AV17Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodpar", AV13Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV40Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV29Barfasestant", GXutil.str( AV29Barfasestant, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Barfasestant), "9")));
            GXv_char60[0] = AV60EmprCod ;
            GXv_int6[0] = AV9Barcod ;
            GXv_int67[0] = AV17Barcodreo ;
            GXv_char59[0] = AV13Barcodpar ;
            GXv_int66[0] = AV27BarFasEst ;
            GXv_date68[0] = AV65fecha ;
            GXv_char58[0] = AV188MaqCodBis ;
            new app.pplat07(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int67, GXv_char59, GXv_int66, GXv_date68, GXv_char58) ;
            webwkp107_impl.this.AV60EmprCod = GXv_char60[0] ;
            webwkp107_impl.this.AV9Barcod = GXv_int6[0] ;
            webwkp107_impl.this.AV17Barcodreo = GXv_int67[0] ;
            webwkp107_impl.this.AV13Barcodpar = GXv_char59[0] ;
            webwkp107_impl.this.AV27BarFasEst = GXv_int66[0] ;
            webwkp107_impl.this.AV65fecha = GXv_date68[0] ;
            webwkp107_impl.this.AV188MaqCodBis = GXv_char58[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCod", AV60EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV17Barcodreo", GXutil.str( AV17Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodpar", AV13Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Barcodpar, ""))));
            if ( AV27BarFasEst < 2 )
            {
               AV332Texto = GXutil.substring( AV333Texto_l, 24, 13) ;
               AV332Texto = ((GXutil.strcmp("", AV332Texto)==0) ? "."+GXutil.space( (short)(12)) : AV332Texto) ;
               AV334Texto1 = AV332Texto ;
               AV332Texto = GXutil.substring( AV333Texto_l, 37, 13) ;
               AV332Texto = ((GXutil.strcmp("", AV332Texto)==0) ? "."+GXutil.space( (short)(12)) : AV332Texto) ;
               AV334Texto1 += AV332Texto ;
               AV332Texto = GXutil.str( AV9Barcod, 8, 0) + "-" + GXutil.str( AV17Barcodreo, 1, 0) + AV13Barcodpar ;
               AV332Texto = ((GXutil.strcmp("", AV332Texto)==0) ? "."+GXutil.space( (short)(9)) : AV332Texto) ;
               AV334Texto1 += AV332Texto ;
               AV332Texto = GXutil.substring( AV333Texto_l, 50, 10) ;
               AV332Texto = ((GXutil.strcmp("", AV332Texto)==0) ? "."+GXutil.space( (short)(9)) : AV332Texto) ;
               AV334Texto1 += AV332Texto ;
               AV332Texto = " " ;
               AV334Texto1 += AV332Texto ;
               AV332Texto = GXutil.substring( AV333Texto_l, 60, 10) ;
               AV334Texto1 += AV332Texto ;
               AV332Texto = GXutil.substring( AV333Texto_l, 1, 6) ;
               AV334Texto1 += AV332Texto ;
               AV248MaqHdrs[AV103i-1][AV104j-1] = AV334Texto1 ;
               AV104j = (short)(AV104j+1) ;
            }
         }
         AV333Texto_l = AV341Archivo.readLine() ;
      }
      AV341Archivo.close();
   }

   public void S122( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV40Barordlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barordlin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")));
      AV62EstadoFaseHdr = (byte)(0) ;
      /* Using cursor H00AL2 */
      pr_default.execute(0, new Object[] {AV60EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV17Barcodreo), AV13Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = H00AL2_A153BarFasEst[0] ;
         A150BarFacTin = H00AL2_A150BarFacTin[0] ;
         A130BarCodPar = H00AL2_A130BarCodPar[0] ;
         A132BarCodReo = H00AL2_A132BarCodReo[0] ;
         A129BarCod = H00AL2_A129BarCod[0] ;
         A396EmprCod = H00AL2_A396EmprCod[0] ;
         A194BarOrdLin = H00AL2_A194BarOrdLin[0] ;
         AV40Barordlin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barordlin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")));
         AV62EstadoFaseHdr = A153BarFasEst ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
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
      paAL2( ) ;
      wsAL2( ) ;
      weAL2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016405459", true, true);
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
         httpContext.AddJavascriptSource("webwkp107.js", "?202661016405460", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      edtavHdr1_Internalname = "vHDR1_"+sGXsfl_17_idx ;
      edtavHdr2_Internalname = "vHDR2_"+sGXsfl_17_idx ;
      edtavHdr3_Internalname = "vHDR3_"+sGXsfl_17_idx ;
      edtavHdr4_Internalname = "vHDR4_"+sGXsfl_17_idx ;
      edtavHdr5_Internalname = "vHDR5_"+sGXsfl_17_idx ;
      edtavHdr6_Internalname = "vHDR6_"+sGXsfl_17_idx ;
      edtavHdr7_Internalname = "vHDR7_"+sGXsfl_17_idx ;
      edtavHdr8_Internalname = "vHDR8_"+sGXsfl_17_idx ;
      edtavHdr9_Internalname = "vHDR9_"+sGXsfl_17_idx ;
      edtavHdr10_Internalname = "vHDR10_"+sGXsfl_17_idx ;
      edtavHdr11_Internalname = "vHDR11_"+sGXsfl_17_idx ;
      edtavHdr12_Internalname = "vHDR12_"+sGXsfl_17_idx ;
      edtavHdr13_Internalname = "vHDR13_"+sGXsfl_17_idx ;
      edtavHdr14_Internalname = "vHDR14_"+sGXsfl_17_idx ;
      edtavHdr15_Internalname = "vHDR15_"+sGXsfl_17_idx ;
      edtavHdr16_Internalname = "vHDR16_"+sGXsfl_17_idx ;
      edtavHdr17_Internalname = "vHDR17_"+sGXsfl_17_idx ;
      edtavHdr18_Internalname = "vHDR18_"+sGXsfl_17_idx ;
      edtavHdr19_Internalname = "vHDR19_"+sGXsfl_17_idx ;
      edtavHdr20_Internalname = "vHDR20_"+sGXsfl_17_idx ;
      edtavHdr21_Internalname = "vHDR21_"+sGXsfl_17_idx ;
      edtavHdr22_Internalname = "vHDR22_"+sGXsfl_17_idx ;
      edtavHdr23_Internalname = "vHDR23_"+sGXsfl_17_idx ;
      edtavHdr24_Internalname = "vHDR24_"+sGXsfl_17_idx ;
      edtavHdr25_Internalname = "vHDR25_"+sGXsfl_17_idx ;
      edtavHdr26_Internalname = "vHDR26_"+sGXsfl_17_idx ;
      edtavHdr27_Internalname = "vHDR27_"+sGXsfl_17_idx ;
      edtavHdr28_Internalname = "vHDR28_"+sGXsfl_17_idx ;
      edtavLinea1_Internalname = "vLINEA1_"+sGXsfl_17_idx ;
      edtavLinea10_Internalname = "vLINEA10_"+sGXsfl_17_idx ;
      edtavLinea11_Internalname = "vLINEA11_"+sGXsfl_17_idx ;
      edtavLinea12_Internalname = "vLINEA12_"+sGXsfl_17_idx ;
      edtavLinea13_Internalname = "vLINEA13_"+sGXsfl_17_idx ;
      edtavLinea14_Internalname = "vLINEA14_"+sGXsfl_17_idx ;
      edtavLinea15_Internalname = "vLINEA15_"+sGXsfl_17_idx ;
      edtavLinea16_Internalname = "vLINEA16_"+sGXsfl_17_idx ;
      edtavLinea17_Internalname = "vLINEA17_"+sGXsfl_17_idx ;
      edtavLinea18_Internalname = "vLINEA18_"+sGXsfl_17_idx ;
      edtavLinea19_Internalname = "vLINEA19_"+sGXsfl_17_idx ;
      edtavLinea2_Internalname = "vLINEA2_"+sGXsfl_17_idx ;
      edtavLinea20_Internalname = "vLINEA20_"+sGXsfl_17_idx ;
      edtavLinea21_Internalname = "vLINEA21_"+sGXsfl_17_idx ;
      edtavLinea22_Internalname = "vLINEA22_"+sGXsfl_17_idx ;
      edtavLinea23_Internalname = "vLINEA23_"+sGXsfl_17_idx ;
      edtavLinea24_Internalname = "vLINEA24_"+sGXsfl_17_idx ;
      edtavLinea25_Internalname = "vLINEA25_"+sGXsfl_17_idx ;
      edtavLinea26_Internalname = "vLINEA26_"+sGXsfl_17_idx ;
      edtavLinea27_Internalname = "vLINEA27_"+sGXsfl_17_idx ;
      edtavLinea28_Internalname = "vLINEA28_"+sGXsfl_17_idx ;
      edtavLinea3_Internalname = "vLINEA3_"+sGXsfl_17_idx ;
      edtavLinea4_Internalname = "vLINEA4_"+sGXsfl_17_idx ;
      edtavLinea5_Internalname = "vLINEA5_"+sGXsfl_17_idx ;
      edtavLinea6_Internalname = "vLINEA6_"+sGXsfl_17_idx ;
      edtavLinea7_Internalname = "vLINEA7_"+sGXsfl_17_idx ;
      edtavLinea8_Internalname = "vLINEA8_"+sGXsfl_17_idx ;
      edtavLinea9_Internalname = "vLINEA9_"+sGXsfl_17_idx ;
      edtavMaqcod1_Internalname = "vMAQCOD1_"+sGXsfl_17_idx ;
      edtavMaqcod10_Internalname = "vMAQCOD10_"+sGXsfl_17_idx ;
      edtavMaqcod11_Internalname = "vMAQCOD11_"+sGXsfl_17_idx ;
      edtavMaqcod12_Internalname = "vMAQCOD12_"+sGXsfl_17_idx ;
      edtavMaqcod13_Internalname = "vMAQCOD13_"+sGXsfl_17_idx ;
      edtavMaqcod14_Internalname = "vMAQCOD14_"+sGXsfl_17_idx ;
      edtavMaqcod15_Internalname = "vMAQCOD15_"+sGXsfl_17_idx ;
      edtavMaqcod16_Internalname = "vMAQCOD16_"+sGXsfl_17_idx ;
      edtavMaqcod17_Internalname = "vMAQCOD17_"+sGXsfl_17_idx ;
      edtavMaqcod18_Internalname = "vMAQCOD18_"+sGXsfl_17_idx ;
      edtavMaqcod19_Internalname = "vMAQCOD19_"+sGXsfl_17_idx ;
      edtavMaqcod2_Internalname = "vMAQCOD2_"+sGXsfl_17_idx ;
      edtavMaqcod20_Internalname = "vMAQCOD20_"+sGXsfl_17_idx ;
      edtavMaqcod21_Internalname = "vMAQCOD21_"+sGXsfl_17_idx ;
      edtavMaqcod22_Internalname = "vMAQCOD22_"+sGXsfl_17_idx ;
      edtavMaqcod23_Internalname = "vMAQCOD23_"+sGXsfl_17_idx ;
      edtavMaqcod24_Internalname = "vMAQCOD24_"+sGXsfl_17_idx ;
      edtavMaqcod25_Internalname = "vMAQCOD25_"+sGXsfl_17_idx ;
      edtavMaqcod26_Internalname = "vMAQCOD26_"+sGXsfl_17_idx ;
      edtavMaqcod27_Internalname = "vMAQCOD27_"+sGXsfl_17_idx ;
      edtavMaqcod28_Internalname = "vMAQCOD28_"+sGXsfl_17_idx ;
      edtavMaqcod3_Internalname = "vMAQCOD3_"+sGXsfl_17_idx ;
      edtavMaqcod4_Internalname = "vMAQCOD4_"+sGXsfl_17_idx ;
      edtavMaqcod5_Internalname = "vMAQCOD5_"+sGXsfl_17_idx ;
      edtavMaqcod6_Internalname = "vMAQCOD6_"+sGXsfl_17_idx ;
      edtavMaqcod7_Internalname = "vMAQCOD7_"+sGXsfl_17_idx ;
      edtavMaqcod8_Internalname = "vMAQCOD8_"+sGXsfl_17_idx ;
      edtavMaqcod9_Internalname = "vMAQCOD9_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      edtavHdr1_Internalname = "vHDR1_"+sGXsfl_17_fel_idx ;
      edtavHdr2_Internalname = "vHDR2_"+sGXsfl_17_fel_idx ;
      edtavHdr3_Internalname = "vHDR3_"+sGXsfl_17_fel_idx ;
      edtavHdr4_Internalname = "vHDR4_"+sGXsfl_17_fel_idx ;
      edtavHdr5_Internalname = "vHDR5_"+sGXsfl_17_fel_idx ;
      edtavHdr6_Internalname = "vHDR6_"+sGXsfl_17_fel_idx ;
      edtavHdr7_Internalname = "vHDR7_"+sGXsfl_17_fel_idx ;
      edtavHdr8_Internalname = "vHDR8_"+sGXsfl_17_fel_idx ;
      edtavHdr9_Internalname = "vHDR9_"+sGXsfl_17_fel_idx ;
      edtavHdr10_Internalname = "vHDR10_"+sGXsfl_17_fel_idx ;
      edtavHdr11_Internalname = "vHDR11_"+sGXsfl_17_fel_idx ;
      edtavHdr12_Internalname = "vHDR12_"+sGXsfl_17_fel_idx ;
      edtavHdr13_Internalname = "vHDR13_"+sGXsfl_17_fel_idx ;
      edtavHdr14_Internalname = "vHDR14_"+sGXsfl_17_fel_idx ;
      edtavHdr15_Internalname = "vHDR15_"+sGXsfl_17_fel_idx ;
      edtavHdr16_Internalname = "vHDR16_"+sGXsfl_17_fel_idx ;
      edtavHdr17_Internalname = "vHDR17_"+sGXsfl_17_fel_idx ;
      edtavHdr18_Internalname = "vHDR18_"+sGXsfl_17_fel_idx ;
      edtavHdr19_Internalname = "vHDR19_"+sGXsfl_17_fel_idx ;
      edtavHdr20_Internalname = "vHDR20_"+sGXsfl_17_fel_idx ;
      edtavHdr21_Internalname = "vHDR21_"+sGXsfl_17_fel_idx ;
      edtavHdr22_Internalname = "vHDR22_"+sGXsfl_17_fel_idx ;
      edtavHdr23_Internalname = "vHDR23_"+sGXsfl_17_fel_idx ;
      edtavHdr24_Internalname = "vHDR24_"+sGXsfl_17_fel_idx ;
      edtavHdr25_Internalname = "vHDR25_"+sGXsfl_17_fel_idx ;
      edtavHdr26_Internalname = "vHDR26_"+sGXsfl_17_fel_idx ;
      edtavHdr27_Internalname = "vHDR27_"+sGXsfl_17_fel_idx ;
      edtavHdr28_Internalname = "vHDR28_"+sGXsfl_17_fel_idx ;
      edtavLinea1_Internalname = "vLINEA1_"+sGXsfl_17_fel_idx ;
      edtavLinea10_Internalname = "vLINEA10_"+sGXsfl_17_fel_idx ;
      edtavLinea11_Internalname = "vLINEA11_"+sGXsfl_17_fel_idx ;
      edtavLinea12_Internalname = "vLINEA12_"+sGXsfl_17_fel_idx ;
      edtavLinea13_Internalname = "vLINEA13_"+sGXsfl_17_fel_idx ;
      edtavLinea14_Internalname = "vLINEA14_"+sGXsfl_17_fel_idx ;
      edtavLinea15_Internalname = "vLINEA15_"+sGXsfl_17_fel_idx ;
      edtavLinea16_Internalname = "vLINEA16_"+sGXsfl_17_fel_idx ;
      edtavLinea17_Internalname = "vLINEA17_"+sGXsfl_17_fel_idx ;
      edtavLinea18_Internalname = "vLINEA18_"+sGXsfl_17_fel_idx ;
      edtavLinea19_Internalname = "vLINEA19_"+sGXsfl_17_fel_idx ;
      edtavLinea2_Internalname = "vLINEA2_"+sGXsfl_17_fel_idx ;
      edtavLinea20_Internalname = "vLINEA20_"+sGXsfl_17_fel_idx ;
      edtavLinea21_Internalname = "vLINEA21_"+sGXsfl_17_fel_idx ;
      edtavLinea22_Internalname = "vLINEA22_"+sGXsfl_17_fel_idx ;
      edtavLinea23_Internalname = "vLINEA23_"+sGXsfl_17_fel_idx ;
      edtavLinea24_Internalname = "vLINEA24_"+sGXsfl_17_fel_idx ;
      edtavLinea25_Internalname = "vLINEA25_"+sGXsfl_17_fel_idx ;
      edtavLinea26_Internalname = "vLINEA26_"+sGXsfl_17_fel_idx ;
      edtavLinea27_Internalname = "vLINEA27_"+sGXsfl_17_fel_idx ;
      edtavLinea28_Internalname = "vLINEA28_"+sGXsfl_17_fel_idx ;
      edtavLinea3_Internalname = "vLINEA3_"+sGXsfl_17_fel_idx ;
      edtavLinea4_Internalname = "vLINEA4_"+sGXsfl_17_fel_idx ;
      edtavLinea5_Internalname = "vLINEA5_"+sGXsfl_17_fel_idx ;
      edtavLinea6_Internalname = "vLINEA6_"+sGXsfl_17_fel_idx ;
      edtavLinea7_Internalname = "vLINEA7_"+sGXsfl_17_fel_idx ;
      edtavLinea8_Internalname = "vLINEA8_"+sGXsfl_17_fel_idx ;
      edtavLinea9_Internalname = "vLINEA9_"+sGXsfl_17_fel_idx ;
      edtavMaqcod1_Internalname = "vMAQCOD1_"+sGXsfl_17_fel_idx ;
      edtavMaqcod10_Internalname = "vMAQCOD10_"+sGXsfl_17_fel_idx ;
      edtavMaqcod11_Internalname = "vMAQCOD11_"+sGXsfl_17_fel_idx ;
      edtavMaqcod12_Internalname = "vMAQCOD12_"+sGXsfl_17_fel_idx ;
      edtavMaqcod13_Internalname = "vMAQCOD13_"+sGXsfl_17_fel_idx ;
      edtavMaqcod14_Internalname = "vMAQCOD14_"+sGXsfl_17_fel_idx ;
      edtavMaqcod15_Internalname = "vMAQCOD15_"+sGXsfl_17_fel_idx ;
      edtavMaqcod16_Internalname = "vMAQCOD16_"+sGXsfl_17_fel_idx ;
      edtavMaqcod17_Internalname = "vMAQCOD17_"+sGXsfl_17_fel_idx ;
      edtavMaqcod18_Internalname = "vMAQCOD18_"+sGXsfl_17_fel_idx ;
      edtavMaqcod19_Internalname = "vMAQCOD19_"+sGXsfl_17_fel_idx ;
      edtavMaqcod2_Internalname = "vMAQCOD2_"+sGXsfl_17_fel_idx ;
      edtavMaqcod20_Internalname = "vMAQCOD20_"+sGXsfl_17_fel_idx ;
      edtavMaqcod21_Internalname = "vMAQCOD21_"+sGXsfl_17_fel_idx ;
      edtavMaqcod22_Internalname = "vMAQCOD22_"+sGXsfl_17_fel_idx ;
      edtavMaqcod23_Internalname = "vMAQCOD23_"+sGXsfl_17_fel_idx ;
      edtavMaqcod24_Internalname = "vMAQCOD24_"+sGXsfl_17_fel_idx ;
      edtavMaqcod25_Internalname = "vMAQCOD25_"+sGXsfl_17_fel_idx ;
      edtavMaqcod26_Internalname = "vMAQCOD26_"+sGXsfl_17_fel_idx ;
      edtavMaqcod27_Internalname = "vMAQCOD27_"+sGXsfl_17_fel_idx ;
      edtavMaqcod28_Internalname = "vMAQCOD28_"+sGXsfl_17_fel_idx ;
      edtavMaqcod3_Internalname = "vMAQCOD3_"+sGXsfl_17_fel_idx ;
      edtavMaqcod4_Internalname = "vMAQCOD4_"+sGXsfl_17_fel_idx ;
      edtavMaqcod5_Internalname = "vMAQCOD5_"+sGXsfl_17_fel_idx ;
      edtavMaqcod6_Internalname = "vMAQCOD6_"+sGXsfl_17_fel_idx ;
      edtavMaqcod7_Internalname = "vMAQCOD7_"+sGXsfl_17_fel_idx ;
      edtavMaqcod8_Internalname = "vMAQCOD8_"+sGXsfl_17_fel_idx ;
      edtavMaqcod9_Internalname = "vMAQCOD9_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wbAL0( ) ;
      if ( ( 50 * 1 == 0 ) || ( nGXsfl_17_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_17_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr1_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr1_Internalname,GXutil.rtrim( AV72Hdr1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr1_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr1_Forecolor)+";"+((edtavHdr1_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr1_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr2_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "DtmGridTitle" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr2_Internalname,GXutil.rtrim( AV83Hdr2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr2_Jsonclick,Integer.valueOf(0),"DtmGridTitle",((edtavHdr2_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr2_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr3_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr3_Internalname,GXutil.rtrim( AV93Hdr3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr3_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr3_Forecolor)+";"+((edtavHdr3_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr3_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr4_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr4_Internalname,GXutil.rtrim( AV94Hdr4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr4_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr4_Forecolor)+";"+((edtavHdr4_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr4_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr5_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr5_Internalname,GXutil.rtrim( AV95Hdr5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr5_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr5_Forecolor)+";"+((edtavHdr5_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr5_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr6_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr6_Internalname,GXutil.rtrim( AV96Hdr6),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr6_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr6_Forecolor)+";"+((edtavHdr6_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr6_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr7_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr7_Internalname,GXutil.rtrim( AV97Hdr7),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr7_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr7_Forecolor)+";"+((edtavHdr7_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr7_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr8_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr8_Internalname,GXutil.rtrim( AV98Hdr8),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr8_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr8_Forecolor)+";"+((edtavHdr8_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr8_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr9_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr9_Internalname,GXutil.rtrim( AV99Hdr9),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr9_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr9_Forecolor)+";"+((edtavHdr9_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr9_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr10_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr10_Internalname,GXutil.rtrim( AV73Hdr10),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr10_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr10_Forecolor)+";"+((edtavHdr10_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr10_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr11_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr11_Internalname,GXutil.rtrim( AV74Hdr11),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr11_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr11_Forecolor)+";"+((edtavHdr11_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr11_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr12_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr12_Internalname,GXutil.rtrim( AV75Hdr12),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr12_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr12_Forecolor)+";"+((edtavHdr12_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr12_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr13_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr13_Internalname,GXutil.rtrim( AV76Hdr13),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr13_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr13_Forecolor)+";"+((edtavHdr13_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr13_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr14_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr14_Internalname,GXutil.rtrim( AV77Hdr14),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr14_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr14_Forecolor)+";"+((edtavHdr14_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr14_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr15_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr15_Internalname,GXutil.rtrim( AV78Hdr15),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr15_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr15_Forecolor)+";"+((edtavHdr15_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr15_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr16_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr16_Internalname,GXutil.rtrim( AV79Hdr16),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr16_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr16_Forecolor)+";"+((edtavHdr16_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr16_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr17_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr17_Internalname,GXutil.rtrim( AV80Hdr17),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr17_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr17_Forecolor)+";"+((edtavHdr17_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr17_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr18_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr18_Internalname,GXutil.rtrim( AV81Hdr18),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr18_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr18_Forecolor)+";"+((edtavHdr18_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr18_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr19_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr19_Internalname,GXutil.rtrim( AV82Hdr19),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr19_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr19_Forecolor)+";"+((edtavHdr19_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr19_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr20_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr20_Internalname,GXutil.rtrim( AV84Hdr20),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr20_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr20_Forecolor)+";"+((edtavHdr20_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr20_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr21_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr21_Internalname,GXutil.rtrim( AV85Hdr21),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr21_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr21_Forecolor)+";"+((edtavHdr21_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr21_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr22_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr22_Internalname,GXutil.rtrim( AV86Hdr22),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr22_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr22_Forecolor)+";"+((edtavHdr22_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr22_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr23_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr23_Internalname,GXutil.rtrim( AV87Hdr23),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr23_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr23_Forecolor)+";"+((edtavHdr23_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr23_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr24_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr24_Internalname,GXutil.rtrim( AV88Hdr24),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr24_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr24_Forecolor)+";"+((edtavHdr24_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr24_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr25_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr25_Internalname,GXutil.rtrim( AV89Hdr25),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr25_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr25_Forecolor)+";"+((edtavHdr25_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr25_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr26_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr26_Internalname,GXutil.rtrim( AV90Hdr26),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr26_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr26_Forecolor)+";"+((edtavHdr26_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr26_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr27_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr27_Internalname,GXutil.rtrim( AV91Hdr27),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr27_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr27_Forecolor)+";"+((edtavHdr27_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr27_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr28_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr28_Internalname,GXutil.rtrim( AV92Hdr28),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr28_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr28_Forecolor)+";"+((edtavHdr28_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr28_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea1_Internalname,GXutil.rtrim( AV107Linea1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea10_Internalname,GXutil.rtrim( AV108Linea10),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea10_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea11_Internalname,GXutil.rtrim( AV109Linea11),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea11_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea12_Internalname,GXutil.rtrim( AV110Linea12),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea12_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea13_Internalname,GXutil.rtrim( AV111Linea13),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea13_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea14_Internalname,GXutil.rtrim( AV112Linea14),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea14_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea15_Internalname,GXutil.rtrim( AV113Linea15),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea16_Internalname,GXutil.rtrim( AV114Linea16),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea16_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea17_Internalname,GXutil.rtrim( AV115Linea17),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea17_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea18_Internalname,GXutil.rtrim( AV116Linea18),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea18_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea19_Internalname,GXutil.rtrim( AV117Linea19),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea2_Internalname,GXutil.rtrim( AV118Linea2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea20_Internalname,GXutil.rtrim( AV119Linea20),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea20_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea21_Internalname,GXutil.rtrim( AV120Linea21),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea21_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea22_Internalname,GXutil.rtrim( AV121Linea22),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea22_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea23_Internalname,GXutil.rtrim( AV122Linea23),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea23_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea24_Internalname,GXutil.rtrim( AV123Linea24),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea24_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea25_Internalname,GXutil.rtrim( AV124Linea25),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea25_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea26_Internalname,GXutil.rtrim( AV125Linea26),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea26_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea27_Internalname,GXutil.rtrim( AV126Linea27),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea27_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea28_Internalname,GXutil.rtrim( AV127Linea28),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea28_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea3_Internalname,GXutil.rtrim( AV128Linea3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea4_Internalname,GXutil.rtrim( AV129Linea4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea5_Internalname,GXutil.rtrim( AV130Linea5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea6_Internalname,GXutil.rtrim( AV131Linea6),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea7_Internalname,GXutil.rtrim( AV132Linea7),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea7_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea8_Internalname,GXutil.rtrim( AV133LInea8),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea8_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea9_Internalname,GXutil.rtrim( AV134Linea9),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea9_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavLinea9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod1_Internalname,GXutil.rtrim( AV160Maqcod1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod10_Internalname,GXutil.rtrim( AV161MaqCod10),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod10_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod11_Internalname,GXutil.rtrim( AV162Maqcod11),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod11_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod12_Internalname,GXutil.rtrim( AV163MaqCod12),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod12_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod13_Internalname,GXutil.rtrim( AV164Maqcod13),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod13_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod14_Internalname,GXutil.rtrim( AV165Maqcod14),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod14_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod15_Internalname,GXutil.rtrim( AV166Maqcod15),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod16_Internalname,GXutil.rtrim( AV167Maqcod16),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod16_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod17_Internalname,GXutil.rtrim( AV168Maqcod17),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod17_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod18_Internalname,GXutil.rtrim( AV169Maqcod18),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod18_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod19_Internalname,GXutil.rtrim( AV170Maqcod19),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod2_Internalname,GXutil.rtrim( AV171Maqcod2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod20_Internalname,GXutil.rtrim( AV172Maqcod20),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod20_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod21_Internalname,GXutil.rtrim( AV173Maqcod21),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod21_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod22_Internalname,GXutil.rtrim( AV174Maqcod22),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod22_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod23_Internalname,GXutil.rtrim( AV175Maqcod23),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod23_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod24_Internalname,GXutil.rtrim( AV176Maqcod24),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod24_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod25_Internalname,GXutil.rtrim( AV177Maqcod25),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod25_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod26_Internalname,GXutil.rtrim( AV178Maqcod26),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod26_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod27_Internalname,GXutil.rtrim( AV179Maqcod27),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod27_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod28_Internalname,GXutil.rtrim( AV180Maqcod28),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod28_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod3_Internalname,GXutil.rtrim( AV181Maqcod3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod4_Internalname,GXutil.rtrim( AV182Maqcod4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod5_Internalname,GXutil.rtrim( AV183Maqcod5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod6_Internalname,GXutil.rtrim( AV184Maqcod6),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod7_Internalname,GXutil.rtrim( AV185Maqcod7),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod7_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod8_Internalname,GXutil.rtrim( AV186Maqcod8),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod8_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod9_Internalname,GXutil.rtrim( AV187Maqcod9),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod9_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesAL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      /* End function sendrow_172 */
   }

   public void startgridcontrol17( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"17\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr1_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DtmGridTitle"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr2_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr3_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr4_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr5_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr6_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr7_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr8_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr9_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr10_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr11_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr12_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr13_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr14_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr15_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr16_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr17_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr18_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr19_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr20_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr21_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr22_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr23_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr24_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr25_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr26_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr27_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr28_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea1", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea10", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea11", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea12", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea13", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea14", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea15", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea16", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea17", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea18", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea19", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea20", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea21", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea22", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea23", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea24", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea25", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea26", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea27", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea28", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea3", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea5", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea6", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea7", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea8", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea9", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod1", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod10", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod11", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod12", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod13", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod14", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod15", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod16", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod17", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod18", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod19", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod20", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod21", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod22", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod3", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod5", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod6", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod7", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod8", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maqcod9", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV72Hdr1));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr1_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV83Hdr2));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr2_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr2_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV93Hdr3));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr3_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV94Hdr4));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr4_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV95Hdr5));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr5_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV96Hdr6));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr6_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV97Hdr7));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr7_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV98Hdr8));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr8_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV99Hdr9));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr9_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV73Hdr10));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr10_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV74Hdr11));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr11_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV75Hdr12));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr12_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV76Hdr13));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr13_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV77Hdr14));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr14_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV78Hdr15));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr15_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV79Hdr16));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr16_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV80Hdr17));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr17_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV81Hdr18));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr18_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV82Hdr19));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr19_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV84Hdr20));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr20_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV85Hdr21));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr21_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV86Hdr22));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr22_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV87Hdr23));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr23_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV88Hdr24));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr24_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89Hdr25));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr25_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV90Hdr26));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr26_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV91Hdr27));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr27_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV92Hdr28));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr28_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV107Linea1));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV108Linea10));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV109Linea11));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV110Linea12));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV111Linea13));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV112Linea14));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV113Linea15));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV114Linea16));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV115Linea17));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV116Linea18));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV117Linea19));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV118Linea2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV119Linea20));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV120Linea21));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV121Linea22));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV122Linea23));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV123Linea24));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV124Linea25));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV125Linea26));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV126Linea27));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV127Linea28));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea28_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV128Linea3));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV129Linea4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV130Linea5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV131Linea6));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV132Linea7));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV133LInea8));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV134Linea9));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea9_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV160Maqcod1));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV161MaqCod10));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV162Maqcod11));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV163MaqCod12));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV164Maqcod13));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV165Maqcod14));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV166Maqcod15));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV167Maqcod16));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV168Maqcod17));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV169Maqcod18));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV170Maqcod19));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV171Maqcod2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV172Maqcod20));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV173Maqcod21));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV174Maqcod22));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV175Maqcod23));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV176Maqcod24));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV177Maqcod25));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV178Maqcod26));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV179Maqcod27));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV180Maqcod28));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod28_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV181Maqcod3));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV182Maqcod4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV183Maqcod5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV184Maqcod6));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV185Maqcod7));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV186Maqcod8));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV187Maqcod9));
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
      bttExportarrtf_Internalname = "EXPORTARRTF" ;
      divGroup1table_Internalname = "GROUP1TABLE" ;
      grpGroup1_Internalname = "GROUP1" ;
      divTable1_Internalname = "TABLE1" ;
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
      divTable3_Internalname = "TABLE3" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      edtavMaqcod9_Enabled = 0 ;
      edtavMaqcod8_Jsonclick = "" ;
      edtavMaqcod8_Enabled = 0 ;
      edtavMaqcod7_Jsonclick = "" ;
      edtavMaqcod7_Enabled = 0 ;
      edtavMaqcod6_Jsonclick = "" ;
      edtavMaqcod6_Enabled = 0 ;
      edtavMaqcod5_Jsonclick = "" ;
      edtavMaqcod5_Enabled = 0 ;
      edtavMaqcod4_Jsonclick = "" ;
      edtavMaqcod4_Enabled = 0 ;
      edtavMaqcod3_Jsonclick = "" ;
      edtavMaqcod3_Enabled = 0 ;
      edtavMaqcod28_Jsonclick = "" ;
      edtavMaqcod28_Enabled = 0 ;
      edtavMaqcod27_Jsonclick = "" ;
      edtavMaqcod27_Enabled = 0 ;
      edtavMaqcod26_Jsonclick = "" ;
      edtavMaqcod26_Enabled = 0 ;
      edtavMaqcod25_Jsonclick = "" ;
      edtavMaqcod25_Enabled = 0 ;
      edtavMaqcod24_Jsonclick = "" ;
      edtavMaqcod24_Enabled = 0 ;
      edtavMaqcod23_Jsonclick = "" ;
      edtavMaqcod23_Enabled = 0 ;
      edtavMaqcod22_Jsonclick = "" ;
      edtavMaqcod22_Enabled = 0 ;
      edtavMaqcod21_Jsonclick = "" ;
      edtavMaqcod21_Enabled = 0 ;
      edtavMaqcod20_Jsonclick = "" ;
      edtavMaqcod20_Enabled = 0 ;
      edtavMaqcod2_Jsonclick = "" ;
      edtavMaqcod2_Enabled = 0 ;
      edtavMaqcod19_Jsonclick = "" ;
      edtavMaqcod19_Enabled = 0 ;
      edtavMaqcod18_Jsonclick = "" ;
      edtavMaqcod18_Enabled = 0 ;
      edtavMaqcod17_Jsonclick = "" ;
      edtavMaqcod17_Enabled = 0 ;
      edtavMaqcod16_Jsonclick = "" ;
      edtavMaqcod16_Enabled = 0 ;
      edtavMaqcod15_Jsonclick = "" ;
      edtavMaqcod15_Enabled = 0 ;
      edtavMaqcod14_Jsonclick = "" ;
      edtavMaqcod14_Enabled = 0 ;
      edtavMaqcod13_Jsonclick = "" ;
      edtavMaqcod13_Enabled = 0 ;
      edtavMaqcod12_Jsonclick = "" ;
      edtavMaqcod12_Enabled = 0 ;
      edtavMaqcod11_Jsonclick = "" ;
      edtavMaqcod11_Enabled = 0 ;
      edtavMaqcod10_Jsonclick = "" ;
      edtavMaqcod10_Enabled = 0 ;
      edtavMaqcod1_Jsonclick = "" ;
      edtavMaqcod1_Enabled = 0 ;
      edtavLinea9_Jsonclick = "" ;
      edtavLinea9_Enabled = 0 ;
      edtavLinea8_Jsonclick = "" ;
      edtavLinea8_Enabled = 0 ;
      edtavLinea7_Jsonclick = "" ;
      edtavLinea7_Enabled = 0 ;
      edtavLinea6_Jsonclick = "" ;
      edtavLinea6_Enabled = 0 ;
      edtavLinea5_Jsonclick = "" ;
      edtavLinea5_Enabled = 0 ;
      edtavLinea4_Jsonclick = "" ;
      edtavLinea4_Enabled = 0 ;
      edtavLinea3_Jsonclick = "" ;
      edtavLinea3_Enabled = 0 ;
      edtavLinea28_Jsonclick = "" ;
      edtavLinea28_Enabled = 0 ;
      edtavLinea27_Jsonclick = "" ;
      edtavLinea27_Enabled = 0 ;
      edtavLinea26_Jsonclick = "" ;
      edtavLinea26_Enabled = 0 ;
      edtavLinea25_Jsonclick = "" ;
      edtavLinea25_Enabled = 0 ;
      edtavLinea24_Jsonclick = "" ;
      edtavLinea24_Enabled = 0 ;
      edtavLinea23_Jsonclick = "" ;
      edtavLinea23_Enabled = 0 ;
      edtavLinea22_Jsonclick = "" ;
      edtavLinea22_Enabled = 0 ;
      edtavLinea21_Jsonclick = "" ;
      edtavLinea21_Enabled = 0 ;
      edtavLinea20_Jsonclick = "" ;
      edtavLinea20_Enabled = 0 ;
      edtavLinea2_Jsonclick = "" ;
      edtavLinea2_Enabled = 0 ;
      edtavLinea19_Jsonclick = "" ;
      edtavLinea19_Enabled = 0 ;
      edtavLinea18_Jsonclick = "" ;
      edtavLinea18_Enabled = 0 ;
      edtavLinea17_Jsonclick = "" ;
      edtavLinea17_Enabled = 0 ;
      edtavLinea16_Jsonclick = "" ;
      edtavLinea16_Enabled = 0 ;
      edtavLinea15_Jsonclick = "" ;
      edtavLinea15_Enabled = 0 ;
      edtavLinea14_Jsonclick = "" ;
      edtavLinea14_Enabled = 0 ;
      edtavLinea13_Jsonclick = "" ;
      edtavLinea13_Enabled = 0 ;
      edtavLinea12_Jsonclick = "" ;
      edtavLinea12_Enabled = 0 ;
      edtavLinea11_Jsonclick = "" ;
      edtavLinea11_Enabled = 0 ;
      edtavLinea10_Jsonclick = "" ;
      edtavLinea10_Enabled = 0 ;
      edtavLinea1_Jsonclick = "" ;
      edtavLinea1_Enabled = 0 ;
      edtavHdr28_Jsonclick = "" ;
      edtavHdr28_Forecolor = (int)(0x000000) ;
      edtavHdr28_Enabled = 0 ;
      edtavHdr28_Backcolor = -1 ;
      edtavHdr27_Jsonclick = "" ;
      edtavHdr27_Forecolor = (int)(0x000000) ;
      edtavHdr27_Enabled = 0 ;
      edtavHdr27_Backcolor = -1 ;
      edtavHdr26_Jsonclick = "" ;
      edtavHdr26_Forecolor = (int)(0x000000) ;
      edtavHdr26_Enabled = 0 ;
      edtavHdr26_Backcolor = -1 ;
      edtavHdr25_Jsonclick = "" ;
      edtavHdr25_Forecolor = (int)(0x000000) ;
      edtavHdr25_Enabled = 0 ;
      edtavHdr25_Backcolor = -1 ;
      edtavHdr24_Jsonclick = "" ;
      edtavHdr24_Forecolor = (int)(0x000000) ;
      edtavHdr24_Enabled = 0 ;
      edtavHdr24_Backcolor = -1 ;
      edtavHdr23_Jsonclick = "" ;
      edtavHdr23_Forecolor = (int)(0x000000) ;
      edtavHdr23_Enabled = 0 ;
      edtavHdr23_Backcolor = -1 ;
      edtavHdr22_Jsonclick = "" ;
      edtavHdr22_Forecolor = (int)(0x000000) ;
      edtavHdr22_Enabled = 0 ;
      edtavHdr22_Backcolor = -1 ;
      edtavHdr21_Jsonclick = "" ;
      edtavHdr21_Forecolor = (int)(0x000000) ;
      edtavHdr21_Enabled = 0 ;
      edtavHdr21_Backcolor = -1 ;
      edtavHdr20_Jsonclick = "" ;
      edtavHdr20_Forecolor = (int)(0x000000) ;
      edtavHdr20_Enabled = 0 ;
      edtavHdr20_Backcolor = -1 ;
      edtavHdr19_Jsonclick = "" ;
      edtavHdr19_Forecolor = (int)(0x000000) ;
      edtavHdr19_Enabled = 0 ;
      edtavHdr19_Backcolor = -1 ;
      edtavHdr18_Jsonclick = "" ;
      edtavHdr18_Forecolor = (int)(0x000000) ;
      edtavHdr18_Enabled = 0 ;
      edtavHdr18_Backcolor = -1 ;
      edtavHdr17_Jsonclick = "" ;
      edtavHdr17_Forecolor = (int)(0x000000) ;
      edtavHdr17_Enabled = 0 ;
      edtavHdr17_Backcolor = -1 ;
      edtavHdr16_Jsonclick = "" ;
      edtavHdr16_Forecolor = (int)(0x000000) ;
      edtavHdr16_Enabled = 0 ;
      edtavHdr16_Backcolor = -1 ;
      edtavHdr15_Jsonclick = "" ;
      edtavHdr15_Forecolor = (int)(0x000000) ;
      edtavHdr15_Enabled = 0 ;
      edtavHdr15_Backcolor = -1 ;
      edtavHdr14_Jsonclick = "" ;
      edtavHdr14_Forecolor = (int)(0x000000) ;
      edtavHdr14_Enabled = 0 ;
      edtavHdr14_Backcolor = -1 ;
      edtavHdr13_Jsonclick = "" ;
      edtavHdr13_Forecolor = (int)(0x000000) ;
      edtavHdr13_Enabled = 0 ;
      edtavHdr13_Backcolor = -1 ;
      edtavHdr12_Jsonclick = "" ;
      edtavHdr12_Forecolor = (int)(0x000000) ;
      edtavHdr12_Enabled = 0 ;
      edtavHdr12_Backcolor = -1 ;
      edtavHdr11_Jsonclick = "" ;
      edtavHdr11_Forecolor = (int)(0x000000) ;
      edtavHdr11_Enabled = 0 ;
      edtavHdr11_Backcolor = -1 ;
      edtavHdr10_Jsonclick = "" ;
      edtavHdr10_Forecolor = (int)(0x000000) ;
      edtavHdr10_Enabled = 0 ;
      edtavHdr10_Backcolor = -1 ;
      edtavHdr9_Jsonclick = "" ;
      edtavHdr9_Forecolor = (int)(0x000000) ;
      edtavHdr9_Enabled = 0 ;
      edtavHdr9_Backcolor = -1 ;
      edtavHdr8_Jsonclick = "" ;
      edtavHdr8_Forecolor = (int)(0x000000) ;
      edtavHdr8_Enabled = 0 ;
      edtavHdr8_Backcolor = -1 ;
      edtavHdr7_Jsonclick = "" ;
      edtavHdr7_Forecolor = (int)(0x000000) ;
      edtavHdr7_Enabled = 0 ;
      edtavHdr7_Backcolor = -1 ;
      edtavHdr6_Jsonclick = "" ;
      edtavHdr6_Forecolor = (int)(0x000000) ;
      edtavHdr6_Enabled = 0 ;
      edtavHdr6_Backcolor = -1 ;
      edtavHdr5_Jsonclick = "" ;
      edtavHdr5_Forecolor = (int)(0x000000) ;
      edtavHdr5_Enabled = 0 ;
      edtavHdr5_Backcolor = -1 ;
      edtavHdr4_Jsonclick = "" ;
      edtavHdr4_Forecolor = (int)(0x000000) ;
      edtavHdr4_Enabled = 0 ;
      edtavHdr4_Backcolor = -1 ;
      edtavHdr3_Jsonclick = "" ;
      edtavHdr3_Forecolor = (int)(0x000000) ;
      edtavHdr3_Enabled = 0 ;
      edtavHdr3_Backcolor = -1 ;
      edtavHdr2_Jsonclick = "" ;
      edtavHdr2_Enabled = 0 ;
      edtavHdr2_Backcolor = -1 ;
      edtavHdr1_Jsonclick = "" ;
      edtavHdr1_Forecolor = (int)(0x000000) ;
      edtavHdr1_Enabled = 0 ;
      edtavHdr1_Backcolor = -1 ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Planificacion TINTE", "") );
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV341Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV67Filename',fld:'vFILENAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("GRID.LOAD","{handler:'e14AL2',iparms:[{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV92Hdr28',fld:'vHDR28',pic:''},{av:'AV127Linea28',fld:'vLINEA28',pic:''},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'edtavHdr28_Backcolor',ctrl:'vHDR28',prop:'Backcolor'},{av:'edtavHdr28_Forecolor',ctrl:'vHDR28',prop:'Forecolor'},{av:'AV91Hdr27',fld:'vHDR27',pic:''},{av:'AV126Linea27',fld:'vLINEA27',pic:''},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'edtavHdr27_Backcolor',ctrl:'vHDR27',prop:'Backcolor'},{av:'edtavHdr27_Forecolor',ctrl:'vHDR27',prop:'Forecolor'},{av:'AV90Hdr26',fld:'vHDR26',pic:''},{av:'AV125Linea26',fld:'vLINEA26',pic:''},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'edtavHdr26_Backcolor',ctrl:'vHDR26',prop:'Backcolor'},{av:'edtavHdr26_Forecolor',ctrl:'vHDR26',prop:'Forecolor'},{av:'AV89Hdr25',fld:'vHDR25',pic:''},{av:'AV124Linea25',fld:'vLINEA25',pic:''},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'edtavHdr25_Backcolor',ctrl:'vHDR25',prop:'Backcolor'},{av:'edtavHdr25_Forecolor',ctrl:'vHDR25',prop:'Forecolor'},{av:'AV88Hdr24',fld:'vHDR24',pic:''},{av:'AV123Linea24',fld:'vLINEA24',pic:''},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'edtavHdr24_Backcolor',ctrl:'vHDR24',prop:'Backcolor'},{av:'edtavHdr24_Forecolor',ctrl:'vHDR24',prop:'Forecolor'},{av:'AV87Hdr23',fld:'vHDR23',pic:''},{av:'AV122Linea23',fld:'vLINEA23',pic:''},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'edtavHdr23_Backcolor',ctrl:'vHDR23',prop:'Backcolor'},{av:'edtavHdr23_Forecolor',ctrl:'vHDR23',prop:'Forecolor'},{av:'AV86Hdr22',fld:'vHDR22',pic:''},{av:'AV121Linea22',fld:'vLINEA22',pic:''},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'edtavHdr22_Backcolor',ctrl:'vHDR22',prop:'Backcolor'},{av:'edtavHdr22_Forecolor',ctrl:'vHDR22',prop:'Forecolor'},{av:'AV85Hdr21',fld:'vHDR21',pic:''},{av:'AV120Linea21',fld:'vLINEA21',pic:''},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'edtavHdr21_Backcolor',ctrl:'vHDR21',prop:'Backcolor'},{av:'edtavHdr21_Forecolor',ctrl:'vHDR21',prop:'Forecolor'},{av:'AV84Hdr20',fld:'vHDR20',pic:''},{av:'AV119Linea20',fld:'vLINEA20',pic:''},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'edtavHdr20_Backcolor',ctrl:'vHDR20',prop:'Backcolor'},{av:'edtavHdr20_Forecolor',ctrl:'vHDR20',prop:'Forecolor'},{av:'AV82Hdr19',fld:'vHDR19',pic:''},{av:'AV117Linea19',fld:'vLINEA19',pic:''},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'edtavHdr19_Backcolor',ctrl:'vHDR19',prop:'Backcolor'},{av:'edtavHdr19_Forecolor',ctrl:'vHDR19',prop:'Forecolor'},{av:'AV81Hdr18',fld:'vHDR18',pic:''},{av:'AV116Linea18',fld:'vLINEA18',pic:''},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'edtavHdr18_Backcolor',ctrl:'vHDR18',prop:'Backcolor'},{av:'edtavHdr18_Forecolor',ctrl:'vHDR18',prop:'Forecolor'},{av:'AV80Hdr17',fld:'vHDR17',pic:''},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV115Linea17',fld:'vLINEA17',pic:''},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'edtavHdr17_Backcolor',ctrl:'vHDR17',prop:'Backcolor'},{av:'edtavHdr17_Forecolor',ctrl:'vHDR17',prop:'Forecolor'},{av:'AV79Hdr16',fld:'vHDR16',pic:''},{av:'AV114Linea16',fld:'vLINEA16',pic:''},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'edtavHdr16_Backcolor',ctrl:'vHDR16',prop:'Backcolor'},{av:'edtavHdr16_Forecolor',ctrl:'vHDR16',prop:'Forecolor'},{av:'AV78Hdr15',fld:'vHDR15',pic:''},{av:'AV113Linea15',fld:'vLINEA15',pic:''},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'edtavHdr15_Backcolor',ctrl:'vHDR15',prop:'Backcolor'},{av:'edtavHdr15_Forecolor',ctrl:'vHDR15',prop:'Forecolor'},{av:'AV77Hdr14',fld:'vHDR14',pic:''},{av:'AV112Linea14',fld:'vLINEA14',pic:''},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'edtavHdr14_Backcolor',ctrl:'vHDR14',prop:'Backcolor'},{av:'edtavHdr14_Forecolor',ctrl:'vHDR14',prop:'Forecolor'},{av:'AV76Hdr13',fld:'vHDR13',pic:''},{av:'AV111Linea13',fld:'vLINEA13',pic:''},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'edtavHdr13_Backcolor',ctrl:'vHDR13',prop:'Backcolor'},{av:'edtavHdr13_Forecolor',ctrl:'vHDR13',prop:'Forecolor'},{av:'AV75Hdr12',fld:'vHDR12',pic:''},{av:'AV110Linea12',fld:'vLINEA12',pic:''},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'edtavHdr12_Backcolor',ctrl:'vHDR12',prop:'Backcolor'},{av:'edtavHdr12_Forecolor',ctrl:'vHDR12',prop:'Forecolor'},{av:'AV74Hdr11',fld:'vHDR11',pic:''},{av:'AV109Linea11',fld:'vLINEA11',pic:''},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'edtavHdr11_Backcolor',ctrl:'vHDR11',prop:'Backcolor'},{av:'edtavHdr11_Forecolor',ctrl:'vHDR11',prop:'Forecolor'},{av:'AV73Hdr10',fld:'vHDR10',pic:''},{av:'AV108Linea10',fld:'vLINEA10',pic:''},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'edtavHdr10_Backcolor',ctrl:'vHDR10',prop:'Backcolor'},{av:'edtavHdr10_Forecolor',ctrl:'vHDR10',prop:'Forecolor'},{av:'AV99Hdr9',fld:'vHDR9',pic:''},{av:'AV134Linea9',fld:'vLINEA9',pic:''},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'edtavHdr9_Backcolor',ctrl:'vHDR9',prop:'Backcolor'},{av:'edtavHdr9_Forecolor',ctrl:'vHDR9',prop:'Forecolor'},{av:'AV98Hdr8',fld:'vHDR8',pic:''},{av:'AV133LInea8',fld:'vLINEA8',pic:''},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'edtavHdr8_Backcolor',ctrl:'vHDR8',prop:'Backcolor'},{av:'edtavHdr8_Forecolor',ctrl:'vHDR8',prop:'Forecolor'},{av:'AV97Hdr7',fld:'vHDR7',pic:''},{av:'AV132Linea7',fld:'vLINEA7',pic:''},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'edtavHdr7_Backcolor',ctrl:'vHDR7',prop:'Backcolor'},{av:'edtavHdr7_Forecolor',ctrl:'vHDR7',prop:'Forecolor'},{av:'AV96Hdr6',fld:'vHDR6',pic:''},{av:'AV131Linea6',fld:'vLINEA6',pic:''},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'edtavHdr6_Backcolor',ctrl:'vHDR6',prop:'Backcolor'},{av:'edtavHdr6_Forecolor',ctrl:'vHDR6',prop:'Forecolor'},{av:'AV95Hdr5',fld:'vHDR5',pic:''},{av:'AV130Linea5',fld:'vLINEA5',pic:''},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'edtavHdr5_Backcolor',ctrl:'vHDR5',prop:'Backcolor'},{av:'edtavHdr5_Forecolor',ctrl:'vHDR5',prop:'Forecolor'},{av:'AV94Hdr4',fld:'vHDR4',pic:''},{av:'AV129Linea4',fld:'vLINEA4',pic:''},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'edtavHdr4_Backcolor',ctrl:'vHDR4',prop:'Backcolor'},{av:'edtavHdr4_Forecolor',ctrl:'vHDR4',prop:'Forecolor'},{av:'AV93Hdr3',fld:'vHDR3',pic:''},{av:'AV128Linea3',fld:'vLINEA3',pic:''},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'edtavHdr3_Backcolor',ctrl:'vHDR3',prop:'Backcolor'},{av:'edtavHdr3_Forecolor',ctrl:'vHDR3',prop:'Forecolor'},{av:'AV118Linea2',fld:'vLINEA2',pic:''},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'edtavHdr2_Backcolor',ctrl:'vHDR2',prop:'Backcolor'},{av:'AV72Hdr1',fld:'vHDR1',pic:''},{av:'AV107Linea1',fld:'vLINEA1',pic:''},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'edtavHdr1_Backcolor',ctrl:'vHDR1',prop:'Backcolor'},{av:'edtavHdr1_Forecolor',ctrl:'vHDR1',prop:'Forecolor'}]}");
      setEventMetadata("'EXPORTAR RTF'","{handler:'e11AL1',iparms:[{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV67Filename',fld:'vFILENAME',pic:'',hsh:true}]");
      setEventMetadata("'EXPORTAR RTF'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV67Filename',fld:'vFILENAME',pic:'',hsh:true},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV341Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV67Filename',fld:'vFILENAME',pic:'',hsh:true},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV341Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV67Filename',fld:'vFILENAME',pic:'',hsh:true},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV341Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV83Hdr2',fld:'vHDR2',pic:'',hsh:true},{av:'AV7B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV70G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV291R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV67Filename',fld:'vFILENAME',pic:'',hsh:true},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV341Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV329Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV349FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV348FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV327t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV248MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV247Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV246Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV245Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV244Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV243Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV242Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV241Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV240MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV239MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV238MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV237MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV236MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV235MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV234MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV233MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV232MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV231Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV230MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV229MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV228MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV227MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV226Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV225Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV224Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV223Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV222Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV221Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV220Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV187Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV186Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV185Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV184Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV183Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV182Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV181Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV180Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV179Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV178Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV177Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV176Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV175Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV174Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV173Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV172Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV171Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV170Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV169Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV168Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV167Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV166Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV165Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV164Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV163MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV162Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV161MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV160Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV159Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV356MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:'',hsh:true},{av:'AV353Maquinastxt',fld:'vMAQUINASTXT',pic:'',hsh:true},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV256NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9',hsh:true},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV13Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV29Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV40Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]}");
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
      AV341Archivo = new com.genexus.util.GXFile();
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV60EmprCod = "" ;
      AV348FecInicio = GXutil.nullDate() ;
      AV349FechaFin = GXutil.nullDate() ;
      AV160Maqcod1 = "" ;
      AV161MaqCod10 = "" ;
      AV162Maqcod11 = "" ;
      AV163MaqCod12 = "" ;
      AV164Maqcod13 = "" ;
      AV165Maqcod14 = "" ;
      AV166Maqcod15 = "" ;
      AV167Maqcod16 = "" ;
      AV168Maqcod17 = "" ;
      AV169Maqcod18 = "" ;
      AV170Maqcod19 = "" ;
      AV171Maqcod2 = "" ;
      AV172Maqcod20 = "" ;
      AV173Maqcod21 = "" ;
      AV174Maqcod22 = "" ;
      AV175Maqcod23 = "" ;
      AV176Maqcod24 = "" ;
      AV177Maqcod25 = "" ;
      AV178Maqcod26 = "" ;
      AV179Maqcod27 = "" ;
      AV180Maqcod28 = "" ;
      AV181Maqcod3 = "" ;
      AV182Maqcod4 = "" ;
      AV183Maqcod5 = "" ;
      AV184Maqcod6 = "" ;
      AV185Maqcod7 = "" ;
      AV186Maqcod8 = "" ;
      AV187Maqcod9 = "" ;
      AV220Maqdsc1 = "" ;
      AV221Maqdsc10 = "" ;
      AV222Maqdsc11 = "" ;
      AV223Maqdsc12 = "" ;
      AV224Maqdsc13 = "" ;
      AV225Maqdsc14 = "" ;
      AV226Maqdsc15 = "" ;
      AV227MaqDsc16 = "" ;
      AV228MaqDsc17 = "" ;
      AV229MaqDsc18 = "" ;
      AV230MaqDsc19 = "" ;
      AV231Maqdsc2 = "" ;
      AV232MaqDsc20 = "" ;
      AV233MaqDsc21 = "" ;
      AV234MaqDsc22 = "" ;
      AV235MaqDsc23 = "" ;
      AV236MaqDsc24 = "" ;
      AV237MaqDsc25 = "" ;
      AV238MaqDsc26 = "" ;
      AV239MaqDsc27 = "" ;
      AV240MaqDsc28 = "" ;
      AV241Maqdsc3 = "" ;
      AV242Maqdsc4 = "" ;
      AV243Maqdsc5 = "" ;
      AV244Maqdsc6 = "" ;
      AV245Maqdsc7 = "" ;
      AV246Maqdsc8 = "" ;
      AV247Maqdsc9 = "" ;
      AV159Maqcod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV13Barcodpar = "" ;
      A150BarFacTin = "" ;
      AV83Hdr2 = "" ;
      AV353Maquinastxt = "" ;
      AV356MaquinasHdrstxt = "" ;
      AV67Filename = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV329Tab_maq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV329Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV248MaqHdrs = new String[100][1000] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV248MaqHdrs[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttExportarrtf_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV72Hdr1 = "" ;
      AV93Hdr3 = "" ;
      AV94Hdr4 = "" ;
      AV95Hdr5 = "" ;
      AV96Hdr6 = "" ;
      AV97Hdr7 = "" ;
      AV98Hdr8 = "" ;
      AV99Hdr9 = "" ;
      AV73Hdr10 = "" ;
      AV74Hdr11 = "" ;
      AV75Hdr12 = "" ;
      AV76Hdr13 = "" ;
      AV77Hdr14 = "" ;
      AV78Hdr15 = "" ;
      AV79Hdr16 = "" ;
      AV80Hdr17 = "" ;
      AV81Hdr18 = "" ;
      AV82Hdr19 = "" ;
      AV84Hdr20 = "" ;
      AV85Hdr21 = "" ;
      AV86Hdr22 = "" ;
      AV87Hdr23 = "" ;
      AV88Hdr24 = "" ;
      AV89Hdr25 = "" ;
      AV90Hdr26 = "" ;
      AV91Hdr27 = "" ;
      AV92Hdr28 = "" ;
      AV107Linea1 = "" ;
      AV108Linea10 = "" ;
      AV109Linea11 = "" ;
      AV110Linea12 = "" ;
      AV111Linea13 = "" ;
      AV112Linea14 = "" ;
      AV113Linea15 = "" ;
      AV114Linea16 = "" ;
      AV115Linea17 = "" ;
      AV116Linea18 = "" ;
      AV117Linea19 = "" ;
      AV118Linea2 = "" ;
      AV119Linea20 = "" ;
      AV120Linea21 = "" ;
      AV121Linea22 = "" ;
      AV122Linea23 = "" ;
      AV123Linea24 = "" ;
      AV124Linea25 = "" ;
      AV125Linea26 = "" ;
      AV126Linea27 = "" ;
      AV127Linea28 = "" ;
      AV128Linea3 = "" ;
      AV129Linea4 = "" ;
      AV130Linea5 = "" ;
      AV131Linea6 = "" ;
      AV132Linea7 = "" ;
      AV133LInea8 = "" ;
      AV134Linea9 = "" ;
      GXCCtl = "" ;
      AV326Station = "" ;
      AV61EmprNom = "" ;
      AV338UsurCod = "" ;
      AV48Carpeta = "" ;
      GXt_char1 = "" ;
      AV255NomInf = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
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
      AV261Partidas = DecimalUtil.ZERO ;
      AV332Texto = "" ;
      AV71Hdr = "" ;
      AV344EstadoFasegrid = "" ;
      GXv_int62 = new long[1] ;
      AV251Min = DecimalUtil.ZERO ;
      AV250Max = DecimalUtil.ZERO ;
      AV106L = DecimalUtil.ZERO ;
      AV47Cant = "" ;
      AV191MaqCodRc1 = "" ;
      AV202MaqCodRc2 = "" ;
      AV212MaqCodRc3 = "" ;
      AV213MaqCodRc4 = "" ;
      AV214MaqCodRc5 = "" ;
      AV215MaqCodRc6 = "" ;
      AV216MaqCodRc7 = "" ;
      AV217MaqCodRc8 = "" ;
      AV218MaqCodRc9 = "" ;
      AV192MaqCodRc10 = "" ;
      AV193MaqCodRc11 = "" ;
      AV194MaqCodRc12 = "" ;
      AV195MaqCodRc13 = "" ;
      AV196MaqCodRc14 = "" ;
      AV198MaqCodRc16 = "" ;
      AV199MaqCodRc17 = "" ;
      AV200MaqCodRc18 = "" ;
      AV201MaqCodRc19 = "" ;
      AV203MaqCodRc20 = "" ;
      AV204MaqCodRc21 = "" ;
      AV205MaqCodRc22 = "" ;
      AV206MaqCodRc23 = "" ;
      AV207MaqCodRc24 = "" ;
      AV208MaqCodRc25 = "" ;
      AV209MaqCodRc26 = "" ;
      AV210MaqCodRc27 = "" ;
      AV211MaqCodRc28 = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV333Texto_l = "" ;
      GXv_int64 = new short[1] ;
      GXv_int65 = new byte[1] ;
      GXv_char57 = new String[1] ;
      GXv_int63 = new short[1] ;
      GXv_char56 = new String[1] ;
      GXv_char55 = new String[1] ;
      GXv_int61 = new short[1] ;
      GXv_char60 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int67 = new byte[1] ;
      GXv_char59 = new String[1] ;
      GXv_int66 = new byte[1] ;
      AV65fecha = GXutil.nullDate() ;
      GXv_date68 = new java.util.Date[1] ;
      AV188MaqCodBis = "" ;
      GXv_char58 = new String[1] ;
      AV334Texto1 = "" ;
      scmdbuf = "" ;
      H00AL2_A758ProCod = new String[] {""} ;
      H00AL2_A153BarFasEst = new byte[1] ;
      H00AL2_A150BarFacTin = new String[] {""} ;
      H00AL2_A130BarCodPar = new String[] {""} ;
      H00AL2_A132BarCodReo = new byte[1] ;
      H00AL2_A129BarCod = new int[1] ;
      H00AL2_A396EmprCod = new String[] {""} ;
      H00AL2_A194BarOrdLin = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwkp107__default(),
         new Object[] {
             new Object[] {
            H00AL2_A758ProCod, H00AL2_A153BarFasEst, H00AL2_A150BarFacTin, H00AL2_A130BarCodPar, H00AL2_A132BarCodReo, H00AL2_A129BarCod, H00AL2_A396EmprCod, H00AL2_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
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
   private byte AV29Barfasestant ;
   private byte A132BarCodReo ;
   private byte AV17Barcodreo ;
   private byte A153BarFasEst ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV31BarFasestGrid1 ;
   private byte GXv_int65[] ;
   private byte GXv_int67[] ;
   private byte AV27BarFasEst ;
   private byte GXv_int66[] ;
   private byte AV62EstadoFaseHdr ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV327t ;
   private short AV40Barordlin ;
   private short A194BarOrdLin ;
   private short AV7B2 ;
   private short AV70G2 ;
   private short AV291R2 ;
   private short AV256NospMaq ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV347dias ;
   private short AV103i ;
   private short AV105k ;
   private short AV104j ;
   private short AV290R ;
   private short AV69G ;
   private short AV6B ;
   private short GXv_int64[] ;
   private short GXv_int63[] ;
   private short GXv_int61[] ;
   private int nRC_GXsfl_17 ;
   private int subGrid_Rows ;
   private int nGXsfl_17_idx=1 ;
   private int A129BarCod ;
   private int AV9Barcod ;
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
   private int GXv_int6[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GX_I ;
   private int GX_J ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long AV345Rgb ;
   private long GXv_int62[] ;
   private long AV294Rgb1 ;
   private long AV305Rgb2 ;
   private long AV315Rgb3 ;
   private long AV316Rgb4 ;
   private long AV317Rgb5 ;
   private long AV318Rgb6 ;
   private long AV319Rgb7 ;
   private long AV320Rgb8 ;
   private long AV321Rgb9 ;
   private long AV295Rgb10 ;
   private long AV296Rgb11 ;
   private long AV297Rgb12 ;
   private long AV298Rgb13 ;
   private long AV299Rgb14 ;
   private long AV300Rgb15 ;
   private long AV301Rgb16 ;
   private long AV302Rgb17 ;
   private long AV303Rgb18 ;
   private long AV304Rgb19 ;
   private long AV306Rgb20 ;
   private long AV307Rgb21 ;
   private long AV308Rgb22 ;
   private long AV309Rgb23 ;
   private long AV310Rgb24 ;
   private long AV311Rgb25 ;
   private long AV312Rgb26 ;
   private long AV313Rgb27 ;
   private long AV314Rgb28 ;
   private java.math.BigDecimal AV261Partidas ;
   private java.math.BigDecimal AV251Min ;
   private java.math.BigDecimal AV250Max ;
   private java.math.BigDecimal AV106L ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_17_idx="0001" ;
   private String AV60EmprCod ;
   private String AV160Maqcod1 ;
   private String AV161MaqCod10 ;
   private String AV162Maqcod11 ;
   private String AV163MaqCod12 ;
   private String AV164Maqcod13 ;
   private String AV165Maqcod14 ;
   private String AV166Maqcod15 ;
   private String AV167Maqcod16 ;
   private String AV168Maqcod17 ;
   private String AV169Maqcod18 ;
   private String AV170Maqcod19 ;
   private String AV171Maqcod2 ;
   private String AV172Maqcod20 ;
   private String AV173Maqcod21 ;
   private String AV174Maqcod22 ;
   private String AV175Maqcod23 ;
   private String AV176Maqcod24 ;
   private String AV177Maqcod25 ;
   private String AV178Maqcod26 ;
   private String AV179Maqcod27 ;
   private String AV180Maqcod28 ;
   private String AV181Maqcod3 ;
   private String AV182Maqcod4 ;
   private String AV183Maqcod5 ;
   private String AV184Maqcod6 ;
   private String AV185Maqcod7 ;
   private String AV186Maqcod8 ;
   private String AV187Maqcod9 ;
   private String AV220Maqdsc1 ;
   private String AV221Maqdsc10 ;
   private String AV222Maqdsc11 ;
   private String AV223Maqdsc12 ;
   private String AV224Maqdsc13 ;
   private String AV225Maqdsc14 ;
   private String AV226Maqdsc15 ;
   private String AV227MaqDsc16 ;
   private String AV228MaqDsc17 ;
   private String AV229MaqDsc18 ;
   private String AV230MaqDsc19 ;
   private String AV231Maqdsc2 ;
   private String AV232MaqDsc20 ;
   private String AV233MaqDsc21 ;
   private String AV234MaqDsc22 ;
   private String AV235MaqDsc23 ;
   private String AV236MaqDsc24 ;
   private String AV237MaqDsc25 ;
   private String AV238MaqDsc26 ;
   private String AV239MaqDsc27 ;
   private String AV240MaqDsc28 ;
   private String AV241Maqdsc3 ;
   private String AV242Maqdsc4 ;
   private String AV243Maqdsc5 ;
   private String AV244Maqdsc6 ;
   private String AV245Maqdsc7 ;
   private String AV246Maqdsc8 ;
   private String AV247Maqdsc9 ;
   private String AV159Maqcod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV13Barcodpar ;
   private String A150BarFacTin ;
   private String AV83Hdr2 ;
   private String AV67Filename ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV329Tab_maq[] ;
   private String AV248MaqHdrs[][] ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String grpGroup1_Internalname ;
   private String divGroup1table_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttExportarrtf_Internalname ;
   private String bttExportarrtf_Jsonclick ;
   private String divTable3_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV72Hdr1 ;
   private String edtavHdr1_Internalname ;
   private String edtavHdr2_Internalname ;
   private String AV93Hdr3 ;
   private String edtavHdr3_Internalname ;
   private String AV94Hdr4 ;
   private String edtavHdr4_Internalname ;
   private String AV95Hdr5 ;
   private String edtavHdr5_Internalname ;
   private String AV96Hdr6 ;
   private String edtavHdr6_Internalname ;
   private String AV97Hdr7 ;
   private String edtavHdr7_Internalname ;
   private String AV98Hdr8 ;
   private String edtavHdr8_Internalname ;
   private String AV99Hdr9 ;
   private String edtavHdr9_Internalname ;
   private String AV73Hdr10 ;
   private String edtavHdr10_Internalname ;
   private String AV74Hdr11 ;
   private String edtavHdr11_Internalname ;
   private String AV75Hdr12 ;
   private String edtavHdr12_Internalname ;
   private String AV76Hdr13 ;
   private String edtavHdr13_Internalname ;
   private String AV77Hdr14 ;
   private String edtavHdr14_Internalname ;
   private String AV78Hdr15 ;
   private String edtavHdr15_Internalname ;
   private String AV79Hdr16 ;
   private String edtavHdr16_Internalname ;
   private String AV80Hdr17 ;
   private String edtavHdr17_Internalname ;
   private String AV81Hdr18 ;
   private String edtavHdr18_Internalname ;
   private String AV82Hdr19 ;
   private String edtavHdr19_Internalname ;
   private String AV84Hdr20 ;
   private String edtavHdr20_Internalname ;
   private String AV85Hdr21 ;
   private String edtavHdr21_Internalname ;
   private String AV86Hdr22 ;
   private String edtavHdr22_Internalname ;
   private String AV87Hdr23 ;
   private String edtavHdr23_Internalname ;
   private String AV88Hdr24 ;
   private String edtavHdr24_Internalname ;
   private String AV89Hdr25 ;
   private String edtavHdr25_Internalname ;
   private String AV90Hdr26 ;
   private String edtavHdr26_Internalname ;
   private String AV91Hdr27 ;
   private String edtavHdr27_Internalname ;
   private String AV92Hdr28 ;
   private String edtavHdr28_Internalname ;
   private String AV107Linea1 ;
   private String edtavLinea1_Internalname ;
   private String AV108Linea10 ;
   private String edtavLinea10_Internalname ;
   private String AV109Linea11 ;
   private String edtavLinea11_Internalname ;
   private String AV110Linea12 ;
   private String edtavLinea12_Internalname ;
   private String AV111Linea13 ;
   private String edtavLinea13_Internalname ;
   private String AV112Linea14 ;
   private String edtavLinea14_Internalname ;
   private String AV113Linea15 ;
   private String edtavLinea15_Internalname ;
   private String AV114Linea16 ;
   private String edtavLinea16_Internalname ;
   private String AV115Linea17 ;
   private String edtavLinea17_Internalname ;
   private String AV116Linea18 ;
   private String edtavLinea18_Internalname ;
   private String AV117Linea19 ;
   private String edtavLinea19_Internalname ;
   private String AV118Linea2 ;
   private String edtavLinea2_Internalname ;
   private String AV119Linea20 ;
   private String edtavLinea20_Internalname ;
   private String AV120Linea21 ;
   private String edtavLinea21_Internalname ;
   private String AV121Linea22 ;
   private String edtavLinea22_Internalname ;
   private String AV122Linea23 ;
   private String edtavLinea23_Internalname ;
   private String AV123Linea24 ;
   private String edtavLinea24_Internalname ;
   private String AV124Linea25 ;
   private String edtavLinea25_Internalname ;
   private String AV125Linea26 ;
   private String edtavLinea26_Internalname ;
   private String AV126Linea27 ;
   private String edtavLinea27_Internalname ;
   private String AV127Linea28 ;
   private String edtavLinea28_Internalname ;
   private String AV128Linea3 ;
   private String edtavLinea3_Internalname ;
   private String AV129Linea4 ;
   private String edtavLinea4_Internalname ;
   private String AV130Linea5 ;
   private String edtavLinea5_Internalname ;
   private String AV131Linea6 ;
   private String edtavLinea6_Internalname ;
   private String AV132Linea7 ;
   private String edtavLinea7_Internalname ;
   private String AV133LInea8 ;
   private String edtavLinea8_Internalname ;
   private String AV134Linea9 ;
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
   private String GXCCtl ;
   private String AV326Station ;
   private String AV61EmprNom ;
   private String AV338UsurCod ;
   private String AV48Carpeta ;
   private String GXt_char1 ;
   private String AV255NomInf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
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
   private String AV332Texto ;
   private String AV71Hdr ;
   private String AV344EstadoFasegrid ;
   private String AV47Cant ;
   private String AV191MaqCodRc1 ;
   private String AV202MaqCodRc2 ;
   private String AV212MaqCodRc3 ;
   private String AV213MaqCodRc4 ;
   private String AV214MaqCodRc5 ;
   private String AV215MaqCodRc6 ;
   private String AV216MaqCodRc7 ;
   private String AV217MaqCodRc8 ;
   private String AV218MaqCodRc9 ;
   private String AV192MaqCodRc10 ;
   private String AV193MaqCodRc11 ;
   private String AV194MaqCodRc12 ;
   private String AV195MaqCodRc13 ;
   private String AV196MaqCodRc14 ;
   private String AV198MaqCodRc16 ;
   private String AV199MaqCodRc17 ;
   private String AV200MaqCodRc18 ;
   private String AV201MaqCodRc19 ;
   private String AV203MaqCodRc20 ;
   private String AV204MaqCodRc21 ;
   private String AV205MaqCodRc22 ;
   private String AV206MaqCodRc23 ;
   private String AV207MaqCodRc24 ;
   private String AV208MaqCodRc25 ;
   private String AV209MaqCodRc26 ;
   private String AV210MaqCodRc27 ;
   private String AV211MaqCodRc28 ;
   private String AV333Texto_l ;
   private String GXv_char57[] ;
   private String GXv_char56[] ;
   private String GXv_char55[] ;
   private String GXv_char60[] ;
   private String GXv_char59[] ;
   private String AV188MaqCodBis ;
   private String GXv_char58[] ;
   private String AV334Texto1 ;
   private String scmdbuf ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
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
   private java.util.Date AV348FecInicio ;
   private java.util.Date AV349FechaFin ;
   private java.util.Date AV65fecha ;
   private java.util.Date GXv_date68[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV353Maquinastxt ;
   private String AV356MaquinasHdrstxt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.util.GXFile AV341Archivo ;
   private IDataStoreProvider pr_default ;
   private String[] H00AL2_A758ProCod ;
   private byte[] H00AL2_A153BarFasEst ;
   private String[] H00AL2_A150BarFacTin ;
   private String[] H00AL2_A130BarCodPar ;
   private byte[] H00AL2_A132BarCodReo ;
   private int[] H00AL2_A129BarCod ;
   private String[] H00AL2_A396EmprCod ;
   private short[] H00AL2_A194BarOrdLin ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwkp107__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00AL2", "SELECT * FROM (SELECT ProCod, BarFasEst, BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst < 2) AND (BarFacTin = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

