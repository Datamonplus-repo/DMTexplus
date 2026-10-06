package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcbaragr_impl extends GXWebComponent
{
   public wcbaragr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcbaragr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcbaragr_impl.class ));
   }

   public wcbaragr_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV18EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18EmprCod", AV18EmprCod);
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
               AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV18EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV10BarCodReo),AV8BarCodPar});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_22 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_22"))) ;
      nGXsfl_22_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_22_idx"))) ;
      sGXsfl_22_idx = httpContext.GetPar( "sGXsfl_22_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV18EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV44TFBarAGrHdr = httpContext.GetPar( "TFBarAGrHdr") ;
      AV45TFBarAGrHdr_Sel = httpContext.GetPar( "TFBarAGrHdr_Sel") ;
      AV50TFKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr"), ".") ;
      AV51TFKgmAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr_To"), ".") ;
      AV54TFPieAgr = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr"))) ;
      AV55TFPieAgr_To = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr_To"))) ;
      AV52TFMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr"), ".") ;
      AV53TFMtrAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr_To"), ".") ;
      AV143Pgmname = httpContext.GetPar( "Pgmname") ;
      AV35OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV37OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV131Wcbaragrds_1_emprcod = httpContext.GetPar( "Wcbaragrds_1_emprcod") ;
      AV132Wcbaragrds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Wcbaragrds_2_barcod"))) ;
      AV133Wcbaragrds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Wcbaragrds_3_barcodreo"))) ;
      AV134Wcbaragrds_4_barcodpar = httpContext.GetPar( "Wcbaragrds_4_barcodpar") ;
      AV77FasMin = (byte)(GXutil.lval( httpContext.GetPar( "FasMin"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18EmprCod, AV6BarCod, AV10BarCodReo, AV8BarCodPar, AV44TFBarAGrHdr, AV45TFBarAGrHdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV143Pgmname, AV35OrderedBy, AV37OrderedDsc, AV131Wcbaragrds_1_emprcod, AV132Wcbaragrds_2_barcod, AV133Wcbaragrds_3_barcodreo, AV134Wcbaragrds_4_barcodpar, AV77FasMin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1632( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( " HDRAGRUPADAS", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcbaragr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASMIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77FasMin), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_22", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_22, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18EmprCod", GXutil.rtrim( wcpOAV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarCodPar", GXutil.rtrim( wcpOAV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRHDR", GXutil.rtrim( AV44TFBarAGrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRHDR_SEL", GXutil.rtrim( AV45TFBarAGrHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFKGMAGR", GXutil.ltrim( localUtil.ntoc( AV50TFKgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFKGMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV51TFKgmAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPIEAGR", GXutil.ltrim( localUtil.ntoc( AV54TFPieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPIEAGR_TO", GXutil.ltrim( localUtil.ntoc( AV55TFPieAgr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMTRAGR", GXutil.ltrim( localUtil.ntoc( AV52TFMtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMTRAGR_TO", GXutil.ltrim( localUtil.ntoc( AV53TFMtrAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV143Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV35OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV37OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASMIN", GXutil.ltrim( localUtil.ntoc( AV77FasMin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASMIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77FasMin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD_SELECTED", GXutil.rtrim( AV19EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV7BarCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV11BarCodReo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR_SELECTED", GXutil.rtrim( AV9BarCodPar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGRCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV126BarAgrCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGRREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV127BarAgrReo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGRPAR_SELECTED", GXutil.rtrim( AV128BarAgrPar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCBARAGRDS_1_EMPRCOD", GXutil.rtrim( AV131Wcbaragrds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCBARAGRDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV132Wcbaragrds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCBARAGRDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV133Wcbaragrds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCBARAGRDS_4_BARCODPAR", GXutil.rtrim( AV134Wcbaragrds_4_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
   }

   public void renderHtmlCloseForm1632( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "WCBarAgr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " HDRAGRUPADAS", "") ;
   }

   public void wb1630( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcbaragr");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tableheader_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tableheader_cell_Class, "left", "top", "", "", "div");
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         startgridcontrol22( ) ;
      }
      if ( wbEnd == 22 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_22 = (int)(nGXsfl_22_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
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
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_44_1632( true) ;
      }
      else
      {
         wb_table1_44_1632( false) ;
      }
      return  ;
   }

   public void wb_table1_44_1632e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 22 )
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
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1632( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( " HDRAGRUPADAS", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup1630( ) ;
         }
      }
   }

   public void ws1632( )
   {
      start1632( ) ;
      evt1632( ) ;
   }

   public void evt1632( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111632 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121632 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131632 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETE.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141632 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
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
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1630( ) ;
                           }
                           nGXsfl_22_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_22_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_22_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_222( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV24GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13695BarAGrHdr = httpContext.cgiGet( edtBarAGrHdr_Internalname) ;
                           A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
                           A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
                           A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
                           A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e151632 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e161632 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e171632 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1630( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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

   public void we1632( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1632( ) ;
         }
      }
   }

   public void pa1632( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
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
      subsflControlProps_222( ) ;
      while ( nGXsfl_22_idx <= nRC_GXsfl_22 )
      {
         sendrow_222( ) ;
         nGXsfl_22_idx = ((subGrid_Islastpage==1)&&(nGXsfl_22_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_22_idx+1) ;
         sGXsfl_22_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_22_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_222( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV18EmprCod ,
                                 int AV6BarCod ,
                                 byte AV10BarCodReo ,
                                 String AV8BarCodPar ,
                                 String AV44TFBarAGrHdr ,
                                 String AV45TFBarAGrHdr_Sel ,
                                 java.math.BigDecimal AV50TFKgmAgr ,
                                 java.math.BigDecimal AV51TFKgmAgr_To ,
                                 short AV54TFPieAgr ,
                                 short AV55TFPieAgr_To ,
                                 java.math.BigDecimal AV52TFMtrAgr ,
                                 java.math.BigDecimal AV53TFMtrAgr_To ,
                                 String AV143Pgmname ,
                                 short AV35OrderedBy ,
                                 boolean AV37OrderedDsc ,
                                 String AV131Wcbaragrds_1_emprcod ,
                                 int AV132Wcbaragrds_2_barcod ,
                                 byte AV133Wcbaragrds_3_barcodreo ,
                                 String AV134Wcbaragrds_4_barcodpar ,
                                 byte AV77FasMin ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161632 ();
      GRID_nCurrentRecord = 0 ;
      rf1632( ) ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1632( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV143Pgmname = "WCBarAgr" ;
      Gx_err = (short)(0) ;
   }

   public void rf1632( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(22) ;
      /* Execute user event: Refresh */
      e161632 ();
      nGXsfl_22_idx = 1 ;
      sGXsfl_22_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_22_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_222( ) ;
      bGXsfl_22_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_222( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV136Wcbaragrds_6_tfbaragrhdr_sel ,
                                              AV135Wcbaragrds_5_tfbaragrhdr ,
                                              AV137Wcbaragrds_7_tfkgmagr ,
                                              AV138Wcbaragrds_8_tfkgmagr_to ,
                                              Short.valueOf(AV139Wcbaragrds_9_tfpieagr) ,
                                              Short.valueOf(AV140Wcbaragrds_10_tfpieagr_to) ,
                                              AV141Wcbaragrds_11_tfmtragr ,
                                              AV142Wcbaragrds_12_tfmtragr_to ,
                                              Integer.valueOf(A119BarAgrCod) ,
                                              Byte.valueOf(A124BarAgrReo) ,
                                              A122BarAgrPar ,
                                              A590KgmAgr ,
                                              Short.valueOf(A671PieAgr) ,
                                              A869MtrAgr ,
                                              Short.valueOf(AV35OrderedBy) ,
                                              Boolean.valueOf(AV37OrderedDsc) ,
                                              AV131Wcbaragrds_1_emprcod ,
                                              Integer.valueOf(AV132Wcbaragrds_2_barcod) ,
                                              Byte.valueOf(AV133Wcbaragrds_3_barcodreo) ,
                                              AV134Wcbaragrds_4_barcodpar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV135Wcbaragrds_5_tfbaragrhdr = GXutil.padr( GXutil.rtrim( AV135Wcbaragrds_5_tfbaragrhdr), 10, "%") ;
         /* Using cursor H01632 */
         pr_default.execute(0, new Object[] {AV131Wcbaragrds_1_emprcod, Integer.valueOf(AV132Wcbaragrds_2_barcod), Byte.valueOf(AV133Wcbaragrds_3_barcodreo), AV134Wcbaragrds_4_barcodpar, lV135Wcbaragrds_5_tfbaragrhdr, AV136Wcbaragrds_6_tfbaragrhdr_sel, AV137Wcbaragrds_7_tfkgmagr, AV138Wcbaragrds_8_tfkgmagr_to, Short.valueOf(AV139Wcbaragrds_9_tfpieagr), Short.valueOf(AV140Wcbaragrds_10_tfpieagr_to), AV141Wcbaragrds_11_tfmtragr, AV142Wcbaragrds_12_tfmtragr_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_22_idx = 1 ;
         sGXsfl_22_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_22_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_222( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A869MtrAgr = H01632_A869MtrAgr[0] ;
            A671PieAgr = H01632_A671PieAgr[0] ;
            A590KgmAgr = H01632_A590KgmAgr[0] ;
            A213BarSit = H01632_A213BarSit[0] ;
            A130BarCodPar = H01632_A130BarCodPar[0] ;
            A132BarCodReo = H01632_A132BarCodReo[0] ;
            A129BarCod = H01632_A129BarCod[0] ;
            A396EmprCod = H01632_A396EmprCod[0] ;
            A122BarAgrPar = H01632_A122BarAgrPar[0] ;
            A124BarAgrReo = H01632_A124BarAgrReo[0] ;
            A119BarAgrCod = H01632_A119BarAgrCod[0] ;
            A213BarSit = H01632_A213BarSit[0] ;
            A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
            A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            e171632 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(22) ;
         wb1630( ) ;
      }
      bGXsfl_22_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1632( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV143Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV143Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASMIN", GXutil.ltrim( localUtil.ntoc( AV77FasMin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASMIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77FasMin), "9")));
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
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV136Wcbaragrds_6_tfbaragrhdr_sel ,
                                           AV135Wcbaragrds_5_tfbaragrhdr ,
                                           AV137Wcbaragrds_7_tfkgmagr ,
                                           AV138Wcbaragrds_8_tfkgmagr_to ,
                                           Short.valueOf(AV139Wcbaragrds_9_tfpieagr) ,
                                           Short.valueOf(AV140Wcbaragrds_10_tfpieagr_to) ,
                                           AV141Wcbaragrds_11_tfmtragr ,
                                           AV142Wcbaragrds_12_tfmtragr_to ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A869MtrAgr ,
                                           Short.valueOf(AV35OrderedBy) ,
                                           Boolean.valueOf(AV37OrderedDsc) ,
                                           AV131Wcbaragrds_1_emprcod ,
                                           Integer.valueOf(AV132Wcbaragrds_2_barcod) ,
                                           Byte.valueOf(AV133Wcbaragrds_3_barcodreo) ,
                                           AV134Wcbaragrds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV135Wcbaragrds_5_tfbaragrhdr = GXutil.padr( GXutil.rtrim( AV135Wcbaragrds_5_tfbaragrhdr), 10, "%") ;
      /* Using cursor H01633 */
      pr_default.execute(1, new Object[] {AV131Wcbaragrds_1_emprcod, Integer.valueOf(AV132Wcbaragrds_2_barcod), Byte.valueOf(AV133Wcbaragrds_3_barcodreo), AV134Wcbaragrds_4_barcodpar, lV135Wcbaragrds_5_tfbaragrhdr, AV136Wcbaragrds_6_tfbaragrhdr_sel, AV137Wcbaragrds_7_tfkgmagr, AV138Wcbaragrds_8_tfkgmagr_to, Short.valueOf(AV139Wcbaragrds_9_tfpieagr), Short.valueOf(AV140Wcbaragrds_10_tfpieagr_to), AV141Wcbaragrds_11_tfmtragr, AV142Wcbaragrds_12_tfmtragr_to});
      GRID_nRecordCount = H01633_AGRID_nRecordCount[0] ;
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
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18EmprCod, AV6BarCod, AV10BarCodReo, AV8BarCodPar, AV44TFBarAGrHdr, AV45TFBarAGrHdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV143Pgmname, AV35OrderedBy, AV37OrderedDsc, AV131Wcbaragrds_1_emprcod, AV132Wcbaragrds_2_barcod, AV133Wcbaragrds_3_barcodreo, AV134Wcbaragrds_4_barcodpar, AV77FasMin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18EmprCod, AV6BarCod, AV10BarCodReo, AV8BarCodPar, AV44TFBarAGrHdr, AV45TFBarAGrHdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV143Pgmname, AV35OrderedBy, AV37OrderedDsc, AV131Wcbaragrds_1_emprcod, AV132Wcbaragrds_2_barcod, AV133Wcbaragrds_3_barcodreo, AV134Wcbaragrds_4_barcodpar, AV77FasMin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18EmprCod, AV6BarCod, AV10BarCodReo, AV8BarCodPar, AV44TFBarAGrHdr, AV45TFBarAGrHdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV143Pgmname, AV35OrderedBy, AV37OrderedDsc, AV131Wcbaragrds_1_emprcod, AV132Wcbaragrds_2_barcod, AV133Wcbaragrds_3_barcodreo, AV134Wcbaragrds_4_barcodpar, AV77FasMin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18EmprCod, AV6BarCod, AV10BarCodReo, AV8BarCodPar, AV44TFBarAGrHdr, AV45TFBarAGrHdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV143Pgmname, AV35OrderedBy, AV37OrderedDsc, AV131Wcbaragrds_1_emprcod, AV132Wcbaragrds_2_barcod, AV133Wcbaragrds_3_barcodreo, AV134Wcbaragrds_4_barcodpar, AV77FasMin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18EmprCod, AV6BarCod, AV10BarCodReo, AV8BarCodPar, AV44TFBarAGrHdr, AV45TFBarAGrHdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV143Pgmname, AV35OrderedBy, AV37OrderedDsc, AV131Wcbaragrds_1_emprcod, AV132Wcbaragrds_2_barcod, AV133Wcbaragrds_3_barcodreo, AV134Wcbaragrds_4_barcodpar, AV77FasMin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV143Pgmname = "WCBarAgr" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1630( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151632 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_22 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_22"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV18EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV18EmprCod") ;
         wcpOAV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV8BarCodPar") ;
         AV19EmprCod_Selected = httpContext.cgiGet( sPrefix+"vEMPRCOD_SELECTED") ;
         AV7BarCod_Selected = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV11BarCodReo_Selected = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODREO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV9BarCodPar_Selected = httpContext.cgiGet( sPrefix+"vBARCODPAR_SELECTED") ;
         AV126BarAgrCod_Selected = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARAGRCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV127BarAgrReo_Selected = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARAGRREO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV128BarAgrPar_Selected = httpContext.cgiGet( sPrefix+"vBARAGRPAR_SELECTED") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_delete_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Title") ;
         Dvelop_confirmpanel_delete_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmationtext") ;
         Dvelop_confirmpanel_delete_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_delete_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption") ;
         Dvelop_confirmpanel_delete_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_delete_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition") ;
         Dvelop_confirmpanel_delete_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_delete_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DELETE_Result") ;
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
      e151632 ();
      if (returnInSub) return;
   }

   public void e151632( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      GXv_char2[0] = AV12BuscarEmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcbaragr_impl.this.AV12BuscarEmprCod = GXv_char2[0] ;
      wcbaragr_impl.this.AV20EmprNom = GXv_char3[0] ;
      wcbaragr_impl.this.AV59UsurCod = GXv_char4[0] ;
      GXt_int5 = AV77FasMin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV12BuscarEmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int6) ;
      wcbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV77FasMin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77FasMin", GXutil.str( AV77FasMin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASMIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77FasMin), "9")));
      GXt_char1 = AV41Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wcbaragr_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41Station = GXt_char1 ;
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char2[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char4, GXv_char3, GXv_char2) ;
      wcbaragr_impl.this.AV18EmprCod = GXv_char4[0] ;
      wcbaragr_impl.this.AV20EmprNom = GXv_char3[0] ;
      wcbaragr_impl.this.AV59UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18EmprCod", AV18EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV35OrderedBy < 1 )
      {
         AV35OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161632( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV60WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV60WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      AV131Wcbaragrds_1_emprcod = AV18EmprCod ;
      AV132Wcbaragrds_2_barcod = AV6BarCod ;
      AV133Wcbaragrds_3_barcodreo = AV10BarCodReo ;
      AV134Wcbaragrds_4_barcodpar = AV8BarCodPar ;
      AV135Wcbaragrds_5_tfbaragrhdr = AV44TFBarAGrHdr ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = AV45TFBarAGrHdr_Sel ;
      AV137Wcbaragrds_7_tfkgmagr = AV50TFKgmAgr ;
      AV138Wcbaragrds_8_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV139Wcbaragrds_9_tfpieagr = AV54TFPieAgr ;
      AV140Wcbaragrds_10_tfpieagr_to = AV55TFPieAgr_To ;
      AV141Wcbaragrds_11_tfmtragr = AV52TFMtrAgr ;
      AV142Wcbaragrds_12_tfmtragr_to = AV53TFMtrAgr_To ;
      /*  Sending Event outputs  */
   }

   public void e111632( )
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
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e121632( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131632( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV35OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
         AV37OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedDsc", AV37OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAGrHdr") == 0 )
         {
            AV44TFBarAGrHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarAGrHdr", AV44TFBarAGrHdr);
            AV45TFBarAGrHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarAGrHdr_Sel", AV45TFBarAGrHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "KgmAgr") == 0 )
         {
            AV50TFKgmAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFKgmAgr", GXutil.ltrimstr( AV50TFKgmAgr, 9, 2));
            AV51TFKgmAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFKgmAgr_To", GXutil.ltrimstr( AV51TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PieAgr") == 0 )
         {
            AV54TFPieAgr = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPieAgr), 4, 0));
            AV55TFPieAgr_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPieAgr_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MtrAgr") == 0 )
         {
            AV52TFMtrAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMtrAgr", GXutil.ltrimstr( AV52TFMtrAgr, 9, 2));
            AV53TFMtrAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMtrAgr_To", GXutil.ltrimstr( AV53TFMtrAgr_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171632( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Hoja de Ruta", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(22) ;
      }
      sendrow_222( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_22_Refreshing )
      {
         httpContext.doAjaxLoad(22, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV24GridActions, 4, 0)) );
   }

   public void e141632( )
   {
      /* Dvelop_confirmpanel_delete_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_delete_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETE' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV35OrderedBy, 4, 0))+":"+(AV37OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tbaragr", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.hdragrupadas", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A119BarAgrCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A124BarAgrReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A122BarAgrPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarAgrCod","BarAgrReo","BarAgrPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S172( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      AV19EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19EmprCod_Selected", AV19EmprCod_Selected);
      AV7BarCod_Selected = A129BarCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod_Selected), 8, 0));
      AV11BarCodReo_Selected = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodReo_Selected", GXutil.str( AV11BarCodReo_Selected, 1, 0));
      AV9BarCodPar_Selected = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCodPar_Selected", AV9BarCodPar_Selected);
      AV126BarAgrCod_Selected = A119BarAgrCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126BarAgrCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126BarAgrCod_Selected), 8, 0));
      AV127BarAgrReo_Selected = A124BarAgrReo ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127BarAgrReo_Selected", GXutil.str( AV127BarAgrReo_Selected, 1, 0));
      AV128BarAgrPar_Selected = A122BarAgrPar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128BarAgrPar_Selected", AV128BarAgrPar_Selected);
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_DELETEContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION DELETE' Routine */
      returnInSub = false ;
      if ( AV77FasMin == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         new app.pelimin(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3) ;
         wcbaragr_impl.this.A396EmprCod = GXv_char4[0] ;
         wcbaragr_impl.this.A129BarCod = GXv_int10[0] ;
         wcbaragr_impl.this.A132BarCodReo = GXv_int6[0] ;
         wcbaragr_impl.this.A130BarCodPar = GXv_char3[0] ;
      }
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int11[0] = A119BarAgrCod ;
      GXv_int12[0] = A124BarAgrReo ;
      GXv_char2[0] = A122BarAgrPar ;
      GXv_char13[0] = "" ;
      GXv_char14[0] = "" ;
      new app.pelibar(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int11, GXv_int12, GXv_char2, GXv_char13, GXv_char14) ;
      wcbaragr_impl.this.A396EmprCod = GXv_char4[0] ;
      wcbaragr_impl.this.A129BarCod = GXv_int10[0] ;
      wcbaragr_impl.this.A132BarCodReo = GXv_int6[0] ;
      wcbaragr_impl.this.A130BarCodPar = GXv_char3[0] ;
      wcbaragr_impl.this.A119BarAgrCod = GXv_int11[0] ;
      wcbaragr_impl.this.A124BarAgrReo = GXv_int12[0] ;
      wcbaragr_impl.this.A122BarAgrPar = GXv_char2[0] ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.hdragrupadas", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV19EmprCod_Selected)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCod_Selected,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo_Selected,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarCodPar_Selected)),GXutil.URLEncode(GXutil.ltrimstr(AV126BarAgrCod_Selected,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV127BarAgrReo_Selected,1,0)),GXutil.URLEncode(GXutil.rtrim(AV128BarAgrPar_Selected))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarAgrCod","BarAgrReo","BarAgrPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue(AV143Pgmname+"GridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV143Pgmname+"GridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV40Session.getValue(AV143Pgmname+"GridState"), null, null);
      }
      AV35OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
      AV37OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedDsc", AV37OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV144GXV1 = 1 ;
      while ( AV144GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV144GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRHDR") == 0 )
         {
            AV44TFBarAGrHdr = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarAGrHdr", AV44TFBarAGrHdr);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRHDR_SEL") == 0 )
         {
            AV45TFBarAGrHdr_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarAGrHdr_Sel", AV45TFBarAGrHdr_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV50TFKgmAgr = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFKgmAgr", GXutil.ltrimstr( AV50TFKgmAgr, 9, 2));
            AV51TFKgmAgr_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFKgmAgr_To", GXutil.ltrimstr( AV51TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV54TFPieAgr = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPieAgr), 4, 0));
            AV55TFPieAgr_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPieAgr_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV52TFMtrAgr = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMtrAgr", GXutil.ltrimstr( AV52TFMtrAgr, 9, 2));
            AV53TFMtrAgr_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMtrAgr_To", GXutil.ltrimstr( AV53TFMtrAgr_To, 9, 2));
         }
         AV144GXV1 = (int)(AV144GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFBarAGrHdr_Sel)==0), AV45TFBarAGrHdr_Sel, GXv_char14) ;
      wcbaragr_impl.this.GXt_char1 = GXv_char14[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFBarAGrHdr)==0), AV44TFBarAGrHdr, GXv_char14) ;
      wcbaragr_impl.this.GXt_char1 = GXv_char14[0] ;
      Ddo_grid_Filteredtext_set = GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFKgmAgr)==0) ? "" : GXutil.str( AV50TFKgmAgr, 9, 2))+"|"+((0==AV54TFPieAgr) ? "" : GXutil.str( AV54TFPieAgr, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMtrAgr)==0) ? "" : GXutil.str( AV52TFMtrAgr, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFKgmAgr_To)==0) ? "" : GXutil.str( AV51TFKgmAgr_To, 9, 2))+"|"+((0==AV55TFPieAgr_To) ? "" : GXutil.str( AV55TFPieAgr_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMtrAgr_To)==0) ? "" : GXutil.str( AV53TFMtrAgr_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV27GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV27GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV27GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV27GridState.fromxml(AV40Session.getValue(AV143Pgmname+"GridState"), null, null);
      AV27GridState.setgxTv_SdtWWPGridState_Orderedby( AV35OrderedBy );
      AV27GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV37OrderedDsc );
      AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARAGRHDR", "", !(GXutil.strcmp("", AV44TFBarAGrHdr)==0), (short)(0), AV44TFBarAGrHdr, "", !(GXutil.strcmp("", AV45TFBarAGrHdr_Sel)==0), AV45TFBarAGrHdr_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFKGMAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFKgmAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFKgmAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFKgmAgr, 9, 2)), GXutil.trim( GXutil.str( AV51TFKgmAgr_To, 9, 2))) ;
      AV27GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPIEAGR", "", !((0==AV54TFPieAgr)&&(0==AV55TFPieAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFPieAgr, 4, 0)), GXutil.trim( GXutil.str( AV55TFPieAgr_To, 4, 0))) ;
      AV27GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFMTRAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMtrAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMtrAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFMtrAgr, 9, 2)), GXutil.trim( GXutil.str( AV53TFMtrAgr_To, 9, 2))) ;
      AV27GridState = GXv_SdtWWPGridState15[0] ;
      if ( ! (GXutil.strcmp("", AV18EmprCod)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV18EmprCod );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV6BarCod) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6BarCod, 8, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV10BarCodReo) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10BarCodReo, 1, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8BarCodPar)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8BarCodPar );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      AV27GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV27GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV143Pgmname+"GridState", AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV56TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV143Pgmname );
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV29HTTPRequest.getScriptName()+"?"+AV29HTTPRequest.getQuerystring() );
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HDRAGRUPADAS" );
      AV57TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV18EmprCod );
      AV56TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV57TrnContextAtt, 0);
      AV57TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV6BarCod, 8, 0) );
      AV56TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV57TrnContextAtt, 0);
      AV57TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV10BarCodReo, 1, 0) );
      AV56TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV57TrnContextAtt, 0);
      AV57TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV57TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV8BarCodPar );
      AV56TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV57TrnContextAtt, 0);
      AV40Session.setValue("TrnContext", AV56TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 0 > 1 ) ) )
      {
         divDvpanel_tableheader_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tableheader_cell_Internalname, "Class", divDvpanel_tableheader_cell_Class, true);
      }
      else
      {
         divDvpanel_tableheader_cell_Class = "col-xs-12 WWFiltersCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tableheader_cell_Internalname, "Class", divDvpanel_tableheader_cell_Class, true);
      }
   }

   public void wb_table1_44_1632( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_delete_Internalname, tblTabledvelop_confirmpanel_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_delete.setProperty("Title", Dvelop_confirmpanel_delete_Title);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_delete_Yesbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_delete_Nobuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_delete_Cancelbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_delete_Yesbuttonposition);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmType", Dvelop_confirmpanel_delete_Confirmtype);
         ucDvelop_confirmpanel_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_delete_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_DELETEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_44_1632e( true) ;
      }
      else
      {
         wb_table1_44_1632e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV18EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18EmprCod", AV18EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      AV8BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
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
      pa1632( ) ;
      ws1632( ) ;
      we1632( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV18EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV10BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1632( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcbaragr", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1632( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV18EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18EmprCod", AV18EmprCod);
         AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
         AV8BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
      }
      wcpOAV18EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV18EmprCod") ;
      wcpOAV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV8BarCodPar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV18EmprCod, wcpOAV18EmprCod) != 0 ) || ( AV6BarCod != wcpOAV6BarCod ) || ( AV10BarCodReo != wcpOAV10BarCodReo ) || ( GXutil.strcmp(AV8BarCodPar, wcpOAV8BarCodPar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV18EmprCod = AV18EmprCod ;
      wcpOAV6BarCod = AV6BarCod ;
      wcpOAV10BarCodReo = AV10BarCodReo ;
      wcpOAV8BarCodPar = AV8BarCodPar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV18EmprCod = httpContext.cgiGet( sPrefix+"AV18EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV18EmprCod) > 0 )
      {
         AV18EmprCod = httpContext.cgiGet( sCtrlAV18EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18EmprCod", AV18EmprCod);
      }
      else
      {
         AV18EmprCod = httpContext.cgiGet( sPrefix+"AV18EmprCod_PARM") ;
      }
      sCtrlAV6BarCod = httpContext.cgiGet( sPrefix+"AV6BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarCod) > 0 )
      {
         AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      }
      else
      {
         AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10BarCodReo = httpContext.cgiGet( sPrefix+"AV10BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarCodReo) > 0 )
      {
         AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      }
      else
      {
         AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8BarCodPar = httpContext.cgiGet( sPrefix+"AV8BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarCodPar) > 0 )
      {
         AV8BarCodPar = httpContext.cgiGet( sCtrlAV8BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarCodPar", AV8BarCodPar);
      }
      else
      {
         AV8BarCodPar = httpContext.cgiGet( sPrefix+"AV8BarCodPar_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa1632( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1632( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws1632( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18EmprCod_PARM", GXutil.rtrim( AV18EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18EmprCod_CTRL", GXutil.rtrim( sCtrlAV18EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCod_CTRL", GXutil.rtrim( sCtrlAV6BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodReo_CTRL", GXutil.rtrim( sCtrlAV10BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodPar_PARM", GXutil.rtrim( AV8BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarCodPar_CTRL", GXutil.rtrim( sCtrlAV8BarCodPar));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we1632( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211681630", true, true);
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
      httpContext.AddJavascriptSource("wcbaragr.js", "?20268211681631", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_222( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_22_idx );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_22_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_22_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_22_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_22_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_22_idx ;
      edtBarAGrHdr_Internalname = sPrefix+"BARAGRHDR_"+sGXsfl_22_idx ;
      edtBarAgrCod_Internalname = sPrefix+"BARAGRCOD_"+sGXsfl_22_idx ;
      edtBarAgrReo_Internalname = sPrefix+"BARAGRREO_"+sGXsfl_22_idx ;
      edtBarAgrPar_Internalname = sPrefix+"BARAGRPAR_"+sGXsfl_22_idx ;
      edtKgmAgr_Internalname = sPrefix+"KGMAGR_"+sGXsfl_22_idx ;
      edtPieAgr_Internalname = sPrefix+"PIEAGR_"+sGXsfl_22_idx ;
      edtMtrAgr_Internalname = sPrefix+"MTRAGR_"+sGXsfl_22_idx ;
      edtBarAgrNhdr_Internalname = sPrefix+"BARAGRNHDR_"+sGXsfl_22_idx ;
   }

   public void subsflControlProps_fel_222( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_22_fel_idx );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_22_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_22_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_22_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_22_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_22_fel_idx ;
      edtBarAGrHdr_Internalname = sPrefix+"BARAGRHDR_"+sGXsfl_22_fel_idx ;
      edtBarAgrCod_Internalname = sPrefix+"BARAGRCOD_"+sGXsfl_22_fel_idx ;
      edtBarAgrReo_Internalname = sPrefix+"BARAGRREO_"+sGXsfl_22_fel_idx ;
      edtBarAgrPar_Internalname = sPrefix+"BARAGRPAR_"+sGXsfl_22_fel_idx ;
      edtKgmAgr_Internalname = sPrefix+"KGMAGR_"+sGXsfl_22_fel_idx ;
      edtPieAgr_Internalname = sPrefix+"PIEAGR_"+sGXsfl_22_fel_idx ;
      edtMtrAgr_Internalname = sPrefix+"MTRAGR_"+sGXsfl_22_fel_idx ;
      edtBarAgrNhdr_Internalname = sPrefix+"BARAGRNHDR_"+sGXsfl_22_fel_idx ;
   }

   public void sendrow_222( )
   {
      subsflControlProps_222( ) ;
      wb1630( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_22_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_22_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_22_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 23,'"+sPrefix+"',false,'"+sGXsfl_22_idx+"',22)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_22_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV24GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV24GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV24GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e181632_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,23);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV24GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_22_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAGrHdr_Internalname,GXutil.rtrim( A13695BarAGrHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAGrHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgmAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKgmAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPieAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A869MtrAgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMtrAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(22),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1632( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_22_idx = ((subGrid_Islastpage==1)&&(nGXsfl_22_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_22_idx+1) ;
         sGXsfl_22_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_22_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_222( ) ;
      }
      /* End function sendrow_222 */
   }

   public void startgridcontrol22( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"22\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr Agrupada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr Agrupada", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13695BarAGrHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A122BarAgrPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      divDvpanel_tableheader_cell_Internalname = sPrefix+"DVPANEL_TABLEHEADER_CELL" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarAGrHdr_Internalname = sPrefix+"BARAGRHDR" ;
      edtBarAgrCod_Internalname = sPrefix+"BARAGRCOD" ;
      edtBarAgrReo_Internalname = sPrefix+"BARAGRREO" ;
      edtBarAgrPar_Internalname = sPrefix+"BARAGRPAR" ;
      edtKgmAgr_Internalname = sPrefix+"KGMAGR" ;
      edtPieAgr_Internalname = sPrefix+"PIEAGR" ;
      edtMtrAgr_Internalname = sPrefix+"MTRAGR" ;
      edtBarAgrNhdr_Internalname = sPrefix+"BARAGRNHDR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_delete_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_DELETE" ;
      tblTabledvelop_confirmpanel_delete_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_DELETE" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtBarAgrNhdr_Jsonclick = "" ;
      edtMtrAgr_Jsonclick = "" ;
      edtPieAgr_Jsonclick = "" ;
      edtKgmAgr_Jsonclick = "" ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      edtBarAGrHdr_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      divDvpanel_tableheader_cell_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_delete_Confirmationtext = "¿Confirma Eliminación Hoja de Ruta?" ;
      Dvelop_confirmpanel_delete_Title = httpContext.getMessage( "Confirmar", "") ;
      Ddo_grid_Datalistproc = "WCBarAgrGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||" ;
      Ddo_grid_Includedatalist = "T|||" ;
      Ddo_grid_Filterisrange = "|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3" ;
      Ddo_grid_Columnids = "6:BarAGrHdr|10:KgmAgr|11:PieAgr|12:MtrAgr" ;
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
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_22_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV131Wcbaragrds_1_emprcod',fld:'vWCBARAGRDS_1_EMPRCOD',pic:'@!'},{av:'AV132Wcbaragrds_2_barcod',fld:'vWCBARAGRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV133Wcbaragrds_3_barcodreo',fld:'vWCBARAGRDS_3_BARCODREO',pic:'9'},{av:'AV134Wcbaragrds_4_barcodpar',fld:'vWCBARAGRDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44TFBarAGrHdr',fld:'vTFBARAGRHDR',pic:''},{av:'AV45TFBarAGrHdr_Sel',fld:'vTFBARAGRHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV143Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FasMin',fld:'vFASMIN',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111632',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44TFBarAGrHdr',fld:'vTFBARAGRHDR',pic:''},{av:'AV45TFBarAGrHdr_Sel',fld:'vTFBARAGRHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV143Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131Wcbaragrds_1_emprcod',fld:'vWCBARAGRDS_1_EMPRCOD',pic:'@!'},{av:'AV132Wcbaragrds_2_barcod',fld:'vWCBARAGRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV133Wcbaragrds_3_barcodreo',fld:'vWCBARAGRDS_3_BARCODREO',pic:'9'},{av:'AV134Wcbaragrds_4_barcodpar',fld:'vWCBARAGRDS_4_BARCODPAR',pic:''},{av:'AV77FasMin',fld:'vFASMIN',pic:'9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121632',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44TFBarAGrHdr',fld:'vTFBARAGRHDR',pic:''},{av:'AV45TFBarAGrHdr_Sel',fld:'vTFBARAGRHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV143Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131Wcbaragrds_1_emprcod',fld:'vWCBARAGRDS_1_EMPRCOD',pic:'@!'},{av:'AV132Wcbaragrds_2_barcod',fld:'vWCBARAGRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV133Wcbaragrds_3_barcodreo',fld:'vWCBARAGRDS_3_BARCODREO',pic:'9'},{av:'AV134Wcbaragrds_4_barcodpar',fld:'vWCBARAGRDS_4_BARCODPAR',pic:''},{av:'AV77FasMin',fld:'vFASMIN',pic:'9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131632',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44TFBarAGrHdr',fld:'vTFBARAGRHDR',pic:''},{av:'AV45TFBarAGrHdr_Sel',fld:'vTFBARAGRHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV143Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131Wcbaragrds_1_emprcod',fld:'vWCBARAGRDS_1_EMPRCOD',pic:'@!'},{av:'AV132Wcbaragrds_2_barcod',fld:'vWCBARAGRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV133Wcbaragrds_3_barcodreo',fld:'vWCBARAGRDS_3_BARCODREO',pic:'9'},{av:'AV134Wcbaragrds_4_barcodpar',fld:'vWCBARAGRDS_4_BARCODPAR',pic:''},{av:'AV77FasMin',fld:'vFASMIN',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFBarAGrHdr',fld:'vTFBARAGRHDR',pic:''},{av:'AV45TFBarAGrHdr_Sel',fld:'vTFBARAGRHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171632',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV24GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e181632',iparms:[{av:'cmbavGridactions'},{av:'AV24GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV24GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'AV19EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV7BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV9BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV126BarAgrCod_Selected',fld:'vBARAGRCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV127BarAgrReo_Selected',fld:'vBARAGRREO_SELECTED',pic:'9'},{av:'AV128BarAgrPar_Selected',fld:'vBARAGRPAR_SELECTED',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE","{handler:'e141632',iparms:[{av:'Dvelop_confirmpanel_delete_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44TFBarAGrHdr',fld:'vTFBARAGRHDR',pic:''},{av:'AV45TFBarAGrHdr_Sel',fld:'vTFBARAGRHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV143Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131Wcbaragrds_1_emprcod',fld:'vWCBARAGRDS_1_EMPRCOD',pic:'@!'},{av:'AV132Wcbaragrds_2_barcod',fld:'vWCBARAGRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV133Wcbaragrds_3_barcodreo',fld:'vWCBARAGRDS_3_BARCODREO',pic:'9'},{av:'AV134Wcbaragrds_4_barcodpar',fld:'vWCBARAGRDS_4_BARCODPAR',pic:''},{av:'AV77FasMin',fld:'vFASMIN',pic:'9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV19EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV7BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV9BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV126BarAgrCod_Selected',fld:'vBARAGRCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV127BarAgrReo_Selected',fld:'vBARAGRREO_SELECTED',pic:'9'},{av:'AV128BarAgrPar_Selected',fld:'vBARAGRPAR_SELECTED',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'AV128BarAgrPar_Selected',fld:'vBARAGRPAR_SELECTED',pic:''},{av:'AV127BarAgrReo_Selected',fld:'vBARAGRREO_SELECTED',pic:'9'},{av:'AV126BarAgrCod_Selected',fld:'vBARAGRCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV9BarCodPar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV11BarCodReo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV7BarCod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV19EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baragrnhdr',iparms:[]");
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
      wcpOAV8BarCodPar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_delete_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV18EmprCod = "" ;
      AV8BarCodPar = "" ;
      AV44TFBarAGrHdr = "" ;
      AV45TFBarAGrHdr_Sel = "" ;
      AV50TFKgmAgr = DecimalUtil.ZERO ;
      AV51TFKgmAgr_To = DecimalUtil.ZERO ;
      AV52TFMtrAgr = DecimalUtil.ZERO ;
      AV53TFMtrAgr_To = DecimalUtil.ZERO ;
      AV143Pgmname = "" ;
      AV131Wcbaragrds_1_emprcod = "" ;
      AV134Wcbaragrds_4_barcodpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV19EmprCod_Selected = "" ;
      AV9BarCodPar_Selected = "" ;
      AV128BarAgrPar_Selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13695BarAGrHdr = "" ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A13792BarAgrNhdr = "" ;
      scmdbuf = "" ;
      lV135Wcbaragrds_5_tfbaragrhdr = "" ;
      AV136Wcbaragrds_6_tfbaragrhdr_sel = "" ;
      AV135Wcbaragrds_5_tfbaragrhdr = "" ;
      AV137Wcbaragrds_7_tfkgmagr = DecimalUtil.ZERO ;
      AV138Wcbaragrds_8_tfkgmagr_to = DecimalUtil.ZERO ;
      AV141Wcbaragrds_11_tfmtragr = DecimalUtil.ZERO ;
      AV142Wcbaragrds_12_tfmtragr_to = DecimalUtil.ZERO ;
      H01632_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01632_A671PieAgr = new short[1] ;
      H01632_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01632_A213BarSit = new byte[1] ;
      H01632_A130BarCodPar = new String[] {""} ;
      H01632_A132BarCodReo = new byte[1] ;
      H01632_A129BarCod = new int[1] ;
      H01632_A396EmprCod = new String[] {""} ;
      H01632_A122BarAgrPar = new String[] {""} ;
      H01632_A124BarAgrReo = new byte[1] ;
      H01632_A119BarAgrCod = new int[1] ;
      H01633_AGRID_nRecordCount = new long[1] ;
      AV41Station = "" ;
      AV12BuscarEmprCod = "" ;
      AV20EmprNom = "" ;
      AV59UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV60WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char13 = new String[1] ;
      AV40Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char14 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV56TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29HTTPRequest = httpContext.getHttpRequest();
      AV57TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDvelop_confirmpanel_delete = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV18EmprCod = "" ;
      sCtrlAV6BarCod = "" ;
      sCtrlAV10BarCodReo = "" ;
      sCtrlAV8BarCodPar = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcbaragr__default(),
         new Object[] {
             new Object[] {
            H01632_A869MtrAgr, H01632_A671PieAgr, H01632_A590KgmAgr, H01632_A213BarSit, H01632_A130BarCodPar, H01632_A132BarCodReo, H01632_A129BarCod, H01632_A396EmprCod, H01632_A122BarAgrPar, H01632_A124BarAgrReo,
            H01632_A119BarAgrCod
            }
            , new Object[] {
            H01633_AGRID_nRecordCount
            }
         }
      );
      AV143Pgmname = "WCBarAgr" ;
      /* GeneXus formulas. */
      AV143Pgmname = "WCBarAgr" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV10BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV10BarCodReo ;
   private byte AV133Wcbaragrds_3_barcodreo ;
   private byte AV77FasMin ;
   private byte AV11BarCodReo_Selected ;
   private byte AV127BarAgrReo_Selected ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A124BarAgrReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV54TFPieAgr ;
   private short AV55TFPieAgr_To ;
   private short AV35OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV24GridActions ;
   private short A671PieAgr ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV139Wcbaragrds_9_tfpieagr ;
   private short AV140Wcbaragrds_10_tfpieagr_to ;
   private int wcpOAV6BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_22 ;
   private int AV6BarCod ;
   private int nGXsfl_22_idx=1 ;
   private int AV132Wcbaragrds_2_barcod ;
   private int AV7BarCod_Selected ;
   private int AV126BarAgrCod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV38PageToGo ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int AV144GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV50TFKgmAgr ;
   private java.math.BigDecimal AV51TFKgmAgr_To ;
   private java.math.BigDecimal AV52TFMtrAgr ;
   private java.math.BigDecimal AV53TFMtrAgr_To ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV137Wcbaragrds_7_tfkgmagr ;
   private java.math.BigDecimal AV138Wcbaragrds_8_tfkgmagr_to ;
   private java.math.BigDecimal AV141Wcbaragrds_11_tfmtragr ;
   private java.math.BigDecimal AV142Wcbaragrds_12_tfmtragr_to ;
   private String wcpOAV18EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_delete_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV18EmprCod ;
   private String AV8BarCodPar ;
   private String sGXsfl_22_idx="0001" ;
   private String AV44TFBarAGrHdr ;
   private String AV45TFBarAGrHdr_Sel ;
   private String AV143Pgmname ;
   private String AV131Wcbaragrds_1_emprcod ;
   private String AV134Wcbaragrds_4_barcodpar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV19EmprCod_Selected ;
   private String AV9BarCodPar_Selected ;
   private String AV128BarAgrPar_Selected ;
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
   private String Dvelop_confirmpanel_delete_Title ;
   private String Dvelop_confirmpanel_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_delete_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divDvpanel_tableheader_cell_Internalname ;
   private String divDvpanel_tableheader_cell_Class ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarSit_Internalname ;
   private String A13695BarAGrHdr ;
   private String edtBarAGrHdr_Internalname ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String A122BarAgrPar ;
   private String edtBarAgrPar_Internalname ;
   private String edtKgmAgr_Internalname ;
   private String edtPieAgr_Internalname ;
   private String edtMtrAgr_Internalname ;
   private String A13792BarAgrNhdr ;
   private String edtBarAgrNhdr_Internalname ;
   private String scmdbuf ;
   private String lV135Wcbaragrds_5_tfbaragrhdr ;
   private String AV136Wcbaragrds_6_tfbaragrhdr_sel ;
   private String AV135Wcbaragrds_5_tfbaragrhdr ;
   private String AV41Station ;
   private String AV12BuscarEmprCod ;
   private String AV20EmprNom ;
   private String AV59UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char13[] ;
   private String GXt_char1 ;
   private String GXv_char14[] ;
   private String tblTabledvelop_confirmpanel_delete_Internalname ;
   private String Dvelop_confirmpanel_delete_Internalname ;
   private String sCtrlAV18EmprCod ;
   private String sCtrlAV6BarCod ;
   private String sCtrlAV10BarCodReo ;
   private String sCtrlAV8BarCodPar ;
   private String sGXsfl_22_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarAGrHdr_Jsonclick ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
   private String edtKgmAgr_Jsonclick ;
   private String edtPieAgr_Jsonclick ;
   private String edtMtrAgr_Jsonclick ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV37OrderedDsc ;
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
   private boolean bGXsfl_22_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV29HTTPRequest ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_delete ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H01632_A869MtrAgr ;
   private short[] H01632_A671PieAgr ;
   private java.math.BigDecimal[] H01632_A590KgmAgr ;
   private byte[] H01632_A213BarSit ;
   private String[] H01632_A130BarCodPar ;
   private byte[] H01632_A132BarCodReo ;
   private int[] H01632_A129BarCod ;
   private String[] H01632_A396EmprCod ;
   private String[] H01632_A122BarAgrPar ;
   private byte[] H01632_A124BarAgrReo ;
   private int[] H01632_A119BarAgrCod ;
   private long[] H01633_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV56TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV57TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV60WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class wcbaragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01632( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV136Wcbaragrds_6_tfbaragrhdr_sel ,
                                          String AV135Wcbaragrds_5_tfbaragrhdr ,
                                          java.math.BigDecimal AV137Wcbaragrds_7_tfkgmagr ,
                                          java.math.BigDecimal AV138Wcbaragrds_8_tfkgmagr_to ,
                                          short AV139Wcbaragrds_9_tfpieagr ,
                                          short AV140Wcbaragrds_10_tfpieagr_to ,
                                          java.math.BigDecimal AV141Wcbaragrds_11_tfmtragr ,
                                          java.math.BigDecimal AV142Wcbaragrds_12_tfmtragr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          short A671PieAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short AV35OrderedBy ,
                                          boolean AV37OrderedDsc ,
                                          String AV131Wcbaragrds_1_emprcod ,
                                          int AV132Wcbaragrds_2_barcod ,
                                          byte AV133Wcbaragrds_3_barcodreo ,
                                          String AV134Wcbaragrds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[17];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MtrAgr, T1.PieAgr, T1.KgmAgr, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarAgrPar, T1.BarAgrReo, T1.BarAgrCod" ;
      sFromString = " FROM (TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV136Wcbaragrds_6_tfbaragrhdr_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcbaragrds_5_tfbaragrhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrReo,'90'), 2))) || LPAD(RTRIM(T1.BarAgrPar),1,' ')) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcbaragrds_6_tfbaragrhdr_sel)==0) )
      {
         addWhere(sWhereString, "(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrReo,'90'), 2))) || LPAD(RTRIM(T1.BarAgrPar),1,' ') = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wcbaragrds_7_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(T1.KgmAgr >= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Wcbaragrds_8_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(T1.KgmAgr <= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (0==AV139Wcbaragrds_9_tfpieagr) )
      {
         addWhere(sWhereString, "(T1.PieAgr >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV140Wcbaragrds_10_tfpieagr_to) )
      {
         addWhere(sWhereString, "(T1.PieAgr <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Wcbaragrds_11_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(T1.MtrAgr >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Wcbaragrds_12_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(T1.MtrAgr <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ( AV35OrderedBy == 1 ) && ! AV37OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.KgmAgr" ;
      }
      else if ( ( AV35OrderedBy == 1 ) && ( AV37OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.KgmAgr DESC" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ! AV37OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PieAgr" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ( AV37OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.PieAgr DESC" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ! AV37OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MtrAgr" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ( AV37OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MtrAgr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrCod, T1.BarAgrReo, T1.BarAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01633( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV136Wcbaragrds_6_tfbaragrhdr_sel ,
                                          String AV135Wcbaragrds_5_tfbaragrhdr ,
                                          java.math.BigDecimal AV137Wcbaragrds_7_tfkgmagr ,
                                          java.math.BigDecimal AV138Wcbaragrds_8_tfkgmagr_to ,
                                          short AV139Wcbaragrds_9_tfpieagr ,
                                          short AV140Wcbaragrds_10_tfpieagr_to ,
                                          java.math.BigDecimal AV141Wcbaragrds_11_tfmtragr ,
                                          java.math.BigDecimal AV142Wcbaragrds_12_tfmtragr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          short A671PieAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short AV35OrderedBy ,
                                          boolean AV37OrderedDsc ,
                                          String AV131Wcbaragrds_1_emprcod ,
                                          int AV132Wcbaragrds_2_barcod ,
                                          byte AV133Wcbaragrds_3_barcodreo ,
                                          String AV134Wcbaragrds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[12];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV136Wcbaragrds_6_tfbaragrhdr_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcbaragrds_5_tfbaragrhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrReo,'90'), 2))) || LPAD(RTRIM(T1.BarAgrPar),1,' ')) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcbaragrds_6_tfbaragrhdr_sel)==0) )
      {
         addWhere(sWhereString, "(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarAgrReo,'90'), 2))) || LPAD(RTRIM(T1.BarAgrPar),1,' ') = ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wcbaragrds_7_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(T1.KgmAgr >= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Wcbaragrds_8_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(T1.KgmAgr <= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV139Wcbaragrds_9_tfpieagr) )
      {
         addWhere(sWhereString, "(T1.PieAgr >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV140Wcbaragrds_10_tfpieagr_to) )
      {
         addWhere(sWhereString, "(T1.PieAgr <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Wcbaragrds_11_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(T1.MtrAgr >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Wcbaragrds_12_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(T1.MtrAgr <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV35OrderedBy == 1 ) && ! AV37OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV35OrderedBy == 1 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ! AV37OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ! AV37OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ( AV37OrderedDsc ) )
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

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01632(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
            case 1 :
                  return conditional_H01633(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01632", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01633", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               return;
      }
   }

}

