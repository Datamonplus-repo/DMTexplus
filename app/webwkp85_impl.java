package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwkp85_impl extends GXDataArea
{
   public webwkp85_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwkp85_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwkp85_impl.class ));
   }

   public webwkp85_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavHisadesn = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPDEFCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipdefcodDV0( A396EmprCod, A13819TipdefDscI) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCODCAUSA") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13816DscCausaID = httpContext.GetPar( "DscCausaID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcodcausaDV0( A396EmprCod, A13816DscCausaID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vRPS_COD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13817Rps_DscID = httpContext.GetPar( "Rps_DscID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvrps_codDV0( A396EmprCod, A13817Rps_DscID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodDV0( A396EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vHISOPECOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvhisopecodDV0( A396EmprCod, A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vHISOPERAR") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvhisoperarDV0( A396EmprCod, A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPDEFCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipdefcodDV0( A396EmprCod, A13819TipdefDscI) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPDEFCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV33TipDefCod = httpContext.GetPar( "hV33TipDefCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipdefcodDV2( A396EmprCod, hV33TipDefCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCODCAUSA") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13816DscCausaID = httpContext.GetPar( "DscCausaID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcodcausaDV0( A396EmprCod, A13816DscCausaID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCODCAUSA") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV7CodCausa = httpContext.GetPar( "hV7CodCausa") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvcodcausaDV2( A396EmprCod, hV7CodCausa) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vRPS_COD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13817Rps_DscID = httpContext.GetPar( "Rps_DscID") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvrps_codDV0( A396EmprCod, A13817Rps_DscID) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vRPS_COD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV28Rps_Cod = httpContext.GetPar( "hV28Rps_Cod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvrps_codDV2( A396EmprCod, hV28Rps_Cod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodDV0( A396EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV22MaqCod = httpContext.GetPar( "hV22MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodDV2( A396EmprCod, hV22MaqCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vHISOPECOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvhisopecodDV0( A396EmprCod, A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vHISOPECOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV19HisOpecod = httpContext.GetPar( "hV19HisOpecod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvhisopecodDV2( A396EmprCod, hV19HisOpecod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vHISOPERAR") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvhisoperarDV0( A396EmprCod, A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vHISOPERAR") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            hV20Hisoperar = httpContext.GetPar( "hV20Hisoperar") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvhisoperarDV2( A396EmprCod, hV20Hisoperar) ;
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A539HisBarCod = (int)(GXutil.lval( httpContext.GetPar( "HisBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
               A545HisCodReo = (byte)(GXutil.lval( httpContext.GetPar( "HisCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
               A544HisCodPar = httpContext.GetPar( "HisCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
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
      paDV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDV2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwkp85", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar))}, new String[] {"EmprCod","HisBarCod","HisCodReo","HisCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43oldCausa), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44oldRps_cod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47oldHisOpecod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPERAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46OldHisOperar), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45oldMaqcod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "HISBARCOD", GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISCODREO", GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISCODPAR", GXutil.rtrim( A544HisCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDEFCODOLD", GXutil.ltrim( localUtil.ntoc( AV34Tipdefcodold, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV40Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCAUSA", GXutil.ltrim( localUtil.ntoc( AV43oldCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43oldCausa), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDRPS_COD", GXutil.ltrim( localUtil.ntoc( AV44oldRps_cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44oldRps_cod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDHISOPECOD", GXutil.ltrim( localUtil.ntoc( AV47oldHisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47oldHisOpecod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV25Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDHISOPERAR", GXutil.ltrim( localUtil.ntoc( AV46OldHisOperar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPERAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46OldHisOperar), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMAQCOD", GXutil.rtrim( AV45oldMaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45oldMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( AV33TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCODCAUSA", GXutil.ltrim( localUtil.ntoc( AV7CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvRPS_COD", GXutil.ltrim( localUtil.ntoc( AV28Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV22MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvHISOPECOD", GXutil.ltrim( localUtil.ntoc( AV19HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvHISOPERAR", GXutil.ltrim( localUtil.ntoc( AV20Hisoperar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISMTSIMP", GXutil.ltrim( localUtil.ntoc( A13016HisMtsImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISMTSCARG", GXutil.ltrim( localUtil.ntoc( A13015HisMtsCarg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRECARG", GXutil.ltrim( localUtil.ntoc( A13017HisPreCarg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Width", GXutil.rtrim( Dvpanel_pnl1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autowidth", GXutil.booltostr( Dvpanel_pnl1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoheight", GXutil.booltostr( Dvpanel_pnl1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Cls", GXutil.rtrim( Dvpanel_pnl1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Title", GXutil.rtrim( Dvpanel_pnl1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsible", GXutil.booltostr( Dvpanel_pnl1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsed", GXutil.booltostr( Dvpanel_pnl1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Iconposition", GXutil.rtrim( Dvpanel_pnl1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoscroll", GXutil.booltostr( Dvpanel_pnl1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
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
         weDV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDV2( ) ;
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
      return formatLink("app.webwkp85", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar))}, new String[] {"EmprCod","HisBarCod","HisCodReo","HisCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "WebWkp85" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documentacion", "") ;
   }

   public void wbDV0( )
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
         /* User Defined Control */
         ucDvpanel_pnl1.setProperty("Width", Dvpanel_pnl1_Width);
         ucDvpanel_pnl1.setProperty("AutoWidth", Dvpanel_pnl1_Autowidth);
         ucDvpanel_pnl1.setProperty("AutoHeight", Dvpanel_pnl1_Autoheight);
         ucDvpanel_pnl1.setProperty("Cls", Dvpanel_pnl1_Cls);
         ucDvpanel_pnl1.setProperty("Title", Dvpanel_pnl1_Title);
         ucDvpanel_pnl1.setProperty("Collapsible", Dvpanel_pnl1_Collapsible);
         ucDvpanel_pnl1.setProperty("Collapsed", Dvpanel_pnl1_Collapsed);
         ucDvpanel_pnl1.setProperty("ShowCollapseIcon", Dvpanel_pnl1_Showcollapseicon);
         ucDvpanel_pnl1.setProperty("IconPosition", Dvpanel_pnl1_Iconposition);
         ucDvpanel_pnl1.setProperty("AutoScroll", Dvpanel_pnl1_Autoscroll);
         ucDvpanel_pnl1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl1_Internalname, "DVPANEL_PNL1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL1Container"+"pnl1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPnl1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisacco_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisacco_Internalname, httpContext.getMessage( "Correccion a efectuar, Accion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisacco_Internalname, AV11HisAcCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", (short)(0), 1, edtavHisacco_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3276", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisaccot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisaccot_Internalname, httpContext.getMessage( "Acciones Correctivas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisaccot_Internalname, AV12HisAcCot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), 1, edtavHisaccot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebWkp85.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTblanalisis_Internalname, divTblanalisis_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHisadeacco_cell_Internalname, 1, 0, "px", 0, "px", divHisadeacco_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavHisadeacco_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisadeacco_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisadeacco_Internalname, httpContext.getMessage( "Acciones de correccion,Analisis", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisadeacco_Internalname, AV13HisAdEAcCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", (short)(0), edtavHisadeacco_Visible, edtavHisadeacco_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHisadeacct_cell_Internalname, 1, 0, "px", 0, "px", divHisadeacct_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavHisadeacct_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisadeacct_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisadeacct_Internalname, httpContext.getMessage( "Acciones correctivas,Analisis", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisadeacct_Internalname, AV14HisAdEAcCt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", (short)(0), edtavHisadeacct_Visible, edtavHisadeacct_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebWkp85.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipdefcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipdefcod_Internalname, httpContext.getMessage( "Defecto", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefcod_Internalname, hV33TipDefCod, GXutil.rtrim( localUtil.format( hV33TipDefCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdefcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipdefcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCodcausa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCodcausa_Internalname, httpContext.getMessage( "Causa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCodcausa_Internalname, hV7CodCausa, GXutil.rtrim( localUtil.format( hV7CodCausa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCodcausa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCodcausa_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRps_cod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRps_cod_Internalname, httpContext.getMessage( "Responsabilidad", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRps_cod_Internalname, hV28Rps_Cod, GXutil.rtrim( localUtil.format( hV28Rps_Cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRps_cod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRps_cod_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWkp85.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV22MaqCod, GXutil.rtrim( localUtil.format( hV22MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisopecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisopecod_Internalname, httpContext.getMessage( "Operario", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisopecod_Internalname, hV19HisOpecod, GXutil.rtrim( localUtil.format( hV19HisOpecod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisopecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisopecod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisopetur_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisopetur_Internalname, httpContext.getMessage( "Turno", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisopetur_Internalname, GXutil.ltrim( localUtil.ntoc( AV21Hisopetur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisopetur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21Hisopetur), "9") : localUtil.format( DecimalUtil.doubleToDec(AV21Hisopetur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisopetur_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisopetur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWkp85.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavHisadesn.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavHisadesn.getInternalname(), httpContext.getMessage( "Resultado Eficaz?", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavHisadesn.getInternalname(), AV16HisAdeSN, "", httpContext.getMessage( "Resultado Eficaz?", ""), 1, chkavHisadesn.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(83, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,83);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisoperar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisoperar_Internalname, httpContext.getMessage( "Responsable", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisoperar_Internalname, hV20Hisoperar, GXutil.rtrim( localUtil.format( hV20Hisoperar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisoperar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisoperar_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWkp85.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisadeobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisadeobs_Internalname, httpContext.getMessage( "Observaciones", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisadeobs_Internalname, AV15HisAdeObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", (short)(0), 1, edtavHisadeobs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebWkp85.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable3_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable3_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divHismtscargo_cell_Internalname, 1, 0, "px", 0, "px", divHismtscargo_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavHismtscargo_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHismtscargo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHismtscargo_Internalname, httpContext.getMessage( "Metros Cargo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHismtscargo_Internalname, GXutil.ltrim( localUtil.ntoc( AV17HisMtsCargo, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHismtscargo_Enabled!=0) ? localUtil.format( AV17HisMtsCargo, "ZZZZZ9.99") : localUtil.format( AV17HisMtsCargo, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHismtscargo_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavHismtscargo_Visible, edtavHismtscargo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHismtsimp_cell_Internalname, 1, 0, "px", 0, "px", divHismtsimp_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavHismtsimp_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHismtsimp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHismtsimp_Internalname, httpContext.getMessage( "Importe Cargo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHismtsimp_Internalname, GXutil.ltrim( localUtil.ntoc( AV18HisMtsImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHismtsimp_Enabled!=0) ? localUtil.format( AV18HisMtsImp, "ZZZZZZZZZZ9.99") : localUtil.format( AV18HisMtsImp, "ZZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHismtsimp_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavHismtsimp_Visible, edtavHismtsimp_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTitprecio_cell_Internalname, 1, 0, "px", 0, "px", divTitprecio_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavTitprecio_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTitprecio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTitprecio_Internalname, httpContext.getMessage( "Precio", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTitprecio_Internalname, GXutil.rtrim( AV37TitPrecio), GXutil.rtrim( localUtil.format( AV37TitPrecio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTitprecio_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavTitprecio_Visible, edtavTitprecio_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWkp85.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11dv1_client"+"'", TempTags, "", 2, "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWkp85.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         wb_table1_132_DV2( true) ;
      }
      else
      {
         wb_table1_132_DV2( false) ;
      }
      return  ;
   }

   public void wb_table1_132_DV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startDV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documentacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDV0( ) ;
   }

   public void wsDV2( )
   {
      startDV2( ) ;
      evtDV2( ) ;
   }

   public void evtDV2( )
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
                           e12DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e13DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e14DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e15DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPDEFCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCODCAUSA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRPS_COD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHISOPECOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHISOPERAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21DV2 ();
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weDV2( )
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

   public void paDV2( )
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
            GX_FocusControl = edtavHisacco_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvtipdefcodDV0( String A396EmprCod ,
                                   String A13819TipdefDscI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipdefcod_dataDV0( A396EmprCod, A13819TipdefDscI) ;
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

   protected void gxsgvvtipdefcod_dataDV0( String A396EmprCod ,
                                           String A13819TipdefDscI )
   {
      l13819TipdefDscI = GXutil.concat( GXutil.rtrim( A13819TipdefDscI), "%", "") ;
      /* Using cursor H00DV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13819TipdefDscI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DV2_A13819TipdefDscI[0]);
         gxdynajaxctrldescr.add(H00DV2_A13819TipdefDscI[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvcodcausaDV0( String A396EmprCod ,
                                  String A13816DscCausaID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvcodcausa_dataDV0( A396EmprCod, A13816DscCausaID) ;
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

   protected void gxsgvvcodcausa_dataDV0( String A396EmprCod ,
                                          String A13816DscCausaID )
   {
      l13816DscCausaID = GXutil.concat( GXutil.rtrim( A13816DscCausaID), "%", "") ;
      /* Using cursor H00DV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13816DscCausaID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DV3_A13816DscCausaID[0]);
         gxdynajaxctrldescr.add(H00DV3_A13816DscCausaID[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvrps_codDV0( String A396EmprCod ,
                                 String A13817Rps_DscID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvrps_cod_dataDV0( A396EmprCod, A13817Rps_DscID) ;
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

   protected void gxsgvvrps_cod_dataDV0( String A396EmprCod ,
                                         String A13817Rps_DscID )
   {
      l13817Rps_DscID = GXutil.concat( GXutil.rtrim( A13817Rps_DscID), "%", "") ;
      /* Using cursor H00DV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, l13817Rps_DscID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DV4_A13817Rps_DscID[0]);
         gxdynajaxctrldescr.add(H00DV4_A13817Rps_DscID[0]);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvmaqcodDV0( String A396EmprCod ,
                                String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_dataDV0( A396EmprCod, A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcod_dataDV0( String A396EmprCod ,
                                        String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H00DV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DV5_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H00DV5_A13734MaqCDsc[0]);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgvvhisopecodDV0( String A396EmprCod ,
                                   String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvhisopecod_dataDV0( A396EmprCod, A13748OpeCNom) ;
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

   protected void gxsgvvhisopecod_dataDV0( String A396EmprCod ,
                                           String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor H00DV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DV6_A13748OpeCNom[0]);
         gxdynajaxctrldescr.add(H00DV6_A13748OpeCNom[0]);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxsgvvhisoperarDV0( String A396EmprCod ,
                                   String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvhisoperar_dataDV0( A396EmprCod, A13748OpeCNom) ;
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

   protected void gxsgvvhisoperar_dataDV0( String A396EmprCod ,
                                           String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor H00DV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxdynajaxctrlcodr.add(H00DV7_A13748OpeCNom[0]);
         gxdynajaxctrldescr.add(H00DV7_A13748OpeCNom[0]);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxhcvvtipdefcodDV2( String A396EmprCod ,
                                   String A13819TipdefDscI )
   {
      /* Using cursor H00DV8 */
      pr_default.execute(6, new Object[] {A13819TipdefDscI, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13819TipdefDscI = H00DV8_A13819TipdefDscI[0] ;
         A396EmprCod = H00DV8_A396EmprCod[0] ;
         A833TipDefCod = H00DV8_A833TipDefCod[0] ;
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(6);
   }

   public void gxhcvvcodcausaDV2( String A396EmprCod ,
                                  String A13816DscCausaID )
   {
      /* Using cursor H00DV9 */
      pr_default.execute(7, new Object[] {A13816DscCausaID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13816DscCausaID = H00DV9_A13816DscCausaID[0] ;
         A396EmprCod = H00DV9_A396EmprCod[0] ;
         A5085CodCausa = H00DV9_A5085CodCausa[0] ;
         n5085CodCausa = H00DV9_n5085CodCausa[0] ;
         pr_default.readNext(7);
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
      pr_default.close(7);
   }

   public void gxhcvvrps_codDV2( String A396EmprCod ,
                                 String A13817Rps_DscID )
   {
      /* Using cursor H00DV10 */
      pr_default.execute(8, new Object[] {A13817Rps_DscID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13817Rps_DscID = H00DV10_A13817Rps_DscID[0] ;
         A396EmprCod = H00DV10_A396EmprCod[0] ;
         A7000Rps_Cod = H00DV10_A7000Rps_Cod[0] ;
         n7000Rps_Cod = H00DV10_n7000Rps_Cod[0] ;
         pr_default.readNext(8);
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
      pr_default.close(8);
   }

   public void gxhcvvmaqcodDV2( String A396EmprCod ,
                                String A13734MaqCDsc )
   {
      /* Using cursor H00DV11 */
      pr_default.execute(9, new Object[] {A13734MaqCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H00DV11_A13734MaqCDsc[0] ;
         A396EmprCod = H00DV11_A396EmprCod[0] ;
         A602MaqCod = H00DV11_A602MaqCod[0] ;
         n602MaqCod = H00DV11_n602MaqCod[0] ;
         pr_default.readNext(9);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      pr_default.close(9);
   }

   public void gxhcvvhisopecodDV2( String A396EmprCod ,
                                   String A13748OpeCNom )
   {
      /* Using cursor H00DV12 */
      pr_default.execute(10, new Object[] {A13748OpeCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(10) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13748OpeCNom = H00DV12_A13748OpeCNom[0] ;
         A396EmprCod = H00DV12_A396EmprCod[0] ;
         A652OpeCod = H00DV12_A652OpeCod[0] ;
         pr_default.readNext(10);
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
      pr_default.close(10);
   }

   public void gxhcvvhisoperarDV2( String A396EmprCod ,
                                   String A13748OpeCNom )
   {
      /* Using cursor H00DV13 */
      pr_default.execute(11, new Object[] {A13748OpeCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(11) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13748OpeCNom = H00DV13_A13748OpeCNom[0] ;
         A396EmprCod = H00DV13_A396EmprCod[0] ;
         A652OpeCod = H00DV13_A652OpeCod[0] ;
         pr_default.readNext(11);
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
      pr_default.close(11);
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
      AV16HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( AV16HisAdeSN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfDV2( ) ;
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
   }

   public void rfDV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00DV14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A5662HisAcCo = H00DV14_A5662HisAcCo[0] ;
            n5662HisAcCo = H00DV14_n5662HisAcCo[0] ;
            A5693HisAcCot = H00DV14_A5693HisAcCot[0] ;
            n5693HisAcCot = H00DV14_n5693HisAcCot[0] ;
            A5694HisAdEAcCo = H00DV14_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = H00DV14_n5694HisAdEAcCo[0] ;
            A5695HisAdEAcCt = H00DV14_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = H00DV14_n5695HisAdEAcCt[0] ;
            A6669HisAdeObs = H00DV14_A6669HisAdeObs[0] ;
            n6669HisAdeObs = H00DV14_n6669HisAdeObs[0] ;
            A833TipDefCod = H00DV14_A833TipDefCod[0] ;
            A834TipDefDsc = H00DV14_A834TipDefDsc[0] ;
            n834TipDefDsc = H00DV14_n834TipDefDsc[0] ;
            A5085CodCausa = H00DV14_A5085CodCausa[0] ;
            n5085CodCausa = H00DV14_n5085CodCausa[0] ;
            A5086DscCausa = H00DV14_A5086DscCausa[0] ;
            n5086DscCausa = H00DV14_n5086DscCausa[0] ;
            A12949HisOpecod = H00DV14_A12949HisOpecod[0] ;
            n12949HisOpecod = H00DV14_n12949HisOpecod[0] ;
            A12950HisOpeTur = H00DV14_A12950HisOpeTur[0] ;
            n12950HisOpeTur = H00DV14_n12950HisOpeTur[0] ;
            A7000Rps_Cod = H00DV14_A7000Rps_Cod[0] ;
            n7000Rps_Cod = H00DV14_n7000Rps_Cod[0] ;
            A7001Rps_Dsc = H00DV14_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H00DV14_n7001Rps_Dsc[0] ;
            A602MaqCod = H00DV14_A602MaqCod[0] ;
            n602MaqCod = H00DV14_n602MaqCod[0] ;
            A5356Hisoperar = H00DV14_A5356Hisoperar[0] ;
            n5356Hisoperar = H00DV14_n5356Hisoperar[0] ;
            A13015HisMtsCarg = H00DV14_A13015HisMtsCarg[0] ;
            n13015HisMtsCarg = H00DV14_n13015HisMtsCarg[0] ;
            A13016HisMtsImp = H00DV14_A13016HisMtsImp[0] ;
            n13016HisMtsImp = H00DV14_n13016HisMtsImp[0] ;
            A834TipDefDsc = H00DV14_A834TipDefDsc[0] ;
            n834TipDefDsc = H00DV14_n834TipDefDsc[0] ;
            A5086DscCausa = H00DV14_A5086DscCausa[0] ;
            n5086DscCausa = H00DV14_n5086DscCausa[0] ;
            A7001Rps_Dsc = H00DV14_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H00DV14_n7001Rps_Dsc[0] ;
            if ( A13015HisMtsCarg.doubleValue() > 0 )
            {
               A13017HisPreCarg = GXutil.roundDecimal( A13016HisMtsImp.divide(A13015HisMtsCarg, 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
            }
            else
            {
               if ( true )
               {
                  A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
               }
               else
               {
                  A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
               }
            }
            /* Execute user event: Load */
            e15DV2 ();
            pr_default.readNext(12);
         }
         pr_default.close(12);
         wbDV0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCAUSA", GXutil.ltrim( localUtil.ntoc( AV43oldCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43oldCausa), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDRPS_COD", GXutil.ltrim( localUtil.ntoc( AV44oldRps_cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44oldRps_cod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDHISOPECOD", GXutil.ltrim( localUtil.ntoc( AV47oldHisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47oldHisOpecod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDHISOPERAR", GXutil.ltrim( localUtil.ntoc( AV46OldHisOperar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPERAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46OldHisOperar), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMAQCOD", GXutil.rtrim( AV45oldMaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45oldMaqcod, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13DV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_pnl1_Width = httpContext.cgiGet( "DVPANEL_PNL1_Width") ;
         Dvpanel_pnl1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autowidth")) ;
         Dvpanel_pnl1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoheight")) ;
         Dvpanel_pnl1_Cls = httpContext.cgiGet( "DVPANEL_PNL1_Cls") ;
         Dvpanel_pnl1_Title = httpContext.cgiGet( "DVPANEL_PNL1_Title") ;
         Dvpanel_pnl1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsible")) ;
         Dvpanel_pnl1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsed")) ;
         Dvpanel_pnl1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Showcollapseicon")) ;
         Dvpanel_pnl1_Iconposition = httpContext.cgiGet( "DVPANEL_PNL1_Iconposition") ;
         Dvpanel_pnl1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoscroll")) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         AV11HisAcCo = httpContext.cgiGet( edtavHisacco_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisAcCo", AV11HisAcCo);
         AV12HisAcCot = httpContext.cgiGet( edtavHisaccot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12HisAcCot", AV12HisAcCot);
         AV13HisAdEAcCo = httpContext.cgiGet( edtavHisadeacco_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13HisAdEAcCo", AV13HisAdEAcCo);
         AV14HisAdEAcCt = httpContext.cgiGet( edtavHisadeacct_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14HisAdEAcCt", AV14HisAdEAcCt);
         hV33TipDefCod = httpContext.cgiGet( edtavTipdefcod_Internalname) ;
         if ( (GXutil.strcmp("", hV33TipDefCod)==0) )
         {
            AV33TipDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
         }
         else
         {
            A13819TipdefDscI = hV33TipDefCod ;
            /* Using cursor H00DV15 */
            pr_default.execute(13, new Object[] {A13819TipdefDscI, A396EmprCod});
            AV33TipDefCod = H00DV15_A833TipDefCod[0] ;
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               pr_default.readNext(13);
               if ( ! ( (pr_default.getStatus(13) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vTIPDEFCOD");
                  GX_FocusControl = edtavTipdefcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(13);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV33TipDefCod", hV33TipDefCod);
         hV7CodCausa = httpContext.cgiGet( edtavCodcausa_Internalname) ;
         if ( (GXutil.strcmp("", hV7CodCausa)==0) )
         {
            AV7CodCausa = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
         }
         else
         {
            A13816DscCausaID = hV7CodCausa ;
            /* Using cursor H00DV16 */
            pr_default.execute(14, new Object[] {A13816DscCausaID, A396EmprCod});
            AV7CodCausa = H00DV16_A5085CodCausa[0] ;
            n5085CodCausa = H00DV16_n5085CodCausa[0] ;
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               pr_default.readNext(14);
               if ( ! ( (pr_default.getStatus(14) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vCODCAUSA");
                  GX_FocusControl = edtavCodcausa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(14);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV7CodCausa", hV7CodCausa);
         hV28Rps_Cod = httpContext.cgiGet( edtavRps_cod_Internalname) ;
         if ( (GXutil.strcmp("", hV28Rps_Cod)==0) )
         {
            AV28Rps_Cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
         }
         else
         {
            A13817Rps_DscID = hV28Rps_Cod ;
            /* Using cursor H00DV17 */
            pr_default.execute(15, new Object[] {A13817Rps_DscID, A396EmprCod});
            AV28Rps_Cod = H00DV17_A7000Rps_Cod[0] ;
            n7000Rps_Cod = H00DV17_n7000Rps_Cod[0] ;
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               pr_default.readNext(15);
               if ( ! ( (pr_default.getStatus(15) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vRPS_COD");
                  GX_FocusControl = edtavRps_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(15);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV28Rps_Cod", hV28Rps_Cod);
         hV22MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV22MaqCod)==0) )
         {
            AV22MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV22MaqCod ;
            /* Using cursor H00DV18 */
            pr_default.execute(16, new Object[] {A13734MaqCDsc, A396EmprCod});
            AV22MaqCod = H00DV18_A602MaqCod[0] ;
            n602MaqCod = H00DV18_n602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               pr_default.readNext(16);
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(16);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV22MaqCod", hV22MaqCod);
         hV19HisOpecod = httpContext.cgiGet( edtavHisopecod_Internalname) ;
         if ( (GXutil.strcmp("", hV19HisOpecod)==0) )
         {
            AV19HisOpecod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
         }
         else
         {
            A13748OpeCNom = hV19HisOpecod ;
            /* Using cursor H00DV19 */
            pr_default.execute(17, new Object[] {A13748OpeCNom, A396EmprCod});
            AV19HisOpecod = H00DV19_A652OpeCod[0] ;
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               pr_default.readNext(17);
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vHISOPECOD");
                  GX_FocusControl = edtavHisopecod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(17);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV19HisOpecod", hV19HisOpecod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISOPETUR");
            GX_FocusControl = edtavHisopetur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Hisopetur = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
         }
         else
         {
            AV21Hisopetur = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
         }
         AV16HisAdeSN = ((GXutil.strcmp(httpContext.cgiGet( chkavHisadesn.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
         hV20Hisoperar = httpContext.cgiGet( edtavHisoperar_Internalname) ;
         if ( (GXutil.strcmp("", hV20Hisoperar)==0) )
         {
            AV20Hisoperar = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
         }
         else
         {
            A13748OpeCNom = hV20Hisoperar ;
            /* Using cursor H00DV20 */
            pr_default.execute(18, new Object[] {A13748OpeCNom, A396EmprCod});
            AV20Hisoperar = H00DV20_A652OpeCod[0] ;
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               pr_default.readNext(18);
               if ( ! ( (pr_default.getStatus(18) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vHISOPERAR");
                  GX_FocusControl = edtavHisoperar_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(18);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV20Hisoperar", hV20Hisoperar);
         AV15HisAdeObs = httpContext.cgiGet( edtavHisadeobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15HisAdeObs", AV15HisAdeObs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHismtscargo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHismtscargo_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISMTSCARGO");
            GX_FocusControl = edtavHismtscargo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17HisMtsCargo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
         }
         else
         {
            AV17HisMtsCargo = localUtil.ctond( httpContext.cgiGet( edtavHismtscargo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHismtsimp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHismtsimp_Internalname)), DecimalUtil.stringToDec("99999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISMTSIMP");
            GX_FocusControl = edtavHismtsimp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18HisMtsImp = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
         }
         else
         {
            AV18HisMtsImp = localUtil.ctond( httpContext.cgiGet( edtavHismtsimp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
         }
         AV37TitPrecio = httpContext.cgiGet( edtavTitprecio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37TitPrecio", AV37TitPrecio);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e13DV2 ();
      if (returnInSub) return;
   }

   public void e13DV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV5acabats ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int2) ;
      webwkp85_impl.this.GXt_int1 = GXv_int2[0] ;
      AV5acabats = GXt_int1 ;
      GXt_int1 = AV6carvitin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int2) ;
      webwkp85_impl.this.GXt_int1 = GXv_int2[0] ;
      AV6carvitin = GXt_int1 ;
      GXt_char3 = AV30Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwkp85_impl.this.GXt_char3 = GXv_char4[0] ;
      AV30Station = GXt_char3 ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_char5[0] = AV10EmprNom ;
      GXv_char6[0] = AV38UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char4, GXv_char5, GXv_char6) ;
      webwkp85_impl.this.AV9EmprCod = GXv_char4[0] ;
      webwkp85_impl.this.AV10EmprNom = GXv_char5[0] ;
      webwkp85_impl.this.AV38UsurCod = GXv_char6[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
   }

   public void e12DV2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, httpContext.getMessage( "Yes", "")) == 0 )
      {
         GXv_char6[0] = AV35TipDefDsc ;
         GXv_char5[0] = AV40Ok ;
         new app.existedefectotipdef(remoteHandle, context).execute( A396EmprCod, AV33TipDefCod, GXv_char6, GXv_char5) ;
         webwkp85_impl.this.AV35TipDefDsc = GXv_char6[0] ;
         webwkp85_impl.this.AV40Ok = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
         if ( (0==AV33TipDefCod) || ( ( AV33TipDefCod > 0 ) && ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Defecto", ""));
            GX_FocusControl = edtavTipdefcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char6[0] = AV41DscCausa ;
            GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char5[0] = AV40Ok ;
            new app.existecausatipcau(remoteHandle, context).execute( A396EmprCod, AV7CodCausa, GXv_char6, GXv_decimal7, GXv_char5) ;
            webwkp85_impl.this.AV41DscCausa = GXv_char6[0] ;
            webwkp85_impl.this.AV40Ok = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
            if ( ( AV7CodCausa > 0 ) && ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Causa", ""));
               GX_FocusControl = edtavCodcausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXv_char6[0] = AV29Rps_Dsc ;
               GXv_char5[0] = AV40Ok ;
               new app.existeresponsabilidadcodrps(remoteHandle, context).execute( A396EmprCod, AV28Rps_Cod, GXv_char6, GXv_char5) ;
               webwkp85_impl.this.AV29Rps_Dsc = GXv_char6[0] ;
               webwkp85_impl.this.AV40Ok = GXv_char5[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
               if ( ( AV28Rps_Cod > 0 ) && ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Responsabilidad", ""));
                  GX_FocusControl = edtavRps_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  AV25Opecod = AV19HisOpecod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Opecod), 6, 0));
                  GXv_char6[0] = AV42Openom ;
                  GXv_char5[0] = AV40Ok ;
                  new app.existeopeariooperar(remoteHandle, context).execute( A396EmprCod, AV25Opecod, GXv_char6, GXv_char5) ;
                  webwkp85_impl.this.AV42Openom = GXv_char6[0] ;
                  webwkp85_impl.this.AV40Ok = GXv_char5[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
                  if ( ( AV19HisOpecod > 0 ) && ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 ) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Operario", ""));
                     GX_FocusControl = edtavHisopecod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     AV25Opecod = AV20Hisoperar ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Opecod), 6, 0));
                     GXv_char6[0] = AV42Openom ;
                     GXv_char5[0] = AV40Ok ;
                     new app.existeopeariooperar(remoteHandle, context).execute( A396EmprCod, AV25Opecod, GXv_char6, GXv_char5) ;
                     webwkp85_impl.this.AV42Openom = GXv_char6[0] ;
                     webwkp85_impl.this.AV40Ok = GXv_char5[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
                     if ( ( AV20Hisoperar > 0 ) && ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 ) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Responsable", ""));
                        GX_FocusControl = edtavHisoperar_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        GXv_char6[0] = AV23MaqDsc ;
                        GXv_char5[0] = AV40Ok ;
                        new app.existemaquinamaquin(remoteHandle, context).execute( A396EmprCod, AV22MaqCod, GXv_char6, GXv_char5) ;
                        webwkp85_impl.this.AV23MaqDsc = GXv_char6[0] ;
                        webwkp85_impl.this.AV40Ok = GXv_char5[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
                        if ( ! (GXutil.strcmp("", AV22MaqCod)==0) && ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 ) )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Maquina", ""));
                           GX_FocusControl = edtavMaqcod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           GXv_char6[0] = A396EmprCod ;
                           GXv_int8[0] = A539HisBarCod ;
                           GXv_int2[0] = A545HisCodReo ;
                           GXv_char5[0] = A544HisCodPar ;
                           GXv_int9[0] = AV34Tipdefcodold ;
                           GXv_char4[0] = httpContext.getMessage( "UDP", "") ;
                           new app.pprc163(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int2, GXv_char5, GXv_int9, GXv_char4) ;
                           webwkp85_impl.this.A396EmprCod = GXv_char6[0] ;
                           webwkp85_impl.this.A539HisBarCod = GXv_int8[0] ;
                           webwkp85_impl.this.A545HisCodReo = GXv_int2[0] ;
                           webwkp85_impl.this.A544HisCodPar = GXv_char5[0] ;
                           webwkp85_impl.this.AV34Tipdefcodold = GXv_int9[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV34Tipdefcodold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tipdefcodold), 4, 0));
                           GXv_char6[0] = A396EmprCod ;
                           GXv_int8[0] = A539HisBarCod ;
                           GXv_int2[0] = A545HisCodReo ;
                           GXv_char5[0] = A544HisCodPar ;
                           GXv_int9[0] = AV7CodCausa ;
                           GXv_char4[0] = AV11HisAcCo ;
                           GXv_char10[0] = AV12HisAcCot ;
                           GXv_char11[0] = AV13HisAdEAcCo ;
                           GXv_char12[0] = AV14HisAdEAcCt ;
                           GXv_char13[0] = AV15HisAdeObs ;
                           GXv_int14[0] = AV19HisOpecod ;
                           GXv_int15[0] = AV20Hisoperar ;
                           GXv_int16[0] = AV21Hisopetur ;
                           GXv_char17[0] = AV22MaqCod ;
                           GXv_int18[0] = AV28Rps_Cod ;
                           GXv_int19[0] = AV33TipDefCod ;
                           GXv_char20[0] = AV16HisAdeSN ;
                           GXv_decimal7[0] = AV17HisMtsCargo ;
                           GXv_decimal21[0] = AV18HisMtsImp ;
                           new app.pprc162(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int2, GXv_char5, GXv_int9, GXv_char4, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_char17, GXv_int18, GXv_int19, GXv_char20, GXv_decimal7, GXv_decimal21) ;
                           webwkp85_impl.this.A396EmprCod = GXv_char6[0] ;
                           webwkp85_impl.this.A539HisBarCod = GXv_int8[0] ;
                           webwkp85_impl.this.A545HisCodReo = GXv_int2[0] ;
                           webwkp85_impl.this.A544HisCodPar = GXv_char5[0] ;
                           webwkp85_impl.this.AV7CodCausa = GXv_int9[0] ;
                           webwkp85_impl.this.AV11HisAcCo = GXv_char4[0] ;
                           webwkp85_impl.this.AV12HisAcCot = GXv_char10[0] ;
                           webwkp85_impl.this.AV13HisAdEAcCo = GXv_char11[0] ;
                           webwkp85_impl.this.AV14HisAdEAcCt = GXv_char12[0] ;
                           webwkp85_impl.this.AV15HisAdeObs = GXv_char13[0] ;
                           webwkp85_impl.this.AV19HisOpecod = GXv_int14[0] ;
                           webwkp85_impl.this.AV20Hisoperar = GXv_int15[0] ;
                           webwkp85_impl.this.AV21Hisopetur = GXv_int16[0] ;
                           webwkp85_impl.this.AV22MaqCod = GXv_char17[0] ;
                           webwkp85_impl.this.AV28Rps_Cod = GXv_int18[0] ;
                           webwkp85_impl.this.AV33TipDefCod = GXv_int19[0] ;
                           webwkp85_impl.this.AV16HisAdeSN = GXv_char20[0] ;
                           webwkp85_impl.this.AV17HisMtsCargo = GXv_decimal7[0] ;
                           webwkp85_impl.this.AV18HisMtsImp = GXv_decimal21[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV11HisAcCo", AV11HisAcCo);
                           httpContext.ajax_rsp_assign_attri("", false, "AV12HisAcCot", AV12HisAcCot);
                           httpContext.ajax_rsp_assign_attri("", false, "AV13HisAdEAcCo", AV13HisAdEAcCo);
                           httpContext.ajax_rsp_assign_attri("", false, "AV14HisAdEAcCt", AV14HisAdEAcCt);
                           httpContext.ajax_rsp_assign_attri("", false, "AV15HisAdeObs", AV15HisAdeObs);
                           httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
                           httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
                           GXv_char20[0] = A396EmprCod ;
                           GXv_int15[0] = A539HisBarCod ;
                           GXv_int16[0] = A545HisCodReo ;
                           GXv_char17[0] = A544HisCodPar ;
                           GXv_int19[0] = AV34Tipdefcodold ;
                           GXv_char13[0] = httpContext.getMessage( "DLT", "") ;
                           new app.pprc163(remoteHandle, context).execute( GXv_char20, GXv_int15, GXv_int16, GXv_char17, GXv_int19, GXv_char13) ;
                           webwkp85_impl.this.A396EmprCod = GXv_char20[0] ;
                           webwkp85_impl.this.A539HisBarCod = GXv_int15[0] ;
                           webwkp85_impl.this.A545HisCodReo = GXv_int16[0] ;
                           webwkp85_impl.this.A544HisCodPar = GXv_char17[0] ;
                           webwkp85_impl.this.AV34Tipdefcodold = GXv_int19[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
                           httpContext.ajax_rsp_assign_attri("", false, "AV34Tipdefcodold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tipdefcodold), 4, 0));
                           httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A539HisBarCod),Byte.valueOf(A545HisCodReo),A544HisCodPar});
                           httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A539HisBarCod","A545HisCodReo","A544HisCodPar"});
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

   public void e14DV2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A539HisBarCod),Byte.valueOf(A545HisCodReo),A544HisCodPar});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A539HisBarCod","A545HisCodReo","A544HisCodPar"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "AC2013", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavHismtscargo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHismtscargo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHismtscargo_Visible), 5, 0), true);
         divHismtscargo_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divHismtscargo_cell_Internalname, "Class", divHismtscargo_cell_Class, true);
      }
      else
      {
         edtavHismtscargo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHismtscargo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHismtscargo_Visible), 5, 0), true);
         divHismtscargo_cell_Class = "col-xs-12 col-sm-4 DscTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divHismtscargo_cell_Internalname, "Class", divHismtscargo_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "AC2013", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavHismtsimp_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHismtsimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHismtsimp_Visible), 5, 0), true);
         divHismtsimp_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divHismtsimp_cell_Internalname, "Class", divHismtsimp_cell_Class, true);
      }
      else
      {
         edtavHismtsimp_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHismtsimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHismtsimp_Visible), 5, 0), true);
         divHismtsimp_cell_Class = "col-xs-12 col-sm-4 DscTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divHismtsimp_cell_Internalname, "Class", divHismtsimp_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "AC2013", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavTitprecio_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTitprecio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTitprecio_Visible), 5, 0), true);
         divTitprecio_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divTitprecio_cell_Internalname, "Class", divTitprecio_cell_Class, true);
      }
      else
      {
         edtavTitprecio_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTitprecio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTitprecio_Visible), 5, 0), true);
         divTitprecio_cell_Class = "col-xs-12 col-sm-4 DscTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divTitprecio_cell_Internalname, "Class", divTitprecio_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "CARVIT", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavHisadeacco_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHisadeacco_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisadeacco_Visible), 5, 0), true);
         divHisadeacco_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divHisadeacco_cell_Internalname, "Class", divHisadeacco_cell_Class, true);
      }
      else
      {
         edtavHisadeacco_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHisadeacco_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisadeacco_Visible), 5, 0), true);
         divHisadeacco_cell_Class = "col-xs-12 col-sm-6 DscTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divHisadeacco_cell_Internalname, "Class", divHisadeacco_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "CARVIT", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavHisadeacct_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHisadeacct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisadeacct_Visible), 5, 0), true);
         divHisadeacct_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divHisadeacct_cell_Internalname, "Class", divHisadeacct_cell_Class, true);
      }
      else
      {
         edtavHisadeacct_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavHisadeacct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisadeacct_Visible), 5, 0), true);
         divHisadeacct_cell_Class = "col-xs-12 col-sm-6 DscTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divHisadeacct_cell_Internalname, "Class", divHisadeacct_cell_Class, true);
      }
      if ( ( edtavHisadeacco_Visible == ( 0 )) && ( edtavHisadeacct_Visible == ( 0 )) )
      {
         divTblanalisis_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTblanalisis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTblanalisis_Visible), 5, 0), true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "AC2013", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         divDvpanel_unnamedtable3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable3_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e15DV2( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV11HisAcCo = A5662HisAcCo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisAcCo", AV11HisAcCo);
      AV12HisAcCot = A5693HisAcCot ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12HisAcCot", AV12HisAcCot);
      AV13HisAdEAcCo = A5694HisAdEAcCo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13HisAdEAcCo", AV13HisAdEAcCo);
      AV14HisAdEAcCt = A5695HisAdEAcCt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14HisAdEAcCt", AV14HisAdEAcCt);
      AV15HisAdeObs = A6669HisAdeObs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15HisAdeObs", AV15HisAdeObs);
      AV33TipDefCod = A833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
      /* Using cursor H00DV21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(AV33TipDefCod)});
      hV33TipDefCod = "" ;
      while ( (pr_default.getStatus(19) != 101) )
      {
         hV33TipDefCod = H00DV21_A13819TipdefDscI[0] ;
         if (true) break;
      }
      pr_default.close(19);
      httpContext.ajax_rsp_assign_attri("", false, "hV33TipDefCod", hV33TipDefCod);
      AV34Tipdefcodold = A833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tipdefcodold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tipdefcodold), 4, 0));
      AV35TipDefDsc = A834TipDefDsc ;
      AV7CodCausa = A5085CodCausa ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
      /* Using cursor H00DV22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(AV7CodCausa)});
      hV7CodCausa = "" ;
      while ( (pr_default.getStatus(20) != 101) )
      {
         hV7CodCausa = H00DV22_A13816DscCausaID[0] ;
         if (true) break;
      }
      pr_default.close(20);
      httpContext.ajax_rsp_assign_attri("", false, "hV7CodCausa", hV7CodCausa);
      AV43oldCausa = A5085CodCausa ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43oldCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43oldCausa), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43oldCausa), "ZZZ9")));
      AV8CodDsc = A5086DscCausa ;
      AV19HisOpecod = A12949HisOpecod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
      /* Using cursor H00DV23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(AV19HisOpecod)});
      hV19HisOpecod = "" ;
      while ( (pr_default.getStatus(21) != 101) )
      {
         hV19HisOpecod = H00DV23_A13748OpeCNom[0] ;
         if (true) break;
      }
      pr_default.close(21);
      httpContext.ajax_rsp_assign_attri("", false, "hV19HisOpecod", hV19HisOpecod);
      AV47oldHisOpecod = A12949HisOpecod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47oldHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47oldHisOpecod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47oldHisOpecod), "ZZZZZ9")));
      AV21Hisopetur = A12950HisOpeTur ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
      AV28Rps_Cod = A7000Rps_Cod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
      /* Using cursor H00DV24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(AV28Rps_Cod)});
      hV28Rps_Cod = "" ;
      while ( (pr_default.getStatus(22) != 101) )
      {
         hV28Rps_Cod = H00DV24_A13817Rps_DscID[0] ;
         if (true) break;
      }
      pr_default.close(22);
      httpContext.ajax_rsp_assign_attri("", false, "hV28Rps_Cod", hV28Rps_Cod);
      AV44oldRps_cod = A7000Rps_Cod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44oldRps_cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44oldRps_cod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44oldRps_cod), "ZZZ9")));
      AV29Rps_Dsc = A7001Rps_Dsc ;
      AV22MaqCod = A602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
      /* Using cursor H00DV25 */
      pr_default.execute(23, new Object[] {A396EmprCod, AV22MaqCod});
      hV22MaqCod = "" ;
      while ( (pr_default.getStatus(23) != 101) )
      {
         hV22MaqCod = H00DV25_A13734MaqCDsc[0] ;
         if (true) break;
      }
      pr_default.close(23);
      httpContext.ajax_rsp_assign_attri("", false, "hV22MaqCod", hV22MaqCod);
      AV45oldMaqcod = A602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45oldMaqcod", AV45oldMaqcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45oldMaqcod, ""))));
      AV20Hisoperar = A5356Hisoperar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
      /* Using cursor H00DV26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(AV20Hisoperar)});
      hV20Hisoperar = "" ;
      while ( (pr_default.getStatus(24) != 101) )
      {
         hV20Hisoperar = H00DV26_A13748OpeCNom[0] ;
         if (true) break;
      }
      pr_default.close(24);
      httpContext.ajax_rsp_assign_attri("", false, "hV20Hisoperar", hV20Hisoperar);
      AV46OldHisOperar = A5356Hisoperar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46OldHisOperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46OldHisOperar), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDHISOPERAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46OldHisOperar), "ZZZZZ9")));
      AV27PrecioCargo = A13017HisPreCarg ;
      AV37TitPrecio = "(" + GXutil.str( AV27PrecioCargo, 7, 3) + httpContext.getMessage( " €/Mt)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TitPrecio", AV37TitPrecio);
      AV17HisMtsCargo = A13015HisMtsCarg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
      AV18HisMtsImp = A13016HisMtsImp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
   }

   public void e16DV2( )
   {
      /* Tipdefcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DEFECTOS' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Dedefcto", ""));
         AV33TipDefCod = AV34Tipdefcodold ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
         /* Using cursor H00DV27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(AV33TipDefCod)});
         hV33TipDefCod = "" ;
         while ( (pr_default.getStatus(25) != 101) )
         {
            hV33TipDefCod = H00DV27_A13819TipdefDscI[0] ;
            if (true) break;
         }
         pr_default.close(25);
         httpContext.ajax_rsp_assign_attri("", false, "hV33TipDefCod", hV33TipDefCod);
         GX_FocusControl = edtavTipdefcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e17DV2( )
   {
      /* Codcausa_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CAUSA' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Causa", ""));
         AV7CodCausa = AV43oldCausa ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
         /* Using cursor H00DV28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(AV7CodCausa)});
         hV7CodCausa = "" ;
         while ( (pr_default.getStatus(26) != 101) )
         {
            hV7CodCausa = H00DV28_A13816DscCausaID[0] ;
            if (true) break;
         }
         pr_default.close(26);
         httpContext.ajax_rsp_assign_attri("", false, "hV7CodCausa", hV7CodCausa);
         GX_FocusControl = edtavCodcausa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e18DV2( )
   {
      /* Rps_cod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'RESPONSABILIDAD' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Responsabilidad", ""));
         AV28Rps_Cod = AV44oldRps_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
         /* Using cursor H00DV29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Short.valueOf(AV28Rps_Cod)});
         hV28Rps_Cod = "" ;
         while ( (pr_default.getStatus(27) != 101) )
         {
            hV28Rps_Cod = H00DV29_A13817Rps_DscID[0] ;
            if (true) break;
         }
         pr_default.close(27);
         httpContext.ajax_rsp_assign_attri("", false, "hV28Rps_Cod", hV28Rps_Cod);
         GX_FocusControl = edtavRps_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e19DV2( )
   {
      /* Hisopecod_Isvalid Routine */
      returnInSub = false ;
      AV25Opecod = AV19HisOpecod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Opecod), 6, 0));
      /* Execute user subroutine: 'OPERARIO' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Operario", ""));
         AV19HisOpecod = AV47oldHisOpecod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
         /* Using cursor H00DV30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(AV19HisOpecod)});
         hV19HisOpecod = "" ;
         while ( (pr_default.getStatus(28) != 101) )
         {
            hV19HisOpecod = H00DV30_A13748OpeCNom[0] ;
            if (true) break;
         }
         pr_default.close(28);
         httpContext.ajax_rsp_assign_attri("", false, "hV19HisOpecod", hV19HisOpecod);
         GX_FocusControl = edtavHisopecod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e20DV2( )
   {
      /* Hisoperar_Isvalid Routine */
      returnInSub = false ;
      AV25Opecod = AV20Hisoperar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Opecod), 6, 0));
      /* Execute user subroutine: 'OPERARIO' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Responsable", ""));
         AV20Hisoperar = AV46OldHisOperar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
         /* Using cursor H00DV31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(AV20Hisoperar)});
         hV20Hisoperar = "" ;
         while ( (pr_default.getStatus(29) != 101) )
         {
            hV20Hisoperar = H00DV31_A13748OpeCNom[0] ;
            if (true) break;
         }
         pr_default.close(29);
         httpContext.ajax_rsp_assign_attri("", false, "hV20Hisoperar", hV20Hisoperar);
         GX_FocusControl = edtavHisoperar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e21DV2( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUINA' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Maquina", ""));
         AV22MaqCod = AV45oldMaqcod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
         /* Using cursor H00DV32 */
         pr_default.execute(30, new Object[] {A396EmprCod, AV22MaqCod});
         hV22MaqCod = "" ;
         while ( (pr_default.getStatus(30) != 101) )
         {
            hV22MaqCod = H00DV32_A13734MaqCDsc[0] ;
            if (true) break;
         }
         pr_default.close(30);
         httpContext.ajax_rsp_assign_attri("", false, "hV22MaqCod", hV22MaqCod);
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'DEFECTOS' Routine */
      returnInSub = false ;
      GXv_char20[0] = AV35TipDefDsc ;
      GXv_char17[0] = AV40Ok ;
      new app.existedefectotipdef(remoteHandle, context).execute( A396EmprCod, AV33TipDefCod, GXv_char20, GXv_char17) ;
      webwkp85_impl.this.AV35TipDefDsc = GXv_char20[0] ;
      webwkp85_impl.this.AV40Ok = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
   }

   public void S132( )
   {
      /* 'CAUSA' Routine */
      returnInSub = false ;
      GXv_char20[0] = AV41DscCausa ;
      GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char17[0] = AV40Ok ;
      new app.existecausatipcau(remoteHandle, context).execute( A396EmprCod, AV7CodCausa, GXv_char20, GXv_decimal21, GXv_char17) ;
      webwkp85_impl.this.AV41DscCausa = GXv_char20[0] ;
      webwkp85_impl.this.AV40Ok = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
   }

   public void S142( )
   {
      /* 'RESPONSABILIDAD' Routine */
      returnInSub = false ;
      GXv_char20[0] = AV29Rps_Dsc ;
      GXv_char17[0] = AV40Ok ;
      new app.existeresponsabilidadcodrps(remoteHandle, context).execute( A396EmprCod, AV28Rps_Cod, GXv_char20, GXv_char17) ;
      webwkp85_impl.this.AV29Rps_Dsc = GXv_char20[0] ;
      webwkp85_impl.this.AV40Ok = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
   }

   public void S152( )
   {
      /* 'OPERARIO' Routine */
      returnInSub = false ;
      GXv_char20[0] = AV42Openom ;
      GXv_char17[0] = AV40Ok ;
      new app.existeopeariooperar(remoteHandle, context).execute( A396EmprCod, AV25Opecod, GXv_char20, GXv_char17) ;
      webwkp85_impl.this.AV42Openom = GXv_char20[0] ;
      webwkp85_impl.this.AV40Ok = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
   }

   public void S162( )
   {
      /* 'MAQUINA' Routine */
      returnInSub = false ;
      GXv_char20[0] = AV23MaqDsc ;
      GXv_char17[0] = AV40Ok ;
      new app.existemaquinamaquin(remoteHandle, context).execute( A396EmprCod, AV22MaqCod, GXv_char20, GXv_char17) ;
      webwkp85_impl.this.AV23MaqDsc = GXv_char20[0] ;
      webwkp85_impl.this.AV40Ok = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Ok", AV40Ok);
   }

   public void wb_table1_132_DV2( boolean wbgen )
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
         wb_table1_132_DV2e( true) ;
      }
      else
      {
         wb_table1_132_DV2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A539HisBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
      A545HisCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
      A544HisCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
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
      paDV2( ) ;
      wsDV2( ) ;
      weDV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101641797", true, true);
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
      httpContext.AddJavascriptSource("webwkp85.js", "?20266101641798", false, true);
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
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavHisacco_Internalname = "vHISACCO" ;
      edtavHisaccot_Internalname = "vHISACCOT" ;
      divTable_Internalname = "TABLE" ;
      edtavHisadeacco_Internalname = "vHISADEACCO" ;
      divHisadeacco_cell_Internalname = "HISADEACCO_CELL" ;
      edtavHisadeacct_Internalname = "vHISADEACCT" ;
      divHisadeacct_cell_Internalname = "HISADEACCT_CELL" ;
      divTblanalisis_Internalname = "TBLANALISIS" ;
      divPnl1_Internalname = "PNL1" ;
      Dvpanel_pnl1_Internalname = "DVPANEL_PNL1" ;
      edtavTipdefcod_Internalname = "vTIPDEFCOD" ;
      edtavCodcausa_Internalname = "vCODCAUSA" ;
      edtavRps_cod_Internalname = "vRPS_COD" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavHisopecod_Internalname = "vHISOPECOD" ;
      edtavHisopetur_Internalname = "vHISOPETUR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      chkavHisadesn.setInternalname( "vHISADESN" );
      edtavHisoperar_Internalname = "vHISOPERAR" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavHisadeobs_Internalname = "vHISADEOBS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavHismtscargo_Internalname = "vHISMTSCARGO" ;
      divHismtscargo_cell_Internalname = "HISMTSCARGO_CELL" ;
      edtavHismtsimp_Internalname = "vHISMTSIMP" ;
      divHismtsimp_cell_Internalname = "HISMTSIMP_CELL" ;
      edtavTitprecio_Internalname = "vTITPRECIO" ;
      divTitprecio_cell_Internalname = "TITPRECIO_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divDvpanel_unnamedtable3_cell_Internalname = "DVPANEL_UNNAMEDTABLE3_CELL" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      edtavTitprecio_Jsonclick = "" ;
      edtavTitprecio_Enabled = 1 ;
      edtavTitprecio_Visible = 1 ;
      divTitprecio_cell_Class = "col-xs-12 col-sm-4" ;
      edtavHismtsimp_Jsonclick = "" ;
      edtavHismtsimp_Enabled = 1 ;
      edtavHismtsimp_Visible = 1 ;
      divHismtsimp_cell_Class = "col-xs-12 col-sm-4" ;
      edtavHismtscargo_Jsonclick = "" ;
      edtavHismtscargo_Enabled = 1 ;
      edtavHismtscargo_Visible = 1 ;
      divHismtscargo_cell_Class = "col-xs-12 col-sm-4" ;
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
      edtavHisadeobs_Enabled = 1 ;
      edtavHisoperar_Jsonclick = "" ;
      edtavHisoperar_Enabled = 1 ;
      chkavHisadesn.setEnabled( 1 );
      edtavHisopetur_Jsonclick = "" ;
      edtavHisopetur_Enabled = 1 ;
      edtavHisopecod_Jsonclick = "" ;
      edtavHisopecod_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavRps_cod_Jsonclick = "" ;
      edtavRps_cod_Enabled = 1 ;
      edtavCodcausa_Jsonclick = "" ;
      edtavCodcausa_Enabled = 1 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Enabled = 1 ;
      edtavHisadeacct_Enabled = 1 ;
      edtavHisadeacct_Visible = 1 ;
      divHisadeacct_cell_Class = "col-xs-12 col-sm-6" ;
      edtavHisadeacco_Enabled = 1 ;
      edtavHisadeacco_Visible = 1 ;
      divHisadeacco_cell_Class = "col-xs-12 col-sm-6" ;
      divTblanalisis_Visible = 1 ;
      edtavHisaccot_Enabled = 1 ;
      edtavHisacco_Enabled = 1 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿ Confirma los DATOS?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
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
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Mas datos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_pnl1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Iconposition = "Right" ;
      Dvpanel_pnl1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Title = httpContext.getMessage( "Acciones/Analisis", "") ;
      Dvpanel_pnl1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Documentacion", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavHisadesn.setName( "vHISADESN" );
      chkavHisadesn.setWebtags( "" );
      chkavHisadesn.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavHisadesn.getInternalname(), "TitleCaption", chkavHisadesn.getCaption(), true);
      chkavHisadesn.setCheckedValue( "N" );
      AV16HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( AV16HisAdeSN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
      /* End function init_web_controls */
   }

   public void validv_Tipdefcod( )
   {
      if ( (GXutil.strcmp("", hV33TipDefCod)==0) )
      {
         AV33TipDefCod = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = hV33TipDefCod ;
         /* Using cursor H00DV33 */
         pr_default.execute(31, new Object[] {A13819TipdefDscI, A396EmprCod});
         AV33TipDefCod = H00DV33_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(31) == 101) ) )
         {
            pr_default.readNext(31);
            if ( ! ( (pr_default.getStatus(31) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vTIPDEFCOD");
               GX_FocusControl = edtavTipdefcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(31);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV33TipDefCod", hV33TipDefCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrim( localUtil.ntoc( AV33TipDefCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV33TipDefCod", hV33TipDefCod);
   }

   public void validv_Codcausa( )
   {
      if ( (GXutil.strcmp("", hV7CodCausa)==0) )
      {
         AV7CodCausa = (short)(0) ;
      }
      else
      {
         A13816DscCausaID = hV7CodCausa ;
         /* Using cursor H00DV34 */
         pr_default.execute(32, new Object[] {A13816DscCausaID, A396EmprCod});
         AV7CodCausa = H00DV34_A5085CodCausa[0] ;
         n5085CodCausa = H00DV34_n5085CodCausa[0] ;
         if ( ! ( (pr_default.getStatus(32) == 101) ) )
         {
            pr_default.readNext(32);
            if ( ! ( (pr_default.getStatus(32) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vCODCAUSA");
               GX_FocusControl = edtavCodcausa_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(32);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV7CodCausa", hV7CodCausa);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrim( localUtil.ntoc( AV7CodCausa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV7CodCausa", hV7CodCausa);
   }

   public void validv_Rps_cod( )
   {
      if ( (GXutil.strcmp("", hV28Rps_Cod)==0) )
      {
         AV28Rps_Cod = (short)(0) ;
      }
      else
      {
         A13817Rps_DscID = hV28Rps_Cod ;
         /* Using cursor H00DV35 */
         pr_default.execute(33, new Object[] {A13817Rps_DscID, A396EmprCod});
         AV28Rps_Cod = H00DV35_A7000Rps_Cod[0] ;
         n7000Rps_Cod = H00DV35_n7000Rps_Cod[0] ;
         if ( ! ( (pr_default.getStatus(33) == 101) ) )
         {
            pr_default.readNext(33);
            if ( ! ( (pr_default.getStatus(33) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vRPS_COD");
               GX_FocusControl = edtavRps_cod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(33);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV28Rps_Cod", hV28Rps_Cod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrim( localUtil.ntoc( AV28Rps_Cod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV28Rps_Cod", hV28Rps_Cod);
   }

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV22MaqCod)==0) )
      {
         AV22MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV22MaqCod ;
         /* Using cursor H00DV36 */
         pr_default.execute(34, new Object[] {A13734MaqCDsc, A396EmprCod});
         AV22MaqCod = H00DV36_A602MaqCod[0] ;
         n602MaqCod = H00DV36_n602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(34) == 101) ) )
         {
            pr_default.readNext(34);
            if ( ! ( (pr_default.getStatus(34) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(34);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV22MaqCod", hV22MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", GXutil.rtrim( AV22MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV22MaqCod", hV22MaqCod);
   }

   public void validv_Hisopecod( )
   {
      if ( (GXutil.strcmp("", hV19HisOpecod)==0) )
      {
         AV19HisOpecod = 0 ;
      }
      else
      {
         A13748OpeCNom = hV19HisOpecod ;
         /* Using cursor H00DV37 */
         pr_default.execute(35, new Object[] {A13748OpeCNom, A396EmprCod});
         AV19HisOpecod = H00DV37_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(35) == 101) ) )
         {
            pr_default.readNext(35);
            if ( ! ( (pr_default.getStatus(35) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vHISOPECOD");
               GX_FocusControl = edtavHisopecod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(35);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV19HisOpecod", hV19HisOpecod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrim( localUtil.ntoc( AV19HisOpecod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV19HisOpecod", hV19HisOpecod);
   }

   public void validv_Hisoperar( )
   {
      if ( (GXutil.strcmp("", hV20Hisoperar)==0) )
      {
         AV20Hisoperar = 0 ;
      }
      else
      {
         A13748OpeCNom = hV20Hisoperar ;
         /* Using cursor H00DV38 */
         pr_default.execute(36, new Object[] {A13748OpeCNom, A396EmprCod});
         AV20Hisoperar = H00DV38_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(36) == 101) ) )
         {
            pr_default.readNext(36);
            if ( ! ( (pr_default.getStatus(36) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vHISOPERAR");
               GX_FocusControl = edtavHisoperar_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(36);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV20Hisoperar", hV20Hisoperar);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrim( localUtil.ntoc( AV20Hisoperar, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV20Hisoperar", hV20Hisoperar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'AV16HisAdeSN',fld:'vHISADESN',pic:'@!'},{av:'AV43oldCausa',fld:'vOLDCAUSA',pic:'ZZZ9',hsh:true},{av:'AV44oldRps_cod',fld:'vOLDRPS_COD',pic:'ZZZ9',hsh:true},{av:'AV47oldHisOpecod',fld:'vOLDHISOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV46OldHisOperar',fld:'vOLDHISOPERAR',pic:'ZZZZZ9',hsh:true},{av:'AV45oldMaqcod',fld:'vOLDMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11DV1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e12DV2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV7CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV19HisOpecod',fld:'vHISOPECOD',pic:'ZZZZZ9'},{av:'AV20Hisoperar',fld:'vHISOPERAR',pic:'ZZZZZ9'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'AV34Tipdefcodold',fld:'vTIPDEFCODOLD',pic:'ZZZ9'},{av:'AV11HisAcCo',fld:'vHISACCO',pic:''},{av:'AV12HisAcCot',fld:'vHISACCOT',pic:''},{av:'AV13HisAdEAcCo',fld:'vHISADEACCO',pic:''},{av:'AV14HisAdEAcCt',fld:'vHISADEACCT',pic:''},{av:'AV15HisAdeObs',fld:'vHISADEOBS',pic:''},{av:'AV21Hisopetur',fld:'vHISOPETUR',pic:'9'},{av:'AV16HisAdeSN',fld:'vHISADESN',pic:'@!'},{av:'AV17HisMtsCargo',fld:'vHISMTSCARGO',pic:'ZZZZZ9.99'},{av:'AV18HisMtsImp',fld:'vHISMTSIMP',pic:'ZZZZZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV25Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV34Tipdefcodold',fld:'vTIPDEFCODOLD',pic:'ZZZ9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV18HisMtsImp',fld:'vHISMTSIMP',pic:'ZZZZZZZZZZ9.99'},{av:'AV17HisMtsCargo',fld:'vHISMTSCARGO',pic:'ZZZZZ9.99'},{av:'AV16HisAdeSN',fld:'vHISADESN',pic:'@!'},{av:'AV33TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'AV21Hisopetur',fld:'vHISOPETUR',pic:'9'},{av:'AV20Hisoperar',fld:'vHISOPERAR',pic:'ZZZZZ9'},{av:'AV19HisOpecod',fld:'vHISOPECOD',pic:'ZZZZZ9'},{av:'AV15HisAdeObs',fld:'vHISADEOBS',pic:''},{av:'AV14HisAdEAcCt',fld:'vHISADEACCT',pic:''},{av:'AV13HisAdEAcCo',fld:'vHISADEACCO',pic:''},{av:'AV12HisAcCot',fld:'vHISACCOT',pic:''},{av:'AV11HisAcCo',fld:'vHISACCO',pic:''},{av:'AV7CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e14DV2',iparms:[{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("VTIPDEFCOD.ISVALID","{handler:'e16DV2',iparms:[{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV34Tipdefcodold',fld:'vTIPDEFCODOLD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'}]");
      setEventMetadata("VTIPDEFCOD.ISVALID",",oparms:[{av:'AV33TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VCODCAUSA.ISVALID","{handler:'e17DV2',iparms:[{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV43oldCausa',fld:'vOLDCAUSA',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV7CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'}]");
      setEventMetadata("VCODCAUSA.ISVALID",",oparms:[{av:'AV7CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VRPS_COD.ISVALID","{handler:'e18DV2',iparms:[{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV44oldRps_cod',fld:'vOLDRPS_COD',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'}]");
      setEventMetadata("VRPS_COD.ISVALID",",oparms:[{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VHISOPECOD.ISVALID","{handler:'e19DV2',iparms:[{av:'AV19HisOpecod',fld:'vHISOPECOD',pic:'ZZZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV47oldHisOpecod',fld:'vOLDHISOPECOD',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Opecod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VHISOPECOD.ISVALID",",oparms:[{av:'AV25Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV19HisOpecod',fld:'vHISOPECOD',pic:'ZZZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VHISOPERAR.ISVALID","{handler:'e20DV2',iparms:[{av:'AV20Hisoperar',fld:'vHISOPERAR',pic:'ZZZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV46OldHisOperar',fld:'vOLDHISOPERAR',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25Opecod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VHISOPERAR.ISVALID",",oparms:[{av:'AV25Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV20Hisoperar',fld:'vHISOPERAR',pic:'ZZZZZ9'},{av:'AV40Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e21DV2',iparms:[{av:'AV40Ok',fld:'vOK',pic:''},{av:'AV45oldMaqcod',fld:'vOLDMAQCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'AV40Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VALIDV_TIPDEFCOD","{handler:'validv_Tipdefcod',iparms:[{av:'hV33TipDefCod'},{av:'AV33TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_TIPDEFCOD",",oparms:[{av:'AV33TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'hV33TipDefCod'}]}");
      setEventMetadata("VALIDV_CODCAUSA","{handler:'validv_Codcausa',iparms:[{av:'hV7CodCausa'},{av:'AV7CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_CODCAUSA",",oparms:[{av:'AV7CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'hV7CodCausa'}]}");
      setEventMetadata("VALIDV_RPS_COD","{handler:'validv_Rps_cod',iparms:[{av:'hV28Rps_Cod'},{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_RPS_COD",",oparms:[{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'hV28Rps_Cod'}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV22MaqCod'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'hV22MaqCod'}]}");
      setEventMetadata("VALIDV_HISOPECOD","{handler:'validv_Hisopecod',iparms:[{av:'hV19HisOpecod'},{av:'AV19HisOpecod',fld:'vHISOPECOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_HISOPECOD",",oparms:[{av:'AV19HisOpecod',fld:'vHISOPECOD',pic:'ZZZZZ9'},{av:'hV19HisOpecod'}]}");
      setEventMetadata("VALIDV_HISADESN","{handler:'validv_Hisadesn',iparms:[]");
      setEventMetadata("VALIDV_HISADESN",",oparms:[]}");
      setEventMetadata("VALIDV_HISOPERAR","{handler:'validv_Hisoperar',iparms:[{av:'hV20Hisoperar'},{av:'AV20Hisoperar',fld:'vHISOPERAR',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_HISOPERAR",",oparms:[{av:'AV20Hisoperar',fld:'vHISOPERAR',pic:'ZZZZZ9'},{av:'hV20Hisoperar'}]}");
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
      wcpOA396EmprCod = "" ;
      wcpOA544HisCodPar = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13819TipdefDscI = "" ;
      A13816DscCausaID = "" ;
      A13817Rps_DscID = "" ;
      A13734MaqCDsc = "" ;
      A13748OpeCNom = "" ;
      hV33TipDefCod = "" ;
      hV7CodCausa = "" ;
      hV28Rps_Cod = "" ;
      hV22MaqCod = "" ;
      hV19HisOpecod = "" ;
      hV20Hisoperar = "" ;
      A544HisCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV45oldMaqcod = "" ;
      GXKey = "" ;
      AV40Ok = "" ;
      AV22MaqCod = "" ;
      A13016HisMtsImp = DecimalUtil.ZERO ;
      A13015HisMtsCarg = DecimalUtil.ZERO ;
      A13017HisPreCarg = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnl1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV11HisAcCo = "" ;
      AV12HisAcCot = "" ;
      AV13HisAdEAcCo = "" ;
      AV14HisAdEAcCt = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV16HisAdeSN = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV15HisAdeObs = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      AV17HisMtsCargo = DecimalUtil.ZERO ;
      AV18HisMtsImp = DecimalUtil.ZERO ;
      AV37TitPrecio = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13819TipdefDscI = "" ;
      H00DV2_A13819TipdefDscI = new String[] {""} ;
      l13816DscCausaID = "" ;
      H00DV3_A13816DscCausaID = new String[] {""} ;
      l13817Rps_DscID = "" ;
      H00DV4_A13817Rps_DscID = new String[] {""} ;
      l13734MaqCDsc = "" ;
      H00DV5_A13734MaqCDsc = new String[] {""} ;
      l13748OpeCNom = "" ;
      H00DV6_A13748OpeCNom = new String[] {""} ;
      H00DV7_A13748OpeCNom = new String[] {""} ;
      H00DV8_A13819TipdefDscI = new String[] {""} ;
      H00DV8_A396EmprCod = new String[] {""} ;
      H00DV8_A833TipDefCod = new short[1] ;
      H00DV9_A13816DscCausaID = new String[] {""} ;
      H00DV9_A396EmprCod = new String[] {""} ;
      H00DV9_A5085CodCausa = new short[1] ;
      H00DV9_n5085CodCausa = new boolean[] {false} ;
      H00DV10_A13817Rps_DscID = new String[] {""} ;
      H00DV10_A396EmprCod = new String[] {""} ;
      H00DV10_A7000Rps_Cod = new short[1] ;
      H00DV10_n7000Rps_Cod = new boolean[] {false} ;
      H00DV11_A13734MaqCDsc = new String[] {""} ;
      H00DV11_A396EmprCod = new String[] {""} ;
      H00DV11_A602MaqCod = new String[] {""} ;
      H00DV11_n602MaqCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      H00DV12_A13748OpeCNom = new String[] {""} ;
      H00DV12_A396EmprCod = new String[] {""} ;
      H00DV12_A652OpeCod = new int[1] ;
      H00DV13_A13748OpeCNom = new String[] {""} ;
      H00DV13_A396EmprCod = new String[] {""} ;
      H00DV13_A652OpeCod = new int[1] ;
      H00DV14_A396EmprCod = new String[] {""} ;
      H00DV14_A539HisBarCod = new int[1] ;
      H00DV14_A545HisCodReo = new byte[1] ;
      H00DV14_A544HisCodPar = new String[] {""} ;
      H00DV14_A5662HisAcCo = new String[] {""} ;
      H00DV14_n5662HisAcCo = new boolean[] {false} ;
      H00DV14_A5693HisAcCot = new String[] {""} ;
      H00DV14_n5693HisAcCot = new boolean[] {false} ;
      H00DV14_A5694HisAdEAcCo = new String[] {""} ;
      H00DV14_n5694HisAdEAcCo = new boolean[] {false} ;
      H00DV14_A5695HisAdEAcCt = new String[] {""} ;
      H00DV14_n5695HisAdEAcCt = new boolean[] {false} ;
      H00DV14_A6669HisAdeObs = new String[] {""} ;
      H00DV14_n6669HisAdeObs = new boolean[] {false} ;
      H00DV14_A833TipDefCod = new short[1] ;
      H00DV14_A834TipDefDsc = new String[] {""} ;
      H00DV14_n834TipDefDsc = new boolean[] {false} ;
      H00DV14_A5085CodCausa = new short[1] ;
      H00DV14_n5085CodCausa = new boolean[] {false} ;
      H00DV14_A5086DscCausa = new String[] {""} ;
      H00DV14_n5086DscCausa = new boolean[] {false} ;
      H00DV14_A12949HisOpecod = new int[1] ;
      H00DV14_n12949HisOpecod = new boolean[] {false} ;
      H00DV14_A12950HisOpeTur = new byte[1] ;
      H00DV14_n12950HisOpeTur = new boolean[] {false} ;
      H00DV14_A7000Rps_Cod = new short[1] ;
      H00DV14_n7000Rps_Cod = new boolean[] {false} ;
      H00DV14_A7001Rps_Dsc = new String[] {""} ;
      H00DV14_n7001Rps_Dsc = new boolean[] {false} ;
      H00DV14_A602MaqCod = new String[] {""} ;
      H00DV14_n602MaqCod = new boolean[] {false} ;
      H00DV14_A5356Hisoperar = new int[1] ;
      H00DV14_n5356Hisoperar = new boolean[] {false} ;
      H00DV14_A13015HisMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DV14_n13015HisMtsCarg = new boolean[] {false} ;
      H00DV14_A13016HisMtsImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DV14_n13016HisMtsImp = new boolean[] {false} ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A6669HisAdeObs = "" ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      H00DV15_A13819TipdefDscI = new String[] {""} ;
      H00DV15_A396EmprCod = new String[] {""} ;
      H00DV15_A833TipDefCod = new short[1] ;
      H00DV16_A13816DscCausaID = new String[] {""} ;
      H00DV16_A396EmprCod = new String[] {""} ;
      H00DV16_A5085CodCausa = new short[1] ;
      H00DV16_n5085CodCausa = new boolean[] {false} ;
      H00DV17_A13817Rps_DscID = new String[] {""} ;
      H00DV17_A396EmprCod = new String[] {""} ;
      H00DV17_A7000Rps_Cod = new short[1] ;
      H00DV17_n7000Rps_Cod = new boolean[] {false} ;
      H00DV18_A13734MaqCDsc = new String[] {""} ;
      H00DV18_A396EmprCod = new String[] {""} ;
      H00DV18_A602MaqCod = new String[] {""} ;
      H00DV18_n602MaqCod = new boolean[] {false} ;
      H00DV19_A13748OpeCNom = new String[] {""} ;
      H00DV19_A396EmprCod = new String[] {""} ;
      H00DV19_A652OpeCod = new int[1] ;
      H00DV20_A13748OpeCNom = new String[] {""} ;
      H00DV20_A396EmprCod = new String[] {""} ;
      H00DV20_A652OpeCod = new int[1] ;
      AV30Station = "" ;
      GXt_char3 = "" ;
      AV9EmprCod = "" ;
      AV10EmprNom = "" ;
      AV38UsurCod = "" ;
      AV35TipDefDsc = "" ;
      AV41DscCausa = "" ;
      AV29Rps_Dsc = "" ;
      AV42Openom = "" ;
      AV23MaqDsc = "" ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int18 = new short[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int19 = new short[1] ;
      GXv_char13 = new String[1] ;
      H00DV21_A13819TipdefDscI = new String[] {""} ;
      H00DV21_A396EmprCod = new String[] {""} ;
      H00DV21_A833TipDefCod = new short[1] ;
      H00DV22_A13816DscCausaID = new String[] {""} ;
      H00DV22_A396EmprCod = new String[] {""} ;
      H00DV22_A5085CodCausa = new short[1] ;
      H00DV22_n5085CodCausa = new boolean[] {false} ;
      AV8CodDsc = "" ;
      H00DV23_A13748OpeCNom = new String[] {""} ;
      H00DV23_A396EmprCod = new String[] {""} ;
      H00DV23_A652OpeCod = new int[1] ;
      H00DV24_A13817Rps_DscID = new String[] {""} ;
      H00DV24_A396EmprCod = new String[] {""} ;
      H00DV24_A7000Rps_Cod = new short[1] ;
      H00DV24_n7000Rps_Cod = new boolean[] {false} ;
      H00DV25_A13734MaqCDsc = new String[] {""} ;
      H00DV25_A396EmprCod = new String[] {""} ;
      H00DV25_A602MaqCod = new String[] {""} ;
      H00DV25_n602MaqCod = new boolean[] {false} ;
      H00DV26_A13748OpeCNom = new String[] {""} ;
      H00DV26_A396EmprCod = new String[] {""} ;
      H00DV26_A652OpeCod = new int[1] ;
      AV27PrecioCargo = DecimalUtil.ZERO ;
      H00DV27_A13819TipdefDscI = new String[] {""} ;
      H00DV27_A396EmprCod = new String[] {""} ;
      H00DV27_A833TipDefCod = new short[1] ;
      H00DV28_A13816DscCausaID = new String[] {""} ;
      H00DV28_A396EmprCod = new String[] {""} ;
      H00DV28_A5085CodCausa = new short[1] ;
      H00DV28_n5085CodCausa = new boolean[] {false} ;
      H00DV29_A13817Rps_DscID = new String[] {""} ;
      H00DV29_A396EmprCod = new String[] {""} ;
      H00DV29_A7000Rps_Cod = new short[1] ;
      H00DV29_n7000Rps_Cod = new boolean[] {false} ;
      H00DV30_A13748OpeCNom = new String[] {""} ;
      H00DV30_A396EmprCod = new String[] {""} ;
      H00DV30_A652OpeCod = new int[1] ;
      H00DV31_A13748OpeCNom = new String[] {""} ;
      H00DV31_A396EmprCod = new String[] {""} ;
      H00DV31_A652OpeCod = new int[1] ;
      H00DV32_A13734MaqCDsc = new String[] {""} ;
      H00DV32_A396EmprCod = new String[] {""} ;
      H00DV32_A602MaqCod = new String[] {""} ;
      H00DV32_n602MaqCod = new boolean[] {false} ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_char20 = new String[1] ;
      GXv_char17 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00DV33_A13819TipdefDscI = new String[] {""} ;
      H00DV33_A396EmprCod = new String[] {""} ;
      H00DV33_A833TipDefCod = new short[1] ;
      ZhV33TipDefCod = "" ;
      H00DV34_A13816DscCausaID = new String[] {""} ;
      H00DV34_A396EmprCod = new String[] {""} ;
      H00DV34_A5085CodCausa = new short[1] ;
      H00DV34_n5085CodCausa = new boolean[] {false} ;
      ZhV7CodCausa = "" ;
      H00DV35_A13817Rps_DscID = new String[] {""} ;
      H00DV35_A396EmprCod = new String[] {""} ;
      H00DV35_A7000Rps_Cod = new short[1] ;
      H00DV35_n7000Rps_Cod = new boolean[] {false} ;
      ZhV28Rps_Cod = "" ;
      H00DV36_A13734MaqCDsc = new String[] {""} ;
      H00DV36_A396EmprCod = new String[] {""} ;
      H00DV36_A602MaqCod = new String[] {""} ;
      H00DV36_n602MaqCod = new boolean[] {false} ;
      ZV22MaqCod = "" ;
      ZhV22MaqCod = "" ;
      H00DV37_A13748OpeCNom = new String[] {""} ;
      H00DV37_A396EmprCod = new String[] {""} ;
      H00DV37_A652OpeCod = new int[1] ;
      ZhV19HisOpecod = "" ;
      H00DV38_A13748OpeCNom = new String[] {""} ;
      H00DV38_A396EmprCod = new String[] {""} ;
      H00DV38_A652OpeCod = new int[1] ;
      ZhV20Hisoperar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwkp85__default(),
         new Object[] {
             new Object[] {
            H00DV2_A13819TipdefDscI
            }
            , new Object[] {
            H00DV3_A13816DscCausaID
            }
            , new Object[] {
            H00DV4_A13817Rps_DscID
            }
            , new Object[] {
            H00DV5_A13734MaqCDsc
            }
            , new Object[] {
            H00DV6_A13748OpeCNom
            }
            , new Object[] {
            H00DV7_A13748OpeCNom
            }
            , new Object[] {
            H00DV8_A13819TipdefDscI, H00DV8_A396EmprCod, H00DV8_A833TipDefCod
            }
            , new Object[] {
            H00DV9_A13816DscCausaID, H00DV9_A396EmprCod, H00DV9_A5085CodCausa
            }
            , new Object[] {
            H00DV10_A13817Rps_DscID, H00DV10_A396EmprCod, H00DV10_A7000Rps_Cod
            }
            , new Object[] {
            H00DV11_A13734MaqCDsc, H00DV11_A396EmprCod, H00DV11_A602MaqCod
            }
            , new Object[] {
            H00DV12_A13748OpeCNom, H00DV12_A396EmprCod, H00DV12_A652OpeCod
            }
            , new Object[] {
            H00DV13_A13748OpeCNom, H00DV13_A396EmprCod, H00DV13_A652OpeCod
            }
            , new Object[] {
            H00DV14_A396EmprCod, H00DV14_A539HisBarCod, H00DV14_A545HisCodReo, H00DV14_A544HisCodPar, H00DV14_A5662HisAcCo, H00DV14_n5662HisAcCo, H00DV14_A5693HisAcCot, H00DV14_n5693HisAcCot, H00DV14_A5694HisAdEAcCo, H00DV14_n5694HisAdEAcCo,
            H00DV14_A5695HisAdEAcCt, H00DV14_n5695HisAdEAcCt, H00DV14_A6669HisAdeObs, H00DV14_n6669HisAdeObs, H00DV14_A833TipDefCod, H00DV14_A834TipDefDsc, H00DV14_n834TipDefDsc, H00DV14_A5085CodCausa, H00DV14_n5085CodCausa, H00DV14_A5086DscCausa,
            H00DV14_n5086DscCausa, H00DV14_A12949HisOpecod, H00DV14_n12949HisOpecod, H00DV14_A12950HisOpeTur, H00DV14_n12950HisOpeTur, H00DV14_A7000Rps_Cod, H00DV14_n7000Rps_Cod, H00DV14_A7001Rps_Dsc, H00DV14_n7001Rps_Dsc, H00DV14_A602MaqCod,
            H00DV14_n602MaqCod, H00DV14_A5356Hisoperar, H00DV14_n5356Hisoperar, H00DV14_A13015HisMtsCarg, H00DV14_n13015HisMtsCarg, H00DV14_A13016HisMtsImp, H00DV14_n13016HisMtsImp
            }
            , new Object[] {
            H00DV15_A13819TipdefDscI, H00DV15_A396EmprCod, H00DV15_A833TipDefCod
            }
            , new Object[] {
            H00DV16_A13816DscCausaID, H00DV16_A396EmprCod, H00DV16_A5085CodCausa
            }
            , new Object[] {
            H00DV17_A13817Rps_DscID, H00DV17_A396EmprCod, H00DV17_A7000Rps_Cod
            }
            , new Object[] {
            H00DV18_A13734MaqCDsc, H00DV18_A396EmprCod, H00DV18_A602MaqCod
            }
            , new Object[] {
            H00DV19_A13748OpeCNom, H00DV19_A396EmprCod, H00DV19_A652OpeCod
            }
            , new Object[] {
            H00DV20_A13748OpeCNom, H00DV20_A396EmprCod, H00DV20_A652OpeCod
            }
            , new Object[] {
            H00DV21_A13819TipdefDscI, H00DV21_A396EmprCod, H00DV21_A833TipDefCod
            }
            , new Object[] {
            H00DV22_A13816DscCausaID, H00DV22_A396EmprCod, H00DV22_A5085CodCausa
            }
            , new Object[] {
            H00DV23_A13748OpeCNom, H00DV23_A396EmprCod, H00DV23_A652OpeCod
            }
            , new Object[] {
            H00DV24_A13817Rps_DscID, H00DV24_A396EmprCod, H00DV24_A7000Rps_Cod
            }
            , new Object[] {
            H00DV25_A13734MaqCDsc, H00DV25_A396EmprCod, H00DV25_A602MaqCod
            }
            , new Object[] {
            H00DV26_A13748OpeCNom, H00DV26_A396EmprCod, H00DV26_A652OpeCod
            }
            , new Object[] {
            H00DV27_A13819TipdefDscI, H00DV27_A396EmprCod, H00DV27_A833TipDefCod
            }
            , new Object[] {
            H00DV28_A13816DscCausaID, H00DV28_A396EmprCod, H00DV28_A5085CodCausa
            }
            , new Object[] {
            H00DV29_A13817Rps_DscID, H00DV29_A396EmprCod, H00DV29_A7000Rps_Cod
            }
            , new Object[] {
            H00DV30_A13748OpeCNom, H00DV30_A396EmprCod, H00DV30_A652OpeCod
            }
            , new Object[] {
            H00DV31_A13748OpeCNom, H00DV31_A396EmprCod, H00DV31_A652OpeCod
            }
            , new Object[] {
            H00DV32_A13734MaqCDsc, H00DV32_A396EmprCod, H00DV32_A602MaqCod
            }
            , new Object[] {
            H00DV33_A13819TipdefDscI, H00DV33_A396EmprCod, H00DV33_A833TipDefCod
            }
            , new Object[] {
            H00DV34_A13816DscCausaID, H00DV34_A396EmprCod, H00DV34_A5085CodCausa
            }
            , new Object[] {
            H00DV35_A13817Rps_DscID, H00DV35_A396EmprCod, H00DV35_A7000Rps_Cod
            }
            , new Object[] {
            H00DV36_A13734MaqCDsc, H00DV36_A396EmprCod, H00DV36_A602MaqCod
            }
            , new Object[] {
            H00DV37_A13748OpeCNom, H00DV37_A396EmprCod, H00DV37_A652OpeCod
            }
            , new Object[] {
            H00DV38_A13748OpeCNom, H00DV38_A396EmprCod, H00DV38_A652OpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOA545HisCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A545HisCodReo ;
   private byte gxajaxcallmode ;
   private byte AV21Hisopetur ;
   private byte nDonePA ;
   private byte A12950HisOpeTur ;
   private byte AV5acabats ;
   private byte AV6carvitin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private short AV43oldCausa ;
   private short AV44oldRps_cod ;
   private short AV34Tipdefcodold ;
   private short AV33TipDefCod ;
   private short AV7CodCausa ;
   private short AV28Rps_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private short GXv_int9[] ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private short ZV33TipDefCod ;
   private short ZV7CodCausa ;
   private short ZV28Rps_Cod ;
   private int wcpOA539HisBarCod ;
   private int A539HisBarCod ;
   private int AV47oldHisOpecod ;
   private int AV46OldHisOperar ;
   private int AV25Opecod ;
   private int AV19HisOpecod ;
   private int AV20Hisoperar ;
   private int edtavHisacco_Enabled ;
   private int edtavHisaccot_Enabled ;
   private int divTblanalisis_Visible ;
   private int edtavHisadeacco_Visible ;
   private int edtavHisadeacco_Enabled ;
   private int edtavHisadeacct_Visible ;
   private int edtavHisadeacct_Enabled ;
   private int edtavTipdefcod_Enabled ;
   private int edtavCodcausa_Enabled ;
   private int edtavRps_cod_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavHisopecod_Enabled ;
   private int edtavHisopetur_Enabled ;
   private int edtavHisoperar_Enabled ;
   private int edtavHisadeobs_Enabled ;
   private int edtavHismtscargo_Visible ;
   private int edtavHismtscargo_Enabled ;
   private int edtavHismtsimp_Visible ;
   private int edtavHismtsimp_Enabled ;
   private int edtavTitprecio_Visible ;
   private int edtavTitprecio_Enabled ;
   private int gxdynajaxindex ;
   private int A652OpeCod ;
   private int A12949HisOpecod ;
   private int A5356Hisoperar ;
   private int GXv_int8[] ;
   private int GXv_int14[] ;
   private int GXv_int15[] ;
   private int idxLst ;
   private int ZV19HisOpecod ;
   private int ZV20Hisoperar ;
   private java.math.BigDecimal A13016HisMtsImp ;
   private java.math.BigDecimal A13015HisMtsCarg ;
   private java.math.BigDecimal A13017HisPreCarg ;
   private java.math.BigDecimal AV17HisMtsCargo ;
   private java.math.BigDecimal AV18HisMtsImp ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV27PrecioCargo ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private String wcpOA396EmprCod ;
   private String wcpOA544HisCodPar ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A544HisCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV45oldMaqcod ;
   private String GXKey ;
   private String AV40Ok ;
   private String AV22MaqCod ;
   private String Dvpanel_pnl1_Width ;
   private String Dvpanel_pnl1_Cls ;
   private String Dvpanel_pnl1_Title ;
   private String Dvpanel_pnl1_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_pnl1_Internalname ;
   private String divPnl1_Internalname ;
   private String divTable_Internalname ;
   private String edtavHisacco_Internalname ;
   private String TempTags ;
   private String edtavHisaccot_Internalname ;
   private String divTblanalisis_Internalname ;
   private String divHisadeacco_cell_Internalname ;
   private String divHisadeacco_cell_Class ;
   private String edtavHisadeacco_Internalname ;
   private String divHisadeacct_cell_Internalname ;
   private String divHisadeacct_cell_Class ;
   private String edtavHisadeacct_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavTipdefcod_Internalname ;
   private String edtavTipdefcod_Jsonclick ;
   private String edtavCodcausa_Internalname ;
   private String edtavCodcausa_Jsonclick ;
   private String edtavRps_cod_Internalname ;
   private String edtavRps_cod_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavHisopecod_Internalname ;
   private String edtavHisopecod_Jsonclick ;
   private String edtavHisopetur_Internalname ;
   private String edtavHisopetur_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String AV16HisAdeSN ;
   private String edtavHisoperar_Internalname ;
   private String edtavHisoperar_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavHisadeobs_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Class ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divHismtscargo_cell_Internalname ;
   private String divHismtscargo_cell_Class ;
   private String edtavHismtscargo_Internalname ;
   private String edtavHismtscargo_Jsonclick ;
   private String divHismtsimp_cell_Internalname ;
   private String divHismtsimp_cell_Class ;
   private String edtavHismtsimp_Internalname ;
   private String edtavHismtsimp_Jsonclick ;
   private String divTitprecio_cell_Internalname ;
   private String divTitprecio_cell_Class ;
   private String edtavTitprecio_Internalname ;
   private String AV37TitPrecio ;
   private String edtavTitprecio_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String AV30Station ;
   private String GXt_char3 ;
   private String AV9EmprCod ;
   private String AV10EmprNom ;
   private String AV38UsurCod ;
   private String AV35TipDefDsc ;
   private String AV41DscCausa ;
   private String AV29Rps_Dsc ;
   private String AV42Openom ;
   private String AV23MaqDsc ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String AV8CodDsc ;
   private String GXv_char20[] ;
   private String GXv_char17[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String ZV22MaqCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_pnl1_Autowidth ;
   private boolean Dvpanel_pnl1_Autoheight ;
   private boolean Dvpanel_pnl1_Collapsible ;
   private boolean Dvpanel_pnl1_Collapsed ;
   private boolean Dvpanel_pnl1_Showcollapseicon ;
   private boolean Dvpanel_pnl1_Autoscroll ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n602MaqCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n6669HisAdeObs ;
   private boolean n834TipDefDsc ;
   private boolean n5086DscCausa ;
   private boolean n12949HisOpecod ;
   private boolean n12950HisOpeTur ;
   private boolean n7001Rps_Dsc ;
   private boolean n5356Hisoperar ;
   private boolean n13015HisMtsCarg ;
   private boolean n13016HisMtsImp ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13819TipdefDscI ;
   private String A13816DscCausaID ;
   private String A13817Rps_DscID ;
   private String A13734MaqCDsc ;
   private String A13748OpeCNom ;
   private String hV33TipDefCod ;
   private String hV7CodCausa ;
   private String hV28Rps_Cod ;
   private String hV22MaqCod ;
   private String hV19HisOpecod ;
   private String hV20Hisoperar ;
   private String AV11HisAcCo ;
   private String AV12HisAcCot ;
   private String AV13HisAdEAcCo ;
   private String AV14HisAdEAcCt ;
   private String AV15HisAdeObs ;
   private String l13819TipdefDscI ;
   private String l13816DscCausaID ;
   private String l13817Rps_DscID ;
   private String l13734MaqCDsc ;
   private String l13748OpeCNom ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String A6669HisAdeObs ;
   private String ZhV33TipDefCod ;
   private String ZhV7CodCausa ;
   private String ZhV28Rps_Cod ;
   private String ZhV22MaqCod ;
   private String ZhV19HisOpecod ;
   private String ZhV20Hisoperar ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private ICheckbox chkavHisadesn ;
   private IDataStoreProvider pr_default ;
   private String[] H00DV2_A13819TipdefDscI ;
   private String[] H00DV3_A13816DscCausaID ;
   private String[] H00DV4_A13817Rps_DscID ;
   private String[] H00DV5_A13734MaqCDsc ;
   private String[] H00DV6_A13748OpeCNom ;
   private String[] H00DV7_A13748OpeCNom ;
   private String[] H00DV8_A13819TipdefDscI ;
   private String[] H00DV8_A396EmprCod ;
   private short[] H00DV8_A833TipDefCod ;
   private String[] H00DV9_A13816DscCausaID ;
   private String[] H00DV9_A396EmprCod ;
   private short[] H00DV9_A5085CodCausa ;
   private boolean[] H00DV9_n5085CodCausa ;
   private String[] H00DV10_A13817Rps_DscID ;
   private String[] H00DV10_A396EmprCod ;
   private short[] H00DV10_A7000Rps_Cod ;
   private boolean[] H00DV10_n7000Rps_Cod ;
   private String[] H00DV11_A13734MaqCDsc ;
   private String[] H00DV11_A396EmprCod ;
   private String[] H00DV11_A602MaqCod ;
   private boolean[] H00DV11_n602MaqCod ;
   private String[] H00DV12_A13748OpeCNom ;
   private String[] H00DV12_A396EmprCod ;
   private int[] H00DV12_A652OpeCod ;
   private String[] H00DV13_A13748OpeCNom ;
   private String[] H00DV13_A396EmprCod ;
   private int[] H00DV13_A652OpeCod ;
   private String[] H00DV14_A396EmprCod ;
   private int[] H00DV14_A539HisBarCod ;
   private byte[] H00DV14_A545HisCodReo ;
   private String[] H00DV14_A544HisCodPar ;
   private String[] H00DV14_A5662HisAcCo ;
   private boolean[] H00DV14_n5662HisAcCo ;
   private String[] H00DV14_A5693HisAcCot ;
   private boolean[] H00DV14_n5693HisAcCot ;
   private String[] H00DV14_A5694HisAdEAcCo ;
   private boolean[] H00DV14_n5694HisAdEAcCo ;
   private String[] H00DV14_A5695HisAdEAcCt ;
   private boolean[] H00DV14_n5695HisAdEAcCt ;
   private String[] H00DV14_A6669HisAdeObs ;
   private boolean[] H00DV14_n6669HisAdeObs ;
   private short[] H00DV14_A833TipDefCod ;
   private String[] H00DV14_A834TipDefDsc ;
   private boolean[] H00DV14_n834TipDefDsc ;
   private short[] H00DV14_A5085CodCausa ;
   private boolean[] H00DV14_n5085CodCausa ;
   private String[] H00DV14_A5086DscCausa ;
   private boolean[] H00DV14_n5086DscCausa ;
   private int[] H00DV14_A12949HisOpecod ;
   private boolean[] H00DV14_n12949HisOpecod ;
   private byte[] H00DV14_A12950HisOpeTur ;
   private boolean[] H00DV14_n12950HisOpeTur ;
   private short[] H00DV14_A7000Rps_Cod ;
   private boolean[] H00DV14_n7000Rps_Cod ;
   private String[] H00DV14_A7001Rps_Dsc ;
   private boolean[] H00DV14_n7001Rps_Dsc ;
   private String[] H00DV14_A602MaqCod ;
   private boolean[] H00DV14_n602MaqCod ;
   private int[] H00DV14_A5356Hisoperar ;
   private boolean[] H00DV14_n5356Hisoperar ;
   private java.math.BigDecimal[] H00DV14_A13015HisMtsCarg ;
   private boolean[] H00DV14_n13015HisMtsCarg ;
   private java.math.BigDecimal[] H00DV14_A13016HisMtsImp ;
   private boolean[] H00DV14_n13016HisMtsImp ;
   private String[] H00DV15_A13819TipdefDscI ;
   private String[] H00DV15_A396EmprCod ;
   private short[] H00DV15_A833TipDefCod ;
   private String[] H00DV16_A13816DscCausaID ;
   private String[] H00DV16_A396EmprCod ;
   private short[] H00DV16_A5085CodCausa ;
   private boolean[] H00DV16_n5085CodCausa ;
   private String[] H00DV17_A13817Rps_DscID ;
   private String[] H00DV17_A396EmprCod ;
   private short[] H00DV17_A7000Rps_Cod ;
   private boolean[] H00DV17_n7000Rps_Cod ;
   private String[] H00DV18_A13734MaqCDsc ;
   private String[] H00DV18_A396EmprCod ;
   private String[] H00DV18_A602MaqCod ;
   private boolean[] H00DV18_n602MaqCod ;
   private String[] H00DV19_A13748OpeCNom ;
   private String[] H00DV19_A396EmprCod ;
   private int[] H00DV19_A652OpeCod ;
   private String[] H00DV20_A13748OpeCNom ;
   private String[] H00DV20_A396EmprCod ;
   private int[] H00DV20_A652OpeCod ;
   private String[] H00DV21_A13819TipdefDscI ;
   private String[] H00DV21_A396EmprCod ;
   private short[] H00DV21_A833TipDefCod ;
   private String[] H00DV22_A13816DscCausaID ;
   private String[] H00DV22_A396EmprCod ;
   private short[] H00DV22_A5085CodCausa ;
   private boolean[] H00DV22_n5085CodCausa ;
   private String[] H00DV23_A13748OpeCNom ;
   private String[] H00DV23_A396EmprCod ;
   private int[] H00DV23_A652OpeCod ;
   private String[] H00DV24_A13817Rps_DscID ;
   private String[] H00DV24_A396EmprCod ;
   private short[] H00DV24_A7000Rps_Cod ;
   private boolean[] H00DV24_n7000Rps_Cod ;
   private String[] H00DV25_A13734MaqCDsc ;
   private String[] H00DV25_A396EmprCod ;
   private String[] H00DV25_A602MaqCod ;
   private boolean[] H00DV25_n602MaqCod ;
   private String[] H00DV26_A13748OpeCNom ;
   private String[] H00DV26_A396EmprCod ;
   private int[] H00DV26_A652OpeCod ;
   private String[] H00DV27_A13819TipdefDscI ;
   private String[] H00DV27_A396EmprCod ;
   private short[] H00DV27_A833TipDefCod ;
   private String[] H00DV28_A13816DscCausaID ;
   private String[] H00DV28_A396EmprCod ;
   private short[] H00DV28_A5085CodCausa ;
   private boolean[] H00DV28_n5085CodCausa ;
   private String[] H00DV29_A13817Rps_DscID ;
   private String[] H00DV29_A396EmprCod ;
   private short[] H00DV29_A7000Rps_Cod ;
   private boolean[] H00DV29_n7000Rps_Cod ;
   private String[] H00DV30_A13748OpeCNom ;
   private String[] H00DV30_A396EmprCod ;
   private int[] H00DV30_A652OpeCod ;
   private String[] H00DV31_A13748OpeCNom ;
   private String[] H00DV31_A396EmprCod ;
   private int[] H00DV31_A652OpeCod ;
   private String[] H00DV32_A13734MaqCDsc ;
   private String[] H00DV32_A396EmprCod ;
   private String[] H00DV32_A602MaqCod ;
   private boolean[] H00DV32_n602MaqCod ;
   private String[] H00DV33_A13819TipdefDscI ;
   private String[] H00DV33_A396EmprCod ;
   private short[] H00DV33_A833TipDefCod ;
   private String[] H00DV34_A13816DscCausaID ;
   private String[] H00DV34_A396EmprCod ;
   private short[] H00DV34_A5085CodCausa ;
   private boolean[] H00DV34_n5085CodCausa ;
   private String[] H00DV35_A13817Rps_DscID ;
   private String[] H00DV35_A396EmprCod ;
   private short[] H00DV35_A7000Rps_Cod ;
   private boolean[] H00DV35_n7000Rps_Cod ;
   private String[] H00DV36_A13734MaqCDsc ;
   private String[] H00DV36_A396EmprCod ;
   private String[] H00DV36_A602MaqCod ;
   private boolean[] H00DV36_n602MaqCod ;
   private String[] H00DV37_A13748OpeCNom ;
   private String[] H00DV37_A396EmprCod ;
   private int[] H00DV37_A652OpeCod ;
   private String[] H00DV38_A13748OpeCNom ;
   private String[] H00DV38_A396EmprCod ;
   private int[] H00DV38_A652OpeCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwkp85__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DV2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI FROM TXPTIPDEF WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, '')))) like '%' || UPPER(?)) ORDER BY TipdefDscI) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID FROM TXPTIPCAU WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, '')))) like '%' || UPPER(?)) ORDER BY DscCausaID) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID FROM TXPCODRPS WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, '')))) like '%' || UPPER(?)) ORDER BY Rps_DscID) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) ORDER BY MaqCDsc) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV6", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) ORDER BY OpeCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV7", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) ORDER BY OpeCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, EmprCod, CodCausa FROM TXPTIPCAU WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, EmprCod, Rps_Cod FROM TXPCODRPS WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV11", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV14", "SELECT T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.HisAcCo, T1.HisAcCot, T1.HisAdEAcCo, T1.HisAdEAcCt, T1.HisAdeObs, T1.TipDefCod, T2.TipDefDsc, T1.CodCausa, T3.DscCausa, T1.HisOpecod, T1.HisOpeTur, T1.Rps_Cod, T4.Rps_Dsc, T1.MaqCod, T1.Hisoperar, T1.HisMtsCarg, T1.HisMtsImp FROM (((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T4 ON T4.EmprCod = T1.EmprCod AND T4.Rps_Cod = T1.Rps_Cod) WHERE T1.EmprCod = ? and T1.HisBarCod = ? and T1.HisCodReo = ? and T1.HisCodPar = ? ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV15", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV16", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, EmprCod, CodCausa FROM TXPTIPCAU WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, EmprCod, Rps_Cod FROM TXPCODRPS WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV18", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV19", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV20", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV21", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (EmprCod = ?) AND (TipDefCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV22", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, EmprCod, CodCausa FROM TXPTIPCAU WHERE (EmprCod = ?) AND (CodCausa = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV23", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV24", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, EmprCod, Rps_Cod FROM TXPCODRPS WHERE (EmprCod = ?) AND (Rps_Cod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV25", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV26", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV27", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (EmprCod = ?) AND (TipDefCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV28", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, EmprCod, CodCausa FROM TXPTIPCAU WHERE (EmprCod = ?) AND (CodCausa = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV29", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, EmprCod, Rps_Cod FROM TXPCODRPS WHERE (EmprCod = ?) AND (Rps_Cod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV30", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV31", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV32", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV33", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV34", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, EmprCod, CodCausa FROM TXPTIPCAU WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV35", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, EmprCod, Rps_Cod FROM TXPCODRPS WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV36", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV37", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DV38", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 60);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 32 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 33 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 34 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 36 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

