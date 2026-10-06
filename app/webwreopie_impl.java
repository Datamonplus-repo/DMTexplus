package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwreopie_impl extends GXDataArea
{
   public webwreopie_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwreopie_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwreopie_impl.class ));
   }

   public webwreopie_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccionar = UIFactory.getCheckbox(this);
      cmbavTiporeoperado = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCODCAUSA") == 0 )
         {
            A5086DscCausa = httpContext.GetPar( "DscCausa") ;
            n5086DscCausa = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcodcausaEE0( A5086DscCausa) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vRPS_COD") == 0 )
         {
            A7001Rps_Dsc = httpContext.GetPar( "Rps_Dsc") ;
            n7001Rps_Dsc = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvrps_codEE0( A7001Rps_Dsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD") == 0 )
         {
            A653OpeNom = httpContext.GetPar( "OpeNom") ;
            n653OpeNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecodEE0( A653OpeNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCODCAUSA") == 0 )
         {
            A5086DscCausa = httpContext.GetPar( "DscCausa") ;
            n5086DscCausa = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcodcausaEE0( A5086DscCausa) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCODCAUSA") == 0 )
         {
            hV49CodCausa = httpContext.GetPar( "hV49CodCausa") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvcodcausaEE2( hV49CodCausa) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vRPS_COD") == 0 )
         {
            A7001Rps_Dsc = httpContext.GetPar( "Rps_Dsc") ;
            n7001Rps_Dsc = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvrps_codEE0( A7001Rps_Dsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vRPS_COD") == 0 )
         {
            hV50Rps_Cod = httpContext.GetPar( "hV50Rps_Cod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvrps_codEE2( hV50Rps_Cod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD") == 0 )
         {
            A653OpeNom = httpContext.GetPar( "OpeNom") ;
            n653OpeNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecodEE0( A653OpeNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vOPECOD") == 0 )
         {
            hV51Opecod = httpContext.GetPar( "hV51Opecod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvopecodEE2( hV51Opecod) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            AV17Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarNHdr", AV18BarNHdr);
               AV19Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               AV20Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Barcodreo", GXutil.str( AV20Barcodreo, 1, 0));
               AV21Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               AV22BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22BarKgm", GXutil.ltrimstr( AV22BarKgm, 9, 2));
               AV23BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23BarMtr", GXutil.ltrimstr( AV23BarMtr, 9, 2));
               AV24BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarPie), 6, 0));
               AV25BarUnimed = httpContext.GetPar( "BarUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarUnimed", AV25BarUnimed);
               AV26BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarSit), 2, 0));
               AV27KilAct = CommonUtil.decimalVal( httpContext.GetPar( "KilAct"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27KilAct", GXutil.ltrimstr( AV27KilAct, 9, 2));
               AV28MtrAct = CommonUtil.decimalVal( httpContext.GetPar( "MtrAct"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAct", GXutil.ltrimstr( AV28MtrAct, 9, 2));
               AV29BarCosAny = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAny"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29BarCosAny", GXutil.ltrimstr( AV29BarCosAny, 10, 2));
               AV30BarCosPro = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPro"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30BarCosPro", GXutil.ltrimstr( AV30BarCosPro, 10, 2));
               AV31UsurCod = httpContext.GetPar( "UsurCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31UsurCod", AV31UsurCod);
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
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
      AV17Emprcod = httpContext.GetPar( "Emprcod") ;
      AV19Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV20Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV21Barcodpar = httpContext.GetPar( "Barcodpar") ;
      A201BarPieEst = (byte)(GXutil.lval( httpContext.GetPar( "BarPieEst"))) ;
      A203BarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "BarPieKil"), ".") ;
      A170BarKilLan = CommonUtil.decimalVal( httpContext.GetPar( "BarKilLan"), ".") ;
      A205BarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "BarPieMet"), ".") ;
      A183BarMetLan = CommonUtil.decimalVal( httpContext.GetPar( "BarMetLan"), ".") ;
      A2186BarPieLoc = httpContext.GetPar( "BarPieLoc") ;
      n2186BarPieLoc = false ;
      AV44EnvioGaia = (short)(GXutil.lval( httpContext.GetPar( "EnvioGaia"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, AV17Emprcod, AV19Barcod, AV20Barcodreo, AV21Barcodpar, A201BarPieEst, A203BarPieKil, A170BarKilLan, A205BarPieMet, A183BarMetLan, A2186BarPieLoc, AV44EnvioGaia) ;
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
      paEE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startEE2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwreopie", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV18BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21Barcodpar)),GXutil.URLEncode(DecimalUtil.decToString(AV22BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV23BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarPie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV25BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarSit,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27KilAct)),GXutil.URLEncode(DecimalUtil.decToString(AV28MtrAct)),GXutil.URLEncode(DecimalUtil.decToString(AV29BarCosAny)),GXutil.URLEncode(DecimalUtil.decToString(AV30BarCosPro)),GXutil.URLEncode(GXutil.rtrim(AV31UsurCod))}, new String[] {"Emprcod","BarNHdr","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","BarPie","BarUnimed","BarSit","KilAct","MtrAct","BarCosAny","BarCosPro","UsurCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENVIOGAIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44EnvioGaia), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_79, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV19Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV20Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV21Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEKIL", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKILLAN", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEMET", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMETLAN", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIELOC", GXutil.rtrim( A2186BarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV22BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV23BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSPRO", GXutil.ltrim( localUtil.ntoc( AV30BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV29BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV26BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPORCEN", GXutil.ltrim( localUtil.ntoc( AV33Porcen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONREO", GXutil.ltrim( localUtil.ntoc( AV35ConReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODIGO", GXutil.rtrim( AV36Codigo));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV37DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV25BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vENVIOGAIA", GXutil.ltrim( localUtil.ntoc( AV44EnvioGaia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENVIOGAIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44EnvioGaia), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRO", GXutil.ltrim( localUtil.ntoc( AV56CosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANY", GXutil.ltrim( localUtil.ntoc( AV57CosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRO2", GXutil.ltrim( localUtil.ntoc( AV45CosPro2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANY2", GXutil.ltrim( localUtil.ntoc( AV46CosAny2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV31UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIE", GXutil.ltrim( localUtil.ntoc( AV24BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV53Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILACT", GXutil.ltrim( localUtil.ntoc( AV27KilAct, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRACT", GXutil.ltrim( localUtil.ntoc( AV28MtrAct, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCODCAUSA", GXutil.ltrim( localUtil.ntoc( AV49CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvRPS_COD", GXutil.ltrim( localUtil.ntoc( AV50Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvOPECOD", GXutil.ltrim( localUtil.ntoc( AV51Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         weEE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtEE2( ) ;
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
      return formatLink("app.webwreopie", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV18BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21Barcodpar)),GXutil.URLEncode(DecimalUtil.decToString(AV22BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV23BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarPie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV25BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV26BarSit,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27KilAct)),GXutil.URLEncode(DecimalUtil.decToString(AV28MtrAct)),GXutil.URLEncode(DecimalUtil.decToString(AV29BarCosAny)),GXutil.URLEncode(DecimalUtil.decToString(AV30BarCosPro)),GXutil.URLEncode(GXutil.rtrim(AV31UsurCod))}, new String[] {"Emprcod","BarNHdr","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","BarPie","BarUnimed","BarSit","KilAct","MtrAct","BarCosAny","BarCosPro","UsurCod"})  ;
   }

   public String getPgmname( )
   {
      return "WebWreoPie" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Kilos, Metros, Piezas (detalle)", "") ;
   }

   public void wbEE0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV18BarNHdr), GXutil.rtrim( localUtil.format( AV18BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWreoPie.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-direction:column;flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table1_33_EE2( true) ;
      }
      else
      {
         wb_table1_33_EE2( false) ;
      }
      return  ;
   }

   public void wb_table1_33_EE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipdefcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipdefcod_Internalname, httpContext.getMessage( "Defecto", ""), "", "", lblTextblocktipdefcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table2_48_EE2( true) ;
      }
      else
      {
         wb_table2_48_EE2( false) ;
      }
      return  ;
   }

   public void wb_table2_48_EE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavCodcausa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCodcausa_Internalname, httpContext.getMessage( "Causa", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCodcausa_Internalname, GXutil.rtrim( hV49CodCausa), GXutil.rtrim( localUtil.format( hV49CodCausa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCodcausa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCodcausa_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRps_cod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRps_cod_Internalname, httpContext.getMessage( "Responsabilidad", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRps_cod_Internalname, GXutil.rtrim( hV50Rps_Cod), GXutil.rtrim( localUtil.format( hV50Rps_Cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRps_cod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRps_cod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavOpecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpecod_Internalname, httpContext.getMessage( "Operario", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, GXutil.rtrim( hV51Opecod), GXutil.rtrim( localUtil.format( hV51Opecod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOpecod_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTurno_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTurno_Internalname, httpContext.getMessage( "Turno", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTurno_Internalname, GXutil.ltrim( localUtil.ntoc( AV52Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52Turno), "9") : localUtil.format( DecimalUtil.doubleToDec(AV52Turno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTurno_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTurno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWreoPie.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "HasGridEmpowerer", "left", "top", "", "flex-grow:1;", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol79( ) ;
      }
      if ( wbEnd == 79 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_79 = (int)(nGXsfl_79_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         wb_table3_91_EE2( true) ;
      }
      else
      {
         wb_table3_91_EE2( false) ;
      }
      return  ;
   }

   public void wb_table3_91_EE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletotp_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktotp_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblocktotp_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotp_Internalname, httpContext.getMessage( "totp", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotp_Internalname, GXutil.ltrim( localUtil.ntoc( AV58totp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58totp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV58totp), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotp_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletotm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktotm_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblocktotm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotm_Internalname, httpContext.getMessage( "totm", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotm_Internalname, GXutil.ltrim( localUtil.ntoc( AV59totm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotm_Enabled!=0) ? localUtil.format( AV59totm, "ZZZZZ9.99") : localUtil.format( AV59totm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletotk_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktotk_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblocktotk_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotk_Internalname, httpContext.getMessage( "totk", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotk_Internalname, GXutil.ltrim( localUtil.ntoc( AV60totk, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotk_Enabled!=0) ? localUtil.format( AV60totk, "ZZZZZ9.99") : localUtil.format( AV60totk, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotk_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotk_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTiporeoperado.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTiporeoperado.getInternalname(), httpContext.getMessage( "Tipo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTiporeoperado, cmbavTiporeoperado.getInternalname(), GXutil.rtrim( AV11TipoReoperado), 1, cmbavTiporeoperado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTiporeoperado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "", true, (byte)(0), "HLP_WebWreoPie.htm");
         cmbavTiporeoperado.setValue( GXutil.rtrim( AV11TipoReoperado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTiporeoperado.getInternalname(), "Values", cmbavTiporeoperado.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", httpContext.getMessage( "Confrmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confrmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11ee1_client"+"'", TempTags, "", 2, "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         wb_table4_147_EE2( true) ;
      }
      else
      {
         wb_table4_147_EE2( false) ;
      }
      return  ;
   }

   public void wb_table4_147_EE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 79 )
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

   public void startEE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Kilos, Metros, Piezas (detalle)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupEE0( ) ;
   }

   public void wsEE2( )
   {
      startEE2( ) ;
      evtEE2( ) ;
   }

   public void evtEE2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPDEFCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14EE2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_79_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_792( ) ;
                           AV63Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV63Seleccionar);
                           AV6BarPieCod = httpContext.cgiGet( edtavBarpiecod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecod_Internalname, AV6BarPieCod);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOS");
                              GX_FocusControl = edtavKilos_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV7Kilos = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKilos_Internalname, GXutil.ltrimstr( AV7Kilos, 9, 2));
                           }
                           else
                           {
                              AV7Kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKilos_Internalname, GXutil.ltrimstr( AV7Kilos, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFKILOS");
                              GX_FocusControl = edtavDifkilos_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV8DifKilos = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV8DifKilos, 9, 2));
                           }
                           else
                           {
                              AV8DifKilos = localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV8DifKilos, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
                              GX_FocusControl = edtavMetros_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV9Metros = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMetros_Internalname, GXutil.ltrimstr( AV9Metros, 9, 2));
                           }
                           else
                           {
                              AV9Metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMetros_Internalname, GXutil.ltrimstr( AV9Metros, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFMETROS");
                              GX_FocusControl = edtavDifmetros_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV10DifMetros = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV10DifMetros, 9, 2));
                           }
                           else
                           {
                              AV10DifMetros = localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV10DifMetros, 9, 2));
                           }
                           AV12BarPieCodDestino = httpContext.cgiGet( edtavBarpiecoddestino_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecoddestino_Internalname, AV12BarPieCodDestino);
                           AV43BarPieLoc = httpContext.cgiGet( edtavBarpieloc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarpieloc_Internalname, AV43BarPieLoc);
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCvCODCAUSA_" + sGXsfl_79_idx ;
                              AV49CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              GXCCtl = "GXHCvRPS_COD_" + sGXsfl_79_idx ;
                              AV50Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              GXCCtl = "GXHCvOPECOD_" + sGXsfl_79_idx ;
                              AV51Opecod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                 e15EE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e16EE2 ();
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

   public void weEE2( )
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

   public void paEE2( )
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
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvcodcausaEE0( String A5086DscCausa )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvcodcausa_dataEE0( A5086DscCausa) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvcodcausa_dataEE0( String A5086DscCausa )
   {
      l5086DscCausa = GXutil.padr( GXutil.rtrim( A5086DscCausa), 60, "%") ;
      n5086DscCausa = false ;
      /* Using cursor H00EE2 */
      pr_default.execute(0, new Object[] {l5086DscCausa});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00EE2_A5086DscCausa[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00EE2_A5086DscCausa[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvrps_codEE0( String A7001Rps_Dsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvrps_cod_dataEE0( A7001Rps_Dsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvrps_cod_dataEE0( String A7001Rps_Dsc )
   {
      l7001Rps_Dsc = GXutil.padr( GXutil.rtrim( A7001Rps_Dsc), 40, "%") ;
      n7001Rps_Dsc = false ;
      /* Using cursor H00EE3 */
      pr_default.execute(1, new Object[] {l7001Rps_Dsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00EE3_A7001Rps_Dsc[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00EE3_A7001Rps_Dsc[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvopecodEE0( String A653OpeNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvopecod_dataEE0( A653OpeNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvopecod_dataEE0( String A653OpeNom )
   {
      l653OpeNom = GXutil.padr( GXutil.rtrim( A653OpeNom), 30, "%") ;
      n653OpeNom = false ;
      /* Using cursor H00EE4 */
      pr_default.execute(2, new Object[] {l653OpeNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00EE4_A653OpeNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00EE4_A653OpeNom[0]));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxhcvvcodcausaEE2( String A5086DscCausa )
   {
      /* Using cursor H00EE5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n5086DscCausa), A5086DscCausa});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A5086DscCausa = H00EE5_A5086DscCausa[0] ;
         n5086DscCausa = H00EE5_n5086DscCausa[0] ;
         A396EmprCod = H00EE5_A396EmprCod[0] ;
         A5085CodCausa = H00EE5_A5085CodCausa[0] ;
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5085CodCausa, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void gxhcvvrps_codEE2( String A7001Rps_Dsc )
   {
      /* Using cursor H00EE6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n7001Rps_Dsc), A7001Rps_Dsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A7001Rps_Dsc = H00EE6_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = H00EE6_n7001Rps_Dsc[0] ;
         A396EmprCod = H00EE6_A396EmprCod[0] ;
         A7000Rps_Cod = H00EE6_A7000Rps_Cod[0] ;
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxhcvvopecodEE2( String A653OpeNom )
   {
      /* Using cursor H00EE7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n653OpeNom), A653OpeNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A653OpeNom = H00EE7_A653OpeNom[0] ;
         n653OpeNom = H00EE7_n653OpeNom[0] ;
         A396EmprCod = H00EE7_A396EmprCod[0] ;
         A652OpeCod = H00EE7_A652OpeCod[0] ;
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_792( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         sendrow_792( ) ;
         nGXsfl_79_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String A200BarPieCod ,
                                 String AV17Emprcod ,
                                 int AV19Barcod ,
                                 byte AV20Barcodreo ,
                                 String AV21Barcodpar ,
                                 byte A201BarPieEst ,
                                 java.math.BigDecimal A203BarPieKil ,
                                 java.math.BigDecimal A170BarKilLan ,
                                 java.math.BigDecimal A205BarPieMet ,
                                 java.math.BigDecimal A183BarMetLan ,
                                 String A2186BarPieLoc ,
                                 short AV44EnvioGaia )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID_nCurrentRecord = 0 ;
      rfEE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      if ( cmbavTiporeoperado.getItemCount() > 0 )
      {
         AV11TipoReoperado = cmbavTiporeoperado.getValidValue(AV11TipoReoperado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11TipoReoperado", AV11TipoReoperado);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTiporeoperado.setValue( GXutil.rtrim( AV11TipoReoperado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTiporeoperado.getInternalname(), "Values", cmbavTiporeoperado.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfEE2( ) ;
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
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), true);
      edtavBarpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiecod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavDifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavDifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavBarpieloc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpieloc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpieloc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavTotp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotp_Enabled), 5, 0), true);
      edtavTotm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotm_Enabled), 5, 0), true);
      edtavTotk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotk_Enabled), 5, 0), true);
   }

   public void rfEE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(79) ;
      nGXsfl_79_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      bGXsfl_79_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_792( ) ;
         e16EE2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_79_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e16EE2 ();
         }
         wbEnd = (short)(79) ;
         wbEE0( ) ;
      }
      bGXsfl_79_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesEE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vENVIOGAIA", GXutil.ltrim( localUtil.ntoc( AV44EnvioGaia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENVIOGAIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44EnvioGaia), "ZZZ9")));
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, AV17Emprcod, AV19Barcod, AV20Barcodreo, AV21Barcodpar, A201BarPieEst, A203BarPieKil, A170BarKilLan, A205BarPieMet, A183BarMetLan, A2186BarPieLoc, AV44EnvioGaia) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, AV17Emprcod, AV19Barcod, AV20Barcodreo, AV21Barcodpar, A201BarPieEst, A203BarPieKil, A170BarKilLan, A205BarPieMet, A183BarMetLan, A2186BarPieLoc, AV44EnvioGaia) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, AV17Emprcod, AV19Barcod, AV20Barcodreo, AV21Barcodpar, A201BarPieEst, A203BarPieKil, A170BarKilLan, A205BarPieMet, A183BarMetLan, A2186BarPieLoc, AV44EnvioGaia) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, AV17Emprcod, AV19Barcod, AV20Barcodreo, AV21Barcodpar, A201BarPieEst, A203BarPieKil, A170BarKilLan, A205BarPieMet, A183BarMetLan, A2186BarPieLoc, AV44EnvioGaia) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod, AV17Emprcod, AV19Barcod, AV20Barcodreo, AV21Barcodpar, A201BarPieEst, A203BarPieKil, A170BarKilLan, A205BarPieMet, A183BarMetLan, A2186BarPieLoc, AV44EnvioGaia) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), true);
      edtavBarpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpiecod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavDifkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifkilos_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavDifmetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifmetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifmetros_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavBarpieloc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpieloc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpieloc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtavTotp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotp_Enabled), 5, 0), true);
      edtavTotm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotm_Enabled), 5, 0), true);
      edtavTotk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotk_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupEE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e15EE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17Emprcod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         AV34MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34MaqCod", AV34MaqCod);
         AV62MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62MaqDsc", AV62MaqDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPDEFCOD");
            GX_FocusControl = edtavTipdefcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32TipDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipDefCod), 4, 0));
         }
         else
         {
            AV32TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipDefCod), 4, 0));
         }
         AV54Tipdefdsc = httpContext.cgiGet( edtavTipdefdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Tipdefdsc", AV54Tipdefdsc);
         hV49CodCausa = httpContext.cgiGet( edtavCodcausa_Internalname) ;
         if ( (GXutil.strcmp("", hV49CodCausa)==0) )
         {
            AV49CodCausa = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49CodCausa), 4, 0));
         }
         else
         {
            A5086DscCausa = hV49CodCausa ;
            n5086DscCausa = false ;
            /* Using cursor H00EE8 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n5086DscCausa), A5086DscCausa});
            AV49CodCausa = H00EE8_A5085CodCausa[0] ;
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               pr_default.readNext(6);
               if ( ! ( (pr_default.getStatus(6) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Causa", "")}), 1, "vCODCAUSA");
                  GX_FocusControl = edtavCodcausa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(6);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV49CodCausa", hV49CodCausa);
         hV50Rps_Cod = httpContext.cgiGet( edtavRps_cod_Internalname) ;
         if ( (GXutil.strcmp("", hV50Rps_Cod)==0) )
         {
            AV50Rps_Cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Rps_Cod), 4, 0));
         }
         else
         {
            A7001Rps_Dsc = hV50Rps_Cod ;
            n7001Rps_Dsc = false ;
            /* Using cursor H00EE9 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n7001Rps_Dsc), A7001Rps_Dsc});
            AV50Rps_Cod = H00EE9_A7000Rps_Cod[0] ;
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               pr_default.readNext(7);
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( " Responsabilidad", "")}), 1, "vRPS_COD");
                  GX_FocusControl = edtavRps_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(7);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV50Rps_Cod", hV50Rps_Cod);
         hV51Opecod = httpContext.cgiGet( edtavOpecod_Internalname) ;
         if ( (GXutil.strcmp("", hV51Opecod)==0) )
         {
            AV51Opecod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Opecod), 6, 0));
         }
         else
         {
            A653OpeNom = hV51Opecod ;
            n653OpeNom = false ;
            /* Using cursor H00EE10 */
            pr_default.execute(8, new Object[] {Boolean.valueOf(n653OpeNom), A653OpeNom});
            AV51Opecod = H00EE10_A652OpeCod[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "vOPECOD");
                  GX_FocusControl = edtavOpecod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV51Opecod", hV51Opecod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTURNO");
            GX_FocusControl = edtavTurno_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52Turno = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Turno", GXutil.str( AV52Turno, 1, 0));
         }
         else
         {
            AV52Turno = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Turno", GXutil.str( AV52Turno, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTotp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTotp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTP");
            GX_FocusControl = edtavTotp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58totp = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58totp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58totp), 4, 0));
         }
         else
         {
            AV58totp = (short)(localUtil.ctol( httpContext.cgiGet( edtavTotp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58totp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58totp), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTM");
            GX_FocusControl = edtavTotm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV59totm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59totm", GXutil.ltrimstr( AV59totm, 9, 2));
         }
         else
         {
            AV59totm = localUtil.ctond( httpContext.cgiGet( edtavTotm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59totm", GXutil.ltrimstr( AV59totm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTK");
            GX_FocusControl = edtavTotk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60totk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60totk", GXutil.ltrimstr( AV60totk, 9, 2));
         }
         else
         {
            AV60totk = localUtil.ctond( httpContext.cgiGet( edtavTotk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60totk", GXutil.ltrimstr( AV60totk, 9, 2));
         }
         cmbavTiporeoperado.setName( cmbavTiporeoperado.getInternalname() );
         cmbavTiporeoperado.setValue( httpContext.cgiGet( cmbavTiporeoperado.getInternalname()) );
         AV11TipoReoperado = httpContext.cgiGet( cmbavTiporeoperado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11TipoReoperado", AV11TipoReoperado);
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
      e15EE2 ();
      if (returnInSub) return;
   }

   public void e15EE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV66Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwreopie_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Station = GXt_char1 ;
      GXv_char2[0] = AV17Emprcod ;
      GXv_char3[0] = AV67Emprnom ;
      GXv_char4[0] = AV31UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwreopie_impl.this.AV17Emprcod = GXv_char2[0] ;
      webwreopie_impl.this.AV67Emprnom = GXv_char3[0] ;
      webwreopie_impl.this.AV31UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV31UsurCod", AV31UsurCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   private void e16EE2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Using cursor H00EE11 */
      pr_default.execute(9, new Object[] {AV17Emprcod, Integer.valueOf(AV19Barcod), Byte.valueOf(AV20Barcodreo), AV21Barcodpar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A201BarPieEst = H00EE11_A201BarPieEst[0] ;
         A130BarCodPar = H00EE11_A130BarCodPar[0] ;
         A132BarCodReo = H00EE11_A132BarCodReo[0] ;
         A129BarCod = H00EE11_A129BarCod[0] ;
         A396EmprCod = H00EE11_A396EmprCod[0] ;
         A170BarKilLan = H00EE11_A170BarKilLan[0] ;
         A203BarPieKil = H00EE11_A203BarPieKil[0] ;
         A183BarMetLan = H00EE11_A183BarMetLan[0] ;
         A205BarPieMet = H00EE11_A205BarPieMet[0] ;
         A2186BarPieLoc = H00EE11_A2186BarPieLoc[0] ;
         n2186BarPieLoc = H00EE11_n2186BarPieLoc[0] ;
         A200BarPieCod = H00EE11_A200BarPieCod[0] ;
         AV8DifKilos = A203BarPieKil.subtract(A170BarKilLan) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDifkilos_Internalname, GXutil.ltrimstr( AV8DifKilos, 9, 2));
         AV10DifMetros = A205BarPieMet.subtract(A183BarMetLan) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDifmetros_Internalname, GXutil.ltrimstr( AV10DifMetros, 9, 2));
         AV6BarPieCod = A200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecod_Internalname, AV6BarPieCod);
         AV7Kilos = AV8DifKilos ;
         httpContext.ajax_rsp_assign_attri("", false, edtavKilos_Internalname, GXutil.ltrimstr( AV7Kilos, 9, 2));
         AV9Metros = AV10DifMetros ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMetros_Internalname, GXutil.ltrimstr( AV9Metros, 9, 2));
         AV12BarPieCodDestino = A200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecoddestino_Internalname, AV12BarPieCodDestino);
         AV43BarPieLoc = A2186BarPieLoc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarpieloc_Internalname, AV43BarPieLoc);
         AV63Seleccionar = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV63Seleccionar);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(79) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_792( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_79_Refreshing )
         {
            httpContext.doAjaxLoad(79, GridRow);
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /*  Sending Event outputs  */
   }

   public void e12EE2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      GXv_char4[0] = "" ;
      GXv_char3[0] = AV53Ok ;
      new app.existedefectotipdef(remoteHandle, context).execute( AV17Emprcod, AV32TipDefCod, GXv_char4, GXv_char3) ;
      webwreopie_impl.this.AV53Ok = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Ok", AV53Ok);
      if ( ( AV32TipDefCod == 0 ) || ( GXutil.strcmp(AV53Ok, httpContext.getMessage( "N", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Tipo Defecto Inexistente ¡¡¡", ""));
         GX_FocusControl = edtavTipdefcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
         {
            AV27KilAct = AV22BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27KilAct", GXutil.ltrimstr( AV27KilAct, 9, 2));
            AV28MtrAct = AV23BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAct", GXutil.ltrimstr( AV28MtrAct, 9, 2));
            AV47CosProi = AV30BarCosPro ;
            AV48CosAnyi = AV29BarCosAny ;
            GXv_char4[0] = AV17Emprcod ;
            GXv_int5[0] = AV19Barcod ;
            GXv_int6[0] = AV20Barcodreo ;
            GXv_char3[0] = AV21Barcodpar ;
            GXv_int7[0] = AV19Barcod ;
            GXv_char2[0] = AV21Barcodpar ;
            GXv_int8[0] = AV26BarSit ;
            GXv_char9[0] = AV11TipoReoperado ;
            GXv_int10[0] = AV32TipDefCod ;
            GXv_int11[0] = (short)(DecimalUtil.decToDouble(AV33Porcen)) ;
            GXv_char12[0] = AV34MaqCod ;
            GXv_int13[0] = AV35ConReo ;
            GXv_char14[0] = AV36Codigo ;
            GXv_int15[0] = AV37DisCod ;
            new app.pbarreo(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_char2, GXv_int8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_int13, GXv_char14, GXv_int15) ;
            webwreopie_impl.this.AV17Emprcod = GXv_char4[0] ;
            webwreopie_impl.this.AV19Barcod = GXv_int5[0] ;
            webwreopie_impl.this.AV20Barcodreo = GXv_int6[0] ;
            webwreopie_impl.this.AV21Barcodpar = GXv_char3[0] ;
            webwreopie_impl.this.AV19Barcod = GXv_int7[0] ;
            webwreopie_impl.this.AV21Barcodpar = GXv_char2[0] ;
            webwreopie_impl.this.AV26BarSit = GXv_int8[0] ;
            webwreopie_impl.this.AV11TipoReoperado = GXv_char9[0] ;
            webwreopie_impl.this.AV32TipDefCod = GXv_int10[0] ;
            webwreopie_impl.this.AV33Porcen = DecimalUtil.doubleToDec(GXv_int11[0]) ;
            webwreopie_impl.this.AV34MaqCod = GXv_char12[0] ;
            webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
            webwreopie_impl.this.AV36Codigo = GXv_char14[0] ;
            webwreopie_impl.this.AV37DisCod = GXv_int15[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV20Barcodreo", GXutil.str( AV20Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV26BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarSit), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11TipoReoperado", AV11TipoReoperado);
            httpContext.ajax_rsp_assign_attri("", false, "AV32TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipDefCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Porcen", GXutil.ltrimstr( AV33Porcen, 6, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV34MaqCod", AV34MaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV36Codigo", AV36Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "AV37DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37DisCod), 8, 0));
            AV38FlagTras = (short)(0) ;
            AV27KilAct = AV22BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27KilAct", GXutil.ltrimstr( AV27KilAct, 9, 2));
            AV28MtrAct = AV23BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAct", GXutil.ltrimstr( AV28MtrAct, 9, 2));
            AV39KilTras = DecimalUtil.doubleToDec(0) ;
            AV40MtrTras = DecimalUtil.doubleToDec(0) ;
            AV41CosAnyAct = AV29BarCosAny ;
            AV42CosProAct = AV30BarCosPro ;
            /* Start For Each Line */
            nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nGXsfl_79_fel_idx = 0 ;
            while ( nGXsfl_79_fel_idx < nRC_GXsfl_79 )
            {
               nGXsfl_79_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_fel_idx+1) ;
               sGXsfl_79_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_fel_idx), 4, 0), (short)(4), "0") ;
               subsflControlProps_fel_792( ) ;
               AV63Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
               AV6BarPieCod = httpContext.cgiGet( edtavBarpiecod_Internalname) ;
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOS");
                  GX_FocusControl = edtavKilos_Internalname ;
                  wbErr = true ;
                  AV7Kilos = DecimalUtil.ZERO ;
               }
               else
               {
                  AV7Kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
               }
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFKILOS");
                  GX_FocusControl = edtavDifkilos_Internalname ;
                  wbErr = true ;
                  AV8DifKilos = DecimalUtil.ZERO ;
               }
               else
               {
                  AV8DifKilos = localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)) ;
               }
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
                  GX_FocusControl = edtavMetros_Internalname ;
                  wbErr = true ;
                  AV9Metros = DecimalUtil.ZERO ;
               }
               else
               {
                  AV9Metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
               }
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFMETROS");
                  GX_FocusControl = edtavDifmetros_Internalname ;
                  wbErr = true ;
                  AV10DifMetros = DecimalUtil.ZERO ;
               }
               else
               {
                  AV10DifMetros = localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)) ;
               }
               AV12BarPieCodDestino = httpContext.cgiGet( edtavBarpiecoddestino_Internalname) ;
               AV43BarPieLoc = httpContext.cgiGet( edtavBarpieloc_Internalname) ;
               if ( ! httpContext.isAjaxRequest( ) )
               {
                  GXCCtl = "GXHCvCODCAUSA_" + sGXsfl_79_fel_idx ;
                  AV49CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                  GXCCtl = "GXHCvRPS_COD_" + sGXsfl_79_fel_idx ;
                  AV50Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                  GXCCtl = "GXHCvOPECOD_" + sGXsfl_79_fel_idx ;
                  AV51Opecod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               if ( GXutil.strcmp(AV63Seleccionar, httpContext.getMessage( "S", "")) == 0 )
               {
                  GXv_char14[0] = AV17Emprcod ;
                  GXv_int15[0] = AV19Barcod ;
                  GXv_int13[0] = AV20Barcodreo ;
                  GXv_char12[0] = AV21Barcodpar ;
                  GXv_char9[0] = AV6BarPieCod ;
                  GXv_int7[0] = AV19Barcod ;
                  GXv_int8[0] = AV35ConReo ;
                  GXv_char4[0] = AV21Barcodpar ;
                  GXv_decimal16[0] = AV7Kilos ;
                  GXv_decimal17[0] = AV9Metros ;
                  GXv_char3[0] = AV11TipoReoperado ;
                  GXv_char2[0] = AV12BarPieCodDestino ;
                  GXv_int5[0] = AV37DisCod ;
                  new app.pmovpie(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_char9, GXv_int7, GXv_int8, GXv_char4, GXv_decimal16, GXv_decimal17, GXv_char3, GXv_char2, GXv_int5) ;
                  webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
                  webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
                  webwreopie_impl.this.AV20Barcodreo = GXv_int13[0] ;
                  webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
                  webwreopie_impl.this.AV6BarPieCod = GXv_char9[0] ;
                  webwreopie_impl.this.AV19Barcod = GXv_int7[0] ;
                  webwreopie_impl.this.AV35ConReo = GXv_int8[0] ;
                  webwreopie_impl.this.AV21Barcodpar = GXv_char4[0] ;
                  webwreopie_impl.this.AV7Kilos = GXv_decimal16[0] ;
                  webwreopie_impl.this.AV9Metros = GXv_decimal17[0] ;
                  webwreopie_impl.this.AV11TipoReoperado = GXv_char3[0] ;
                  webwreopie_impl.this.AV12BarPieCodDestino = GXv_char2[0] ;
                  webwreopie_impl.this.AV37DisCod = GXv_int5[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV20Barcodreo", GXutil.str( AV20Barcodreo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
                  httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecod_Internalname, AV6BarPieCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
                  httpContext.ajax_rsp_assign_attri("", false, edtavKilos_Internalname, GXutil.ltrimstr( AV7Kilos, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, edtavMetros_Internalname, GXutil.ltrimstr( AV9Metros, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV11TipoReoperado", AV11TipoReoperado);
                  httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecoddestino_Internalname, AV12BarPieCodDestino);
                  httpContext.ajax_rsp_assign_attri("", false, "AV37DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37DisCod), 8, 0));
                  AV38FlagTras = (short)(1) ;
                  if ( GXutil.strcmp(AV25BarUnimed, httpContext.getMessage( "K", "")) == 0 )
                  {
                     AV39KilTras = AV39KilTras.add(AV7Kilos) ;
                  }
                  else
                  {
                     AV40MtrTras = AV40MtrTras.add(AV9Metros) ;
                  }
                  if ( AV44EnvioGaia == 1 )
                  {
                     GXv_char14[0] = AV17Emprcod ;
                     GXv_int15[0] = AV19Barcod ;
                     GXv_int13[0] = AV35ConReo ;
                     GXv_char12[0] = AV21Barcodpar ;
                     GXv_char9[0] = AV6BarPieCod ;
                     GXv_char4[0] = "" ;
                     GXv_decimal17[0] = AV7Kilos ;
                     GXv_decimal16[0] = AV9Metros ;
                     GXv_char3[0] = AV43BarPieLoc ;
                     new app.pvxpzhra(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_char9, GXv_char4, GXv_decimal17, GXv_decimal16, GXv_char3, httpContext.getMessage( "EAC", "")) ;
                     webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
                     webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
                     webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
                     webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
                     webwreopie_impl.this.AV6BarPieCod = GXv_char9[0] ;
                     webwreopie_impl.this.AV7Kilos = GXv_decimal17[0] ;
                     webwreopie_impl.this.AV9Metros = GXv_decimal16[0] ;
                     webwreopie_impl.this.AV43BarPieLoc = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
                     httpContext.ajax_rsp_assign_attri("", false, edtavBarpiecod_Internalname, AV6BarPieCod);
                     httpContext.ajax_rsp_assign_attri("", false, edtavKilos_Internalname, GXutil.ltrimstr( AV7Kilos, 9, 2));
                     httpContext.ajax_rsp_assign_attri("", false, edtavMetros_Internalname, GXutil.ltrimstr( AV9Metros, 9, 2));
                     httpContext.ajax_rsp_assign_attri("", false, edtavBarpieloc_Internalname, AV43BarPieLoc);
                  }
               }
               /* End For Each Line */
            }
            if ( nGXsfl_79_fel_idx == 0 )
            {
               nGXsfl_79_idx = 1 ;
               sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
               subsflControlProps_792( ) ;
            }
            nGXsfl_79_fel_idx = 1 ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27KilAct)==0) )
            {
               AV45CosPro2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV47CosProi.divide(AV27KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV22BarKgm)), 2))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45CosPro2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CosPro2), 4, 0));
               AV46CosAny2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV48CosAnyi.divide(AV27KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV22BarKgm)), 2))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46CosAny2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CosAny2), 4, 0));
               if ( DecimalUtil.compareTo(AV27KilAct, AV22BarKgm) != 0 )
               {
                  AV56CosPro = GXutil.roundDecimal( (AV47CosProi.divide(AV27KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV27KilAct.subtract(AV22BarKgm))), 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV56CosPro", GXutil.ltrimstr( AV56CosPro, 10, 2));
                  AV57CosAny = GXutil.roundDecimal( (AV48CosAnyi.divide(AV27KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV27KilAct.subtract(AV22BarKgm))), 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV57CosAny", GXutil.ltrimstr( AV57CosAny, 10, 2));
               }
               else
               {
                  AV56CosPro = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV56CosPro", GXutil.ltrimstr( AV56CosPro, 10, 2));
                  AV57CosAny = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV57CosAny", GXutil.ltrimstr( AV57CosAny, 10, 2));
               }
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27KilAct)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28MtrAct)==0) )
            {
               GXv_char14[0] = AV17Emprcod ;
               GXv_int15[0] = AV19Barcod ;
               GXv_int13[0] = AV20Barcodreo ;
               GXv_char12[0] = AV21Barcodpar ;
               GXv_decimal17[0] = AV56CosPro ;
               GXv_decimal16[0] = AV57CosAny ;
               new app.pcosbar(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_decimal17, GXv_decimal16) ;
               webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
               webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
               webwreopie_impl.this.AV20Barcodreo = GXv_int13[0] ;
               webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
               webwreopie_impl.this.AV56CosPro = GXv_decimal17[0] ;
               webwreopie_impl.this.AV57CosAny = GXv_decimal16[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV20Barcodreo", GXutil.str( AV20Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV56CosPro", GXutil.ltrimstr( AV56CosPro, 10, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV57CosAny", GXutil.ltrimstr( AV57CosAny, 10, 2));
               GXv_char14[0] = AV17Emprcod ;
               GXv_int15[0] = AV19Barcod ;
               GXv_int13[0] = AV35ConReo ;
               GXv_char12[0] = AV21Barcodpar ;
               GXv_decimal17[0] = DecimalUtil.doubleToDec(AV45CosPro2) ;
               GXv_decimal16[0] = DecimalUtil.doubleToDec(AV46CosAny2) ;
               new app.pcosbar(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_decimal17, GXv_decimal16) ;
               webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
               webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
               webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
               webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
               webwreopie_impl.this.AV45CosPro2 = (short)(DecimalUtil.decToDouble(GXv_decimal17[0])) ;
               webwreopie_impl.this.AV46CosAny2 = (short)(DecimalUtil.decToDouble(GXv_decimal16[0])) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV45CosPro2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CosPro2), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV46CosAny2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CosAny2), 4, 0));
               GXv_char14[0] = AV17Emprcod ;
               GXv_int15[0] = AV19Barcod ;
               GXv_int13[0] = AV35ConReo ;
               GXv_char12[0] = AV21Barcodpar ;
               GXv_decimal17[0] = AV27KilAct ;
               GXv_decimal16[0] = AV28MtrAct ;
               GXv_int11[0] = AV49CodCausa ;
               GXv_char9[0] = AV34MaqCod ;
               new app.phisreo(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_decimal17, GXv_decimal16, GXv_int11, GXv_char9) ;
               webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
               webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
               webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
               webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
               webwreopie_impl.this.AV27KilAct = GXv_decimal17[0] ;
               webwreopie_impl.this.AV28MtrAct = GXv_decimal16[0] ;
               webwreopie_impl.this.AV49CodCausa = GXv_int11[0] ;
               webwreopie_impl.this.AV34MaqCod = GXv_char9[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV27KilAct", GXutil.ltrimstr( AV27KilAct, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAct", GXutil.ltrimstr( AV28MtrAct, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV49CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49CodCausa), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV34MaqCod", AV34MaqCod);
               GXv_char14[0] = AV17Emprcod ;
               GXv_int15[0] = AV19Barcod ;
               GXv_int13[0] = AV35ConReo ;
               GXv_char12[0] = AV21Barcodpar ;
               GXv_int11[0] = AV50Rps_Cod ;
               new app.preorps(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_int11) ;
               webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
               webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
               webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
               webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
               webwreopie_impl.this.AV50Rps_Cod = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV50Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Rps_Cod), 4, 0));
               GXv_char14[0] = AV17Emprcod ;
               GXv_int15[0] = AV19Barcod ;
               GXv_int13[0] = AV35ConReo ;
               GXv_char12[0] = AV21Barcodpar ;
               GXv_int7[0] = AV51Opecod ;
               GXv_int8[0] = AV52Turno ;
               new app.pturope(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_int7, GXv_int8) ;
               webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
               webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
               webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
               webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
               webwreopie_impl.this.AV51Opecod = GXv_int7[0] ;
               webwreopie_impl.this.AV52Turno = GXv_int8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV51Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Opecod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV52Turno", GXutil.str( AV52Turno, 1, 0));
               GXv_char14[0] = AV17Emprcod ;
               GXv_int15[0] = AV19Barcod ;
               GXv_int13[0] = AV35ConReo ;
               GXv_char12[0] = AV21Barcodpar ;
               GXv_char9[0] = AV31UsurCod ;
               new app.pusureo(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int13, GXv_char12, GXv_char9) ;
               webwreopie_impl.this.AV17Emprcod = GXv_char14[0] ;
               webwreopie_impl.this.AV19Barcod = GXv_int15[0] ;
               webwreopie_impl.this.AV35ConReo = GXv_int13[0] ;
               webwreopie_impl.this.AV21Barcodpar = GXv_char12[0] ;
               webwreopie_impl.this.AV31UsurCod = GXv_char9[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV35ConReo", GXutil.str( AV35ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV31UsurCod", AV31UsurCod);
            }
            httpContext.setWebReturnParms(new Object[] {AV17Emprcod,AV18BarNHdr,Integer.valueOf(AV19Barcod),Byte.valueOf(AV20Barcodreo),AV21Barcodpar,AV22BarKgm,AV23BarMtr,Integer.valueOf(AV24BarPie),AV25BarUnimed,Byte.valueOf(AV26BarSit),AV27KilAct,AV28MtrAct,AV29BarCosAny,AV30BarCosPro,AV31UsurCod});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV17Emprcod","AV18BarNHdr","AV19Barcod","AV20Barcodreo","AV21Barcodpar","AV22BarKgm","AV23BarMtr","AV24BarPie","AV25BarUnimed","AV26BarSit","AV27KilAct","AV28MtrAct","AV29BarCosAny","AV30BarCosPro","AV31UsurCod"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
      cmbavTiporeoperado.setValue( GXutil.rtrim( AV11TipoReoperado) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTiporeoperado.getInternalname(), "Values", cmbavTiporeoperado.ToJavascriptSource(), true);
   }

   public void e13EE2( )
   {
      /* Tipdefcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DEFECTOS' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV53Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Dedefcto", ""));
         GX_FocusControl = edtavTipdefcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e14EE2( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV53Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Maquina", ""));
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV58totp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58totp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58totp), 4, 0));
      AV59totm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59totm", GXutil.ltrimstr( AV59totm, 9, 2));
      AV60totk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60totk", GXutil.ltrimstr( AV60totk, 9, 2));
      /* Start For Each Line */
      nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_79_fel_idx = 0 ;
      while ( nGXsfl_79_fel_idx < nRC_GXsfl_79 )
      {
         nGXsfl_79_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_fel_idx+1) ;
         sGXsfl_79_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_792( ) ;
         AV63Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
         AV6BarPieCod = httpContext.cgiGet( edtavBarpiecod_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOS");
            GX_FocusControl = edtavKilos_Internalname ;
            wbErr = true ;
            AV7Kilos = DecimalUtil.ZERO ;
         }
         else
         {
            AV7Kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFKILOS");
            GX_FocusControl = edtavDifkilos_Internalname ;
            wbErr = true ;
            AV8DifKilos = DecimalUtil.ZERO ;
         }
         else
         {
            AV8DifKilos = localUtil.ctond( httpContext.cgiGet( edtavDifkilos_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
            GX_FocusControl = edtavMetros_Internalname ;
            wbErr = true ;
            AV9Metros = DecimalUtil.ZERO ;
         }
         else
         {
            AV9Metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFMETROS");
            GX_FocusControl = edtavDifmetros_Internalname ;
            wbErr = true ;
            AV10DifMetros = DecimalUtil.ZERO ;
         }
         else
         {
            AV10DifMetros = localUtil.ctond( httpContext.cgiGet( edtavDifmetros_Internalname)) ;
         }
         AV12BarPieCodDestino = httpContext.cgiGet( edtavBarpiecoddestino_Internalname) ;
         AV43BarPieLoc = httpContext.cgiGet( edtavBarpieloc_Internalname) ;
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GXCCtl = "GXHCvCODCAUSA_" + sGXsfl_79_fel_idx ;
            AV49CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            GXCCtl = "GXHCvRPS_COD_" + sGXsfl_79_fel_idx ;
            AV50Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            GXCCtl = "GXHCvOPECOD_" + sGXsfl_79_fel_idx ;
            AV51Opecod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( GXutil.strcmp(AV63Seleccionar, httpContext.getMessage( "S", "")) == 0 )
         {
            AV58totp = (short)(AV58totp+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58totp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58totp), 4, 0));
            AV59totm = AV59totm.add(AV9Metros) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59totm", GXutil.ltrimstr( AV59totm, 9, 2));
            AV60totk = AV60totk.add(AV7Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60totk", GXutil.ltrimstr( AV60totk, 9, 2));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_79_fel_idx == 0 )
      {
         nGXsfl_79_idx = 1 ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      nGXsfl_79_fel_idx = 1 ;
   }

   public void S122( )
   {
      /* 'DEFECTOS' Routine */
      returnInSub = false ;
      GXv_char14[0] = AV54Tipdefdsc ;
      GXv_char12[0] = AV53Ok ;
      new app.existedefectotipdef(remoteHandle, context).execute( AV17Emprcod, AV32TipDefCod, GXv_char14, GXv_char12) ;
      webwreopie_impl.this.AV54Tipdefdsc = GXv_char14[0] ;
      webwreopie_impl.this.AV53Ok = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Tipdefdsc", AV54Tipdefdsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV53Ok", AV53Ok);
   }

   public void S132( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      GXv_char14[0] = AV62MaqDsc ;
      GXv_char12[0] = AV53Ok ;
      new app.existemaquinamaquin(remoteHandle, context).execute( AV17Emprcod, AV34MaqCod, GXv_char14, GXv_char12) ;
      webwreopie_impl.this.AV62MaqDsc = GXv_char14[0] ;
      webwreopie_impl.this.AV53Ok = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62MaqDsc", AV62MaqDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV53Ok", AV53Ok);
   }

   public void wb_table4_147_EE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_147_EE2e( true) ;
      }
      else
      {
         wb_table4_147_EE2e( false) ;
      }
   }

   public void wb_table3_91_EE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_94_EE2( true) ;
      }
      else
      {
         wb_table5_94_EE2( false) ;
      }
      return  ;
   }

   public void wb_table5_94_EE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_91_EE2e( true) ;
      }
      else
      {
         wb_table3_91_EE2e( false) ;
      }
   }

   public void wb_table5_94_EE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbtnmas_Internalname, tblTablemergedbtnmas_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", "++", bttBtnmas_Jsonclick, 7, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e17ee1_client"+"'", TempTags, "", 2, "HLP_WebWreoPie.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmenos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 79, 2, 0)+","+"null"+");", "--", bttBtnmenos_Jsonclick, 7, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18ee1_client"+"'", TempTags, "", 2, "HLP_WebWreoPie.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_94_EE2e( true) ;
      }
      else
      {
         wb_table5_94_EE2e( false) ;
      }
   }

   public void wb_table2_48_EE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedtipdefcod_Internalname, tblTablemergedtipdefcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipdefcod_Internalname, httpContext.getMessage( "Defecto", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV32TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipdefcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV32TipDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+"e19ee1_client"+"'", "", "", "", "", edtavTipdefcod_Jsonclick, 7, "AttributeFL", "", "", "", "", 1, edtavTipdefcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipdefdsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefdsc_Internalname, GXutil.rtrim( AV54Tipdefdsc), GXutil.rtrim( localUtil.format( AV54Tipdefdsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdefdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipdefdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_48_EE2e( true) ;
      }
      else
      {
         wb_table2_48_EE2e( false) ;
      }
   }

   public void wb_table1_33_EE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedmaqcod_Internalname, tblTablemergedmaqcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV34MaqCod), GXutil.rtrim( localUtil.format( AV34MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+"e20ee1_client"+"'", "", "", "", "", edtavMaqcod_Jsonclick, 7, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqdsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_79_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV62MaqDsc), GXutil.rtrim( localUtil.format( AV62MaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWreoPie.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_33_EE2e( true) ;
      }
      else
      {
         wb_table1_33_EE2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
      AV18BarNHdr = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarNHdr", AV18BarNHdr);
      AV19Barcod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
      AV20Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Barcodreo", GXutil.str( AV20Barcodreo, 1, 0));
      AV21Barcodpar = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Barcodpar", AV21Barcodpar);
      AV22BarKgm = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarKgm", GXutil.ltrimstr( AV22BarKgm, 9, 2));
      AV23BarMtr = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23BarMtr", GXutil.ltrimstr( AV23BarMtr, 9, 2));
      AV24BarPie = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarPie), 6, 0));
      AV25BarUnimed = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarUnimed", AV25BarUnimed);
      AV26BarSit = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26BarSit), 2, 0));
      AV27KilAct = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27KilAct", GXutil.ltrimstr( AV27KilAct, 9, 2));
      AV28MtrAct = (java.math.BigDecimal)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28MtrAct", GXutil.ltrimstr( AV28MtrAct, 9, 2));
      AV29BarCosAny = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarCosAny", GXutil.ltrimstr( AV29BarCosAny, 10, 2));
      AV30BarCosPro = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarCosPro", GXutil.ltrimstr( AV30BarCosPro, 10, 2));
      AV31UsurCod = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31UsurCod", AV31UsurCod);
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
      paEE2( ) ;
      wsEE2( ) ;
      weEE2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016411354", true, true);
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
         httpContext.AddJavascriptSource("webwreopie.js", "?202661016411354", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_792( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_79_idx );
      edtavBarpiecod_Internalname = "vBARPIECOD_"+sGXsfl_79_idx ;
      edtavKilos_Internalname = "vKILOS_"+sGXsfl_79_idx ;
      edtavDifkilos_Internalname = "vDIFKILOS_"+sGXsfl_79_idx ;
      edtavMetros_Internalname = "vMETROS_"+sGXsfl_79_idx ;
      edtavDifmetros_Internalname = "vDIFMETROS_"+sGXsfl_79_idx ;
      edtavBarpiecoddestino_Internalname = "vBARPIECODDESTINO_"+sGXsfl_79_idx ;
      edtavBarpieloc_Internalname = "vBARPIELOC_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_792( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_79_fel_idx );
      edtavBarpiecod_Internalname = "vBARPIECOD_"+sGXsfl_79_fel_idx ;
      edtavKilos_Internalname = "vKILOS_"+sGXsfl_79_fel_idx ;
      edtavDifkilos_Internalname = "vDIFKILOS_"+sGXsfl_79_fel_idx ;
      edtavMetros_Internalname = "vMETROS_"+sGXsfl_79_fel_idx ;
      edtavDifmetros_Internalname = "vDIFMETROS_"+sGXsfl_79_fel_idx ;
      edtavBarpiecoddestino_Internalname = "vBARPIECODDESTINO_"+sGXsfl_79_fel_idx ;
      edtavBarpieloc_Internalname = "vBARPIELOC_"+sGXsfl_79_fel_idx ;
   }

   public void sendrow_792( )
   {
      subsflControlProps_792( ) ;
      wbEE0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_79_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_79_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_79_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_79_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         AV63Seleccionar = ((GXutil.strcmp(GXutil.rtrim( AV63Seleccionar), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV63Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV63Seleccionar,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarpiecod_Enabled!=0)&&(edtavBarpiecod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarpiecod_Internalname,GXutil.rtrim( AV6BarPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarpiecod_Enabled!=0)&&(edtavBarpiecod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarpiecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarpiecod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavKilos_Enabled!=0)&&(edtavKilos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKilos_Internalname,GXutil.ltrim( localUtil.ntoc( AV7Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV7Kilos, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavKilos_Enabled!=0)&&(edtavKilos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifkilos_Enabled!=0)&&(edtavDifkilos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifkilos_Internalname,GXutil.ltrim( localUtil.ntoc( AV8DifKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifkilos_Enabled!=0) ? localUtil.format( AV8DifKilos, "ZZZZZ9.99") : localUtil.format( AV8DifKilos, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavDifkilos_Enabled!=0)&&(edtavDifkilos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDifkilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDifkilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMetros_Enabled!=0)&&(edtavMetros_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetros_Internalname,GXutil.ltrim( localUtil.ntoc( AV9Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV9Metros, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavMetros_Enabled!=0)&&(edtavMetros_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifmetros_Enabled!=0)&&(edtavDifmetros_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifmetros_Internalname,GXutil.ltrim( localUtil.ntoc( AV10DifMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifmetros_Enabled!=0) ? localUtil.format( AV10DifMetros, "ZZZZZ9.99") : localUtil.format( AV10DifMetros, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavDifmetros_Enabled!=0)&&(edtavDifmetros_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDifmetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDifmetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarpiecoddestino_Enabled!=0)&&(edtavBarpiecoddestino_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 86,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarpiecoddestino_Internalname,GXutil.rtrim( AV12BarPieCodDestino),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarpiecoddestino_Enabled!=0)&&(edtavBarpiecoddestino_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,86);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarpiecoddestino_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarpieloc_Enabled!=0)&&(edtavBarpieloc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 87,'',false,'"+sGXsfl_79_idx+"',79)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarpieloc_Internalname,GXutil.rtrim( AV43BarPieLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarpieloc_Enabled!=0)&&(edtavBarpieloc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,87);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarpieloc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarpieloc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesEE2( ) ;
         GXCCtl = "GXHCvCODCAUSA_" + sGXsfl_79_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV49CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
         GXCCtl = "GXHCvRPS_COD_" + sGXsfl_79_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV50Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
         GXCCtl = "GXHCvOPECOD_" + sGXsfl_79_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV51Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
         GridContainer.AddRow(GridRow);
         nGXsfl_79_idx = ((subGrid_Islastpage==1)&&(nGXsfl_79_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      /* End function sendrow_792 */
   }

   public void startgridcontrol79( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"79\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Disp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Disp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Pieza Destino", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion Pieza", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV63Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV6BarPieCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarpiecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV7Kilos, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV8DifKilos, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifkilos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9Metros, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10DifMetros, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifmetros_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV12BarPieCodDestino));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV43BarPieLoc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarpieloc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockmaqcod_Internalname = "TEXTBLOCKMAQCOD" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      tblTablemergedmaqcod_Internalname = "TABLEMERGEDMAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblocktipdefcod_Internalname = "TEXTBLOCKTIPDEFCOD" ;
      edtavTipdefcod_Internalname = "vTIPDEFCOD" ;
      edtavTipdefdsc_Internalname = "vTIPDEFDSC" ;
      tblTablemergedtipdefcod_Internalname = "TABLEMERGEDTIPDEFCOD" ;
      divTablesplittedtipdefcod_Internalname = "TABLESPLITTEDTIPDEFCOD" ;
      edtavCodcausa_Internalname = "vCODCAUSA" ;
      edtavRps_cod_Internalname = "vRPS_COD" ;
      edtavOpecod_Internalname = "vOPECOD" ;
      edtavTurno_Internalname = "vTURNO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      edtavBarpiecod_Internalname = "vBARPIECOD" ;
      edtavKilos_Internalname = "vKILOS" ;
      edtavDifkilos_Internalname = "vDIFKILOS" ;
      edtavMetros_Internalname = "vMETROS" ;
      edtavDifmetros_Internalname = "vDIFMETROS" ;
      edtavBarpiecoddestino_Internalname = "vBARPIECODDESTINO" ;
      edtavBarpieloc_Internalname = "vBARPIELOC" ;
      bttBtnmas_Internalname = "BTNMAS" ;
      bttBtnmenos_Internalname = "BTNMENOS" ;
      tblTablemergedbtnmas_Internalname = "TABLEMERGEDBTNMAS" ;
      tblUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      lblTextblocktotp_Internalname = "TEXTBLOCKTOTP" ;
      edtavTotp_Internalname = "vTOTP" ;
      divUnnamedtabletotp_Internalname = "UNNAMEDTABLETOTP" ;
      lblTextblocktotm_Internalname = "TEXTBLOCKTOTM" ;
      edtavTotm_Internalname = "vTOTM" ;
      divUnnamedtabletotm_Internalname = "UNNAMEDTABLETOTM" ;
      lblTextblocktotk_Internalname = "TEXTBLOCKTOTK" ;
      edtavTotk_Internalname = "vTOTK" ;
      divUnnamedtabletotk_Internalname = "UNNAMEDTABLETOTK" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      cmbavTiporeoperado.setInternalname( "vTIPOREOPERADO" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      edtavBarpieloc_Jsonclick = "" ;
      edtavBarpieloc_Visible = 0 ;
      edtavBarpieloc_Enabled = 1 ;
      edtavBarpiecoddestino_Jsonclick = "" ;
      edtavBarpiecoddestino_Visible = -1 ;
      edtavBarpiecoddestino_Enabled = 1 ;
      edtavDifmetros_Jsonclick = "" ;
      edtavDifmetros_Visible = -1 ;
      edtavDifmetros_Enabled = 1 ;
      edtavMetros_Jsonclick = "" ;
      edtavMetros_Visible = -1 ;
      edtavMetros_Enabled = 1 ;
      edtavDifkilos_Jsonclick = "" ;
      edtavDifkilos_Visible = -1 ;
      edtavDifkilos_Enabled = 1 ;
      edtavKilos_Jsonclick = "" ;
      edtavKilos_Visible = -1 ;
      edtavKilos_Enabled = 1 ;
      edtavBarpiecod_Jsonclick = "" ;
      edtavBarpiecod_Visible = -1 ;
      edtavBarpiecod_Enabled = 1 ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavTipdefdsc_Jsonclick = "" ;
      edtavTipdefdsc_Enabled = 1 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Enabled = 1 ;
      cmbavTiporeoperado.setJsonclick( "" );
      cmbavTiporeoperado.setEnabled( 1 );
      edtavTotk_Jsonclick = "" ;
      edtavTotk_Enabled = 1 ;
      edtavTotm_Jsonclick = "" ;
      edtavTotm_Enabled = 1 ;
      edtavTotp_Jsonclick = "" ;
      edtavTotp_Enabled = 1 ;
      edtavTurno_Jsonclick = "" ;
      edtavTurno_Enabled = 1 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Enabled = 1 ;
      edtavRps_cod_Jsonclick = "" ;
      edtavRps_cod_Enabled = 1 ;
      edtavCodcausa_Jsonclick = "" ;
      edtavCodcausa_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Desea crear el REOPERADO INTERNO?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Creacion REOPERADO INTERNO", "") ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = "" ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = "" ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Piezas", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Totales", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = "" ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Kilos, Metros, Piezas (detalle)", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCIONAR_" + sGXsfl_79_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_79_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
      AV63Seleccionar = ((GXutil.strcmp(GXutil.rtrim( AV63Seleccionar), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV63Seleccionar);
      cmbavTiporeoperado.setName( "vTIPOREOPERADO" );
      cmbavTiporeoperado.setWebtags( "" );
      cmbavTiporeoperado.addItem("T", httpContext.getMessage( "TOTAL", ""), (short)(0));
      cmbavTiporeoperado.addItem("P", httpContext.getMessage( "PARCIAL", ""), (short)(0));
      if ( cmbavTiporeoperado.getItemCount() > 0 )
      {
         AV11TipoReoperado = cmbavTiporeoperado.getValidValue(AV11TipoReoperado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11TipoReoperado", AV11TipoReoperado);
      }
      /* End function init_web_controls */
   }

   public void validv_Codcausa( )
   {
      if ( (GXutil.strcmp("", hV49CodCausa)==0) )
      {
         AV49CodCausa = (short)(0) ;
      }
      else
      {
         A5086DscCausa = hV49CodCausa ;
         n5086DscCausa = false ;
         /* Using cursor H00EE12 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n5086DscCausa), A5086DscCausa});
         AV49CodCausa = H00EE12_A5085CodCausa[0] ;
         if ( ! ( (pr_default.getStatus(10) == 101) ) )
         {
            pr_default.readNext(10);
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Causa", "")}), 1, "vCODCAUSA");
               GX_FocusControl = edtavCodcausa_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(10);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV49CodCausa", hV49CodCausa);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV49CodCausa", GXutil.ltrim( localUtil.ntoc( AV49CodCausa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV49CodCausa", GXutil.rtrim( hV49CodCausa));
   }

   public void validv_Rps_cod( )
   {
      if ( (GXutil.strcmp("", hV50Rps_Cod)==0) )
      {
         AV50Rps_Cod = (short)(0) ;
      }
      else
      {
         A7001Rps_Dsc = hV50Rps_Cod ;
         n7001Rps_Dsc = false ;
         /* Using cursor H00EE13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n7001Rps_Dsc), A7001Rps_Dsc});
         AV50Rps_Cod = H00EE13_A7000Rps_Cod[0] ;
         if ( ! ( (pr_default.getStatus(11) == 101) ) )
         {
            pr_default.readNext(11);
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( " Responsabilidad", "")}), 1, "vRPS_COD");
               GX_FocusControl = edtavRps_cod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(11);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV50Rps_Cod", hV50Rps_Cod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV50Rps_Cod", GXutil.ltrim( localUtil.ntoc( AV50Rps_Cod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV50Rps_Cod", GXutil.rtrim( hV50Rps_Cod));
   }

   public void validv_Opecod( )
   {
      if ( (GXutil.strcmp("", hV51Opecod)==0) )
      {
         AV51Opecod = 0 ;
      }
      else
      {
         A653OpeNom = hV51Opecod ;
         n653OpeNom = false ;
         /* Using cursor H00EE14 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n653OpeNom), A653OpeNom});
         AV51Opecod = H00EE14_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "vOPECOD");
               GX_FocusControl = edtavOpecod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV51Opecod", hV51Opecod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV51Opecod", GXutil.ltrim( localUtil.ntoc( AV51Opecod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV51Opecod", GXutil.rtrim( hV51Opecod));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'AV44EnvioGaia',fld:'vENVIOGAIA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e16EE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV8DifKilos',fld:'vDIFKILOS',pic:'ZZZZZ9.99'},{av:'AV10DifMetros',fld:'vDIFMETROS',pic:'ZZZZZ9.99'},{av:'AV6BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV7Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV9Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV12BarPieCodDestino',fld:'vBARPIECODDESTINO',pic:''},{av:'AV43BarPieLoc',fld:'vBARPIELOC',pic:''},{av:'AV63Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11EE1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e12EE2',iparms:[{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV22BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV23BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV30BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV29BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9'},{av:'cmbavTiporeoperado'},{av:'AV11TipoReoperado',fld:'vTIPOREOPERADO',pic:''},{av:'AV33Porcen',fld:'vPORCEN',pic:'ZZ9.99'},{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'AV35ConReo',fld:'vCONREO',pic:'9'},{av:'AV36Codigo',fld:'vCODIGO',pic:''},{av:'AV37DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV63Seleccionar',fld:'vSELECCIONAR',grid:79,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',grid:79,prop:'GridRC',grid:79},{av:'AV6BarPieCod',fld:'vBARPIECOD',grid:79,pic:''},{av:'AV7Kilos',fld:'vKILOS',grid:79,pic:'ZZZZZ9.99'},{av:'AV9Metros',fld:'vMETROS',grid:79,pic:'ZZZZZ9.99'},{av:'AV12BarPieCodDestino',fld:'vBARPIECODDESTINO',grid:79,pic:''},{av:'AV25BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV44EnvioGaia',fld:'vENVIOGAIA',pic:'ZZZ9',hsh:true},{av:'AV43BarPieLoc',fld:'vBARPIELOC',grid:79,pic:''},{av:'AV56CosPro',fld:'vCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV57CosAny',fld:'vCOSANY',pic:'ZZZZZZ9.99'},{av:'AV45CosPro2',fld:'vCOSPRO2',pic:'ZZZ9'},{av:'AV46CosAny2',fld:'vCOSANY2',pic:'ZZZ9'},{av:'AV49CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'AV50Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV51Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV52Turno',fld:'vTURNO',pic:'9'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV24BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV18BarNHdr',fld:'vBARNHDR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV53Ok',fld:'vOK',pic:''},{av:'AV27KilAct',fld:'vKILACT',pic:'ZZZZZ9.99'},{av:'AV28MtrAct',fld:'vMTRACT',pic:'ZZZZZ9.99'},{av:'AV37DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV36Codigo',fld:'vCODIGO',pic:''},{av:'AV35ConReo',fld:'vCONREO',pic:'9'},{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'AV33Porcen',fld:'vPORCEN',pic:'ZZ9.99'},{av:'AV32TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'cmbavTiporeoperado'},{av:'AV11TipoReoperado',fld:'vTIPOREOPERADO',pic:''},{av:'AV26BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12BarPieCodDestino',fld:'vBARPIECODDESTINO',pic:''},{av:'AV9Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV7Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV6BarPieCod',fld:'vBARPIECOD',pic:''},{av:'AV43BarPieLoc',fld:'vBARPIELOC',pic:''},{av:'AV45CosPro2',fld:'vCOSPRO2',pic:'ZZZ9'},{av:'AV46CosAny2',fld:'vCOSANY2',pic:'ZZZ9'},{av:'AV56CosPro',fld:'vCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV57CosAny',fld:'vCOSANY',pic:'ZZZZZZ9.99'},{av:'AV49CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'AV50Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV52Turno',fld:'vTURNO',pic:'9'},{av:'AV51Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV31UsurCod',fld:'vUSURCOD',pic:'@!'}]}");
      setEventMetadata("'DOMAS'","{handler:'e17EE1',iparms:[{av:'AV63Seleccionar',fld:'vSELECCIONAR',grid:79,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',grid:79,prop:'GridRC',grid:79},{av:'AV9Metros',fld:'vMETROS',grid:79,pic:'ZZZZZ9.99'},{av:'AV7Kilos',fld:'vKILOS',grid:79,pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOMAS'",",oparms:[{av:'AV63Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV58totp',fld:'vTOTP',pic:'ZZZ9'},{av:'AV59totm',fld:'vTOTM',pic:'ZZZZZ9.99'},{av:'AV60totk',fld:'vTOTK',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("'DOMENOS'","{handler:'e18EE1',iparms:[{av:'AV63Seleccionar',fld:'vSELECCIONAR',grid:79,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_79',ctrl:'GRID',grid:79,prop:'GridRC',grid:79},{av:'AV9Metros',fld:'vMETROS',grid:79,pic:'ZZZZZ9.99'},{av:'AV7Kilos',fld:'vKILOS',grid:79,pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOMENOS'",",oparms:[{av:'AV63Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV58totp',fld:'vTOTP',pic:'ZZZ9'},{av:'AV59totm',fld:'vTOTM',pic:'ZZZZZ9.99'},{av:'AV60totk',fld:'vTOTK',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VMAQCOD.CLICK","{handler:'e20EE1',iparms:[{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'AV62MaqDsc',fld:'vMAQDSC',pic:''}]");
      setEventMetadata("VMAQCOD.CLICK",",oparms:[]}");
      setEventMetadata("VTIPDEFCOD.CLICK","{handler:'e19EE1',iparms:[{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV54Tipdefdsc',fld:'vTIPDEFDSC',pic:''}]");
      setEventMetadata("VTIPDEFCOD.CLICK",",oparms:[]}");
      setEventMetadata("VTIPDEFCOD.ISVALID","{handler:'e13EE2',iparms:[{av:'AV53Ok',fld:'vOK',pic:''},{av:'AV32TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VTIPDEFCOD.ISVALID",",oparms:[{av:'AV53Ok',fld:'vOK',pic:''},{av:'AV54Tipdefdsc',fld:'vTIPDEFDSC',pic:''}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e14EE2',iparms:[{av:'AV53Ok',fld:'vOK',pic:''},{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV53Ok',fld:'vOK',pic:''},{av:'AV62MaqDsc',fld:'vMAQDSC',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'AV44EnvioGaia',fld:'vENVIOGAIA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'AV44EnvioGaia',fld:'vENVIOGAIA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'AV44EnvioGaia',fld:'vENVIOGAIA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV20Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV21Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'AV44EnvioGaia',fld:'vENVIOGAIA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_CODCAUSA","{handler:'validv_Codcausa',iparms:[{av:'hV49CodCausa'},{av:'AV49CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_CODCAUSA",",oparms:[{av:'AV49CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'hV49CodCausa'}]}");
      setEventMetadata("VALIDV_RPS_COD","{handler:'validv_Rps_cod',iparms:[{av:'hV50Rps_Cod'},{av:'AV50Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_RPS_COD",",oparms:[{av:'AV50Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'hV50Rps_Cod'}]}");
      setEventMetadata("VALIDV_OPECOD","{handler:'validv_Opecod',iparms:[{av:'hV51Opecod'},{av:'AV51Opecod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_OPECOD",",oparms:[{av:'AV51Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'hV51Opecod'}]}");
      setEventMetadata("NULL","{handler:'validv_Barpieloc',iparms:[]");
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
      wcpOAV17Emprcod = "" ;
      wcpOAV18BarNHdr = "" ;
      wcpOAV21Barcodpar = "" ;
      wcpOAV22BarKgm = DecimalUtil.ZERO ;
      wcpOAV23BarMtr = DecimalUtil.ZERO ;
      wcpOAV25BarUnimed = "" ;
      wcpOAV27KilAct = DecimalUtil.ZERO ;
      wcpOAV28MtrAct = DecimalUtil.ZERO ;
      wcpOAV29BarCosAny = DecimalUtil.ZERO ;
      wcpOAV30BarCosPro = DecimalUtil.ZERO ;
      wcpOAV31UsurCod = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A653OpeNom = "" ;
      hV49CodCausa = "" ;
      hV50Rps_Cod = "" ;
      hV51Opecod = "" ;
      AV17Emprcod = "" ;
      AV18BarNHdr = "" ;
      AV21Barcodpar = "" ;
      AV22BarKgm = DecimalUtil.ZERO ;
      AV23BarMtr = DecimalUtil.ZERO ;
      AV25BarUnimed = "" ;
      AV27KilAct = DecimalUtil.ZERO ;
      AV28MtrAct = DecimalUtil.ZERO ;
      AV29BarCosAny = DecimalUtil.ZERO ;
      AV30BarCosPro = DecimalUtil.ZERO ;
      AV31UsurCod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV33Porcen = DecimalUtil.ZERO ;
      AV36Codigo = "" ;
      AV56CosPro = DecimalUtil.ZERO ;
      AV57CosAny = DecimalUtil.ZERO ;
      AV53Ok = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockmaqcod_Jsonclick = "" ;
      lblTextblocktipdefcod_Jsonclick = "" ;
      TempTags = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      lblTextblocktotp_Jsonclick = "" ;
      lblTextblocktotm_Jsonclick = "" ;
      AV59totm = DecimalUtil.ZERO ;
      lblTextblocktotk_Jsonclick = "" ;
      AV60totk = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      AV11TipoReoperado = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV63Seleccionar = "" ;
      AV6BarPieCod = "" ;
      AV7Kilos = DecimalUtil.ZERO ;
      AV8DifKilos = DecimalUtil.ZERO ;
      AV9Metros = DecimalUtil.ZERO ;
      AV10DifMetros = DecimalUtil.ZERO ;
      AV12BarPieCodDestino = "" ;
      AV43BarPieLoc = "" ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l5086DscCausa = "" ;
      H00EE2_A5086DscCausa = new String[] {""} ;
      H00EE2_n5086DscCausa = new boolean[] {false} ;
      l7001Rps_Dsc = "" ;
      H00EE3_A7001Rps_Dsc = new String[] {""} ;
      H00EE3_n7001Rps_Dsc = new boolean[] {false} ;
      l653OpeNom = "" ;
      H00EE4_A653OpeNom = new String[] {""} ;
      H00EE4_n653OpeNom = new boolean[] {false} ;
      H00EE5_A5086DscCausa = new String[] {""} ;
      H00EE5_n5086DscCausa = new boolean[] {false} ;
      H00EE5_A396EmprCod = new String[] {""} ;
      H00EE5_A5085CodCausa = new short[1] ;
      H00EE6_A7001Rps_Dsc = new String[] {""} ;
      H00EE6_n7001Rps_Dsc = new boolean[] {false} ;
      H00EE6_A396EmprCod = new String[] {""} ;
      H00EE6_A7000Rps_Cod = new short[1] ;
      H00EE7_A653OpeNom = new String[] {""} ;
      H00EE7_n653OpeNom = new boolean[] {false} ;
      H00EE7_A396EmprCod = new String[] {""} ;
      H00EE7_A652OpeCod = new int[1] ;
      AV34MaqCod = "" ;
      AV62MaqDsc = "" ;
      AV54Tipdefdsc = "" ;
      H00EE8_A5086DscCausa = new String[] {""} ;
      H00EE8_n5086DscCausa = new boolean[] {false} ;
      H00EE8_A396EmprCod = new String[] {""} ;
      H00EE8_A5085CodCausa = new short[1] ;
      H00EE9_A7001Rps_Dsc = new String[] {""} ;
      H00EE9_n7001Rps_Dsc = new boolean[] {false} ;
      H00EE9_A396EmprCod = new String[] {""} ;
      H00EE9_A7000Rps_Cod = new short[1] ;
      H00EE10_A653OpeNom = new String[] {""} ;
      H00EE10_n653OpeNom = new boolean[] {false} ;
      H00EE10_A396EmprCod = new String[] {""} ;
      H00EE10_A652OpeCod = new int[1] ;
      AV66Station = "" ;
      GXt_char1 = "" ;
      AV67Emprnom = "" ;
      H00EE11_A201BarPieEst = new byte[1] ;
      H00EE11_A130BarCodPar = new String[] {""} ;
      H00EE11_A132BarCodReo = new byte[1] ;
      H00EE11_A129BarCod = new int[1] ;
      H00EE11_A396EmprCod = new String[] {""} ;
      H00EE11_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EE11_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EE11_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EE11_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EE11_A2186BarPieLoc = new String[] {""} ;
      H00EE11_n2186BarPieLoc = new boolean[] {false} ;
      H00EE11_A200BarPieCod = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV47CosProi = DecimalUtil.ZERO ;
      AV48CosAnyi = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      GXv_int10 = new short[1] ;
      AV39KilTras = DecimalUtil.ZERO ;
      AV40MtrTras = DecimalUtil.ZERO ;
      AV41CosAnyAct = DecimalUtil.ZERO ;
      AV42CosProAct = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int15 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char12 = new String[1] ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      bttBtnmas_Jsonclick = "" ;
      bttBtnmenos_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H00EE12_A5086DscCausa = new String[] {""} ;
      H00EE12_n5086DscCausa = new boolean[] {false} ;
      H00EE12_A396EmprCod = new String[] {""} ;
      H00EE12_A5085CodCausa = new short[1] ;
      ZhV49CodCausa = "" ;
      H00EE13_A7001Rps_Dsc = new String[] {""} ;
      H00EE13_n7001Rps_Dsc = new boolean[] {false} ;
      H00EE13_A396EmprCod = new String[] {""} ;
      H00EE13_A7000Rps_Cod = new short[1] ;
      ZhV50Rps_Cod = "" ;
      H00EE14_A653OpeNom = new String[] {""} ;
      H00EE14_n653OpeNom = new boolean[] {false} ;
      H00EE14_A396EmprCod = new String[] {""} ;
      H00EE14_A652OpeCod = new int[1] ;
      ZhV51Opecod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwreopie__default(),
         new Object[] {
             new Object[] {
            H00EE2_A5086DscCausa, H00EE2_n5086DscCausa
            }
            , new Object[] {
            H00EE3_A7001Rps_Dsc, H00EE3_n7001Rps_Dsc
            }
            , new Object[] {
            H00EE4_A653OpeNom, H00EE4_n653OpeNom
            }
            , new Object[] {
            H00EE5_A5086DscCausa, H00EE5_n5086DscCausa, H00EE5_A396EmprCod, H00EE5_A5085CodCausa
            }
            , new Object[] {
            H00EE6_A7001Rps_Dsc, H00EE6_n7001Rps_Dsc, H00EE6_A396EmprCod, H00EE6_A7000Rps_Cod
            }
            , new Object[] {
            H00EE7_A653OpeNom, H00EE7_n653OpeNom, H00EE7_A396EmprCod, H00EE7_A652OpeCod
            }
            , new Object[] {
            H00EE8_A5086DscCausa, H00EE8_n5086DscCausa, H00EE8_A396EmprCod, H00EE8_A5085CodCausa
            }
            , new Object[] {
            H00EE9_A7001Rps_Dsc, H00EE9_n7001Rps_Dsc, H00EE9_A396EmprCod, H00EE9_A7000Rps_Cod
            }
            , new Object[] {
            H00EE10_A653OpeNom, H00EE10_n653OpeNom, H00EE10_A396EmprCod, H00EE10_A652OpeCod
            }
            , new Object[] {
            H00EE11_A201BarPieEst, H00EE11_A130BarCodPar, H00EE11_A132BarCodReo, H00EE11_A129BarCod, H00EE11_A396EmprCod, H00EE11_A170BarKilLan, H00EE11_A203BarPieKil, H00EE11_A183BarMetLan, H00EE11_A205BarPieMet, H00EE11_A2186BarPieLoc,
            H00EE11_n2186BarPieLoc, H00EE11_A200BarPieCod
            }
            , new Object[] {
            H00EE12_A5086DscCausa, H00EE12_n5086DscCausa, H00EE12_A396EmprCod, H00EE12_A5085CodCausa
            }
            , new Object[] {
            H00EE13_A7001Rps_Dsc, H00EE13_n7001Rps_Dsc, H00EE13_A396EmprCod, H00EE13_A7000Rps_Cod
            }
            , new Object[] {
            H00EE14_A653OpeNom, H00EE14_n653OpeNom, H00EE14_A396EmprCod, H00EE14_A652OpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavBarpiecod_Enabled = 0 ;
      edtavDifkilos_Enabled = 0 ;
      edtavDifmetros_Enabled = 0 ;
      edtavBarpieloc_Enabled = 0 ;
      edtavTotp_Enabled = 0 ;
      edtavTotm_Enabled = 0 ;
      edtavTotk_Enabled = 0 ;
   }

   private byte wcpOAV20Barcodreo ;
   private byte wcpOAV26BarSit ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV20Barcodreo ;
   private byte AV26BarSit ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV35ConReo ;
   private byte AV52Turno ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXv_int6[] ;
   private byte GXv_int8[] ;
   private byte GXv_int13[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV44EnvioGaia ;
   private short AV45CosPro2 ;
   private short AV46CosAny2 ;
   private short AV49CodCausa ;
   private short AV50Rps_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV58totp ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private short AV32TipDefCod ;
   private short GXv_int10[] ;
   private short AV38FlagTras ;
   private short GXv_int11[] ;
   private short ZV49CodCausa ;
   private short ZV50Rps_Cod ;
   private int wcpOAV19Barcod ;
   private int wcpOAV24BarPie ;
   private int nRC_GXsfl_79 ;
   private int subGrid_Rows ;
   private int AV19Barcod ;
   private int AV24BarPie ;
   private int nGXsfl_79_idx=1 ;
   private int A129BarCod ;
   private int AV37DisCod ;
   private int AV51Opecod ;
   private int edtavBarnhdr_Enabled ;
   private int edtavCodcausa_Enabled ;
   private int edtavRps_cod_Enabled ;
   private int edtavOpecod_Enabled ;
   private int edtavTurno_Enabled ;
   private int edtavTotp_Enabled ;
   private int edtavTotm_Enabled ;
   private int edtavTotk_Enabled ;
   private int gxdynajaxindex ;
   private int A652OpeCod ;
   private int subGrid_Islastpage ;
   private int edtavMaqdsc_Enabled ;
   private int edtavTipdefdsc_Enabled ;
   private int edtavBarpiecod_Enabled ;
   private int edtavDifkilos_Enabled ;
   private int edtavDifmetros_Enabled ;
   private int edtavBarpieloc_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int nGXsfl_79_fel_idx=1 ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int15[] ;
   private int edtavTipdefcod_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavBarpiecod_Visible ;
   private int edtavKilos_Enabled ;
   private int edtavKilos_Visible ;
   private int edtavDifkilos_Visible ;
   private int edtavMetros_Enabled ;
   private int edtavMetros_Visible ;
   private int edtavDifmetros_Visible ;
   private int edtavBarpiecoddestino_Enabled ;
   private int edtavBarpiecoddestino_Visible ;
   private int edtavBarpieloc_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int ZV51Opecod ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal wcpOAV22BarKgm ;
   private java.math.BigDecimal wcpOAV23BarMtr ;
   private java.math.BigDecimal wcpOAV27KilAct ;
   private java.math.BigDecimal wcpOAV28MtrAct ;
   private java.math.BigDecimal wcpOAV29BarCosAny ;
   private java.math.BigDecimal wcpOAV30BarCosPro ;
   private java.math.BigDecimal AV22BarKgm ;
   private java.math.BigDecimal AV23BarMtr ;
   private java.math.BigDecimal AV27KilAct ;
   private java.math.BigDecimal AV28MtrAct ;
   private java.math.BigDecimal AV29BarCosAny ;
   private java.math.BigDecimal AV30BarCosPro ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal AV33Porcen ;
   private java.math.BigDecimal AV56CosPro ;
   private java.math.BigDecimal AV57CosAny ;
   private java.math.BigDecimal AV59totm ;
   private java.math.BigDecimal AV60totk ;
   private java.math.BigDecimal AV7Kilos ;
   private java.math.BigDecimal AV8DifKilos ;
   private java.math.BigDecimal AV9Metros ;
   private java.math.BigDecimal AV10DifMetros ;
   private java.math.BigDecimal AV47CosProi ;
   private java.math.BigDecimal AV48CosAnyi ;
   private java.math.BigDecimal AV39KilTras ;
   private java.math.BigDecimal AV40MtrTras ;
   private java.math.BigDecimal AV41CosAnyAct ;
   private java.math.BigDecimal AV42CosProAct ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String wcpOAV17Emprcod ;
   private String wcpOAV18BarNHdr ;
   private String wcpOAV21Barcodpar ;
   private String wcpOAV25BarUnimed ;
   private String wcpOAV31UsurCod ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A653OpeNom ;
   private String hV49CodCausa ;
   private String hV50Rps_Cod ;
   private String hV51Opecod ;
   private String AV17Emprcod ;
   private String AV18BarNHdr ;
   private String AV21Barcodpar ;
   private String AV25BarUnimed ;
   private String AV31UsurCod ;
   private String sGXsfl_79_idx="0001" ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String A2186BarPieLoc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV36Codigo ;
   private String AV53Ok ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockmaqcod_Internalname ;
   private String lblTextblockmaqcod_Jsonclick ;
   private String divTablesplittedtipdefcod_Internalname ;
   private String lblTextblocktipdefcod_Internalname ;
   private String lblTextblocktipdefcod_Jsonclick ;
   private String edtavCodcausa_Internalname ;
   private String TempTags ;
   private String edtavCodcausa_Jsonclick ;
   private String edtavRps_cod_Internalname ;
   private String edtavRps_cod_Jsonclick ;
   private String edtavOpecod_Internalname ;
   private String edtavOpecod_Jsonclick ;
   private String edtavTurno_Internalname ;
   private String edtavTurno_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtabletotp_Internalname ;
   private String lblTextblocktotp_Internalname ;
   private String lblTextblocktotp_Jsonclick ;
   private String edtavTotp_Internalname ;
   private String edtavTotp_Jsonclick ;
   private String divUnnamedtabletotm_Internalname ;
   private String lblTextblocktotm_Internalname ;
   private String lblTextblocktotm_Jsonclick ;
   private String edtavTotm_Internalname ;
   private String edtavTotm_Jsonclick ;
   private String divUnnamedtabletotk_Internalname ;
   private String lblTextblocktotk_Internalname ;
   private String lblTextblocktotk_Jsonclick ;
   private String edtavTotk_Internalname ;
   private String edtavTotk_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String AV11TipoReoperado ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV63Seleccionar ;
   private String AV6BarPieCod ;
   private String edtavBarpiecod_Internalname ;
   private String edtavKilos_Internalname ;
   private String edtavDifkilos_Internalname ;
   private String edtavMetros_Internalname ;
   private String edtavDifmetros_Internalname ;
   private String AV12BarPieCodDestino ;
   private String edtavBarpiecoddestino_Internalname ;
   private String AV43BarPieLoc ;
   private String edtavBarpieloc_Internalname ;
   private String GXCCtl ;
   private String edtavMaqcod_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l5086DscCausa ;
   private String l7001Rps_Dsc ;
   private String l653OpeNom ;
   private String edtavMaqdsc_Internalname ;
   private String edtavTipdefdsc_Internalname ;
   private String AV34MaqCod ;
   private String AV62MaqDsc ;
   private String edtavTipdefcod_Internalname ;
   private String AV54Tipdefdsc ;
   private String AV66Station ;
   private String GXt_char1 ;
   private String AV67Emprnom ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char9[] ;
   private String GXv_char14[] ;
   private String GXv_char12[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblUnnamedtable6_Internalname ;
   private String tblTablemergedbtnmas_Internalname ;
   private String bttBtnmas_Internalname ;
   private String bttBtnmas_Jsonclick ;
   private String bttBtnmenos_Internalname ;
   private String bttBtnmenos_Jsonclick ;
   private String tblTablemergedtipdefcod_Internalname ;
   private String edtavTipdefcod_Jsonclick ;
   private String edtavTipdefdsc_Jsonclick ;
   private String tblTablemergedmaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavBarpiecod_Jsonclick ;
   private String edtavKilos_Jsonclick ;
   private String edtavDifkilos_Jsonclick ;
   private String edtavMetros_Jsonclick ;
   private String edtavDifmetros_Jsonclick ;
   private String edtavBarpiecoddestino_Jsonclick ;
   private String edtavBarpieloc_Jsonclick ;
   private String subGrid_Header ;
   private String ZhV49CodCausa ;
   private String ZhV50Rps_Cod ;
   private String ZhV51Opecod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private boolean n653OpeNom ;
   private boolean n2186BarPieLoc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
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
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbavTiporeoperado ;
   private IDataStoreProvider pr_default ;
   private String[] H00EE2_A5086DscCausa ;
   private boolean[] H00EE2_n5086DscCausa ;
   private String[] H00EE3_A7001Rps_Dsc ;
   private boolean[] H00EE3_n7001Rps_Dsc ;
   private String[] H00EE4_A653OpeNom ;
   private boolean[] H00EE4_n653OpeNom ;
   private String[] H00EE5_A5086DscCausa ;
   private boolean[] H00EE5_n5086DscCausa ;
   private String[] H00EE5_A396EmprCod ;
   private short[] H00EE5_A5085CodCausa ;
   private String[] H00EE6_A7001Rps_Dsc ;
   private boolean[] H00EE6_n7001Rps_Dsc ;
   private String[] H00EE6_A396EmprCod ;
   private short[] H00EE6_A7000Rps_Cod ;
   private String[] H00EE7_A653OpeNom ;
   private boolean[] H00EE7_n653OpeNom ;
   private String[] H00EE7_A396EmprCod ;
   private int[] H00EE7_A652OpeCod ;
   private String[] H00EE8_A5086DscCausa ;
   private boolean[] H00EE8_n5086DscCausa ;
   private String[] H00EE8_A396EmprCod ;
   private short[] H00EE8_A5085CodCausa ;
   private String[] H00EE9_A7001Rps_Dsc ;
   private boolean[] H00EE9_n7001Rps_Dsc ;
   private String[] H00EE9_A396EmprCod ;
   private short[] H00EE9_A7000Rps_Cod ;
   private String[] H00EE10_A653OpeNom ;
   private boolean[] H00EE10_n653OpeNom ;
   private String[] H00EE10_A396EmprCod ;
   private int[] H00EE10_A652OpeCod ;
   private byte[] H00EE11_A201BarPieEst ;
   private String[] H00EE11_A130BarCodPar ;
   private byte[] H00EE11_A132BarCodReo ;
   private int[] H00EE11_A129BarCod ;
   private String[] H00EE11_A396EmprCod ;
   private java.math.BigDecimal[] H00EE11_A170BarKilLan ;
   private java.math.BigDecimal[] H00EE11_A203BarPieKil ;
   private java.math.BigDecimal[] H00EE11_A183BarMetLan ;
   private java.math.BigDecimal[] H00EE11_A205BarPieMet ;
   private String[] H00EE11_A2186BarPieLoc ;
   private boolean[] H00EE11_n2186BarPieLoc ;
   private String[] H00EE11_A200BarPieCod ;
   private String[] H00EE12_A5086DscCausa ;
   private boolean[] H00EE12_n5086DscCausa ;
   private String[] H00EE12_A396EmprCod ;
   private short[] H00EE12_A5085CodCausa ;
   private String[] H00EE13_A7001Rps_Dsc ;
   private boolean[] H00EE13_n7001Rps_Dsc ;
   private String[] H00EE13_A396EmprCod ;
   private short[] H00EE13_A7000Rps_Cod ;
   private String[] H00EE14_A653OpeNom ;
   private boolean[] H00EE14_n653OpeNom ;
   private String[] H00EE14_A396EmprCod ;
   private int[] H00EE14_A652OpeCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwreopie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00EE2", "SELECT * FROM (SELECT DISTINCT DscCausa FROM TXPTIPCAU WHERE UPPER(DscCausa) like '%' || UPPER(?) ORDER BY DscCausa) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE3", "SELECT * FROM (SELECT DISTINCT Rps_Dsc FROM TXPCODRPS WHERE UPPER(Rps_Dsc) like '%' || UPPER(?) ORDER BY Rps_Dsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE4", "SELECT * FROM (SELECT DISTINCT OpeNom FROM TXPOPERAR WHERE UPPER(OpeNom) like '%' || UPPER(?) ORDER BY OpeNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE5", "SELECT DscCausa, EmprCod, CodCausa FROM TXPTIPCAU WHERE DscCausa = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE6", "SELECT Rps_Dsc, EmprCod, Rps_Cod FROM TXPCODRPS WHERE Rps_Dsc = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE7", "SELECT OpeNom, EmprCod, OpeCod FROM TXPOPERAR WHERE OpeNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE8", "SELECT DscCausa, EmprCod, CodCausa FROM TXPTIPCAU WHERE DscCausa = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE9", "SELECT Rps_Dsc, EmprCod, Rps_Cod FROM TXPCODRPS WHERE Rps_Dsc = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE10", "SELECT OpeNom, EmprCod, OpeCod FROM TXPOPERAR WHERE OpeNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE11", "SELECT BarPieEst, BarCodPar, BarCodReo, BarCod, EmprCod, BarKilLan, BarPieKil, BarMetLan, BarPieMet, BarPieLoc, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE12", "SELECT DscCausa, EmprCod, CodCausa FROM TXPTIPCAU WHERE DscCausa = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE13", "SELECT Rps_Dsc, EmprCod, Rps_Cod FROM TXPCODRPS WHERE Rps_Dsc = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EE14", "SELECT OpeNom, EmprCod, OpeCod FROM TXPOPERAR WHERE OpeNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               stmt.setString(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 30);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
      }
   }

}

