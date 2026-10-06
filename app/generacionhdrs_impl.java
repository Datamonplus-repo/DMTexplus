package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class generacionhdrs_impl extends GXWebComponent
{
   public generacionhdrs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public generacionhdrs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionhdrs_impl.class ));
   }

   public generacionhdrs_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV6EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
               AV82DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82DisEst", GXutil.str( AV82DisEst, 1, 0));
               AV107BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarNHdr", AV107BarNHdr);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV6EmprCod,Byte.valueOf(AV82DisEst),AV107BarNHdr});
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV82DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
      AV30TFDisCod = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod"))) ;
      AV31TFDisCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod_To"))) ;
      AV32TFDisFec = localUtil.parseDateParm( httpContext.GetPar( "TFDisFec")) ;
      AV36TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV37TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV38TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV39TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV42TFDisPart = (short)(GXutil.lval( httpContext.GetPar( "TFDisPart"))) ;
      AV43TFDisPart_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisPart_To"))) ;
      AV44TFDisArtCod = httpContext.GetPar( "TFDisArtCod") ;
      AV45TFDisArtCod_Sel = httpContext.GetPar( "TFDisArtCod_Sel") ;
      AV46TFDisArtDsc = httpContext.GetPar( "TFDisArtDsc") ;
      AV47TFDisArtDsc_Sel = httpContext.GetPar( "TFDisArtDsc_Sel") ;
      AV48TFDisColNom = httpContext.GetPar( "TFDisColNom") ;
      AV49TFDisColNom_Sel = httpContext.GetPar( "TFDisColNom_Sel") ;
      AV50TFDisColNum = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum"))) ;
      AV51TFDisColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum_To"))) ;
      AV52TFDisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol"))) ;
      AV53TFDisTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol_To"))) ;
      AV54TFDisNomCli = httpContext.GetPar( "TFDisNomCli") ;
      AV55TFDisNomCli_Sel = httpContext.GetPar( "TFDisNomCli_Sel") ;
      AV56TFDisUniMed = httpContext.GetPar( "TFDisUniMed") ;
      AV57TFDisUniMed_Sel = httpContext.GetPar( "TFDisUniMed_Sel") ;
      AV58TFDisPiePie = (short)(GXutil.lval( httpContext.GetPar( "TFDisPiePie"))) ;
      AV59TFDisPiePie_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisPiePie_To"))) ;
      AV60TFDisPieKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieKgm"), ".") ;
      AV61TFDisPieKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieKgm_To"), ".") ;
      AV62TFDisPieMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieMtr"), ".") ;
      AV63TFDisPieMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieMtr_To"), ".") ;
      AV144Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV107BarNHdr = httpContext.GetPar( "BarNHdr") ;
      AV85TotDisPiePie = GXutil.lval( httpContext.GetPar( "TotDisPiePie")) ;
      AV87TotDisPieKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotDisPieKgm"), ".") ;
      AV89TotDisPieMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotDisPieMtr"), ".") ;
      A1202MacDisCod = (int)(GXutil.lval( httpContext.GetPar( "MacDisCod"))) ;
      A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV83Col_Discod);
      AV71MaqCod = httpContext.GetPar( "MaqCod") ;
      AV100Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV103Testrtm = (short)(GXutil.lval( httpContext.GetPar( "Testrtm"))) ;
      AV8UsurCod = httpContext.GetPar( "UsurCod") ;
      AV5Station = httpContext.GetPar( "Station") ;
      AV73Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV82DisEst, AV30TFDisCod, AV31TFDisCod_To, AV32TFDisFec, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV42TFDisPart, AV43TFDisPart_To, AV44TFDisArtCod, AV45TFDisArtCod_Sel, AV46TFDisArtDsc, AV47TFDisArtDsc_Sel, AV48TFDisColNom, AV49TFDisColNom_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDisTipCol, AV53TFDisTipCol_To, AV54TFDisNomCli, AV55TFDisNomCli_Sel, AV56TFDisUniMed, AV57TFDisUniMed_Sel, AV58TFDisPiePie, AV59TFDisPiePie_To, AV60TFDisPieKgm, AV61TFDisPieKgm_To, AV62TFDisPieMtr, AV63TFDisPieMtr_To, AV144Pgmname, AV17OrderedBy, AV18OrderedDsc, AV107BarNHdr, AV85TotDisPiePie, AV87TotDisPieKgm, AV89TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV83Col_Discod, AV71MaqCod, AV100Moda21, AV103Testrtm, AV8UsurCod, AV5Station, AV73Carvitin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa19U2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Pedidos", "")) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.generacionhdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV82DisEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV107BarNHdr))}, new String[] {"EmprCod","DisEst","BarNHdr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV144Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV85TotDisPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDisPieKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotDisPieMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103Testrtm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73Carvitin), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV66GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV67GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV64DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV64DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6EmprCod", GXutil.rtrim( wcpOAV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV82DisEst", GXutil.ltrim( localUtil.ntoc( wcpOAV82DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV107BarNHdr", GXutil.rtrim( wcpOAV107BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOD", GXutil.ltrim( localUtil.ntoc( AV30TFDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFDisCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISFEC", localUtil.dtoc( AV32TFDisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV38TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV39TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPART", GXutil.ltrim( localUtil.ntoc( AV42TFDisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPART_TO", GXutil.ltrim( localUtil.ntoc( AV43TFDisPart_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTCOD", GXutil.rtrim( AV44TFDisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTCOD_SEL", GXutil.rtrim( AV45TFDisArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTDSC", GXutil.rtrim( AV46TFDisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTDSC_SEL", GXutil.rtrim( AV47TFDisArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNOM", GXutil.rtrim( AV48TFDisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNOM_SEL", GXutil.rtrim( AV49TFDisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNUM", GXutil.ltrim( localUtil.ntoc( AV50TFDisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV51TFDisColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISTIPCOL", GXutil.ltrim( localUtil.ntoc( AV52TFDisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV53TFDisTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISNOMCLI", GXutil.rtrim( AV54TFDisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISNOMCLI_SEL", GXutil.rtrim( AV55TFDisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUNIMED", GXutil.rtrim( AV56TFDisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUNIMED_SEL", GXutil.rtrim( AV57TFDisUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEPIE", GXutil.ltrim( localUtil.ntoc( AV58TFDisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEPIE_TO", GXutil.ltrim( localUtil.ntoc( AV59TFDisPiePie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV60TFDisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEKGM_TO", GXutil.ltrim( localUtil.ntoc( AV61TFDisPieKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV62TFDisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEMTR_TO", GXutil.ltrim( localUtil.ntoc( AV63TFDisPieMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV144Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV144Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISEST", GXutil.ltrim( localUtil.ntoc( AV82DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISEST", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEPIE", GXutil.ltrim( localUtil.ntoc( AV85TotDisPiePie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV85TotDisPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV87TotDisPieKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDisPieKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV89TotDisPieMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotDisPieMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MACDISCOD", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MACCOD", GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISENCCLI", GXutil.rtrim( A4813DisEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISCLINUM", GXutil.rtrim( A360DisCliNum));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_DISCOD", AV83Col_Discod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_DISCOD", AV83Col_Discod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV71MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODP", GXutil.ltrim( localUtil.ntoc( AV72BarCodP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV100Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTESTRTM", GXutil.ltrim( localUtil.ntoc( AV103Testrtm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103Testrtm), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTABLAHDRS_SDT", AV104TablaHdrs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTABLAHDRS_SDT", AV104TablaHdrs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV5Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV73Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73Carvitin), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTABHDR", AV74TabHdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTABHDR", AV74TabHdr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_MACCOD", AV94Col_Maccod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_MACCOD", AV94Col_Maccod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV75i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINEAS", GXutil.ltrim( localUtil.ntoc( AV93lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Title", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Result", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Result", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Result));
   }

   public void renderHtmlCloseForm19U2( )
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
      return "GeneracionHDRs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Pedidos", "") ;
   }

   public void wb19U0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.generacionhdrs");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Accesorios", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_GeneracionHDRs.htm");
         wb_table1_18_19U2( true) ;
      }
      else
      {
         wb_table1_18_19U2( false) ;
      }
      return  ;
   }

   public void wb_table1_18_19U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Crear Hdr", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_GeneracionHDRs.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarhdr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Hdr", ""), bttBtngenerarhdr_Jsonclick, 7, httpContext.getMessage( "Generar Hdr", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1119u1_client"+"'", TempTags, "", 2, "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Ultima HDR Creada", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV107BarNHdr), GXutil.rtrim( localUtil.format( AV107BarNHdr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol55( ) ;
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (int)(nGXsfl_55_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_76_19U2( true) ;
      }
      else
      {
         wb_table2_76_19U2( false) ;
      }
      return  ;
   }

   public void wb_table2_76_19U2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV66GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV67GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV64DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table3_109_19U2( true) ;
      }
      else
      {
         wb_table3_109_19U2( false) ;
      }
      return  ;
   }

   public void wb_table3_109_19U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_114_19U2( true) ;
      }
      else
      {
         wb_table4_114_19U2( false) ;
      }
      return  ;
   }

   public void wb_table4_114_19U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_119_19U2( true) ;
      }
      else
      {
         wb_table5_119_19U2( false) ;
      }
      return  ;
   }

   public void wb_table5_119_19U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_disfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'" + sPrefix + "',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecauxdate_Internalname, localUtil.format(AV34DDO_DisFecAuxDate, "99/99/99"), localUtil.format( AV34DDO_DisFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,127);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GeneracionHDRs.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 55 )
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

   public void start19U2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Pedidos", ""), (short)(0)) ;
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
            strup19U0( ) ;
         }
      }
   }

   public void ws19U2( )
   {
      start19U2( ) ;
      evt19U2( ) ;
   }

   public void evt19U2( )
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
                              strup19U0( ) ;
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
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1219U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1319U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1419U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1519U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1619U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1719U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINCLUIRACCESORIOS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoIncluirAccesorios' */
                                 e1819U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
                              strup19U0( ) ;
                           }
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           AV9Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV9Seleccionar);
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A369DisFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFec_Internalname), 0)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMACCOD");
                              GX_FocusControl = edtavMaccod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21MacCod = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
                           }
                           else
                           {
                              AV21MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
                           }
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           AV84DisEncCli = httpContext.cgiGet( edtavDisenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisenccli_Internalname, AV84DisEncCli);
                           A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
                           A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
                           A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
                           n362DisColNom = false ;
                           A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n363DisColNum = false ;
                           A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n390DisTipCol = false ;
                           A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
                           A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
                           A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n387DisPiePie = false ;
                           A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
                           A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1919U2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2019U2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2119U2 ();
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
                                    strup19U0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void we19U2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm19U2( ) ;
         }
      }
   }

   public void pa19U2( )
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
            GX_FocusControl = edtavIncluir_maccod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV6EmprCod ,
                                 byte AV82DisEst ,
                                 int AV30TFDisCod ,
                                 int AV31TFDisCod_To ,
                                 java.util.Date AV32TFDisFec ,
                                 int AV36TFCliCod ,
                                 int AV37TFCliCod_To ,
                                 String AV38TFCliNom ,
                                 String AV39TFCliNom_Sel ,
                                 short AV42TFDisPart ,
                                 short AV43TFDisPart_To ,
                                 String AV44TFDisArtCod ,
                                 String AV45TFDisArtCod_Sel ,
                                 String AV46TFDisArtDsc ,
                                 String AV47TFDisArtDsc_Sel ,
                                 String AV48TFDisColNom ,
                                 String AV49TFDisColNom_Sel ,
                                 int AV50TFDisColNum ,
                                 int AV51TFDisColNum_To ,
                                 byte AV52TFDisTipCol ,
                                 byte AV53TFDisTipCol_To ,
                                 String AV54TFDisNomCli ,
                                 String AV55TFDisNomCli_Sel ,
                                 String AV56TFDisUniMed ,
                                 String AV57TFDisUniMed_Sel ,
                                 short AV58TFDisPiePie ,
                                 short AV59TFDisPiePie_To ,
                                 java.math.BigDecimal AV60TFDisPieKgm ,
                                 java.math.BigDecimal AV61TFDisPieKgm_To ,
                                 java.math.BigDecimal AV62TFDisPieMtr ,
                                 java.math.BigDecimal AV63TFDisPieMtr_To ,
                                 String AV144Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 String AV107BarNHdr ,
                                 long AV85TotDisPiePie ,
                                 java.math.BigDecimal AV87TotDisPieKgm ,
                                 java.math.BigDecimal AV89TotDisPieMtr ,
                                 int A1202MacDisCod ,
                                 int A1199MacCod ,
                                 GXSimpleCollection<Integer> AV83Col_Discod ,
                                 String AV71MaqCod ,
                                 short AV100Moda21 ,
                                 short AV103Testrtm ,
                                 String AV8UsurCod ,
                                 String AV5Station ,
                                 short AV73Carvitin ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2019U2 ();
      GRID_nCurrentRecord = 0 ;
      rf19U2( ) ;
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
      rf19U2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV144Pgmname = "GeneracionHDRs" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavDisenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisenccli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavTotvaluedispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiepie_Enabled), 5, 0), true);
      edtavTotvaluedispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiekgm_Enabled), 5, 0), true);
      edtavTotvaluedispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiemtr_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV111Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV112Generacionhdrsds_2_tfdiscod_to) ,
                                           AV113Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV114Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV115Generacionhdrsds_5_tfclicod_to) ,
                                           AV117Generacionhdrsds_7_tfclinom_sel ,
                                           AV116Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV118Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV119Generacionhdrsds_9_tfdispart_to) ,
                                           AV121Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV120Generacionhdrsds_10_tfdisartcod ,
                                           AV123Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV122Generacionhdrsds_12_tfdisartdsc ,
                                           AV125Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV124Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV126Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV127Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV128Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV129Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV131Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV130Generacionhdrsds_20_tfdisnomcli ,
                                           AV133Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV132Generacionhdrsds_22_tfdisunimed ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV136Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV137Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV138Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV139Generacionhdrsds_29_tfdispiemtr_to ,
                                           AV6EmprCod ,
                                           Byte.valueOf(AV82DisEst) ,
                                           A396EmprCod ,
                                           Byte.valueOf(A367DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV116Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV116Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV120Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV120Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV122Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV122Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV124Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV124Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV130Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV130Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV132Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV132Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor H019U3 */
      pr_default.execute(0, new Object[] {AV6EmprCod, Byte.valueOf(AV82DisEst), Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to), Integer.valueOf(AV111Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV112Generacionhdrsds_2_tfdiscod_to), AV113Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV114Generacionhdrsds_4_tfclicod), Integer.valueOf(AV115Generacionhdrsds_5_tfclicod_to), lV116Generacionhdrsds_6_tfclinom, AV117Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV118Generacionhdrsds_8_tfdispart), Short.valueOf(AV119Generacionhdrsds_9_tfdispart_to), lV120Generacionhdrsds_10_tfdisartcod, AV121Generacionhdrsds_11_tfdisartcod_sel, lV122Generacionhdrsds_12_tfdisartdsc, AV123Generacionhdrsds_13_tfdisartdsc_sel, lV124Generacionhdrsds_14_tfdiscolnom, AV125Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV126Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV127Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV128Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV129Generacionhdrsds_19_tfdistipcol_to), lV130Generacionhdrsds_20_tfdisnomcli, AV131Generacionhdrsds_21_tfdisnomcli_sel, lV132Generacionhdrsds_22_tfdisunimed, AV133Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = H019U3_A361DisCod[0] ;
         A396EmprCod = H019U3_A396EmprCod[0] ;
         A367DisEst = H019U3_A367DisEst[0] ;
         A360DisCliNum = H019U3_A360DisCliNum[0] ;
         A4813DisEncCli = H019U3_A4813DisEncCli[0] ;
         A392DisUniMed = H019U3_A392DisUniMed[0] ;
         A1195DisNomCli = H019U3_A1195DisNomCli[0] ;
         A390DisTipCol = H019U3_A390DisTipCol[0] ;
         n390DisTipCol = H019U3_n390DisTipCol[0] ;
         A363DisColNum = H019U3_A363DisColNum[0] ;
         n363DisColNum = H019U3_n363DisColNum[0] ;
         A362DisColNom = H019U3_A362DisColNom[0] ;
         n362DisColNom = H019U3_n362DisColNom[0] ;
         A337DisArtDsc = H019U3_A337DisArtDsc[0] ;
         A335DisArtCod = H019U3_A335DisArtCod[0] ;
         A1502DisPart = H019U3_A1502DisPart[0] ;
         A279CliNom = H019U3_A279CliNom[0] ;
         A252CliCod = H019U3_A252CliCod[0] ;
         A369DisFec = H019U3_A369DisFec[0] ;
         A387DisPiePie = H019U3_A387DisPiePie[0] ;
         n387DisPiePie = H019U3_n387DisPiePie[0] ;
         A365DisDes = H019U3_A365DisDes[0] ;
         A387DisPiePie = H019U3_A387DisPiePie[0] ;
         n387DisPiePie = H019U3_n387DisPiePie[0] ;
         A279CliNom = H019U3_A279CliNom[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV136Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV137Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV138Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV139Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf19U2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e2019U2 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_552( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV111Generacionhdrsds_1_tfdiscod) ,
                                              Integer.valueOf(AV112Generacionhdrsds_2_tfdiscod_to) ,
                                              AV113Generacionhdrsds_3_tfdisfec ,
                                              Integer.valueOf(AV114Generacionhdrsds_4_tfclicod) ,
                                              Integer.valueOf(AV115Generacionhdrsds_5_tfclicod_to) ,
                                              AV117Generacionhdrsds_7_tfclinom_sel ,
                                              AV116Generacionhdrsds_6_tfclinom ,
                                              Short.valueOf(AV118Generacionhdrsds_8_tfdispart) ,
                                              Short.valueOf(AV119Generacionhdrsds_9_tfdispart_to) ,
                                              AV121Generacionhdrsds_11_tfdisartcod_sel ,
                                              AV120Generacionhdrsds_10_tfdisartcod ,
                                              AV123Generacionhdrsds_13_tfdisartdsc_sel ,
                                              AV122Generacionhdrsds_12_tfdisartdsc ,
                                              AV125Generacionhdrsds_15_tfdiscolnom_sel ,
                                              AV124Generacionhdrsds_14_tfdiscolnom ,
                                              Integer.valueOf(AV126Generacionhdrsds_16_tfdiscolnum) ,
                                              Integer.valueOf(AV127Generacionhdrsds_17_tfdiscolnum_to) ,
                                              Byte.valueOf(AV128Generacionhdrsds_18_tfdistipcol) ,
                                              Byte.valueOf(AV129Generacionhdrsds_19_tfdistipcol_to) ,
                                              AV131Generacionhdrsds_21_tfdisnomcli_sel ,
                                              AV130Generacionhdrsds_20_tfdisnomcli ,
                                              AV133Generacionhdrsds_23_tfdisunimed_sel ,
                                              AV132Generacionhdrsds_22_tfdisunimed ,
                                              Integer.valueOf(A361DisCod) ,
                                              A369DisFec ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Short.valueOf(A1502DisPart) ,
                                              A335DisArtCod ,
                                              A337DisArtDsc ,
                                              A362DisColNom ,
                                              Integer.valueOf(A363DisColNum) ,
                                              Byte.valueOf(A390DisTipCol) ,
                                              A1195DisNomCli ,
                                              A392DisUniMed ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie) ,
                                              Short.valueOf(A387DisPiePie) ,
                                              Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to) ,
                                              AV136Generacionhdrsds_26_tfdispiekgm ,
                                              A381DisPieKgm ,
                                              AV137Generacionhdrsds_27_tfdispiekgm_to ,
                                              AV138Generacionhdrsds_28_tfdispiemtr ,
                                              A385DisPieMtr ,
                                              AV139Generacionhdrsds_29_tfdispiemtr_to ,
                                              AV6EmprCod ,
                                              Byte.valueOf(AV82DisEst) ,
                                              A396EmprCod ,
                                              Byte.valueOf(A367DisEst) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV116Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV116Generacionhdrsds_6_tfclinom), 30, "%") ;
         lV120Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV120Generacionhdrsds_10_tfdisartcod), 16, "%") ;
         lV122Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV122Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
         lV124Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV124Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
         lV130Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV130Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
         lV132Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV132Generacionhdrsds_22_tfdisunimed), 1, "%") ;
         /* Using cursor H019U5 */
         pr_default.execute(1, new Object[] {AV6EmprCod, Byte.valueOf(AV82DisEst), Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to), Integer.valueOf(AV111Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV112Generacionhdrsds_2_tfdiscod_to), AV113Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV114Generacionhdrsds_4_tfclicod), Integer.valueOf(AV115Generacionhdrsds_5_tfclicod_to), lV116Generacionhdrsds_6_tfclinom, AV117Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV118Generacionhdrsds_8_tfdispart), Short.valueOf(AV119Generacionhdrsds_9_tfdispart_to), lV120Generacionhdrsds_10_tfdisartcod, AV121Generacionhdrsds_11_tfdisartcod_sel, lV122Generacionhdrsds_12_tfdisartdsc, AV123Generacionhdrsds_13_tfdisartdsc_sel, lV124Generacionhdrsds_14_tfdiscolnom, AV125Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV126Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV127Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV128Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV129Generacionhdrsds_19_tfdistipcol_to), lV130Generacionhdrsds_20_tfdisnomcli, AV131Generacionhdrsds_21_tfdisnomcli_sel, lV132Generacionhdrsds_22_tfdisunimed, AV133Generacionhdrsds_23_tfdisunimed_sel});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A361DisCod = H019U5_A361DisCod[0] ;
            A396EmprCod = H019U5_A396EmprCod[0] ;
            A367DisEst = H019U5_A367DisEst[0] ;
            A360DisCliNum = H019U5_A360DisCliNum[0] ;
            A4813DisEncCli = H019U5_A4813DisEncCli[0] ;
            A392DisUniMed = H019U5_A392DisUniMed[0] ;
            A1195DisNomCli = H019U5_A1195DisNomCli[0] ;
            A390DisTipCol = H019U5_A390DisTipCol[0] ;
            n390DisTipCol = H019U5_n390DisTipCol[0] ;
            A363DisColNum = H019U5_A363DisColNum[0] ;
            n363DisColNum = H019U5_n363DisColNum[0] ;
            A362DisColNom = H019U5_A362DisColNom[0] ;
            n362DisColNom = H019U5_n362DisColNom[0] ;
            A337DisArtDsc = H019U5_A337DisArtDsc[0] ;
            A335DisArtCod = H019U5_A335DisArtCod[0] ;
            A1502DisPart = H019U5_A1502DisPart[0] ;
            A279CliNom = H019U5_A279CliNom[0] ;
            A252CliCod = H019U5_A252CliCod[0] ;
            A369DisFec = H019U5_A369DisFec[0] ;
            A387DisPiePie = H019U5_A387DisPiePie[0] ;
            n387DisPiePie = H019U5_n387DisPiePie[0] ;
            A365DisDes = H019U5_A365DisDes[0] ;
            A387DisPiePie = H019U5_A387DisPiePie[0] ;
            n387DisPiePie = H019U5_n387DisPiePie[0] ;
            A279CliNom = H019U5_A279CliNom[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV136Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV137Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                     }
                     else
                     {
                        A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV138Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV139Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                     {
                        e2119U2 ();
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(55) ;
         wb19U0( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19U2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV144Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV144Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEPIE", GXutil.ltrim( localUtil.ntoc( AV85TotDisPiePie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV85TotDisPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV87TotDisPieKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDisPieKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV89TotDisPieMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotDisPieMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV71MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV71MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV100Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTESTRTM", GXutil.ltrim( localUtil.ntoc( AV103Testrtm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103Testrtm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV5Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV73Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73Carvitin), "ZZZ9")));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV82DisEst, AV30TFDisCod, AV31TFDisCod_To, AV32TFDisFec, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV42TFDisPart, AV43TFDisPart_To, AV44TFDisArtCod, AV45TFDisArtCod_Sel, AV46TFDisArtDsc, AV47TFDisArtDsc_Sel, AV48TFDisColNom, AV49TFDisColNom_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDisTipCol, AV53TFDisTipCol_To, AV54TFDisNomCli, AV55TFDisNomCli_Sel, AV56TFDisUniMed, AV57TFDisUniMed_Sel, AV58TFDisPiePie, AV59TFDisPiePie_To, AV60TFDisPieKgm, AV61TFDisPieKgm_To, AV62TFDisPieMtr, AV63TFDisPieMtr_To, AV144Pgmname, AV17OrderedBy, AV18OrderedDsc, AV107BarNHdr, AV85TotDisPiePie, AV87TotDisPieKgm, AV89TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV83Col_Discod, AV71MaqCod, AV100Moda21, AV103Testrtm, AV8UsurCod, AV5Station, AV73Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV82DisEst, AV30TFDisCod, AV31TFDisCod_To, AV32TFDisFec, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV42TFDisPart, AV43TFDisPart_To, AV44TFDisArtCod, AV45TFDisArtCod_Sel, AV46TFDisArtDsc, AV47TFDisArtDsc_Sel, AV48TFDisColNom, AV49TFDisColNom_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDisTipCol, AV53TFDisTipCol_To, AV54TFDisNomCli, AV55TFDisNomCli_Sel, AV56TFDisUniMed, AV57TFDisUniMed_Sel, AV58TFDisPiePie, AV59TFDisPiePie_To, AV60TFDisPieKgm, AV61TFDisPieKgm_To, AV62TFDisPieMtr, AV63TFDisPieMtr_To, AV144Pgmname, AV17OrderedBy, AV18OrderedDsc, AV107BarNHdr, AV85TotDisPiePie, AV87TotDisPieKgm, AV89TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV83Col_Discod, AV71MaqCod, AV100Moda21, AV103Testrtm, AV8UsurCod, AV5Station, AV73Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV82DisEst, AV30TFDisCod, AV31TFDisCod_To, AV32TFDisFec, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV42TFDisPart, AV43TFDisPart_To, AV44TFDisArtCod, AV45TFDisArtCod_Sel, AV46TFDisArtDsc, AV47TFDisArtDsc_Sel, AV48TFDisColNom, AV49TFDisColNom_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDisTipCol, AV53TFDisTipCol_To, AV54TFDisNomCli, AV55TFDisNomCli_Sel, AV56TFDisUniMed, AV57TFDisUniMed_Sel, AV58TFDisPiePie, AV59TFDisPiePie_To, AV60TFDisPieKgm, AV61TFDisPieKgm_To, AV62TFDisPieMtr, AV63TFDisPieMtr_To, AV144Pgmname, AV17OrderedBy, AV18OrderedDsc, AV107BarNHdr, AV85TotDisPiePie, AV87TotDisPieKgm, AV89TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV83Col_Discod, AV71MaqCod, AV100Moda21, AV103Testrtm, AV8UsurCod, AV5Station, AV73Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV82DisEst, AV30TFDisCod, AV31TFDisCod_To, AV32TFDisFec, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV42TFDisPart, AV43TFDisPart_To, AV44TFDisArtCod, AV45TFDisArtCod_Sel, AV46TFDisArtDsc, AV47TFDisArtDsc_Sel, AV48TFDisColNom, AV49TFDisColNom_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDisTipCol, AV53TFDisTipCol_To, AV54TFDisNomCli, AV55TFDisNomCli_Sel, AV56TFDisUniMed, AV57TFDisUniMed_Sel, AV58TFDisPiePie, AV59TFDisPiePie_To, AV60TFDisPieKgm, AV61TFDisPieKgm_To, AV62TFDisPieMtr, AV63TFDisPieMtr_To, AV144Pgmname, AV17OrderedBy, AV18OrderedDsc, AV107BarNHdr, AV85TotDisPiePie, AV87TotDisPieKgm, AV89TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV83Col_Discod, AV71MaqCod, AV100Moda21, AV103Testrtm, AV8UsurCod, AV5Station, AV73Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV82DisEst, AV30TFDisCod, AV31TFDisCod_To, AV32TFDisFec, AV36TFCliCod, AV37TFCliCod_To, AV38TFCliNom, AV39TFCliNom_Sel, AV42TFDisPart, AV43TFDisPart_To, AV44TFDisArtCod, AV45TFDisArtCod_Sel, AV46TFDisArtDsc, AV47TFDisArtDsc_Sel, AV48TFDisColNom, AV49TFDisColNom_Sel, AV50TFDisColNum, AV51TFDisColNum_To, AV52TFDisTipCol, AV53TFDisTipCol_To, AV54TFDisNomCli, AV55TFDisNomCli_Sel, AV56TFDisUniMed, AV57TFDisUniMed_Sel, AV58TFDisPiePie, AV59TFDisPiePie_To, AV60TFDisPieKgm, AV61TFDisPieKgm_To, AV62TFDisPieMtr, AV63TFDisPieMtr_To, AV144Pgmname, AV17OrderedBy, AV18OrderedDsc, AV107BarNHdr, AV85TotDisPiePie, AV87TotDisPieKgm, AV89TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV83Col_Discod, AV71MaqCod, AV100Moda21, AV103Testrtm, AV8UsurCod, AV5Station, AV73Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV144Pgmname = "GeneracionHDRs" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavDisenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisenccli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavTotvaluedispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiepie_Enabled), 5, 0), true);
      edtavTotvaluedispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiekgm_Enabled), 5, 0), true);
      edtavTotvaluedispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiemtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup19U0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1919U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV64DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_DISCOD"), AV83Col_Discod);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV66GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV67GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV6EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV6EmprCod") ;
         wcpOAV82DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV82DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV107BarNHdr = httpContext.cgiGet( sPrefix+"wcpOAV107BarNHdr") ;
         AV75i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV93lineas = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vLINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Dvelop_confirmpanel_generarhdr_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Title") ;
         Dvelop_confirmpanel_generarhdr_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmationtext") ;
         Dvelop_confirmpanel_generarhdr_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Nobuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttonposition") ;
         Dvelop_confirmpanel_generarhdr_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Confirmtype") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Title") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmtype") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Title") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_generarhdr_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR_Result") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCLUIR_MACCOD");
            GX_FocusControl = edtavIncluir_maccod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV108Incluir_Maccod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Incluir_Maccod), 8, 0));
         }
         else
         {
            AV108Incluir_Maccod = (int)(localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Incluir_Maccod), 8, 0));
         }
         AV86TotValueDisPiePie = httpContext.cgiGet( edtavTotvaluedispiepie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueDisPiePie", AV86TotValueDisPiePie);
         AV88TotValueDisPieKgm = httpContext.cgiGet( edtavTotvaluedispiekgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueDisPieKgm", AV88TotValueDisPieKgm);
         AV90TotValueDisPieMtr = httpContext.cgiGet( edtavTotvaluedispiemtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueDisPieMtr", AV90TotValueDisPieMtr);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECAUXDATE");
            GX_FocusControl = edtavDdo_disfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_DisFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_DisFecAuxDate", localUtil.format(AV34DDO_DisFecAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_DisFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_DisFecAuxDate", localUtil.format(AV34DDO_DisFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_55_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         if ( nGXsfl_55_idx > 0 )
         {
            AV9Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV9Seleccionar);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMACCOD");
               GX_FocusControl = edtavMaccod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV21MacCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
            }
            else
            {
               AV21MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            AV84DisEncCli = httpContext.cgiGet( edtavDisenccli_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisenccli_Internalname, AV84DisEncCli);
            A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
            A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
            n362DisColNom = false ;
            A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n363DisColNum = false ;
            A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n390DisTipCol = false ;
            A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
            A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
            A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n387DisPiePie = false ;
            A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
            A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
         }
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
      e1919U2 ();
      if (returnInSub) return;
   }

   public void e1919U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      generacionhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Station", AV5Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      generacionhdrs_impl.this.AV6EmprCod = GXv_char2[0] ;
      generacionhdrs_impl.this.AV7EmprNom = GXv_char3[0] ;
      generacionhdrs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      GXt_int5 = (byte)(AV73Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      generacionhdrs_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73Carvitin), "ZZZ9")));
      GXt_int5 = (byte)(AV103Testrtm) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "RTMTES", ""), GXv_int6) ;
      generacionhdrs_impl.this.GXt_int5 = GXv_int6[0] ;
      AV103Testrtm = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103Testrtm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Testrtm), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTESTRTM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103Testrtm), "ZZZ9")));
      GXt_int5 = (byte)(AV100Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      generacionhdrs_impl.this.GXt_int5 = GXv_int6[0] ;
      AV100Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100Moda21), "ZZZ9")));
      GXt_char1 = AV5Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      generacionhdrs_impl.this.GXt_char1 = GXv_char4[0] ;
      AV5Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Station", AV5Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV5Station, ""))));
      GXv_char4[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char3, GXv_char2) ;
      generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
      generacionhdrs_impl.this.AV7EmprNom = GXv_char3[0] ;
      generacionhdrs_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV64DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV64DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2019U2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV11WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV66GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridCurrentPage), 10, 0));
      AV67GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
      /*  Sending Event outputs  */
   }

   public void e1219U2( )
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
         AV65PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV65PageToGo) ;
      }
   }

   public void e1319U2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1419U2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCod") == 0 )
         {
            AV30TFDisCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFDisCod), 8, 0));
            AV31TFDisCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFec") == 0 )
         {
            AV32TFDisFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFDisFec", localUtil.format(AV32TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV38TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom", AV38TFCliNom);
            AV39TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom_Sel", AV39TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPart") == 0 )
         {
            AV42TFDisPart = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFDisPart), 4, 0));
            AV43TFDisPart_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDisPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFDisPart_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtCod") == 0 )
         {
            AV44TFDisArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFDisArtCod", AV44TFDisArtCod);
            AV45TFDisArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDisArtCod_Sel", AV45TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtDsc") == 0 )
         {
            AV46TFDisArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDisArtDsc", AV46TFDisArtDsc);
            AV47TFDisArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFDisArtDsc_Sel", AV47TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNom") == 0 )
         {
            AV48TFDisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFDisColNom", AV48TFDisColNom);
            AV49TFDisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFDisColNom_Sel", AV49TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNum") == 0 )
         {
            AV50TFDisColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisColNum), 6, 0));
            AV51TFDisColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisTipCol") == 0 )
         {
            AV52TFDisTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFDisTipCol), 2, 0));
            AV53TFDisTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNomCli") == 0 )
         {
            AV54TFDisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFDisNomCli", AV54TFDisNomCli);
            AV55TFDisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFDisNomCli_Sel", AV55TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUniMed") == 0 )
         {
            AV56TFDisUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFDisUniMed", AV56TFDisUniMed);
            AV57TFDisUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDisUniMed_Sel", AV57TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPiePie") == 0 )
         {
            AV58TFDisPiePie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDisPiePie), 4, 0));
            AV59TFDisPiePie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDisPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFDisPiePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPieKgm") == 0 )
         {
            AV60TFDisPieKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDisPieKgm", GXutil.ltrimstr( AV60TFDisPieKgm, 9, 2));
            AV61TFDisPieKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFDisPieKgm_To", GXutil.ltrimstr( AV61TFDisPieKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPieMtr") == 0 )
         {
            AV62TFDisPieMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFDisPieMtr", GXutil.ltrimstr( AV62TFDisPieMtr, 9, 2));
            AV63TFDisPieMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDisPieMtr_To", GXutil.ltrimstr( AV63TFDisPieMtr_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2119U2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV9Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV9Seleccionar);
         AV140GXLvl149 = (byte)(0) ;
         /* Using cursor H019U6 */
         pr_default.execute(2, new Object[] {AV6EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1202MacDisCod = H019U6_A1202MacDisCod[0] ;
            A396EmprCod = H019U6_A396EmprCod[0] ;
            A1199MacCod = H019U6_A1199MacCod[0] ;
            AV140GXLvl149 = (byte)(1) ;
            AV21MacCod = A1199MacCod ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV140GXLvl149 == 0 )
         {
            AV21MacCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
         }
         AV84DisEncCli = ((GXutil.strcmp(A4813DisEncCli, " ")!=0) ? A4813DisEncCli : A360DisCliNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisenccli_Internalname, AV84DisEncCli);
         AV9Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV9Seleccionar);
         AV75i = (short)(1) ;
         while ( AV75i <= AV83Col_Discod.size() )
         {
            if ( ((Number) AV83Col_Discod.elementAt(-1+AV75i)).intValue() == A361DisCod )
            {
               AV9Seleccionar = "S" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV9Seleccionar);
               if (true) break;
            }
            AV75i = (short)(AV75i+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(55) ;
         }
         sendrow_552( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1519U2( )
   {
      /* Dvelop_confirmpanel_generarhdr_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_generarhdr_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION GENERARHDR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV99ProgressIndicator", AV99ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV104TablaHdrs_SDT", AV104TablaHdrs_SDT);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV83Col_Discod", AV83Col_Discod);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV94Col_Maccod", AV94Col_Maccod);
   }

   public void e1819U2( )
   {
      /* 'DoIncluirAccesorios' Routine */
      returnInSub = false ;
      if ( (0==AV108Incluir_Maccod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta el Nº de Macro", ""));
         GX_FocusControl = edtavIncluir_maccod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV68FlagMac = (short)(0) ;
         /* Using cursor H019U7 */
         pr_default.execute(3, new Object[] {AV6EmprCod, Integer.valueOf(AV108Incluir_Maccod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1199MacCod = H019U7_A1199MacCod[0] ;
            A396EmprCod = H019U7_A396EmprCod[0] ;
            AV68FlagMac = (short)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV69FlagDis = (short)(0) ;
         /* Using cursor H019U8 */
         pr_default.execute(4, new Object[] {AV6EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1202MacDisCod = H019U8_A1202MacDisCod[0] ;
            A396EmprCod = H019U8_A396EmprCod[0] ;
            A1199MacCod = H019U8_A1199MacCod[0] ;
            AV70MacCod2 = A1199MacCod ;
            AV69FlagDis = (short)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( (0==AV68FlagMac) || ( AV69FlagDis == 1 ) )
         {
            if ( (0==AV68FlagMac) )
            {
               Gx_msg = httpContext.getMessage( "No existe el Nº Macro ", "") + GXutil.trim( GXutil.str( AV108Incluir_Maccod, 8, 0)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            if ( AV69FlagDis == 1 )
            {
               Gx_msg = httpContext.getMessage( "El N Disposicion ", "") + GXutil.trim( GXutil.str( A361DisCod, 8, 0)) + httpContext.getMessage( ", ya esta incluida en el Nº Macro ", "") + GXutil.trim( GXutil.str( AV70MacCod2, 8, 0)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
         }
         else
         {
            Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = httpContext.getMessage( "Desea incluir el Nº Disp. Int. ", "")+GXutil.trim( GXutil.str( A361DisCod, 8, 0))+GXutil.newLine( ) ;
            ucDvelop_confirmpanel_btnincluiraccesorios.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
            Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext+httpContext.getMessage( "En el Nº accesorio ", "")+GXutil.trim( GXutil.str( AV108Incluir_Maccod, 8, 0))+" ?" ;
            ucDvelop_confirmpanel_btnincluiraccesorios.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1619U2( )
   {
      /* Dvelop_confirmpanel_btnincluiraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnincluiraccesorios_Result, "Yes") == 0 )
      {
         new app.pgenmac(remoteHandle, context).execute( AV6EmprCod, A361DisCod, AV108Incluir_Maccod) ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Disposicion incluida en macro", ""));
         AV108Incluir_Maccod = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Incluir_Maccod), 8, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
   }

   public void e1719U2( )
   {
      /* Dvelop_confirmpanel_btneliminaraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminaraccesorios_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARACCESORIOS' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ACTION GENERARHDR' Routine */
      returnInSub = false ;
      AV99ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV99ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV99ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV99ProgressIndicator.show();
      AV99ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando PGENBARM", ""));
      AV93lineas = (short)(1) ;
      AV101t = (short)(1) ;
      AV75i = (short)(1) ;
      while ( AV75i <= AV83Col_Discod.size() )
      {
         AV92discod = ((Number) AV83Col_Discod.elementAt(-1+AV75i)).intValue() ;
         AV99ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Nº Disp Int ", "")+GXutil.trim( GXutil.str( AV92discod, 8, 0)) );
         GXv_int10[0] = AV72BarCodP ;
         new app.pgenbarm(remoteHandle, context).execute( AV6EmprCod, AV92discod, AV71MaqCod, GXv_int10) ;
         generacionhdrs_impl.this.AV72BarCodP = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarCodP), 8, 0));
         new app.pmtsrdt(remoteHandle, context).execute( AV6EmprCod, AV72BarCodP, (byte)(0), " ", DecimalUtil.doubleToDec(0)) ;
         if ( ! (0==AV21MacCod) )
         {
            GXv_char4[0] = AV6EmprCod ;
            GXv_int10[0] = AV92discod ;
            GXv_int11[0] = AV72BarCodP ;
            new app.pmodmac(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11) ;
            generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
            generacionhdrs_impl.this.AV92discod = GXv_int10[0] ;
            generacionhdrs_impl.this.AV72BarCodP = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarCodP), 8, 0));
         }
         if ( AV93lineas < 1000 )
         {
            AV74TabHdr[AV93lineas-1] = GXutil.str( AV72BarCodP, 8, 0) + "0" + " " ;
            AV93lineas = (short)(AV93lineas+1) ;
         }
         if ( AV100Moda21 == 1 )
         {
            if ( AV103Testrtm == 1 )
            {
               GXv_char4[0] = AV6EmprCod ;
               GXv_int11[0] = AV72BarCodP ;
               GXv_int6[0] = (byte)(0) ;
               GXv_char3[0] = " " ;
               new app.ptestrtm(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int6, GXv_char3) ;
               generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
               generacionhdrs_impl.this.AV72BarCodP = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarCodP), 8, 0));
            }
            AV105TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
            AV105TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( AV72BarCodP );
            AV105TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( (byte)(0) );
            AV105TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( " " );
            AV104TablaHdrs_SDT.add(AV105TabladeHdrs_SDTItem, 0);
         }
         AV101t = (short)(AV101t+1) ;
         AV75i = (short)(AV75i+1) ;
      }
      AV99ProgressIndicator.setgxTv_SdtProgress_Description( "" );
      AV99ProgressIndicator.showwithtitle(httpContext.getMessage( "Fin Procesando PGENBARM", ""));
      AV97Inc_obs1 = "" ;
      if ( AV93lineas > 1 )
      {
         AV93lineas = (short)(AV93lineas-1) ;
         AV97Inc_obs1 = httpContext.getMessage( "Proceso Generacion Hdrs,creadas ", "") + GXutil.trim( GXutil.str( AV93lineas, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV6EmprCod, AV144Pgmname, AV8UsurCod, AV5Station, AV97Inc_obs1, 22, (byte)(0), "") ;
      }
      if ( AV73Carvitin == 1 )
      {
         GXv_char4[0] = AV6EmprCod ;
         new app.pinslot4(remoteHandle, context).execute( GXv_char4) ;
         generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
         AV75i = (short)(1) ;
         while ( AV75i <= 1000 )
         {
            if ( GXutil.strcmp(AV74TabHdr[AV75i-1], " ") == 0 )
            {
               if (true) break;
            }
            AV76BarCod = (int)(GXutil.lval( GXutil.substring( AV74TabHdr[AV75i-1], 1, 8))) ;
            AV77BarCodreo = (byte)(GXutil.lval( GXutil.substring( AV74TabHdr[AV75i-1], 9, 1))) ;
            AV78BarCodpar = GXutil.substring( AV74TabHdr[AV75i-1], 10, 1) ;
            GXv_char4[0] = AV6EmprCod ;
            GXv_int11[0] = AV76BarCod ;
            GXv_int6[0] = AV77BarCodreo ;
            GXv_char3[0] = AV78BarCodpar ;
            new app.pinslot3(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_int6, GXv_char3) ;
            generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
            generacionhdrs_impl.this.AV76BarCod = GXv_int11[0] ;
            generacionhdrs_impl.this.AV77BarCodreo = GXv_int6[0] ;
            generacionhdrs_impl.this.AV78BarCodpar = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
            AV75i = (short)(AV75i+1) ;
         }
         GXv_char4[0] = AV6EmprCod ;
         new app.pinslot5(remoteHandle, context).execute( GXv_char4) ;
         generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
         GXv_char4[0] = AV6EmprCod ;
         new app.pinslot4(remoteHandle, context).execute( GXv_char4) ;
         generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      }
      AV79MacSav = (short)(0) ;
      AV93lineas = (short)(0) ;
      AV99ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando ACCESORIOS", ""));
      AV75i = (short)(1) ;
      while ( AV75i <= AV83Col_Discod.size() )
      {
         AV95Maccoditem = ((Number) AV94Col_Maccod.elementAt(-1+AV75i)).intValue() ;
         if ( ! (0==AV95Maccoditem) && ( AV95Maccoditem != AV79MacSav ) )
         {
            AV99ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Nº Macro ", "")+GXutil.trim( GXutil.str( AV95Maccoditem, 8, 0)) );
            GXv_char4[0] = AV6EmprCod ;
            GXv_int11[0] = AV95Maccoditem ;
            new app.pagrmac(remoteHandle, context).execute( GXv_char4, GXv_int11) ;
            generacionhdrs_impl.this.AV6EmprCod = GXv_char4[0] ;
            generacionhdrs_impl.this.AV95Maccoditem = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
            AV79MacSav = (short)(AV95Maccoditem) ;
            AV93lineas = (short)(AV93lineas+1) ;
         }
         AV75i = (short)(AV75i+1) ;
      }
      AV98Inc_obs2 = "" ;
      if ( AV93lineas > 1 )
      {
         AV98Inc_obs2 = httpContext.getMessage( "Proceso Accesorios,creados ", "") + GXutil.trim( GXutil.str( AV93lineas, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV6EmprCod, AV144Pgmname, AV8UsurCod, AV5Station, AV98Inc_obs2, 11, (byte)(0), "") ;
      }
      AV83Col_Discod.clear();
      AV94Col_Maccod.clear();
      AV98Inc_obs2 = httpContext.getMessage( "Proceso Generacion HDRs, finalizado", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV6EmprCod, AV144Pgmname, AV8UsurCod, AV5Station, AV98Inc_obs2, 10, (byte)(0), "") ;
      AV99ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso Finalizado", ""));
      AV99ProgressIndicator.setgxTv_SdtProgress_Description( "" );
      AV99ProgressIndicator.hide();
      if ( ( AV100Moda21 == 1 ) && ( AV104TablaHdrs_SDT.size() > 0 ) )
      {
         AV106TablaHdrs_SDTJson = AV104TablaHdrs_SDT.toJSonString(false) ;
         httpContext.popup(formatLink("app.pctrosc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV106TablaHdrs_SDTJson))}, new String[] {"EmprCod","TablaHdrs_SDTJson"}) , new Object[] {"AV6EmprCod","AV106TablaHdrs_SDTJson"});
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV144Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV144Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV26Session.getValue(AV144Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV145GXV1 = 1 ;
      while ( AV145GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV145GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV30TFDisCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFDisCod), 8, 0));
            AV31TFDisCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV32TFDisFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFDisFec", localUtil.format(AV32TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod), 6, 0));
            AV37TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom", AV38TFCliNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom_Sel", AV39TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPART") == 0 )
         {
            AV42TFDisPart = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFDisPart), 4, 0));
            AV43TFDisPart_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDisPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFDisPart_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV44TFDisArtCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFDisArtCod", AV44TFDisArtCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV45TFDisArtCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDisArtCod_Sel", AV45TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV46TFDisArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDisArtDsc", AV46TFDisArtDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV47TFDisArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFDisArtDsc_Sel", AV47TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV48TFDisColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFDisColNom", AV48TFDisColNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV49TFDisColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFDisColNom_Sel", AV49TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV50TFDisColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisColNum), 6, 0));
            AV51TFDisColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV52TFDisTipCol = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFDisTipCol), 2, 0));
            AV53TFDisTipCol_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV54TFDisNomCli = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFDisNomCli", AV54TFDisNomCli);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV55TFDisNomCli_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFDisNomCli_Sel", AV55TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV56TFDisUniMed = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFDisUniMed", AV56TFDisUniMed);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV57TFDisUniMed_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDisUniMed_Sel", AV57TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEPIE") == 0 )
         {
            AV58TFDisPiePie = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDisPiePie), 4, 0));
            AV59TFDisPiePie_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDisPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFDisPiePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEKGM") == 0 )
         {
            AV60TFDisPieKgm = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDisPieKgm", GXutil.ltrimstr( AV60TFDisPieKgm, 9, 2));
            AV61TFDisPieKgm_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFDisPieKgm_To", GXutil.ltrimstr( AV61TFDisPieKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEMTR") == 0 )
         {
            AV62TFDisPieMtr = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFDisPieMtr", GXutil.ltrimstr( AV62TFDisPieMtr, 9, 2));
            AV63TFDisPieMtr_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDisPieMtr_To", GXutil.ltrimstr( AV63TFDisPieMtr_To, 9, 2));
         }
         AV145GXV1 = (int)(AV145GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCliNom_Sel)==0), AV39TFCliNom_Sel, GXv_char4) ;
      generacionhdrs_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFDisArtCod_Sel)==0), AV45TFDisArtCod_Sel, GXv_char3) ;
      generacionhdrs_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFDisArtDsc_Sel)==0), AV47TFDisArtDsc_Sel, GXv_char2) ;
      generacionhdrs_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFDisColNom_Sel)==0), AV49TFDisColNom_Sel, GXv_char15) ;
      generacionhdrs_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFDisNomCli_Sel)==0), AV55TFDisNomCli_Sel, GXv_char17) ;
      generacionhdrs_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFDisUniMed_Sel)==0), AV57TFDisUniMed_Sel, GXv_char19) ;
      generacionhdrs_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|||"+GXt_char16+"|"+GXt_char18+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCliNom)==0), AV38TFCliNom, GXv_char19) ;
      generacionhdrs_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFDisArtCod)==0), AV44TFDisArtCod, GXv_char17) ;
      generacionhdrs_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFDisArtDsc)==0), AV46TFDisArtDsc, GXv_char15) ;
      generacionhdrs_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFDisColNom)==0), AV48TFDisColNom, GXv_char4) ;
      generacionhdrs_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFDisNomCli)==0), AV54TFDisNomCli, GXv_char3) ;
      generacionhdrs_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFDisUniMed)==0), AV56TFDisUniMed, GXv_char2) ;
      generacionhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV30TFDisCod) ? "" : GXutil.str( AV30TFDisCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFDisFec)) ? "" : localUtil.dtoc( AV32TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV36TFCliCod) ? "" : GXutil.str( AV36TFCliCod, 6, 0))+"|"+GXt_char18+"|"+((0==AV42TFDisPart) ? "" : GXutil.str( AV42TFDisPart, 4, 0))+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV50TFDisColNum) ? "" : GXutil.str( AV50TFDisColNum, 6, 0))+"|"+((0==AV52TFDisTipCol) ? "" : GXutil.str( AV52TFDisTipCol, 2, 0))+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV58TFDisPiePie) ? "" : GXutil.str( AV58TFDisPiePie, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFDisPieKgm)==0) ? "" : GXutil.str( AV60TFDisPieKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFDisPieMtr)==0) ? "" : GXutil.str( AV62TFDisPieMtr, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV31TFDisCod_To) ? "" : GXutil.str( AV31TFDisCod_To, 8, 0))+"||"+((0==AV37TFCliCod_To) ? "" : GXutil.str( AV37TFCliCod_To, 6, 0))+"||"+((0==AV43TFDisPart_To) ? "" : GXutil.str( AV43TFDisPart_To, 4, 0))+"||||"+((0==AV51TFDisColNum_To) ? "" : GXutil.str( AV51TFDisColNum_To, 6, 0))+"|"+((0==AV53TFDisTipCol_To) ? "" : GXutil.str( AV53TFDisTipCol_To, 2, 0))+"|||"+((0==AV59TFDisPiePie_To) ? "" : GXutil.str( AV59TFDisPiePie_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFDisPieKgm_To)==0) ? "" : GXutil.str( AV61TFDisPieKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFDisPieMtr_To)==0) ? "" : GXutil.str( AV63TFDisPieMtr_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV26Session.getValue(AV144Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISCOD", "", !((0==AV30TFDisCod)&&(0==AV31TFDisCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFDisCod, 8, 0)), GXutil.trim( GXutil.str( AV31TFDisCod_To, 8, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFDisFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLICOD", "", !((0==AV36TFCliCod)&&(0==AV37TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV37TFCliCod_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLINOM", "", !(GXutil.strcmp("", AV38TFCliNom)==0), (short)(0), AV38TFCliNom, "", !(GXutil.strcmp("", AV39TFCliNom_Sel)==0), AV39TFCliNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISPART", "", !((0==AV42TFDisPart)&&(0==AV43TFDisPart_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFDisPart, 4, 0)), GXutil.trim( GXutil.str( AV43TFDisPart_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISARTCOD", "", !(GXutil.strcmp("", AV44TFDisArtCod)==0), (short)(0), AV44TFDisArtCod, "", !(GXutil.strcmp("", AV45TFDisArtCod_Sel)==0), AV45TFDisArtCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISARTDSC", "", !(GXutil.strcmp("", AV46TFDisArtDsc)==0), (short)(0), AV46TFDisArtDsc, "", !(GXutil.strcmp("", AV47TFDisArtDsc_Sel)==0), AV47TFDisArtDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISCOLNOM", "", !(GXutil.strcmp("", AV48TFDisColNom)==0), (short)(0), AV48TFDisColNom, "", !(GXutil.strcmp("", AV49TFDisColNom_Sel)==0), AV49TFDisColNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISCOLNUM", "", !((0==AV50TFDisColNum)&&(0==AV51TFDisColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFDisColNum, 6, 0)), GXutil.trim( GXutil.str( AV51TFDisColNum_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISTIPCOL", "", !((0==AV52TFDisTipCol)&&(0==AV53TFDisTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFDisTipCol, 2, 0)), GXutil.trim( GXutil.str( AV53TFDisTipCol_To, 2, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISNOMCLI", "", !(GXutil.strcmp("", AV54TFDisNomCli)==0), (short)(0), AV54TFDisNomCli, "", !(GXutil.strcmp("", AV55TFDisNomCli_Sel)==0), AV55TFDisNomCli_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISUNIMED", "", !(GXutil.strcmp("", AV56TFDisUniMed)==0), (short)(0), AV56TFDisUniMed, "", !(GXutil.strcmp("", AV57TFDisUniMed_Sel)==0), AV57TFDisUniMed_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISPIEPIE", "", !((0==AV58TFDisPiePie)&&(0==AV59TFDisPiePie_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFDisPiePie, 4, 0)), GXutil.trim( GXutil.str( AV59TFDisPiePie_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISPIEKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFDisPieKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFDisPieKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV60TFDisPieKgm, 9, 2)), GXutil.trim( GXutil.str( AV61TFDisPieKgm_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISPIEMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFDisPieMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFDisPieMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV62TFDisPieMtr, 9, 2)), GXutil.trim( GXutil.str( AV63TFDisPieMtr_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      if ( ! (GXutil.strcmp("", AV6EmprCod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6EmprCod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV82DisEst) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISEST" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV82DisEst, 1, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV107BarNHdr)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARNHDR" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV107BarNHdr );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV144Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV144Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.Dis" );
      AV26Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV85TotDisPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TotDisPiePie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV85TotDisPiePie), "ZZZ9")));
      AV87TotDisPieKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotDisPieKgm", GXutil.ltrimstr( AV87TotDisPieKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDisPieKgm, "ZZZZZ9.99")));
      AV89TotDisPieMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotDisPieMtr", GXutil.ltrimstr( AV89TotDisPieMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotDisPieMtr, "ZZZZZ9.99")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV111Generacionhdrsds_1_tfdiscod = AV30TFDisCod ;
      AV112Generacionhdrsds_2_tfdiscod_to = AV31TFDisCod_To ;
      AV113Generacionhdrsds_3_tfdisfec = AV32TFDisFec ;
      AV114Generacionhdrsds_4_tfclicod = AV36TFCliCod ;
      AV115Generacionhdrsds_5_tfclicod_to = AV37TFCliCod_To ;
      AV116Generacionhdrsds_6_tfclinom = AV38TFCliNom ;
      AV117Generacionhdrsds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV118Generacionhdrsds_8_tfdispart = AV42TFDisPart ;
      AV119Generacionhdrsds_9_tfdispart_to = AV43TFDisPart_To ;
      AV120Generacionhdrsds_10_tfdisartcod = AV44TFDisArtCod ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV122Generacionhdrsds_12_tfdisartdsc = AV46TFDisArtDsc ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV124Generacionhdrsds_14_tfdiscolnom = AV48TFDisColNom ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV126Generacionhdrsds_16_tfdiscolnum = AV50TFDisColNum ;
      AV127Generacionhdrsds_17_tfdiscolnum_to = AV51TFDisColNum_To ;
      AV128Generacionhdrsds_18_tfdistipcol = AV52TFDisTipCol ;
      AV129Generacionhdrsds_19_tfdistipcol_to = AV53TFDisTipCol_To ;
      AV130Generacionhdrsds_20_tfdisnomcli = AV54TFDisNomCli ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = AV55TFDisNomCli_Sel ;
      AV132Generacionhdrsds_22_tfdisunimed = AV56TFDisUniMed ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = AV57TFDisUniMed_Sel ;
      AV134Generacionhdrsds_24_tfdispiepie = AV58TFDisPiePie ;
      AV135Generacionhdrsds_25_tfdispiepie_to = AV59TFDisPiePie_To ;
      AV136Generacionhdrsds_26_tfdispiekgm = AV60TFDisPieKgm ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = AV61TFDisPieKgm_To ;
      AV138Generacionhdrsds_28_tfdispiemtr = AV62TFDisPieMtr ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = AV63TFDisPieMtr_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV111Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV112Generacionhdrsds_2_tfdiscod_to) ,
                                           AV113Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV114Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV115Generacionhdrsds_5_tfclicod_to) ,
                                           AV117Generacionhdrsds_7_tfclinom_sel ,
                                           AV116Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV118Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV119Generacionhdrsds_9_tfdispart_to) ,
                                           AV121Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV120Generacionhdrsds_10_tfdisartcod ,
                                           AV123Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV122Generacionhdrsds_12_tfdisartdsc ,
                                           AV125Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV124Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV126Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV127Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV128Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV129Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV131Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV130Generacionhdrsds_20_tfdisnomcli ,
                                           AV133Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV132Generacionhdrsds_22_tfdisunimed ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV136Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV137Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV138Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV139Generacionhdrsds_29_tfdispiemtr_to ,
                                           AV6EmprCod ,
                                           Byte.valueOf(AV82DisEst) ,
                                           A396EmprCod ,
                                           Byte.valueOf(A367DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV116Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV116Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV120Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV120Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV122Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV122Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV124Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV124Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV130Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV130Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV132Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV132Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor H019U10 */
      pr_default.execute(5, new Object[] {AV6EmprCod, Byte.valueOf(AV82DisEst), Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV134Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV135Generacionhdrsds_25_tfdispiepie_to), Integer.valueOf(AV111Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV112Generacionhdrsds_2_tfdiscod_to), AV113Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV114Generacionhdrsds_4_tfclicod), Integer.valueOf(AV115Generacionhdrsds_5_tfclicod_to), lV116Generacionhdrsds_6_tfclinom, AV117Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV118Generacionhdrsds_8_tfdispart), Short.valueOf(AV119Generacionhdrsds_9_tfdispart_to), lV120Generacionhdrsds_10_tfdisartcod, AV121Generacionhdrsds_11_tfdisartcod_sel, lV122Generacionhdrsds_12_tfdisartdsc, AV123Generacionhdrsds_13_tfdisartdsc_sel, lV124Generacionhdrsds_14_tfdiscolnom, AV125Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV126Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV127Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV128Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV129Generacionhdrsds_19_tfdistipcol_to), lV130Generacionhdrsds_20_tfdisnomcli, AV131Generacionhdrsds_21_tfdisnomcli_sel, lV132Generacionhdrsds_22_tfdisunimed, AV133Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A367DisEst = H019U10_A367DisEst[0] ;
         A396EmprCod = H019U10_A396EmprCod[0] ;
         A392DisUniMed = H019U10_A392DisUniMed[0] ;
         A1195DisNomCli = H019U10_A1195DisNomCli[0] ;
         A390DisTipCol = H019U10_A390DisTipCol[0] ;
         n390DisTipCol = H019U10_n390DisTipCol[0] ;
         A363DisColNum = H019U10_A363DisColNum[0] ;
         n363DisColNum = H019U10_n363DisColNum[0] ;
         A362DisColNom = H019U10_A362DisColNom[0] ;
         n362DisColNom = H019U10_n362DisColNom[0] ;
         A337DisArtDsc = H019U10_A337DisArtDsc[0] ;
         A335DisArtCod = H019U10_A335DisArtCod[0] ;
         A1502DisPart = H019U10_A1502DisPart[0] ;
         A279CliNom = H019U10_A279CliNom[0] ;
         A252CliCod = H019U10_A252CliCod[0] ;
         A369DisFec = H019U10_A369DisFec[0] ;
         A361DisCod = H019U10_A361DisCod[0] ;
         A387DisPiePie = H019U10_A387DisPiePie[0] ;
         n387DisPiePie = H019U10_n387DisPiePie[0] ;
         A365DisDes = H019U10_A365DisDes[0] ;
         A279CliNom = H019U10_A279CliNom[0] ;
         A387DisPiePie = H019U10_A387DisPiePie[0] ;
         n387DisPiePie = H019U10_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV136Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV137Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV138Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV139Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV85TotDisPiePie = (long)(A387DisPiePie+AV85TotDisPiePie) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TotDisPiePie), 18, 0));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV85TotDisPiePie), "ZZZ9")));
                     AV87TotDisPieKgm = A381DisPieKgm.add(AV87TotDisPieKgm) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotDisPieKgm", GXutil.ltrimstr( AV87TotDisPieKgm, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV87TotDisPieKgm, "ZZZZZ9.99")));
                     AV89TotDisPieMtr = A385DisPieMtr.add(AV89TotDisPieMtr) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotDisPieMtr", GXutil.ltrimstr( AV89TotDisPieMtr, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV89TotDisPieMtr, "ZZZZZ9.99")));
                  }
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV86TotValueDisPiePie = localUtil.format( DecimalUtil.doubleToDec(AV85TotDisPiePie), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotValueDisPiePie", AV86TotValueDisPiePie);
      AV88TotValueDisPieKgm = localUtil.format( AV87TotDisPieKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TotValueDisPieKgm", AV88TotValueDisPieKgm);
      AV90TotValueDisPieMtr = localUtil.format( AV89TotDisPieMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotValueDisPieMtr", AV90TotValueDisPieMtr);
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINARACCESORIOS' Routine */
      returnInSub = false ;
      GXv_int11[0] = AV21MacCod ;
      new app.pelimac(remoteHandle, context).execute( AV6EmprCod, GXv_int11) ;
      generacionhdrs_impl.this.AV21MacCod = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21MacCod), 8, 0));
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void wb_table5_119_19U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname, tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("Title", Dvelop_confirmpanel_btneliminaraccesorios_Title);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype);
         ucDvelop_confirmpanel_btneliminaraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminaraccesorios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_119_19U2e( true) ;
      }
      else
      {
         wb_table5_119_19U2e( false) ;
      }
   }

   public void wb_table4_114_19U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname, tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("Title", Dvelop_confirmpanel_btnincluiraccesorios_Title);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype);
         ucDvelop_confirmpanel_btnincluiraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnincluiraccesorios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_114_19U2e( true) ;
      }
      else
      {
         wb_table4_114_19U2e( false) ;
      }
   }

   public void wb_table3_109_19U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_generarhdr_Internalname, tblTabledvelop_confirmpanel_generarhdr_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_generarhdr.setProperty("Title", Dvelop_confirmpanel_generarhdr_Title);
         ucDvelop_confirmpanel_generarhdr.setProperty("ConfirmationText", Dvelop_confirmpanel_generarhdr_Confirmationtext);
         ucDvelop_confirmpanel_generarhdr.setProperty("YesButtonCaption", Dvelop_confirmpanel_generarhdr_Yesbuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("NoButtonCaption", Dvelop_confirmpanel_generarhdr_Nobuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("CancelButtonCaption", Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("YesButtonPosition", Dvelop_confirmpanel_generarhdr_Yesbuttonposition);
         ucDvelop_confirmpanel_generarhdr.setProperty("ConfirmType", Dvelop_confirmpanel_generarhdr_Confirmtype);
         ucDvelop_confirmpanel_generarhdr.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_generarhdr_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDRContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_109_19U2e( true) ;
      }
      else
      {
         wb_table3_109_19U2e( false) ;
      }
   }

   public void wb_table2_76_19U2( boolean wbgen )
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
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedispiepie_Internalname, httpContext.getMessage( "Tot Value Dis Pie Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'" + sPrefix + "',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedispiepie_Internalname, AV86TotValueDisPiePie, GXutil.rtrim( localUtil.format( AV86TotValueDisPiePie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedispiepie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedispiepie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedispiekgm_Internalname, httpContext.getMessage( "Tot Value Dis Pie Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'" + sPrefix + "',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedispiekgm_Internalname, AV88TotValueDisPieKgm, GXutil.rtrim( localUtil.format( AV88TotValueDisPieKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedispiekgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedispiekgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedispiemtr_Internalname, httpContext.getMessage( "Tot Value Dis Pie Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'" + sPrefix + "',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedispiemtr_Internalname, AV90TotValueDisPieMtr, GXutil.rtrim( localUtil.format( AV90TotValueDisPieMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedispiemtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedispiemtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_76_19U2e( true) ;
      }
      else
      {
         wb_table2_76_19U2e( false) ;
      }
   }

   public void wb_table1_18_19U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnincluiraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Incluir", ""), bttBtnincluiraccesorios_Jsonclick, 5, httpContext.getMessage( "Incluir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINCLUIRACCESORIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GeneracionHDRs.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableincluir_maccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockincluir_maccod_Internalname, httpContext.getMessage( "Nº Macro", ""), "", "", lblTextblockincluir_maccod_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIncluir_maccod_Internalname, httpContext.getMessage( "Incluir_Maccod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIncluir_maccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV108Incluir_Maccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIncluir_maccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV108Incluir_Maccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV108Incluir_Maccod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIncluir_maccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIncluir_maccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GeneracionHDRs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminaraccesorios_Jsonclick, 7, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e2219u1_client"+"'", TempTags, "", 2, "HLP_GeneracionHDRs.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_18_19U2e( true) ;
      }
      else
      {
         wb_table1_18_19U2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      AV82DisEst = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82DisEst", GXutil.str( AV82DisEst, 1, 0));
      AV107BarNHdr = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarNHdr", AV107BarNHdr);
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
      pa19U2( ) ;
      ws19U2( ) ;
      we19U2( ) ;
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
      sCtrlAV6EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV82DisEst = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV107BarNHdr = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa19U2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "generacionhdrs", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa19U2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV6EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
         AV82DisEst = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82DisEst", GXutil.str( AV82DisEst, 1, 0));
         AV107BarNHdr = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarNHdr", AV107BarNHdr);
      }
      wcpOAV6EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV6EmprCod") ;
      wcpOAV82DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV82DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV107BarNHdr = httpContext.cgiGet( sPrefix+"wcpOAV107BarNHdr") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV6EmprCod, wcpOAV6EmprCod) != 0 ) || ( AV82DisEst != wcpOAV82DisEst ) || ( GXutil.strcmp(AV107BarNHdr, wcpOAV107BarNHdr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV6EmprCod = AV6EmprCod ;
      wcpOAV82DisEst = AV82DisEst ;
      wcpOAV107BarNHdr = AV107BarNHdr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV6EmprCod = httpContext.cgiGet( sPrefix+"AV6EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6EmprCod) > 0 )
      {
         AV6EmprCod = httpContext.cgiGet( sCtrlAV6EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      }
      else
      {
         AV6EmprCod = httpContext.cgiGet( sPrefix+"AV6EmprCod_PARM") ;
      }
      sCtrlAV82DisEst = httpContext.cgiGet( sPrefix+"AV82DisEst_CTRL") ;
      if ( GXutil.len( sCtrlAV82DisEst) > 0 )
      {
         AV82DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV82DisEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82DisEst", GXutil.str( AV82DisEst, 1, 0));
      }
      else
      {
         AV82DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV82DisEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV107BarNHdr = httpContext.cgiGet( sPrefix+"AV107BarNHdr_CTRL") ;
      if ( GXutil.len( sCtrlAV107BarNHdr) > 0 )
      {
         AV107BarNHdr = httpContext.cgiGet( sCtrlAV107BarNHdr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarNHdr", AV107BarNHdr);
      }
      else
      {
         AV107BarNHdr = httpContext.cgiGet( sPrefix+"AV107BarNHdr_PARM") ;
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
      pa19U2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws19U2( ) ;
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
      ws19U2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6EmprCod_PARM", GXutil.rtrim( AV6EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6EmprCod_CTRL", GXutil.rtrim( sCtrlAV6EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82DisEst_PARM", GXutil.ltrim( localUtil.ntoc( AV82DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV82DisEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82DisEst_CTRL", GXutil.rtrim( sCtrlAV82DisEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107BarNHdr_PARM", GXutil.rtrim( AV107BarNHdr));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV107BarNHdr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107BarNHdr_CTRL", GXutil.rtrim( sCtrlAV107BarNHdr));
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
      we19U2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821168550", true, true);
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
      httpContext.AddJavascriptSource("generacionhdrs.js", "?2026821168550", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_552( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_55_idx );
      edtDisCod_Internalname = sPrefix+"DISCOD_"+sGXsfl_55_idx ;
      edtDisFec_Internalname = sPrefix+"DISFEC_"+sGXsfl_55_idx ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD_"+sGXsfl_55_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_55_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_55_idx ;
      edtavDisenccli_Internalname = sPrefix+"vDISENCCLI_"+sGXsfl_55_idx ;
      edtDisPart_Internalname = sPrefix+"DISPART_"+sGXsfl_55_idx ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD_"+sGXsfl_55_idx ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC_"+sGXsfl_55_idx ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM_"+sGXsfl_55_idx ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM_"+sGXsfl_55_idx ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL_"+sGXsfl_55_idx ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI_"+sGXsfl_55_idx ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED_"+sGXsfl_55_idx ;
      edtDisPiePie_Internalname = sPrefix+"DISPIEPIE_"+sGXsfl_55_idx ;
      edtDisPieKgm_Internalname = sPrefix+"DISPIEKGM_"+sGXsfl_55_idx ;
      edtDisPieMtr_Internalname = sPrefix+"DISPIEMTR_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_55_fel_idx );
      edtDisCod_Internalname = sPrefix+"DISCOD_"+sGXsfl_55_fel_idx ;
      edtDisFec_Internalname = sPrefix+"DISFEC_"+sGXsfl_55_fel_idx ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD_"+sGXsfl_55_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_55_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_55_fel_idx ;
      edtavDisenccli_Internalname = sPrefix+"vDISENCCLI_"+sGXsfl_55_fel_idx ;
      edtDisPart_Internalname = sPrefix+"DISPART_"+sGXsfl_55_fel_idx ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD_"+sGXsfl_55_fel_idx ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC_"+sGXsfl_55_fel_idx ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM_"+sGXsfl_55_fel_idx ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM_"+sGXsfl_55_fel_idx ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL_"+sGXsfl_55_fel_idx ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI_"+sGXsfl_55_fel_idx ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED_"+sGXsfl_55_fel_idx ;
      edtDisPiePie_Internalname = sPrefix+"DISPIEPIE_"+sGXsfl_55_fel_idx ;
      edtDisPieKgm_Internalname = sPrefix+"DISPIEKGM_"+sGXsfl_55_fel_idx ;
      edtDisPieMtr_Internalname = sPrefix+"DISPIEMTR_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wb19U0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_55_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_55_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV9Seleccionar,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFec_Internalname,localUtil.format(A369DisFec, "99/99/99"),localUtil.format( A369DisFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaccod_Enabled!=0)&&(edtavMaccod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'"+sPrefix+"',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaccod_Internalname,GXutil.ltrim( localUtil.ntoc( AV21MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21MacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21MacCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavMaccod_Enabled!=0)&&(edtavMaccod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDisenccli_Enabled!=0)&&(edtavDisenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'"+sPrefix+"',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDisenccli_Internalname,GXutil.rtrim( AV84DisEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDisenccli_Enabled!=0)&&(edtavDisenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDisenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDisenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPart_Internalname,GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtDsc_Internalname,GXutil.rtrim( A337DisArtDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNom_Internalname,GXutil.rtrim( A362DisColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNomCli_Internalname,GXutil.rtrim( A1195DisNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A381DisPieKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A385DisPieMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes19U2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void startgridcontrol55( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"55\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Disp Int", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Accesorio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Partida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "pzs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "mts", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV9Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A369DisFec, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21MacCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV84DisEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDisenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A335DisArtCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A337DisArtDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A362DisColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1195DisNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A392DisUniMed));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
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
      bttBtnincluiraccesorios_Internalname = sPrefix+"BTNINCLUIRACCESORIOS" ;
      lblTextblockincluir_maccod_Internalname = sPrefix+"TEXTBLOCKINCLUIR_MACCOD" ;
      edtavIncluir_maccod_Internalname = sPrefix+"vINCLUIR_MACCOD" ;
      divUnnamedtableincluir_maccod_Internalname = sPrefix+"UNNAMEDTABLEINCLUIR_MACCOD" ;
      bttBtneliminaraccesorios_Internalname = sPrefix+"BTNELIMINARACCESORIOS" ;
      tblUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      bttBtngenerarhdr_Internalname = sPrefix+"BTNGENERARHDR" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtDisFec_Internalname = sPrefix+"DISFEC" ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtavDisenccli_Internalname = sPrefix+"vDISENCCLI" ;
      edtDisPart_Internalname = sPrefix+"DISPART" ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD" ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC" ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM" ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM" ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL" ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI" ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED" ;
      edtDisPiePie_Internalname = sPrefix+"DISPIEPIE" ;
      edtDisPieKgm_Internalname = sPrefix+"DISPIEKGM" ;
      edtDisPieMtr_Internalname = sPrefix+"DISPIEMTR" ;
      edtavTotvaluedispiepie_Internalname = sPrefix+"vTOTVALUEDISPIEPIE" ;
      edtavTotvaluedispiekgm_Internalname = sPrefix+"vTOTVALUEDISPIEKGM" ;
      edtavTotvaluedispiemtr_Internalname = sPrefix+"vTOTVALUEDISPIEMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_generarhdr_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_GENERARHDR" ;
      tblTabledvelop_confirmpanel_generarhdr_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_GENERARHDR" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS" ;
      tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS" ;
      tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_disfecauxdate_Internalname = sPrefix+"vDDO_DISFECAUXDATE" ;
      divDdo_disfecauxdates_Internalname = sPrefix+"DDO_DISFECAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieKgm_Jsonclick = "" ;
      edtDisPiePie_Jsonclick = "" ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisTipCol_Jsonclick = "" ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNom_Jsonclick = "" ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisPart_Jsonclick = "" ;
      edtavDisenccli_Jsonclick = "" ;
      edtavDisenccli_Visible = -1 ;
      edtavDisenccli_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavMaccod_Jsonclick = "" ;
      edtavMaccod_Visible = -1 ;
      edtavMaccod_Enabled = 1 ;
      edtDisFec_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavIncluir_maccod_Jsonclick = "" ;
      edtavIncluir_maccod_Enabled = 1 ;
      edtavTotvaluedispiemtr_Jsonclick = "" ;
      edtavTotvaluedispiemtr_Enabled = 1 ;
      edtavTotvaluedispiekgm_Jsonclick = "" ;
      edtavTotvaluedispiekgm_Enabled = 1 ;
      edtavTotvaluedispiepie_Jsonclick = "" ;
      edtavTotvaluedispiepie_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_disfecauxdate_Jsonclick = "" ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;Cliente;Cliente;;;Articulo;Articulo;;Color;;;;;;" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = "¿Desea eliminar el accesorio?" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Title = "" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = "¿Desea añadir el Nº Ped. Int.  al accesorio?" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Title = "" ;
      Dvelop_confirmpanel_generarhdr_Confirmtype = "1" ;
      Dvelop_confirmpanel_generarhdr_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_generarhdr_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_generarhdr_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_generarhdr_Confirmationtext = "¿Desea Generar HDR?" ;
      Dvelop_confirmpanel_generarhdr_Title = "" ;
      Ddo_grid_Datalistproc = "GeneracionHDRsGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|||" ;
      Ddo_grid_Includedatalist = "|||T||T|T|T|||T|T|||" ;
      Ddo_grid_Filterisrange = "T||T||T||||T|T|||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Date|Numeric|Character|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|||" ;
      Ddo_grid_Columnids = "1:DisCod|2:DisFec|4:CliCod|5:CliNom|7:DisPart|8:DisArtCod|9:DisArtDsc|10:DisColNom|11:DisColNum|12:DisTipCol|13:DisNomCli|14:DisUniMed|15:DisPiePie|16:DisPieKgm|17:DisPieMtr" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_55_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_55_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV88TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV90TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1219U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1319U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1419U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2119U2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A4813DisEncCli',fld:'DISENCCLI',pic:''},{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV9Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV21MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV84DisEncCli',fld:'vDISENCCLI',pic:''}]}");
      setEventMetadata("'DOGENERARHDR'","{handler:'e1119U1',iparms:[{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''}]");
      setEventMetadata("'DOGENERARHDR'",",oparms:[{av:'Dvelop_confirmpanel_generarhdr_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_GENERARHDR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE","{handler:'e1519U2',iparms:[{av:'Dvelop_confirmpanel_generarhdr_Result',ctrl:'DVELOP_CONFIRMPANEL_GENERARHDR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV72BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV21MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV104TablaHdrs_SDT',fld:'vTABLAHDRS_SDT',pic:''},{av:'AV74TabHdr',fld:'vTABHDR',pic:''},{av:'AV94Col_Maccod',fld:'vCOL_MACCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE",",oparms:[{av:'AV72BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74TabHdr',fld:'vTABHDR',pic:''},{av:'AV104TablaHdrs_SDT',fld:'vTABLAHDRS_SDT',pic:''},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV94Col_Maccod',fld:'vCOL_MACCOD',pic:''},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV88TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV90TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("'DOINCLUIRACCESORIOS'","{handler:'e1819U2',iparms:[{av:'AV108Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINCLUIRACCESORIOS'",",oparms:[{av:'Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE","{handler:'e1619U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btnincluiraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS',prop:'Result'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV108Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE",",oparms:[{av:'AV108Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV88TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV90TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("'DOELIMINARACCESORIOS'","{handler:'e2219U1',iparms:[{av:'AV21MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOELIMINARACCESORIOS'",",oparms:[{av:'Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE","{handler:'e1719U2',iparms:[{av:'Dvelop_confirmpanel_btneliminaraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82DisEst',fld:'vDISEST',pic:'9'},{av:'AV30TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV31TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV36TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV37TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV39TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV43TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV44TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV45TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV46TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV47TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV48TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV49TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV50TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV51TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV53TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV55TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV56TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV57TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV58TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV59TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV60TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV61TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV63TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV83Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV71MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV100Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV103Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV5Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV21MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE",",oparms:[{av:'AV21MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV85TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV87TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV89TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV88TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV90TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("VALIDV_INCLUIR_MACCOD","{handler:'validv_Incluir_maccod',iparms:[]");
      setEventMetadata("VALIDV_INCLUIR_MACCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DISPIEKGM","{handler:'valid_Dispiekgm',iparms:[]");
      setEventMetadata("VALID_DISPIEKGM",",oparms:[]}");
      setEventMetadata("VALID_DISPIEMTR","{handler:'valid_Dispiemtr',iparms:[]");
      setEventMetadata("VALID_DISPIEMTR",",oparms:[]}");
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
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H019U11 */
      pr_default.execute(6, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         X631Metros = H019U11_A631Metros[0] ;
      }
      pr_default.close(6);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H019U12 */
      pr_default.execute(7, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         X384DisPieMet = H019U12_A384DisPieMet[0] ;
      }
      pr_default.close(7);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor H019U13 */
      pr_default.execute(8, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         X595Kilos = H019U13_A595Kilos[0] ;
      }
      pr_default.close(8);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor H019U14 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         X382DisPieKil = H019U14_A382DisPieKil[0] ;
      }
      pr_default.close(9);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      wcpOAV6EmprCod = "" ;
      wcpOAV107BarNHdr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_generarhdr_Result = "" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Result = "" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV6EmprCod = "" ;
      AV107BarNHdr = "" ;
      AV32TFDisFec = GXutil.nullDate() ;
      AV38TFCliNom = "" ;
      AV39TFCliNom_Sel = "" ;
      AV44TFDisArtCod = "" ;
      AV45TFDisArtCod_Sel = "" ;
      AV46TFDisArtDsc = "" ;
      AV47TFDisArtDsc_Sel = "" ;
      AV48TFDisColNom = "" ;
      AV49TFDisColNom_Sel = "" ;
      AV54TFDisNomCli = "" ;
      AV55TFDisNomCli_Sel = "" ;
      AV56TFDisUniMed = "" ;
      AV57TFDisUniMed_Sel = "" ;
      AV60TFDisPieKgm = DecimalUtil.ZERO ;
      AV61TFDisPieKgm_To = DecimalUtil.ZERO ;
      AV62TFDisPieMtr = DecimalUtil.ZERO ;
      AV63TFDisPieMtr_To = DecimalUtil.ZERO ;
      AV144Pgmname = "" ;
      AV87TotDisPieKgm = DecimalUtil.ZERO ;
      AV89TotDisPieMtr = DecimalUtil.ZERO ;
      AV83Col_Discod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV71MaqCod = "" ;
      AV8UsurCod = "" ;
      AV5Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV64DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4813DisEncCli = "" ;
      A360DisCliNum = "" ;
      AV104TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      AV74TabHdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV74TabHdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV94Col_Maccod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      A396EmprCod = "" ;
      A365DisDes = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtngenerarhdr_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV34DDO_DisFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9Seleccionar = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV84DisEncCli = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A392DisUniMed = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      AV113Generacionhdrsds_3_tfdisfec = GXutil.nullDate() ;
      AV116Generacionhdrsds_6_tfclinom = "" ;
      AV117Generacionhdrsds_7_tfclinom_sel = "" ;
      AV120Generacionhdrsds_10_tfdisartcod = "" ;
      AV121Generacionhdrsds_11_tfdisartcod_sel = "" ;
      AV122Generacionhdrsds_12_tfdisartdsc = "" ;
      AV123Generacionhdrsds_13_tfdisartdsc_sel = "" ;
      AV124Generacionhdrsds_14_tfdiscolnom = "" ;
      AV125Generacionhdrsds_15_tfdiscolnom_sel = "" ;
      AV130Generacionhdrsds_20_tfdisnomcli = "" ;
      AV131Generacionhdrsds_21_tfdisnomcli_sel = "" ;
      AV132Generacionhdrsds_22_tfdisunimed = "" ;
      AV133Generacionhdrsds_23_tfdisunimed_sel = "" ;
      AV136Generacionhdrsds_26_tfdispiekgm = DecimalUtil.ZERO ;
      AV137Generacionhdrsds_27_tfdispiekgm_to = DecimalUtil.ZERO ;
      AV138Generacionhdrsds_28_tfdispiemtr = DecimalUtil.ZERO ;
      AV139Generacionhdrsds_29_tfdispiemtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV116Generacionhdrsds_6_tfclinom = "" ;
      lV120Generacionhdrsds_10_tfdisartcod = "" ;
      lV122Generacionhdrsds_12_tfdisartdsc = "" ;
      lV124Generacionhdrsds_14_tfdiscolnom = "" ;
      lV130Generacionhdrsds_20_tfdisnomcli = "" ;
      lV132Generacionhdrsds_22_tfdisunimed = "" ;
      H019U3_A361DisCod = new int[1] ;
      H019U3_A396EmprCod = new String[] {""} ;
      H019U3_A367DisEst = new byte[1] ;
      H019U3_A360DisCliNum = new String[] {""} ;
      H019U3_A4813DisEncCli = new String[] {""} ;
      H019U3_A392DisUniMed = new String[] {""} ;
      H019U3_A1195DisNomCli = new String[] {""} ;
      H019U3_A390DisTipCol = new byte[1] ;
      H019U3_n390DisTipCol = new boolean[] {false} ;
      H019U3_A363DisColNum = new int[1] ;
      H019U3_n363DisColNum = new boolean[] {false} ;
      H019U3_A362DisColNom = new String[] {""} ;
      H019U3_n362DisColNom = new boolean[] {false} ;
      H019U3_A337DisArtDsc = new String[] {""} ;
      H019U3_A335DisArtCod = new String[] {""} ;
      H019U3_A1502DisPart = new short[1] ;
      H019U3_A279CliNom = new String[] {""} ;
      H019U3_A252CliCod = new int[1] ;
      H019U3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H019U3_A387DisPiePie = new short[1] ;
      H019U3_n387DisPiePie = new boolean[] {false} ;
      H019U3_A365DisDes = new String[] {""} ;
      H019U5_A361DisCod = new int[1] ;
      H019U5_A396EmprCod = new String[] {""} ;
      H019U5_A367DisEst = new byte[1] ;
      H019U5_A360DisCliNum = new String[] {""} ;
      H019U5_A4813DisEncCli = new String[] {""} ;
      H019U5_A392DisUniMed = new String[] {""} ;
      H019U5_A1195DisNomCli = new String[] {""} ;
      H019U5_A390DisTipCol = new byte[1] ;
      H019U5_n390DisTipCol = new boolean[] {false} ;
      H019U5_A363DisColNum = new int[1] ;
      H019U5_n363DisColNum = new boolean[] {false} ;
      H019U5_A362DisColNom = new String[] {""} ;
      H019U5_n362DisColNom = new boolean[] {false} ;
      H019U5_A337DisArtDsc = new String[] {""} ;
      H019U5_A335DisArtCod = new String[] {""} ;
      H019U5_A1502DisPart = new short[1] ;
      H019U5_A279CliNom = new String[] {""} ;
      H019U5_A252CliCod = new int[1] ;
      H019U5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H019U5_A387DisPiePie = new short[1] ;
      H019U5_n387DisPiePie = new boolean[] {false} ;
      H019U5_A365DisDes = new String[] {""} ;
      AV86TotValueDisPiePie = "" ;
      AV88TotValueDisPieKgm = "" ;
      AV90TotValueDisPieMtr = "" ;
      AV7EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      H019U6_A1201MacLin = new short[1] ;
      H019U6_A1202MacDisCod = new int[1] ;
      H019U6_A396EmprCod = new String[] {""} ;
      H019U6_A1199MacCod = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV99ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      H019U7_A1199MacCod = new int[1] ;
      H019U7_A396EmprCod = new String[] {""} ;
      H019U8_A1201MacLin = new short[1] ;
      H019U8_A1202MacDisCod = new int[1] ;
      H019U8_A396EmprCod = new String[] {""} ;
      H019U8_A1199MacCod = new int[1] ;
      Gx_msg = "" ;
      ucDvelop_confirmpanel_btnincluiraccesorios = new com.genexus.webpanels.GXUserControl();
      GXv_int10 = new int[1] ;
      AV105TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV97Inc_obs1 = "" ;
      AV78BarCodpar = "" ;
      GXv_int6 = new byte[1] ;
      AV98Inc_obs2 = "" ;
      AV106TablaHdrs_SDTJson = "" ;
      AV26Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      H019U10_A367DisEst = new byte[1] ;
      H019U10_A396EmprCod = new String[] {""} ;
      H019U10_A392DisUniMed = new String[] {""} ;
      H019U10_A1195DisNomCli = new String[] {""} ;
      H019U10_A390DisTipCol = new byte[1] ;
      H019U10_n390DisTipCol = new boolean[] {false} ;
      H019U10_A363DisColNum = new int[1] ;
      H019U10_n363DisColNum = new boolean[] {false} ;
      H019U10_A362DisColNom = new String[] {""} ;
      H019U10_n362DisColNom = new boolean[] {false} ;
      H019U10_A337DisArtDsc = new String[] {""} ;
      H019U10_A335DisArtCod = new String[] {""} ;
      H019U10_A1502DisPart = new short[1] ;
      H019U10_A279CliNom = new String[] {""} ;
      H019U10_A252CliCod = new int[1] ;
      H019U10_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H019U10_A361DisCod = new int[1] ;
      H019U10_A387DisPiePie = new short[1] ;
      H019U10_n387DisPiePie = new boolean[] {false} ;
      H019U10_A365DisDes = new String[] {""} ;
      GXv_int11 = new int[1] ;
      ucDvelop_confirmpanel_btneliminaraccesorios = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_generarhdr = new com.genexus.webpanels.GXUserControl();
      bttBtnincluiraccesorios_Jsonclick = "" ;
      lblTextblockincluir_maccod_Jsonclick = "" ;
      bttBtneliminaraccesorios_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV6EmprCod = "" ;
      sCtrlAV82DisEst = "" ;
      sCtrlAV107BarNHdr = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      X631Metros = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      H019U11_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      H019U12_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      H019U13_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      H019U14_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.generacionhdrs__default(),
         new Object[] {
             new Object[] {
            H019U3_A361DisCod, H019U3_A396EmprCod, H019U3_A367DisEst, H019U3_A360DisCliNum, H019U3_A4813DisEncCli, H019U3_A392DisUniMed, H019U3_A1195DisNomCli, H019U3_A390DisTipCol, H019U3_n390DisTipCol, H019U3_A363DisColNum,
            H019U3_n363DisColNum, H019U3_A362DisColNom, H019U3_n362DisColNom, H019U3_A337DisArtDsc, H019U3_A335DisArtCod, H019U3_A1502DisPart, H019U3_A279CliNom, H019U3_A252CliCod, H019U3_A369DisFec, H019U3_A387DisPiePie,
            H019U3_n387DisPiePie, H019U3_A365DisDes
            }
            , new Object[] {
            H019U5_A361DisCod, H019U5_A396EmprCod, H019U5_A367DisEst, H019U5_A360DisCliNum, H019U5_A4813DisEncCli, H019U5_A392DisUniMed, H019U5_A1195DisNomCli, H019U5_A390DisTipCol, H019U5_n390DisTipCol, H019U5_A363DisColNum,
            H019U5_n363DisColNum, H019U5_A362DisColNom, H019U5_n362DisColNom, H019U5_A337DisArtDsc, H019U5_A335DisArtCod, H019U5_A1502DisPart, H019U5_A279CliNom, H019U5_A252CliCod, H019U5_A369DisFec, H019U5_A387DisPiePie,
            H019U5_n387DisPiePie, H019U5_A365DisDes
            }
            , new Object[] {
            H019U6_A1201MacLin, H019U6_A1202MacDisCod, H019U6_A396EmprCod, H019U6_A1199MacCod
            }
            , new Object[] {
            H019U7_A1199MacCod, H019U7_A396EmprCod
            }
            , new Object[] {
            H019U8_A1201MacLin, H019U8_A1202MacDisCod, H019U8_A396EmprCod, H019U8_A1199MacCod
            }
            , new Object[] {
            H019U10_A367DisEst, H019U10_A396EmprCod, H019U10_A392DisUniMed, H019U10_A1195DisNomCli, H019U10_A390DisTipCol, H019U10_n390DisTipCol, H019U10_A363DisColNum, H019U10_n363DisColNum, H019U10_A362DisColNom, H019U10_n362DisColNom,
            H019U10_A337DisArtDsc, H019U10_A335DisArtCod, H019U10_A1502DisPart, H019U10_A279CliNom, H019U10_A252CliCod, H019U10_A369DisFec, H019U10_A361DisCod, H019U10_A387DisPiePie, H019U10_n387DisPiePie, H019U10_A365DisDes
            }
            , new Object[] {
            H019U11_A631Metros
            }
            , new Object[] {
            H019U12_A384DisPieMet
            }
            , new Object[] {
            H019U13_A595Kilos
            }
            , new Object[] {
            H019U14_A382DisPieKil
            }
         }
      );
      AV144Pgmname = "GeneracionHDRs" ;
      /* GeneXus formulas. */
      AV144Pgmname = "GeneracionHDRs" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavMaccod_Enabled = 0 ;
      edtavDisenccli_Enabled = 0 ;
      edtavTotvaluedispiepie_Enabled = 0 ;
      edtavTotvaluedispiekgm_Enabled = 0 ;
      edtavTotvaluedispiemtr_Enabled = 0 ;
   }

   private byte wcpOAV82DisEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV82DisEst ;
   private byte AV52TFDisTipCol ;
   private byte AV53TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A390DisTipCol ;
   private byte nDonePA ;
   private byte AV128Generacionhdrsds_18_tfdistipcol ;
   private byte AV129Generacionhdrsds_19_tfdistipcol_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte AV140GXLvl149 ;
   private byte AV77BarCodreo ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV42TFDisPart ;
   private short AV43TFDisPart_To ;
   private short AV58TFDisPiePie ;
   private short AV59TFDisPiePie_To ;
   private short AV17OrderedBy ;
   private short AV100Moda21 ;
   private short AV103Testrtm ;
   private short AV73Carvitin ;
   private short AV75i ;
   private short AV93lineas ;
   private short wbEnd ;
   private short wbStart ;
   private short A1502DisPart ;
   private short A387DisPiePie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV118Generacionhdrsds_8_tfdispart ;
   private short AV119Generacionhdrsds_9_tfdispart_to ;
   private short AV134Generacionhdrsds_24_tfdispiepie ;
   private short AV135Generacionhdrsds_25_tfdispiepie_to ;
   private short AV68FlagMac ;
   private short AV69FlagDis ;
   private short AV101t ;
   private short AV79MacSav ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int AV30TFDisCod ;
   private int AV31TFDisCod_To ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV50TFDisColNum ;
   private int AV51TFDisColNum_To ;
   private int A1202MacDisCod ;
   private int A1199MacCod ;
   private int AV72BarCodP ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int A361DisCod ;
   private int AV21MacCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int subGrid_Islastpage ;
   private int edtavMaccod_Enabled ;
   private int edtavDisenccli_Enabled ;
   private int edtavTotvaluedispiepie_Enabled ;
   private int edtavTotvaluedispiekgm_Enabled ;
   private int edtavTotvaluedispiemtr_Enabled ;
   private int AV111Generacionhdrsds_1_tfdiscod ;
   private int AV112Generacionhdrsds_2_tfdiscod_to ;
   private int AV114Generacionhdrsds_4_tfclicod ;
   private int AV115Generacionhdrsds_5_tfclicod_to ;
   private int AV126Generacionhdrsds_16_tfdiscolnum ;
   private int AV127Generacionhdrsds_17_tfdiscolnum_to ;
   private int AV108Incluir_Maccod ;
   private int AV65PageToGo ;
   private int AV70MacCod2 ;
   private int AV92discod ;
   private int GXv_int10[] ;
   private int AV76BarCod ;
   private int AV95Maccoditem ;
   private int AV145GXV1 ;
   private int GXv_int11[] ;
   private int edtavIncluir_maccod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavMaccod_Visible ;
   private int edtavDisenccli_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int E361DisCod ;
   private int GX_I ;
   private long GRID_nFirstRecordOnPage ;
   private long AV85TotDisPiePie ;
   private long AV66GridCurrentPage ;
   private long AV67GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV60TFDisPieKgm ;
   private java.math.BigDecimal AV61TFDisPieKgm_To ;
   private java.math.BigDecimal AV62TFDisPieMtr ;
   private java.math.BigDecimal AV63TFDisPieMtr_To ;
   private java.math.BigDecimal AV87TotDisPieKgm ;
   private java.math.BigDecimal AV89TotDisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal AV136Generacionhdrsds_26_tfdispiekgm ;
   private java.math.BigDecimal AV137Generacionhdrsds_27_tfdispiekgm_to ;
   private java.math.BigDecimal AV138Generacionhdrsds_28_tfdispiemtr ;
   private java.math.BigDecimal AV139Generacionhdrsds_29_tfdispiemtr_to ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String wcpOAV6EmprCod ;
   private String wcpOAV107BarNHdr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_generarhdr_Result ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Result ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV6EmprCod ;
   private String AV107BarNHdr ;
   private String sGXsfl_55_idx="0001" ;
   private String AV38TFCliNom ;
   private String AV39TFCliNom_Sel ;
   private String AV44TFDisArtCod ;
   private String AV45TFDisArtCod_Sel ;
   private String AV46TFDisArtDsc ;
   private String AV47TFDisArtDsc_Sel ;
   private String AV48TFDisColNom ;
   private String AV49TFDisColNom_Sel ;
   private String AV54TFDisNomCli ;
   private String AV55TFDisNomCli_Sel ;
   private String AV56TFDisUniMed ;
   private String AV57TFDisUniMed_Sel ;
   private String AV144Pgmname ;
   private String AV71MaqCod ;
   private String AV8UsurCod ;
   private String AV5Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A4813DisEncCli ;
   private String A360DisCliNum ;
   private String AV74TabHdr[] ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_generarhdr_Title ;
   private String Dvelop_confirmpanel_generarhdr_Confirmationtext ;
   private String Dvelop_confirmpanel_generarhdr_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Nobuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Yesbuttonposition ;
   private String Dvelop_confirmpanel_generarhdr_Confirmtype ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Title ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Title ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String bttBtngenerarhdr_Internalname ;
   private String bttBtngenerarhdr_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_disfecauxdates_Internalname ;
   private String edtavDdo_disfecauxdate_Internalname ;
   private String edtavDdo_disfecauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV9Seleccionar ;
   private String edtDisCod_Internalname ;
   private String edtDisFec_Internalname ;
   private String edtavMaccod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String AV84DisEncCli ;
   private String edtavDisenccli_Internalname ;
   private String edtDisPart_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Internalname ;
   private String A362DisColNom ;
   private String edtDisColNom_Internalname ;
   private String edtDisColNum_Internalname ;
   private String edtDisTipCol_Internalname ;
   private String A1195DisNomCli ;
   private String edtDisNomCli_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Internalname ;
   private String edtDisPiePie_Internalname ;
   private String edtDisPieKgm_Internalname ;
   private String edtDisPieMtr_Internalname ;
   private String edtavIncluir_maccod_Internalname ;
   private String edtavTotvaluedispiepie_Internalname ;
   private String edtavTotvaluedispiekgm_Internalname ;
   private String edtavTotvaluedispiemtr_Internalname ;
   private String AV116Generacionhdrsds_6_tfclinom ;
   private String AV117Generacionhdrsds_7_tfclinom_sel ;
   private String AV120Generacionhdrsds_10_tfdisartcod ;
   private String AV121Generacionhdrsds_11_tfdisartcod_sel ;
   private String AV122Generacionhdrsds_12_tfdisartdsc ;
   private String AV123Generacionhdrsds_13_tfdisartdsc_sel ;
   private String AV124Generacionhdrsds_14_tfdiscolnom ;
   private String AV125Generacionhdrsds_15_tfdiscolnom_sel ;
   private String AV130Generacionhdrsds_20_tfdisnomcli ;
   private String AV131Generacionhdrsds_21_tfdisnomcli_sel ;
   private String AV132Generacionhdrsds_22_tfdisunimed ;
   private String AV133Generacionhdrsds_23_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV116Generacionhdrsds_6_tfclinom ;
   private String lV120Generacionhdrsds_10_tfdisartcod ;
   private String lV122Generacionhdrsds_12_tfdisartdsc ;
   private String lV124Generacionhdrsds_14_tfdiscolnom ;
   private String lV130Generacionhdrsds_20_tfdisnomcli ;
   private String lV132Generacionhdrsds_22_tfdisunimed ;
   private String AV7EmprNom ;
   private String Gx_msg ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Internalname ;
   private String AV78BarCodpar ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_generarhdr_Internalname ;
   private String Dvelop_confirmpanel_generarhdr_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluedispiepie_Jsonclick ;
   private String edtavTotvaluedispiekgm_Jsonclick ;
   private String edtavTotvaluedispiemtr_Jsonclick ;
   private String tblUnnamedtable2_Internalname ;
   private String bttBtnincluiraccesorios_Internalname ;
   private String bttBtnincluiraccesorios_Jsonclick ;
   private String divUnnamedtableincluir_maccod_Internalname ;
   private String lblTextblockincluir_maccod_Internalname ;
   private String lblTextblockincluir_maccod_Jsonclick ;
   private String edtavIncluir_maccod_Jsonclick ;
   private String bttBtneliminaraccesorios_Internalname ;
   private String bttBtneliminaraccesorios_Jsonclick ;
   private String sCtrlAV6EmprCod ;
   private String sCtrlAV82DisEst ;
   private String sCtrlAV107BarNHdr ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFec_Jsonclick ;
   private String edtavMaccod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtavDisenccli_Jsonclick ;
   private String edtDisPart_Jsonclick ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisColNom_Jsonclick ;
   private String edtDisColNum_Jsonclick ;
   private String edtDisTipCol_Jsonclick ;
   private String edtDisNomCli_Jsonclick ;
   private String edtDisUniMed_Jsonclick ;
   private String edtDisPiePie_Jsonclick ;
   private String edtDisPieKgm_Jsonclick ;
   private String edtDisPieMtr_Jsonclick ;
   private String subGrid_Header ;
   private String E396EmprCod ;
   private java.util.Date AV32TFDisFec ;
   private java.util.Date AV34DDO_DisFecAuxDate ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV113Generacionhdrsds_3_tfdisfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n387DisPiePie ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV86TotValueDisPiePie ;
   private String AV88TotValueDisPieKgm ;
   private String AV90TotValueDisPieMtr ;
   private String AV97Inc_obs1 ;
   private String AV98Inc_obs2 ;
   private String AV106TablaHdrs_SDTJson ;
   private GXSimpleCollection<Integer> AV83Col_Discod ;
   private GXSimpleCollection<Integer> AV94Col_Maccod ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnincluiraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminaraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_generarhdr ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private int[] H019U3_A361DisCod ;
   private String[] H019U3_A396EmprCod ;
   private byte[] H019U3_A367DisEst ;
   private String[] H019U3_A360DisCliNum ;
   private String[] H019U3_A4813DisEncCli ;
   private String[] H019U3_A392DisUniMed ;
   private String[] H019U3_A1195DisNomCli ;
   private byte[] H019U3_A390DisTipCol ;
   private boolean[] H019U3_n390DisTipCol ;
   private int[] H019U3_A363DisColNum ;
   private boolean[] H019U3_n363DisColNum ;
   private String[] H019U3_A362DisColNom ;
   private boolean[] H019U3_n362DisColNom ;
   private String[] H019U3_A337DisArtDsc ;
   private String[] H019U3_A335DisArtCod ;
   private short[] H019U3_A1502DisPart ;
   private String[] H019U3_A279CliNom ;
   private int[] H019U3_A252CliCod ;
   private java.util.Date[] H019U3_A369DisFec ;
   private short[] H019U3_A387DisPiePie ;
   private boolean[] H019U3_n387DisPiePie ;
   private String[] H019U3_A365DisDes ;
   private int[] H019U5_A361DisCod ;
   private String[] H019U5_A396EmprCod ;
   private byte[] H019U5_A367DisEst ;
   private String[] H019U5_A360DisCliNum ;
   private String[] H019U5_A4813DisEncCli ;
   private String[] H019U5_A392DisUniMed ;
   private String[] H019U5_A1195DisNomCli ;
   private byte[] H019U5_A390DisTipCol ;
   private boolean[] H019U5_n390DisTipCol ;
   private int[] H019U5_A363DisColNum ;
   private boolean[] H019U5_n363DisColNum ;
   private String[] H019U5_A362DisColNom ;
   private boolean[] H019U5_n362DisColNom ;
   private String[] H019U5_A337DisArtDsc ;
   private String[] H019U5_A335DisArtCod ;
   private short[] H019U5_A1502DisPart ;
   private String[] H019U5_A279CliNom ;
   private int[] H019U5_A252CliCod ;
   private java.util.Date[] H019U5_A369DisFec ;
   private short[] H019U5_A387DisPiePie ;
   private boolean[] H019U5_n387DisPiePie ;
   private String[] H019U5_A365DisDes ;
   private short[] H019U6_A1201MacLin ;
   private int[] H019U6_A1202MacDisCod ;
   private String[] H019U6_A396EmprCod ;
   private int[] H019U6_A1199MacCod ;
   private int[] H019U7_A1199MacCod ;
   private String[] H019U7_A396EmprCod ;
   private short[] H019U8_A1201MacLin ;
   private int[] H019U8_A1202MacDisCod ;
   private String[] H019U8_A396EmprCod ;
   private int[] H019U8_A1199MacCod ;
   private byte[] H019U10_A367DisEst ;
   private String[] H019U10_A396EmprCod ;
   private String[] H019U10_A392DisUniMed ;
   private String[] H019U10_A1195DisNomCli ;
   private byte[] H019U10_A390DisTipCol ;
   private boolean[] H019U10_n390DisTipCol ;
   private int[] H019U10_A363DisColNum ;
   private boolean[] H019U10_n363DisColNum ;
   private String[] H019U10_A362DisColNom ;
   private boolean[] H019U10_n362DisColNom ;
   private String[] H019U10_A337DisArtDsc ;
   private String[] H019U10_A335DisArtCod ;
   private short[] H019U10_A1502DisPart ;
   private String[] H019U10_A279CliNom ;
   private int[] H019U10_A252CliCod ;
   private java.util.Date[] H019U10_A369DisFec ;
   private int[] H019U10_A361DisCod ;
   private short[] H019U10_A387DisPiePie ;
   private boolean[] H019U10_n387DisPiePie ;
   private String[] H019U10_A365DisDes ;
   private java.math.BigDecimal[] H019U11_A631Metros ;
   private java.math.BigDecimal[] H019U12_A384DisPieMet ;
   private java.math.BigDecimal[] H019U13_A595Kilos ;
   private java.math.BigDecimal[] H019U14_A382DisPieKil ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV104TablaHdrs_SDT ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV64DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV99ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV105TabladeHdrs_SDTItem ;
}

final  class generacionhdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H019U3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV111Generacionhdrsds_1_tfdiscod ,
                                          int AV112Generacionhdrsds_2_tfdiscod_to ,
                                          java.util.Date AV113Generacionhdrsds_3_tfdisfec ,
                                          int AV114Generacionhdrsds_4_tfclicod ,
                                          int AV115Generacionhdrsds_5_tfclicod_to ,
                                          String AV117Generacionhdrsds_7_tfclinom_sel ,
                                          String AV116Generacionhdrsds_6_tfclinom ,
                                          short AV118Generacionhdrsds_8_tfdispart ,
                                          short AV119Generacionhdrsds_9_tfdispart_to ,
                                          String AV121Generacionhdrsds_11_tfdisartcod_sel ,
                                          String AV120Generacionhdrsds_10_tfdisartcod ,
                                          String AV123Generacionhdrsds_13_tfdisartdsc_sel ,
                                          String AV122Generacionhdrsds_12_tfdisartdsc ,
                                          String AV125Generacionhdrsds_15_tfdiscolnom_sel ,
                                          String AV124Generacionhdrsds_14_tfdiscolnom ,
                                          int AV126Generacionhdrsds_16_tfdiscolnum ,
                                          int AV127Generacionhdrsds_17_tfdiscolnum_to ,
                                          byte AV128Generacionhdrsds_18_tfdistipcol ,
                                          byte AV129Generacionhdrsds_19_tfdistipcol_to ,
                                          String AV131Generacionhdrsds_21_tfdisnomcli_sel ,
                                          String AV130Generacionhdrsds_20_tfdisnomcli ,
                                          String AV133Generacionhdrsds_23_tfdisunimed_sel ,
                                          String AV132Generacionhdrsds_22_tfdisunimed ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A1502DisPart ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          String A392DisUniMed ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          short AV134Generacionhdrsds_24_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV135Generacionhdrsds_25_tfdispiepie_to ,
                                          java.math.BigDecimal AV136Generacionhdrsds_26_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV137Generacionhdrsds_27_tfdispiekgm_to ,
                                          java.math.BigDecimal AV138Generacionhdrsds_28_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV139Generacionhdrsds_29_tfdispiemtr_to ,
                                          String AV6EmprCod ,
                                          byte AV82DisEst ,
                                          String A396EmprCod ,
                                          byte A367DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[29];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.DisCod, T1.EmprCod, T1.DisEst, T1.DisCliNum, T1.DisEncCli, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T3.CliNom, T1.CliCod, T1.DisFec, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod," ;
      scmdbuf += " DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisEst = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) <= ?))");
      if ( ! (0==AV111Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (0==AV112Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (0==AV114Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (0==AV115Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV116Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV118Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (0==AV119Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV124Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV126Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV127Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV128Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV129Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV132Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisPart" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisPart DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H019U5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV111Generacionhdrsds_1_tfdiscod ,
                                          int AV112Generacionhdrsds_2_tfdiscod_to ,
                                          java.util.Date AV113Generacionhdrsds_3_tfdisfec ,
                                          int AV114Generacionhdrsds_4_tfclicod ,
                                          int AV115Generacionhdrsds_5_tfclicod_to ,
                                          String AV117Generacionhdrsds_7_tfclinom_sel ,
                                          String AV116Generacionhdrsds_6_tfclinom ,
                                          short AV118Generacionhdrsds_8_tfdispart ,
                                          short AV119Generacionhdrsds_9_tfdispart_to ,
                                          String AV121Generacionhdrsds_11_tfdisartcod_sel ,
                                          String AV120Generacionhdrsds_10_tfdisartcod ,
                                          String AV123Generacionhdrsds_13_tfdisartdsc_sel ,
                                          String AV122Generacionhdrsds_12_tfdisartdsc ,
                                          String AV125Generacionhdrsds_15_tfdiscolnom_sel ,
                                          String AV124Generacionhdrsds_14_tfdiscolnom ,
                                          int AV126Generacionhdrsds_16_tfdiscolnum ,
                                          int AV127Generacionhdrsds_17_tfdiscolnum_to ,
                                          byte AV128Generacionhdrsds_18_tfdistipcol ,
                                          byte AV129Generacionhdrsds_19_tfdistipcol_to ,
                                          String AV131Generacionhdrsds_21_tfdisnomcli_sel ,
                                          String AV130Generacionhdrsds_20_tfdisnomcli ,
                                          String AV133Generacionhdrsds_23_tfdisunimed_sel ,
                                          String AV132Generacionhdrsds_22_tfdisunimed ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A1502DisPart ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          String A392DisUniMed ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          short AV134Generacionhdrsds_24_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV135Generacionhdrsds_25_tfdispiepie_to ,
                                          java.math.BigDecimal AV136Generacionhdrsds_26_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV137Generacionhdrsds_27_tfdispiekgm_to ,
                                          java.math.BigDecimal AV138Generacionhdrsds_28_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV139Generacionhdrsds_29_tfdispiemtr_to ,
                                          String AV6EmprCod ,
                                          byte AV82DisEst ,
                                          String A396EmprCod ,
                                          byte A367DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[29];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.DisCod, T1.EmprCod, T1.DisEst, T1.DisCliNum, T1.DisEncCli, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T3.CliNom, T1.CliCod, T1.DisFec, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod," ;
      scmdbuf += " DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisEst = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) <= ?))");
      if ( ! (0==AV111Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV112Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV114Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV115Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV116Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (0==AV118Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (0==AV119Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV124Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV126Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV127Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV128Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV129Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV132Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisPart" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisPart DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H019U10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV111Generacionhdrsds_1_tfdiscod ,
                                           int AV112Generacionhdrsds_2_tfdiscod_to ,
                                           java.util.Date AV113Generacionhdrsds_3_tfdisfec ,
                                           int AV114Generacionhdrsds_4_tfclicod ,
                                           int AV115Generacionhdrsds_5_tfclicod_to ,
                                           String AV117Generacionhdrsds_7_tfclinom_sel ,
                                           String AV116Generacionhdrsds_6_tfclinom ,
                                           short AV118Generacionhdrsds_8_tfdispart ,
                                           short AV119Generacionhdrsds_9_tfdispart_to ,
                                           String AV121Generacionhdrsds_11_tfdisartcod_sel ,
                                           String AV120Generacionhdrsds_10_tfdisartcod ,
                                           String AV123Generacionhdrsds_13_tfdisartdsc_sel ,
                                           String AV122Generacionhdrsds_12_tfdisartdsc ,
                                           String AV125Generacionhdrsds_15_tfdiscolnom_sel ,
                                           String AV124Generacionhdrsds_14_tfdiscolnom ,
                                           int AV126Generacionhdrsds_16_tfdiscolnum ,
                                           int AV127Generacionhdrsds_17_tfdiscolnum_to ,
                                           byte AV128Generacionhdrsds_18_tfdistipcol ,
                                           byte AV129Generacionhdrsds_19_tfdistipcol_to ,
                                           String AV131Generacionhdrsds_21_tfdisnomcli_sel ,
                                           String AV130Generacionhdrsds_20_tfdisnomcli ,
                                           String AV133Generacionhdrsds_23_tfdisunimed_sel ,
                                           String AV132Generacionhdrsds_22_tfdisunimed ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           short A1502DisPart ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           String A392DisUniMed ,
                                           short AV134Generacionhdrsds_24_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV135Generacionhdrsds_25_tfdispiepie_to ,
                                           java.math.BigDecimal AV136Generacionhdrsds_26_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV137Generacionhdrsds_27_tfdispiekgm_to ,
                                           java.math.BigDecimal AV138Generacionhdrsds_28_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV139Generacionhdrsds_29_tfdispiemtr_to ,
                                           String AV6EmprCod ,
                                           byte AV82DisEst ,
                                           String A396EmprCod ,
                                           byte A367DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[29];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.DisEst, T1.EmprCod, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisEst = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      if ( ! (0==AV111Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV112Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV114Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (0==AV115Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV116Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV118Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (0==AV119Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV124Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV126Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (0==AV127Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (0==AV128Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (0==AV129Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV132Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DisEst" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H019U3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() );
            case 1 :
                  return conditional_H019U5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() );
            case 5 :
                  return conditional_H019U10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H019U3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019U5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019U6", "SELECT MacLin, MacDisCod, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019U7", "SELECT MacCod, EmprCod FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H019U8", "SELECT * FROM (SELECT MacLin, MacDisCod, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H019U10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019U11", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H019U12", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H019U13", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H019U14", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

