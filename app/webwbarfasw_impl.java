package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwbarfasw_impl extends GXDataArea
{
   public webwbarfasw_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwbarfasw_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwbarfasw_impl.class ));
   }

   public webwbarfasw_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
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
            AV29EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
               AV6BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
               AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
               AV8ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ProCod", AV8ProCod);
               AV9Prodsc = httpContext.GetPar( "Prodsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Prodsc", AV9Prodsc);
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_42 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_42"))) ;
      nGXsfl_42_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_42_idx"))) ;
      sGXsfl_42_idx = httpContext.GetPar( "sGXsfl_42_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      AV40Num_f = (short)(GXutil.lval( httpContext.GetPar( "Num_f"))) ;
      AV18Barfasdti = localUtil.parseDTimeParm( httpContext.GetPar( "Barfasdti")) ;
      AV17Barfasdtf = localUtil.parseDTimeParm( httpContext.GetPar( "Barfasdtf")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      n129BarCod = false ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      n132BarCodReo = false ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      n130BarCodPar = false ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV29EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV6BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV8ProCod = httpContext.GetPar( "ProCod") ;
      AV25BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      A460FasDsc = httpContext.GetPar( "FasDsc") ;
      A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A4905BarFasAcab = httpContext.GetPar( "BarFasAcab") ;
      A152BarFasCon = httpContext.GetPar( "BarFasCon") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A4287BarFasFor = httpContext.GetPar( "BarFasFor") ;
      A3837BarFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarFasKgm"), ".") ;
      n3837BarFasKgm = false ;
      A3838BarFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarFasMtr"), ".") ;
      n3838BarFasMtr = false ;
      A215BarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "BarTieRea"), ".") ;
      A216BarTieTeo = CommonUtil.decimalVal( httpContext.GetPar( "BarTieTeo"), ".") ;
      A4442BarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "BarFasDTI")) ;
      n4442BarFasDTI = false ;
      A4443BarFasDTF = localUtil.parseDTimeParm( httpContext.GetPar( "BarFasDTF")) ;
      n4443BarFasDTF = false ;
      A5048BarFasUsu = httpContext.GetPar( "BarFasUsu") ;
      n5048BarFasUsu = false ;
      A3836BarFasPri = (byte)(GXutil.lval( httpContext.GetPar( "BarFasPri"))) ;
      A2265BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      n2265BarExt = false ;
      A2689ExHdrFas = httpContext.GetPar( "ExHdrFas") ;
      AV31Fascod = httpContext.GetPar( "Fascod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV40Num_f, AV18Barfasdti, AV17Barfasdtf, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV29EmprCod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV8ProCod, AV25BarOrdLin, A457FasCod, A460FasDsc, A603MaqCodBis, A150BarFacTin, A4905BarFasAcab, A152BarFasCon, A153BarFasEst, A4287BarFasFor, A3837BarFasKgm, A3838BarFasMtr, A215BarTieRea, A216BarTieTeo, A4442BarFasDTI, A4443BarFasDTF, A5048BarFasUsu, A3836BarFasPri, A2265BarExt, A2689ExHdrFas, AV31Fascod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
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
      paF82( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startF82( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwbarfasw", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV8ProCod)),GXutil.URLEncode(GXutil.rtrim(AV9Prodsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_F", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Num_f), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_42", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_42, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV54Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_F", GXutil.ltrim( localUtil.ntoc( AV40Num_f, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_F", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Num_f), "ZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_ORD", AV47Tab_ord);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_ORD", AV47Tab_ord);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV6BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV7BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON", GXutil.rtrim( A152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASKGM", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASMTR", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEREA", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASDTI", localUtil.ttoc( A4442BarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASDTF", localUtil.ttoc( A4443BarFasDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASUSU", GXutil.rtrim( A5048BarFasUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASPRI", GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHDRFAS", GXutil.rtrim( A2689ExHdrFas));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Class", GXutil.rtrim( Grid1paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showfirst", GXutil.booltostr( Grid1paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showprevious", GXutil.booltostr( Grid1paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Shownext", GXutil.booltostr( Grid1paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showlast", GXutil.booltostr( Grid1paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Grid1paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Grid1paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Grid1paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Grid1paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Grid1paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Previous", GXutil.rtrim( Grid1paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Next", GXutil.rtrim( Grid1paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Caption", GXutil.rtrim( Grid1paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Grid1paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Grid1paginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         weF82( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtF82( ) ;
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
      return formatLink("app.webwbarfasw", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV8ProCod)),GXutil.URLEncode(GXutil.rtrim(AV9Prodsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc"})  ;
   }

   public String getPgmname( )
   {
      return "WebWBARFASw" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alta, Baja, Modificacion FASES", "") ;
   }

   public void wbF80( )
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
         wb_table1_11_F82( true) ;
      }
      else
      {
         wb_table1_11_F82( false) ;
      }
      return  ;
   }

   public void wb_table1_11_F82e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol42( ) ;
      }
      if ( wbEnd == 42 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_42 = (int)(nGXsfl_42_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGrid1paginationbar.setProperty("Class", Grid1paginationbar_Class);
         ucGrid1paginationbar.setProperty("ShowFirst", Grid1paginationbar_Showfirst);
         ucGrid1paginationbar.setProperty("ShowPrevious", Grid1paginationbar_Showprevious);
         ucGrid1paginationbar.setProperty("ShowNext", Grid1paginationbar_Shownext);
         ucGrid1paginationbar.setProperty("ShowLast", Grid1paginationbar_Showlast);
         ucGrid1paginationbar.setProperty("PagesToShow", Grid1paginationbar_Pagestoshow);
         ucGrid1paginationbar.setProperty("PagingButtonsPosition", Grid1paginationbar_Pagingbuttonsposition);
         ucGrid1paginationbar.setProperty("PagingCaptionPosition", Grid1paginationbar_Pagingcaptionposition);
         ucGrid1paginationbar.setProperty("EmptyGridClass", Grid1paginationbar_Emptygridclass);
         ucGrid1paginationbar.setProperty("RowsPerPageSelector", Grid1paginationbar_Rowsperpageselector);
         ucGrid1paginationbar.setProperty("RowsPerPageOptions", Grid1paginationbar_Rowsperpageoptions);
         ucGrid1paginationbar.setProperty("Previous", Grid1paginationbar_Previous);
         ucGrid1paginationbar.setProperty("Next", Grid1paginationbar_Next);
         ucGrid1paginationbar.setProperty("Caption", Grid1paginationbar_Caption);
         ucGrid1paginationbar.setProperty("EmptyGridCaption", Grid1paginationbar_Emptygridcaption);
         ucGrid1paginationbar.setProperty("RowsPerPageCaption", Grid1paginationbar_Rowsperpagecaption);
         ucGrid1paginationbar.setProperty("CurrentPage", AV53Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV54Grid1PageCount);
         ucGrid1paginationbar.render(context, "dvelop.dvpaginationbar", Grid1paginationbar_Internalname, "GRID1PAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_42_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV53Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWBARFASw.htm");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 42 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startF82( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Alta, Baja, Modificacion FASES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupF80( ) ;
   }

   public void wsF82( )
   {
      startF82( ) ;
      evtF82( ) ;
   }

   public void evtF82( )
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
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11F82 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12F82 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_42_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_422( ) ;
                           AV25BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarOrdLin), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( DecimalUtil.doubleToDec(AV25BarOrdLin), "ZZZ9")));
                           AV31Fascod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV31Fascod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, GXutil.rtrim( localUtil.format( AV31Fascod, "@!"))));
                           AV32Fasdsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV32Fasdsc);
                           AV16Barfascon = GXutil.upper( httpContext.cgiGet( edtavBarfascon_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfascon_Internalname, AV16Barfascon);
                           AV19BarFasest = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV19BarFasest, 1, 0));
                           AV36MaqCodbis = httpContext.cgiGet( edtavMaqcodbis_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcodbis_Internalname, AV36MaqCodbis);
                           AV14Barfactin = GXutil.upper( httpContext.cgiGet( edtavBarfactin_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfactin_Internalname, AV14Barfactin);
                           AV20Barfasfor = GXutil.upper( httpContext.cgiGet( edtavBarfasfor_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasfor_Internalname, AV20Barfasfor);
                           AV15Barfasacab = GXutil.upper( httpContext.cgiGet( edtavBarfasacab_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasacab_Internalname, AV15Barfasacab);
                           AV21BarFaskgm = localUtil.ctond( httpContext.cgiGet( edtavBarfaskgm_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfaskgm_Internalname, GXutil.ltrimstr( AV21BarFaskgm, 9, 2));
                           AV22BarFasmtr = localUtil.ctond( httpContext.cgiGet( edtavBarfasmtr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasmtr_Internalname, GXutil.ltrimstr( AV22BarFasmtr, 9, 2));
                           AV27BarTieteo = localUtil.ctond( httpContext.cgiGet( edtavBartieteo_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBartieteo_Internalname, GXutil.ltrimstr( AV27BarTieteo, 5, 2));
                           AV26Bartierea = localUtil.ctond( httpContext.cgiGet( edtavBartierea_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBartierea_Internalname, GXutil.ltrimstr( AV26Bartierea, 5, 2));
                           AV18Barfasdti = localUtil.ctot( httpContext.cgiGet( edtavBarfasdti_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasdti_Internalname, localUtil.ttoc( AV18Barfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTI"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV18Barfasdti, "99/99/99 99:99:99")));
                           AV17Barfasdtf = localUtil.ctot( httpContext.cgiGet( edtavBarfasdtf_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasdtf_Internalname, localUtil.ttoc( AV17Barfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTF"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV17Barfasdtf, "99/99/99 99:99:99")));
                           AV24Barfasusu = GXutil.upper( httpContext.cgiGet( edtavBarfasusu_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfasusu_Internalname, AV24Barfasusu);
                           AV13Barext = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarext_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarext_Internalname, GXutil.str( AV13Barext, 1, 0));
                           AV23BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfaspri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfaspri_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarFasPri), 2, 0));
                           AV41OldOrden = (short)(localUtil.ctol( httpContext.cgiGet( edtavOldorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavOldorden_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OldOrden), 4, 0));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13F82 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14F82 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e15F82 ();
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

   public void weF82( )
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

   public void paF82( )
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
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_422( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         sendrow_422( ) ;
         nGXsfl_42_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  short AV40Num_f ,
                                  java.util.Date AV18Barfasdti ,
                                  java.util.Date AV17Barfasdtf ,
                                  String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar ,
                                  String A758ProCod ,
                                  short A194BarOrdLin ,
                                  String AV29EmprCod ,
                                  int AV5BarCod ,
                                  byte AV6BarCodReo ,
                                  String AV7BarCodPar ,
                                  String AV8ProCod ,
                                  short AV25BarOrdLin ,
                                  String A457FasCod ,
                                  String A460FasDsc ,
                                  String A603MaqCodBis ,
                                  String A150BarFacTin ,
                                  String A4905BarFasAcab ,
                                  String A152BarFasCon ,
                                  byte A153BarFasEst ,
                                  String A4287BarFasFor ,
                                  java.math.BigDecimal A3837BarFasKgm ,
                                  java.math.BigDecimal A3838BarFasMtr ,
                                  java.math.BigDecimal A215BarTieRea ,
                                  java.math.BigDecimal A216BarTieTeo ,
                                  java.util.Date A4442BarFasDTI ,
                                  java.util.Date A4443BarFasDTF ,
                                  String A5048BarFasUsu ,
                                  byte A3836BarFasPri ,
                                  byte A2265BarExt ,
                                  String A2689ExHdrFas ,
                                  String AV31Fascod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14F82 ();
      GRID1_nCurrentRecord = 0 ;
      rfF82( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTI", getSecureSignedToken( "", localUtil.format( AV18Barfasdti, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASDTI", localUtil.ttoc( AV18Barfasdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTF", getSecureSignedToken( "", localUtil.format( AV17Barfasdtf, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASDTF", localUtil.ttoc( AV17Barfasdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV25BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31Fascod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV31Fascod));
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
      rfF82( ) ;
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
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfascon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfascon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascon_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasest_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavMaqcodbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfactin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfactin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfactin_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasfor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasfor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasfor_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasacab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasacab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasacab_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfaskgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfaskgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfaskgm_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasmtr_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBartieteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartieteo_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBartierea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartierea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartierea_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasdtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasdtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdtf_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasusu_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarext_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfaspri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfaspri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfaspri_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavOldorden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldorden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldorden_Enabled), 5, 0), !bGXsfl_42_Refreshing);
   }

   public void rfF82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(42) ;
      /* Execute user event: Refresh */
      e14F82 ();
      nGXsfl_42_idx = 1 ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_422( ) ;
      bGXsfl_42_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_422( ) ;
         e15F82 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_42_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e15F82 ();
         }
         wbEnd = (short)(42) ;
         wbF80( ) ;
      }
      bGXsfl_42_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesF82( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_F", GXutil.ltrim( localUtil.ntoc( AV40Num_f, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_F", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Num_f), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTI"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV18Barfasdti, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTF"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV17Barfasdtf, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( DecimalUtil.doubleToDec(AV25BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, GXutil.rtrim( localUtil.format( AV31Fascod, "@!"))));
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return (int)(((subGrid1_Recordcount==0) ? GRID1_nFirstRecordOnPage+1 : subGrid1_Recordcount)) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(((subGrid1_Islastpage==1) ? subgrid1_fnc_recordcount( )/ (double) (subgrid1_fnc_recordsperpage( ))+((((int)((subgrid1_fnc_recordcount( )) % (subgrid1_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV40Num_f, AV18Barfasdti, AV17Barfasdtf, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV29EmprCod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV8ProCod, AV25BarOrdLin, A457FasCod, A460FasDsc, A603MaqCodBis, A150BarFacTin, A4905BarFasAcab, A152BarFasCon, A153BarFasEst, A4287BarFasFor, A3837BarFasKgm, A3838BarFasMtr, A215BarTieRea, A216BarTieTeo, A4442BarFasDTI, A4443BarFasDTF, A5048BarFasUsu, A3836BarFasPri, A2265BarExt, A2689ExHdrFas, AV31Fascod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV40Num_f, AV18Barfasdti, AV17Barfasdtf, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV29EmprCod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV8ProCod, AV25BarOrdLin, A457FasCod, A460FasDsc, A603MaqCodBis, A150BarFacTin, A4905BarFasAcab, A152BarFasCon, A153BarFasEst, A4287BarFasFor, A3837BarFasKgm, A3838BarFasMtr, A215BarTieRea, A216BarTieTeo, A4442BarFasDTI, A4443BarFasDTF, A5048BarFasUsu, A3836BarFasPri, A2265BarExt, A2689ExHdrFas, AV31Fascod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV40Num_f, AV18Barfasdti, AV17Barfasdtf, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV29EmprCod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV8ProCod, AV25BarOrdLin, A457FasCod, A460FasDsc, A603MaqCodBis, A150BarFacTin, A4905BarFasAcab, A152BarFasCon, A153BarFasEst, A4287BarFasFor, A3837BarFasKgm, A3838BarFasMtr, A215BarTieRea, A216BarTieTeo, A4442BarFasDTI, A4443BarFasDTF, A5048BarFasUsu, A3836BarFasPri, A2265BarExt, A2689ExHdrFas, AV31Fascod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV40Num_f, AV18Barfasdti, AV17Barfasdtf, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV29EmprCod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV8ProCod, AV25BarOrdLin, A457FasCod, A460FasDsc, A603MaqCodBis, A150BarFacTin, A4905BarFasAcab, A152BarFasCon, A153BarFasEst, A4287BarFasFor, A3837BarFasKgm, A3838BarFasMtr, A215BarTieRea, A216BarTieTeo, A4442BarFasDTI, A4443BarFasDTF, A5048BarFasUsu, A3836BarFasPri, A2265BarExt, A2689ExHdrFas, AV31Fascod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV40Num_f, AV18Barfasdti, AV17Barfasdtf, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV29EmprCod, AV5BarCod, AV6BarCodReo, AV7BarCodPar, AV8ProCod, AV25BarOrdLin, A457FasCod, A460FasDsc, A603MaqCodBis, A150BarFacTin, A4905BarFasAcab, A152BarFasCon, A153BarFasEst, A4287BarFasFor, A3837BarFasKgm, A3838BarFasMtr, A215BarTieRea, A216BarTieTeo, A4442BarFasDTI, A4443BarFasDTF, A5048BarFasUsu, A3836BarFasPri, A2265BarExt, A2689ExHdrFas, AV31Fascod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfascon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfascon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascon_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasest_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavMaqcodbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodbis_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfactin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfactin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfactin_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasfor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasfor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasfor_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasacab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasacab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasacab_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfaskgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfaskgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfaskgm_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasmtr_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBartieteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartieteo_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBartierea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartierea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartierea_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasdtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasdtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdtf_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfasusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasusu_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarext_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavBarfaspri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfaspri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfaspri_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavOldorden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldorden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldorden_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupF80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13F82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Grid1paginationbar_Class = httpContext.cgiGet( "GRID1PAGINATIONBAR_Class") ;
         Grid1paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showfirst")) ;
         Grid1paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showprevious")) ;
         Grid1paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Shownext")) ;
         Grid1paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showlast")) ;
         Grid1paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingbuttonsposition") ;
         Grid1paginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingcaptionposition") ;
         Grid1paginationbar_Emptygridclass = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridclass") ;
         Grid1paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselector")) ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageoptions") ;
         Grid1paginationbar_Previous = httpContext.cgiGet( "GRID1PAGINATIONBAR_Previous") ;
         Grid1paginationbar_Next = httpContext.cgiGet( "GRID1PAGINATIONBAR_Next") ;
         Grid1paginationbar_Caption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Caption") ;
         Grid1paginationbar_Emptygridcaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridcaption") ;
         Grid1paginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpagecaption") ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV53Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
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
      e13F82 ();
      if (returnInSub) return;
   }

   public void e13F82( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGOTABLA' */
      S112 ();
      if (returnInSub) return;
      AV40Num_f = AV33i ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Num_f", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Num_f), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_F", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Num_f), "ZZ9")));
      GXt_char1 = AV46Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwbarfasw_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Station = GXt_char1 ;
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV50UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwbarfasw_impl.this.AV29EmprCod = GXv_char2[0] ;
      webwbarfasw_impl.this.AV30EmprNom = GXv_char3[0] ;
      webwbarfasw_impl.this.AV50UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV53Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV54Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Grid1PageCount), 10, 0));
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14F82( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e15F82( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV33i = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33i), 3, 0));
      while ( AV33i <= AV40Num_f )
      {
         AV25BarOrdLin = AV47Tab_ord[AV33i-1] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarOrdLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( DecimalUtil.doubleToDec(AV25BarOrdLin), "ZZZ9")));
         AV41OldOrden = AV25BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavOldorden_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OldOrden), 4, 0));
         if ( AV25BarOrdLin > 0 )
         {
            /* Execute user subroutine: 'MASINF' */
            S122 ();
            if (returnInSub) return;
         }
         else
         {
            AV31Fascod = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV31Fascod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, GXutil.rtrim( localUtil.format( AV31Fascod, "@!"))));
            AV32Fasdsc = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV32Fasdsc);
            AV36MaqCodbis = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMaqcodbis_Internalname, AV36MaqCodbis);
            AV14Barfactin = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfactin_Internalname, AV14Barfactin);
            AV15Barfasacab = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasacab_Internalname, AV15Barfasacab);
            AV16Barfascon = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfascon_Internalname, AV16Barfascon);
            AV19BarFasest = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV19BarFasest, 1, 0));
            AV20Barfasfor = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasfor_Internalname, AV20Barfasfor);
            AV21BarFaskgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfaskgm_Internalname, GXutil.ltrimstr( AV21BarFaskgm, 9, 2));
            AV22BarFasmtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasmtr_Internalname, GXutil.ltrimstr( AV22BarFasmtr, 9, 2));
            AV26Bartierea = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBartierea_Internalname, GXutil.ltrimstr( AV26Bartierea, 5, 2));
            AV27BarTieteo = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBartieteo_Internalname, GXutil.ltrimstr( AV27BarTieteo, 5, 2));
            AV18Barfasdti = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasdti_Internalname, localUtil.ttoc( AV18Barfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTI"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV18Barfasdti, "99/99/99 99:99:99")));
            AV17Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasdtf_Internalname, localUtil.ttoc( AV17Barfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTF"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV17Barfasdtf, "99/99/99 99:99:99")));
            AV24Barfasusu = "" ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfasusu_Internalname, AV24Barfasusu);
            AV41OldOrden = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavOldorden_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41OldOrden), 4, 0));
            AV23BarFasPri = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarfaspri_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarFasPri), 2, 0));
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(42) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
         {
            sendrow_422( ) ;
            GRID1_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
            }
         }
         if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) )
         {
            GRID1_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_42_Refreshing )
         {
            httpContext.doAjaxLoad(42, Grid1Row);
         }
         AV33i = (short)(AV33i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33i), 3, 0));
      }
      /*  Sending Event outputs  */
   }

   public void e11F82( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV53Grid1CurrentPage = (long)(AV53Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV53Grid1CurrentPage = (long)(AV53Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV52PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV53Grid1CurrentPage = AV52PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV52PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12F82( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV53Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CARGOTABLA' Routine */
      returnInSub = false ;
      AV33i = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33i), 3, 0));
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV47Tab_ord[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor H00F82 */
      pr_default.execute(0, new Object[] {AV29EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar, AV8ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = H00F82_A758ProCod[0] ;
         A130BarCodPar = H00F82_A130BarCodPar[0] ;
         n130BarCodPar = H00F82_n130BarCodPar[0] ;
         A132BarCodReo = H00F82_A132BarCodReo[0] ;
         n132BarCodReo = H00F82_n132BarCodReo[0] ;
         A129BarCod = H00F82_A129BarCod[0] ;
         n129BarCod = H00F82_n129BarCod[0] ;
         A396EmprCod = H00F82_A396EmprCod[0] ;
         A194BarOrdLin = H00F82_A194BarOrdLin[0] ;
         AV47Tab_ord[AV33i-1] = A194BarOrdLin ;
         AV33i = (short)(AV33i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33i), 3, 0));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S122( )
   {
      /* 'MASINF' Routine */
      returnInSub = false ;
      /* Using cursor H00F83 */
      pr_default.execute(1, new Object[] {AV29EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar, AV8ProCod, Short.valueOf(AV25BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = H00F83_A194BarOrdLin[0] ;
         A758ProCod = H00F83_A758ProCod[0] ;
         A130BarCodPar = H00F83_A130BarCodPar[0] ;
         n130BarCodPar = H00F83_n130BarCodPar[0] ;
         A132BarCodReo = H00F83_A132BarCodReo[0] ;
         n132BarCodReo = H00F83_n132BarCodReo[0] ;
         A129BarCod = H00F83_A129BarCod[0] ;
         n129BarCod = H00F83_n129BarCod[0] ;
         A396EmprCod = H00F83_A396EmprCod[0] ;
         A457FasCod = H00F83_A457FasCod[0] ;
         A460FasDsc = H00F83_A460FasDsc[0] ;
         A603MaqCodBis = H00F83_A603MaqCodBis[0] ;
         A150BarFacTin = H00F83_A150BarFacTin[0] ;
         A4905BarFasAcab = H00F83_A4905BarFasAcab[0] ;
         A152BarFasCon = H00F83_A152BarFasCon[0] ;
         A153BarFasEst = H00F83_A153BarFasEst[0] ;
         A4287BarFasFor = H00F83_A4287BarFasFor[0] ;
         A3837BarFasKgm = H00F83_A3837BarFasKgm[0] ;
         n3837BarFasKgm = H00F83_n3837BarFasKgm[0] ;
         A3838BarFasMtr = H00F83_A3838BarFasMtr[0] ;
         n3838BarFasMtr = H00F83_n3838BarFasMtr[0] ;
         A215BarTieRea = H00F83_A215BarTieRea[0] ;
         A216BarTieTeo = H00F83_A216BarTieTeo[0] ;
         A4442BarFasDTI = H00F83_A4442BarFasDTI[0] ;
         n4442BarFasDTI = H00F83_n4442BarFasDTI[0] ;
         A4443BarFasDTF = H00F83_A4443BarFasDTF[0] ;
         n4443BarFasDTF = H00F83_n4443BarFasDTF[0] ;
         A5048BarFasUsu = H00F83_A5048BarFasUsu[0] ;
         n5048BarFasUsu = H00F83_n5048BarFasUsu[0] ;
         A3836BarFasPri = H00F83_A3836BarFasPri[0] ;
         A2265BarExt = H00F83_A2265BarExt[0] ;
         n2265BarExt = H00F83_n2265BarExt[0] ;
         A2265BarExt = H00F83_A2265BarExt[0] ;
         n2265BarExt = H00F83_n2265BarExt[0] ;
         A460FasDsc = H00F83_A460FasDsc[0] ;
         AV31Fascod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV31Fascod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, GXutil.rtrim( localUtil.format( AV31Fascod, "@!"))));
         AV32Fasdsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV32Fasdsc);
         AV36MaqCodbis = A603MaqCodBis ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcodbis_Internalname, AV36MaqCodbis);
         AV14Barfactin = A150BarFacTin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfactin_Internalname, AV14Barfactin);
         AV15Barfasacab = A4905BarFasAcab ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasacab_Internalname, AV15Barfasacab);
         AV16Barfascon = A152BarFasCon ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfascon_Internalname, AV16Barfascon);
         AV19BarFasest = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasest_Internalname, GXutil.str( AV19BarFasest, 1, 0));
         AV20Barfasfor = A4287BarFasFor ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasfor_Internalname, AV20Barfasfor);
         AV21BarFaskgm = A3837BarFasKgm ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfaskgm_Internalname, GXutil.ltrimstr( AV21BarFaskgm, 9, 2));
         AV22BarFasmtr = A3838BarFasMtr ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasmtr_Internalname, GXutil.ltrimstr( AV22BarFasmtr, 9, 2));
         AV26Bartierea = A215BarTieRea ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBartierea_Internalname, GXutil.ltrimstr( AV26Bartierea, 5, 2));
         AV27BarTieteo = A216BarTieTeo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBartieteo_Internalname, GXutil.ltrimstr( AV27BarTieteo, 5, 2));
         AV18Barfasdti = A4442BarFasDTI ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasdti_Internalname, localUtil.ttoc( AV18Barfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTI"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV18Barfasdti, "99/99/99 99:99:99")));
         AV17Barfasdtf = A4443BarFasDTF ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasdtf_Internalname, localUtil.ttoc( AV17Barfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASDTF"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV17Barfasdtf, "99/99/99 99:99:99")));
         AV24Barfasusu = A5048BarFasUsu ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfasusu_Internalname, AV24Barfasusu);
         AV23BarFasPri = A3836BarFasPri ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfaspri_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23BarFasPri), 2, 0));
         AV13Barext = A2265BarExt ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarext_Internalname, GXutil.str( AV13Barext, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Execute user subroutine: 'LEXMVH' */
      S132 ();
      if (returnInSub) return;
   }

   public void S132( )
   {
      /* 'LEXMVH' Routine */
      returnInSub = false ;
      AV35Lexmvh = (byte)(0) ;
      /* Using cursor H00F84 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar, AV31Fascod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A129BarCod = H00F84_A129BarCod[0] ;
         n129BarCod = H00F84_n129BarCod[0] ;
         A132BarCodReo = H00F84_A132BarCodReo[0] ;
         n132BarCodReo = H00F84_n132BarCodReo[0] ;
         A130BarCodPar = H00F84_A130BarCodPar[0] ;
         n130BarCodPar = H00F84_n130BarCodPar[0] ;
         A2689ExHdrFas = H00F84_A2689ExHdrFas[0] ;
         A396EmprCod = H00F84_A396EmprCod[0] ;
         AV35Lexmvh = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void wb_table1_11_F82( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprocod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprocod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWBARFASw.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( AV8ProCod), GXutil.rtrim( localUtil.format( AV8ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWBARFASw.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprodsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprodsc_Internalname, "", "", "", lblTextblockprodsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWBARFASw.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProdsc_Internalname, httpContext.getMessage( "Descripcion ", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProdsc_Internalname, GXutil.rtrim( AV9Prodsc), GXutil.rtrim( localUtil.format( AV9Prodsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProdsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWBARFASw.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_11_F82e( true) ;
      }
      else
      {
         wb_table1_11_F82e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV29EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      AV5BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV6BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
      AV7BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      AV8ProCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ProCod", AV8ProCod);
      AV9Prodsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Prodsc", AV9Prodsc);
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
      paF82( ) ;
      wsF82( ) ;
      weF82( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016412024", true, true);
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
         httpContext.AddJavascriptSource("webwbarfasw.js", "?202661016412024", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_422( )
   {
      edtavBarordlin_Internalname = "vBARORDLIN_"+sGXsfl_42_idx ;
      edtavFascod_Internalname = "vFASCOD_"+sGXsfl_42_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_42_idx ;
      edtavBarfascon_Internalname = "vBARFASCON_"+sGXsfl_42_idx ;
      edtavBarfasest_Internalname = "vBARFASEST_"+sGXsfl_42_idx ;
      edtavMaqcodbis_Internalname = "vMAQCODBIS_"+sGXsfl_42_idx ;
      edtavBarfactin_Internalname = "vBARFACTIN_"+sGXsfl_42_idx ;
      edtavBarfasfor_Internalname = "vBARFASFOR_"+sGXsfl_42_idx ;
      edtavBarfasacab_Internalname = "vBARFASACAB_"+sGXsfl_42_idx ;
      edtavBarfaskgm_Internalname = "vBARFASKGM_"+sGXsfl_42_idx ;
      edtavBarfasmtr_Internalname = "vBARFASMTR_"+sGXsfl_42_idx ;
      edtavBartieteo_Internalname = "vBARTIETEO_"+sGXsfl_42_idx ;
      edtavBartierea_Internalname = "vBARTIEREA_"+sGXsfl_42_idx ;
      edtavBarfasdti_Internalname = "vBARFASDTI_"+sGXsfl_42_idx ;
      edtavBarfasdtf_Internalname = "vBARFASDTF_"+sGXsfl_42_idx ;
      edtavBarfasusu_Internalname = "vBARFASUSU_"+sGXsfl_42_idx ;
      edtavBarext_Internalname = "vBAREXT_"+sGXsfl_42_idx ;
      edtavBarfaspri_Internalname = "vBARFASPRI_"+sGXsfl_42_idx ;
      edtavOldorden_Internalname = "vOLDORDEN_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_422( )
   {
      edtavBarordlin_Internalname = "vBARORDLIN_"+sGXsfl_42_fel_idx ;
      edtavFascod_Internalname = "vFASCOD_"+sGXsfl_42_fel_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_42_fel_idx ;
      edtavBarfascon_Internalname = "vBARFASCON_"+sGXsfl_42_fel_idx ;
      edtavBarfasest_Internalname = "vBARFASEST_"+sGXsfl_42_fel_idx ;
      edtavMaqcodbis_Internalname = "vMAQCODBIS_"+sGXsfl_42_fel_idx ;
      edtavBarfactin_Internalname = "vBARFACTIN_"+sGXsfl_42_fel_idx ;
      edtavBarfasfor_Internalname = "vBARFASFOR_"+sGXsfl_42_fel_idx ;
      edtavBarfasacab_Internalname = "vBARFASACAB_"+sGXsfl_42_fel_idx ;
      edtavBarfaskgm_Internalname = "vBARFASKGM_"+sGXsfl_42_fel_idx ;
      edtavBarfasmtr_Internalname = "vBARFASMTR_"+sGXsfl_42_fel_idx ;
      edtavBartieteo_Internalname = "vBARTIETEO_"+sGXsfl_42_fel_idx ;
      edtavBartierea_Internalname = "vBARTIEREA_"+sGXsfl_42_fel_idx ;
      edtavBarfasdti_Internalname = "vBARFASDTI_"+sGXsfl_42_fel_idx ;
      edtavBarfasdtf_Internalname = "vBARFASDTF_"+sGXsfl_42_fel_idx ;
      edtavBarfasusu_Internalname = "vBARFASUSU_"+sGXsfl_42_fel_idx ;
      edtavBarext_Internalname = "vBAREXT_"+sGXsfl_42_fel_idx ;
      edtavBarfaspri_Internalname = "vBARFASPRI_"+sGXsfl_42_fel_idx ;
      edtavOldorden_Internalname = "vOLDORDEN_"+sGXsfl_42_fel_idx ;
   }

   public void sendrow_422( )
   {
      subsflControlProps_422( ) ;
      wbF80( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_42_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_42_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_42_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV25BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25BarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFascod_Internalname,GXutil.rtrim( AV31Fascod),GXutil.rtrim( localUtil.format( AV31Fascod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV32Fasdsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfascon_Internalname,GXutil.rtrim( AV16Barfascon),GXutil.rtrim( localUtil.format( AV16Barfascon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfascon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfascon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasest_Internalname,GXutil.ltrim( localUtil.ntoc( AV19BarFasest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfasest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarFasest), "9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarFasest), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasest_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcodbis_Internalname,GXutil.rtrim( AV36MaqCodbis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcodbis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqcodbis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfactin_Internalname,GXutil.rtrim( AV14Barfactin),GXutil.rtrim( localUtil.format( AV14Barfactin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfactin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfactin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasfor_Internalname,GXutil.rtrim( AV20Barfasfor),GXutil.rtrim( localUtil.format( AV20Barfasfor, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasfor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasfor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasacab_Internalname,GXutil.rtrim( AV15Barfasacab),GXutil.rtrim( localUtil.format( AV15Barfasacab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasacab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasacab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfaskgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV21BarFaskgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfaskgm_Enabled!=0) ? localUtil.format( AV21BarFaskgm, "ZZZZZ9.99") : localUtil.format( AV21BarFaskgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfaskgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfaskgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasmtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV22BarFasmtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfasmtr_Enabled!=0) ? localUtil.format( AV22BarFasmtr, "ZZZZZ9.99") : localUtil.format( AV22BarFasmtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartieteo_Internalname,GXutil.ltrim( localUtil.ntoc( AV27BarTieteo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBartieteo_Enabled!=0) ? localUtil.format( AV27BarTieteo, "Z9.99") : localUtil.format( AV27BarTieteo, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBartieteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBartieteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartierea_Internalname,GXutil.ltrim( localUtil.ntoc( AV26Bartierea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBartierea_Enabled!=0) ? localUtil.format( AV26Bartierea, "Z9.99") : localUtil.format( AV26Bartierea, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBartierea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBartierea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasdti_Internalname,localUtil.ttoc( AV18Barfasdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV18Barfasdti, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasdti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasdti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasdtf_Internalname,localUtil.ttoc( AV17Barfasdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV17Barfasdtf, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasdtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasdtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasusu_Internalname,GXutil.rtrim( AV24Barfasusu),GXutil.rtrim( localUtil.format( AV24Barfasusu, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasusu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfasusu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarext_Internalname,GXutil.ltrim( localUtil.ntoc( AV13Barext, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarext_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13Barext), "9") : localUtil.format( DecimalUtil.doubleToDec(AV13Barext), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarext_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarext_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfaspri_Internalname,GXutil.ltrim( localUtil.ntoc( AV23BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfaspri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23BarFasPri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV23BarFasPri), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfaspri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarfaspri_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOldorden_Internalname,GXutil.ltrim( localUtil.ntoc( AV41OldOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOldorden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41OldOrden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41OldOrden), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavOldorden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOldorden_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesF82( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_42_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      /* End function sendrow_422 */
   }

   public void startgridcontrol42( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"42\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Control (S/N)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "MaqCodBis", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarFacTin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Formula Productos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase de Acabado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarFasKgm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo Teorico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hora Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hora Final", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario que Planifica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Control HDR,1=sal/2=env", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarFasPri", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OldOrden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV31Fascod));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV32Fasdsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV16Barfascon));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfascon_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19BarFasest, (byte)(1), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasest_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV36MaqCodbis));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcodbis_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV14Barfactin));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfactin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV20Barfasfor));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasfor_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV15Barfasacab));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasacab_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21BarFaskgm, (byte)(9), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfaskgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22BarFasmtr, (byte)(9), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27BarTieteo, (byte)(5), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartieteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26Bartierea, (byte)(5), (byte)(2), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartierea_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.ttoc( AV18Barfasdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasdti_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.ttoc( AV17Barfasdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasdtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV24Barfasusu));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasusu_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13Barext, (byte)(1), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarext_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23BarFasPri, (byte)(2), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfaspri_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41OldOrden, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOldorden_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockprocod_Internalname = "TEXTBLOCKPROCOD" ;
      edtavProcod_Internalname = "vPROCOD" ;
      divUnnamedtableprocod_Internalname = "UNNAMEDTABLEPROCOD" ;
      lblTextblockprodsc_Internalname = "TEXTBLOCKPRODSC" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      divUnnamedtableprodsc_Internalname = "UNNAMEDTABLEPRODSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtavBarfascon_Internalname = "vBARFASCON" ;
      edtavBarfasest_Internalname = "vBARFASEST" ;
      edtavMaqcodbis_Internalname = "vMAQCODBIS" ;
      edtavBarfactin_Internalname = "vBARFACTIN" ;
      edtavBarfasfor_Internalname = "vBARFASFOR" ;
      edtavBarfasacab_Internalname = "vBARFASACAB" ;
      edtavBarfaskgm_Internalname = "vBARFASKGM" ;
      edtavBarfasmtr_Internalname = "vBARFASMTR" ;
      edtavBartieteo_Internalname = "vBARTIETEO" ;
      edtavBartierea_Internalname = "vBARTIEREA" ;
      edtavBarfasdti_Internalname = "vBARFASDTI" ;
      edtavBarfasdtf_Internalname = "vBARFASDTF" ;
      edtavBarfasusu_Internalname = "vBARFASUSU" ;
      edtavBarext_Internalname = "vBAREXT" ;
      edtavBarfaspri_Internalname = "vBARFASPRI" ;
      edtavOldorden_Internalname = "vOLDORDEN" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
      Grid1_empowerer_Internalname = "GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      edtavOldorden_Jsonclick = "" ;
      edtavOldorden_Enabled = 0 ;
      edtavBarfaspri_Jsonclick = "" ;
      edtavBarfaspri_Enabled = 0 ;
      edtavBarext_Jsonclick = "" ;
      edtavBarext_Enabled = 0 ;
      edtavBarfasusu_Jsonclick = "" ;
      edtavBarfasusu_Enabled = 0 ;
      edtavBarfasdtf_Jsonclick = "" ;
      edtavBarfasdtf_Enabled = 0 ;
      edtavBarfasdti_Jsonclick = "" ;
      edtavBarfasdti_Enabled = 0 ;
      edtavBartierea_Jsonclick = "" ;
      edtavBartierea_Enabled = 0 ;
      edtavBartieteo_Jsonclick = "" ;
      edtavBartieteo_Enabled = 0 ;
      edtavBarfasmtr_Jsonclick = "" ;
      edtavBarfasmtr_Enabled = 0 ;
      edtavBarfaskgm_Jsonclick = "" ;
      edtavBarfaskgm_Enabled = 0 ;
      edtavBarfasacab_Jsonclick = "" ;
      edtavBarfasacab_Enabled = 0 ;
      edtavBarfasfor_Jsonclick = "" ;
      edtavBarfasfor_Enabled = 0 ;
      edtavBarfactin_Jsonclick = "" ;
      edtavBarfactin_Enabled = 0 ;
      edtavMaqcodbis_Jsonclick = "" ;
      edtavMaqcodbis_Enabled = 0 ;
      edtavBarfasest_Jsonclick = "" ;
      edtavBarfasest_Enabled = 0 ;
      edtavBarfascon_Jsonclick = "" ;
      edtavBarfascon_Enabled = 0 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 0 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 0 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 0 ;
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Enabled = 0 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Enabled = 0 ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      Grid1paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid1paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid1paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid1paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid1paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid1paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid1paginationbar_Rowsperpageselectedvalue = 10 ;
      Grid1paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid1paginationbar_Pagingcaptionposition = "Left" ;
      Grid1paginationbar_Pagingbuttonsposition = "Right" ;
      Grid1paginationbar_Pagestoshow = 5 ;
      Grid1paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Class = "PaginationBar" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Alta, Baja, Modificacion FASES", "") );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV18Barfasdti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'AV17Barfasdtf',fld:'vBARFASDTF',pic:'99/99/99 99:99:99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8ProCod',fld:'vPROCOD',pic:''},{av:'AV25BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV31Fascod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV40Num_f',fld:'vNUM_F',pic:'ZZ9',hsh:true},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e15F82',iparms:[{av:'AV40Num_f',fld:'vNUM_F',pic:'ZZ9',hsh:true},{av:'AV47Tab_ord',fld:'vTAB_ORD',pic:'ZZZ9'},{av:'AV18Barfasdti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'AV17Barfasdtf',fld:'vBARFASDTF',pic:'99/99/99 99:99:99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8ProCod',fld:'vPROCOD',pic:''},{av:'AV25BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV31Fascod',fld:'vFASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV33i',fld:'vI',pic:'ZZ9'},{av:'AV25BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV41OldOrden',fld:'vOLDORDEN',pic:'ZZZ9'},{av:'AV31Fascod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV32Fasdsc',fld:'vFASDSC',pic:''},{av:'AV36MaqCodbis',fld:'vMAQCODBIS',pic:''},{av:'AV14Barfactin',fld:'vBARFACTIN',pic:'@!'},{av:'AV15Barfasacab',fld:'vBARFASACAB',pic:'@!'},{av:'AV16Barfascon',fld:'vBARFASCON',pic:'@!'},{av:'AV19BarFasest',fld:'vBARFASEST',pic:'9'},{av:'AV20Barfasfor',fld:'vBARFASFOR',pic:'@!'},{av:'AV21BarFaskgm',fld:'vBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV22BarFasmtr',fld:'vBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV26Bartierea',fld:'vBARTIEREA',pic:'Z9.99'},{av:'AV27BarTieteo',fld:'vBARTIETEO',pic:'Z9.99'},{av:'AV18Barfasdti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'AV17Barfasdtf',fld:'vBARFASDTF',pic:'99/99/99 99:99:99',hsh:true},{av:'AV24Barfasusu',fld:'vBARFASUSU',pic:'@!'},{av:'AV23BarFasPri',fld:'vBARFASPRI',pic:'Z9'},{av:'AV13Barext',fld:'vBAREXT',pic:'9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e11F82',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV40Num_f',fld:'vNUM_F',pic:'ZZ9',hsh:true},{av:'AV18Barfasdti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'AV17Barfasdtf',fld:'vBARFASDTF',pic:'99/99/99 99:99:99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8ProCod',fld:'vPROCOD',pic:''},{av:'AV25BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV31Fascod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV53Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV53Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12F82',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV40Num_f',fld:'vNUM_F',pic:'ZZ9',hsh:true},{av:'AV18Barfasdti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'AV17Barfasdtf',fld:'vBARFASDTF',pic:'99/99/99 99:99:99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8ProCod',fld:'vPROCOD',pic:''},{av:'AV25BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'A5048BarFasUsu',fld:'BARFASUSU',pic:'@!'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV31Fascod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV53Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_PROCOD","{handler:'validv_Procod',iparms:[]");
      setEventMetadata("VALIDV_PROCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARORDLIN","{handler:'validv_Barordlin',iparms:[]");
      setEventMetadata("VALIDV_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASCON","{handler:'validv_Barfascon',iparms:[]");
      setEventMetadata("VALIDV_BARFASCON",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("VALIDV_BARFACTIN","{handler:'validv_Barfactin',iparms:[]");
      setEventMetadata("VALIDV_BARFACTIN",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASFOR","{handler:'validv_Barfasfor',iparms:[]");
      setEventMetadata("VALIDV_BARFASFOR",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASACAB","{handler:'validv_Barfasacab',iparms:[]");
      setEventMetadata("VALIDV_BARFASACAB",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Oldorden',iparms:[]");
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
      wcpOAV29EmprCod = "" ;
      wcpOAV7BarCodPar = "" ;
      wcpOAV8ProCod = "" ;
      wcpOAV9Prodsc = "" ;
      Grid1paginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV29EmprCod = "" ;
      AV7BarCodPar = "" ;
      AV8ProCod = "" ;
      AV9Prodsc = "" ;
      AV18Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV17Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A5048BarFasUsu = "" ;
      A2689ExHdrFas = "" ;
      AV31Fascod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV47Tab_ord = new short[100] ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV32Fasdsc = "" ;
      AV16Barfascon = "" ;
      AV36MaqCodbis = "" ;
      AV14Barfactin = "" ;
      AV20Barfasfor = "" ;
      AV15Barfasacab = "" ;
      AV21BarFaskgm = DecimalUtil.ZERO ;
      AV22BarFasmtr = DecimalUtil.ZERO ;
      AV27BarTieteo = DecimalUtil.ZERO ;
      AV26Bartierea = DecimalUtil.ZERO ;
      AV24Barfasusu = "" ;
      AV46Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV30EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV50UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      scmdbuf = "" ;
      H00F82_A758ProCod = new String[] {""} ;
      H00F82_A130BarCodPar = new String[] {""} ;
      H00F82_n130BarCodPar = new boolean[] {false} ;
      H00F82_A132BarCodReo = new byte[1] ;
      H00F82_n132BarCodReo = new boolean[] {false} ;
      H00F82_A129BarCod = new int[1] ;
      H00F82_n129BarCod = new boolean[] {false} ;
      H00F82_A396EmprCod = new String[] {""} ;
      H00F82_A194BarOrdLin = new short[1] ;
      H00F83_A194BarOrdLin = new short[1] ;
      H00F83_A758ProCod = new String[] {""} ;
      H00F83_A130BarCodPar = new String[] {""} ;
      H00F83_n130BarCodPar = new boolean[] {false} ;
      H00F83_A132BarCodReo = new byte[1] ;
      H00F83_n132BarCodReo = new boolean[] {false} ;
      H00F83_A129BarCod = new int[1] ;
      H00F83_n129BarCod = new boolean[] {false} ;
      H00F83_A396EmprCod = new String[] {""} ;
      H00F83_A457FasCod = new String[] {""} ;
      H00F83_A460FasDsc = new String[] {""} ;
      H00F83_A603MaqCodBis = new String[] {""} ;
      H00F83_A150BarFacTin = new String[] {""} ;
      H00F83_A4905BarFasAcab = new String[] {""} ;
      H00F83_A152BarFasCon = new String[] {""} ;
      H00F83_A153BarFasEst = new byte[1] ;
      H00F83_A4287BarFasFor = new String[] {""} ;
      H00F83_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F83_n3837BarFasKgm = new boolean[] {false} ;
      H00F83_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F83_n3838BarFasMtr = new boolean[] {false} ;
      H00F83_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F83_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F83_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00F83_n4442BarFasDTI = new boolean[] {false} ;
      H00F83_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00F83_n4443BarFasDTF = new boolean[] {false} ;
      H00F83_A5048BarFasUsu = new String[] {""} ;
      H00F83_n5048BarFasUsu = new boolean[] {false} ;
      H00F83_A3836BarFasPri = new byte[1] ;
      H00F83_A2265BarExt = new byte[1] ;
      H00F83_n2265BarExt = new boolean[] {false} ;
      H00F84_A2248ManCod = new short[1] ;
      H00F84_A2692ExHdrLin = new int[1] ;
      H00F84_A129BarCod = new int[1] ;
      H00F84_n129BarCod = new boolean[] {false} ;
      H00F84_A132BarCodReo = new byte[1] ;
      H00F84_n132BarCodReo = new boolean[] {false} ;
      H00F84_A130BarCodPar = new String[] {""} ;
      H00F84_n130BarCodPar = new boolean[] {false} ;
      H00F84_A2689ExHdrFas = new String[] {""} ;
      H00F84_A396EmprCod = new String[] {""} ;
      lblTextblockprocod_Jsonclick = "" ;
      lblTextblockprodsc_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwbarfasw__default(),
         new Object[] {
             new Object[] {
            H00F82_A758ProCod, H00F82_A130BarCodPar, H00F82_A132BarCodReo, H00F82_A129BarCod, H00F82_A396EmprCod, H00F82_A194BarOrdLin
            }
            , new Object[] {
            H00F83_A194BarOrdLin, H00F83_A758ProCod, H00F83_A130BarCodPar, H00F83_A132BarCodReo, H00F83_A129BarCod, H00F83_A396EmprCod, H00F83_A457FasCod, H00F83_A460FasDsc, H00F83_A603MaqCodBis, H00F83_A150BarFacTin,
            H00F83_A4905BarFasAcab, H00F83_A152BarFasCon, H00F83_A153BarFasEst, H00F83_A4287BarFasFor, H00F83_A3837BarFasKgm, H00F83_n3837BarFasKgm, H00F83_A3838BarFasMtr, H00F83_n3838BarFasMtr, H00F83_A215BarTieRea, H00F83_A216BarTieTeo,
            H00F83_A4442BarFasDTI, H00F83_n4442BarFasDTI, H00F83_A4443BarFasDTF, H00F83_n4443BarFasDTF, H00F83_A5048BarFasUsu, H00F83_n5048BarFasUsu, H00F83_A3836BarFasPri, H00F83_A2265BarExt, H00F83_n2265BarExt
            }
            , new Object[] {
            H00F84_A2248ManCod, H00F84_A2692ExHdrLin, H00F84_A129BarCod, H00F84_n129BarCod, H00F84_A132BarCodReo, H00F84_n132BarCodReo, H00F84_A130BarCodPar, H00F84_n130BarCodPar, H00F84_A2689ExHdrFas, H00F84_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavFascod_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavBarfascon_Enabled = 0 ;
      edtavBarfasest_Enabled = 0 ;
      edtavMaqcodbis_Enabled = 0 ;
      edtavBarfactin_Enabled = 0 ;
      edtavBarfasfor_Enabled = 0 ;
      edtavBarfasacab_Enabled = 0 ;
      edtavBarfaskgm_Enabled = 0 ;
      edtavBarfasmtr_Enabled = 0 ;
      edtavBartieteo_Enabled = 0 ;
      edtavBartierea_Enabled = 0 ;
      edtavBarfasdti_Enabled = 0 ;
      edtavBarfasdtf_Enabled = 0 ;
      edtavBarfasusu_Enabled = 0 ;
      edtavBarext_Enabled = 0 ;
      edtavBarfaspri_Enabled = 0 ;
      edtavOldorden_Enabled = 0 ;
   }

   private byte wcpOAV6BarCodReo ;
   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV6BarCodReo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A2265BarExt ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV19BarFasest ;
   private byte AV13Barext ;
   private byte AV23BarFasPri ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV35Lexmvh ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV40Num_f ;
   private short A194BarOrdLin ;
   private short AV25BarOrdLin ;
   private short AV47Tab_ord[] ;
   private short wbEnd ;
   private short wbStart ;
   private short AV41OldOrden ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV33i ;
   private int wcpOAV5BarCod ;
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_42 ;
   private int subGrid1_Rows ;
   private int AV5BarCod ;
   private int nGXsfl_42_idx=1 ;
   private int A129BarCod ;
   private int Grid1paginationbar_Pagestoshow ;
   private int edtavGrid1currentpage_Visible ;
   private int subGrid1_Islastpage ;
   private int edtavProcod_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavBarfascon_Enabled ;
   private int edtavBarfasest_Enabled ;
   private int edtavMaqcodbis_Enabled ;
   private int edtavBarfactin_Enabled ;
   private int edtavBarfasfor_Enabled ;
   private int edtavBarfasacab_Enabled ;
   private int edtavBarfaskgm_Enabled ;
   private int edtavBarfasmtr_Enabled ;
   private int edtavBartieteo_Enabled ;
   private int edtavBartierea_Enabled ;
   private int edtavBarfasdti_Enabled ;
   private int edtavBarfasdtf_Enabled ;
   private int edtavBarfasusu_Enabled ;
   private int edtavBarext_Enabled ;
   private int edtavBarfaspri_Enabled ;
   private int edtavOldorden_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int AV52PageToGo ;
   private int GX_I ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV54Grid1PageCount ;
   private long AV53Grid1CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV21BarFaskgm ;
   private java.math.BigDecimal AV22BarFasmtr ;
   private java.math.BigDecimal AV27BarTieteo ;
   private java.math.BigDecimal AV26Bartierea ;
   private String wcpOAV29EmprCod ;
   private String wcpOAV7BarCodPar ;
   private String wcpOAV8ProCod ;
   private String wcpOAV9Prodsc ;
   private String Grid1paginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV29EmprCod ;
   private String AV7BarCodPar ;
   private String AV8ProCod ;
   private String AV9Prodsc ;
   private String sGXsfl_42_idx="0001" ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A4905BarFasAcab ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A5048BarFasUsu ;
   private String A2689ExHdrFas ;
   private String AV31Fascod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Grid1paginationbar_Class ;
   private String Grid1paginationbar_Pagingbuttonsposition ;
   private String Grid1paginationbar_Pagingcaptionposition ;
   private String Grid1paginationbar_Emptygridclass ;
   private String Grid1paginationbar_Rowsperpageoptions ;
   private String Grid1paginationbar_Previous ;
   private String Grid1paginationbar_Next ;
   private String Grid1paginationbar_Caption ;
   private String Grid1paginationbar_Emptygridcaption ;
   private String Grid1paginationbar_Rowsperpagecaption ;
   private String Grid1_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String Grid1paginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavBarordlin_Internalname ;
   private String edtavFascod_Internalname ;
   private String AV32Fasdsc ;
   private String edtavFasdsc_Internalname ;
   private String AV16Barfascon ;
   private String edtavBarfascon_Internalname ;
   private String edtavBarfasest_Internalname ;
   private String AV36MaqCodbis ;
   private String edtavMaqcodbis_Internalname ;
   private String AV14Barfactin ;
   private String edtavBarfactin_Internalname ;
   private String AV20Barfasfor ;
   private String edtavBarfasfor_Internalname ;
   private String AV15Barfasacab ;
   private String edtavBarfasacab_Internalname ;
   private String edtavBarfaskgm_Internalname ;
   private String edtavBarfasmtr_Internalname ;
   private String edtavBartieteo_Internalname ;
   private String edtavBartierea_Internalname ;
   private String edtavBarfasdti_Internalname ;
   private String edtavBarfasdtf_Internalname ;
   private String AV24Barfasusu ;
   private String edtavBarfasusu_Internalname ;
   private String edtavBarext_Internalname ;
   private String edtavBarfaspri_Internalname ;
   private String edtavOldorden_Internalname ;
   private String edtavProcod_Internalname ;
   private String edtavProdsc_Internalname ;
   private String AV46Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV30EmprNom ;
   private String GXv_char3[] ;
   private String AV50UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtableprocod_Internalname ;
   private String lblTextblockprocod_Internalname ;
   private String lblTextblockprocod_Jsonclick ;
   private String edtavProcod_Jsonclick ;
   private String divUnnamedtableprodsc_Internalname ;
   private String lblTextblockprodsc_Internalname ;
   private String lblTextblockprodsc_Jsonclick ;
   private String edtavProdsc_Jsonclick ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavBarordlin_Jsonclick ;
   private String edtavFascod_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavBarfascon_Jsonclick ;
   private String edtavBarfasest_Jsonclick ;
   private String edtavMaqcodbis_Jsonclick ;
   private String edtavBarfactin_Jsonclick ;
   private String edtavBarfasfor_Jsonclick ;
   private String edtavBarfasacab_Jsonclick ;
   private String edtavBarfaskgm_Jsonclick ;
   private String edtavBarfasmtr_Jsonclick ;
   private String edtavBartieteo_Jsonclick ;
   private String edtavBartierea_Jsonclick ;
   private String edtavBarfasdti_Jsonclick ;
   private String edtavBarfasdtf_Jsonclick ;
   private String edtavBarfasusu_Jsonclick ;
   private String edtavBarext_Jsonclick ;
   private String edtavBarfaspri_Jsonclick ;
   private String edtavOldorden_Jsonclick ;
   private String subGrid1_Header ;
   private java.util.Date AV18Barfasdti ;
   private java.util.Date AV17Barfasdtf ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n5048BarFasUsu ;
   private boolean n2265BarExt ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid1paginationbar_Showfirst ;
   private boolean Grid1paginationbar_Showprevious ;
   private boolean Grid1paginationbar_Shownext ;
   private boolean Grid1paginationbar_Showlast ;
   private boolean Grid1paginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_42_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H00F82_A758ProCod ;
   private String[] H00F82_A130BarCodPar ;
   private boolean[] H00F82_n130BarCodPar ;
   private byte[] H00F82_A132BarCodReo ;
   private boolean[] H00F82_n132BarCodReo ;
   private int[] H00F82_A129BarCod ;
   private boolean[] H00F82_n129BarCod ;
   private String[] H00F82_A396EmprCod ;
   private short[] H00F82_A194BarOrdLin ;
   private short[] H00F83_A194BarOrdLin ;
   private String[] H00F83_A758ProCod ;
   private String[] H00F83_A130BarCodPar ;
   private boolean[] H00F83_n130BarCodPar ;
   private byte[] H00F83_A132BarCodReo ;
   private boolean[] H00F83_n132BarCodReo ;
   private int[] H00F83_A129BarCod ;
   private boolean[] H00F83_n129BarCod ;
   private String[] H00F83_A396EmprCod ;
   private String[] H00F83_A457FasCod ;
   private String[] H00F83_A460FasDsc ;
   private String[] H00F83_A603MaqCodBis ;
   private String[] H00F83_A150BarFacTin ;
   private String[] H00F83_A4905BarFasAcab ;
   private String[] H00F83_A152BarFasCon ;
   private byte[] H00F83_A153BarFasEst ;
   private String[] H00F83_A4287BarFasFor ;
   private java.math.BigDecimal[] H00F83_A3837BarFasKgm ;
   private boolean[] H00F83_n3837BarFasKgm ;
   private java.math.BigDecimal[] H00F83_A3838BarFasMtr ;
   private boolean[] H00F83_n3838BarFasMtr ;
   private java.math.BigDecimal[] H00F83_A215BarTieRea ;
   private java.math.BigDecimal[] H00F83_A216BarTieTeo ;
   private java.util.Date[] H00F83_A4442BarFasDTI ;
   private boolean[] H00F83_n4442BarFasDTI ;
   private java.util.Date[] H00F83_A4443BarFasDTF ;
   private boolean[] H00F83_n4443BarFasDTF ;
   private String[] H00F83_A5048BarFasUsu ;
   private boolean[] H00F83_n5048BarFasUsu ;
   private byte[] H00F83_A3836BarFasPri ;
   private byte[] H00F83_A2265BarExt ;
   private boolean[] H00F83_n2265BarExt ;
   private short[] H00F84_A2248ManCod ;
   private int[] H00F84_A2692ExHdrLin ;
   private int[] H00F84_A129BarCod ;
   private boolean[] H00F84_n129BarCod ;
   private byte[] H00F84_A132BarCodReo ;
   private boolean[] H00F84_n132BarCodReo ;
   private String[] H00F84_A130BarCodPar ;
   private boolean[] H00F84_n130BarCodPar ;
   private String[] H00F84_A2689ExHdrFas ;
   private String[] H00F84_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwbarfasw__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00F82", "SELECT ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F83", "SELECT T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.FasCod, T3.FasDsc, T1.MaqCodBis, T1.BarFacTin, T1.BarFasAcab, T1.BarFasCon, T1.BarFasEst, T1.BarFasFor, T1.BarFasKgm, T1.BarFasMtr, T1.BarTieRea, T1.BarTieTeo, T1.BarFasDTI, T1.BarFasDTF, T1.BarFasUsu, T1.BarFasPri, T2.BarExt FROM ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00F84", "SELECT ManCod, ExHdrLin, BarCod, BarCodReo, BarCodPar, ExHdrFas, EmprCod FROM TXPLEXMVH WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ExHdrFas = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((byte[]) buf[27])[0] = rslt.getByte(23);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

